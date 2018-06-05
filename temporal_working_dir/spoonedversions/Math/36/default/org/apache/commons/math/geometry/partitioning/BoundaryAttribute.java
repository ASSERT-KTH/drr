

package org.apache.commons.math.geometry.partitioning;


public class BoundaryAttribute<S extends org.apache.commons.math.geometry.Space> {
	private final org.apache.commons.math.geometry.partitioning.SubHyperplane<S> plusOutside;

	private final org.apache.commons.math.geometry.partitioning.SubHyperplane<S> plusInside;

	public BoundaryAttribute(final org.apache.commons.math.geometry.partitioning.SubHyperplane<S> plusOutside, final org.apache.commons.math.geometry.partitioning.SubHyperplane<S> plusInside) {
		this.plusOutside = plusOutside;
		this.plusInside = plusInside;
	}

	public org.apache.commons.math.geometry.partitioning.SubHyperplane<S> getPlusOutside() {
		return plusOutside;
	}

	public org.apache.commons.math.geometry.partitioning.SubHyperplane<S> getPlusInside() {
		return plusInside;
	}
}

