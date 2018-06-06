

package org.apache.commons.math.linear;


public class SymmLQ extends org.apache.commons.math.linear.PreconditionedIterativeLinearSolver {
	private class State {
		private final org.apache.commons.math.linear.RealLinearOperator a;

		private final org.apache.commons.math.linear.RealVector b;

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

		private final org.apache.commons.math.linear.InvertibleRealLinearOperator m;

		private double minusEpsZeta;

		private final org.apache.commons.math.linear.RealVector mSolveB;

		private double oldb;

		private org.apache.commons.math.linear.RealVector r1;

		private org.apache.commons.math.linear.RealVector r2;

		private final double shift;

		private double snprod;

		private double tnorm;

		private org.apache.commons.math.linear.RealVector wbar;

		private final org.apache.commons.math.linear.RealVector x;

		private org.apache.commons.math.linear.RealVector y;

		private double ynorm2;

		public State(final org.apache.commons.math.linear.RealLinearOperator a, final org.apache.commons.math.linear.InvertibleRealLinearOperator m, final org.apache.commons.math.linear.RealVector b, final org.apache.commons.math.linear.RealVector x, final boolean goodb, final double shift) {
			this.a = a;
			this.m = m;
			this.b = b;
			this.x = x;
			this.goodb = goodb;
			this.shift = shift;
			this.mSolveB = (m == null) ? b : m.solve(b);
			org.apache.commons.math.linear.SymmLQ.State.this.hasConverged = false;
			init();
		}

		public void refine(final org.apache.commons.math.linear.RealVector xRefined) {
			final int n = org.apache.commons.math.linear.SymmLQ.State.this.x.getDimension();
			if ((lqnorm) < (cgnorm)) {
				if (!(goodb)) {
					xRefined.setSubVector(0, org.apache.commons.math.linear.SymmLQ.State.this.x);
				}else {
					final double step = (bstep) / (beta1);
					for (int i = 0; i < n; i++) {
						final double bi = mSolveB.getEntry(i);
						final double xi = org.apache.commons.math.linear.SymmLQ.State.this.x.getEntry(i);
						xRefined.setEntry(i, (xi + (step * bi)));
					}
				}
			}else {
				final double anorm = org.apache.commons.math.util.FastMath.sqrt(tnorm);
				final double diag = (gbar) == 0.0 ? anorm * (org.apache.commons.math.linear.SymmLQ.MACH_PREC) : gbar;
				final double zbar = (gammaZeta) / diag;
				final double step = ((bstep) + ((snprod) * zbar)) / (beta1);
				if (!(goodb)) {
					for (int i = 0; i < n; i++) {
						final double xi = org.apache.commons.math.linear.SymmLQ.State.this.x.getEntry(i);
						final double wi = wbar.getEntry(i);
						xRefined.setEntry(i, (xi + (zbar * wi)));
					}
				}else {
					for (int i = 0; i < n; i++) {
						final double xi = org.apache.commons.math.linear.SymmLQ.State.this.x.getEntry(i);
						final double wi = wbar.getEntry(i);
						final double bi = mSolveB.getEntry(i);
						xRefined.setEntry(i, ((xi + (zbar * wi)) + (step * bi)));
					}
				}
			}
		}

