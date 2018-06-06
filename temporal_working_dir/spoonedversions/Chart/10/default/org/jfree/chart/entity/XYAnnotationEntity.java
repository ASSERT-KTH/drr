

package org.jfree.chart.entity;


public class XYAnnotationEntity extends org.jfree.chart.entity.ChartEntity implements java.io.Serializable {
	private static final long serialVersionUID = 2340334068383660799L;

	private int rendererIndex;

	public XYAnnotationEntity(java.awt.Shape hotspot, int rendererIndex, java.lang.String toolTipText, java.lang.String urlText) {
		super(hotspot, toolTipText, urlText);
		org.jfree.chart.entity.XYAnnotationEntity.this.rendererIndex = rendererIndex;
	}

	public int getRendererIndex() {
		return org.jfree.chart.entity.XYAnnotationEntity.this.rendererIndex;
	}

	public void setRendererIndex(int index) {
		org.jfree.chart.entity.XYAnnotationEntity.this.rendererIndex = index;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.entity.XYAnnotationEntity.this)) {
			return true;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		if (!(obj instanceof org.jfree.chart.entity.XYAnnotationEntity)) {
			return false;
		}
		org.jfree.chart.entity.XYAnnotationEntity that = ((org.jfree.chart.entity.XYAnnotationEntity) (obj));
		if ((org.jfree.chart.entity.XYAnnotationEntity.this.rendererIndex) != (that.rendererIndex)) {
			return false;
		}
		return true;
	}
}

