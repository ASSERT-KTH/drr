

package org.apache.commons.math.linear;


public class SparseRealVector implements org.apache.commons.math.linear.RealVector {
	private static final long serialVersionUID = 8772222695580707260L;

	public static final double DEFAULT_ZERO_TOLERANCE = 1.0E-12;

	private final org.apache.commons.math.util.OpenIntToDoubleHashMap entries;

	private final int virtualSize;

	private double epsilon;

	public SparseRealVector() {
		this(0, org.apache.commons.math.linear.SparseRealVector.DEFAULT_ZERO_TOLERANCE);
	}

	public SparseRealVector(int dimension) {
		this(dimension, org.apache.commons.math.linear.SparseRealVector.DEFAULT_ZERO_TOLERANCE);
	}

	public SparseRealVector(int dimension, double epsilon) {
		virtualSize = dimension;
		entries = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0.0);
		org.apache.commons.math.linear.SparseRealVector.this.epsilon = epsilon;
	}

	protected SparseRealVector(org.apache.commons.math.linear.SparseRealVector v, int resize) {
		virtualSize = (v.getDimension()) + resize;
		entries = new org.apache.commons.math.util.OpenIntToDoubleHashMap(v.entries);
		epsilon = v.getEpsilon();
	}

	public SparseRealVector(int dimension, int expectedSize) {
		this(dimension, expectedSize, org.apache.commons.math.linear.SparseRealVector.DEFAULT_ZERO_TOLERANCE);
	}

	public SparseRealVector(int dimension, int expectedSize, double epsilon) {
		virtualSize = dimension;
		entries = new org.apache.commons.math.util.OpenIntToDoubleHashMap(expectedSize, 0.0);
		org.apache.commons.math.linear.SparseRealVector.this.epsilon = epsilon;
	}

	public SparseRealVector(double[] values) {
		this(values, org.apache.commons.math.linear.SparseRealVector.DEFAULT_ZERO_TOLERANCE);
	}

	public SparseRealVector(double[] values, double epsilon) {
		virtualSize = values.length;
		entries = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0.0);
		org.apache.commons.math.linear.SparseRealVector.this.epsilon = epsilon;
		for (int key = 0; key < (values.length); key++) {
			double value = values[key];
			if (!(isZero(value))) {
				entries.put(key, value);
			}
		}
	}

	public SparseRealVector(java.lang.Double[] values) {
		this(values, org.apache.commons.math.linear.SparseRealVector.DEFAULT_ZERO_TOLERANCE);
	}

	public SparseRealVector(java.lang.Double[] values, double epsilon) {
		virtualSize = values.length;
		entries = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0.0);
		org.apache.commons.math.linear.SparseRealVector.this.epsilon = epsilon;
		for (int key = 0; key < (values.length); key++) {
			double value = values[key].doubleValue();
			if (!(isZero(value))) {
				entries.put(key, value);
			}
		}
	}

	public SparseRealVector(org.apache.commons.math.linear.SparseRealVector v) {
		virtualSize = v.getDimension();
		entries = new org.apache.commons.math.util.OpenIntToDoubleHashMap(v.getEntries());
		epsilon = v.getEpsilon();
	}

	public SparseRealVector(org.apache.commons.math.linear.RealVector v) {
		virtualSize = v.getDimension();
		entries = new org.apache.commons.math.util.OpenIntToDoubleHashMap(0.0);
		epsilon = org.apache.commons.math.linear.SparseRealVector.DEFAULT_ZERO_TOLERANCE;
		for (int key = 0; key < (virtualSize); key++) {
			double value = v.getEntry(key);
			if (!(isZero(value))) {
				entries.put(key, value);
			}
		}
	}

	private org.apache.commons.math.util.OpenIntToDoubleHashMap getEntries() {
		return entries;
	}

	protected boolean isZero(double value) {
		return (value > (-(epsilon))) && (value < (epsilon));
	}

	public double getEpsilon() {
		return epsilon;
	}

	public void setEpsilon(double epsilon) {
		org.apache.commons.math.linear.SparseRealVector.this.epsilon = epsilon;
	}

	public org.apache.commons.math.linear.RealVector add(org.apache.commons.math.linear.RealVector v) throws java.lang.IllegalArgumentException {
		checkVectorDimensions(v.getDimension());
		if (v instanceof org.apache.commons.math.linear.SparseRealVector) {
			return add(((org.apache.commons.math.linear.SparseRealVector) (v)));
		}
		return add(v.getData());
	}

	public org.apache.commons.math.linear.SparseRealVector add(org.apache.commons.math.linear.SparseRealVector v) throws java.lang.IllegalArgumentException {
		checkVectorDimensions(v.getDimension());
		org.apache.commons.math.linear.SparseRealVector res = ((org.apache.commons.math.linear.SparseRealVector) (copy()));
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = v.getEntries().iterator();
		while (iter.hasNext()) {
			iter.advance();
			int key = iter.key();
			if (entries.containsKey(key)) {
				res.setEntry(key, ((entries.get(key)) + (iter.value())));
			}else {
				res.setEntry(key, iter.value());
			}
		} 
		return res;
	}

	public org.apache.commons.math.linear.RealVector add(double[] v) throws java.lang.IllegalArgumentException {
		checkVectorDimensions(v.length);
		org.apache.commons.math.linear.SparseRealVector res = new org.apache.commons.math.linear.SparseRealVector(getDimension());
		for (int i = 0; i < (v.length); i++) {
			res.setEntry(i, ((v[i]) + (getEntry(i))));
		}
		return res;
	}

	public org.apache.commons.math.linear.SparseRealVector append(org.apache.commons.math.linear.SparseRealVector v) {
		org.apache.commons.math.linear.SparseRealVector res = new org.apache.commons.math.linear.SparseRealVector(org.apache.commons.math.linear.SparseRealVector.this, v.getDimension());
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = v.entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			res.setEntry(((iter.key()) + (virtualSize)), iter.value());
		} 
		return res;
	}

	public org.apache.commons.math.linear.RealVector append(org.apache.commons.math.linear.RealVector v) {
		if (v instanceof org.apache.commons.math.linear.SparseRealVector) {
			return append(((org.apache.commons.math.linear.SparseRealVector) (v)));
		}
		return append(v.getData());
	}

	public org.apache.commons.math.linear.RealVector append(double d) {
		org.apache.commons.math.linear.RealVector res = new org.apache.commons.math.linear.SparseRealVector(org.apache.commons.math.linear.SparseRealVector.this, 1);
		res.setEntry(virtualSize, d);
		return res;
	}

	public org.apache.commons.math.linear.RealVector append(double[] a) {
		org.apache.commons.math.linear.RealVector res = new org.apache.commons.math.linear.SparseRealVector(org.apache.commons.math.linear.SparseRealVector.this, a.length);
		for (int i = 0; i < (a.length); i++) {
			res.setEntry((i + (virtualSize)), a[i]);
		}
		return res;
	}

	public org.apache.commons.math.linear.RealVector copy() {
		return new org.apache.commons.math.linear.SparseRealVector(org.apache.commons.math.linear.SparseRealVector.this);
	}

	public double dotProduct(org.apache.commons.math.linear.RealVector v) throws java.lang.IllegalArgumentException {
		checkVectorDimensions(v.getDimension());
		double res = 0;
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			res += (v.getEntry(iter.key())) * (iter.value());
		} 
		return res;
	}

	public double dotProduct(double[] v) throws java.lang.IllegalArgumentException {
		checkVectorDimensions(v.length);
		double res = 0;
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			int idx = iter.key();
			double value = 0;
			if (idx < (v.length)) {
				value = v[idx];
			}
			res += value * (iter.value());
		} 
		return res;
	}

	public org.apache.commons.math.linear.RealVector ebeDivide(org.apache.commons.math.linear.RealVector v) throws java.lang.IllegalArgumentException {
		checkVectorDimensions(v.getDimension());
		org.apache.commons.math.linear.SparseRealVector res = new org.apache.commons.math.linear.SparseRealVector(org.apache.commons.math.linear.SparseRealVector.this);
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = res.entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			res.setEntry(iter.key(), ((iter.value()) / (v.getEntry(iter.key()))));
		} 
		return res;
	}

	public org.apache.commons.math.linear.RealVector ebeDivide(double[] v) throws java.lang.IllegalArgumentException {
		checkVectorDimensions(v.length);
		org.apache.commons.math.linear.SparseRealVector res = new org.apache.commons.math.linear.SparseRealVector(org.apache.commons.math.linear.SparseRealVector.this);
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = res.entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			res.setEntry(iter.key(), ((iter.value()) / (v[iter.key()])));
		} 
		return null;
	}

	public org.apache.commons.math.linear.RealVector ebeMultiply(org.apache.commons.math.linear.RealVector v) throws java.lang.IllegalArgumentException {
		checkVectorDimensions(v.getDimension());
		org.apache.commons.math.linear.SparseRealVector res = new org.apache.commons.math.linear.SparseRealVector(org.apache.commons.math.linear.SparseRealVector.this);
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = res.entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			res.setEntry(iter.key(), ((iter.value()) * (v.getEntry(iter.key()))));
		} 
		return res;
	}

	public org.apache.commons.math.linear.RealVector ebeMultiply(double[] v) throws java.lang.IllegalArgumentException {
		checkVectorDimensions(v.length);
		org.apache.commons.math.linear.SparseRealVector res = new org.apache.commons.math.linear.SparseRealVector(org.apache.commons.math.linear.SparseRealVector.this);
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = res.entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			res.setEntry(iter.key(), ((iter.value()) * (v[iter.key()])));
		} 
		return res;
	}

	public org.apache.commons.math.linear.RealVector getSubVector(int index, int n) throws org.apache.commons.math.linear.MatrixIndexException {
		checkIndex(index);
		checkIndex(((index + n) - 1));
		org.apache.commons.math.linear.SparseRealVector res = new org.apache.commons.math.linear.SparseRealVector(n);
		int end = index + n;
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			int key = iter.key();
			if ((key >= index) && (key < end)) {
				res.setEntry((key - index), iter.value());
			}
		} 
		return res;
	}

	public double[] getData() {
		double[] res = new double[virtualSize];
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			res[iter.key()] = iter.value();
		} 
		return res;
	}

	public int getDimension() {
		return virtualSize;
	}

	public double getDistance(org.apache.commons.math.linear.SparseRealVector v) throws java.lang.IllegalArgumentException {
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
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
		return java.lang.Math.sqrt(res);
	}

	public double getDistance(org.apache.commons.math.linear.RealVector v) throws java.lang.IllegalArgumentException {
		checkVectorDimensions(v.getDimension());
		if (v instanceof org.apache.commons.math.linear.SparseRealVector) {
			return getDistance(((org.apache.commons.math.linear.SparseRealVector) (v)));
		}
		return getDistance(v.getData());
	}

	public double getDistance(double[] v) throws java.lang.IllegalArgumentException {
		checkVectorDimensions(v.length);
		double res = 0;
		for (int i = 0; i < (v.length); i++) {
			double delta = (entries.get(i)) - (v[i]);
			res += delta * delta;
		}
		return java.lang.Math.sqrt(res);
	}

	public double getEntry(int index) throws org.apache.commons.math.linear.MatrixIndexException {
		checkIndex(index);
		return entries.get(index);
	}

	public double getL1Distance(org.apache.commons.math.linear.SparseRealVector v) {
		double max = 0;
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			double delta = java.lang.Math.abs(((iter.value()) - (v.getEntry(iter.key()))));
			max += delta;
		} 
		iter = v.getEntries().iterator();
		while (iter.hasNext()) {
			iter.advance();
			int key = iter.key();
			if (!(entries.containsKey(key))) {
				double delta = java.lang.Math.abs(iter.value());
				max += java.lang.Math.abs(delta);
			}
		} 
		return max;
	}

	public double getL1Distance(org.apache.commons.math.linear.RealVector v) throws java.lang.IllegalArgumentException {
		checkVectorDimensions(v.getDimension());
		if (v instanceof org.apache.commons.math.linear.SparseRealVector) {
			return getL1Distance(((org.apache.commons.math.linear.SparseRealVector) (v)));
		}
		return getL1Distance(v.getData());
	}

	public double getL1Distance(double[] v) throws java.lang.IllegalArgumentException {
		checkVectorDimensions(v.length);
		double max = 0;
		for (int i = 0; i < (v.length); i++) {
			double delta = java.lang.Math.abs(((getEntry(i)) - (v[i])));
			max += delta;
		}
		return max;
	}

	public double getL1Norm() {
		double res = 0;
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			res += java.lang.Math.abs(iter.value());
		} 
		return res;
	}

	private double getLInfDistance(org.apache.commons.math.linear.SparseRealVector v) {
		double max = 0;
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			double delta = java.lang.Math.abs(((iter.value()) - (v.getEntry(iter.key()))));
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

	public double getLInfDistance(org.apache.commons.math.linear.RealVector v) throws java.lang.IllegalArgumentException {
		checkVectorDimensions(v.getDimension());
		if (v instanceof org.apache.commons.math.linear.SparseRealVector) {
			return getLInfDistance(((org.apache.commons.math.linear.SparseRealVector) (v)));
		}
		return getLInfDistance(v.getData());
	}

	public double getLInfDistance(double[] v) throws java.lang.IllegalArgumentException {
		checkVectorDimensions(v.length);
		double max = 0;
		for (int i = 0; i < (v.length); i++) {
			double delta = java.lang.Math.abs(((getEntry(i)) - (v[i])));
			if (delta > max) {
				max = delta;
			}
		}
		return max;
	}

	public double getLInfNorm() {
		double max = 0;
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			max += iter.value();
		} 
		return max;
	}

	public double getNorm() {
		double res = 0;
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			res += (iter.value()) * (iter.value());
		} 
		return java.lang.Math.sqrt(res);
	}

	public boolean isInfinite() {
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			if (java.lang.Double.isInfinite(iter.value())) {
				return true;
			}
		} 
		return false;
	}

	public boolean isNaN() {
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			if (java.lang.Double.isNaN(iter.value())) {
				return true;
			}
		} 
		return false;
	}

	public org.apache.commons.math.linear.RealVector mapAbs() {
		return copy().mapAbsToSelf();
	}

	public org.apache.commons.math.linear.RealVector mapAbsToSelf() {
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			entries.put(iter.key(), java.lang.Math.abs(iter.value()));
		} 
		return org.apache.commons.math.linear.SparseRealVector.this;
	}

	public org.apache.commons.math.linear.RealVector mapAcos() {
		return copy().mapAcosToSelf();
	}

	public org.apache.commons.math.linear.RealVector mapAcosToSelf() {
		for (int i = 0; i < (virtualSize); i++) {
			setEntry(i, java.lang.Math.acos(getEntry(i)));
		}
		return org.apache.commons.math.linear.SparseRealVector.this;
	}

	public org.apache.commons.math.linear.RealVector mapAdd(double d) {
		return copy().mapAddToSelf(d);
	}

	public org.apache.commons.math.linear.RealVector mapAddToSelf(double d) {
		for (int i = 0; i < (virtualSize); i++) {
			setEntry(i, ((getEntry(i)) + d));
		}
		return org.apache.commons.math.linear.SparseRealVector.this;
	}

	public org.apache.commons.math.linear.RealVector mapAsin() {
		return copy().mapAsinToSelf();
	}

	public org.apache.commons.math.linear.RealVector mapAsinToSelf() {
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			entries.put(iter.key(), java.lang.Math.asin(iter.value()));
		} 
		return org.apache.commons.math.linear.SparseRealVector.this;
	}

	public org.apache.commons.math.linear.RealVector mapAtan() {
		return copy().mapAtanToSelf();
	}

	public org.apache.commons.math.linear.RealVector mapAtanToSelf() {
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			entries.put(iter.key(), java.lang.Math.atan(iter.value()));
		} 
		return org.apache.commons.math.linear.SparseRealVector.this;
	}

	public org.apache.commons.math.linear.RealVector mapCbrt() {
		return copy().mapCbrtToSelf();
	}

	public org.apache.commons.math.linear.RealVector mapCbrtToSelf() {
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			entries.put(iter.key(), java.lang.Math.cbrt(iter.value()));
		} 
		return org.apache.commons.math.linear.SparseRealVector.this;
	}

	public org.apache.commons.math.linear.RealVector mapCeil() {
		return copy().mapCeilToSelf();
	}

	public org.apache.commons.math.linear.RealVector mapCeilToSelf() {
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			entries.put(iter.key(), java.lang.Math.ceil(iter.value()));
		} 
		return org.apache.commons.math.linear.SparseRealVector.this;
	}

	public org.apache.commons.math.linear.RealVector mapCos() {
		return copy().mapCosToSelf();
	}

	public org.apache.commons.math.linear.RealVector mapCosToSelf() {
		for (int i = 0; i < (virtualSize); i++) {
			setEntry(i, java.lang.Math.cos(getEntry(i)));
		}
		return org.apache.commons.math.linear.SparseRealVector.this;
	}

	public org.apache.commons.math.linear.RealVector mapCosh() {
		return copy().mapCoshToSelf();
	}

	public org.apache.commons.math.linear.RealVector mapCoshToSelf() {
		for (int i = 0; i < (virtualSize); i++) {
			setEntry(i, java.lang.Math.cosh(getEntry(i)));
		}
		return org.apache.commons.math.linear.SparseRealVector.this;
	}

	public org.apache.commons.math.linear.RealVector mapDivide(double d) {
		return copy().mapDivideToSelf(d);
	}

	public org.apache.commons.math.linear.RealVector mapDivideToSelf(double d) {
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			entries.put(iter.key(), ((iter.value()) / d));
		} 
		return org.apache.commons.math.linear.SparseRealVector.this;
	}

	public org.apache.commons.math.linear.RealVector mapExp() {
		return copy().mapExpToSelf();
	}

	public org.apache.commons.math.linear.RealVector mapExpToSelf() {
		for (int i = 0; i < (virtualSize); i++) {
			entries.put(i, java.lang.Math.exp(entries.get(i)));
		}
		return org.apache.commons.math.linear.SparseRealVector.this;
	}

	public org.apache.commons.math.linear.RealVector mapExpm1() {
		return copy().mapExpm1ToSelf();
	}

	public org.apache.commons.math.linear.RealVector mapExpm1ToSelf() {
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			entries.put(iter.key(), java.lang.Math.expm1(iter.value()));
		} 
		return org.apache.commons.math.linear.SparseRealVector.this;
	}

	public org.apache.commons.math.linear.RealVector mapFloor() {
		return copy().mapFloorToSelf();
	}

	public org.apache.commons.math.linear.RealVector mapFloorToSelf() {
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			entries.put(iter.key(), java.lang.Math.floor(iter.value()));
		} 
		return org.apache.commons.math.linear.SparseRealVector.this;
	}

	public org.apache.commons.math.linear.RealVector mapInv() {
		return copy().mapInvToSelf();
	}

	public org.apache.commons.math.linear.RealVector mapInvToSelf() {
		for (int i = 0; i < (virtualSize); i++) {
			setEntry(i, (1.0 / (getEntry(i))));
		}
		return org.apache.commons.math.linear.SparseRealVector.this;
	}

	public org.apache.commons.math.linear.RealVector mapLog() {
		return copy().mapLogToSelf();
	}

	public org.apache.commons.math.linear.RealVector mapLog10() {
		return copy().mapLog10ToSelf();
	}

	public org.apache.commons.math.linear.RealVector mapLog10ToSelf() {
		for (int i = 0; i < (virtualSize); i++) {
			setEntry(i, java.lang.Math.log10(getEntry(i)));
		}
		return org.apache.commons.math.linear.SparseRealVector.this;
	}

	public org.apache.commons.math.linear.RealVector mapLog1p() {
		return copy().mapLog1pToSelf();
	}

	public org.apache.commons.math.linear.RealVector mapLog1pToSelf() {
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			entries.put(iter.key(), java.lang.Math.log1p(iter.value()));
		} 
		return org.apache.commons.math.linear.SparseRealVector.this;
	}

	public org.apache.commons.math.linear.RealVector mapLogToSelf() {
		for (int i = 0; i < (virtualSize); i++) {
			setEntry(i, java.lang.Math.log(getEntry(i)));
		}
		return org.apache.commons.math.linear.SparseRealVector.this;
	}

	public org.apache.commons.math.linear.RealVector mapMultiply(double d) {
		return copy().mapMultiplyToSelf(d);
	}

	public org.apache.commons.math.linear.RealVector mapMultiplyToSelf(double d) {
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			entries.put(iter.key(), ((iter.value()) * d));
		} 
		return org.apache.commons.math.linear.SparseRealVector.this;
	}

	public org.apache.commons.math.linear.RealVector mapPow(double d) {
		return copy().mapPowToSelf(d);
	}

	public org.apache.commons.math.linear.RealVector mapPowToSelf(double d) {
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			entries.put(iter.key(), java.lang.Math.pow(iter.value(), d));
		} 
		return org.apache.commons.math.linear.SparseRealVector.this;
	}

	public org.apache.commons.math.linear.RealVector mapRint() {
		return copy().mapRintToSelf();
	}

	public org.apache.commons.math.linear.RealVector mapRintToSelf() {
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			entries.put(iter.key(), java.lang.Math.rint(iter.value()));
		} 
		return org.apache.commons.math.linear.SparseRealVector.this;
	}

	public org.apache.commons.math.linear.RealVector mapSignum() {
		return copy().mapSignumToSelf();
	}

	public org.apache.commons.math.linear.RealVector mapSignumToSelf() {
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			entries.put(iter.key(), java.lang.Math.signum(iter.value()));
		} 
		return org.apache.commons.math.linear.SparseRealVector.this;
	}

	public org.apache.commons.math.linear.RealVector mapSin() {
		return copy().mapSinToSelf();
	}

	public org.apache.commons.math.linear.RealVector mapSinToSelf() {
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			entries.put(iter.key(), java.lang.Math.sin(iter.value()));
		} 
		return org.apache.commons.math.linear.SparseRealVector.this;
	}

	public org.apache.commons.math.linear.RealVector mapSinh() {
		return copy().mapSinhToSelf();
	}

	public org.apache.commons.math.linear.RealVector mapSinhToSelf() {
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			entries.put(iter.key(), java.lang.Math.sinh(iter.value()));
		} 
		return org.apache.commons.math.linear.SparseRealVector.this;
	}

	public org.apache.commons.math.linear.RealVector mapSqrt() {
		return copy().mapSqrtToSelf();
	}

	public org.apache.commons.math.linear.RealVector mapSqrtToSelf() {
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			entries.put(iter.key(), java.lang.Math.sqrt(iter.value()));
		} 
		return org.apache.commons.math.linear.SparseRealVector.this;
	}

	public org.apache.commons.math.linear.RealVector mapSubtract(double d) {
		return copy().mapSubtractToSelf(d);
	}

	public org.apache.commons.math.linear.RealVector mapSubtractToSelf(double d) {
		return mapAddToSelf((-d));
	}

	public org.apache.commons.math.linear.RealVector mapTan() {
		return copy().mapTanToSelf();
	}

	public org.apache.commons.math.linear.RealVector mapTanToSelf() {
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			entries.put(iter.key(), java.lang.Math.tan(iter.value()));
		} 
		return org.apache.commons.math.linear.SparseRealVector.this;
	}

	public org.apache.commons.math.linear.RealVector mapTanh() {
		return copy().mapTanhToSelf();
	}

	public org.apache.commons.math.linear.RealVector mapTanhToSelf() {
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			entries.put(iter.key(), java.lang.Math.tanh(iter.value()));
		} 
		return org.apache.commons.math.linear.SparseRealVector.this;
	}

	public org.apache.commons.math.linear.RealVector mapUlp() {
		return copy().mapUlpToSelf();
	}

	public org.apache.commons.math.linear.RealVector mapUlpToSelf() {
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			entries.put(iter.key(), java.lang.Math.ulp(iter.value()));
		} 
		return org.apache.commons.math.linear.SparseRealVector.this;
	}

	public org.apache.commons.math.linear.SparseRealMatrix outerproduct(org.apache.commons.math.linear.SparseRealVector v) throws java.lang.IllegalArgumentException {
		checkVectorDimensions(v.getDimension());
		org.apache.commons.math.linear.SparseRealMatrix res = new org.apache.commons.math.linear.SparseRealMatrix(virtualSize, virtualSize);
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter2 = v.getEntries().iterator();
			while (iter2.hasNext()) {
				iter2.advance();
				res.setEntry(iter.key(), iter2.key(), ((iter.value()) * (iter2.value())));
			} 
		} 
		return res;
	}

	public org.apache.commons.math.linear.RealMatrix outerProduct(org.apache.commons.math.linear.RealVector v) throws java.lang.IllegalArgumentException {
		checkVectorDimensions(v.getDimension());
		if (v instanceof org.apache.commons.math.linear.SparseRealVector) {
			return outerproduct(((org.apache.commons.math.linear.SparseRealVector) (v)));
		}
		org.apache.commons.math.linear.RealMatrix res = new org.apache.commons.math.linear.SparseRealMatrix(virtualSize, virtualSize);
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			int row = iter.key();
			for (int col = 0; col < (virtualSize); col++) {
				res.setEntry(row, col, ((iter.value()) * (v.getEntry(col))));
			}
		} 
		return res;
	}

	public org.apache.commons.math.linear.RealMatrix outerProduct(double[] v) throws java.lang.IllegalArgumentException {
		checkVectorDimensions(v.length);
		org.apache.commons.math.linear.RealMatrix res = new org.apache.commons.math.linear.SparseRealMatrix(virtualSize, virtualSize);
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			int row = iter.key();
			double value = iter.value();
			for (int col = 0; col < (virtualSize); col++) {
				res.setEntry(row, col, (value * (v[col])));
			}
		} 
		return res;
	}

	public org.apache.commons.math.linear.RealVector projection(org.apache.commons.math.linear.RealVector v) throws java.lang.IllegalArgumentException {
		checkVectorDimensions(v.getDimension());
		return v.mapMultiply(((dotProduct(v)) / (v.dotProduct(v))));
	}

	public org.apache.commons.math.linear.RealVector projection(double[] v) throws java.lang.IllegalArgumentException {
		checkVectorDimensions(v.length);
		return projection(new org.apache.commons.math.linear.SparseRealVector(v));
	}

	public void setEntry(int index, double value) throws org.apache.commons.math.linear.MatrixIndexException {
		checkIndex(index);
		if (!(isZero(value))) {
			entries.put(index, value);
		}else
			if (entries.containsKey(index)) {
				entries.remove(index);
			}
		
	}

	public void setSubVector(int index, org.apache.commons.math.linear.RealVector v) throws org.apache.commons.math.linear.MatrixIndexException {
		checkIndex(index);
		checkIndex(((index + (v.getDimension())) - 1));
		setSubVector(index, v.getData());
	}

	public void setSubVector(int index, double[] v) throws org.apache.commons.math.linear.MatrixIndexException {
		checkIndex(index);
		checkIndex(((index + (v.length)) - 1));
		for (int i = 0; i < (v.length); i++) {
			setEntry((i + index), v[i]);
		}
	}

	public void set(double value) {
		for (int i = 0; i < (virtualSize); i++) {
			setEntry(i, value);
		}
	}

	public org.apache.commons.math.linear.SparseRealVector subtract(org.apache.commons.math.linear.SparseRealVector v) throws java.lang.IllegalArgumentException {
		checkVectorDimensions(v.getDimension());
		org.apache.commons.math.linear.SparseRealVector res = ((org.apache.commons.math.linear.SparseRealVector) (copy()));
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = v.getEntries().iterator();
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

	public org.apache.commons.math.linear.RealVector subtract(org.apache.commons.math.linear.RealVector v) throws java.lang.IllegalArgumentException {
		checkVectorDimensions(v.getDimension());
		if (v instanceof org.apache.commons.math.linear.SparseRealVector) {
			return subtract(((org.apache.commons.math.linear.SparseRealVector) (v)));
		}
		return subtract(v.getData());
	}

	public org.apache.commons.math.linear.RealVector subtract(double[] v) throws java.lang.IllegalArgumentException {
		checkVectorDimensions(v.length);
		org.apache.commons.math.linear.SparseRealVector res = new org.apache.commons.math.linear.SparseRealVector(org.apache.commons.math.linear.SparseRealVector.this);
		for (int i = 0; i < (v.length); i++) {
			if (entries.containsKey(i)) {
				res.setEntry(i, ((entries.get(i)) - (v[i])));
			}else {
				res.setEntry(i, (-(v[i])));
			}
		}
		return res;
	}

	public org.apache.commons.math.linear.RealVector unitVector() {
		org.apache.commons.math.linear.RealVector res = copy();
		res.unitize();
		return res;
	}

	public void unitize() {
		double norm = getNorm();
		if (isZero(norm)) {
			throw org.apache.commons.math.MathRuntimeException.createArithmeticException("cannot normalize a zero norm vector");
		}
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			entries.put(iter.key(), ((iter.value()) / norm));
		} 
	}

	private void checkIndex(final int index) throws org.apache.commons.math.linear.MatrixIndexException {
		if ((index < 0) || (index >= (getDimension()))) {
			throw new org.apache.commons.math.linear.MatrixIndexException("index {0} out of allowed range [{1}, {2}]", index, 0, ((getDimension()) - 1));
		}
	}

	protected void checkVectorDimensions(int n) throws java.lang.IllegalArgumentException {
		if ((getDimension()) != n) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("vector length mismatch: got {0} but expected {1}", getDimension(), n);
		}
	}

	public double[] toArray() {
		return getData();
	}

	@java.lang.Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = java.lang.Double.doubleToLongBits(epsilon);
		result = (prime * result) + ((int) (temp ^ (temp >>> 32)));
		result = (prime * result) + (virtualSize);
		return result;
	}

	@java.lang.Override
	public boolean equals(java.lang.Object obj) {
		if ((org.apache.commons.math.linear.SparseRealVector.this) == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof org.apache.commons.math.linear.SparseRealVector)) {
			return false;
		}
		org.apache.commons.math.linear.SparseRealVector other = ((org.apache.commons.math.linear.SparseRealVector) (obj));
		if ((virtualSize) != (other.virtualSize)) {
			return false;
		}
		if ((java.lang.Double.doubleToLongBits(epsilon)) != (java.lang.Double.doubleToLongBits(other.epsilon))) {
			return false;
		}
		org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			double test = (iter.value()) - (other.getEntry(iter.key()));
			if ((java.lang.Math.abs(test)) > (epsilon)) {
				return false;
			}
		} 
		iter = other.getEntries().iterator();
		while (iter.hasNext()) {
			iter.advance();
			double test = (iter.value()) - (getEntry(iter.key()));
			if (!(isZero(test))) {
				return false;
			}
		} 
		return true;
	}
}

