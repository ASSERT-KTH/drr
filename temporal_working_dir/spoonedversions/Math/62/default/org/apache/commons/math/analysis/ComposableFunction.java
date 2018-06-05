

package org.apache.commons.math.analysis;


public abstract class ComposableFunction implements org.apache.commons.math.analysis.UnivariateRealFunction {
	public static final org.apache.commons.math.analysis.ComposableFunction ZERO = new org.apache.commons.math.analysis.ComposableFunction() {
		@java.lang.Override
		public double value(double d) {
			return 0;
		}
	};

	public static final org.apache.commons.math.analysis.ComposableFunction ONE = new org.apache.commons.math.analysis.ComposableFunction() {
		@java.lang.Override
		public double value(double d) {
			return 1;
		}
	};

	public static final org.apache.commons.math.analysis.ComposableFunction IDENTITY = new org.apache.commons.math.analysis.ComposableFunction() {
		@java.lang.Override
		public double value(double d) {
			return d;
		}
	};

	public static final org.apache.commons.math.analysis.ComposableFunction ABS = new org.apache.commons.math.analysis.ComposableFunction() {
		@java.lang.Override
		public double value(double d) {
			return org.apache.commons.math.util.FastMath.abs(d);
		}
	};

	public static final org.apache.commons.math.analysis.ComposableFunction NEGATE = new org.apache.commons.math.analysis.ComposableFunction() {
		@java.lang.Override
		public double value(double d) {
			return -d;
		}
	};

	public static final org.apache.commons.math.analysis.ComposableFunction INVERT = new org.apache.commons.math.analysis.ComposableFunction() {
		@java.lang.Override
		public double value(double d) {
			return 1 / d;
		}
	};

	public static final org.apache.commons.math.analysis.ComposableFunction SIN = new org.apache.commons.math.analysis.ComposableFunction() {
		@java.lang.Override
		public double value(double d) {
			return org.apache.commons.math.util.FastMath.sin(d);
		}
	};

	public static final org.apache.commons.math.analysis.ComposableFunction SQRT = new org.apache.commons.math.analysis.ComposableFunction() {
		@java.lang.Override
		public double value(double d) {
			return org.apache.commons.math.util.FastMath.sqrt(d);
		}
	};

	public static final org.apache.commons.math.analysis.ComposableFunction SINH = new org.apache.commons.math.analysis.ComposableFunction() {
		@java.lang.Override
		public double value(double d) {
			return org.apache.commons.math.util.FastMath.sinh(d);
		}
	};

	public static final org.apache.commons.math.analysis.ComposableFunction EXP = new org.apache.commons.math.analysis.ComposableFunction() {
		@java.lang.Override
		public double value(double d) {
			return org.apache.commons.math.util.FastMath.exp(d);
		}
	};

	public static final org.apache.commons.math.analysis.ComposableFunction EXPM1 = new org.apache.commons.math.analysis.ComposableFunction() {
		@java.lang.Override
		public double value(double d) {
			return org.apache.commons.math.util.FastMath.expm1(d);
		}
	};

	public static final org.apache.commons.math.analysis.ComposableFunction ASIN = new org.apache.commons.math.analysis.ComposableFunction() {
		@java.lang.Override
		public double value(double d) {
			return org.apache.commons.math.util.FastMath.asin(d);
		}
	};

	public static final org.apache.commons.math.analysis.ComposableFunction ATAN = new org.apache.commons.math.analysis.ComposableFunction() {
		@java.lang.Override
		public double value(double d) {
			return org.apache.commons.math.util.FastMath.atan(d);
		}
	};

	public static final org.apache.commons.math.analysis.ComposableFunction TAN = new org.apache.commons.math.analysis.ComposableFunction() {
		@java.lang.Override
		public double value(double d) {
			return org.apache.commons.math.util.FastMath.tan(d);
		}
	};

	public static final org.apache.commons.math.analysis.ComposableFunction TANH = new org.apache.commons.math.analysis.ComposableFunction() {
		@java.lang.Override
		public double value(double d) {
			return org.apache.commons.math.util.FastMath.tanh(d);
		}
	};

