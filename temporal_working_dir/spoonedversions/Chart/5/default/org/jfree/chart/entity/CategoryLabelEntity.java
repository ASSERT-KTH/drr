

package org.jfree.chart.entity;


public class CategoryLabelEntity extends org.jfree.chart.entity.TickLabelEntity {
	private java.lang.Comparable key;

	public CategoryLabelEntity(java.lang.Comparable key, java.awt.Shape area, java.lang.String toolTipText, java.lang.String urlText) {
		super(area, toolTipText, urlText);
		org.jfree.chart.entity.CategoryLabelEntity.this.key = key;
	}

	public java.lang.Comparable getKey() {
		return org.jfree.chart.entity.CategoryLabelEntity.this.key;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.entity.CategoryLabelEntity.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.entity.CategoryLabelEntity)) {
			return false;
		}
		org.jfree.chart.entity.CategoryLabelEntity that = ((org.jfree.chart.entity.CategoryLabelEntity) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.entity.CategoryLabelEntity.this.key, that.key))) {
			return false;
		}
		return super.equals(obj);
	}

	public int hashCode() {
		int result = super.hashCode();
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.entity.CategoryLabelEntity.this.key);
		return result;
	}

	public java.lang.String toString() {
		java.lang.StringBuffer buf = new java.lang.StringBuffer("CategoryLabelEntity: ");
		buf.append("category=");
		buf.append(org.jfree.chart.entity.CategoryLabelEntity.this.key);
		buf.append((", tooltip=" + (getToolTipText())));
		buf.append((", url=" + (getURLText())));
		return buf.toString();
	}
}

