

package org.jfree.chart.renderer.category;


public class BoxAndWhiskerRenderer extends org.jfree.chart.renderer.category.AbstractCategoryItemRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 632027470694481177L;

	private transient java.awt.Paint artifactPaint;

	private boolean fillBox;

	private double itemMargin;

	private double maximumBarWidth;

	private boolean medianVisible;

	private boolean meanVisible;

	public BoxAndWhiskerRenderer() {
		org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.artifactPaint = java.awt.Color.black;
		org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.fillBox = true;
		org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.itemMargin = 0.2;
		org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.maximumBarWidth = 1.0;
		org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.medianVisible = true;
		org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.meanVisible = false;
		setBaseLegendShape(new java.awt.geom.Rectangle2D.Double((-4.0), (-4.0), 8.0, 8.0));
	}

	public java.awt.Paint getArtifactPaint() {
		return org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.artifactPaint;
	}

	public void setArtifactPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.artifactPaint = paint;
		fireChangeEvent();
	}

	public boolean getFillBox() {
		return org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.fillBox;
	}

	public void setFillBox(boolean flag) {
		org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.fillBox = flag;
		fireChangeEvent();
	}

	public double getItemMargin() {
		return org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.itemMargin;
	}

	public void setItemMargin(double margin) {
		org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.itemMargin = margin;
		fireChangeEvent();
	}

	public double getMaximumBarWidth() {
		return org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.maximumBarWidth;
	}

	public void setMaximumBarWidth(double percent) {
		org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.maximumBarWidth = percent;
		fireChangeEvent();
	}

	public boolean isMeanVisible() {
		return org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.meanVisible;
	}

	public void setMeanVisible(boolean visible) {
		if ((org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.meanVisible) == visible) {
			return ;
		}
		org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.meanVisible = visible;
		fireChangeEvent();
	}

	public boolean isMedianVisible() {
		return org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.medianVisible;
	}

	public void setMedianVisible(boolean visible) {
		org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.medianVisible = visible;
	}

	public org.jfree.chart.LegendItem getLegendItem(int datasetIndex, int series) {
		org.jfree.chart.plot.CategoryPlot cp = getPlot();
		if (cp == null) {
			return null;
		}
		if ((!(isSeriesVisible(series))) || (!(isSeriesVisibleInLegend(series)))) {
			return null;
		}
		org.jfree.data.category.CategoryDataset dataset = cp.getDataset(datasetIndex);
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
		org.jfree.chart.LegendItem result = new org.jfree.chart.LegendItem(label, description, toolTipText, urlText, shape, paint, outlineStroke, outlinePaint);
		result.setLabelFont(lookupLegendTextFont(series));
		java.awt.Paint labelPaint = lookupLegendTextPaint(series);
		if (labelPaint != null) {
			result.setLabelPaint(labelPaint);
		}
		result.setDataset(dataset);
		result.setDatasetIndex(datasetIndex);
		result.setSeriesKey(dataset.getRowKey(series));
		result.setSeriesIndex(series);
		return result;
	}

	public org.jfree.chart.renderer.category.CategoryItemRendererState initialise(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.data.category.CategoryDataset dataset, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.renderer.category.CategoryItemRendererState state = super.initialise(g2, dataArea, plot, dataset, info);
		org.jfree.chart.axis.CategoryAxis domainAxis = getDomainAxis(plot, dataset);
		if (dataset != null) {
			int columns = dataset.getColumnCount();
			int rows = dataset.getRowCount();
			double space = 0.0;
			org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				space = dataArea.getHeight();
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					space = dataArea.getWidth();
				}
			
			double maxWidth = space * (getMaximumBarWidth());
			double categoryMargin = 0.0;
			double currentItemMargin = 0.0;
			if (columns > 1) {
				categoryMargin = domainAxis.getCategoryMargin();
			}
			if (rows > 1) {
				currentItemMargin = getItemMargin();
			}
			double used = space * ((((1 - (domainAxis.getLowerMargin())) - (domainAxis.getUpperMargin())) - categoryMargin) - currentItemMargin);
			if ((rows * columns) > 0) {
				state.setBarWidth(java.lang.Math.min((used / ((dataset.getColumnCount()) * (dataset.getRowCount()))), maxWidth));
			}else {
				state.setBarWidth(java.lang.Math.min(used, maxWidth));
			}
		}
		return state;
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.category.CategoryDataset dataset, int row, int column, boolean selected, int pass) {
		if (!(getItemVisible(row, column))) {
			return ;
		}
		if (!(dataset instanceof org.jfree.data.statistics.BoxAndWhiskerCategoryDataset)) {
			throw new java.lang.IllegalArgumentException(("BoxAndWhiskerRenderer.drawItem() : the data should be " + "of type BoxAndWhiskerCategoryDataset only."));
		}
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			drawHorizontalItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, row, column, selected, pass);
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				drawVerticalItem(g2, state, dataArea, plot, domainAxis, rangeAxis, dataset, row, column, selected, pass);
			}
		
	}

	protected void drawHorizontalItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.category.CategoryDataset dataset, int row, int column, boolean selected, int pass) {
		org.jfree.data.statistics.BoxAndWhiskerCategoryDataset bawDataset = ((org.jfree.data.statistics.BoxAndWhiskerCategoryDataset) (dataset));
		double categoryEnd = domainAxis.getCategoryEnd(column, getColumnCount(), dataArea, plot.getDomainAxisEdge());
		double categoryStart = domainAxis.getCategoryStart(column, getColumnCount(), dataArea, plot.getDomainAxisEdge());
		double categoryWidth = java.lang.Math.abs((categoryEnd - categoryStart));
		double yy = categoryStart;
		int seriesCount = getRowCount();
		int categoryCount = getColumnCount();
		if (seriesCount > 1) {
			double seriesGap = ((dataArea.getHeight()) * (getItemMargin())) / (categoryCount * (seriesCount - 1));
			double usedWidth = ((state.getBarWidth()) * seriesCount) + (seriesGap * (seriesCount - 1));
			double offset = (categoryWidth - usedWidth) / 2;
			yy = (yy + offset) + (row * ((state.getBarWidth()) + seriesGap));
		}else {
			double offset = (categoryWidth - (state.getBarWidth())) / 2;
			yy = yy + offset;
		}
		g2.setPaint(getItemPaint(row, column, selected));
		java.awt.Stroke s = getItemStroke(row, column, selected);
		g2.setStroke(s);
		org.jfree.chart.util.RectangleEdge location = plot.getRangeAxisEdge();
		java.lang.Number xQ1 = bawDataset.getQ1Value(row, column);
		java.lang.Number xQ3 = bawDataset.getQ3Value(row, column);
		java.lang.Number xMax = bawDataset.getMaxRegularValue(row, column);
		java.lang.Number xMin = bawDataset.getMinRegularValue(row, column);
		java.awt.Shape box = null;
		if ((((xQ1 != null) && (xQ3 != null)) && (xMax != null)) && (xMin != null)) {
			double xxQ1 = rangeAxis.valueToJava2D(xQ1.doubleValue(), dataArea, location);
			double xxQ3 = rangeAxis.valueToJava2D(xQ3.doubleValue(), dataArea, location);
			double xxMax = rangeAxis.valueToJava2D(xMax.doubleValue(), dataArea, location);
			double xxMin = rangeAxis.valueToJava2D(xMin.doubleValue(), dataArea, location);
			double yymid = yy + ((state.getBarWidth()) / 2.0);
			g2.draw(new java.awt.geom.Line2D.Double(xxMax, yymid, xxQ3, yymid));
			g2.draw(new java.awt.geom.Line2D.Double(xxMax, yy, xxMax, (yy + (state.getBarWidth()))));
			g2.draw(new java.awt.geom.Line2D.Double(xxMin, yymid, xxQ1, yymid));
			g2.draw(new java.awt.geom.Line2D.Double(xxMin, yy, xxMin, (yy + (state.getBarWidth()))));
			box = new java.awt.geom.Rectangle2D.Double(java.lang.Math.min(xxQ1, xxQ3), yy, java.lang.Math.abs((xxQ1 - xxQ3)), state.getBarWidth());
			if (org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.fillBox) {
				g2.fill(box);
			}
			g2.setStroke(getItemOutlineStroke(row, column, selected));
			g2.setPaint(getItemOutlinePaint(row, column, selected));
			g2.draw(box);
		}
		g2.setPaint(org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.artifactPaint);
		double aRadius = 0;
		if (org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.meanVisible) {
			java.lang.Number xMean = bawDataset.getMeanValue(row, column);
			if (xMean != null) {
				double xxMean = rangeAxis.valueToJava2D(xMean.doubleValue(), dataArea, location);
				aRadius = (state.getBarWidth()) / 4;
				if ((xxMean > ((dataArea.getMinX()) - aRadius)) && (xxMean < ((dataArea.getMaxX()) + aRadius))) {
					java.awt.geom.Ellipse2D.Double avgEllipse = new java.awt.geom.Ellipse2D.Double((xxMean - aRadius), (yy + aRadius), (aRadius * 2), (aRadius * 2));
					g2.fill(avgEllipse);
					g2.draw(avgEllipse);
				}
			}
		}
		if (org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.medianVisible) {
			java.lang.Number xMedian = bawDataset.getMedianValue(row, column);
			if (xMedian != null) {
				double xxMedian = rangeAxis.valueToJava2D(xMedian.doubleValue(), dataArea, location);
				g2.draw(new java.awt.geom.Line2D.Double(xxMedian, yy, xxMedian, (yy + (state.getBarWidth()))));
			}
		}
		if (((state.getInfo()) != null) && (box != null)) {
			org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
			if (entities != null) {
				addEntity(entities, box, dataset, row, column, selected);
			}
		}
	}

	protected void drawVerticalItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.category.CategoryItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.category.CategoryDataset dataset, int row, int column, boolean selected, int pass) {
		org.jfree.data.statistics.BoxAndWhiskerCategoryDataset bawDataset = ((org.jfree.data.statistics.BoxAndWhiskerCategoryDataset) (dataset));
		double categoryEnd = domainAxis.getCategoryEnd(column, getColumnCount(), dataArea, plot.getDomainAxisEdge());
		double categoryStart = domainAxis.getCategoryStart(column, getColumnCount(), dataArea, plot.getDomainAxisEdge());
		double categoryWidth = categoryEnd - categoryStart;
		double xx = categoryStart;
		int seriesCount = getRowCount();
		int categoryCount = getColumnCount();
		if (seriesCount > 1) {
			double seriesGap = ((dataArea.getWidth()) * (getItemMargin())) / (categoryCount * (seriesCount - 1));
			double usedWidth = ((state.getBarWidth()) * seriesCount) + (seriesGap * (seriesCount - 1));
			double offset = (categoryWidth - usedWidth) / 2;
			xx = (xx + offset) + (row * ((state.getBarWidth()) + seriesGap));
		}else {
			double offset = (categoryWidth - (state.getBarWidth())) / 2;
			xx = xx + offset;
		}
		double yyAverage = 0.0;
		double yyOutlier;
		java.awt.Paint itemPaint = getItemPaint(row, column, selected);
		g2.setPaint(itemPaint);
		java.awt.Stroke s = getItemStroke(row, column, selected);
		g2.setStroke(s);
		double aRadius = 0;
		org.jfree.chart.util.RectangleEdge location = plot.getRangeAxisEdge();
		java.lang.Number yQ1 = bawDataset.getQ1Value(row, column);
		java.lang.Number yQ3 = bawDataset.getQ3Value(row, column);
		java.lang.Number yMax = bawDataset.getMaxRegularValue(row, column);
		java.lang.Number yMin = bawDataset.getMinRegularValue(row, column);
		java.awt.Shape box = null;
		if ((((yQ1 != null) && (yQ3 != null)) && (yMax != null)) && (yMin != null)) {
			double yyQ1 = rangeAxis.valueToJava2D(yQ1.doubleValue(), dataArea, location);
			double yyQ3 = rangeAxis.valueToJava2D(yQ3.doubleValue(), dataArea, location);
			double yyMax = rangeAxis.valueToJava2D(yMax.doubleValue(), dataArea, location);
			double yyMin = rangeAxis.valueToJava2D(yMin.doubleValue(), dataArea, location);
			double xxmid = xx + ((state.getBarWidth()) / 2.0);
			g2.draw(new java.awt.geom.Line2D.Double(xxmid, yyMax, xxmid, yyQ3));
			g2.draw(new java.awt.geom.Line2D.Double(xx, yyMax, (xx + (state.getBarWidth())), yyMax));
			g2.draw(new java.awt.geom.Line2D.Double(xxmid, yyMin, xxmid, yyQ1));
			g2.draw(new java.awt.geom.Line2D.Double(xx, yyMin, (xx + (state.getBarWidth())), yyMin));
			box = new java.awt.geom.Rectangle2D.Double(xx, java.lang.Math.min(yyQ1, yyQ3), state.getBarWidth(), java.lang.Math.abs((yyQ1 - yyQ3)));
			if (org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.fillBox) {
				g2.fill(box);
			}
			g2.setStroke(getItemOutlineStroke(row, column, selected));
			g2.setPaint(getItemOutlinePaint(row, column, selected));
			g2.draw(box);
		}
		g2.setPaint(org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.artifactPaint);
		if (org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.meanVisible) {
			java.lang.Number yMean = bawDataset.getMeanValue(row, column);
			if (yMean != null) {
				yyAverage = rangeAxis.valueToJava2D(yMean.doubleValue(), dataArea, location);
				aRadius = (state.getBarWidth()) / 4;
				if ((yyAverage > ((dataArea.getMinY()) - aRadius)) && (yyAverage < ((dataArea.getMaxY()) + aRadius))) {
					java.awt.geom.Ellipse2D.Double avgEllipse = new java.awt.geom.Ellipse2D.Double((xx + aRadius), (yyAverage - aRadius), (aRadius * 2), (aRadius * 2));
					g2.fill(avgEllipse);
					g2.draw(avgEllipse);
				}
			}
		}
		if (org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.medianVisible) {
			java.lang.Number yMedian = bawDataset.getMedianValue(row, column);
			if (yMedian != null) {
				double yyMedian = rangeAxis.valueToJava2D(yMedian.doubleValue(), dataArea, location);
				g2.draw(new java.awt.geom.Line2D.Double(xx, yyMedian, (xx + (state.getBarWidth())), yyMedian));
			}
		}
		double maxAxisValue = (rangeAxis.valueToJava2D(rangeAxis.getUpperBound(), dataArea, location)) + aRadius;
		double minAxisValue = (rangeAxis.valueToJava2D(rangeAxis.getLowerBound(), dataArea, location)) - aRadius;
		g2.setPaint(itemPaint);
		double oRadius = (state.getBarWidth()) / 3;
		java.util.List outliers = new java.util.ArrayList();
		org.jfree.chart.renderer.OutlierListCollection outlierListCollection = new org.jfree.chart.renderer.OutlierListCollection();
		java.util.List yOutliers = bawDataset.getOutliers(row, column);
		if (yOutliers != null) {
			for (int i = 0; i < (yOutliers.size()); i++) {
				double outlier = ((java.lang.Number) (yOutliers.get(i))).doubleValue();
				java.lang.Number minOutlier = bawDataset.getMinOutlier(row, column);
				java.lang.Number maxOutlier = bawDataset.getMaxOutlier(row, column);
				java.lang.Number minRegular = bawDataset.getMinRegularValue(row, column);
				java.lang.Number maxRegular = bawDataset.getMaxRegularValue(row, column);
				if (outlier > (maxOutlier.doubleValue())) {
					outlierListCollection.setHighFarOut(true);
				}else
					if (outlier < (minOutlier.doubleValue())) {
						outlierListCollection.setLowFarOut(true);
					}else
						if (outlier > (maxRegular.doubleValue())) {
							yyOutlier = rangeAxis.valueToJava2D(outlier, dataArea, location);
							outliers.add(new org.jfree.chart.renderer.Outlier((xx + ((state.getBarWidth()) / 2.0)), yyOutlier, oRadius));
						}else
							if (outlier < (minRegular.doubleValue())) {
								yyOutlier = rangeAxis.valueToJava2D(outlier, dataArea, location);
								outliers.add(new org.jfree.chart.renderer.Outlier((xx + ((state.getBarWidth()) / 2.0)), yyOutlier, oRadius));
							}
						
					
				
				java.util.Collections.sort(outliers);
			}
			for (java.util.Iterator iterator = outliers.iterator(); iterator.hasNext();) {
				org.jfree.chart.renderer.Outlier outlier = ((org.jfree.chart.renderer.Outlier) (iterator.next()));
				outlierListCollection.add(outlier);
			}
			for (java.util.Iterator iterator = outlierListCollection.iterator(); iterator.hasNext();) {
				org.jfree.chart.renderer.OutlierList list = ((org.jfree.chart.renderer.OutlierList) (iterator.next()));
				org.jfree.chart.renderer.Outlier outlier = list.getAveragedOutlier();
				java.awt.geom.Point2D point = outlier.getPoint();
				if (list.isMultiple()) {
					drawMultipleEllipse(point, state.getBarWidth(), oRadius, g2);
				}else {
					drawEllipse(point, oRadius, g2);
				}
			}
			if (outlierListCollection.isHighFarOut()) {
				drawHighFarOut((aRadius / 2.0), g2, (xx + ((state.getBarWidth()) / 2.0)), maxAxisValue);
			}
			if (outlierListCollection.isLowFarOut()) {
				drawLowFarOut((aRadius / 2.0), g2, (xx + ((state.getBarWidth()) / 2.0)), minAxisValue);
			}
		}
		if (((state.getInfo()) != null) && (box != null)) {
			org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
			if (entities != null) {
				addEntity(entities, box, dataset, row, column, selected);
			}
		}
	}

	private void drawEllipse(java.awt.geom.Point2D point, double oRadius, java.awt.Graphics2D g2) {
		java.awt.geom.Ellipse2D dot = new java.awt.geom.Ellipse2D.Double(((point.getX()) + (oRadius / 2)), point.getY(), oRadius, oRadius);
		g2.draw(dot);
	}

	private void drawMultipleEllipse(java.awt.geom.Point2D point, double boxWidth, double oRadius, java.awt.Graphics2D g2) {
		java.awt.geom.Ellipse2D dot1 = new java.awt.geom.Ellipse2D.Double((((point.getX()) - (boxWidth / 2)) + oRadius), point.getY(), oRadius, oRadius);
		java.awt.geom.Ellipse2D dot2 = new java.awt.geom.Ellipse2D.Double(((point.getX()) + (boxWidth / 2)), point.getY(), oRadius, oRadius);
		g2.draw(dot1);
		g2.draw(dot2);
	}

	private void drawHighFarOut(double aRadius, java.awt.Graphics2D g2, double xx, double m) {
		double side = aRadius * 2;
		g2.draw(new java.awt.geom.Line2D.Double((xx - side), (m + side), (xx + side), (m + side)));
		g2.draw(new java.awt.geom.Line2D.Double((xx - side), (m + side), xx, m));
		g2.draw(new java.awt.geom.Line2D.Double((xx + side), (m + side), xx, m));
	}

	private void drawLowFarOut(double aRadius, java.awt.Graphics2D g2, double xx, double m) {
		double side = aRadius * 2;
		g2.draw(new java.awt.geom.Line2D.Double((xx - side), (m - side), (xx + side), (m - side)));
		g2.draw(new java.awt.geom.Line2D.Double((xx - side), (m - side), xx, m));
		g2.draw(new java.awt.geom.Line2D.Double((xx + side), (m - side), xx, m));
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.category.BoxAndWhiskerRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.category.BoxAndWhiskerRenderer that = ((org.jfree.chart.renderer.category.BoxAndWhiskerRenderer) (obj));
		if ((org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.fillBox) != (that.fillBox)) {
			return false;
		}
		if ((org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.itemMargin) != (that.itemMargin)) {
			return false;
		}
		if ((org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.maximumBarWidth) != (that.maximumBarWidth)) {
			return false;
		}
		if ((org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.meanVisible) != (that.meanVisible)) {
			return false;
		}
		if ((org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.medianVisible) != (that.medianVisible)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.artifactPaint, that.artifactPaint))) {
			return false;
		}
		return super.equals(obj);
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.artifactPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.renderer.category.BoxAndWhiskerRenderer.this.artifactPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}

