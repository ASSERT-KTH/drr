

package org.apache.commons.math.stat.descriptive;


public abstract class AbstractStorelessUnivariateStatistic extends org.apache.commons.math.stat.descriptive.AbstractUnivariateStatistic implements java.io.Serializable , org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic {
	private static final long serialVersionUID = -44915725420072521L;

	@java.lang.Override
	public double evaluate(final double[] values) {
		if (values == null) {
			throw new java.lang.IllegalArgumentException("input value array is null");
		}
		return evaluate(values, 0, values.length);
	}

	@java.lang.Override
	public double evaluate(final double[] values, final int begin, final int length) {
		if (test(values, begin, length)) {
			clear();
			incrementAll(values, begin, length);
		}
		return getResult();
	}

	@java.lang.Override
	public abstract org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic copy();

	public abstract void clear();

	public abstract double getResult();

	public abstract void increment(final double d);

	public void incrementAll(double[] values) {
		if (values == null) {
			throw new java.lang.IllegalArgumentException("input values array is null");
		}
		incrementAll(values, 0, values.length);
	}

	public void incrementAll(double[] values, int begin, int length) {
		if (test(values, begin, length)) {
			int k = begin + length;
			for (int i = begin; i < k; i++) {
				increment(values[i]);
			}
		}
	}

	@java.lang.Override
	public boolean equals(java.lang.Object object) {
		if (object == (org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic.this)) {
			return true;
		}
		if ((object instanceof org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic) == false) {
			return false;
		}
		org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic stat = ((org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic) (object));
		return (org.apache.commons.math.util.MathUtils.equals(stat.getResult(), org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic.this.getResult())) && (org.apache.commons.math.util.MathUtils.equals(stat.getN(), org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic.this.getN()));
	}

	@java.lang.Override
	public int hashCode() {
		return (31 * (31 + (org.apache.commons.math.util.MathUtils.hash(getResult())))) + (org.apache.commons.math.util.MathUtils.hash(getN()));
	}
}