	public static final org.apache.commons.math.analysis.ComposableFunction CBRT = new org.apache.commons.math.analysis.ComposableFunction() {
		@java.lang.Override
		public double value(double d) {
			return org.apache.commons.math.util.FastMath.cbrt(d);
		}
	};

	public static final org.apache.commons.math.analysis.ComposableFunction CEIL = new org.apache.commons.math.analysis.ComposableFunction() {
		@java.lang.Override
		public double value(double d) {
			return org.apache.commons.math.util.FastMath.ceil(d);
		}
	};

	public static final org.apache.commons.math.analysis.ComposableFunction FLOOR = new org.apache.commons.math.analysis.ComposableFunction() {
		@java.lang.Override
		public double value(double d) {
			return org.apache.commons.math.util.FastMath.floor(d);
		}
	};

	public static final org.apache.commons.math.analysis.ComposableFunction LOG = new org.apache.commons.math.analysis.ComposableFunction() {
		@java.lang.Override
		public double value(double d) {
			return org.apache.commons.math.util.FastMath.log(d);
		}
	};

	public static final org.apache.commons.math.analysis.ComposableFunction LOG10 = new org.apache.commons.math.analysis.ComposableFunction() {
		@java.lang.Override
		public double value(double d) {
			return org.apache.commons.math.util.FastMath.log10(d);
		}
	};

	public static final org.apache.commons.math.analysis.ComposableFunction LOG1P = new org.apache.commons.math.analysis.ComposableFunction() {
		@java.lang.Override
		public double value(double d) {
			return org.apache.commons.math.util.FastMath.log1p(d);
		}
	};

	public static final org.apache.commons.math.analysis.ComposableFunction COS = new org.apache.commons.math.analysis.ComposableFunction() {
		@java.lang.Override
		public double value(double d) {
			return org.apache.commons.math.util.FastMath.cos(d);
		}
	};

	public static final org.apache.commons.math.analysis.ComposableFunction ACOS = new org.apache.commons.math.analysis.ComposableFunction() {
		@java.lang.Override
		public double value(double d) {
			return org.apache.commons.math.util.FastMath.acos(d);
		}
	};

	public static final org.apache.commons.math.analysis.ComposableFunction COSH = new org.apache.commons.math.analysis.ComposableFunction() {
		@java.lang.Override
		public double value(double d) {
			return org.apache.commons.math.util.FastMath.cosh(d);
		}
	};

	public static final org.apache.commons.math.analysis.ComposableFunction RINT = new org.apache.commons.math.analysis.ComposableFunction() {
		@java.lang.Override
		public double value(double d) {
			return org.apache.commons.math.util.FastMath.rint(d);
		}
	};

	public static final org.apache.commons.math.analysis.ComposableFunction SIGNUM = new org.apache.commons.math.analysis.ComposableFunction() {
		@java.lang.Override
		public double value(double d) {
			return org.apache.commons.math.util.FastMath.signum(d);
		}
	};

	public static final org.apache.commons.math.analysis.ComposableFunction ULP = new org.apache.commons.math.analysis.ComposableFunction() {
		@java.lang.Override
		public double value(double d) {
			return org.apache.commons.math.util.FastMath.ulp(d);
		}
	};

	public org.apache.commons.math.analysis.ComposableFunction of(final org.apache.commons.math.analysis.UnivariateRealFunction f) {
		return new org.apache.commons.math.analysis.ComposableFunction() {
			@java.lang.Override
			public double value(double x) throws org.apache.commons.math.FunctionEvaluationException {
				return org.apache.commons.math.analysis.ComposableFunction.this.value(f.value(x));
			}
		};
	}

	public org.apache.commons.math.analysis.ComposableFunction postCompose(final org.apache.commons.math.analysis.UnivariateRealFunction f) {
		return new org.apache.commons.math.analysis.ComposableFunction() {
			@java.lang.Override
			public double value(double x) throws org.apache.commons.math.FunctionEvaluationException {
				return f.value(org.apache.commons.math.analysis.ComposableFunction.this.value(x));
			}
		};
	}

