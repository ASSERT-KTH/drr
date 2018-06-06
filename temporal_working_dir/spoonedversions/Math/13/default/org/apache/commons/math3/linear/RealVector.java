

package org.apache.commons.math3.linear;


public abstract class RealVector {
	public abstract int getDimension();

	public abstract double getEntry(int index) throws org.apache.commons.math3.exception.OutOfRangeException;

	public abstract void setEntry(int index, double value) throws org.apache.commons.math3.exception.OutOfRangeException;

	public void addToEntry(int index, double increment) throws org.apache.commons.math3.exception.OutOfRangeException {
		setEntry(index, ((getEntry(index)) + increment));
	}

	public abstract org.apache.commons.math3.linear.RealVector append(org.apache.commons.math3.linear.RealVector v);

	public abstract org.apache.commons.math3.linear.RealVector append(double d);

	public abstract org.apache.commons.math3.linear.RealVector getSubVector(int index, int n) throws org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.OutOfRangeException;

	public abstract void setSubVector(int index, org.apache.commons.math3.linear.RealVector v) throws org.apache.commons.math3.exception.OutOfRangeException;

	public abstract boolean isNaN();

	public abstract boolean isInfinite();

	protected void checkVectorDimensions(org.apache.commons.math3.linear.RealVector v) throws org.apache.commons.math3.exception.DimensionMismatchException {
		checkVectorDimensions(v.getDimension());
	}

