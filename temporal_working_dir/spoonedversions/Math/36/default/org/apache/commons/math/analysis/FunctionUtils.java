

package org.apache.commons.math.analysis;


public class FunctionUtils {
	private FunctionUtils() {
	}

	public static org.apache.commons.math.analysis.UnivariateFunction compose(final org.apache.commons.math.analysis.UnivariateFunction... f) {
		return new org.apache.commons.math.analysis.UnivariateFunction() {
			public double value(double x) {
				double r = x;
				for (int i = (f.length) - 1; i >= 0; i--) {
					r = f[i].value(r);
				}
				return r;
			}
		};
	}

	public static org.apache.commons.math.analysis.DifferentiableUnivariateFunction compose(final org.apache.commons.math.analysis.DifferentiableUnivariateFunction... f) {
		return new org.apache.commons.math.analysis.DifferentiableUnivariateFunction() {
			public double value(double x) {
				double r = x;
				for (int i = (f.length) - 1; i >= 0; i--) {
					r = f[i].value(r);
				}
				return r;
			}

			public org.apache.commons.math.analysis.UnivariateFunction derivative() {
				return new org.apache.commons.math.analysis.UnivariateFunction() {
					public double value(double x) {
						double p = 1;
						double r = x;
						for (int i = (f.length) - 1; i >= 0; i--) {
							p *= f[i].derivative().value(r);
							r = f[i].value(r);
						}
						return p;
					}
				};
			}
		};
	}

	public static org.apache.commons.math.analysis.UnivariateFunction add(final org.apache.commons.math.analysis.UnivariateFunction... f) {
		return new org.apache.commons.math.analysis.UnivariateFunction() {
			public double value(double x) {
				double r = f[0].value(x);
				for (int i = 1; i < (f.length); i++) {
					r += f[i].value(x);
				}
				return r;
			}
		};
	}

	public static org.apache.commons.math.analysis.DifferentiableUnivariateFunction add(final org.apache.commons.math.analysis.DifferentiableUnivariateFunction... f) {
		return new org.apache.commons.math.analysis.DifferentiableUnivariateFunction() {
			public double value(double x) {
				double r = f[0].value(x);
				for (int i = 1; i < (f.length); i++) {
					r += f[i].value(x);
				}
				return r;
			}

			public org.apache.commons.math.analysis.UnivariateFunction derivative() {
				return new org.apache.commons.math.analysis.UnivariateFunction() {
					public double value(double x) {
						double r = f[0].derivative().value(x);
						for (int i = 1; i < (f.length); i++) {
							r += f[i].derivative().value(x);
						}
						return r;
					}
				};
			}
		};
	}

	public static org.apache.commons.math.analysis.UnivariateFunction multiply(final org.apache.commons.math.analysis.UnivariateFunction... f) {
		return new org.apache.commons.math.analysis.UnivariateFunction() {
			public double value(double x) {
				double r = f[0].value(x);
				for (int i = 1; i < (f.length); i++) {
					r *= f[i].value(x);
				}
				return r;
			}
		};
	}

	public static org.apache.commons.math.analysis.DifferentiableUnivariateFunction multiply(final org.apache.commons.math.analysis.DifferentiableUnivariateFunction... f) {
		return new org.apache.commons.math.analysis.DifferentiableUnivariateFunction() {
			public double value(double x) {
				double r = f[0].value(x);
				for (int i = 1; i < (f.length); i++) {
					r *= f[i].value(x);
				}
				return r;
			}

			public org.apache.commons.math.analysis.UnivariateFunction derivative() {
				return new org.apache.commons.math.analysis.UnivariateFunction() {
					public double value(double x) {
						double sum = 0;
						for (int i = 0; i < (f.length); i++) {
							double prod = f[i].derivative().value(x);
							for (int j = 0; j < (f.length); j++) {
								if (i != j) {
									prod *= f[j].value(x);
								}
							}
							sum += prod;
						}
						return sum;
					}
				};
			}
		};
	}

	public static org.apache.commons.math.analysis.UnivariateFunction combine(final org.apache.commons.math.analysis.BivariateFunction combiner, final org.apache.commons.math.analysis.UnivariateFunction f, final org.apache.commons.math.analysis.UnivariateFunction g) {
		return new org.apache.commons.math.analysis.UnivariateFunction() {
			public double value(double x) {
				return combiner.value(f.value(x), g.value(x));
			}
		};
	}

	public static org.apache.commons.math.analysis.MultivariateFunction collector(final org.apache.commons.math.analysis.BivariateFunction combiner, final org.apache.commons.math.analysis.UnivariateFunction f, final double initialValue) {
		return new org.apache.commons.math.analysis.MultivariateFunction() {
			public double value(double[] point) {
				double result = combiner.value(initialValue, f.value(point[0]));
				for (int i = 1; i < (point.length); i++) {
					result = combiner.value(result, f.value(point[i]));
				}
				return result;
			}
		};
	}

	public static org.apache.commons.math.analysis.MultivariateFunction collector(final org.apache.commons.math.analysis.BivariateFunction combiner, final double initialValue) {
		return org.apache.commons.math.analysis.FunctionUtils.collector(combiner, new org.apache.commons.math.analysis.function.Identity(), initialValue);
	}

	public static org.apache.commons.math.analysis.UnivariateFunction fix1stArgument(final org.apache.commons.math.analysis.BivariateFunction f, final double fixed) {
		return new org.apache.commons.math.analysis.UnivariateFunction() {
			public double value(double x) {
				return f.value(fixed, x);
			}
		};
	}

	public static org.apache.commons.math.analysis.UnivariateFunction fix2ndArgument(final org.apache.commons.math.analysis.BivariateFunction f, final double fixed) {
		return new org.apache.commons.math.analysis.UnivariateFunction() {
			public double value(double x) {
				return f.value(x, fixed);
			}
		};
	}

	public static double[] sample(org.apache.commons.math.analysis.UnivariateFunction f, double min, double max, int n) {
		if (n <= 0) {
			throw new org.apache.commons.math.exception.NotStrictlyPositiveException(org.apache.commons.math.exception.util.LocalizedFormats.NOT_POSITIVE_NUMBER_OF_SAMPLES, java.lang.Integer.valueOf(n));
		}
		if (min >= max) {
			throw new org.apache.commons.math.exception.NumberIsTooLargeException(min, max, false);
		}
		double[] s = new double[n];
		double h = (max - min) / n;
		for (int i = 0; i < n; i++) {
			s[i] = f.value((min + (i * h)));
		}
		return s;
	}
}

