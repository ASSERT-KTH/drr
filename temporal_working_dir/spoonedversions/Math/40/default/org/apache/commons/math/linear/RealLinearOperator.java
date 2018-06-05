

package org.apache.commons.math.linear;


public abstract class RealLinearOperator {
	public abstract int getRowDimension();

	public abstract int getColumnDimension();

	public abstract org.apache.commons.math.linear.RealVector operate(final org.apache.commons.math.linear.RealVector x);
}

