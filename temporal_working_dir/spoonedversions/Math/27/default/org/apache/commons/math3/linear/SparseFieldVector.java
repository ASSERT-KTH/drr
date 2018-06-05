

package org.apache.commons.math3.linear;


public class SparseFieldVector<T extends org.apache.commons.math3.FieldElement<T>> implements java.io.Serializable , org.apache.commons.math3.linear.FieldVector<T> {
	private static final long serialVersionUID = 7841233292190413362L;

	private final org.apache.commons.math3.Field<T> field;

	private final org.apache.commons.math3.util.OpenIntToFieldHashMap<T> entries;

	private final int virtualSize;

	public SparseFieldVector(org.apache.commons.math3.Field<T> field) {
		this(field, 0);
	}

	public SparseFieldVector(org.apache.commons.math3.Field<T> field, int dimension) {
		this.field = field;
		virtualSize = dimension;
		entries = new org.apache.commons.math3.util.OpenIntToFieldHashMap<T>(field);
	}

	protected SparseFieldVector(org.apache.commons.math3.linear.SparseFieldVector<T> v, int resize) {
		field = v.field;
		virtualSize = (v.getDimension()) + resize;
		entries = new org.apache.commons.math3.util.OpenIntToFieldHashMap<T>(v.entries);
	}

	public SparseFieldVector(org.apache.commons.math3.Field<T> field, int dimension, int expectedSize) {
		this.field = field;
		virtualSize = dimension;
		entries = new org.apache.commons.math3.util.OpenIntToFieldHashMap<T>(field, expectedSize);
	}

	public SparseFieldVector(org.apache.commons.math3.Field<T> field, T[] values) {
		this.field = field;
		virtualSize = values.length;
		entries = new org.apache.commons.math3.util.OpenIntToFieldHashMap<T>(field);
		for (int key = 0; key < (values.length); key++) {
			T value = values[key];
			entries.put(key, value);
		}
	}

	public SparseFieldVector(org.apache.commons.math3.linear.SparseFieldVector<T> v) {
		field = v.field;
		virtualSize = v.getDimension();
		entries = new org.apache.commons.math3.util.OpenIntToFieldHashMap<T>(v.getEntries());
	}

	private org.apache.commons.math3.util.OpenIntToFieldHashMap<T> getEntries() {
		return entries;
	}

	public org.apache.commons.math3.linear.FieldVector<T> add(org.apache.commons.math3.linear.SparseFieldVector<T> v) {
		checkVectorDimensions(v.getDimension());
		org.apache.commons.math3.linear.SparseFieldVector<T> res = ((org.apache.commons.math3.linear.SparseFieldVector<T>) (copy()));
		org.apache.commons.math3.util.OpenIntToFieldHashMap<T>.Iterator iter = v.getEntries().iterator();
		while (iter.hasNext()) {
			iter.advance();
			int key = iter.key();
			T value = iter.value();
			if (entries.containsKey(key)) {
				res.setEntry(key, entries.get(key).add(value));
			}else {
				res.setEntry(key, value);
			}
		} 
		return res;
	}

