

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

	public java.lang.String toString() {
		java.lang.StringBuffer buf = new java.lang.StringBuffer("CategoryLabelEntity: ");
		buf.append("category=");
		buf.append(org.jfree.chart.entity.CategoryLabelEntity.this.key);
		buf.append((", tooltip=" + (getToolTipText())));
		buf.append((", url=" + (getURLText())));
		return buf.toString();
	}
}

