

package org.jfree.chart.plot;


public class SpiderWebPlot extends org.jfree.chart.plot.Plot implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = -5376340422031599463L;

	public static final double DEFAULT_HEAD = 0.01;

	public static final double DEFAULT_AXIS_LABEL_GAP = 0.1;

	public static final double DEFAULT_INTERIOR_GAP = 0.25;

	public static final double MAX_INTERIOR_GAP = 0.4;

	public static final double DEFAULT_START_ANGLE = 90.0;

	public static final java.awt.Font DEFAULT_LABEL_FONT = new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 10);

	public static final java.awt.Paint DEFAULT_LABEL_PAINT = java.awt.Color.black;

	public static final java.awt.Paint DEFAULT_LABEL_BACKGROUND_PAINT = new java.awt.Color(255, 255, 192);

	public static final java.awt.Paint DEFAULT_LABEL_OUTLINE_PAINT = java.awt.Color.black;

	public static final java.awt.Stroke DEFAULT_LABEL_OUTLINE_STROKE = new java.awt.BasicStroke(0.5F);

	public static final java.awt.Paint DEFAULT_LABEL_SHADOW_PAINT = java.awt.Color.lightGray;

	public static final double DEFAULT_MAX_VALUE = -1.0;

	protected double headPercent;

	private double interiorGap;

	private double axisLabelGap;

	private transient java.awt.Paint axisLinePaint;

	private transient java.awt.Stroke axisLineStroke;

	private org.jfree.data.category.CategoryDataset dataset;

	private double maxValue;

	private org.jfree.chart.util.TableOrder dataExtractOrder;

	private double startAngle;

	private org.jfree.chart.util.Rotation direction;

	private transient java.awt.Shape legendItemShape;

	private transient java.awt.Paint seriesPaint;

	private org.jfree.chart.util.PaintList seriesPaintList;

	private transient java.awt.Paint baseSeriesPaint;

	private transient java.awt.Paint seriesOutlinePaint;

	private org.jfree.chart.util.PaintList seriesOutlinePaintList;

	private transient java.awt.Paint baseSeriesOutlinePaint;

	private transient java.awt.Stroke seriesOutlineStroke;

	private org.jfree.chart.util.StrokeList seriesOutlineStrokeList;

	private transient java.awt.Stroke baseSeriesOutlineStroke;

	private java.awt.Font labelFont;

	private transient java.awt.Paint labelPaint;

	private org.jfree.chart.labels.CategoryItemLabelGenerator labelGenerator;

	private boolean webFilled = true;

	private org.jfree.chart.labels.CategoryToolTipGenerator toolTipGenerator;

	private org.jfree.chart.urls.CategoryURLGenerator urlGenerator;

	public SpiderWebPlot() {
		this(null);
	}

	public SpiderWebPlot(org.jfree.data.category.CategoryDataset dataset) {
		this(dataset, org.jfree.chart.util.TableOrder.BY_ROW);
	}

	public SpiderWebPlot(org.jfree.data.category.CategoryDataset dataset, org.jfree.chart.util.TableOrder extract) {
		super();
		if (extract == null) {
			throw new java.lang.IllegalArgumentException("Null 'extract' argument.");
		}
		org.jfree.chart.plot.SpiderWebPlot.this.dataset = dataset;
		if (dataset != null) {
			dataset.addChangeListener(org.jfree.chart.plot.SpiderWebPlot.this);
		}
		org.jfree.chart.plot.SpiderWebPlot.this.dataExtractOrder = extract;
		org.jfree.chart.plot.SpiderWebPlot.this.headPercent = org.jfree.chart.plot.SpiderWebPlot.DEFAULT_HEAD;
		org.jfree.chart.plot.SpiderWebPlot.this.axisLabelGap = org.jfree.chart.plot.SpiderWebPlot.DEFAULT_AXIS_LABEL_GAP;
		org.jfree.chart.plot.SpiderWebPlot.this.axisLinePaint = java.awt.Color.black;
		org.jfree.chart.plot.SpiderWebPlot.this.axisLineStroke = new java.awt.BasicStroke(1.0F);
		org.jfree.chart.plot.SpiderWebPlot.this.interiorGap = org.jfree.chart.plot.SpiderWebPlot.DEFAULT_INTERIOR_GAP;
		org.jfree.chart.plot.SpiderWebPlot.this.startAngle = org.jfree.chart.plot.SpiderWebPlot.DEFAULT_START_ANGLE;
		org.jfree.chart.plot.SpiderWebPlot.this.direction = org.jfree.chart.util.Rotation.CLOCKWISE;
		org.jfree.chart.plot.SpiderWebPlot.this.maxValue = org.jfree.chart.plot.SpiderWebPlot.DEFAULT_MAX_VALUE;
		org.jfree.chart.plot.SpiderWebPlot.this.seriesPaint = null;
		org.jfree.chart.plot.SpiderWebPlot.this.seriesPaintList = new org.jfree.chart.util.PaintList();
		org.jfree.chart.plot.SpiderWebPlot.this.baseSeriesPaint = null;
		org.jfree.chart.plot.SpiderWebPlot.this.seriesOutlinePaint = null;
		org.jfree.chart.plot.SpiderWebPlot.this.seriesOutlinePaintList = new org.jfree.chart.util.PaintList();
		org.jfree.chart.plot.SpiderWebPlot.this.baseSeriesOutlinePaint = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
		org.jfree.chart.plot.SpiderWebPlot.this.seriesOutlineStroke = null;
		org.jfree.chart.plot.SpiderWebPlot.this.seriesOutlineStrokeList = new org.jfree.chart.util.StrokeList();
		org.jfree.chart.plot.SpiderWebPlot.this.baseSeriesOutlineStroke = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
		org.jfree.chart.plot.SpiderWebPlot.this.labelFont = org.jfree.chart.plot.SpiderWebPlot.DEFAULT_LABEL_FONT;
		org.jfree.chart.plot.SpiderWebPlot.this.labelPaint = org.jfree.chart.plot.SpiderWebPlot.DEFAULT_LABEL_PAINT;
		org.jfree.chart.plot.SpiderWebPlot.this.labelGenerator = new org.jfree.chart.labels.StandardCategoryItemLabelGenerator();
		org.jfree.chart.plot.SpiderWebPlot.this.legendItemShape = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
	}

	public java.lang.String getPlotType() {
		return "Spider Web Plot";
	}

	public org.jfree.data.category.CategoryDataset getDataset() {
		return org.jfree.chart.plot.SpiderWebPlot.this.dataset;
	}

	public void setDataset(org.jfree.data.category.CategoryDataset dataset) {
		if ((org.jfree.chart.plot.SpiderWebPlot.this.dataset) != null) {
			org.jfree.chart.plot.SpiderWebPlot.this.dataset.removeChangeListener(org.jfree.chart.plot.SpiderWebPlot.this);
		}
		org.jfree.chart.plot.SpiderWebPlot.this.dataset = dataset;
		if (dataset != null) {
			setDatasetGroup(dataset.getGroup());
			dataset.addChangeListener(org.jfree.chart.plot.SpiderWebPlot.this);
		}
		datasetChanged(new org.jfree.data.general.DatasetChangeEvent(org.jfree.chart.plot.SpiderWebPlot.this, dataset));
	}

	public boolean isWebFilled() {
		return org.jfree.chart.plot.SpiderWebPlot.this.webFilled;
	}

	public void setWebFilled(boolean flag) {
		org.jfree.chart.plot.SpiderWebPlot.this.webFilled = flag;
		fireChangeEvent();
	}

	public org.jfree.chart.util.TableOrder getDataExtractOrder() {
		return org.jfree.chart.plot.SpiderWebPlot.this.dataExtractOrder;
	}

	public void setDataExtractOrder(org.jfree.chart.util.TableOrder order) {
		if (order == null) {
			throw new java.lang.IllegalArgumentException("Null 'order' argument");
		}
		org.jfree.chart.plot.SpiderWebPlot.this.dataExtractOrder = order;
		fireChangeEvent();
	}

	public double getHeadPercent() {
		return org.jfree.chart.plot.SpiderWebPlot.this.headPercent;
	}

	public void setHeadPercent(double percent) {
		org.jfree.chart.plot.SpiderWebPlot.this.headPercent = percent;
		fireChangeEvent();
	}

	public double getStartAngle() {
		return org.jfree.chart.plot.SpiderWebPlot.this.startAngle;
	}

	public void setStartAngle(double angle) {
		org.jfree.chart.plot.SpiderWebPlot.this.startAngle = angle;
		fireChangeEvent();
	}

	public double getMaxValue() {
		return org.jfree.chart.plot.SpiderWebPlot.this.maxValue;
	}

	public void setMaxValue(double value) {
		org.jfree.chart.plot.SpiderWebPlot.this.maxValue = value;
		fireChangeEvent();
	}

	public org.jfree.chart.util.Rotation getDirection() {
		return org.jfree.chart.plot.SpiderWebPlot.this.direction;
	}

	public void setDirection(org.jfree.chart.util.Rotation direction) {
		if (direction == null) {
			throw new java.lang.IllegalArgumentException("Null 'direction' argument.");
		}
		org.jfree.chart.plot.SpiderWebPlot.this.direction = direction;
		fireChangeEvent();
	}

	public double getInteriorGap() {
		return org.jfree.chart.plot.SpiderWebPlot.this.interiorGap;
	}

	public void setInteriorGap(double percent) {
		if ((percent < 0.0) || (percent > (org.jfree.chart.plot.SpiderWebPlot.MAX_INTERIOR_GAP))) {
			throw new java.lang.IllegalArgumentException("Percentage outside valid range.");
		}
		if ((org.jfree.chart.plot.SpiderWebPlot.this.interiorGap) != percent) {
			org.jfree.chart.plot.SpiderWebPlot.this.interiorGap = percent;
			fireChangeEvent();
		}
	}

	public double getAxisLabelGap() {
		return org.jfree.chart.plot.SpiderWebPlot.this.axisLabelGap;
	}

	public void setAxisLabelGap(double gap) {
		org.jfree.chart.plot.SpiderWebPlot.this.axisLabelGap = gap;
		fireChangeEvent();
	}

	public java.awt.Paint getAxisLinePaint() {
		return org.jfree.chart.plot.SpiderWebPlot.this.axisLinePaint;
	}

	public void setAxisLinePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.SpiderWebPlot.this.axisLinePaint = paint;
		fireChangeEvent();
	}

	public java.awt.Stroke getAxisLineStroke() {
		return org.jfree.chart.plot.SpiderWebPlot.this.axisLineStroke;
	}

	public void setAxisLineStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.plot.SpiderWebPlot.this.axisLineStroke = stroke;
		fireChangeEvent();
	}

	public java.awt.Paint getSeriesPaint() {
		return org.jfree.chart.plot.SpiderWebPlot.this.seriesPaint;
	}

	public void setSeriesPaint(java.awt.Paint paint) {
		org.jfree.chart.plot.SpiderWebPlot.this.seriesPaint = paint;
		fireChangeEvent();
	}

	public java.awt.Paint getSeriesPaint(int series) {
		if ((org.jfree.chart.plot.SpiderWebPlot.this.seriesPaint) != null) {
			return org.jfree.chart.plot.SpiderWebPlot.this.seriesPaint;
		}
		java.awt.Paint result = org.jfree.chart.plot.SpiderWebPlot.this.seriesPaintList.getPaint(series);
		if (result == null) {
			org.jfree.chart.plot.DrawingSupplier supplier = getDrawingSupplier();
			if (supplier != null) {
				java.awt.Paint p = supplier.getNextPaint();
				org.jfree.chart.plot.SpiderWebPlot.this.seriesPaintList.setPaint(series, p);
				result = p;
			}else {
				result = org.jfree.chart.plot.SpiderWebPlot.this.baseSeriesPaint;
			}
		}
		return result;
	}

	public void setSeriesPaint(int series, java.awt.Paint paint) {
		org.jfree.chart.plot.SpiderWebPlot.this.seriesPaintList.setPaint(series, paint);
		fireChangeEvent();
	}

	public java.awt.Paint getBaseSeriesPaint() {
		return org.jfree.chart.plot.SpiderWebPlot.this.baseSeriesPaint;
	}

	public void setBaseSeriesPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.SpiderWebPlot.this.baseSeriesPaint = paint;
		fireChangeEvent();
	}

	public java.awt.Paint getSeriesOutlinePaint() {
		return org.jfree.chart.plot.SpiderWebPlot.this.seriesOutlinePaint;
	}

	public void setSeriesOutlinePaint(java.awt.Paint paint) {
		org.jfree.chart.plot.SpiderWebPlot.this.seriesOutlinePaint = paint;
		fireChangeEvent();
	}

	public java.awt.Paint getSeriesOutlinePaint(int series) {
		if ((org.jfree.chart.plot.SpiderWebPlot.this.seriesOutlinePaint) != null) {
			return org.jfree.chart.plot.SpiderWebPlot.this.seriesOutlinePaint;
		}
		java.awt.Paint result = org.jfree.chart.plot.SpiderWebPlot.this.seriesOutlinePaintList.getPaint(series);
		if (result == null) {
			result = org.jfree.chart.plot.SpiderWebPlot.this.baseSeriesOutlinePaint;
		}
		return result;
	}

	public void setSeriesOutlinePaint(int series, java.awt.Paint paint) {
		org.jfree.chart.plot.SpiderWebPlot.this.seriesOutlinePaintList.setPaint(series, paint);
		fireChangeEvent();
	}

	public java.awt.Paint getBaseSeriesOutlinePaint() {
		return org.jfree.chart.plot.SpiderWebPlot.this.baseSeriesOutlinePaint;
	}

	public void setBaseSeriesOutlinePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.SpiderWebPlot.this.baseSeriesOutlinePaint = paint;
		fireChangeEvent();
	}

	public java.awt.Stroke getSeriesOutlineStroke() {
		return org.jfree.chart.plot.SpiderWebPlot.this.seriesOutlineStroke;
	}

	public void setSeriesOutlineStroke(java.awt.Stroke stroke) {
		org.jfree.chart.plot.SpiderWebPlot.this.seriesOutlineStroke = stroke;
		fireChangeEvent();
	}

	public java.awt.Stroke getSeriesOutlineStroke(int series) {
		if ((org.jfree.chart.plot.SpiderWebPlot.this.seriesOutlineStroke) != null) {
			return org.jfree.chart.plot.SpiderWebPlot.this.seriesOutlineStroke;
		}
		java.awt.Stroke result = org.jfree.chart.plot.SpiderWebPlot.this.seriesOutlineStrokeList.getStroke(series);
		if (result == null) {
			result = org.jfree.chart.plot.SpiderWebPlot.this.baseSeriesOutlineStroke;
		}
		return result;
	}

	public void setSeriesOutlineStroke(int series, java.awt.Stroke stroke) {
		org.jfree.chart.plot.SpiderWebPlot.this.seriesOutlineStrokeList.setStroke(series, stroke);
		fireChangeEvent();
	}

	public java.awt.Stroke getBaseSeriesOutlineStroke() {
		return org.jfree.chart.plot.SpiderWebPlot.this.baseSeriesOutlineStroke;
	}

	public void setBaseSeriesOutlineStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.plot.SpiderWebPlot.this.baseSeriesOutlineStroke = stroke;
		fireChangeEvent();
	}

	public java.awt.Shape getLegendItemShape() {
		return org.jfree.chart.plot.SpiderWebPlot.this.legendItemShape;
	}

	public void setLegendItemShape(java.awt.Shape shape) {
		if (shape == null) {
			throw new java.lang.IllegalArgumentException("Null 'shape' argument.");
		}
		org.jfree.chart.plot.SpiderWebPlot.this.legendItemShape = shape;
		fireChangeEvent();
	}

	public java.awt.Font getLabelFont() {
		return org.jfree.chart.plot.SpiderWebPlot.this.labelFont;
	}

	public void setLabelFont(java.awt.Font font) {
		if (font == null) {
			throw new java.lang.IllegalArgumentException("Null 'font' argument.");
		}
		org.jfree.chart.plot.SpiderWebPlot.this.labelFont = font;
		fireChangeEvent();
	}

	public java.awt.Paint getLabelPaint() {
		return org.jfree.chart.plot.SpiderWebPlot.this.labelPaint;
	}

	public void setLabelPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.SpiderWebPlot.this.labelPaint = paint;
		fireChangeEvent();
	}

	public org.jfree.chart.labels.CategoryItemLabelGenerator getLabelGenerator() {
		return org.jfree.chart.plot.SpiderWebPlot.this.labelGenerator;
	}

	public void setLabelGenerator(org.jfree.chart.labels.CategoryItemLabelGenerator generator) {
		if (generator == null) {
			throw new java.lang.IllegalArgumentException("Null 'generator' argument.");
		}
		org.jfree.chart.plot.SpiderWebPlot.this.labelGenerator = generator;
	}

	public org.jfree.chart.labels.CategoryToolTipGenerator getToolTipGenerator() {
		return org.jfree.chart.plot.SpiderWebPlot.this.toolTipGenerator;
	}

	public void setToolTipGenerator(org.jfree.chart.labels.CategoryToolTipGenerator generator) {
		org.jfree.chart.plot.SpiderWebPlot.this.toolTipGenerator = generator;
		fireChangeEvent();
	}

	public org.jfree.chart.urls.CategoryURLGenerator getURLGenerator() {
		return org.jfree.chart.plot.SpiderWebPlot.this.urlGenerator;
	}

	public void setURLGenerator(org.jfree.chart.urls.CategoryURLGenerator generator) {
		org.jfree.chart.plot.SpiderWebPlot.this.urlGenerator = generator;
		fireChangeEvent();
	}

	public org.jfree.chart.LegendItemCollection getLegendItems() {
		org.jfree.chart.LegendItemCollection result = new org.jfree.chart.LegendItemCollection();
		java.util.List keys = null;
		if ((org.jfree.chart.plot.SpiderWebPlot.this.dataExtractOrder) == (org.jfree.chart.util.TableOrder.BY_ROW)) {
			keys = org.jfree.chart.plot.SpiderWebPlot.this.dataset.getRowKeys();
		}else
			if ((org.jfree.chart.plot.SpiderWebPlot.this.dataExtractOrder) == (org.jfree.chart.util.TableOrder.BY_COLUMN)) {
				keys = org.jfree.chart.plot.SpiderWebPlot.this.dataset.getColumnKeys();
			}
		
		if (keys != null) {
			int series = 0;
			java.util.Iterator iterator = keys.iterator();
			java.awt.Shape shape = getLegendItemShape();
			while (iterator.hasNext()) {
				java.lang.String label = iterator.next().toString();
				java.lang.String description = label;
				java.awt.Paint paint = getSeriesPaint(series);
				java.awt.Paint outlinePaint = getSeriesOutlinePaint(series);
				java.awt.Stroke stroke = getSeriesOutlineStroke(series);
				org.jfree.chart.LegendItem item = new org.jfree.chart.LegendItem(label, description, null, null, shape, paint, stroke, outlinePaint);
				item.setDataset(getDataset());
				result.add(item);
				series++;
			} 
		}
		return result;
	}

	protected java.awt.geom.Point2D getWebPoint(java.awt.geom.Rectangle2D bounds, double angle, double length) {
		double angrad = java.lang.Math.toRadians(angle);
		double x = (((java.lang.Math.cos(angrad)) * length) * (bounds.getWidth())) / 2;
		double y = (((-(java.lang.Math.sin(angrad))) * length) * (bounds.getHeight())) / 2;
		return new java.awt.geom.Point2D.Double((((bounds.getX()) + x) + ((bounds.getWidth()) / 2)), (((bounds.getY()) + y) + ((bounds.getHeight()) / 2)));
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.awt.geom.Point2D anchor, org.jfree.chart.plot.PlotState parentState, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.util.RectangleInsets insets = getInsets();
		insets.trim(area);
		if (info != null) {
			info.setPlotArea(area);
			info.setDataArea(area);
		}
		drawBackground(g2, area);
		drawOutline(g2, area);
		java.awt.Shape savedClip = g2.getClip();
		g2.clip(area);
		java.awt.Composite originalComposite = g2.getComposite();
		g2.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, getForegroundAlpha()));
		if (!(org.jfree.data.general.DatasetUtilities.isEmptyOrNull(org.jfree.chart.plot.SpiderWebPlot.this.dataset))) {
			int seriesCount = 0;
			int catCount = 0;
			if ((org.jfree.chart.plot.SpiderWebPlot.this.dataExtractOrder) == (org.jfree.chart.util.TableOrder.BY_ROW)) {
				seriesCount = org.jfree.chart.plot.SpiderWebPlot.this.dataset.getRowCount();
				catCount = org.jfree.chart.plot.SpiderWebPlot.this.dataset.getColumnCount();
			}else {
				seriesCount = org.jfree.chart.plot.SpiderWebPlot.this.dataset.getColumnCount();
				catCount = org.jfree.chart.plot.SpiderWebPlot.this.dataset.getRowCount();
			}
			if ((org.jfree.chart.plot.SpiderWebPlot.this.maxValue) == (org.jfree.chart.plot.SpiderWebPlot.DEFAULT_MAX_VALUE))
				calculateMaxValue(seriesCount, catCount);
			
			double gapHorizontal = (area.getWidth()) * (getInteriorGap());
			double gapVertical = (area.getHeight()) * (getInteriorGap());
			double X = (area.getX()) + (gapHorizontal / 2);
			double Y = (area.getY()) + (gapVertical / 2);
			double W = (area.getWidth()) - gapHorizontal;
			double H = (area.getHeight()) - gapVertical;
			double headW = (area.getWidth()) * (org.jfree.chart.plot.SpiderWebPlot.this.headPercent);
			double headH = (area.getHeight()) * (org.jfree.chart.plot.SpiderWebPlot.this.headPercent);
			double min = (java.lang.Math.min(W, H)) / 2;
			X = (((X + X) + W) / 2) - min;
			Y = (((Y + Y) + H) / 2) - min;
			W = 2 * min;
			H = 2 * min;
			java.awt.geom.Point2D centre = new java.awt.geom.Point2D.Double((X + (W / 2)), (Y + (H / 2)));
			java.awt.geom.Rectangle2D radarArea = new java.awt.geom.Rectangle2D.Double(X, Y, W, H);
			for (int cat = 0; cat < catCount; cat++) {
				double angle = (getStartAngle()) + ((((getDirection().getFactor()) * cat) * 360) / catCount);
				java.awt.geom.Point2D endPoint = getWebPoint(radarArea, angle, 1);
				java.awt.geom.Line2D line = new java.awt.geom.Line2D.Double(centre, endPoint);
				g2.setPaint(org.jfree.chart.plot.SpiderWebPlot.this.axisLinePaint);
				g2.setStroke(org.jfree.chart.plot.SpiderWebPlot.this.axisLineStroke);
				g2.draw(line);
				drawLabel(g2, radarArea, 0.0, cat, angle, (360.0 / catCount));
			}
			for (int series = 0; series < seriesCount; series++) {
				drawRadarPoly(g2, radarArea, centre, info, series, catCount, headH, headW);
			}
		}else {
			drawNoDataMessage(g2, area);
		}
		g2.setClip(savedClip);
		g2.setComposite(originalComposite);
		drawOutline(g2, area);
	}

	private void calculateMaxValue(int seriesCount, int catCount) {
		double v = 0;
		java.lang.Number nV = null;
		for (int seriesIndex = 0; seriesIndex < seriesCount; seriesIndex++) {
			for (int catIndex = 0; catIndex < catCount; catIndex++) {
				nV = getPlotValue(seriesIndex, catIndex);
				if (nV != null) {
					v = nV.doubleValue();
					if (v > (org.jfree.chart.plot.SpiderWebPlot.this.maxValue)) {
						org.jfree.chart.plot.SpiderWebPlot.this.maxValue = v;
					}
				}
			}
		}
	}

	protected void drawRadarPoly(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Point2D centre, org.jfree.chart.plot.PlotRenderingInfo info, int series, int catCount, double headH, double headW) {
		java.awt.Polygon polygon = new java.awt.Polygon();
		org.jfree.chart.entity.EntityCollection entities = null;
		if (info != null) {
			entities = info.getOwner().getEntityCollection();
		}
		for (int cat = 0; cat < catCount; cat++) {
			java.lang.Number dataValue = getPlotValue(series, cat);
			if (dataValue != null) {
				double value = dataValue.doubleValue();
				if (value >= 0) {
					double angle = (getStartAngle()) + ((((getDirection().getFactor()) * cat) * 360) / catCount);
					java.awt.geom.Point2D point = getWebPoint(plotArea, angle, (value / (org.jfree.chart.plot.SpiderWebPlot.this.maxValue)));
					polygon.addPoint(((int) (point.getX())), ((int) (point.getY())));
					java.awt.Paint paint = getSeriesPaint(series);
					java.awt.Paint outlinePaint = getSeriesOutlinePaint(series);
					java.awt.Stroke outlineStroke = getSeriesOutlineStroke(series);
					java.awt.geom.Ellipse2D head = new java.awt.geom.Ellipse2D.Double(((point.getX()) - (headW / 2)), ((point.getY()) - (headH / 2)), headW, headH);
					g2.setPaint(paint);
					g2.fill(head);
					g2.setStroke(outlineStroke);
					g2.setPaint(outlinePaint);
					g2.draw(head);
					if (entities != null) {
						java.lang.String tip = null;
						if ((org.jfree.chart.plot.SpiderWebPlot.this.toolTipGenerator) != null) {
							tip = org.jfree.chart.plot.SpiderWebPlot.this.toolTipGenerator.generateToolTip(org.jfree.chart.plot.SpiderWebPlot.this.dataset, series, cat);
						}
						java.lang.String url = null;
						if ((org.jfree.chart.plot.SpiderWebPlot.this.urlGenerator) != null) {
							url = org.jfree.chart.plot.SpiderWebPlot.this.urlGenerator.generateURL(org.jfree.chart.plot.SpiderWebPlot.this.dataset, series, cat);
						}
						java.awt.Shape area = new java.awt.Rectangle(((int) ((point.getX()) - headW)), ((int) ((point.getY()) - headH)), ((int) (headW * 2)), ((int) (headH * 2)));
						org.jfree.chart.entity.CategoryItemEntity entity = new org.jfree.chart.entity.CategoryItemEntity(area, tip, url, org.jfree.chart.plot.SpiderWebPlot.this.dataset, org.jfree.chart.plot.SpiderWebPlot.this.dataset.getRowKey(series), org.jfree.chart.plot.SpiderWebPlot.this.dataset.getColumnKey(cat));
						entities.add(entity);
					}
				}
			}
		}
		java.awt.Paint paint = getSeriesPaint(series);
		g2.setPaint(paint);
		g2.setStroke(getSeriesOutlineStroke(series));
		g2.draw(polygon);
		if (org.jfree.chart.plot.SpiderWebPlot.this.webFilled) {
			g2.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, 0.1F));
			g2.fill(polygon);
			g2.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, getForegroundAlpha()));
		}
	}

	protected java.lang.Number getPlotValue(int series, int cat) {
		java.lang.Number value = null;
		if ((org.jfree.chart.plot.SpiderWebPlot.this.dataExtractOrder) == (org.jfree.chart.util.TableOrder.BY_ROW)) {
			value = org.jfree.chart.plot.SpiderWebPlot.this.dataset.getValue(series, cat);
		}else
			if ((org.jfree.chart.plot.SpiderWebPlot.this.dataExtractOrder) == (org.jfree.chart.util.TableOrder.BY_COLUMN)) {
				value = org.jfree.chart.plot.SpiderWebPlot.this.dataset.getValue(cat, series);
			}
		
		return value;
	}

	protected void drawLabel(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, double value, int cat, double startAngle, double extent) {
		java.awt.font.FontRenderContext frc = g2.getFontRenderContext();
		java.lang.String label = null;
		if ((org.jfree.chart.plot.SpiderWebPlot.this.dataExtractOrder) == (org.jfree.chart.util.TableOrder.BY_ROW)) {
			label = org.jfree.chart.plot.SpiderWebPlot.this.labelGenerator.generateColumnLabel(org.jfree.chart.plot.SpiderWebPlot.this.dataset, cat);
		}else {
			label = org.jfree.chart.plot.SpiderWebPlot.this.labelGenerator.generateRowLabel(org.jfree.chart.plot.SpiderWebPlot.this.dataset, cat);
		}
		java.awt.geom.Rectangle2D labelBounds = getLabelFont().getStringBounds(label, frc);
		java.awt.font.LineMetrics lm = getLabelFont().getLineMetrics(label, frc);
		double ascent = lm.getAscent();
		java.awt.geom.Point2D labelLocation = calculateLabelLocation(labelBounds, ascent, plotArea, startAngle);
		java.awt.Composite saveComposite = g2.getComposite();
		g2.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, 1.0F));
		g2.setPaint(getLabelPaint());
		g2.setFont(getLabelFont());
		g2.drawString(label, ((float) (labelLocation.getX())), ((float) (labelLocation.getY())));
		g2.setComposite(saveComposite);
	}

	protected java.awt.geom.Point2D calculateLabelLocation(java.awt.geom.Rectangle2D labelBounds, double ascent, java.awt.geom.Rectangle2D plotArea, double startAngle) {
		java.awt.geom.Arc2D arc1 = new java.awt.geom.Arc2D.Double(plotArea, startAngle, 0, java.awt.geom.Arc2D.OPEN);
		java.awt.geom.Point2D point1 = arc1.getEndPoint();
		double deltaX = (-((point1.getX()) - (plotArea.getCenterX()))) * (org.jfree.chart.plot.SpiderWebPlot.this.axisLabelGap);
		double deltaY = (-((point1.getY()) - (plotArea.getCenterY()))) * (org.jfree.chart.plot.SpiderWebPlot.this.axisLabelGap);
		double labelX = (point1.getX()) - deltaX;
		double labelY = (point1.getY()) - deltaY;
		if (labelX < (plotArea.getCenterX())) {
			labelX -= labelBounds.getWidth();
		}
		if (labelX == (plotArea.getCenterX())) {
			labelX -= (labelBounds.getWidth()) / 2;
		}
		if (labelY > (plotArea.getCenterY())) {
			labelY += ascent;
		}
		return new java.awt.geom.Point2D.Double(labelX, labelY);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.SpiderWebPlot.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.SpiderWebPlot)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.chart.plot.SpiderWebPlot that = ((org.jfree.chart.plot.SpiderWebPlot) (obj));
		if (!(org.jfree.chart.plot.SpiderWebPlot.this.dataExtractOrder.equals(that.dataExtractOrder))) {
			return false;
		}
		if ((org.jfree.chart.plot.SpiderWebPlot.this.headPercent) != (that.headPercent)) {
			return false;
		}
		if ((org.jfree.chart.plot.SpiderWebPlot.this.interiorGap) != (that.interiorGap)) {
			return false;
		}
		if ((org.jfree.chart.plot.SpiderWebPlot.this.startAngle) != (that.startAngle)) {
			return false;
		}
		if (!(org.jfree.chart.plot.SpiderWebPlot.this.direction.equals(that.direction))) {
			return false;
		}
		if ((org.jfree.chart.plot.SpiderWebPlot.this.maxValue) != (that.maxValue)) {
			return false;
		}
		if ((org.jfree.chart.plot.SpiderWebPlot.this.webFilled) != (that.webFilled)) {
			return false;
		}
		if ((org.jfree.chart.plot.SpiderWebPlot.this.axisLabelGap) != (that.axisLabelGap)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.SpiderWebPlot.this.axisLinePaint, that.axisLinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.plot.SpiderWebPlot.this.axisLineStroke.equals(that.axisLineStroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.ShapeUtilities.equal(org.jfree.chart.plot.SpiderWebPlot.this.legendItemShape, that.legendItemShape))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.SpiderWebPlot.this.seriesPaint, that.seriesPaint))) {
			return false;
		}
		if (!(org.jfree.chart.plot.SpiderWebPlot.this.seriesPaintList.equals(that.seriesPaintList))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.SpiderWebPlot.this.baseSeriesPaint, that.baseSeriesPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.SpiderWebPlot.this.seriesOutlinePaint, that.seriesOutlinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.plot.SpiderWebPlot.this.seriesOutlinePaintList.equals(that.seriesOutlinePaintList))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.SpiderWebPlot.this.baseSeriesOutlinePaint, that.baseSeriesOutlinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.SpiderWebPlot.this.seriesOutlineStroke, that.seriesOutlineStroke))) {
			return false;
		}
		if (!(org.jfree.chart.plot.SpiderWebPlot.this.seriesOutlineStrokeList.equals(that.seriesOutlineStrokeList))) {
			return false;
		}
		if (!(org.jfree.chart.plot.SpiderWebPlot.this.baseSeriesOutlineStroke.equals(that.baseSeriesOutlineStroke))) {
			return false;
		}
		if (!(org.jfree.chart.plot.SpiderWebPlot.this.labelFont.equals(that.labelFont))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.SpiderWebPlot.this.labelPaint, that.labelPaint))) {
			return false;
		}
		if (!(org.jfree.chart.plot.SpiderWebPlot.this.labelGenerator.equals(that.labelGenerator))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.SpiderWebPlot.this.toolTipGenerator, that.toolTipGenerator))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.SpiderWebPlot.this.urlGenerator, that.urlGenerator))) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.plot.SpiderWebPlot clone = ((org.jfree.chart.plot.SpiderWebPlot) (super.clone()));
		clone.legendItemShape = org.jfree.chart.util.ShapeUtilities.clone(org.jfree.chart.plot.SpiderWebPlot.this.legendItemShape);
		clone.seriesPaintList = ((org.jfree.chart.util.PaintList) (org.jfree.chart.plot.SpiderWebPlot.this.seriesPaintList.clone()));
		clone.seriesOutlinePaintList = ((org.jfree.chart.util.PaintList) (org.jfree.chart.plot.SpiderWebPlot.this.seriesOutlinePaintList.clone()));
		clone.seriesOutlineStrokeList = ((org.jfree.chart.util.StrokeList) (org.jfree.chart.plot.SpiderWebPlot.this.seriesOutlineStrokeList.clone()));
		return clone;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writeShape(org.jfree.chart.plot.SpiderWebPlot.this.legendItemShape, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.SpiderWebPlot.this.seriesPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.SpiderWebPlot.this.baseSeriesPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.SpiderWebPlot.this.seriesOutlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.SpiderWebPlot.this.baseSeriesOutlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.SpiderWebPlot.this.seriesOutlineStroke, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.SpiderWebPlot.this.baseSeriesOutlineStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.SpiderWebPlot.this.labelPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.SpiderWebPlot.this.axisLinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.SpiderWebPlot.this.axisLineStroke, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.plot.SpiderWebPlot.this.legendItemShape = org.jfree.chart.util.SerialUtilities.readShape(stream);
		org.jfree.chart.plot.SpiderWebPlot.this.seriesPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.SpiderWebPlot.this.baseSeriesPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.SpiderWebPlot.this.seriesOutlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.SpiderWebPlot.this.baseSeriesOutlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.SpiderWebPlot.this.seriesOutlineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.SpiderWebPlot.this.baseSeriesOutlineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.SpiderWebPlot.this.labelPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.SpiderWebPlot.this.axisLinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.SpiderWebPlot.this.axisLineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		if ((org.jfree.chart.plot.SpiderWebPlot.this.dataset) != null) {
			org.jfree.chart.plot.SpiderWebPlot.this.dataset.addChangeListener(org.jfree.chart.plot.SpiderWebPlot.this);
		}
	}
}

