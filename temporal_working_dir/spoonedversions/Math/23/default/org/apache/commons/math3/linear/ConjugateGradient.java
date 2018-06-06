

package org.apache.commons.math3.linear;


public class ConjugateGradient extends org.apache.commons.math3.linear.PreconditionedIterativeLinearSolver {
	public static final java.lang.String OPERATOR = "operator";

	public static final java.lang.String VECTOR = "vector";

	private boolean check;

	private final double delta;

	public ConjugateGradient(final int maxIterations, final double delta, final boolean check) {
		super(maxIterations);
		this.delta = delta;
		org.apache.commons.math3.linear.ConjugateGradient.this.check = check;
	}

	public ConjugateGradient(final org.apache.commons.math3.util.IterationManager manager, final double delta, final boolean check) throws org.apache.commons.math3.exception.NullArgumentException {
		super(manager);
		this.delta = delta;
		org.apache.commons.math3.linear.ConjugateGradient.this.check = check;
	}

	public final boolean getCheck() {
		return check;
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.RealVector solveInPlace(final org.apache.commons.math3.linear.RealLinearOperator a, final org.apache.commons.math3.linear.RealLinearOperator m, final org.apache.commons.math3.linear.RealVector b, final org.apache.commons.math3.linear.RealVector x0) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException, org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.linear.NonPositiveDefiniteOperatorException, org.apache.commons.math3.linear.NonSquareOperatorException {
		org.apache.commons.math3.linear.PreconditionedIterativeLinearSolver.checkParameters(a, m, b, x0);
		final org.apache.commons.math3.util.IterationManager manager = getIterationManager();
		manager.resetIterationCount();
		final double rmax = (delta) * (b.getNorm());
		final org.apache.commons.math3.linear.RealVector bro = org.apache.commons.math3.linear.RealVector.unmodifiableRealVector(b);
		manager.incrementIterationCount();
		final org.apache.commons.math3.linear.RealVector x = x0;
		final org.apache.commons.math3.linear.RealVector xro = org.apache.commons.math3.linear.RealVector.unmodifiableRealVector(x);
		final org.apache.commons.math3.linear.RealVector p = x.copy();
		org.apache.commons.math3.linear.RealVector q = a.operate(p);
		final org.apache.commons.math3.linear.RealVector r = b.combine(1, (-1), q);
		final org.apache.commons.math3.linear.RealVector rro = org.apache.commons.math3.linear.RealVector.unmodifiableRealVector(r);
		double rnorm = r.getNorm();
		org.apache.commons.math3.linear.RealVector z;
		if (m == null) {
			z = r;
		}else {
			z = null;
		}
		org.apache.commons.math3.linear.IterativeLinearSolverEvent evt;
		evt = new org.apache.commons.math3.linear.DefaultIterativeLinearSolverEvent(org.apache.commons.math3.linear.ConjugateGradient.this, manager.getIterations(), xro, bro, rro, rnorm);
		manager.fireInitializationEvent(evt);
		if (rnorm <= rmax) {
			manager.fireTerminationEvent(evt);
			return x;
		}
		double rhoPrev = 0.0;
		while (true) {
			manager.incrementIterationCount();
			evt = new org.apache.commons.math3.linear.DefaultIterativeLinearSolverEvent(org.apache.commons.math3.linear.ConjugateGradient.this, manager.getIterations(), xro, bro, rro, rnorm);
			manager.fireIterationStartedEvent(evt);
			if (m != null) {
				z = m.operate(r);
			}
			final double rhoNext = r.dotProduct(z);
			if ((check) && (rhoNext <= 0.0)) {
				final org.apache.commons.math3.linear.NonPositiveDefiniteOperatorException e;
				e = new org.apache.commons.math3.linear.NonPositiveDefiniteOperatorException();
				final org.apache.commons.math3.exception.util.ExceptionContext context = e.getContext();
				context.setValue(org.apache.commons.math3.linear.ConjugateGradient.OPERATOR, m);
				context.setValue(org.apache.commons.math3.linear.ConjugateGradient.VECTOR, r);
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
				final org.apache.commons.math3.linear.NonPositiveDefiniteOperatorException e;
				e = new org.apache.commons.math3.linear.NonPositiveDefiniteOperatorException();
				final org.apache.commons.math3.exception.util.ExceptionContext context = e.getContext();
				context.setValue(org.apache.commons.math3.linear.ConjugateGradient.OPERATOR, a);
				context.setValue(org.apache.commons.math3.linear.ConjugateGradient.VECTOR, p);
				throw e;
			}
			final double alpha = rhoNext / pq;
			x.combineToSelf(1.0, alpha, p);
			r.combineToSelf(1.0, (-alpha), q);
			rhoPrev = rhoNext;
			rnorm = r.getNorm();
			evt = new org.apache.commons.math3.linear.DefaultIterativeLinearSolverEvent(org.apache.commons.math3.linear.ConjugateGradient.this, manager.getIterations(), xro, bro, rro, rnorm);
			manager.fireIterationPerformedEvent(evt);
			if (rnorm <= rmax) {
				manager.fireTerminationEvent(evt);
				return x;
			}
		} 
	}
}

