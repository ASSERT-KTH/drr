

package org.apache.commons.math3.stat.descriptive;


public abstract class AbstractStorelessUnivariateStatistic extends org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatistic implements org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic {
	@java.lang.Override
	public double evaluate(final double[] values) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		if (values == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.INPUT_ARRAY);
		}
		return evaluate(values, 0, values.length);
	}

	@java.lang.Override
	public double evaluate(final double[] values, final int begin, final int length) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		if (test(values, begin, length)) {
			clear();
			incrementAll(values, begin, length);
		}
		return getResult();
	}

	@java.lang.Override
	public abstract org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic copy();

	public abstract void clear();

	public abstract double getResult();

	public abstract void increment(final double d);

	public void incrementAll(double[] values) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		if (values == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.INPUT_ARRAY);
		}
		incrementAll(values, 0, values.length);
	}

	public void incrementAll(double[] values, int begin, int length) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		if (test(values, begin, length)) {
			int k = begin + length;
			for (int i = begin; i < k; i++) {
				increment(values[i]);
			}
		}
	}

	@java.lang.Override
	public boolean equals(java.lang.Object object) {
		if (object == (org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic.this)) {
			return true;
		}
		if ((object instanceof org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic) == false) {
			return false;
		}
		org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic stat = ((org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic) (object));
		return (org.apache.commons.math3.util.Precision.equalsIncludingNaN(stat.getResult(), org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic.this.getResult())) && (org.apache.commons.math3.util.Precision.equalsIncludingNaN(stat.getN(), org.apache.commons.math3.stat.descriptive.AbstractStorelessUnivariateStatistic.this.getN()));
	}

	@java.lang.Override
	public int hashCode() {
		return (31 * (31 + (org.apache.commons.math3.util.MathUtils.hash(getResult())))) + (org.apache.commons.math3.util.MathUtils.hash(getN()));
	}
}

