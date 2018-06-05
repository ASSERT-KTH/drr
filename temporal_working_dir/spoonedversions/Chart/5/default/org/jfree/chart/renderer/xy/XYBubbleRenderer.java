

package org.jfree.chart.renderer.xy;


public class XYBubbleRenderer extends org.jfree.chart.renderer.xy.AbstractXYItemRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.renderer.xy.XYItemRenderer , org.jfree.chart.util.PublicCloneable {
	public static final long serialVersionUID = -5221991598674249125L;

	public static final int SCALE_ON_BOTH_AXES = 0;

	public static final int SCALE_ON_DOMAIN_AXIS = 1;

	public static final int SCALE_ON_RANGE_AXIS = 2;

	private int scaleType;

	public XYBubbleRenderer() {
		this(org.jfree.chart.renderer.xy.XYBubbleRenderer.SCALE_ON_BOTH_AXES);
	}

	public XYBubbleRenderer(int scaleType) {
		super();
		if ((scaleType < 0) || (scaleType > 2)) {
			throw new java.lang.IllegalArgumentException("Invalid 'scaleType'.");
		}
		org.jfree.chart.renderer.xy.XYBubbleRenderer.this.scaleType = scaleType;
		setBaseLegendShape(new java.awt.geom.Ellipse2D.Double((-4.0), (-4.0), 8.0, 8.0));
	}

	public int getScaleType() {
		return org.jfree.chart.renderer.xy.XYBubbleRenderer.this.scaleType;
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PlotRenderingInfo info, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.xy.XYDataset dataset, int series, int item, org.jfree.chart.plot.CrosshairState crosshairState, int pass) {
		if (!(getItemVisible(series, item))) {
			return ;
		}
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		double x = dataset.getXValue(series, item);
		double y = dataset.getYValue(series, item);
		double z = java.lang.Double.NaN;
		if (dataset instanceof org.jfree.data.xy.XYZDataset) {
			org.jfree.data.xy.XYZDataset xyzData = ((org.jfree.data.xy.XYZDataset) (dataset));
			z = xyzData.getZValue(series, item);
		}
		if (!(java.lang.Double.isNaN(z))) {
			org.jfree.chart.util.RectangleEdge domainAxisLocation = plot.getDomainAxisEdge();
			org.jfree.chart.util.RectangleEdge rangeAxisLocation = plot.getRangeAxisEdge();
			double transX = domainAxis.valueToJava2D(x, dataArea, domainAxisLocation);
			double transY = rangeAxis.valueToJava2D(y, dataArea, rangeAxisLocation);
			double transDomain = 0.0;
			double transRange = 0.0;
			double zero;
			switch (getScaleType()) {
				case org.jfree.chart.renderer.xy.XYBubbleRenderer.SCALE_ON_DOMAIN_AXIS :
					zero = domainAxis.valueToJava2D(0.0, dataArea, domainAxisLocation);
					transDomain = (domainAxis.valueToJava2D(z, dataArea, domainAxisLocation)) - zero;
					transRange = transDomain;
					break;
				case org.jfree.chart.renderer.xy.XYBubbleRenderer.SCALE_ON_RANGE_AXIS :
					zero = rangeAxis.valueToJava2D(0.0, dataArea, rangeAxisLocation);
					transRange = zero - (rangeAxis.valueToJava2D(z, dataArea, rangeAxisLocation));
					transDomain = transRange;
					break;
				default :
					double zero1 = domainAxis.valueToJava2D(0.0, dataArea, domainAxisLocation);
					double zero2 = rangeAxis.valueToJava2D(0.0, dataArea, rangeAxisLocation);
					transDomain = (domainAxis.valueToJava2D(z, dataArea, domainAxisLocation)) - zero1;
					transRange = zero2 - (rangeAxis.valueToJava2D(z, dataArea, rangeAxisLocation));
			}
			transDomain = java.lang.Math.abs(transDomain);
			transRange = java.lang.Math.abs(transRange);
			java.awt.geom.Ellipse2D circle = null;
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				circle = new java.awt.geom.Ellipse2D.Double((transX - (transDomain / 2.0)), (transY - (transRange / 2.0)), transDomain, transRange);
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
					circle = new java.awt.geom.Ellipse2D.Double((transY - (transRange / 2.0)), (transX - (transDomain / 2.0)), transRange, transDomain);
				}
			
			g2.setPaint(getItemPaint(series, item));
			g2.fill(circle);
			g2.setStroke(getItemOutlineStroke(series, item));
			g2.setPaint(getItemOutlinePaint(series, item));
			g2.draw(circle);
			if (isItemLabelVisible(series, item)) {
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					drawItemLabel(g2, orientation, dataset, series, item, transX, transY, false);
				}else
					if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
						drawItemLabel(g2, orientation, dataset, series, item, transY, transX, false);
					}
				
			}
			org.jfree.chart.entity.EntityCollection entities = null;
			if (info != null) {
				entities = info.getOwner().getEntityCollection();
				if ((entities != null) && (circle.intersects(dataArea))) {
					addEntity(entities, circle, dataset, series, item, circle.getCenterX(), circle.getCenterY());
				}
			}
			int domainAxisIndex = plot.getDomainAxisIndex(domainAxis);
			int rangeAxisIndex = plot.getRangeAxisIndex(rangeAxis);
			updateCrosshairValues(crosshairState, x, y, domainAxisIndex, rangeAxisIndex, transX, transY, orientation);
		}
	}

	public org.jfree.chart.LegendItem getLegendItem(int datasetIndex, int series) {
		org.jfree.chart.LegendItem result = null;
		org.jfree.chart.plot.XYPlot plot = getPlot();
		if (plot == null) {
			return null;
		}
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
				java.awt.Shape shape = lookupLegendShape(series);
				java.awt.Paint paint = lookupSeriesPaint(series);
				java.awt.Paint outlinePaint = lookupSeriesOutlinePaint(series);
				java.awt.Stroke outlineStroke = lookupSeriesOutlineStroke(series);
				result = new org.jfree.chart.LegendItem(label, description, toolTipText, urlText, shape, paint, outlineStroke, outlinePaint);
				result.setLabelFont(lookupLegendTextFont(series));
				java.awt.Paint labelPaint = lookupLegendTextPaint(series);
				if (labelPaint != null) {
					result.setLabelPaint(labelPaint);
				}
				result.setDataset(dataset);
				result.setDatasetIndex(datasetIndex);
				result.setSeriesKey(dataset.getSeriesKey(series));
				result.setSeriesIndex(series);
			}
		}
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.xy.XYBubbleRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.xy.XYBubbleRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.xy.XYBubbleRenderer that = ((org.jfree.chart.renderer.xy.XYBubbleRenderer) (obj));
		if ((org.jfree.chart.renderer.xy.XYBubbleRenderer.this.scaleType) != (that.scaleType)) {
			return false;
		}
		return super.equals(obj);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}
}

