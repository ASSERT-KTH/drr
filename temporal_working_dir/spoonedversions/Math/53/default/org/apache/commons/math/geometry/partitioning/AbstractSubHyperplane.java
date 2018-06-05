

package org.apache.commons.math.geometry.partitioning;


public abstract class AbstractSubHyperplane<S extends org.apache.commons.math.geometry.Space, T extends org.apache.commons.math.geometry.Space> implements org.apache.commons.math.geometry.partitioning.SubHyperplane<S> {
	private final org.apache.commons.math.geometry.partitioning.Hyperplane<S> hyperplane;

	private final org.apache.commons.math.geometry.partitioning.Region<T> remainingRegion;

	protected AbstractSubHyperplane(final org.apache.commons.math.geometry.partitioning.Hyperplane<S> hyperplane, final org.apache.commons.math.geometry.partitioning.Region<T> remainingRegion) {
		this.hyperplane = hyperplane;
		this.remainingRegion = remainingRegion;
	}

	protected abstract org.apache.commons.math.geometry.partitioning.AbstractSubHyperplane<S, T> buildNew(final org.apache.commons.math.geometry.partitioning.Hyperplane<S> hyper, final org.apache.commons.math.geometry.partitioning.Region<T> remaining);

	public org.apache.commons.math.geometry.partitioning.AbstractSubHyperplane<S, T> copySelf() {
		return buildNew(hyperplane, remainingRegion);
	}

	public org.apache.commons.math.geometry.partitioning.Hyperplane<S> getHyperplane() {
		return hyperplane;
	}

	public org.apache.commons.math.geometry.partitioning.Region<T> getRemainingRegion() {
		return remainingRegion;
	}

	public double getSize() {
		return remainingRegion.getSize();
	}

	public org.apache.commons.math.geometry.partitioning.AbstractSubHyperplane<S, T> reunite(final org.apache.commons.math.geometry.partitioning.SubHyperplane<S> other) {
		@java.lang.SuppressWarnings(value = "unchecked")
		org.apache.commons.math.geometry.partitioning.AbstractSubHyperplane<S, T> o = ((org.apache.commons.math.geometry.partitioning.AbstractSubHyperplane<S, T>) (other));
		return buildNew(hyperplane, new org.apache.commons.math.geometry.partitioning.RegionFactory<T>().union(remainingRegion, o.remainingRegion));
	}

	public org.apache.commons.math.geometry.partitioning.AbstractSubHyperplane<S, T> applyTransform(final org.apache.commons.math.geometry.partitioning.Transform<S, T> transform) {
		final org.apache.commons.math.geometry.partitioning.Hyperplane<S> tHyperplane = transform.apply(hyperplane);
		final org.apache.commons.math.geometry.partitioning.BSPTree<T> tTree = recurseTransform(remainingRegion.getTree(false), tHyperplane, transform);
		return buildNew(tHyperplane, remainingRegion.buildNew(tTree));
	}

	private org.apache.commons.math.geometry.partitioning.BSPTree<T> recurseTransform(final org.apache.commons.math.geometry.partitioning.BSPTree<T> node, final org.apache.commons.math.geometry.partitioning.Hyperplane<S> transformed, final org.apache.commons.math.geometry.partitioning.Transform<S, T> transform) {
		if ((node.getCut()) == null) {
			return new org.apache.commons.math.geometry.partitioning.BSPTree<T>(node.getAttribute());
		}
		@java.lang.SuppressWarnings(value = "unchecked")
		org.apache.commons.math.geometry.partitioning.BoundaryAttribute<T> attribute = ((org.apache.commons.math.geometry.partitioning.BoundaryAttribute<T>) (node.getAttribute()));
		if (attribute != null) {
			final org.apache.commons.math.geometry.partitioning.SubHyperplane<T> tPO = (attribute.getPlusOutside()) == null ? null : transform.apply(attribute.getPlusOutside(), hyperplane, transformed);
			final org.apache.commons.math.geometry.partitioning.SubHyperplane<T> tPI = (attribute.getPlusInside()) == null ? null : transform.apply(attribute.getPlusInside(), hyperplane, transformed);
			attribute = new org.apache.commons.math.geometry.partitioning.BoundaryAttribute<T>(tPO, tPI);
		}
		return new org.apache.commons.math.geometry.partitioning.BSPTree<T>(transform.apply(node.getCut(), hyperplane, transformed), recurseTransform(node.getPlus(), transformed, transform), recurseTransform(node.getMinus(), transformed, transform), attribute);
	}

	public abstract org.apache.commons.math.geometry.partitioning.Side side(org.apache.commons.math.geometry.partitioning.Hyperplane<S> hyper);

	public abstract org.apache.commons.math.geometry.partitioning.SubHyperplane.SplitSubHyperplane<S> split(org.apache.commons.math.geometry.partitioning.Hyperplane<S> hyper);

	public boolean isEmpty() {
		return remainingRegion.isEmpty();
	}
}

