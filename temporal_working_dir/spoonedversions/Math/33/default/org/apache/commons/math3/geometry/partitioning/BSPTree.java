

package org.apache.commons.math3.geometry.partitioning;


public class BSPTree<S extends org.apache.commons.math3.geometry.Space> {
	private org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> cut;

	private org.apache.commons.math3.geometry.partitioning.BSPTree<S> plus;

	private org.apache.commons.math3.geometry.partitioning.BSPTree<S> minus;

	private org.apache.commons.math3.geometry.partitioning.BSPTree<S> parent;

	private java.lang.Object attribute;

	public BSPTree() {
		cut = null;
		plus = null;
		minus = null;
		parent = null;
		attribute = null;
	}

	public BSPTree(final java.lang.Object attribute) {
		cut = null;
		plus = null;
		minus = null;
		parent = null;
		org.apache.commons.math3.geometry.partitioning.BSPTree.this.attribute = attribute;
	}

	public BSPTree(final org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> cut, final org.apache.commons.math3.geometry.partitioning.BSPTree<S> plus, final org.apache.commons.math3.geometry.partitioning.BSPTree<S> minus, final java.lang.Object attribute) {
		org.apache.commons.math3.geometry.partitioning.BSPTree.this.cut = cut;
		org.apache.commons.math3.geometry.partitioning.BSPTree.this.plus = plus;
		org.apache.commons.math3.geometry.partitioning.BSPTree.this.minus = minus;
		org.apache.commons.math3.geometry.partitioning.BSPTree.this.parent = null;
		org.apache.commons.math3.geometry.partitioning.BSPTree.this.attribute = attribute;
		plus.parent = org.apache.commons.math3.geometry.partitioning.BSPTree.this;
		minus.parent = org.apache.commons.math3.geometry.partitioning.BSPTree.this;
	}

	public boolean insertCut(final org.apache.commons.math3.geometry.partitioning.Hyperplane<S> hyperplane) {
		if ((cut) != null) {
			plus.parent = null;
			minus.parent = null;
		}
		final org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> chopped = fitToCell(hyperplane.wholeHyperplane());
		if (chopped.isEmpty()) {
			cut = null;
			plus = null;
			minus = null;
			return false;
		}
		cut = chopped;
		plus = new org.apache.commons.math3.geometry.partitioning.BSPTree<S>();
		plus.parent = org.apache.commons.math3.geometry.partitioning.BSPTree.this;
		minus = new org.apache.commons.math3.geometry.partitioning.BSPTree<S>();
		minus.parent = org.apache.commons.math3.geometry.partitioning.BSPTree.this;
		return true;
	}

	public org.apache.commons.math3.geometry.partitioning.BSPTree<S> copySelf() {
		if ((cut) == null) {
			return new org.apache.commons.math3.geometry.partitioning.BSPTree<S>(attribute);
		}
		return new org.apache.commons.math3.geometry.partitioning.BSPTree<S>(cut.copySelf(), plus.copySelf(), minus.copySelf(), attribute);
	}

	public org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> getCut() {
		return cut;
	}

	public org.apache.commons.math3.geometry.partitioning.BSPTree<S> getPlus() {
		return plus;
	}

	public org.apache.commons.math3.geometry.partitioning.BSPTree<S> getMinus() {
		return minus;
	}

	public org.apache.commons.math3.geometry.partitioning.BSPTree<S> getParent() {
		return parent;
	}

	public void setAttribute(final java.lang.Object attribute) {
		org.apache.commons.math3.geometry.partitioning.BSPTree.this.attribute = attribute;
	}

	public java.lang.Object getAttribute() {
		return attribute;
	}

	public void visit(final org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor<S> visitor) {
		if ((cut) == null) {
			visitor.visitLeafNode(org.apache.commons.math3.geometry.partitioning.BSPTree.this);
		}else {
			switch (visitor.visitOrder(org.apache.commons.math3.geometry.partitioning.BSPTree.this)) {
				case PLUS_MINUS_SUB :
					plus.visit(visitor);
					minus.visit(visitor);
					visitor.visitInternalNode(org.apache.commons.math3.geometry.partitioning.BSPTree.this);
					break;
				case PLUS_SUB_MINUS :
					plus.visit(visitor);
					visitor.visitInternalNode(org.apache.commons.math3.geometry.partitioning.BSPTree.this);
					minus.visit(visitor);
					break;
				case MINUS_PLUS_SUB :
					minus.visit(visitor);
					plus.visit(visitor);
					visitor.visitInternalNode(org.apache.commons.math3.geometry.partitioning.BSPTree.this);
					break;
				case MINUS_SUB_PLUS :
					minus.visit(visitor);
					visitor.visitInternalNode(org.apache.commons.math3.geometry.partitioning.BSPTree.this);
					plus.visit(visitor);
					break;
				case SUB_PLUS_MINUS :
					visitor.visitInternalNode(org.apache.commons.math3.geometry.partitioning.BSPTree.this);
					plus.visit(visitor);
					minus.visit(visitor);
					break;
				case SUB_MINUS_PLUS :
					visitor.visitInternalNode(org.apache.commons.math3.geometry.partitioning.BSPTree.this);
					minus.visit(visitor);
					plus.visit(visitor);
					break;
				default :
					throw new java.lang.RuntimeException("internal error");
			}
		}
	}

