

package org.jfree.chart.entity;


public class AxisLabelEntity extends org.jfree.chart.entity.ChartEntity {
	private org.jfree.chart.axis.Axis axis;

	public AxisLabelEntity(org.jfree.chart.axis.Axis axis, java.awt.Shape hotspot, java.lang.String toolTipText, java.lang.String url) {
		super(hotspot, toolTipText, url);
	}

	public org.jfree.chart.axis.Axis getAxis() {
		return org.jfree.chart.entity.AxisLabelEntity.this.axis;
	}
}

