from __future__ import unicode_literals

# Documentacion:
# https://realpython.com/sentiment-analysis-python/
# https://www.machinelearningplus.com/nlp/custom-text-classification-spacy/

# Como entrena por debajo? 
# https://spacy.io/usage/training
# https://thinc.ai/docs/usage-training

# own machine learning library Thinc.[8][9] Using Thinc as its backend, 
# spaCy features convolutional neural network models for part-of-speech tagging, 
# dependency parsing, text categorization and named entity recognition (NER).

import spacy
import random
import sys
import ast
import pandas as pd
import os.path

# clasificador de justificación de ATD. Las etiquetas seran los tipos de ATD.
# Se enviara a clasificar la causa y el beneficio. 
# Esto se usara para entrenar el modelo de identificacion de ATD
class TextClassification():
    nlp = None
    text = ""
    
    def __init__(self, lenguaje, modulo):
        if lenguaje == 'es':
            if modulo == 'md':
                self.nlp = spacy.load("es_core_news_md")
            if modulo == 'sm':
                self.nlp = spacy.load("es_core_news_sm")
        if lenguaje == 'en':
            if modulo == 'md':
                self.nlp = spacy.load("en_core_web_md")
            if modulo == 'sm':
                self.nlp = spacy.load("en_core_web_sm")
                
    def openSource(self):
        df = pd.read_csv('/Users/borisperezg/rebelmodels_storing/datasets_to_train/multiclass_entrydataset_atdtypes.csv', sep=';', usecols=['text','class'])
        #print(df['text'])
        df['lemma_words'] = df.text.apply(self.custom_lemma)
        #print(df['lemma_words'])
        return df
        
    def custom_lemma(self, newText):
        doc = self.nlp(newText.lower())
        result = []
        for token in doc:
            if token.text in self.nlp.Defaults.stop_words:
                continue
            if token.is_punct:
                continue
            if token.lemma_ == '-PRON-':
                continue
            result.append(token.lemma_)
        return " ".join(result)
    
    def trainModel(self, data_, testdata_):
        
        # Borrando cualquier modelo anterior
        import shutil

        shutil.rmtree('/Users/borisperezg/rebelmodels_storing/models/types')
        
        
        category = self.nlp.create_pipe("textcat")
        category.add_label("APP")
        category.add_label("FEE")
        category.add_label("THY")
        
        self.nlp.add_pipe(category)
        
        other_pipes = [pipe for pipe in self.nlp.pipe_names if pipe != 'textcat']

        with self.nlp.disable_pipes(*other_pipes):  # only train textcat
        
            # Start the training
            optimizer = self.nlp.begin_training()
            
            print("Beginning training")
            print("Loss\tPrecision\tRecall\tF-score")
            
            # Loop for 10 iterations
            for itn in range(20):
                # Shuffle the training data
                random.shuffle(data_)
                losses = {}
            
                # Batch the examples and iterate over them
                for batch in spacy.util.minibatch(data_, size=1):
                    texts = [self.nlp(text) for text, entities in batch]
                    annotations = [{"cats": entities} for text, entities in batch]
                    self.nlp.update(texts, annotations, losses=losses)
                
                # Calling the evaluate() function and printing the scores
                with category.model.use_params(optimizer.averages):
                    scores = self.evaluate(
                        self.nlp.tokenizer, 
                        category, 
                        testdata_)
        
                    print('{0:.3f}\t{1:.3f}\t{2:.3f}\t{3:.3f}'  
                      .format(losses['textcat'], scores['textcat_p'],
                              scores['textcat_r'], scores['textcat_f']))
                
    def evaluate(self, tokenizer, textcat, test_data):
        docs, labels = zip(*test_data)
        docs = (tokenizer(review) for review in docs)
        #docs = (tokenizer(text) for text in texts)
        tp = 0.0  # True positives
        fp = 1e-8  # False positives
        fn = 1e-8  # False negatives
        tn = 0.0  # True negatives
        for i, doc in enumerate(textcat.pipe(docs)):
            gold = labels[i]
            for label, score in doc.cats.items():
                if label not in gold:
                    continue
                #if label == "APP":
                if score >= 0.5 and gold[label] >= 0.5:
                    tp += 1.0
                elif score >= 0.5 and gold[label] < 0.5:
                    fp += 1.0
                elif score < 0.5 and gold[label] < 0.5:
                    tn += 1
                elif score < 0.5 and gold[label] >= 0.5:
                    fn += 1
        precision = tp / (tp + fp)
        recall = tp / (tp + fn)
        if (precision + recall) == 0:
            f_score = 0.0
        else:
            f_score = 2 * (precision * recall) / (precision + recall)
        return {"textcat_p": precision, "textcat_r": recall, "textcat_f": f_score}
    
    def trainAndStore(self):
        
        df = self.openSource()        
        
        # --------------------------
        # REORGANIZACION DE LAS COLUMNAS
        
        # Se crea un nuevo dataframe porque se eliminara la columna con el texto sin procesar.
        # Se dejan unicamente la columna con la lema, y el class
        del df['text']
        
        # Obtengo la lista de los nombres de las columnas para poder realizar un reordenamiento de las columnas
        cols = df.columns.tolist()
        
        # Se reordenan las columnas para que la lema quede de primero
        cols = cols[-1:] + cols[:-1]
        df = df[cols]
        
        # --------------------------
        # SEPARACION DEL DATA SET EN TRAINING Y TEST
        
        split = int(len(df) * 0.8)
            
        dfTraining = df[:split]
        dfTest = df[split:]
        
        # --------------------------
        # GENERACION DE LAS LISTAS PARA ENTRENAR EL MODELO
        
        # Se convierte el nuevo dataframe (lemma, class) a una lista
        dfTrainingList = dfTraining.values.tolist()
        dfTrainingList_ = [[d[0], ast.literal_eval(d[1])] for d in dfTrainingList]
        
        testList = dfTest.values.tolist()
        dfTestList_ = [[d[0], ast.literal_eval(d[1])] for d in testList]
        
        
        
        self.trainModel(dfTrainingList_, dfTestList_)
        
        self.nlp.to_disk('/Users/borisperezg/rebelmodels_storing/models/types')
        
        print("Done")

if __name__ == '__main__':
    tc = TextClassification('en', 'md')
    tc.trainAndStore()