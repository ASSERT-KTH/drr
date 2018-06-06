

package org.apache.commons.math3.linear;


public interface RealVectorPreservingVisitor {
	void start(int dimension, int start, int end);

	void visit(int index, double value);

	double end();
}

