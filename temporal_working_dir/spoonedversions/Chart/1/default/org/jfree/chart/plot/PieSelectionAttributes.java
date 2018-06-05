

package org.jfree.chart.plot;


public class PieSelectionAttributes implements java.io.Serializable , java.lang.Cloneable {
	private boolean allowNull;

	private org.jfree.chart.util.PaintMap sectionPaint;

	private java.awt.Paint defaultPaint;

	private org.jfree.chart.util.PaintMap sectionOutlinePaint;

	private java.awt.Paint defaultOutlinePaint;

	private org.jfree.chart.util.StrokeMap sectionOutlineStroke;

	private java.awt.Stroke defaultOutlineStroke;

	private org.jfree.chart.util.BooleanList labelsVisibleList;

	private java.lang.Boolean defaultLabelVisible;

	private org.jfree.chart.util.ObjectList labelFontList;

	private java.awt.Font defaultLabelFont;

	private org.jfree.chart.util.PaintList labelPaintList;

	private java.awt.Paint defaultLabelPaint;

	private org.jfree.chart.util.BooleanList createEntityList;

	private java.lang.Boolean defaultCreateEntity;

	public PieSelectionAttributes() {
		this(true);
	}

	public PieSelectionAttributes(boolean allowNull) {
		org.jfree.chart.plot.PieSelectionAttributes.this.sectionPaint = new org.jfree.chart.util.PaintMap();
		org.jfree.chart.plot.PieSelectionAttributes.this.defaultPaint = (allowNull) ? null : java.awt.Color.BLACK;
		org.jfree.chart.plot.PieSelectionAttributes.this.sectionOutlinePaint = new org.jfree.chart.util.PaintMap();
		org.jfree.chart.plot.PieSelectionAttributes.this.defaultOutlinePaint = (allowNull) ? null : java.awt.Color.BLACK;
		org.jfree.chart.plot.PieSelectionAttributes.this.sectionOutlineStroke = new org.jfree.chart.util.StrokeMap();
		org.jfree.chart.plot.PieSelectionAttributes.this.defaultOutlineStroke = (allowNull) ? null : new java.awt.BasicStroke(2.0F);
	}

	public boolean getAllowNull() {
		return org.jfree.chart.plot.PieSelectionAttributes.this.allowNull;
	}

	protected java.awt.Paint lookupSectionPaint(java.lang.Comparable key) {
		java.awt.Paint result = org.jfree.chart.plot.PieSelectionAttributes.this.sectionPaint.getPaint(key);
		if (result == null) {
			result = org.jfree.chart.plot.PieSelectionAttributes.this.defaultPaint;
		}
		return result;
	}

	public java.awt.Paint getSectionPaint(java.lang.Comparable key) {
		return org.jfree.chart.plot.PieSelectionAttributes.this.sectionPaint.getPaint(key);
	}

	public void setSeriesPaint(java.lang.Comparable key, java.awt.Paint paint) {
		org.jfree.chart.plot.PieSelectionAttributes.this.sectionPaint.put(key, paint);
	}

	public java.awt.Paint getDefaultPaint() {
		return org.jfree.chart.plot.PieSelectionAttributes.this.defaultPaint;
	}

	public void setDefaultPaint(java.awt.Paint paint) {
		if ((paint == null) && (!(org.jfree.chart.plot.PieSelectionAttributes.this.allowNull))) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.PieSelectionAttributes.this.defaultPaint = paint;
	}

	protected java.awt.Paint lookupSectionOutlinePaint(java.lang.Comparable key) {
		java.awt.Paint result = org.jfree.chart.plot.PieSelectionAttributes.this.sectionOutlinePaint.getPaint(key);
		if (result == null) {
			result = org.jfree.chart.plot.PieSelectionAttributes.this.defaultOutlinePaint;
		}
		return result;
	}

	public java.awt.Paint getSectionOutlinePaint(java.lang.Comparable key) {
		return org.jfree.chart.plot.PieSelectionAttributes.this.sectionOutlinePaint.getPaint(key);
	}

	public void setSectionOutlinePaint(java.lang.Comparable key, java.awt.Paint paint) {
		org.jfree.chart.plot.PieSelectionAttributes.this.sectionOutlinePaint.put(key, paint);
	}

	public java.awt.Paint getDefaultOutlinePaint() {
		return org.jfree.chart.plot.PieSelectionAttributes.this.defaultOutlinePaint;
	}

	public void setDefaultOutlinePaint(java.awt.Paint paint) {
		if ((paint == null) && (!(org.jfree.chart.plot.PieSelectionAttributes.this.allowNull))) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.PieSelectionAttributes.this.defaultOutlinePaint = paint;
	}

	protected java.awt.Stroke lookupSectionOutlineStroke(java.lang.Comparable key) {
		java.awt.Stroke result = org.jfree.chart.plot.PieSelectionAttributes.this.sectionOutlineStroke.getStroke(key);
		if (result == null) {
			result = org.jfree.chart.plot.PieSelectionAttributes.this.defaultOutlineStroke;
		}
		return result;
	}

	public java.awt.Stroke getSectionOutlineStroke(java.lang.Comparable key) {
		return org.jfree.chart.plot.PieSelectionAttributes.this.sectionOutlineStroke.getStroke(key);
	}

	public void setSectionOutlineStroke(java.lang.Comparable key, java.awt.Stroke stroke) {
		org.jfree.chart.plot.PieSelectionAttributes.this.sectionOutlineStroke.put(key, stroke);
	}

	public java.awt.Stroke getDefaultOutlineStroke() {
		return org.jfree.chart.plot.PieSelectionAttributes.this.defaultOutlineStroke;
	}

