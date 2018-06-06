

package org.jfree.chart.renderer.xy;


public class XYLineAndShapeRenderer extends org.jfree.chart.renderer.xy.AbstractXYItemRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.renderer.xy.XYItemRenderer , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -7435246895986425885L;

	private org.jfree.chart.util.BooleanList seriesLinesVisible;

	private boolean baseLinesVisible;

	private transient java.awt.Shape legendLine;

	private org.jfree.chart.util.BooleanList seriesShapesVisible;

	private boolean baseShapesVisible;

	private org.jfree.chart.util.BooleanList seriesShapesFilled;

	private boolean baseShapesFilled;

	private boolean drawOutlines;

	private boolean useFillPaint;

	private boolean useOutlinePaint;

	private boolean drawSeriesLineAsPath;

	public XYLineAndShapeRenderer() {
		this(true, true);
	}

	public XYLineAndShapeRenderer(boolean lines, boolean shapes) {
		org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.seriesLinesVisible = new org.jfree.chart.util.BooleanList();
		org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.baseLinesVisible = lines;
		org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.legendLine = new java.awt.geom.Line2D.Double((-7.0), 0.0, 7.0, 0.0);
		org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.seriesShapesVisible = new org.jfree.chart.util.BooleanList();
		org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.baseShapesVisible = shapes;
		org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.useFillPaint = false;
		org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.seriesShapesFilled = new org.jfree.chart.util.BooleanList();
		org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.baseShapesFilled = true;
		org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.drawOutlines = true;
		org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.useOutlinePaint = false;
		org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.drawSeriesLineAsPath = false;
	}

	public boolean getDrawSeriesLineAsPath() {
		return org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.drawSeriesLineAsPath;
	}

	public void setDrawSeriesLineAsPath(boolean flag) {
		if ((org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.drawSeriesLineAsPath) != flag) {
			org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.drawSeriesLineAsPath = flag;
			fireChangeEvent();
		}
	}

	public int getPassCount() {
		return 2;
	}

	public boolean getItemLineVisible(int series, int item) {
		java.lang.Boolean flag = getSeriesLinesVisible(series);
		if (flag != null) {
			return flag.booleanValue();
		}else {
			return org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.baseLinesVisible;
		}
	}

	public java.lang.Boolean getSeriesLinesVisible(int series) {
		return org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.seriesLinesVisible.getBoolean(series);
	}

	public void setSeriesLinesVisible(int series, java.lang.Boolean flag) {
		org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.seriesLinesVisible.setBoolean(series, flag);
		fireChangeEvent();
	}

	public void setSeriesLinesVisible(int series, boolean visible) {
		setSeriesLinesVisible(series, java.lang.Boolean.valueOf(visible));
	}

	public boolean getBaseLinesVisible() {
		return org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.baseLinesVisible;
	}

	public void setBaseLinesVisible(boolean flag) {
		org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.baseLinesVisible = flag;
		fireChangeEvent();
	}

	public java.awt.Shape getLegendLine() {
		return org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.legendLine;
	}

	public void setLegendLine(java.awt.Shape line) {
		if (line == null) {
			throw new java.lang.IllegalArgumentException("Null 'line' argument.");
		}
		org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.legendLine = line;
		fireChangeEvent();
	}

	public boolean getItemShapeVisible(int series, int item) {
		java.lang.Boolean flag = getSeriesShapesVisible(series);
		if (flag != null) {
			return flag.booleanValue();
		}else {
			return org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.baseShapesVisible;
		}
	}

	public java.lang.Boolean getSeriesShapesVisible(int series) {
		return org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.seriesShapesVisible.getBoolean(series);
	}

	public void setSeriesShapesVisible(int series, boolean visible) {
		setSeriesShapesVisible(series, java.lang.Boolean.valueOf(visible));
	}

	public void setSeriesShapesVisible(int series, java.lang.Boolean flag) {
		org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.seriesShapesVisible.setBoolean(series, flag);
		fireChangeEvent();
	}

	public boolean getBaseShapesVisible() {
		return org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.baseShapesVisible;
	}

	public void setBaseShapesVisible(boolean flag) {
		org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.baseShapesVisible = flag;
		fireChangeEvent();
	}

	public boolean getItemShapeFilled(int series, int item) {
		java.lang.Boolean flag = getSeriesShapesFilled(series);
		if (flag != null) {
			return flag.booleanValue();
		}else {
			return org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.baseShapesFilled;
		}
	}

	public java.lang.Boolean getSeriesShapesFilled(int series) {
		return org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.seriesShapesFilled.getBoolean(series);
	}

	public void setSeriesShapesFilled(int series, boolean flag) {
		setSeriesShapesFilled(series, java.lang.Boolean.valueOf(flag));
	}

	public void setSeriesShapesFilled(int series, java.lang.Boolean flag) {
		org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.seriesShapesFilled.setBoolean(series, flag);
		fireChangeEvent();
	}

	public boolean getBaseShapesFilled() {
		return org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.baseShapesFilled;
	}

	public void setBaseShapesFilled(boolean flag) {
		org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.baseShapesFilled = flag;
		fireChangeEvent();
	}

	public boolean getDrawOutlines() {
		return org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.drawOutlines;
	}

	public void setDrawOutlines(boolean flag) {
		org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.drawOutlines = flag;
		fireChangeEvent();
	}

	public boolean getUseFillPaint() {
		return org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.useFillPaint;
	}

	public void setUseFillPaint(boolean flag) {
		org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.useFillPaint = flag;
		fireChangeEvent();
	}

	public boolean getUseOutlinePaint() {
		return org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.useOutlinePaint;
	}

	public void setUseOutlinePaint(boolean flag) {
		org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.useOutlinePaint = flag;
		fireChangeEvent();
	}

	public static class State extends org.jfree.chart.renderer.xy.XYItemRendererState {
		public java.awt.geom.GeneralPath seriesPath;

		private boolean lastPointGood;

		public State(org.jfree.chart.plot.PlotRenderingInfo info) {
			super(info);
		}

		public boolean isLastPointGood() {
			return org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.State.this.lastPointGood;
		}

		public void setLastPointGood(boolean good) {
			org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.State.this.lastPointGood = good;
		}

		public void startSeriesPass(org.jfree.data.xy.XYDataset dataset, int series, int firstItem, int lastItem, int pass, int passCount) {
			org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.State.this.seriesPath.reset();
			org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.State.this.lastPointGood = false;
			super.startSeriesPass(dataset, series, firstItem, lastItem, pass, passCount);
		}
	}

	public org.jfree.chart.renderer.xy.XYItemRendererState initialise(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.XYPlot plot, org.jfree.data.xy.XYDataset data, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.State state = new org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.State(info);
		state.seriesPath = new java.awt.geom.GeneralPath();
		return state;
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PlotRenderingInfo info, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.xy.XYDataset dataset, int series, int item, org.jfree.chart.plot.CrosshairState crosshairState, int pass) {
		if (!(getItemVisible(series, item))) {
			return ;
		}
		if (isLinePass(pass)) {
			if (getItemLineVisible(series, item)) {
				if (org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.drawSeriesLineAsPath) {
					drawPrimaryLineAsPath(state, g2, plot, dataset, pass, series, item, domainAxis, rangeAxis, dataArea);
				}else {
					drawPrimaryLine(state, g2, plot, dataset, pass, series, item, domainAxis, rangeAxis, dataArea);
				}
			}
		}else
			if (isItemPass(pass)) {
				org.jfree.chart.entity.EntityCollection entities = null;
				if (info != null) {
					entities = info.getOwner().getEntityCollection();
				}
				drawSecondaryPass(g2, plot, dataset, pass, series, item, domainAxis, dataArea, rangeAxis, crosshairState, entities);
			}
		
	}

	protected boolean isLinePass(int pass) {
		return pass == 0;
	}

	protected boolean isItemPass(int pass) {
		return pass == 1;
	}

	protected void drawPrimaryLine(org.jfree.chart.renderer.xy.XYItemRendererState state, java.awt.Graphics2D g2, org.jfree.chart.plot.XYPlot plot, org.jfree.data.xy.XYDataset dataset, int pass, int series, int item, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, java.awt.geom.Rectangle2D dataArea) {
		if (item == 0) {
			return ;
		}
		double x1 = dataset.getXValue(series, item);
		double y1 = dataset.getYValue(series, item);
		if ((java.lang.Double.isNaN(y1)) || (java.lang.Double.isNaN(x1))) {
			return ;
		}
		double x0 = dataset.getXValue(series, (item - 1));
		double y0 = dataset.getYValue(series, (item - 1));
		if ((java.lang.Double.isNaN(y0)) || (java.lang.Double.isNaN(x0))) {
			return ;
		}
		org.jfree.chart.util.RectangleEdge xAxisLocation = plot.getDomainAxisEdge();
		org.jfree.chart.util.RectangleEdge yAxisLocation = plot.getRangeAxisEdge();
		double transX0 = domainAxis.valueToJava2D(x0, dataArea, xAxisLocation);
		double transY0 = rangeAxis.valueToJava2D(y0, dataArea, yAxisLocation);
		double transX1 = domainAxis.valueToJava2D(x1, dataArea, xAxisLocation);
		double transY1 = rangeAxis.valueToJava2D(y1, dataArea, yAxisLocation);
		if ((((java.lang.Double.isNaN(transX0)) || (java.lang.Double.isNaN(transY0))) || (java.lang.Double.isNaN(transX1))) || (java.lang.Double.isNaN(transY1))) {
			return ;
		}
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			state.workingLine.setLine(transY0, transX0, transY1, transX1);
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				state.workingLine.setLine(transX0, transY0, transX1, transY1);
			}
		
		if (state.workingLine.intersects(dataArea)) {
			drawFirstPassShape(g2, pass, series, item, state.workingLine);
		}
	}

	protected void drawFirstPassShape(java.awt.Graphics2D g2, int pass, int series, int item, java.awt.Shape shape) {
		g2.setStroke(getItemStroke(series, item));
		g2.setPaint(getItemPaint(series, item));
		g2.draw(shape);
	}

	protected void drawPrimaryLineAsPath(org.jfree.chart.renderer.xy.XYItemRendererState state, java.awt.Graphics2D g2, org.jfree.chart.plot.XYPlot plot, org.jfree.data.xy.XYDataset dataset, int pass, int series, int item, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, java.awt.geom.Rectangle2D dataArea) {
		org.jfree.chart.util.RectangleEdge xAxisLocation = plot.getDomainAxisEdge();
		org.jfree.chart.util.RectangleEdge yAxisLocation = plot.getRangeAxisEdge();
		double x1 = dataset.getXValue(series, item);
		double y1 = dataset.getYValue(series, item);
		double transX1 = domainAxis.valueToJava2D(x1, dataArea, xAxisLocation);
		double transY1 = rangeAxis.valueToJava2D(y1, dataArea, yAxisLocation);
		org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.State s = ((org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.State) (state));
		if ((!(java.lang.Double.isNaN(transX1))) && (!(java.lang.Double.isNaN(transY1)))) {
			float x = ((float) (transX1));
			float y = ((float) (transY1));
			org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				x = ((float) (transY1));
				y = ((float) (transX1));
			}
			if (s.isLastPointGood()) {
				s.seriesPath.lineTo(x, y);
			}else {
				s.seriesPath.moveTo(x, y);
			}
			s.setLastPointGood(true);
		}else {
			s.setLastPointGood(false);
		}
		if (item == (s.getLastItemIndex())) {
			drawFirstPassShape(g2, pass, series, item, s.seriesPath);
		}
	}

	protected void drawSecondaryPass(java.awt.Graphics2D g2, org.jfree.chart.plot.XYPlot plot, org.jfree.data.xy.XYDataset dataset, int pass, int series, int item, org.jfree.chart.axis.ValueAxis domainAxis, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.chart.plot.CrosshairState crosshairState, org.jfree.chart.entity.EntityCollection entities) {
		java.awt.Shape entityArea = null;
		double x1 = dataset.getXValue(series, item);
		double y1 = dataset.getYValue(series, item);
		if ((java.lang.Double.isNaN(y1)) || (java.lang.Double.isNaN(x1))) {
			return ;
		}
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		org.jfree.chart.util.RectangleEdge xAxisLocation = plot.getDomainAxisEdge();
		org.jfree.chart.util.RectangleEdge yAxisLocation = plot.getRangeAxisEdge();
		double transX1 = domainAxis.valueToJava2D(x1, dataArea, xAxisLocation);
		double transY1 = rangeAxis.valueToJava2D(y1, dataArea, yAxisLocation);
		if (getItemShapeVisible(series, item)) {
			java.awt.Shape shape = getItemShape(series, item);
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				shape = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape, transY1, transX1);
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					shape = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape, transX1, transY1);
				}
			
			entityArea = shape;
			if (shape.intersects(dataArea)) {
				if (getItemShapeFilled(series, item)) {
					if (org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.useFillPaint) {
						g2.setPaint(getItemFillPaint(series, item));
					}else {
						g2.setPaint(getItemPaint(series, item));
					}
					g2.fill(shape);
				}
				if (org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.drawOutlines) {
					if (getUseOutlinePaint()) {
						g2.setPaint(getItemOutlinePaint(series, item));
					}else {
						g2.setPaint(getItemPaint(series, item));
					}
					g2.setStroke(getItemOutlineStroke(series, item));
					g2.draw(shape);
				}
			}
		}
		double xx = transX1;
		double yy = transY1;
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			xx = transY1;
			yy = transX1;
		}
		if (isItemLabelVisible(series, item)) {
			drawItemLabel(g2, orientation, dataset, series, item, xx, yy, (y1 < 0.0));
		}
		int domainAxisIndex = plot.getDomainAxisIndex(domainAxis);
		int rangeAxisIndex = plot.getRangeAxisIndex(rangeAxis);
		updateCrosshairValues(crosshairState, x1, y1, domainAxisIndex, rangeAxisIndex, transX1, transY1, orientation);
		if ((entities != null) && (org.jfree.chart.renderer.xy.AbstractXYItemRenderer.isPointInRect(dataArea, xx, yy))) {
			addEntity(entities, entityArea, dataset, series, item, xx, yy);
		}
	}

	public org.jfree.chart.LegendItem getLegendItem(int datasetIndex, int series) {
		org.jfree.chart.plot.XYPlot plot = getPlot();
		if (plot == null) {
			return null;
		}
		org.jfree.chart.LegendItem result = null;
		org.jfree.data.xy.XYDataset dataset = plot.getDataset(datasetIndex);
		if (dataset != null) {
			if (getItemVisible(series, 0)) {
				java.lang.String label = getLegendItemLabelGenerator().generateLabel(dataset, series);
				java.lang.String description = label;
				java.lang.String toolTipText = null;
				if ((getLegendItemToolTipGenerator()) != null) {
					toolTipText = getLegendItemToolTipGenerator().generateLabel(dataset, series);
				}
				java.lang.String urlText = null;
				if ((getLegendItemURLGenerator()) != null) {
					urlText = getLegendItemURLGenerator().generateLabel(dataset, series);
				}
				boolean shapeIsVisible = getItemShapeVisible(series, 0);
				java.awt.Shape shape = lookupLegendShape(series);
				boolean shapeIsFilled = getItemShapeFilled(series, 0);
				java.awt.Paint fillPaint = org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.useFillPaint ? lookupSeriesFillPaint(series) : lookupSeriesPaint(series);
				boolean shapeOutlineVisible = org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.drawOutlines;
				java.awt.Paint outlinePaint = org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.useOutlinePaint ? lookupSeriesOutlinePaint(series) : lookupSeriesPaint(series);
				java.awt.Stroke outlineStroke = lookupSeriesOutlineStroke(series);
				boolean lineVisible = getItemLineVisible(series, 0);
				java.awt.Stroke lineStroke = lookupSeriesStroke(series);
				java.awt.Paint linePaint = lookupSeriesPaint(series);
				result = new org.jfree.chart.LegendItem(label, description, toolTipText, urlText, shapeIsVisible, shape, shapeIsFilled, fillPaint, shapeOutlineVisible, outlinePaint, outlineStroke, lineVisible, org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.legendLine, lineStroke, linePaint);
				result.setLabelFont(lookupLegendTextFont(series));
				java.awt.Paint labelPaint = lookupLegendTextPaint(series);
				if (labelPaint != null) {
					result.setLabelPaint(labelPaint);
				}
				result.setSeriesKey(dataset.getSeriesKey(series));
				result.setSeriesIndex(series);
				result.setDataset(dataset);
				result.setDatasetIndex(datasetIndex);
			}
		}
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.renderer.xy.XYLineAndShapeRenderer clone = ((org.jfree.chart.renderer.xy.XYLineAndShapeRenderer) (super.clone()));
		clone.seriesLinesVisible = ((org.jfree.chart.util.BooleanList) (org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.seriesLinesVisible.clone()));
		if ((org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.legendLine) != null) {
			clone.legendLine = org.jfree.chart.util.ShapeUtilities.clone(org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.legendLine);
		}
		clone.seriesShapesVisible = ((org.jfree.chart.util.BooleanList) (org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.seriesShapesVisible.clone()));
		clone.seriesShapesFilled = ((org.jfree.chart.util.BooleanList) (org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.seriesShapesFilled.clone()));
		return clone;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.xy.XYLineAndShapeRenderer)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.chart.renderer.xy.XYLineAndShapeRenderer that = ((org.jfree.chart.renderer.xy.XYLineAndShapeRenderer) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.seriesLinesVisible, that.seriesLinesVisible))) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.baseLinesVisible) != (that.baseLinesVisible)) {
			return false;
		}
		if (!(org.jfree.chart.util.ShapeUtilities.equal(org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.legendLine, that.legendLine))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.seriesShapesVisible, that.seriesShapesVisible))) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.baseShapesVisible) != (that.baseShapesVisible)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.seriesShapesFilled, that.seriesShapesFilled))) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.baseShapesFilled) != (that.baseShapesFilled)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.drawOutlines) != (that.drawOutlines)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.useOutlinePaint) != (that.useOutlinePaint)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.useFillPaint) != (that.useFillPaint)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.drawSeriesLineAsPath) != (that.drawSeriesLineAsPath)) {
			return false;
		}
		return true;
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.legendLine = org.jfree.chart.util.SerialUtilities.readShape(stream);
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writeShape(org.jfree.chart.renderer.xy.XYLineAndShapeRenderer.this.legendLine, stream);
	}
}

