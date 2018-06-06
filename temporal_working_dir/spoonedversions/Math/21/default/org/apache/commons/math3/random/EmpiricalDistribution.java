

package org.apache.commons.math3.random;


public class EmpiricalDistribution implements java.io.Serializable {
	public static final int DEFAULT_BIN_COUNT = 1000;

	private static final long serialVersionUID = 5729073523949762654L;

	private final java.util.List<org.apache.commons.math3.stat.descriptive.SummaryStatistics> binStats;

	private org.apache.commons.math3.stat.descriptive.SummaryStatistics sampleStats = null;

	private double max = java.lang.Double.NEGATIVE_INFINITY;

	private double min = java.lang.Double.POSITIVE_INFINITY;

	private double delta = 0.0;

	private final int binCount;

	private boolean loaded = false;

	private double[] upperBounds = null;

	private final org.apache.commons.math3.random.RandomDataImpl randomData;

	public EmpiricalDistribution() {
		this(org.apache.commons.math3.random.EmpiricalDistribution.DEFAULT_BIN_COUNT, new org.apache.commons.math3.random.RandomDataImpl());
	}

	public EmpiricalDistribution(int binCount) {
		this(binCount, new org.apache.commons.math3.random.RandomDataImpl());
	}

	public EmpiricalDistribution(int binCount, org.apache.commons.math3.random.RandomGenerator generator) {
		this.binCount = binCount;
		randomData = new org.apache.commons.math3.random.RandomDataImpl(generator);
		binStats = new java.util.ArrayList<org.apache.commons.math3.stat.descriptive.SummaryStatistics>();
	}

	public EmpiricalDistribution(org.apache.commons.math3.random.RandomGenerator generator) {
		this(org.apache.commons.math3.random.EmpiricalDistribution.DEFAULT_BIN_COUNT, generator);
	}

	public EmpiricalDistribution(int binCount, org.apache.commons.math3.random.RandomDataImpl randomData) {
		this.binCount = binCount;
		this.randomData = randomData;
		binStats = new java.util.ArrayList<org.apache.commons.math3.stat.descriptive.SummaryStatistics>();
	}

	public EmpiricalDistribution(org.apache.commons.math3.random.RandomDataImpl randomData) {
		this(org.apache.commons.math3.random.EmpiricalDistribution.DEFAULT_BIN_COUNT, randomData);
	}

	public void load(double[] in) throws org.apache.commons.math3.exception.MathIllegalStateException, org.apache.commons.math3.exception.NullArgumentException {
		org.apache.commons.math3.random.EmpiricalDistribution.DataAdapter da = new org.apache.commons.math3.random.EmpiricalDistribution.ArrayDataAdapter(in);
		try {
			da.computeStats();
			fillBinStats(new org.apache.commons.math3.random.EmpiricalDistribution.ArrayDataAdapter(in));
		} catch (java.io.IOException e) {
			throw new org.apache.commons.math3.exception.MathIllegalStateException(e, org.apache.commons.math3.exception.util.LocalizedFormats.SIMPLE_MESSAGE, e.getLocalizedMessage());
		}
		loaded = true;
	}

