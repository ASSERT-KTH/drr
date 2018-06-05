

package org.apache.commons.math.random;


public class EmpiricalDistributionImpl implements java.io.Serializable , org.apache.commons.math.random.EmpiricalDistribution {
	private static final long serialVersionUID = 5729073523949762654L;

	private java.util.List<org.apache.commons.math.stat.descriptive.SummaryStatistics> binStats = null;

	private org.apache.commons.math.stat.descriptive.SummaryStatistics sampleStats = null;

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
		} catch (java.lang.Exception e) {
			throw new org.apache.commons.math.MathRuntimeException(e);
		}
		loaded = true;
	}

	public void load(java.net.URL url) throws java.io.IOException {
		java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(url.openStream()));
		try {
			org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapter da = new org.apache.commons.math.random.EmpiricalDistributionImpl.StreamDataAdapter(in);
			try {
				da.computeStats();
			} catch (java.io.IOException ioe) {
				throw ioe;
			} catch (java.lang.RuntimeException rte) {
				throw rte;
			} catch (java.lang.Exception e) {
				throw org.apache.commons.math.MathRuntimeException.createIOException(e);
			}
			if ((sampleStats.getN()) == 0) {
				throw org.apache.commons.math.MathRuntimeException.createEOFException("URL {0} contains no data", url);
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
			try {
				da.computeStats();
			} catch (java.io.IOException ioe) {
				throw ioe;
			} catch (java.lang.RuntimeException rte) {
				throw rte;
			} catch (java.lang.Exception e) {
				throw org.apache.commons.math.MathRuntimeException.createIOException(e);
			}
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
		public abstract void computeBinStats(double min, double delta) throws java.lang.Exception;

		public abstract void computeStats() throws java.lang.Exception;
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
					throw new java.lang.IllegalArgumentException(("Input data comes from the" + " unsupported source"));
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
		public void computeBinStats(double min, double delta) throws java.io.IOException {
			java.lang.String str = null;
			double val = 0.0;
			while ((str = inputStream.readLine()) != null) {
				val = java.lang.Double.parseDouble(str);
				org.apache.commons.math.stat.descriptive.SummaryStatistics stats = binStats.get(findBin(min, val, delta));
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
		public void computeBinStats(double min, double delta) throws java.io.IOException {
			for (int i = 0; i < (inputArray.length); i++) {
				org.apache.commons.math.stat.descriptive.SummaryStatistics stats = binStats.get(findBin(min, inputArray[i], delta));
				stats.addValue(inputArray[i]);
			}
		}
	}

	private void fillBinStats(java.lang.Object in) throws java.io.IOException {
		double min = sampleStats.getMin();
		double max = sampleStats.getMax();
		double delta = (max - min) / (java.lang.Double.valueOf(binCount).doubleValue());
		double[] binUpperBounds = new double[binCount];
		binUpperBounds[0] = min + delta;
		for (int i = 1; i < ((binCount) - 1); i++) {
			binUpperBounds[i] = (binUpperBounds[(i - 1)]) + delta;
		}
		binUpperBounds[((binCount) - 1)] = max;
		if (!(binStats.isEmpty())) {
			binStats.clear();
		}
		for (int i = 0; i < (binCount); i++) {
			org.apache.commons.math.stat.descriptive.SummaryStatistics stats = new org.apache.commons.math.stat.descriptive.SummaryStatistics();
			binStats.add(i, stats);
		}
		org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapterFactory aFactory = new org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapterFactory();
		org.apache.commons.math.random.EmpiricalDistributionImpl.DataAdapter da = aFactory.getAdapter(in);
		try {
			da.computeBinStats(min, delta);
		} catch (java.io.IOException ioe) {
			throw ioe;
		} catch (java.lang.RuntimeException rte) {
			throw rte;
		} catch (java.lang.Exception e) {
			throw org.apache.commons.math.MathRuntimeException.createIOException(e);
		}
		upperBounds = new double[binCount];
		upperBounds[0] = ((double) (binStats.get(0).getN())) / ((double) (sampleStats.getN()));
		for (int i = 1; i < ((binCount) - 1); i++) {
			upperBounds[i] = (upperBounds[(i - 1)]) + (((double) (binStats.get(i).getN())) / ((double) (sampleStats.getN())));
		}
		upperBounds[((binCount) - 1)] = 1.0;
	}

	private int findBin(double min, double value, double delta) {
		return java.lang.Math.min(java.lang.Math.max((((int) (java.lang.Math.ceil(((value - min) / delta)))) - 1), 0), ((binCount) - 1));
	}

	public double getNextValue() throws java.lang.IllegalStateException {
		if (!(loaded)) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalStateException("distribution not loaded");
		}
		double x = java.lang.Math.random();
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
		throw new org.apache.commons.math.MathRuntimeException("no bin selected");
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
		int len = upperBounds.length;
		double[] out = new double[len];
		java.lang.System.arraycopy(upperBounds, 0, out, 0, len);
		return out;
	}

	public boolean isLoaded() {
		return loaded;
	}
}

