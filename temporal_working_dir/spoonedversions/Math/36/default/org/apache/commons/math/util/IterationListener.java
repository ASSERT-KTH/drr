

package org.apache.commons.math.util;


public interface IterationListener extends java.util.EventListener {
	void initializationPerformed(org.apache.commons.math.util.IterationEvent e);

	void iterationPerformed(org.apache.commons.math.util.IterationEvent e);

	void iterationStarted(org.apache.commons.math.util.IterationEvent e);

	void terminationPerformed(org.apache.commons.math.util.IterationEvent e);
}

