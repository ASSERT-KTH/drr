

package org.jfree.chart.plot;


public class MeterInterval implements java.io.Serializable {
	private static final long serialVersionUID = 1530982090622488257L;

	private java.lang.String label;

	private org.jfree.data.Range range;

	private transient java.awt.Paint outlinePaint;

	private transient java.awt.Stroke outlineStroke;

	private transient java.awt.Paint backgroundPaint;

	public MeterInterval(java.lang.String label, org.jfree.data.Range range) {
		this(label, range, java.awt.Color.yellow, new java.awt.BasicStroke(2.0F), null);
	}

	public MeterInterval(java.lang.String label, org.jfree.data.Range range, java.awt.Paint outlinePaint, java.awt.Stroke outlineStroke, java.awt.Paint backgroundPaint) {
		if (label == null) {
			throw new java.lang.IllegalArgumentException("Null 'label' argument.");
		}
		if (range == null) {
			throw new java.lang.IllegalArgumentException("Null 'range' argument.");
		}
		org.jfree.chart.plot.MeterInterval.this.label = label;
		org.jfree.chart.plot.MeterInterval.this.range = range;
		org.jfree.chart.plot.MeterInterval.this.outlinePaint = outlinePaint;
		org.jfree.chart.plot.MeterInterval.this.outlineStroke = outlineStroke;
		org.jfree.chart.plot.MeterInterval.this.backgroundPaint = backgroundPaint;
	}

	public java.lang.String getLabel() {
		return org.jfree.chart.plot.MeterInterval.this.label;
	}

	public org.jfree.data.Range getRange() {
		return org.jfree.chart.plot.MeterInterval.this.range;
	}

	public java.awt.Paint getBackgroundPaint() {
		return org.jfree.chart.plot.MeterInterval.this.backgroundPaint;
	}

	public java.awt.Paint getOutlinePaint() {
		return org.jfree.chart.plot.MeterInterval.this.outlinePaint;
	}

	public java.awt.Stroke getOutlineStroke() {
		return org.jfree.chart.plot.MeterInterval.this.outlineStroke;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.MeterInterval.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.MeterInterval)) {
			return false;
		}
		org.jfree.chart.plot.MeterInterval that = ((org.jfree.chart.plot.MeterInterval) (obj));
		if (!(org.jfree.chart.plot.MeterInterval.this.label.equals(that.label))) {
			return false;
		}
		if (!(org.jfree.chart.plot.MeterInterval.this.range.equals(that.range))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.MeterInterval.this.outlinePaint, that.outlinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.MeterInterval.this.outlineStroke, that.outlineStroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.MeterInterval.this.backgroundPaint, that.backgroundPaint))) {
			return false;
		}
		return true;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.MeterInterval.this.outlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.MeterInterval.this.outlineStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.MeterInterval.this.backgroundPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.plot.MeterInterval.this.outlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.MeterInterval.this.outlineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.MeterInterval.this.backgroundPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}

