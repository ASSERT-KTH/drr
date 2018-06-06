

package org.jfree.chart.renderer.xy;


public class StackedXYAreaRenderer extends org.jfree.chart.renderer.xy.XYAreaRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 5217394318178570889L;

	static class StackedXYAreaRendererState extends org.jfree.chart.renderer.xy.XYItemRendererState {
		private java.awt.Polygon seriesArea;

		private java.awt.geom.Line2D line;

		private java.util.Stack lastSeriesPoints;

		private java.util.Stack currentSeriesPoints;

		public StackedXYAreaRendererState(org.jfree.chart.plot.PlotRenderingInfo info) {
			super(info);
			org.jfree.chart.renderer.xy.StackedXYAreaRenderer.StackedXYAreaRendererState.this.seriesArea = null;
			org.jfree.chart.renderer.xy.StackedXYAreaRenderer.StackedXYAreaRendererState.this.line = new java.awt.geom.Line2D.Double();
			org.jfree.chart.renderer.xy.StackedXYAreaRenderer.StackedXYAreaRendererState.this.lastSeriesPoints = new java.util.Stack();
			org.jfree.chart.renderer.xy.StackedXYAreaRenderer.StackedXYAreaRendererState.this.currentSeriesPoints = new java.util.Stack();
		}

		public java.awt.Polygon getSeriesArea() {
			return org.jfree.chart.renderer.xy.StackedXYAreaRenderer.StackedXYAreaRendererState.this.seriesArea;
		}

		public void setSeriesArea(java.awt.Polygon area) {
			org.jfree.chart.renderer.xy.StackedXYAreaRenderer.StackedXYAreaRendererState.this.seriesArea = area;
		}

		public java.awt.geom.Line2D getLine() {
			return org.jfree.chart.renderer.xy.StackedXYAreaRenderer.StackedXYAreaRendererState.this.line;
		}

		public java.util.Stack getCurrentSeriesPoints() {
			return org.jfree.chart.renderer.xy.StackedXYAreaRenderer.StackedXYAreaRendererState.this.currentSeriesPoints;
		}

		public void setCurrentSeriesPoints(java.util.Stack points) {
			org.jfree.chart.renderer.xy.StackedXYAreaRenderer.StackedXYAreaRendererState.this.currentSeriesPoints = points;
		}

		public java.util.Stack getLastSeriesPoints() {
			return org.jfree.chart.renderer.xy.StackedXYAreaRenderer.StackedXYAreaRendererState.this.lastSeriesPoints;
		}

		public void setLastSeriesPoints(java.util.Stack points) {
			org.jfree.chart.renderer.xy.StackedXYAreaRenderer.StackedXYAreaRendererState.this.lastSeriesPoints = points;
		}
	}

	private transient java.awt.Paint shapePaint = null;

	private transient java.awt.Stroke shapeStroke = null;

	public StackedXYAreaRenderer() {
		this(org.jfree.chart.renderer.xy.XYAreaRenderer.AREA);
	}

	public StackedXYAreaRenderer(int type) {
		this(type, null, null);
	}

	public StackedXYAreaRenderer(int type, org.jfree.chart.labels.XYToolTipGenerator labelGenerator, org.jfree.chart.urls.XYURLGenerator urlGenerator) {
		super(type, labelGenerator, urlGenerator);
	}

	public java.awt.Paint getShapePaint() {
		return org.jfree.chart.renderer.xy.StackedXYAreaRenderer.this.shapePaint;
	}

	public void setShapePaint(java.awt.Paint shapePaint) {
		org.jfree.chart.renderer.xy.StackedXYAreaRenderer.this.shapePaint = shapePaint;
		fireChangeEvent();
	}

	public java.awt.Stroke getShapeStroke() {
		return org.jfree.chart.renderer.xy.StackedXYAreaRenderer.this.shapeStroke;
	}

	public void setShapeStroke(java.awt.Stroke shapeStroke) {
		org.jfree.chart.renderer.xy.StackedXYAreaRenderer.this.shapeStroke = shapeStroke;
		fireChangeEvent();
	}

	public org.jfree.chart.renderer.xy.XYItemRendererState initialise(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.XYPlot plot, org.jfree.data.xy.XYDataset data, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.renderer.xy.XYItemRendererState state = new org.jfree.chart.renderer.xy.StackedXYAreaRenderer.StackedXYAreaRendererState(info);
		state.setProcessVisibleItemsOnly(false);
		return state;
	}

	public int getPassCount() {
		return 2;
	}

	public org.jfree.data.Range findRangeBounds(org.jfree.data.xy.XYDataset dataset) {
		if (dataset != null) {
			return org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(((org.jfree.data.xy.TableXYDataset) (dataset)));
		}else {
			return null;
		}
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PlotRenderingInfo info, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.xy.XYDataset dataset, int series, int item, org.jfree.chart.plot.CrosshairState crosshairState, int pass) {
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		org.jfree.chart.renderer.xy.StackedXYAreaRenderer.StackedXYAreaRendererState areaState = ((org.jfree.chart.renderer.xy.StackedXYAreaRenderer.StackedXYAreaRendererState) (state));
		org.jfree.data.xy.TableXYDataset tdataset = ((org.jfree.data.xy.TableXYDataset) (dataset));
		int itemCount = tdataset.getItemCount();
		double x1 = dataset.getXValue(series, item);
		double y1 = dataset.getYValue(series, item);
		boolean nullPoint = false;
		if (java.lang.Double.isNaN(y1)) {
			y1 = 0.0;
			nullPoint = true;
		}
		double ph1 = getPreviousHeight(tdataset, series, item);
		double transX1 = domainAxis.valueToJava2D(x1, dataArea, plot.getDomainAxisEdge());
		double transY1 = rangeAxis.valueToJava2D((y1 + ph1), dataArea, plot.getRangeAxisEdge());
		java.awt.Paint seriesPaint = getItemPaint(series, item);
		java.awt.Stroke seriesStroke = getItemStroke(series, item);
		if (pass == 0) {
			if (item == 0) {
				areaState.setSeriesArea(new java.awt.Polygon());
				areaState.setLastSeriesPoints(areaState.getCurrentSeriesPoints());
				areaState.setCurrentSeriesPoints(new java.util.Stack());
				double transY2 = rangeAxis.valueToJava2D(ph1, dataArea, plot.getRangeAxisEdge());
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					areaState.getSeriesArea().addPoint(((int) (transX1)), ((int) (transY2)));
				}else
					if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
						areaState.getSeriesArea().addPoint(((int) (transY2)), ((int) (transX1)));
					}
				
			}
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				java.awt.Point point = new java.awt.Point(((int) (transX1)), ((int) (transY1)));
				areaState.getSeriesArea().addPoint(((int) (point.getX())), ((int) (point.getY())));
				areaState.getCurrentSeriesPoints().push(point);
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
					areaState.getSeriesArea().addPoint(((int) (transY1)), ((int) (transX1)));
				}
			
			if (getPlotLines()) {
				if (item > 0) {
					double x0 = dataset.getXValue(series, (item - 1));
					double y0 = dataset.getYValue(series, (item - 1));
					double ph0 = getPreviousHeight(tdataset, series, (item - 1));
					double transX0 = domainAxis.valueToJava2D(x0, dataArea, plot.getDomainAxisEdge());
					double transY0 = rangeAxis.valueToJava2D((y0 + ph0), dataArea, plot.getRangeAxisEdge());
					if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
						areaState.getLine().setLine(transX0, transY0, transX1, transY1);
					}else
						if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
							areaState.getLine().setLine(transY0, transX0, transY1, transX1);
						}
					
					g2.draw(areaState.getLine());
				}
			}
			if (((getPlotArea()) && (item > 0)) && (item == (itemCount - 1))) {
				double transY2 = rangeAxis.valueToJava2D(ph1, dataArea, plot.getRangeAxisEdge());
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					areaState.getSeriesArea().addPoint(((int) (transX1)), ((int) (transY2)));
				}else
					if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
						areaState.getSeriesArea().addPoint(((int) (transY2)), ((int) (transX1)));
					}
				
				if (series != 0) {
					java.util.Stack points = areaState.getLastSeriesPoints();
					while (!(points.empty())) {
						java.awt.Point point = ((java.awt.Point) (points.pop()));
						areaState.getSeriesArea().addPoint(((int) (point.getX())), ((int) (point.getY())));
					} 
				}
				g2.setPaint(seriesPaint);
				g2.setStroke(seriesStroke);
				g2.fill(areaState.getSeriesArea());
				if (isOutline()) {
					g2.setStroke(lookupSeriesOutlineStroke(series));
					g2.setPaint(lookupSeriesOutlinePaint(series));
					g2.draw(areaState.getSeriesArea());
				}
			}
			int domainAxisIndex = plot.getDomainAxisIndex(domainAxis);
			int rangeAxisIndex = plot.getRangeAxisIndex(rangeAxis);
			updateCrosshairValues(crosshairState, x1, (ph1 + y1), domainAxisIndex, rangeAxisIndex, transX1, transY1, orientation);
		}else
			if (pass == 1) {
				java.awt.Shape shape = null;
				if (getPlotShapes()) {
					shape = getItemShape(series, item);
					if ((plot.getOrientation()) == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
						shape = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape, transX1, transY1);
					}else
						if ((plot.getOrientation()) == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
							shape = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape, transY1, transX1);
						}
					
					if (!nullPoint) {
						if ((getShapePaint()) != null) {
							g2.setPaint(getShapePaint());
						}else {
							g2.setPaint(seriesPaint);
						}
						if ((getShapeStroke()) != null) {
							g2.setStroke(getShapeStroke());
						}else {
							g2.setStroke(seriesStroke);
						}
						g2.draw(shape);
					}
				}else {
					if ((plot.getOrientation()) == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
						shape = new java.awt.geom.Rectangle2D.Double((transX1 - 3), (transY1 - 3), 6.0, 6.0);
					}else
						if ((plot.getOrientation()) == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
							shape = new java.awt.geom.Rectangle2D.Double((transY1 - 3), (transX1 - 3), 6.0, 6.0);
						}
					
				}
				org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
				if (entities != null) {
					addEntity(entities, shape, dataset, series, item, 0.0, 0.0);
				}
			}
		
	}

	protected double getPreviousHeight(org.jfree.data.xy.TableXYDataset dataset, int series, int index) {
		double result = 0.0;
		for (int i = 0; i < series; i++) {
			double value = dataset.getYValue(i, index);
			if (!(java.lang.Double.isNaN(value))) {
				result += value;
			}
		}
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.xy.StackedXYAreaRenderer.this)) {
			return true;
		}
		if ((!(obj instanceof org.jfree.chart.renderer.xy.StackedXYAreaRenderer)) || (!(super.equals(obj)))) {
			return false;
		}
		org.jfree.chart.renderer.xy.StackedXYAreaRenderer that = ((org.jfree.chart.renderer.xy.StackedXYAreaRenderer) (obj));
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.renderer.xy.StackedXYAreaRenderer.this.shapePaint, that.shapePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.xy.StackedXYAreaRenderer.this.shapeStroke, that.shapeStroke))) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.renderer.xy.StackedXYAreaRenderer.this.shapePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.renderer.xy.StackedXYAreaRenderer.this.shapeStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.xy.StackedXYAreaRenderer.this.shapePaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.renderer.xy.StackedXYAreaRenderer.this.shapeStroke, stream);
	}
}

