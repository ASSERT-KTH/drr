

package org.apache.commons.math3.linear;


public abstract class RealVector {
	public abstract int getDimension();

	public abstract double getEntry(int index);

	public abstract void setEntry(int index, double value);

	public void addToEntry(int index, double increment) {
		setEntry(index, ((getEntry(index)) + increment));
	}

	public abstract org.apache.commons.math3.linear.RealVector append(org.apache.commons.math3.linear.RealVector v);

	public abstract org.apache.commons.math3.linear.RealVector append(double d);

	public abstract org.apache.commons.math3.linear.RealVector getSubVector(int index, int n);

	public abstract void setSubVector(int index, org.apache.commons.math3.linear.RealVector v);

	public abstract boolean isNaN();

	public abstract boolean isInfinite();

	protected void checkVectorDimensions(org.apache.commons.math3.linear.RealVector v) {
		checkVectorDimensions(v.getDimension());
	}

	protected void checkVectorDimensions(int n) {
		int d = getDimension();
		if (d != n) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(d, n);
		}
	}

	protected void checkIndex(final int index) {
		if ((index < 0) || (index >= (getDimension()))) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(org.apache.commons.math3.exception.util.LocalizedFormats.INDEX, index, 0, ((getDimension()) - 1));
		}
	}

	public org.apache.commons.math3.linear.RealVector add(org.apache.commons.math3.linear.RealVector v) {
		org.apache.commons.math3.linear.RealVector result = v.copy();
		java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> it = sparseIterator();
		org.apache.commons.math3.linear.RealVector.Entry e;
		while ((it.hasNext()) && ((e = it.next()) != null)) {
			final int index = e.getIndex();
			result.setEntry(index, ((e.getValue()) + (result.getEntry(index))));
		} 
		return result;
	}

	public org.apache.commons.math3.linear.RealVector subtract(org.apache.commons.math3.linear.RealVector v) {
		org.apache.commons.math3.linear.RealVector result = v.copy();
		java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> it = sparseIterator();
		org.apache.commons.math3.linear.RealVector.Entry e;
		while ((it.hasNext()) && ((e = it.next()) != null)) {
			final int index = e.getIndex();
			result.setEntry(index, ((e.getValue()) - (result.getEntry(index))));
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

	public double dotProduct(org.apache.commons.math3.linear.RealVector v) {
		checkVectorDimensions(v);
		double d = 0;
		java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> it = sparseIterator();
		org.apache.commons.math3.linear.RealVector.Entry e;
		while ((it.hasNext()) && ((e = it.next()) != null)) {
			d += (e.getValue()) * (v.getEntry(e.getIndex()));
		} 
		return d;
	}

	public double cosine(org.apache.commons.math3.linear.RealVector v) {
		final double norm = getNorm();
		final double vNorm = v.getNorm();
		if ((norm == 0) || (vNorm == 0)) {
			throw new org.apache.commons.math3.exception.MathArithmeticException(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM);
		}
		return (dotProduct(v)) / (norm * vNorm);
	}

	public abstract org.apache.commons.math3.linear.RealVector ebeDivide(org.apache.commons.math3.linear.RealVector v);

	public abstract org.apache.commons.math3.linear.RealVector ebeMultiply(org.apache.commons.math3.linear.RealVector v);

	public double getDistance(org.apache.commons.math3.linear.RealVector v) {
		checkVectorDimensions(v);
		double d = 0;
		java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> it = iterator();
		org.apache.commons.math3.linear.RealVector.Entry e;
		while ((it.hasNext()) && ((e = it.next()) != null)) {
			final double diff = (e.getValue()) - (v.getEntry(e.getIndex()));
			d += diff * diff;
		} 
		return org.apache.commons.math3.util.FastMath.sqrt(d);
	}

	public double getNorm() {
		double sum = 0;
		java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> it = sparseIterator();
		org.apache.commons.math3.linear.RealVector.Entry e;
		while ((it.hasNext()) && ((e = it.next()) != null)) {
			final double value = e.getValue();
			sum += value * value;
		} 
		return org.apache.commons.math3.util.FastMath.sqrt(sum);
	}

	public double getL1Norm() {
		double norm = 0;
		java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> it = sparseIterator();
		org.apache.commons.math3.linear.RealVector.Entry e;
		while ((it.hasNext()) && ((e = it.next()) != null)) {
			norm += org.apache.commons.math3.util.FastMath.abs(e.getValue());
		} 
		return norm;
	}

	public double getLInfNorm() {
		double norm = 0;
		java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> it = sparseIterator();
		org.apache.commons.math3.linear.RealVector.Entry e;
		while ((it.hasNext()) && ((e = it.next()) != null)) {
			norm = org.apache.commons.math3.util.FastMath.max(norm, org.apache.commons.math3.util.FastMath.abs(e.getValue()));
		} 
		return norm;
	}

	public double getL1Distance(org.apache.commons.math3.linear.RealVector v) {
		checkVectorDimensions(v);
		double d = 0;
		java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> it = iterator();
		org.apache.commons.math3.linear.RealVector.Entry e;
		while ((it.hasNext()) && ((e = it.next()) != null)) {
			d += org.apache.commons.math3.util.FastMath.abs(((e.getValue()) - (v.getEntry(e.getIndex()))));
		} 
		return d;
	}

	public double getLInfDistance(org.apache.commons.math3.linear.RealVector v) {
		checkVectorDimensions(v);
		double d = 0;
		java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> it = iterator();
		org.apache.commons.math3.linear.RealVector.Entry e;
		while ((it.hasNext()) && ((e = it.next()) != null)) {
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
		org.apache.commons.math3.linear.RealMatrix product;
		if ((v instanceof org.apache.commons.math3.linear.SparseRealVector) || ((org.apache.commons.math3.linear.RealVector.this) instanceof org.apache.commons.math3.linear.SparseRealVector)) {
			product = new org.apache.commons.math3.linear.OpenMapRealMatrix(org.apache.commons.math3.linear.RealVector.this.getDimension(), v.getDimension());
		}else {
			product = new org.apache.commons.math3.linear.Array2DRowRealMatrix(org.apache.commons.math3.linear.RealVector.this.getDimension(), v.getDimension());
		}
		java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> thisIt = sparseIterator();
		org.apache.commons.math3.linear.RealVector.Entry thisE = null;
		while ((thisIt.hasNext()) && ((thisE = thisIt.next()) != null)) {
			java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> otherIt = v.sparseIterator();
			org.apache.commons.math3.linear.RealVector.Entry otherE = null;
			while ((otherIt.hasNext()) && ((otherE = otherIt.next()) != null)) {
				product.setEntry(thisE.getIndex(), otherE.getIndex(), ((thisE.getValue()) * (otherE.getValue())));
			} 
		} 
		return product;
	}

	public abstract org.apache.commons.math3.linear.RealVector projection(org.apache.commons.math3.linear.RealVector v);

	public void set(double value) {
		java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> it = iterator();
		org.apache.commons.math3.linear.RealVector.Entry e = null;
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

	public org.apache.commons.math3.linear.RealVector unitVector() {
		org.apache.commons.math3.linear.RealVector copy = copy();
		copy.unitize();
		return copy;
	}

	public void unitize() {
		mapDivideToSelf(getNorm());
	}

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
				e.setIndex(((i)++));
				return e;
			}

			public void remove() {
				throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
			}
		};
	}

	public org.apache.commons.math3.linear.RealVector map(org.apache.commons.math3.analysis.UnivariateFunction function) {
		return copy().mapToSelf(function);
	}

	public org.apache.commons.math3.linear.RealVector mapToSelf(org.apache.commons.math3.analysis.UnivariateFunction function) {
		java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> it = (function.value(0)) == 0 ? sparseIterator() : iterator();
		org.apache.commons.math3.linear.RealVector.Entry e;
		while ((it.hasNext()) && ((e = it.next()) != null)) {
			e.setValue(function.value(e.getValue()));
		} 
		return org.apache.commons.math3.linear.RealVector.this;
	}

	public org.apache.commons.math3.linear.RealVector combine(double a, double b, org.apache.commons.math3.linear.RealVector y) {
		return copy().combineToSelf(a, b, y);
	}

	public org.apache.commons.math3.linear.RealVector combineToSelf(double a, double b, org.apache.commons.math3.linear.RealVector y) {
		checkVectorDimensions(y);
		for (int i = 0; i < (getDimension()); i++) {
			final double xi = getEntry(i);
			final double yi = y.getEntry(i);
			setEntry(i, ((a * xi) + (b * yi)));
		}
		return org.apache.commons.math3.linear.RealVector.this;
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

		public void remove() {
			throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
		}
	}

	public static org.apache.commons.math3.linear.RealVector unmodifiableRealVector(final org.apache.commons.math3.linear.RealVector v) {
		return new org.apache.commons.math3.linear.RealVector() {
			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector mapToSelf(org.apache.commons.math3.analysis.UnivariateFunction function) {
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

					public void remove() {
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

					public void remove() {
						throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
					}
				};
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector copy() {
				return v.copy();
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector add(org.apache.commons.math3.linear.RealVector w) {
				return v.add(w);
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector subtract(org.apache.commons.math3.linear.RealVector w) {
				return v.subtract(w);
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector mapAdd(double d) {
				return v.mapAdd(d);
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector mapAddToSelf(double d) {
				throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector mapSubtract(double d) {
				return v.mapSubtract(d);
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector mapSubtractToSelf(double d) {
				throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector mapMultiply(double d) {
				return v.mapMultiply(d);
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector mapMultiplyToSelf(double d) {
				throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector mapDivide(double d) {
				return v.mapDivide(d);
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector mapDivideToSelf(double d) {
				throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector ebeMultiply(org.apache.commons.math3.linear.RealVector w) {
				return v.ebeMultiply(w);
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector ebeDivide(org.apache.commons.math3.linear.RealVector w) {
				return v.ebeDivide(w);
			}

			@java.lang.Override
			public double dotProduct(org.apache.commons.math3.linear.RealVector w) {
				return v.dotProduct(w);
			}

			@java.lang.Override
			public double cosine(org.apache.commons.math3.linear.RealVector w) {
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
			public double getDistance(org.apache.commons.math3.linear.RealVector w) {
				return v.getDistance(w);
			}

			@java.lang.Override
			public double getL1Distance(org.apache.commons.math3.linear.RealVector w) {
				return v.getL1Distance(w);
			}

			@java.lang.Override
			public double getLInfDistance(org.apache.commons.math3.linear.RealVector w) {
				return v.getLInfDistance(w);
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector unitVector() {
				return v.unitVector();
			}

			@java.lang.Override
			public void unitize() {
				throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector projection(org.apache.commons.math3.linear.RealVector w) {
				return v.projection(w);
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealMatrix outerProduct(org.apache.commons.math3.linear.RealVector w) {
				return v.outerProduct(w);
			}

			@java.lang.Override
			public double getEntry(int index) {
				return v.getEntry(index);
			}

			@java.lang.Override
			public void setEntry(int index, double value) {
				throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
			}

			@java.lang.Override
			public void addToEntry(int index, double value) {
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
			public org.apache.commons.math3.linear.RealVector getSubVector(int index, int n) {
				return v.getSubVector(index, n);
			}

			@java.lang.Override
			public void setSubVector(int index, org.apache.commons.math3.linear.RealVector w) {
				throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
			}

			@java.lang.Override
			public void set(double value) {
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
			public org.apache.commons.math3.linear.RealVector combine(double a, double b, org.apache.commons.math3.linear.RealVector y) {
				return v.combine(a, b, y);
			}

			@java.lang.Override
			public org.apache.commons.math3.linear.RealVector combineToSelf(double a, double b, org.apache.commons.math3.linear.RealVector y) {
				throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
			}

			class UnmodifiableEntry extends org.apache.commons.math3.linear.RealVector.Entry {
				@java.lang.Override
				public double getValue() {
					return v.getEntry(getIndex());
				}

				@java.lang.Override
				public void setValue(double value) {
					throw new org.apache.commons.math3.exception.MathUnsupportedOperationException();
				}
			}
		};
	}
}

