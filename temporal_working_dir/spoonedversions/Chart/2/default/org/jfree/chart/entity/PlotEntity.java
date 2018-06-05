

package org.jfree.chart.entity;


public class PlotEntity extends org.jfree.chart.entity.ChartEntity {
	private static final long serialVersionUID = -4445994133561919083L;

	private org.jfree.chart.plot.Plot plot;

	public PlotEntity(java.awt.Shape area, org.jfree.chart.plot.Plot plot) {
		this(area, plot, null);
	}

	public PlotEntity(java.awt.Shape area, org.jfree.chart.plot.Plot plot, java.lang.String toolTipText) {
		this(area, plot, toolTipText, null);
	}

	public PlotEntity(java.awt.Shape area, org.jfree.chart.plot.Plot plot, java.lang.String toolTipText, java.lang.String urlText) {
		super(area, toolTipText, urlText);
		if (plot == null) {
			throw new java.lang.IllegalArgumentException("Null 'plot' argument.");
		}
		org.jfree.chart.entity.PlotEntity.this.plot = plot;
	}

	public org.jfree.chart.plot.Plot getPlot() {
		return org.jfree.chart.entity.PlotEntity.this.plot;
	}

	public java.lang.String toString() {
		java.lang.StringBuffer buf = new java.lang.StringBuffer("PlotEntity: ");
		buf.append("tooltip = ");
		buf.append(getToolTipText());
		return buf.toString();
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.entity.PlotEntity.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.entity.PlotEntity)) {
			return false;
		}
		org.jfree.chart.entity.PlotEntity that = ((org.jfree.chart.entity.PlotEntity) (obj));
		if (!(getArea().equals(that.getArea()))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(getToolTipText(), that.getToolTipText()))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(getURLText(), that.getURLText()))) {
			return false;
		}
		if (!(org.jfree.chart.entity.PlotEntity.this.plot.equals(that.plot))) {
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

