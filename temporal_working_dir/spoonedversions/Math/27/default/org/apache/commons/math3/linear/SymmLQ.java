

package org.apache.commons.math3.linear;


public class SymmLQ extends org.apache.commons.math3.linear.PreconditionedIterativeLinearSolver {
	private static class State {
		static final double CBRT_MACH_PREC;

		static final double MACH_PREC;

		private final org.apache.commons.math3.linear.RealLinearOperator a;

		private final org.apache.commons.math3.linear.RealVector b;

		private final boolean check;

		private final double delta;

		private double beta;

		private double beta1;

		private double bstep;

		private double cgnorm;

		private double dbar;

		private double gammaZeta;

		private double gbar;

		private double gmax;

		private double gmin;

		private final boolean goodb;

		private boolean hasConverged;

		private double lqnorm;

		private final org.apache.commons.math3.linear.RealLinearOperator m;

		private double minusEpsZeta;

		private final org.apache.commons.math3.linear.RealVector mb;

		private double oldb;

		private org.apache.commons.math3.linear.RealVector r1;

		private org.apache.commons.math3.linear.RealVector r2;

		private double rnorm;

		private final double shift;

		private double snprod;

		private double tnorm;

		private org.apache.commons.math3.linear.RealVector wbar;

		private final org.apache.commons.math3.linear.RealVector xL;

		private org.apache.commons.math3.linear.RealVector y;

		private double ynorm2;

		private boolean bIsNull;

		static {
			MACH_PREC = org.apache.commons.math3.util.FastMath.ulp(1.0);
			CBRT_MACH_PREC = org.apache.commons.math3.util.FastMath.cbrt(org.apache.commons.math3.linear.SymmLQ.State.MACH_PREC);
		}

		public State(final org.apache.commons.math3.linear.RealLinearOperator a, final org.apache.commons.math3.linear.RealLinearOperator m, final org.apache.commons.math3.linear.RealVector b, final boolean goodb, final double shift, final double delta, final boolean check) {
			this.a = a;
			this.m = m;
			this.b = b;
			this.xL = new org.apache.commons.math3.linear.ArrayRealVector(b.getDimension());
			this.goodb = goodb;
			this.shift = shift;
			this.mb = (m == null) ? b : m.operate(b);
			org.apache.commons.math3.linear.SymmLQ.State.this.hasConverged = false;
			this.check = check;
			this.delta = delta;
		}

		private static void checkSymmetry(final org.apache.commons.math3.linear.RealLinearOperator l, final org.apache.commons.math3.linear.RealVector x, final org.apache.commons.math3.linear.RealVector y, final org.apache.commons.math3.linear.RealVector z) throws org.apache.commons.math3.linear.NonSelfAdjointOperatorException {
			final double s = y.dotProduct(y);
			final double t = x.dotProduct(z);
			final double epsa = (s + (org.apache.commons.math3.linear.SymmLQ.State.MACH_PREC)) * (org.apache.commons.math3.linear.SymmLQ.State.CBRT_MACH_PREC);
			if ((org.apache.commons.math3.util.FastMath.abs((s - t))) > epsa) {
				final org.apache.commons.math3.linear.NonSelfAdjointOperatorException e;
				e = new org.apache.commons.math3.linear.NonSelfAdjointOperatorException();
				final org.apache.commons.math3.exception.util.ExceptionContext context = e.getContext();
				context.setValue(org.apache.commons.math3.linear.SymmLQ.OPERATOR, l);
				context.setValue(org.apache.commons.math3.linear.SymmLQ.VECTOR1, x);
				context.setValue(org.apache.commons.math3.linear.SymmLQ.VECTOR2, y);
				context.setValue(org.apache.commons.math3.linear.SymmLQ.THRESHOLD, java.lang.Double.valueOf(epsa));
				throw e;
			}
		}

