

package org.jfree.chart;


public class ChartRenderingInfo implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = 2751952018173406822L;

	private transient java.awt.geom.Rectangle2D chartArea;

	private org.jfree.chart.plot.PlotRenderingInfo plotInfo;

	private org.jfree.chart.entity.EntityCollection entities;

	private org.jfree.chart.RenderingSource renderingSource;

	public ChartRenderingInfo() {
		this(new org.jfree.chart.entity.StandardEntityCollection());
	}

	public ChartRenderingInfo(org.jfree.chart.entity.EntityCollection entities) {
		org.jfree.chart.ChartRenderingInfo.this.chartArea = new java.awt.geom.Rectangle2D.Double();
		org.jfree.chart.ChartRenderingInfo.this.plotInfo = new org.jfree.chart.plot.PlotRenderingInfo(org.jfree.chart.ChartRenderingInfo.this);
		org.jfree.chart.ChartRenderingInfo.this.entities = entities;
	}

	public java.awt.geom.Rectangle2D getChartArea() {
		return org.jfree.chart.ChartRenderingInfo.this.chartArea;
	}

	public void setChartArea(java.awt.geom.Rectangle2D area) {
		org.jfree.chart.ChartRenderingInfo.this.chartArea.setRect(area);
	}

	public org.jfree.chart.entity.EntityCollection getEntityCollection() {
		return org.jfree.chart.ChartRenderingInfo.this.entities;
	}

	public void setEntityCollection(org.jfree.chart.entity.EntityCollection entities) {
		org.jfree.chart.ChartRenderingInfo.this.entities = entities;
	}

	public org.jfree.chart.RenderingSource getRenderingSource() {
		return org.jfree.chart.ChartRenderingInfo.this.renderingSource;
	}

	public void setRenderingSource(org.jfree.chart.RenderingSource source) {
		org.jfree.chart.ChartRenderingInfo.this.renderingSource = source;
	}

	public void clear() {
		org.jfree.chart.ChartRenderingInfo.this.chartArea.setRect(0.0, 0.0, 0.0, 0.0);
		org.jfree.chart.ChartRenderingInfo.this.plotInfo = new org.jfree.chart.plot.PlotRenderingInfo(org.jfree.chart.ChartRenderingInfo.this);
		if ((org.jfree.chart.ChartRenderingInfo.this.entities) != null) {
			org.jfree.chart.ChartRenderingInfo.this.entities.clear();
		}
	}

	public org.jfree.chart.plot.PlotRenderingInfo getPlotInfo() {
		return org.jfree.chart.ChartRenderingInfo.this.plotInfo;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.ChartRenderingInfo.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.ChartRenderingInfo)) {
			return false;
		}
		org.jfree.chart.ChartRenderingInfo that = ((org.jfree.chart.ChartRenderingInfo) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.ChartRenderingInfo.this.chartArea, that.chartArea))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.ChartRenderingInfo.this.plotInfo, that.plotInfo))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.ChartRenderingInfo.this.entities, that.entities))) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.ChartRenderingInfo clone = ((org.jfree.chart.ChartRenderingInfo) (super.clone()));
		if ((org.jfree.chart.ChartRenderingInfo.this.chartArea) != null) {
			clone.chartArea = ((java.awt.geom.Rectangle2D) (org.jfree.chart.ChartRenderingInfo.this.chartArea.clone()));
		}
		if ((org.jfree.chart.ChartRenderingInfo.this.entities) instanceof org.jfree.chart.util.PublicCloneable) {
			org.jfree.chart.util.PublicCloneable pc = ((org.jfree.chart.util.PublicCloneable) (org.jfree.chart.ChartRenderingInfo.this.entities));
			clone.entities = ((org.jfree.chart.entity.EntityCollection) (pc.clone()));
		}
		return clone;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writeShape(org.jfree.chart.ChartRenderingInfo.this.chartArea, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.ChartRenderingInfo.this.chartArea = ((java.awt.geom.Rectangle2D) (org.jfree.chart.util.SerialUtilities.readShape(stream)));
	}
}

