

package org.jfree.chart.title;


public class LegendItemBlockContainer extends org.jfree.chart.block.BlockContainer {
	private org.jfree.data.general.Dataset dataset;

	private java.lang.Comparable seriesKey;

	private java.lang.String toolTipText;

	private java.lang.String urlText;

	public LegendItemBlockContainer(org.jfree.chart.block.Arrangement arrangement, org.jfree.data.general.Dataset dataset, java.lang.Comparable seriesKey) {
		super(arrangement);
		org.jfree.chart.title.LegendItemBlockContainer.this.dataset = dataset;
		org.jfree.chart.title.LegendItemBlockContainer.this.seriesKey = seriesKey;
	}

	public org.jfree.data.general.Dataset getDataset() {
		return org.jfree.chart.title.LegendItemBlockContainer.this.dataset;
	}

	public java.lang.Comparable getSeriesKey() {
		return org.jfree.chart.title.LegendItemBlockContainer.this.seriesKey;
	}

	public java.lang.String getToolTipText() {
		return org.jfree.chart.title.LegendItemBlockContainer.this.toolTipText;
	}

	public void setToolTipText(java.lang.String text) {
		org.jfree.chart.title.LegendItemBlockContainer.this.toolTipText = text;
	}

	public java.lang.String getURLText() {
		return org.jfree.chart.title.LegendItemBlockContainer.this.urlText;
	}

	public void setURLText(java.lang.String text) {
		org.jfree.chart.title.LegendItemBlockContainer.this.urlText = text;
	}

	public java.lang.Object draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.lang.Object params) {
		super.draw(g2, area, null);
		org.jfree.chart.block.EntityBlockParams ebp = null;
		org.jfree.chart.block.BlockResult r = new org.jfree.chart.block.BlockResult();
		if (params instanceof org.jfree.chart.block.EntityBlockParams) {
			ebp = ((org.jfree.chart.block.EntityBlockParams) (params));
			if (ebp.getGenerateEntities()) {
				org.jfree.chart.entity.EntityCollection ec = new org.jfree.chart.entity.StandardEntityCollection();
				org.jfree.chart.entity.LegendItemEntity entity = new org.jfree.chart.entity.LegendItemEntity(((java.awt.Shape) (area.clone())));
				entity.setSeriesKey(org.jfree.chart.title.LegendItemBlockContainer.this.seriesKey);
				entity.setDataset(org.jfree.chart.title.LegendItemBlockContainer.this.dataset);
				entity.setToolTipText(getToolTipText());
				entity.setURLText(getURLText());
				ec.add(entity);
				r.setEntityCollection(ec);
			}
		}
		return r;
	}
}

