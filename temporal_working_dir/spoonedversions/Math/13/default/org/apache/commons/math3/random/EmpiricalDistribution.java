

package org.apache.commons.math3.random;


public class EmpiricalDistribution extends org.apache.commons.math3.distribution.AbstractRealDistribution {
	public static final int DEFAULT_BIN_COUNT = 1000;

	private static final java.lang.String FILE_CHARSET = "US-ASCII";

	private static final long serialVersionUID = 5729073523949762654L;

	private final java.util.List<org.apache.commons.math3.stat.descriptive.SummaryStatistics> binStats;

	private org.apache.commons.math3.stat.descriptive.SummaryStatistics sampleStats = null;

	private double max = java.lang.Double.NEGATIVE_INFINITY;

	private double min = java.lang.Double.POSITIVE_INFINITY;

	private double delta = 0.0;

	private final int binCount;

	private boolean loaded = false;

	private double[] upperBounds = null;

	private final org.apache.commons.math3.random.RandomDataGenerator randomData;

	public EmpiricalDistribution() {
		this(org.apache.commons.math3.random.EmpiricalDistribution.DEFAULT_BIN_COUNT);
	}

	public EmpiricalDistribution(int binCount) {
		this(binCount, new org.apache.commons.math3.random.RandomDataGenerator());
	}

	public EmpiricalDistribution(int binCount, org.apache.commons.math3.random.RandomGenerator generator) {
		this(binCount, new org.apache.commons.math3.random.RandomDataGenerator(generator));
	}

	public EmpiricalDistribution(org.apache.commons.math3.random.RandomGenerator generator) {
		this(org.apache.commons.math3.random.EmpiricalDistribution.DEFAULT_BIN_COUNT, generator);
	}

	@java.lang.Deprecated
	public EmpiricalDistribution(int binCount, org.apache.commons.math3.random.RandomDataImpl randomData) {
		this(binCount, randomData.getDelegate());
	}

	@java.lang.Deprecated
	public EmpiricalDistribution(org.apache.commons.math3.random.RandomDataImpl randomData) {
		this(org.apache.commons.math3.random.EmpiricalDistribution.DEFAULT_BIN_COUNT, randomData);
	}

	private EmpiricalDistribution(int binCount, org.apache.commons.math3.random.RandomDataGenerator randomData) {
		super(null);
		this.binCount = binCount;
		this.randomData = randomData;
		binStats = new java.util.ArrayList<org.apache.commons.math3.stat.descriptive.SummaryStatistics>();
	}

	public void load(double[] in) throws org.apache.commons.math3.exception.NullArgumentException {
		org.apache.commons.math3.random.EmpiricalDistribution.DataAdapter da = new org.apache.commons.math3.random.EmpiricalDistribution.ArrayDataAdapter(in);
		try {
			da.computeStats();
			fillBinStats(new org.apache.commons.math3.random.EmpiricalDistribution.ArrayDataAdapter(in));
		} catch (java.io.IOException ex) {
			throw new org.apache.commons.math3.exception.MathInternalError();
		}
		loaded = true;
	}