		private static void throwNPDLOException(final org.apache.commons.math3.linear.RealLinearOperator l, final org.apache.commons.math3.linear.RealVector v) throws org.apache.commons.math3.linear.NonPositiveDefiniteOperatorException {
			final org.apache.commons.math3.linear.NonPositiveDefiniteOperatorException e;
			e = new org.apache.commons.math3.linear.NonPositiveDefiniteOperatorException();
			final org.apache.commons.math3.exception.util.ExceptionContext context = e.getContext();
			context.setValue(org.apache.commons.math3.linear.SymmLQ.OPERATOR, l);
			context.setValue(org.apache.commons.math3.linear.SymmLQ.VECTOR, v);
			throw e;
		}

		private static void daxpy(final double a, final org.apache.commons.math3.linear.RealVector x, final org.apache.commons.math3.linear.RealVector y) {
			final int n = x.getDimension();
			for (int i = 0; i < n; i++) {
				y.setEntry(i, ((a * (x.getEntry(i))) + (y.getEntry(i))));
			}
		}

		private static void daxpbypz(final double a, final org.apache.commons.math3.linear.RealVector x, final double b, final org.apache.commons.math3.linear.RealVector y, final org.apache.commons.math3.linear.RealVector z) {
			final int n = z.getDimension();
			for (int i = 0; i < n; i++) {
				final double zi;
				zi = ((a * (x.getEntry(i))) + (b * (y.getEntry(i)))) + (z.getEntry(i));
				z.setEntry(i, zi);
			}
		}

		void refineSolution(final org.apache.commons.math3.linear.RealVector x) {
			final int n = org.apache.commons.math3.linear.SymmLQ.State.this.xL.getDimension();
			if ((lqnorm) < (cgnorm)) {
				if (!(goodb)) {
					x.setSubVector(0, org.apache.commons.math3.linear.SymmLQ.State.this.xL);
				}else {
					final double step = (bstep) / (beta1);
					for (int i = 0; i < n; i++) {
						final double bi = mb.getEntry(i);
						final double xi = org.apache.commons.math3.linear.SymmLQ.State.this.xL.getEntry(i);
						x.setEntry(i, (xi + (step * bi)));
					}
				}
			}else {
				final double anorm = org.apache.commons.math3.util.FastMath.sqrt(tnorm);
				final double diag = (gbar) == 0.0 ? anorm * (org.apache.commons.math3.linear.SymmLQ.State.MACH_PREC) : gbar;
				final double zbar = (gammaZeta) / diag;
				final double step = ((bstep) + ((snprod) * zbar)) / (beta1);
				if (!(goodb)) {
					for (int i = 0; i < n; i++) {
						final double xi = org.apache.commons.math3.linear.SymmLQ.State.this.xL.getEntry(i);
						final double wi = wbar.getEntry(i);
						x.setEntry(i, (xi + (zbar * wi)));
					}
				}else {
					for (int i = 0; i < n; i++) {
						final double xi = org.apache.commons.math3.linear.SymmLQ.State.this.xL.getEntry(i);
						final double wi = wbar.getEntry(i);
						final double bi = mb.getEntry(i);
						x.setEntry(i, ((xi + (zbar * wi)) + (step * bi)));
					}
				}
			}
		}

