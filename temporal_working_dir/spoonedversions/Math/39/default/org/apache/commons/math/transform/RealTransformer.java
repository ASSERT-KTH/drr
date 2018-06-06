

package org.apache.commons.math.transform;


public interface RealTransformer {
	double[] transform(double[] f) throws java.lang.IllegalArgumentException;

	double[] transform(org.apache.commons.math.analysis.UnivariateFunction f, double min, double max, int n) throws java.lang.IllegalArgumentException;

	double[] inverseTransform(double[] f) throws java.lang.IllegalArgumentException;

	double[] inverseTransform(org.apache.commons.math.analysis.UnivariateFunction f, double min, double max, int n) throws java.lang.IllegalArgumentException;
}

