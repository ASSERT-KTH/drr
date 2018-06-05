

package org.jfree.chart.renderer.category;


public class StackedBarRenderer3D extends org.jfree.chart.renderer.category.BarRenderer3D implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -5832945916493247123L;

	private boolean renderAsPercentages;

	private boolean ignoreZeroValues;

	public StackedBarRenderer3D() {
		this(false);
	}

	public StackedBarRenderer3D(double xOffset, double yOffset) {
		super(xOffset, yOffset);
	}

	public StackedBarRenderer3D(boolean renderAsPercentages) {
		super();
		org.jfree.chart.renderer.category.StackedBarRenderer3D.this.renderAsPercentages = renderAsPercentages;
	}

	public StackedBarRenderer3D(double xOffset, double yOffset, boolean renderAsPercentages) {
		super(xOffset, yOffset);
		org.jfree.chart.renderer.category.StackedBarRenderer3D.this.renderAsPercentages = renderAsPercentages;
	}

	public boolean getRenderAsPercentages() {
		return org.jfree.chart.renderer.category.StackedBarRenderer3D.this.renderAsPercentages;
	}

	public void setRenderAsPercentages(boolean asPercentages) {
		org.jfree.chart.renderer.category.StackedBarRenderer3D.this.renderAsPercentages = asPercentages;
		fireChangeEvent();
	}

	public boolean getIgnoreZeroValues() {
		return org.jfree.chart.renderer.category.StackedBarRenderer3D.this.ignoreZeroValues;
	}

	public void setIgnoreZeroValues(boolean ignore) {
		org.jfree.chart.renderer.category.StackedBarRenderer3D.this.ignoreZeroValues = ignore;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.category.StackedBarRenderer3D.this));
	}

	public org.jfree.data.Range findRangeBounds(org.jfree.data.category.CategoryDataset dataset) {
		if (dataset == null) {
			return null;
		}
		if (org.jfree.chart.renderer.category.StackedBarRenderer3D.this.renderAsPercentages) {
			return new org.jfree.data.Range(0.0, 1.0);
		}else {
			return org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(dataset);
		}
	}

	protected void calculateBarWidth(org.jfree.chart.plot.CategoryPlot plot, java.awt.geom.Rectangle2D dataArea, int rendererIndex, org.jfree.chart.renderer.category.CategoryItemRendererState state) {
		org.jfree.chart.axis.CategoryAxis domainAxis = getDomainAxis(plot, rendererIndex);
		org.jfree.data.category.CategoryDataset data = plot.getDataset(rendererIndex);
		if (data != null) {
			org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
			double space = 0.0;
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				space = dataArea.getHeight();
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					space = dataArea.getWidth();
				}
			
			double maxWidth = space * (getMaximumBarWidth());
			int columns = data.getColumnCount();
			double categoryMargin = 0.0;
			if (columns > 1) {
				categoryMargin = domainAxis.getCategoryMargin();
			}
			double used = space * (((1 - (domainAxis.getLowerMargin())) - (domainAxis.getUpperMargin())) - categoryMargin);
			if (columns > 0) {
				state.setBarWidth(java.lang.Math.min((used / columns), maxWidth));
			}else {
				state.setBarWidth(java.lang.Math.min(used, maxWidth));
			}
		}
	}

	protected java.util.List createStackedValueList(org.jfree.data.category.CategoryDataset dataset, java.lang.Comparable category, int[] includedRows, double base, boolean asPercentages) {
		java.util.List result = new java.util.ArrayList();
		double posBase = base;
		double negBase = base;
		double total = 0.0;
		if (asPercentages) {
			total = org.jfree.data.DataUtilities.calculateColumnTotal(dataset, dataset.getColumnIndex(category), includedRows);
		}
		int baseIndex = -1;
		int rowCount = includedRows.length;
		for (int i = 0; i < rowCount; i++) {
			int r = includedRows[i];
			java.lang.Number n = dataset.getValue(dataset.getRowKey(r), category);
			if (n == null) {
				continue;
			}
			double v = n.doubleValue();
			if (asPercentages) {
				v = v / total;
			}
			if ((v > 0.0) || ((!(org.jfree.chart.renderer.category.StackedBarRenderer3D.this.ignoreZeroValues)) && (v >= 0.0))) {
				if (baseIndex < 0) {
					result.add(new java.lang.Object[]{ null , new java.lang.Double(base) });
					baseIndex = 0;
				}
				posBase = posBase + v;
				result.add(new java.lang.Object[]{ new java.lang.Integer(r) , new java.lang.Double(posBase) });
			}else
				if (v < 0.0) {
					if (baseIndex < 0) {
						result.add(new java.lang.Object[]{ null , new java.lang.Double(base) });
						baseIndex = 0;
					}
					negBase = negBase + v;
					result.add(0, new java.lang.Object[]{ new java.lang.Integer(((-r) - 1)) , new java.lang.Double(negBase) });
					baseIndex++;
				}
			
		}
		return result;
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.category.CategoryDataset dataset, int row, int column, boolean selected, int pass) {
		if (row < ((dataset.getRowCount()) - 1)) {
			return ;
		}
		java.lang.Comparable category = dataset.getColumnKey(column);
		java.util.List values = createStackedValueList(dataset, dataset.getColumnKey(column), state.getVisibleSeriesArray(), getBase(), org.jfree.chart.renderer.category.StackedBarRenderer3D.this.renderAsPercentages);
		java.awt.geom.Rectangle2D adjusted = new java.awt.geom.Rectangle2D.Double(dataArea.getX(), ((dataArea.getY()) + (getYOffset())), ((dataArea.getWidth()) - (getXOffset())), ((dataArea.getHeight()) - (getYOffset())));
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			drawStackHorizontal(values, category, g2, state, adjusted, plot, domainAxis, rangeAxis, dataset);
		}else {
			drawStackVertical(values, category, g2, state, adjusted, plot, domainAxis, rangeAxis, dataset);
		}
	}

	protected void drawStackHorizontal(java.util.List values, java.lang.Comparable category, java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.category.CategoryDataset dataset) {
		int column = dataset.getColumnIndex(category);
		double barX0 = (domainAxis.getCategoryMiddle(column, dataset.getColumnCount(), dataArea, plot.getDomainAxisEdge())) - ((state.getBarWidth()) / 2.0);
		double barW = state.getBarWidth();
		java.util.List itemLabelList = new java.util.ArrayList();
		boolean inverted = rangeAxis.isInverted();
		int blockCount = (values.size()) - 1;
		for (int k = 0; k < blockCount; k++) {
			int index = inverted ? (blockCount - k) - 1 : k;
			java.lang.Object[] prev = ((java.lang.Object[]) (values.get(index)));
			java.lang.Object[] curr = ((java.lang.Object[]) (values.get((index + 1))));
			int series = 0;
			if ((curr[0]) == null) {
				series = (-(((java.lang.Integer) (prev[0])).intValue())) - 1;
			}else {
				series = ((java.lang.Integer) (curr[0])).intValue();
				if (series < 0) {
					series = (-(((java.lang.Integer) (prev[0])).intValue())) - 1;
				}
			}
			double v0 = ((java.lang.Double) (prev[1])).doubleValue();
			double vv0 = rangeAxis.valueToJava2D(v0, dataArea, plot.getRangeAxisEdge());
			double v1 = ((java.lang.Double) (curr[1])).doubleValue();
			double vv1 = rangeAxis.valueToJava2D(v1, dataArea, plot.getRangeAxisEdge());
			java.awt.Shape[] faces = createHorizontalBlock(barX0, barW, vv0, vv1, inverted);
			java.awt.Paint fillPaint = getItemPaint(series, column, false);
			java.awt.Paint fillPaintDark = fillPaint;
			if (fillPaintDark instanceof java.awt.Color) {
				fillPaintDark = ((java.awt.Color) (fillPaint)).darker();
			}
			boolean drawOutlines = isDrawBarOutline();
			java.awt.Paint outlinePaint = fillPaint;
			if (drawOutlines) {
				outlinePaint = getItemOutlinePaint(series, column, false);
				g2.setStroke(getItemOutlineStroke(series, column, false));
			}
			for (int f = 0; f < 6; f++) {
				if (f == 5) {
					g2.setPaint(fillPaint);
				}else {
					g2.setPaint(fillPaintDark);
				}
				g2.fill(faces[f]);
				if (drawOutlines) {
					g2.setPaint(outlinePaint);
					g2.draw(faces[f]);
				}
			}
			itemLabelList.add(new java.lang.Object[]{ new java.lang.Integer(series) , faces[5].getBounds2D() , java.lang.Boolean.valueOf((v0 < (getBase()))) });
			org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
			if (entities != null) {
				addEntity(entities, faces[5], dataset, series, column, false);
			}
		}
		for (int i = 0; i < (itemLabelList.size()); i++) {
			java.lang.Object[] record = ((java.lang.Object[]) (itemLabelList.get(i)));
			int series = ((java.lang.Integer) (record[0])).intValue();
			java.awt.geom.Rectangle2D bar = ((java.awt.geom.Rectangle2D) (record[1]));
			boolean neg = ((java.lang.Boolean) (record[2])).booleanValue();
			org.jfree.chart.labels.CategoryItemLabelGenerator generator = getItemLabelGenerator(series, column, false);
			if ((generator != null) && (isItemLabelVisible(series, column, false))) {
				drawItemLabelForBar(g2, plot, dataset, series, column, false, generator, bar, neg);
			}
		}
	}

	private java.awt.Shape[] createHorizontalBlock(double x0, double width, double y0, double y1, boolean inverted) {
		java.awt.Shape[] result = new java.awt.Shape[6];
		java.awt.geom.Point2D p00 = new java.awt.geom.Point2D.Double(y0, x0);
		java.awt.geom.Point2D p01 = new java.awt.geom.Point2D.Double(y0, (x0 + width));
		java.awt.geom.Point2D p02 = new java.awt.geom.Point2D.Double(((p01.getX()) + (getXOffset())), ((p01.getY()) - (getYOffset())));
		java.awt.geom.Point2D p03 = new java.awt.geom.Point2D.Double(((p00.getX()) + (getXOffset())), ((p00.getY()) - (getYOffset())));
		java.awt.geom.Point2D p0 = new java.awt.geom.Point2D.Double(y1, x0);
		java.awt.geom.Point2D p1 = new java.awt.geom.Point2D.Double(y1, (x0 + width));
		java.awt.geom.Point2D p2 = new java.awt.geom.Point2D.Double(((p1.getX()) + (getXOffset())), ((p1.getY()) - (getYOffset())));
		java.awt.geom.Point2D p3 = new java.awt.geom.Point2D.Double(((p0.getX()) + (getXOffset())), ((p0.getY()) - (getYOffset())));
		java.awt.geom.GeneralPath bottom = new java.awt.geom.GeneralPath();
		bottom.moveTo(((float) (p1.getX())), ((float) (p1.getY())));
		bottom.lineTo(((float) (p01.getX())), ((float) (p01.getY())));
		bottom.lineTo(((float) (p02.getX())), ((float) (p02.getY())));
		bottom.lineTo(((float) (p2.getX())), ((float) (p2.getY())));
		bottom.closePath();
		java.awt.geom.GeneralPath top = new java.awt.geom.GeneralPath();
		top.moveTo(((float) (p0.getX())), ((float) (p0.getY())));
		top.lineTo(((float) (p00.getX())), ((float) (p00.getY())));
		top.lineTo(((float) (p03.getX())), ((float) (p03.getY())));
		top.lineTo(((float) (p3.getX())), ((float) (p3.getY())));
		top.closePath();
		java.awt.geom.GeneralPath back = new java.awt.geom.GeneralPath();
		back.moveTo(((float) (p2.getX())), ((float) (p2.getY())));
		back.lineTo(((float) (p02.getX())), ((float) (p02.getY())));
		back.lineTo(((float) (p03.getX())), ((float) (p03.getY())));
		back.lineTo(((float) (p3.getX())), ((float) (p3.getY())));
		back.closePath();
		java.awt.geom.GeneralPath front = new java.awt.geom.GeneralPath();
		front.moveTo(((float) (p0.getX())), ((float) (p0.getY())));
		front.lineTo(((float) (p1.getX())), ((float) (p1.getY())));
		front.lineTo(((float) (p01.getX())), ((float) (p01.getY())));
		front.lineTo(((float) (p00.getX())), ((float) (p00.getY())));
		front.closePath();
		java.awt.geom.GeneralPath left = new java.awt.geom.GeneralPath();
		left.moveTo(((float) (p0.getX())), ((float) (p0.getY())));
		left.lineTo(((float) (p1.getX())), ((float) (p1.getY())));
		left.lineTo(((float) (p2.getX())), ((float) (p2.getY())));
		left.lineTo(((float) (p3.getX())), ((float) (p3.getY())));
		left.closePath();
		java.awt.geom.GeneralPath right = new java.awt.geom.GeneralPath();
		right.moveTo(((float) (p00.getX())), ((float) (p00.getY())));
		right.lineTo(((float) (p01.getX())), ((float) (p01.getY())));
		right.lineTo(((float) (p02.getX())), ((float) (p02.getY())));
		right.lineTo(((float) (p03.getX())), ((float) (p03.getY())));
		right.closePath();
		result[0] = bottom;
		result[1] = back;
		if (inverted) {
			result[2] = right;
			result[3] = left;
		}else {
			result[2] = left;
			result[3] = right;
		}
		result[4] = top;
		result[5] = front;
		return result;
	}

	protected void drawStackVertical(java.util.List values, java.lang.Comparable category, java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.category.CategoryDataset dataset) {
		int column = dataset.getColumnIndex(category);
		double barX0 = (domainAxis.getCategoryMiddle(column, dataset.getColumnCount(), dataArea, plot.getDomainAxisEdge())) - ((state.getBarWidth()) / 2.0);
		double barW = state.getBarWidth();
		java.util.List itemLabelList = new java.util.ArrayList();
		boolean inverted = rangeAxis.isInverted();
		int blockCount = (values.size()) - 1;
		for (int k = 0; k < blockCount; k++) {
			int index = inverted ? (blockCount - k) - 1 : k;
			java.lang.Object[] prev = ((java.lang.Object[]) (values.get(index)));
			java.lang.Object[] curr = ((java.lang.Object[]) (values.get((index + 1))));
			int series = 0;
			if ((curr[0]) == null) {
				series = (-(((java.lang.Integer) (prev[0])).intValue())) - 1;
			}else {
				series = ((java.lang.Integer) (curr[0])).intValue();
				if (series < 0) {
					series = (-(((java.lang.Integer) (prev[0])).intValue())) - 1;
				}
			}
			double v0 = ((java.lang.Double) (prev[1])).doubleValue();
			double vv0 = rangeAxis.valueToJava2D(v0, dataArea, plot.getRangeAxisEdge());
			double v1 = ((java.lang.Double) (curr[1])).doubleValue();
			double vv1 = rangeAxis.valueToJava2D(v1, dataArea, plot.getRangeAxisEdge());
			java.awt.Shape[] faces = createVerticalBlock(barX0, barW, vv0, vv1, inverted);
			java.awt.Paint fillPaint = getItemPaint(series, column, false);
			java.awt.Paint fillPaintDark = fillPaint;
			if (fillPaintDark instanceof java.awt.Color) {
				fillPaintDark = ((java.awt.Color) (fillPaint)).darker();
			}
			boolean drawOutlines = isDrawBarOutline();
			java.awt.Paint outlinePaint = fillPaint;
			if (drawOutlines) {
				outlinePaint = getItemOutlinePaint(series, column, false);
				g2.setStroke(getItemOutlineStroke(series, column, false));
			}
			for (int f = 0; f < 6; f++) {
				if (f == 5) {
					g2.setPaint(fillPaint);
				}else {
					g2.setPaint(fillPaintDark);
				}
				g2.fill(faces[f]);
				if (drawOutlines) {
					g2.setPaint(outlinePaint);
					g2.draw(faces[f]);
				}
			}
			itemLabelList.add(new java.lang.Object[]{ new java.lang.Integer(series) , faces[5].getBounds2D() , java.lang.Boolean.valueOf((v0 < (getBase()))) });
			org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
			if (entities != null) {
				addEntity(entities, faces[5], dataset, series, column, false);
			}
		}
		for (int i = 0; i < (itemLabelList.size()); i++) {
			java.lang.Object[] record = ((java.lang.Object[]) (itemLabelList.get(i)));
			int series = ((java.lang.Integer) (record[0])).intValue();
			java.awt.geom.Rectangle2D bar = ((java.awt.geom.Rectangle2D) (record[1]));
			boolean neg = ((java.lang.Boolean) (record[2])).booleanValue();
			org.jfree.chart.labels.CategoryItemLabelGenerator generator = getItemLabelGenerator(series, column, false);
			if ((generator != null) && (isItemLabelVisible(series, column, false))) {
				drawItemLabelForBar(g2, plot, dataset, series, column, false, generator, bar, neg);
			}
		}
	}

	private java.awt.Shape[] createVerticalBlock(double x0, double width, double y0, double y1, boolean inverted) {
		java.awt.Shape[] result = new java.awt.Shape[6];
		java.awt.geom.Point2D p00 = new java.awt.geom.Point2D.Double(x0, y0);
		java.awt.geom.Point2D p01 = new java.awt.geom.Point2D.Double((x0 + width), y0);
		java.awt.geom.Point2D p02 = new java.awt.geom.Point2D.Double(((p01.getX()) + (getXOffset())), ((p01.getY()) - (getYOffset())));
		java.awt.geom.Point2D p03 = new java.awt.geom.Point2D.Double(((p00.getX()) + (getXOffset())), ((p00.getY()) - (getYOffset())));
		java.awt.geom.Point2D p0 = new java.awt.geom.Point2D.Double(x0, y1);
		java.awt.geom.Point2D p1 = new java.awt.geom.Point2D.Double((x0 + width), y1);
		java.awt.geom.Point2D p2 = new java.awt.geom.Point2D.Double(((p1.getX()) + (getXOffset())), ((p1.getY()) - (getYOffset())));
		java.awt.geom.Point2D p3 = new java.awt.geom.Point2D.Double(((p0.getX()) + (getXOffset())), ((p0.getY()) - (getYOffset())));
		java.awt.geom.GeneralPath right = new java.awt.geom.GeneralPath();
		right.moveTo(((float) (p1.getX())), ((float) (p1.getY())));
		right.lineTo(((float) (p01.getX())), ((float) (p01.getY())));
		right.lineTo(((float) (p02.getX())), ((float) (p02.getY())));
		right.lineTo(((float) (p2.getX())), ((float) (p2.getY())));
		right.closePath();
		java.awt.geom.GeneralPath left = new java.awt.geom.GeneralPath();
		left.moveTo(((float) (p0.getX())), ((float) (p0.getY())));
		left.lineTo(((float) (p00.getX())), ((float) (p00.getY())));
		left.lineTo(((float) (p03.getX())), ((float) (p03.getY())));
		left.lineTo(((float) (p3.getX())), ((float) (p3.getY())));
		left.closePath();
		java.awt.geom.GeneralPath back = new java.awt.geom.GeneralPath();
		back.moveTo(((float) (p2.getX())), ((float) (p2.getY())));
		back.lineTo(((float) (p02.getX())), ((float) (p02.getY())));
		back.lineTo(((float) (p03.getX())), ((float) (p03.getY())));
		back.lineTo(((float) (p3.getX())), ((float) (p3.getY())));
		back.closePath();
		java.awt.geom.GeneralPath front = new java.awt.geom.GeneralPath();
		front.moveTo(((float) (p0.getX())), ((float) (p0.getY())));
		front.lineTo(((float) (p1.getX())), ((float) (p1.getY())));
		front.lineTo(((float) (p01.getX())), ((float) (p01.getY())));
		front.lineTo(((float) (p00.getX())), ((float) (p00.getY())));
		front.closePath();
		java.awt.geom.GeneralPath top = new java.awt.geom.GeneralPath();
		top.moveTo(((float) (p0.getX())), ((float) (p0.getY())));
		top.lineTo(((float) (p1.getX())), ((float) (p1.getY())));
		top.lineTo(((float) (p2.getX())), ((float) (p2.getY())));
		top.lineTo(((float) (p3.getX())), ((float) (p3.getY())));
		top.closePath();
		java.awt.geom.GeneralPath bottom = new java.awt.geom.GeneralPath();
		bottom.moveTo(((float) (p00.getX())), ((float) (p00.getY())));
		bottom.lineTo(((float) (p01.getX())), ((float) (p01.getY())));
		bottom.lineTo(((float) (p02.getX())), ((float) (p02.getY())));
		bottom.lineTo(((float) (p03.getX())), ((float) (p03.getY())));
		bottom.closePath();
		result[0] = bottom;
		result[1] = back;
		result[2] = left;
		result[3] = right;
		result[4] = top;
		result[5] = front;
		if (inverted) {
			result[0] = top;
			result[4] = bottom;
		}
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.category.StackedBarRenderer3D.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.category.StackedBarRenderer3D)) {
			return false;
		}
		org.jfree.chart.renderer.category.StackedBarRenderer3D that = ((org.jfree.chart.renderer.category.StackedBarRenderer3D) (obj));
		if ((org.jfree.chart.renderer.category.StackedBarRenderer3D.this.renderAsPercentages) != (that.getRenderAsPercentages())) {
			return false;
		}
		if ((org.jfree.chart.renderer.category.StackedBarRenderer3D.this.ignoreZeroValues) != (that.ignoreZeroValues)) {
			return false;
		}
		return super.equals(obj);
	}
}

