

package org.jfree.chart.plot;


public abstract class Marker implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = -734389651405327166L;

	private transient java.awt.Paint paint;

	private transient java.awt.Stroke stroke;

	private transient java.awt.Paint outlinePaint;

	private transient java.awt.Stroke outlineStroke;

	private float alpha;

	private java.lang.String label = null;

	private java.awt.Font labelFont;

	private transient java.awt.Paint labelPaint;

	private org.jfree.chart.util.RectangleAnchor labelAnchor;

	private org.jfree.chart.text.TextAnchor labelTextAnchor;

	private org.jfree.chart.util.RectangleInsets labelOffset;

	private org.jfree.chart.util.LengthAdjustmentType labelOffsetType;

	private transient javax.swing.event.EventListenerList listenerList;

	protected Marker() {
		this(java.awt.Color.gray);
	}

	protected Marker(java.awt.Paint paint) {
		this(paint, new java.awt.BasicStroke(0.5F), java.awt.Color.gray, new java.awt.BasicStroke(0.5F), 0.8F);
	}

	protected Marker(java.awt.Paint paint, java.awt.Stroke stroke, java.awt.Paint outlinePaint, java.awt.Stroke outlineStroke, float alpha) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		if ((alpha < 0.0F) || (alpha > 1.0F))
			throw new java.lang.IllegalArgumentException("The 'alpha' value must be in the range 0.0f to 1.0f");
		
		org.jfree.chart.plot.Marker.this.paint = paint;
		org.jfree.chart.plot.Marker.this.stroke = stroke;
		org.jfree.chart.plot.Marker.this.outlinePaint = outlinePaint;
		org.jfree.chart.plot.Marker.this.outlineStroke = outlineStroke;
		org.jfree.chart.plot.Marker.this.alpha = alpha;
		org.jfree.chart.plot.Marker.this.labelFont = new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 9);
		org.jfree.chart.plot.Marker.this.labelPaint = java.awt.Color.black;
		org.jfree.chart.plot.Marker.this.labelAnchor = org.jfree.chart.util.RectangleAnchor.TOP_LEFT;
		org.jfree.chart.plot.Marker.this.labelOffset = new org.jfree.chart.util.RectangleInsets(3.0, 3.0, 3.0, 3.0);
		org.jfree.chart.plot.Marker.this.labelOffsetType = org.jfree.chart.util.LengthAdjustmentType.CONTRACT;
		org.jfree.chart.plot.Marker.this.labelTextAnchor = org.jfree.chart.text.TextAnchor.CENTER;
		org.jfree.chart.plot.Marker.this.listenerList = new javax.swing.event.EventListenerList();
	}

	public java.awt.Paint getPaint() {
		return org.jfree.chart.plot.Marker.this.paint;
	}

	public void setPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.Marker.this.paint = paint;
		notifyListeners(new org.jfree.chart.event.MarkerChangeEvent(org.jfree.chart.plot.Marker.this));
	}

	public java.awt.Stroke getStroke() {
		return org.jfree.chart.plot.Marker.this.stroke;
	}

	public void setStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.plot.Marker.this.stroke = stroke;
		notifyListeners(new org.jfree.chart.event.MarkerChangeEvent(org.jfree.chart.plot.Marker.this));
	}

	public java.awt.Paint getOutlinePaint() {
		return org.jfree.chart.plot.Marker.this.outlinePaint;
	}

	public void setOutlinePaint(java.awt.Paint paint) {
		org.jfree.chart.plot.Marker.this.outlinePaint = paint;
		notifyListeners(new org.jfree.chart.event.MarkerChangeEvent(org.jfree.chart.plot.Marker.this));
	}

	public java.awt.Stroke getOutlineStroke() {
		return org.jfree.chart.plot.Marker.this.outlineStroke;
	}

	public void setOutlineStroke(java.awt.Stroke stroke) {
		org.jfree.chart.plot.Marker.this.outlineStroke = stroke;
		notifyListeners(new org.jfree.chart.event.MarkerChangeEvent(org.jfree.chart.plot.Marker.this));
	}

	public float getAlpha() {
		return org.jfree.chart.plot.Marker.this.alpha;
	}

	public void setAlpha(float alpha) {
		if ((alpha < 0.0F) || (alpha > 1.0F))
			throw new java.lang.IllegalArgumentException("The 'alpha' value must be in the range 0.0f to 1.0f");
		
		org.jfree.chart.plot.Marker.this.alpha = alpha;
		notifyListeners(new org.jfree.chart.event.MarkerChangeEvent(org.jfree.chart.plot.Marker.this));
	}

	public java.lang.String getLabel() {
		return org.jfree.chart.plot.Marker.this.label;
	}

	public void setLabel(java.lang.String label) {
		org.jfree.chart.plot.Marker.this.label = label;
		notifyListeners(new org.jfree.chart.event.MarkerChangeEvent(org.jfree.chart.plot.Marker.this));
	}

	public java.awt.Font getLabelFont() {
		return org.jfree.chart.plot.Marker.this.labelFont;
	}

	public void setLabelFont(java.awt.Font font) {
		if (font == null) {
			throw new java.lang.IllegalArgumentException("Null 'font' argument.");
		}
		org.jfree.chart.plot.Marker.this.labelFont = font;
		notifyListeners(new org.jfree.chart.event.MarkerChangeEvent(org.jfree.chart.plot.Marker.this));
	}

	public java.awt.Paint getLabelPaint() {
		return org.jfree.chart.plot.Marker.this.labelPaint;
	}

	public void setLabelPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.Marker.this.labelPaint = paint;
		notifyListeners(new org.jfree.chart.event.MarkerChangeEvent(org.jfree.chart.plot.Marker.this));
	}

	public org.jfree.chart.util.RectangleAnchor getLabelAnchor() {
		return org.jfree.chart.plot.Marker.this.labelAnchor;
	}

	public void setLabelAnchor(org.jfree.chart.util.RectangleAnchor anchor) {
		if (anchor == null) {
			throw new java.lang.IllegalArgumentException("Null 'anchor' argument.");
		}
		org.jfree.chart.plot.Marker.this.labelAnchor = anchor;
		notifyListeners(new org.jfree.chart.event.MarkerChangeEvent(org.jfree.chart.plot.Marker.this));
	}

	public org.jfree.chart.util.RectangleInsets getLabelOffset() {
		return org.jfree.chart.plot.Marker.this.labelOffset;
	}

	public void setLabelOffset(org.jfree.chart.util.RectangleInsets offset) {
		if (offset == null) {
			throw new java.lang.IllegalArgumentException("Null 'offset' argument.");
		}
		org.jfree.chart.plot.Marker.this.labelOffset = offset;
		notifyListeners(new org.jfree.chart.event.MarkerChangeEvent(org.jfree.chart.plot.Marker.this));
	}

	public org.jfree.chart.util.LengthAdjustmentType getLabelOffsetType() {
		return org.jfree.chart.plot.Marker.this.labelOffsetType;
	}

	public void setLabelOffsetType(org.jfree.chart.util.LengthAdjustmentType adj) {
		if (adj == null) {
			throw new java.lang.IllegalArgumentException("Null 'adj' argument.");
		}
		org.jfree.chart.plot.Marker.this.labelOffsetType = adj;
		notifyListeners(new org.jfree.chart.event.MarkerChangeEvent(org.jfree.chart.plot.Marker.this));
	}

	public org.jfree.chart.text.TextAnchor getLabelTextAnchor() {
		return org.jfree.chart.plot.Marker.this.labelTextAnchor;
	}

	public void setLabelTextAnchor(org.jfree.chart.text.TextAnchor anchor) {
		if (anchor == null) {
			throw new java.lang.IllegalArgumentException("Null 'anchor' argument.");
		}
		org.jfree.chart.plot.Marker.this.labelTextAnchor = anchor;
		notifyListeners(new org.jfree.chart.event.MarkerChangeEvent(org.jfree.chart.plot.Marker.this));
	}

	public void addChangeListener(org.jfree.chart.event.MarkerChangeListener listener) {
		org.jfree.chart.plot.Marker.this.listenerList.add(org.jfree.chart.event.MarkerChangeListener.class, listener);
	}

	public void removeChangeListener(org.jfree.chart.event.MarkerChangeListener listener) {
		org.jfree.chart.plot.Marker.this.listenerList.remove(org.jfree.chart.event.MarkerChangeListener.class, listener);
	}

	public void notifyListeners(org.jfree.chart.event.MarkerChangeEvent event) {
		java.lang.Object[] listeners = org.jfree.chart.plot.Marker.this.listenerList.getListenerList();
		for (int i = (listeners.length) - 2; i >= 0; i -= 2) {
			if ((listeners[i]) == (org.jfree.chart.event.MarkerChangeListener.class)) {
				((org.jfree.chart.event.MarkerChangeListener) (listeners[(i + 1)])).markerChanged(event);
			}
		}
	}

	public java.util.EventListener[] getListeners(java.lang.Class listenerType) {
		return org.jfree.chart.plot.Marker.this.listenerList.getListeners(listenerType);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.Marker.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.Marker)) {
			return false;
		}
		org.jfree.chart.plot.Marker that = ((org.jfree.chart.plot.Marker) (obj));
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.Marker.this.paint, that.paint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.Marker.this.stroke, that.stroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.Marker.this.outlinePaint, that.outlinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.Marker.this.outlineStroke, that.outlineStroke))) {
			return false;
		}
		if ((org.jfree.chart.plot.Marker.this.alpha) != (that.alpha)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.Marker.this.label, that.label))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.Marker.this.labelFont, that.labelFont))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.Marker.this.labelPaint, that.labelPaint))) {
			return false;
		}
		if ((org.jfree.chart.plot.Marker.this.labelAnchor) != (that.labelAnchor)) {
			return false;
		}
		if ((org.jfree.chart.plot.Marker.this.labelTextAnchor) != (that.labelTextAnchor)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.Marker.this.labelOffset, that.labelOffset))) {
			return false;
		}
		if (!(org.jfree.chart.plot.Marker.this.labelOffsetType.equals(that.labelOffsetType))) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.Marker.this.paint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.Marker.this.stroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.Marker.this.outlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.Marker.this.outlineStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.Marker.this.labelPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.plot.Marker.this.paint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.Marker.this.stroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.Marker.this.outlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.Marker.this.outlineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.Marker.this.labelPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.Marker.this.listenerList = new javax.swing.event.EventListenerList();
	}
}

