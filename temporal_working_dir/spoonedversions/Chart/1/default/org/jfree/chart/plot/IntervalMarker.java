

package org.jfree.chart.plot;


public class IntervalMarker extends org.jfree.chart.plot.Marker implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = -1762344775267627916L;

	private double startValue;

	private double endValue;

	private org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer;

	public IntervalMarker(double start, double end) {
		this(start, end, java.awt.Color.gray, new java.awt.BasicStroke(0.5F), java.awt.Color.gray, new java.awt.BasicStroke(0.5F), 0.8F);
	}

	public IntervalMarker(double start, double end, java.awt.Paint paint) {
		this(start, end, paint, new java.awt.BasicStroke(0.5F), null, null, 0.8F);
	}

	public IntervalMarker(double start, double end, java.awt.Paint paint, java.awt.Stroke stroke, java.awt.Paint outlinePaint, java.awt.Stroke outlineStroke, float alpha) {
		super(paint, stroke, outlinePaint, outlineStroke, alpha);
		org.jfree.chart.plot.IntervalMarker.this.startValue = start;
		org.jfree.chart.plot.IntervalMarker.this.endValue = end;
		org.jfree.chart.plot.IntervalMarker.this.gradientPaintTransformer = null;
		setLabelOffsetType(org.jfree.chart.util.LengthAdjustmentType.CONTRACT);
	}

	public double getStartValue() {
		return org.jfree.chart.plot.IntervalMarker.this.startValue;
	}

	public void setStartValue(double value) {
		org.jfree.chart.plot.IntervalMarker.this.startValue = value;
		notifyListeners(new org.jfree.chart.event.MarkerChangeEvent(org.jfree.chart.plot.IntervalMarker.this));
	}

	public double getEndValue() {
		return org.jfree.chart.plot.IntervalMarker.this.endValue;
	}

	public void setEndValue(double value) {
		org.jfree.chart.plot.IntervalMarker.this.endValue = value;
		notifyListeners(new org.jfree.chart.event.MarkerChangeEvent(org.jfree.chart.plot.IntervalMarker.this));
	}

	public org.jfree.chart.util.GradientPaintTransformer getGradientPaintTransformer() {
		return org.jfree.chart.plot.IntervalMarker.this.gradientPaintTransformer;
	}

	public void setGradientPaintTransformer(org.jfree.chart.util.GradientPaintTransformer transformer) {
		org.jfree.chart.plot.IntervalMarker.this.gradientPaintTransformer = transformer;
		notifyListeners(new org.jfree.chart.event.MarkerChangeEvent(org.jfree.chart.plot.IntervalMarker.this));
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.IntervalMarker.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.IntervalMarker)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.chart.plot.IntervalMarker that = ((org.jfree.chart.plot.IntervalMarker) (obj));
		if ((org.jfree.chart.plot.IntervalMarker.this.startValue) != (that.startValue)) {
			return false;
		}
		if ((org.jfree.chart.plot.IntervalMarker.this.endValue) != (that.endValue)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.IntervalMarker.this.gradientPaintTransformer, that.gradientPaintTransformer))) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}
}

