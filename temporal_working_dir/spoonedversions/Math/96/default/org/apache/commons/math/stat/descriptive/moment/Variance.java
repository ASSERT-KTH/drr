

package org.apache.commons.math.stat.descriptive.moment;


public class Variance extends org.apache.commons.math.stat.descriptive.AbstractStorelessUnivariateStatistic implements java.io.Serializable {
	private static final long serialVersionUID = -9111962718267217978L;

	protected org.apache.commons.math.stat.descriptive.moment.SecondMoment moment = null;

	protected boolean incMoment = true;

	private boolean isBiasCorrected = true;

	public Variance() {
		moment = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
	}

	public Variance(final org.apache.commons.math.stat.descriptive.moment.SecondMoment m2) {
		incMoment = false;
		org.apache.commons.math.stat.descriptive.moment.Variance.this.moment = m2;
	}

	public Variance(boolean isBiasCorrected) {
		moment = new org.apache.commons.math.stat.descriptive.moment.SecondMoment();
		org.apache.commons.math.stat.descriptive.moment.Variance.this.isBiasCorrected = isBiasCorrected;
	}

	public Variance(boolean isBiasCorrected, org.apache.commons.math.stat.descriptive.moment.SecondMoment m2) {
		incMoment = false;
		org.apache.commons.math.stat.descriptive.moment.Variance.this.moment = m2;
		org.apache.commons.math.stat.descriptive.moment.Variance.this.isBiasCorrected = isBiasCorrected;
	}

	public void increment(final double d) {
		if (incMoment) {
			moment.increment(d);
		}
	}

	public double getResult() {
		if ((moment.n) == 0) {
			return java.lang.Double.NaN;
		}else
			if ((moment.n) == 1) {
				return 0.0;
			}else {
				if (isBiasCorrected) {
					return (moment.m2) / (((double) (moment.n)) - 1.0);
				}else {
					return (moment.m2) / ((double) (moment.n));
				}
			}
		
	}

	public long getN() {
		return moment.getN();
	}

	public void clear() {
		if (incMoment) {
			moment.clear();
		}
	}

	public double evaluate(final double[] values) {
		if (values == null) {
			throw new java.lang.IllegalArgumentException("input values array is null");
		}
		return evaluate(values, 0, values.length);
	}

	public double evaluate(final double[] values, final int begin, final int length) {
		double var = java.lang.Double.NaN;
		if (test(values, begin, length)) {
			clear();
			if (length == 1) {
				var = 0.0;
			}else
				if (length > 1) {
					org.apache.commons.math.stat.descriptive.moment.Mean mean = new org.apache.commons.math.stat.descriptive.moment.Mean();
					double m = mean.evaluate(values, begin, length);
					var = evaluate(values, m, begin, length);
				}
			
		}
		return var;
	}

	public double evaluate(final double[] values, final double mean, final int begin, final int length) {
		double var = java.lang.Double.NaN;
		if (test(values, begin, length)) {
			if (length == 1) {
				var = 0.0;
			}else
				if (length > 1) {
					double accum = 0.0;
					double dev = 0.0;
					double accum2 = 0.0;
					for (int i = begin; i < (begin + length); i++) {
						dev = (values[i]) - mean;
						accum += dev * dev;
						accum2 += dev;
					}
					double len = ((double) (length));
					if (isBiasCorrected) {
						var = (accum - ((accum2 * accum2) / len)) / (len - 1.0);
					}else {
						var = (accum - ((accum2 * accum2) / len)) / len;
					}
				}
			
		}
		return var;
	}

	public double evaluate(final double[] values, final double mean) {
		return evaluate(values, mean, 0, values.length);
	}

	public boolean isBiasCorrected() {
		return isBiasCorrected;
	}

	public void setBiasCorrected(boolean isBiasCorrected) {
		org.apache.commons.math.stat.descriptive.moment.Variance.this.isBiasCorrected = isBiasCorrected;
	}
}

