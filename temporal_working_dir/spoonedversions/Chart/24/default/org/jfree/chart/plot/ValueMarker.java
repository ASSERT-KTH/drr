

package org.jfree.chart.plot;


public class ValueMarker extends org.jfree.chart.plot.Marker {
	private double value;

	public ValueMarker(double value) {
		super();
		org.jfree.chart.plot.ValueMarker.this.value = value;
	}

	public ValueMarker(double value, java.awt.Paint paint, java.awt.Stroke stroke) {
		this(value, paint, stroke, paint, stroke, 1.0F);
	}

	public ValueMarker(double value, java.awt.Paint paint, java.awt.Stroke stroke, java.awt.Paint outlinePaint, java.awt.Stroke outlineStroke, float alpha) {
		super(paint, stroke, paint, stroke, alpha);
		org.jfree.chart.plot.ValueMarker.this.value = value;
	}

	public double getValue() {
		return org.jfree.chart.plot.ValueMarker.this.value;
	}

	public void setValue(double value) {
		org.jfree.chart.plot.ValueMarker.this.value = value;
		notifyListeners(new org.jfree.chart.event.MarkerChangeEvent(org.jfree.chart.plot.ValueMarker.this));
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.ValueMarker.this)) {
			return true;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		if (!(obj instanceof org.jfree.chart.plot.ValueMarker)) {
			return false;
		}
		org.jfree.chart.plot.ValueMarker that = ((org.jfree.chart.plot.ValueMarker) (obj));
		if ((org.jfree.chart.plot.ValueMarker.this.value) != (that.value)) {
			return false;
		}
		return true;
	}
}

