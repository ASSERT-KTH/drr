

package org.jfree.chart.axis;


public class SubCategoryAxis extends org.jfree.chart.axis.CategoryAxis implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = -1279463299793228344L;

	private java.util.List subCategories;

	private java.awt.Font subLabelFont = new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 10);

	private transient java.awt.Paint subLabelPaint = java.awt.Color.black;

	public SubCategoryAxis(java.lang.String label) {
		super(label);
		org.jfree.chart.axis.SubCategoryAxis.this.subCategories = new java.util.ArrayList();
	}

	public void addSubCategory(java.lang.Comparable subCategory) {
		if (subCategory == null) {
			throw new java.lang.IllegalArgumentException("Null 'subcategory' axis.");
		}
		org.jfree.chart.axis.SubCategoryAxis.this.subCategories.add(subCategory);
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.SubCategoryAxis.this));
	}

	public java.awt.Font getSubLabelFont() {
		return org.jfree.chart.axis.SubCategoryAxis.this.subLabelFont;
	}

	public void setSubLabelFont(java.awt.Font font) {
		if (font == null) {
			throw new java.lang.IllegalArgumentException("Null 'font' argument.");
		}
		org.jfree.chart.axis.SubCategoryAxis.this.subLabelFont = font;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.SubCategoryAxis.this));
	}

	public java.awt.Paint getSubLabelPaint() {
		return org.jfree.chart.axis.SubCategoryAxis.this.subLabelPaint;
	}

	public void setSubLabelPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.axis.SubCategoryAxis.this.subLabelPaint = paint;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.SubCategoryAxis.this));
	}

	public org.jfree.chart.axis.AxisSpace reserveSpace(java.awt.Graphics2D g2, org.jfree.chart.plot.Plot plot, java.awt.geom.Rectangle2D plotArea, org.jfree.chart.util.RectangleEdge edge, org.jfree.chart.axis.AxisSpace space) {
		if (space == null) {
			space = new org.jfree.chart.axis.AxisSpace();
		}
		if (!(isVisible())) {
			return space;
		}
		space = super.reserveSpace(g2, plot, plotArea, edge, space);
		double maxdim = getMaxDim(g2, edge);
		if (org.jfree.chart.util.RectangleEdge.isTopOrBottom(edge)) {
			space.add(maxdim, edge);
		}else
			if (org.jfree.chart.util.RectangleEdge.isLeftOrRight(edge)) {
				space.add(maxdim, edge);
			}
		
		return space;
	}

	private double getMaxDim(java.awt.Graphics2D g2, org.jfree.chart.util.RectangleEdge edge) {
		double result = 0.0;
		g2.setFont(org.jfree.chart.axis.SubCategoryAxis.this.subLabelFont);
		java.awt.FontMetrics fm = g2.getFontMetrics();
		java.util.Iterator iterator = org.jfree.chart.axis.SubCategoryAxis.this.subCategories.iterator();
		while (iterator.hasNext()) {
			java.lang.Comparable subcategory = ((java.lang.Comparable) (iterator.next()));
			java.lang.String label = subcategory.toString();
			java.awt.geom.Rectangle2D bounds = org.jfree.chart.text.TextUtilities.getTextBounds(label, g2, fm);
			double dim = 0.0;
			if (org.jfree.chart.util.RectangleEdge.isLeftOrRight(edge)) {
				dim = bounds.getWidth();
			}else {
				dim = bounds.getHeight();
			}
			result = java.lang.Math.max(result, dim);
		} 
		return result;
	}

	public org.jfree.chart.axis.AxisState draw(java.awt.Graphics2D g2, double cursor, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge, org.jfree.chart.plot.PlotRenderingInfo plotState) {
		if (!(isVisible())) {
			return new org.jfree.chart.axis.AxisState(cursor);
		}
		if (isAxisLineVisible()) {
			drawAxisLine(g2, cursor, dataArea, edge);
		}
		org.jfree.chart.axis.AxisState state = new org.jfree.chart.axis.AxisState(cursor);
		state = drawSubCategoryLabels(g2, plotArea, dataArea, edge, state, plotState);
		state = drawCategoryLabels(g2, plotArea, dataArea, edge, state, plotState);
		state = drawLabel(getLabel(), g2, plotArea, dataArea, edge, state, plotState);
		return state;
	}

	protected org.jfree.chart.axis.AxisState drawSubCategoryLabels(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge, org.jfree.chart.axis.AxisState state, org.jfree.chart.plot.PlotRenderingInfo plotState) {
		if (state == null) {
			throw new java.lang.IllegalArgumentException("Null 'state' argument.");
		}
		g2.setFont(org.jfree.chart.axis.SubCategoryAxis.this.subLabelFont);
		g2.setPaint(org.jfree.chart.axis.SubCategoryAxis.this.subLabelPaint);
		org.jfree.chart.plot.CategoryPlot plot = ((org.jfree.chart.plot.CategoryPlot) (getPlot()));
		org.jfree.data.category.CategoryDataset dataset = plot.getDataset();
		int categoryCount = dataset.getColumnCount();
		double maxdim = getMaxDim(g2, edge);
		for (int categoryIndex = 0; categoryIndex < categoryCount; categoryIndex++) {
			double x0 = 0.0;
			double x1 = 0.0;
			double y0 = 0.0;
			double y1 = 0.0;
			if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
				x0 = getCategoryStart(categoryIndex, categoryCount, dataArea, edge);
				x1 = getCategoryEnd(categoryIndex, categoryCount, dataArea, edge);
				y1 = state.getCursor();
				y0 = y1 - maxdim;
			}else
				if (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM)) {
					x0 = getCategoryStart(categoryIndex, categoryCount, dataArea, edge);
					x1 = getCategoryEnd(categoryIndex, categoryCount, dataArea, edge);
					y0 = state.getCursor();
					y1 = y0 + maxdim;
				}else
					if (edge == (org.jfree.chart.util.RectangleEdge.LEFT)) {
						y0 = getCategoryStart(categoryIndex, categoryCount, dataArea, edge);
						y1 = getCategoryEnd(categoryIndex, categoryCount, dataArea, edge);
						x1 = state.getCursor();
						x0 = x1 - maxdim;
					}else
						if (edge == (org.jfree.chart.util.RectangleEdge.RIGHT)) {
							y0 = getCategoryStart(categoryIndex, categoryCount, dataArea, edge);
							y1 = getCategoryEnd(categoryIndex, categoryCount, dataArea, edge);
							x0 = state.getCursor();
							x1 = x0 + maxdim;
						}
					
				
			
			java.awt.geom.Rectangle2D area = new java.awt.geom.Rectangle2D.Double(x0, y0, (x1 - x0), (y1 - y0));
			int subCategoryCount = org.jfree.chart.axis.SubCategoryAxis.this.subCategories.size();
			float width = ((float) ((x1 - x0) / subCategoryCount));
			float height = ((float) ((y1 - y0) / subCategoryCount));
			float xx = 0.0F;
			float yy = 0.0F;
			for (int i = 0; i < subCategoryCount; i++) {
				if (org.jfree.chart.util.RectangleEdge.isTopOrBottom(edge)) {
					xx = ((float) (x0 + ((i + 0.5) * width)));
					yy = ((float) (area.getCenterY()));
				}else {
					xx = ((float) (area.getCenterX()));
					yy = ((float) (y0 + ((i + 0.5) * height)));
				}
				java.lang.String label = org.jfree.chart.axis.SubCategoryAxis.this.subCategories.get(i).toString();
				org.jfree.chart.text.TextUtilities.drawRotatedString(label, g2, xx, yy, org.jfree.chart.text.TextAnchor.CENTER, 0.0, org.jfree.chart.text.TextAnchor.CENTER);
			}
		}
		if (edge.equals(org.jfree.chart.util.RectangleEdge.TOP)) {
			double h = maxdim;
			state.cursorUp(h);
		}else
			if (edge.equals(org.jfree.chart.util.RectangleEdge.BOTTOM)) {
				double h = maxdim;
				state.cursorDown(h);
			}else
				if (edge == (org.jfree.chart.util.RectangleEdge.LEFT)) {
					double w = maxdim;
					state.cursorLeft(w);
				}else
					if (edge == (org.jfree.chart.util.RectangleEdge.RIGHT)) {
						double w = maxdim;
						state.cursorRight(w);
					}
				
			
		
		return state;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.axis.SubCategoryAxis.this)) {
			return true;
		}
		if ((obj instanceof org.jfree.chart.axis.SubCategoryAxis) && (super.equals(obj))) {
			org.jfree.chart.axis.SubCategoryAxis axis = ((org.jfree.chart.axis.SubCategoryAxis) (obj));
			if (!(org.jfree.chart.axis.SubCategoryAxis.this.subCategories.equals(axis.subCategories))) {
				return false;
			}
			if (!(org.jfree.chart.axis.SubCategoryAxis.this.subLabelFont.equals(axis.subLabelFont))) {
				return false;
			}
			if (!(org.jfree.chart.axis.SubCategoryAxis.this.subLabelPaint.equals(axis.subLabelPaint))) {
				return false;
			}
			return true;
		}
		return false;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.axis.SubCategoryAxis.this.subLabelPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.axis.SubCategoryAxis.this.subLabelPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}

