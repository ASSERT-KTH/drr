

package org.jfree.chart.renderer.xy;


public class XYStepAreaRenderer extends org.jfree.chart.renderer.xy.AbstractXYItemRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.renderer.xy.XYItemRenderer , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -7311560779702649635L;

	public static final int SHAPES = 1;

	public static final int AREA = 2;

	public static final int AREA_AND_SHAPES = 3;

	private boolean shapesVisible;

	private boolean shapesFilled;

	private boolean plotArea;

	private boolean showOutline;

	protected transient java.awt.Polygon pArea = null;

	private double rangeBase;

	public XYStepAreaRenderer() {
		this(org.jfree.chart.renderer.xy.XYStepAreaRenderer.AREA);
	}

	public XYStepAreaRenderer(int type) {
		this(type, null, null);
	}

	public XYStepAreaRenderer(int type, org.jfree.chart.labels.XYToolTipGenerator toolTipGenerator, org.jfree.chart.urls.XYURLGenerator urlGenerator) {
		super();
		setBaseToolTipGenerator(toolTipGenerator);
		setBaseURLGenerator(urlGenerator);
		if (type == (org.jfree.chart.renderer.xy.XYStepAreaRenderer.AREA)) {
			org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.plotArea = true;
		}else
			if (type == (org.jfree.chart.renderer.xy.XYStepAreaRenderer.SHAPES)) {
				org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.shapesVisible = true;
			}else
				if (type == (org.jfree.chart.renderer.xy.XYStepAreaRenderer.AREA_AND_SHAPES)) {
					org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.plotArea = true;
					org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.shapesVisible = true;
				}
			
		
		org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.showOutline = false;
	}

	public boolean isOutline() {
		return org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.showOutline;
	}

	public void setOutline(boolean show) {
		org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.showOutline = show;
		fireChangeEvent();
	}

	public boolean getShapesVisible() {
		return org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.shapesVisible;
	}

	public void setShapesVisible(boolean flag) {
		org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.shapesVisible = flag;
		fireChangeEvent();
	}

	public boolean isShapesFilled() {
		return org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.shapesFilled;
	}

	public void setShapesFilled(boolean filled) {
		org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.shapesFilled = filled;
		fireChangeEvent();
	}

	public boolean getPlotArea() {
		return org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.plotArea;
	}

	public void setPlotArea(boolean flag) {
		org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.plotArea = flag;
		fireChangeEvent();
	}

	public double getRangeBase() {
		return org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.rangeBase;
	}

	public void setRangeBase(double val) {
		org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.rangeBase = val;
		fireChangeEvent();
	}

	public org.jfree.chart.renderer.xy.XYItemRendererState initialise(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.XYPlot plot, org.jfree.data.xy.XYDataset data, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.renderer.xy.XYItemRendererState state = super.initialise(g2, dataArea, plot, data, info);
		state.setProcessVisibleItemsOnly(false);
		return state;
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.xy.XYDataset dataset, int series, int item, boolean selected, int pass) {
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		int itemCount = dataset.getItemCount(series);
		java.awt.Paint paint = getItemPaint(series, item, selected);
		java.awt.Stroke seriesStroke = getItemStroke(series, item, selected);
		g2.setPaint(paint);
		g2.setStroke(seriesStroke);
		double x1 = dataset.getXValue(series, item);
		double y1 = dataset.getYValue(series, item);
		double x = x1;
		double y = java.lang.Double.isNaN(y1) ? getRangeBase() : y1;
		double transX1 = domainAxis.valueToJava2D(x, dataArea, plot.getDomainAxisEdge());
		double transY1 = rangeAxis.valueToJava2D(y, dataArea, plot.getRangeAxisEdge());
		transY1 = org.jfree.chart.renderer.xy.XYStepAreaRenderer.restrictValueToDataArea(transY1, plot, dataArea);
		if (((org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.pArea) == null) && (!(java.lang.Double.isNaN(y1)))) {
			org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.pArea = new java.awt.Polygon();
			double transY2 = rangeAxis.valueToJava2D(getRangeBase(), dataArea, plot.getRangeAxisEdge());
			transY2 = org.jfree.chart.renderer.xy.XYStepAreaRenderer.restrictValueToDataArea(transY2, plot, dataArea);
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.pArea.addPoint(((int) (transX1)), ((int) (transY2)));
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
					org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.pArea.addPoint(((int) (transY2)), ((int) (transX1)));
				}
			
		}
		double transX0 = 0;
		double transY0 = org.jfree.chart.renderer.xy.XYStepAreaRenderer.restrictValueToDataArea(getRangeBase(), plot, dataArea);
		double x0;
		double y0;
		if (item > 0) {
			x0 = dataset.getXValue(series, (item - 1));
			y0 = (java.lang.Double.isNaN(y1)) ? y1 : dataset.getYValue(series, (item - 1));
			x = x0;
			y = (java.lang.Double.isNaN(y0)) ? getRangeBase() : y0;
			transX0 = domainAxis.valueToJava2D(x, dataArea, plot.getDomainAxisEdge());
			transY0 = rangeAxis.valueToJava2D(y, dataArea, plot.getRangeAxisEdge());
			transY0 = org.jfree.chart.renderer.xy.XYStepAreaRenderer.restrictValueToDataArea(transY0, plot, dataArea);
			if (java.lang.Double.isNaN(y1)) {
				transX1 = transX0;
				transY0 = transY1;
			}
			if (transY0 != transY1) {
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.pArea.addPoint(((int) (transX1)), ((int) (transY0)));
				}else
					if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
						org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.pArea.addPoint(((int) (transY0)), ((int) (transX1)));
					}
				
			}
		}
		java.awt.Shape shape = null;
		if (!(java.lang.Double.isNaN(y1))) {
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.pArea.addPoint(((int) (transX1)), ((int) (transY1)));
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
					org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.pArea.addPoint(((int) (transY1)), ((int) (transX1)));
				}
			
			if (getShapesVisible()) {
				shape = getItemShape(series, item, selected);
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					shape = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape, transX1, transY1);
				}else
					if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
						shape = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape, transY1, transX1);
					}
				
				if (isShapesFilled()) {
					g2.fill(shape);
				}else {
					g2.draw(shape);
				}
			}else {
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					shape = new java.awt.geom.Rectangle2D.Double((transX1 - 2), (transY1 - 2), 4.0, 4.0);
				}else
					if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
						shape = new java.awt.geom.Rectangle2D.Double((transY1 - 2), (transX1 - 2), 4.0, 4.0);
					}
				
			}
		}
		if ((((getPlotArea()) && (item > 0)) && ((org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.pArea) != null)) && ((item == (itemCount - 1)) || (java.lang.Double.isNaN(y1)))) {
			double transY2 = rangeAxis.valueToJava2D(getRangeBase(), dataArea, plot.getRangeAxisEdge());
			transY2 = org.jfree.chart.renderer.xy.XYStepAreaRenderer.restrictValueToDataArea(transY2, plot, dataArea);
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.pArea.addPoint(((int) (transX1)), ((int) (transY2)));
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
					org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.pArea.addPoint(((int) (transY2)), ((int) (transX1)));
				}
			
			g2.fill(org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.pArea);
			if (isOutline()) {
				g2.setStroke(plot.getOutlineStroke());
				g2.setPaint(plot.getOutlinePaint());
				g2.draw(org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.pArea);
			}
			org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.pArea = null;
		}
		if (!(java.lang.Double.isNaN(y1))) {
			int domainAxisIndex = plot.getDomainAxisIndex(domainAxis);
			int rangeAxisIndex = plot.getRangeAxisIndex(rangeAxis);
			org.jfree.chart.plot.XYCrosshairState crosshairState = state.getCrosshairState();
			updateCrosshairValues(crosshairState, x1, y1, domainAxisIndex, rangeAxisIndex, transX1, transY1, orientation);
		}
		org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
		if (entities != null) {
			addEntity(entities, shape, dataset, series, item, selected, transX1, transY1);
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.xy.XYStepAreaRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.xy.XYStepAreaRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.xy.XYStepAreaRenderer that = ((org.jfree.chart.renderer.xy.XYStepAreaRenderer) (obj));
		if ((org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.showOutline) != (that.showOutline)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.shapesVisible) != (that.shapesVisible)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.shapesFilled) != (that.shapesFilled)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.plotArea) != (that.plotArea)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.XYStepAreaRenderer.this.rangeBase) != (that.rangeBase)) {
			return false;
		}
		return super.equals(obj);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	protected static double restrictValueToDataArea(double value, org.jfree.chart.plot.XYPlot plot, java.awt.geom.Rectangle2D dataArea) {
		double min = 0;
		double max = 0;
		if ((plot.getOrientation()) == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
			min = dataArea.getMinY();
			max = dataArea.getMaxY();
		}else
			if ((plot.getOrientation()) == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				min = dataArea.getMinX();
				max = dataArea.getMaxX();
			}
		
		if (value < min) {
			value = min;
		}else
			if (value > max) {
				value = max;
			}
		
		return value;
	}
}

