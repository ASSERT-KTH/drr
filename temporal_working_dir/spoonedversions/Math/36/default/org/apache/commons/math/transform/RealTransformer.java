

package org.apache.commons.math.transform;


public interface RealTransformer {
	double[] transform(double[] f, org.apache.commons.math.transform.TransformType type);

	double[] transform(org.apache.commons.math.analysis.UnivariateFunction f, double min, double max, int n, org.apache.commons.math.transform.TransformType type);
}

