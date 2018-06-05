

package org.apache.commons.math3.linear;


public class OpenMapRealVector extends org.apache.commons.math3.linear.SparseRealVector implements java.io.Serializable {
	public static final double DEFAULT_ZERO_TOLERANCE = 1.0E-12;

	private static final long serialVersionUID = 8772222695580707260L;

	private final org.apache.commons.math3.util.OpenIntToDoubleHashMap entries;

	private final int virtualSize;

	private final double epsilon;

	public OpenMapRealVector() {
		this(0, org.apache.commons.math3.linear.OpenMapRealVector.DEFAULT_ZERO_TOLERANCE);
	}

	public OpenMapRealVector(int dimension) {
		this(dimension, org.apache.commons.math3.linear.OpenMapRealVector.DEFAULT_ZERO_TOLERANCE);
	}

	public OpenMapRealVector(int dimension, double epsilon) {
		virtualSize = dimension;
		entries = new org.apache.commons.math3.util.OpenIntToDoubleHashMap(0.0);
		this.epsilon = epsilon;
	}

	protected OpenMapRealVector(org.apache.commons.math3.linear.OpenMapRealVector v, int resize) {
		virtualSize = (v.getDimension()) + resize;
		entries = new org.apache.commons.math3.util.OpenIntToDoubleHashMap(v.entries);
		epsilon = v.epsilon;
	}

	public OpenMapRealVector(int dimension, int expectedSize) {
		this(dimension, expectedSize, org.apache.commons.math3.linear.OpenMapRealVector.DEFAULT_ZERO_TOLERANCE);
	}

	public OpenMapRealVector(int dimension, int expectedSize, double epsilon) {
		virtualSize = dimension;
		entries = new org.apache.commons.math3.util.OpenIntToDoubleHashMap(expectedSize, 0.0);
		this.epsilon = epsilon;
	}

	public OpenMapRealVector(double[] values) {
		this(values, org.apache.commons.math3.linear.OpenMapRealVector.DEFAULT_ZERO_TOLERANCE);
	}

	public OpenMapRealVector(double[] values, double epsilon) {
		virtualSize = values.length;
		entries = new org.apache.commons.math3.util.OpenIntToDoubleHashMap(0.0);
		this.epsilon = epsilon;
		for (int key = 0; key < (values.length); key++) {
			double value = values[key];
			if (!(isDefaultValue(value))) {
				entries.put(key, value);
			}
		}
	}

	public OpenMapRealVector(java.lang.Double[] values) {
		this(values, org.apache.commons.math3.linear.OpenMapRealVector.DEFAULT_ZERO_TOLERANCE);
	}

	public OpenMapRealVector(java.lang.Double[] values, double epsilon) {
		virtualSize = values.length;
		entries = new org.apache.commons.math3.util.OpenIntToDoubleHashMap(0.0);
		this.epsilon = epsilon;
		for (int key = 0; key < (values.length); key++) {
			double value = values[key].doubleValue();
			if (!(isDefaultValue(value))) {
				entries.put(key, value);
			}
		}
	}

	public OpenMapRealVector(org.apache.commons.math3.linear.OpenMapRealVector v) {
		virtualSize = v.getDimension();
		entries = new org.apache.commons.math3.util.OpenIntToDoubleHashMap(v.getEntries());
		epsilon = v.epsilon;
	}

	public OpenMapRealVector(org.apache.commons.math3.linear.RealVector v) {
		virtualSize = v.getDimension();
		entries = new org.apache.commons.math3.util.OpenIntToDoubleHashMap(0.0);
		epsilon = org.apache.commons.math3.linear.OpenMapRealVector.DEFAULT_ZERO_TOLERANCE;
		for (int key = 0; key < (virtualSize); key++) {
			double value = v.getEntry(key);
			if (!(isDefaultValue(value))) {
				entries.put(key, value);
			}
		}
	}

	private org.apache.commons.math3.util.OpenIntToDoubleHashMap getEntries() {
		return entries;
	}

