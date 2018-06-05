

package org.apache.commons.math.geometry;


public class Vector3D implements java.io.Serializable {
	public static final org.apache.commons.math.geometry.Vector3D plusI = new org.apache.commons.math.geometry.Vector3D(1, 0, 0);

	public static final org.apache.commons.math.geometry.Vector3D minusI = new org.apache.commons.math.geometry.Vector3D((-1), 0, 0);

	public static final org.apache.commons.math.geometry.Vector3D plusJ = new org.apache.commons.math.geometry.Vector3D(0, 1, 0);

	public static final org.apache.commons.math.geometry.Vector3D minusJ = new org.apache.commons.math.geometry.Vector3D(0, (-1), 0);

	public static final org.apache.commons.math.geometry.Vector3D plusK = new org.apache.commons.math.geometry.Vector3D(0, 0, 1);

	public static final org.apache.commons.math.geometry.Vector3D minusK = new org.apache.commons.math.geometry.Vector3D(0, 0, (-1));

	public static final org.apache.commons.math.geometry.Vector3D zero = new org.apache.commons.math.geometry.Vector3D(0, 0, 0);

	public Vector3D() {
		x = 0;
		y = 0;
		z = 0;
	}

	public Vector3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Vector3D(double alpha, double delta) {
		double cosDelta = java.lang.Math.cos(delta);
		this.x = (java.lang.Math.cos(alpha)) * cosDelta;
		this.y = (java.lang.Math.sin(alpha)) * cosDelta;
		this.z = java.lang.Math.sin(delta);
	}

	public Vector3D(double a, org.apache.commons.math.geometry.Vector3D u) {
		this.x = a * (u.x);
		this.y = a * (u.y);
		this.z = a * (u.z);
	}

	public Vector3D(double a1, org.apache.commons.math.geometry.Vector3D u1, double a2, org.apache.commons.math.geometry.Vector3D u2) {
		this.x = (a1 * (u1.x)) + (a2 * (u2.x));
		this.y = (a1 * (u1.y)) + (a2 * (u2.y));
		this.z = (a1 * (u1.z)) + (a2 * (u2.z));
	}

	public Vector3D(double a1, org.apache.commons.math.geometry.Vector3D u1, double a2, org.apache.commons.math.geometry.Vector3D u2, double a3, org.apache.commons.math.geometry.Vector3D u3) {
		this.x = ((a1 * (u1.x)) + (a2 * (u2.x))) + (a3 * (u3.x));
		this.y = ((a1 * (u1.y)) + (a2 * (u2.y))) + (a3 * (u3.y));
		this.z = ((a1 * (u1.z)) + (a2 * (u2.z))) + (a3 * (u3.z));
	}

