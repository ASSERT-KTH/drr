

package org.apache.commons.math.stat.inference;


public interface TTest {
	public abstract double pairedT(double[] sample1, double[] sample2) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException;

	public abstract double pairedTTest(double[] sample1, double[] sample2) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException;

	public abstract boolean pairedTTest(double[] sample1, double[] sample2, double alpha) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException;

	public abstract double t(double mu, double[] observed) throws java.lang.IllegalArgumentException;

	public abstract double t(double mu, org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats) throws java.lang.IllegalArgumentException;

	public abstract double homoscedasticT(double[] sample1, double[] sample2) throws java.lang.IllegalArgumentException;

	public abstract double t(double[] sample1, double[] sample2) throws java.lang.IllegalArgumentException;

	public abstract double t(org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats1, org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats2) throws java.lang.IllegalArgumentException;

	public abstract double homoscedasticT(org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats1, org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats2) throws java.lang.IllegalArgumentException;

	public abstract double tTest(double mu, double[] sample) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException;

	public abstract boolean tTest(double mu, double[] sample, double alpha) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException;

	public abstract double tTest(double mu, org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException;

	public abstract boolean tTest(double mu, org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats, double alpha) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException;

	public abstract double tTest(double[] sample1, double[] sample2) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException;

	public abstract double homoscedasticTTest(double[] sample1, double[] sample2) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException;

	public abstract boolean tTest(double[] sample1, double[] sample2, double alpha) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException;

	public abstract boolean homoscedasticTTest(double[] sample1, double[] sample2, double alpha) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException;

	public abstract double tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats1, org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats2) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException;

	public abstract double homoscedasticTTest(org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats1, org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats2) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException;

	public abstract boolean tTest(org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats1, org.apache.commons.math.stat.descriptive.StatisticalSummary sampleStats2, double alpha) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException;
}