	protected boolean isDefaultValue(double value) {
		return (org.apache.commons.math3.util.FastMath.abs(value)) < (epsilon);
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.RealVector add(org.apache.commons.math3.linear.RealVector v) {
		checkVectorDimensions(v.getDimension());
		if (v instanceof org.apache.commons.math3.linear.OpenMapRealVector) {
			return add(((org.apache.commons.math3.linear.OpenMapRealVector) (v)));
		}else {
			return super.add(v);
		}
	}

	public org.apache.commons.math3.linear.OpenMapRealVector add(org.apache.commons.math3.linear.OpenMapRealVector v) {
		checkVectorDimensions(v.getDimension());
		boolean copyThis = (entries.size()) > (v.entries.size());
		org.apache.commons.math3.linear.OpenMapRealVector res = copyThis ? org.apache.commons.math3.linear.OpenMapRealVector.this.copy() : v.copy();
		org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iter = copyThis ? v.entries.iterator() : entries.iterator();
		org.apache.commons.math3.util.OpenIntToDoubleHashMap randomAccess = copyThis ? entries : v.entries;
		while (iter.hasNext()) {
			iter.advance();
			int key = iter.key();
			if (randomAccess.containsKey(key)) {
				res.setEntry(key, ((randomAccess.get(key)) + (iter.value())));
			}else {
				res.setEntry(key, iter.value());
			}
		} 
		return res;
	}

	public org.apache.commons.math3.linear.OpenMapRealVector append(org.apache.commons.math3.linear.OpenMapRealVector v) {
		org.apache.commons.math3.linear.OpenMapRealVector res = new org.apache.commons.math3.linear.OpenMapRealVector(org.apache.commons.math3.linear.OpenMapRealVector.this, v.getDimension());
		org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iter = v.entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			res.setEntry(((iter.key()) + (virtualSize)), iter.value());
		} 
		return res;
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.OpenMapRealVector append(org.apache.commons.math3.linear.RealVector v) {
		if (v instanceof org.apache.commons.math3.linear.OpenMapRealVector) {
			return append(((org.apache.commons.math3.linear.OpenMapRealVector) (v)));
		}else {
			final org.apache.commons.math3.linear.OpenMapRealVector res = new org.apache.commons.math3.linear.OpenMapRealVector(org.apache.commons.math3.linear.OpenMapRealVector.this, v.getDimension());
			for (int i = 0; i < (v.getDimension()); i++) {
				res.setEntry((i + (virtualSize)), v.getEntry(i));
			}
			return res;
		}
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.OpenMapRealVector append(double d) {
		org.apache.commons.math3.linear.OpenMapRealVector res = new org.apache.commons.math3.linear.OpenMapRealVector(org.apache.commons.math3.linear.OpenMapRealVector.this, 1);
		res.setEntry(virtualSize, d);
		return res;
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.OpenMapRealVector copy() {
		return new org.apache.commons.math3.linear.OpenMapRealVector(org.apache.commons.math3.linear.OpenMapRealVector.this);
	}

	@java.lang.Deprecated
	public double dotProduct(org.apache.commons.math3.linear.OpenMapRealVector v) {
		return dotProduct(((org.apache.commons.math3.linear.RealVector) (v)));
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.OpenMapRealVector ebeDivide(org.apache.commons.math3.linear.RealVector v) {
		checkVectorDimensions(v.getDimension());
		org.apache.commons.math3.linear.OpenMapRealVector res = new org.apache.commons.math3.linear.OpenMapRealVector(org.apache.commons.math3.linear.OpenMapRealVector.this);
		final int n = getDimension();
		for (int i = 0; i < n; i++) {
			res.setEntry(i, ((org.apache.commons.math3.linear.OpenMapRealVector.this.getEntry(i)) / (v.getEntry(i))));
		}
		return res;
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.OpenMapRealVector ebeMultiply(org.apache.commons.math3.linear.RealVector v) {
		checkVectorDimensions(v.getDimension());
		org.apache.commons.math3.linear.OpenMapRealVector res = new org.apache.commons.math3.linear.OpenMapRealVector(org.apache.commons.math3.linear.OpenMapRealVector.this);
		org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			res.setEntry(iter.key(), ((iter.value()) * (v.getEntry(iter.key()))));
		} 
		if ((v.isNaN()) || (v.isInfinite())) {
			final int n = getDimension();
			for (int i = 0; i < n; i++) {
				final double y = v.getEntry(i);
				if (java.lang.Double.isNaN(y)) {
					res.setEntry(i, java.lang.Double.NaN);
				}else
					if (java.lang.Double.isInfinite(y)) {
						final double x = org.apache.commons.math3.linear.OpenMapRealVector.this.getEntry(i);
						res.setEntry(i, (x * y));
					}
				
			}
		}
		return res;
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.OpenMapRealVector getSubVector(int index, int n) {
		checkIndex(index);
		if (n < 0) {
			throw new org.apache.commons.math3.exception.NotPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_ELEMENTS_SHOULD_BE_POSITIVE, n);
		}
		checkIndex(((index + n) - 1));
		org.apache.commons.math3.linear.OpenMapRealVector res = new org.apache.commons.math3.linear.OpenMapRealVector(n);
		int end = index + n;
		org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			int key = iter.key();
			if ((key >= index) && (key < end)) {
				res.setEntry((key - index), iter.value());
			}
		} 
		return res;
	}

	@java.lang.Override
	public int getDimension() {
		return virtualSize;
	}

	public double getDistance(org.apache.commons.math3.linear.OpenMapRealVector v) {
		org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		double res = 0;
		while (iter.hasNext()) {
			iter.advance();
			int key = iter.key();
			double delta;
			delta = (iter.value()) - (v.getEntry(key));
			res += delta * delta;
		} 
		iter = v.getEntries().iterator();
		while (iter.hasNext()) {
			iter.advance();
			int key = iter.key();
			if (!(entries.containsKey(key))) {
				final double value = iter.value();
				res += value * value;
			}
		} 
		return org.apache.commons.math3.util.FastMath.sqrt(res);
	}

	@java.lang.Override
	public double getDistance(org.apache.commons.math3.linear.RealVector v) {
		checkVectorDimensions(v.getDimension());
		if (v instanceof org.apache.commons.math3.linear.OpenMapRealVector) {
			return getDistance(((org.apache.commons.math3.linear.OpenMapRealVector) (v)));
		}else {
			return super.getDistance(v);
		}
	}

	@java.lang.Override
	public double getEntry(int index) {
		checkIndex(index);
		return entries.get(index);
	}

	public double getL1Distance(org.apache.commons.math3.linear.OpenMapRealVector v) {
		double max = 0;
		org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			double delta = org.apache.commons.math3.util.FastMath.abs(((iter.value()) - (v.getEntry(iter.key()))));
			max += delta;
		} 
		iter = v.getEntries().iterator();
		while (iter.hasNext()) {
			iter.advance();
			int key = iter.key();
			if (!(entries.containsKey(key))) {
				double delta = org.apache.commons.math3.util.FastMath.abs(iter.value());
				max += org.apache.commons.math3.util.FastMath.abs(delta);
			}
		} 
		return max;
	}

	@java.lang.Override
	public double getL1Distance(org.apache.commons.math3.linear.RealVector v) {
		checkVectorDimensions(v.getDimension());
		if (v instanceof org.apache.commons.math3.linear.OpenMapRealVector) {
			return getL1Distance(((org.apache.commons.math3.linear.OpenMapRealVector) (v)));
		}else {
			return super.getL1Distance(v);
		}
	}

	private double getLInfDistance(org.apache.commons.math3.linear.OpenMapRealVector v) {
		double max = 0;
		org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			double delta = org.apache.commons.math3.util.FastMath.abs(((iter.value()) - (v.getEntry(iter.key()))));
			if (delta > max) {
				max = delta;
			}
		} 
		iter = v.getEntries().iterator();
		while (iter.hasNext()) {
			iter.advance();
			int key = iter.key();
			if (!(entries.containsKey(key))) {
				if ((iter.value()) > max) {
					max = iter.value();
				}
			}
		} 
		return max;
	}

	@java.lang.Override
	public double getLInfDistance(org.apache.commons.math3.linear.RealVector v) {
		checkVectorDimensions(v.getDimension());
		if (v instanceof org.apache.commons.math3.linear.OpenMapRealVector) {
			return getLInfDistance(((org.apache.commons.math3.linear.OpenMapRealVector) (v)));
		}else {
			return super.getLInfDistance(v);
		}
	}

	@java.lang.Override
	public boolean isInfinite() {
		boolean infiniteFound = false;
		org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			final double value = iter.value();
			if (java.lang.Double.isNaN(value)) {
				return false;
			}
			if (java.lang.Double.isInfinite(value)) {
				infiniteFound = true;
			}
		} 
		return infiniteFound;
	}