	private org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> fitToCell(final org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> sub) {
		org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> s = sub;
		for (org.apache.commons.math3.geometry.partitioning.BSPTree<S> tree = org.apache.commons.math3.geometry.partitioning.BSPTree.this; (tree.parent) != null; tree = tree.parent) {
			if (tree == (tree.parent.plus)) {
				s = s.split(tree.parent.cut.getHyperplane()).getPlus();
			}else {
				s = s.split(tree.parent.cut.getHyperplane()).getMinus();
			}
		}
		return s;
	}

	public org.apache.commons.math3.geometry.partitioning.BSPTree<S> getCell(final org.apache.commons.math3.geometry.Vector<S> point) {
		if ((cut) == null) {
			return org.apache.commons.math3.geometry.partitioning.BSPTree.this;
		}
		final double offset = cut.getHyperplane().getOffset(point);
		if ((org.apache.commons.math3.util.FastMath.abs(offset)) < 1.0E-10) {
			return org.apache.commons.math3.geometry.partitioning.BSPTree.this;
		}else
			if (offset <= 0) {
				return minus.getCell(point);
			}else {
				return plus.getCell(point);
			}
		
	}

	private void condense() {
		if (((((cut) != null) && ((plus.cut) == null)) && ((minus.cut) == null)) && ((((plus.attribute) == null) && ((minus.attribute) == null)) || (((plus.attribute) != null) && (plus.attribute.equals(minus.attribute))))) {
			attribute = ((plus.attribute) == null) ? minus.attribute : plus.attribute;
			cut = null;
			plus = null;
			minus = null;
		}
	}

	public org.apache.commons.math3.geometry.partitioning.BSPTree<S> merge(final org.apache.commons.math3.geometry.partitioning.BSPTree<S> tree, final org.apache.commons.math3.geometry.partitioning.BSPTree.LeafMerger<S> leafMerger) {
		return merge(tree, leafMerger, null, false);
	}

	private org.apache.commons.math3.geometry.partitioning.BSPTree<S> merge(final org.apache.commons.math3.geometry.partitioning.BSPTree<S> tree, final org.apache.commons.math3.geometry.partitioning.BSPTree.LeafMerger<S> leafMerger, final org.apache.commons.math3.geometry.partitioning.BSPTree<S> parentTree, final boolean isPlusChild) {
		if ((cut) == null) {
			return leafMerger.merge(org.apache.commons.math3.geometry.partitioning.BSPTree.this, tree, parentTree, isPlusChild, true);
		}else
			if ((tree.cut) == null) {
				return leafMerger.merge(tree, org.apache.commons.math3.geometry.partitioning.BSPTree.this, parentTree, isPlusChild, false);
			}else {
				final org.apache.commons.math3.geometry.partitioning.BSPTree<S> merged = tree.split(cut);
				if (parentTree != null) {
					merged.parent = parentTree;
					if (isPlusChild) {
						parentTree.plus = merged;
					}else {
						parentTree.minus = merged;
					}
				}
				plus.merge(merged.plus, leafMerger, merged, true);
				minus.merge(merged.minus, leafMerger, merged, false);
				merged.condense();
				if ((merged.cut) != null) {
					merged.cut = merged.fitToCell(merged.cut.getHyperplane().wholeHyperplane());
				}
				return merged;
			}
		
	}

	public interface LeafMerger<S extends org.apache.commons.math3.geometry.Space> {
		org.apache.commons.math3.geometry.partitioning.BSPTree<S> merge(org.apache.commons.math3.geometry.partitioning.BSPTree<S> leaf, org.apache.commons.math3.geometry.partitioning.BSPTree<S> tree, org.apache.commons.math3.geometry.partitioning.BSPTree<S> parentTree, boolean isPlusChild, boolean leafFromInstance);
	}

