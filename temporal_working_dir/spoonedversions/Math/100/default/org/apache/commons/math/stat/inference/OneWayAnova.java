

package org.apache.commons.math.stat.inference;


public interface OneWayAnova {
	public double anovaFValue(java.util.Collection categoryData) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException;

	public double anovaPValue(java.util.Collection categoryData) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException;

	public boolean anovaTest(java.util.Collection categoryData, double alpha) throws java.lang.IllegalArgumentException, org.apache.commons.math.MathException;
}

