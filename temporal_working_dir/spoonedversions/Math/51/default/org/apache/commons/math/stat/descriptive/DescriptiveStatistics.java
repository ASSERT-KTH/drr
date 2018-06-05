

package org.apache.commons.math.stat.descriptive;


public class DescriptiveStatistics implements java.io.Serializable , org.apache.commons.math.stat.descriptive.StatisticalSummary {
	public static final int INFINITE_WINDOW = -1;

	private static final long serialVersionUID = 4133067267405273064L;

	private static final java.lang.String SET_QUANTILE_METHOD_NAME = "setQuantile";

	protected int windowSize = org.apache.commons.math.stat.descriptive.DescriptiveStatistics.INFINITE_WINDOW;

	protected org.apache.commons.math.util.ResizableDoubleArray eDA = new org.apache.commons.math.util.ResizableDoubleArray();

	private org.apache.commons.math.stat.descriptive.UnivariateStatistic meanImpl = new org.apache.commons.math.stat.descriptive.moment.Mean();

	private org.apache.commons.math.stat.descriptive.UnivariateStatistic geometricMeanImpl = new org.apache.commons.math.stat.descriptive.moment.GeometricMean();

	private org.apache.commons.math.stat.descriptive.UnivariateStatistic kurtosisImpl = new org.apache.commons.math.stat.descriptive.moment.Kurtosis();

	private org.apache.commons.math.stat.descriptive.UnivariateStatistic maxImpl = new org.apache.commons.math.stat.descriptive.rank.Max();

	private org.apache.commons.math.stat.descriptive.UnivariateStatistic minImpl = new org.apache.commons.math.stat.descriptive.rank.Min();

	private org.apache.commons.math.stat.descriptive.UnivariateStatistic percentileImpl = new org.apache.commons.math.stat.descriptive.rank.Percentile();

	private org.apache.commons.math.stat.descriptive.UnivariateStatistic skewnessImpl = new org.apache.commons.math.stat.descriptive.moment.Skewness();

	private org.apache.commons.math.stat.descriptive.UnivariateStatistic varianceImpl = new org.apache.commons.math.stat.descriptive.moment.Variance();

	private org.apache.commons.math.stat.descriptive.UnivariateStatistic sumsqImpl = new org.apache.commons.math.stat.descriptive.summary.SumOfSquares();

	private org.apache.commons.math.stat.descriptive.UnivariateStatistic sumImpl = new org.apache.commons.math.stat.descriptive.summary.Sum();

	public DescriptiveStatistics() {
	}

	public DescriptiveStatistics(int window) {
		setWindowSize(window);
	}

	public DescriptiveStatistics(double[] initialDoubleArray) {
		if (initialDoubleArray != null) {
			eDA = new org.apache.commons.math.util.ResizableDoubleArray(initialDoubleArray);
		}
	}

	public DescriptiveStatistics(org.apache.commons.math.stat.descriptive.DescriptiveStatistics original) {
		org.apache.commons.math.stat.descriptive.DescriptiveStatistics.copy(original, org.apache.commons.math.stat.descriptive.DescriptiveStatistics.this);
	}

	public void addValue(double v) {
		if ((windowSize) != (org.apache.commons.math.stat.descriptive.DescriptiveStatistics.INFINITE_WINDOW)) {
			if ((getN()) == (windowSize)) {
				eDA.addElementRolling(v);
			}else
				if ((getN()) < (windowSize)) {
					eDA.addElement(v);
				}
			
		}else {
			eDA.addElement(v);
		}
	}

	public void removeMostRecentValue() {
		eDA.discardMostRecentElements(1);
	}

	public double replaceMostRecentValue(double v) {
		return eDA.substituteMostRecentElement(v);
	}

	public double getMean() {
		return apply(meanImpl);
	}

	public double getGeometricMean() {
		return apply(geometricMeanImpl);
	}

	public double getVariance() {
		return apply(varianceImpl);
	}

	public double getStandardDeviation() {
		double stdDev = java.lang.Double.NaN;
		if ((getN()) > 0) {
			if ((getN()) > 1) {
				stdDev = org.apache.commons.math.util.FastMath.sqrt(getVariance());
			}else {
				stdDev = 0.0;
			}
		}
		return stdDev;
	}

	public double getSkewness() {
		return apply(skewnessImpl);
	}

	public double getKurtosis() {
		return apply(kurtosisImpl);
	}

	public double getMax() {
		return apply(maxImpl);
	}

	public double getMin() {
		return apply(minImpl);
	}

	public long getN() {
		return eDA.getNumElements();
	}

	public double getSum() {
		return apply(sumImpl);
	}

	public double getSumsq() {
		return apply(sumsqImpl);
	}

