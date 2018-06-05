

package org.apache.commons.math3.analysis;


public class FunctionUtils {
	private FunctionUtils() {
	}

	public static org.apache.commons.math3.analysis.UnivariateFunction compose(final org.apache.commons.math3.analysis.UnivariateFunction... f) {
		return new org.apache.commons.math3.analysis.UnivariateFunction() {
			public double value(double x) {
				double r = x;
				for (int i = (f.length) - 1; i >= 0; i--) {
					r = f[i].value(r);
				}
				return r;
			}
		};
	}

	public static org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction compose(final org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction... f) {
		return new org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction() {
			public double value(final double t) {
				double r = t;
				for (int i = (f.length) - 1; i >= 0; i--) {
					r = f[i].value(r);
				}
				return r;
			}

			public org.apache.commons.math3.analysis.differentiation.DerivativeStructure value(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure t) {
				org.apache.commons.math3.analysis.differentiation.DerivativeStructure r = t;
				for (int i = (f.length) - 1; i >= 0; i--) {
					r = f[i].value(r);
				}
				return r;
			}
		};
	}

	public static org.apache.commons.math3.analysis.DifferentiableUnivariateFunction compose(final org.apache.commons.math3.analysis.DifferentiableUnivariateFunction... f) {
		return new org.apache.commons.math3.analysis.DifferentiableUnivariateFunction() {
			public double value(double x) {
				double r = x;
				for (int i = (f.length) - 1; i >= 0; i--) {
					r = f[i].value(r);
				}
				return r;
			}

			public org.apache.commons.math3.analysis.UnivariateFunction derivative() {
				return new org.apache.commons.math3.analysis.UnivariateFunction() {
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

	public static org.apache.commons.math3.analysis.UnivariateFunction add(final org.apache.commons.math3.analysis.UnivariateFunction... f) {
		return new org.apache.commons.math3.analysis.UnivariateFunction() {
			public double value(double x) {
				double r = f[0].value(x);
				for (int i = 1; i < (f.length); i++) {
					r += f[i].value(x);
				}
				return r;
			}
		};
	}

	public static org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction add(final org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction... f) {
		return new org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction() {
			public double value(final double t) {
				double r = f[0].value(t);
				for (int i = 1; i < (f.length); i++) {
					r += f[i].value(t);
				}
				return r;
			}

			public org.apache.commons.math3.analysis.differentiation.DerivativeStructure value(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure t) {
				org.apache.commons.math3.analysis.differentiation.DerivativeStructure r = f[0].value(t);
				for (int i = 1; i < (f.length); i++) {
					r = r.add(f[i].value(t));
				}
				return r;
			}
		};
	}

	@java.lang.Deprecated
	public static org.apache.commons.math3.analysis.DifferentiableUnivariateFunction add(final org.apache.commons.math3.analysis.DifferentiableUnivariateFunction... f) {
		return new org.apache.commons.math3.analysis.DifferentiableUnivariateFunction() {
			public double value(double x) {
				double r = f[0].value(x);
				for (int i = 1; i < (f.length); i++) {
					r += f[i].value(x);
				}
				return r;
			}

			public org.apache.commons.math3.analysis.UnivariateFunction derivative() {
				return new org.apache.commons.math3.analysis.UnivariateFunction() {
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

	public static org.apache.commons.math3.analysis.UnivariateFunction multiply(final org.apache.commons.math3.analysis.UnivariateFunction... f) {
		return new org.apache.commons.math3.analysis.UnivariateFunction() {
			public double value(double x) {
				double r = f[0].value(x);
				for (int i = 1; i < (f.length); i++) {
					r *= f[i].value(x);
				}
				return r;
			}
		};
	}

	public static org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction multiply(final org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction... f) {
		return new org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction() {
			public double value(final double t) {
				double r = f[0].value(t);
				for (int i = 1; i < (f.length); i++) {
					r *= f[i].value(t);
				}
				return r;
			}

			public org.apache.commons.math3.analysis.differentiation.DerivativeStructure value(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure t) {
				org.apache.commons.math3.analysis.differentiation.DerivativeStructure r = f[0].value(t);
				for (int i = 1; i < (f.length); i++) {
					r = r.multiply(f[i].value(t));
				}
				return r;
			}
		};
	}

	public static org.apache.commons.math3.analysis.DifferentiableUnivariateFunction multiply(final org.apache.commons.math3.analysis.DifferentiableUnivariateFunction... f) {
		return new org.apache.commons.math3.analysis.DifferentiableUnivariateFunction() {
			public double value(double x) {
				double r = f[0].value(x);
				for (int i = 1; i < (f.length); i++) {
					r *= f[i].value(x);
				}
				return r;
			}

			public org.apache.commons.math3.analysis.UnivariateFunction derivative() {
				return new org.apache.commons.math3.analysis.UnivariateFunction() {
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

	public static org.apache.commons.math3.analysis.UnivariateFunction combine(final org.apache.commons.math3.analysis.BivariateFunction combiner, final org.apache.commons.math3.analysis.UnivariateFunction f, final org.apache.commons.math3.analysis.UnivariateFunction g) {
		return new org.apache.commons.math3.analysis.UnivariateFunction() {
			public double value(double x) {
				return combiner.value(f.value(x), g.value(x));
			}
		};
	}

	public static org.apache.commons.math3.analysis.MultivariateFunction collector(final org.apache.commons.math3.analysis.BivariateFunction combiner, final org.apache.commons.math3.analysis.UnivariateFunction f, final double initialValue) {
		return new org.apache.commons.math3.analysis.MultivariateFunction() {
			public double value(double[] point) {
				double result = combiner.value(initialValue, f.value(point[0]));
				for (int i = 1; i < (point.length); i++) {
					result = combiner.value(result, f.value(point[i]));
				}
				return result;
			}
		};
	}

	public static org.apache.commons.math3.analysis.MultivariateFunction collector(final org.apache.commons.math3.analysis.BivariateFunction combiner, final double initialValue) {
		return org.apache.commons.math3.analysis.FunctionUtils.collector(combiner, new org.apache.commons.math3.analysis.function.Identity(), initialValue);
	}

	public static org.apache.commons.math3.analysis.UnivariateFunction fix1stArgument(final org.apache.commons.math3.analysis.BivariateFunction f, final double fixed) {
		return new org.apache.commons.math3.analysis.UnivariateFunction() {
			public double value(double x) {
				return f.value(fixed, x);
			}
		};
	}

	public static org.apache.commons.math3.analysis.UnivariateFunction fix2ndArgument(final org.apache.commons.math3.analysis.BivariateFunction f, final double fixed) {
		return new org.apache.commons.math3.analysis.UnivariateFunction() {
			public double value(double x) {
				return f.value(x, fixed);
			}
		};
	}

	public static double[] sample(org.apache.commons.math3.analysis.UnivariateFunction f, double min, double max, int n) {
		if (n <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.NOT_POSITIVE_NUMBER_OF_SAMPLES, java.lang.Integer.valueOf(n));
		}
		if (min >= max) {
			throw new org.apache.commons.math3.exception.NumberIsTooLargeException(min, max, false);
		}
		final double[] s = new double[n];
		final double h = (max - min) / n;
		for (int i = 0; i < n; i++) {
			s[i] = f.value((min + (i * h)));
		}
		return s;
	}

	@java.lang.Deprecated
	public static org.apache.commons.math3.analysis.DifferentiableUnivariateFunction toDifferentiableUnivariateFunction(final org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction f) {
		return new org.apache.commons.math3.analysis.DifferentiableUnivariateFunction() {
			public double value(final double x) {
				return f.value(x);
			}

			public org.apache.commons.math3.analysis.UnivariateFunction derivative() {
				return new org.apache.commons.math3.analysis.UnivariateFunction() {
					public double value(final double x) {
						return f.value(new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(1, 1, 0, x)).getPartialDerivative(1);
					}
				};
			}
		};
	}

	@java.lang.Deprecated
	public static org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction toUnivariateDifferential(final org.apache.commons.math3.analysis.DifferentiableUnivariateFunction f) {
		return new org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction() {
			public double value(final double x) {
				return f.value(x);
			}

			public org.apache.commons.math3.analysis.differentiation.DerivativeStructure value(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure t) throws org.apache.commons.math3.exception.DimensionMismatchException {
				if ((t.getFreeParameters()) != 1) {
					throw new org.apache.commons.math3.exception.DimensionMismatchException(t.getFreeParameters(), 1);
				}
				if ((t.getOrder()) > 1) {
					throw new org.apache.commons.math3.exception.DimensionMismatchException(t.getOrder(), 1);
				}
				return t.compose(new double[]{ f.value(t.getValue()) , f.derivative().value(t.getValue()) });
			}
		};
	}
}

