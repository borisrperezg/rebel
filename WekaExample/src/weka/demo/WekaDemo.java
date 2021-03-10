/*
 *    This program is free software; you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation; either version 2 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program; if not, write to the Free Software
 *    Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */

/*
 *    WekaDemo.java
 *    Copyright (C) 2009 University of Waikato, Hamilton, New Zealand
 *
 */

package weka.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Vector;

import weka.classifiers.AbstractClassifier;
import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.core.Instances;
import weka.core.OptionHandler;
import weka.core.Utils;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;
import weka.filters.Filter;

/**
 * A little demo java program for using WEKA.<br/>
 * Check out the Evaluation class for more details.
 * 
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 10229 $
 * @see Evaluation
 */
public class WekaDemo {
  /** the classifier used internally */
  protected Classifier m_Classifier = null;

  /** the filter to use */
  protected Filter m_Filter = null;

  /** the training file */
  protected String m_TrainingFile = null;

  /** the training instances */
  protected Instances m_Training = null;

  /** for evaluating the classifier */
  protected Evaluation m_Evaluation = null;

  /**
   * initializes the demo
   */
  public WekaDemo() {
    super();
  }

  /**
   * sets the classifier to use
   * 
   * @param name the classname of the classifier
   * @param options the options for the classifier
   */
  public void setClassifier(String name, String[] options) throws Exception {
    m_Classifier = AbstractClassifier.forName(name, options);
  }

  /**
   * sets the filter to use
   * 
   * @param name the classname of the filter
   * @param options the options for the filter
   */
  public void setFilter(String name, String[] options) throws Exception {
    m_Filter = (Filter) Class.forName(name).newInstance();
    if (m_Filter instanceof OptionHandler) {
      ((OptionHandler) m_Filter).setOptions(options);
    }
  }

  /**
   * sets the file to use for training
   */
  public void setTraining(String name) throws Exception {
    m_TrainingFile = name;
    m_Training = new Instances(new BufferedReader(
      new FileReader(m_TrainingFile)));
    m_Training.setClassIndex(m_Training.numAttributes() - 1);
  }
  
  

  /**
   * runs 10fold CV over the training file
   */
  public void execute() throws Exception {
    // run filter
    m_Filter.setInputFormat(m_Training);
    Instances filtered = Filter.useFilter(m_Training, m_Filter);

    // train classifier on complete file for tree
    m_Classifier.buildClassifier(filtered);

    // 10fold CV with seed=1
    m_Evaluation = new Evaluation(filtered);
    m_Evaluation.crossValidateModel(m_Classifier, filtered, 10,
      m_Training.getRandomNumberGenerator(1));
  }

  /**
   * outputs some data about the classifier
   */
  @Override
  public String toString() {
    StringBuffer result;

    result = new StringBuffer();
    result.append("Weka - Demo\n===========\n\n");

    result.append("Classifier...: " + Utils.toCommandLine(m_Classifier) + "\n");
    
    if (m_Filter instanceof OptionHandler) {
      result.append("Filter.......: " + m_Filter.getClass().getName() + " "
        + Utils.joinOptions(((OptionHandler) m_Filter).getOptions()) + "\n");
    } else {
      result.append("Filter.......: " + m_Filter.getClass().getName() + "\n");
    }
    
    result.append("Training file: " + m_TrainingFile + "\n");
    result.append("\n");
    
    result.append("********************\n");
    result.append(m_Classifier.toString() + "\n");
    result.append("********************\n");
    result.append(m_Evaluation.correct() + "\n");
    result.append(m_Evaluation.toSummaryString() + "\n");
    
    try {
    	result.append("********************\n");
      result.append(m_Evaluation.toMatrixString() + "\n");
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    try {
    	result.append("********************\n");
      result.append(m_Evaluation.toClassDetailsString() + "\n");
    } catch (Exception e) {
      e.printStackTrace();
    }

    return result.toString();
  }

  

  public static void main(String[] args) throws Exception {
    WekaDemo demo;
    
    // **************************************
    // CSV TO ARFF
    // **************************************
    CSVLoader loader = new CSVLoader();
    loader.setSource(new File("train.csv"));
    Instances data = loader.getDataSet();

    // save ARFF
    ArffSaver saver = new ArffSaver();
    saver.setInstances(data);
    saver.setFile(new File("train.arff"));
    saver.setDestination(new File("train.arff"));
    saver.writeBatch();

    // **************************************
    // DEFINE AND ASSIGN INITIAL VALUES
    // **************************************
    String classifier = "";
    String filter = "";
    String dataset = "";
    Vector<String> classifierOptions = new Vector<String>();
    Vector<String> filterOptions = new Vector<String>();

//    dataset = "iris.arff";
    dataset = "train.arff";
    filter = "weka.filters.unsupervised.instance.Randomize";
    classifier = "weka.classifiers.trees.J48";
    classifierOptions.add("-U");
    
    // **************************************
    // RUN
    // **************************************
    demo = new WekaDemo();
    // Used to transform input data, e.g. for preprocessing, transformation, feature generation and so on.
    demo.setFilter(filter, filterOptions.toArray(new String[filterOptions.size()]));
    // Machine learning algorithms
    demo.setClassifier(classifier, classifierOptions.toArray(new String[classifierOptions.size()]));    
    demo.setTraining(dataset);
    demo.execute();
    
    System.out.println(demo.toString());
  }
}
