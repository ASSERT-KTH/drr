

package org.jfree.chart.annotations;


public abstract class AbstractXYAnnotation implements org.jfree.chart.annotations.XYAnnotation {
	private java.lang.String toolTipText;

	private java.lang.String url;

	protected AbstractXYAnnotation() {
		org.jfree.chart.annotations.AbstractXYAnnotation.this.toolTipText = null;
		org.jfree.chart.annotations.AbstractXYAnnotation.this.url = null;
	}

	public java.lang.String getToolTipText() {
		return org.jfree.chart.annotations.AbstractXYAnnotation.this.toolTipText;
	}

	public void setToolTipText(java.lang.String text) {
		org.jfree.chart.annotations.AbstractXYAnnotation.this.toolTipText = text;
	}

	public java.lang.String getURL() {
		return org.jfree.chart.annotations.AbstractXYAnnotation.this.url;
	}

	public void setURL(java.lang.String url) {
		org.jfree.chart.annotations.AbstractXYAnnotation.this.url = url;
	}

	public abstract void draw(java.awt.Graphics2D g2, org.jfree.chart.plot.XYPlot plot, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, int rendererIndex, org.jfree.chart.plot.PlotRenderingInfo info);

	protected void addEntity(org.jfree.chart.plot.PlotRenderingInfo info, java.awt.Shape hotspot, int rendererIndex, java.lang.String toolTipText, java.lang.String urlText) {
		if (info == null) {
			return ;
		}
		org.jfree.chart.entity.EntityCollection entities = info.getOwner().getEntityCollection();
		if (entities == null) {
			return ;
		}
		org.jfree.chart.entity.XYAnnotationEntity entity = new org.jfree.chart.entity.XYAnnotationEntity(hotspot, rendererIndex, toolTipText, urlText);
		entities.add(entity);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.annotations.AbstractXYAnnotation.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.annotations.AbstractXYAnnotation)) {
			return false;
		}
		org.jfree.chart.annotations.AbstractXYAnnotation that = ((org.jfree.chart.annotations.AbstractXYAnnotation) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.annotations.AbstractXYAnnotation.this.toolTipText, that.toolTipText))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.annotations.AbstractXYAnnotation.this.url, that.url))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 193;
		if ((org.jfree.chart.annotations.AbstractXYAnnotation.this.toolTipText) != null) {
			result = (37 * result) + (org.jfree.chart.annotations.AbstractXYAnnotation.this.toolTipText.hashCode());
		}
		if ((org.jfree.chart.annotations.AbstractXYAnnotation.this.url) != null) {
			result = (37 * result) + (org.jfree.chart.annotations.AbstractXYAnnotation.this.url.hashCode());
		}
		return result;
	}
}

