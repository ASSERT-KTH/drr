

package org.apache.commons.math3.geometry.partitioning;


public abstract class AbstractRegion<S extends org.apache.commons.math3.geometry.Space, T extends org.apache.commons.math3.geometry.Space> implements org.apache.commons.math3.geometry.partitioning.Region<S> {
	private org.apache.commons.math3.geometry.partitioning.BSPTree<S> tree;

	private double size;

	private org.apache.commons.math3.geometry.Vector<S> barycenter;

	protected AbstractRegion() {
		tree = new org.apache.commons.math3.geometry.partitioning.BSPTree<S>(java.lang.Boolean.TRUE);
	}

	protected AbstractRegion(final org.apache.commons.math3.geometry.partitioning.BSPTree<S> tree) {
		org.apache.commons.math3.geometry.partitioning.AbstractRegion.this.tree = tree;
	}

	protected AbstractRegion(final java.util.Collection<org.apache.commons.math3.geometry.partitioning.SubHyperplane<S>> boundary) {
		if ((boundary.size()) == 0) {
			tree = new org.apache.commons.math3.geometry.partitioning.BSPTree<S>(java.lang.Boolean.TRUE);
		}else {
			final java.util.TreeSet<org.apache.commons.math3.geometry.partitioning.SubHyperplane<S>> ordered = new java.util.TreeSet<org.apache.commons.math3.geometry.partitioning.SubHyperplane<S>>(new java.util.Comparator<org.apache.commons.math3.geometry.partitioning.SubHyperplane<S>>() {
				public int compare(final org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> o1, final org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> o2) {
					final double size1 = o1.getSize();
					final double size2 = o2.getSize();
					return size2 < size1 ? -1 : o1 == o2 ? 0 : +1;
				}
			});
			ordered.addAll(boundary);
			tree = new org.apache.commons.math3.geometry.partitioning.BSPTree<S>();
			insertCuts(tree, ordered);
			tree.visit(new org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor<S>() {
				public org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor.Order visitOrder(final org.apache.commons.math3.geometry.partitioning.BSPTree<S> node) {
					return org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor.Order.PLUS_SUB_MINUS;
				}

				public void visitInternalNode(final org.apache.commons.math3.geometry.partitioning.BSPTree<S> node) {
				}

				public void visitLeafNode(final org.apache.commons.math3.geometry.partitioning.BSPTree<S> node) {
					node.setAttribute((node == (node.getParent().getPlus()) ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE));
				}
			});
		}
	}

	public AbstractRegion(final org.apache.commons.math3.geometry.partitioning.Hyperplane<S>[] hyperplanes) {
		if ((hyperplanes == null) || ((hyperplanes.length) == 0)) {
			tree = new org.apache.commons.math3.geometry.partitioning.BSPTree<S>(java.lang.Boolean.FALSE);
		}else {
			tree = hyperplanes[0].wholeSpace().getTree(false);
			org.apache.commons.math3.geometry.partitioning.BSPTree<S> node = tree;
			node.setAttribute(java.lang.Boolean.TRUE);
			for (final org.apache.commons.math3.geometry.partitioning.Hyperplane<S> hyperplane : hyperplanes) {
				if (node.insertCut(hyperplane)) {
					node.setAttribute(null);
					node.getPlus().setAttribute(java.lang.Boolean.FALSE);
					node = node.getMinus();
					node.setAttribute(java.lang.Boolean.TRUE);
				}
			}
		}
	}

	public abstract org.apache.commons.math3.geometry.partitioning.AbstractRegion<S, T> buildNew(org.apache.commons.math3.geometry.partitioning.BSPTree<S> newTree);

	private void insertCuts(final org.apache.commons.math3.geometry.partitioning.BSPTree<S> node, final java.util.Collection<org.apache.commons.math3.geometry.partitioning.SubHyperplane<S>> boundary) {
		final java.util.Iterator<org.apache.commons.math3.geometry.partitioning.SubHyperplane<S>> iterator = boundary.iterator();
		org.apache.commons.math3.geometry.partitioning.Hyperplane<S> inserted = null;
		while ((inserted == null) && (iterator.hasNext())) {
			inserted = iterator.next().getHyperplane();
			if (!(node.insertCut(inserted.copySelf()))) {
				inserted = null;
			}
		} 
		if (!(iterator.hasNext())) {
			return ;
		}
		final java.util.ArrayList<org.apache.commons.math3.geometry.partitioning.SubHyperplane<S>> plusList = new java.util.ArrayList<org.apache.commons.math3.geometry.partitioning.SubHyperplane<S>>();
		final java.util.ArrayList<org.apache.commons.math3.geometry.partitioning.SubHyperplane<S>> minusList = new java.util.ArrayList<org.apache.commons.math3.geometry.partitioning.SubHyperplane<S>>();
		while (iterator.hasNext()) {
			final org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> other = iterator.next();
			switch (other.side(inserted)) {
				case PLUS :
					plusList.add(other);
					break;
				case MINUS :
					minusList.add(other);
					break;
				case BOTH :
					final org.apache.commons.math3.geometry.partitioning.SubHyperplane.SplitSubHyperplane<S> split = other.split(inserted);
					plusList.add(split.getPlus());
					minusList.add(split.getMinus());
					break;
				default :
			}
		} 
		insertCuts(node.getPlus(), plusList);
		insertCuts(node.getMinus(), minusList);
	}

