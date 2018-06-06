

package org.jfree.chart.block;


public class BorderArrangement implements java.io.Serializable , org.jfree.chart.block.Arrangement {
	private static final long serialVersionUID = 506071142274883745L;

	private org.jfree.chart.block.Block centerBlock;

	private org.jfree.chart.block.Block topBlock;

	private org.jfree.chart.block.Block bottomBlock;

	private org.jfree.chart.block.Block leftBlock;

	private org.jfree.chart.block.Block rightBlock;

	public BorderArrangement() {
	}

	public void add(org.jfree.chart.block.Block block, java.lang.Object key) {
		if (key == null) {
			org.jfree.chart.block.BorderArrangement.this.centerBlock = block;
		}else {
			org.jfree.chart.util.RectangleEdge edge = ((org.jfree.chart.util.RectangleEdge) (key));
			if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
				org.jfree.chart.block.BorderArrangement.this.topBlock = block;
			}else
				if (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM)) {
					org.jfree.chart.block.BorderArrangement.this.bottomBlock = block;
				}else
					if (edge == (org.jfree.chart.util.RectangleEdge.LEFT)) {
						org.jfree.chart.block.BorderArrangement.this.leftBlock = block;
					}else
						if (edge == (org.jfree.chart.util.RectangleEdge.RIGHT)) {
							org.jfree.chart.block.BorderArrangement.this.rightBlock = block;
						}
					
				
			
		}
	}

	public org.jfree.chart.util.Size2D arrange(org.jfree.chart.block.BlockContainer container, java.awt.Graphics2D g2, org.jfree.chart.block.RectangleConstraint constraint) {
		org.jfree.chart.block.RectangleConstraint contentConstraint = container.toContentConstraint(constraint);
		org.jfree.chart.util.Size2D contentSize = null;
		org.jfree.chart.block.LengthConstraintType w = contentConstraint.getWidthConstraintType();
		org.jfree.chart.block.LengthConstraintType h = contentConstraint.getHeightConstraintType();
		if (w == (org.jfree.chart.block.LengthConstraintType.NONE)) {
			if (h == (org.jfree.chart.block.LengthConstraintType.NONE)) {
				contentSize = arrangeNN(container, g2);
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
					contentSize = arrangeFN(container, g2, constraint.getWidth());
				}else
					if (h == (org.jfree.chart.block.LengthConstraintType.FIXED)) {
						contentSize = arrangeFF(container, g2, constraint);
					}else
						if (h == (org.jfree.chart.block.LengthConstraintType.RANGE)) {
							contentSize = arrangeFR(container, g2, constraint);
						}
					
				
			}else
				if (w == (org.jfree.chart.block.LengthConstraintType.RANGE)) {
					if (h == (org.jfree.chart.block.LengthConstraintType.NONE)) {
						throw new java.lang.RuntimeException("Not implemented.");
					}else
						if (h == (org.jfree.chart.block.LengthConstraintType.FIXED)) {
							throw new java.lang.RuntimeException("Not implemented.");
						}else
							if (h == (org.jfree.chart.block.LengthConstraintType.RANGE)) {
								contentSize = arrangeRR(container, constraint.getWidthRange(), constraint.getHeightRange(), g2);
							}
						
					
				}
			
		
		return new org.jfree.chart.util.Size2D(container.calculateTotalWidth(contentSize.getWidth()), container.calculateTotalHeight(contentSize.getHeight()));
	}

	protected org.jfree.chart.util.Size2D arrangeNN(org.jfree.chart.block.BlockContainer container, java.awt.Graphics2D g2) {
		double[] w = new double[5];
		double[] h = new double[5];
		if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
			org.jfree.chart.util.Size2D size = org.jfree.chart.block.BorderArrangement.this.topBlock.arrange(g2, org.jfree.chart.block.RectangleConstraint.NONE);
			w[0] = size.width;
			h[0] = size.height;
		}
		if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
			org.jfree.chart.util.Size2D size = org.jfree.chart.block.BorderArrangement.this.bottomBlock.arrange(g2, org.jfree.chart.block.RectangleConstraint.NONE);
			w[1] = size.width;
			h[1] = size.height;
		}
		if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
			org.jfree.chart.util.Size2D size = org.jfree.chart.block.BorderArrangement.this.leftBlock.arrange(g2, org.jfree.chart.block.RectangleConstraint.NONE);
			w[2] = size.width;
			h[2] = size.height;
		}
		if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
			org.jfree.chart.util.Size2D size = org.jfree.chart.block.BorderArrangement.this.rightBlock.arrange(g2, org.jfree.chart.block.RectangleConstraint.NONE);
			w[3] = size.width;
			h[3] = size.height;
		}
		h[2] = java.lang.Math.max(h[2], h[3]);
		h[3] = h[2];
		if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
			org.jfree.chart.util.Size2D size = org.jfree.chart.block.BorderArrangement.this.centerBlock.arrange(g2, org.jfree.chart.block.RectangleConstraint.NONE);
			w[4] = size.width;
			h[4] = size.height;
		}
		double width = java.lang.Math.max(w[0], java.lang.Math.max(w[1], (((w[2]) + (w[4])) + (w[3]))));
		double centerHeight = java.lang.Math.max(h[2], java.lang.Math.max(h[3], h[4]));
		double height = ((h[0]) + (h[1])) + centerHeight;
		if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
			org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0, 0.0, width, h[0]));
		}
		if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
			org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0, (height - (h[1])), width, h[1]));
		}
		if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
			org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0, h[0], w[2], centerHeight));
		}
		if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
			org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double((width - (w[3])), h[0], w[3], centerHeight));
		}
		if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
			org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2], h[0], ((width - (w[2])) - (w[3])), centerHeight));
		}
		return new org.jfree.chart.util.Size2D(width, height);
	}

	protected org.jfree.chart.util.Size2D arrangeFR(org.jfree.chart.block.BlockContainer container, java.awt.Graphics2D g2, org.jfree.chart.block.RectangleConstraint constraint) {
		org.jfree.chart.util.Size2D size1 = arrangeFN(container, g2, constraint.getWidth());
		if (constraint.getHeightRange().contains(size1.getHeight())) {
			return size1;
		}else {
			double h = constraint.getHeightRange().constrain(size1.getHeight());
			org.jfree.chart.block.RectangleConstraint c2 = constraint.toFixedHeight(h);
			return arrange(container, g2, c2);
		}
	}

	protected org.jfree.chart.util.Size2D arrangeFN(org.jfree.chart.block.BlockContainer container, java.awt.Graphics2D g2, double width) {
		double[] w = new double[5];
		double[] h = new double[5];
		org.jfree.chart.block.RectangleConstraint c1 = new org.jfree.chart.block.RectangleConstraint(width, null, org.jfree.chart.block.LengthConstraintType.FIXED, 0.0, null, org.jfree.chart.block.LengthConstraintType.NONE);
		if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
			org.jfree.chart.util.Size2D size = org.jfree.chart.block.BorderArrangement.this.topBlock.arrange(g2, c1);
			w[0] = size.width;
			h[0] = size.height;
		}
		if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
			org.jfree.chart.util.Size2D size = org.jfree.chart.block.BorderArrangement.this.bottomBlock.arrange(g2, c1);
			w[1] = size.width;
			h[1] = size.height;
		}
		org.jfree.chart.block.RectangleConstraint c2 = new org.jfree.chart.block.RectangleConstraint(0.0, new org.jfree.data.Range(0.0, width), org.jfree.chart.block.LengthConstraintType.RANGE, 0.0, null, org.jfree.chart.block.LengthConstraintType.NONE);
		if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
			org.jfree.chart.util.Size2D size = org.jfree.chart.block.BorderArrangement.this.leftBlock.arrange(g2, c2);
			w[2] = size.width;
			h[2] = size.height;
		}
		if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
			double maxW = java.lang.Math.max((width - (w[2])), 0.0);
			org.jfree.chart.block.RectangleConstraint c3 = new org.jfree.chart.block.RectangleConstraint(0.0, new org.jfree.data.Range(java.lang.Math.min(w[2], maxW), maxW), org.jfree.chart.block.LengthConstraintType.RANGE, 0.0, null, org.jfree.chart.block.LengthConstraintType.NONE);
			org.jfree.chart.util.Size2D size = org.jfree.chart.block.BorderArrangement.this.rightBlock.arrange(g2, c3);
			w[3] = size.width;
			h[3] = size.height;
		}
		h[2] = java.lang.Math.max(h[2], h[3]);
		h[3] = h[2];
		if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
			org.jfree.chart.block.RectangleConstraint c4 = new org.jfree.chart.block.RectangleConstraint(((width - (w[2])) - (w[3])), null, org.jfree.chart.block.LengthConstraintType.FIXED, 0.0, null, org.jfree.chart.block.LengthConstraintType.NONE);
			org.jfree.chart.util.Size2D size = org.jfree.chart.block.BorderArrangement.this.centerBlock.arrange(g2, c4);
			w[4] = size.width;
			h[4] = size.height;
		}
		double height = ((h[0]) + (h[1])) + (java.lang.Math.max(h[2], java.lang.Math.max(h[3], h[4])));
		return arrange(container, g2, new org.jfree.chart.block.RectangleConstraint(width, height));
	}

	protected org.jfree.chart.util.Size2D arrangeRR(org.jfree.chart.block.BlockContainer container, org.jfree.data.Range widthRange, org.jfree.data.Range heightRange, java.awt.Graphics2D g2) {
		double[] w = new double[5];
		double[] h = new double[5];
		if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
			org.jfree.chart.block.RectangleConstraint c1 = new org.jfree.chart.block.RectangleConstraint(widthRange, heightRange);
			org.jfree.chart.util.Size2D size = org.jfree.chart.block.BorderArrangement.this.topBlock.arrange(g2, c1);
			w[0] = size.width;
			h[0] = size.height;
		}
		if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
			org.jfree.data.Range heightRange2 = org.jfree.data.Range.shift(heightRange, (-(h[0])), false);
			org.jfree.chart.block.RectangleConstraint c2 = new org.jfree.chart.block.RectangleConstraint(widthRange, heightRange2);
			org.jfree.chart.util.Size2D size = org.jfree.chart.block.BorderArrangement.this.bottomBlock.arrange(g2, c2);
			w[1] = size.width;
			h[1] = size.height;
		}
		org.jfree.data.Range heightRange3 = org.jfree.data.Range.shift(heightRange, (-((h[0]) + (h[1]))));
		if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
			org.jfree.chart.block.RectangleConstraint c3 = new org.jfree.chart.block.RectangleConstraint(widthRange, heightRange3);
			org.jfree.chart.util.Size2D size = org.jfree.chart.block.BorderArrangement.this.leftBlock.arrange(g2, c3);
			w[2] = size.width;
			h[2] = size.height;
		}
		org.jfree.data.Range widthRange2 = org.jfree.data.Range.shift(widthRange, (-(w[2])), false);
		if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
			org.jfree.chart.block.RectangleConstraint c4 = new org.jfree.chart.block.RectangleConstraint(widthRange2, heightRange3);
			org.jfree.chart.util.Size2D size = org.jfree.chart.block.BorderArrangement.this.rightBlock.arrange(g2, c4);
			w[3] = size.width;
			h[3] = size.height;
		}
		h[2] = java.lang.Math.max(h[2], h[3]);
		h[3] = h[2];
		org.jfree.data.Range widthRange3 = org.jfree.data.Range.shift(widthRange, (-((w[2]) + (w[3]))), false);
		if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
			org.jfree.chart.block.RectangleConstraint c5 = new org.jfree.chart.block.RectangleConstraint(widthRange3, heightRange3);
			org.jfree.chart.util.Size2D size = org.jfree.chart.block.BorderArrangement.this.centerBlock.arrange(g2, c5);
			w[4] = size.width;
			h[4] = size.height;
		}
		double width = java.lang.Math.max(w[0], java.lang.Math.max(w[1], (((w[2]) + (w[4])) + (w[3]))));
		double height = ((h[0]) + (h[1])) + (java.lang.Math.max(h[2], java.lang.Math.max(h[3], h[4])));
		if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
			org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0, 0.0, width, h[0]));
		}
		if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
			org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0, (height - (h[1])), width, h[1]));
		}
		if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
			org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0, h[0], w[2], h[2]));
		}
		if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
			org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double((width - (w[3])), h[0], w[3], h[3]));
		}
		if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
			org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2], h[0], ((width - (w[2])) - (w[3])), ((height - (h[0])) - (h[1]))));
		}
		return new org.jfree.chart.util.Size2D(width, height);
	}

	protected org.jfree.chart.util.Size2D arrangeFF(org.jfree.chart.block.BlockContainer container, java.awt.Graphics2D g2, org.jfree.chart.block.RectangleConstraint constraint) {
		double[] w = new double[5];
		double[] h = new double[5];
		w[0] = constraint.getWidth();
		if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
			org.jfree.chart.block.RectangleConstraint c1 = new org.jfree.chart.block.RectangleConstraint(w[0], null, org.jfree.chart.block.LengthConstraintType.FIXED, 0.0, new org.jfree.data.Range(0.0, constraint.getHeight()), org.jfree.chart.block.LengthConstraintType.RANGE);
			org.jfree.chart.util.Size2D size = org.jfree.chart.block.BorderArrangement.this.topBlock.arrange(g2, c1);
			h[0] = size.height;
		}
		w[1] = w[0];
		if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
			org.jfree.chart.block.RectangleConstraint c2 = new org.jfree.chart.block.RectangleConstraint(w[0], null, org.jfree.chart.block.LengthConstraintType.FIXED, 0.0, new org.jfree.data.Range(0.0, ((constraint.getHeight()) - (h[0]))), org.jfree.chart.block.LengthConstraintType.RANGE);
			org.jfree.chart.util.Size2D size = org.jfree.chart.block.BorderArrangement.this.bottomBlock.arrange(g2, c2);
			h[1] = size.height;
		}
		h[2] = ((constraint.getHeight()) - (h[1])) - (h[0]);
		if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
			org.jfree.chart.block.RectangleConstraint c3 = new org.jfree.chart.block.RectangleConstraint(0.0, new org.jfree.data.Range(0.0, constraint.getWidth()), org.jfree.chart.block.LengthConstraintType.RANGE, h[2], null, org.jfree.chart.block.LengthConstraintType.FIXED);
			org.jfree.chart.util.Size2D size = org.jfree.chart.block.BorderArrangement.this.leftBlock.arrange(g2, c3);
			w[2] = size.width;
		}
		h[3] = h[2];
		if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
			org.jfree.chart.block.RectangleConstraint c4 = new org.jfree.chart.block.RectangleConstraint(0.0, new org.jfree.data.Range(0.0, java.lang.Math.max(((constraint.getWidth()) - (w[2])), 0.0)), org.jfree.chart.block.LengthConstraintType.RANGE, h[2], null, org.jfree.chart.block.LengthConstraintType.FIXED);
			org.jfree.chart.util.Size2D size = org.jfree.chart.block.BorderArrangement.this.rightBlock.arrange(g2, c4);
			w[3] = size.width;
		}
		h[4] = h[2];
		w[4] = ((constraint.getWidth()) - (w[3])) - (w[2]);
		org.jfree.chart.block.RectangleConstraint c5 = new org.jfree.chart.block.RectangleConstraint(w[4], h[4]);
		if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
			org.jfree.chart.block.BorderArrangement.this.centerBlock.arrange(g2, c5);
		}
		if ((org.jfree.chart.block.BorderArrangement.this.topBlock) != null) {
			org.jfree.chart.block.BorderArrangement.this.topBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0, 0.0, w[0], h[0]));
		}
		if ((org.jfree.chart.block.BorderArrangement.this.bottomBlock) != null) {
			org.jfree.chart.block.BorderArrangement.this.bottomBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0, ((h[0]) + (h[2])), w[1], h[1]));
		}
		if ((org.jfree.chart.block.BorderArrangement.this.leftBlock) != null) {
			org.jfree.chart.block.BorderArrangement.this.leftBlock.setBounds(new java.awt.geom.Rectangle2D.Double(0.0, h[0], w[2], h[2]));
		}
		if ((org.jfree.chart.block.BorderArrangement.this.rightBlock) != null) {
			org.jfree.chart.block.BorderArrangement.this.rightBlock.setBounds(new java.awt.geom.Rectangle2D.Double(((w[2]) + (w[4])), h[0], w[3], h[3]));
		}
		if ((org.jfree.chart.block.BorderArrangement.this.centerBlock) != null) {
			org.jfree.chart.block.BorderArrangement.this.centerBlock.setBounds(new java.awt.geom.Rectangle2D.Double(w[2], h[0], w[4], h[4]));
		}
		return new org.jfree.chart.util.Size2D(constraint.getWidth(), constraint.getHeight());
	}

	public void clear() {
		org.jfree.chart.block.BorderArrangement.this.centerBlock = null;
		org.jfree.chart.block.BorderArrangement.this.topBlock = null;
		org.jfree.chart.block.BorderArrangement.this.bottomBlock = null;
		org.jfree.chart.block.BorderArrangement.this.leftBlock = null;
		org.jfree.chart.block.BorderArrangement.this.rightBlock = null;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.block.BorderArrangement.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.block.BorderArrangement)) {
			return false;
		}
		org.jfree.chart.block.BorderArrangement that = ((org.jfree.chart.block.BorderArrangement) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.block.BorderArrangement.this.topBlock, that.topBlock))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.block.BorderArrangement.this.bottomBlock, that.bottomBlock))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.block.BorderArrangement.this.leftBlock, that.leftBlock))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.block.BorderArrangement.this.rightBlock, that.rightBlock))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.block.BorderArrangement.this.centerBlock, that.centerBlock))) {
			return false;
		}
		return true;
	}
}