		void init() {
			org.apache.commons.math3.linear.SymmLQ.State.this.xL.set(0.0);
			org.apache.commons.math3.linear.SymmLQ.State.this.r1 = org.apache.commons.math3.linear.SymmLQ.State.this.b.copy();
			org.apache.commons.math3.linear.SymmLQ.State.this.y = ((org.apache.commons.math3.linear.SymmLQ.State.this.m) == null) ? org.apache.commons.math3.linear.SymmLQ.State.this.b.copy() : org.apache.commons.math3.linear.SymmLQ.State.this.m.operate(org.apache.commons.math3.linear.SymmLQ.State.this.r1);
			if (((org.apache.commons.math3.linear.SymmLQ.State.this.m) != null) && (org.apache.commons.math3.linear.SymmLQ.State.this.check)) {
				org.apache.commons.math3.linear.SymmLQ.State.checkSymmetry(org.apache.commons.math3.linear.SymmLQ.State.this.m, org.apache.commons.math3.linear.SymmLQ.State.this.r1, org.apache.commons.math3.linear.SymmLQ.State.this.y, org.apache.commons.math3.linear.SymmLQ.State.this.m.operate(org.apache.commons.math3.linear.SymmLQ.State.this.y));
			}
			org.apache.commons.math3.linear.SymmLQ.State.this.beta1 = org.apache.commons.math3.linear.SymmLQ.State.this.r1.dotProduct(org.apache.commons.math3.linear.SymmLQ.State.this.y);
			if ((org.apache.commons.math3.linear.SymmLQ.State.this.beta1) < 0.0) {
				org.apache.commons.math3.linear.SymmLQ.State.throwNPDLOException(org.apache.commons.math3.linear.SymmLQ.State.this.m, org.apache.commons.math3.linear.SymmLQ.State.this.y);
			}
			if ((org.apache.commons.math3.linear.SymmLQ.State.this.beta1) == 0.0) {
				org.apache.commons.math3.linear.SymmLQ.State.this.bIsNull = true;
				return ;
			}
			org.apache.commons.math3.linear.SymmLQ.State.this.bIsNull = false;
			org.apache.commons.math3.linear.SymmLQ.State.this.beta1 = org.apache.commons.math3.util.FastMath.sqrt(org.apache.commons.math3.linear.SymmLQ.State.this.beta1);
			final org.apache.commons.math3.linear.RealVector v = org.apache.commons.math3.linear.SymmLQ.State.this.y.mapMultiply((1.0 / (org.apache.commons.math3.linear.SymmLQ.State.this.beta1)));
			org.apache.commons.math3.linear.SymmLQ.State.this.y = org.apache.commons.math3.linear.SymmLQ.State.this.a.operate(v);
			if (org.apache.commons.math3.linear.SymmLQ.State.this.check) {
				org.apache.commons.math3.linear.SymmLQ.State.checkSymmetry(org.apache.commons.math3.linear.SymmLQ.State.this.a, v, org.apache.commons.math3.linear.SymmLQ.State.this.y, org.apache.commons.math3.linear.SymmLQ.State.this.a.operate(org.apache.commons.math3.linear.SymmLQ.State.this.y));
			}
			org.apache.commons.math3.linear.SymmLQ.State.daxpy((-(org.apache.commons.math3.linear.SymmLQ.State.this.shift)), v, org.apache.commons.math3.linear.SymmLQ.State.this.y);
			final double alpha = v.dotProduct(org.apache.commons.math3.linear.SymmLQ.State.this.y);
			org.apache.commons.math3.linear.SymmLQ.State.daxpy(((-alpha) / (org.apache.commons.math3.linear.SymmLQ.State.this.beta1)), org.apache.commons.math3.linear.SymmLQ.State.this.r1, org.apache.commons.math3.linear.SymmLQ.State.this.y);
			final double vty = v.dotProduct(org.apache.commons.math3.linear.SymmLQ.State.this.y);
			final double vtv = v.dotProduct(v);
			org.apache.commons.math3.linear.SymmLQ.State.daxpy(((-vty) / vtv), v, org.apache.commons.math3.linear.SymmLQ.State.this.y);
			org.apache.commons.math3.linear.SymmLQ.State.this.r2 = org.apache.commons.math3.linear.SymmLQ.State.this.y.copy();
			if ((org.apache.commons.math3.linear.SymmLQ.State.this.m) != null) {
				org.apache.commons.math3.linear.SymmLQ.State.this.y = org.apache.commons.math3.linear.SymmLQ.State.this.m.operate(org.apache.commons.math3.linear.SymmLQ.State.this.r2);
			}
			org.apache.commons.math3.linear.SymmLQ.State.this.oldb = org.apache.commons.math3.linear.SymmLQ.State.this.beta1;
			org.apache.commons.math3.linear.SymmLQ.State.this.beta = org.apache.commons.math3.linear.SymmLQ.State.this.r2.dotProduct(org.apache.commons.math3.linear.SymmLQ.State.this.y);
			if ((org.apache.commons.math3.linear.SymmLQ.State.this.beta) < 0.0) {
				org.apache.commons.math3.linear.SymmLQ.State.throwNPDLOException(org.apache.commons.math3.linear.SymmLQ.State.this.m, org.apache.commons.math3.linear.SymmLQ.State.this.y);
			}
			org.apache.commons.math3.linear.SymmLQ.State.this.beta = org.apache.commons.math3.util.FastMath.sqrt(org.apache.commons.math3.linear.SymmLQ.State.this.beta);
			org.apache.commons.math3.linear.SymmLQ.State.this.cgnorm = org.apache.commons.math3.linear.SymmLQ.State.this.beta1;
			org.apache.commons.math3.linear.SymmLQ.State.this.gbar = alpha;
			org.apache.commons.math3.linear.SymmLQ.State.this.dbar = org.apache.commons.math3.linear.SymmLQ.State.this.beta;
			org.apache.commons.math3.linear.SymmLQ.State.this.gammaZeta = org.apache.commons.math3.linear.SymmLQ.State.this.beta1;
			org.apache.commons.math3.linear.SymmLQ.State.this.minusEpsZeta = 0.0;
			org.apache.commons.math3.linear.SymmLQ.State.this.bstep = 0.0;
			org.apache.commons.math3.linear.SymmLQ.State.this.snprod = 1.0;
			org.apache.commons.math3.linear.SymmLQ.State.this.tnorm = (alpha * alpha) + ((org.apache.commons.math3.linear.SymmLQ.State.this.beta) * (org.apache.commons.math3.linear.SymmLQ.State.this.beta));
			org.apache.commons.math3.linear.SymmLQ.State.this.ynorm2 = 0.0;
			org.apache.commons.math3.linear.SymmLQ.State.this.gmax = (org.apache.commons.math3.util.FastMath.abs(alpha)) + (org.apache.commons.math3.linear.SymmLQ.State.MACH_PREC);
			org.apache.commons.math3.linear.SymmLQ.State.this.gmin = org.apache.commons.math3.linear.SymmLQ.State.this.gmax;
			if (org.apache.commons.math3.linear.SymmLQ.State.this.goodb) {
				org.apache.commons.math3.linear.SymmLQ.State.this.wbar = new org.apache.commons.math3.linear.ArrayRealVector(org.apache.commons.math3.linear.SymmLQ.State.this.a.getRowDimension());
				org.apache.commons.math3.linear.SymmLQ.State.this.wbar.set(0.0);
			}else {
				org.apache.commons.math3.linear.SymmLQ.State.this.wbar = v;
			}
			updateNorms();
		}