		private void init() {
			org.apache.commons.math.linear.SymmLQ.State.this.x.set(0.0);
			org.apache.commons.math.linear.SymmLQ.State.this.r1 = org.apache.commons.math.linear.SymmLQ.State.this.b.copy();
			org.apache.commons.math.linear.SymmLQ.State.this.y = ((org.apache.commons.math.linear.SymmLQ.State.this.m) == null) ? org.apache.commons.math.linear.SymmLQ.State.this.b.copy() : org.apache.commons.math.linear.SymmLQ.State.this.m.solve(org.apache.commons.math.linear.SymmLQ.State.this.r1);
			if (((org.apache.commons.math.linear.SymmLQ.State.this.m) != null) && (check)) {
				org.apache.commons.math.linear.SymmLQ.checkSymmetry(org.apache.commons.math.linear.SymmLQ.State.this.m, org.apache.commons.math.linear.SymmLQ.State.this.r1, org.apache.commons.math.linear.SymmLQ.State.this.y, org.apache.commons.math.linear.SymmLQ.State.this.m.solve(org.apache.commons.math.linear.SymmLQ.State.this.y));
			}
			org.apache.commons.math.linear.SymmLQ.State.this.beta1 = org.apache.commons.math.linear.SymmLQ.State.this.r1.dotProduct(org.apache.commons.math.linear.SymmLQ.State.this.y);
			if ((org.apache.commons.math.linear.SymmLQ.State.this.beta1) < 0.0) {
				org.apache.commons.math.linear.SymmLQ.throwNPDLOException(org.apache.commons.math.linear.SymmLQ.State.this.m, org.apache.commons.math.linear.SymmLQ.State.this.y);
			}
			if ((org.apache.commons.math.linear.SymmLQ.State.this.beta1) == 0.0) {
				return ;
			}
			org.apache.commons.math.linear.SymmLQ.State.this.beta1 = org.apache.commons.math.util.FastMath.sqrt(org.apache.commons.math.linear.SymmLQ.State.this.beta1);
			final org.apache.commons.math.linear.RealVector v = org.apache.commons.math.linear.SymmLQ.State.this.y.mapMultiply((1.0 / (org.apache.commons.math.linear.SymmLQ.State.this.beta1)));
			org.apache.commons.math.linear.SymmLQ.State.this.y = org.apache.commons.math.linear.SymmLQ.State.this.a.operate(v);
			if (check) {
				org.apache.commons.math.linear.SymmLQ.checkSymmetry(org.apache.commons.math.linear.SymmLQ.State.this.a, v, org.apache.commons.math.linear.SymmLQ.State.this.y, org.apache.commons.math.linear.SymmLQ.State.this.a.operate(org.apache.commons.math.linear.SymmLQ.State.this.y));
			}
			org.apache.commons.math.linear.SymmLQ.daxpy((-(org.apache.commons.math.linear.SymmLQ.State.this.shift)), v, org.apache.commons.math.linear.SymmLQ.State.this.y);
			final double alpha = v.dotProduct(org.apache.commons.math.linear.SymmLQ.State.this.y);
			org.apache.commons.math.linear.SymmLQ.daxpy(((-alpha) / (org.apache.commons.math.linear.SymmLQ.State.this.beta1)), org.apache.commons.math.linear.SymmLQ.State.this.r1, org.apache.commons.math.linear.SymmLQ.State.this.y);
			final double vty = v.dotProduct(org.apache.commons.math.linear.SymmLQ.State.this.y);
			final double vtv = v.dotProduct(v);
			org.apache.commons.math.linear.SymmLQ.daxpy(((-vty) / vtv), v, org.apache.commons.math.linear.SymmLQ.State.this.y);
			org.apache.commons.math.linear.SymmLQ.State.this.r2 = org.apache.commons.math.linear.SymmLQ.State.this.y.copy();
			if ((org.apache.commons.math.linear.SymmLQ.State.this.m) != null) {
				org.apache.commons.math.linear.SymmLQ.State.this.y = org.apache.commons.math.linear.SymmLQ.State.this.m.solve(org.apache.commons.math.linear.SymmLQ.State.this.r2);
			}
			org.apache.commons.math.linear.SymmLQ.State.this.oldb = org.apache.commons.math.linear.SymmLQ.State.this.beta1;
			org.apache.commons.math.linear.SymmLQ.State.this.beta = org.apache.commons.math.linear.SymmLQ.State.this.r2.dotProduct(org.apache.commons.math.linear.SymmLQ.State.this.y);
			if ((org.apache.commons.math.linear.SymmLQ.State.this.beta) < 0.0) {
				org.apache.commons.math.linear.SymmLQ.throwNPDLOException(org.apache.commons.math.linear.SymmLQ.State.this.m, org.apache.commons.math.linear.SymmLQ.State.this.y);
			}
			org.apache.commons.math.linear.SymmLQ.State.this.beta = org.apache.commons.math.util.FastMath.sqrt(org.apache.commons.math.linear.SymmLQ.State.this.beta);
			org.apache.commons.math.linear.SymmLQ.State.this.cgnorm = org.apache.commons.math.linear.SymmLQ.State.this.beta1;
			org.apache.commons.math.linear.SymmLQ.State.this.gbar = alpha;
			org.apache.commons.math.linear.SymmLQ.State.this.dbar = org.apache.commons.math.linear.SymmLQ.State.this.beta;
			org.apache.commons.math.linear.SymmLQ.State.this.gammaZeta = org.apache.commons.math.linear.SymmLQ.State.this.beta1;
			org.apache.commons.math.linear.SymmLQ.State.this.minusEpsZeta = 0.0;
			org.apache.commons.math.linear.SymmLQ.State.this.bstep = 0.0;
			org.apache.commons.math.linear.SymmLQ.State.this.snprod = 1.0;
			org.apache.commons.math.linear.SymmLQ.State.this.tnorm = (alpha * alpha) + ((org.apache.commons.math.linear.SymmLQ.State.this.beta) * (org.apache.commons.math.linear.SymmLQ.State.this.beta));
			org.apache.commons.math.linear.SymmLQ.State.this.ynorm2 = 0.0;
			org.apache.commons.math.linear.SymmLQ.State.this.gmax = (org.apache.commons.math.util.FastMath.abs(alpha)) + (org.apache.commons.math.linear.SymmLQ.MACH_PREC);
			org.apache.commons.math.linear.SymmLQ.State.this.gmin = org.apache.commons.math.linear.SymmLQ.State.this.gmax;
			if (org.apache.commons.math.linear.SymmLQ.State.this.goodb) {
				org.apache.commons.math.linear.SymmLQ.State.this.wbar = new org.apache.commons.math.linear.ArrayRealVector(org.apache.commons.math.linear.SymmLQ.State.this.a.getRowDimension());
				org.apache.commons.math.linear.SymmLQ.State.this.wbar.set(0.0);
			}else {
				org.apache.commons.math.linear.SymmLQ.State.this.wbar = v;
			}
			updateNorms();
		}