	public org.apache.commons.math3.geometry.partitioning.AbstractRegion<S, T> copySelf() {
		return buildNew(tree.copySelf());
	}

	public boolean isEmpty() {
		return isEmpty(tree);
	}

	public boolean isEmpty(final org.apache.commons.math3.geometry.partitioning.BSPTree<S> node) {
		if ((node.getCut()) == null) {
			return !((java.lang.Boolean) (node.getAttribute()));
		}
		return (isEmpty(node.getMinus())) && (isEmpty(node.getPlus()));
	}

	public boolean contains(final org.apache.commons.math3.geometry.partitioning.Region<S> region) {
		return new org.apache.commons.math3.geometry.partitioning.RegionFactory<S>().difference(region, org.apache.commons.math3.geometry.partitioning.AbstractRegion.this).isEmpty();
	}

	public org.apache.commons.math3.geometry.partitioning.Region.Location checkPoint(final org.apache.commons.math3.geometry.Vector<S> point) {
		return checkPoint(tree, point);
	}

	protected org.apache.commons.math3.geometry.partitioning.Region.Location checkPoint(final org.apache.commons.math3.geometry.partitioning.BSPTree<S> node, final org.apache.commons.math3.geometry.Vector<S> point) {
		final org.apache.commons.math3.geometry.partitioning.BSPTree<S> cell = node.getCell(point);
		if ((cell.getCut()) == null) {
			return ((java.lang.Boolean) (cell.getAttribute())) ? org.apache.commons.math3.geometry.partitioning.Region.Location.INSIDE : org.apache.commons.math3.geometry.partitioning.Region.Location.OUTSIDE;
		}
		final org.apache.commons.math3.geometry.partitioning.Region.Location minusCode = checkPoint(cell.getMinus(), point);
		final org.apache.commons.math3.geometry.partitioning.Region.Location plusCode = checkPoint(cell.getPlus(), point);
		return minusCode == plusCode ? minusCode : org.apache.commons.math3.geometry.partitioning.Region.Location.BOUNDARY;
	}

	public org.apache.commons.math3.geometry.partitioning.BSPTree<S> getTree(final boolean includeBoundaryAttributes) {
		if ((includeBoundaryAttributes && ((tree.getCut()) != null)) && ((tree.getAttribute()) == null)) {
			recurseBuildBoundary(tree);
		}
		return tree;
	}

	private void recurseBuildBoundary(final org.apache.commons.math3.geometry.partitioning.BSPTree<S> node) {
		if ((node.getCut()) != null) {
			org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> plusOutside = null;
			org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> plusInside = null;
			final org.apache.commons.math3.geometry.partitioning.Characterization<S> plusChar = new org.apache.commons.math3.geometry.partitioning.Characterization<S>();
			characterize(node.getPlus(), node.getCut().copySelf(), plusChar);
			if (plusChar.hasOut()) {
				final org.apache.commons.math3.geometry.partitioning.Characterization<S> minusChar = new org.apache.commons.math3.geometry.partitioning.Characterization<S>();
				characterize(node.getMinus(), plusChar.getOut(), minusChar);
				if (minusChar.hasIn()) {
					plusOutside = minusChar.getIn();
				}
			}
			if (plusChar.hasIn()) {
				final org.apache.commons.math3.geometry.partitioning.Characterization<S> minusChar = new org.apache.commons.math3.geometry.partitioning.Characterization<S>();
				characterize(node.getMinus(), plusChar.getIn(), minusChar);
				if (minusChar.hasOut()) {
					plusInside = minusChar.getOut();
				}
			}
			node.setAttribute(new org.apache.commons.math3.geometry.partitioning.BoundaryAttribute<S>(plusOutside, plusInside));
			recurseBuildBoundary(node.getPlus());
			recurseBuildBoundary(node.getMinus());
		}
	}