	public org.apache.commons.math3.linear.FieldVector<T> append(org.apache.commons.math3.linear.SparseFieldVector<T> v) {
		org.apache.commons.math3.linear.SparseFieldVector<T> res = new org.apache.commons.math3.linear.SparseFieldVector<T>(org.apache.commons.math3.linear.SparseFieldVector.this, v.getDimension());
		org.apache.commons.math3.util.OpenIntToFieldHashMap<T>.Iterator iter = v.entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			res.setEntry(((iter.key()) + (virtualSize)), iter.value());
		} 
		return res;
	}

	public org.apache.commons.math3.linear.FieldVector<T> append(org.apache.commons.math3.linear.FieldVector<T> v) {
		if (v instanceof org.apache.commons.math3.linear.SparseFieldVector<?>) {
			return append(((org.apache.commons.math3.linear.SparseFieldVector<T>) (v)));
		}else {
			final int n = v.getDimension();
			org.apache.commons.math3.linear.FieldVector<T> res = new org.apache.commons.math3.linear.SparseFieldVector<T>(org.apache.commons.math3.linear.SparseFieldVector.this, n);
			for (int i = 0; i < n; i++) {
				res.setEntry((i + (virtualSize)), v.getEntry(i));
			}
			return res;
		}
	}

	public org.apache.commons.math3.linear.FieldVector<T> append(T d) {
		org.apache.commons.math3.linear.FieldVector<T> res = new org.apache.commons.math3.linear.SparseFieldVector<T>(org.apache.commons.math3.linear.SparseFieldVector.this, 1);
		res.setEntry(virtualSize, d);
		return res;
	}

	public org.apache.commons.math3.linear.FieldVector<T> copy() {
		return new org.apache.commons.math3.linear.SparseFieldVector<T>(org.apache.commons.math3.linear.SparseFieldVector.this);
	}

	public T dotProduct(org.apache.commons.math3.linear.FieldVector<T> v) {
		checkVectorDimensions(v.getDimension());
		T res = field.getZero();
		org.apache.commons.math3.util.OpenIntToFieldHashMap<T>.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			res = res.add(v.getEntry(iter.key()).multiply(iter.value()));
		} 
		return res;
	}

	public org.apache.commons.math3.linear.FieldVector<T> ebeDivide(org.apache.commons.math3.linear.FieldVector<T> v) {
		checkVectorDimensions(v.getDimension());
		org.apache.commons.math3.linear.SparseFieldVector<T> res = new org.apache.commons.math3.linear.SparseFieldVector<T>(org.apache.commons.math3.linear.SparseFieldVector.this);
		org.apache.commons.math3.util.OpenIntToFieldHashMap<T>.Iterator iter = res.entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			res.setEntry(iter.key(), iter.value().divide(v.getEntry(iter.key())));
		} 
		return res;
	}

	public org.apache.commons.math3.linear.FieldVector<T> ebeMultiply(org.apache.commons.math3.linear.FieldVector<T> v) {
		checkVectorDimensions(v.getDimension());
		org.apache.commons.math3.linear.SparseFieldVector<T> res = new org.apache.commons.math3.linear.SparseFieldVector<T>(org.apache.commons.math3.linear.SparseFieldVector.this);
		org.apache.commons.math3.util.OpenIntToFieldHashMap<T>.Iterator iter = res.entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			res.setEntry(iter.key(), iter.value().multiply(v.getEntry(iter.key())));
		} 
		return res;
	}

	public T[] getData() {
		T[] res = buildArray(virtualSize);
		org.apache.commons.math3.util.OpenIntToFieldHashMap<T>.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			res[iter.key()] = iter.value();
		} 
		return res;
	}

	public int getDimension() {
		return virtualSize;
	}

	public T getEntry(int index) {
		checkIndex(index);
		return entries.get(index);
	}

	public org.apache.commons.math3.Field<T> getField() {
		return field;
	}

	public org.apache.commons.math3.linear.FieldVector<T> getSubVector(int index, int n) {
		checkIndex(index);
		checkIndex(((index + n) - 1));
		org.apache.commons.math3.linear.SparseFieldVector<T> res = new org.apache.commons.math3.linear.SparseFieldVector<T>(field, n);
		int end = index + n;
		org.apache.commons.math3.util.OpenIntToFieldHashMap<T>.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			int key = iter.key();
			if ((key >= index) && (key < end)) {
				res.setEntry((key - index), iter.value());
			}
		} 
		return res;
	}

	public org.apache.commons.math3.linear.FieldVector<T> mapAdd(T d) {
		return copy().mapAddToSelf(d);
	}

	public org.apache.commons.math3.linear.FieldVector<T> mapAddToSelf(T d) {
		for (int i = 0; i < (virtualSize); i++) {
			setEntry(i, getEntry(i).add(d));
		}
		return org.apache.commons.math3.linear.SparseFieldVector.this;
	}

	public org.apache.commons.math3.linear.FieldVector<T> mapDivide(T d) {
		return copy().mapDivideToSelf(d);
	}

	public org.apache.commons.math3.linear.FieldVector<T> mapDivideToSelf(T d) {
		org.apache.commons.math3.util.OpenIntToFieldHashMap<T>.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			entries.put(iter.key(), iter.value().divide(d));
		} 
		return org.apache.commons.math3.linear.SparseFieldVector.this;
	}

	public org.apache.commons.math3.linear.FieldVector<T> mapInv() {
		return copy().mapInvToSelf();
	}

	public org.apache.commons.math3.linear.FieldVector<T> mapInvToSelf() {
		for (int i = 0; i < (virtualSize); i++) {
			setEntry(i, field.getOne().divide(getEntry(i)));
		}
		return org.apache.commons.math3.linear.SparseFieldVector.this;
	}

	public org.apache.commons.math3.linear.FieldVector<T> mapMultiply(T d) {
		return copy().mapMultiplyToSelf(d);
	}

	public org.apache.commons.math3.linear.FieldVector<T> mapMultiplyToSelf(T d) {
		org.apache.commons.math3.util.OpenIntToFieldHashMap<T>.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			entries.put(iter.key(), iter.value().multiply(d));
		} 
		return org.apache.commons.math3.linear.SparseFieldVector.this;
	}

	public org.apache.commons.math3.linear.FieldVector<T> mapSubtract(T d) {
		return copy().mapSubtractToSelf(d);
	}

	public org.apache.commons.math3.linear.FieldVector<T> mapSubtractToSelf(T d) {
		return mapAddToSelf(field.getZero().subtract(d));
	}

	public org.apache.commons.math3.linear.FieldMatrix<T> outerProduct(org.apache.commons.math3.linear.SparseFieldVector<T> v) {
		final int n = v.getDimension();
		org.apache.commons.math3.linear.SparseFieldMatrix<T> res = new org.apache.commons.math3.linear.SparseFieldMatrix<T>(field, virtualSize, n);
		org.apache.commons.math3.util.OpenIntToFieldHashMap<T>.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			org.apache.commons.math3.util.OpenIntToFieldHashMap<T>.Iterator iter2 = v.entries.iterator();
			while (iter2.hasNext()) {
				iter2.advance();
				res.setEntry(iter.key(), iter2.key(), iter.value().multiply(iter2.value()));
			} 
		} 
		return res;
	}

	public org.apache.commons.math3.linear.FieldMatrix<T> outerProduct(org.apache.commons.math3.linear.FieldVector<T> v) {
		if (v instanceof org.apache.commons.math3.linear.SparseFieldVector<?>) {
			return outerProduct(((org.apache.commons.math3.linear.SparseFieldVector<T>) (v)));
		}else {
			final int n = v.getDimension();
			org.apache.commons.math3.linear.FieldMatrix<T> res = new org.apache.commons.math3.linear.SparseFieldMatrix<T>(field, virtualSize, n);
			org.apache.commons.math3.util.OpenIntToFieldHashMap<T>.Iterator iter = entries.iterator();
			while (iter.hasNext()) {
				iter.advance();
				int row = iter.key();
				org.apache.commons.math3.FieldElement<T> value = iter.value();
				for (int col = 0; col < n; col++) {
					res.setEntry(row, col, value.multiply(v.getEntry(col)));
				}
			} 
			return res;
		}
	}

	public org.apache.commons.math3.linear.FieldVector<T> projection(org.apache.commons.math3.linear.FieldVector<T> v) {
		checkVectorDimensions(v.getDimension());
		return v.mapMultiply(dotProduct(v).divide(v.dotProduct(v)));
	}

	public void set(T value) {
		for (int i = 0; i < (virtualSize); i++) {
			setEntry(i, value);
		}
	}

	public void setEntry(int index, T value) {
		checkIndex(index);
		entries.put(index, value);
	}

	public void setSubVector(int index, org.apache.commons.math3.linear.FieldVector<T> v) {
		checkIndex(index);
		checkIndex(((index + (v.getDimension())) - 1));
		final int n = v.getDimension();
		for (int i = 0; i < n; i++) {
			setEntry((i + index), v.getEntry(i));
		}
	}

	public org.apache.commons.math3.linear.SparseFieldVector<T> subtract(org.apache.commons.math3.linear.SparseFieldVector<T> v) {
		checkVectorDimensions(v.getDimension());
		org.apache.commons.math3.linear.SparseFieldVector<T> res = ((org.apache.commons.math3.linear.SparseFieldVector<T>) (copy()));
		org.apache.commons.math3.util.OpenIntToFieldHashMap<T>.Iterator iter = v.getEntries().iterator();
		while (iter.hasNext()) {
			iter.advance();
			int key = iter.key();
			if (entries.containsKey(key)) {
				res.setEntry(key, entries.get(key).subtract(iter.value()));
			}else {
				res.setEntry(key, field.getZero().subtract(iter.value()));
			}
		} 
		return res;
	}

	public org.apache.commons.math3.linear.FieldVector<T> subtract(org.apache.commons.math3.linear.FieldVector<T> v) {
		if (v instanceof org.apache.commons.math3.linear.SparseFieldVector<?>) {
			return subtract(((org.apache.commons.math3.linear.SparseFieldVector<T>) (v)));
		}else {
			final int n = v.getDimension();
			checkVectorDimensions(n);
			org.apache.commons.math3.linear.SparseFieldVector<T> res = new org.apache.commons.math3.linear.SparseFieldVector<T>(org.apache.commons.math3.linear.SparseFieldVector.this);
			for (int i = 0; i < n; i++) {
				if (entries.containsKey(i)) {
					res.setEntry(i, entries.get(i).subtract(v.getEntry(i)));
				}else {
					res.setEntry(i, field.getZero().subtract(v.getEntry(i)));
				}
			}
			return res;
		}
	}

	public T[] toArray() {
		return getData();
	}

	private void checkIndex(final int index) {
		if ((index < 0) || (index >= (getDimension()))) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(index, 0, ((getDimension()) - 1));
		}
	}

	protected void checkVectorDimensions(int n) {
		if ((getDimension()) != n) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(getDimension(), n);
		}
	}

	public org.apache.commons.math3.linear.FieldVector<T> add(org.apache.commons.math3.linear.FieldVector<T> v) {
		if (v instanceof org.apache.commons.math3.linear.SparseFieldVector<?>) {
			return add(((org.apache.commons.math3.linear.SparseFieldVector<T>) (v)));
		}else {
			final int n = v.getDimension();
			checkVectorDimensions(n);
			org.apache.commons.math3.linear.SparseFieldVector<T> res = new org.apache.commons.math3.linear.SparseFieldVector<T>(field, getDimension());
			for (int i = 0; i < n; i++) {
				res.setEntry(i, v.getEntry(i).add(getEntry(i)));
			}
			return res;
		}
	}

	@java.lang.SuppressWarnings(value = "unchecked")
	private T[] buildArray(final int length) {
		return ((T[]) (java.lang.reflect.Array.newInstance(field.getRuntimeClass(), length)));
	}

	@java.lang.Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + ((field) == null ? 0 : field.hashCode());
		result = (prime * result) + (virtualSize);
		org.apache.commons.math3.util.OpenIntToFieldHashMap<T>.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			int temp = iter.value().hashCode();
			result = (prime * result) + temp;
		} 
		return result;
	}

	@java.lang.Override
	public boolean equals(java.lang.Object obj) {
		if ((org.apache.commons.math3.linear.SparseFieldVector.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.apache.commons.math3.linear.SparseFieldVector<?>)) {
			return false;
		}
		@java.lang.SuppressWarnings(value = "unchecked")
		org.apache.commons.math3.linear.SparseFieldVector<T> other = ((org.apache.commons.math3.linear.SparseFieldVector<T>) (obj));
		if ((field) == null) {
			if ((other.field) != null) {
				return false;
			}
		}else
			if (!(field.equals(other.field))) {
				return false;
			}
		
		if ((virtualSize) != (other.virtualSize)) {
			return false;
		}
		org.apache.commons.math3.util.OpenIntToFieldHashMap<T>.Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			iter.advance();
			T test = other.getEntry(iter.key());
			if (!(test.equals(iter.value()))) {
				return false;
			}
		} 
		iter = other.getEntries().iterator();
		while (iter.hasNext()) {
			iter.advance();
			T test = iter.value();
			if (!(test.equals(getEntry(iter.key())))) {
				return false;
			}
		} 
		return true;
	}
}

