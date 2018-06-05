

package org.jfree.chart.block;


public class GridArrangement implements java.io.Serializable , org.jfree.chart.block.Arrangement {
	private static final long serialVersionUID = -2563758090144655938L;

	private int rows;

	private int columns;

	public GridArrangement(int rows, int columns) {
		org.jfree.chart.block.GridArrangement.this.rows = rows;
		org.jfree.chart.block.GridArrangement.this.columns = columns;
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
					throw new java.lang.RuntimeException("Not yet implemented.");
				}else
					if (h == (org.jfree.chart.block.LengthConstraintType.RANGE)) {
						throw new java.lang.RuntimeException("Not yet implemented.");
					}
				
			
		}else
			if (w == (org.jfree.chart.block.LengthConstraintType.FIXED)) {
				if (h == (org.jfree.chart.block.LengthConstraintType.NONE)) {
					return arrangeFN(container, g2, constraint);
				}else
					if (h == (org.jfree.chart.block.LengthConstraintType.FIXED)) {
						return arrangeFF(container, g2, constraint);
					}else
						if (h == (org.jfree.chart.block.LengthConstraintType.RANGE)) {
							return arrangeFR(container, g2, constraint);
						}
					
				
			}else
				if (w == (org.jfree.chart.block.LengthConstraintType.RANGE)) {
					if (h == (org.jfree.chart.block.LengthConstraintType.NONE)) {
						throw new java.lang.RuntimeException("Not yet implemented.");
					}else
						if (h == (org.jfree.chart.block.LengthConstraintType.FIXED)) {
							throw new java.lang.RuntimeException("Not yet implemented.");
						}else
							if (h == (org.jfree.chart.block.LengthConstraintType.RANGE)) {
								throw new java.lang.RuntimeException("Not yet implemented.");
							}
						
					
				}
			
		
		return new org.jfree.chart.util.Size2D();
	}

	protected org.jfree.chart.util.Size2D arrangeNN(org.jfree.chart.block.BlockContainer container, java.awt.Graphics2D g2) {
		double maxW = 0.0;
		double maxH = 0.0;
		java.util.List blocks = container.getBlocks();
		java.util.Iterator iterator = blocks.iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.block.Block b = ((org.jfree.chart.block.Block) (iterator.next()));
			org.jfree.chart.util.Size2D s = b.arrange(g2, org.jfree.chart.block.RectangleConstraint.NONE);
			maxW = java.lang.Math.max(maxW, s.width);
			maxH = java.lang.Math.max(maxH, s.height);
		} 
		double width = (org.jfree.chart.block.GridArrangement.this.columns) * maxW;
		double height = (org.jfree.chart.block.GridArrangement.this.rows) * maxH;
		org.jfree.chart.block.RectangleConstraint c = new org.jfree.chart.block.RectangleConstraint(width, height);
		return arrangeFF(container, g2, c);
	}

	protected org.jfree.chart.util.Size2D arrangeFF(org.jfree.chart.block.BlockContainer container, java.awt.Graphics2D g2, org.jfree.chart.block.RectangleConstraint constraint) {
		double width = (constraint.getWidth()) / (org.jfree.chart.block.GridArrangement.this.columns);
		double height = (constraint.getHeight()) / (org.jfree.chart.block.GridArrangement.this.rows);
		java.util.List blocks = container.getBlocks();
		for (int c = 0; c < (org.jfree.chart.block.GridArrangement.this.columns); c++) {
			for (int r = 0; r < (org.jfree.chart.block.GridArrangement.this.rows); r++) {
				int index = (r * (org.jfree.chart.block.GridArrangement.this.columns)) + c;
				if (index == (blocks.size())) {
					break;
				}
				org.jfree.chart.block.Block b = ((org.jfree.chart.block.Block) (blocks.get(index)));
				b.setBounds(new java.awt.geom.Rectangle2D.Double((c * width), (r * height), width, height));
			}
		}
		return new org.jfree.chart.util.Size2D(((org.jfree.chart.block.GridArrangement.this.columns) * width), ((org.jfree.chart.block.GridArrangement.this.rows) * height));
	}

	protected org.jfree.chart.util.Size2D arrangeFR(org.jfree.chart.block.BlockContainer container, java.awt.Graphics2D g2, org.jfree.chart.block.RectangleConstraint constraint) {
		org.jfree.chart.block.RectangleConstraint c1 = constraint.toUnconstrainedHeight();
		org.jfree.chart.util.Size2D size1 = arrange(container, g2, c1);
		if (constraint.getHeightRange().contains(size1.getHeight())) {
			return size1;
		}else {
			double h = constraint.getHeightRange().constrain(size1.getHeight());
			org.jfree.chart.block.RectangleConstraint c2 = constraint.toFixedHeight(h);
			return arrange(container, g2, c2);
		}
	}

	protected org.jfree.chart.util.Size2D arrangeFN(org.jfree.chart.block.BlockContainer container, java.awt.Graphics2D g2, org.jfree.chart.block.RectangleConstraint constraint) {
		double width = (constraint.getWidth()) / (org.jfree.chart.block.GridArrangement.this.columns);
		org.jfree.chart.block.RectangleConstraint constraint2 = constraint.toFixedWidth(width);
		java.util.List blocks = container.getBlocks();
		double maxH = 0.0;
		for (int r = 0; r < (org.jfree.chart.block.GridArrangement.this.rows); r++) {
			for (int c = 0; c < (org.jfree.chart.block.GridArrangement.this.columns); c++) {
				int index = (r * (org.jfree.chart.block.GridArrangement.this.columns)) + c;
				if (index == (blocks.size())) {
					break;
				}
				org.jfree.chart.block.Block b = ((org.jfree.chart.block.Block) (blocks.get(index)));
				org.jfree.chart.util.Size2D s = b.arrange(g2, constraint2);
				maxH = java.lang.Math.max(maxH, s.getHeight());
			}
		}
		org.jfree.chart.block.RectangleConstraint constraint3 = constraint.toFixedHeight((maxH * (org.jfree.chart.block.GridArrangement.this.rows)));
		return arrange(container, g2, constraint3);
	}

	public void clear() {
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.block.GridArrangement.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.block.GridArrangement)) {
			return false;
		}
		org.jfree.chart.block.GridArrangement that = ((org.jfree.chart.block.GridArrangement) (obj));
		if ((org.jfree.chart.block.GridArrangement.this.columns) != (that.columns)) {
			return false;
		}
		if ((org.jfree.chart.block.GridArrangement.this.rows) != (that.rows)) {
			return false;
		}
		return true;
	}
}

