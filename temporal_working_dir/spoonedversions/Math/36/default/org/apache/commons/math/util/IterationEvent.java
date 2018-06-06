

package org.apache.commons.math.util;


public class IterationEvent extends java.util.EventObject {
	private static final long serialVersionUID = 20120128L;

	private final int iterations;

	public IterationEvent(final java.lang.Object source, final int iterations) {
		super(source);
		this.iterations = iterations;
	}

	public int getIterations() {
		return iterations;
	}
}

