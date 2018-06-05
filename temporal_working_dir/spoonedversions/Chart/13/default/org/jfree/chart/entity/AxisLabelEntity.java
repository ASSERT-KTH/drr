

package org.jfree.chart.entity;


public class AxisLabelEntity extends org.jfree.chart.entity.ChartEntity {
	private org.jfree.chart.axis.Axis axis;

	public AxisLabelEntity(org.jfree.chart.axis.Axis axis, java.awt.Shape hotspot, java.lang.String toolTipText, java.lang.String url) {
		super(hotspot, toolTipText, url);
		if (axis == null) {
			throw new java.lang.IllegalArgumentException("Null 'axis' argument.");
		}
		org.jfree.chart.entity.AxisLabelEntity.this.axis = axis;
	}

	public org.jfree.chart.axis.Axis getAxis() {
		return org.jfree.chart.entity.AxisLabelEntity.this.axis;
	}

	public java.lang.String toString() {
		java.lang.StringBuffer buf = new java.lang.StringBuffer("AxisLabelEntity: ");
		buf.append("label = ");
		buf.append(org.jfree.chart.entity.AxisLabelEntity.this.axis.getLabel());
		return buf.toString();
	}
}