	public void setDefaultOutlineStroke(java.awt.Stroke stroke) {
		if ((stroke == null) && (!(org.jfree.chart.plot.PieSelectionAttributes.this.allowNull))) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.plot.PieSelectionAttributes.this.defaultOutlineStroke = stroke;
	}

	public java.lang.Boolean isLabelVisible(int series, int item) {
		return lookupSeriesLabelVisible(series);
	}

	protected java.lang.Boolean lookupSeriesLabelVisible(int series) {
		java.lang.Boolean result = org.jfree.chart.plot.PieSelectionAttributes.this.labelsVisibleList.getBoolean(series);
		if (result == null) {
			result = org.jfree.chart.plot.PieSelectionAttributes.this.defaultLabelVisible;
		}
		return result;
	}

	public java.lang.Boolean getSeriesLabelVisible(int series) {
		return org.jfree.chart.plot.PieSelectionAttributes.this.labelsVisibleList.getBoolean(series);
	}

	public void setSeriesLabelVisible(int series, java.lang.Boolean visible) {
		org.jfree.chart.plot.PieSelectionAttributes.this.labelsVisibleList.setBoolean(series, visible);
	}

	public java.lang.Boolean getDefaultLabelVisible() {
		return org.jfree.chart.plot.PieSelectionAttributes.this.defaultLabelVisible;
	}

	public void setDefaultLabelVisible(java.lang.Boolean visible) {
		if ((visible == null) && (!(org.jfree.chart.plot.PieSelectionAttributes.this.allowNull))) {
			throw new java.lang.IllegalArgumentException("Null 'visible' argument.");
		}
		org.jfree.chart.plot.PieSelectionAttributes.this.defaultLabelVisible = visible;
	}

	public java.awt.Font getItemLabelFont(int series, int item) {
		return lookupSeriesLabelFont(series);
	}

	protected java.awt.Font lookupSeriesLabelFont(int series) {
		java.awt.Font result = ((java.awt.Font) (org.jfree.chart.plot.PieSelectionAttributes.this.labelFontList.get(series)));
		if (result == null) {
			result = org.jfree.chart.plot.PieSelectionAttributes.this.defaultLabelFont;
		}
		return result;
	}

	public java.awt.Font getSeriesLabelFont(int series) {
		return ((java.awt.Font) (org.jfree.chart.plot.PieSelectionAttributes.this.labelFontList.get(series)));
	}

	public void setSeriesLabelFont(int series, java.awt.Font font) {
		org.jfree.chart.plot.PieSelectionAttributes.this.labelFontList.set(series, font);
	}

	public java.awt.Font getDefaultLabelFont() {
		return org.jfree.chart.plot.PieSelectionAttributes.this.defaultLabelFont;
	}

	public void setDefaultLabelFont(java.awt.Font font) {
		if ((font == null) && (!(org.jfree.chart.plot.PieSelectionAttributes.this.allowNull))) {
			throw new java.lang.IllegalArgumentException("Null 'font' argument.");
		}
		org.jfree.chart.plot.PieSelectionAttributes.this.defaultLabelFont = font;
	}

	public java.awt.Paint getItemLabelPaint(int series, int item) {
		return lookupSeriesLabelPaint(series);
	}

	protected java.awt.Paint lookupSeriesLabelPaint(int series) {
		java.awt.Paint result = org.jfree.chart.plot.PieSelectionAttributes.this.labelPaintList.getPaint(series);
		if (result == null) {
			result = org.jfree.chart.plot.PieSelectionAttributes.this.defaultLabelPaint;
		}
		return result;
	}

	public java.awt.Paint getSeriesLabelPaint(int series) {
		return org.jfree.chart.plot.PieSelectionAttributes.this.labelPaintList.getPaint(series);
	}

	public void setSeriesLabelPaint(int series, java.awt.Paint paint) {
		org.jfree.chart.plot.PieSelectionAttributes.this.labelPaintList.setPaint(series, paint);
	}

	public java.awt.Paint getDefaultLabelPaint() {
		return org.jfree.chart.plot.PieSelectionAttributes.this.defaultLabelPaint;
	}

	public void setDefaultLabelPaint(java.awt.Paint paint) {
		if ((paint == null) && (!(org.jfree.chart.plot.PieSelectionAttributes.this.allowNull))) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.PieSelectionAttributes.this.defaultLabelPaint = paint;
	}

	public java.lang.Boolean getCreateEntity(int series, int item) {
		return lookupSeriesCreateEntity(series);
	}

	protected java.lang.Boolean lookupSeriesCreateEntity(int series) {
		java.lang.Boolean result = org.jfree.chart.plot.PieSelectionAttributes.this.createEntityList.getBoolean(series);
		if (result == null) {
			result = org.jfree.chart.plot.PieSelectionAttributes.this.defaultCreateEntity;
		}
		return result;
	}

	public java.lang.Boolean getSeriesCreateEntity(int series) {
		return org.jfree.chart.plot.PieSelectionAttributes.this.createEntityList.getBoolean(series);
	}

	public void setSeriesCreateEntity(int series, java.lang.Boolean visible) {
		org.jfree.chart.plot.PieSelectionAttributes.this.createEntityList.setBoolean(series, visible);
	}

	public java.lang.Boolean getDefaultCreateEntity() {
		return org.jfree.chart.plot.PieSelectionAttributes.this.defaultCreateEntity;
	}

	public void setDefaultCreateEntity(java.lang.Boolean create) {
		if ((create == null) && (!(org.jfree.chart.plot.PieSelectionAttributes.this.allowNull))) {
			throw new java.lang.IllegalArgumentException("Null 'create' argument.");
		}
		org.jfree.chart.plot.PieSelectionAttributes.this.defaultCreateEntity = create;
	}
}

