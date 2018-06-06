

package org.jfree.chart.plot;


public class PlotRenderingInfo implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = 8446720134379617220L;

	private org.jfree.chart.ChartRenderingInfo owner;

	private transient java.awt.geom.Rectangle2D plotArea;

	private transient java.awt.geom.Rectangle2D dataArea;

	private java.util.List subplotInfo;

	public PlotRenderingInfo(org.jfree.chart.ChartRenderingInfo owner) {
		org.jfree.chart.plot.PlotRenderingInfo.this.owner = owner;
		org.jfree.chart.plot.PlotRenderingInfo.this.dataArea = new java.awt.geom.Rectangle2D.Double();
		org.jfree.chart.plot.PlotRenderingInfo.this.subplotInfo = new java.util.ArrayList();
	}

	public org.jfree.chart.ChartRenderingInfo getOwner() {
		return org.jfree.chart.plot.PlotRenderingInfo.this.owner;
	}

	public java.awt.geom.Rectangle2D getPlotArea() {
		return org.jfree.chart.plot.PlotRenderingInfo.this.plotArea;
	}

	public void setPlotArea(java.awt.geom.Rectangle2D area) {
		org.jfree.chart.plot.PlotRenderingInfo.this.plotArea = area;
	}

	public java.awt.geom.Rectangle2D getDataArea() {
		return org.jfree.chart.plot.PlotRenderingInfo.this.dataArea;
	}

	public void setDataArea(java.awt.geom.Rectangle2D area) {
		org.jfree.chart.plot.PlotRenderingInfo.this.dataArea = area;
	}

	public int getSubplotCount() {
		return org.jfree.chart.plot.PlotRenderingInfo.this.subplotInfo.size();
	}

	public void addSubplotInfo(org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.plot.PlotRenderingInfo.this.subplotInfo.add(info);
	}

	public org.jfree.chart.plot.PlotRenderingInfo getSubplotInfo(int index) {
		return ((org.jfree.chart.plot.PlotRenderingInfo) (org.jfree.chart.plot.PlotRenderingInfo.this.subplotInfo.get(index)));
	}

	public int getSubplotIndex(java.awt.geom.Point2D source) {
		if (source == null) {
			throw new java.lang.IllegalArgumentException("Null 'source' argument.");
		}
		int subplotCount = getSubplotCount();
		for (int i = 0; i < subplotCount; i++) {
			org.jfree.chart.plot.PlotRenderingInfo info = getSubplotInfo(i);
			java.awt.geom.Rectangle2D area = info.getDataArea();
			if (area.contains(source)) {
				return i;
			}
		}
		return -1;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.chart.plot.PlotRenderingInfo.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.PlotRenderingInfo)) {
			return false;
		}
		org.jfree.chart.plot.PlotRenderingInfo that = ((org.jfree.chart.plot.PlotRenderingInfo) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.PlotRenderingInfo.this.dataArea, that.dataArea))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.PlotRenderingInfo.this.plotArea, that.plotArea))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.PlotRenderingInfo.this.subplotInfo, that.subplotInfo))) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.plot.PlotRenderingInfo clone = ((org.jfree.chart.plot.PlotRenderingInfo) (super.clone()));
		if ((org.jfree.chart.plot.PlotRenderingInfo.this.plotArea) != null) {
			clone.plotArea = ((java.awt.geom.Rectangle2D) (org.jfree.chart.plot.PlotRenderingInfo.this.plotArea.clone()));
		}
		if ((org.jfree.chart.plot.PlotRenderingInfo.this.dataArea) != null) {
			clone.dataArea = ((java.awt.geom.Rectangle2D) (org.jfree.chart.plot.PlotRenderingInfo.this.dataArea.clone()));
		}
		clone.subplotInfo = new java.util.ArrayList(org.jfree.chart.plot.PlotRenderingInfo.this.subplotInfo.size());
		for (int i = 0; i < (org.jfree.chart.plot.PlotRenderingInfo.this.subplotInfo.size()); i++) {
			org.jfree.chart.plot.PlotRenderingInfo info = ((org.jfree.chart.plot.PlotRenderingInfo) (org.jfree.chart.plot.PlotRenderingInfo.this.subplotInfo.get(i)));
			clone.subplotInfo.add(info.clone());
		}
		return clone;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writeShape(org.jfree.chart.plot.PlotRenderingInfo.this.dataArea, stream);
		org.jfree.chart.util.SerialUtilities.writeShape(org.jfree.chart.plot.PlotRenderingInfo.this.plotArea, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.plot.PlotRenderingInfo.this.dataArea = ((java.awt.geom.Rectangle2D) (org.jfree.chart.util.SerialUtilities.readShape(stream)));
		org.jfree.chart.plot.PlotRenderingInfo.this.plotArea = ((java.awt.geom.Rectangle2D) (org.jfree.chart.util.SerialUtilities.readShape(stream)));
	}
}