	public void load(java.net.URL url) throws java.io.IOException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.ZeroException {
		org.apache.commons.math3.util.MathUtils.checkNotNull(url);
		java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(url.openStream()));
		try {
			org.apache.commons.math3.random.EmpiricalDistribution.DataAdapter da = new org.apache.commons.math3.random.EmpiricalDistribution.StreamDataAdapter(in);
			da.computeStats();
			if ((sampleStats.getN()) == 0) {
				throw new org.apache.commons.math3.exception.ZeroException(org.apache.commons.math3.exception.util.LocalizedFormats.URL_CONTAINS_NO_DATA, url);
			}
			in = new java.io.BufferedReader(new java.io.InputStreamReader(url.openStream()));
			fillBinStats(new org.apache.commons.math3.random.EmpiricalDistribution.StreamDataAdapter(in));
			loaded = true;
		} finally {
			try {
				in.close();
			} catch (java.io.IOException ex) {
			}
		}
	}

	public void load(java.io.File file) throws java.io.IOException, org.apache.commons.math3.exception.NullArgumentException {
		org.apache.commons.math3.util.MathUtils.checkNotNull(file);
		java.io.BufferedReader in = new java.io.BufferedReader(new java.io.FileReader(file));
		try {
			org.apache.commons.math3.random.EmpiricalDistribution.DataAdapter da = new org.apache.commons.math3.random.EmpiricalDistribution.StreamDataAdapter(in);
			da.computeStats();
			in = new java.io.BufferedReader(new java.io.FileReader(file));
			fillBinStats(new org.apache.commons.math3.random.EmpiricalDistribution.StreamDataAdapter(in));
			loaded = true;
		} finally {
			try {
				in.close();
			} catch (java.io.IOException ex) {
			}
		}
	}

	private abstract class DataAdapter {
		public abstract void computeBinStats() throws java.io.IOException;

		public abstract void computeStats() throws java.io.IOException;
	}

	private class StreamDataAdapter extends org.apache.commons.math3.random.EmpiricalDistribution.DataAdapter {
		private java.io.BufferedReader inputStream;

		public StreamDataAdapter(java.io.BufferedReader in) {
			super();
			inputStream = in;
		}

		@java.lang.Override
		public void computeBinStats() throws java.io.IOException {
			java.lang.String str = null;
			double val = 0.0;
			while ((str = inputStream.readLine()) != null) {
				val = java.lang.Double.parseDouble(str);
				org.apache.commons.math3.stat.descriptive.SummaryStatistics stats = binStats.get(findBin(val));
				stats.addValue(val);
			} 
			inputStream.close();
			inputStream = null;
		}

		@java.lang.Override
		public void computeStats() throws java.io.IOException {
			java.lang.String str = null;
			double val = 0.0;
			sampleStats = new org.apache.commons.math3.stat.descriptive.SummaryStatistics();
			while ((str = inputStream.readLine()) != null) {
				val = java.lang.Double.valueOf(str).doubleValue();
				sampleStats.addValue(val);
			} 
			inputStream.close();
			inputStream = null;
		}
	}

	private class ArrayDataAdapter extends org.apache.commons.math3.random.EmpiricalDistribution.DataAdapter {
		private double[] inputArray;

		public ArrayDataAdapter(double[] in) throws org.apache.commons.math3.exception.NullArgumentException {
			super();
			org.apache.commons.math3.util.MathUtils.checkNotNull(in);
			inputArray = in;
		}

		@java.lang.Override
		public void computeStats() throws java.io.IOException {
			sampleStats = new org.apache.commons.math3.stat.descriptive.SummaryStatistics();
			for (int i = 0; i < (inputArray.length); i++) {
				sampleStats.addValue(inputArray[i]);
			}
		}

		@java.lang.Override
		public void computeBinStats() throws java.io.IOException {
			for (int i = 0; i < (inputArray.length); i++) {
				org.apache.commons.math3.stat.descriptive.SummaryStatistics stats = binStats.get(findBin(inputArray[i]));
				stats.addValue(inputArray[i]);
			}
		}
	}

	private void fillBinStats(final org.apache.commons.math3.random.EmpiricalDistribution.DataAdapter da) throws java.io.IOException {
		min = sampleStats.getMin();
		max = sampleStats.getMax();
		delta = ((max) - (min)) / (java.lang.Double.valueOf(binCount).doubleValue());
		if (!(binStats.isEmpty())) {
			binStats.clear();
		}
		for (int i = 0; i < (binCount); i++) {
			org.apache.commons.math3.stat.descriptive.SummaryStatistics stats = new org.apache.commons.math3.stat.descriptive.SummaryStatistics();
			binStats.add(i, stats);
		}
		da.computeBinStats();
		upperBounds = new double[binCount];
		upperBounds[0] = ((double) (binStats.get(0).getN())) / ((double) (sampleStats.getN()));
		for (int i = 1; i < ((binCount) - 1); i++) {
			upperBounds[i] = (upperBounds[(i - 1)]) + (((double) (binStats.get(i).getN())) / ((double) (sampleStats.getN())));
		}
		upperBounds[((binCount) - 1)] = 1.0;
	}

	private int findBin(double value) {
		return org.apache.commons.math3.util.FastMath.min(org.apache.commons.math3.util.FastMath.max((((int) (org.apache.commons.math3.util.FastMath.ceil(((value - (min)) / (delta))))) - 1), 0), ((binCount) - 1));
	}

	public double getNextValue() throws org.apache.commons.math3.exception.MathIllegalStateException {
		if (!(loaded)) {
			throw new org.apache.commons.math3.exception.MathIllegalStateException(org.apache.commons.math3.exception.util.LocalizedFormats.DISTRIBUTION_NOT_LOADED);
		}
		final double x = randomData.nextUniform(0, 1);
		for (int i = 0; i < (binCount); i++) {
			if (x <= (upperBounds[i])) {
				org.apache.commons.math3.stat.descriptive.SummaryStatistics stats = binStats.get(i);
				if ((stats.getN()) > 0) {
					if ((stats.getStandardDeviation()) > 0) {
						return randomData.nextGaussian(stats.getMean(), stats.getStandardDeviation());
					}else {
						return stats.getMean();
					}
				}
			}
		}
		throw new org.apache.commons.math3.exception.MathIllegalStateException(org.apache.commons.math3.exception.util.LocalizedFormats.NO_BIN_SELECTED);
	}

	public org.apache.commons.math3.stat.descriptive.StatisticalSummary getSampleStats() {
		return sampleStats;
	}

	public int getBinCount() {
		return binCount;
	}

	public java.util.List<org.apache.commons.math3.stat.descriptive.SummaryStatistics> getBinStats() {
		return binStats;
	}

	public double[] getUpperBounds() {
		double[] binUpperBounds = new double[binCount];
		binUpperBounds[0] = (min) + (delta);
		for (int i = 1; i < ((binCount) - 1); i++) {
			binUpperBounds[i] = (binUpperBounds[(i - 1)]) + (delta);
		}
		binUpperBounds[((binCount) - 1)] = max;
		return binUpperBounds;
	}

	public double[] getGeneratorUpperBounds() {
		int len = upperBounds.length;
		double[] out = new double[len];
		java.lang.System.arraycopy(upperBounds, 0, out, 0, len);
		return out;
	}

	public boolean isLoaded() {
		return loaded;
	}

	public void reSeed(long seed) {
		randomData.reSeed(seed);
	}
}

