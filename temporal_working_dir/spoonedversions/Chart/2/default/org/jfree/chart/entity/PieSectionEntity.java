

package org.jfree.chart.entity;


public class PieSectionEntity extends org.jfree.chart.entity.ChartEntity implements java.io.Serializable {
	private static final long serialVersionUID = 9199892576531984162L;

	private org.jfree.data.pie.PieDataset dataset;

	private int pieIndex;

	private int sectionIndex;

	private java.lang.Comparable sectionKey;

	public PieSectionEntity(java.awt.Shape area, org.jfree.data.pie.PieDataset dataset, int pieIndex, int sectionIndex, java.lang.Comparable sectionKey, java.lang.String toolTipText, java.lang.String urlText) {
		super(area, toolTipText, urlText);
		org.jfree.chart.entity.PieSectionEntity.this.dataset = dataset;
		org.jfree.chart.entity.PieSectionEntity.this.pieIndex = pieIndex;
		org.jfree.chart.entity.PieSectionEntity.this.sectionIndex = sectionIndex;
		org.jfree.chart.entity.PieSectionEntity.this.sectionKey = sectionKey;
	}

	public org.jfree.data.pie.PieDataset getDataset() {
		return org.jfree.chart.entity.PieSectionEntity.this.dataset;
	}

	public void setDataset(org.jfree.data.pie.PieDataset dataset) {
		org.jfree.chart.entity.PieSectionEntity.this.dataset = dataset;
	}

	public int getPieIndex() {
		return org.jfree.chart.entity.PieSectionEntity.this.pieIndex;
	}

	public void setPieIndex(int index) {
		org.jfree.chart.entity.PieSectionEntity.this.pieIndex = index;
	}

	public int getSectionIndex() {
		return org.jfree.chart.entity.PieSectionEntity.this.sectionIndex;
	}

	public void setSectionIndex(int index) {
		org.jfree.chart.entity.PieSectionEntity.this.sectionIndex = index;
	}

	public java.lang.Comparable getSectionKey() {
		return org.jfree.chart.entity.PieSectionEntity.this.sectionKey;
	}

	public void setSectionKey(java.lang.Comparable key) {
		org.jfree.chart.entity.PieSectionEntity.this.sectionKey = key;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.entity.PieSectionEntity.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.entity.PieSectionEntity)) {
			return false;
		}
		org.jfree.chart.entity.PieSectionEntity that = ((org.jfree.chart.entity.PieSectionEntity) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.entity.PieSectionEntity.this.dataset, that.dataset))) {
			return false;
		}
		if ((org.jfree.chart.entity.PieSectionEntity.this.pieIndex) != (that.pieIndex)) {
			return false;
		}
		if ((org.jfree.chart.entity.PieSectionEntity.this.sectionIndex) != (that.sectionIndex)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.entity.PieSectionEntity.this.sectionKey, that.sectionKey))) {
			return false;
		}
		return super.equals(obj);
	}

	public int hashCode() {
		int result = super.hashCode();
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.entity.PieSectionEntity.this.pieIndex);
		result = org.jfree.chart.util.HashUtilities.hashCode(result, org.jfree.chart.entity.PieSectionEntity.this.sectionIndex);
		return result;
	}

	public java.lang.String toString() {
		return ((((("PieSection: " + (org.jfree.chart.entity.PieSectionEntity.this.pieIndex)) + ", ") + (org.jfree.chart.entity.PieSectionEntity.this.sectionIndex)) + "(") + (org.jfree.chart.entity.PieSectionEntity.this.sectionKey.toString())) + ")";
	}
}

