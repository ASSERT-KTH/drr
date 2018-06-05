

package org.apache.commons.math3.linear;


public class ArrayRealVector extends org.apache.commons.math3.linear.RealVector implements java.io.Serializable {
	private static final long serialVersionUID = -1097961340710804027L;

	private static final org.apache.commons.math3.linear.RealVectorFormat DEFAULT_FORMAT = org.apache.commons.math3.linear.RealVectorFormat.getInstance();

	private double[] data;

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

	public ArrayRealVector(double[] d, boolean copyArray) throws org.apache.commons.math3.exception.NullArgumentException {
		if (d == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		data = (copyArray) ? d.clone() : d;
	}

	public ArrayRealVector(double[] d, int pos, int size) throws org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooLargeException {
		if (d == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		if ((d.length) < (pos + size)) {
			throw new org.apache.commons.math3.exception.NumberIsTooLargeException((pos + size), d.length, true);
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

	public ArrayRealVector(java.lang.Double[] d, int pos, int size) throws org.apache.commons.math3.exception.NullArgumentException, org.apache.commons.math3.exception.NumberIsTooLargeException {
		if (d == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		if ((d.length) < (pos + size)) {
			throw new org.apache.commons.math3.exception.NumberIsTooLargeException((pos + size), d.length, true);
		}
		data = new double[size];
		for (int i = pos; i < (pos + size); i++) {
			data[(i - pos)] = d[i].doubleValue();
		}
	}

	public ArrayRealVector(org.apache.commons.math3.linear.RealVector v) throws org.apache.commons.math3.exception.NullArgumentException {
		if (v == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		data = new double[v.getDimension()];
		for (int i = 0; i < (data.length); ++i) {
			data[i] = v.getEntry(i);
		}
	}

	public ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector v) throws org.apache.commons.math3.exception.NullArgumentException {
		this(v, true);
	}

	public ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector v, boolean deep) {
		data = (deep) ? v.data.clone() : v.data;
	}

	public ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector v1, org.apache.commons.math3.linear.ArrayRealVector v2) {
		data = new double[(v1.data.length) + (v2.data.length)];
		java.lang.System.arraycopy(v1.data, 0, data, 0, v1.data.length);
		java.lang.System.arraycopy(v2.data, 0, data, v1.data.length, v2.data.length);
	}

	public ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector v1, org.apache.commons.math3.linear.RealVector v2) {
		final int l1 = v1.data.length;
		final int l2 = v2.getDimension();
		data = new double[l1 + l2];
		java.lang.System.arraycopy(v1.data, 0, data, 0, l1);
		for (int i = 0; i < l2; ++i) {
			data[(l1 + i)] = v2.getEntry(i);
		}
	}

	public ArrayRealVector(org.apache.commons.math3.linear.RealVector v1, org.apache.commons.math3.linear.ArrayRealVector v2) {
		final int l1 = v1.getDimension();
		final int l2 = v2.data.length;
		data = new double[l1 + l2];
		for (int i = 0; i < l1; ++i) {
			data[i] = v1.getEntry(i);
		}
		java.lang.System.arraycopy(v2.data, 0, data, l1, l2);
	}

	public ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector v1, double[] v2) {
		final int l1 = v1.getDimension();
		final int l2 = v2.length;
		data = new double[l1 + l2];
		java.lang.System.arraycopy(v1.data, 0, data, 0, l1);
		java.lang.System.arraycopy(v2, 0, data, l1, l2);
	}

	public ArrayRealVector(double[] v1, org.apache.commons.math3.linear.ArrayRealVector v2) {
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
	public org.apache.commons.math3.linear.ArrayRealVector copy() {
		return new org.apache.commons.math3.linear.ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector.this, true);
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.ArrayRealVector add(org.apache.commons.math3.linear.RealVector v) throws org.apache.commons.math3.exception.DimensionMismatchException {
		if (v instanceof org.apache.commons.math3.linear.ArrayRealVector) {
			final double[] vData = ((org.apache.commons.math3.linear.ArrayRealVector) (v)).data;
			final int dim = vData.length;
			checkVectorDimensions(dim);
			org.apache.commons.math3.linear.ArrayRealVector result = new org.apache.commons.math3.linear.ArrayRealVector(dim);
			double[] resultData = result.data;
			for (int i = 0; i < dim; i++) {
				resultData[i] = (data[i]) + (vData[i]);
			}
			return result;
		}else {
			checkVectorDimensions(v);
			double[] out = data.clone();
			java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> it = v.iterator();
			while (it.hasNext()) {
				final org.apache.commons.math3.linear.RealVector.Entry e = it.next();
				out[e.getIndex()] += e.getValue();
			} 
			return new org.apache.commons.math3.linear.ArrayRealVector(out, false);
		}
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.ArrayRealVector subtract(org.apache.commons.math3.linear.RealVector v) throws org.apache.commons.math3.exception.DimensionMismatchException {
		if (v instanceof org.apache.commons.math3.linear.ArrayRealVector) {
			final double[] vData = ((org.apache.commons.math3.linear.ArrayRealVector) (v)).data;
			final int dim = vData.length;
			checkVectorDimensions(dim);
			org.apache.commons.math3.linear.ArrayRealVector result = new org.apache.commons.math3.linear.ArrayRealVector(dim);
			double[] resultData = result.data;
			for (int i = 0; i < dim; i++) {
				resultData[i] = (data[i]) - (vData[i]);
			}
			return result;
		}else {
			checkVectorDimensions(v);
			double[] out = data.clone();
			java.util.Iterator<org.apache.commons.math3.linear.RealVector.Entry> it = v.iterator();
			while (it.hasNext()) {
				final org.apache.commons.math3.linear.RealVector.Entry e = it.next();
				out[e.getIndex()] -= e.getValue();
			} 
			return new org.apache.commons.math3.linear.ArrayRealVector(out, false);
		}
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.ArrayRealVector map(org.apache.commons.math3.analysis.UnivariateFunction function) {
		return copy().mapToSelf(function);
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.ArrayRealVector mapToSelf(org.apache.commons.math3.analysis.UnivariateFunction function) {
		for (int i = 0; i < (data.length); i++) {
			data[i] = function.value(data[i]);
		}
		return org.apache.commons.math3.linear.ArrayRealVector.this;
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.RealVector mapAddToSelf(double d) {
		for (int i = 0; i < (data.length); i++) {
			data[i] = (data[i]) + d;
		}
		return org.apache.commons.math3.linear.ArrayRealVector.this;
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.RealVector mapSubtractToSelf(double d) {
		for (int i = 0; i < (data.length); i++) {
			data[i] = (data[i]) - d;
		}
		return org.apache.commons.math3.linear.ArrayRealVector.this;
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.RealVector mapMultiplyToSelf(double d) {
		for (int i = 0; i < (data.length); i++) {
			data[i] = (data[i]) * d;
		}
		return org.apache.commons.math3.linear.ArrayRealVector.this;
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.RealVector mapDivideToSelf(double d) {
		for (int i = 0; i < (data.length); i++) {
			data[i] = (data[i]) / d;
		}
		return org.apache.commons.math3.linear.ArrayRealVector.this;
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.ArrayRealVector ebeMultiply(org.apache.commons.math3.linear.RealVector v) throws org.apache.commons.math3.exception.DimensionMismatchException {
		if (v instanceof org.apache.commons.math3.linear.ArrayRealVector) {
			final double[] vData = ((org.apache.commons.math3.linear.ArrayRealVector) (v)).data;
			final int dim = vData.length;
			checkVectorDimensions(dim);
			org.apache.commons.math3.linear.ArrayRealVector result = new org.apache.commons.math3.linear.ArrayRealVector(dim);
			double[] resultData = result.data;
			for (int i = 0; i < dim; i++) {
				resultData[i] = (data[i]) * (vData[i]);
			}
			return result;
		}else {
			checkVectorDimensions(v);
			double[] out = data.clone();
			for (int i = 0; i < (data.length); i++) {
				out[i] *= v.getEntry(i);
			}
			return new org.apache.commons.math3.linear.ArrayRealVector(out, false);
		}
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.ArrayRealVector ebeDivide(org.apache.commons.math3.linear.RealVector v) throws org.apache.commons.math3.exception.DimensionMismatchException {
		if (v instanceof org.apache.commons.math3.linear.ArrayRealVector) {
			final double[] vData = ((org.apache.commons.math3.linear.ArrayRealVector) (v)).data;
			final int dim = vData.length;
			checkVectorDimensions(dim);
			org.apache.commons.math3.linear.ArrayRealVector result = new org.apache.commons.math3.linear.ArrayRealVector(dim);
			double[] resultData = result.data;
			for (int i = 0; i < dim; i++) {
				resultData[i] = (data[i]) / (vData[i]);
			}
			return result;
		}else {
			checkVectorDimensions(v);
			double[] out = data.clone();
			for (int i = 0; i < (data.length); i++) {
				out[i] /= v.getEntry(i);
			}
			return new org.apache.commons.math3.linear.ArrayRealVector(out, false);
		}
	}

	public double[] getDataRef() {
		return data;
	}

	@java.lang.Override
	public double dotProduct(org.apache.commons.math3.linear.RealVector v) throws org.apache.commons.math3.exception.DimensionMismatchException {
		if (v instanceof org.apache.commons.math3.linear.ArrayRealVector) {
			final double[] vData = ((org.apache.commons.math3.linear.ArrayRealVector) (v)).data;
			checkVectorDimensions(vData.length);
			double dot = 0;
			for (int i = 0; i < (data.length); i++) {
				dot += (data[i]) * (vData[i]);
			}
			return dot;
		}
		return super.dotProduct(v);
	}

	@java.lang.Override
	public double getNorm() {
		double sum = 0;
		for (double a : data) {
			sum += a * a;
		}
		return org.apache.commons.math3.util.FastMath.sqrt(sum);
	}

	@java.lang.Override
	public double getL1Norm() {
		double sum = 0;
		for (double a : data) {
			sum += org.apache.commons.math3.util.FastMath.abs(a);
		}
		return sum;
	}

	@java.lang.Override
	public double getLInfNorm() {
		double max = 0;
		for (double a : data) {
			max = org.apache.commons.math3.util.FastMath.max(max, org.apache.commons.math3.util.FastMath.abs(a));
		}
		return max;
	}

	@java.lang.Override
	public double getDistance(org.apache.commons.math3.linear.RealVector v) throws org.apache.commons.math3.exception.DimensionMismatchException {
		if (v instanceof org.apache.commons.math3.linear.ArrayRealVector) {
			final double[] vData = ((org.apache.commons.math3.linear.ArrayRealVector) (v)).data;
			checkVectorDimensions(vData.length);
			double sum = 0;
			for (int i = 0; i < (data.length); ++i) {
				final double delta = (data[i]) - (vData[i]);
				sum += delta * delta;
			}
			return org.apache.commons.math3.util.FastMath.sqrt(sum);
		}else {
			checkVectorDimensions(v);
			double sum = 0;
			for (int i = 0; i < (data.length); ++i) {
				final double delta = (data[i]) - (v.getEntry(i));
				sum += delta * delta;
			}
			return org.apache.commons.math3.util.FastMath.sqrt(sum);
		}
	}

	@java.lang.Override
	public double getL1Distance(org.apache.commons.math3.linear.RealVector v) throws org.apache.commons.math3.exception.DimensionMismatchException {
		if (v instanceof org.apache.commons.math3.linear.ArrayRealVector) {
			final double[] vData = ((org.apache.commons.math3.linear.ArrayRealVector) (v)).data;
			checkVectorDimensions(vData.length);
			double sum = 0;
			for (int i = 0; i < (data.length); ++i) {
				final double delta = (data[i]) - (vData[i]);
				sum += org.apache.commons.math3.util.FastMath.abs(delta);
			}
			return sum;
		}else {
			checkVectorDimensions(v);
			double sum = 0;
			for (int i = 0; i < (data.length); ++i) {
				final double delta = (data[i]) - (v.getEntry(i));
				sum += org.apache.commons.math3.util.FastMath.abs(delta);
			}
			return sum;
		}
	}

	@java.lang.Override
	public double getLInfDistance(org.apache.commons.math3.linear.RealVector v) throws org.apache.commons.math3.exception.DimensionMismatchException {
		if (v instanceof org.apache.commons.math3.linear.ArrayRealVector) {
			final double[] vData = ((org.apache.commons.math3.linear.ArrayRealVector) (v)).data;
			checkVectorDimensions(vData.length);
			double max = 0;
			for (int i = 0; i < (data.length); ++i) {
				final double delta = (data[i]) - (vData[i]);
				max = org.apache.commons.math3.util.FastMath.max(max, org.apache.commons.math3.util.FastMath.abs(delta));
			}
			return max;
		}else {
			checkVectorDimensions(v);
			double max = 0;
			for (int i = 0; i < (data.length); ++i) {
				final double delta = (data[i]) - (v.getEntry(i));
				max = org.apache.commons.math3.util.FastMath.max(max, org.apache.commons.math3.util.FastMath.abs(delta));
			}
			return max;
		}
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.RealMatrix outerProduct(org.apache.commons.math3.linear.RealVector v) {
		if (v instanceof org.apache.commons.math3.linear.ArrayRealVector) {
			final double[] vData = ((org.apache.commons.math3.linear.ArrayRealVector) (v)).data;
			final int m = data.length;
			final int n = vData.length;
			final org.apache.commons.math3.linear.RealMatrix out = org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(m, n);
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					out.setEntry(i, j, ((data[i]) * (vData[j])));
				}
			}
			return out;
		}else {
			final int m = data.length;
			final int n = v.getDimension();
			final org.apache.commons.math3.linear.RealMatrix out = org.apache.commons.math3.linear.MatrixUtils.createRealMatrix(m, n);
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					out.setEntry(i, j, ((data[i]) * (v.getEntry(j))));
				}
			}
			return out;
		}
	}

	@java.lang.Override
	public double getEntry(int index) throws org.apache.commons.math3.exception.OutOfRangeException {
		try {
			return data[index];
		} catch (java.lang.IndexOutOfBoundsException e) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(org.apache.commons.math3.exception.util.LocalizedFormats.INDEX, index, 0, ((getDimension()) - 1));
		}
	}

	@java.lang.Override
	public int getDimension() {
		return data.length;
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.RealVector append(org.apache.commons.math3.linear.RealVector v) {
		try {
			return new org.apache.commons.math3.linear.ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector.this, ((org.apache.commons.math3.linear.ArrayRealVector) (v)));
		} catch (java.lang.ClassCastException cce) {
			return new org.apache.commons.math3.linear.ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector.this, v);
		}
	}

	public org.apache.commons.math3.linear.ArrayRealVector append(org.apache.commons.math3.linear.ArrayRealVector v) {
		return new org.apache.commons.math3.linear.ArrayRealVector(org.apache.commons.math3.linear.ArrayRealVector.this, v);
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.RealVector append(double in) {
		final double[] out = new double[(data.length) + 1];
		java.lang.System.arraycopy(data, 0, out, 0, data.length);
		out[data.length] = in;
		return new org.apache.commons.math3.linear.ArrayRealVector(out, false);
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.RealVector getSubVector(int index, int n) throws org.apache.commons.math3.exception.NotPositiveException, org.apache.commons.math3.exception.OutOfRangeException {
		if (n < 0) {
			throw new org.apache.commons.math3.exception.NotPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.NUMBER_OF_ELEMENTS_SHOULD_BE_POSITIVE, n);
		}
		org.apache.commons.math3.linear.ArrayRealVector out = new org.apache.commons.math3.linear.ArrayRealVector(n);
		try {
			java.lang.System.arraycopy(data, index, out.data, 0, n);
		} catch (java.lang.IndexOutOfBoundsException e) {
			checkIndex(index);
			checkIndex(((index + n) - 1));
		}
		return out;
	}

	@java.lang.Override
	public void setEntry(int index, double value) throws org.apache.commons.math3.exception.OutOfRangeException {
		try {
			data[index] = value;
		} catch (java.lang.IndexOutOfBoundsException e) {
			checkIndex(index);
		}
	}

	@java.lang.Override
	public void addToEntry(int index, double increment) throws org.apache.commons.math3.exception.OutOfRangeException {
		try {
			data[index] += increment;
		} catch (java.lang.IndexOutOfBoundsException e) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(org.apache.commons.math3.exception.util.LocalizedFormats.INDEX, index, 0, ((data.length) - 1));
		}
	}

	@java.lang.Override
	public void setSubVector(int index, org.apache.commons.math3.linear.RealVector v) throws org.apache.commons.math3.exception.OutOfRangeException {
		if (v instanceof org.apache.commons.math3.linear.ArrayRealVector) {
			setSubVector(index, ((org.apache.commons.math3.linear.ArrayRealVector) (v)).data);
		}else {
			try {
				for (int i = index; i < (index + (v.getDimension())); ++i) {
					data[i] = v.getEntry((i - index));
				}
			} catch (java.lang.IndexOutOfBoundsException e) {
				checkIndex(index);
				checkIndex(((index + (v.getDimension())) - 1));
			}
		}
	}

	public void setSubVector(int index, double[] v) throws org.apache.commons.math3.exception.OutOfRangeException {
		try {
			java.lang.System.arraycopy(v, 0, data, index, v.length);
		} catch (java.lang.IndexOutOfBoundsException e) {
			checkIndex(index);
			checkIndex(((index + (v.length)) - 1));
		}
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
		return org.apache.commons.math3.linear.ArrayRealVector.DEFAULT_FORMAT.format(org.apache.commons.math3.linear.ArrayRealVector.this);
	}

	@java.lang.Override
	protected void checkVectorDimensions(org.apache.commons.math3.linear.RealVector v) throws org.apache.commons.math3.exception.DimensionMismatchException {
		checkVectorDimensions(v.getDimension());
	}

	@java.lang.Override
	protected void checkVectorDimensions(int n) throws org.apache.commons.math3.exception.DimensionMismatchException {
		if ((data.length) != n) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(data.length, n);
		}
	}

	@java.lang.Override
	public boolean isNaN() {
		for (double v : data) {
			if (java.lang.Double.isNaN(v)) {
				return true;
			}
		}
		return false;
	}

	@java.lang.Override
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
		if ((org.apache.commons.math3.linear.ArrayRealVector.this) == other) {
			return true;
		}
		if (!(other instanceof org.apache.commons.math3.linear.RealVector)) {
			return false;
		}
		org.apache.commons.math3.linear.RealVector rhs = ((org.apache.commons.math3.linear.RealVector) (other));
		if ((data.length) != (rhs.getDimension())) {
			return false;
		}
		if (rhs.isNaN()) {
			return org.apache.commons.math3.linear.ArrayRealVector.this.isNaN();
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
		return org.apache.commons.math3.util.MathUtils.hash(data);
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.ArrayRealVector combine(double a, double b, org.apache.commons.math3.linear.RealVector y) throws org.apache.commons.math3.exception.DimensionMismatchException {
		return copy().combineToSelf(a, b, y);
	}

	@java.lang.Override
	public org.apache.commons.math3.linear.ArrayRealVector combineToSelf(double a, double b, org.apache.commons.math3.linear.RealVector y) throws org.apache.commons.math3.exception.DimensionMismatchException {
		if (y instanceof org.apache.commons.math3.linear.ArrayRealVector) {
			final double[] yData = ((org.apache.commons.math3.linear.ArrayRealVector) (y)).data;
			checkVectorDimensions(yData.length);
			for (int i = 0; i < (org.apache.commons.math3.linear.ArrayRealVector.this.data.length); i++) {
				data[i] = (a * (data[i])) + (b * (yData[i]));
			}
		}else {
			checkVectorDimensions(y);
			for (int i = 0; i < (org.apache.commons.math3.linear.ArrayRealVector.this.data.length); i++) {
				data[i] = (a * (data[i])) + (b * (y.getEntry(i)));
			}
		}
		return org.apache.commons.math3.linear.ArrayRealVector.this;
	}

	@java.lang.Override
	public double walkInDefaultOrder(final org.apache.commons.math3.linear.RealVectorPreservingVisitor visitor) {
		visitor.start(data.length, 0, ((data.length) - 1));
		for (int i = 0; i < (data.length); i++) {
			visitor.visit(i, data[i]);
		}
		return visitor.end();
	}

	@java.lang.Override
	public double walkInDefaultOrder(final org.apache.commons.math3.linear.RealVectorPreservingVisitor visitor, final int start, final int end) throws org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException {
		checkIndices(start, end);
		visitor.start(data.length, start, end);
		for (int i = start; i <= end; i++) {
			visitor.visit(i, data[i]);
		}
		return visitor.end();
	}

	@java.lang.Override
	public double walkInOptimizedOrder(final org.apache.commons.math3.linear.RealVectorPreservingVisitor visitor) {
		return walkInDefaultOrder(visitor);
	}

	@java.lang.Override
	public double walkInOptimizedOrder(final org.apache.commons.math3.linear.RealVectorPreservingVisitor visitor, final int start, final int end) throws org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException {
		return walkInDefaultOrder(visitor, start, end);
	}

	@java.lang.Override
	public double walkInDefaultOrder(final org.apache.commons.math3.linear.RealVectorChangingVisitor visitor) {
		visitor.start(data.length, 0, ((data.length) - 1));
		for (int i = 0; i < (data.length); i++) {
			data[i] = visitor.visit(i, data[i]);
		}
		return visitor.end();
	}

	@java.lang.Override
	public double walkInDefaultOrder(final org.apache.commons.math3.linear.RealVectorChangingVisitor visitor, final int start, final int end) throws org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException {
		checkIndices(start, end);
		visitor.start(data.length, start, end);
		for (int i = start; i <= end; i++) {
			data[i] = visitor.visit(i, data[i]);
		}
		return visitor.end();
	}

	@java.lang.Override
	public double walkInOptimizedOrder(final org.apache.commons.math3.linear.RealVectorChangingVisitor visitor) {
		return walkInDefaultOrder(visitor);
	}

	@java.lang.Override
	public double walkInOptimizedOrder(final org.apache.commons.math3.linear.RealVectorChangingVisitor visitor, final int start, final int end) throws org.apache.commons.math3.exception.NumberIsTooSmallException, org.apache.commons.math3.exception.OutOfRangeException {
		return walkInDefaultOrder(visitor, start, end);
	}
}

