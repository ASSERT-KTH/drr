

package org.apache.commons.math.random;


public class EmpiricalDistributionImpl implements java.io.Serializable , org.apache.commons.math.random.EmpiricalDistribution {
	private static final long serialVersionUID = 5729073523949762654L;

	private java.util.List<org.apache.commons.math.stat.descriptive.SummaryStatistics> binStats = null;

	private org.apache.commons.math.stat.descriptive.SummaryStatistics sampleStats = null;

	private double max = java.lang.Double.NEGATIVE_INFINITY;

	private double min = java.lang.Double.POSITIVE_INFINITY;

	private double delta = 0.0;

	private int binCount = 1000;

	private boolean loaded = false;

	private double[] upperBounds = null;

	private org.apache.commons.math.random.RandomData randomData = new org.apache.commons.math.random.RandomDataImpl();

	public EmpiricalDistributionImpl() {
		binStats = new java.util.ArrayList<org.apache.commons.math.stat.descriptive.SummaryStatistics>();
	}

	public EmpiricalDistributionImpl(int binCount) {
		org.apache.commons.math.random.EmpiricalDistributionImpl.this.binCount = binCount;
		binStats = new java.util.ArrayList<org.apache.commons.math.stat.descriptive.SummaryStatistics>();
	}

	public void load(double[] in) {
		org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapter da = new org.apache.commons.math.random.EmpiricalDistributionImpl.ArrayDataAdapter(in);
		try {
			da.computeStats();
			fillBinStats(in);
		} catch (java.io.IOException e) {
			throw new org.apache.commons.math.MathRuntimeException(e);
		}
		loaded = true;
	}

	public void load(java.net.URL url) throws java.io.IOException {
		java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(url.openStream()));
		try {
			org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapter da = new org.apache.commons.math.random.EmpiricalDistributionImpl.StreamDataAdapter(in);
			da.computeStats();
			if ((sampleStats.getN()) == 0) {
				throw org.apache.commons.math.MathRuntimeException.createEOFException(org.apache.commons.math.exception.util.LocalizedFormats.URL_CONTAINS_NO_DATA, url);
			}
			in = new java.io.BufferedReader(new java.io.InputStreamReader(url.openStream()));
			fillBinStats(in);
			loaded = true;
		} finally {
			try {
				in.close();
			} catch (java.io.IOException ex) {
			}
		}
	}

	public void load(java.io.File file) throws java.io.IOException {
		java.io.BufferedReader in = new java.io.BufferedReader(new java.io.FileReader(file));
		try {
			org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapter da = new org.apache.commons.math.random.EmpiricalDistributionImpl.StreamDataAdapter(in);
			da.computeStats();
			in = new java.io.BufferedReader(new java.io.FileReader(file));
			fillBinStats(in);
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

	private class DataAdapterFactory {
		public org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapter getAdapter(java.lang.Object in) {
			if (in instanceof java.io.BufferedReader) {
				java.io.BufferedReader inputStream = ((java.io.BufferedReader) (in));
				return new org.apache.commons.math.random.EmpiricalDistributionImpl.StreamDataAdapter(inputStream);
			}else
				if (in instanceof double[]) {
					double[] inputArray = ((double[]) (in));
					return new org.apache.commons.math.random.EmpiricalDistributionImpl.ArrayDataAdapter(inputArray);
				}else {
					throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.INPUT_DATA_FROM_UNSUPPORTED_DATASOURCE, in.getClass().getName(), java.io.BufferedReader.class.getName(), double[].class.getName());
				}
			
		}
	}

	private class StreamDataAdapter extends org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapter {
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
				org.apache.commons.math.stat.descriptive.SummaryStatistics stats = binStats.get(findBin(val));
				stats.addValue(val);
			} 
			inputStream.close();
			inputStream = null;
		}

		@java.lang.Override
		public void computeStats() throws java.io.IOException {
			java.lang.String str = null;
			double val = 0.0;
			sampleStats = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
			while ((str = inputStream.readLine()) != null) {
				val = java.lang.Double.valueOf(str).doubleValue();
				sampleStats.addValue(val);
			} 
			inputStream.close();
			inputStream = null;
		}
	}

	private class ArrayDataAdapter extends org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapter {
		private double[] inputArray;

		public ArrayDataAdapter(double[] in) {
			super();
			inputArray = in;
		}

		@java.lang.Override
		public void computeStats() throws java.io.IOException {
			sampleStats = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
			for (int i = 0; i < (inputArray.length); i++) {
				sampleStats.addValue(inputArray[i]);
			}
		}

		@java.lang.Override
		public void computeBinStats() throws java.io.IOException {
			for (int i = 0; i < (inputArray.length); i++) {
				org.apache.commons.math.stat.descriptive.SummaryStatistics stats = binStats.get(findBin(inputArray[i]));
				stats.addValue(inputArray[i]);
			}
		}
	}

	private void fillBinStats(java.lang.Object in) throws java.io.IOException {
		min = sampleStats.getMin();
		max = sampleStats.getMax();
		delta = ((max) - (min)) / (java.lang.Double.valueOf(binCount).doubleValue());
		if (!(binStats.isEmpty())) {
			binStats.clear();
		}
		for (int i = 0; i < (binCount); i++) {
			org.apache.commons.math.stat.descriptive.SummaryStatistics stats = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
			binStats.add(i, stats);
		}
		org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapterFactory aFactory = new org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapterFactory();
		org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapter da = aFactory.getAdapter(in);
		da.computeBinStats();
		upperBounds = new double[binCount];
		upperBounds[0] = ((double) (binStats.get(0).getN())) / ((double) (sampleStats.getN()));
		for (int i = 1; i < ((binCount) - 1); i++) {
			upperBounds[i] = (upperBounds[(i - 1)]) + (((double) (binStats.get(i).getN())) / ((double) (sampleStats.getN())));
		}
		upperBounds[((binCount) - 1)] = 1.0;
	}

	private int findBin(double value) {
		return org.apache.commons.math.util.FastMath.min(org.apache.commons.math.util.FastMath.max((((int) (org.apache.commons.math.util.FastMath.ceil(((value - (min)) / (delta))))) - 1), 0), ((binCount) - 1));
	}

	public double getNextValue() throws java.lang.IllegalStateException {
		if (!(loaded)) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalStateException(org.apache.commons.math.exception.util.LocalizedFormats.DISTRIBUTION_NOT_LOADED);
		}
		double x = org.apache.commons.math.util.FastMath.random();
		for (int i = 0; i < (binCount); i++) {
			if (x <= (upperBounds[i])) {
				org.apache.commons.math.stat.descriptive.SummaryStatistics stats = binStats.get(i);
				if ((stats.getN()) > 0) {
					if ((stats.getStandardDeviation()) > 0) {
						return randomData.nextGaussian(stats.getMean(), stats.getStandardDeviation());
					}else {
						return stats.getMean();
					}
				}
			}
		}
		throw new org.apache.commons.math.MathRuntimeException(org.apache.commons.math.exception.util.LocalizedFormats.NO_BIN_SELECTED);
	}

	public org.apache.commons.math.stat.descriptive.StatisticalSummary getSampleStats() {
		return sampleStats;
	}

	public int getBinCount() {
		return binCount;
	}

	public java.util.List<org.apache.commons.math.stat.descriptive.SummaryStatistics> getBinStats() {
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
}

