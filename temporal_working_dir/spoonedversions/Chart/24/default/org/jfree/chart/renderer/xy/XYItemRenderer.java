

package org.jfree.chart.renderer.xy;


public interface XYItemRenderer extends org.jfree.chart.LegendItemSource {
	public org.jfree.chart.plot.XYPlot getPlot();

	public void setPlot(org.jfree.chart.plot.XYPlot plot);

	public int getPassCount();

	public org.jfree.data.Range findDomainBounds(org.jfree.data.xy.XYDataset dataset);

	public org.jfree.data.Range findRangeBounds(org.jfree.data.xy.XYDataset dataset);

	public void addChangeListener(org.jfree.chart.event.RendererChangeListener listener);

	public void removeChangeListener(org.jfree.chart.event.RendererChangeListener listener);

	public boolean getItemVisible(int series, int item);

	public boolean isSeriesVisible(int series);

	public java.lang.Boolean getSeriesVisible(int series);

	public void setSeriesVisible(int series, java.lang.Boolean visible);

	public void setSeriesVisible(int series, java.lang.Boolean visible, boolean notify);

	public boolean getBaseSeriesVisible();

	public void setBaseSeriesVisible(boolean visible);

	public void setBaseSeriesVisible(boolean visible, boolean notify);

	public boolean isSeriesVisibleInLegend(int series);

	public java.lang.Boolean getSeriesVisibleInLegend(int series);

	public void setSeriesVisibleInLegend(int series, java.lang.Boolean visible);

	public void setSeriesVisibleInLegend(int series, java.lang.Boolean visible, boolean notify);

	public boolean getBaseSeriesVisibleInLegend();

	public void setBaseSeriesVisibleInLegend(boolean visible);

	public void setBaseSeriesVisibleInLegend(boolean visible, boolean notify);

	public java.awt.Paint getItemPaint(int row, int column);

	public java.awt.Paint getSeriesPaint(int series);

	public void setSeriesPaint(int series, java.awt.Paint paint);

	public void setSeriesPaint(int series, java.awt.Paint paint, boolean notify);

	public java.awt.Paint getBasePaint();

	public void setBasePaint(java.awt.Paint paint);

	public void setBasePaint(java.awt.Paint paint, boolean notify);

	public java.awt.Paint getItemFillPaint(int row, int column);

	public java.awt.Paint getSeriesFillPaint(int series);

	public void setSeriesFillPaint(int series, java.awt.Paint paint);

	public void setSeriesFillPaint(int series, java.awt.Paint paint, boolean notify);

	public java.awt.Paint getBaseFillPaint();

	public void setBaseFillPaint(java.awt.Paint paint);

	public void setBaseFillPaint(java.awt.Paint paint, boolean notify);

	public java.awt.Paint getItemOutlinePaint(int row, int column);

	public java.awt.Paint getSeriesOutlinePaint(int series);

	public void setSeriesOutlinePaint(int series, java.awt.Paint paint);

	public void setSeriesOutlinePaint(int series, java.awt.Paint paint, boolean notify);

	public java.awt.Paint getBaseOutlinePaint();

	public void setBaseOutlinePaint(java.awt.Paint paint);

	public void setBaseOutlinePaint(java.awt.Paint paint, boolean notify);

	public java.awt.Stroke getItemStroke(int row, int column);

	public java.awt.Stroke getSeriesStroke(int series);

	public void setSeriesStroke(int series, java.awt.Stroke stroke);

	public void setSeriesStroke(int series, java.awt.Stroke stroke, boolean notify);

	public java.awt.Stroke getBaseStroke();

	public void setBaseStroke(java.awt.Stroke stroke);

	public void setBaseStroke(java.awt.Stroke stroke, boolean notify);

	public java.awt.Stroke getItemOutlineStroke(int row, int column);

	public java.awt.Stroke getSeriesOutlineStroke(int series);

	public void setSeriesOutlineStroke(int series, java.awt.Stroke stroke);

	public void setSeriesOutlineStroke(int series, java.awt.Stroke stroke, boolean notify);

	public java.awt.Stroke getBaseOutlineStroke();

	public void setBaseOutlineStroke(java.awt.Stroke stroke);

	public void setBaseOutlineStroke(java.awt.Stroke stroke, boolean notify);

	public java.awt.Shape getItemShape(int row, int column);

	public java.awt.Shape getSeriesShape(int series);