	public org.apache.commons.math3.geometry.partitioning.BSPTree<S> split(final org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> sub) {
		if ((cut) == null) {
			return new org.apache.commons.math3.geometry.partitioning.BSPTree<S>(sub, copySelf(), new org.apache.commons.math3.geometry.partitioning.BSPTree<S>(attribute), null);
		}
		final org.apache.commons.math3.geometry.partitioning.Hyperplane<S> cHyperplane = cut.getHyperplane();
		final org.apache.commons.math3.geometry.partitioning.Hyperplane<S> sHyperplane = sub.getHyperplane();
		switch (sub.side(cHyperplane)) {
			case PLUS :
				{
					final org.apache.commons.math3.geometry.partitioning.BSPTree<S> split = plus.split(sub);
					if ((cut.side(sHyperplane)) == (org.apache.commons.math3.geometry.partitioning.Side.PLUS)) {
						split.plus = new org.apache.commons.math3.geometry.partitioning.BSPTree<S>(cut.copySelf(), split.plus, minus.copySelf(), attribute);
						split.plus.condense();
						split.plus.parent = split;
					}else {
						split.minus = new org.apache.commons.math3.geometry.partitioning.BSPTree<S>(cut.copySelf(), split.minus, minus.copySelf(), attribute);
						split.minus.condense();
						split.minus.parent = split;
					}
					return split;
				}
			case MINUS :
				{
					final org.apache.commons.math3.geometry.partitioning.BSPTree<S> split = minus.split(sub);
					if ((cut.side(sHyperplane)) == (org.apache.commons.math3.geometry.partitioning.Side.PLUS)) {
						split.plus = new org.apache.commons.math3.geometry.partitioning.BSPTree<S>(cut.copySelf(), plus.copySelf(), split.plus, attribute);
						split.plus.condense();
						split.plus.parent = split;
					}else {
						split.minus = new org.apache.commons.math3.geometry.partitioning.BSPTree<S>(cut.copySelf(), plus.copySelf(), split.minus, attribute);
						split.minus.condense();
						split.minus.parent = split;
					}
					return split;
				}
			case BOTH :
				{
					final org.apache.commons.math3.geometry.partitioning.SubHyperplane.SplitSubHyperplane<S> cutParts = cut.split(sHyperplane);
					final org.apache.commons.math3.geometry.partitioning.SubHyperplane.SplitSubHyperplane<S> subParts = sub.split(cHyperplane);
					final org.apache.commons.math3.geometry.partitioning.BSPTree<S> split = new org.apache.commons.math3.geometry.partitioning.BSPTree<S>(sub, plus.split(subParts.getPlus()), minus.split(subParts.getMinus()), null);
					split.plus.cut = cutParts.getPlus();
					split.minus.cut = cutParts.getMinus();
					final org.apache.commons.math3.geometry.partitioning.BSPTree<S> tmp = split.plus.minus;
					split.plus.minus = split.minus.plus;
					split.plus.minus.parent = split.plus;
					split.minus.plus = tmp;
					split.minus.plus.parent = split.minus;
					split.plus.condense();
					split.minus.condense();
					return split;
				}
			default :
				return cHyperplane.sameOrientationAs(sHyperplane) ? new org.apache.commons.math3.geometry.partitioning.BSPTree<S>(sub, plus.copySelf(), minus.copySelf(), attribute) : new org.apache.commons.math3.geometry.partitioning.BSPTree<S>(sub, minus.copySelf(), plus.copySelf(), attribute);
		}
	}

	public void insertInTree(final org.apache.commons.math3.geometry.partitioning.BSPTree<S> parentTree, final boolean isPlusChild) {
		parent = parentTree;
		if (parentTree != null) {
			if (isPlusChild) {
				parentTree.plus = org.apache.commons.math3.geometry.partitioning.BSPTree.this;
			}else {
				parentTree.minus = org.apache.commons.math3.geometry.partitioning.BSPTree.this;
			}
		}
		if ((cut) != null) {
			for (org.apache.commons.math3.geometry.partitioning.BSPTree<S> tree = org.apache.commons.math3.geometry.partitioning.BSPTree.this; (tree.parent) != null; tree = tree.parent) {
				final org.apache.commons.math3.geometry.partitioning.Hyperplane<S> hyperplane = tree.parent.cut.getHyperplane();
				if (tree == (tree.parent.plus)) {
					cut = cut.split(hyperplane).getPlus();
					plus.chopOffMinus(hyperplane);
					minus.chopOffMinus(hyperplane);
				}else {
					cut = cut.split(hyperplane).getMinus();
					plus.chopOffPlus(hyperplane);
					minus.chopOffPlus(hyperplane);
				}
			}
			condense();
		}
	}

	private void chopOffMinus(final org.apache.commons.math3.geometry.partitioning.Hyperplane<S> hyperplane) {
		if ((cut) != null) {
			cut = cut.split(hyperplane).getPlus();
			plus.chopOffMinus(hyperplane);
			minus.chopOffMinus(hyperplane);
		}
	}

	private void chopOffPlus(final org.apache.commons.math3.geometry.partitioning.Hyperplane<S> hyperplane) {
		if ((cut) != null) {
			cut = cut.split(hyperplane).getMinus();
			plus.chopOffPlus(hyperplane);
			minus.chopOffPlus(hyperplane);
		}
	}
}

