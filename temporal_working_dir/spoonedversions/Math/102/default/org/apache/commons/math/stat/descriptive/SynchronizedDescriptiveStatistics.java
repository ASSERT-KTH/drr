

package org.apache.commons.math.stat.descriptive;


public class SynchronizedDescriptiveStatistics extends org.apache.commons.math.stat.descriptive.DescriptiveStatistics {
	private static final long serialVersionUID = 1L;

	public SynchronizedDescriptiveStatistics() {
		this(org.apache.commons.math.stat.descriptive.DescriptiveStatistics.INFINITE_WINDOW);
	}

	public SynchronizedDescriptiveStatistics(int window) {
		super(window);
	}

	public synchronized void addValue(double v) {
		super.addValue(v);
	}

	public synchronized double apply(org.apache.commons.math.stat.descriptive.UnivariateStatistic stat) {
		return super.apply(stat);
	}

	public synchronized void clear() {
		super.clear();
	}

	public synchronized double getElement(int index) {
		return super.getElement(index);
	}

	public synchronized long getN() {
		return super.getN();
	}

	public synchronized double getStandardDeviation() {
		return super.getStandardDeviation();
	}

	public synchronized double[] getValues() {
		return super.getValues();
	}

	public synchronized int getWindowSize() {
		return super.getWindowSize();
	}

	public synchronized void setWindowSize(int windowSize) {
		super.setWindowSize(windowSize);
	}

	public synchronized java.lang.String toString() {
		return super.toString();
	}
}

