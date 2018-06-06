

package org.jfree.chart.axis;


public class CategoryTick extends org.jfree.chart.axis.Tick {
	private java.lang.Comparable category;

	private org.jfree.chart.text.TextBlock label;

	private org.jfree.chart.text.TextBlockAnchor labelAnchor;

	public CategoryTick(java.lang.Comparable category, org.jfree.chart.text.TextBlock label, org.jfree.chart.text.TextBlockAnchor labelAnchor, org.jfree.chart.text.TextAnchor rotationAnchor, double angle) {
		super("", org.jfree.chart.text.TextAnchor.CENTER, rotationAnchor, angle);
		org.jfree.chart.axis.CategoryTick.this.category = category;
		org.jfree.chart.axis.CategoryTick.this.label = label;
		org.jfree.chart.axis.CategoryTick.this.labelAnchor = labelAnchor;
	}

	public java.lang.Comparable getCategory() {
		return org.jfree.chart.axis.CategoryTick.this.category;
	}

	public org.jfree.chart.text.TextBlock getLabel() {
		return org.jfree.chart.axis.CategoryTick.this.label;
	}

	public org.jfree.chart.text.TextBlockAnchor getLabelAnchor() {
		return org.jfree.chart.axis.CategoryTick.this.labelAnchor;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.chart.axis.CategoryTick.this) == obj) {
			return true;
		}
		if ((obj instanceof org.jfree.chart.axis.CategoryTick) && (super.equals(obj))) {
			org.jfree.chart.axis.CategoryTick that = ((org.jfree.chart.axis.CategoryTick) (obj));
			if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.axis.CategoryTick.this.category, that.category))) {
				return false;
			}
			if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.axis.CategoryTick.this.label, that.label))) {
				return false;
			}
			if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.axis.CategoryTick.this.labelAnchor, that.labelAnchor))) {
				return false;
			}
			return true;
		}
		return false;
	}

	public int hashCode() {
		int result = 41;
		result = (37 * result) + (org.jfree.chart.axis.CategoryTick.this.category.hashCode());
		result = (37 * result) + (org.jfree.chart.axis.CategoryTick.this.label.hashCode());
		result = (37 * result) + (org.jfree.chart.axis.CategoryTick.this.labelAnchor.hashCode());
		return result;
	}
}

