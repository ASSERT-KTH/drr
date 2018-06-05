

package org.apache.commons.math.util;


public class IterationManager {
	private final org.apache.commons.math.util.Incrementor iterations;

	private final java.util.Collection<org.apache.commons.math.util.IterationListener> listeners;

	public IterationManager(final int maxIterations) {
		this.iterations = new org.apache.commons.math.util.Incrementor();
		org.apache.commons.math.util.IterationManager.this.iterations.setMaximalCount(maxIterations);
		this.listeners = new java.util.concurrent.CopyOnWriteArrayList<org.apache.commons.math.util.IterationListener>();
	}

	public void addIterationListener(final org.apache.commons.math.util.IterationListener listener) {
		listeners.add(listener);
	}

	public void fireInitializationEvent(final org.apache.commons.math.util.IterationEvent e) {
		for (org.apache.commons.math.util.IterationListener l : listeners) {
			l.initializationPerformed(e);
		}
	}

	public void fireIterationPerformedEvent(final org.apache.commons.math.util.IterationEvent e) {
		for (org.apache.commons.math.util.IterationListener l : listeners) {
			l.iterationPerformed(e);
		}
	}

	public void fireIterationStartedEvent(final org.apache.commons.math.util.IterationEvent e) {
		for (org.apache.commons.math.util.IterationListener l : listeners) {
			l.iterationStarted(e);
		}
	}

	public void fireTerminationEvent(final org.apache.commons.math.util.IterationEvent e) {
		for (org.apache.commons.math.util.IterationListener l : listeners) {
			l.terminationPerformed(e);
		}
	}

	public int getIterations() {
		return iterations.getCount();
	}

	public int getMaxIterations() {
		return iterations.getMaximalCount();
	}

	public void incrementIterationCount() throws org.apache.commons.math.exception.MaxCountExceededException {
		iterations.incrementCount();
	}

	public void removeIterationListener(final org.apache.commons.math.util.IterationListener listener) {
		listeners.remove(listener);
	}

	public void resetIterationCount() {
		iterations.resetCount();
	}
}

