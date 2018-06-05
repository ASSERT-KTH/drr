

package org.apache.commons.math.linear;


public class ConjugateGradient extends org.apache.commons.math.linear.PreconditionedIterativeLinearSolver {
	public static final java.lang.String OPERATOR = "operator";

	public static final java.lang.String VECTOR = "vector";

	private boolean check;

	private final double delta;

	public ConjugateGradient(final int maxIterations, final double delta, final boolean check) {
		super(maxIterations);
		this.delta = delta;
		org.apache.commons.math.linear.ConjugateGradient.this.check = check;
	}

	public ConjugateGradient(final org.apache.commons.math.util.IterationManager manager, final double delta, final boolean check) {
		super(manager);
		this.delta = delta;
		org.apache.commons.math.linear.ConjugateGradient.this.check = check;
	}

	public final boolean getCheck() {
		return check;
	}

	@java.lang.Override
	public org.apache.commons.math.linear.RealVector solveInPlace(final org.apache.commons.math.linear.RealLinearOperator a, final org.apache.commons.math.linear.RealLinearOperator minv, final org.apache.commons.math.linear.RealVector b, final org.apache.commons.math.linear.RealVector x0) throws org.apache.commons.math.exception.DimensionMismatchException, org.apache.commons.math.exception.MaxCountExceededException, org.apache.commons.math.exception.NullArgumentException, org.apache.commons.math.linear.NonSquareOperatorException {
		org.apache.commons.math.linear.PreconditionedIterativeLinearSolver.checkParameters(a, minv, b, x0);
		final org.apache.commons.math.util.IterationManager manager = getIterationManager();
		manager.resetIterationCount();
		final double rmax = (delta) * (b.getNorm());
		final org.apache.commons.math.linear.RealVector bro = org.apache.commons.math.linear.RealVector.unmodifiableRealVector(b);
		manager.incrementIterationCount();
		final org.apache.commons.math.linear.RealVector x = x0;
		final org.apache.commons.math.linear.RealVector xro = org.apache.commons.math.linear.RealVector.unmodifiableRealVector(x);
		final org.apache.commons.math.linear.RealVector p = x.copy();
		org.apache.commons.math.linear.RealVector q = a.operate(p);
		final org.apache.commons.math.linear.RealVector r = b.combine(1, (-1), q);
		final org.apache.commons.math.linear.RealVector rro = org.apache.commons.math.linear.RealVector.unmodifiableRealVector(r);
		double rnorm = r.getNorm();
		org.apache.commons.math.linear.RealVector z;
		if (minv == null) {
			z = r;
		}else {
			z = null;
		}
		org.apache.commons.math.linear.IterativeLinearSolverEvent evt;
		evt = new org.apache.commons.math.linear.DefaultIterativeLinearSolverEvent(org.apache.commons.math.linear.ConjugateGradient.this, manager.getIterations(), xro, bro, rro, rnorm);
		manager.fireInitializationEvent(evt);
		if (rnorm <= rmax) {
			manager.fireTerminationEvent(evt);
			return x;
		}
		double rhoPrev = 0.0;
		while (true) {
			manager.incrementIterationCount();
			evt = new org.apache.commons.math.linear.DefaultIterativeLinearSolverEvent(org.apache.commons.math.linear.ConjugateGradient.this, manager.getIterations(), xro, bro, rro, rnorm);
			manager.fireIterationStartedEvent(evt);
			if (minv != null) {
				z = minv.operate(r);
			}
			final double rhoNext = r.dotProduct(z);
			if ((check) && (rhoNext <= 0.0)) {
				final org.apache.commons.math.linear.NonPositiveDefiniteOperatorException e;
				e = new org.apache.commons.math.linear.NonPositiveDefiniteOperatorException();
				final org.apache.commons.math.exception.util.ExceptionContext context = e.getContext();
				context.setValue(org.apache.commons.math.linear.ConjugateGradient.OPERATOR, minv);
				context.setValue(org.apache.commons.math.linear.ConjugateGradient.VECTOR, r);
				throw e;
			}
			if ((manager.getIterations()) == 2) {
				p.setSubVector(0, z);
			}else {
				p.combineToSelf((rhoNext / rhoPrev), 1.0, z);
			}
			q = a.operate(p);
			final double pq = p.dotProduct(q);
			if ((check) && (pq <= 0.0)) {
				final org.apache.commons.math.linear.NonPositiveDefiniteOperatorException e;
				e = new org.apache.commons.math.linear.NonPositiveDefiniteOperatorException();
				final org.apache.commons.math.exception.util.ExceptionContext context = e.getContext();
				context.setValue(org.apache.commons.math.linear.ConjugateGradient.OPERATOR, a);
				context.setValue(org.apache.commons.math.linear.ConjugateGradient.VECTOR, p);
				throw e;
			}
			final double alpha = rhoNext / pq;
			x.combineToSelf(1.0, alpha, p);
			r.combineToSelf(1.0, (-alpha), q);
			rhoPrev = rhoNext;
			rnorm = r.getNorm();
			evt = new org.apache.commons.math.linear.DefaultIterativeLinearSolverEvent(org.apache.commons.math.linear.ConjugateGradient.this, manager.getIterations(), xro, bro, rro, rnorm);
			manager.fireIterationPerformedEvent(evt);
			if (rnorm <= rmax) {
				manager.fireTerminationEvent(evt);
				return x;
			}
		} 
	}
}