	public org.apache.commons.math.analysis.ComposableFunction combine(final org.apache.commons.math.analysis.UnivariateRealFunction f, final org.apache.commons.math.analysis.BivariateRealFunction combiner) {
		return new org.apache.commons.math.analysis.ComposableFunction() {
			@java.lang.Override
			public double value(double x) throws org.apache.commons.math.FunctionEvaluationException {
				return combiner.value(org.apache.commons.math.analysis.ComposableFunction.this.value(x), f.value(x));
			}
		};
	}

	public org.apache.commons.math.analysis.ComposableFunction add(final org.apache.commons.math.analysis.UnivariateRealFunction f) {
		return new org.apache.commons.math.analysis.ComposableFunction() {
			@java.lang.Override
			public double value(double x) throws org.apache.commons.math.FunctionEvaluationException {
				return (org.apache.commons.math.analysis.ComposableFunction.this.value(x)) + (f.value(x));
			}
		};
	}

	public org.apache.commons.math.analysis.ComposableFunction add(final double a) {
		return new org.apache.commons.math.analysis.ComposableFunction() {
			@java.lang.Override
			public double value(double x) throws org.apache.commons.math.FunctionEvaluationException {
				return (org.apache.commons.math.analysis.ComposableFunction.this.value(x)) + a;
			}
		};
	}

	public org.apache.commons.math.analysis.ComposableFunction subtract(final org.apache.commons.math.analysis.UnivariateRealFunction f) {
		return new org.apache.commons.math.analysis.ComposableFunction() {
			@java.lang.Override
			public double value(double x) throws org.apache.commons.math.FunctionEvaluationException {
				return (org.apache.commons.math.analysis.ComposableFunction.this.value(x)) - (f.value(x));
			}
		};
	}

	public org.apache.commons.math.analysis.ComposableFunction multiply(final org.apache.commons.math.analysis.UnivariateRealFunction f) {
		return new org.apache.commons.math.analysis.ComposableFunction() {
			@java.lang.Override
			public double value(double x) throws org.apache.commons.math.FunctionEvaluationException {
				return (org.apache.commons.math.analysis.ComposableFunction.this.value(x)) * (f.value(x));
			}
		};
	}

	public org.apache.commons.math.analysis.ComposableFunction multiply(final double scaleFactor) {
		return new org.apache.commons.math.analysis.ComposableFunction() {
			@java.lang.Override
			public double value(double x) throws org.apache.commons.math.FunctionEvaluationException {
				return (org.apache.commons.math.analysis.ComposableFunction.this.value(x)) * scaleFactor;
			}
		};
	}

	public org.apache.commons.math.analysis.ComposableFunction divide(final org.apache.commons.math.analysis.UnivariateRealFunction f) {
		return new org.apache.commons.math.analysis.ComposableFunction() {
			@java.lang.Override
			public double value(double x) throws org.apache.commons.math.FunctionEvaluationException {
				return (org.apache.commons.math.analysis.ComposableFunction.this.value(x)) / (f.value(x));
			}
		};
	}

	public org.apache.commons.math.analysis.MultivariateRealFunction asCollector(final org.apache.commons.math.analysis.BivariateRealFunction combiner, final double initialValue) {
		return new org.apache.commons.math.analysis.MultivariateRealFunction() {
			public double value(double[] point) throws java.lang.IllegalArgumentException, org.apache.commons.math.FunctionEvaluationException {
				double result = initialValue;
				for (final double entry : point) {
					result = combiner.value(result, org.apache.commons.math.analysis.ComposableFunction.this.value(entry));
				}
				return result;
			}
		};
	}

	public org.apache.commons.math.analysis.MultivariateRealFunction asCollector(final org.apache.commons.math.analysis.BivariateRealFunction combiner) {
		return asCollector(combiner, 0.0);
	}

	public org.apache.commons.math.analysis.MultivariateRealFunction asCollector(final double initialValue) {
		return asCollector(org.apache.commons.math.analysis.BinaryFunction.ADD, initialValue);
	}

	public org.apache.commons.math.analysis.MultivariateRealFunction asCollector() {
		return asCollector(org.apache.commons.math.analysis.BinaryFunction.ADD, 0.0);
	}

	public abstract double value(double x) throws org.apache.commons.math.FunctionEvaluationException;
}

