

package org.apache.commons.math.geometry;


public final class RotationOrder {
	private RotationOrder(java.lang.String name, org.apache.commons.math.geometry.Vector3D a1, org.apache.commons.math.geometry.Vector3D a2, org.apache.commons.math.geometry.Vector3D a3) {
		this.name = name;
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return name;
	}

	public org.apache.commons.math.geometry.Vector3D getA1() {
		return a1;
	}

	public org.apache.commons.math.geometry.Vector3D getA2() {
		return a2;
	}

	public org.apache.commons.math.geometry.Vector3D getA3() {
		return a3;
	}

	public static final org.apache.commons.math.geometry.RotationOrder XYZ = new org.apache.commons.math.geometry.RotationOrder("XYZ", org.apache.commons.math.geometry.Vector3D.PLUS_I, org.apache.commons.math.geometry.Vector3D.PLUS_J, org.apache.commons.math.geometry.Vector3D.PLUS_K);

	public static final org.apache.commons.math.geometry.RotationOrder XZY = new org.apache.commons.math.geometry.RotationOrder("XZY", org.apache.commons.math.geometry.Vector3D.PLUS_I, org.apache.commons.math.geometry.Vector3D.PLUS_K, org.apache.commons.math.geometry.Vector3D.PLUS_J);

	public static final org.apache.commons.math.geometry.RotationOrder YXZ = new org.apache.commons.math.geometry.RotationOrder("YXZ", org.apache.commons.math.geometry.Vector3D.PLUS_J, org.apache.commons.math.geometry.Vector3D.PLUS_I, org.apache.commons.math.geometry.Vector3D.PLUS_K);

	public static final org.apache.commons.math.geometry.RotationOrder YZX = new org.apache.commons.math.geometry.RotationOrder("YZX", org.apache.commons.math.geometry.Vector3D.PLUS_J, org.apache.commons.math.geometry.Vector3D.PLUS_K, org.apache.commons.math.geometry.Vector3D.PLUS_I);

	public static final org.apache.commons.math.geometry.RotationOrder ZXY = new org.apache.commons.math.geometry.RotationOrder("ZXY", org.apache.commons.math.geometry.Vector3D.PLUS_K, org.apache.commons.math.geometry.Vector3D.PLUS_I, org.apache.commons.math.geometry.Vector3D.PLUS_J);

	public static final org.apache.commons.math.geometry.RotationOrder ZYX = new org.apache.commons.math.geometry.RotationOrder("ZYX", org.apache.commons.math.geometry.Vector3D.PLUS_K, org.apache.commons.math.geometry.Vector3D.PLUS_J, org.apache.commons.math.geometry.Vector3D.PLUS_I);

	public static final org.apache.commons.math.geometry.RotationOrder XYX = new org.apache.commons.math.geometry.RotationOrder("XYX", org.apache.commons.math.geometry.Vector3D.PLUS_I, org.apache.commons.math.geometry.Vector3D.PLUS_J, org.apache.commons.math.geometry.Vector3D.PLUS_I);

	public static final org.apache.commons.math.geometry.RotationOrder XZX = new org.apache.commons.math.geometry.RotationOrder("XZX", org.apache.commons.math.geometry.Vector3D.PLUS_I, org.apache.commons.math.geometry.Vector3D.PLUS_K, org.apache.commons.math.geometry.Vector3D.PLUS_I);

	public static final org.apache.commons.math.geometry.RotationOrder YXY = new org.apache.commons.math.geometry.RotationOrder("YXY", org.apache.commons.math.geometry.Vector3D.PLUS_J, org.apache.commons.math.geometry.Vector3D.PLUS_I, org.apache.commons.math.geometry.Vector3D.PLUS_J);

	public static final org.apache.commons.math.geometry.RotationOrder YZY = new org.apache.commons.math.geometry.RotationOrder("YZY", org.apache.commons.math.geometry.Vector3D.PLUS_J, org.apache.commons.math.geometry.Vector3D.PLUS_K, org.apache.commons.math.geometry.Vector3D.PLUS_J);

	public static final org.apache.commons.math.geometry.RotationOrder ZXZ = new org.apache.commons.math.geometry.RotationOrder("ZXZ", org.apache.commons.math.geometry.Vector3D.PLUS_K, org.apache.commons.math.geometry.Vector3D.PLUS_I, org.apache.commons.math.geometry.Vector3D.PLUS_K);

	public static final org.apache.commons.math.geometry.RotationOrder ZYZ = new org.apache.commons.math.geometry.RotationOrder("ZYZ", org.apache.commons.math.geometry.Vector3D.PLUS_K, org.apache.commons.math.geometry.Vector3D.PLUS_J, org.apache.commons.math.geometry.Vector3D.PLUS_K);

	private final java.lang.String name;

	private final org.apache.commons.math.geometry.Vector3D a1;

	private final org.apache.commons.math.geometry.Vector3D a2;

	private final org.apache.commons.math.geometry.Vector3D a3;
}

