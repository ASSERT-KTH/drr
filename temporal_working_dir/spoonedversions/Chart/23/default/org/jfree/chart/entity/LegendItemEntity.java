

package org.jfree.chart.entity;


public class LegendItemEntity extends org.jfree.chart.entity.ChartEntity implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = -7435683933545666702L;

	private org.jfree.data.general.Dataset dataset;

	private java.lang.Comparable seriesKey;

	public LegendItemEntity(java.awt.Shape area) {
		super(area);
	}

	public org.jfree.data.general.Dataset getDataset() {
		return org.jfree.chart.entity.LegendItemEntity.this.dataset;
	}

	public void setDataset(org.jfree.data.general.Dataset dataset) {
		org.jfree.chart.entity.LegendItemEntity.this.dataset = dataset;
	}

	public java.lang.Comparable getSeriesKey() {
		return org.jfree.chart.entity.LegendItemEntity.this.seriesKey;
	}

	public void setSeriesKey(java.lang.Comparable key) {
		org.jfree.chart.entity.LegendItemEntity.this.seriesKey = key;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.entity.LegendItemEntity.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.entity.LegendItemEntity)) {
			return false;
		}
		org.jfree.chart.entity.LegendItemEntity that = ((org.jfree.chart.entity.LegendItemEntity) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.entity.LegendItemEntity.this.seriesKey, that.seriesKey))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.entity.LegendItemEntity.this.dataset, that.dataset))) {
			return false;
		}
		return super.equals(obj);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	public java.lang.String toString() {
		return (("LegendItemEntity: seriesKey=" + (org.jfree.chart.entity.LegendItemEntity.this.seriesKey)) + ", dataset=") + (org.jfree.chart.entity.LegendItemEntity.this.dataset);
	}
}