	public Vector3D(double a1, org.apache.commons.math.geometry.Vector3D u1, double a2, org.apache.commons.math.geometry.Vector3D u2, double a3, org.apache.commons.math.geometry.Vector3D u3, double a4, org.apache.commons.math.geometry.Vector3D u4) {
		this.x = (((a1 * (u1.x)) + (a2 * (u2.x))) + (a3 * (u3.x))) + (a4 * (u4.x));
		this.y = (((a1 * (u1.y)) + (a2 * (u2.y))) + (a3 * (u3.y))) + (a4 * (u4.y));
		this.z = (((a1 * (u1.z)) + (a2 * (u2.z))) + (a3 * (u3.z))) + (a4 * (u4.z));
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getZ() {
		return z;
	}

	public double getNorm() {
		return java.lang.Math.sqrt(((((x) * (x)) + ((y) * (y))) + ((z) * (z))));
	}

	public double getAlpha() {
		return java.lang.Math.atan2(y, x);
	}

	public double getDelta() {
		return java.lang.Math.asin(((z) / (getNorm())));
	}

	public org.apache.commons.math.geometry.Vector3D add(org.apache.commons.math.geometry.Vector3D v) {
		return new org.apache.commons.math.geometry.Vector3D(((x) + (v.x)), ((y) + (v.y)), ((z) + (v.z)));
	}

	public org.apache.commons.math.geometry.Vector3D add(double factor, org.apache.commons.math.geometry.Vector3D v) {
		return new org.apache.commons.math.geometry.Vector3D(((x) + (factor * (v.x))), ((y) + (factor * (v.y))), ((z) + (factor * (v.z))));
	}

	public org.apache.commons.math.geometry.Vector3D subtract(org.apache.commons.math.geometry.Vector3D v) {
		return new org.apache.commons.math.geometry.Vector3D(((x) - (v.x)), ((y) - (v.y)), ((z) - (v.z)));
	}

	public org.apache.commons.math.geometry.Vector3D subtract(double factor, org.apache.commons.math.geometry.Vector3D v) {
		return new org.apache.commons.math.geometry.Vector3D(((x) - (factor * (v.x))), ((y) - (factor * (v.y))), ((z) - (factor * (v.z))));
	}

	public org.apache.commons.math.geometry.Vector3D normalize() {
		double s = getNorm();
		if (s == 0) {
			throw new java.lang.ArithmeticException("null norm");
		}
		return multiply((1 / s));
	}

	public org.apache.commons.math.geometry.Vector3D orthogonal() {
		double threshold = 0.6 * (getNorm());
		if (threshold == 0) {
			throw new java.lang.ArithmeticException("null norm");
		}
		if (((x) >= (-threshold)) && ((x) <= threshold)) {
			double inverse = 1 / (java.lang.Math.sqrt((((y) * (y)) + ((z) * (z)))));
			return new org.apache.commons.math.geometry.Vector3D(0, (inverse * (z)), ((-inverse) * (y)));
		}else
			if (((y) >= (-threshold)) && ((y) <= threshold)) {
				double inverse = 1 / (java.lang.Math.sqrt((((x) * (x)) + ((z) * (z)))));
				return new org.apache.commons.math.geometry.Vector3D(((-inverse) * (z)), 0, (inverse * (x)));
			}
		
		double inverse = 1 / (java.lang.Math.sqrt((((x) * (x)) + ((y) * (y)))));
		return new org.apache.commons.math.geometry.Vector3D((inverse * (y)), ((-inverse) * (x)), 0);
	}

	public static double angle(org.apache.commons.math.geometry.Vector3D v1, org.apache.commons.math.geometry.Vector3D v2) {
		double normProduct = (v1.getNorm()) * (v2.getNorm());
		if (normProduct == 0) {
			throw new java.lang.ArithmeticException("null norm");
		}
		double dot = org.apache.commons.math.geometry.Vector3D.dotProduct(v1, v2);
		double threshold = normProduct * 0.9999;
		if ((dot < (-threshold)) || (dot > threshold)) {
			org.apache.commons.math.geometry.Vector3D v3 = org.apache.commons.math.geometry.Vector3D.crossProduct(v1, v2);
			if (dot >= 0) {
				return java.lang.Math.asin(((v3.getNorm()) / normProduct));
			}
			return (java.lang.Math.PI) - (java.lang.Math.asin(((v3.getNorm()) / normProduct)));
		}
		return java.lang.Math.acos((dot / normProduct));
	}

	public org.apache.commons.math.geometry.Vector3D negate() {
		return new org.apache.commons.math.geometry.Vector3D((-(x)), (-(y)), (-(z)));
	}

	public org.apache.commons.math.geometry.Vector3D multiply(double a) {
		return new org.apache.commons.math.geometry.Vector3D((a * (x)), (a * (y)), (a * (z)));
	}

	public static double dotProduct(org.apache.commons.math.geometry.Vector3D v1, org.apache.commons.math.geometry.Vector3D v2) {
		return (((v1.x) * (v2.x)) + ((v1.y) * (v2.y))) + ((v1.z) * (v2.z));
	}

	public static org.apache.commons.math.geometry.Vector3D crossProduct(org.apache.commons.math.geometry.Vector3D v1, org.apache.commons.math.geometry.Vector3D v2) {
		return new org.apache.commons.math.geometry.Vector3D((((v1.y) * (v2.z)) - ((v1.z) * (v2.y))), (((v1.z) * (v2.x)) - ((v1.x) * (v2.z))), (((v1.x) * (v2.y)) - ((v1.y) * (v2.x))));
	}

	private final double x;

	private final double y;

	private final double z;

	private static final long serialVersionUID = 7318440192750283659L;
}