	protected void checkVectorDimensions(int n) throws org.apache.commons.math3.exception.DimensionMismatchException {
		int d = getDimension();
		if (d != n) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(d, n);
		}
	}

	protected void checkIndex(final int index) throws org.apache.commons.math3.exception.OutOfRangeException {
		if ((index < 0) || (index >= (getDimension()))) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(org.apache.commons.math3.exception.util.LocalizedFormats.INDEX, index, 0, ((getDimension()) - 1));
		}
	}

	protected void checkIndices(final int start, final int end) throws org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException {
		final int dim = getDimension();
		if ((start < 0) || (start >= dim)) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(org.apache.commons.math3.exception.util.LocalizedFormats.INDEX, start, 0, (dim - 1));
		}
		if ((end < 0) || (end >= dim)) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(org.apache.commons.math3.exception.util.LocalizedFormats.INDEX, end, 0, (dim - 1));
		}
		if (end < start) {
			throw new org.apache.commons.math3.exception.NumberIsTooSmallException(org.apache.commons.math3.exception.util.LocalizedFormats.INITIAL_ROW_AFTER_FINAL_ROW, end, start, false);
		}
	}

	public org.apache.commons.math3.linear.RealVector add(org.apache.commons.math3.linear.RealVector v) throws org.apache.commons.math3.exception.DimensionMismatchException {
		checkVectorDimensions(v);
		org.apache.commons.math3.linear.RealVector result = v.copy();
		java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> it = iterator();
		while (it.hasNext()) {
			final org.apache.commons.math3.linear.RealVector.Entry e = it.next();
			final int index = e.getIndex();
			result.setEntry(index, ((e.getValue()) + (result.getEntry(index))));
		} 
		return result;
	}

	public org.apache.commons.math3.linear.RealVector subtract(org.apache.commons.math3.linear.RealVector v) throws org.apache.commons.math3.exception.DimensionMismatchException {
		checkVectorDimensions(v);
		org.apache.commons.math3.linear.RealVector result = v.mapMultiply((-1.0));
		java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> it = iterator();
		while (it.hasNext()) {
			final org.apache.commons.math3.linear.RealVector.Entry e = it.next();
			final int index = e.getIndex();
			result.setEntry(index, ((e.getValue()) + (result.getEntry(index))));
		} 
		return result;
	}

	public org.apache.commons.math3.linear.RealVector mapAdd(double d) {
		return copy().mapAddToSelf(d);
	}

	public org.apache.commons.math3.linear.RealVector mapAddToSelf(double d) {
		if (d != 0) {
			return mapToSelf(org.apache.commons.math3.analysis.FunctionUtils.fix2ndArgument(new org.apache.commons.math3.analysis.function.Add(), d));
		}
		return org.apache.commons.math3.linear.RealVector.this;
	}

	public abstract org.apache.commons.math3.linear.RealVector copy();

	public double dotProduct(org.apache.commons.math3.linear.RealVector v) throws org.apache.commons.math3.exception.DimensionMismatchException {
		checkVectorDimensions(v);
		double d = 0;
		final int n = getDimension();
		for (int i = 0; i < n; i++) {
			d += (getEntry(i)) * (v.getEntry(i));
		}
		return d;
	}

	public double cosine(org.apache.commons.math3.linear.RealVector v) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MathArithmeticException {
		final double norm = getNorm();
		final double vNorm = v.getNorm();
		if ((norm == 0) || (vNorm == 0)) {
			throw new org.apache.commons.math3.exception.MathArithmeticException(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM);
		}
		return (dotProduct(v)) / (norm * vNorm);
	}

	@java.lang.Deprecated
	public abstract org.apache.commons.math3.linear.RealVector ebeDivide(org.apache.commons.math3.linear.RealVector v) throws org.apache.commons.math3.exception.DimensionMismatchException;

	@java.lang.Deprecated
	public abstract org.apache.commons.math3.linear.RealVector ebeMultiply(org.apache.commons.math3.linear.RealVector v) throws org.apache.commons.math3.exception.DimensionMismatchException;

	public double getDistance(org.apache.commons.math3.linear.RealVector v) throws org.apache.commons.math3.exception.DimensionMismatchException {
		checkVectorDimensions(v);
		double d = 0;
		java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> it = iterator();
		while (it.hasNext()) {
			final org.apache.commons.math3.linear.RealVector.Entry e = it.next();
			final double diff = (e.getValue()) - (v.getEntry(e.getIndex()));
			d += diff * diff;
		} 
		return org.apache.commons.math3.util.FastMath.sqrt(d);
	}

	public double getNorm() {
		double sum = 0;
		java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> it = iterator();
		while (it.hasNext()) {
			final org.apache.commons.math3.linear.RealVector.Entry e = it.next();
			final double value = e.getValue();
			sum += value * value;
		} 
		return org.apache.commons.math3.util.FastMath.sqrt(sum);
	}

	public double getL1Norm() {
		double norm = 0;
		java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> it = iterator();
		while (it.hasNext()) {
			final org.apache.commons.math3.linear.RealVector.Entry e = it.next();
			norm += org.apache.commons.math3.util.FastMath.abs(e.getValue());
		} 
		return norm;
	}

	public double getLInfNorm() {
		double norm = 0;
		java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> it = iterator();
		while (it.hasNext()) {
			final org.apache.commons.math3.linear.RealVector.Entry e = it.next();
			norm = org.apache.commons.math3.util.FastMath.max(norm, org.apache.commons.math3.util.FastMath.abs(e.getValue()));
		} 
		return norm;
	}

	public double getL1Distance(org.apache.commons.math3.linear.RealVector v) throws org.apache.commons.math3.exception.DimensionMismatchException {
		checkVectorDimensions(v);
		double d = 0;
		java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> it = iterator();
		while (it.hasNext()) {
			final org.apache.commons.math3.linear.RealVector.Entry e = it.next();
			d += org.apache.commons.math3.util.FastMath.abs(((e.getValue()) - (v.getEntry(e.getIndex()))));
		} 
		return d;
	}

	public double getLInfDistance(org.apache.commons.math3.linear.RealVector v) throws org.apache.commons.math3.exception.DimensionMismatchException {
		checkVectorDimensions(v);
		double d = 0;
		java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> it = iterator();
		while (it.hasNext()) {
			final org.apache.commons.math3.linear.RealVector.Entry e = it.next();
			d = org.apache.commons.math3.util.FastMath.max(org.apache.commons.math3.util.FastMath.abs(((e.getValue()) - (v.getEntry(e.getIndex())))), d);
		} 
		return d;
	}

	public int getMinIndex() {
		int minIndex = -1;
		double minValue = java.lang.Double.POSITIVE_INFINITY;
		java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> iterator = iterator();
		while (iterator.hasNext()) {
			final org.apache.commons.math3.linear.RealVector.Entry entry = iterator.next();
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
		java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> iterator = iterator();
		while (iterator.hasNext()) {
			final org.apache.commons.math3.linear.RealVector.Entry entry = iterator.next();
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

	public org.apache.commons.math3.linear.RealVector mapMultiply(double d) {
		return copy().mapMultiplyToSelf(d);
	}

	public org.apache.commons.math3.linear.RealVector mapMultiplyToSelf(double d) {
		return mapToSelf(org.apache.commons.math3.analysis.FunctionUtils.fix2ndArgument(new org.apache.commons.math3.analysis.function.Multiply(), d));
	}

	public org.apache.commons.math3.linear.RealVector mapSubtract(double d) {
		return copy().mapSubtractToSelf(d);
	}

	public org.apache.commons.math3.linear.RealVector mapSubtractToSelf(double d) {
		return mapAddToSelf((-d));
	}

	public org.apache.commons.math3.linear.RealVector mapDivide(double d) {
		return copy().mapDivideToSelf(d);
	}

	public org.apache.commons.math3.linear.RealVector mapDivideToSelf(double d) {
		return mapToSelf(org.apache.commons.math3.analysis.FunctionUtils.fix2ndArgument(new org.apache.commons.math3.analysis.function.Divide(), d));
	}

	public org.apache.commons.math3.linear.RealMatrix outerProduct(org.apache.commons.math3.linear.RealVector v) {
		final int m = org.apache.commons.math3.linear.RealVector.this.getDimension();
		final int n = v.getDimension();
		final org.apache.commons.math3.linear.RealMatrix product;
		if ((v instanceof org.apache.commons.math3.linear.SparseRealVector) || ((org.apache.commons.math3.linear.RealVector.this) instanceof org.apache.commons.math3.linear.SparseRealVector)) {
			product = new org.apache.commons.math3.linear.OpenMapRealMatrix(m, n);
		}else {
			product = new org.apache.commons.math3.linear.Array2DRowRealMatrix(m, n);
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				product.setEntry(i, j, ((org.apache.commons.math3.linear.RealVector.this.getEntry(i)) * (v.getEntry(j))));
			}
		}
		return product;
	}

	public org.apache.commons.math3.linear.RealVector projection(final org.apache.commons.math3.linear.RealVector v) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MathArithmeticException {
		final double norm2 = v.dotProduct(v);
		if (norm2 == 0.0) {
			throw new org.apache.commons.math3.exception.MathArithmeticException(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM);
		}
		return v.mapMultiply(((dotProduct(v)) / (v.dotProduct(v))));
	}

	public void set(double value) {
		java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> it = iterator();
		while (it.hasNext()) {
			final org.apache.commons.math3.linear.RealVector.Entry e = it.next();
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

	public org.apache.commons.math3.linear.RealVector unitVector() throws org.apache.commons.math3.exception.MathArithmeticException {
		final double norm = getNorm();
		if (norm == 0) {
			throw new org.apache.commons.math3.exception.MathArithmeticException(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM);
		}
		return mapDivide(norm);
	}

	public void unitize() throws org.apache.commons.math3.exception.MathArithmeticException {
		final double norm = getNorm();
		if (norm == 0) {
			throw new org.apache.commons.math3.exception.MathArithmeticException(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM);
		}
		mapDivideToSelf(getNorm());
	}

	@java.lang.Deprecated
	public java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> sparseIterator() {
		return new org.apache.commons.math3.linear.RealVector.SparseEntryIterator();
	}

	public java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> iterator() {
		final int dim = getDimension();
		return new java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry>() {
			private int i = 0;

			private org.apache.commons.math3.linear.RealVector.Entry e = new org.apache.commons.math3.linear.RealVector.Entry();

			public boolean hasNext() {
				return (i) < dim;
			}

			public org.apache.commons.math3.linear.RealVector.Entry next() {
				if ((i) < dim) {
					e.setIndex(((i)++));
					return e;
				}else {
					throw new java.util.NoSuchElementException();
				}
			}

			public void remove() throws org.apache.commons.math3.exception.MathUnsupportedOperationException {
				throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
			}
		};
	}

	public org.apache.commons.math3.linear.RealVector map(org.apache.commons.math3.analysis.UnivariateFunction function) {
		return copy().mapToSelf(function);
	}

	public org.apache.commons.math3.linear.RealVector mapToSelf(org.apache.commons.math3.analysis.UnivariateFunction function) {
		java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> it = iterator();
		while (it.hasNext()) {
			final org.apache.commons.math3.linear.RealVector.Entry e = it.next();
			e.setValue(function.value(e.getValue()));
		} 
		return org.apache.commons.math3.linear.RealVector.this;
	}

	public org.apache.commons.math3.linear.RealVector combine(double a, double b, org.apache.commons.math3.linear.RealVector y) throws org.apache.commons.math3.exception.DimensionMismatchException {
		return copy().combineToSelf(a, b, y);
	}

	public org.apache.commons.math3.linear.RealVector combineToSelf(double a, double b, org.apache.commons.math3.linear.RealVector y) throws org.apache.commons.math3.exception.DimensionMismatchException {
		checkVectorDimensions(y);
		for (int i = 0; i < (getDimension()); i++) {
			final double xi = getEntry(i);
			final double yi = y.getEntry(i);
			setEntry(i, ((a * xi) + (b * yi)));
		}
		return org.apache.commons.math3.linear.RealVector.this;
	}

	public double walkInDefaultOrder(final org.apache.commons.math3.linear.RealVectorPreservingVisitor visitor) {
		final int dim = getDimension();
		visitor.start(dim, 0, (dim - 1));
		for (int i = 0; i < dim; i++) {
			visitor.visit(i, getEntry(i));
		}
		return visitor.end();
	}

	public double walkInDefaultOrder(final org.apache.commons.math3.linear.RealVectorPreservingVisitor visitor, final int start, final int end) throws org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException {
		checkIndices(start, end);
		visitor.start(getDimension(), start, end);
		for (int i = start; i <= end; i++) {
			visitor.visit(i, getEntry(i));
		}
		return visitor.end();
	}

	public double walkInOptimizedOrder(final org.apache.commons.math3.linear.RealVectorPreservingVisitor visitor) {
		return walkInDefaultOrder(visitor);
	}

	public double walkInOptimizedOrder(final org.apache.commons.math3.linear.RealVectorPreservingVisitor visitor, final int start, final int end) throws org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException {
		return walkInDefaultOrder(visitor, start, end);
	}

	public double walkInDefaultOrder(final org.apache.commons.math3.linear.RealVectorChangingVisitor visitor) {
		final int dim = getDimension();
		visitor.start(dim, 0, (dim - 1));
		for (int i = 0; i < dim; i++) {
			setEntry(i, visitor.visit(i, getEntry(i)));
		}
		return visitor.end();
	}

	public double walkInDefaultOrder(final org.apache.commons.math3.linear.RealVectorChangingVisitor visitor, final int start, final int end) throws org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException {
		checkIndices(start, end);
		visitor.start(getDimension(), start, end);
		for (int i = start; i <= end; i++) {
			setEntry(i, visitor.visit(i, getEntry(i)));
		}
		return visitor.end();
	}

	public double walkInOptimizedOrder(final org.apache.commons.math3.linear.RealVectorChangingVisitor visitor) {
		return walkInDefaultOrder(visitor);
	}

	public double walkInOptimizedOrder(final org.apache.commons.math3.linear.RealVectorChangingVisitor visitor, final int start, final int end) throws org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException {
		return walkInDefaultOrder(visitor, start, end);
	}

	protected class Entry {
		private int index;

		public Entry() {
			setIndex(0);
		}

		public double getValue() {
			return getEntry(getIndex());
		}

		public void setValue(double value) {
			setEntry(getIndex(), value);
		}

		public int getIndex() {
			return index;
		}

		public void setIndex(int index) {
			org.apache.commons.math3.linear.RealVector.Entry.this.index = index;
		}
	}

	@java.lang.Override
	public boolean equals(java.lang.Object other) throws org.apache.commons.math3.exception.MathUnsupportedOperationException {
		throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
	}

	@java.lang.Override
	public int hashCode() throws org.apache.commons.math3.exception.MathUnsupportedOperationException {
		throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
	}

	@java.lang.Deprecated
	protected class SparseEntryIterator implements java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> {
		private final int dim;

		private org.apache.commons.math3.linear.RealVector.Entry current;

		private org.apache.commons.math3.linear.RealVector.Entry next;

		protected SparseEntryIterator() {
			dim = getDimension();
			current = new org.apache.commons.math3.linear.RealVector.Entry();
			next = new org.apache.commons.math3.linear.RealVector.Entry();
			if ((next.getValue()) == 0) {
				advance(next);
			}
		}

		protected void advance(org.apache.commons.math3.linear.RealVector.Entry e) {
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

		public org.apache.commons.math3.linear.RealVector.Entry next() {
			int index = next.getIndex();
			if (index < 0) {
				throw new java.util.NoSuchElementException();
			}
			current.setIndex(index);
			advance(next);
			return current;
		}

		public void remove() throws org.apache.commons.math3.exception.MathUnsupportedOperationException {
			throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
		}
	}

	public static org.apache.commons.math3.linear.RealVector unmodifiableRealVector(final org.apache.commons.math3.linear.RealVector v) {
		return new org.apache.commons.math3.linear.RealVector() {
			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector mapToSelf(org.apache.commons.math3.analysis.UnivariateFunction function) throws org.apache.commons.math3.exception.MathUnsupportedOperationException {
				throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector map(org.apache.commons.math3.analysis.UnivariateFunction function) {
				return v.map(function);
			}

			@java.lang.Override
			public java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> iterator() {
				final java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> i = v.iterator();
				return new java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry>() {
					private final UnmodifiableEntry e = new UnmodifiableEntry();

					public boolean hasNext() {
						return i.hasNext();
					}

					public org.apache.commons.math3.linear.RealVector.Entry next() {
						e.setIndex(i.next().getIndex());
						return e;
					}

					public void remove() throws org.apache.commons.math3.exception.MathUnsupportedOperationException {
						throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
					}
				};
			}

			@java.lang.Override
			public java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> sparseIterator() {
				final java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> i = v.sparseIterator();
				return new java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry>() {
					private final UnmodifiableEntry e = new UnmodifiableEntry();

					public boolean hasNext() {
						return i.hasNext();
					}

					public org.apache.commons.math3.linear.RealVector.Entry next() {
						e.setIndex(i.next().getIndex());
						return e;
					}

					public void remove() throws org.apache.commons.math3.exception.MathUnsupportedOperationException {
						throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
					}
				};
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector copy() {
				return v.copy();
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector add(org.apache.commons.math3.linear.RealVector w) throws org.apache.commons.math3.exception.DimensionMismatchException {
				return v.add(w);
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector subtract(org.apache.commons.math3.linear.RealVector w) throws org.apache.commons.math3.exception.DimensionMismatchException {
				return v.subtract(w);
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector mapAdd(double d) {
				return v.mapAdd(d);
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector mapAddToSelf(double d) throws org.apache.commons.math3.exception.MathUnsupportedOperationException {
				throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector mapSubtract(double d) {
				return v.mapSubtract(d);
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector mapSubtractToSelf(double d) throws org.apache.commons.math3.exception.MathUnsupportedOperationException {
				throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector mapMultiply(double d) {
				return v.mapMultiply(d);
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector mapMultiplyToSelf(double d) throws org.apache.commons.math3.exception.MathUnsupportedOperationException {
				throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector mapDivide(double d) {
				return v.mapDivide(d);
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector mapDivideToSelf(double d) throws org.apache.commons.math3.exception.MathUnsupportedOperationException {
				throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector ebeMultiply(org.apache.commons.math3.linear.RealVector w) throws org.apache.commons.math3.exception.DimensionMismatchException {
				return v.ebeMultiply(w);
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector ebeDivide(org.apache.commons.math3.linear.RealVector w) throws org.apache.commons.math3.exception.DimensionMismatchException {
				return v.ebeDivide(w);
			}

			@java.lang.Override
			public double dotProduct(org.apache.commons.math3.linear.RealVector w) throws org.apache.commons.math3.exception.DimensionMismatchException {
				return v.dotProduct(w);
			}

			@java.lang.Override
			public double cosine(org.apache.commons.math3.linear.RealVector w) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MathArithmeticException {
				return v.cosine(w);
			}

			@java.lang.Override
			public double getNorm() {
				return v.getNorm();
			}

			@java.lang.Override
			public double getL1Norm() {
				return v.getL1Norm();
			}

			@java.lang.Override
			public double getLInfNorm() {
				return v.getLInfNorm();
			}

			@java.lang.Override
			public double getDistance(org.apache.commons.math3.linear.RealVector w) throws org.apache.commons.math3.exception.DimensionMismatchException {
				return v.getDistance(w);
			}

			@java.lang.Override
			public double getL1Distance(org.apache.commons.math3.linear.RealVector w) throws org.apache.commons.math3.exception.DimensionMismatchException {
				return v.getL1Distance(w);
			}

			@java.lang.Override
			public double getLInfDistance(org.apache.commons.math3.linear.RealVector w) throws org.apache.commons.math3.exception.DimensionMismatchException {
				return v.getLInfDistance(w);
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector unitVector() throws org.apache.commons.math3.exception.MathArithmeticException {
				return v.unitVector();
			}

			@java.lang.Override
			public void unitize() throws org.apache.commons.math3.exception.MathUnsupportedOperationException {
				throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealMatrix outerProduct(org.apache.commons.math3.linear.RealVector w) {
				return v.outerProduct(w);
			}

			@java.lang.Override
			public double getEntry(int index) throws org.apache.commons.math3.exception.OutOfRangeException {
				return v.getEntry(index);
			}

			@java.lang.Override
			public void setEntry(int index, double value) throws org.apache.commons.math3.exception.MathUnsupportedOperationException {
				throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
			}

			@java.lang.Override
			public void addToEntry(int index, double value) throws org.apache.commons.math3.exception.MathUnsupportedOperationException {
				throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
			}

			@java.lang.Override
			public int getDimension() {
				return v.getDimension();
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector append(org.apache.commons.math3.linear.RealVector w) {
				return v.append(w);
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector append(double d) {
				return v.append(d);
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector getSubVector(int index, int n) throws org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.OutOfRangeException {
				return v.getSubVector(index, n);
			}

			@java.lang.Override
			public void setSubVector(int index, org.apache.commons.math3.linear.RealVector w) throws org.apache.commons.math3.exception.MathUnsupportedOperationException {
				throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
			}

			@java.lang.Override
			public void set(double value) throws org.apache.commons.math3.exception.MathUnsupportedOperationException {
				throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
			}

			@java.lang.Override
			public double[] toArray() {
				return v.toArray();
			}

			@java.lang.Override
			public boolean isNaN() {
				return v.isNaN();
			}

			@java.lang.Override
			public boolean isInfinite() {
				return v.isInfinite();
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector combine(double a, double b, org.apache.commons.math3.linear.RealVector y) throws org.apache.commons.math3.exception.DimensionMismatchException {
				return v.combine(a, b, y);
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector combineToSelf(double a, double b, org.apache.commons.math3.linear.RealVector y) throws org.apache.commons.math3.exception.MathUnsupportedOperationException {
				throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
			}

			class UnmodifiableEntry extends org.apache.commons.math3.linear.RealVector.Entry {
				@java.lang.Override
				public double getValue() {
					return v.getEntry(getIndex());
				}

				@java.lang.Override
				public void setValue(double value) throws org.apache.commons.math3.exception.MathUnsupportedOperationException {
					throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
				}
			}
		};
	}
}