		private void update() {
			final org.apache.commons.math.linear.RealVector v = y.mapMultiply((1.0 / (beta)));
			y = a.operate(v);
			org.apache.commons.math.linear.SymmLQ.daxpbypz((-(shift)), v, ((-(beta)) / (oldb)), r1, y);
			final double alpha = v.dotProduct(y);
			org.apache.commons.math.linear.SymmLQ.daxpy(((-alpha) / (beta)), r2, y);
			r1 = r2;
			r2 = y;
			if ((m) != null) {
				y = m.solve(r2);
			}
			oldb = beta;
			beta = r2.dotProduct(y);
			if ((beta) < 0.0) {
				org.apache.commons.math.linear.SymmLQ.throwNPDLOException(m, y);
			}
			beta = org.apache.commons.math.util.FastMath.sqrt(beta);
			tnorm += ((alpha * alpha) + ((oldb) * (oldb))) + ((beta) * (beta));
			final double gamma = org.apache.commons.math.util.FastMath.sqrt((((gbar) * (gbar)) + ((oldb) * (oldb))));
			final double c = (gbar) / gamma;
			final double s = (oldb) / gamma;
			final double deltak = (c * (dbar)) + (s * alpha);
			gbar = (s * (dbar)) - (c * alpha);
			final double eps = s * (beta);
			dbar = (-c) * (beta);
			final double zeta = (gammaZeta) / gamma;
			final double zetaC = zeta * c;
			final double zetaS = zeta * s;
			final int n = x.getDimension();
			for (int i = 0; i < n; i++) {
				final double xi = x.getEntry(i);
				final double vi = v.getEntry(i);
				final double wi = wbar.getEntry(i);
				x.setEntry(i, ((xi + (wi * zetaC)) + (vi * zetaS)));
				wbar.setEntry(i, ((wi * s) - (vi * c)));
			}
			bstep += ((snprod) * c) * zeta;
			snprod *= s;
			gmax = org.apache.commons.math.util.FastMath.max(gmax, gamma);
			gmin = org.apache.commons.math.util.FastMath.min(gmin, gamma);
			ynorm2 += zeta * zeta;
			gammaZeta = (minusEpsZeta) - (deltak * zeta);
			minusEpsZeta = (-eps) * zeta;
			updateNorms();
		}

