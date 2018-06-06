

package org.apache.commons.math3.linear;


public interface RealVectorChangingVisitor {
	void start(int dimension, int start, int end);

	double visit(int index, double value);

	double end();
}

