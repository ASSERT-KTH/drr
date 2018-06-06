

package org.jfree.chart.block;


public class ColumnArrangement implements java.io.Serializable , org.jfree.chart.block.Arrangement {
	private static final long serialVersionUID = -5315388482898581555L;

	private org.jfree.chart.util.HorizontalAlignment horizontalAlignment;

	private org.jfree.chart.util.VerticalAlignment verticalAlignment;

	private double horizontalGap;

	private double verticalGap;

	public ColumnArrangement() {
	}

	public ColumnArrangement(org.jfree.chart.util.HorizontalAlignment hAlign, org.jfree.chart.util.VerticalAlignment vAlign, double hGap, double vGap) {
		org.jfree.chart.block.ColumnArrangement.this.horizontalAlignment = hAlign;
		org.jfree.chart.block.ColumnArrangement.this.verticalAlignment = vAlign;
		org.jfree.chart.block.ColumnArrangement.this.horizontalGap = hGap;
		org.jfree.chart.block.ColumnArrangement.this.verticalGap = vGap;
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
					throw new java.lang.RuntimeException("Not implemented.");
				}else
					if (h == (org.jfree.chart.block.LengthConstraintType.FIXED)) {
						return arrangeFF(container, g2, constraint);
					}else
						if (h == (org.jfree.chart.block.LengthConstraintType.RANGE)) {
							throw new java.lang.RuntimeException("Not implemented.");
						}
					
				
			}else
				if (w == (org.jfree.chart.block.LengthConstraintType.RANGE)) {
					if (h == (org.jfree.chart.block.LengthConstraintType.NONE)) {
						throw new java.lang.RuntimeException("Not implemented.");
					}else
						if (h == (org.jfree.chart.block.LengthConstraintType.FIXED)) {
							return arrangeRF(container, g2, constraint);
						}else
							if (h == (org.jfree.chart.block.LengthConstraintType.RANGE)) {
								return arrangeRR(container, g2, constraint);
							}
						
					
				}
			
		
		return new org.jfree.chart.util.Size2D();
	}

	protected org.jfree.chart.util.Size2D arrangeFF(org.jfree.chart.block.BlockContainer container, java.awt.Graphics2D g2, org.jfree.chart.block.RectangleConstraint constraint) {
		return arrangeNF(container, g2, constraint);
	}

	protected org.jfree.chart.util.Size2D arrangeNF(org.jfree.chart.block.BlockContainer container, java.awt.Graphics2D g2, org.jfree.chart.block.RectangleConstraint constraint) {
		java.util.List blocks = container.getBlocks();
		double height = constraint.getHeight();
		if (height <= 0.0) {
			height = java.lang.Double.POSITIVE_INFINITY;
		}
		double x = 0.0;
		double y = 0.0;
		double maxWidth = 0.0;
		java.util.List itemsInColumn = new java.util.ArrayList();
		for (int i = 0; i < (blocks.size()); i++) {
			org.jfree.chart.block.Block block = ((org.jfree.chart.block.Block) (blocks.get(i)));
			org.jfree.chart.util.Size2D size = block.arrange(g2, org.jfree.chart.block.RectangleConstraint.NONE);
			if ((y + (size.height)) <= height) {
				itemsInColumn.add(block);
				block.setBounds(new java.awt.geom.Rectangle2D.Double(x, y, size.width, size.height));
				y = (y + (size.height)) + (org.jfree.chart.block.ColumnArrangement.this.verticalGap);
				maxWidth = java.lang.Math.max(maxWidth, size.width);
			}else {
				if (itemsInColumn.isEmpty()) {
					block.setBounds(new java.awt.geom.Rectangle2D.Double(x, y, size.width, java.lang.Math.min(size.height, (height - y))));
					y = 0.0;
					x = (x + (size.width)) + (org.jfree.chart.block.ColumnArrangement.this.horizontalGap);
				}else {
					itemsInColumn.clear();
					x = (x + maxWidth) + (org.jfree.chart.block.ColumnArrangement.this.horizontalGap);
					y = 0.0;
					maxWidth = size.width;
					block.setBounds(new java.awt.geom.Rectangle2D.Double(x, y, size.width, java.lang.Math.min(size.height, height)));
					y = (size.height) + (org.jfree.chart.block.ColumnArrangement.this.verticalGap);
					itemsInColumn.add(block);
				}
			}
		}
		return new org.jfree.chart.util.Size2D((x + maxWidth), constraint.getHeight());
	}

	protected org.jfree.chart.util.Size2D arrangeRR(org.jfree.chart.block.BlockContainer container, java.awt.Graphics2D g2, org.jfree.chart.block.RectangleConstraint constraint) {
		org.jfree.chart.util.Size2D s1 = arrangeNN(container, g2);
		if (constraint.getHeightRange().contains(s1.height)) {
			return s1;
		}else {
			org.jfree.chart.block.RectangleConstraint c = constraint.toFixedHeight(constraint.getHeightRange().getUpperBound());
			return arrangeRF(container, g2, c);
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

	protected org.jfree.chart.util.Size2D arrangeNN(org.jfree.chart.block.BlockContainer container, java.awt.Graphics2D g2) {
		double y = 0.0;
		double height = 0.0;
		double maxWidth = 0.0;
		java.util.List blocks = container.getBlocks();
		int blockCount = blocks.size();
		if (blockCount > 0) {
			org.jfree.chart.util.Size2D[] sizes = new org.jfree.chart.util.Size2D[blocks.size()];
			for (int i = 0; i < (blocks.size()); i++) {
				org.jfree.chart.block.Block block = ((org.jfree.chart.block.Block) (blocks.get(i)));
				sizes[i] = block.arrange(g2, org.jfree.chart.block.RectangleConstraint.NONE);
				height = height + (sizes[i].getHeight());
				maxWidth = java.lang.Math.max(sizes[i].width, maxWidth);
				block.setBounds(new java.awt.geom.Rectangle2D.Double(0.0, y, sizes[i].width, sizes[i].height));
				y = (y + (sizes[i].height)) + (org.jfree.chart.block.ColumnArrangement.this.verticalGap);
			}
			if (blockCount > 1) {
				height = height + ((org.jfree.chart.block.ColumnArrangement.this.verticalGap) * (blockCount - 1));
			}
			if ((org.jfree.chart.block.ColumnArrangement.this.horizontalAlignment) != (org.jfree.chart.util.HorizontalAlignment.LEFT)) {
				for (int i = 0; i < (blocks.size()); i++) {
					if ((org.jfree.chart.block.ColumnArrangement.this.horizontalAlignment) == (org.jfree.chart.util.HorizontalAlignment.CENTER)) {
					}else
						if ((org.jfree.chart.block.ColumnArrangement.this.horizontalAlignment) == (org.jfree.chart.util.HorizontalAlignment.RIGHT)) {
						}
					
				}
			}
		}
		return new org.jfree.chart.util.Size2D(maxWidth, height);
	}

	public void clear() {
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.block.ColumnArrangement.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.block.ColumnArrangement)) {
			return false;
		}
		org.jfree.chart.block.ColumnArrangement that = ((org.jfree.chart.block.ColumnArrangement) (obj));
		if ((org.jfree.chart.block.ColumnArrangement.this.horizontalAlignment) != (that.horizontalAlignment)) {
			return false;
		}
		if ((org.jfree.chart.block.ColumnArrangement.this.verticalAlignment) != (that.verticalAlignment)) {
			return false;
		}
		if ((org.jfree.chart.block.ColumnArrangement.this.horizontalGap) != (that.horizontalGap)) {
			return false;
		}
		if ((org.jfree.chart.block.ColumnArrangement.this.verticalGap) != (that.verticalGap)) {
			return false;
		}
		return true;
	}
}