		private void updateNorms() {
			final double anorm = org.apache.commons.math.util.FastMath.sqrt(tnorm);
			final double ynorm = org.apache.commons.math.util.FastMath.sqrt(ynorm2);
			final double epsa = anorm * (org.apache.commons.math.linear.SymmLQ.MACH_PREC);
			final double epsx = (anorm * ynorm) * (org.apache.commons.math.linear.SymmLQ.MACH_PREC);
			final double epsr = (anorm * ynorm) * (delta);
			final double diag = (gbar) == 0.0 ? epsa : gbar;
			lqnorm = org.apache.commons.math.util.FastMath.sqrt((((gammaZeta) * (gammaZeta)) + ((minusEpsZeta) * (minusEpsZeta))));
			final double qrnorm = (snprod) * (beta1);
			cgnorm = (qrnorm * (beta)) / (org.apache.commons.math.util.FastMath.abs(diag));
			final double acond;
			if ((lqnorm) <= (cgnorm)) {
				acond = (gmax) / (gmin);
			}else {
				acond = (gmax) / (org.apache.commons.math.util.FastMath.min(gmin, org.apache.commons.math.util.FastMath.abs(diag)));
			}
			if ((acond * (org.apache.commons.math.linear.SymmLQ.MACH_PREC)) >= 0.1) {
				throw new org.apache.commons.math.linear.IllConditionedOperatorException(acond);
			}
			if ((beta1) <= epsx) {
				throw new org.apache.commons.math.linear.SingularOperatorException();
			}
			hasConverged = ((cgnorm) <= epsx) || ((cgnorm) <= epsr);
		}
	}

	private static final double CBRT_MACH_PREC;

	private static final double MACH_PREC;

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

	public SymmLQ(final org.apache.commons.math.util.IterationManager manager, final double delta, final boolean check) {
		super(manager);
		this.delta = delta;
		this.check = check;
	}

	static {
		MACH_PREC = java.lang.Math.ulp(1.0);
		CBRT_MACH_PREC = java.lang.Math.cbrt(org.apache.commons.math.linear.SymmLQ.MACH_PREC);
	}

	private static void checkSymmetry(final org.apache.commons.math.linear.RealLinearOperator l, final org.apache.commons.math.linear.RealVector x, final org.apache.commons.math.linear.RealVector y, final org.apache.commons.math.linear.RealVector z) throws org.apache.commons.math.linear.NonSelfAdjointOperatorException {
		final double s = y.dotProduct(y);
		final double t = x.dotProduct(z);
		final double epsa = (s + (org.apache.commons.math.linear.SymmLQ.MACH_PREC)) * (org.apache.commons.math.linear.SymmLQ.CBRT_MACH_PREC);
		if ((org.apache.commons.math.util.FastMath.abs((s - t))) > epsa) {
			final org.apache.commons.math.linear.NonSelfAdjointOperatorException e;
			e = new org.apache.commons.math.linear.NonSelfAdjointOperatorException();
			final org.apache.commons.math.exception.util.ExceptionContext context = e.getContext();
			context.setValue(org.apache.commons.math.linear.SymmLQ.OPERATOR, l);
			context.setValue(org.apache.commons.math.linear.SymmLQ.VECTOR1, x);
			context.setValue(org.apache.commons.math.linear.SymmLQ.VECTOR2, y);
			context.setValue(org.apache.commons.math.linear.SymmLQ.THRESHOLD, java.lang.Double.valueOf(epsa));
			throw e;
		}
	}

