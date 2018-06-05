

package org.jfree.chart.entity;


public class AxisEntity extends org.jfree.chart.entity.ChartEntity {
	private static final long serialVersionUID = -4445994133561919083L;

	private org.jfree.chart.axis.Axis axis;

	public AxisEntity(java.awt.Shape area, org.jfree.chart.axis.Axis axis) {
		this(area, axis, null);
	}

	public AxisEntity(java.awt.Shape area, org.jfree.chart.axis.Axis axis, java.lang.String toolTipText) {
		this(area, axis, toolTipText, null);
	}

	public AxisEntity(java.awt.Shape area, org.jfree.chart.axis.Axis axis, java.lang.String toolTipText, java.lang.String urlText) {
		super(area, toolTipText, urlText);
		if (axis == null) {
			throw new java.lang.IllegalArgumentException("Null 'axis' argument.");
		}
		org.jfree.chart.entity.AxisEntity.this.axis = axis;
	}

	public org.jfree.chart.axis.Axis getAxis() {
		return org.jfree.chart.entity.AxisEntity.this.axis;
	}

	public java.lang.String toString() {
		java.lang.StringBuffer buf = new java.lang.StringBuffer("AxisEntity: ");
		buf.append("tooltip = ");
		buf.append(getToolTipText());
		return buf.toString();
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.entity.AxisEntity.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.entity.AxisEntity)) {
			return false;
		}
		org.jfree.chart.entity.AxisEntity that = ((org.jfree.chart.entity.AxisEntity) (obj));
		if (!(getArea().equals(that.getArea()))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(getToolTipText(), that.getToolTipText()))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(getURLText(), that.getURLText()))) {
			return false;
		}
		if (!(org.jfree.chart.entity.AxisEntity.this.axis.equals(that.axis))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 39;
		result = org.jfree.chart.util.HashUtilities.hashCode(result, getToolTipText());
		result = org.jfree.chart.util.HashUtilities.hashCode(result, getURLText());
		return result;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writeShape(getArea(), stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		setArea(org.jfree.chart.util.SerialUtilities.readShape(stream));
	}
}

