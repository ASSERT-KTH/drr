

package org.jfree.chart.renderer;


public abstract class AbstractRenderer implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = -828267569428206075L;

	public static final java.lang.Double ZERO = new java.lang.Double(0.0);

	public static final java.awt.Paint DEFAULT_PAINT = java.awt.Color.blue;

	public static final java.awt.Paint DEFAULT_OUTLINE_PAINT = java.awt.Color.gray;

	public static final java.awt.Stroke DEFAULT_STROKE = new java.awt.BasicStroke(1.0F);

	public static final java.awt.Stroke DEFAULT_OUTLINE_STROKE = new java.awt.BasicStroke(1.0F);

	public static final java.awt.Shape DEFAULT_SHAPE = new java.awt.geom.Rectangle2D.Double((-3.0), (-3.0), 6.0, 6.0);

	public static final java.awt.Font DEFAULT_VALUE_LABEL_FONT = new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 10);

	public static final java.awt.Paint DEFAULT_VALUE_LABEL_PAINT = java.awt.Color.black;

	private org.jfree.chart.util.BooleanList seriesVisibleList;

	private boolean baseSeriesVisible;

	private org.jfree.chart.util.BooleanList seriesVisibleInLegendList;

	private boolean baseSeriesVisibleInLegend;

	private org.jfree.chart.util.PaintList paintList;

	private boolean autoPopulateSeriesPaint;

	private transient java.awt.Paint basePaint;

	private org.jfree.chart.util.PaintList fillPaintList;

	private boolean autoPopulateSeriesFillPaint;

	private transient java.awt.Paint baseFillPaint;

	private org.jfree.chart.util.PaintList outlinePaintList;

	private boolean autoPopulateSeriesOutlinePaint;

	private transient java.awt.Paint baseOutlinePaint;

	private org.jfree.chart.util.StrokeList strokeList;

	private boolean autoPopulateSeriesStroke;

	private transient java.awt.Stroke baseStroke;

	private org.jfree.chart.util.StrokeList outlineStrokeList;

	private transient java.awt.Stroke baseOutlineStroke;

	private boolean autoPopulateSeriesOutlineStroke;

	private org.jfree.chart.util.ShapeList shapeList;

	private boolean autoPopulateSeriesShape;

	private transient java.awt.Shape baseShape;

	private org.jfree.chart.util.BooleanList itemLabelsVisibleList;

	private boolean baseItemLabelsVisible;

	private org.jfree.chart.util.ObjectList itemLabelFontList;

	private java.awt.Font baseItemLabelFont;

	private org.jfree.chart.util.PaintList itemLabelPaintList;

	private transient java.awt.Paint baseItemLabelPaint;

	private org.jfree.chart.util.ObjectList positiveItemLabelPositionList;

	private org.jfree.chart.labels.ItemLabelPosition basePositiveItemLabelPosition;

	private org.jfree.chart.util.ObjectList negativeItemLabelPositionList;

	private org.jfree.chart.labels.ItemLabelPosition baseNegativeItemLabelPosition;

	private double itemLabelAnchorOffset = 2.0;

	private org.jfree.chart.util.BooleanList createEntitiesList;

	private boolean baseCreateEntities;

	private transient javax.swing.event.EventListenerList listenerList;

	private transient org.jfree.chart.event.RendererChangeEvent event;

	public AbstractRenderer() {
		org.jfree.chart.renderer.AbstractRenderer.this.seriesVisibleList = new org.jfree.chart.util.BooleanList();
		org.jfree.chart.renderer.AbstractRenderer.this.baseSeriesVisible = true;
		org.jfree.chart.renderer.AbstractRenderer.this.seriesVisibleInLegendList = new org.jfree.chart.util.BooleanList();
		org.jfree.chart.renderer.AbstractRenderer.this.baseSeriesVisibleInLegend = true;
		org.jfree.chart.renderer.AbstractRenderer.this.paintList = new org.jfree.chart.util.PaintList();
		org.jfree.chart.renderer.AbstractRenderer.this.basePaint = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
		org.jfree.chart.renderer.AbstractRenderer.this.autoPopulateSeriesPaint = true;
		org.jfree.chart.renderer.AbstractRenderer.this.fillPaintList = new org.jfree.chart.util.PaintList();
		org.jfree.chart.renderer.AbstractRenderer.this.baseFillPaint = java.awt.Color.white;
		org.jfree.chart.renderer.AbstractRenderer.this.autoPopulateSeriesFillPaint = false;
		org.jfree.chart.renderer.AbstractRenderer.this.outlinePaintList = new org.jfree.chart.util.PaintList();
		org.jfree.chart.renderer.AbstractRenderer.this.baseOutlinePaint = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
		org.jfree.chart.renderer.AbstractRenderer.this.autoPopulateSeriesOutlinePaint = false;
		org.jfree.chart.renderer.AbstractRenderer.this.strokeList = new org.jfree.chart.util.StrokeList();
		org.jfree.chart.renderer.AbstractRenderer.this.baseStroke = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
		org.jfree.chart.renderer.AbstractRenderer.this.autoPopulateSeriesStroke = false;
		org.jfree.chart.renderer.AbstractRenderer.this.outlineStrokeList = new org.jfree.chart.util.StrokeList();
		org.jfree.chart.renderer.AbstractRenderer.this.baseOutlineStroke = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
		org.jfree.chart.renderer.AbstractRenderer.this.autoPopulateSeriesOutlineStroke = false;
		org.jfree.chart.renderer.AbstractRenderer.this.shapeList = new org.jfree.chart.util.ShapeList();
		org.jfree.chart.renderer.AbstractRenderer.this.baseShape = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
		org.jfree.chart.renderer.AbstractRenderer.this.autoPopulateSeriesShape = true;
		org.jfree.chart.renderer.AbstractRenderer.this.itemLabelsVisibleList = new org.jfree.chart.util.BooleanList();
		org.jfree.chart.renderer.AbstractRenderer.this.baseItemLabelsVisible = false;
		org.jfree.chart.renderer.AbstractRenderer.this.itemLabelFontList = new org.jfree.chart.util.ObjectList();
		org.jfree.chart.renderer.AbstractRenderer.this.baseItemLabelFont = new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 10);
		org.jfree.chart.renderer.AbstractRenderer.this.itemLabelPaintList = new org.jfree.chart.util.PaintList();
		org.jfree.chart.renderer.AbstractRenderer.this.baseItemLabelPaint = java.awt.Color.black;
		org.jfree.chart.renderer.AbstractRenderer.this.positiveItemLabelPositionList = new org.jfree.chart.util.ObjectList();
		org.jfree.chart.renderer.AbstractRenderer.this.basePositiveItemLabelPosition = new org.jfree.chart.labels.ItemLabelPosition(org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE12, org.jfree.chart.text.TextAnchor.BOTTOM_CENTER);
		org.jfree.chart.renderer.AbstractRenderer.this.negativeItemLabelPositionList = new org.jfree.chart.util.ObjectList();
		org.jfree.chart.renderer.AbstractRenderer.this.baseNegativeItemLabelPosition = new org.jfree.chart.labels.ItemLabelPosition(org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE6, org.jfree.chart.text.TextAnchor.TOP_CENTER);
		org.jfree.chart.renderer.AbstractRenderer.this.createEntitiesList = new org.jfree.chart.util.BooleanList();
		org.jfree.chart.renderer.AbstractRenderer.this.baseCreateEntities = true;
		org.jfree.chart.renderer.AbstractRenderer.this.listenerList = new javax.swing.event.EventListenerList();
	}

	public abstract org.jfree.chart.plot.DrawingSupplier getDrawingSupplier();

	public boolean getItemVisible(int series, int item) {
		return isSeriesVisible(series);
	}

	public boolean isSeriesVisible(int series) {
		boolean result = org.jfree.chart.renderer.AbstractRenderer.this.baseSeriesVisible;
		java.lang.Boolean b = org.jfree.chart.renderer.AbstractRenderer.this.seriesVisibleList.getBoolean(series);
		if (b != null) {
			result = b.booleanValue();
		}
		return result;
	}

	public java.lang.Boolean getSeriesVisible(int series) {
		return org.jfree.chart.renderer.AbstractRenderer.this.seriesVisibleList.getBoolean(series);
	}

	public void setSeriesVisible(int series, java.lang.Boolean visible) {
		setSeriesVisible(series, visible, true);
	}

	public void setSeriesVisible(int series, java.lang.Boolean visible, boolean notify) {
		org.jfree.chart.renderer.AbstractRenderer.this.seriesVisibleList.setBoolean(series, visible);
		if (notify) {
			fireChangeEvent();
		}
	}

	public boolean getBaseSeriesVisible() {
		return org.jfree.chart.renderer.AbstractRenderer.this.baseSeriesVisible;
	}

	public void setBaseSeriesVisible(boolean visible) {
		setBaseSeriesVisible(visible, true);
	}

	public void setBaseSeriesVisible(boolean visible, boolean notify) {
		org.jfree.chart.renderer.AbstractRenderer.this.baseSeriesVisible = visible;
		if (notify) {
			fireChangeEvent();
		}
	}

	public boolean isSeriesVisibleInLegend(int series) {
		boolean result = org.jfree.chart.renderer.AbstractRenderer.this.baseSeriesVisibleInLegend;
		java.lang.Boolean b = org.jfree.chart.renderer.AbstractRenderer.this.seriesVisibleInLegendList.getBoolean(series);
		if (b != null) {
			result = b.booleanValue();
		}
		return result;
	}

	public java.lang.Boolean getSeriesVisibleInLegend(int series) {
		return org.jfree.chart.renderer.AbstractRenderer.this.seriesVisibleInLegendList.getBoolean(series);
	}

	public void setSeriesVisibleInLegend(int series, java.lang.Boolean visible) {
		setSeriesVisibleInLegend(series, visible, true);
	}

	public void setSeriesVisibleInLegend(int series, java.lang.Boolean visible, boolean notify) {
		org.jfree.chart.renderer.AbstractRenderer.this.seriesVisibleInLegendList.setBoolean(series, visible);
		if (notify) {
			fireChangeEvent();
		}
	}

	public boolean getBaseSeriesVisibleInLegend() {
		return org.jfree.chart.renderer.AbstractRenderer.this.baseSeriesVisibleInLegend;
	}

	public void setBaseSeriesVisibleInLegend(boolean visible) {
		setBaseSeriesVisibleInLegend(visible, true);
	}

	public void setBaseSeriesVisibleInLegend(boolean visible, boolean notify) {
		org.jfree.chart.renderer.AbstractRenderer.this.baseSeriesVisibleInLegend = visible;
		if (notify) {
			fireChangeEvent();
		}
	}

	public java.awt.Paint getItemPaint(int row, int column) {
		return lookupSeriesPaint(row);
	}

	public java.awt.Paint lookupSeriesPaint(int series) {
		java.awt.Paint seriesPaint = getSeriesPaint(series);
		if ((seriesPaint == null) && (org.jfree.chart.renderer.AbstractRenderer.this.autoPopulateSeriesPaint)) {
			org.jfree.chart.plot.DrawingSupplier supplier = getDrawingSupplier();
			if (supplier != null) {
				seriesPaint = supplier.getNextPaint();
				setSeriesPaint(series, seriesPaint, false);
			}
		}
		if (seriesPaint == null) {
			seriesPaint = org.jfree.chart.renderer.AbstractRenderer.this.basePaint;
		}
		return seriesPaint;
	}

	public java.awt.Paint getSeriesPaint(int series) {
		return org.jfree.chart.renderer.AbstractRenderer.this.paintList.getPaint(series);
	}

	public void setSeriesPaint(int series, java.awt.Paint paint) {
		setSeriesPaint(series, paint, true);
	}

	public void setSeriesPaint(int series, java.awt.Paint paint, boolean notify) {
		org.jfree.chart.renderer.AbstractRenderer.this.paintList.setPaint(series, paint);
		if (notify) {
			fireChangeEvent();
		}
	}

	public java.awt.Paint getBasePaint() {
		return org.jfree.chart.renderer.AbstractRenderer.this.basePaint;
	}

	public void setBasePaint(java.awt.Paint paint) {
		setBasePaint(paint, true);
	}

	public void setBasePaint(java.awt.Paint paint, boolean notify) {
		org.jfree.chart.renderer.AbstractRenderer.this.basePaint = paint;
		if (notify) {
			fireChangeEvent();
		}
	}

	public boolean getAutoPopulateSeriesPaint() {
		return org.jfree.chart.renderer.AbstractRenderer.this.autoPopulateSeriesPaint;
	}

	public void setAutoPopulateSeriesPaint(boolean auto) {
		org.jfree.chart.renderer.AbstractRenderer.this.autoPopulateSeriesPaint = auto;
	}

	public java.awt.Paint getItemFillPaint(int row, int column) {
		return lookupSeriesFillPaint(row);
	}

	public java.awt.Paint lookupSeriesFillPaint(int series) {
		java.awt.Paint seriesFillPaint = getSeriesFillPaint(series);
		if ((seriesFillPaint == null) && (org.jfree.chart.renderer.AbstractRenderer.this.autoPopulateSeriesFillPaint)) {
			org.jfree.chart.plot.DrawingSupplier supplier = getDrawingSupplier();
			if (supplier != null) {
				seriesFillPaint = supplier.getNextFillPaint();
				setSeriesFillPaint(series, seriesFillPaint, false);
			}
		}
		if (seriesFillPaint == null) {
			seriesFillPaint = org.jfree.chart.renderer.AbstractRenderer.this.baseFillPaint;
		}
		return seriesFillPaint;
	}

	public java.awt.Paint getSeriesFillPaint(int series) {
		return org.jfree.chart.renderer.AbstractRenderer.this.fillPaintList.getPaint(series);
	}

	public void setSeriesFillPaint(int series, java.awt.Paint paint) {
		setSeriesFillPaint(series, paint, true);
	}

	public void setSeriesFillPaint(int series, java.awt.Paint paint, boolean notify) {
		org.jfree.chart.renderer.AbstractRenderer.this.fillPaintList.setPaint(series, paint);
		if (notify) {
			fireChangeEvent();
		}
	}

	public java.awt.Paint getBaseFillPaint() {
		return org.jfree.chart.renderer.AbstractRenderer.this.baseFillPaint;
	}

	public void setBaseFillPaint(java.awt.Paint paint) {
		setBaseFillPaint(paint, true);
	}

	public void setBaseFillPaint(java.awt.Paint paint, boolean notify) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.renderer.AbstractRenderer.this.baseFillPaint = paint;
		if (notify) {
			fireChangeEvent();
		}
	}

	public boolean getAutoPopulateSeriesFillPaint() {
		return org.jfree.chart.renderer.AbstractRenderer.this.autoPopulateSeriesFillPaint;
	}

	public void setAutoPopulateSeriesFillPaint(boolean auto) {
		org.jfree.chart.renderer.AbstractRenderer.this.autoPopulateSeriesFillPaint = auto;
	}

	public java.awt.Paint getItemOutlinePaint(int row, int column) {
		return lookupSeriesOutlinePaint(row);
	}

	public java.awt.Paint lookupSeriesOutlinePaint(int series) {
		java.awt.Paint seriesOutlinePaint = getSeriesOutlinePaint(series);
		if ((seriesOutlinePaint == null) && (org.jfree.chart.renderer.AbstractRenderer.this.autoPopulateSeriesOutlinePaint)) {
			org.jfree.chart.plot.DrawingSupplier supplier = getDrawingSupplier();
			if (supplier != null) {
				seriesOutlinePaint = supplier.getNextOutlinePaint();
				setSeriesOutlinePaint(series, seriesOutlinePaint, false);
			}
		}
		if (seriesOutlinePaint == null) {
			seriesOutlinePaint = org.jfree.chart.renderer.AbstractRenderer.this.baseOutlinePaint;
		}
		return seriesOutlinePaint;
	}

	public java.awt.Paint getSeriesOutlinePaint(int series) {
		return org.jfree.chart.renderer.AbstractRenderer.this.outlinePaintList.getPaint(series);
	}

	public void setSeriesOutlinePaint(int series, java.awt.Paint paint) {
		setSeriesOutlinePaint(series, paint, true);
	}

	public void setSeriesOutlinePaint(int series, java.awt.Paint paint, boolean notify) {
		org.jfree.chart.renderer.AbstractRenderer.this.outlinePaintList.setPaint(series, paint);
		if (notify) {
			fireChangeEvent();
		}
	}

	public java.awt.Paint getBaseOutlinePaint() {
		return org.jfree.chart.renderer.AbstractRenderer.this.baseOutlinePaint;
	}

	public void setBaseOutlinePaint(java.awt.Paint paint) {
		setBaseOutlinePaint(paint, true);
	}

	public void setBaseOutlinePaint(java.awt.Paint paint, boolean notify) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.renderer.AbstractRenderer.this.baseOutlinePaint = paint;
		if (notify) {
			fireChangeEvent();
		}
	}

	public boolean getAutoPopulateSeriesOutlinePaint() {
		return org.jfree.chart.renderer.AbstractRenderer.this.autoPopulateSeriesOutlinePaint;
	}

	public void setAutoPopulateSeriesOutlinePaint(boolean auto) {
		org.jfree.chart.renderer.AbstractRenderer.this.autoPopulateSeriesOutlinePaint = auto;
	}

	public java.awt.Stroke getItemStroke(int row, int column) {
		return lookupSeriesStroke(row);
	}

	public java.awt.Stroke lookupSeriesStroke(int series) {
		java.awt.Stroke result = getSeriesStroke(series);
		if ((result == null) && (org.jfree.chart.renderer.AbstractRenderer.this.autoPopulateSeriesStroke)) {
			org.jfree.chart.plot.DrawingSupplier supplier = getDrawingSupplier();
			if (supplier != null) {
				result = supplier.getNextStroke();
				setSeriesStroke(series, result, false);
			}
		}
		if (result == null) {
			result = org.jfree.chart.renderer.AbstractRenderer.this.baseStroke;
		}
		return result;
	}

	public java.awt.Stroke getSeriesStroke(int series) {
		return org.jfree.chart.renderer.AbstractRenderer.this.strokeList.getStroke(series);
	}

	public void setSeriesStroke(int series, java.awt.Stroke stroke) {
		setSeriesStroke(series, stroke, true);
	}

	public void setSeriesStroke(int series, java.awt.Stroke stroke, boolean notify) {
		org.jfree.chart.renderer.AbstractRenderer.this.strokeList.setStroke(series, stroke);
		if (notify) {
			fireChangeEvent();
		}
	}

	public java.awt.Stroke getBaseStroke() {
		return org.jfree.chart.renderer.AbstractRenderer.this.baseStroke;
	}

	public void setBaseStroke(java.awt.Stroke stroke) {
		setBaseStroke(stroke, true);
	}

	public void setBaseStroke(java.awt.Stroke stroke, boolean notify) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.renderer.AbstractRenderer.this.baseStroke = stroke;
		if (notify) {
			fireChangeEvent();
		}
	}

	public boolean getAutoPopulateSeriesStroke() {
		return org.jfree.chart.renderer.AbstractRenderer.this.autoPopulateSeriesStroke;
	}

	public void setAutoPopulateSeriesStroke(boolean auto) {
		org.jfree.chart.renderer.AbstractRenderer.this.autoPopulateSeriesStroke = auto;
	}

	public java.awt.Stroke getItemOutlineStroke(int row, int column) {
		return lookupSeriesOutlineStroke(row);
	}

	public java.awt.Stroke lookupSeriesOutlineStroke(int series) {
		java.awt.Stroke result = getSeriesOutlineStroke(series);
		if ((result == null) && (org.jfree.chart.renderer.AbstractRenderer.this.autoPopulateSeriesOutlineStroke)) {
			org.jfree.chart.plot.DrawingSupplier supplier = getDrawingSupplier();
			if (supplier != null) {
				result = supplier.getNextOutlineStroke();
				setSeriesOutlineStroke(series, result, false);
			}
		}
		if (result == null) {
			result = org.jfree.chart.renderer.AbstractRenderer.this.baseOutlineStroke;
		}
		return result;
	}

	public java.awt.Stroke getSeriesOutlineStroke(int series) {
		return org.jfree.chart.renderer.AbstractRenderer.this.outlineStrokeList.getStroke(series);
	}

	public void setSeriesOutlineStroke(int series, java.awt.Stroke stroke) {
		setSeriesOutlineStroke(series, stroke, true);
	}

	public void setSeriesOutlineStroke(int series, java.awt.Stroke stroke, boolean notify) {
		org.jfree.chart.renderer.AbstractRenderer.this.outlineStrokeList.setStroke(series, stroke);
		if (notify) {
			fireChangeEvent();
		}
	}

	public java.awt.Stroke getBaseOutlineStroke() {
		return org.jfree.chart.renderer.AbstractRenderer.this.baseOutlineStroke;
	}

	public void setBaseOutlineStroke(java.awt.Stroke stroke) {
		setBaseOutlineStroke(stroke, true);
	}

	public void setBaseOutlineStroke(java.awt.Stroke stroke, boolean notify) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.renderer.AbstractRenderer.this.baseOutlineStroke = stroke;
		if (notify) {
			fireChangeEvent();
		}
	}

	public boolean getAutoPopulateSeriesOutlineStroke() {
		return org.jfree.chart.renderer.AbstractRenderer.this.autoPopulateSeriesOutlineStroke;
	}

	public void setAutoPopulateSeriesOutlineStroke(boolean auto) {
		org.jfree.chart.renderer.AbstractRenderer.this.autoPopulateSeriesOutlineStroke = auto;
	}

	public java.awt.Shape getItemShape(int row, int column) {
		return lookupSeriesShape(row);
	}

	public java.awt.Shape lookupSeriesShape(int series) {
		java.awt.Shape result = getSeriesShape(series);
		if ((result == null) && (org.jfree.chart.renderer.AbstractRenderer.this.autoPopulateSeriesShape)) {
			org.jfree.chart.plot.DrawingSupplier supplier = getDrawingSupplier();
			if (supplier != null) {
				result = supplier.getNextShape();
				setSeriesShape(series, result, false);
			}
		}
		if (result == null) {
			result = org.jfree.chart.renderer.AbstractRenderer.this.baseShape;
		}
		return result;
	}

	public java.awt.Shape getSeriesShape(int series) {
		return org.jfree.chart.renderer.AbstractRenderer.this.shapeList.getShape(series);
	}

	public void setSeriesShape(int series, java.awt.Shape shape) {
		setSeriesShape(series, shape, true);
	}

	public void setSeriesShape(int series, java.awt.Shape shape, boolean notify) {
		org.jfree.chart.renderer.AbstractRenderer.this.shapeList.setShape(series, shape);
		if (notify) {
			fireChangeEvent();
		}
	}

	public java.awt.Shape getBaseShape() {
		return org.jfree.chart.renderer.AbstractRenderer.this.baseShape;
	}

	public void setBaseShape(java.awt.Shape shape) {
		setBaseShape(shape, true);
	}

	public void setBaseShape(java.awt.Shape shape, boolean notify) {
		if (shape == null) {
			throw new java.lang.IllegalArgumentException("Null 'shape' argument.");
		}
		org.jfree.chart.renderer.AbstractRenderer.this.baseShape = shape;
		if (notify) {
			fireChangeEvent();
		}
	}

	public boolean getAutoPopulateSeriesShape() {
		return org.jfree.chart.renderer.AbstractRenderer.this.autoPopulateSeriesShape;
	}

	public void setAutoPopulateSeriesShape(boolean auto) {
		org.jfree.chart.renderer.AbstractRenderer.this.autoPopulateSeriesShape = auto;
	}

	public boolean isItemLabelVisible(int row, int column) {
		return isSeriesItemLabelsVisible(row);
	}

	public boolean isSeriesItemLabelsVisible(int series) {
		java.lang.Boolean b = org.jfree.chart.renderer.AbstractRenderer.this.itemLabelsVisibleList.getBoolean(series);
		if (b != null) {
			return b.booleanValue();
		}
		return org.jfree.chart.renderer.AbstractRenderer.this.baseItemLabelsVisible;
	}

	public java.lang.Boolean getSeriesItemLabelsVisible(int series) {
		return org.jfree.chart.renderer.AbstractRenderer.this.itemLabelsVisibleList.getBoolean(series);
	}

	public void setSeriesItemLabelsVisible(int series, boolean visible) {
		setSeriesItemLabelsVisible(series, java.lang.Boolean.valueOf(visible));
	}

	public void setSeriesItemLabelsVisible(int series, java.lang.Boolean visible) {
		setSeriesItemLabelsVisible(series, visible, true);
	}

	public void setSeriesItemLabelsVisible(int series, java.lang.Boolean visible, boolean notify) {
		org.jfree.chart.renderer.AbstractRenderer.this.itemLabelsVisibleList.setBoolean(series, visible);
		if (notify) {
			fireChangeEvent();
		}
	}

	public boolean getBaseItemLabelsVisible() {
		return org.jfree.chart.renderer.AbstractRenderer.this.baseItemLabelsVisible;
	}

	public void setBaseItemLabelsVisible(boolean visible) {
		setBaseItemLabelsVisible(visible, true);
	}

	public void setBaseItemLabelsVisible(boolean visible, boolean notify) {
		org.jfree.chart.renderer.AbstractRenderer.this.baseItemLabelsVisible = visible;
		if (notify) {
			fireChangeEvent();
		}
	}

	public java.awt.Font getItemLabelFont(int row, int column) {
		java.awt.Font result = getSeriesItemLabelFont(row);
		if (result == null) {
			result = org.jfree.chart.renderer.AbstractRenderer.this.baseItemLabelFont;
		}
		return result;
	}

	public java.awt.Font getSeriesItemLabelFont(int series) {
		return ((java.awt.Font) (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelFontList.get(series)));
	}

	public void setSeriesItemLabelFont(int series, java.awt.Font font) {
		setSeriesItemLabelFont(series, font, true);
	}

	public void setSeriesItemLabelFont(int series, java.awt.Font font, boolean notify) {
		org.jfree.chart.renderer.AbstractRenderer.this.itemLabelFontList.set(series, font);
		if (notify) {
			fireChangeEvent();
		}
	}

	public java.awt.Font getBaseItemLabelFont() {
		return org.jfree.chart.renderer.AbstractRenderer.this.baseItemLabelFont;
	}

	public void setBaseItemLabelFont(java.awt.Font font) {
		if (font == null) {
			throw new java.lang.IllegalArgumentException("Null 'font' argument.");
		}
		setBaseItemLabelFont(font, true);
	}

	public void setBaseItemLabelFont(java.awt.Font font, boolean notify) {
		org.jfree.chart.renderer.AbstractRenderer.this.baseItemLabelFont = font;
		if (notify) {
			fireChangeEvent();
		}
	}

	public java.awt.Paint getItemLabelPaint(int row, int column) {
		java.awt.Paint result = getSeriesItemLabelPaint(row);
		if (result == null) {
			result = org.jfree.chart.renderer.AbstractRenderer.this.baseItemLabelPaint;
		}
		return result;
	}

	public java.awt.Paint getSeriesItemLabelPaint(int series) {
		return org.jfree.chart.renderer.AbstractRenderer.this.itemLabelPaintList.getPaint(series);
	}

	public void setSeriesItemLabelPaint(int series, java.awt.Paint paint) {
		setSeriesItemLabelPaint(series, paint, true);
	}

	public void setSeriesItemLabelPaint(int series, java.awt.Paint paint, boolean notify) {
		org.jfree.chart.renderer.AbstractRenderer.this.itemLabelPaintList.setPaint(series, paint);
		if (notify) {
			fireChangeEvent();
		}
	}

	public java.awt.Paint getBaseItemLabelPaint() {
		return org.jfree.chart.renderer.AbstractRenderer.this.baseItemLabelPaint;
	}

	public void setBaseItemLabelPaint(java.awt.Paint paint) {
		setBaseItemLabelPaint(paint, true);
	}

	public void setBaseItemLabelPaint(java.awt.Paint paint, boolean notify) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.renderer.AbstractRenderer.this.baseItemLabelPaint = paint;
		if (notify) {
			fireChangeEvent();
		}
	}

	public org.jfree.chart.labels.ItemLabelPosition getPositiveItemLabelPosition(int row, int column) {
		return getSeriesPositiveItemLabelPosition(row);
	}

	public org.jfree.chart.labels.ItemLabelPosition getSeriesPositiveItemLabelPosition(int series) {
		org.jfree.chart.labels.ItemLabelPosition position = ((org.jfree.chart.labels.ItemLabelPosition) (org.jfree.chart.renderer.AbstractRenderer.this.positiveItemLabelPositionList.get(series)));
		if (position == null) {
			position = org.jfree.chart.renderer.AbstractRenderer.this.basePositiveItemLabelPosition;
		}
		return position;
	}

	public void setSeriesPositiveItemLabelPosition(int series, org.jfree.chart.labels.ItemLabelPosition position) {
		setSeriesPositiveItemLabelPosition(series, position, true);
	}

	public void setSeriesPositiveItemLabelPosition(int series, org.jfree.chart.labels.ItemLabelPosition position, boolean notify) {
		org.jfree.chart.renderer.AbstractRenderer.this.positiveItemLabelPositionList.set(series, position);
		if (notify) {
			fireChangeEvent();
		}
	}

	public org.jfree.chart.labels.ItemLabelPosition getBasePositiveItemLabelPosition() {
		return org.jfree.chart.renderer.AbstractRenderer.this.basePositiveItemLabelPosition;
	}

	public void setBasePositiveItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition position) {
		setBasePositiveItemLabelPosition(position, true);
	}

	public void setBasePositiveItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition position, boolean notify) {
		if (position == null) {
			throw new java.lang.IllegalArgumentException("Null 'position' argument.");
		}
		org.jfree.chart.renderer.AbstractRenderer.this.basePositiveItemLabelPosition = position;
		if (notify) {
			fireChangeEvent();
		}
	}

	public org.jfree.chart.labels.ItemLabelPosition getNegativeItemLabelPosition(int row, int column) {
		return getSeriesNegativeItemLabelPosition(row);
	}

	public org.jfree.chart.labels.ItemLabelPosition getSeriesNegativeItemLabelPosition(int series) {
		org.jfree.chart.labels.ItemLabelPosition position = ((org.jfree.chart.labels.ItemLabelPosition) (org.jfree.chart.renderer.AbstractRenderer.this.negativeItemLabelPositionList.get(series)));
		if (position == null) {
			position = org.jfree.chart.renderer.AbstractRenderer.this.baseNegativeItemLabelPosition;
		}
		return position;
	}

	public void setSeriesNegativeItemLabelPosition(int series, org.jfree.chart.labels.ItemLabelPosition position) {
		setSeriesNegativeItemLabelPosition(series, position, true);
	}

	public void setSeriesNegativeItemLabelPosition(int series, org.jfree.chart.labels.ItemLabelPosition position, boolean notify) {
		org.jfree.chart.renderer.AbstractRenderer.this.negativeItemLabelPositionList.set(series, position);
		if (notify) {
			fireChangeEvent();
		}
	}

	public org.jfree.chart.labels.ItemLabelPosition getBaseNegativeItemLabelPosition() {
		return org.jfree.chart.renderer.AbstractRenderer.this.baseNegativeItemLabelPosition;
	}

	public void setBaseNegativeItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition position) {
		setBaseNegativeItemLabelPosition(position, true);
	}

	public void setBaseNegativeItemLabelPosition(org.jfree.chart.labels.ItemLabelPosition position, boolean notify) {
		if (position == null) {
			throw new java.lang.IllegalArgumentException("Null 'position' argument.");
		}
		org.jfree.chart.renderer.AbstractRenderer.this.baseNegativeItemLabelPosition = position;
		if (notify) {
			fireChangeEvent();
		}
	}

	public double getItemLabelAnchorOffset() {
		return org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset;
	}

	public void setItemLabelAnchorOffset(double offset) {
		org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset = offset;
		fireChangeEvent();
	}

	public boolean getItemCreateEntity(int series, int item) {
		java.lang.Boolean b = getSeriesCreateEntities(series);
		if (b != null) {
			return b.booleanValue();
		}else {
			return org.jfree.chart.renderer.AbstractRenderer.this.baseCreateEntities;
		}
	}

	public java.lang.Boolean getSeriesCreateEntities(int series) {
		return org.jfree.chart.renderer.AbstractRenderer.this.createEntitiesList.getBoolean(series);
	}

	public void setSeriesCreateEntities(int series, java.lang.Boolean create) {
		setSeriesCreateEntities(series, create, true);
	}

	public void setSeriesCreateEntities(int series, java.lang.Boolean create, boolean notify) {
		org.jfree.chart.renderer.AbstractRenderer.this.createEntitiesList.setBoolean(series, create);
		if (notify) {
			fireChangeEvent();
		}
	}

	public boolean getBaseCreateEntities() {
		return org.jfree.chart.renderer.AbstractRenderer.this.baseCreateEntities;
	}

	public void setBaseCreateEntities(boolean create) {
		setBaseCreateEntities(create, true);
	}

	public void setBaseCreateEntities(boolean create, boolean notify) {
		org.jfree.chart.renderer.AbstractRenderer.this.baseCreateEntities = create;
		if (notify) {
			fireChangeEvent();
		}
	}

	private static final double ADJ = java.lang.Math.cos(((java.lang.Math.PI) / 6.0));

	private static final double OPP = java.lang.Math.sin(((java.lang.Math.PI) / 6.0));

	protected java.awt.geom.Point2D calculateLabelAnchorPoint(org.jfree.chart.labels.ItemLabelAnchor anchor, double x, double y, org.jfree.chart.plot.PlotOrientation orientation) {
		java.awt.geom.Point2D result = null;
		if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.CENTER)) {
			result = new java.awt.geom.Point2D.Double(x, y);
		}else
			if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE1)) {
				result = new java.awt.geom.Point2D.Double((x + ((org.jfree.chart.renderer.AbstractRenderer.OPP) * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))), (y - ((org.jfree.chart.renderer.AbstractRenderer.ADJ) * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))));
			}else
				if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE2)) {
					result = new java.awt.geom.Point2D.Double((x + ((org.jfree.chart.renderer.AbstractRenderer.ADJ) * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))), (y - ((org.jfree.chart.renderer.AbstractRenderer.OPP) * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))));
				}else
					if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE3)) {
						result = new java.awt.geom.Point2D.Double((x + (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset)), y);
					}else
						if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE4)) {
							result = new java.awt.geom.Point2D.Double((x + ((org.jfree.chart.renderer.AbstractRenderer.ADJ) * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))), (y + ((org.jfree.chart.renderer.AbstractRenderer.OPP) * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))));
						}else
							if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE5)) {
								result = new java.awt.geom.Point2D.Double((x + ((org.jfree.chart.renderer.AbstractRenderer.OPP) * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))), (y + ((org.jfree.chart.renderer.AbstractRenderer.ADJ) * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))));
							}else
								if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE6)) {
									result = new java.awt.geom.Point2D.Double(x, (y + (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset)));
								}else
									if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE7)) {
										result = new java.awt.geom.Point2D.Double((x - ((org.jfree.chart.renderer.AbstractRenderer.OPP) * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))), (y + ((org.jfree.chart.renderer.AbstractRenderer.ADJ) * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))));
									}else
										if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE8)) {
											result = new java.awt.geom.Point2D.Double((x - ((org.jfree.chart.renderer.AbstractRenderer.ADJ) * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))), (y + ((org.jfree.chart.renderer.AbstractRenderer.OPP) * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))));
										}else
											if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE9)) {
												result = new java.awt.geom.Point2D.Double((x - (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset)), y);
											}else
												if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE10)) {
													result = new java.awt.geom.Point2D.Double((x - ((org.jfree.chart.renderer.AbstractRenderer.ADJ) * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))), (y - ((org.jfree.chart.renderer.AbstractRenderer.OPP) * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))));
												}else
													if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE11)) {
														result = new java.awt.geom.Point2D.Double((x - ((org.jfree.chart.renderer.AbstractRenderer.OPP) * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))), (y - ((org.jfree.chart.renderer.AbstractRenderer.ADJ) * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))));
													}else
														if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.INSIDE12)) {
															result = new java.awt.geom.Point2D.Double(x, (y - (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset)));
														}else
															if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE1)) {
																result = new java.awt.geom.Point2D.Double((x + ((2.0 * (org.jfree.chart.renderer.AbstractRenderer.OPP)) * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))), (y - ((2.0 * (org.jfree.chart.renderer.AbstractRenderer.ADJ)) * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))));
															}else
																if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE2)) {
																	result = new java.awt.geom.Point2D.Double((x + ((2.0 * (org.jfree.chart.renderer.AbstractRenderer.ADJ)) * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))), (y - ((2.0 * (org.jfree.chart.renderer.AbstractRenderer.OPP)) * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))));
																}else
																	if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE3)) {
																		result = new java.awt.geom.Point2D.Double((x + (2.0 * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))), y);
																	}else
																		if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE4)) {
																			result = new java.awt.geom.Point2D.Double((x + ((2.0 * (org.jfree.chart.renderer.AbstractRenderer.ADJ)) * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))), (y + ((2.0 * (org.jfree.chart.renderer.AbstractRenderer.OPP)) * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))));
																		}else
																			if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE5)) {
																				result = new java.awt.geom.Point2D.Double((x + ((2.0 * (org.jfree.chart.renderer.AbstractRenderer.OPP)) * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))), (y + ((2.0 * (org.jfree.chart.renderer.AbstractRenderer.ADJ)) * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))));
																			}else
																				if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE6)) {
																					result = new java.awt.geom.Point2D.Double(x, (y + (2.0 * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))));
																				}else
																					if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE7)) {
																						result = new java.awt.geom.Point2D.Double((x - ((2.0 * (org.jfree.chart.renderer.AbstractRenderer.OPP)) * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))), (y + ((2.0 * (org.jfree.chart.renderer.AbstractRenderer.ADJ)) * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))));
																					}else
																						if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE8)) {
																							result = new java.awt.geom.Point2D.Double((x - ((2.0 * (org.jfree.chart.renderer.AbstractRenderer.ADJ)) * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))), (y + ((2.0 * (org.jfree.chart.renderer.AbstractRenderer.OPP)) * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))));
																						}else
																							if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE9)) {
																								result = new java.awt.geom.Point2D.Double((x - (2.0 * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))), y);
																							}else
																								if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE10)) {
																									result = new java.awt.geom.Point2D.Double((x - ((2.0 * (org.jfree.chart.renderer.AbstractRenderer.ADJ)) * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))), (y - ((2.0 * (org.jfree.chart.renderer.AbstractRenderer.OPP)) * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))));
																								}else
																									if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE11)) {
																										result = new java.awt.geom.Point2D.Double((x - ((2.0 * (org.jfree.chart.renderer.AbstractRenderer.OPP)) * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))), (y - ((2.0 * (org.jfree.chart.renderer.AbstractRenderer.ADJ)) * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))));
																									}else
																										if (anchor == (org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE12)) {
																											result = new java.awt.geom.Point2D.Double(x, (y - (2.0 * (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset))));
																										}
																									
																								
																							
																						
																					
																				
																			
																		
																	
																
															
														
													
												
											
										
									
								
							
						
					
				
			
		
		return result;
	}

	public void addChangeListener(org.jfree.chart.event.RendererChangeListener listener) {
		if (listener == null) {
			throw new java.lang.IllegalArgumentException("Null 'listener' argument.");
		}
		org.jfree.chart.renderer.AbstractRenderer.this.listenerList.add(org.jfree.chart.event.RendererChangeListener.class, listener);
	}

	public void removeChangeListener(org.jfree.chart.event.RendererChangeListener listener) {
		if (listener == null) {
			throw new java.lang.IllegalArgumentException("Null 'listener' argument.");
		}
		org.jfree.chart.renderer.AbstractRenderer.this.listenerList.remove(org.jfree.chart.event.RendererChangeListener.class, listener);
	}

	public boolean hasListener(java.util.EventListener listener) {
		java.util.List list = java.util.Arrays.asList(org.jfree.chart.renderer.AbstractRenderer.this.listenerList.getListenerList());
		return list.contains(listener);
	}

	protected void fireChangeEvent() {
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.AbstractRenderer.this));
	}

	public void notifyListeners(org.jfree.chart.event.RendererChangeEvent event) {
		java.lang.Object[] ls = org.jfree.chart.renderer.AbstractRenderer.this.listenerList.getListenerList();
		for (int i = (ls.length) - 2; i >= 0; i -= 2) {
			if ((ls[i]) == (org.jfree.chart.event.RendererChangeListener.class)) {
				((org.jfree.chart.event.RendererChangeListener) (ls[(i + 1)])).rendererChanged(event);
			}
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.AbstractRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.AbstractRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.AbstractRenderer that = ((org.jfree.chart.renderer.AbstractRenderer) (obj));
		if (!(org.jfree.chart.renderer.AbstractRenderer.this.seriesVisibleList.equals(that.seriesVisibleList))) {
			return false;
		}
		if ((org.jfree.chart.renderer.AbstractRenderer.this.baseSeriesVisible) != (that.baseSeriesVisible)) {
			return false;
		}
		if (!(org.jfree.chart.renderer.AbstractRenderer.this.seriesVisibleInLegendList.equals(that.seriesVisibleInLegendList))) {
			return false;
		}
		if ((org.jfree.chart.renderer.AbstractRenderer.this.baseSeriesVisibleInLegend) != (that.baseSeriesVisibleInLegend)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.AbstractRenderer.this.paintList, that.paintList))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.renderer.AbstractRenderer.this.basePaint, that.basePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.AbstractRenderer.this.fillPaintList, that.fillPaintList))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.renderer.AbstractRenderer.this.baseFillPaint, that.baseFillPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.AbstractRenderer.this.outlinePaintList, that.outlinePaintList))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.renderer.AbstractRenderer.this.baseOutlinePaint, that.baseOutlinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.AbstractRenderer.this.strokeList, that.strokeList))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.AbstractRenderer.this.baseStroke, that.baseStroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.AbstractRenderer.this.outlineStrokeList, that.outlineStrokeList))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.AbstractRenderer.this.baseOutlineStroke, that.baseOutlineStroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.AbstractRenderer.this.shapeList, that.shapeList))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.AbstractRenderer.this.baseShape, that.baseShape))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.AbstractRenderer.this.itemLabelsVisibleList, that.itemLabelsVisibleList))) {
			return false;
		}
		if ((org.jfree.chart.renderer.AbstractRenderer.this.baseItemLabelsVisible) != (that.baseItemLabelsVisible)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.AbstractRenderer.this.itemLabelFontList, that.itemLabelFontList))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.AbstractRenderer.this.baseItemLabelFont, that.baseItemLabelFont))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.AbstractRenderer.this.itemLabelPaintList, that.itemLabelPaintList))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.renderer.AbstractRenderer.this.baseItemLabelPaint, that.baseItemLabelPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.AbstractRenderer.this.positiveItemLabelPositionList, that.positiveItemLabelPositionList))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.AbstractRenderer.this.basePositiveItemLabelPosition, that.basePositiveItemLabelPosition))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.AbstractRenderer.this.negativeItemLabelPositionList, that.negativeItemLabelPositionList))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.AbstractRenderer.this.baseNegativeItemLabelPosition, that.baseNegativeItemLabelPosition))) {
			return false;
		}
		if ((org.jfree.chart.renderer.AbstractRenderer.this.itemLabelAnchorOffset) != (that.itemLabelAnchorOffset)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.renderer.AbstractRenderer.this.createEntitiesList, that.createEntitiesList))) {
			return false;
		}
		if ((org.jfree.chart.renderer.AbstractRenderer.this.baseCreateEntities) != (that.baseCreateEntities)) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 193;
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.renderer.AbstractRenderer.this.seriesVisibleList);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.renderer.AbstractRenderer.this.baseSeriesVisible);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.renderer.AbstractRenderer.this.seriesVisibleInLegendList);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.renderer.AbstractRenderer.this.baseSeriesVisibleInLegend);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.renderer.AbstractRenderer.this.paintList);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.renderer.AbstractRenderer.this.basePaint);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.renderer.AbstractRenderer.this.fillPaintList);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.renderer.AbstractRenderer.this.baseFillPaint);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.renderer.AbstractRenderer.this.outlinePaintList);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.renderer.AbstractRenderer.this.baseOutlinePaint);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.renderer.AbstractRenderer.this.strokeList);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.renderer.AbstractRenderer.this.baseStroke);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.renderer.AbstractRenderer.this.outlineStrokeList);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.renderer.AbstractRenderer.this.baseOutlineStroke);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.renderer.AbstractRenderer.this.itemLabelsVisibleList);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.renderer.AbstractRenderer.this.baseItemLabelsVisible);
		return result;
	}

	protected java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.renderer.AbstractRenderer clone = ((org.jfree.chart.renderer.AbstractRenderer) (super.clone()));
		if ((org.jfree.chart.renderer.AbstractRenderer.this.seriesVisibleList) != null) {
			clone.seriesVisibleList = ((org.jfree.chart.util.BooleanList) (org.jfree.chart.renderer.AbstractRenderer.this.seriesVisibleList.clone()));
		}
		if ((org.jfree.chart.renderer.AbstractRenderer.this.seriesVisibleInLegendList) != null) {
			clone.seriesVisibleInLegendList = ((org.jfree.chart.util.BooleanList) (org.jfree.chart.renderer.AbstractRenderer.this.seriesVisibleInLegendList.clone()));
		}
		if ((org.jfree.chart.renderer.AbstractRenderer.this.paintList) != null) {
			clone.paintList = ((org.jfree.chart.util.PaintList) (org.jfree.chart.renderer.AbstractRenderer.this.paintList.clone()));
		}
		if ((org.jfree.chart.renderer.AbstractRenderer.this.fillPaintList) != null) {
			clone.fillPaintList = ((org.jfree.chart.util.PaintList) (org.jfree.chart.renderer.AbstractRenderer.this.fillPaintList.clone()));
		}
		if ((org.jfree.chart.renderer.AbstractRenderer.this.outlinePaintList) != null) {
			clone.outlinePaintList = ((org.jfree.chart.util.PaintList) (org.jfree.chart.renderer.AbstractRenderer.this.outlinePaintList.clone()));
		}
		if ((org.jfree.chart.renderer.AbstractRenderer.this.strokeList) != null) {
			clone.strokeList = ((org.jfree.chart.util.StrokeList) (org.jfree.chart.renderer.AbstractRenderer.this.strokeList.clone()));
		}
		if ((org.jfree.chart.renderer.AbstractRenderer.this.outlineStrokeList) != null) {
			clone.outlineStrokeList = ((org.jfree.chart.util.StrokeList) (org.jfree.chart.renderer.AbstractRenderer.this.outlineStrokeList.clone()));
		}
		if ((org.jfree.chart.renderer.AbstractRenderer.this.shapeList) != null) {
			clone.shapeList = ((org.jfree.chart.util.ShapeList) (org.jfree.chart.renderer.AbstractRenderer.this.shapeList.clone()));
		}
		if ((org.jfree.chart.renderer.AbstractRenderer.this.baseShape) != null) {
			clone.baseShape = org.jfree.chart.util.ShapeUtilities.clone(org.jfree.chart.renderer.AbstractRenderer.this.baseShape);
		}
		if ((org.jfree.chart.renderer.AbstractRenderer.this.itemLabelsVisibleList) != null) {
			clone.itemLabelsVisibleList = ((org.jfree.chart.util.BooleanList) (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelsVisibleList.clone()));
		}
		if ((org.jfree.chart.renderer.AbstractRenderer.this.itemLabelFontList) != null) {
			clone.itemLabelFontList = ((org.jfree.chart.util.ObjectList) (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelFontList.clone()));
		}
		if ((org.jfree.chart.renderer.AbstractRenderer.this.itemLabelPaintList) != null) {
			clone.itemLabelPaintList = ((org.jfree.chart.util.PaintList) (org.jfree.chart.renderer.AbstractRenderer.this.itemLabelPaintList.clone()));
		}
		if ((org.jfree.chart.renderer.AbstractRenderer.this.positiveItemLabelPositionList) != null) {
			clone.positiveItemLabelPositionList = ((org.jfree.chart.util.ObjectList) (org.jfree.chart.renderer.AbstractRenderer.this.positiveItemLabelPositionList.clone()));
		}
		if ((org.jfree.chart.renderer.AbstractRenderer.this.negativeItemLabelPositionList) != null) {
			clone.negativeItemLabelPositionList = ((org.jfree.chart.util.ObjectList) (org.jfree.chart.renderer.AbstractRenderer.this.negativeItemLabelPositionList.clone()));
		}
		if ((org.jfree.chart.renderer.AbstractRenderer.this.createEntitiesList) != null) {
			clone.createEntitiesList = ((org.jfree.chart.util.BooleanList) (org.jfree.chart.renderer.AbstractRenderer.this.createEntitiesList.clone()));
		}
		clone.listenerList = new javax.swing.event.EventListenerList();
		clone.event = null;
		return clone;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.AbstractRenderer.this.basePaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.AbstractRenderer.this.baseFillPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.AbstractRenderer.this.baseOutlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.renderer.AbstractRenderer.this.baseStroke, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.renderer.AbstractRenderer.this.baseOutlineStroke, stream);
		org.jfree.chart.util.SerialUtilities.writeShape(org.jfree.chart.renderer.AbstractRenderer.this.baseShape, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.AbstractRenderer.this.baseItemLabelPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.renderer.AbstractRenderer.this.basePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.renderer.AbstractRenderer.this.baseFillPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.renderer.AbstractRenderer.this.baseOutlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.renderer.AbstractRenderer.this.baseStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.renderer.AbstractRenderer.this.baseOutlineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.renderer.AbstractRenderer.this.baseShape = org.jfree.chart.util.SerialUtilities.readShape(stream);
		org.jfree.chart.renderer.AbstractRenderer.this.baseItemLabelPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.renderer.AbstractRenderer.this.listenerList = new javax.swing.event.EventListenerList();
	}
}

