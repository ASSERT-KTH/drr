

package org.apache.commons.math.linear;


public class ConjugateGradient extends org.apache.commons.math.linear.PreconditionedIterativeLinearSolver {
	public abstract static class ConjugateGradientEvent extends org.apache.commons.math.linear.IterativeLinearSolverEvent implements org.apache.commons.math.linear.ProvidesResidual {
		private static final long serialVersionUID = 6461730085343318121L;

		public ConjugateGradientEvent(final java.lang.Object source) {
			super(source);
		}
	}

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
	public org.apache.commons.math.linear.RealVector solveInPlace(final org.apache.commons.math.linear.RealLinearOperator a, final org.apache.commons.math.linear.InvertibleRealLinearOperator m, final org.apache.commons.math.linear.RealVector b, final org.apache.commons.math.linear.RealVector x0) throws org.apache.commons.math.exception.DimensionMismatchException, org.apache.commons.math.exception.MaxCountExceededException, org.apache.commons.math.exception.NullArgumentException, org.apache.commons.math.linear.NonSquareOperatorException {
		org.apache.commons.math.linear.PreconditionedIterativeLinearSolver.checkParameters(a, m, b, x0);
		final org.apache.commons.math.util.IterationManager manager = getIterationManager();
		manager.resetIterationCount();
		final double r2max = ((delta) * (delta)) * (b.dotProduct(b));
		manager.incrementIterationCount();
		final org.apache.commons.math.linear.RealVector x = x0;
		final org.apache.commons.math.linear.RealVector p = x.copy();
		org.apache.commons.math.linear.RealVector q = a.operate(p);
		final org.apache.commons.math.linear.RealVector r = b.combine(1, (-1), q);
		double r2 = r.dotProduct(r);
		org.apache.commons.math.linear.RealVector z;
		if (m == null) {
			z = r;
		}else {
			z = null;
		}
		final org.apache.commons.math.linear.IterativeLinearSolverEvent event;
		event = new org.apache.commons.math.linear.ConjugateGradient.ConjugateGradientEvent(org.apache.commons.math.linear.ConjugateGradient.this) {
			public org.apache.commons.math.linear.RealVector getResidual() {
				return org.apache.commons.math.linear.ArrayRealVector.unmodifiableRealVector(r);
			}

			@java.lang.Override
			public org.apache.commons.math.linear.RealVector getRightHandSideVector() {
				return org.apache.commons.math.linear.ArrayRealVector.unmodifiableRealVector(b);
			}

			@java.lang.Override
			public org.apache.commons.math.linear.RealVector getSolution() {
				return org.apache.commons.math.linear.ArrayRealVector.unmodifiableRealVector(x);
			}
		};
		manager.fireInitializationEvent(event);
		if (r2 <= r2max) {
			manager.fireTerminationEvent(event);
			return x;
		}
		double rhoPrev = 0.0;
		while (true) {
			manager.incrementIterationCount();
			manager.fireIterationStartedEvent(event);
			if (m != null) {
				z = m.solve(r);
			}
			final double rhoNext = r.dotProduct(z);
			if ((check) && (rhoNext <= 0.0)) {
				final org.apache.commons.math.linear.NonPositiveDefiniteOperatorException e;
				e = new org.apache.commons.math.linear.NonPositiveDefiniteOperatorException();
				final org.apache.commons.math.exception.util.ExceptionContext context = e.getContext();
				context.setValue(org.apache.commons.math.linear.ConjugateGradient.OPERATOR, m);
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
			r2 = r.dotProduct(r);
			manager.fireIterationPerformedEvent(event);
			if (r2 <= r2max) {
				manager.fireTerminationEvent(event);
				return x;
			}
		} 
	}
}

