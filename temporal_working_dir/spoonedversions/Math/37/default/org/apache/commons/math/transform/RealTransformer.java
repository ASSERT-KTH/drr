

package org.apache.commons.math.transform;


public interface RealTransformer {
	double[] transform(double[] f);

	double[] transform(org.apache.commons.math.analysis.UnivariateFunction f, double min, double max, int n);

	double[] inverseTransform(double[] f);

	double[] inverseTransform(org.apache.commons.math.analysis.UnivariateFunction f, double min, double max, int n);
}