	private static void daxpbypz(final double a, final org.apache.commons.math.linear.RealVector x, final double b, final org.apache.commons.math.linear.RealVector y, final org.apache.commons.math.linear.RealVector z) {
		final int n = z.getDimension();
		for (int i = 0; i < n; i++) {
			final double zi;
			zi = ((a * (x.getEntry(i))) + (b * (y.getEntry(i)))) + (z.getEntry(i));
			z.setEntry(i, zi);
		}
	}

	private static void daxpy(final double a, final org.apache.commons.math.linear.RealVector x, final org.apache.commons.math.linear.RealVector y) {
		final int n = x.getDimension();
		for (int i = 0; i < n; i++) {
			y.setEntry(i, ((a * (x.getEntry(i))) + (y.getEntry(i))));
		}
	}

	private static void throwNPDLOException(final org.apache.commons.math.linear.RealLinearOperator l, final org.apache.commons.math.linear.RealVector v) throws org.apache.commons.math.linear.NonPositiveDefiniteOperatorException {
		final org.apache.commons.math.linear.NonPositiveDefiniteOperatorException e;
		e = new org.apache.commons.math.linear.NonPositiveDefiniteOperatorException();
		final org.apache.commons.math.exception.util.ExceptionContext context = e.getContext();
		context.setValue(org.apache.commons.math.linear.SymmLQ.OPERATOR, l);
		context.setValue(org.apache.commons.math.linear.SymmLQ.VECTOR, v);
		throw e;
	}

	public final boolean getCheck() {
		return check;
	}

	@java.lang.Override
	public org.apache.commons.math.linear.RealVector solve(final org.apache.commons.math.linear.RealLinearOperator a, final org.apache.commons.math.linear.InvertibleRealLinearOperator m, final org.apache.commons.math.linear.RealVector b) throws org.apache.commons.math.exception.DimensionMismatchException, org.apache.commons.math.exception.MaxCountExceededException, org.apache.commons.math.exception.NullArgumentException, org.apache.commons.math.linear.IllConditionedOperatorException, org.apache.commons.math.linear.NonPositiveDefiniteOperatorException, org.apache.commons.math.linear.NonSelfAdjointOperatorException, org.apache.commons.math.linear.NonSquareOperatorException {
		org.apache.commons.math.util.MathUtils.checkNotNull(a);
		final org.apache.commons.math.linear.RealVector x = new org.apache.commons.math.linear.ArrayRealVector(a.getColumnDimension());
		return solveInPlace(a, m, b, x, false, 0.0);
	}

	public org.apache.commons.math.linear.RealVector solve(final org.apache.commons.math.linear.RealLinearOperator a, final org.apache.commons.math.linear.InvertibleRealLinearOperator m, final org.apache.commons.math.linear.RealVector b, final boolean goodb, final double shift) throws org.apache.commons.math.exception.DimensionMismatchException, org.apache.commons.math.exception.MaxCountExceededException, org.apache.commons.math.exception.NullArgumentException, org.apache.commons.math.linear.IllConditionedOperatorException, org.apache.commons.math.linear.NonPositiveDefiniteOperatorException, org.apache.commons.math.linear.NonSelfAdjointOperatorException, org.apache.commons.math.linear.NonSquareOperatorException {
		org.apache.commons.math.util.MathUtils.checkNotNull(a);
		final org.apache.commons.math.linear.RealVector x = new org.apache.commons.math.linear.ArrayRealVector(a.getColumnDimension());
		return solveInPlace(a, m, b, x, goodb, shift);
	}

