

package org.jfree.chart.renderer.xy;


public class XYShapeRenderer extends org.jfree.chart.renderer.xy.AbstractXYItemRenderer implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.renderer.xy.XYItemRenderer {
	private static final long serialVersionUID = 8320552104211173221L;

	private org.jfree.chart.renderer.PaintScale paintScale;

	private boolean drawOutlines;

	private boolean useOutlinePaint;

	private boolean useFillPaint;

	private boolean guideLinesVisible;

	private transient java.awt.Paint guideLinePaint;

	private transient java.awt.Stroke guideLineStroke;

	public XYShapeRenderer() {
		org.jfree.chart.renderer.xy.XYShapeRenderer.this.paintScale = new org.jfree.chart.renderer.LookupPaintScale();
		org.jfree.chart.renderer.xy.XYShapeRenderer.this.useFillPaint = false;
		org.jfree.chart.renderer.xy.XYShapeRenderer.this.drawOutlines = false;
		org.jfree.chart.renderer.xy.XYShapeRenderer.this.useOutlinePaint = true;
		org.jfree.chart.renderer.xy.XYShapeRenderer.this.guideLinesVisible = false;
		org.jfree.chart.renderer.xy.XYShapeRenderer.this.guideLinePaint = java.awt.Color.darkGray;
		org.jfree.chart.renderer.xy.XYShapeRenderer.this.guideLineStroke = new java.awt.BasicStroke();
		setBaseShape(new java.awt.geom.Ellipse2D.Double((-5.0), (-5.0), 10.0, 10.0));
		setAutoPopulateSeriesShape(false);
	}

	public org.jfree.chart.renderer.PaintScale getPaintScale() {
		return org.jfree.chart.renderer.xy.XYShapeRenderer.this.paintScale;
	}

	public void setPaintScale(org.jfree.chart.renderer.PaintScale scale) {
		if (scale == null) {
			throw new java.lang.IllegalArgumentException("Null 'scale' argument.");
		}
		org.jfree.chart.renderer.xy.XYShapeRenderer.this.paintScale = scale;
		notifyListeners(new org.jfree.chart.event.RendererChangeEvent(org.jfree.chart.renderer.xy.XYShapeRenderer.this));
	}

	public boolean getDrawOutlines() {
		return org.jfree.chart.renderer.xy.XYShapeRenderer.this.drawOutlines;
	}

	public void setDrawOutlines(boolean flag) {
		org.jfree.chart.renderer.xy.XYShapeRenderer.this.drawOutlines = flag;
		fireChangeEvent();
	}

	public boolean getUseFillPaint() {
		return org.jfree.chart.renderer.xy.XYShapeRenderer.this.useFillPaint;
	}

	public void setUseFillPaint(boolean flag) {
		org.jfree.chart.renderer.xy.XYShapeRenderer.this.useFillPaint = flag;
		fireChangeEvent();
	}

	public boolean getUseOutlinePaint() {
		return org.jfree.chart.renderer.xy.XYShapeRenderer.this.useOutlinePaint;
	}

	public void setUseOutlinePaint(boolean use) {
		org.jfree.chart.renderer.xy.XYShapeRenderer.this.useOutlinePaint = use;
		fireChangeEvent();
	}

	public boolean isGuideLinesVisible() {
		return org.jfree.chart.renderer.xy.XYShapeRenderer.this.guideLinesVisible;
	}

	public void setGuideLinesVisible(boolean visible) {
		org.jfree.chart.renderer.xy.XYShapeRenderer.this.guideLinesVisible = visible;
		fireChangeEvent();
	}

	public java.awt.Paint getGuideLinePaint() {
		return org.jfree.chart.renderer.xy.XYShapeRenderer.this.guideLinePaint;
	}

