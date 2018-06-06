

package org.jfree.chart.renderer;


public class RenderAttributes implements java.io.Serializable , java.lang.Cloneable {
	private boolean allowNull;

	private org.jfree.chart.util.PaintList paintList;

	private java.awt.Paint defaultPaint;

	private org.jfree.chart.util.StrokeList strokeList;

	private java.awt.Stroke defaultStroke;

	private org.jfree.chart.util.ShapeList shapeList;

	private java.awt.Shape defaultShape;

	private org.jfree.chart.util.PaintList fillPaintList;

	private java.awt.Paint defaultFillPaint;

	private org.jfree.chart.util.PaintList outlinePaintList;

	private java.awt.Paint defaultOutlinePaint;

	private org.jfree.chart.util.StrokeList outlineStrokeList;

	private java.awt.Stroke defaultOutlineStroke;

	private org.jfree.chart.util.BooleanList labelsVisibleList;

	private java.lang.Boolean defaultLabelVisible;

	private org.jfree.chart.util.ObjectList labelFontList;

	private java.awt.Font defaultLabelFont;

	private org.jfree.chart.util.PaintList labelPaintList;

	private java.awt.Paint defaultLabelPaint;

	private org.jfree.chart.util.ObjectList positionItemLabelPositionList;

	private org.jfree.chart.labels.ItemLabelPosition defaultPositiveItemLabelPosition;

	private org.jfree.chart.util.ObjectList negativeItemLabelPositionList;

	private org.jfree.chart.labels.ItemLabelPosition defaultNegativeItemLabelPosition;

	private org.jfree.chart.util.BooleanList createEntityList;

	private java.lang.Boolean defaultCreateEntity;

	public RenderAttributes() {
		this(true);
	}

	public RenderAttributes(boolean allowNull) {
		org.jfree.chart.renderer.RenderAttributes.this.paintList = new org.jfree.chart.util.PaintList();
		org.jfree.chart.renderer.RenderAttributes.this.defaultPaint = (allowNull) ? null : java.awt.Color.BLACK;
		org.jfree.chart.renderer.RenderAttributes.this.strokeList = new org.jfree.chart.util.StrokeList();
		org.jfree.chart.renderer.RenderAttributes.this.defaultStroke = (allowNull) ? null : new java.awt.BasicStroke(1.0F);
		org.jfree.chart.renderer.RenderAttributes.this.fillPaintList = new org.jfree.chart.util.PaintList();
		org.jfree.chart.renderer.RenderAttributes.this.defaultFillPaint = (allowNull) ? null : java.awt.Color.BLACK;
		org.jfree.chart.renderer.RenderAttributes.this.outlinePaintList = new org.jfree.chart.util.PaintList();
		org.jfree.chart.renderer.RenderAttributes.this.defaultOutlinePaint = (allowNull) ? null : java.awt.Color.BLACK;
		org.jfree.chart.renderer.RenderAttributes.this.shapeList = new org.jfree.chart.util.ShapeList();
	}

	public boolean getAllowNull() {
		return org.jfree.chart.renderer.RenderAttributes.this.allowNull;
	}

	public java.awt.Paint getItemPaint(int series, int item) {
		return lookupSeriesPaint(series);
	}

	protected java.awt.Paint lookupSeriesPaint(int series) {
		java.awt.Paint result = org.jfree.chart.renderer.RenderAttributes.this.paintList.getPaint(series);
		if (result == null) {
			result = org.jfree.chart.renderer.RenderAttributes.this.defaultPaint;
		}
		return result;
	}

	public java.awt.Paint getSeriesPaint(int series) {
		return org.jfree.chart.renderer.RenderAttributes.this.paintList.getPaint(series);
	}

	public void setSeriesPaint(int series, java.awt.Paint paint) {
		org.jfree.chart.renderer.RenderAttributes.this.paintList.setPaint(series, paint);
	}

	public java.awt.Paint getDefaultPaint() {
		return org.jfree.chart.renderer.RenderAttributes.this.defaultPaint;
	}

