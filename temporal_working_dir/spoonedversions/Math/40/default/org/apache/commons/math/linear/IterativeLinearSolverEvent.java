

package org.apache.commons.math.linear;


public abstract class IterativeLinearSolverEvent extends org.apache.commons.math.util.IterationEvent {
	private static final long serialVersionUID = 283291016904748030L;

	public IterativeLinearSolverEvent(final java.lang.Object source) {
		super(source);
	}

	public abstract org.apache.commons.math.linear.RealVector getRightHandSideVector();

	public abstract org.apache.commons.math.linear.RealVector getSolution();
}

