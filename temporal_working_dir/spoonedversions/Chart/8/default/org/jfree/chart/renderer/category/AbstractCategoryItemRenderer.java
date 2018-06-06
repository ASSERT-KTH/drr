

package org.jfree.chart.renderer.category;


public abstract class AbstractCategoryItemRenderer extends org.jfree.chart.renderer.AbstractRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.renderer.category.CategoryItemRenderer , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 1247553218442497391L;

	private org.jfree.chart.plot.CategoryPlot plot;

	private org.jfree.chart.util.ObjectList itemLabelGeneratorList;

	private org.jfree.chart.labels.CategoryItemLabelGenerator baseItemLabelGenerator;

	private org.jfree.chart.util.ObjectList toolTipGeneratorList;

	private org.jfree.chart.labels.CategoryToolTipGenerator baseToolTipGenerator;

	private org.jfree.chart.util.ObjectList urlGeneratorList;

	private org.jfree.chart.urls.CategoryURLGenerator baseURLGenerator;

	private org.jfree.chart.labels.CategorySeriesLabelGenerator legendItemLabelGenerator;

	private org.jfree.chart.labels.CategorySeriesLabelGenerator legendItemToolTipGenerator;

	private org.jfree.chart.labels.CategorySeriesLabelGenerator legendItemURLGenerator;

	private java.util.List backgroundAnnotations;

	private java.util.List foregroundAnnotations;

	private transient int rowCount;

	private transient int columnCount;

	protected AbstractCategoryItemRenderer() {
		org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.itemLabelGeneratorList = new org.jfree.chart.util.ObjectList();
		org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.toolTipGeneratorList = new org.jfree.chart.util.ObjectList();
		org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.urlGeneratorList = new org.jfree.chart.util.ObjectList();
		org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.legendItemLabelGenerator = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator();
		org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.backgroundAnnotations = new java.util.ArrayList();
		org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.foregroundAnnotations = new java.util.ArrayList();
	}

	public int getPassCount() {
		return 1;
	}

	public org.jfree.chart.plot.CategoryPlot getPlot() {
		return org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot;
	}

	public void setPlot(org.jfree.chart.plot.CategoryPlot plot) {
		if (plot == null) {
			throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
		}
		org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot = plot;
	}

	public org.jfree.chart.labels.CategoryItemLabelGenerator getItemLabelGenerator(int row, int column) {
		org.jfree.chart.labels.CategoryItemLabelGenerator generator = ((org.jfree.chart.labels.CategoryItemLabelGenerator) (org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.itemLabelGeneratorList.get(row)));
		if (generator == null) {
			generator = org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseItemLabelGenerator;
		}
		return generator;
	}

	public org.jfree.chart.labels.CategoryItemLabelGenerator getSeriesItemLabelGenerator(int series) {
		return ((org.jfree.chart.labels.CategoryItemLabelGenerator) (org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.itemLabelGeneratorList.get(series)));
	}

	public void setSeriesItemLabelGenerator(int series, org.jfree.chart.labels.CategoryItemLabelGenerator generator) {
		setSeriesItemLabelGenerator(series, generator, true);
	}

	public void setSeriesItemLabelGenerator(int series, org.jfree.chart.labels.CategoryItemLabelGenerator generator, boolean notify) {
		org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.itemLabelGeneratorList.set(series, generator);
		if (notify) {
			notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this));
		}
	}

	public org.jfree.chart.labels.CategoryItemLabelGenerator getBaseItemLabelGenerator() {
		return org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseItemLabelGenerator;
	}

	public void setBaseItemLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator generator) {
		setBaseItemLabelGenerator(generator, true);
	}

	public void setBaseItemLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator generator, boolean notify) {
		org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseItemLabelGenerator = generator;
		if (notify) {
			notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this));
		}
	}

	public org.jfree.chart.labels.CategoryToolTipGenerator getToolTipGenerator(int row, int column) {
		org.jfree.chart.labels.CategoryToolTipGenerator result = null;
		result = getSeriesToolTipGenerator(row);
		if (result == null) {
			result = org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator;
		}
		return result;
	}

	public org.jfree.chart.labels.CategoryToolTipGenerator getSeriesToolTipGenerator(int series) {
		return ((org.jfree.chart.labels.CategoryToolTipGenerator) (org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.toolTipGeneratorList.get(series)));
	}

	public void setSeriesToolTipGenerator(int series, org.jfree.chart.labels.CategoryToolTipGenerator generator) {
		setSeriesToolTipGenerator(series, generator, true);
	}

	public void setSeriesToolTipGenerator(int series, org.jfree.chart.labels.CategoryToolTipGenerator generator, boolean notify) {
		org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.toolTipGeneratorList.set(series, generator);
		if (notify) {
			notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this));
		}
	}

	public org.jfree.chart.labels.CategoryToolTipGenerator getBaseToolTipGenerator() {
		return org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator;
	}

	public void setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator generator) {
		setBaseToolTipGenerator(generator, true);
	}

	public void setBaseToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator generator, boolean notify) {
		org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator = generator;
		if (notify) {
			notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this));
		}
	}

	public org.jfree.chart.urls.CategoryURLGenerator getURLGenerator(int row, int column) {
		org.jfree.chart.urls.CategoryURLGenerator generator = ((org.jfree.chart.urls.CategoryURLGenerator) (org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.urlGeneratorList.get(row)));
		if (generator == null) {
			generator = org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseURLGenerator;
		}
		return generator;
	}

	public org.jfree.chart.urls.CategoryURLGenerator getSeriesURLGenerator(int series) {
		return ((org.jfree.chart.urls.CategoryURLGenerator) (org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.urlGeneratorList.get(series)));
	}

	public void setSeriesURLGenerator(int series, org.jfree.chart.urls.CategoryURLGenerator generator) {
		setSeriesURLGenerator(series, generator, true);
	}

	public void setSeriesURLGenerator(int series, org.jfree.chart.urls.CategoryURLGenerator generator, boolean notify) {
		org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.urlGeneratorList.set(series, generator);
		if (notify) {
			notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this));
		}
	}

	public org.jfree.chart.urls.CategoryURLGenerator getBaseURLGenerator() {
		return org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseURLGenerator;
	}

	public void setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator generator) {
		setBaseURLGenerator(generator, true);
	}

	public void setBaseURLGenerator(org.jfree.chart.urls.CategoryURLGenerator generator, boolean notify) {
		org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseURLGenerator = generator;
		if (notify) {
			notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this));
		}
	}

	public void addAnnotation(org.jfree.chart.annotations.CategoryAnnotation annotation) {
		addAnnotation(annotation, org.jfree.chart.util.Layer.FOREGROUND);
	}

	public void addAnnotation(org.jfree.chart.annotations.CategoryAnnotation annotation, org.jfree.chart.util.Layer layer) {
		if (annotation == null) {
			throw new java.lang.IllegalArgumentException("Null 'annotation' argument.");
		}
		if (layer.equals(org.jfree.chart.util.Layer.FOREGROUND)) {
			org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.foregroundAnnotations.add(annotation);
			notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this));
		}else
			if (layer.equals(org.jfree.chart.util.Layer.BACKGROUND)) {
				org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.backgroundAnnotations.add(annotation);
				notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this));
			}else {
				throw new java.lang.RuntimeException("Unknown layer.");
			}
		
	}

	public boolean removeAnnotation(org.jfree.chart.annotations.CategoryAnnotation annotation) {
		boolean removed = org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.foregroundAnnotations.remove(annotation);
		removed = removed & (org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.backgroundAnnotations.remove(annotation));
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this));
		return removed;
	}

	public void removeAnnotations() {
		org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.foregroundAnnotations.clear();
		org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.backgroundAnnotations.clear();
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this));
	}

	public int getRowCount() {
		return org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.rowCount;
	}

	public int getColumnCount() {
		return org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.columnCount;
	}

	protected org.jfree.chart.renderer.category.CategoryItemRendererState createState(org.jfree.chart.plot.PlotRenderingInfo info) {
		return new org.jfree.chart.renderer.category.CategoryItemRendererState(info);
	}

	public org.jfree.chart.renderer.category.CategoryItemRendererState initialise(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.CategoryPlot plot, int rendererIndex, org.jfree.chart.plot.PlotRenderingInfo info) {
		setPlot(plot);
		org.jfree.data.category.CategoryDataset data = plot.getDataset(rendererIndex);
		if (data != null) {
			org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.rowCount = data.getRowCount();
			org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.columnCount = data.getColumnCount();
		}else {
			org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.rowCount = 0;
			org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.columnCount = 0;
		}
		return createState(info);
	}

	public org.jfree.data.Range findRangeBounds(org.jfree.data.category.CategoryDataset dataset) {
		return org.jfree.data.general.DatasetUtilities.findRangeBounds(dataset);
	}

	public void drawBackground(java.awt.Graphics2D g2, org.jfree.chart.plot.CategoryPlot plot, java.awt.geom.Rectangle2D dataArea) {
		plot.drawBackground(g2, dataArea);
	}

	public void drawOutline(java.awt.Graphics2D g2, org.jfree.chart.plot.CategoryPlot plot, java.awt.geom.Rectangle2D dataArea) {
		plot.drawOutline(g2, dataArea);
	}

	public void drawDomainGridline(java.awt.Graphics2D g2, org.jfree.chart.plot.CategoryPlot plot, java.awt.geom.Rectangle2D dataArea, double value) {
		java.awt.geom.Line2D line = null;
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			line = new java.awt.geom.Line2D.Double(dataArea.getMinX(), value, dataArea.getMaxX(), value);
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				line = new java.awt.geom.Line2D.Double(value, dataArea.getMinY(), value, dataArea.getMaxY());
			}
		
		java.awt.Paint paint = plot.getDomainGridlinePaint();
		if (paint == null) {
			paint = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
		}
		g2.setPaint(paint);
		java.awt.Stroke stroke = plot.getDomainGridlineStroke();
		if (stroke == null) {
			stroke = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_STROKE;
		}
		g2.setStroke(stroke);
		g2.draw(line);
	}

	public void drawRangeGridline(java.awt.Graphics2D g2, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.ValueAxis axis, java.awt.geom.Rectangle2D dataArea, double value) {
		org.jfree.data.Range range = axis.getRange();
		if (!(range.contains(value))) {
			return ;
		}
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		double v = axis.valueToJava2D(value, dataArea, plot.getRangeAxisEdge());
		java.awt.geom.Line2D line = null;
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			line = new java.awt.geom.Line2D.Double(v, dataArea.getMinY(), v, dataArea.getMaxY());
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				line = new java.awt.geom.Line2D.Double(dataArea.getMinX(), v, dataArea.getMaxX(), v);
			}
		
		java.awt.Paint paint = plot.getRangeGridlinePaint();
		if (paint == null) {
			paint = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
		}
		g2.setPaint(paint);
		java.awt.Stroke stroke = plot.getRangeGridlineStroke();
		if (stroke == null) {
			stroke = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_STROKE;
		}
		g2.setStroke(stroke);
		g2.draw(line);
	}

	public void drawDomainMarker(java.awt.Graphics2D g2, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.CategoryAxis axis, org.jfree.chart.plot.CategoryMarker marker, java.awt.geom.Rectangle2D dataArea) {
		java.lang.Comparable category = marker.getKey();
		org.jfree.data.category.CategoryDataset dataset = plot.getDataset(plot.getIndexOf(org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this));
		int columnIndex = dataset.getColumnIndex(category);
		if (columnIndex < 0) {
			return ;
		}
		final java.awt.Composite savedComposite = g2.getComposite();
		g2.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, marker.getAlpha()));
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		java.awt.geom.Rectangle2D bounds = null;
		if (marker.getDrawAsLine()) {
			double v = axis.getCategoryMiddle(columnIndex, dataset.getColumnCount(), dataArea, plot.getDomainAxisEdge());
			java.awt.geom.Line2D line = null;
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				line = new java.awt.geom.Line2D.Double(dataArea.getMinX(), v, dataArea.getMaxX(), v);
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					line = new java.awt.geom.Line2D.Double(v, dataArea.getMinY(), v, dataArea.getMaxY());
				}
			
			g2.setPaint(marker.getPaint());
			g2.setStroke(marker.getStroke());
			g2.draw(line);
			bounds = line.getBounds2D();
		}else {
			double v0 = axis.getCategoryStart(columnIndex, dataset.getColumnCount(), dataArea, plot.getDomainAxisEdge());
			double v1 = axis.getCategoryEnd(columnIndex, dataset.getColumnCount(), dataArea, plot.getDomainAxisEdge());
			java.awt.geom.Rectangle2D area = null;
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				area = new java.awt.geom.Rectangle2D.Double(dataArea.getMinX(), v0, dataArea.getWidth(), (v1 - v0));
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					area = new java.awt.geom.Rectangle2D.Double(v0, dataArea.getMinY(), (v1 - v0), dataArea.getHeight());
				}
			
			g2.setPaint(marker.getPaint());
			g2.fill(area);
			bounds = area;
		}
		java.lang.String label = marker.getLabel();
		org.jfree.chart.util.RectangleAnchor anchor = marker.getLabelAnchor();
		if (label != null) {
			java.awt.Font labelFont = marker.getLabelFont();
			g2.setFont(labelFont);
			g2.setPaint(marker.getLabelPaint());
			java.awt.geom.Point2D coordinates = calculateDomainMarkerTextAnchorPoint(g2, orientation, dataArea, bounds, marker.getLabelOffset(), marker.getLabelOffsetType(), anchor);
			org.jfree.chart.text.TextUtilities.drawAlignedString(label, g2, ((float) (coordinates.getX())), ((float) (coordinates.getY())), marker.getLabelTextAnchor());
		}
		g2.setComposite(savedComposite);
	}

	public void drawRangeMarker(java.awt.Graphics2D g2, org.jfree.chart.plot.CategoryPlot plot, org.jfree.chart.axis.ValueAxis axis, org.jfree.chart.plot.Marker marker, java.awt.geom.Rectangle2D dataArea) {
		if (marker instanceof org.jfree.chart.plot.ValueMarker) {
			org.jfree.chart.plot.ValueMarker vm = ((org.jfree.chart.plot.ValueMarker) (marker));
			double value = vm.getValue();
			org.jfree.data.Range range = axis.getRange();
			if (!(range.contains(value))) {
				return ;
			}
			final java.awt.Composite savedComposite = g2.getComposite();
			g2.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, marker.getAlpha()));
			org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
			double v = axis.valueToJava2D(value, dataArea, plot.getRangeAxisEdge());
			java.awt.geom.Line2D line = null;
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				line = new java.awt.geom.Line2D.Double(v, dataArea.getMinY(), v, dataArea.getMaxY());
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					line = new java.awt.geom.Line2D.Double(dataArea.getMinX(), v, dataArea.getMaxX(), v);
				}
			
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
			g2.setComposite(savedComposite);
		}else
			if (marker instanceof org.jfree.chart.plot.IntervalMarker) {
				org.jfree.chart.plot.IntervalMarker im = ((org.jfree.chart.plot.IntervalMarker) (marker));
				double start = im.getStartValue();
				double end = im.getEndValue();
				org.jfree.data.Range range = axis.getRange();
				if (!(range.intersects(start, end))) {
					return ;
				}
				final java.awt.Composite savedComposite = g2.getComposite();
				g2.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, marker.getAlpha()));
				double start2d = axis.valueToJava2D(start, dataArea, plot.getRangeAxisEdge());
				double end2d = axis.valueToJava2D(end, dataArea, plot.getRangeAxisEdge());
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
				g2.setComposite(savedComposite);
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

	protected java.awt.geom.Point2D calculateRangeMarkerTextAnchorPoint(java.awt.Graphics2D g2, org.jfree.chart.plot.PlotOrientation orientation, java.awt.geom.Rectangle2D dataArea, java.awt.geom.Rectangle2D markerArea, org.jfree.chart.util.RectangleInsets markerOffset, org.jfree.chart.util.LengthAdjustmentType labelOffsetType, org.jfree.chart.util.RectangleAnchor anchor) {
		java.awt.geom.Rectangle2D anchorRect = null;
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			anchorRect = markerOffset.createAdjustedRectangle(markerArea, labelOffsetType, org.jfree.chart.util.LengthAdjustmentType.CONTRACT);
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				anchorRect = markerOffset.createAdjustedRectangle(markerArea, org.jfree.chart.util.LengthAdjustmentType.CONTRACT, labelOffsetType);
			}
		
		return org.jfree.chart.util.RectangleAnchor.coordinates(anchorRect, anchor);
	}

	public org.jfree.chart.LegendItem getLegendItem(int datasetIndex, int series) {
		org.jfree.chart.plot.CategoryPlot p = getPlot();
		if (p == null) {
			return null;
		}
		if ((!(isSeriesVisible(series))) || (!(isSeriesVisibleInLegend(series)))) {
			return null;
		}
		org.jfree.data.category.CategoryDataset dataset = p.getDataset(datasetIndex);
		java.lang.String label = org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.legendItemLabelGenerator.generateLabel(dataset, series);
		java.lang.String description = label;
		java.lang.String toolTipText = null;
		if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.legendItemToolTipGenerator) != null) {
			toolTipText = org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.legendItemToolTipGenerator.generateLabel(dataset, series);
		}
		java.lang.String urlText = null;
		if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.legendItemURLGenerator) != null) {
			urlText = org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.legendItemURLGenerator.generateLabel(dataset, series);
		}
		java.awt.Shape shape = lookupSeriesShape(series);
		java.awt.Paint paint = lookupSeriesPaint(series);
		java.awt.Paint outlinePaint = lookupSeriesOutlinePaint(series);
		java.awt.Stroke outlineStroke = lookupSeriesOutlineStroke(series);
		org.jfree.chart.LegendItem item = new org.jfree.chart.LegendItem(label, description, toolTipText, urlText, shape, paint, outlineStroke, outlinePaint);
		item.setSeriesKey(dataset.getRowKey(series));
		item.setSeriesIndex(series);
		item.setDataset(dataset);
		item.setDatasetIndex(datasetIndex);
		return item;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.category.AbstractCategoryItemRenderer that = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.itemLabelGeneratorList, that.itemLabelGeneratorList))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseItemLabelGenerator, that.baseItemLabelGenerator))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.toolTipGeneratorList, that.toolTipGeneratorList))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator, that.baseToolTipGenerator))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.urlGeneratorList, that.urlGeneratorList))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseURLGenerator, that.baseURLGenerator))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.legendItemLabelGenerator, that.legendItemLabelGenerator))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.legendItemToolTipGenerator, that.legendItemToolTipGenerator))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.legendItemURLGenerator, that.legendItemURLGenerator))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.backgroundAnnotations, that.backgroundAnnotations))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.foregroundAnnotations, that.foregroundAnnotations))) {
			return false;
		}
		return super.equals(obj);
	}

	public int hashCode() {
		int result = super.hashCode();
		return result;
	}

	public org.jfree.chart.plot.DrawingSupplier getDrawingSupplier() {
		org.jfree.chart.plot.DrawingSupplier result = null;
		org.jfree.chart.plot.CategoryPlot cp = getPlot();
		if (cp != null) {
			result = cp.getDrawingSupplier();
		}
		return result;
	}

	protected void drawItemLabel(java.awt.Graphics2D g2, org.jfree.chart.plot.PlotOrientation orientation, org.jfree.data.category.CategoryDataset dataset, int row, int column, double x, double y, boolean negative) {
		org.jfree.chart.labels.CategoryItemLabelGenerator generator = getItemLabelGenerator(row, column);
		if (generator != null) {
			java.awt.Font labelFont = getItemLabelFont(row, column);
			java.awt.Paint paint = getItemLabelPaint(row, column);
			g2.setFont(labelFont);
			g2.setPaint(paint);
			java.lang.String label = generator.generateLabel(dataset, row, column);
			org.jfree.chart.labels.ItemLabelPosition position = null;
			if (!negative) {
				position = getPositiveItemLabelPosition(row, column);
			}else {
				position = getNegativeItemLabelPosition(row, column);
			}
			java.awt.geom.Point2D anchorPoint = calculateLabelAnchorPoint(position.getItemLabelAnchor(), x, y, orientation);
			org.jfree.chart.text.TextUtilities.drawRotatedString(label, g2, ((float) (anchorPoint.getX())), ((float) (anchorPoint.getY())), position.getTextAnchor(), position.getAngle(), position.getRotationAnchor());
		}
	}

	public void drawAnnotations(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.chart.util.Layer layer, org.jfree.chart.plot.PlotRenderingInfo info) {
		java.util.Iterator iterator = null;
		if (layer.equals(org.jfree.chart.util.Layer.FOREGROUND)) {
			iterator = org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.foregroundAnnotations.iterator();
		}else
			if (layer.equals(org.jfree.chart.util.Layer.BACKGROUND)) {
				iterator = org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.backgroundAnnotations.iterator();
			}else {
				throw new java.lang.RuntimeException("Unknown layer.");
			}
		
		while (iterator.hasNext()) {
			org.jfree.chart.annotations.CategoryAnnotation annotation = ((org.jfree.chart.annotations.CategoryAnnotation) (iterator.next()));
			annotation.draw(g2, org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot, dataArea, domainAxis, rangeAxis, 0, info);
		} 
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.renderer.category.AbstractCategoryItemRenderer clone = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer) (super.clone()));
		if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.itemLabelGeneratorList) != null) {
			clone.itemLabelGeneratorList = ((org.jfree.chart.util.ObjectList) (org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.itemLabelGeneratorList.clone()));
		}
		if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseItemLabelGenerator) != null) {
			if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseItemLabelGenerator) instanceof org.jfree.chart.util.PublicCloneable) {
				org.jfree.chart.util.PublicCloneable pc = ((org.jfree.chart.util.PublicCloneable) (org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseItemLabelGenerator));
				clone.baseItemLabelGenerator = ((org.jfree.chart.labels.CategoryItemLabelGenerator) (pc.clone()));
			}else {
				throw new java.lang.CloneNotSupportedException("ItemLabelGenerator not cloneable.");
			}
		}
		if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.toolTipGeneratorList) != null) {
			clone.toolTipGeneratorList = ((org.jfree.chart.util.ObjectList) (org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.toolTipGeneratorList.clone()));
		}
		if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator) != null) {
			if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator) instanceof org.jfree.chart.util.PublicCloneable) {
				org.jfree.chart.util.PublicCloneable pc = ((org.jfree.chart.util.PublicCloneable) (org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseToolTipGenerator));
				clone.baseToolTipGenerator = ((org.jfree.chart.labels.CategoryToolTipGenerator) (pc.clone()));
			}else {
				throw new java.lang.CloneNotSupportedException("Base tool tip generator not cloneable.");
			}
		}
		if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.urlGeneratorList) != null) {
			clone.urlGeneratorList = ((org.jfree.chart.util.ObjectList) (org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.urlGeneratorList.clone()));
		}
		if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseURLGenerator) != null) {
			if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseURLGenerator) instanceof org.jfree.chart.util.PublicCloneable) {
				org.jfree.chart.util.PublicCloneable pc = ((org.jfree.chart.util.PublicCloneable) (org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.baseURLGenerator));
				clone.baseURLGenerator = ((org.jfree.chart.urls.CategoryURLGenerator) (pc.clone()));
			}else {
				throw new java.lang.CloneNotSupportedException("Base item URL generator not cloneable.");
			}
		}
		if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.legendItemLabelGenerator) instanceof org.jfree.chart.util.PublicCloneable) {
			clone.legendItemLabelGenerator = ((org.jfree.chart.labels.CategorySeriesLabelGenerator) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.legendItemLabelGenerator)));
		}
		if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.legendItemToolTipGenerator) instanceof org.jfree.chart.util.PublicCloneable) {
			clone.legendItemToolTipGenerator = ((org.jfree.chart.labels.CategorySeriesLabelGenerator) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.legendItemToolTipGenerator)));
		}
		if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.legendItemURLGenerator) instanceof org.jfree.chart.util.PublicCloneable) {
			clone.legendItemURLGenerator = ((org.jfree.chart.labels.CategorySeriesLabelGenerator) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.legendItemURLGenerator)));
		}
		return clone;
	}

	protected org.jfree.chart.axis.CategoryAxis getDomainAxis(org.jfree.chart.plot.CategoryPlot plot, int index) {
		org.jfree.chart.axis.CategoryAxis result = plot.getDomainAxis(index);
		if (result == null) {
			result = plot.getDomainAxis();
		}
		return result;
	}

	protected org.jfree.chart.axis.ValueAxis getRangeAxis(org.jfree.chart.plot.CategoryPlot plot, int index) {
		org.jfree.chart.axis.ValueAxis result = plot.getRangeAxis(index);
		if (result == null) {
			result = plot.getRangeAxis();
		}
		return result;
	}

	public org.jfree.chart.LegendItemCollection getLegendItems() {
		if ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot) == null) {
			return new org.jfree.chart.LegendItemCollection();
		}
		org.jfree.chart.LegendItemCollection result = new org.jfree.chart.LegendItemCollection();
		int index = org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot.getIndexOf(org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this);
		org.jfree.data.category.CategoryDataset dataset = org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.plot.getDataset(index);
		if (dataset != null) {
			int seriesCount = dataset.getRowCount();
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

	public org.jfree.chart.labels.CategorySeriesLabelGenerator getLegendItemLabelGenerator() {
		return org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.legendItemLabelGenerator;
	}

	public void setLegendItemLabelGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator generator) {
		if (generator == null) {
			throw new java.lang.IllegalArgumentException("Null 'generator' argument.");
		}
		org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.legendItemLabelGenerator = generator;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this));
	}

	public org.jfree.chart.labels.CategorySeriesLabelGenerator getLegendItemToolTipGenerator() {
		return org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.legendItemToolTipGenerator;
	}

	public void setLegendItemToolTipGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator generator) {
		org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.legendItemToolTipGenerator = generator;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this));
	}

	public org.jfree.chart.labels.CategorySeriesLabelGenerator getLegendItemURLGenerator() {
		return org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.legendItemURLGenerator;
	}

	public void setLegendItemURLGenerator(org.jfree.chart.labels.CategorySeriesLabelGenerator generator) {
		org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this.legendItemURLGenerator = generator;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.category.AbstractCategoryItemRenderer.this));
	}

	protected void addItemEntity(org.jfree.chart.entity.EntityCollection entities, org.jfree.data.category.CategoryDataset dataset, int row, int column, java.awt.Shape hotspot) {
		java.lang.String tip = null;
		org.jfree.chart.labels.CategoryToolTipGenerator tipster = getToolTipGenerator(row, column);
		if (tipster != null) {
			tip = tipster.generateToolTip(dataset, row, column);
		}
		java.lang.String url = null;
		org.jfree.chart.urls.CategoryURLGenerator urlster = getURLGenerator(row, column);
		if (urlster != null) {
			url = urlster.generateURL(dataset, row, column);
		}
		org.jfree.chart.entity.CategoryItemEntity entity = new org.jfree.chart.entity.CategoryItemEntity(hotspot, tip, url, dataset, dataset.getRowKey(row), dataset.getColumnKey(column));
		entities.add(entity);
	}
}

