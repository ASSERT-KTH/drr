

package org.apache.commons.math.linear;


public abstract class AbstractRealVector implements org.apache.commons.math.linear.RealVector {
	protected void checkVectorDimensions(org.apache.commons.math.linear.RealVector v) {
		checkVectorDimensions(v.getDimension());
	}

	protected void checkVectorDimensions(int n) {
		int d = getDimension();
		if (d != n) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(d, n);
		}
	}

	protected void checkIndex(final int index) {
		if ((index < 0) || (index >= (getDimension()))) {
			throw new org.apache.commons.math.exception.OutOfRangeException(org.apache.commons.math.exception.util.LocalizedFormats.INDEX, index, 0, ((getDimension()) - 1));
		}
	}

	public void setSubVector(int index, org.apache.commons.math.linear.RealVector v) {
		checkIndex(index);
		checkIndex(((index + (v.getDimension())) - 1));
		setSubVector(index, v.getData());
	}

	public void setSubVector(int index, double[] v) {
		checkIndex(index);
		checkIndex(((index + (v.length)) - 1));
		for (int i = 0; i < (v.length); i++) {
			setEntry((i + index), v[i]);
		}
	}

	public org.apache.commons.math.linear.RealVector add(double[] v) {
		double[] result = v.clone();
		java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> it = sparseIterator();
		org.apache.commons.math.linear.RealVector.Entry e;
		while ((it.hasNext()) && ((e = it.next()) != null)) {
			result[e.getIndex()] += e.getValue();
		} 
		return new org.apache.commons.math.linear.ArrayRealVector(result, false);
	}

	public org.apache.commons.math.linear.RealVector add(org.apache.commons.math.linear.RealVector v) {
		if (v instanceof org.apache.commons.math.linear.ArrayRealVector) {
			double[] values = ((org.apache.commons.math.linear.ArrayRealVector) (v)).getDataRef();
			return add(values);
		}
		org.apache.commons.math.linear.RealVector result = v.copy();
		java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> it = sparseIterator();
		org.apache.commons.math.linear.RealVector.Entry e;
		while ((it.hasNext()) && ((e = it.next()) != null)) {
			final int index = e.getIndex();
			result.setEntry(index, ((e.getValue()) + (result.getEntry(index))));
		} 
		return result;
	}

	public org.apache.commons.math.linear.RealVector subtract(double[] v) {
		double[] result = v.clone();
		java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> it = sparseIterator();
		org.apache.commons.math.linear.RealVector.Entry e;
		while ((it.hasNext()) && ((e = it.next()) != null)) {
			final int index = e.getIndex();
			result[index] = (e.getValue()) - (result[index]);
		} 
		return new org.apache.commons.math.linear.ArrayRealVector(result, false);
	}

	public org.apache.commons.math.linear.RealVector subtract(org.apache.commons.math.linear.RealVector v) {
		if (v instanceof org.apache.commons.math.linear.ArrayRealVector) {
			double[] values = ((org.apache.commons.math.linear.ArrayRealVector) (v)).getDataRef();
			return add(values);
		}
		org.apache.commons.math.linear.RealVector result = v.copy();
		java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> it = sparseIterator();
		org.apache.commons.math.linear.RealVector.Entry e;
		while ((it.hasNext()) && ((e = it.next()) != null)) {
			final int index = e.getIndex();
			v.setEntry(index, ((e.getValue()) - (result.getEntry(index))));
		} 
		return result;
	}

	public org.apache.commons.math.linear.RealVector mapAdd(double d) {
		return copy().mapAddToSelf(d);
	}

	public org.apache.commons.math.linear.RealVector mapAddToSelf(double d) {
		if (d != 0) {
			return mapToSelf(org.apache.commons.math.analysis.FunctionUtils.fix2ndArgument(new org.apache.commons.math.analysis.function.Add(), d));
		}
		return org.apache.commons.math.linear.AbstractRealVector.this;
	}

	public abstract org.apache.commons.math.linear.AbstractRealVector copy();

	public double dotProduct(double[] v) {
		return dotProduct(new org.apache.commons.math.linear.ArrayRealVector(v, false));
	}

	public double dotProduct(org.apache.commons.math.linear.RealVector v) {
		checkVectorDimensions(v);
		double d = 0;
		java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> it = sparseIterator();
		org.apache.commons.math.linear.RealVector.Entry e;
		while ((it.hasNext()) && ((e = it.next()) != null)) {
			d += (e.getValue()) * (v.getEntry(e.getIndex()));
		} 
		return d;
	}

	public org.apache.commons.math.linear.RealVector ebeDivide(double[] v) {
		return ebeDivide(new org.apache.commons.math.linear.ArrayRealVector(v, false));
	}

	public org.apache.commons.math.linear.RealVector ebeMultiply(double[] v) {
		return ebeMultiply(new org.apache.commons.math.linear.ArrayRealVector(v, false));
	}

	public double getDistance(org.apache.commons.math.linear.RealVector v) {
		checkVectorDimensions(v);
		double d = 0;
		java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> it = iterator();
		org.apache.commons.math.linear.RealVector.Entry e;
		while ((it.hasNext()) && ((e = it.next()) != null)) {
			final double diff = (e.getValue()) - (v.getEntry(e.getIndex()));
			d += diff * diff;
		} 
		return org.apache.commons.math.util.FastMath.sqrt(d);
	}

	public double getNorm() {
		double sum = 0;
		java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> it = sparseIterator();
		org.apache.commons.math.linear.RealVector.Entry e;
		while ((it.hasNext()) && ((e = it.next()) != null)) {
			final double value = e.getValue();
			sum += value * value;
		} 
		return org.apache.commons.math.util.FastMath.sqrt(sum);
	}

	public double getL1Norm() {
		double norm = 0;
		java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> it = sparseIterator();
		org.apache.commons.math.linear.RealVector.Entry e;
		while ((it.hasNext()) && ((e = it.next()) != null)) {
			norm += org.apache.commons.math.util.FastMath.abs(e.getValue());
		} 
		return norm;
	}

	public double getLInfNorm() {
		double norm = 0;
		java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> it = sparseIterator();
		org.apache.commons.math.linear.RealVector.Entry e;
		while ((it.hasNext()) && ((e = it.next()) != null)) {
			norm = org.apache.commons.math.util.FastMath.max(norm, org.apache.commons.math.util.FastMath.abs(e.getValue()));
		} 
		return norm;
	}

	public double getDistance(double[] v) {
		return getDistance(new org.apache.commons.math.linear.ArrayRealVector(v, false));
	}

	public double getL1Distance(org.apache.commons.math.linear.RealVector v) {
		checkVectorDimensions(v);
		double d = 0;
		java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> it = iterator();
		org.apache.commons.math.linear.RealVector.Entry e;
		while ((it.hasNext()) && ((e = it.next()) != null)) {
			d += org.apache.commons.math.util.FastMath.abs(((e.getValue()) - (v.getEntry(e.getIndex()))));
		} 
		return d;
	}

	public double getL1Distance(double[] v) {
		checkVectorDimensions(v.length);
		double d = 0;
		java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> it = iterator();
		org.apache.commons.math.linear.RealVector.Entry e;
		while ((it.hasNext()) && ((e = it.next()) != null)) {
			d += org.apache.commons.math.util.FastMath.abs(((e.getValue()) - (v[e.getIndex()])));
		} 
		return d;
	}

	public double getLInfDistance(org.apache.commons.math.linear.RealVector v) {
		checkVectorDimensions(v);
		double d = 0;
		java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> it = iterator();
		org.apache.commons.math.linear.RealVector.Entry e;
		while ((it.hasNext()) && ((e = it.next()) != null)) {
			d = org.apache.commons.math.util.FastMath.max(org.apache.commons.math.util.FastMath.abs(((e.getValue()) - (v.getEntry(e.getIndex())))), d);
		} 
		return d;
	}

	public double getLInfDistance(double[] v) {
		checkVectorDimensions(v.length);
		double d = 0;
		java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> it = iterator();
		org.apache.commons.math.linear.RealVector.Entry e;
		while ((it.hasNext()) && ((e = it.next()) != null)) {
			d = org.apache.commons.math.util.FastMath.max(org.apache.commons.math.util.FastMath.abs(((e.getValue()) - (v[e.getIndex()]))), d);
		} 
		return d;
	}

	public int getMinIndex() {
		int minIndex = -1;
		double minValue = java.lang.Double.POSITIVE_INFINITY;
		java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> iterator = iterator();
		while (iterator.hasNext()) {
			final org.apache.commons.math.linear.RealVector.Entry entry = iterator.next();
			if ((entry.getValue()) <= minValue) {
				minIndex = entry.getIndex();
				minValue = entry.getValue();
			}
		} 
		return minIndex;
	}

	public double getMinValue() {
		final int minIndex = getMinIndex();
		return minIndex < 0 ? java.lang.Double.NaN : getEntry(minIndex);
	}

	public int getMaxIndex() {
		int maxIndex = -1;
		double maxValue = java.lang.Double.NEGATIVE_INFINITY;
		java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> iterator = iterator();
		while (iterator.hasNext()) {
			final org.apache.commons.math.linear.RealVector.Entry entry = iterator.next();
			if ((entry.getValue()) >= maxValue) {
				maxIndex = entry.getIndex();
				maxValue = entry.getValue();
			}
		} 
		return maxIndex;
	}

	public double getMaxValue() {
		final int maxIndex = getMaxIndex();
		return maxIndex < 0 ? java.lang.Double.NaN : getEntry(maxIndex);
	}

	public org.apache.commons.math.linear.RealVector mapMultiply(double d) {
		return copy().mapMultiplyToSelf(d);
	}

	public org.apache.commons.math.linear.RealVector mapMultiplyToSelf(double d) {
		return mapToSelf(org.apache.commons.math.analysis.FunctionUtils.fix2ndArgument(new org.apache.commons.math.analysis.function.Multiply(), d));
	}

	public org.apache.commons.math.linear.RealVector mapSubtract(double d) {
		return copy().mapSubtractToSelf(d);
	}

	public org.apache.commons.math.linear.RealVector mapSubtractToSelf(double d) {
		return mapAddToSelf((-d));
	}

	public org.apache.commons.math.linear.RealVector mapDivide(double d) {
		return copy().mapDivideToSelf(d);
	}

	public org.apache.commons.math.linear.RealVector mapDivideToSelf(double d) {
		return mapToSelf(org.apache.commons.math.analysis.FunctionUtils.fix2ndArgument(new org.apache.commons.math.analysis.function.Divide(), d));
	}

	public org.apache.commons.math.linear.RealVector mapPow(double d) {
		return copy().mapPowToSelf(d);
	}

	public org.apache.commons.math.linear.RealVector mapPowToSelf(double d) {
		return mapToSelf(new org.apache.commons.math.analysis.function.Power(d));
	}

	public org.apache.commons.math.linear.RealMatrix outerProduct(org.apache.commons.math.linear.RealVector v) {
		org.apache.commons.math.linear.RealMatrix product;
		if ((v instanceof org.apache.commons.math.linear.SparseRealVector) || ((org.apache.commons.math.linear.AbstractRealVector.this) instanceof org.apache.commons.math.linear.SparseRealVector)) {
			product = new org.apache.commons.math.linear.OpenMapRealMatrix(org.apache.commons.math.linear.AbstractRealVector.this.getDimension(), v.getDimension());
		}else {
			product = new org.apache.commons.math.linear.Array2DRowRealMatrix(org.apache.commons.math.linear.AbstractRealVector.this.getDimension(), v.getDimension());
		}
		java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> thisIt = sparseIterator();
		org.apache.commons.math.linear.RealVector.Entry thisE = null;
		while ((thisIt.hasNext()) && ((thisE = thisIt.next()) != null)) {
			java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> otherIt = v.sparseIterator();
			org.apache.commons.math.linear.RealVector.Entry otherE = null;
			while ((otherIt.hasNext()) && ((otherE = otherIt.next()) != null)) {
				product.setEntry(thisE.getIndex(), otherE.getIndex(), ((thisE.getValue()) * (otherE.getValue())));
			} 
		} 
		return product;
	}

	public org.apache.commons.math.linear.RealMatrix outerProduct(double[] v) {
		return outerProduct(new org.apache.commons.math.linear.ArrayRealVector(v, false));
	}

	public org.apache.commons.math.linear.RealVector projection(double[] v) {
		return projection(new org.apache.commons.math.linear.ArrayRealVector(v, false));
	}

	public void set(double value) {
		java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> it = iterator();
		org.apache.commons.math.linear.RealVector.Entry e = null;
		while ((it.hasNext()) && ((e = it.next()) != null)) {
			e.setValue(value);
		} 
	}

	public double[] toArray() {
		int dim = getDimension();
		double[] values = new double[dim];
		for (int i = 0; i < dim; i++) {
			values[i] = getEntry(i);
		}
		return values;
	}

	public double[] getData() {
		return toArray();
	}

	public org.apache.commons.math.linear.RealVector unitVector() {
		org.apache.commons.math.linear.RealVector copy = copy();
		copy.unitize();
		return copy;
	}

	public void unitize() {
		mapDivideToSelf(getNorm());
	}

	public java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> sparseIterator() {
		return new org.apache.commons.math.linear.AbstractRealVector.SparseEntryIterator();
	}

	public java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> iterator() {
		final int dim = getDimension();
		return new java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry>() {
			private int i = 0;

			private org.apache.commons.math.linear.AbstractRealVector.EntryImpl e = new org.apache.commons.math.linear.AbstractRealVector.EntryImpl();

			public boolean hasNext() {
				return (i) < dim;
			}

			public org.apache.commons.math.linear.RealVector.Entry next() {
				e.setIndex(((i)++));
				return e;
			}

			public void remove() {
				throw new org.apache.commons.math.exception.MathUnsupportedOperationException();
			}
		};
	}

	public org.apache.commons.math.linear.RealVector map(org.apache.commons.math.analysis.UnivariateRealFunction function) {
		return copy().mapToSelf(function);
	}

	public org.apache.commons.math.linear.RealVector mapToSelf(org.apache.commons.math.analysis.UnivariateRealFunction function) {
		java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> it = (function.value(0)) == 0 ? sparseIterator() : iterator();
		org.apache.commons.math.linear.RealVector.Entry e;
		while ((it.hasNext()) && ((e = it.next()) != null)) {
			e.setValue(function.value(e.getValue()));
		} 
		return org.apache.commons.math.linear.AbstractRealVector.this;
	}

	protected class EntryImpl extends org.apache.commons.math.linear.RealVector.Entry {
		public EntryImpl() {
			setIndex(0);
		}

		@java.lang.Override
		public double getValue() {
			return getEntry(getIndex());
		}

		@java.lang.Override
		public void setValue(double newValue) {
			setEntry(getIndex(), newValue);
		}
	}

	protected class SparseEntryIterator implements java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> {
		private final int dim;

		private org.apache.commons.math.linear.AbstractRealVector.EntryImpl current;

		private org.apache.commons.math.linear.AbstractRealVector.EntryImpl next;

		protected SparseEntryIterator() {
			dim = getDimension();
			current = new org.apache.commons.math.linear.AbstractRealVector.EntryImpl();
			next = new org.apache.commons.math.linear.AbstractRealVector.EntryImpl();
			if ((next.getValue()) == 0) {
				advance(next);
			}
		}

		protected void advance(org.apache.commons.math.linear.AbstractRealVector.EntryImpl e) {
			if (e == null) {
				return ;
			}
			do {
				e.setIndex(((e.getIndex()) + 1));
			} while (((e.getIndex()) < (dim)) && ((e.getValue()) == 0) );
			if ((e.getIndex()) >= (dim)) {
				e.setIndex((-1));
			}
		}

		public boolean hasNext() {
			return (next.getIndex()) >= 0;
		}

		public org.apache.commons.math.linear.RealVector.Entry next() {
			int index = next.getIndex();
			if (index < 0) {
				throw new java.util.NoSuchElementException();
			}
			current.setIndex(index);
			advance(next);
			return current;
		}

		public void remove() {
			throw new org.apache.commons.math.exception.MathUnsupportedOperationException();
		}
	}
}

