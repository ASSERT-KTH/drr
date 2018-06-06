

package org.apache.commons.math.transform;


public class TransformUtils {
	private TransformUtils() {
		super();
	}

	public static double[] scaleArray(double[] f, double d) {
		for (int i = 0; i < (f.length); i++) {
			f[i] *= d;
		}
		return f;
	}

	public static org.apache.commons.math.complex.Complex[] scaleArray(org.apache.commons.math.complex.Complex[] f, double d) {
		for (int i = 0; i < (f.length); i++) {
			f[i] = new org.apache.commons.math.complex.Complex((d * (f[i].getReal())), (d * (f[i].getImaginary())));
		}
		return f;
	}
}

