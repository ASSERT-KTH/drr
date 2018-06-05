

package org.jfree.chart.renderer.xy;


public class VectorRenderer extends org.jfree.chart.renderer.xy.AbstractXYItemRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.renderer.xy.XYItemRenderer , org.jfree.chart.util.PublicCloneable {
	private double baseLength = 0.1;

	private double headLength = 0.14;

	public VectorRenderer() {
	}

	public org.jfree.data.Range findDomainBounds(org.jfree.data.xy.XYDataset dataset) {
		if (dataset == null) {
			throw new java.lang.IllegalArgumentException("Null 'dataset' argument.");
		}
		double minimum = java.lang.Double.POSITIVE_INFINITY;
		double maximum = java.lang.Double.NEGATIVE_INFINITY;
		int seriesCount = dataset.getSeriesCount();
		double lvalue;
		double uvalue;
		if (dataset instanceof org.jfree.data.xy.VectorXYDataset) {
			org.jfree.data.xy.VectorXYDataset vdataset = ((org.jfree.data.xy.VectorXYDataset) (dataset));
			for (int series = 0; series < seriesCount; series++) {
				int itemCount = dataset.getItemCount(series);
				for (int item = 0; item < itemCount; item++) {
					double delta = vdataset.getVectorXValue(series, item);
					if (delta < 0.0) {
						uvalue = vdataset.getXValue(series, item);
						lvalue = uvalue + delta;
					}else {
						lvalue = vdataset.getXValue(series, item);
						uvalue = lvalue + delta;
					}
					minimum = java.lang.Math.min(minimum, lvalue);
					maximum = java.lang.Math.max(maximum, uvalue);
				}
			}
		}else {
			for (int series = 0; series < seriesCount; series++) {
				int itemCount = dataset.getItemCount(series);
				for (int item = 0; item < itemCount; item++) {
					lvalue = dataset.getXValue(series, item);
					uvalue = lvalue;
					minimum = java.lang.Math.min(minimum, lvalue);
					maximum = java.lang.Math.max(maximum, uvalue);
				}
			}
		}
		if (minimum > maximum) {
			return null;
		}else {
			return new org.jfree.data.Range(minimum, maximum);
		}
	}