	private void characterize(final org.apache.commons.math3.geometry.partitioning.BSPTree<S> node, final org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> sub, final org.apache.commons.math3.geometry.partitioning.Characterization<S> characterization) {
		if ((node.getCut()) == null) {
			final boolean inside = ((java.lang.Boolean) (node.getAttribute()));
			characterization.add(sub, inside);
		}else {
			final org.apache.commons.math3.geometry.partitioning.Hyperplane<S> hyperplane = node.getCut().getHyperplane();
			switch (sub.side(hyperplane)) {
				case PLUS :
					characterize(node.getPlus(), sub, characterization);
					break;
				case MINUS :
					characterize(node.getMinus(), sub, characterization);
					break;
				case BOTH :
					final org.apache.commons.math3.geometry.partitioning.SubHyperplane.SplitSubHyperplane<S> split = sub.split(hyperplane);
					characterize(node.getPlus(), split.getPlus(), characterization);
					characterize(node.getMinus(), split.getMinus(), characterization);
					break;
				default :
					throw new java.lang.RuntimeException("internal error");
			}
		}
	}

	public double getBoundarySize() {
		final org.apache.commons.math3.geometry.partitioning.BoundarySizeVisitor<S> visitor = new org.apache.commons.math3.geometry.partitioning.BoundarySizeVisitor<S>();
		getTree(true).visit(visitor);
		return visitor.getSize();
	}

	public double getSize() {
		if ((barycenter) == null) {
			computeGeometricalProperties();
		}
		return size;
	}

	protected void setSize(final double size) {
		org.apache.commons.math3.geometry.partitioning.AbstractRegion.this.size = size;
	}

	public org.apache.commons.math3.geometry.Vector<S> getBarycenter() {
		if ((barycenter) == null) {
			computeGeometricalProperties();
		}
		return barycenter;
	}

	protected void setBarycenter(final org.apache.commons.math3.geometry.Vector<S> barycenter) {
		org.apache.commons.math3.geometry.partitioning.AbstractRegion.this.barycenter = barycenter;
	}

	protected abstract void computeGeometricalProperties();

	public org.apache.commons.math3.geometry.partitioning.Side side(final org.apache.commons.math3.geometry.partitioning.Hyperplane<S> hyperplane) {
		final org.apache.commons.math3.geometry.partitioning.AbstractRegion.Sides sides = new org.apache.commons.math3.geometry.partitioning.AbstractRegion.Sides();
		recurseSides(tree, hyperplane.wholeHyperplane(), sides);
		return sides.plusFound() ? sides.minusFound() ? org.apache.commons.math3.geometry.partitioning.Side.BOTH : org.apache.commons.math3.geometry.partitioning.Side.PLUS : sides.minusFound() ? org.apache.commons.math3.geometry.partitioning.Side.MINUS : org.apache.commons.math3.geometry.partitioning.Side.HYPER;
	}

	private void recurseSides(final org.apache.commons.math3.geometry.partitioning.BSPTree<S> node, final org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> sub, final org.apache.commons.math3.geometry.partitioning.AbstractRegion.Sides sides) {
		if ((node.getCut()) == null) {
			if (((java.lang.Boolean) (node.getAttribute()))) {
				sides.rememberPlusFound();
				sides.rememberMinusFound();
			}
			return ;
		}
		final org.apache.commons.math3.geometry.partitioning.Hyperplane<S> hyperplane = node.getCut().getHyperplane();
		switch (sub.side(hyperplane)) {
			case PLUS :
				if ((node.getCut().side(sub.getHyperplane())) == (org.apache.commons.math3.geometry.partitioning.Side.PLUS)) {
					if (!(isEmpty(node.getMinus()))) {
						sides.rememberPlusFound();
					}
				}else {
					if (!(isEmpty(node.getMinus()))) {
						sides.rememberMinusFound();
					}
				}
				if (!((sides.plusFound()) && (sides.minusFound()))) {
					recurseSides(node.getPlus(), sub, sides);
				}
				break;
			case MINUS :
				if ((node.getCut().side(sub.getHyperplane())) == (org.apache.commons.math3.geometry.partitioning.Side.PLUS)) {
					if (!(isEmpty(node.getPlus()))) {
						sides.rememberPlusFound();
					}
				}else {
					if (!(isEmpty(node.getPlus()))) {
						sides.rememberMinusFound();
					}
				}
				if (!((sides.plusFound()) && (sides.minusFound()))) {
					recurseSides(node.getMinus(), sub, sides);
				}
				break;
			case BOTH :
				final org.apache.commons.math3.geometry.partitioning.SubHyperplane.SplitSubHyperplane<S> split = sub.split(hyperplane);
				recurseSides(node.getPlus(), split.getPlus(), sides);
				if (!((sides.plusFound()) && (sides.minusFound()))) {
					recurseSides(node.getMinus(), split.getMinus(), sides);
				}
				break;
			default :
				if (node.getCut().getHyperplane().sameOrientationAs(sub.getHyperplane())) {
					if (((node.getPlus().getCut()) != null) || ((java.lang.Boolean) (node.getPlus().getAttribute()))) {
						sides.rememberPlusFound();
					}
					if (((node.getMinus().getCut()) != null) || ((java.lang.Boolean) (node.getMinus().getAttribute()))) {
						sides.rememberMinusFound();
					}
				}else {
					if (((node.getPlus().getCut()) != null) || ((java.lang.Boolean) (node.getPlus().getAttribute()))) {
						sides.rememberMinusFound();
					}
					if (((node.getMinus().getCut()) != null) || ((java.lang.Boolean) (node.getMinus().getAttribute()))) {
						sides.rememberPlusFound();
					}
				}
		}
	}

