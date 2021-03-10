# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""

from __future__ import unicode_literals
import spacy
import sys
import pandas as pd
import numpy as np
import os.path

# Create your models here.
class Clustering():
    nlp=None
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
                
    def process_text(self, text):
        #newText = text #text.replace(";", " ").replace("\"", "")
        newText = text.replace(";", " ").replace("\"", "")
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
            # print(token.lemma_)
        return " ".join(result)
    
    def openAndPrepare(self):
        if os.path.isfile('/Users/borisperezg/temporalsimilfolder/facts.csv') == True:
            dataFact = pd.read_csv('/Users/borisperezg/temporalsimilfolder/facts.csv', sep=';')
        if os.path.isfile('/Users/borisperezg/temporalsimilfolder/github.csv') == True:
            dataGH = pd.read_csv('/Users/borisperezg/temporalsimilfolder/github.csv', sep=';')
        
        f = open("/Users/borisperezg/temporalsimilfolder/results_ss.txt", "w")
        
        for indF in dataFact.index: 
            for indG in dataGH.index: 
                #print(dataFact['Fact'][indF] + " - " + dataGH['Github'][indG])
                clus.find_similarity(dataFact['fact'][indF],dataGH['contenidogithub'][indG],dataGH['idgithub'][indG],dataFact['id'][indF])
        
        f.write(self.text)        
        f.close()
        print("Done baby")
                
    # text1: El texto de los elementos arquitecturales
    # text2: El contenido textual de un commit en github
    # idText2: El ID del commit de github
    def find_similarity(self, text1, text2, idText2, idText1):
        # Raw text is processed to remove stopwords and others
        fixedText1 = self.process_text(text1)
        fixedText2 = self.process_text(text2)
        
        # ------------------------------
        # SE HACE SPLIT POR " ", EN CASO DE QUE LA PALABRA SEA COMPUESTA
        # ------------------------------

        x = fixedText1.split()        
        for xq in x:        
            # Clean text is tokenized
            doc1 = self.nlp(xq)
            doc2 = self.nlp(fixedText2)
            # Iterate over each word of text2 to compare with word in text1

            maxValue = 0;

            for token in doc2:
                doc3 = self.nlp(token.text)
                value = doc1.similarity(doc3)
                if value>maxValue:
                    maxValue = value
            self.text = self.text + str(idText1) + '::' + str(idText2) + '::' + str(maxValue) + "\n"
                #print(idText1, '::', idText2, '::', doc1, '::' , doc3 , '-->' , value)

if __name__ == '__main__':
    clus = Clustering('es', 'md')
    clus.openAndPrepare()