package uniandes.rebelapi.weka;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.Random;

import weka.classifiers.Evaluation;
import weka.classifiers.bayes.NaiveBayes;
import weka.classifiers.evaluation.Prediction;
import weka.classifiers.evaluation.ThresholdCurve;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.Utils;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;
import weka.gui.visualize.PlotData2D;
import weka.gui.visualize.ThresholdVisualizePanel;

public class SupervisedLearningNaive {

	public static void main(String[] args) throws Exception {

		final String DATAFILESFOLDER = "/Users/borisperezg/rebelmodels_storing/datasets_to_train/";

		// **************************************
		// CSV TO ARFF
		// **************************************
		CSVLoader loader = new CSVLoader();
		loader.setSource(new File(DATAFILESFOLDER + "multiclass_entrydataset_atdidentification.csv"));
		Instances data = loader.getDataSet();

		// save ARFF
		String arffFileName = "multiclass_entrydataset_atdidentification.arff";
		ArffSaver saver = new ArffSaver();
		saver.setInstances(data);
		saver.setFile(new File(DATAFILESFOLDER + arffFileName));
		saver.setDestination(new File(DATAFILESFOLDER + arffFileName));
		saver.writeBatch();

		String m_TrainingFile = DATAFILESFOLDER + arffFileName;
		Instances m_Training = new Instances(new BufferedReader(new FileReader(m_TrainingFile)));
		m_Training.setClassIndex(m_Training.numAttributes() - 1);

		SupervisedLearningNaive sp = new SupervisedLearningNaive();
		sp.evaluation2(m_Training);
		
	}

	public void evaluation2(Instances m_Training) throws Exception {

		// build model
		NaiveBayes model = new NaiveBayes();
		model.buildClassifier(m_Training);

		// use
		Instances test = m_Training;
		Evaluation eval = new Evaluation(test);
		eval.evaluateModel(model, test);
		List<Prediction> predictions = eval.predictions();
		int k = 0;
		System.out.println("#   Actual   Prediction");
		for (Instance instance : test) {
			double actual = instance.classValue();
			double prediction = eval.evaluateModelOnce(model, instance);
			System.out.printf("%2d.%4.0f%4.0f", ++k, actual, prediction);
			System.out.println(prediction != actual ? " *" : "");
		}

	}

	public void evaluation1(Instances m_Training) throws Exception {

		// model

		NaiveBayes naiveBayes = new NaiveBayes();
		naiveBayes.buildClassifier(m_Training);

		Evaluation evaluation = new Evaluation(m_Training);
		evaluation.crossValidateModel(naiveBayes, m_Training, 4, new Random(1));

		System.out.println(evaluation.toClassDetailsString());

		for (Prediction pred : evaluation.predictions()) {
			System.out.println(pred.toString());
		}

		// generate curve
		ThresholdCurve tc = new ThresholdCurve();
		int classIndex = 0;
		Instances result = tc.getCurve(evaluation.predictions(), classIndex);

		// plot curve
		ThresholdVisualizePanel vmc = new ThresholdVisualizePanel();
		vmc.setROCString("(Area under ROC = " + Utils.doubleToString(ThresholdCurve.getROCArea(result), 4) + ")");
		vmc.setName(result.relationName());
		PlotData2D tempd = new PlotData2D(result);
		tempd.setPlotName(result.relationName());
		tempd.addInstanceNumberAttribute();

		// specify which points are connected
		boolean[] cp = new boolean[result.numInstances()];
		for (int n = 1; n < cp.length; n++)
			cp[n] = true;
		tempd.setConnectPoints(cp);
		// add plot
		vmc.addPlot(tempd);

		// display curve
		String plotName = vmc.getName();
		final javax.swing.JFrame jf = new javax.swing.JFrame("Weka Classifier Visualize: " + plotName);
		jf.setSize(500, 400);
		jf.getContentPane().setLayout(new BorderLayout());
		jf.getContentPane().add(vmc, BorderLayout.CENTER);
		jf.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				jf.dispose();
			}
		});
		jf.setVisible(true);

	}
}