	private static final class Sides {
		private boolean plusFound;

		private boolean minusFound;

		public Sides() {
			plusFound = false;
			minusFound = false;
		}

		public void rememberPlusFound() {
			plusFound = true;
		}

		public boolean plusFound() {
			return plusFound;
		}

		public void rememberMinusFound() {
			minusFound = true;
		}

		public boolean minusFound() {
			return minusFound;
		}
	}

	public org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> intersection(final org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> sub) {
		return recurseIntersection(tree, sub);
	}

	private org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> recurseIntersection(final org.apache.commons.math3.geometry.partitioning.BSPTree<S> node, final org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> sub) {
		if ((node.getCut()) == null) {
			return ((java.lang.Boolean) (node.getAttribute())) ? sub.copySelf() : null;
		}
		final org.apache.commons.math3.geometry.partitioning.Hyperplane<S> hyperplane = node.getCut().getHyperplane();
		switch (sub.side(hyperplane)) {
			case PLUS :
				return recurseIntersection(node.getPlus(), sub);
			case MINUS :
				return recurseIntersection(node.getMinus(), sub);
			case BOTH :
				final org.apache.commons.math3.geometry.partitioning.SubHyperplane.SplitSubHyperplane<S> split = sub.split(hyperplane);
				final org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> plus = recurseIntersection(node.getPlus(), split.getPlus());
				final org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> minus = recurseIntersection(node.getMinus(), split.getMinus());
				if (plus == null) {
					return minus;
				}else
					if (minus == null) {
						return plus;
					}else {
						return plus.reunite(minus);
					}
				
			default :
				return recurseIntersection(node.getPlus(), recurseIntersection(node.getMinus(), sub));
		}
	}

	public org.apache.commons.math3.geometry.partitioning.AbstractRegion<S, T> applyTransform(final org.apache.commons.math3.geometry.partitioning.Transform<S, T> transform) {
		return buildNew(recurseTransform(getTree(false), transform));
	}

	@java.lang.SuppressWarnings(value = "unchecked")
	private org.apache.commons.math3.geometry.partitioning.BSPTree<S> recurseTransform(final org.apache.commons.math3.geometry.partitioning.BSPTree<S> node, final org.apache.commons.math3.geometry.partitioning.Transform<S, T> transform) {
		if ((node.getCut()) == null) {
			return new org.apache.commons.math3.geometry.partitioning.BSPTree<S>(node.getAttribute());
		}
		final org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> sub = node.getCut();
		final org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> tSub = ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<S, T>) (sub)).applyTransform(transform);
		org.apache.commons.math3.geometry.partitioning.BoundaryAttribute<S> attribute = ((org.apache.commons.math3.geometry.partitioning.BoundaryAttribute<S>) (node.getAttribute()));
		if (attribute != null) {
			final org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> tPO = (attribute.getPlusOutside()) == null ? null : ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<S, T>) (attribute.getPlusOutside())).applyTransform(transform);
			final org.apache.commons.math3.geometry.partitioning.SubHyperplane<S> tPI = (attribute.getPlusInside()) == null ? null : ((org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane<S, T>) (attribute.getPlusInside())).applyTransform(transform);
			attribute = new org.apache.commons.math3.geometry.partitioning.BoundaryAttribute<S>(tPO, tPI);
		}
		return new org.apache.commons.math3.geometry.partitioning.BSPTree<S>(tSub, recurseTransform(node.getPlus(), transform), recurseTransform(node.getMinus(), transform), attribute);
	}
}

