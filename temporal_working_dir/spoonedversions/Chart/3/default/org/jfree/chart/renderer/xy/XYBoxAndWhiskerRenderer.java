

package org.jfree.chart.renderer.xy;


public class XYBoxAndWhiskerRenderer extends org.jfree.chart.renderer.xy.AbstractXYItemRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.renderer.xy.XYItemRenderer , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -8020170108532232324L;

	private double boxWidth;

	private transient java.awt.Paint boxPaint;

	private boolean fillBox;

	private transient java.awt.Paint artifactPaint = java.awt.Color.black;

	public XYBoxAndWhiskerRenderer() {
		this((-1.0));
	}

	public XYBoxAndWhiskerRenderer(double boxWidth) {
		super();
		org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.this.boxWidth = boxWidth;
		org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.this.boxPaint = java.awt.Color.green;
		org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.this.fillBox = true;
		setBaseToolTipGenerator(new org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator());
	}

	public double getBoxWidth() {
		return org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.this.boxWidth;
	}

	public void setBoxWidth(double width) {
		if (width != (org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.this.boxWidth)) {
			org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.this.boxWidth = width;
			fireChangeEvent();
		}
	}

	public java.awt.Paint getBoxPaint() {
		return org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.this.boxPaint;
	}

	public void setBoxPaint(java.awt.Paint paint) {
		org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.this.boxPaint = paint;
		fireChangeEvent();
	}

	public boolean getFillBox() {
		return org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.this.fillBox;
	}

	public void setFillBox(boolean flag) {
		org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.this.fillBox = flag;
		fireChangeEvent();
	}

	public java.awt.Paint getArtifactPaint() {
		return org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.this.artifactPaint;
	}

	public void setArtifactPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.this.artifactPaint = paint;
		fireChangeEvent();
	}

	public org.jfree.data.Range findRangeBounds(org.jfree.data.xy.XYDataset dataset) {
		return findRangeBounds(dataset, true);
	}

	protected java.awt.Paint lookupBoxPaint(int series, int item) {
		java.awt.Paint p = getBoxPaint();
		if (p != null) {
			return p;
		}else {
			return getItemPaint(series, item, false);
		}
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.xy.XYDataset dataset, int series, int item, boolean selected, int pass) {
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			drawHorizontalItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, series, item, selected, pass);
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				drawVerticalItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, series, item, selected, pass);
			}
		
	}

	protected void drawHorizontalItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.xy.XYDataset dataset, int series, int item, boolean selected, int pass) {
		org.jfree.chart.entity.EntityCollection entities = null;
		if ((state.getInfo()) != null) {
			entities = state.getInfo().getOwner().getEntityCollection();
		}
		org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerData = ((org.jfree.data.statistics.BoxAndWhiskerXYDataset) (dataset));
		java.lang.Number x = boxAndWhiskerData.getX(series, item);
		java.lang.Number yMax = boxAndWhiskerData.getMaxRegularValue(series, item);
		java.lang.Number yMin = boxAndWhiskerData.getMinRegularValue(series, item);
		java.lang.Number yMedian = boxAndWhiskerData.getMedianValue(series, item);
		java.lang.Number yAverage = boxAndWhiskerData.getMeanValue(series, item);
		java.lang.Number yQ1Median = boxAndWhiskerData.getQ1Value(series, item);
		java.lang.Number yQ3Median = boxAndWhiskerData.getQ3Value(series, item);
		double xx = domainAxis.valueToJava2D(x.doubleValue(), dataArea, plot.getDomainAxisEdge());
		org.jfree.chart.util.RectangleEdge location = plot.getRangeAxisEdge();
		double yyMax = rangeAxis.valueToJava2D(yMax.doubleValue(), dataArea, location);
		double yyMin = rangeAxis.valueToJava2D(yMin.doubleValue(), dataArea, location);
		double yyMedian = rangeAxis.valueToJava2D(yMedian.doubleValue(), dataArea, location);
		double yyAverage = 0.0;
		if (yAverage != null) {
			yyAverage = rangeAxis.valueToJava2D(yAverage.doubleValue(), dataArea, location);
		}
		double yyQ1Median = rangeAxis.valueToJava2D(yQ1Median.doubleValue(), dataArea, location);
		double yyQ3Median = rangeAxis.valueToJava2D(yQ3Median.doubleValue(), dataArea, location);
		double exactBoxWidth = getBoxWidth();
		double width = exactBoxWidth;
		double dataAreaX = dataArea.getHeight();
		double maxBoxPercent = 0.1;
		double maxBoxWidth = dataAreaX * maxBoxPercent;
		if (exactBoxWidth <= 0.0) {
			int itemCount = boxAndWhiskerData.getItemCount(series);
			exactBoxWidth = ((dataAreaX / itemCount) * 4.5) / 7;
			if (exactBoxWidth < 3) {
				width = 3;
			}else
				if (exactBoxWidth > maxBoxWidth) {
					width = maxBoxWidth;
				}else {
					width = exactBoxWidth;
				}
			
		}
		g2.setPaint(getItemPaint(series, item, selected));
		java.awt.Stroke s = getItemStroke(series, item, selected);
		g2.setStroke(s);
		g2.draw(new java.awt.geom.Line2D.Double(yyMax, xx, yyQ3Median, xx));
		g2.draw(new java.awt.geom.Line2D.Double(yyMax, (xx - (width / 2)), yyMax, (xx + (width / 2))));
		g2.draw(new java.awt.geom.Line2D.Double(yyMin, xx, yyQ1Median, xx));
		g2.draw(new java.awt.geom.Line2D.Double(yyMin, (xx - (width / 2)), yyMin, (xx + (width / 2))));
		java.awt.Shape box = null;
		if (yyQ1Median < yyQ3Median) {
			box = new java.awt.geom.Rectangle2D.Double(yyQ1Median, (xx - (width / 2)), (yyQ3Median - yyQ1Median), width);
		}else {
			box = new java.awt.geom.Rectangle2D.Double(yyQ3Median, (xx - (width / 2)), (yyQ1Median - yyQ3Median), width);
		}
		if (org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.this.fillBox) {
			g2.setPaint(lookupBoxPaint(series, item));
			g2.fill(box);
		}
		g2.setStroke(getItemOutlineStroke(series, item, selected));
		g2.setPaint(getItemOutlinePaint(series, item, selected));
		g2.draw(box);
		g2.setPaint(getArtifactPaint());
		g2.draw(new java.awt.geom.Line2D.Double(yyMedian, (xx - (width / 2)), yyMedian, (xx + (width / 2))));
		if (yAverage != null) {
			double aRadius = width / 4;
			if ((yyAverage > ((dataArea.getMinX()) - aRadius)) && (yyAverage < ((dataArea.getMaxX()) + aRadius))) {
				java.awt.geom.Ellipse2D.Double avgEllipse = new java.awt.geom.Ellipse2D.Double((yyAverage - aRadius), (xx - aRadius), (aRadius * 2), (aRadius * 2));
				g2.fill(avgEllipse);
				g2.draw(avgEllipse);
			}
		}
		if ((entities != null) && (box.intersects(dataArea))) {
			addEntity(entities, box, dataset, series, item, selected, yyAverage, xx);
		}
	}

	protected void drawVerticalItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.xy.XYDataset dataset, int series, int item, boolean selected, int pass) {
		org.jfree.chart.entity.EntityCollection entities = null;
		if ((state.getInfo()) != null) {
			entities = state.getInfo().getOwner().getEntityCollection();
		}
		org.jfree.data.statistics.BoxAndWhiskerXYDataset boxAndWhiskerData = ((org.jfree.data.statistics.BoxAndWhiskerXYDataset) (dataset));
		java.lang.Number x = boxAndWhiskerData.getX(series, item);
		java.lang.Number yMax = boxAndWhiskerData.getMaxRegularValue(series, item);
		java.lang.Number yMin = boxAndWhiskerData.getMinRegularValue(series, item);
		java.lang.Number yMedian = boxAndWhiskerData.getMedianValue(series, item);
		java.lang.Number yAverage = boxAndWhiskerData.getMeanValue(series, item);
		java.lang.Number yQ1Median = boxAndWhiskerData.getQ1Value(series, item);
		java.lang.Number yQ3Median = boxAndWhiskerData.getQ3Value(series, item);
		java.util.List yOutliers = boxAndWhiskerData.getOutliers(series, item);
		double xx = domainAxis.valueToJava2D(x.doubleValue(), dataArea, plot.getDomainAxisEdge());
		org.jfree.chart.util.RectangleEdge location = plot.getRangeAxisEdge();
		double yyMax = rangeAxis.valueToJava2D(yMax.doubleValue(), dataArea, location);
		double yyMin = rangeAxis.valueToJava2D(yMin.doubleValue(), dataArea, location);
		double yyMedian = rangeAxis.valueToJava2D(yMedian.doubleValue(), dataArea, location);
		double yyAverage = 0.0;
		if (yAverage != null) {
			yyAverage = rangeAxis.valueToJava2D(yAverage.doubleValue(), dataArea, location);
		}
		double yyQ1Median = rangeAxis.valueToJava2D(yQ1Median.doubleValue(), dataArea, location);
		double yyQ3Median = rangeAxis.valueToJava2D(yQ3Median.doubleValue(), dataArea, location);
		double yyOutlier;
		double exactBoxWidth = getBoxWidth();
		double width = exactBoxWidth;
		double dataAreaX = (dataArea.getMaxX()) - (dataArea.getMinX());
		double maxBoxPercent = 0.1;
		double maxBoxWidth = dataAreaX * maxBoxPercent;
		if (exactBoxWidth <= 0.0) {
			int itemCount = boxAndWhiskerData.getItemCount(series);
			exactBoxWidth = ((dataAreaX / itemCount) * 4.5) / 7;
			if (exactBoxWidth < 3) {
				width = 3;
			}else
				if (exactBoxWidth > maxBoxWidth) {
					width = maxBoxWidth;
				}else {
					width = exactBoxWidth;
				}
			
		}
		g2.setPaint(getItemPaint(series, item, selected));
		java.awt.Stroke s = getItemStroke(series, item, selected);
		g2.setStroke(s);
		g2.draw(new java.awt.geom.Line2D.Double(xx, yyMax, xx, yyQ3Median));
		g2.draw(new java.awt.geom.Line2D.Double((xx - (width / 2)), yyMax, (xx + (width / 2)), yyMax));
		g2.draw(new java.awt.geom.Line2D.Double(xx, yyMin, xx, yyQ1Median));
		g2.draw(new java.awt.geom.Line2D.Double((xx - (width / 2)), yyMin, (xx + (width / 2)), yyMin));
		java.awt.Shape box = null;
		if (yyQ1Median > yyQ3Median) {
			box = new java.awt.geom.Rectangle2D.Double((xx - (width / 2)), yyQ3Median, width, (yyQ1Median - yyQ3Median));
		}else {
			box = new java.awt.geom.Rectangle2D.Double((xx - (width / 2)), yyQ1Median, width, (yyQ3Median - yyQ1Median));
		}
		if (org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.this.fillBox) {
			g2.setPaint(lookupBoxPaint(series, item));
			g2.fill(box);
		}
		g2.setStroke(getItemOutlineStroke(series, item, selected));
		g2.setPaint(getItemOutlinePaint(series, item, selected));
		g2.draw(box);
		g2.setPaint(getArtifactPaint());
		g2.draw(new java.awt.geom.Line2D.Double((xx - (width / 2)), yyMedian, (xx + (width / 2)), yyMedian));
		double aRadius = 0;
		double oRadius = width / 3;
		if (yAverage != null) {
			aRadius = width / 4;
			if ((yyAverage > ((dataArea.getMinY()) - aRadius)) && (yyAverage < ((dataArea.getMaxY()) + aRadius))) {
				java.awt.geom.Ellipse2D.Double avgEllipse = new java.awt.geom.Ellipse2D.Double((xx - aRadius), (yyAverage - aRadius), (aRadius * 2), (aRadius * 2));
				g2.fill(avgEllipse);
				g2.draw(avgEllipse);
			}
		}
		java.util.List outliers = new java.util.ArrayList();
		org.jfree.chart.renderer.OutlierListCollection outlierListCollection = new org.jfree.chart.renderer.OutlierListCollection();
		for (int i = 0; i < (yOutliers.size()); i++) {
			double outlier = ((java.lang.Number) (yOutliers.get(i))).doubleValue();
			if (outlier > (boxAndWhiskerData.getMaxOutlier(series, item).doubleValue())) {
				outlierListCollection.setHighFarOut(true);
			}else
				if (outlier < (boxAndWhiskerData.getMinOutlier(series, item).doubleValue())) {
					outlierListCollection.setLowFarOut(true);
				}else
					if (outlier > (boxAndWhiskerData.getMaxRegularValue(series, item).doubleValue())) {
						yyOutlier = rangeAxis.valueToJava2D(outlier, dataArea, location);
						outliers.add(new org.jfree.chart.renderer.Outlier(xx, yyOutlier, oRadius));
					}else
						if (outlier < (boxAndWhiskerData.getMinRegularValue(series, item).doubleValue())) {
							yyOutlier = rangeAxis.valueToJava2D(outlier, dataArea, location);
							outliers.add(new org.jfree.chart.renderer.Outlier(xx, yyOutlier, oRadius));
						}
					
				
			
			java.util.Collections.sort(outliers);
		}
		for (java.util.Iterator iterator = outliers.iterator(); iterator.hasNext();) {
			org.jfree.chart.renderer.Outlier outlier = ((org.jfree.chart.renderer.Outlier) (iterator.next()));
			outlierListCollection.add(outlier);
		}
		double maxAxisValue = (rangeAxis.valueToJava2D(rangeAxis.getUpperBound(), dataArea, location)) + aRadius;
		double minAxisValue = (rangeAxis.valueToJava2D(rangeAxis.getLowerBound(), dataArea, location)) - aRadius;
		for (java.util.Iterator iterator = outlierListCollection.iterator(); iterator.hasNext();) {
			org.jfree.chart.renderer.OutlierList list = ((org.jfree.chart.renderer.OutlierList) (iterator.next()));
			org.jfree.chart.renderer.Outlier outlier = list.getAveragedOutlier();
			java.awt.geom.Point2D point = outlier.getPoint();
			if (list.isMultiple()) {
				drawMultipleEllipse(point, width, oRadius, g2);
			}else {
				drawEllipse(point, oRadius, g2);
			}
		}
		if (outlierListCollection.isHighFarOut()) {
			drawHighFarOut(aRadius, g2, xx, maxAxisValue);
		}
		if (outlierListCollection.isLowFarOut()) {
			drawLowFarOut(aRadius, g2, xx, minAxisValue);
		}
		if ((entities != null) && (box.intersects(dataArea))) {
			addEntity(entities, box, dataset, series, item, selected, xx, yyAverage);
		}
	}

	protected void drawEllipse(java.awt.geom.Point2D point, double oRadius, java.awt.Graphics2D g2) {
		java.awt.geom.Ellipse2D.Double dot = new java.awt.geom.Ellipse2D.Double(((point.getX()) + (oRadius / 2)), point.getY(), oRadius, oRadius);
		g2.draw(dot);
	}

	protected void drawMultipleEllipse(java.awt.geom.Point2D point, double boxWidth, double oRadius, java.awt.Graphics2D g2) {
		java.awt.geom.Ellipse2D.Double dot1 = new java.awt.geom.Ellipse2D.Double((((point.getX()) - (boxWidth / 2)) + oRadius), point.getY(), oRadius, oRadius);
		java.awt.geom.Ellipse2D.Double dot2 = new java.awt.geom.Ellipse2D.Double(((point.getX()) + (boxWidth / 2)), point.getY(), oRadius, oRadius);
		g2.draw(dot1);
		g2.draw(dot2);
	}

	protected void drawHighFarOut(double aRadius, java.awt.Graphics2D g2, double xx, double m) {
		double side = aRadius * 2;
		g2.draw(new java.awt.geom.Line2D.Double((xx - side), (m + side), (xx + side), (m + side)));
		g2.draw(new java.awt.geom.Line2D.Double((xx - side), (m + side), xx, m));
		g2.draw(new java.awt.geom.Line2D.Double((xx + side), (m + side), xx, m));
	}

	protected void drawLowFarOut(double aRadius, java.awt.Graphics2D g2, double xx, double m) {
		double side = aRadius * 2;
		g2.draw(new java.awt.geom.Line2D.Double((xx - side), (m - side), (xx + side), (m - side)));
		g2.draw(new java.awt.geom.Line2D.Double((xx - side), (m - side), xx, m));
		g2.draw(new java.awt.geom.Line2D.Double((xx + side), (m - side), xx, m));
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer that = ((org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer) (obj));
		if ((org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.this.boxWidth) != (that.getBoxWidth())) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.this.boxPaint, that.boxPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.this.artifactPaint, that.artifactPaint))) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.this.fillBox) != (that.fillBox)) {
			return false;
		}
		return true;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.this.boxPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.this.artifactPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.this.boxPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer.this.artifactPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}
}

