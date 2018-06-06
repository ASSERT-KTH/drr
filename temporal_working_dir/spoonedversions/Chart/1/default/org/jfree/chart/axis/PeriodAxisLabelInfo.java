

package org.jfree.chart.axis;


public class PeriodAxisLabelInfo implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = 5710451740920277357L;

	public static final org.jfree.chart.util.RectangleInsets DEFAULT_INSETS = new org.jfree.chart.util.RectangleInsets(2, 2, 2, 2);

	public static final java.awt.Font DEFAULT_FONT = new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 10);

	public static final java.awt.Paint DEFAULT_LABEL_PAINT = java.awt.Color.black;

	public static final java.awt.Stroke DEFAULT_DIVIDER_STROKE = new java.awt.BasicStroke(0.5F);

	public static final java.awt.Paint DEFAULT_DIVIDER_PAINT = java.awt.Color.gray;

	private java.lang.Class periodClass;

	private org.jfree.chart.util.RectangleInsets padding;

	private java.text.DateFormat dateFormat;

	private java.awt.Font labelFont;

	private transient java.awt.Paint labelPaint;

	private boolean drawDividers;

	private transient java.awt.Stroke dividerStroke;

	private transient java.awt.Paint dividerPaint;

	public PeriodAxisLabelInfo(java.lang.Class periodClass, java.text.DateFormat dateFormat) {
		this(periodClass, dateFormat, org.jfree.chart.axis.PeriodAxisLabelInfo.DEFAULT_INSETS, org.jfree.chart.axis.PeriodAxisLabelInfo.DEFAULT_FONT, org.jfree.chart.axis.PeriodAxisLabelInfo.DEFAULT_LABEL_PAINT, true, org.jfree.chart.axis.PeriodAxisLabelInfo.DEFAULT_DIVIDER_STROKE, org.jfree.chart.axis.PeriodAxisLabelInfo.DEFAULT_DIVIDER_PAINT);
	}

	public PeriodAxisLabelInfo(java.lang.Class periodClass, java.text.DateFormat dateFormat, org.jfree.chart.util.RectangleInsets padding, java.awt.Font labelFont, java.awt.Paint labelPaint, boolean drawDividers, java.awt.Stroke dividerStroke, java.awt.Paint dividerPaint) {
		if (periodClass == null) {
			throw new java.lang.IllegalArgumentException("Null 'periodClass' argument.");
		}
		if (dateFormat == null) {
			throw new java.lang.IllegalArgumentException("Null 'dateFormat' argument.");
		}
		if (padding == null) {
			throw new java.lang.IllegalArgumentException("Null 'padding' argument.");
		}
		if (labelFont == null) {
			throw new java.lang.IllegalArgumentException("Null 'labelFont' argument.");
		}
		if (labelPaint == null) {
			throw new java.lang.IllegalArgumentException("Null 'labelPaint' argument.");
		}
		if (dividerStroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'dividerStroke' argument.");
		}
		if (dividerPaint == null) {
			throw new java.lang.IllegalArgumentException("Null 'dividerPaint' argument.");
		}
		org.jfree.chart.axis.PeriodAxisLabelInfo.this.periodClass = periodClass;
		org.jfree.chart.axis.PeriodAxisLabelInfo.this.dateFormat = dateFormat;
		org.jfree.chart.axis.PeriodAxisLabelInfo.this.padding = padding;
		org.jfree.chart.axis.PeriodAxisLabelInfo.this.labelFont = labelFont;
		org.jfree.chart.axis.PeriodAxisLabelInfo.this.labelPaint = labelPaint;
		org.jfree.chart.axis.PeriodAxisLabelInfo.this.drawDividers = drawDividers;
		org.jfree.chart.axis.PeriodAxisLabelInfo.this.dividerStroke = dividerStroke;
		org.jfree.chart.axis.PeriodAxisLabelInfo.this.dividerPaint = dividerPaint;
	}

	public java.lang.Class getPeriodClass() {
		return org.jfree.chart.axis.PeriodAxisLabelInfo.this.periodClass;
	}

	public java.text.DateFormat getDateFormat() {
		return org.jfree.chart.axis.PeriodAxisLabelInfo.this.dateFormat;
	}

	public org.jfree.chart.util.RectangleInsets getPadding() {
		return org.jfree.chart.axis.PeriodAxisLabelInfo.this.padding;
	}

	public java.awt.Font getLabelFont() {
		return org.jfree.chart.axis.PeriodAxisLabelInfo.this.labelFont;
	}

	public java.awt.Paint getLabelPaint() {
		return org.jfree.chart.axis.PeriodAxisLabelInfo.this.labelPaint;
	}

	public boolean getDrawDividers() {
		return org.jfree.chart.axis.PeriodAxisLabelInfo.this.drawDividers;
	}

	public java.awt.Stroke getDividerStroke() {
		return org.jfree.chart.axis.PeriodAxisLabelInfo.this.dividerStroke;
	}

	public java.awt.Paint getDividerPaint() {
		return org.jfree.chart.axis.PeriodAxisLabelInfo.this.dividerPaint;
	}

	public org.jfree.data.time.RegularTimePeriod createInstance(java.util.Date millisecond, java.util.TimeZone zone, java.util.Locale locale) {
		org.jfree.data.time.RegularTimePeriod result = null;
		try {
			java.lang.reflect.Constructor c = org.jfree.chart.axis.PeriodAxisLabelInfo.this.periodClass.getDeclaredConstructor(new java.lang.Class[]{ java.util.Date.class , java.util.TimeZone.class , java.util.Locale.class });
			result = ((org.jfree.data.time.RegularTimePeriod) (c.newInstance(new java.lang.Object[]{ millisecond , zone , locale })));
		} catch (java.lang.Exception e) {
		}
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.axis.PeriodAxisLabelInfo.this)) {
			return true;
		}
		if (obj instanceof org.jfree.chart.axis.PeriodAxisLabelInfo) {
			org.jfree.chart.axis.PeriodAxisLabelInfo info = ((org.jfree.chart.axis.PeriodAxisLabelInfo) (obj));
			if (!(info.periodClass.equals(org.jfree.chart.axis.PeriodAxisLabelInfo.this.periodClass))) {
				return false;
			}
			if (!(info.dateFormat.equals(org.jfree.chart.axis.PeriodAxisLabelInfo.this.dateFormat))) {
				return false;
			}
			if (!(info.padding.equals(org.jfree.chart.axis.PeriodAxisLabelInfo.this.padding))) {
				return false;
			}
			if (!(info.labelFont.equals(org.jfree.chart.axis.PeriodAxisLabelInfo.this.labelFont))) {
				return false;
			}
			if (!(info.labelPaint.equals(org.jfree.chart.axis.PeriodAxisLabelInfo.this.labelPaint))) {
				return false;
			}
			if ((info.drawDividers) != (org.jfree.chart.axis.PeriodAxisLabelInfo.this.drawDividers)) {
				return false;
			}
			if (!(info.dividerStroke.equals(org.jfree.chart.axis.PeriodAxisLabelInfo.this.dividerStroke))) {
				return false;
			}
			if (!(info.dividerPaint.equals(org.jfree.chart.axis.PeriodAxisLabelInfo.this.dividerPaint))) {
				return false;
			}
			return true;
		}
		return false;
	}

	public int hashCode() {
		int result = 41;
		result = 37 * (org.jfree.chart.axis.PeriodAxisLabelInfo.this.periodClass.hashCode());
		result = 37 * (org.jfree.chart.axis.PeriodAxisLabelInfo.this.dateFormat.hashCode());
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.axis.PeriodAxisLabelInfo.this.labelPaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.axis.PeriodAxisLabelInfo.this.dividerStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.axis.PeriodAxisLabelInfo.this.dividerPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.axis.PeriodAxisLabelInfo.this.labelPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.axis.PeriodAxisLabelInfo.this.dividerStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.axis.PeriodAxisLabelInfo.this.dividerPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}