	public void setSeriesShape(int series, java.awt.Shape shape);

	public void setSeriesShape(int series, java.awt.Shape shape, boolean notify);

	public java.awt.Shape getBaseShape();

	public void setBaseShape(java.awt.Shape shape);

	public void setBaseShape(java.awt.Shape shape, boolean notify);

	public org.jfree.chart.LegendItem getLegendItem(int datasetIndex, int series);

	public org.jfree.chart.labels.XYSeriesLabelGenerator getLegendItemLabelGenerator();

	public void setLegendItemLabelGenerator(org.jfree.chart.labels.XYSeriesLabelGenerator generator);

	public org.jfree.chart.labels.XYSeriesLabelGenerator getLegendItemToolTipGenerator();

	public void setLegendItemToolTipGenerator(org.jfree.chart.labels.XYSeriesLabelGenerator generator);

	public org.jfree.chart.labels.XYSeriesLabelGenerator getLegendItemURLGenerator();

	public void setLegendItemURLGenerator(org.jfree.chart.labels.XYSeriesLabelGenerator generator);

	public org.jfree.chart.labels.XYToolTipGenerator getToolTipGenerator(int row, int column);

	public org.jfree.chart.labels.XYToolTipGenerator getSeriesToolTipGenerator(int series);

	public void setSeriesToolTipGenerator(int series, org.jfree.chart.labels.XYToolTipGenerator generator);

	public void setSeriesToolTipGenerator(int series, org.jfree.chart.labels.XYToolTipGenerator generator, boolean notify);

	public org.jfree.chart.labels.XYToolTipGenerator getBaseToolTipGenerator();

	public void setBaseToolTipGenerator(org.jfree.chart.labels.XYToolTipGenerator generator);

	public void setBaseToolTipGenerator(org.jfree.chart.labels.XYToolTipGenerator generator, boolean notify);

	public org.jfree.chart.urls.XYURLGenerator getURLGenerator(int series, int item);

	public org.jfree.chart.urls.XYURLGenerator getSeriesURLGenerator(int series);

	public void setSeriesURLGenerator(int series, org.jfree.chart.urls.XYURLGenerator generator);

	public void setSeriesURLGenerator(int series, org.jfree.chart.urls.XYURLGenerator generator, boolean notify);

	public org.jfree.chart.urls.XYURLGenerator getBaseURLGenerator();

	public void setBaseURLGenerator(org.jfree.chart.urls.XYURLGenerator generator);

	public void setBaseURLGenerator(org.jfree.chart.urls.XYURLGenerator generator, boolean notify);

	public boolean isItemLabelVisible(int row, int column);

	public boolean isSeriesItemLabelsVisible(int series);

	public java.lang.Boolean getSeriesItemLabelsVisible(int series);

	public void setSeriesItemLabelsVisible(int series, boolean visible);

	public void setSeriesItemLabelsVisible(int series, java.lang.Boolean visible);

	public void setSeriesItemLabelsVisible(int series, java.lang.Boolean visible, boolean notify);

	public boolean getBaseItemLabelsVisible();

	public void setBaseItemLabelsVisible(boolean visible);

	public void setBaseItemLabelsVisible(boolean visible, boolean notify);

	public org.jfree.chart.labels.XYItemLabelGenerator getItemLabelGenerator(int row, int column);

	public org.jfree.chart.labels.XYItemLabelGenerator getSeriesItemLabelGenerator(int series);

	public void setSeriesItemLabelGenerator(int series, org.jfree.chart.labels.XYItemLabelGenerator generator);

	public void setSeriesItemLabelGenerator(int series, org.jfree.chart.labels.XYItemLabelGenerator generator, boolean notify);

	public org.jfree.chart.labels.XYItemLabelGenerator getBaseItemLabelGenerator();

	public void setBaseItemLabelGenerator(org.jfree.chart.labels.XYItemLabelGenerator generator);

	public void setBaseItemLabelGenerator(org.jfree.chart.labels.XYItemLabelGenerator generator, boolean notify);

	public java.awt.Font getItemLabelFont(int row, int column);

	public java.awt.Font getSeriesItemLabelFont(int series);

	public void setSeriesItemLabelFont(int series, java.awt.Font font);

	public void setSeriesItemLabelFont(int series, java.awt.Font font, boolean notify);

	public java.awt.Font getBaseItemLabelFont();

