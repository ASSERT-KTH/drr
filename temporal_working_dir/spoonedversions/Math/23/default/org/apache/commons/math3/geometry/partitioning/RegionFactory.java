

package org.apache.commons.math3.geometry.partitioning;


public class RegionFactory<S extends org.apache.commons.math3.geometry.Space> {
	private final org.apache.commons.math3.geometry.partitioning.RegionFactory<S>.NodesCleaner nodeCleaner;

	public RegionFactory() {
		nodeCleaner = new NodesCleaner();
	}

	public org.apache.commons.math3.geometry.partitioning.Region<S> buildConvex(final org.apache.commons.math3.geometry.partitioning.Hyperplane<S>... hyperplanes) {
		if ((hyperplanes == null) || ((hyperplanes.length) == 0)) {
			return null;
		}
		final org.apache.commons.math3.geometry.partitioning.Region<S> region = hyperplanes[0].wholeSpace();
		org.apache.commons.math3.geometry.partitioning.BSPTree<S> node = region.getTree(false);
		node.setAttribute(java.lang.Boolean.TRUE);
		for (final org.apache.commons.math3.geometry.partitioning.Hyperplane<S> hyperplane : hyperplanes) {
			if (node.insertCut(hyperplane)) {
				node.setAttribute(null);
				node.getPlus().setAttribute(java.lang.Boolean.FALSE);
				node = node.getMinus();
				node.setAttribute(java.lang.Boolean.TRUE);
			}
		}
		return region;
	}

	public org.apache.commons.math3.geometry.partitioning.Region<S> union(final org.apache.commons.math3.geometry.partitioning.Region<S> region1, final org.apache.commons.math3.geometry.partitioning.Region<S> region2) {
		final org.apache.commons.math3.geometry.partitioning.BSPTree<S> tree = region1.getTree(false).merge(region2.getTree(false), new UnionMerger());
		tree.visit(nodeCleaner);
		return region1.buildNew(tree);
	}

	public org.apache.commons.math3.geometry.partitioning.Region<S> intersection(final org.apache.commons.math3.geometry.partitioning.Region<S> region1, final org.apache.commons.math3.geometry.partitioning.Region<S> region2) {
		final org.apache.commons.math3.geometry.partitioning.BSPTree<S> tree = region1.getTree(false).merge(region2.getTree(false), new IntersectionMerger());
		tree.visit(nodeCleaner);
		return region1.buildNew(tree);
	}

	public org.apache.commons.math3.geometry.partitioning.Region<S> xor(final org.apache.commons.math3.geometry.partitioning.Region<S> region1, final org.apache.commons.math3.geometry.partitioning.Region<S> region2) {
		final org.apache.commons.math3.geometry.partitioning.BSPTree<S> tree = region1.getTree(false).merge(region2.getTree(false), new XorMerger());
		tree.visit(nodeCleaner);
		return region1.buildNew(tree);
	}

	public org.apache.commons.math3.geometry.partitioning.Region<S> difference(final org.apache.commons.math3.geometry.partitioning.Region<S> region1, final org.apache.commons.math3.geometry.partitioning.Region<S> region2) {
		final org.apache.commons.math3.geometry.partitioning.BSPTree<S> tree = region1.getTree(false).merge(region2.getTree(false), new DifferenceMerger());
		tree.visit(nodeCleaner);
		return region1.buildNew(tree);
	}

	public org.apache.commons.math3.geometry.partitioning.Region<S> getComplement(final org.apache.commons.math3.geometry.partitioning.Region<S> region) {
		return region.buildNew(recurseComplement(region.getTree(false)));
	}

	private org.apache.commons.math3.geometry.partitioning.BSPTree<S> recurseComplement(final org.apache.commons.math3.geometry.partitioning.BSPTree<S> node) {
		if ((node.getCut()) == null) {
			return new org.apache.commons.math3.geometry.partitioning.BSPTree<S>((((java.lang.Boolean) (node.getAttribute())) ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE));
		}
		@java.lang.SuppressWarnings(value = "unchecked")
		org.apache.commons.math3.geometry.partitioning.BoundaryAttribute<S> attribute = ((org.apache.commons.math3.geometry.partitioning.BoundaryAttribute<S>) (node.getAttribute()));
		if (attribute != null) {
			final org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> plusOutside = (attribute.getPlusInside()) == null ? null : attribute.getPlusInside().copySelf();
			final org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> plusInside = (attribute.getPlusOutside()) == null ? null : attribute.getPlusOutside().copySelf();
			attribute = new org.apache.commons.math3.geometry.partitioning.BoundaryAttribute<S>(plusOutside, plusInside);
		}
		return new org.apache.commons.math3.geometry.partitioning.BSPTree<S>(node.getCut().copySelf(), recurseComplement(node.getPlus()), recurseComplement(node.getMinus()), attribute);
	}

