

package org.jfree.chart.block;


public class FlowArrangement implements java.io.Serializable , org.jfree.chart.block.Arrangement {
	private static final long serialVersionUID = 4543632485478613800L;

	private org.jfree.chart.util.HorizontalAlignment horizontalAlignment;

	private org.jfree.chart.util.VerticalAlignment verticalAlignment;

	private double horizontalGap;

	private double verticalGap;

	public FlowArrangement() {
		this(org.jfree.chart.util.HorizontalAlignment.CENTER, org.jfree.chart.util.VerticalAlignment.CENTER, 2.0, 2.0);
	}

	public FlowArrangement(org.jfree.chart.util.HorizontalAlignment hAlign, org.jfree.chart.util.VerticalAlignment vAlign, double hGap, double vGap) {
		org.jfree.chart.block.FlowArrangement.this.horizontalAlignment = hAlign;
		org.jfree.chart.block.FlowArrangement.this.verticalAlignment = vAlign;
		org.jfree.chart.block.FlowArrangement.this.horizontalGap = hGap;
		org.jfree.chart.block.FlowArrangement.this.verticalGap = vGap;
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
					return arrangeNF(container, g2, constraint);
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
						return arrangeFF(container, g2, constraint);
					}else
						if (h == (org.jfree.chart.block.LengthConstraintType.RANGE)) {
							return arrangeFR(container, g2, constraint);
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
			
		
		throw new java.lang.RuntimeException("Unrecognised constraint type.");
	}

	protected org.jfree.chart.util.Size2D arrangeFN(org.jfree.chart.block.BlockContainer container, java.awt.Graphics2D g2, org.jfree.chart.block.RectangleConstraint constraint) {
		java.util.List blocks = container.getBlocks();
		double width = constraint.getWidth();
		double x = 0.0;
		double y = 0.0;
		double maxHeight = 0.0;
		java.util.List itemsInRow = new java.util.ArrayList();
		for (int i = 0; i < (blocks.size()); i++) {
			org.jfree.chart.block.Block block = ((org.jfree.chart.block.Block) (blocks.get(i)));
			org.jfree.chart.util.Size2D size = block.arrange(g2, org.jfree.chart.block.RectangleConstraint.NONE);
			if ((x + (size.width)) <= width) {
				itemsInRow.add(block);
				block.setBounds(new java.awt.geom.Rectangle2D.Double(x, y, size.width, size.height));
				x = (x + (size.width)) + (org.jfree.chart.block.FlowArrangement.this.horizontalGap);
				maxHeight = java.lang.Math.max(maxHeight, size.height);
			}else {
				if (itemsInRow.isEmpty()) {
					block.setBounds(new java.awt.geom.Rectangle2D.Double(x, y, java.lang.Math.min(size.width, (width - x)), size.height));
					x = 0.0;
					y = (y + (size.height)) + (org.jfree.chart.block.FlowArrangement.this.verticalGap);
				}else {
					itemsInRow.clear();
					x = 0.0;
					y = (y + maxHeight) + (org.jfree.chart.block.FlowArrangement.this.verticalGap);
					maxHeight = size.height;
					block.setBounds(new java.awt.geom.Rectangle2D.Double(x, y, java.lang.Math.min(size.width, width), size.height));
					x = (size.width) + (org.jfree.chart.block.FlowArrangement.this.horizontalGap);
					itemsInRow.add(block);
				}
			}
		}
		return new org.jfree.chart.util.Size2D(constraint.getWidth(), (y + maxHeight));
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
		double x = 0.0;
		double width = 0.0;
		double maxHeight = 0.0;
		java.util.List blocks = container.getBlocks();
		int blockCount = blocks.size();
		if (blockCount > 0) {
			org.jfree.chart.util.Size2D[] sizes = new org.jfree.chart.util.Size2D[blocks.size()];
			for (int i = 0; i < (blocks.size()); i++) {
				org.jfree.chart.block.Block block = ((org.jfree.chart.block.Block) (blocks.get(i)));
				sizes[i] = block.arrange(g2, org.jfree.chart.block.RectangleConstraint.NONE);
				width = width + (sizes[i].getWidth());
				maxHeight = java.lang.Math.max(sizes[i].height, maxHeight);
				block.setBounds(new java.awt.geom.Rectangle2D.Double(x, 0.0, sizes[i].width, sizes[i].height));
				x = (x + (sizes[i].width)) + (org.jfree.chart.block.FlowArrangement.this.horizontalGap);
			}
			if (blockCount > 1) {
				width = width + ((org.jfree.chart.block.FlowArrangement.this.horizontalGap) * (blockCount - 1));
			}
			if ((org.jfree.chart.block.FlowArrangement.this.verticalAlignment) != (org.jfree.chart.util.VerticalAlignment.TOP)) {
				for (int i = 0; i < (blocks.size()); i++) {
					if ((org.jfree.chart.block.FlowArrangement.this.verticalAlignment) == (org.jfree.chart.util.VerticalAlignment.CENTER)) {
					}else
						if ((org.jfree.chart.block.FlowArrangement.this.verticalAlignment) == (org.jfree.chart.util.VerticalAlignment.BOTTOM)) {
						}
					
				}
			}
		}
		return new org.jfree.chart.util.Size2D(width, maxHeight);
	}

	protected org.jfree.chart.util.Size2D arrangeNF(org.jfree.chart.block.BlockContainer container, java.awt.Graphics2D g2, org.jfree.chart.block.RectangleConstraint constraint) {
		return arrangeNN(container, g2);
	}

	public void clear() {
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.block.FlowArrangement.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.block.FlowArrangement)) {
			return false;
		}
		org.jfree.chart.block.FlowArrangement that = ((org.jfree.chart.block.FlowArrangement) (obj));
		if ((org.jfree.chart.block.FlowArrangement.this.horizontalAlignment) != (that.horizontalAlignment)) {
			return false;
		}
		if ((org.jfree.chart.block.FlowArrangement.this.verticalAlignment) != (that.verticalAlignment)) {
			return false;
		}
		if ((org.jfree.chart.block.FlowArrangement.this.horizontalGap) != (that.horizontalGap)) {
			return false;
		}
		if ((org.jfree.chart.block.FlowArrangement.this.verticalGap) != (that.verticalGap)) {
			return false;
		}
		return true;
	}
}

