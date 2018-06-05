

package org.apache.commons.math3.transform;


public interface RealTransformer {
	double[] transform(double[] f, org.apache.commons.math3.transform.TransformType type);

	double[] transform(org.apache.commons.math3.analysis.UnivariateFunction f, double min, double max, int n, org.apache.commons.math3.transform.TransformType type);
}

