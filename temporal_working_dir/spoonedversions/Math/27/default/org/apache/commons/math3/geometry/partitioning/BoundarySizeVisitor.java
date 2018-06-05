

package org.apache.commons.math3.geometry.partitioning;


class BoundarySizeVisitor<S extends org.apache.commons.math3.geometry.Space> implements org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor<S> {
	private double boundarySize;

	public BoundarySizeVisitor() {
		boundarySize = 0;
	}

	public org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor.Order visitOrder(final org.apache.commons.math3.geometry.partitioning.BSPTree<S> node) {
		return org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor.Order.MINUS_SUB_PLUS;
	}

	public void visitInternalNode(final org.apache.commons.math3.geometry.partitioning.BSPTree<S> node) {
		@java.lang.SuppressWarnings(value = "unchecked")
		final org.apache.commons.math3.geometry.partitioning.BoundaryAttribute<S> attribute = ((org.apache.commons.math3.geometry.partitioning.BoundaryAttribute<S>) (node.getAttribute()));
		if ((attribute.getPlusOutside()) != null) {
			boundarySize += attribute.getPlusOutside().getSize();
		}
		if ((attribute.getPlusInside()) != null) {
			boundarySize += attribute.getPlusInside().getSize();
		}
	}

	public void visitLeafNode(final org.apache.commons.math3.geometry.partitioning.BSPTree<S> node) {
	}

	public double getSize() {
		return boundarySize;
	}
}

