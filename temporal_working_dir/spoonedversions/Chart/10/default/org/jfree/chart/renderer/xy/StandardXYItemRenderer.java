

package org.jfree.chart.renderer.xy;


public class StandardXYItemRenderer extends org.jfree.chart.renderer.xy.AbstractXYItemRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.renderer.xy.XYItemRenderer , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -3271351259436865995L;

	public static final int SHAPES = 1;

	public static final int LINES = 2;

	public static final int SHAPES_AND_LINES = (org.jfree.chart.renderer.xy.StandardXYItemRenderer.SHAPES) | (org.jfree.chart.renderer.xy.StandardXYItemRenderer.LINES);

	public static final int IMAGES = 4;

	public static final int DISCONTINUOUS = 8;

	public static final int DISCONTINUOUS_LINES = (org.jfree.chart.renderer.xy.StandardXYItemRenderer.LINES) | (org.jfree.chart.renderer.xy.StandardXYItemRenderer.DISCONTINUOUS);

	private boolean baseShapesVisible;

	private boolean plotLines;

	private boolean plotImages;

	private boolean plotDiscontinuous;

	private org.jfree.chart.util.UnitType gapThresholdType = org.jfree.chart.util.UnitType.RELATIVE;

	private double gapThreshold = 1.0;

	private org.jfree.chart.util.BooleanList seriesShapesFilled;

	private boolean baseShapesFilled;

	private boolean drawSeriesLineAsPath;

	private transient java.awt.Shape legendLine;

	public StandardXYItemRenderer() {
		this(org.jfree.chart.renderer.xy.StandardXYItemRenderer.LINES, null);
	}

	public StandardXYItemRenderer(int type) {
		this(type, null);
	}

	public StandardXYItemRenderer(int type, org.jfree.chart.labels.XYToolTipGenerator toolTipGenerator) {
		this(type, toolTipGenerator, null);
	}

	public StandardXYItemRenderer(int type, org.jfree.chart.labels.XYToolTipGenerator toolTipGenerator, org.jfree.chart.urls.XYURLGenerator urlGenerator) {
		super();
		setBaseToolTipGenerator(toolTipGenerator);
		setBaseURLGenerator(urlGenerator);
		if ((type & (org.jfree.chart.renderer.xy.StandardXYItemRenderer.SHAPES)) != 0) {
			org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.baseShapesVisible = true;
		}
		if ((type & (org.jfree.chart.renderer.xy.StandardXYItemRenderer.LINES)) != 0) {
			org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.plotLines = true;
		}
		if ((type & (org.jfree.chart.renderer.xy.StandardXYItemRenderer.IMAGES)) != 0) {
			org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.plotImages = true;
		}
		if ((type & (org.jfree.chart.renderer.xy.StandardXYItemRenderer.DISCONTINUOUS)) != 0) {
			org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.plotDiscontinuous = true;
		}
		org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.seriesShapesFilled = new org.jfree.chart.util.BooleanList();
		org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.baseShapesFilled = true;
		org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.legendLine = new java.awt.geom.Line2D.Double((-7.0), 0.0, 7.0, 0.0);
		org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.drawSeriesLineAsPath = false;
	}

	public boolean getBaseShapesVisible() {
		return org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.baseShapesVisible;
	}

	public void setBaseShapesVisible(boolean flag) {
		if ((org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.baseShapesVisible) != flag) {
			org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.baseShapesVisible = flag;
			fireChangeEvent();
		}
	}

	public boolean getItemShapeFilled(int series, int item) {
		java.lang.Boolean flag = org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.seriesShapesFilled.getBoolean(series);
		if (flag != null) {
			return flag.booleanValue();
		}else {
			return org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.baseShapesFilled;
		}
	}

	public java.lang.Boolean getSeriesShapesFilled(int series) {
		return org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.seriesShapesFilled.getBoolean(series);
	}

	public void setSeriesShapesFilled(int series, java.lang.Boolean flag) {
		org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.seriesShapesFilled.setBoolean(series, flag);
		fireChangeEvent();
	}

	public boolean getBaseShapesFilled() {
		return org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.baseShapesFilled;
	}

	public void setBaseShapesFilled(boolean flag) {
		org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.baseShapesFilled = flag;
	}

	public boolean getPlotLines() {
		return org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.plotLines;
	}

	public void setPlotLines(boolean flag) {
		if ((org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.plotLines) != flag) {
			org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.plotLines = flag;
			fireChangeEvent();
		}
	}

	public org.jfree.chart.util.UnitType getGapThresholdType() {
		return org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.gapThresholdType;
	}

	public void setGapThresholdType(org.jfree.chart.util.UnitType thresholdType) {
		if (thresholdType == null) {
			throw new java.lang.IllegalArgumentException("Null 'thresholdType' argument.");
		}
		org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.gapThresholdType = thresholdType;
		fireChangeEvent();
	}

	public double getGapThreshold() {
		return org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.gapThreshold;
	}

	public void setGapThreshold(double t) {
		org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.gapThreshold = t;
		fireChangeEvent();
	}

	public boolean getPlotImages() {
		return org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.plotImages;
	}

	public void setPlotImages(boolean flag) {
		if ((org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.plotImages) != flag) {
			org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.plotImages = flag;
			fireChangeEvent();
		}
	}

	public boolean getPlotDiscontinuous() {
		return org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.plotDiscontinuous;
	}

	public void setPlotDiscontinuous(boolean flag) {
		if ((org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.plotDiscontinuous) != flag) {
			org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.plotDiscontinuous = flag;
			fireChangeEvent();
		}
	}

	public boolean getDrawSeriesLineAsPath() {
		return org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.drawSeriesLineAsPath;
	}

	public void setDrawSeriesLineAsPath(boolean flag) {
		org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.drawSeriesLineAsPath = flag;
	}

	public java.awt.Shape getLegendLine() {
		return org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.legendLine;
	}

	public void setLegendLine(java.awt.Shape line) {
		if (line == null) {
			throw new java.lang.IllegalArgumentException("Null 'line' argument.");
		}
		org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.legendLine = line;
		fireChangeEvent();
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
				java.awt.Shape shape = lookupSeriesShape(series);
				boolean shapeFilled = getItemShapeFilled(series, 0);
				java.awt.Paint paint = lookupSeriesPaint(series);
				java.awt.Paint linePaint = paint;
				java.awt.Stroke lineStroke = lookupSeriesStroke(series);
				result = new org.jfree.chart.LegendItem(label, description, toolTipText, urlText, org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.baseShapesVisible, shape, shapeFilled, paint, (!shapeFilled), paint, lineStroke, org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.plotLines, org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.legendLine, lineStroke, linePaint);
				result.setDataset(dataset);
				result.setDatasetIndex(datasetIndex);
				result.setSeriesKey(dataset.getSeriesKey(series));
				result.setSeriesIndex(series);
			}
		}
		return result;
	}

	public static class State extends org.jfree.chart.renderer.xy.XYItemRendererState {
		public java.awt.geom.GeneralPath seriesPath;

		private int seriesIndex;

		private boolean lastPointGood;

		public State(org.jfree.chart.plot.PlotRenderingInfo info) {
			super(info);
		}

		public boolean isLastPointGood() {
			return org.jfree.chart.renderer.xy.StandardXYItemRenderer.State.this.lastPointGood;
		}

		public void setLastPointGood(boolean good) {
			org.jfree.chart.renderer.xy.StandardXYItemRenderer.State.this.lastPointGood = good;
		}

		public int getSeriesIndex() {
			return org.jfree.chart.renderer.xy.StandardXYItemRenderer.State.this.seriesIndex;
		}

		public void setSeriesIndex(int index) {
			org.jfree.chart.renderer.xy.StandardXYItemRenderer.State.this.seriesIndex = index;
		}
	}

	public org.jfree.chart.renderer.xy.XYItemRendererState initialise(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.XYPlot plot, org.jfree.data.xy.XYDataset data, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.renderer.xy.StandardXYItemRenderer.State state = new org.jfree.chart.renderer.xy.StandardXYItemRenderer.State(info);
		state.seriesPath = new java.awt.geom.GeneralPath();
		state.seriesIndex = -1;
		return state;
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PlotRenderingInfo info, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.xy.XYDataset dataset, int series, int item, org.jfree.chart.plot.CrosshairState crosshairState, int pass) {
		boolean itemVisible = getItemVisible(series, item);
		java.awt.Shape entityArea = null;
		org.jfree.chart.entity.EntityCollection entities = null;
		if (info != null) {
			entities = info.getOwner().getEntityCollection();
		}
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		java.awt.Paint paint = getItemPaint(series, item);
		java.awt.Stroke seriesStroke = getItemStroke(series, item);
		g2.setPaint(paint);
		g2.setStroke(seriesStroke);
		double x1 = dataset.getXValue(series, item);
		double y1 = dataset.getYValue(series, item);
		if ((java.lang.Double.isNaN(x1)) || (java.lang.Double.isNaN(y1))) {
			itemVisible = false;
		}
		org.jfree.chart.util.RectangleEdge xAxisLocation = plot.getDomainAxisEdge();
		org.jfree.chart.util.RectangleEdge yAxisLocation = plot.getRangeAxisEdge();
		double transX1 = domainAxis.valueToJava2D(x1, dataArea, xAxisLocation);
		double transY1 = rangeAxis.valueToJava2D(y1, dataArea, yAxisLocation);
		if (getPlotLines()) {
			if (org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.drawSeriesLineAsPath) {
				org.jfree.chart.renderer.xy.StandardXYItemRenderer.State s = ((org.jfree.chart.renderer.xy.StandardXYItemRenderer.State) (state));
				if ((s.getSeriesIndex()) != series) {
					s.seriesPath.reset();
					s.lastPointGood = false;
					s.setSeriesIndex(series);
				}
				if ((itemVisible && (!(java.lang.Double.isNaN(transX1)))) && (!(java.lang.Double.isNaN(transY1)))) {
					float x = ((float) (transX1));
					float y = ((float) (transY1));
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
				if (item == ((dataset.getItemCount(series)) - 1)) {
					if ((s.seriesIndex) == series) {
						g2.setStroke(lookupSeriesStroke(series));
						g2.setPaint(lookupSeriesPaint(series));
						g2.draw(s.seriesPath);
					}
				}
			}else
				if ((item != 0) && itemVisible) {
					double x0 = dataset.getXValue(series, (item - 1));
					double y0 = dataset.getYValue(series, (item - 1));
					if ((!(java.lang.Double.isNaN(x0))) && (!(java.lang.Double.isNaN(y0)))) {
						boolean drawLine = true;
						if (getPlotDiscontinuous()) {
							int numX = dataset.getItemCount(series);
							double minX = dataset.getXValue(series, 0);
							double maxX = dataset.getXValue(series, (numX - 1));
							if ((org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.gapThresholdType) == (org.jfree.chart.util.UnitType.ABSOLUTE)) {
								drawLine = (java.lang.Math.abs((x1 - x0))) <= (org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.gapThreshold);
							}else {
								drawLine = (java.lang.Math.abs((x1 - x0))) <= (((maxX - minX) / numX) * (getGapThreshold()));
							}
						}
						if (drawLine) {
							double transX0 = domainAxis.valueToJava2D(x0, dataArea, xAxisLocation);
							double transY0 = rangeAxis.valueToJava2D(y0, dataArea, yAxisLocation);
							if ((((java.lang.Double.isNaN(transX0)) || (java.lang.Double.isNaN(transY0))) || (java.lang.Double.isNaN(transX1))) || (java.lang.Double.isNaN(transY1))) {
								return ;
							}
							if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
								state.workingLine.setLine(transY0, transX0, transY1, transX1);
							}else
								if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
									state.workingLine.setLine(transX0, transY0, transX1, transY1);
								}
							
							if (state.workingLine.intersects(dataArea)) {
								g2.draw(state.workingLine);
							}
						}
					}
				}
			
		}
		if (!itemVisible) {
			return ;
		}
		if (getBaseShapesVisible()) {
			java.awt.Shape shape = getItemShape(series, item);
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				shape = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape, transY1, transX1);
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					shape = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape, transX1, transY1);
				}
			
			if (shape.intersects(dataArea)) {
				if (getItemShapeFilled(series, item)) {
					g2.fill(shape);
				}else {
					g2.draw(shape);
				}
			}
			entityArea = shape;
		}
		if (getPlotImages()) {
			java.awt.Image image = getImage(plot, series, item, transX1, transY1);
			if (image != null) {
				java.awt.Point hotspot = getImageHotspot(plot, series, item, transX1, transY1, image);
				g2.drawImage(image, ((int) (transX1 - (hotspot.getX()))), ((int) (transY1 - (hotspot.getY()))), null);
				entityArea = new java.awt.geom.Rectangle2D.Double((transX1 - (hotspot.getX())), (transY1 - (hotspot.getY())), image.getWidth(null), image.getHeight(null));
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

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.xy.StandardXYItemRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.xy.StandardXYItemRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.xy.StandardXYItemRenderer that = ((org.jfree.chart.renderer.xy.StandardXYItemRenderer) (obj));
		if ((org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.baseShapesVisible) != (that.baseShapesVisible)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.plotLines) != (that.plotLines)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.plotImages) != (that.plotImages)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.plotDiscontinuous) != (that.plotDiscontinuous)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.gapThresholdType) != (that.gapThresholdType)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.gapThreshold) != (that.gapThreshold)) {
			return false;
		}
		if (!(org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.seriesShapesFilled.equals(that.seriesShapesFilled))) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.baseShapesFilled) != (that.baseShapesFilled)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.drawSeriesLineAsPath) != (that.drawSeriesLineAsPath)) {
			return false;
		}
		if (!(org.jfree.chart.util.ShapeUtilities.equal(org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.legendLine, that.legendLine))) {
			return false;
		}
		return super.equals(obj);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.renderer.xy.StandardXYItemRenderer clone = ((org.jfree.chart.renderer.xy.StandardXYItemRenderer) (super.clone()));
		clone.seriesShapesFilled = ((org.jfree.chart.util.BooleanList) (org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.seriesShapesFilled.clone()));
		clone.legendLine = org.jfree.chart.util.ShapeUtilities.clone(org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.legendLine);
		return clone;
	}

	protected java.awt.Image getImage(org.jfree.chart.plot.Plot plot, int series, int item, double x, double y) {
		return null;
	}

	protected java.awt.Point getImageHotspot(org.jfree.chart.plot.Plot plot, int series, int item, double x, double y, java.awt.Image image) {
		int height = image.getHeight(null);
		int width = image.getWidth(null);
		return new java.awt.Point((width / 2), (height / 2));
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.legendLine = org.jfree.chart.util.SerialUtilities.readShape(stream);
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writeShape(org.jfree.chart.renderer.xy.StandardXYItemRenderer.this.legendLine, stream);
	}
}