	public void load(java.net.URL url) throws java.io.IOException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.ZeroException {
		org.apache.commons.math3.util.MathUtils.checkNotNull(url);
		java.nio.charset.Charset charset = java.nio.charset.Charset.forName(org.apache.commons.math3.random.EmpiricalDistribution.FILE_CHARSET);
		java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(url.openStream(), charset));
		try {
			org.apache.commons.math3.random.EmpiricalDistribution.DataAdapter da = new org.apache.commons.math3.random.EmpiricalDistribution.StreamDataAdapter(in);
			da.computeStats();
			if ((sampleStats.getN()) == 0) {
				throw new org.apache.commons.math3.exception.ZeroException(org.apache.commons.math3.exception.util.LocalizedFormats.URL_CONTAINS_NO_DATA, url);
			}
			in = new java.io.BufferedReader(new java.io.InputStreamReader(url.openStream(), charset));
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
		java.nio.charset.Charset charset = java.nio.charset.Charset.forName(org.apache.commons.math3.random.EmpiricalDistribution.FILE_CHARSET);
		java.io.InputStream is = new java.io.FileInputStream(file);
		java.io.BufferedReader in = new java.io.BufferedReader(new java.io.InputStreamReader(is, charset));
		try {
			org.apache.commons.math3.random.EmpiricalDistribution.DataAdapter da = new org.apache.commons.math3.random.EmpiricalDistribution.StreamDataAdapter(in);
			da.computeStats();
			is = new java.io.FileInputStream(file);
			in = new java.io.BufferedReader(new java.io.InputStreamReader(is, charset));
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
		for (int i = 0; i < ((binCount) - 1); i++) {
			binUpperBounds[i] = (min) + ((delta) * (i + 1));
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

	public double probability(double x) {
		return 0;
	}

	public double density(double x) {
		if ((x < (min)) || (x > (max))) {
			return 0.0;
		}
		final int binIndex = findBin(x);
		final org.apache.commons.math3.distribution.RealDistribution kernel = getKernel(binStats.get(binIndex));
		return ((kernel.density(x)) * (pB(binIndex))) / (kB(binIndex));
	}

	public double cumulativeProbability(double x) {
		if (x < (min)) {
			return 0.0;
		}else
			if (x >= (max)) {
				return 1.0;
			}
		
		final int binIndex = findBin(x);
		final double pBminus = pBminus(binIndex);
		final double pB = pB(binIndex);
		final double[] binBounds = getUpperBounds();
		final double kB = kB(binIndex);
		final double lower = binIndex == 0 ? min : binBounds[(binIndex - 1)];
		final org.apache.commons.math3.distribution.RealDistribution kernel = k(x);
		final double withinBinCum = ((kernel.cumulativeProbability(x)) - (kernel.cumulativeProbability(lower))) / kB;
		return pBminus + (pB * withinBinCum);
	}

	public double inverseCumulativeProbability(final double p) throws org.apache.commons.math3.exception.OutOfRangeException {
		if ((p < 0.0) || (p > 1.0)) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(p, 0, 1);
		}
		if (p == 0.0) {
			return getSupportLowerBound();
		}
		if (p == 1.0) {
			return getSupportUpperBound();
		}
		int i = 0;
		while ((cumBinP(i)) < p) {
			i++;
		} 
		final org.apache.commons.math3.distribution.RealDistribution kernel = getKernel(binStats.get(i));
		final double kB = kB(i);
		final double[] binBounds = getUpperBounds();
		final double lower = i == 0 ? min : binBounds[(i - 1)];
		final double kBminus = kernel.cumulativeProbability(lower);
		final double pB = pB(i);
		final double pBminus = pBminus(i);
		final double pCrit = p - pBminus;
		if (pCrit <= 0) {
			return lower;
		}
		return kernel.inverseCumulativeProbability((kBminus + ((pCrit * kB) / pB)));
	}

	public double getNumericalMean() {
		return sampleStats.getMean();
	}

	public double getNumericalVariance() {
		return sampleStats.getVariance();
	}

	public double getSupportLowerBound() {
		return min;
	}

	public double getSupportUpperBound() {
		return max;
	}

	public boolean isSupportLowerBoundInclusive() {
		return true;
	}

	public boolean isSupportUpperBoundInclusive() {
		return true;
	}

	public boolean isSupportConnected() {
		return true;
	}

	@java.lang.Override
	public double sample() {
		return getNextValue();
	}

	@java.lang.Override
	public void reseedRandomGenerator(long seed) {
		randomData.reSeed(seed);
	}

	private double pB(int i) {
		return i == 0 ? upperBounds[0] : (upperBounds[i]) - (upperBounds[(i - 1)]);
	}

	private double pBminus(int i) {
		return i == 0 ? 0 : upperBounds[(i - 1)];
	}

	@java.lang.SuppressWarnings(value = "deprecation")
	private double kB(int i) {
		final double[] binBounds = getUpperBounds();
		final org.apache.commons.math3.distribution.RealDistribution kernel = getKernel(binStats.get(i));
		return i == 0 ? kernel.cumulativeProbability(min, binBounds[0]) : kernel.cumulativeProbability(binBounds[(i - 1)], binBounds[i]);
	}

	private org.apache.commons.math3.distribution.RealDistribution k(double x) {
		final int binIndex = findBin(x);
		return getKernel(binStats.get(binIndex));
	}

	private double cumBinP(int binIndex) {
		return upperBounds[binIndex];
	}

	private org.apache.commons.math3.distribution.RealDistribution getKernel(org.apache.commons.math3.stat.descriptive.SummaryStatistics bStats) {
		return new org.apache.commons.math3.distribution.NormalDistribution(bStats.getMean(), bStats.getStandardDeviation());
	}
}

