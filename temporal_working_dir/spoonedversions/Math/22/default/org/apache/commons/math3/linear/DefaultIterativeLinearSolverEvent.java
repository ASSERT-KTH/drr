

package org.apache.commons.math3.linear;


public class DefaultIterativeLinearSolverEvent extends org.apache.commons.math3.linear.IterativeLinearSolverEvent {
	private static final long serialVersionUID = 20120129L;

	private final org.apache.commons.math3.linear.RealVector b;

	private final org.apache.commons.math3.linear.RealVector r;

	private final double rnorm;

	private final org.apache.commons.math3.linear.RealVector x;

	public DefaultIterativeLinearSolverEvent(final java.lang.Object source, final int iterations, final org.apache.commons.math3.linear.RealVector x, final org.apache.commons.math3.linear.RealVector b, final org.apache.commons.math3.linear.RealVector r, final double rnorm) {
		super(source, iterations);
		this.x = x;
		this.b = b;
		this.r = r;
		this.rnorm = rnorm;
	}

	public DefaultIterativeLinearSolverEvent(final java.lang.Object source, final int iterations, final org.apache.commons.math3.linear.RealVector x, final org.apache.commons.math3.linear.RealVector b, final double rnorm) {
		super(source, iterations);
		this.x = x;
		this.b = b;
		this.r = null;
		this.rnorm = rnorm;
	}

	@java.lang.Override
	public double getNormOfResidual() {
		return rnorm;
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.RealVector getResidual() {
		if ((r) != null) {
			return r;
		}
		throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.RealVector getRightHandSideVector() {
		return b;
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.RealVector getSolution() {
		return x;
	}

	@java.lang.Override
	public boolean providesResidual() {
		return (r) != null;
	}
}

