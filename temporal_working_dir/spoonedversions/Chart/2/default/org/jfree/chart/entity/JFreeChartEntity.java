

package org.jfree.chart.entity;


public class JFreeChartEntity extends org.jfree.chart.entity.ChartEntity {
	private static final long serialVersionUID = -4445994133561919083L;

	private org.jfree.chart.JFreeChart chart;

	public JFreeChartEntity(java.awt.Shape area, org.jfree.chart.JFreeChart chart) {
		this(area, chart, null);
	}

	public JFreeChartEntity(java.awt.Shape area, org.jfree.chart.JFreeChart chart, java.lang.String toolTipText) {
		this(area, chart, toolTipText, null);
	}

	public JFreeChartEntity(java.awt.Shape area, org.jfree.chart.JFreeChart chart, java.lang.String toolTipText, java.lang.String urlText) {
		super(area, toolTipText, urlText);
		if (chart == null) {
			throw new java.lang.IllegalArgumentException("Null 'chart' argument.");
		}
		org.jfree.chart.entity.JFreeChartEntity.this.chart = chart;
	}

	public org.jfree.chart.JFreeChart getChart() {
		return org.jfree.chart.entity.JFreeChartEntity.this.chart;
	}

	public java.lang.String toString() {
		java.lang.StringBuffer buf = new java.lang.StringBuffer("JFreeChartEntity: ");
		buf.append("tooltip = ");
		buf.append(getToolTipText());
		return buf.toString();
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.entity.JFreeChartEntity.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.entity.JFreeChartEntity)) {
			return false;
		}
		org.jfree.chart.entity.JFreeChartEntity that = ((org.jfree.chart.entity.JFreeChartEntity) (obj));
		if (!(getArea().equals(that.getArea()))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(getToolTipText(), that.getToolTipText()))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(getURLText(), that.getURLText()))) {
			return false;
		}
		if (!(org.jfree.chart.entity.JFreeChartEntity.this.chart.equals(that.chart))) {
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