	public void clear() {
		eDA.clear();
	}

	public int getWindowSize() {
		return windowSize;
	}

	public void setWindowSize(int windowSize) {
		if (windowSize < 1) {
			if (windowSize != (org.apache.commons.math.stat.descriptive.DescriptiveStatistics.INFINITE_WINDOW)) {
				throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.NOT_POSITIVE_WINDOW_SIZE, windowSize);
			}
		}
		org.apache.commons.math.stat.descriptive.DescriptiveStatistics.this.windowSize = windowSize;
		if ((windowSize != (org.apache.commons.math.stat.descriptive.DescriptiveStatistics.INFINITE_WINDOW)) && (windowSize < (eDA.getNumElements()))) {
			eDA.discardFrontElements(((eDA.getNumElements()) - windowSize));
		}
	}

	public double[] getValues() {
		return eDA.getElements();
	}

	public double[] getSortedValues() {
		double[] sort = getValues();
		java.util.Arrays.sort(sort);
		return sort;
	}

	public double getElement(int index) {
		return eDA.getElement(index);
	}

	public double getPercentile(double p) {
		if ((percentileImpl) instanceof org.apache.commons.math.stat.descriptive.rank.Percentile) {
			((org.apache.commons.math.stat.descriptive.rank.Percentile) (percentileImpl)).setQuantile(p);
		}else {
			try {
				percentileImpl.getClass().getMethod(org.apache.commons.math.stat.descriptive.DescriptiveStatistics.SET_QUANTILE_METHOD_NAME, new java.lang.Class[]{ java.lang.Double.TYPE }).invoke(percentileImpl, new java.lang.Object[]{ java.lang.Double.valueOf(p) });
			} catch (java.lang.NoSuchMethodException e1) {
				throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.PERCENTILE_IMPLEMENTATION_UNSUPPORTED_METHOD, percentileImpl.getClass().getName(), org.apache.commons.math.stat.descriptive.DescriptiveStatistics.SET_QUANTILE_METHOD_NAME);
			} catch (java.lang.IllegalAccessException e2) {
				throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.PERCENTILE_IMPLEMENTATION_CANNOT_ACCESS_METHOD, org.apache.commons.math.stat.descriptive.DescriptiveStatistics.SET_QUANTILE_METHOD_NAME, percentileImpl.getClass().getName());
			} catch (java.lang.reflect.InvocationTargetException e3) {
				throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(e3.getCause());
			}
		}
		return apply(percentileImpl);
	}

	@java.lang.Override
	public java.lang.String toString() {
		java.lang.StringBuilder outBuffer = new java.lang.StringBuilder();
		java.lang.String endl = "\n";
		outBuffer.append("DescriptiveStatistics:").append(endl);
		outBuffer.append("n: ").append(getN()).append(endl);
		outBuffer.append("min: ").append(getMin()).append(endl);
		outBuffer.append("max: ").append(getMax()).append(endl);
		outBuffer.append("mean: ").append(getMean()).append(endl);
		outBuffer.append("std dev: ").append(getStandardDeviation()).append(endl);
		outBuffer.append("median: ").append(getPercentile(50)).append(endl);
		outBuffer.append("skewness: ").append(getSkewness()).append(endl);
		outBuffer.append("kurtosis: ").append(getKurtosis()).append(endl);
		return outBuffer.toString();
	}

	public double apply(org.apache.commons.math.stat.descriptive.UnivariateStatistic stat) {
		return stat.evaluate(eDA.getInternalValues(), eDA.start(), eDA.getNumElements());
	}

	public synchronized org.apache.commons.math.stat.descriptive.UnivariateStatistic getMeanImpl() {
		return meanImpl;
	}

	public synchronized void setMeanImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic meanImpl) {
		org.apache.commons.math.stat.descriptive.DescriptiveStatistics.this.meanImpl = meanImpl;
	}

	public synchronized org.apache.commons.math.stat.descriptive.UnivariateStatistic getGeometricMeanImpl() {
		return geometricMeanImpl;
	}

	public synchronized void setGeometricMeanImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic geometricMeanImpl) {
		org.apache.commons.math.stat.descriptive.DescriptiveStatistics.this.geometricMeanImpl = geometricMeanImpl;
	}

	public synchronized org.apache.commons.math.stat.descriptive.UnivariateStatistic getKurtosisImpl() {
		return kurtosisImpl;
	}

	public synchronized void setKurtosisImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic kurtosisImpl) {
		org.apache.commons.math.stat.descriptive.DescriptiveStatistics.this.kurtosisImpl = kurtosisImpl;
	}

	public synchronized org.apache.commons.math.stat.descriptive.UnivariateStatistic getMaxImpl() {
		return maxImpl;
	}

	public synchronized void setMaxImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic maxImpl) {
		org.apache.commons.math.stat.descriptive.DescriptiveStatistics.this.maxImpl = maxImpl;
	}

	public synchronized org.apache.commons.math.stat.descriptive.UnivariateStatistic getMinImpl() {
		return minImpl;
	}

	public synchronized void setMinImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic minImpl) {
		org.apache.commons.math.stat.descriptive.DescriptiveStatistics.this.minImpl = minImpl;
	}

	public synchronized org.apache.commons.math.stat.descriptive.UnivariateStatistic getPercentileImpl() {
		return percentileImpl;
	}

	public synchronized void setPercentileImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic percentileImpl) {
		try {
			percentileImpl.getClass().getMethod(org.apache.commons.math.stat.descriptive.DescriptiveStatistics.SET_QUANTILE_METHOD_NAME, new java.lang.Class[]{ java.lang.Double.TYPE }).invoke(percentileImpl, new java.lang.Object[]{ java.lang.Double.valueOf(50.0) });
		} catch (java.lang.NoSuchMethodException e1) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.PERCENTILE_IMPLEMENTATION_UNSUPPORTED_METHOD, percentileImpl.getClass().getName(), org.apache.commons.math.stat.descriptive.DescriptiveStatistics.SET_QUANTILE_METHOD_NAME);
		} catch (java.lang.IllegalAccessException e2) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.PERCENTILE_IMPLEMENTATION_CANNOT_ACCESS_METHOD, org.apache.commons.math.stat.descriptive.DescriptiveStatistics.SET_QUANTILE_METHOD_NAME, percentileImpl.getClass().getName());
		} catch (java.lang.reflect.InvocationTargetException e3) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException(e3.getCause());
		}
		org.apache.commons.math.stat.descriptive.DescriptiveStatistics.this.percentileImpl = percentileImpl;
	}

	public synchronized org.apache.commons.math.stat.descriptive.UnivariateStatistic getSkewnessImpl() {
		return skewnessImpl;
	}

	public synchronized void setSkewnessImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic skewnessImpl) {
		org.apache.commons.math.stat.descriptive.DescriptiveStatistics.this.skewnessImpl = skewnessImpl;
	}

	public synchronized org.apache.commons.math.stat.descriptive.UnivariateStatistic getVarianceImpl() {
		return varianceImpl;
	}

	public synchronized void setVarianceImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic varianceImpl) {
		org.apache.commons.math.stat.descriptive.DescriptiveStatistics.this.varianceImpl = varianceImpl;
	}

	public synchronized org.apache.commons.math.stat.descriptive.UnivariateStatistic getSumsqImpl() {
		return sumsqImpl;
	}

	public synchronized void setSumsqImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic sumsqImpl) {
		org.apache.commons.math.stat.descriptive.DescriptiveStatistics.this.sumsqImpl = sumsqImpl;
	}

	public synchronized org.apache.commons.math.stat.descriptive.UnivariateStatistic getSumImpl() {
		return sumImpl;
	}

	public synchronized void setSumImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic sumImpl) {
		org.apache.commons.math.stat.descriptive.DescriptiveStatistics.this.sumImpl = sumImpl;
	}

	public org.apache.commons.math.stat.descriptive.DescriptiveStatistics copy() {
		org.apache.commons.math.stat.descriptive.DescriptiveStatistics result = new org.apache.commons.math.stat.descriptive.DescriptiveStatistics();
		org.apache.commons.math.stat.descriptive.DescriptiveStatistics.copy(org.apache.commons.math.stat.descriptive.DescriptiveStatistics.this, result);
		return result;
	}

	public static void copy(org.apache.commons.math.stat.descriptive.DescriptiveStatistics source, org.apache.commons.math.stat.descriptive.DescriptiveStatistics dest) throws org.apache.commons.math.exception.NullArgumentException {
		org.apache.commons.math.util.MathUtils.checkNotNull(source);
		org.apache.commons.math.util.MathUtils.checkNotNull(dest);
		dest.eDA = source.eDA.copy();
		dest.windowSize = source.windowSize;
		dest.maxImpl = source.maxImpl.copy();
		dest.meanImpl = source.meanImpl.copy();
		dest.minImpl = source.minImpl.copy();
		dest.sumImpl = source.sumImpl.copy();
		dest.varianceImpl = source.varianceImpl.copy();
		dest.sumsqImpl = source.sumsqImpl.copy();
		dest.geometricMeanImpl = source.geometricMeanImpl.copy();
		dest.kurtosisImpl = source.kurtosisImpl;
		dest.skewnessImpl = source.skewnessImpl;
		dest.percentileImpl = source.percentileImpl;
	}
}

