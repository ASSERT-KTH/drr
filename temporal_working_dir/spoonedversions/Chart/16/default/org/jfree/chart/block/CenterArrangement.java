

package org.jfree.chart.block;


public class CenterArrangement implements java.io.Serializable , org.jfree.chart.block.Arrangement {
	private static final long serialVersionUID = -353308149220382047L;

	public CenterArrangement() {
	}

	public void add(org.jfree.chart.block.Block block, java.lang.Object key) {
	}

	public org.jfree.chart.util.Size2D arrange(org.jfree.chart.block.BlockContainer container, java.awt.Graphics2D g2, org.jfree.chart.block.RectangleConstraint constraint) {
		org.jfree.chart.block.LengthConstraintType w = constraint.getWidthConstraintType();
		org.jfree.chart.block.LengthConstraintType h = constraint.getHeightConstraintType();
		if (w == (org.jfree.chart.block.LengthConstraintType.NONE)) {
			if (h == (org.jfree.chart.block.LengthConstraintType.NONE)) {
				return arrangeNN(container, g2);
			}else
				if (h == (org.jfree.chart.block.LengthConstraintType.FIXED)) {
					throw new java.lang.RuntimeException("Not implemented.");
				}else
					if (h == (org.jfree.chart.block.LengthConstraintType.RANGE)) {
						throw new java.lang.RuntimeException("Not implemented.");
					}
				
			
		}else
			if (w == (org.jfree.chart.block.LengthConstraintType.FIXED)) {
				if (h == (org.jfree.chart.block.LengthConstraintType.NONE)) {
					return arrangeFN(container, g2, constraint);
				}else
					if (h == (org.jfree.chart.block.LengthConstraintType.FIXED)) {
						throw new java.lang.RuntimeException("Not implemented.");
					}else
						if (h == (org.jfree.chart.block.LengthConstraintType.RANGE)) {
							throw new java.lang.RuntimeException("Not implemented.");
						}
					
				
			}else
				if (w == (org.jfree.chart.block.LengthConstraintType.RANGE)) {
					if (h == (org.jfree.chart.block.LengthConstraintType.NONE)) {
						return arrangeRN(container, g2, constraint);
					}else
						if (h == (org.jfree.chart.block.LengthConstraintType.FIXED)) {
							return arrangeRF(container, g2, constraint);
						}else
							if (h == (org.jfree.chart.block.LengthConstraintType.RANGE)) {
								return arrangeRR(container, g2, constraint);
							}
						
					
				}
			
		
		throw new java.lang.IllegalArgumentException("Unknown LengthConstraintType.");
	}

	protected org.jfree.chart.util.Size2D arrangeFN(org.jfree.chart.block.BlockContainer container, java.awt.Graphics2D g2, org.jfree.chart.block.RectangleConstraint constraint) {
		java.util.List blocks = container.getBlocks();
		org.jfree.chart.block.Block b = ((org.jfree.chart.block.Block) (blocks.get(0)));
		org.jfree.chart.util.Size2D s = b.arrange(g2, org.jfree.chart.block.RectangleConstraint.NONE);
		double width = constraint.getWidth();
		java.awt.geom.Rectangle2D bounds = new java.awt.geom.Rectangle2D.Double(((width - (s.width)) / 2.0), 0.0, s.width, s.height);
		b.setBounds(bounds);
		return new org.jfree.chart.util.Size2D(((width - (s.width)) / 2.0), s.height);
	}

	protected org.jfree.chart.util.Size2D arrangeFR(org.jfree.chart.block.BlockContainer container, java.awt.Graphics2D g2, org.jfree.chart.block.RectangleConstraint constraint) {
		org.jfree.chart.util.Size2D s = arrangeFN(container, g2, constraint);
		if (constraint.getHeightRange().contains(s.height)) {
			return s;
		}else {
			org.jfree.chart.block.RectangleConstraint c = constraint.toFixedHeight(constraint.getHeightRange().constrain(s.getHeight()));
			return arrangeFF(container, g2, c);
		}
	}

	protected org.jfree.chart.util.Size2D arrangeFF(org.jfree.chart.block.BlockContainer container, java.awt.Graphics2D g2, org.jfree.chart.block.RectangleConstraint constraint) {
		return arrangeFN(container, g2, constraint);
	}

	protected org.jfree.chart.util.Size2D arrangeRR(org.jfree.chart.block.BlockContainer container, java.awt.Graphics2D g2, org.jfree.chart.block.RectangleConstraint constraint) {
		org.jfree.chart.util.Size2D s1 = arrangeNN(container, g2);
		if (constraint.getWidthRange().contains(s1.width)) {
			return s1;
		}else {
			org.jfree.chart.block.RectangleConstraint c = constraint.toFixedWidth(constraint.getWidthRange().getUpperBound());
			return arrangeFR(container, g2, c);
		}
	}

	protected org.jfree.chart.util.Size2D arrangeRF(org.jfree.chart.block.BlockContainer container, java.awt.Graphics2D g2, org.jfree.chart.block.RectangleConstraint constraint) {
		org.jfree.chart.util.Size2D s = arrangeNF(container, g2, constraint);
		if (constraint.getWidthRange().contains(s.width)) {
			return s;
		}else {
			org.jfree.chart.block.RectangleConstraint c = constraint.toFixedWidth(constraint.getWidthRange().constrain(s.getWidth()));
			return arrangeFF(container, g2, c);
		}
	}

	protected org.jfree.chart.util.Size2D arrangeRN(org.jfree.chart.block.BlockContainer container, java.awt.Graphics2D g2, org.jfree.chart.block.RectangleConstraint constraint) {
		org.jfree.chart.util.Size2D s1 = arrangeNN(container, g2);
		if (constraint.getWidthRange().contains(s1.width)) {
			return s1;
		}else {
			org.jfree.chart.block.RectangleConstraint c = constraint.toFixedWidth(constraint.getWidthRange().getUpperBound());
			return arrangeFN(container, g2, c);
		}
	}

	protected org.jfree.chart.util.Size2D arrangeNN(org.jfree.chart.block.BlockContainer container, java.awt.Graphics2D g2) {
		java.util.List blocks = container.getBlocks();
		org.jfree.chart.block.Block b = ((org.jfree.chart.block.Block) (blocks.get(0)));
		org.jfree.chart.util.Size2D s = b.arrange(g2, org.jfree.chart.block.RectangleConstraint.NONE);
		b.setBounds(new java.awt.geom.Rectangle2D.Double(0.0, 0.0, s.width, s.height));
		return new org.jfree.chart.util.Size2D(s.width, s.height);
	}

	protected org.jfree.chart.util.Size2D arrangeNF(org.jfree.chart.block.BlockContainer container, java.awt.Graphics2D g2, org.jfree.chart.block.RectangleConstraint constraint) {
		return arrangeNN(container, g2);
	}

	public void clear() {
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.block.CenterArrangement.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.block.CenterArrangement)) {
			return false;
		}
		return true;
	}
}