	@java.lang.Override
	public org.apache.commons.math.linear.RealVector solve(final org.apache.commons.math.linear.RealLinearOperator a, final org.apache.commons.math.linear.InvertibleRealLinearOperator m, final org.apache.commons.math.linear.RealVector b, final org.apache.commons.math.linear.RealVector x) throws org.apache.commons.math.exception.DimensionMismatchException, org.apache.commons.math.exception.MaxCountExceededException, org.apache.commons.math.exception.NullArgumentException, org.apache.commons.math.linear.IllConditionedOperatorException, org.apache.commons.math.linear.NonPositiveDefiniteOperatorException, org.apache.commons.math.linear.NonSelfAdjointOperatorException, org.apache.commons.math.linear.NonSquareOperatorException {
		org.apache.commons.math.util.MathUtils.checkNotNull(x);
		return solveInPlace(a, m, b, x.copy(), false, 0.0);
	}

	@java.lang.Override
	public org.apache.commons.math.linear.RealVector solve(final org.apache.commons.math.linear.RealLinearOperator a, final org.apache.commons.math.linear.RealVector b) throws org.apache.commons.math.exception.DimensionMismatchException, org.apache.commons.math.exception.MaxCountExceededException, org.apache.commons.math.exception.NullArgumentException, org.apache.commons.math.linear.IllConditionedOperatorException, org.apache.commons.math.linear.NonSelfAdjointOperatorException, org.apache.commons.math.linear.NonSquareOperatorException {
		org.apache.commons.math.util.MathUtils.checkNotNull(a);
		final org.apache.commons.math.linear.RealVector x = new org.apache.commons.math.linear.ArrayRealVector(a.getColumnDimension());
		x.set(0.0);
		return solveInPlace(a, null, b, x, false, 0.0);
	}

	public org.apache.commons.math.linear.RealVector solve(final org.apache.commons.math.linear.RealLinearOperator a, final org.apache.commons.math.linear.RealVector b, final boolean goodb, final double shift) throws org.apache.commons.math.exception.DimensionMismatchException, org.apache.commons.math.exception.MaxCountExceededException, org.apache.commons.math.exception.NullArgumentException, org.apache.commons.math.linear.IllConditionedOperatorException, org.apache.commons.math.linear.NonSelfAdjointOperatorException, org.apache.commons.math.linear.NonSquareOperatorException {
		org.apache.commons.math.util.MathUtils.checkNotNull(a);
		final org.apache.commons.math.linear.RealVector x = new org.apache.commons.math.linear.ArrayRealVector(a.getColumnDimension());
		return solveInPlace(a, null, b, x, goodb, shift);
	}

	@java.lang.Override
	public org.apache.commons.math.linear.RealVector solve(final org.apache.commons.math.linear.RealLinearOperator a, final org.apache.commons.math.linear.RealVector b, final org.apache.commons.math.linear.RealVector x) throws org.apache.commons.math.exception.DimensionMismatchException, org.apache.commons.math.exception.MaxCountExceededException, org.apache.commons.math.exception.NullArgumentException, org.apache.commons.math.linear.IllConditionedOperatorException, org.apache.commons.math.linear.NonSelfAdjointOperatorException, org.apache.commons.math.linear.NonSquareOperatorException {
		org.apache.commons.math.util.MathUtils.checkNotNull(x);
		return solveInPlace(a, null, b, x.copy(), false, 0.0);
	}

	@java.lang.Override
	public org.apache.commons.math.linear.RealVector solveInPlace(final org.apache.commons.math.linear.RealLinearOperator a, final org.apache.commons.math.linear.InvertibleRealLinearOperator m, final org.apache.commons.math.linear.RealVector b, final org.apache.commons.math.linear.RealVector x) throws org.apache.commons.math.exception.DimensionMismatchException, org.apache.commons.math.exception.MaxCountExceededException, org.apache.commons.math.exception.NullArgumentException, org.apache.commons.math.linear.IllConditionedOperatorException, org.apache.commons.math.linear.NonPositiveDefiniteOperatorException, org.apache.commons.math.linear.NonSelfAdjointOperatorException, org.apache.commons.math.linear.NonSquareOperatorException {
		return solveInPlace(a, m, b, x, false, 0.0);
	}

