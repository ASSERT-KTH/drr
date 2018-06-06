

package org.jfree.chart.plot;


public class Crosshair implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private boolean visible;

	private double value;

	private transient java.awt.Paint paint;

	private transient java.awt.Stroke stroke;

	private boolean labelVisible;

	private org.jfree.chart.util.RectangleAnchor labelAnchor;

	private org.jfree.chart.labels.CrosshairLabelGenerator labelGenerator;

	private double labelXOffset;

	private double labelYOffset;

	private java.awt.Font labelFont;

	private transient java.awt.Paint labelPaint;

	private transient java.awt.Paint labelBackgroundPaint;

	private boolean labelOutlineVisible;

	private transient java.awt.Stroke labelOutlineStroke;

	private transient java.awt.Paint labelOutlinePaint;

	private transient java.beans.PropertyChangeSupport pcs;

	public Crosshair() {
		this(0.0);
	}

	public Crosshair(double value) {
		this(value, java.awt.Color.black, new java.awt.BasicStroke(1.0F));
	}

	public Crosshair(double value, java.awt.Paint paint, java.awt.Stroke stroke) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.plot.Crosshair.this.visible = true;
		org.jfree.chart.plot.Crosshair.this.value = value;
		org.jfree.chart.plot.Crosshair.this.paint = paint;
		org.jfree.chart.plot.Crosshair.this.stroke = stroke;
		org.jfree.chart.plot.Crosshair.this.labelVisible = false;
		org.jfree.chart.plot.Crosshair.this.labelGenerator = new org.jfree.chart.labels.StandardCrosshairLabelGenerator();
		org.jfree.chart.plot.Crosshair.this.labelAnchor = org.jfree.chart.util.RectangleAnchor.BOTTOM_LEFT;
		org.jfree.chart.plot.Crosshair.this.labelXOffset = 3.0;
		org.jfree.chart.plot.Crosshair.this.labelYOffset = 3.0;
		org.jfree.chart.plot.Crosshair.this.labelFont = new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 12);
		org.jfree.chart.plot.Crosshair.this.labelPaint = java.awt.Color.black;
		org.jfree.chart.plot.Crosshair.this.labelBackgroundPaint = new java.awt.Color(0, 0, 255, 63);
		org.jfree.chart.plot.Crosshair.this.labelOutlineVisible = true;
		org.jfree.chart.plot.Crosshair.this.labelOutlinePaint = java.awt.Color.black;
		org.jfree.chart.plot.Crosshair.this.labelOutlineStroke = new java.awt.BasicStroke(0.5F);
		org.jfree.chart.plot.Crosshair.this.pcs = new java.beans.PropertyChangeSupport(org.jfree.chart.plot.Crosshair.this);
	}

	public boolean isVisible() {
		return org.jfree.chart.plot.Crosshair.this.visible;
	}

	public void setVisible(boolean visible) {
		boolean old = org.jfree.chart.plot.Crosshair.this.visible;
		org.jfree.chart.plot.Crosshair.this.visible = visible;
		org.jfree.chart.plot.Crosshair.this.pcs.firePropertyChange("visible", old, visible);
	}

	public double getValue() {
		return org.jfree.chart.plot.Crosshair.this.value;
	}

	public void setValue(double value) {
		java.lang.Double oldValue = new java.lang.Double(org.jfree.chart.plot.Crosshair.this.value);
		org.jfree.chart.plot.Crosshair.this.value = value;
		org.jfree.chart.plot.Crosshair.this.pcs.firePropertyChange("value", oldValue, new java.lang.Double(value));
	}

	public java.awt.Paint getPaint() {
		return org.jfree.chart.plot.Crosshair.this.paint;
	}

	public void setPaint(java.awt.Paint paint) {
		java.awt.Paint old = org.jfree.chart.plot.Crosshair.this.paint;
		org.jfree.chart.plot.Crosshair.this.paint = paint;
		org.jfree.chart.plot.Crosshair.this.pcs.firePropertyChange("paint", old, paint);
	}

	public java.awt.Stroke getStroke() {
		return org.jfree.chart.plot.Crosshair.this.stroke;
	}

	public void setStroke(java.awt.Stroke stroke) {
		java.awt.Stroke old = org.jfree.chart.plot.Crosshair.this.stroke;
		org.jfree.chart.plot.Crosshair.this.stroke = stroke;
		org.jfree.chart.plot.Crosshair.this.pcs.firePropertyChange("stroke", old, stroke);
	}

	public boolean isLabelVisible() {
		return org.jfree.chart.plot.Crosshair.this.labelVisible;
	}

	public void setLabelVisible(boolean visible) {
		boolean old = org.jfree.chart.plot.Crosshair.this.labelVisible;
		org.jfree.chart.plot.Crosshair.this.labelVisible = visible;
		org.jfree.chart.plot.Crosshair.this.pcs.firePropertyChange("labelVisible", old, visible);
	}

	public org.jfree.chart.labels.CrosshairLabelGenerator getLabelGenerator() {
		return org.jfree.chart.plot.Crosshair.this.labelGenerator;
	}

	public void setLabelGenerator(org.jfree.chart.labels.CrosshairLabelGenerator generator) {
		if (generator == null) {
			throw new java.lang.IllegalArgumentException("Null 'generator' argument.");
		}
		org.jfree.chart.labels.CrosshairLabelGenerator old = org.jfree.chart.plot.Crosshair.this.labelGenerator;
		org.jfree.chart.plot.Crosshair.this.labelGenerator = generator;
		org.jfree.chart.plot.Crosshair.this.pcs.firePropertyChange("labelGenerator", old, generator);
	}

	public org.jfree.chart.util.RectangleAnchor getLabelAnchor() {
		return org.jfree.chart.plot.Crosshair.this.labelAnchor;
	}

	public void setLabelAnchor(org.jfree.chart.util.RectangleAnchor anchor) {
		org.jfree.chart.util.RectangleAnchor old = org.jfree.chart.plot.Crosshair.this.labelAnchor;
		org.jfree.chart.plot.Crosshair.this.labelAnchor = anchor;
		org.jfree.chart.plot.Crosshair.this.pcs.firePropertyChange("labelAnchor", old, anchor);
	}

	public double getLabelXOffset() {
		return org.jfree.chart.plot.Crosshair.this.labelXOffset;
	}

	public void setLabelXOffset(double offset) {
		java.lang.Double old = new java.lang.Double(org.jfree.chart.plot.Crosshair.this.labelXOffset);
		org.jfree.chart.plot.Crosshair.this.labelXOffset = offset;
		org.jfree.chart.plot.Crosshair.this.pcs.firePropertyChange("labelXOffset", old, new java.lang.Double(offset));
	}

	public double getLabelYOffset() {
		return org.jfree.chart.plot.Crosshair.this.labelYOffset;
	}

	public void setLabelYOffset(double offset) {
		java.lang.Double old = new java.lang.Double(org.jfree.chart.plot.Crosshair.this.labelYOffset);
		org.jfree.chart.plot.Crosshair.this.labelYOffset = offset;
		org.jfree.chart.plot.Crosshair.this.pcs.firePropertyChange("labelYOffset", old, new java.lang.Double(offset));
	}

	public java.awt.Font getLabelFont() {
		return org.jfree.chart.plot.Crosshair.this.labelFont;
	}

	public void setLabelFont(java.awt.Font font) {
		if (font == null) {
			throw new java.lang.IllegalArgumentException("Null 'font' argument.");
		}
		java.awt.Font old = org.jfree.chart.plot.Crosshair.this.labelFont;
		org.jfree.chart.plot.Crosshair.this.labelFont = font;
		org.jfree.chart.plot.Crosshair.this.pcs.firePropertyChange("labelFont", old, font);
	}

	public java.awt.Paint getLabelPaint() {
		return org.jfree.chart.plot.Crosshair.this.labelPaint;
	}

	public void setLabelPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		java.awt.Paint old = org.jfree.chart.plot.Crosshair.this.labelPaint;
		org.jfree.chart.plot.Crosshair.this.labelPaint = paint;
		org.jfree.chart.plot.Crosshair.this.pcs.firePropertyChange("labelPaint", old, paint);
	}

	public java.awt.Paint getLabelBackgroundPaint() {
		return org.jfree.chart.plot.Crosshair.this.labelBackgroundPaint;
	}

	public void setLabelBackgroundPaint(java.awt.Paint paint) {
		java.awt.Paint old = org.jfree.chart.plot.Crosshair.this.labelBackgroundPaint;
		org.jfree.chart.plot.Crosshair.this.labelBackgroundPaint = paint;
		org.jfree.chart.plot.Crosshair.this.pcs.firePropertyChange("labelBackgroundPaint", old, paint);
	}

	public boolean isLabelOutlineVisible() {
		return org.jfree.chart.plot.Crosshair.this.labelOutlineVisible;
	}

	public void setLabelOutlineVisible(boolean visible) {
		boolean old = org.jfree.chart.plot.Crosshair.this.labelOutlineVisible;
		org.jfree.chart.plot.Crosshair.this.labelOutlineVisible = visible;
		org.jfree.chart.plot.Crosshair.this.pcs.firePropertyChange("labelOutlineVisible", old, visible);
	}

	public java.awt.Paint getLabelOutlinePaint() {
		return org.jfree.chart.plot.Crosshair.this.labelOutlinePaint;
	}

	public void setLabelOutlinePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		java.awt.Paint old = org.jfree.chart.plot.Crosshair.this.labelOutlinePaint;
		org.jfree.chart.plot.Crosshair.this.labelOutlinePaint = paint;
		org.jfree.chart.plot.Crosshair.this.pcs.firePropertyChange("labelOutlinePaint", old, paint);
	}

	public java.awt.Stroke getLabelOutlineStroke() {
		return org.jfree.chart.plot.Crosshair.this.labelOutlineStroke;
	}

	public void setLabelOutlineStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		java.awt.Stroke old = org.jfree.chart.plot.Crosshair.this.labelOutlineStroke;
		org.jfree.chart.plot.Crosshair.this.labelOutlineStroke = stroke;
		org.jfree.chart.plot.Crosshair.this.pcs.firePropertyChange("labelOutlineStroke", old, stroke);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.Crosshair.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.Crosshair)) {
			return false;
		}
		org.jfree.chart.plot.Crosshair that = ((org.jfree.chart.plot.Crosshair) (obj));
		if ((org.jfree.chart.plot.Crosshair.this.visible) != (that.visible)) {
			return false;
		}
		if ((org.jfree.chart.plot.Crosshair.this.value) != (that.value)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.Crosshair.this.paint, that.paint))) {
			return false;
		}
		if (!(org.jfree.chart.plot.Crosshair.this.stroke.equals(that.stroke))) {
			return false;
		}
		if ((org.jfree.chart.plot.Crosshair.this.labelVisible) != (that.labelVisible)) {
			return false;
		}
		if (!(org.jfree.chart.plot.Crosshair.this.labelGenerator.equals(that.labelGenerator))) {
			return false;
		}
		if (!(org.jfree.chart.plot.Crosshair.this.labelAnchor.equals(that.labelAnchor))) {
			return false;
		}
		if ((org.jfree.chart.plot.Crosshair.this.labelXOffset) != (that.labelXOffset)) {
			return false;
		}
		if ((org.jfree.chart.plot.Crosshair.this.labelYOffset) != (that.labelYOffset)) {
			return false;
		}
		if (!(org.jfree.chart.plot.Crosshair.this.labelFont.equals(that.labelFont))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.Crosshair.this.labelPaint, that.labelPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.Crosshair.this.labelBackgroundPaint, that.labelBackgroundPaint))) {
			return false;
		}
		if ((org.jfree.chart.plot.Crosshair.this.labelOutlineVisible) != (that.labelOutlineVisible)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.Crosshair.this.labelOutlinePaint, that.labelOutlinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.plot.Crosshair.this.labelOutlineStroke.equals(that.labelOutlineStroke))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int hash = 7;
		hash = org.jfree.chart.util.HashUtilities.hashCode(hash, org.jfree.chart.plot.Crosshair.this.visible);
		hash = org.jfree.chart.util.HashUtilities.hashCode(hash, org.jfree.chart.plot.Crosshair.this.value);
		hash = org.jfree.chart.util.HashUtilities.hashCode(hash, org.jfree.chart.plot.Crosshair.this.paint);
		hash = org.jfree.chart.util.HashUtilities.hashCode(hash, org.jfree.chart.plot.Crosshair.this.stroke);
		hash = org.jfree.chart.util.HashUtilities.hashCode(hash, org.jfree.chart.plot.Crosshair.this.labelVisible);
		hash = org.jfree.chart.util.HashUtilities.hashCode(hash, org.jfree.chart.plot.Crosshair.this.labelAnchor);
		hash = org.jfree.chart.util.HashUtilities.hashCode(hash, org.jfree.chart.plot.Crosshair.this.labelGenerator);
		hash = org.jfree.chart.util.HashUtilities.hashCode(hash, org.jfree.chart.plot.Crosshair.this.labelXOffset);
		hash = org.jfree.chart.util.HashUtilities.hashCode(hash, org.jfree.chart.plot.Crosshair.this.labelYOffset);
		hash = org.jfree.chart.util.HashUtilities.hashCode(hash, org.jfree.chart.plot.Crosshair.this.labelFont);
		hash = org.jfree.chart.util.HashUtilities.hashCode(hash, org.jfree.chart.plot.Crosshair.this.labelPaint);
		hash = org.jfree.chart.util.HashUtilities.hashCode(hash, org.jfree.chart.plot.Crosshair.this.labelBackgroundPaint);
		hash = org.jfree.chart.util.HashUtilities.hashCode(hash, org.jfree.chart.plot.Crosshair.this.labelOutlineVisible);
		hash = org.jfree.chart.util.HashUtilities.hashCode(hash, org.jfree.chart.plot.Crosshair.this.labelOutlineStroke);
		hash = org.jfree.chart.util.HashUtilities.hashCode(hash, org.jfree.chart.plot.Crosshair.this.labelOutlinePaint);
		return hash;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	public void addPropertyChangeListener(java.beans.PropertyChangeListener l) {
		org.jfree.chart.plot.Crosshair.this.pcs.addPropertyChangeListener(l);
	}

	public void removePropertyChangeListener(java.beans.PropertyChangeListener l) {
		org.jfree.chart.plot.Crosshair.this.pcs.removePropertyChangeListener(l);
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.Crosshair.this.paint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.Crosshair.this.stroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.Crosshair.this.labelPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.Crosshair.this.labelBackgroundPaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.Crosshair.this.labelOutlineStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.Crosshair.this.labelOutlinePaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.plot.Crosshair.this.paint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.Crosshair.this.stroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.Crosshair.this.labelPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.Crosshair.this.labelBackgroundPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.Crosshair.this.labelOutlineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.Crosshair.this.labelOutlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.Crosshair.this.pcs = new java.beans.PropertyChangeSupport(org.jfree.chart.plot.Crosshair.this);
	}
}