		void update() {
			final org.apache.commons.math3.linear.RealVector v = y.mapMultiply((1.0 / (beta)));
			y = a.operate(v);
			org.apache.commons.math3.linear.SymmLQ.State.daxpbypz((-(shift)), v, ((-(beta)) / (oldb)), r1, y);
			final double alpha = v.dotProduct(y);
			org.apache.commons.math3.linear.SymmLQ.State.daxpy(((-alpha) / (beta)), r2, y);
			r1 = r2;
			r2 = y;
			if ((m) != null) {
				y = m.operate(r2);
			}
			oldb = beta;
			beta = r2.dotProduct(y);
			if ((beta) < 0.0) {
				org.apache.commons.math3.linear.SymmLQ.State.throwNPDLOException(m, y);
			}
			beta = org.apache.commons.math3.util.FastMath.sqrt(beta);
			tnorm += ((alpha * alpha) + ((oldb) * (oldb))) + ((beta) * (beta));
			final double gamma = org.apache.commons.math3.util.FastMath.sqrt((((gbar) * (gbar)) + ((oldb) * (oldb))));
			final double c = (gbar) / gamma;
			final double s = (oldb) / gamma;
			final double deltak = (c * (dbar)) + (s * alpha);
			gbar = (s * (dbar)) - (c * alpha);
			final double eps = s * (beta);
			dbar = (-c) * (beta);
			final double zeta = (gammaZeta) / gamma;
			final double zetaC = zeta * c;
			final double zetaS = zeta * s;
			final int n = xL.getDimension();
			for (int i = 0; i < n; i++) {
				final double xi = xL.getEntry(i);
				final double vi = v.getEntry(i);
				final double wi = wbar.getEntry(i);
				xL.setEntry(i, ((xi + (wi * zetaC)) + (vi * zetaS)));
				wbar.setEntry(i, ((wi * s) - (vi * c)));
			}
			bstep += ((snprod) * c) * zeta;
			snprod *= s;
			gmax = org.apache.commons.math3.util.FastMath.max(gmax, gamma);
			gmin = org.apache.commons.math3.util.FastMath.min(gmin, gamma);
			ynorm2 += zeta * zeta;
			gammaZeta = (minusEpsZeta) - (deltak * zeta);
			minusEpsZeta = (-eps) * zeta;
			updateNorms();
		}

