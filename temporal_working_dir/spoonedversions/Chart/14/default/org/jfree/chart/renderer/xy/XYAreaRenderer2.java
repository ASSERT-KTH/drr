

package org.jfree.chart.renderer.xy;


public class XYAreaRenderer2 extends org.jfree.chart.renderer.xy.AbstractXYItemRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.renderer.xy.XYItemRenderer , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -7378069681579984133L;

	private boolean showOutline;

	private transient java.awt.Shape legendArea;

	public XYAreaRenderer2() {
		this(null, null);
	}

	public XYAreaRenderer2(org.jfree.chart.labels.XYToolTipGenerator labelGenerator, org.jfree.chart.urls.XYURLGenerator urlGenerator) {
		super();
		org.jfree.chart.renderer.xy.XYAreaRenderer2.this.showOutline = false;
		setBaseToolTipGenerator(labelGenerator);
		setBaseURLGenerator(urlGenerator);
		java.awt.geom.GeneralPath area = new java.awt.geom.GeneralPath();
		area.moveTo(0.0F, (-4.0F));
		area.lineTo(3.0F, (-2.0F));
		area.lineTo(4.0F, 4.0F);
		area.lineTo((-4.0F), 4.0F);
		area.lineTo((-3.0F), (-2.0F));
		area.closePath();
		org.jfree.chart.renderer.xy.XYAreaRenderer2.this.legendArea = area;
	}

	public boolean isOutline() {
		return org.jfree.chart.renderer.xy.XYAreaRenderer2.this.showOutline;
	}

	public void setOutline(boolean show) {
		org.jfree.chart.renderer.xy.XYAreaRenderer2.this.showOutline = show;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.XYAreaRenderer2.this));
	}

	public java.awt.Shape getLegendArea() {
		return org.jfree.chart.renderer.xy.XYAreaRenderer2.this.legendArea;
	}

	public void setLegendArea(java.awt.Shape area) {
		if (area == null) {
			throw new java.lang.IllegalArgumentException("Null 'area' argument.");
		}
		org.jfree.chart.renderer.xy.XYAreaRenderer2.this.legendArea = area;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.XYAreaRenderer2.this));
	}

	public org.jfree.chart.LegendItem getLegendItem(int datasetIndex, int series) {
		org.jfree.chart.LegendItem result = null;
		org.jfree.chart.plot.XYPlot xyplot = getPlot();
		if (xyplot != null) {
			org.jfree.data.xy.XYDataset dataset = xyplot.getDataset(datasetIndex);
			if (dataset != null) {
				org.jfree.chart.labels.XYSeriesLabelGenerator lg = getLegendItemLabelGenerator();
				java.lang.String label = lg.generateLabel(dataset, series);
				java.lang.String description = label;
				java.lang.String toolTipText = null;
				if ((getLegendItemToolTipGenerator()) != null) {
					toolTipText = getLegendItemToolTipGenerator().generateLabel(dataset, series);
				}
				java.lang.String urlText = null;
				if ((getLegendItemURLGenerator()) != null) {
					urlText = getLegendItemURLGenerator().generateLabel(dataset, series);
				}
				java.awt.Paint paint = lookupSeriesPaint(series);
				result = new org.jfree.chart.LegendItem(label, description, toolTipText, urlText, org.jfree.chart.renderer.xy.XYAreaRenderer2.this.legendArea, paint);
				result.setDataset(dataset);
				result.setDatasetIndex(datasetIndex);
				result.setSeriesKey(dataset.getSeriesKey(series));
				result.setSeriesIndex(series);
			}
		}
		return result;
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PlotRenderingInfo info, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.xy.XYDataset dataset, int series, int item, org.jfree.chart.plot.CrosshairState crosshairState, int pass) {
		if (!(getItemVisible(series, item))) {
			return ;
		}
		double x1 = dataset.getXValue(series, item);
		double y1 = dataset.getYValue(series, item);
		if (java.lang.Double.isNaN(y1)) {
			y1 = 0.0;
		}
		double transX1 = domainAxis.valueToJava2D(x1, dataArea, plot.getDomainAxisEdge());
		double transY1 = rangeAxis.valueToJava2D(y1, dataArea, plot.getRangeAxisEdge());
		double x0 = dataset.getXValue(series, java.lang.Math.max((item - 1), 0));
		double y0 = dataset.getYValue(series, java.lang.Math.max((item - 1), 0));
		if (java.lang.Double.isNaN(y0)) {
			y0 = 0.0;
		}
		double transX0 = domainAxis.valueToJava2D(x0, dataArea, plot.getDomainAxisEdge());
		double transY0 = rangeAxis.valueToJava2D(y0, dataArea, plot.getRangeAxisEdge());
		int itemCount = dataset.getItemCount(series);
		double x2 = dataset.getXValue(series, java.lang.Math.min((item + 1), (itemCount - 1)));
		double y2 = dataset.getYValue(series, java.lang.Math.min((item + 1), (itemCount - 1)));
		if (java.lang.Double.isNaN(y2)) {
			y2 = 0.0;
		}
		double transX2 = domainAxis.valueToJava2D(x2, dataArea, plot.getDomainAxisEdge());
		double transY2 = rangeAxis.valueToJava2D(y2, dataArea, plot.getRangeAxisEdge());
		double transZero = rangeAxis.valueToJava2D(0.0, dataArea, plot.getRangeAxisEdge());
		java.awt.Polygon hotspot = null;
		if ((plot.getOrientation()) == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			hotspot = new java.awt.Polygon();
			hotspot.addPoint(((int) (transZero)), ((int) ((transX0 + transX1) / 2.0)));
			hotspot.addPoint(((int) ((transY0 + transY1) / 2.0)), ((int) ((transX0 + transX1) / 2.0)));
			hotspot.addPoint(((int) (transY1)), ((int) (transX1)));
			hotspot.addPoint(((int) ((transY1 + transY2) / 2.0)), ((int) ((transX1 + transX2) / 2.0)));
			hotspot.addPoint(((int) (transZero)), ((int) ((transX1 + transX2) / 2.0)));
		}else {
			hotspot = new java.awt.Polygon();
			hotspot.addPoint(((int) ((transX0 + transX1) / 2.0)), ((int) (transZero)));
			hotspot.addPoint(((int) ((transX0 + transX1) / 2.0)), ((int) ((transY0 + transY1) / 2.0)));
			hotspot.addPoint(((int) (transX1)), ((int) (transY1)));
			hotspot.addPoint(((int) ((transX1 + transX2) / 2.0)), ((int) ((transY1 + transY2) / 2.0)));
			hotspot.addPoint(((int) ((transX1 + transX2) / 2.0)), ((int) (transZero)));
		}
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		java.awt.Paint paint = getItemPaint(series, item);
		java.awt.Stroke stroke = getItemStroke(series, item);
		g2.setPaint(paint);
		g2.setStroke(stroke);
		g2.fill(hotspot);
		if (isOutline()) {
			g2.setStroke(lookupSeriesOutlineStroke(series));
			g2.setPaint(lookupSeriesOutlinePaint(series));
			g2.draw(hotspot);
		}
		int domainAxisIndex = plot.getDomainAxisIndex(domainAxis);
		int rangeAxisIndex = plot.getRangeAxisIndex(rangeAxis);
		updateCrosshairValues(crosshairState, x1, y1, domainAxisIndex, rangeAxisIndex, transX1, transY1, orientation);
		org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
		if (entities != null) {
			addEntity(entities, hotspot, dataset, series, item, 0.0, 0.0);
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.xy.XYAreaRenderer2.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.xy.XYAreaRenderer2)) {
			return false;
		}
		org.jfree.chart.renderer.xy.XYAreaRenderer2 that = ((org.jfree.chart.renderer.xy.XYAreaRenderer2) (obj));
		if ((org.jfree.chart.renderer.xy.XYAreaRenderer2.this.showOutline) != (that.showOutline)) {
			return false;
		}
		if (!(org.jfree.chart.util.ShapeUtilities.equal(org.jfree.chart.renderer.xy.XYAreaRenderer2.this.legendArea, that.legendArea))) {
			return false;
		}
		return super.equals(obj);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.renderer.xy.XYAreaRenderer2 clone = ((org.jfree.chart.renderer.xy.XYAreaRenderer2) (super.clone()));
		clone.legendArea = org.jfree.chart.util.ShapeUtilities.clone(org.jfree.chart.renderer.xy.XYAreaRenderer2.this.legendArea);
		return clone;
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.renderer.xy.XYAreaRenderer2.this.legendArea = org.jfree.chart.util.SerialUtilities.readShape(stream);
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writeShape(org.jfree.chart.renderer.xy.XYAreaRenderer2.this.legendArea, stream);
	}
}

