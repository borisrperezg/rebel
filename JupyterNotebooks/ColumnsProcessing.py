import pandas as pd
import pickle

from sklearn.preprocessing import OneHotEncoder
from sklearn.feature_extraction.text import TfidfVectorizer
from sklearn.preprocessing import MinMaxScaler

import nltk, re, string, collections
from nltk import ngrams

from nltk.corpus import stopwords  
from nltk.tokenize import word_tokenize  
from nltk.stem import WordNetLemmatizer 

# No se usan categorias en la misma columna, porque se puede dar el caso de 2>1>0, y ese no sería el caso.
# df['Project Category'] = df['Project Category'].factorize()[0]
# df['Project Outcome'] = df['Project Outcome'].factorize()[0]

# Preprocessing: OneHotEncoder() vs pandas.get_dummies
# https://albertum.medium.com/preprocessing-onehotencoder-vs-pandas-get-dummies-3de1f3d77dcc
# Se decide usar OneHotEncoder()

# Tutorial: Categorical encoding using Label-Encoding and One-Hot-Encoder
# https://towardsdatascience.com/categorical-encoding-using-label-encoding-and-one-hot-encoder-911ef77fb5bd
class ColumnsProcessing():

    stop_words = None
    lemmatizer = None
    vectorizer = None

    def __init__(self):
        self.stop_words = set(stopwords.words('english'))  
        self.lemmatizer = WordNetLemmatizer() 
        self.vectorizer = TfidfVectorizer()
    

    def openCategoricalColumns(self, dataframe, column):
        # Creating instance of one-hot-encoder
        encoder = OneHotEncoder(handle_unknown='ignore')
        # passing bridge-types-cat column (label encoded values of bridge_types)
        pc_df = encoder.fit_transform(dataframe[[column]]).toarray()
        
        column_names = encoder.get_feature_names([column])
        df_encoded = pd.DataFrame(pc_df, columns= column_names)
        
        dataframe.drop([column], axis=1, inplace = True)
        
        # merge with main df bridge_df on key values
        dataframe = dataframe.join(df_encoded)
        
        # Store the encoder
        pickle.dump(encoder, open("/Users/borisperezg/rebelmodels_storing/models/Encoder/encoder"+column+".pickle", "wb"))   

        return dataframe

    def openCategoricalColumnsUsed(self, dataframe, column):
        # Creating instance of one-hot-encoder
        # self.encoder = newEncoder
        encoder = pickle.load(open("/Users/borisperezg/rebelmodels_storing/models/Encoder/encoder"+column+".pickle", "rb"))
        # passing bridge-types-cat column (label encoded values of bridge_types)
        pc_df = encoder.transform(dataframe[[column]]).toarray()
        
        column_names = encoder.get_feature_names([column])
        df_encoded = pd.DataFrame(pc_df, columns= column_names)
        
        dataframe.drop([column], axis=1, inplace = True)
        
        # merge with main df bridge_df on key values
        dataframe = dataframe.join(df_encoded)
        
        return dataframe

    def textColumnsVectorization(self, dataframe, column):
        vectors = self.vectorizer.fit_transform(dataframe[column])
        feature_names = self.vectorizer.get_feature_names()
        dense = vectors.todense()
        denselist = dense.tolist()
        dfVectorized = pd.DataFrame(denselist, columns=feature_names)

        dataframe.drop([column], axis=1, inplace=True)

        return pd.concat([dataframe, dfVectorized], axis=1)

    def textColumnsVectorizationUsed(self, dataframe, column, newVectorizer):
        self.vectorizer = newVectorizer
        # Ojo, que aca no se hace fit_transform
        vectors = self.vectorizer.transform(dataframe[column])
        feature_names = self.vectorizer.get_feature_names()
        dense = vectors.todense()
        denselist = dense.tolist()
        dfVectorized = pd.DataFrame(denselist, columns=feature_names)

        dataframe.drop([column], axis=1, inplace=True)

        return pd.concat([dataframe, dfVectorized], axis=1)

    def numericalNormalization(self, dataframe, column):
        scaler = MinMaxScaler() 

        column_names_to_normalize = [column] # ['Project Cost', 'E', 'G', 'sadasdsd', 'lol']
        x = dataframe[column_names_to_normalize].values
        x_scaled = scaler.fit_transform(x)
        df_temp = pd.DataFrame(x_scaled, columns=column_names_to_normalize, index = dataframe.index)
        dataframe[column_names_to_normalize] = df_temp

        return dataframe
    
    def remove_stopwords_and_lemma(self, newText):
        word_tokens = word_tokenize(newText.lower())  
    
        filtered_sentence = [w for w in word_tokens if not w in self.stop_words]  
    
        filtered_sentence = []  
    
        for w in word_tokens:  
            # Excluyendo los stopwords
            if w not in self.stop_words:  
                # Excluyendo puntuaciones
                if w.isalpha():
                    filtered_sentence.append(self.lemmatizer.lemmatize(w))
                
        return " ".join(filtered_sentence)