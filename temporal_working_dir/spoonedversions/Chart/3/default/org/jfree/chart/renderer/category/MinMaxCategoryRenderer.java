

package org.jfree.chart.renderer.category;


public class MinMaxCategoryRenderer extends org.jfree.chart.renderer.category.AbstractCategoryItemRenderer {
	private static final long serialVersionUID = 2935615937671064911L;

	private boolean plotLines = false;

	private transient java.awt.Paint groupPaint = java.awt.Color.black;

	private transient java.awt.Stroke groupStroke = new java.awt.BasicStroke(1.0F);

	private transient javax.swing.Icon minIcon = getIcon(new java.awt.geom.Arc2D.Double((-4), (-4), 8, 8, 0, 360, java.awt.geom.Arc2D.OPEN), null, java.awt.Color.black);

	private transient javax.swing.Icon maxIcon = getIcon(new java.awt.geom.Arc2D.Double((-4), (-4), 8, 8, 0, 360, java.awt.geom.Arc2D.OPEN), null, java.awt.Color.black);

	private transient javax.swing.Icon objectIcon = getIcon(new java.awt.geom.Line2D.Double((-4), 0, 4, 0), false, true);

	private int lastCategory = -1;

	private double min;

	private double max;

	public MinMaxCategoryRenderer() {
		super();
	}

	public boolean isDrawLines() {
		return org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.plotLines;
	}

	public void setDrawLines(boolean draw) {
		if ((org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.plotLines) != draw) {
			org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.plotLines = draw;
			fireChangeEvent();
		}
	}

	public java.awt.Paint getGroupPaint() {
		return org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.groupPaint;
	}

