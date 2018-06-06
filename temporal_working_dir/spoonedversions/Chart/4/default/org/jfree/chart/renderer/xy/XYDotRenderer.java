

package org.jfree.chart.renderer.xy;


public class XYDotRenderer extends org.jfree.chart.renderer.xy.AbstractXYItemRenderer implements org.jfree.chart.renderer.xy.XYItemRenderer , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -2764344339073566425L;

	private int dotWidth;

	private int dotHeight;

	private transient java.awt.Shape legendShape;

	public XYDotRenderer() {
		super();
		org.jfree.chart.renderer.xy.XYDotRenderer.this.dotWidth = 1;
		org.jfree.chart.renderer.xy.XYDotRenderer.this.dotHeight = 1;
		org.jfree.chart.renderer.xy.XYDotRenderer.this.legendShape = new java.awt.geom.Rectangle2D.Double((-3.0), (-3.0), 6.0, 6.0);
	}

	public int getDotWidth() {
		return org.jfree.chart.renderer.xy.XYDotRenderer.this.dotWidth;
	}

	public void setDotWidth(int w) {
		if (w < 1) {
			throw new java.lang.IllegalArgumentException("Requires w > 0.");
		}
		org.jfree.chart.renderer.xy.XYDotRenderer.this.dotWidth = w;
		fireChangeEvent();
	}

	public int getDotHeight() {
		return org.jfree.chart.renderer.xy.XYDotRenderer.this.dotHeight;
	}

	public void setDotHeight(int h) {
		if (h < 1) {
			throw new java.lang.IllegalArgumentException("Requires h > 0.");
		}
		org.jfree.chart.renderer.xy.XYDotRenderer.this.dotHeight = h;
		fireChangeEvent();
	}

	public java.awt.Shape getLegendShape() {
		return org.jfree.chart.renderer.xy.XYDotRenderer.this.legendShape;
	}

	public void setLegendShape(java.awt.Shape shape) {
		if (shape == null) {
			throw new java.lang.IllegalArgumentException("Null 'shape' argument.");
		}
		org.jfree.chart.renderer.xy.XYDotRenderer.this.legendShape = shape;
		fireChangeEvent();
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.xy.XYDataset dataset, int series, int item, boolean selected, int pass) {
		if (!(getItemVisible(series, item))) {
			return ;
		}
		double x = dataset.getXValue(series, item);
		double y = dataset.getYValue(series, item);
		double adjx = ((org.jfree.chart.renderer.xy.XYDotRenderer.this.dotWidth) - 1) / 2.0;
		double adjy = ((org.jfree.chart.renderer.xy.XYDotRenderer.this.dotHeight) - 1) / 2.0;
		if (!(java.lang.Double.isNaN(y))) {
			org.jfree.chart.util.RectangleEdge xAxisLocation = plot.getDomainAxisEdge();
			org.jfree.chart.util.RectangleEdge yAxisLocation = plot.getRangeAxisEdge();
			double transX = (domainAxis.valueToJava2D(x, dataArea, xAxisLocation)) - adjx;
			double transY = (rangeAxis.valueToJava2D(y, dataArea, yAxisLocation)) - adjy;
			g2.setPaint(getItemPaint(series, item, selected));
			org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				g2.fillRect(((int) (transY)), ((int) (transX)), org.jfree.chart.renderer.xy.XYDotRenderer.this.dotHeight, org.jfree.chart.renderer.xy.XYDotRenderer.this.dotWidth);
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					g2.fillRect(((int) (transX)), ((int) (transY)), org.jfree.chart.renderer.xy.XYDotRenderer.this.dotWidth, org.jfree.chart.renderer.xy.XYDotRenderer.this.dotHeight);
				}
			
			int domainAxisIndex = plot.getDomainAxisIndex(domainAxis);
			int rangeAxisIndex = plot.getRangeAxisIndex(rangeAxis);
			org.jfree.chart.plot.XYCrosshairState crosshairState = state.getCrosshairState();
			updateCrosshairValues(crosshairState, x, y, domainAxisIndex, rangeAxisIndex, transX, transY, orientation);
		}
	}

	public org.jfree.chart.LegendItem getLegendItem(int datasetIndex, int series) {
		org.jfree.chart.plot.XYPlot plot = getPlot();
		if (plot == null) {
			return null;
		}
		org.jfree.data.xy.XYDataset dataset = plot.getDataset(datasetIndex);
		if (dataset == null) {
			return null;
		}
		org.jfree.chart.LegendItem result = null;
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
			java.awt.Paint fillPaint = lookupSeriesPaint(series);
			result = new org.jfree.chart.LegendItem(label, description, toolTipText, urlText, getLegendShape(), fillPaint);
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
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.xy.XYDotRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.xy.XYDotRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.xy.XYDotRenderer that = ((org.jfree.chart.renderer.xy.XYDotRenderer) (obj));
		if ((org.jfree.chart.renderer.xy.XYDotRenderer.this.dotWidth) != (that.dotWidth)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.XYDotRenderer.this.dotHeight) != (that.dotHeight)) {
			return false;
		}
		if (!(org.jfree.chart.util.ShapeUtilities.equal(org.jfree.chart.renderer.xy.XYDotRenderer.this.legendShape, that.legendShape))) {
			return false;
		}
		return super.equals(obj);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.renderer.xy.XYDotRenderer.this.legendShape = org.jfree.chart.util.SerialUtilities.readShape(stream);
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writeShape(org.jfree.chart.renderer.xy.XYDotRenderer.this.legendShape, stream);
	}
}