		private void updateNorms() {
			final double anorm = org.apache.commons.math3.util.FastMath.sqrt(tnorm);
			final double ynorm = org.apache.commons.math3.util.FastMath.sqrt(ynorm2);
			final double epsa = anorm * (org.apache.commons.math3.linear.SymmLQ.State.MACH_PREC);
			final double epsx = (anorm * ynorm) * (org.apache.commons.math3.linear.SymmLQ.State.MACH_PREC);
			final double epsr = (anorm * ynorm) * (delta);
			final double diag = (gbar) == 0.0 ? epsa : gbar;
			lqnorm = org.apache.commons.math3.util.FastMath.sqrt((((gammaZeta) * (gammaZeta)) + ((minusEpsZeta) * (minusEpsZeta))));
			final double qrnorm = (snprod) * (beta1);
			cgnorm = (qrnorm * (beta)) / (org.apache.commons.math3.util.FastMath.abs(diag));
			final double acond;
			if ((lqnorm) <= (cgnorm)) {
				acond = (gmax) / (gmin);
			}else {
				acond = (gmax) / (org.apache.commons.math3.util.FastMath.min(gmin, org.apache.commons.math3.util.FastMath.abs(diag)));
			}
			if ((acond * (org.apache.commons.math3.linear.SymmLQ.State.MACH_PREC)) >= 0.1) {
				throw new org.apache.commons.math3.linear.IllConditionedOperatorException(acond);
			}
			if ((beta1) <= epsx) {
				throw new org.apache.commons.math3.linear.SingularOperatorException();
			}
			rnorm = org.apache.commons.math3.util.FastMath.min(cgnorm, lqnorm);
			hasConverged = ((cgnorm) <= epsx) || ((cgnorm) <= epsr);
		}

		boolean hasConverged() {
			return hasConverged;
		}

		boolean bEqualsNullVector() {
			return bIsNull;
		}

		boolean betaEqualsZero() {
			return (beta) < (org.apache.commons.math3.linear.SymmLQ.State.MACH_PREC);
		}

		double getNormOfResidual() {
			return rnorm;
		}
	}

	private static final java.lang.String OPERATOR = "operator";

	private static final java.lang.String THRESHOLD = "threshold";

	private static final java.lang.String VECTOR = "vector";

	private static final java.lang.String VECTOR1 = "vector1";

	private static final java.lang.String VECTOR2 = "vector2";

	private final boolean check;

	private final double delta;

	public SymmLQ(final int maxIterations, final double delta, final boolean check) {
		super(maxIterations);
		this.delta = delta;
		this.check = check;
	}

