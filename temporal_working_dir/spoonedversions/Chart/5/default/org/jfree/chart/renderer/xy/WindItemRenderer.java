

package org.jfree.chart.renderer.xy;


public class WindItemRenderer extends org.jfree.chart.renderer.xy.AbstractXYItemRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.renderer.xy.XYItemRenderer , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 8078914101916976844L;

	public WindItemRenderer() {
		super();
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYItemRendererState state, java.awt.geom.Rectangle2D plotArea, org.jfree.chart.plot.PlotRenderingInfo info, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.xy.XYDataset dataset, int series, int item, org.jfree.chart.plot.CrosshairState crosshairState, int pass) {
		org.jfree.data.xy.WindDataset windData = ((org.jfree.data.xy.WindDataset) (dataset));
		java.awt.Paint seriesPaint = getItemPaint(series, item);
		java.awt.Stroke seriesStroke = getItemStroke(series, item);
		g2.setPaint(seriesPaint);
		g2.setStroke(seriesStroke);
		java.lang.Number x = windData.getX(series, item);
		java.lang.Number windDir = windData.getWindDirection(series, item);
		java.lang.Number wforce = windData.getWindForce(series, item);
		double windForce = wforce.doubleValue();
		double wdirt = java.lang.Math.toRadians((((windDir.doubleValue()) * (-30.0)) - 90.0));
		double ax1;
		double ax2;
		double ay1;
		double ay2;
		double rax2;
		double ray2;
		org.jfree.chart.util.RectangleEdge domainAxisLocation = plot.getDomainAxisEdge();
		org.jfree.chart.util.RectangleEdge rangeAxisLocation = plot.getRangeAxisEdge();
		ax1 = domainAxis.valueToJava2D(x.doubleValue(), plotArea, domainAxisLocation);
		ay1 = rangeAxis.valueToJava2D(0.0, plotArea, rangeAxisLocation);
		rax2 = (x.doubleValue()) + ((windForce * (java.lang.Math.cos(wdirt))) * 8000000.0);
		ray2 = windForce * (java.lang.Math.sin(wdirt));
		ax2 = domainAxis.valueToJava2D(rax2, plotArea, domainAxisLocation);
		ay2 = rangeAxis.valueToJava2D(ray2, plotArea, rangeAxisLocation);
		int diri = windDir.intValue();
		int forcei = wforce.intValue();
		java.lang.String dirforce = (diri + "-") + forcei;
		java.awt.geom.Line2D line = new java.awt.geom.Line2D.Double(ax1, ay1, ax2, ay2);
		g2.draw(line);
		g2.setPaint(java.awt.Color.blue);
		g2.setFont(new java.awt.Font("Tahoma", 1, 9));
		g2.drawString(dirforce, ((float) (ax1)), ((float) (ay1)));
		g2.setPaint(seriesPaint);
		g2.setStroke(seriesStroke);
		double alx2;
		double aly2;
		double arx2;
		double ary2;
		double ralx2;
		double raly2;
		double rarx2;
		double rary2;
		double aldir = java.lang.Math.toRadians(((((windDir.doubleValue()) * (-30.0)) - 90.0) - 5.0));
		ralx2 = ((((wforce.doubleValue()) * (java.lang.Math.cos(aldir))) * 8000000) * 0.8) + (x.doubleValue());
		raly2 = ((wforce.doubleValue()) * (java.lang.Math.sin(aldir))) * 0.8;
		alx2 = domainAxis.valueToJava2D(ralx2, plotArea, domainAxisLocation);
		aly2 = rangeAxis.valueToJava2D(raly2, plotArea, rangeAxisLocation);
		line = new java.awt.geom.Line2D.Double(alx2, aly2, ax2, ay2);
		g2.draw(line);
		double ardir = java.lang.Math.toRadians(((((windDir.doubleValue()) * (-30.0)) - 90.0) + 5.0));
		rarx2 = ((((wforce.doubleValue()) * (java.lang.Math.cos(ardir))) * 8000000) * 0.8) + (x.doubleValue());
		rary2 = ((wforce.doubleValue()) * (java.lang.Math.sin(ardir))) * 0.8;
		arx2 = domainAxis.valueToJava2D(rarx2, plotArea, domainAxisLocation);
		ary2 = rangeAxis.valueToJava2D(rary2, plotArea, rangeAxisLocation);
		line = new java.awt.geom.Line2D.Double(arx2, ary2, ax2, ay2);
		g2.draw(line);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}
}