	@java.lang.Override
	public boolean isNaN() {
		org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			if (java.lang.Double.isNaN(iter.value())) {
				return true;
			}
		} 
		return false;
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.OpenMapRealVector mapAdd(double d) {
		return copy().mapAddToSelf(d);
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.OpenMapRealVector mapAddToSelf(double d) {
		for (int i = 0; i < (virtualSize); i++) {
			setEntry(i, ((getEntry(i)) + d));
		}
		return org.apache.commons.math3.linear.OpenMapRealVector.this;
	}

	@java.lang.Override
	public void setEntry(int index, double value) {
		checkIndex(index);
		if (!(isDefaultValue(value))) {
			entries.put(index, value);
		}else
			if (entries.containsKey(index)) {
				entries.remove(index);
			}
		
	}

	@java.lang.Override
	public void setSubVector(int index, org.apache.commons.math3.linear.RealVector v) {
		checkIndex(index);
		checkIndex(((index + (v.getDimension())) - 1));
		for (int i = 0; i < (v.getDimension()); i++) {
			setEntry((i + index), v.getEntry(i));
		}
	}

	@java.lang.Override
	public void set(double value) {
		for (int i = 0; i < (virtualSize); i++) {
			setEntry(i, value);
		}
	}

	public org.apache.commons.math3.linear.OpenMapRealVector subtract(org.apache.commons.math3.linear.OpenMapRealVector v) {
		checkVectorDimensions(v.getDimension());
		org.apache.commons.math3.linear.OpenMapRealVector res = copy();
		org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iter = v.getEntries().iterator();
		while (iter.hasNext()) {
			iter.advance();
			int key = iter.key();
			if (entries.containsKey(key)) {
				res.setEntry(key, ((entries.get(key)) - (iter.value())));
			}else {
				res.setEntry(key, (-(iter.value())));
			}
		} 
		return res;
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.RealVector subtract(org.apache.commons.math3.linear.RealVector v) {
		checkVectorDimensions(v.getDimension());
		if (v instanceof org.apache.commons.math3.linear.OpenMapRealVector) {
			return subtract(((org.apache.commons.math3.linear.OpenMapRealVector) (v)));
		}else {
			return super.subtract(v);
		}
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.OpenMapRealVector unitVector() throws org.apache.commons.math3.exception.MathArithmeticException {
		org.apache.commons.math3.linear.OpenMapRealVector res = copy();
		res.unitize();
		return res;
	}

	@java.lang.Override
	public void unitize() throws org.apache.commons.math3.exception.MathArithmeticException {
		double norm = getNorm();
		if (isDefaultValue(norm)) {
			throw new org.apache.commons.math3.exception.MathArithmeticException(org.apache.commons.math3.exception.util.LocalizedFormats.ZERO_NORM);
		}
		org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			entries.put(iter.key(), ((iter.value()) / norm));
		} 
	}

	@java.lang.Override
	public double[] toArray() {
		double[] res = new double[virtualSize];
		org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			res[iter.key()] = iter.value();
		} 
		return res;
	}

	@java.lang.Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = java.lang.Double.doubleToLongBits(epsilon);
		result = (prime * result) + ((int) (temp ^ (temp >>> 32)));
		result = (prime * result) + (virtualSize);
		org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			temp = java.lang.Double.doubleToLongBits(iter.value());
			result = (prime * result) + ((int) (temp ^ (temp >> 32)));
		} 
		return result;
	}

	@java.lang.Override
	public boolean equals(java.lang.Object obj) {
		if ((org.apache.commons.math3.linear.OpenMapRealVector.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.apache.commons.math3.linear.OpenMapRealVector)) {
			return false;
		}
		org.apache.commons.math3.linear.OpenMapRealVector other = ((org.apache.commons.math3.linear.OpenMapRealVector) (obj));
		if ((virtualSize) != (other.virtualSize)) {
			return false;
		}
		if ((java.lang.Double.doubleToLongBits(epsilon)) != (java.lang.Double.doubleToLongBits(other.epsilon))) {
			return false;
		}
		org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			double test = other.getEntry(iter.key());
			if ((java.lang.Double.doubleToLongBits(test)) != (java.lang.Double.doubleToLongBits(iter.value()))) {
				return false;
			}
		} 
		iter = other.getEntries().iterator();
		while (iter.hasNext()) {
			iter.advance();
			double test = iter.value();
			if ((java.lang.Double.doubleToLongBits(test)) != (java.lang.Double.doubleToLongBits(getEntry(iter.key())))) {
				return false;
			}
		} 
		return true;
	}

	public double getSparsity() {
		return ((double) (entries.size())) / ((double) (getDimension()));
	}

	@java.lang.Override
	public java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> sparseIterator() {
		return new org.apache.commons.math3.linear.OpenMapRealVector.OpenMapSparseIterator();
	}

	protected class OpenMapEntry extends org.apache.commons.math3.linear.RealVector.Entry {
		private final org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iter;

		protected OpenMapEntry(org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iter) {
			this.iter = iter;
		}

		@java.lang.Override
		public double getValue() {
			return iter.value();
		}

		@java.lang.Override
		public void setValue(double value) {
			entries.put(iter.key(), value);
		}

		@java.lang.Override
		public int getIndex() {
			return iter.key();
		}
	}

	protected class OpenMapSparseIterator implements java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> {
		private final org.apache.commons.math3.util.OpenIntToDoubleHashMap.Iterator iter;

		private final org.apache.commons.math3.linear.RealVector.Entry current;

		protected OpenMapSparseIterator() {
			iter = entries.iterator();
			current = new org.apache.commons.math3.linear.OpenMapRealVector.OpenMapEntry(iter);
		}

		public boolean hasNext() {
			return iter.hasNext();
		}

		public org.apache.commons.math3.linear.RealVector.Entry next() {
			iter.advance();
			return current;
		}

		public void remove() {
			throw new java.lang.UnsupportedOperationException("Not supported");
		}
	}
}