	public void setDefaultPaint(java.awt.Paint paint) {
		if ((paint == null) && (!(org.jfree.chart.renderer.RenderAttributes.this.allowNull))) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.renderer.RenderAttributes.this.defaultPaint = paint;
	}

	public java.awt.Stroke getItemStroke(int series, int item) {
		return lookupSeriesStroke(series);
	}

	protected java.awt.Stroke lookupSeriesStroke(int series) {
		java.awt.Stroke result = org.jfree.chart.renderer.RenderAttributes.this.strokeList.getStroke(series);
		if (result == null) {
			result = org.jfree.chart.renderer.RenderAttributes.this.defaultStroke;
		}
		return result;
	}

	public java.awt.Stroke getSeriesStroke(int series) {
		return org.jfree.chart.renderer.RenderAttributes.this.strokeList.getStroke(series);
	}

	public void setSeriesStroke(int series, java.awt.Stroke stroke) {
		org.jfree.chart.renderer.RenderAttributes.this.strokeList.setStroke(series, stroke);
	}

	public java.awt.Stroke getDefaultStroke() {
		return org.jfree.chart.renderer.RenderAttributes.this.defaultStroke;
	}

	public void setDefaultStroke(java.awt.Stroke stroke) {
		if ((stroke == null) && (!(org.jfree.chart.renderer.RenderAttributes.this.allowNull))) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.renderer.RenderAttributes.this.defaultStroke = stroke;
	}

	public java.awt.Shape getItemShape(int series, int item) {
		return lookupSeriesShape(series);
	}

	protected java.awt.Shape lookupSeriesShape(int series) {
		java.awt.Shape result = org.jfree.chart.renderer.RenderAttributes.this.shapeList.getShape(series);
		if (result == null) {
			result = org.jfree.chart.renderer.RenderAttributes.this.defaultShape;
		}
		return result;
	}

	public java.awt.Shape getSeriesShape(int series) {
		return org.jfree.chart.renderer.RenderAttributes.this.shapeList.getShape(series);
	}

	public void setSeriesShape(int series, java.awt.Shape shape) {
		org.jfree.chart.renderer.RenderAttributes.this.shapeList.setShape(series, shape);
	}

	public java.awt.Shape getDefaultShape() {
		return org.jfree.chart.renderer.RenderAttributes.this.defaultShape;
	}

	public void setDefaultShape(java.awt.Shape shape) {
		if ((shape == null) && (!(org.jfree.chart.renderer.RenderAttributes.this.allowNull))) {
			throw new java.lang.IllegalArgumentException("Null 'shape' argument.");
		}
		org.jfree.chart.renderer.RenderAttributes.this.defaultShape = shape;
	}

	public java.awt.Paint getItemFillPaint(int series, int item) {
		return lookupSeriesFillPaint(series);
	}

	protected java.awt.Paint lookupSeriesFillPaint(int series) {
		java.awt.Paint result = org.jfree.chart.renderer.RenderAttributes.this.fillPaintList.getPaint(series);
		if (result == null) {
			result = org.jfree.chart.renderer.RenderAttributes.this.defaultFillPaint;
		}
		return result;
	}

	public java.awt.Paint getSeriesFillPaint(int series) {
		return org.jfree.chart.renderer.RenderAttributes.this.fillPaintList.getPaint(series);
	}

	public void setSeriesFillPaint(int series, java.awt.Paint paint) {
		org.jfree.chart.renderer.RenderAttributes.this.fillPaintList.setPaint(series, paint);
	}

	public java.awt.Paint getDefaultFillPaint() {
		return org.jfree.chart.renderer.RenderAttributes.this.defaultFillPaint;
	}

	public void setDefaultFillPaint(java.awt.Paint paint) {
		if ((paint == null) && (!(org.jfree.chart.renderer.RenderAttributes.this.allowNull))) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.renderer.RenderAttributes.this.defaultFillPaint = paint;
	}

