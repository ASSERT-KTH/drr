

package org.apache.commons.math.linear;


public interface RealVector {
	org.apache.commons.math.linear.RealVector mapToSelf(org.apache.commons.math.analysis.UnivariateRealFunction function);

	org.apache.commons.math.linear.RealVector map(org.apache.commons.math.analysis.UnivariateRealFunction function);

	public abstract class Entry {
		private int index;

		public abstract double getValue();

		public abstract void setValue(double value);

		public int getIndex() {
			return index;
		}

		public void setIndex(int index) {
			org.apache.commons.math.linear.RealVector.Entry.this.index = index;
		}
	}

	java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> iterator();

	java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> sparseIterator();

	org.apache.commons.math.linear.RealVector copy();

	org.apache.commons.math.linear.RealVector add(org.apache.commons.math.linear.RealVector v);

	org.apache.commons.math.linear.RealVector add(double[] v);

	org.apache.commons.math.linear.RealVector subtract(org.apache.commons.math.linear.RealVector v);

	org.apache.commons.math.linear.RealVector subtract(double[] v);

	org.apache.commons.math.linear.RealVector mapAdd(double d);

	org.apache.commons.math.linear.RealVector mapAddToSelf(double d);

	org.apache.commons.math.linear.RealVector mapSubtract(double d);

	org.apache.commons.math.linear.RealVector mapSubtractToSelf(double d);

	org.apache.commons.math.linear.RealVector mapMultiply(double d);

	org.apache.commons.math.linear.RealVector mapMultiplyToSelf(double d);

	org.apache.commons.math.linear.RealVector mapDivide(double d);

	org.apache.commons.math.linear.RealVector mapDivideToSelf(double d);

	org.apache.commons.math.linear.RealVector ebeMultiply(org.apache.commons.math.linear.RealVector v);

	org.apache.commons.math.linear.RealVector ebeMultiply(double[] v);

	org.apache.commons.math.linear.RealVector ebeDivide(org.apache.commons.math.linear.RealVector v);

	org.apache.commons.math.linear.RealVector ebeDivide(double[] v);

	double[] getData();

	double dotProduct(org.apache.commons.math.linear.RealVector v);

	double dotProduct(double[] v);

	double getNorm();

	double getL1Norm();

	double getLInfNorm();

	double getDistance(org.apache.commons.math.linear.RealVector v);

	double getDistance(double[] v);

	double getL1Distance(org.apache.commons.math.linear.RealVector v);

	double getL1Distance(double[] v);

	double getLInfDistance(org.apache.commons.math.linear.RealVector v);

	double getLInfDistance(double[] v);

	org.apache.commons.math.linear.RealVector unitVector();

	void unitize();

	org.apache.commons.math.linear.RealVector projection(org.apache.commons.math.linear.RealVector v);

	org.apache.commons.math.linear.RealVector projection(double[] v);

	org.apache.commons.math.linear.RealMatrix outerProduct(org.apache.commons.math.linear.RealVector v);

	org.apache.commons.math.linear.RealMatrix outerProduct(double[] v);

	double getEntry(int index);

	void setEntry(int index, double value);

	int getDimension();

	org.apache.commons.math.linear.RealVector append(org.apache.commons.math.linear.RealVector v);

	org.apache.commons.math.linear.RealVector append(double d);

	org.apache.commons.math.linear.RealVector append(double[] a);

	org.apache.commons.math.linear.RealVector getSubVector(int index, int n);

	void setSubVector(int index, org.apache.commons.math.linear.RealVector v);

	void setSubVector(int index, double[] v);

	void set(double value);

	double[] toArray();

	boolean isNaN();

	boolean isInfinite();
}

