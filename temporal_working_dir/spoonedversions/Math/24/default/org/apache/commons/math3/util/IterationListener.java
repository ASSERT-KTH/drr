

package org.apache.commons.math3.util;


public interface IterationListener extends java.util.EventListener {
	void initializationPerformed(org.apache.commons.math3.util.IterationEvent e);

	void iterationPerformed(org.apache.commons.math3.util.IterationEvent e);

	void iterationStarted(org.apache.commons.math3.util.IterationEvent e);

	void terminationPerformed(org.apache.commons.math3.util.IterationEvent e);
}

