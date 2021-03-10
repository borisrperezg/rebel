# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""

from __future__ import unicode_literals
import spacy
import sys

# Create your models here.
class Clustering():
    nlp=None
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
    
    def find_similarity(self, text1, text2):
        # Raw text is processed to remove stopwords and others
        fixedText1 = self.process_text(text1)
        fixedText2 = self.process_text(text2)
        
        #print("fixedText1 = "+fixedText1)
        #print("fixedText2 = "+fixedText2)

        # Clean text is tokenized
        doc1 = self.nlp(fixedText1)
        doc2 = self.nlp(fixedText2)
        # Iterate over each word of text2 to compare with word in text1
        for token in doc2:
            doc3 = self.nlp(token.text)
            print(doc1.similarity(doc3))

if __name__ == '__main__':
    clus = Clustering('en', 'md')
    clus.find_similarity(sys.argv[2],sys.argv[3])