	public void setGuideLinePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.renderer.xy.XYShapeRenderer.this.guideLinePaint = paint;
		fireChangeEvent();
	}

	public java.awt.Stroke getGuideLineStroke() {
		return org.jfree.chart.renderer.xy.XYShapeRenderer.this.guideLineStroke;
	}

	public void setGuideLineStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.renderer.xy.XYShapeRenderer.this.guideLineStroke = stroke;
		fireChangeEvent();
	}

	public org.jfree.data.Range findDomainBounds(org.jfree.data.xy.XYDataset dataset) {
		if (dataset != null) {
			org.jfree.data.Range r = org.jfree.data.general.DatasetUtilities.findDomainBounds(dataset, false);
			double offset = 0;
			return new org.jfree.data.Range(((r.getLowerBound()) + offset), ((r.getUpperBound()) + offset));
		}else {
			return null;
		}
	}

	public org.jfree.data.Range findRangeBounds(org.jfree.data.xy.XYDataset dataset) {
		if (dataset != null) {
			org.jfree.data.Range r = org.jfree.data.general.DatasetUtilities.findRangeBounds(dataset, false);
			double offset = 0;
			return new org.jfree.data.Range(((r.getLowerBound()) + offset), ((r.getUpperBound()) + offset));
		}else {
			return null;
		}
	}

	public int getPassCount() {
		return 2;
	}

	public void drawItem(java.awt.Graphics2D g2, org.jfree.chart.renderer.xy.XYItemRendererState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PlotRenderingInfo info, org.jfree.chart.plot.XYPlot plot, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.data.xy.XYDataset dataset, int series, int item, org.jfree.chart.plot.CrosshairState crosshairState, int pass) {
		java.awt.Shape hotspot = null;
		org.jfree.chart.entity.EntityCollection entities = null;
		if (info != null) {
			entities = info.getOwner().getEntityCollection();
		}
		double x = dataset.getXValue(series, item);
		double y = dataset.getYValue(series, item);
		if ((java.lang.Double.isNaN(x)) || (java.lang.Double.isNaN(y))) {
			return ;
		}
		double transX = domainAxis.valueToJava2D(x, dataArea, plot.getDomainAxisEdge());
		double transY = rangeAxis.valueToJava2D(y, dataArea, plot.getRangeAxisEdge());
		org.jfree.chart.plot.PlotOrientation orientation = plot.getOrientation();
		if ((pass == 0) && (org.jfree.chart.renderer.xy.XYShapeRenderer.this.guideLinesVisible)) {
			g2.setStroke(org.jfree.chart.renderer.xy.XYShapeRenderer.this.guideLineStroke);
			g2.setPaint(org.jfree.chart.renderer.xy.XYShapeRenderer.this.guideLinePaint);
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				g2.draw(new java.awt.geom.Line2D.Double(transY, dataArea.getMinY(), transY, dataArea.getMaxY()));
				g2.draw(new java.awt.geom.Line2D.Double(dataArea.getMinX(), transX, dataArea.getMaxX(), transX));
			}else {
				g2.draw(new java.awt.geom.Line2D.Double(transX, dataArea.getMinY(), transX, dataArea.getMaxY()));
				g2.draw(new java.awt.geom.Line2D.Double(dataArea.getMinX(), transY, dataArea.getMaxX(), transY));
			}
		}else
			if (pass == 1) {
				java.awt.Shape shape = getItemShape(series, item);
				if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
					shape = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape, transY, transX);
				}else
					if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
						shape = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(shape, transX, transY);
					}
				
				hotspot = shape;
				if (shape.intersects(dataArea)) {
					g2.setPaint(getPaint(dataset, series, item));
					g2.fill(shape);
					if (org.jfree.chart.renderer.xy.XYShapeRenderer.this.drawOutlines) {
						if (getUseOutlinePaint()) {
							g2.setPaint(getItemOutlinePaint(series, item));
						}else {
							g2.setPaint(getItemPaint(series, item));
						}
						g2.setStroke(getItemOutlineStroke(series, item));
						g2.draw(shape);
					}
				}
				if (entities != null) {
					addEntity(entities, hotspot, dataset, series, item, transX, transY);
				}
			}
		
	}

	protected java.awt.Paint getPaint(org.jfree.data.xy.XYDataset dataset, int series, int item) {
		java.awt.Paint p = null;
		if (dataset instanceof org.jfree.data.xy.XYZDataset) {
			double z = ((org.jfree.data.xy.XYZDataset) (dataset)).getZValue(series, item);
			p = org.jfree.chart.renderer.xy.XYShapeRenderer.this.paintScale.getPaint(z);
		}else {
			if (org.jfree.chart.renderer.xy.XYShapeRenderer.this.useFillPaint) {
				p = getItemFillPaint(series, item);
			}else {
				p = getItemPaint(series, item);
			}
		}
		return p;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.renderer.xy.XYShapeRenderer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.renderer.xy.XYShapeRenderer)) {
			return false;
		}
		org.jfree.chart.renderer.xy.XYShapeRenderer that = ((org.jfree.chart.renderer.xy.XYShapeRenderer) (obj));
		if ((((org.jfree.chart.renderer.xy.XYShapeRenderer.this.paintScale) == null) && ((that.paintScale) != null)) || (!(org.jfree.chart.renderer.xy.XYShapeRenderer.this.paintScale.equals(that.paintScale)))) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.XYShapeRenderer.this.drawOutlines) != (that.drawOutlines)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.XYShapeRenderer.this.useOutlinePaint) != (that.useOutlinePaint)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.XYShapeRenderer.this.useFillPaint) != (that.useFillPaint)) {
			return false;
		}
		if ((org.jfree.chart.renderer.xy.XYShapeRenderer.this.guideLinesVisible) != (that.guideLinesVisible)) {
			return false;
		}
		if ((((org.jfree.chart.renderer.xy.XYShapeRenderer.this.guideLinePaint) == null) && ((that.guideLinePaint) != null)) || (!(org.jfree.chart.renderer.xy.XYShapeRenderer.this.guideLinePaint.equals(that.guideLinePaint))))
			return false;
		
		if ((((org.jfree.chart.renderer.xy.XYShapeRenderer.this.guideLineStroke) == null) && ((that.guideLineStroke) != null)) || (!(org.jfree.chart.renderer.xy.XYShapeRenderer.this.guideLineStroke.equals(that.guideLineStroke))))
			return false;
		
		return super.equals(obj);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.renderer.xy.XYShapeRenderer clone = ((org.jfree.chart.renderer.xy.XYShapeRenderer) (super.clone()));
		if ((org.jfree.chart.renderer.xy.XYShapeRenderer.this.paintScale) instanceof org.jfree.chart.util.PublicCloneable) {
			org.jfree.chart.util.PublicCloneable pc = ((org.jfree.chart.util.PublicCloneable) (org.jfree.chart.renderer.xy.XYShapeRenderer.this.paintScale));
			clone.paintScale = ((org.jfree.chart.renderer.PaintScale) (pc.clone()));
		}
		return clone;
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.renderer.xy.XYShapeRenderer.this.guideLinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.renderer.xy.XYShapeRenderer.this.guideLineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.renderer.xy.XYShapeRenderer.this.guideLinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.renderer.xy.XYShapeRenderer.this.guideLineStroke, stream);
	}
}