	public org.apache.commons.math.linear.RealVector solveInPlace(final org.apache.commons.math.linear.RealLinearOperator a, final org.apache.commons.math.linear.InvertibleRealLinearOperator m, final org.apache.commons.math.linear.RealVector b, final org.apache.commons.math.linear.RealVector x, final boolean goodb, final double shift) throws org.apache.commons.math.exception.DimensionMismatchException, org.apache.commons.math.exception.MaxCountExceededException, org.apache.commons.math.exception.NullArgumentException, org.apache.commons.math.linear.IllConditionedOperatorException, org.apache.commons.math.linear.NonPositiveDefiniteOperatorException, org.apache.commons.math.linear.NonSelfAdjointOperatorException, org.apache.commons.math.linear.NonSquareOperatorException {
		org.apache.commons.math.linear.PreconditionedIterativeLinearSolver.checkParameters(a, m, b, x);
		final org.apache.commons.math.util.IterationManager manager = getIterationManager();
		manager.resetIterationCount();
		manager.incrementIterationCount();
		final org.apache.commons.math.linear.SymmLQ.State state = new org.apache.commons.math.linear.SymmLQ.State(a, m, b, x, goodb, shift);
		final org.apache.commons.math.linear.IterativeLinearSolverEvent event = createEvent(state);
		if ((state.beta1) == 0.0) {
			manager.fireTerminationEvent(event);
			return x;
		}
		final boolean earlyStop;
		earlyStop = ((state.beta) < (org.apache.commons.math.linear.SymmLQ.MACH_PREC)) || (state.hasConverged);
		manager.fireInitializationEvent(event);
		if (!earlyStop) {
			do {
				manager.incrementIterationCount();
				manager.fireIterationStartedEvent(event);
				state.update();
				manager.fireIterationPerformedEvent(event);
			} while (!(state.hasConverged) );
		}
		state.refine(x);
		state.bstep = 0.0;
		state.gammaZeta = 0.0;
		manager.fireTerminationEvent(event);
		return x;
	}

	@java.lang.Override
	public org.apache.commons.math.linear.RealVector solveInPlace(final org.apache.commons.math.linear.RealLinearOperator a, final org.apache.commons.math.linear.RealVector b, final org.apache.commons.math.linear.RealVector x) throws org.apache.commons.math.exception.DimensionMismatchException, org.apache.commons.math.exception.MaxCountExceededException, org.apache.commons.math.exception.NullArgumentException, org.apache.commons.math.linear.IllConditionedOperatorException, org.apache.commons.math.linear.NonSelfAdjointOperatorException, org.apache.commons.math.linear.NonSquareOperatorException {
		return solveInPlace(a, null, b, x, false, 0.0);
	}

	private org.apache.commons.math.linear.IterativeLinearSolverEvent createEvent(final org.apache.commons.math.linear.SymmLQ.State state) {
		final org.apache.commons.math.linear.RealVector bb = org.apache.commons.math.linear.RealVector.unmodifiableRealVector(state.b);
		final org.apache.commons.math.linear.IterativeLinearSolverEvent event;
		event = new org.apache.commons.math.linear.IterativeLinearSolverEvent(org.apache.commons.math.linear.SymmLQ.this) {
			private static final long serialVersionUID = 3656926699603081076L;

			@java.lang.Override
			public org.apache.commons.math.linear.RealVector getRightHandSideVector() {
				return bb;
			}

			@java.lang.Override
			public org.apache.commons.math.linear.RealVector getSolution() {
				final int n = state.x.getDimension();
				final org.apache.commons.math.linear.RealVector x = new org.apache.commons.math.linear.ArrayRealVector(n);
				state.refine(x);
				return x;
			}
		};
		return event;
	}
}

