from __future__ import unicode_literals

import spacy
import random
import sys
import ast
import json
import pandas as pd
import os.path

# Esta clase hace uso del modelo de clasificacion entrenado y almacenado en disco
class TextClassificationUse():
    nlp = None
    text = ""
    
    def justOneBigMethod(self):
        # Agrega el pipeline de clasificacion
        #self.nlp.add_pipe(self.nlp.create_pipe('textcat'))
        
        # Carga el modelo entrenado
        #self.nlp.load("/Users/borisperezg/rebelmodelstoring")
        self.nlp = spacy.load("/Users/borisperezg/rebelmodels_storing/models/causes")
        
        # Abre el archivo para clasificar cada texto
        df = pd.read_csv('/Users/borisperezg/rebelmodels_storing/datasets_to_classify/text_to_classify_causes.csv', delimiter="|")
        
        df['lemma_words'] = df.text.apply(self.custom_lemma)
        
        # Se define la lista con las etiquetas entrenadas
        # IDEA: Se podrian pasar en un segundo archivo plano. 
        lst = ['APP', 'FEE', 'THY'] 
        # En este archivo se escribira el texto, la etiqueta y el % de certeza
        f = open("/Users/borisperezg/rebelmodels_storing/datasets_classified/results_tc_causes.txt", "w")
        # Almacenara temporalmente los resultados
        valToStore = "idFact|label|value\n"
        
        for ind in df.index: 
            # Obtengo el text de la fila. Solo hay una columna.
            answerdoc = self.nlp(df['lemma_words'][ind]) 
            # En json.dumps se genera la salida del clasificador.
            # Sin embargo, se genera una salida para las tres categorias.
            data_string = json.dumps(answerdoc.cats, indent=4, sort_keys=True)
            # Se decodifica el json para poder recorrerlo y extraer la categoria mas apropiada.
            decoded = json.loads(data_string)
            # Se usan para guardar el maximo valor y la etiqueta correspondiente.
            maxVal = 0.0
            maxLabel = ''
            # Se recorre la lista de etiquetas. Debera actualizarse siempre que se agregue una etiqueta
            for i in lst:
                # Convierto a float el valor decimal.
                thisVal = str(decoded[i])
                floatVal = float(thisVal)
                # Comparo para encontrar el mayor.
                if(floatVal>maxVal):
                    maxVal = floatVal
                    maxLabel = i
            
            valToStore = valToStore + df['idfact'][ind] + '|' + maxLabel + '|' + str(maxVal) + '\n'
            
        #print(valToStore)
        f.write(valToStore)        
        f.close()
        
        print("Done")
        
        
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

if __name__ == '__main__':
    tcu = TextClassificationUse()
    tcu.justOneBigMethod()