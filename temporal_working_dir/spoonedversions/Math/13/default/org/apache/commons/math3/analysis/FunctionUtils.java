

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

			public org.apache.commons.math3.analysis.differentiation.DerivativeStructure value(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure t) throws org.apache.commons.math3.exception.NumberIsTooLargeException {
				switch (t.getOrder()) {
					case 0 :
						return new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(t.getFreeParameters(), 0, f.value(t.getValue()));
					case 1 :
						{
							final int parameters = t.getFreeParameters();
							final double[] derivatives = new double[parameters + 1];
							derivatives[0] = f.value(t.getValue());
							final double fPrime = f.derivative().value(t.getValue());
							int[] orders = new int[parameters];
							for (int i = 0; i < parameters; ++i) {
								orders[i] = 1;
								derivatives[(i + 1)] = fPrime * (t.getPartialDerivative(orders));
								orders[i] = 0;
							}
							return new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(parameters, 1, derivatives);
						}
					default :
						throw new org.apache.commons.math3.exception.NumberIsTooLargeException(t.getOrder(), 1, true);
				}
			}
		};
	}

	@java.lang.Deprecated
	public static org.apache.commons.math3.analysis.DifferentiableMultivariateFunction toDifferentiableMultivariateFunction(final org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction f) {
		return new org.apache.commons.math3.analysis.DifferentiableMultivariateFunction() {
			public double value(final double[] x) {
				return f.value(x);
			}

			public org.apache.commons.math3.analysis.MultivariateFunction partialDerivative(final int k) {
				return new org.apache.commons.math3.analysis.MultivariateFunction() {
					public double value(final double[] x) {
						final int n = x.length;
						final org.apache.commons.math3.analysis.differentiation.DerivativeStructure[] dsX = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure[n];
						for (int i = 0; i < n; ++i) {
							if (i == k) {
								dsX[i] = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(1, 1, 0, x[i]);
							}else {
								dsX[i] = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(1, 1, x[i]);
							}
						}
						final org.apache.commons.math3.analysis.differentiation.DerivativeStructure y = f.value(dsX);
						return y.getPartialDerivative(1);
					}
				};
			}

			public org.apache.commons.math3.analysis.MultivariateVectorFunction gradient() {
				return new org.apache.commons.math3.analysis.MultivariateVectorFunction() {
					public double[] value(final double[] x) {
						final int n = x.length;
						final org.apache.commons.math3.analysis.differentiation.DerivativeStructure[] dsX = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure[n];
						for (int i = 0; i < n; ++i) {
							dsX[i] = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(n, 1, i, x[i]);
						}
						final org.apache.commons.math3.analysis.differentiation.DerivativeStructure y = f.value(dsX);
						final double[] gradient = new double[n];
						final int[] orders = new int[n];
						for (int i = 0; i < n; ++i) {
							orders[i] = 1;
							gradient[i] = y.getPartialDerivative(orders);
							orders[i] = 0;
						}
						return gradient;
					}
				};
			}
		};
	}

	@java.lang.Deprecated
	public static org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction toMultivariateDifferentiableFunction(final org.apache.commons.math3.analysis.DifferentiableMultivariateFunction f) {
		return new org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableFunction() {
			public double value(final double[] x) {
				return f.value(x);
			}

			public org.apache.commons.math3.analysis.differentiation.DerivativeStructure value(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure[] t) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NumberIsTooLargeException {
				final int parameters = t[0].getFreeParameters();
				final int order = t[0].getOrder();
				final int n = t.length;
				if (order > 1) {
					throw new org.apache.commons.math3.exception.NumberIsTooLargeException(order, 1, true);
				}
				for (int i = 0; i < n; ++i) {
					if ((t[i].getFreeParameters()) != parameters) {
						throw new org.apache.commons.math3.exception.DimensionMismatchException(t[i].getFreeParameters(), parameters);
					}
					if ((t[i].getOrder()) != order) {
						throw new org.apache.commons.math3.exception.DimensionMismatchException(t[i].getOrder(), order);
					}
				}
				final double[] point = new double[n];
				for (int i = 0; i < n; ++i) {
					point[i] = t[i].getValue();
				}
				final double value = f.value(point);
				final double[] gradient = f.gradient().value(point);
				final double[] derivatives = new double[parameters + 1];
				derivatives[0] = value;
				final int[] orders = new int[parameters];
				for (int i = 0; i < parameters; ++i) {
					orders[i] = 1;
					for (int j = 0; j < n; ++j) {
						derivatives[(i + 1)] += (gradient[j]) * (t[j].getPartialDerivative(orders));
					}
					orders[i] = 0;
				}
				return new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(parameters, order, derivatives);
			}
		};
	}

	@java.lang.Deprecated
	public static org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction toDifferentiableMultivariateVectorFunction(final org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction f) {
		return new org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction() {
			public double[] value(final double[] x) {
				return f.value(x);
			}

			public org.apache.commons.math3.analysis.MultivariateMatrixFunction jacobian() {
				return new org.apache.commons.math3.analysis.MultivariateMatrixFunction() {
					public double[][] value(final double[] x) {
						final int n = x.length;
						final org.apache.commons.math3.analysis.differentiation.DerivativeStructure[] dsX = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure[n];
						for (int i = 0; i < n; ++i) {
							dsX[i] = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(n, 1, i, x[i]);
						}
						final org.apache.commons.math3.analysis.differentiation.DerivativeStructure[] y = f.value(dsX);
						final double[][] jacobian = new double[y.length][n];
						final int[] orders = new int[n];
						for (int i = 0; i < (y.length); ++i) {
							for (int j = 0; j < n; ++j) {
								orders[j] = 1;
								jacobian[i][j] = y[i].getPartialDerivative(orders);
								orders[j] = 0;
							}
						}
						return jacobian;
					}
				};
			}
		};
	}

	@java.lang.Deprecated
	public static org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction toMultivariateDifferentiableVectorFunction(final org.apache.commons.math3.analysis.DifferentiableMultivariateVectorFunction f) {
		return new org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction() {
			public double[] value(final double[] x) {
				return f.value(x);
			}

			public org.apache.commons.math3.analysis.differentiation.DerivativeStructure[] value(final org.apache.commons.math3.analysis.differentiation.DerivativeStructure[] t) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.NumberIsTooLargeException {
				final int parameters = t[0].getFreeParameters();
				final int order = t[0].getOrder();
				final int n = t.length;
				if (order > 1) {
					throw new org.apache.commons.math3.exception.NumberIsTooLargeException(order, 1, true);
				}
				for (int i = 0; i < n; ++i) {
					if ((t[i].getFreeParameters()) != parameters) {
						throw new org.apache.commons.math3.exception.DimensionMismatchException(t[i].getFreeParameters(), parameters);
					}
					if ((t[i].getOrder()) != order) {
						throw new org.apache.commons.math3.exception.DimensionMismatchException(t[i].getOrder(), order);
					}
				}
				final double[] point = new double[n];
				for (int i = 0; i < n; ++i) {
					point[i] = t[i].getValue();
				}
				final double[] value = f.value(point);
				final double[][] jacobian = f.jacobian().value(point);
				final org.apache.commons.math3.analysis.differentiation.DerivativeStructure[] merged = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure[value.length];
				for (int k = 0; k < (merged.length); ++k) {
					final double[] derivatives = new double[parameters + 1];
					derivatives[0] = value[k];
					final int[] orders = new int[parameters];
					for (int i = 0; i < parameters; ++i) {
						orders[i] = 1;
						for (int j = 0; j < n; ++j) {
							derivatives[(i + 1)] += (jacobian[k][j]) * (t[j].getPartialDerivative(orders));
						}
						orders[i] = 0;
					}
					merged[k] = new org.apache.commons.math3.analysis.differentiation.DerivativeStructure(parameters, order, derivatives);
				}
				return merged;
			}
		};
	}
}

