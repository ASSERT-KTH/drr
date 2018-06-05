

package org.jfree.chart.axis;


public abstract class Tick implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = 6668230383875149773L;

	private java.lang.String text;

	private org.jfree.chart.text.TextAnchor textAnchor;

	private org.jfree.chart.text.TextAnchor rotationAnchor;

	private double angle;

	public Tick(java.lang.String text, org.jfree.chart.text.TextAnchor textAnchor, org.jfree.chart.text.TextAnchor rotationAnchor, double angle) {
		if (textAnchor == null) {
			throw new java.lang.IllegalArgumentException("Null 'textAnchor' argument.");
		}
		if (rotationAnchor == null) {
			throw new java.lang.IllegalArgumentException("Null 'rotationAnchor' argument.");
		}
		org.jfree.chart.axis.Tick.this.text = text;
		org.jfree.chart.axis.Tick.this.textAnchor = textAnchor;
		org.jfree.chart.axis.Tick.this.rotationAnchor = rotationAnchor;
		org.jfree.chart.axis.Tick.this.angle = angle;
	}

	public java.lang.String getText() {
		return org.jfree.chart.axis.Tick.this.text;
	}

	public org.jfree.chart.text.TextAnchor getTextAnchor() {
		return org.jfree.chart.axis.Tick.this.textAnchor;
	}

	public org.jfree.chart.text.TextAnchor getRotationAnchor() {
		return org.jfree.chart.axis.Tick.this.rotationAnchor;
	}

	public double getAngle() {
		return org.jfree.chart.axis.Tick.this.angle;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.chart.axis.Tick.this) == obj) {
			return true;
		}
		if (obj instanceof org.jfree.chart.axis.Tick) {
			org.jfree.chart.axis.Tick t = ((org.jfree.chart.axis.Tick) (obj));
			if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.axis.Tick.this.text, t.text))) {
				return false;
			}
			if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.axis.Tick.this.textAnchor, t.textAnchor))) {
				return false;
			}
			if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.axis.Tick.this.rotationAnchor, t.rotationAnchor))) {
				return false;
			}
			if (!((org.jfree.chart.axis.Tick.this.angle) == (t.angle))) {
				return false;
			}
			return true;
		}
		return false;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.axis.Tick clone = ((org.jfree.chart.axis.Tick) (super.clone()));
		return clone;
	}

	public java.lang.String toString() {
		return org.jfree.chart.axis.Tick.this.text;
	}
}