	public java.awt.Paint getItemOutlinePaint(int series, int item) {
		return lookupSeriesOutlinePaint(series);
	}

	protected java.awt.Paint lookupSeriesOutlinePaint(int series) {
		java.awt.Paint result = org.jfree.chart.renderer.RenderAttributes.this.outlinePaintList.getPaint(series);
		if (result == null) {
			result = org.jfree.chart.renderer.RenderAttributes.this.defaultOutlinePaint;
		}
		return result;
	}

	public java.awt.Paint getSeriesOutlinePaint(int series) {
		return org.jfree.chart.renderer.RenderAttributes.this.outlinePaintList.getPaint(series);
	}

	public void setSeriesOutlinePaint(int series, java.awt.Paint paint) {
		org.jfree.chart.renderer.RenderAttributes.this.outlinePaintList.setPaint(series, paint);
	}

	public java.awt.Paint getDefaultOutlinePaint() {
		return org.jfree.chart.renderer.RenderAttributes.this.defaultOutlinePaint;
	}

	public void setDefaultOutlinePaint(java.awt.Paint paint) {
		if ((paint == null) && (!(org.jfree.chart.renderer.RenderAttributes.this.allowNull))) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.renderer.RenderAttributes.this.defaultOutlinePaint = paint;
	}

	public java.awt.Stroke getItemOutlineStroke(int series, int item) {
		return lookupSeriesOutlineStroke(series);
	}

	protected java.awt.Stroke lookupSeriesOutlineStroke(int series) {
		java.awt.Stroke result = org.jfree.chart.renderer.RenderAttributes.this.outlineStrokeList.getStroke(series);
		if (result == null) {
			result = org.jfree.chart.renderer.RenderAttributes.this.defaultOutlineStroke;
		}
		return result;
	}

	public java.awt.Stroke getSeriesOutlineStroke(int series) {
		return org.jfree.chart.renderer.RenderAttributes.this.outlineStrokeList.getStroke(series);
	}

	public void setSeriesOutlineStroke(int series, java.awt.Stroke stroke) {
		org.jfree.chart.renderer.RenderAttributes.this.outlineStrokeList.setStroke(series, stroke);
	}

	public java.awt.Stroke getDefaultOutlineStroke() {
		return org.jfree.chart.renderer.RenderAttributes.this.defaultOutlineStroke;
	}

	public void setDefaultOutlineStroke(java.awt.Stroke stroke) {
		if ((stroke == null) && (!(org.jfree.chart.renderer.RenderAttributes.this.allowNull))) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.renderer.RenderAttributes.this.defaultOutlineStroke = stroke;
	}

	public java.lang.Boolean isLabelVisible(int series, int item) {
		return lookupSeriesLabelVisible(series);
	}

	protected java.lang.Boolean lookupSeriesLabelVisible(int series) {
		java.lang.Boolean result = org.jfree.chart.renderer.RenderAttributes.this.labelsVisibleList.getBoolean(series);
		if (result == null) {
			result = org.jfree.chart.renderer.RenderAttributes.this.defaultLabelVisible;
		}
		return result;
	}

	public java.lang.Boolean getSeriesLabelVisible(int series) {
		return org.jfree.chart.renderer.RenderAttributes.this.labelsVisibleList.getBoolean(series);
	}

	public void setSeriesLabelVisible(int series, java.lang.Boolean visible) {
		org.jfree.chart.renderer.RenderAttributes.this.labelsVisibleList.setBoolean(series, visible);
	}

	public java.lang.Boolean getDefaultLabelVisible() {
		return org.jfree.chart.renderer.RenderAttributes.this.defaultLabelVisible;
	}

	public void setDefaultLabelVisible(java.lang.Boolean visible) {
		if ((visible == null) && (!(org.jfree.chart.renderer.RenderAttributes.this.allowNull))) {
			throw new java.lang.IllegalArgumentException("Null 'visible' argument.");
		}
		org.jfree.chart.renderer.RenderAttributes.this.defaultLabelVisible = visible;
	}