	public org.jfree.data.Range findRangeBounds(org.jfree.data.xy.XYDataset dataset) {
		if (dataset == null) {
			throw new java.lang.IllegalArgumentException("Null 'dataset' argument.");
		}
		double minimum = java.lang.Double.POSITIVE_INFINITY;
		double maximum = java.lang.Double.NEGATIVE_INFINITY;
		int seriesCount = dataset.getSeriesCount();
		double lvalue;
		double uvalue;
		if (dataset instanceof org.jfree.data.xy.VectorXYDataset) {
			org.jfree.data.xy.VectorXYDataset vdataset = ((org.jfree.data.xy.VectorXYDataset) (dataset));
			for (int series = 0; series < seriesCount; series++) {
				int itemCount = dataset.getItemCount(series);
				for (int item = 0; item < itemCount; item++) {
					double delta = vdataset.getVectorYValue(series, item);
					if (delta < 0.0) {
						uvalue = vdataset.getYValue(series, item);
						lvalue = uvalue + delta;
					}else {
						lvalue = vdataset.getYValue(series, item);
						uvalue = lvalue + delta;
					}
					minimum = java.lang.Math.min(minimum, lvalue);
					maximum = java.lang.Math.max(maximum, uvalue);
				}
			}
		}else {
			for (int series = 0; series < seriesCount; series++) {
				int itemCount = dataset.getItemCount(series);
				for (int item = 0; item < itemCount; item++) {
					lvalue = dataset.getYValue(series, item);
					uvalue = lvalue;
					minimum = java.lang.Math.min(minimum, lvalue);
					maximum = java.lang.Math.max(maximum, uvalue);
				}
			}
		}
		if (minimum > maximum) {
			return null;
		}else {
			return new org.jfree.data.Range(minimum, maximum);
		}
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.xy.XYDataset dataset, int series, int item, boolean selected, int pass) {
		double x = dataset.getXValue(series, item);
		double y = dataset.getYValue(series, item);
		double dx = 0.0;
		double dy = 0.0;
		if (dataset instanceof org.jfree.data.xy.VectorXYDataset) {
			dx = ((org.jfree.data.xy.VectorXYDataset) (dataset)).getVectorXValue(series, item);
			dy = ((org.jfree.data.xy.VectorXYDataset) (dataset)).getVectorYValue(series, item);
		}
		double xx0 = domainAxis.valueToJava2D(x, dataArea, plot.getDomainAxisEdge());
		double yy0 = rangeAxis.valueToJava2D(y, dataArea, plot.getRangeAxisEdge());
		double xx1 = domainAxis.valueToJava2D((x + dx), dataArea, plot.getDomainAxisEdge());
		double yy1 = rangeAxis.valueToJava2D((y + dy), dataArea, plot.getRangeAxisEdge());
		java.awt.geom.Line2D line;
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		if (orientation.equals(org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			line = new java.awt.geom.Line2D.Double(yy0, xx0, yy1, xx1);
		}else {
			line = new java.awt.geom.Line2D.Double(xx0, yy0, xx1, yy1);
		}
		g2.setPaint(getItemPaint(series, item, selected));
		g2.setStroke(getItemStroke(series, item, selected));
		g2.draw(line);
		double dxx = xx1 - xx0;
		double dyy = yy1 - yy0;
		double bx = xx0 + ((1.0 - (org.jfree.chart.renderer.xy.VectorRenderer.this.baseLength)) * dxx);
		double by = yy0 + ((1.0 - (org.jfree.chart.renderer.xy.VectorRenderer.this.baseLength)) * dyy);
		double cx = xx0 + ((1.0 - (org.jfree.chart.renderer.xy.VectorRenderer.this.headLength)) * dxx);
		double cy = yy0 + ((1.0 - (org.jfree.chart.renderer.xy.VectorRenderer.this.headLength)) * dyy);
		double angle = 0.0;
		if (dxx != 0.0) {
			angle = ((java.lang.Math.PI) / 2.0) - (java.lang.Math.atan((dyy / dxx)));
		}
		double deltaX = 2.0 * (java.lang.Math.cos(angle));
		double deltaY = 2.0 * (java.lang.Math.sin(angle));
		double leftx = cx + deltaX;
		double lefty = cy - deltaY;
		double rightx = cx - deltaX;
		double righty = cy + deltaY;
		java.awt.geom.GeneralPath p = new java.awt.geom.GeneralPath();
		if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
			p.moveTo(((float) (xx1)), ((float) (yy1)));
			p.lineTo(((float) (rightx)), ((float) (righty)));
			p.lineTo(((float) (bx)), ((float) (by)));
			p.lineTo(((float) (leftx)), ((float) (lefty)));
		}else {
			p.moveTo(((float) (yy1)), ((float) (xx1)));
			p.lineTo(((float) (righty)), ((float) (rightx)));
			p.lineTo(((float) (by)), ((float) (bx)));
			p.lineTo(((float) (lefty)), ((float) (leftx)));
		}
		p.closePath();
		g2.draw(p);
		org.jfree.chart.entity.EntityCollection entities = null;
		if ((state.getInfo()) != null) {
			entities = state.getInfo().getOwner().getEntityCollection();
			if (entities != null) {
				addEntity(entities, line.getBounds(), dataset, series, item, selected, 0.0, 0.0);
			}
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.xy.VectorRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.xy.VectorRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.xy.VectorRenderer that = ((org.jfree.chart.renderer.xy.VectorRenderer) (obj));
		if ((org.jfree.chart.renderer.xy.VectorRenderer.this.baseLength) != (that.baseLength)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.VectorRenderer.this.headLength) != (that.headLength)) {
			return false;
		}
		return super.equals(obj);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		return super.clone();
	}
}

