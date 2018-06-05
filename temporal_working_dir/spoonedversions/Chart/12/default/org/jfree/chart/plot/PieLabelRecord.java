

package org.jfree.chart.plot;


public class PieLabelRecord implements java.io.Serializable , java.lang.Comparable {
	private java.lang.Comparable key;

	private double angle;

	private double baseY;

	private double allocatedY;

	private org.jfree.chart.text.TextBox label;

	private double labelHeight;

	private double gap;

	private double linkPercent;

	public PieLabelRecord(java.lang.Comparable key, double angle, double baseY, org.jfree.chart.text.TextBox label, double labelHeight, double gap, double linkPercent) {
		org.jfree.chart.plot.PieLabelRecord.this.key = key;
		org.jfree.chart.plot.PieLabelRecord.this.angle = angle;
		org.jfree.chart.plot.PieLabelRecord.this.baseY = baseY;
		org.jfree.chart.plot.PieLabelRecord.this.allocatedY = baseY;
		org.jfree.chart.plot.PieLabelRecord.this.label = label;
		org.jfree.chart.plot.PieLabelRecord.this.labelHeight = labelHeight;
		org.jfree.chart.plot.PieLabelRecord.this.gap = gap;
		org.jfree.chart.plot.PieLabelRecord.this.linkPercent = linkPercent;
	}

	public double getBaseY() {
		return org.jfree.chart.plot.PieLabelRecord.this.baseY;
	}

	public void setBaseY(double base) {
		org.jfree.chart.plot.PieLabelRecord.this.baseY = base;
	}

	public double getLowerY() {
		return (org.jfree.chart.plot.PieLabelRecord.this.allocatedY) - ((org.jfree.chart.plot.PieLabelRecord.this.labelHeight) / 2.0);
	}

	public double getUpperY() {
		return (org.jfree.chart.plot.PieLabelRecord.this.allocatedY) + ((org.jfree.chart.plot.PieLabelRecord.this.labelHeight) / 2.0);
	}

	public double getAngle() {
		return org.jfree.chart.plot.PieLabelRecord.this.angle;
	}

	public java.lang.Comparable getKey() {
		return org.jfree.chart.plot.PieLabelRecord.this.key;
	}

	public org.jfree.chart.text.TextBox getLabel() {
		return org.jfree.chart.plot.PieLabelRecord.this.label;
	}

	public double getLabelHeight() {
		return org.jfree.chart.plot.PieLabelRecord.this.labelHeight;
	}

	public double getAllocatedY() {
		return org.jfree.chart.plot.PieLabelRecord.this.allocatedY;
	}

	public void setAllocatedY(double y) {
		org.jfree.chart.plot.PieLabelRecord.this.allocatedY = y;
	}

	public double getGap() {
		return org.jfree.chart.plot.PieLabelRecord.this.gap;
	}

	public double getLinkPercent() {
		return org.jfree.chart.plot.PieLabelRecord.this.linkPercent;
	}

	public int compareTo(java.lang.Object obj) {
		int result = 0;
		if (obj instanceof org.jfree.chart.plot.PieLabelRecord) {
			org.jfree.chart.plot.PieLabelRecord plr = ((org.jfree.chart.plot.PieLabelRecord) (obj));
			if ((org.jfree.chart.plot.PieLabelRecord.this.baseY) < (plr.baseY)) {
				result = -1;
			}else
				if ((org.jfree.chart.plot.PieLabelRecord.this.baseY) > (plr.baseY)) {
					result = 1;
				}
			
		}
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.PieLabelRecord.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.PieLabelRecord)) {
			return false;
		}
		org.jfree.chart.plot.PieLabelRecord that = ((org.jfree.chart.plot.PieLabelRecord) (obj));
		if (!(org.jfree.chart.plot.PieLabelRecord.this.key.equals(that.key))) {
			return false;
		}
		if ((org.jfree.chart.plot.PieLabelRecord.this.angle) != (that.angle)) {
			return false;
		}
		if ((org.jfree.chart.plot.PieLabelRecord.this.gap) != (that.gap)) {
			return false;
		}
		if ((org.jfree.chart.plot.PieLabelRecord.this.allocatedY) != (that.allocatedY)) {
			return false;
		}
		if ((org.jfree.chart.plot.PieLabelRecord.this.baseY) != (that.baseY)) {
			return false;
		}
		if ((org.jfree.chart.plot.PieLabelRecord.this.labelHeight) != (that.labelHeight)) {
			return false;
		}
		if ((org.jfree.chart.plot.PieLabelRecord.this.linkPercent) != (that.linkPercent)) {
			return false;
		}
		if (!(org.jfree.chart.plot.PieLabelRecord.this.label.equals(that.label))) {
			return false;
		}
		return true;
	}

	public java.lang.String toString() {
		return ((org.jfree.chart.plot.PieLabelRecord.this.baseY) + ", ") + (org.jfree.chart.plot.PieLabelRecord.this.key.toString());
	}
}