	public void setBaseItemLabelFont(java.awt.Font font);

	public void setBaseItemLabelFont(java.awt.Font font, boolean notify);

	public java.awt.Paint getItemLabelPaint(int row, int column);

	public java.awt.Paint getSeriesItemLabelPaint(int series);

	public void setSeriesItemLabelPaint(int series, java.awt.Paint paint);

	public void setSeriesItemLabelPaint(int series, java.awt.Paint paint, boolean notify);

	public java.awt.Paint getBaseItemLabelPaint();

	public void setBaseItemLabelPaint(java.awt.Paint paint);

	public void setBaseItemLabelPaint(java.awt.Paint paint, boolean notify);

	public org.jfree.chart.labels.ItemLabelPosition getPositiveItemLabelPosition(int row, int column);

	public org.jfree.chart.labels.ItemLabelPosition getSeriesPositiveItemLabelPosition(int series);

	public void setSeriesPositiveItemLabelPosition(int series, org.jfree.chart.labels.ItemLabelPosition position);

	public void setSeriesPositiveItemLabelPosition(int series, org.jfree.chart.labels.ItemLabelPosition position, boolean notify);

	public org.jfree.chart.labels.ItemLabelPosition getBasePositiveItemLabelPosition();

	public void setBasePositiveItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition position);

	public void setBasePositiveItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition position, boolean notify);

	public org.jfree.chart.labels.ItemLabelPosition getNegativeItemLabelPosition(int row, int column);

	public org.jfree.chart.labels.ItemLabelPosition getSeriesNegativeItemLabelPosition(int series);

	public void setSeriesNegativeItemLabelPosition(int series, org.jfree.chart.labels.ItemLabelPosition position);

	public void setSeriesNegativeItemLabelPosition(int series, org.jfree.chart.labels.ItemLabelPosition position, boolean notify);

	public org.jfree.chart.labels.ItemLabelPosition getBaseNegativeItemLabelPosition();

	public void setBaseNegativeItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition position);

	public void setBaseNegativeItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition position, boolean notify);

	public boolean getItemCreateEntity(int series, int item);

	public java.lang.Boolean getSeriesCreateEntities(int series);

	public void setSeriesCreateEntities(int series, java.lang.Boolean create);

	public void setSeriesCreateEntities(int series, java.lang.Boolean create, boolean notify);

	public boolean getBaseCreateEntities();

	public void setBaseCreateEntities(boolean create);

	public void setBaseCreateEntities(boolean create, boolean notify);

	public void addAnnotation(org.jfree.chart.annotations.XYAnnotation annotation);

	public void addAnnotation(org.jfree.chart.annotations.XYAnnotation annotation, org.jfree.chart.util.Layer layer);

	public boolean removeAnnotation(org.jfree.chart.annotations.XYAnnotation annotation);

	public void removeAnnotations();

	public void drawAnnotations(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.chart.util.Layer layer, org.jfree.chart.plot.PlotRenderingInfo info);

	public org.jfree.chart.renderer.xy.XYItemRendererState initialise(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.XYPlot plot, org.jfree.data.xy.XYDataset dataset, org.jfree.chart.plot.PlotRenderingInfo info);

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PlotRenderingInfo info, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.xy.XYDataset dataset, int series, int item, org.jfree.chart.plot.CrosshairState crosshairState, int pass);

	public void fillDomainGridBand(java.awt.Graphics2D g2, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis axis, java.awt.geom.Rectangle2D dataArea, double start, double end);

	public void fillRangeGridBand(java.awt.Graphics2D g2, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis axis, java.awt.geom.Rectangle2D dataArea, double start, double end);

	public void drawDomainLine(java.awt.Graphics2D g2, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis axis, java.awt.geom.Rectangle2D dataArea, double value, java.awt.Paint paint, java.awt.Stroke stroke);

	public void drawRangeLine(java.awt.Graphics2D g2, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis axis, java.awt.geom.Rectangle2D dataArea, double value, java.awt.Paint paint, java.awt.Stroke stroke);

	public void drawDomainMarker(java.awt.Graphics2D g2, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis axis, org.jfree.chart.plot.Marker marker, java.awt.geom.Rectangle2D dataArea);

	public void drawRangeMarker(java.awt.Graphics2D g2, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis axis, org.jfree.chart.plot.Marker marker, java.awt.geom.Rectangle2D dataArea);
}

