

package org.apache.commons.math3.util;


public interface DoubleArray {
	int getNumElements();

	double getElement(int index);

	void setElement(int index, double value);

	void addElement(double value);

	void addElements(double[] values);

	double addElementRolling(double value);

	double[] getElements();

	void clear();
}

