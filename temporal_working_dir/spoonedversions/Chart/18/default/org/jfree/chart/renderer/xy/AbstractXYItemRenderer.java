

package org.jfree.chart.renderer.xy;


public abstract class AbstractXYItemRenderer extends org.jfree.chart.renderer.AbstractRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.renderer.xy.XYItemRenderer {
	private static final long serialVersionUID = 8019124836026607990L;

	private org.jfree.chart.plot.XYPlot plot;

	private org.jfree.chart.util.ObjectList itemLabelGeneratorList;

	private org.jfree.chart.labels.XYItemLabelGenerator baseItemLabelGenerator;

	private org.jfree.chart.util.ObjectList toolTipGeneratorList;

	private org.jfree.chart.labels.XYToolTipGenerator baseToolTipGenerator;

	private org.jfree.chart.util.ObjectList urlGeneratorList;

	private org.jfree.chart.urls.XYURLGenerator baseURLGenerator;

	private java.util.List backgroundAnnotations;

	private java.util.List foregroundAnnotations;

	private int defaultEntityRadius;

	private org.jfree.chart.labels.XYSeriesLabelGenerator legendItemLabelGenerator;

	private org.jfree.chart.labels.XYSeriesLabelGenerator legendItemToolTipGenerator;

	private org.jfree.chart.labels.XYSeriesLabelGenerator legendItemURLGenerator;

	protected AbstractXYItemRenderer() {
		super();
		org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.itemLabelGeneratorList = new org.jfree.chart.util.ObjectList();
		org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.toolTipGeneratorList = new org.jfree.chart.util.ObjectList();
		org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.urlGeneratorList = new org.jfree.chart.util.ObjectList();
		org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.baseURLGenerator = null;
		org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.backgroundAnnotations = new java.util.ArrayList();
		org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.foregroundAnnotations = new java.util.ArrayList();
		org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.defaultEntityRadius = 3;
		org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.legendItemLabelGenerator = new org.jfree.chart.labels.StandardXYSeriesLabelGenerator("{0}");
	}

	public int getPassCount() {
		return 1;
	}

	public org.jfree.chart.plot.XYPlot getPlot() {
		return org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.plot;
	}

	public void setPlot(org.jfree.chart.plot.XYPlot plot) {
		org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.plot = plot;
	}

	public org.jfree.chart.renderer.xy.XYItemRendererState initialise(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.XYPlot plot, org.jfree.data.xy.XYDataset data, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.renderer.xy.XYItemRendererState state = new org.jfree.chart.renderer.xy.XYItemRendererState(info);
		return state;
	}

	public org.jfree.chart.labels.XYItemLabelGenerator getItemLabelGenerator(int series, int item) {
		org.jfree.chart.labels.XYItemLabelGenerator generator = ((org.jfree.chart.labels.XYItemLabelGenerator) (org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.itemLabelGeneratorList.get(series)));
		if (generator == null) {
			generator = org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.baseItemLabelGenerator;
		}
		return generator;
	}

	public org.jfree.chart.labels.XYItemLabelGenerator getSeriesItemLabelGenerator(int series) {
		return ((org.jfree.chart.labels.XYItemLabelGenerator) (org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.itemLabelGeneratorList.get(series)));
	}