	private class UnionMerger implements org.apache.commons.math3.geometry.partitioning.BSPTree.LeafMerger<S> {
		public org.apache.commons.math3.geometry.partitioning.BSPTree<S> merge(final org.apache.commons.math3.geometry.partitioning.BSPTree<S> leaf, final org.apache.commons.math3.geometry.partitioning.BSPTree<S> tree, final org.apache.commons.math3.geometry.partitioning.BSPTree<S> parentTree, final boolean isPlusChild, final boolean leafFromInstance) {
			if (((java.lang.Boolean) (leaf.getAttribute()))) {
				leaf.insertInTree(parentTree, isPlusChild);
				return leaf;
			}
			tree.insertInTree(parentTree, isPlusChild);
			return tree;
		}
	}

	private class IntersectionMerger implements org.apache.commons.math3.geometry.partitioning.BSPTree.LeafMerger<S> {
		public org.apache.commons.math3.geometry.partitioning.BSPTree<S> merge(final org.apache.commons.math3.geometry.partitioning.BSPTree<S> leaf, final org.apache.commons.math3.geometry.partitioning.BSPTree<S> tree, final org.apache.commons.math3.geometry.partitioning.BSPTree<S> parentTree, final boolean isPlusChild, final boolean leafFromInstance) {
			if (((java.lang.Boolean) (leaf.getAttribute()))) {
				tree.insertInTree(parentTree, isPlusChild);
				return tree;
			}
			leaf.insertInTree(parentTree, isPlusChild);
			return leaf;
		}
	}

	private class XorMerger implements org.apache.commons.math3.geometry.partitioning.BSPTree.LeafMerger<S> {
		public org.apache.commons.math3.geometry.partitioning.BSPTree<S> merge(final org.apache.commons.math3.geometry.partitioning.BSPTree<S> leaf, final org.apache.commons.math3.geometry.partitioning.BSPTree<S> tree, final org.apache.commons.math3.geometry.partitioning.BSPTree<S> parentTree, final boolean isPlusChild, final boolean leafFromInstance) {
			org.apache.commons.math3.geometry.partitioning.BSPTree<S> t = tree;
			if (((java.lang.Boolean) (leaf.getAttribute()))) {
				t = recurseComplement(t);
			}
			t.insertInTree(parentTree, isPlusChild);
			return t;
		}
	}

	private class DifferenceMerger implements org.apache.commons.math3.geometry.partitioning.BSPTree.LeafMerger<S> {
		public org.apache.commons.math3.geometry.partitioning.BSPTree<S> merge(final org.apache.commons.math3.geometry.partitioning.BSPTree<S> leaf, final org.apache.commons.math3.geometry.partitioning.BSPTree<S> tree, final org.apache.commons.math3.geometry.partitioning.BSPTree<S> parentTree, final boolean isPlusChild, final boolean leafFromInstance) {
			if (((java.lang.Boolean) (leaf.getAttribute()))) {
				final org.apache.commons.math3.geometry.partitioning.BSPTree<S> argTree = recurseComplement((leafFromInstance ? tree : leaf));
				argTree.insertInTree(parentTree, isPlusChild);
				return argTree;
			}
			final org.apache.commons.math3.geometry.partitioning.BSPTree<S> instanceTree = leafFromInstance ? leaf : tree;
			instanceTree.insertInTree(parentTree, isPlusChild);
			return instanceTree;
		}
	}

	private class NodesCleaner implements org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor<S> {
		public org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor.Order visitOrder(final org.apache.commons.math3.geometry.partitioning.BSPTree<S> node) {
			return org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor.Order.PLUS_SUB_MINUS;
		}

		public void visitInternalNode(final org.apache.commons.math3.geometry.partitioning.BSPTree<S> node) {
			node.setAttribute(null);
		}

		public void visitLeafNode(final org.apache.commons.math3.geometry.partitioning.BSPTree<S> node) {
		}
	}
}

