

package org.jfree.chart.entity;


public class CategoryItemEntity extends org.jfree.chart.entity.ChartEntity implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = -8657249457902337349L;

	private org.jfree.data.category.CategoryDataset dataset;

	private java.lang.Comparable rowKey;

	private java.lang.Comparable columnKey;

	public CategoryItemEntity(java.awt.Shape area, java.lang.String toolTipText, java.lang.String urlText, org.jfree.data.category.CategoryDataset dataset, java.lang.Comparable rowKey, java.lang.Comparable columnKey) {
		super(area, toolTipText, urlText);
		if (dataset == null) {
			throw new java.lang.IllegalArgumentException("Null 'dataset' argument.");
		}
		org.jfree.chart.entity.CategoryItemEntity.this.dataset = dataset;
		org.jfree.chart.entity.CategoryItemEntity.this.rowKey = rowKey;
		org.jfree.chart.entity.CategoryItemEntity.this.columnKey = columnKey;
	}

	public org.jfree.data.category.CategoryDataset getDataset() {
		return org.jfree.chart.entity.CategoryItemEntity.this.dataset;
	}

	public void setDataset(org.jfree.data.category.CategoryDataset dataset) {
		if (dataset == null) {
			throw new java.lang.IllegalArgumentException("Null 'dataset' argument.");
		}
		org.jfree.chart.entity.CategoryItemEntity.this.dataset = dataset;
	}

	public java.lang.Comparable getRowKey() {
		return org.jfree.chart.entity.CategoryItemEntity.this.rowKey;
	}

	public void setRowKey(java.lang.Comparable rowKey) {
		org.jfree.chart.entity.CategoryItemEntity.this.rowKey = rowKey;
	}

	public java.lang.Comparable getColumnKey() {
		return org.jfree.chart.entity.CategoryItemEntity.this.columnKey;
	}

	public void setColumnKey(java.lang.Comparable columnKey) {
		org.jfree.chart.entity.CategoryItemEntity.this.columnKey = columnKey;
	}

	public java.lang.String toString() {
		return (((("CategoryItemEntity: rowKey=" + (org.jfree.chart.entity.CategoryItemEntity.this.rowKey)) + ", columnKey=") + (org.jfree.chart.entity.CategoryItemEntity.this.columnKey)) + ", dataset=") + (org.jfree.chart.entity.CategoryItemEntity.this.dataset);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.entity.CategoryItemEntity.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.entity.CategoryItemEntity)) {
			return false;
		}
		org.jfree.chart.entity.CategoryItemEntity that = ((org.jfree.chart.entity.CategoryItemEntity) (obj));
		if (!(org.jfree.chart.entity.CategoryItemEntity.this.rowKey.equals(that.rowKey))) {
			return false;
		}
		if (!(org.jfree.chart.entity.CategoryItemEntity.this.columnKey.equals(that.columnKey))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.entity.CategoryItemEntity.this.dataset, that.dataset))) {
			return false;
		}
		return super.equals(obj);
	}
}