	public void setSeriesItemLabelGenerator(int series, org.jfree.chart.labels.XYItemLabelGenerator generator) {
		org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.itemLabelGeneratorList.set(series, generator);
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this));
	}

	public void setSeriesItemLabelGenerator(int series, org.jfree.chart.labels.XYItemLabelGenerator generator, boolean notify) {
		org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.itemLabelGeneratorList.set(series, generator);
		if (notify) {
			notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this));
		}
	}

	public org.jfree.chart.labels.XYItemLabelGenerator getBaseItemLabelGenerator() {
		return org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.baseItemLabelGenerator;
	}

	public void setBaseItemLabelGenerator(org.jfree.chart.labels.XYItemLabelGenerator generator) {
		setBaseItemLabelGenerator(generator, true);
	}

	public void setBaseItemLabelGenerator(org.jfree.chart.labels.XYItemLabelGenerator generator, boolean notify) {
		org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.baseItemLabelGenerator = generator;
		if (notify) {
			notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this));
		}
	}

	public org.jfree.chart.labels.XYToolTipGenerator getToolTipGenerator(int series, int item) {
		org.jfree.chart.labels.XYToolTipGenerator generator = ((org.jfree.chart.labels.XYToolTipGenerator) (org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.toolTipGeneratorList.get(series)));
		if (generator == null) {
			generator = org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.baseToolTipGenerator;
		}
		return generator;
	}

	public org.jfree.chart.labels.XYToolTipGenerator getSeriesToolTipGenerator(int series) {
		return ((org.jfree.chart.labels.XYToolTipGenerator) (org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.toolTipGeneratorList.get(series)));
	}

	public void setSeriesToolTipGenerator(int series, org.jfree.chart.labels.XYToolTipGenerator generator) {
		setSeriesToolTipGenerator(series, generator, true);
	}

	public void setSeriesToolTipGenerator(int series, org.jfree.chart.labels.XYToolTipGenerator generator, boolean notify) {
		org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.toolTipGeneratorList.set(series, generator);
		if (notify) {
			notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this));
		}
	}

	public org.jfree.chart.labels.XYToolTipGenerator getBaseToolTipGenerator() {
		return org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.baseToolTipGenerator;
	}

	public void setBaseToolTipGenerator(org.jfree.chart.labels.XYToolTipGenerator generator) {
		setBaseToolTipGenerator(generator, true);
	}

	public void setBaseToolTipGenerator(org.jfree.chart.labels.XYToolTipGenerator generator, boolean notify) {
		org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.baseToolTipGenerator = generator;
		if (notify) {
			notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this));
		}
	}

	public org.jfree.chart.urls.XYURLGenerator getURLGenerator(int series, int item) {
		org.jfree.chart.urls.XYURLGenerator generator = ((org.jfree.chart.urls.XYURLGenerator) (org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.urlGeneratorList.get(series)));
		if (generator == null) {
			generator = org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.baseURLGenerator;
		}
		return generator;
	}

	public org.jfree.chart.urls.XYURLGenerator getSeriesURLGenerator(int series) {
		return ((org.jfree.chart.urls.XYURLGenerator) (org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.urlGeneratorList.get(series)));
	}

	public void setSeriesURLGenerator(int series, org.jfree.chart.urls.XYURLGenerator generator) {
		setSeriesURLGenerator(series, generator, true);
	}

	public void setSeriesURLGenerator(int series, org.jfree.chart.urls.XYURLGenerator generator, boolean notify) {
		org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.toolTipGeneratorList.set(series, generator);
		if (notify) {
			notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this));
		}
	}

	public org.jfree.chart.urls.XYURLGenerator getBaseURLGenerator() {
		return org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.baseURLGenerator;
	}

	public void setBaseURLGenerator(org.jfree.chart.urls.XYURLGenerator generator) {
		setBaseURLGenerator(generator, true);
	}

	public void setBaseURLGenerator(org.jfree.chart.urls.XYURLGenerator generator, boolean notify) {
		org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.baseURLGenerator = generator;
		if (notify) {
			notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this));
		}
	}

	public void addAnnotation(org.jfree.chart.annotations.XYAnnotation annotation) {
		addAnnotation(annotation, org.jfree.chart.util.Layer.FOREGROUND);
	}

	public void addAnnotation(org.jfree.chart.annotations.XYAnnotation annotation, org.jfree.chart.util.Layer layer) {
		if (annotation == null) {
			throw new java.lang.IllegalArgumentException("Null 'annotation' argument.");
		}
		if (layer.equals(org.jfree.chart.util.Layer.FOREGROUND)) {
			org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.foregroundAnnotations.add(annotation);
			notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this));
		}else
			if (layer.equals(org.jfree.chart.util.Layer.BACKGROUND)) {
				org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.backgroundAnnotations.add(annotation);
				notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this));
			}else {
				throw new java.lang.RuntimeException("Unknown layer.");
			}
		
	}

	public boolean removeAnnotation(org.jfree.chart.annotations.XYAnnotation annotation) {
		boolean removed = org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.foregroundAnnotations.remove(annotation);
		removed = removed & (org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.backgroundAnnotations.remove(annotation));
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this));
		return removed;
	}

	public void removeAnnotations() {
		org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.foregroundAnnotations.clear();
		org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.backgroundAnnotations.clear();
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this));
	}

	public int getDefaultEntityRadius() {
		return org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.defaultEntityRadius;
	}

	public void setDefaultEntityRadius(int radius) {
		org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.defaultEntityRadius = radius;
	}

	public org.jfree.chart.labels.XYSeriesLabelGenerator getLegendItemLabelGenerator() {
		return org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.legendItemLabelGenerator;
	}

	public void setLegendItemLabelGenerator(org.jfree.chart.labels.XYSeriesLabelGenerator generator) {
		if (generator == null) {
			throw new java.lang.IllegalArgumentException("Null 'generator' argument.");
		}
		org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.legendItemLabelGenerator = generator;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this));
	}

	public org.jfree.chart.labels.XYSeriesLabelGenerator getLegendItemToolTipGenerator() {
		return org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.legendItemToolTipGenerator;
	}

	public void setLegendItemToolTipGenerator(org.jfree.chart.labels.XYSeriesLabelGenerator generator) {
		org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.legendItemToolTipGenerator = generator;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this));
	}

	public org.jfree.chart.labels.XYSeriesLabelGenerator getLegendItemURLGenerator() {
		return org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.legendItemURLGenerator;
	}

	public void setLegendItemURLGenerator(org.jfree.chart.labels.XYSeriesLabelGenerator generator) {
		org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.legendItemURLGenerator = generator;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this));
	}

	public org.jfree.data.Range findDomainBounds(org.jfree.data.xy.XYDataset dataset) {
		if (dataset != null) {
			return org.jfree.data.general.DatasetUtilities.findDomainBounds(dataset, false);
		}else {
			return null;
		}
	}

	public org.jfree.data.Range findRangeBounds(org.jfree.data.xy.XYDataset dataset) {
		if (dataset != null) {
			return org.jfree.data.general.DatasetUtilities.findRangeBounds(dataset, false);
		}else {
			return null;
		}
	}

	public org.jfree.chart.LegendItemCollection getLegendItems() {
		if ((org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.plot) == null) {
			return new org.jfree.chart.LegendItemCollection();
		}
		org.jfree.chart.LegendItemCollection result = new org.jfree.chart.LegendItemCollection();
		int index = org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.plot.getIndexOf(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this);
		org.jfree.data.xy.XYDataset dataset = org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.plot.getDataset(index);
		if (dataset != null) {
			int seriesCount = dataset.getSeriesCount();
			for (int i = 0; i < seriesCount; i++) {
				if (isSeriesVisibleInLegend(i)) {
					org.jfree.chart.LegendItem item = getLegendItem(index, i);
					if (item != null) {
						result.add(item);
					}
				}
			}
		}
		return result;
	}

	public org.jfree.chart.LegendItem getLegendItem(int datasetIndex, int series) {
		org.jfree.chart.LegendItem result = null;
		org.jfree.chart.plot.XYPlot xyplot = getPlot();
		if (xyplot != null) {
			org.jfree.data.xy.XYDataset dataset = xyplot.getDataset(datasetIndex);
			if (dataset != null) {
				java.lang.String label = org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.legendItemLabelGenerator.generateLabel(dataset, series);
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
				java.awt.Paint paint = lookupSeriesPaint(series);
				java.awt.Paint outlinePaint = lookupSeriesOutlinePaint(series);
				java.awt.Stroke outlineStroke = lookupSeriesOutlineStroke(series);
				result = new org.jfree.chart.LegendItem(label, description, toolTipText, urlText, shape, paint, outlineStroke, outlinePaint);
				result.setSeriesKey(dataset.getSeriesKey(series));
				result.setSeriesIndex(series);
				result.setDataset(dataset);
				result.setDatasetIndex(datasetIndex);
			}
		}
		return result;
	}

	public void fillDomainGridBand(java.awt.Graphics2D g2, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis axis, java.awt.geom.Rectangle2D dataArea, double start, double end) {
		double x1 = axis.valueToJava2D(start, dataArea, plot.getDomainAxisEdge());
		double x2 = axis.valueToJava2D(end, dataArea, plot.getDomainAxisEdge());
		java.awt.geom.Rectangle2D band;
		if ((plot.getOrientation()) == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
			band = new java.awt.geom.Rectangle2D.Double(java.lang.Math.min(x1, x2), dataArea.getMinY(), java.lang.Math.abs((x2 - x1)), dataArea.getWidth());
		}else {
			band = new java.awt.geom.Rectangle2D.Double(dataArea.getMinX(), java.lang.Math.min(x1, x2), dataArea.getWidth(), java.lang.Math.abs((x2 - x1)));
		}
		java.awt.Paint paint = plot.getDomainTickBandPaint();
		if (paint != null) {
			g2.setPaint(paint);
			g2.fill(band);
		}
	}

	public void fillRangeGridBand(java.awt.Graphics2D g2, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis axis, java.awt.geom.Rectangle2D dataArea, double start, double end) {
		double y1 = axis.valueToJava2D(start, dataArea, plot.getRangeAxisEdge());
		double y2 = axis.valueToJava2D(end, dataArea, plot.getRangeAxisEdge());
		java.awt.geom.Rectangle2D band;
		if ((plot.getOrientation()) == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
			band = new java.awt.geom.Rectangle2D.Double(dataArea.getMinX(), java.lang.Math.min(y1, y2), dataArea.getWidth(), java.lang.Math.abs((y2 - y1)));
		}else {
			band = new java.awt.geom.Rectangle2D.Double(java.lang.Math.min(y1, y2), dataArea.getMinY(), java.lang.Math.abs((y2 - y1)), dataArea.getHeight());
		}
		java.awt.Paint paint = plot.getRangeTickBandPaint();
		if (paint != null) {
			g2.setPaint(paint);
			g2.fill(band);
		}
	}

	public void drawDomainLine(java.awt.Graphics2D g2, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis axis, java.awt.geom.Rectangle2D dataArea, double value, java.awt.Paint paint, java.awt.Stroke stroke) {
		org.jfree.data.Range range = axis.getRange();
		if (!(range.contains(value))) {
			return ;
		}
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		java.awt.geom.Line2D line = null;
		double v = axis.valueToJava2D(value, dataArea, plot.getDomainAxisEdge());
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			line = new java.awt.geom.Line2D.Double(dataArea.getMinX(), v, dataArea.getMaxX(), v);
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				line = new java.awt.geom.Line2D.Double(v, dataArea.getMinY(), v, dataArea.getMaxY());
			}
		
		g2.setPaint(paint);
		g2.setStroke(stroke);
		g2.draw(line);
	}

	public void drawRangeLine(java.awt.Graphics2D g2, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis axis, java.awt.geom.Rectangle2D dataArea, double value, java.awt.Paint paint, java.awt.Stroke stroke) {
		org.jfree.data.Range range = axis.getRange();
		if (!(range.contains(value))) {
			return ;
		}
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		java.awt.geom.Line2D line = null;
		double v = axis.valueToJava2D(value, dataArea, plot.getRangeAxisEdge());
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			line = new java.awt.geom.Line2D.Double(v, dataArea.getMinY(), v, dataArea.getMaxY());
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				line = new java.awt.geom.Line2D.Double(dataArea.getMinX(), v, dataArea.getMaxX(), v);
			}
		
		g2.setPaint(paint);
		g2.setStroke(stroke);
		g2.draw(line);
	}

	public void drawDomainMarker(java.awt.Graphics2D g2, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.plot.Marker marker, java.awt.geom.Rectangle2D dataArea) {
		if (marker instanceof org.jfree.chart.plot.ValueMarker) {
			org.jfree.chart.plot.ValueMarker vm = ((org.jfree.chart.plot.ValueMarker) (marker));
			double value = vm.getValue();
			org.jfree.data.Range range = domainAxis.getRange();
			if (!(range.contains(value))) {
				return ;
			}
			double v = domainAxis.valueToJava2D(value, dataArea, plot.getDomainAxisEdge());
			org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
			java.awt.geom.Line2D line = null;
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				line = new java.awt.geom.Line2D.Double(dataArea.getMinX(), v, dataArea.getMaxX(), v);
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					line = new java.awt.geom.Line2D.Double(v, dataArea.getMinY(), v, dataArea.getMaxY());
				}
			
			final java.awt.Composite originalComposite = g2.getComposite();
			g2.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, marker.getAlpha()));
			g2.setPaint(marker.getPaint());
			g2.setStroke(marker.getStroke());
			g2.draw(line);
			java.lang.String label = marker.getLabel();
			org.jfree.chart.util.RectangleAnchor anchor = marker.getLabelAnchor();
			if (label != null) {
				java.awt.Font labelFont = marker.getLabelFont();
				g2.setFont(labelFont);
				g2.setPaint(marker.getLabelPaint());
				java.awt.geom.Point2D coordinates = calculateDomainMarkerTextAnchorPoint(g2, orientation, dataArea, line.getBounds2D(), marker.getLabelOffset(), org.jfree.chart.util.LengthAdjustmentType.EXPAND, anchor);
				org.jfree.chart.text.TextUtilities.drawAlignedString(label, g2, ((float) (coordinates.getX())), ((float) (coordinates.getY())), marker.getLabelTextAnchor());
			}
			g2.setComposite(originalComposite);
		}else
			if (marker instanceof org.jfree.chart.plot.IntervalMarker) {
				org.jfree.chart.plot.IntervalMarker im = ((org.jfree.chart.plot.IntervalMarker) (marker));
				double start = im.getStartValue();
				double end = im.getEndValue();
				org.jfree.data.Range range = domainAxis.getRange();
				if (!(range.intersects(start, end))) {
					return ;
				}
				double start2d = domainAxis.valueToJava2D(start, dataArea, plot.getDomainAxisEdge());
				double end2d = domainAxis.valueToJava2D(end, dataArea, plot.getDomainAxisEdge());
				double low = java.lang.Math.min(start2d, end2d);
				double high = java.lang.Math.max(start2d, end2d);
				org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
				java.awt.geom.Rectangle2D rect = null;
				if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
					low = java.lang.Math.max(low, dataArea.getMinY());
					high = java.lang.Math.min(high, dataArea.getMaxY());
					rect = new java.awt.geom.Rectangle2D.Double(dataArea.getMinX(), low, dataArea.getWidth(), (high - low));
				}else
					if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
						low = java.lang.Math.max(low, dataArea.getMinX());
						high = java.lang.Math.min(high, dataArea.getMaxX());
						rect = new java.awt.geom.Rectangle2D.Double(low, dataArea.getMinY(), (high - low), dataArea.getHeight());
					}
				
				final java.awt.Composite originalComposite = g2.getComposite();
				g2.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, marker.getAlpha()));
				java.awt.Paint p = marker.getPaint();
				if (p instanceof java.awt.GradientPaint) {
					java.awt.GradientPaint gp = ((java.awt.GradientPaint) (p));
					org.jfree.chart.util.GradientPaintTransformer t = im.getGradientPaintTransformer();
					if (t != null) {
						gp = t.transform(gp, rect);
					}
					g2.setPaint(gp);
				}else {
					g2.setPaint(p);
				}
				g2.fill(rect);
				if (((im.getOutlinePaint()) != null) && ((im.getOutlineStroke()) != null)) {
					if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
						java.awt.geom.Line2D line = new java.awt.geom.Line2D.Double();
						double y0 = dataArea.getMinY();
						double y1 = dataArea.getMaxY();
						g2.setPaint(im.getOutlinePaint());
						g2.setStroke(im.getOutlineStroke());
						if (range.contains(start)) {
							line.setLine(start2d, y0, start2d, y1);
							g2.draw(line);
						}
						if (range.contains(end)) {
							line.setLine(end2d, y0, end2d, y1);
							g2.draw(line);
						}
					}else {
						java.awt.geom.Line2D line = new java.awt.geom.Line2D.Double();
						double x0 = dataArea.getMinX();
						double x1 = dataArea.getMaxX();
						g2.setPaint(im.getOutlinePaint());
						g2.setStroke(im.getOutlineStroke());
						if (range.contains(start)) {
							line.setLine(x0, start2d, x1, start2d);
							g2.draw(line);
						}
						if (range.contains(end)) {
							line.setLine(x0, end2d, x1, end2d);
							g2.draw(line);
						}
					}
				}
				java.lang.String label = marker.getLabel();
				org.jfree.chart.util.RectangleAnchor anchor = marker.getLabelAnchor();
				if (label != null) {
					java.awt.Font labelFont = marker.getLabelFont();
					g2.setFont(labelFont);
					g2.setPaint(marker.getLabelPaint());
					java.awt.geom.Point2D coordinates = calculateDomainMarkerTextAnchorPoint(g2, orientation, dataArea, rect, marker.getLabelOffset(), marker.getLabelOffsetType(), anchor);
					org.jfree.chart.text.TextUtilities.drawAlignedString(label, g2, ((float) (coordinates.getX())), ((float) (coordinates.getY())), marker.getLabelTextAnchor());
				}
				g2.setComposite(originalComposite);
			}
		
	}

	protected java.awt.geom.Point2D calculateDomainMarkerTextAnchorPoint(java.awt.Graphics2D g2, org.jfree.chart.plot.PlotOrientation orientation, java.awt.geom.Rectangle2D dataArea, java.awt.geom.Rectangle2D markerArea, org.jfree.chart.util.RectangleInsets markerOffset, org.jfree.chart.util.LengthAdjustmentType labelOffsetType, org.jfree.chart.util.RectangleAnchor anchor) {
		java.awt.geom.Rectangle2D anchorRect = null;
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			anchorRect = markerOffset.createAdjustedRectangle(markerArea, org.jfree.chart.util.LengthAdjustmentType.CONTRACT, labelOffsetType);
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				anchorRect = markerOffset.createAdjustedRectangle(markerArea, labelOffsetType, org.jfree.chart.util.LengthAdjustmentType.CONTRACT);
			}
		
		return org.jfree.chart.util.RectangleAnchor.coordinates(anchorRect, anchor);
	}

	public void drawRangeMarker(java.awt.Graphics2D g2, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.chart.plot.Marker marker, java.awt.geom.Rectangle2D dataArea) {
		if (marker instanceof org.jfree.chart.plot.ValueMarker) {
			org.jfree.chart.plot.ValueMarker vm = ((org.jfree.chart.plot.ValueMarker) (marker));
			double value = vm.getValue();
			org.jfree.data.Range range = rangeAxis.getRange();
			if (!(range.contains(value))) {
				return ;
			}
			double v = rangeAxis.valueToJava2D(value, dataArea, plot.getRangeAxisEdge());
			org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
			java.awt.geom.Line2D line = null;
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				line = new java.awt.geom.Line2D.Double(v, dataArea.getMinY(), v, dataArea.getMaxY());
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					line = new java.awt.geom.Line2D.Double(dataArea.getMinX(), v, dataArea.getMaxX(), v);
				}
			
			java.awt.Composite originalComposite = g2.getComposite();
			g2.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, marker.getAlpha()));
			g2.setPaint(marker.getPaint());
			g2.setStroke(marker.getStroke());
			g2.draw(line);
			java.lang.String label = marker.getLabel();
			org.jfree.chart.util.RectangleAnchor anchor = marker.getLabelAnchor();
			if (label != null) {
				java.awt.Font labelFont = marker.getLabelFont();
				g2.setFont(labelFont);
				g2.setPaint(marker.getLabelPaint());
				java.awt.geom.Point2D coordinates = calculateRangeMarkerTextAnchorPoint(g2, orientation, dataArea, line.getBounds2D(), marker.getLabelOffset(), org.jfree.chart.util.LengthAdjustmentType.EXPAND, anchor);
				org.jfree.chart.text.TextUtilities.drawAlignedString(label, g2, ((float) (coordinates.getX())), ((float) (coordinates.getY())), marker.getLabelTextAnchor());
			}
			g2.setComposite(originalComposite);
		}else
			if (marker instanceof org.jfree.chart.plot.IntervalMarker) {
				org.jfree.chart.plot.IntervalMarker im = ((org.jfree.chart.plot.IntervalMarker) (marker));
				double start = im.getStartValue();
				double end = im.getEndValue();
				org.jfree.data.Range range = rangeAxis.getRange();
				if (!(range.intersects(start, end))) {
					return ;
				}
				double start2d = rangeAxis.valueToJava2D(start, dataArea, plot.getRangeAxisEdge());
				double end2d = rangeAxis.valueToJava2D(end, dataArea, plot.getRangeAxisEdge());
				double low = java.lang.Math.min(start2d, end2d);
				double high = java.lang.Math.max(start2d, end2d);
				org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
				java.awt.geom.Rectangle2D rect = null;
				if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
					low = java.lang.Math.max(low, dataArea.getMinX());
					high = java.lang.Math.min(high, dataArea.getMaxX());
					rect = new java.awt.geom.Rectangle2D.Double(low, dataArea.getMinY(), (high - low), dataArea.getHeight());
				}else
					if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
						low = java.lang.Math.max(low, dataArea.getMinY());
						high = java.lang.Math.min(high, dataArea.getMaxY());
						rect = new java.awt.geom.Rectangle2D.Double(dataArea.getMinX(), low, dataArea.getWidth(), (high - low));
					}
				
				java.awt.Composite originalComposite = g2.getComposite();
				g2.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, marker.getAlpha()));
				java.awt.Paint p = marker.getPaint();
				if (p instanceof java.awt.GradientPaint) {
					java.awt.GradientPaint gp = ((java.awt.GradientPaint) (p));
					org.jfree.chart.util.GradientPaintTransformer t = im.getGradientPaintTransformer();
					if (t != null) {
						gp = t.transform(gp, rect);
					}
					g2.setPaint(gp);
				}else {
					g2.setPaint(p);
				}
				g2.fill(rect);
				if (((im.getOutlinePaint()) != null) && ((im.getOutlineStroke()) != null)) {
					if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
						java.awt.geom.Line2D line = new java.awt.geom.Line2D.Double();
						double x0 = dataArea.getMinX();
						double x1 = dataArea.getMaxX();
						g2.setPaint(im.getOutlinePaint());
						g2.setStroke(im.getOutlineStroke());
						if (range.contains(start)) {
							line.setLine(x0, start2d, x1, start2d);
							g2.draw(line);
						}
						if (range.contains(end)) {
							line.setLine(x0, end2d, x1, end2d);
							g2.draw(line);
						}
					}else {
						java.awt.geom.Line2D line = new java.awt.geom.Line2D.Double();
						double y0 = dataArea.getMinY();
						double y1 = dataArea.getMaxY();
						g2.setPaint(im.getOutlinePaint());
						g2.setStroke(im.getOutlineStroke());
						if (range.contains(start)) {
							line.setLine(start2d, y0, start2d, y1);
							g2.draw(line);
						}
						if (range.contains(end)) {
							line.setLine(end2d, y0, end2d, y1);
							g2.draw(line);
						}
					}
				}
				java.lang.String label = marker.getLabel();
				org.jfree.chart.util.RectangleAnchor anchor = marker.getLabelAnchor();
				if (label != null) {
					java.awt.Font labelFont = marker.getLabelFont();
					g2.setFont(labelFont);
					g2.setPaint(marker.getLabelPaint());
					java.awt.geom.Point2D coordinates = calculateRangeMarkerTextAnchorPoint(g2, orientation, dataArea, rect, marker.getLabelOffset(), marker.getLabelOffsetType(), anchor);
					org.jfree.chart.text.TextUtilities.drawAlignedString(label, g2, ((float) (coordinates.getX())), ((float) (coordinates.getY())), marker.getLabelTextAnchor());
				}
				g2.setComposite(originalComposite);
			}
		
	}

	private java.awt.geom.Point2D calculateRangeMarkerTextAnchorPoint(java.awt.Graphics2D g2, org.jfree.chart.plot.PlotOrientation orientation, java.awt.geom.Rectangle2D dataArea, java.awt.geom.Rectangle2D markerArea, org.jfree.chart.util.RectangleInsets markerOffset, org.jfree.chart.util.LengthAdjustmentType labelOffsetForRange, org.jfree.chart.util.RectangleAnchor anchor) {
		java.awt.geom.Rectangle2D anchorRect = null;
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			anchorRect = markerOffset.createAdjustedRectangle(markerArea, labelOffsetForRange, org.jfree.chart.util.LengthAdjustmentType.CONTRACT);
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				anchorRect = markerOffset.createAdjustedRectangle(markerArea, org.jfree.chart.util.LengthAdjustmentType.CONTRACT, labelOffsetForRange);
			}
		
		return org.jfree.chart.util.RectangleAnchor.coordinates(anchorRect, anchor);
	}

	protected java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.renderer.xy.AbstractXYItemRenderer clone = ((org.jfree.chart.renderer.xy.AbstractXYItemRenderer) (super.clone()));
		clone.itemLabelGeneratorList = ((org.jfree.chart.util.ObjectList) (org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.itemLabelGeneratorList.clone()));
		if (((org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.baseItemLabelGenerator) != null) && ((org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.baseItemLabelGenerator) instanceof org.jfree.chart.util.PublicCloneable)) {
			org.jfree.chart.util.PublicCloneable pc = ((org.jfree.chart.util.PublicCloneable) (org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.baseItemLabelGenerator));
			clone.baseItemLabelGenerator = ((org.jfree.chart.labels.XYItemLabelGenerator) (pc.clone()));
		}
		clone.toolTipGeneratorList = ((org.jfree.chart.util.ObjectList) (org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.toolTipGeneratorList.clone()));
		if (((org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.baseToolTipGenerator) != null) && ((org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.baseToolTipGenerator) instanceof org.jfree.chart.util.PublicCloneable)) {
			org.jfree.chart.util.PublicCloneable pc = ((org.jfree.chart.util.PublicCloneable) (org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.baseToolTipGenerator));
			clone.baseToolTipGenerator = ((org.jfree.chart.labels.XYToolTipGenerator) (pc.clone()));
		}
		if ((clone.legendItemLabelGenerator) instanceof org.jfree.chart.util.PublicCloneable) {
			clone.legendItemLabelGenerator = ((org.jfree.chart.labels.XYSeriesLabelGenerator) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.legendItemLabelGenerator)));
		}
		if ((clone.legendItemToolTipGenerator) instanceof org.jfree.chart.util.PublicCloneable) {
			clone.legendItemToolTipGenerator = ((org.jfree.chart.labels.XYSeriesLabelGenerator) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.legendItemToolTipGenerator)));
		}
		if ((clone.legendItemURLGenerator) instanceof org.jfree.chart.util.PublicCloneable) {
			clone.legendItemURLGenerator = ((org.jfree.chart.labels.XYSeriesLabelGenerator) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.legendItemURLGenerator)));
		}
		clone.foregroundAnnotations = ((java.util.List) (org.jfree.chart.util.ObjectUtilities.deepClone(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.foregroundAnnotations)));
		clone.backgroundAnnotations = ((java.util.List) (org.jfree.chart.util.ObjectUtilities.deepClone(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.backgroundAnnotations)));
		if ((clone.legendItemLabelGenerator) instanceof org.jfree.chart.util.PublicCloneable) {
			clone.legendItemLabelGenerator = ((org.jfree.chart.labels.XYSeriesLabelGenerator) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.legendItemLabelGenerator)));
		}
		if ((clone.legendItemToolTipGenerator) instanceof org.jfree.chart.util.PublicCloneable) {
			clone.legendItemToolTipGenerator = ((org.jfree.chart.labels.XYSeriesLabelGenerator) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.legendItemToolTipGenerator)));
		}
		if ((clone.legendItemURLGenerator) instanceof org.jfree.chart.util.PublicCloneable) {
			clone.legendItemURLGenerator = ((org.jfree.chart.labels.XYSeriesLabelGenerator) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.legendItemURLGenerator)));
		}
		return clone;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.xy.AbstractXYItemRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.xy.AbstractXYItemRenderer that = ((org.jfree.chart.renderer.xy.AbstractXYItemRenderer) (obj));
		if (!(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.itemLabelGeneratorList.equals(that.itemLabelGeneratorList))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.baseItemLabelGenerator, that.baseItemLabelGenerator))) {
			return false;
		}
		if (!(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.toolTipGeneratorList.equals(that.toolTipGeneratorList))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.baseToolTipGenerator, that.baseToolTipGenerator))) {
			return false;
		}
		if (!(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.urlGeneratorList.equals(that.urlGeneratorList))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.baseURLGenerator, that.baseURLGenerator))) {
			return false;
		}
		if (!(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.foregroundAnnotations.equals(that.foregroundAnnotations))) {
			return false;
		}
		if (!(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.backgroundAnnotations.equals(that.backgroundAnnotations))) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.defaultEntityRadius) != (that.defaultEntityRadius)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.legendItemLabelGenerator, that.legendItemLabelGenerator))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.legendItemToolTipGenerator, that.legendItemToolTipGenerator))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.legendItemURLGenerator, that.legendItemURLGenerator))) {
			return false;
		}
		return super.equals(obj);
	}

	public org.jfree.chart.plot.DrawingSupplier getDrawingSupplier() {
		org.jfree.chart.plot.DrawingSupplier result = null;
		org.jfree.chart.plot.XYPlot p = getPlot();
		if (p != null) {
			result = p.getDrawingSupplier();
		}
		return result;
	}

	protected void updateCrosshairValues(org.jfree.chart.plot.CrosshairState crosshairState, double x, double y, int domainAxisIndex, int rangeAxisIndex, double transX, double transY, org.jfree.chart.plot.PlotOrientation orientation) {
		if (orientation == null) {
			throw new java.lang.IllegalArgumentException("Null 'orientation' argument.");
		}
		if (crosshairState != null) {
			if (org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.plot.isDomainCrosshairLockedOnData()) {
				if (org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.plot.isRangeCrosshairLockedOnData()) {
					crosshairState.updateCrosshairPoint(x, y, domainAxisIndex, rangeAxisIndex, transX, transY, orientation);
				}else {
					crosshairState.updateCrosshairX(x, domainAxisIndex);
				}
			}else {
				if (org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.plot.isRangeCrosshairLockedOnData()) {
					crosshairState.updateCrosshairY(y, rangeAxisIndex);
				}
			}
		}
	}

	protected void drawItemLabel(java.awt.Graphics2D g2, org.jfree.chart.plot.PlotOrientation orientation, org.jfree.data.xy.XYDataset dataset, int series, int item, double x, double y, boolean negative) {
		org.jfree.chart.labels.XYItemLabelGenerator generator = getItemLabelGenerator(series, item);
		if (generator != null) {
			java.awt.Font labelFont = getItemLabelFont(series, item);
			java.awt.Paint paint = getItemLabelPaint(series, item);
			g2.setFont(labelFont);
			g2.setPaint(paint);
			java.lang.String label = generator.generateLabel(dataset, series, item);
			org.jfree.chart.labels.ItemLabelPosition position = null;
			if (!negative) {
				position = getPositiveItemLabelPosition(series, item);
			}else {
				position = getNegativeItemLabelPosition(series, item);
			}
			java.awt.geom.Point2D anchorPoint = calculateLabelAnchorPoint(position.getItemLabelAnchor(), x, y, orientation);
			org.jfree.chart.text.TextUtilities.drawRotatedString(label, g2, ((float) (anchorPoint.getX())), ((float) (anchorPoint.getY())), position.getTextAnchor(), position.getAngle(), position.getRotationAnchor());
		}
	}

	public void drawAnnotations(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.chart.util.Layer layer, org.jfree.chart.plot.PlotRenderingInfo info) {
		java.util.Iterator iterator = null;
		if (layer.equals(org.jfree.chart.util.Layer.FOREGROUND)) {
			iterator = org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.foregroundAnnotations.iterator();
		}else
			if (layer.equals(org.jfree.chart.util.Layer.BACKGROUND)) {
				iterator = org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.backgroundAnnotations.iterator();
			}else {
				throw new java.lang.RuntimeException("Unknown layer.");
			}
		
		while (iterator.hasNext()) {
			org.jfree.chart.annotations.XYAnnotation annotation = ((org.jfree.chart.annotations.XYAnnotation) (iterator.next()));
			annotation.draw(g2, org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.plot, dataArea, domainAxis, rangeAxis, 0, info);
		} 
	}

	protected void addEntity(org.jfree.chart.entity.EntityCollection entities, java.awt.Shape area, org.jfree.data.xy.XYDataset dataset, int series, int item, double entityX, double entityY) {
		if (!(getItemCreateEntity(series, item))) {
			return ;
		}
		if (area == null) {
			area = new java.awt.geom.Ellipse2D.Double((entityX - (org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.defaultEntityRadius)), (entityY - (org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.defaultEntityRadius)), ((org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.defaultEntityRadius) * 2), ((org.jfree.chart.renderer.xy.AbstractXYItemRenderer.this.defaultEntityRadius) * 2));
		}
		java.lang.String tip = null;
		org.jfree.chart.labels.XYToolTipGenerator generator = getToolTipGenerator(series, item);
		if (generator != null) {
			tip = generator.generateToolTip(dataset, series, item);
		}
		java.lang.String url = null;
		org.jfree.chart.urls.XYURLGenerator urlster = getURLGenerator(series, item);
		if (urlster != null) {
			url = urlster.generateURL(dataset, series, item);
		}
		org.jfree.chart.entity.XYItemEntity entity = new org.jfree.chart.entity.XYItemEntity(area, dataset, series, item, tip, url);
		entities.add(entity);
	}
}

