

package org.jfree.chart.plot;


public class MeterPlot extends org.jfree.chart.plot.Plot implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = 2987472457734470962L;

	static final java.awt.Paint DEFAULT_DIAL_BACKGROUND_PAINT = java.awt.Color.black;

	static final java.awt.Paint DEFAULT_NEEDLE_PAINT = java.awt.Color.green;

	static final java.awt.Font DEFAULT_VALUE_FONT = new java.awt.Font("Tahoma", java.awt.Font.BOLD, 12);

	static final java.awt.Paint DEFAULT_VALUE_PAINT = java.awt.Color.yellow;

	public static final int DEFAULT_METER_ANGLE = 270;

	public static final float DEFAULT_BORDER_SIZE = 3.0F;

	public static final float DEFAULT_CIRCLE_SIZE = 10.0F;

	public static final java.awt.Font DEFAULT_LABEL_FONT = new java.awt.Font("Tahoma", java.awt.Font.BOLD, 10);

	private org.jfree.data.general.ValueDataset dataset;

	private org.jfree.chart.plot.DialShape shape;

	private int meterAngle;

	private org.jfree.data.Range range;

	private double tickSize;

	private transient java.awt.Paint tickPaint;

	private java.lang.String units;

	private java.awt.Font valueFont;

	private transient java.awt.Paint valuePaint;

	private boolean drawBorder;

	private transient java.awt.Paint dialOutlinePaint;

	private transient java.awt.Paint dialBackgroundPaint;

	private transient java.awt.Paint needlePaint;

	private boolean tickLabelsVisible;

	private java.awt.Font tickLabelFont;

	private transient java.awt.Paint tickLabelPaint;

	private java.text.NumberFormat tickLabelFormat;

	protected static java.util.ResourceBundle localizationResources = org.jfree.chart.util.ResourceBundleWrapper.getBundle("org.jfree.chart.plot.LocalizationBundle");

	private java.util.List intervals;

	public MeterPlot() {
		this(null);
	}

	public MeterPlot(org.jfree.data.general.ValueDataset dataset) {
		super();
		org.jfree.chart.plot.MeterPlot.this.shape = org.jfree.chart.plot.DialShape.CIRCLE;
		org.jfree.chart.plot.MeterPlot.this.meterAngle = org.jfree.chart.plot.MeterPlot.DEFAULT_METER_ANGLE;
		org.jfree.chart.plot.MeterPlot.this.range = new org.jfree.data.Range(0.0, 100.0);
		org.jfree.chart.plot.MeterPlot.this.tickSize = 10.0;
		org.jfree.chart.plot.MeterPlot.this.tickPaint = java.awt.Color.white;
		org.jfree.chart.plot.MeterPlot.this.units = "Units";
		org.jfree.chart.plot.MeterPlot.this.needlePaint = org.jfree.chart.plot.MeterPlot.DEFAULT_NEEDLE_PAINT;
		org.jfree.chart.plot.MeterPlot.this.tickLabelsVisible = true;
		org.jfree.chart.plot.MeterPlot.this.tickLabelFont = org.jfree.chart.plot.MeterPlot.DEFAULT_LABEL_FONT;
		org.jfree.chart.plot.MeterPlot.this.tickLabelPaint = java.awt.Color.black;
		org.jfree.chart.plot.MeterPlot.this.tickLabelFormat = java.text.NumberFormat.getInstance();
		org.jfree.chart.plot.MeterPlot.this.valueFont = org.jfree.chart.plot.MeterPlot.DEFAULT_VALUE_FONT;
		org.jfree.chart.plot.MeterPlot.this.valuePaint = org.jfree.chart.plot.MeterPlot.DEFAULT_VALUE_PAINT;
		org.jfree.chart.plot.MeterPlot.this.dialBackgroundPaint = org.jfree.chart.plot.MeterPlot.DEFAULT_DIAL_BACKGROUND_PAINT;
		org.jfree.chart.plot.MeterPlot.this.intervals = new java.util.ArrayList();
		setDataset(dataset);
	}

	public org.jfree.chart.plot.DialShape getDialShape() {
		return org.jfree.chart.plot.MeterPlot.this.shape;
	}

	public void setDialShape(org.jfree.chart.plot.DialShape shape) {
		if (shape == null) {
			throw new java.lang.IllegalArgumentException("Null 'shape' argument.");
		}
		org.jfree.chart.plot.MeterPlot.this.shape = shape;
		fireChangeEvent();
	}

	public int getMeterAngle() {
		return org.jfree.chart.plot.MeterPlot.this.meterAngle;
	}

	public void setMeterAngle(int angle) {
		if ((angle < 1) || (angle > 360)) {
			throw new java.lang.IllegalArgumentException((("Invalid 'angle' (" + angle) + ")"));
		}
		org.jfree.chart.plot.MeterPlot.this.meterAngle = angle;
		fireChangeEvent();
	}

	public org.jfree.data.Range getRange() {
		return org.jfree.chart.plot.MeterPlot.this.range;
	}

	public void setRange(org.jfree.data.Range range) {
		if (range == null) {
			throw new java.lang.IllegalArgumentException("Null 'range' argument.");
		}
		if (!((range.getLength()) > 0.0)) {
			throw new java.lang.IllegalArgumentException("Range length must be positive.");
		}
		org.jfree.chart.plot.MeterPlot.this.range = range;
		fireChangeEvent();
	}

	public double getTickSize() {
		return org.jfree.chart.plot.MeterPlot.this.tickSize;
	}

	public void setTickSize(double size) {
		if (size <= 0) {
			throw new java.lang.IllegalArgumentException("Requires 'size' > 0.");
		}
		org.jfree.chart.plot.MeterPlot.this.tickSize = size;
		fireChangeEvent();
	}

	public java.awt.Paint getTickPaint() {
		return org.jfree.chart.plot.MeterPlot.this.tickPaint;
	}

	public void setTickPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.MeterPlot.this.tickPaint = paint;
		fireChangeEvent();
	}

	public java.lang.String getUnits() {
		return org.jfree.chart.plot.MeterPlot.this.units;
	}

	public void setUnits(java.lang.String units) {
		org.jfree.chart.plot.MeterPlot.this.units = units;
		fireChangeEvent();
	}

	public java.awt.Paint getNeedlePaint() {
		return org.jfree.chart.plot.MeterPlot.this.needlePaint;
	}

	public void setNeedlePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.MeterPlot.this.needlePaint = paint;
		fireChangeEvent();
	}

	public boolean getTickLabelsVisible() {
		return org.jfree.chart.plot.MeterPlot.this.tickLabelsVisible;
	}

	public void setTickLabelsVisible(boolean visible) {
		if ((org.jfree.chart.plot.MeterPlot.this.tickLabelsVisible) != visible) {
			org.jfree.chart.plot.MeterPlot.this.tickLabelsVisible = visible;
			fireChangeEvent();
		}
	}

	public java.awt.Font getTickLabelFont() {
		return org.jfree.chart.plot.MeterPlot.this.tickLabelFont;
	}

	public void setTickLabelFont(java.awt.Font font) {
		if (font == null) {
			throw new java.lang.IllegalArgumentException("Null 'font' argument.");
		}
		if (!(org.jfree.chart.plot.MeterPlot.this.tickLabelFont.equals(font))) {
			org.jfree.chart.plot.MeterPlot.this.tickLabelFont = font;
			fireChangeEvent();
		}
	}

	public java.awt.Paint getTickLabelPaint() {
		return org.jfree.chart.plot.MeterPlot.this.tickLabelPaint;
	}

	public void setTickLabelPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		if (!(org.jfree.chart.plot.MeterPlot.this.tickLabelPaint.equals(paint))) {
			org.jfree.chart.plot.MeterPlot.this.tickLabelPaint = paint;
			fireChangeEvent();
		}
	}

	public java.text.NumberFormat getTickLabelFormat() {
		return org.jfree.chart.plot.MeterPlot.this.tickLabelFormat;
	}

	public void setTickLabelFormat(java.text.NumberFormat format) {
		if (format == null) {
			throw new java.lang.IllegalArgumentException("Null 'format' argument.");
		}
		org.jfree.chart.plot.MeterPlot.this.tickLabelFormat = format;
		fireChangeEvent();
	}

	public java.awt.Font getValueFont() {
		return org.jfree.chart.plot.MeterPlot.this.valueFont;
	}

	public void setValueFont(java.awt.Font font) {
		if (font == null) {
			throw new java.lang.IllegalArgumentException("Null 'font' argument.");
		}
		org.jfree.chart.plot.MeterPlot.this.valueFont = font;
		fireChangeEvent();
	}

	public java.awt.Paint getValuePaint() {
		return org.jfree.chart.plot.MeterPlot.this.valuePaint;
	}

	public void setValuePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.MeterPlot.this.valuePaint = paint;
		fireChangeEvent();
	}

	public java.awt.Paint getDialBackgroundPaint() {
		return org.jfree.chart.plot.MeterPlot.this.dialBackgroundPaint;
	}

	public void setDialBackgroundPaint(java.awt.Paint paint) {
		org.jfree.chart.plot.MeterPlot.this.dialBackgroundPaint = paint;
		fireChangeEvent();
	}

	public boolean getDrawBorder() {
		return org.jfree.chart.plot.MeterPlot.this.drawBorder;
	}

	public void setDrawBorder(boolean draw) {
		org.jfree.chart.plot.MeterPlot.this.drawBorder = draw;
		fireChangeEvent();
	}

	public java.awt.Paint getDialOutlinePaint() {
		return org.jfree.chart.plot.MeterPlot.this.dialOutlinePaint;
	}

	public void setDialOutlinePaint(java.awt.Paint paint) {
		org.jfree.chart.plot.MeterPlot.this.dialOutlinePaint = paint;
		fireChangeEvent();
	}

	public org.jfree.data.general.ValueDataset getDataset() {
		return org.jfree.chart.plot.MeterPlot.this.dataset;
	}

	public void setDataset(org.jfree.data.general.ValueDataset dataset) {
		org.jfree.data.general.ValueDataset existing = org.jfree.chart.plot.MeterPlot.this.dataset;
		if (existing != null) {
			existing.removeChangeListener(org.jfree.chart.plot.MeterPlot.this);
		}
		org.jfree.chart.plot.MeterPlot.this.dataset = dataset;
		if (dataset != null) {
			setDatasetGroup(dataset.getGroup());
			dataset.addChangeListener(org.jfree.chart.plot.MeterPlot.this);
		}
		org.jfree.data.event.DatasetChangeEvent event = new org.jfree.data.event.DatasetChangeEvent(org.jfree.chart.plot.MeterPlot.this, dataset, new org.jfree.chart.event.DatasetChangeInfo());
		datasetChanged(event);
	}

	public java.util.List getIntervals() {
		return java.util.Collections.unmodifiableList(org.jfree.chart.plot.MeterPlot.this.intervals);
	}

	public void addInterval(org.jfree.chart.plot.MeterInterval interval) {
		if (interval == null) {
			throw new java.lang.IllegalArgumentException("Null 'interval' argument.");
		}
		org.jfree.chart.plot.MeterPlot.this.intervals.add(interval);
		fireChangeEvent();
	}

	public void clearIntervals() {
		org.jfree.chart.plot.MeterPlot.this.intervals.clear();
		fireChangeEvent();
	}

	public org.jfree.chart.LegendItemCollection getLegendItems() {
		org.jfree.chart.LegendItemCollection result = new org.jfree.chart.LegendItemCollection();
		java.util.Iterator iterator = org.jfree.chart.plot.MeterPlot.this.intervals.iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.plot.MeterInterval mi = ((org.jfree.chart.plot.MeterInterval) (iterator.next()));
			java.awt.Paint color = mi.getBackgroundPaint();
			if (color == null) {
				color = mi.getOutlinePaint();
			}
			org.jfree.chart.LegendItem item = new org.jfree.chart.LegendItem(mi.getLabel(), mi.getLabel(), null, null, new java.awt.geom.Rectangle2D.Double((-4.0), (-4.0), 8.0, 8.0), color);
			item.setDataset(getDataset());
			result.add(item);
		} 
		return result;
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.awt.geom.Point2D anchor, org.jfree.chart.plot.PlotState parentState, org.jfree.chart.plot.PlotRenderingInfo info) {
		if (info != null) {
			info.setPlotArea(area);
		}
		org.jfree.chart.util.RectangleInsets insets = getInsets();
		insets.trim(area);
		area.setRect(((area.getX()) + 4), ((area.getY()) + 4), ((area.getWidth()) - 8), ((area.getHeight()) - 8));
		if (org.jfree.chart.plot.MeterPlot.this.drawBorder) {
			drawBackground(g2, area);
		}
		double gapHorizontal = 2 * (org.jfree.chart.plot.MeterPlot.DEFAULT_BORDER_SIZE);
		double gapVertical = 2 * (org.jfree.chart.plot.MeterPlot.DEFAULT_BORDER_SIZE);
		double meterX = (area.getX()) + (gapHorizontal / 2);
		double meterY = (area.getY()) + (gapVertical / 2);
		double meterW = (area.getWidth()) - gapHorizontal;
		double meterH = ((area.getHeight()) - gapVertical) + (((org.jfree.chart.plot.MeterPlot.this.meterAngle) <= 180) && ((org.jfree.chart.plot.MeterPlot.this.shape) != (org.jfree.chart.plot.DialShape.CIRCLE)) ? (area.getHeight()) / 1.25 : 0);
		double min = (java.lang.Math.min(meterW, meterH)) / 2;
		meterX = (((meterX + meterX) + meterW) / 2) - min;
		meterY = (((meterY + meterY) + meterH) / 2) - min;
		meterW = 2 * min;
		meterH = 2 * min;
		java.awt.geom.Rectangle2D meterArea = new java.awt.geom.Rectangle2D.Double(meterX, meterY, meterW, meterH);
		java.awt.geom.Rectangle2D.Double originalArea = new java.awt.geom.Rectangle2D.Double(((meterArea.getX()) - 4), ((meterArea.getY()) - 4), ((meterArea.getWidth()) + 8), ((meterArea.getHeight()) + 8));
		double meterMiddleX = meterArea.getCenterX();
		double meterMiddleY = meterArea.getCenterY();
		org.jfree.data.general.ValueDataset data = getDataset();
		if (data != null) {
			double dataMin = org.jfree.chart.plot.MeterPlot.this.range.getLowerBound();
			double dataMax = org.jfree.chart.plot.MeterPlot.this.range.getUpperBound();
			java.awt.Shape savedClip = g2.getClip();
			g2.clip(originalArea);
			java.awt.Composite originalComposite = g2.getComposite();
			g2.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, getForegroundAlpha()));
			if ((org.jfree.chart.plot.MeterPlot.this.dialBackgroundPaint) != null) {
				fillArc(g2, originalArea, dataMin, dataMax, org.jfree.chart.plot.MeterPlot.this.dialBackgroundPaint, true);
			}
			drawTicks(g2, meterArea, dataMin, dataMax);
			drawArcForInterval(g2, meterArea, new org.jfree.chart.plot.MeterInterval("", org.jfree.chart.plot.MeterPlot.this.range, org.jfree.chart.plot.MeterPlot.this.dialOutlinePaint, new java.awt.BasicStroke(1.0F), null));
			java.util.Iterator iterator = org.jfree.chart.plot.MeterPlot.this.intervals.iterator();
			while (iterator.hasNext()) {
				org.jfree.chart.plot.MeterInterval interval = ((org.jfree.chart.plot.MeterInterval) (iterator.next()));
				drawArcForInterval(g2, meterArea, interval);
			} 
			java.lang.Number n = data.getValue();
			if (n != null) {
				double value = n.doubleValue();
				drawValueLabel(g2, meterArea);
				if (org.jfree.chart.plot.MeterPlot.this.range.contains(value)) {
					g2.setPaint(org.jfree.chart.plot.MeterPlot.this.needlePaint);
					g2.setStroke(new java.awt.BasicStroke(2.0F));
					double radius = (((meterArea.getWidth()) / 2) + (org.jfree.chart.plot.MeterPlot.DEFAULT_BORDER_SIZE)) + 15;
					double valueAngle = valueToAngle(value);
					double valueP1 = meterMiddleX + (radius * (java.lang.Math.cos(((java.lang.Math.PI) * (valueAngle / 180)))));
					double valueP2 = meterMiddleY - (radius * (java.lang.Math.sin(((java.lang.Math.PI) * (valueAngle / 180)))));
					java.awt.Polygon arrow = new java.awt.Polygon();
					if (((valueAngle > 135) && (valueAngle < 225)) || ((valueAngle < 45) && (valueAngle > (-45)))) {
						double valueP3 = meterMiddleY - ((org.jfree.chart.plot.MeterPlot.DEFAULT_CIRCLE_SIZE) / 4);
						double valueP4 = meterMiddleY + ((org.jfree.chart.plot.MeterPlot.DEFAULT_CIRCLE_SIZE) / 4);
						arrow.addPoint(((int) (meterMiddleX)), ((int) (valueP3)));
						arrow.addPoint(((int) (meterMiddleX)), ((int) (valueP4)));
					}else {
						arrow.addPoint(((int) (meterMiddleX - ((org.jfree.chart.plot.MeterPlot.DEFAULT_CIRCLE_SIZE) / 4))), ((int) (meterMiddleY)));
						arrow.addPoint(((int) (meterMiddleX + ((org.jfree.chart.plot.MeterPlot.DEFAULT_CIRCLE_SIZE) / 4))), ((int) (meterMiddleY)));
					}
					arrow.addPoint(((int) (valueP1)), ((int) (valueP2)));
					g2.fill(arrow);
					java.awt.geom.Ellipse2D circle = new java.awt.geom.Ellipse2D.Double((meterMiddleX - ((org.jfree.chart.plot.MeterPlot.DEFAULT_CIRCLE_SIZE) / 2)), (meterMiddleY - ((org.jfree.chart.plot.MeterPlot.DEFAULT_CIRCLE_SIZE) / 2)), org.jfree.chart.plot.MeterPlot.DEFAULT_CIRCLE_SIZE, org.jfree.chart.plot.MeterPlot.DEFAULT_CIRCLE_SIZE);
					g2.fill(circle);
				}
			}
			g2.setClip(savedClip);
			g2.setComposite(originalComposite);
		}
		if (org.jfree.chart.plot.MeterPlot.this.drawBorder) {
			drawOutline(g2, area);
		}
	}

	protected void drawArcForInterval(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D meterArea, org.jfree.chart.plot.MeterInterval interval) {
		double minValue = interval.getRange().getLowerBound();
		double maxValue = interval.getRange().getUpperBound();
		java.awt.Paint outlinePaint = interval.getOutlinePaint();
		java.awt.Stroke outlineStroke = interval.getOutlineStroke();
		java.awt.Paint backgroundPaint = interval.getBackgroundPaint();
		if (backgroundPaint != null) {
			fillArc(g2, meterArea, minValue, maxValue, backgroundPaint, false);
		}
		if (outlinePaint != null) {
			if (outlineStroke != null) {
				drawArc(g2, meterArea, minValue, maxValue, outlinePaint, outlineStroke);
			}
			drawTick(g2, meterArea, minValue, true);
			drawTick(g2, meterArea, maxValue, true);
		}
	}

	protected void drawArc(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, double minValue, double maxValue, java.awt.Paint paint, java.awt.Stroke stroke) {
		double startAngle = valueToAngle(maxValue);
		double endAngle = valueToAngle(minValue);
		double extent = endAngle - startAngle;
		double x = area.getX();
		double y = area.getY();
		double w = area.getWidth();
		double h = area.getHeight();
		g2.setPaint(paint);
		g2.setStroke(stroke);
		if ((paint != null) && (stroke != null)) {
			java.awt.geom.Arc2D.Double arc = new java.awt.geom.Arc2D.Double(x, y, w, h, startAngle, extent, java.awt.geom.Arc2D.OPEN);
			g2.setPaint(paint);
			g2.setStroke(stroke);
			g2.draw(arc);
		}
	}

	protected void fillArc(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, double minValue, double maxValue, java.awt.Paint paint, boolean dial) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument");
		}
		double startAngle = valueToAngle(maxValue);
		double endAngle = valueToAngle(minValue);
		double extent = endAngle - startAngle;
		double x = area.getX();
		double y = area.getY();
		double w = area.getWidth();
		double h = area.getHeight();
		int joinType = java.awt.geom.Arc2D.OPEN;
		if ((org.jfree.chart.plot.MeterPlot.this.shape) == (org.jfree.chart.plot.DialShape.PIE)) {
			joinType = java.awt.geom.Arc2D.PIE;
		}else
			if ((org.jfree.chart.plot.MeterPlot.this.shape) == (org.jfree.chart.plot.DialShape.CHORD)) {
				if (dial && ((org.jfree.chart.plot.MeterPlot.this.meterAngle) > 180)) {
					joinType = java.awt.geom.Arc2D.CHORD;
				}else {
					joinType = java.awt.geom.Arc2D.PIE;
				}
			}else
				if ((org.jfree.chart.plot.MeterPlot.this.shape) == (org.jfree.chart.plot.DialShape.CIRCLE)) {
					joinType = java.awt.geom.Arc2D.PIE;
					if (dial) {
						extent = 360;
					}
				}else {
					throw new java.lang.IllegalStateException("DialShape not recognised.");
				}
			
		
		g2.setPaint(paint);
		java.awt.geom.Arc2D.Double arc = new java.awt.geom.Arc2D.Double(x, y, w, h, startAngle, extent, joinType);
		g2.fill(arc);
	}

	public double valueToAngle(double value) {
		value = value - (org.jfree.chart.plot.MeterPlot.this.range.getLowerBound());
		double baseAngle = 180 + (((org.jfree.chart.plot.MeterPlot.this.meterAngle) - 180) / 2);
		return baseAngle - ((value / (org.jfree.chart.plot.MeterPlot.this.range.getLength())) * (org.jfree.chart.plot.MeterPlot.this.meterAngle));
	}

	protected void drawTicks(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D meterArea, double minValue, double maxValue) {
		for (double v = minValue; v <= maxValue; v += org.jfree.chart.plot.MeterPlot.this.tickSize) {
			drawTick(g2, meterArea, v);
		}
	}

	protected void drawTick(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D meterArea, double value) {
		drawTick(g2, meterArea, value, false);
	}

	protected void drawTick(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D meterArea, double value, boolean label) {
		double valueAngle = valueToAngle(value);
		double meterMiddleX = meterArea.getCenterX();
		double meterMiddleY = meterArea.getCenterY();
		g2.setPaint(org.jfree.chart.plot.MeterPlot.this.tickPaint);
		g2.setStroke(new java.awt.BasicStroke(2.0F));
		double valueP2X = 0;
		double valueP2Y = 0;
		double radius = ((meterArea.getWidth()) / 2) + (org.jfree.chart.plot.MeterPlot.DEFAULT_BORDER_SIZE);
		double radius1 = radius - 15;
		double valueP1X = meterMiddleX + (radius * (java.lang.Math.cos(((java.lang.Math.PI) * (valueAngle / 180)))));
		double valueP1Y = meterMiddleY - (radius * (java.lang.Math.sin(((java.lang.Math.PI) * (valueAngle / 180)))));
		valueP2X = meterMiddleX + (radius1 * (java.lang.Math.cos(((java.lang.Math.PI) * (valueAngle / 180)))));
		valueP2Y = meterMiddleY - (radius1 * (java.lang.Math.sin(((java.lang.Math.PI) * (valueAngle / 180)))));
		java.awt.geom.Line2D.Double line = new java.awt.geom.Line2D.Double(valueP1X, valueP1Y, valueP2X, valueP2Y);
		g2.draw(line);
		if ((org.jfree.chart.plot.MeterPlot.this.tickLabelsVisible) && label) {
			java.lang.String tickLabel = org.jfree.chart.plot.MeterPlot.this.tickLabelFormat.format(value);
			g2.setFont(org.jfree.chart.plot.MeterPlot.this.tickLabelFont);
			g2.setPaint(org.jfree.chart.plot.MeterPlot.this.tickLabelPaint);
			java.awt.FontMetrics fm = g2.getFontMetrics();
			java.awt.geom.Rectangle2D tickLabelBounds = org.jfree.chart.text.TextUtilities.getTextBounds(tickLabel, g2, fm);
			double x = valueP2X;
			double y = valueP2Y;
			if ((valueAngle == 90) || (valueAngle == 270)) {
				x = x - ((tickLabelBounds.getWidth()) / 2);
			}else
				if ((valueAngle < 90) || (valueAngle > 270)) {
					x = x - (tickLabelBounds.getWidth());
				}
			
			if ((((valueAngle > 135) && (valueAngle < 225)) || (valueAngle > 315)) || (valueAngle < 45)) {
				y = y - ((tickLabelBounds.getHeight()) / 2);
			}else {
				y = y + ((tickLabelBounds.getHeight()) / 2);
			}
			g2.drawString(tickLabel, ((float) (x)), ((float) (y)));
		}
	}

	protected void drawValueLabel(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area) {
		g2.setFont(org.jfree.chart.plot.MeterPlot.this.valueFont);
		g2.setPaint(org.jfree.chart.plot.MeterPlot.this.valuePaint);
		java.lang.String valueStr = "No value";
		if ((org.jfree.chart.plot.MeterPlot.this.dataset) != null) {
			java.lang.Number n = org.jfree.chart.plot.MeterPlot.this.dataset.getValue();
			if (n != null) {
				valueStr = ((org.jfree.chart.plot.MeterPlot.this.tickLabelFormat.format(n.doubleValue())) + " ") + (org.jfree.chart.plot.MeterPlot.this.units);
			}
		}
		float x = ((float) (area.getCenterX()));
		float y = ((float) (area.getCenterY())) + (org.jfree.chart.plot.MeterPlot.DEFAULT_CIRCLE_SIZE);
		org.jfree.chart.text.TextUtilities.drawAlignedString(valueStr, g2, x, y, org.jfree.chart.text.TextAnchor.TOP_CENTER);
	}

	public java.lang.String getPlotType() {
		return org.jfree.chart.plot.MeterPlot.localizationResources.getString("Meter_Plot");
	}

	public void zoom(double percent) {
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.MeterPlot.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.MeterPlot)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.chart.plot.MeterPlot that = ((org.jfree.chart.plot.MeterPlot) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.MeterPlot.this.units, that.units))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.MeterPlot.this.range, that.range))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.MeterPlot.this.intervals, that.intervals))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.MeterPlot.this.dialOutlinePaint, that.dialOutlinePaint))) {
			return false;
		}
		if ((org.jfree.chart.plot.MeterPlot.this.shape) != (that.shape)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.MeterPlot.this.dialBackgroundPaint, that.dialBackgroundPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.MeterPlot.this.needlePaint, that.needlePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.MeterPlot.this.valueFont, that.valueFont))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.MeterPlot.this.valuePaint, that.valuePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.MeterPlot.this.tickPaint, that.tickPaint))) {
			return false;
		}
		if ((org.jfree.chart.plot.MeterPlot.this.tickSize) != (that.tickSize)) {
			return false;
		}
		if ((org.jfree.chart.plot.MeterPlot.this.tickLabelsVisible) != (that.tickLabelsVisible)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.MeterPlot.this.tickLabelFont, that.tickLabelFont))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.MeterPlot.this.tickLabelPaint, that.tickLabelPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.MeterPlot.this.tickLabelFormat, that.tickLabelFormat))) {
			return false;
		}
		if ((org.jfree.chart.plot.MeterPlot.this.drawBorder) != (that.drawBorder)) {
			return false;
		}
		if ((org.jfree.chart.plot.MeterPlot.this.meterAngle) != (that.meterAngle)) {
			return false;
		}
		return true;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.MeterPlot.this.dialBackgroundPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.MeterPlot.this.dialOutlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.MeterPlot.this.needlePaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.MeterPlot.this.valuePaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.MeterPlot.this.tickPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.MeterPlot.this.tickLabelPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.plot.MeterPlot.this.dialBackgroundPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.MeterPlot.this.dialOutlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.MeterPlot.this.needlePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.MeterPlot.this.valuePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.MeterPlot.this.tickPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.MeterPlot.this.tickLabelPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		if ((org.jfree.chart.plot.MeterPlot.this.dataset) != null) {
			org.jfree.chart.plot.MeterPlot.this.dataset.addChangeListener(org.jfree.chart.plot.MeterPlot.this);
		}
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.plot.MeterPlot clone = ((org.jfree.chart.plot.MeterPlot) (super.clone()));
		clone.tickLabelFormat = ((java.text.NumberFormat) (org.jfree.chart.plot.MeterPlot.this.tickLabelFormat.clone()));
		clone.intervals = new java.util.ArrayList(org.jfree.chart.plot.MeterPlot.this.intervals);
		if ((clone.dataset) != null) {
			clone.dataset.addChangeListener(clone);
		}
		return clone;
	}
}