	public void setGroupPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.groupPaint = paint;
		fireChangeEvent();
	}

	public java.awt.Stroke getGroupStroke() {
		return org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.groupStroke;
	}

	public void setGroupStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.groupStroke = stroke;
		fireChangeEvent();
	}

	public javax.swing.Icon getObjectIcon() {
		return org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.objectIcon;
	}

	public void setObjectIcon(javax.swing.Icon icon) {
		if (icon == null) {
			throw new java.lang.IllegalArgumentException("Null 'icon' argument.");
		}
		org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.objectIcon = icon;
		fireChangeEvent();
	}

	public javax.swing.Icon getMaxIcon() {
		return org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.maxIcon;
	}

	public void setMaxIcon(javax.swing.Icon icon) {
		if (icon == null) {
			throw new java.lang.IllegalArgumentException("Null 'icon' argument.");
		}
		org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.maxIcon = icon;
		fireChangeEvent();
	}

	public javax.swing.Icon getMinIcon() {
		return org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.minIcon;
	}

	public void setMinIcon(javax.swing.Icon icon) {
		if (icon == null) {
			throw new java.lang.IllegalArgumentException("Null 'icon' argument.");
		}
		org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.minIcon = icon;
		fireChangeEvent();
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.category.CategoryDataset dataset, int row, int column, boolean selected, int pass) {
		java.lang.Number value = dataset.getValue(row, column);
		if (value != null) {
			double x1 = domainAxis.getCategoryMiddle(column, getColumnCount(), dataArea, plot.getDomainAxisEdge());
			double y1 = rangeAxis.valueToJava2D(value.doubleValue(), dataArea, plot.getRangeAxisEdge());
			g2.setPaint(getItemPaint(row, column, selected));
			g2.setStroke(getItemStroke(row, column, selected));
			java.awt.Shape shape = null;
			shape = new java.awt.geom.Rectangle2D.Double((x1 - 4), (y1 - 4), 8.0, 8.0);
			org.jfree.chart.plot.PlotOrientation orient = plot.getOrientation();
			if (orient == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.objectIcon.paintIcon(null, g2, ((int) (x1)), ((int) (y1)));
			}else {
				org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.objectIcon.paintIcon(null, g2, ((int) (y1)), ((int) (x1)));
			}
			if ((org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.lastCategory) == column) {
				if ((org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.min) > (value.doubleValue())) {
					org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.min = value.doubleValue();
				}
				if ((org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.max) < (value.doubleValue())) {
					org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.max = value.doubleValue();
				}
				if (((dataset.getRowCount()) - 1) == row) {
					g2.setPaint(org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.groupPaint);
					g2.setStroke(org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.groupStroke);
					double minY = rangeAxis.valueToJava2D(org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.min, dataArea, plot.getRangeAxisEdge());
					double maxY = rangeAxis.valueToJava2D(org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.max, dataArea, plot.getRangeAxisEdge());
					if (orient == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
						g2.draw(new java.awt.geom.Line2D.Double(x1, minY, x1, maxY));
						org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.minIcon.paintIcon(null, g2, ((int) (x1)), ((int) (minY)));
						org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.maxIcon.paintIcon(null, g2, ((int) (x1)), ((int) (maxY)));
					}else {
						g2.draw(new java.awt.geom.Line2D.Double(minY, x1, maxY, x1));
						org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.minIcon.paintIcon(null, g2, ((int) (minY)), ((int) (x1)));
						org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.maxIcon.paintIcon(null, g2, ((int) (maxY)), ((int) (x1)));
					}
				}
			}else {
				org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.lastCategory = column;
				org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.min = value.doubleValue();
				org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.max = value.doubleValue();
			}
			if (org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.plotLines) {
				if (column != 0) {
					java.lang.Number previousValue = dataset.getValue(row, (column - 1));
					if (previousValue != null) {
						double previous = previousValue.doubleValue();
						double x0 = domainAxis.getCategoryMiddle((column - 1), getColumnCount(), dataArea, plot.getDomainAxisEdge());
						double y0 = rangeAxis.valueToJava2D(previous, dataArea, plot.getRangeAxisEdge());
						g2.setPaint(getItemPaint(row, column, selected));
						g2.setStroke(getItemStroke(row, column, selected));
						java.awt.geom.Line2D line;
						if (orient == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
							line = new java.awt.geom.Line2D.Double(x0, y0, x1, y1);
						}else {
							line = new java.awt.geom.Line2D.Double(y0, x0, y1, x1);
						}
						g2.draw(line);
					}
				}
			}
			org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
			if ((entities != null) && (shape != null)) {
				addEntity(entities, shape, dataset, row, column, selected);
			}
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.category.MinMaxCategoryRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.category.MinMaxCategoryRenderer that = ((org.jfree.chart.renderer.category.MinMaxCategoryRenderer) (obj));
		if ((org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.plotLines) != (that.plotLines)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.groupPaint, that.groupPaint))) {
			return false;
		}
		if (!(org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.groupStroke.equals(that.groupStroke))) {
			return false;
		}
		return super.equals(obj);
	}

	private javax.swing.Icon getIcon(java.awt.Shape shape, final java.awt.Paint fillPaint, final java.awt.Paint outlinePaint) {
		final int width = shape.getBounds().width;
		final int height = shape.getBounds().height;
		final java.awt.geom.GeneralPath path = new java.awt.geom.GeneralPath(shape);
		return new javax.swing.Icon() {
			public void paintIcon(java.awt.Component c, java.awt.Graphics g, int x, int y) {
				java.awt.Graphics2D g2 = ((java.awt.Graphics2D) (g));
				path.transform(java.awt.geom.AffineTransform.getTranslateInstance(x, y));
				if (fillPaint != null) {
					g2.setPaint(fillPaint);
					g2.fill(path);
				}
				if (outlinePaint != null) {
					g2.setPaint(outlinePaint);
					g2.draw(path);
				}
				path.transform(java.awt.geom.AffineTransform.getTranslateInstance((-x), (-y)));
			}

			public int getIconWidth() {
				return width;
			}

			public int getIconHeight() {
				return height;
			}
		};
	}

	private javax.swing.Icon getIcon(java.awt.Shape shape, final boolean fill, final boolean outline) {
		final int width = shape.getBounds().width;
		final int height = shape.getBounds().height;
		final java.awt.geom.GeneralPath path = new java.awt.geom.GeneralPath(shape);
		return new javax.swing.Icon() {
			public void paintIcon(java.awt.Component c, java.awt.Graphics g, int x, int y) {
				java.awt.Graphics2D g2 = ((java.awt.Graphics2D) (g));
				path.transform(java.awt.geom.AffineTransform.getTranslateInstance(x, y));
				if (fill) {
					g2.fill(path);
				}
				if (outline) {
					g2.draw(path);
				}
				path.transform(java.awt.geom.AffineTransform.getTranslateInstance((-x), (-y)));
			}

			public int getIconWidth() {
				return width;
			}

			public int getIconHeight() {
				return height;
			}
		};
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.groupStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.groupPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.groupStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.groupPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.minIcon = getIcon(new java.awt.geom.Arc2D.Double((-4), (-4), 8, 8, 0, 360, java.awt.geom.Arc2D.OPEN), null, java.awt.Color.black);
		org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.maxIcon = getIcon(new java.awt.geom.Arc2D.Double((-4), (-4), 8, 8, 0, 360, java.awt.geom.Arc2D.OPEN), null, java.awt.Color.black);
		org.jfree.chart.renderer.category.MinMaxCategoryRenderer.this.objectIcon = getIcon(new java.awt.geom.Line2D.Double((-4), 0, 4, 0), false, true);
	}
}

