

package org.jfree.chart.entity;


public class XYItemEntity extends org.jfree.chart.entity.ChartEntity {
	private static final long serialVersionUID = -3870862224880283771L;

	private transient org.jfree.data.xy.XYDataset dataset;

	private int series;

	private int item;

	public XYItemEntity(java.awt.Shape area, org.jfree.data.xy.XYDataset dataset, int series, int item, java.lang.String toolTipText, java.lang.String urlText) {
		super(area, toolTipText, urlText);
		org.jfree.chart.entity.XYItemEntity.this.dataset = dataset;
		org.jfree.chart.entity.XYItemEntity.this.series = series;
		org.jfree.chart.entity.XYItemEntity.this.item = item;
	}

	public org.jfree.data.xy.XYDataset getDataset() {
		return org.jfree.chart.entity.XYItemEntity.this.dataset;
	}

	public void setDataset(org.jfree.data.xy.XYDataset dataset) {
		org.jfree.chart.entity.XYItemEntity.this.dataset = dataset;
	}

	public int getSeriesIndex() {
		return org.jfree.chart.entity.XYItemEntity.this.series;
	}

	public void setSeriesIndex(int series) {
		org.jfree.chart.entity.XYItemEntity.this.series = series;
	}

	public int getItem() {
		return org.jfree.chart.entity.XYItemEntity.this.item;
	}

	public void setItem(int item) {
		org.jfree.chart.entity.XYItemEntity.this.item = item;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.entity.XYItemEntity.this)) {
			return true;
		}
		if ((obj instanceof org.jfree.chart.entity.XYItemEntity) && (super.equals(obj))) {
			org.jfree.chart.entity.XYItemEntity ie = ((org.jfree.chart.entity.XYItemEntity) (obj));
			if ((org.jfree.chart.entity.XYItemEntity.this.series) != (ie.series)) {
				return false;
			}
			if ((org.jfree.chart.entity.XYItemEntity.this.item) != (ie.item)) {
				return false;
			}
			return true;
		}
		return false;
	}

	public java.lang.String toString() {
		return (((("XYItemEntity: series = " + (getSeriesIndex())) + ", item = ") + (getItem())) + ", dataset = ") + (getDataset());
	}
}

