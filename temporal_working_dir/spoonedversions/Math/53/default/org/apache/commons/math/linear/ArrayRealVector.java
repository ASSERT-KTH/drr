

package org.apache.commons.math.linear;


public class ArrayRealVector extends org.apache.commons.math.linear.AbstractRealVector implements java.io.Serializable {
	private static final long serialVersionUID = -1097961340710804027L;

	private static final org.apache.commons.math.linear.RealVectorFormat DEFAULT_FORMAT = org.apache.commons.math.linear.RealVectorFormat.getInstance();

	protected double[] data;

	public ArrayRealVector() {
		data = new double[0];
	}

	public ArrayRealVector(int size) {
		data = new double[size];
	}

	public ArrayRealVector(int size, double preset) {
		data = new double[size];
		java.util.Arrays.fill(data, preset);
	}

	public ArrayRealVector(double[] d) {
		data = d.clone();
	}

	public ArrayRealVector(double[] d, boolean copyArray) {
		if (d == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		data = (copyArray) ? d.clone() : d;
	}

	public ArrayRealVector(double[] d, int pos, int size) {
		if (d == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		if ((d.length) < (pos + size)) {
			throw new org.apache.commons.math.exception.NumberIsTooLargeException((pos + size), d.length, true);
		}
		data = new double[size];
		java.lang.System.arraycopy(d, pos, data, 0, size);
	}

	public ArrayRealVector(java.lang.Double[] d) {
		data = new double[d.length];
		for (int i = 0; i < (d.length); i++) {
			data[i] = d[i].doubleValue();
		}
	}

	public ArrayRealVector(java.lang.Double[] d, int pos, int size) {
		if (d == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		if ((d.length) < (pos + size)) {
			throw new org.apache.commons.math.exception.NumberIsTooLargeException((pos + size), d.length, true);
		}
		data = new double[size];
		for (int i = pos; i < (pos + size); i++) {
			data[(i - pos)] = d[i].doubleValue();
		}
	}

	public ArrayRealVector(org.apache.commons.math.linear.RealVector v) {
		if (v == null) {
			throw new org.apache.commons.math.exception.NullArgumentException();
		}
		data = new double[v.getDimension()];
		for (int i = 0; i < (data.length); ++i) {
			data[i] = v.getEntry(i);
		}
	}

	public ArrayRealVector(org.apache.commons.math.linear.ArrayRealVector v) {
		this(v, true);
	}

	public ArrayRealVector(org.apache.commons.math.linear.ArrayRealVector v, boolean deep) {
		data = (deep) ? v.data.clone() : v.data;
	}

	public ArrayRealVector(org.apache.commons.math.linear.ArrayRealVector v1, org.apache.commons.math.linear.ArrayRealVector v2) {
		data = new double[(v1.data.length) + (v2.data.length)];
		java.lang.System.arraycopy(v1.data, 0, data, 0, v1.data.length);
		java.lang.System.arraycopy(v2.data, 0, data, v1.data.length, v2.data.length);
	}

	public ArrayRealVector(org.apache.commons.math.linear.ArrayRealVector v1, org.apache.commons.math.linear.RealVector v2) {
		final int l1 = v1.data.length;
		final int l2 = v2.getDimension();
		data = new double[l1 + l2];
		java.lang.System.arraycopy(v1.data, 0, data, 0, l1);
		for (int i = 0; i < l2; ++i) {
			data[(l1 + i)] = v2.getEntry(i);
		}
	}

	public ArrayRealVector(org.apache.commons.math.linear.RealVector v1, org.apache.commons.math.linear.ArrayRealVector v2) {
		final int l1 = v1.getDimension();
		final int l2 = v2.data.length;
		data = new double[l1 + l2];
		for (int i = 0; i < l1; ++i) {
			data[i] = v1.getEntry(i);
		}
		java.lang.System.arraycopy(v2.data, 0, data, l1, l2);
	}

	public ArrayRealVector(org.apache.commons.math.linear.ArrayRealVector v1, double[] v2) {
		final int l1 = v1.getDimension();
		final int l2 = v2.length;
		data = new double[l1 + l2];
		java.lang.System.arraycopy(v1.data, 0, data, 0, l1);
		java.lang.System.arraycopy(v2, 0, data, l1, l2);
	}

	public ArrayRealVector(double[] v1, org.apache.commons.math.linear.ArrayRealVector v2) {
		final int l1 = v1.length;
		final int l2 = v2.getDimension();
		data = new double[l1 + l2];
		java.lang.System.arraycopy(v1, 0, data, 0, l1);
		java.lang.System.arraycopy(v2.data, 0, data, l1, l2);
	}

	public ArrayRealVector(double[] v1, double[] v2) {
		final int l1 = v1.length;
		final int l2 = v2.length;
		data = new double[l1 + l2];
		java.lang.System.arraycopy(v1, 0, data, 0, l1);
		java.lang.System.arraycopy(v2, 0, data, l1, l2);
	}

	@java.lang.Override
	public org.apache.commons.math.linear.ArrayRealVector copy() {
		return new org.apache.commons.math.linear.ArrayRealVector(org.apache.commons.math.linear.ArrayRealVector.this, true);
	}

	@java.lang.Override
	public org.apache.commons.math.linear.RealVector add(org.apache.commons.math.linear.RealVector v) {
		if (v instanceof org.apache.commons.math.linear.ArrayRealVector) {
			return add(((org.apache.commons.math.linear.ArrayRealVector) (v)));
		}else {
			checkVectorDimensions(v);
			double[] out = data.clone();
			java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> it = v.sparseIterator();
			org.apache.commons.math.linear.RealVector.Entry e;
			while ((it.hasNext()) && ((e = it.next()) != null)) {
				out[e.getIndex()] += e.getValue();
			} 
			return new org.apache.commons.math.linear.ArrayRealVector(out, false);
		}
	}

	@java.lang.Override
	public org.apache.commons.math.linear.RealVector add(double[] v) {
		checkVectorDimensions(v.length);
		double[] out = data.clone();
		for (int i = 0; i < (data.length); i++) {
			out[i] += v[i];
		}
		return new org.apache.commons.math.linear.ArrayRealVector(out, false);
	}

	public org.apache.commons.math.linear.ArrayRealVector add(org.apache.commons.math.linear.ArrayRealVector v) {
		return ((org.apache.commons.math.linear.ArrayRealVector) (add(v.data)));
	}

	@java.lang.Override
	public org.apache.commons.math.linear.RealVector subtract(org.apache.commons.math.linear.RealVector v) {
		if (v instanceof org.apache.commons.math.linear.ArrayRealVector) {
			return subtract(((org.apache.commons.math.linear.ArrayRealVector) (v)));
		}else {
			checkVectorDimensions(v);
			double[] out = data.clone();
			java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> it = v.sparseIterator();
			org.apache.commons.math.linear.RealVector.Entry e;
			while ((it.hasNext()) && ((e = it.next()) != null)) {
				out[e.getIndex()] -= e.getValue();
			} 
			return new org.apache.commons.math.linear.ArrayRealVector(out, false);
		}
	}

	@java.lang.Override
	public org.apache.commons.math.linear.RealVector subtract(double[] v) {
		checkVectorDimensions(v.length);
		double[] out = data.clone();
		for (int i = 0; i < (data.length); i++) {
			out[i] -= v[i];
		}
		return new org.apache.commons.math.linear.ArrayRealVector(out, false);
	}

	public org.apache.commons.math.linear.ArrayRealVector subtract(org.apache.commons.math.linear.ArrayRealVector v) {
		return ((org.apache.commons.math.linear.ArrayRealVector) (subtract(v.data)));
	}

	@java.lang.Override
	public org.apache.commons.math.linear.ArrayRealVector map(org.apache.commons.math.analysis.UnivariateRealFunction function) {
		return copy().mapToSelf(function);
	}

	@java.lang.Override
	public org.apache.commons.math.linear.ArrayRealVector mapToSelf(org.apache.commons.math.analysis.UnivariateRealFunction function) {
		for (int i = 0; i < (data.length); i++) {
			data[i] = function.value(data[i]);
		}
		return org.apache.commons.math.linear.ArrayRealVector.this;
	}

	@java.lang.Override
	public org.apache.commons.math.linear.RealVector mapAddToSelf(double d) {
		for (int i = 0; i < (data.length); i++) {
			data[i] = (data[i]) + d;
		}
		return org.apache.commons.math.linear.ArrayRealVector.this;
	}

	@java.lang.Override
	public org.apache.commons.math.linear.RealVector mapSubtractToSelf(double d) {
		for (int i = 0; i < (data.length); i++) {
			data[i] = (data[i]) - d;
		}
		return org.apache.commons.math.linear.ArrayRealVector.this;
	}

	@java.lang.Override
	public org.apache.commons.math.linear.RealVector mapMultiplyToSelf(double d) {
		for (int i = 0; i < (data.length); i++) {
			data[i] = (data[i]) * d;
		}
		return org.apache.commons.math.linear.ArrayRealVector.this;
	}

	@java.lang.Override
	public org.apache.commons.math.linear.RealVector mapDivideToSelf(double d) {
		for (int i = 0; i < (data.length); i++) {
			data[i] = (data[i]) / d;
		}
		return org.apache.commons.math.linear.ArrayRealVector.this;
	}

	public org.apache.commons.math.linear.RealVector ebeMultiply(org.apache.commons.math.linear.RealVector v) {
		if (v instanceof org.apache.commons.math.linear.ArrayRealVector) {
			return ebeMultiply(((org.apache.commons.math.linear.ArrayRealVector) (v)));
		}else {
			checkVectorDimensions(v);
			double[] out = data.clone();
			for (int i = 0; i < (data.length); i++) {
				out[i] *= v.getEntry(i);
			}
			return new org.apache.commons.math.linear.ArrayRealVector(out, false);
		}
	}

	@java.lang.Override
	public org.apache.commons.math.linear.RealVector ebeMultiply(double[] v) {
		checkVectorDimensions(v.length);
		double[] out = data.clone();
		for (int i = 0; i < (data.length); i++) {
			out[i] *= v[i];
		}
		return new org.apache.commons.math.linear.ArrayRealVector(out, false);
	}

	public org.apache.commons.math.linear.ArrayRealVector ebeMultiply(org.apache.commons.math.linear.ArrayRealVector v) {
		return ((org.apache.commons.math.linear.ArrayRealVector) (ebeMultiply(v.data)));
	}

	public org.apache.commons.math.linear.RealVector ebeDivide(org.apache.commons.math.linear.RealVector v) {
		if (v instanceof org.apache.commons.math.linear.ArrayRealVector) {
			return ebeDivide(((org.apache.commons.math.linear.ArrayRealVector) (v)));
		}else {
			checkVectorDimensions(v);
			double[] out = data.clone();
			for (int i = 0; i < (data.length); i++) {
				out[i] /= v.getEntry(i);
			}
			return new org.apache.commons.math.linear.ArrayRealVector(out, false);
		}
	}

	@java.lang.Override
	public org.apache.commons.math.linear.RealVector ebeDivide(double[] v) {
		checkVectorDimensions(v.length);
		double[] out = data.clone();
		for (int i = 0; i < (data.length); i++) {
			out[i] /= v[i];
		}
		return new org.apache.commons.math.linear.ArrayRealVector(out, false);
	}

	public org.apache.commons.math.linear.ArrayRealVector ebeDivide(org.apache.commons.math.linear.ArrayRealVector v) {
		return ((org.apache.commons.math.linear.ArrayRealVector) (ebeDivide(v.data)));
	}

	@java.lang.Override
	public double[] getData() {
		return data.clone();
	}

	public double[] getDataRef() {
		return data;
	}

	@java.lang.Override
	public double dotProduct(org.apache.commons.math.linear.RealVector v) {
		if (v instanceof org.apache.commons.math.linear.ArrayRealVector) {
			return dotProduct(((org.apache.commons.math.linear.ArrayRealVector) (v)));
		}else {
			checkVectorDimensions(v);
			double dot = 0;
			java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> it = v.sparseIterator();
			org.apache.commons.math.linear.RealVector.Entry e;
			while ((it.hasNext()) && ((e = it.next()) != null)) {
				dot += (data[e.getIndex()]) * (e.getValue());
			} 
			return dot;
		}
	}

	@java.lang.Override
	public double dotProduct(double[] v) {
		checkVectorDimensions(v.length);
		double dot = 0;
		for (int i = 0; i < (data.length); i++) {
			dot += (data[i]) * (v[i]);
		}
		return dot;
	}

	public double dotProduct(org.apache.commons.math.linear.ArrayRealVector v) {
		return dotProduct(v.data);
	}

	@java.lang.Override
	public double getNorm() {
		double sum = 0;
		for (double a : data) {
			sum += a * a;
		}
		return org.apache.commons.math.util.FastMath.sqrt(sum);
	}

	@java.lang.Override
	public double getL1Norm() {
		double sum = 0;
		for (double a : data) {
			sum += org.apache.commons.math.util.FastMath.abs(a);
		}
		return sum;
	}

	@java.lang.Override
	public double getLInfNorm() {
		double max = 0;
		for (double a : data) {
			max = org.apache.commons.math.util.FastMath.max(max, org.apache.commons.math.util.FastMath.abs(a));
		}
		return max;
	}

	@java.lang.Override
	public double getDistance(org.apache.commons.math.linear.RealVector v) {
		if (v instanceof org.apache.commons.math.linear.ArrayRealVector) {
			return getDistance(((org.apache.commons.math.linear.ArrayRealVector) (v)));
		}else {
			checkVectorDimensions(v);
			double sum = 0;
			for (int i = 0; i < (data.length); ++i) {
				final double delta = (data[i]) - (v.getEntry(i));
				sum += delta * delta;
			}
			return org.apache.commons.math.util.FastMath.sqrt(sum);
		}
	}

	@java.lang.Override
	public double getDistance(double[] v) {
		checkVectorDimensions(v.length);
		double sum = 0;
		for (int i = 0; i < (data.length); ++i) {
			final double delta = (data[i]) - (v[i]);
			sum += delta * delta;
		}
		return org.apache.commons.math.util.FastMath.sqrt(sum);
	}

	public double getDistance(org.apache.commons.math.linear.ArrayRealVector v) {
		return getDistance(v.data);
	}

	@java.lang.Override
	public double getL1Distance(org.apache.commons.math.linear.RealVector v) {
		if (v instanceof org.apache.commons.math.linear.ArrayRealVector) {
			return getL1Distance(((org.apache.commons.math.linear.ArrayRealVector) (v)));
		}else {
			checkVectorDimensions(v);
			double sum = 0;
			for (int i = 0; i < (data.length); ++i) {
				final double delta = (data[i]) - (v.getEntry(i));
				sum += org.apache.commons.math.util.FastMath.abs(delta);
			}
			return sum;
		}
	}

	@java.lang.Override
	public double getL1Distance(double[] v) {
		checkVectorDimensions(v.length);
		double sum = 0;
		for (int i = 0; i < (data.length); ++i) {
			final double delta = (data[i]) - (v[i]);
			sum += org.apache.commons.math.util.FastMath.abs(delta);
		}
		return sum;
	}

	public double getL1Distance(org.apache.commons.math.linear.ArrayRealVector v) {
		return getL1Distance(v.data);
	}

	@java.lang.Override
	public double getLInfDistance(org.apache.commons.math.linear.RealVector v) {
		if (v instanceof org.apache.commons.math.linear.ArrayRealVector) {
			return getLInfDistance(((org.apache.commons.math.linear.ArrayRealVector) (v)));
		}else {
			checkVectorDimensions(v);
			double max = 0;
			for (int i = 0; i < (data.length); ++i) {
				final double delta = (data[i]) - (v.getEntry(i));
				max = org.apache.commons.math.util.FastMath.max(max, org.apache.commons.math.util.FastMath.abs(delta));
			}
			return max;
		}
	}

	@java.lang.Override
	public double getLInfDistance(double[] v) {
		checkVectorDimensions(v.length);
		double max = 0;
		for (int i = 0; i < (data.length); ++i) {
			final double delta = (data[i]) - (v[i]);
			max = org.apache.commons.math.util.FastMath.max(max, org.apache.commons.math.util.FastMath.abs(delta));
		}
		return max;
	}

	public double getLInfDistance(org.apache.commons.math.linear.ArrayRealVector v) {
		return getLInfDistance(v.data);
	}

	@java.lang.Override
	public org.apache.commons.math.linear.RealVector unitVector() {
		final double norm = getNorm();
		if (norm == 0) {
			throw new org.apache.commons.math.exception.MathArithmeticException(org.apache.commons.math.exception.util.LocalizedFormats.ZERO_NORM);
		}
		return mapDivide(norm);
	}

	@java.lang.Override
	public void unitize() {
		final double norm = getNorm();
		if (norm == 0) {
			throw new org.apache.commons.math.exception.MathArithmeticException(org.apache.commons.math.exception.util.LocalizedFormats.ZERO_NORM);
		}
		mapDivideToSelf(norm);
	}

	public org.apache.commons.math.linear.RealVector projection(org.apache.commons.math.linear.RealVector v) {
		return v.mapMultiply(((dotProduct(v)) / (v.dotProduct(v))));
	}

	@java.lang.Override
	public org.apache.commons.math.linear.RealVector projection(double[] v) {
		return projection(new org.apache.commons.math.linear.ArrayRealVector(v, false));
	}

	public org.apache.commons.math.linear.ArrayRealVector projection(org.apache.commons.math.linear.ArrayRealVector v) {
		return ((org.apache.commons.math.linear.ArrayRealVector) (v.mapMultiply(((dotProduct(v)) / (v.dotProduct(v))))));
	}

	@java.lang.Override
	public org.apache.commons.math.linear.RealMatrix outerProduct(org.apache.commons.math.linear.RealVector v) {
		if (v instanceof org.apache.commons.math.linear.ArrayRealVector) {
			return outerProduct(((org.apache.commons.math.linear.ArrayRealVector) (v)));
		}else {
			final int m = data.length;
			final int n = v.getDimension();
			final org.apache.commons.math.linear.RealMatrix out = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(m, n);
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					out.setEntry(i, j, ((data[i]) * (v.getEntry(j))));
				}
			}
			return out;
		}
	}

	public org.apache.commons.math.linear.RealMatrix outerProduct(org.apache.commons.math.linear.ArrayRealVector v) {
		return outerProduct(v.data);
	}

	@java.lang.Override
	public org.apache.commons.math.linear.RealMatrix outerProduct(double[] v) {
		final int m = data.length;
		final int n = v.length;
		final org.apache.commons.math.linear.RealMatrix out = org.apache.commons.math.linear.MatrixUtils.createRealMatrix(m, n);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				out.setEntry(i, j, ((data[i]) * (v[j])));
			}
		}
		return out;
	}

	public double getEntry(int index) {
		return data[index];
	}

	public int getDimension() {
		return data.length;
	}

	public org.apache.commons.math.linear.RealVector append(org.apache.commons.math.linear.RealVector v) {
		try {
			return new org.apache.commons.math.linear.ArrayRealVector(org.apache.commons.math.linear.ArrayRealVector.this, ((org.apache.commons.math.linear.ArrayRealVector) (v)));
		} catch (java.lang.ClassCastException cce) {
			return new org.apache.commons.math.linear.ArrayRealVector(org.apache.commons.math.linear.ArrayRealVector.this, v);
		}
	}

	public org.apache.commons.math.linear.ArrayRealVector append(org.apache.commons.math.linear.ArrayRealVector v) {
		return new org.apache.commons.math.linear.ArrayRealVector(org.apache.commons.math.linear.ArrayRealVector.this, v);
	}

	public org.apache.commons.math.linear.RealVector append(double in) {
		final double[] out = new double[(data.length) + 1];
		java.lang.System.arraycopy(data, 0, out, 0, data.length);
		out[data.length] = in;
		return new org.apache.commons.math.linear.ArrayRealVector(out, false);
	}

	public org.apache.commons.math.linear.RealVector append(double[] in) {
		return new org.apache.commons.math.linear.ArrayRealVector(org.apache.commons.math.linear.ArrayRealVector.this, in);
	}

	public org.apache.commons.math.linear.RealVector getSubVector(int index, int n) {
		org.apache.commons.math.linear.ArrayRealVector out = new org.apache.commons.math.linear.ArrayRealVector(n);
		try {
			java.lang.System.arraycopy(data, index, out.data, 0, n);
		} catch (java.lang.IndexOutOfBoundsException e) {
			checkIndex(index);
			checkIndex(((index + n) - 1));
		}
		return out;
	}

	public void setEntry(int index, double value) {
		try {
			data[index] = value;
		} catch (java.lang.IndexOutOfBoundsException e) {
			checkIndex(index);
		}
	}

	@java.lang.Override
	public void setSubVector(int index, org.apache.commons.math.linear.RealVector v) {
		try {
			try {
				set(index, ((org.apache.commons.math.linear.ArrayRealVector) (v)));
			} catch (java.lang.ClassCastException cce) {
				for (int i = index; i < (index + (v.getDimension())); ++i) {
					data[i] = v.getEntry((i - index));
				}
			}
		} catch (java.lang.IndexOutOfBoundsException e) {
			checkIndex(index);
			checkIndex(((index + (v.getDimension())) - 1));
		}
	}

	@java.lang.Override
	public void setSubVector(int index, double[] v) {
		try {
			java.lang.System.arraycopy(v, 0, data, index, v.length);
		} catch (java.lang.IndexOutOfBoundsException e) {
			checkIndex(index);
			checkIndex(((index + (v.length)) - 1));
		}
	}

	public void set(int index, org.apache.commons.math.linear.ArrayRealVector v) {
		setSubVector(index, v.data);
	}

	@java.lang.Override
	public void set(double value) {
		java.util.Arrays.fill(data, value);
	}

	@java.lang.Override
	public double[] toArray() {
		return data.clone();
	}

	@java.lang.Override
	public java.lang.String toString() {
		return org.apache.commons.math.linear.ArrayRealVector.DEFAULT_FORMAT.format(org.apache.commons.math.linear.ArrayRealVector.this);
	}

	@java.lang.Override
	protected void checkVectorDimensions(org.apache.commons.math.linear.RealVector v) {
		checkVectorDimensions(v.getDimension());
	}

	@java.lang.Override
	protected void checkVectorDimensions(int n) {
		if ((data.length) != n) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(data.length, n);
		}
	}

	public boolean isNaN() {
		for (double v : data) {
			if (java.lang.Double.isNaN(v)) {
				return true;
			}
		}
		return false;
	}

	public boolean isInfinite() {
		if (isNaN()) {
			return false;
		}
		for (double v : data) {
			if (java.lang.Double.isInfinite(v)) {
				return true;
			}
		}
		return false;
	}

	@java.lang.Override
	public boolean equals(java.lang.Object other) {
		if ((org.apache.commons.math.linear.ArrayRealVector.this) == other) {
			return true;
		}
		if ((other == null) || (!(other instanceof org.apache.commons.math.linear.RealVector))) {
			return false;
		}
		org.apache.commons.math.linear.RealVector rhs = ((org.apache.commons.math.linear.RealVector) (other));
		if ((data.length) != (rhs.getDimension())) {
			return false;
		}
		if (rhs.isNaN()) {
			return org.apache.commons.math.linear.ArrayRealVector.this.isNaN();
		}
		for (int i = 0; i < (data.length); ++i) {
			if ((data[i]) != (rhs.getEntry(i))) {
				return false;
			}
		}
		return true;
	}

	@java.lang.Override
	public int hashCode() {
		if (isNaN()) {
			return 9;
		}
		return org.apache.commons.math.util.MathUtils.hash(data);
	}
}

