

package org.apache.commons.math.linear;


public abstract class IterativeLinearSolverEvent extends org.apache.commons.math.util.IterationEvent {
	private static final long serialVersionUID = 20120129L;

	public IterativeLinearSolverEvent(final java.lang.Object source, final int iterations) {
		super(source, iterations);
	}

	public abstract org.apache.commons.math.linear.RealVector getRightHandSideVector();

	public abstract double getNormOfResidual();

	public org.apache.commons.math.linear.RealVector getResidual() {
		throw new org.apache.commons.math.exception.MathUnsupportedOperationException();
	}

	public abstract org.apache.commons.math.linear.RealVector getSolution();

	public boolean providesResidual() {
		return false;
	}
}