	public java.awt.Font getItemLabelFont(int series, int item) {
		return lookupSeriesLabelFont(series);
	}

	protected java.awt.Font lookupSeriesLabelFont(int series) {
		java.awt.Font result = ((java.awt.Font) (org.jfree.chart.renderer.RenderAttributes.this.labelFontList.get(series)));
		if (result == null) {
			result = org.jfree.chart.renderer.RenderAttributes.this.defaultLabelFont;
		}
		return result;
	}

	public java.awt.Font getSeriesLabelFont(int series) {
		return ((java.awt.Font) (org.jfree.chart.renderer.RenderAttributes.this.labelFontList.get(series)));
	}

	public void setSeriesLabelFont(int series, java.awt.Font font) {
		org.jfree.chart.renderer.RenderAttributes.this.labelFontList.set(series, font);
	}

	public java.awt.Font getDefaultLabelFont() {
		return org.jfree.chart.renderer.RenderAttributes.this.defaultLabelFont;
	}

	public void setDefaultLabelFont(java.awt.Font font) {
		if ((font == null) && (!(org.jfree.chart.renderer.RenderAttributes.this.allowNull))) {
			throw new java.lang.IllegalArgumentException("Null 'font' argument.");
		}
		org.jfree.chart.renderer.RenderAttributes.this.defaultLabelFont = font;
	}

	public java.awt.Paint getItemLabelPaint(int series, int item) {
		return lookupSeriesLabelPaint(series);
	}

	protected java.awt.Paint lookupSeriesLabelPaint(int series) {
		java.awt.Paint result = org.jfree.chart.renderer.RenderAttributes.this.labelPaintList.getPaint(series);
		if (result == null) {
			result = org.jfree.chart.renderer.RenderAttributes.this.defaultLabelPaint;
		}
		return result;
	}

	public java.awt.Paint getSeriesLabelPaint(int series) {
		return org.jfree.chart.renderer.RenderAttributes.this.labelPaintList.getPaint(series);
	}

	public void setSeriesLabelPaint(int series, java.awt.Paint paint) {
		org.jfree.chart.renderer.RenderAttributes.this.labelPaintList.setPaint(series, paint);
	}

	public java.awt.Paint getDefaultLabelPaint() {
		return org.jfree.chart.renderer.RenderAttributes.this.defaultLabelPaint;
	}

	public void setDefaultLabelPaint(java.awt.Paint paint) {
		if ((paint == null) && (!(org.jfree.chart.renderer.RenderAttributes.this.allowNull))) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.renderer.RenderAttributes.this.defaultLabelPaint = paint;
	}

	public java.lang.Boolean getCreateEntity(int series, int item) {
		return lookupSeriesCreateEntity(series);
	}

	protected java.lang.Boolean lookupSeriesCreateEntity(int series) {
		java.lang.Boolean result = org.jfree.chart.renderer.RenderAttributes.this.createEntityList.getBoolean(series);
		if (result == null) {
			result = org.jfree.chart.renderer.RenderAttributes.this.defaultCreateEntity;
		}
		return result;
	}

	public java.lang.Boolean getSeriesCreateEntity(int series) {
		return org.jfree.chart.renderer.RenderAttributes.this.createEntityList.getBoolean(series);
	}

	public void setSeriesCreateEntity(int series, java.lang.Boolean visible) {
		org.jfree.chart.renderer.RenderAttributes.this.createEntityList.setBoolean(series, visible);
	}

	public java.lang.Boolean getDefaultCreateEntity() {
		return org.jfree.chart.renderer.RenderAttributes.this.defaultCreateEntity;
	}

	public void setDefaultCreateEntity(java.lang.Boolean create) {
		if ((create == null) && (!(org.jfree.chart.renderer.RenderAttributes.this.allowNull))) {
			throw new java.lang.IllegalArgumentException("Null 'create' argument.");
		}
		org.jfree.chart.renderer.RenderAttributes.this.defaultCreateEntity = create;
	}
}

