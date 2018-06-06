

package org.jfree.chart.labels;


public class ItemLabelPosition implements java.io.Serializable {
	private static final long serialVersionUID = 5845390630157034499L;

	private org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor;

	private org.jfree.chart.text.TextAnchor textAnchor;

	private org.jfree.chart.text.TextAnchor rotationAnchor;

	private double angle;

	public ItemLabelPosition() {
		this(org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE12, org.jfree.chart.text.TextAnchor.BOTTOM_CENTER, org.jfree.chart.text.TextAnchor.CENTER, 0.0);
	}

	public ItemLabelPosition(org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor, org.jfree.chart.text.TextAnchor textAnchor) {
		this(itemLabelAnchor, textAnchor, org.jfree.chart.text.TextAnchor.CENTER, 0.0);
	}

	public ItemLabelPosition(org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor, org.jfree.chart.text.TextAnchor textAnchor, org.jfree.chart.text.TextAnchor rotationAnchor, double angle) {
		if (itemLabelAnchor == null) {
			throw new java.lang.IllegalArgumentException("Null 'itemLabelAnchor' argument.");
		}
		if (textAnchor == null) {
			throw new java.lang.IllegalArgumentException("Null 'textAnchor' argument.");
		}
		if (rotationAnchor == null) {
			throw new java.lang.IllegalArgumentException("Null 'rotationAnchor' argument.");
		}
		org.jfree.chart.labels.ItemLabelPosition.this.itemLabelAnchor = itemLabelAnchor;
		org.jfree.chart.labels.ItemLabelPosition.this.textAnchor = textAnchor;
		org.jfree.chart.labels.ItemLabelPosition.this.rotationAnchor = rotationAnchor;
		org.jfree.chart.labels.ItemLabelPosition.this.angle = angle;
	}

	public org.jfree.chart.labels.ItemLabelAnchor getItemLabelAnchor() {
		return org.jfree.chart.labels.ItemLabelPosition.this.itemLabelAnchor;
	}

	public org.jfree.chart.text.TextAnchor getTextAnchor() {
		return org.jfree.chart.labels.ItemLabelPosition.this.textAnchor;
	}

	public org.jfree.chart.text.TextAnchor getRotationAnchor() {
		return org.jfree.chart.labels.ItemLabelPosition.this.rotationAnchor;
	}

	public double getAngle() {
		return org.jfree.chart.labels.ItemLabelPosition.this.angle;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.labels.ItemLabelPosition.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.labels.ItemLabelPosition)) {
			return false;
		}
		org.jfree.chart.labels.ItemLabelPosition that = ((org.jfree.chart.labels.ItemLabelPosition) (obj));
		if (!(org.jfree.chart.labels.ItemLabelPosition.this.itemLabelAnchor.equals(that.itemLabelAnchor))) {
			return false;
		}
		if (!(org.jfree.chart.labels.ItemLabelPosition.this.textAnchor.equals(that.textAnchor))) {
			return false;
		}
		if (!(org.jfree.chart.labels.ItemLabelPosition.this.rotationAnchor.equals(that.rotationAnchor))) {
			return false;
		}
		if ((org.jfree.chart.labels.ItemLabelPosition.this.angle) != (that.angle)) {
			return false;
		}
		return true;
	}
}

