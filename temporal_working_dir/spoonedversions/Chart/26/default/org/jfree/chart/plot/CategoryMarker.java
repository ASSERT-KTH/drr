

package org.jfree.chart.plot;


public class CategoryMarker extends org.jfree.chart.plot.Marker implements java.io.Serializable , java.lang.Cloneable {
	private java.lang.Comparable key;

	private boolean drawAsLine = false;

	public CategoryMarker(java.lang.Comparable key) {
		this(key, java.awt.Color.gray, new java.awt.BasicStroke(1.0F));
	}

	public CategoryMarker(java.lang.Comparable key, java.awt.Paint paint, java.awt.Stroke stroke) {
		this(key, paint, stroke, paint, stroke, 1.0F);
	}

	public CategoryMarker(java.lang.Comparable key, java.awt.Paint paint, java.awt.Stroke stroke, java.awt.Paint outlinePaint, java.awt.Stroke outlineStroke, float alpha) {
		super(paint, stroke, outlinePaint, outlineStroke, alpha);
		org.jfree.chart.plot.CategoryMarker.this.key = key;
		setLabelOffsetType(org.jfree.chart.util.LengthAdjustmentType.EXPAND);
	}

	public java.lang.Comparable getKey() {
		return org.jfree.chart.plot.CategoryMarker.this.key;
	}

	public void setKey(java.lang.Comparable key) {
		if (key == null) {
			throw new java.lang.IllegalArgumentException("Null 'key' argument.");
		}
		org.jfree.chart.plot.CategoryMarker.this.key = key;
		notifyListeners(new org.jfree.chart.event.MarkerChangeEvent(org.jfree.chart.plot.CategoryMarker.this));
	}

	public boolean getDrawAsLine() {
		return org.jfree.chart.plot.CategoryMarker.this.drawAsLine;
	}

	public void setDrawAsLine(boolean drawAsLine) {
		org.jfree.chart.plot.CategoryMarker.this.drawAsLine = drawAsLine;
		notifyListeners(new org.jfree.chart.event.MarkerChangeEvent(org.jfree.chart.plot.CategoryMarker.this));
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof org.jfree.chart.plot.CategoryMarker)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.chart.plot.CategoryMarker that = ((org.jfree.chart.plot.CategoryMarker) (obj));
		if (!(org.jfree.chart.plot.CategoryMarker.this.key.equals(that.key))) {
			return false;
		}
		if ((org.jfree.chart.plot.CategoryMarker.this.drawAsLine) != (that.drawAsLine)) {
			return false;
		}
		return true;
	}
}