	public SymmLQ(final org.apache.commons.math3.util.IterationManager manager, final double delta, final boolean check) {
		super(manager);
		this.delta = delta;
		this.check = check;
	}

	public final boolean getCheck() {
		return check;
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.RealVector solve(final org.apache.commons.math3.linear.RealLinearOperator a, final org.apache.commons.math3.linear.RealLinearOperator m, final org.apache.commons.math3.linear.RealVector b) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.linear.IllConditionedOperatorException, org.apache.commons.math3.linear.NonPositiveDefiniteOperatorException, org.apache.commons.math3.linear.NonSelfAdjointOperatorException, org.apache.commons.math3.linear.NonSquareOperatorException {
		org.apache.commons.math3.util.MathUtils.checkNotNull(a);
		final org.apache.commons.math3.linear.RealVector x = new org.apache.commons.math3.linear.ArrayRealVector(a.getColumnDimension());
		return solveInPlace(a, m, b, x, false, 0.0);
	}

	public org.apache.commons.math3.linear.RealVector solve(final org.apache.commons.math3.linear.RealLinearOperator a, final org.apache.commons.math3.linear.RealLinearOperator m, final org.apache.commons.math3.linear.RealVector b, final boolean goodb, final double shift) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.linear.IllConditionedOperatorException, org.apache.commons.math3.linear.NonPositiveDefiniteOperatorException, org.apache.commons.math3.linear.NonSelfAdjointOperatorException, org.apache.commons.math3.linear.NonSquareOperatorException {
		org.apache.commons.math3.util.MathUtils.checkNotNull(a);
		final org.apache.commons.math3.linear.RealVector x = new org.apache.commons.math3.linear.ArrayRealVector(a.getColumnDimension());
		return solveInPlace(a, m, b, x, goodb, shift);
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.RealVector solve(final org.apache.commons.math3.linear.RealLinearOperator a, final org.apache.commons.math3.linear.RealLinearOperator m, final org.apache.commons.math3.linear.RealVector b, final org.apache.commons.math3.linear.RealVector x) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.linear.IllConditionedOperatorException, org.apache.commons.math3.linear.NonPositiveDefiniteOperatorException, org.apache.commons.math3.linear.NonSelfAdjointOperatorException, org.apache.commons.math3.linear.NonSquareOperatorException {
		org.apache.commons.math3.util.MathUtils.checkNotNull(x);
		return solveInPlace(a, m, b, x.copy(), false, 0.0);
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.RealVector solve(final org.apache.commons.math3.linear.RealLinearOperator a, final org.apache.commons.math3.linear.RealVector b) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.linear.IllConditionedOperatorException, org.apache.commons.math3.linear.NonSelfAdjointOperatorException, org.apache.commons.math3.linear.NonSquareOperatorException {
		org.apache.commons.math3.util.MathUtils.checkNotNull(a);
		final org.apache.commons.math3.linear.RealVector x = new org.apache.commons.math3.linear.ArrayRealVector(a.getColumnDimension());
		x.set(0.0);
		return solveInPlace(a, null, b, x, false, 0.0);
	}

	public org.apache.commons.math3.linear.RealVector solve(final org.apache.commons.math3.linear.RealLinearOperator a, final org.apache.commons.math3.linear.RealVector b, final boolean goodb, final double shift) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.linear.IllConditionedOperatorException, org.apache.commons.math3.linear.NonSelfAdjointOperatorException, org.apache.commons.math3.linear.NonSquareOperatorException {
		org.apache.commons.math3.util.MathUtils.checkNotNull(a);
		final org.apache.commons.math3.linear.RealVector x = new org.apache.commons.math3.linear.ArrayRealVector(a.getColumnDimension());
		return solveInPlace(a, null, b, x, goodb, shift);
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.RealVector solve(final org.apache.commons.math3.linear.RealLinearOperator a, final org.apache.commons.math3.linear.RealVector b, final org.apache.commons.math3.linear.RealVector x) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.linear.IllConditionedOperatorException, org.apache.commons.math3.linear.NonSelfAdjointOperatorException, org.apache.commons.math3.linear.NonSquareOperatorException {
		org.apache.commons.math3.util.MathUtils.checkNotNull(x);
		return solveInPlace(a, null, b, x.copy(), false, 0.0);
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.RealVector solveInPlace(final org.apache.commons.math3.linear.RealLinearOperator a, final org.apache.commons.math3.linear.RealLinearOperator m, final org.apache.commons.math3.linear.RealVector b, final org.apache.commons.math3.linear.RealVector x) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.linear.IllConditionedOperatorException, org.apache.commons.math3.linear.NonPositiveDefiniteOperatorException, org.apache.commons.math3.linear.NonSelfAdjointOperatorException, org.apache.commons.math3.linear.NonSquareOperatorException {
		return solveInPlace(a, m, b, x, false, 0.0);
	}

	public org.apache.commons.math3.linear.RealVector solveInPlace(final org.apache.commons.math3.linear.RealLinearOperator a, final org.apache.commons.math3.linear.RealLinearOperator m, final org.apache.commons.math3.linear.RealVector b, final org.apache.commons.math3.linear.RealVector x, final boolean goodb, final double shift) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.linear.IllConditionedOperatorException, org.apache.commons.math3.linear.NonPositiveDefiniteOperatorException, org.apache.commons.math3.linear.NonSelfAdjointOperatorException, org.apache.commons.math3.linear.NonSquareOperatorException {
		org.apache.commons.math3.linear.PreconditionedIterativeLinearSolver.checkParameters(a, m, b, x);
		final org.apache.commons.math3.util.IterationManager manager = getIterationManager();
		manager.resetIterationCount();
		manager.incrementIterationCount();
		final org.apache.commons.math3.linear.SymmLQ.State state;
		state = new org.apache.commons.math3.linear.SymmLQ.State(a, m, b, goodb, shift, delta, check);
		state.init();
		state.refineSolution(x);
		org.apache.commons.math3.linear.IterativeLinearSolverEvent event;
		event = new org.apache.commons.math3.linear.DefaultIterativeLinearSolverEvent(org.apache.commons.math3.linear.SymmLQ.this, manager.getIterations(), x, b, state.getNormOfResidual());
		if (state.bEqualsNullVector()) {
			manager.fireTerminationEvent(event);
			return x;
		}
		final boolean earlyStop;
		earlyStop = (state.betaEqualsZero()) || (state.hasConverged());
		manager.fireInitializationEvent(event);
		if (!earlyStop) {
			do {
				manager.incrementIterationCount();
				event = new org.apache.commons.math3.linear.DefaultIterativeLinearSolverEvent(org.apache.commons.math3.linear.SymmLQ.this, manager.getIterations(), x, b, state.getNormOfResidual());
				manager.fireIterationStartedEvent(event);
				state.update();
				state.refineSolution(x);
				event = new org.apache.commons.math3.linear.DefaultIterativeLinearSolverEvent(org.apache.commons.math3.linear.SymmLQ.this, manager.getIterations(), x, b, state.getNormOfResidual());
				manager.fireIterationPerformedEvent(event);
			} while (!(state.hasConverged()) );
		}
		event = new org.apache.commons.math3.linear.DefaultIterativeLinearSolverEvent(org.apache.commons.math3.linear.SymmLQ.this, manager.getIterations(), x, b, state.getNormOfResidual());
		manager.fireTerminationEvent(event);
		return x;
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.RealVector solveInPlace(final org.apache.commons.math3.linear.RealLinearOperator a, final org.apache.commons.math3.linear.RealVector b, final org.apache.commons.math3.linear.RealVector x) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.linear.IllConditionedOperatorException, org.apache.commons.math3.linear.NonSelfAdjointOperatorException, org.apache.commons.math3.linear.NonSquareOperatorException {
		return solveInPlace(a, null, b, x, false, 0.0);
	}
}

