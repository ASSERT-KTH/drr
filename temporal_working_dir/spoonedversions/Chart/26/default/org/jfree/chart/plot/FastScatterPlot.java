

package org.jfree.chart.plot;


public class FastScatterPlot extends org.jfree.chart.plot.Plot implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.plot.ValueAxisPlot , org.jfree.chart.plot.Zoomable {
	private static final long serialVersionUID = 7871545897358563521L;

	public static final java.awt.Stroke DEFAULT_GRIDLINE_STROKE = new java.awt.BasicStroke(0.5F, java.awt.BasicStroke.CAP_BUTT, java.awt.BasicStroke.JOIN_BEVEL, 0.0F, new float[]{ 2.0F , 2.0F }, 0.0F);

	public static final java.awt.Paint DEFAULT_GRIDLINE_PAINT = java.awt.Color.lightGray;

	private float[][] data;

	private org.jfree.data.Range xDataRange;

	private org.jfree.data.Range yDataRange;

	private org.jfree.chart.axis.ValueAxis domainAxis;

	private org.jfree.chart.axis.ValueAxis rangeAxis;

	private transient java.awt.Paint paint;

	private boolean domainGridlinesVisible;

	private transient java.awt.Stroke domainGridlineStroke;

	private transient java.awt.Paint domainGridlinePaint;

	private boolean rangeGridlinesVisible;

	private transient java.awt.Stroke rangeGridlineStroke;

	private transient java.awt.Paint rangeGridlinePaint;

	protected static java.util.ResourceBundle localizationResources = java.util.ResourceBundle.getBundle("org.jfree.chart.plot.LocalizationBundle");

	public FastScatterPlot() {
		this(null, new org.jfree.chart.axis.NumberAxis("X"), new org.jfree.chart.axis.NumberAxis("Y"));
	}

	public FastScatterPlot(float[][] data, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis) {
		super();
		if (domainAxis == null) {
			throw new java.lang.IllegalArgumentException("Null 'domainAxis' argument.");
		}
		if (rangeAxis == null) {
			throw new java.lang.IllegalArgumentException("Null 'rangeAxis' argument.");
		}
		org.jfree.chart.plot.FastScatterPlot.this.data = data;
		org.jfree.chart.plot.FastScatterPlot.this.xDataRange = calculateXDataRange(data);
		org.jfree.chart.plot.FastScatterPlot.this.yDataRange = calculateYDataRange(data);
		org.jfree.chart.plot.FastScatterPlot.this.domainAxis = domainAxis;
		org.jfree.chart.plot.FastScatterPlot.this.domainAxis.setPlot(org.jfree.chart.plot.FastScatterPlot.this);
		org.jfree.chart.plot.FastScatterPlot.this.domainAxis.addChangeListener(org.jfree.chart.plot.FastScatterPlot.this);
		org.jfree.chart.plot.FastScatterPlot.this.rangeAxis = rangeAxis;
		org.jfree.chart.plot.FastScatterPlot.this.rangeAxis.setPlot(org.jfree.chart.plot.FastScatterPlot.this);
		org.jfree.chart.plot.FastScatterPlot.this.rangeAxis.addChangeListener(org.jfree.chart.plot.FastScatterPlot.this);
		org.jfree.chart.plot.FastScatterPlot.this.paint = java.awt.Color.red;
		org.jfree.chart.plot.FastScatterPlot.this.domainGridlinesVisible = true;
		org.jfree.chart.plot.FastScatterPlot.this.domainGridlinePaint = org.jfree.chart.plot.FastScatterPlot.DEFAULT_GRIDLINE_PAINT;
		org.jfree.chart.plot.FastScatterPlot.this.domainGridlineStroke = org.jfree.chart.plot.FastScatterPlot.DEFAULT_GRIDLINE_STROKE;
		org.jfree.chart.plot.FastScatterPlot.this.rangeGridlinesVisible = true;
		org.jfree.chart.plot.FastScatterPlot.this.rangeGridlinePaint = org.jfree.chart.plot.FastScatterPlot.DEFAULT_GRIDLINE_PAINT;
		org.jfree.chart.plot.FastScatterPlot.this.rangeGridlineStroke = org.jfree.chart.plot.FastScatterPlot.DEFAULT_GRIDLINE_STROKE;
	}

	public java.lang.String getPlotType() {
		return org.jfree.chart.plot.FastScatterPlot.localizationResources.getString("Fast_Scatter_Plot");
	}

	public float[][] getData() {
		return org.jfree.chart.plot.FastScatterPlot.this.data;
	}

	public void setData(float[][] data) {
		org.jfree.chart.plot.FastScatterPlot.this.data = data;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.FastScatterPlot.this));
	}

	public org.jfree.chart.plot.PlotOrientation getOrientation() {
		return org.jfree.chart.plot.PlotOrientation.VERTICAL;
	}

	public org.jfree.chart.axis.ValueAxis getDomainAxis() {
		return org.jfree.chart.plot.FastScatterPlot.this.domainAxis;
	}

	public void setDomainAxis(org.jfree.chart.axis.ValueAxis axis) {
		if (axis == null) {
			throw new java.lang.IllegalArgumentException("Null 'axis' argument.");
		}
		org.jfree.chart.plot.FastScatterPlot.this.domainAxis = axis;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.FastScatterPlot.this));
	}

	public org.jfree.chart.axis.ValueAxis getRangeAxis() {
		return org.jfree.chart.plot.FastScatterPlot.this.rangeAxis;
	}

	public void setRangeAxis(org.jfree.chart.axis.ValueAxis axis) {
		if (axis == null) {
			throw new java.lang.IllegalArgumentException("Null 'axis' argument.");
		}
		org.jfree.chart.plot.FastScatterPlot.this.rangeAxis = axis;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.FastScatterPlot.this));
	}

	public java.awt.Paint getPaint() {
		return org.jfree.chart.plot.FastScatterPlot.this.paint;
	}

	public void setPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.FastScatterPlot.this.paint = paint;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.FastScatterPlot.this));
	}

	public boolean isDomainGridlinesVisible() {
		return org.jfree.chart.plot.FastScatterPlot.this.domainGridlinesVisible;
	}

	public void setDomainGridlinesVisible(boolean visible) {
		if ((org.jfree.chart.plot.FastScatterPlot.this.domainGridlinesVisible) != visible) {
			org.jfree.chart.plot.FastScatterPlot.this.domainGridlinesVisible = visible;
			notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.FastScatterPlot.this));
		}
	}

	public java.awt.Stroke getDomainGridlineStroke() {
		return org.jfree.chart.plot.FastScatterPlot.this.domainGridlineStroke;
	}

	public void setDomainGridlineStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.plot.FastScatterPlot.this.domainGridlineStroke = stroke;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.FastScatterPlot.this));
	}

	public java.awt.Paint getDomainGridlinePaint() {
		return org.jfree.chart.plot.FastScatterPlot.this.domainGridlinePaint;
	}

	public void setDomainGridlinePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.FastScatterPlot.this.domainGridlinePaint = paint;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.FastScatterPlot.this));
	}

	public boolean isRangeGridlinesVisible() {
		return org.jfree.chart.plot.FastScatterPlot.this.rangeGridlinesVisible;
	}

	public void setRangeGridlinesVisible(boolean visible) {
		if ((org.jfree.chart.plot.FastScatterPlot.this.rangeGridlinesVisible) != visible) {
			org.jfree.chart.plot.FastScatterPlot.this.rangeGridlinesVisible = visible;
			notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.FastScatterPlot.this));
		}
	}

	public java.awt.Stroke getRangeGridlineStroke() {
		return org.jfree.chart.plot.FastScatterPlot.this.rangeGridlineStroke;
	}

	public void setRangeGridlineStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.plot.FastScatterPlot.this.rangeGridlineStroke = stroke;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.FastScatterPlot.this));
	}

	public java.awt.Paint getRangeGridlinePaint() {
		return org.jfree.chart.plot.FastScatterPlot.this.rangeGridlinePaint;
	}

	public void setRangeGridlinePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.FastScatterPlot.this.rangeGridlinePaint = paint;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.FastScatterPlot.this));
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.awt.geom.Point2D anchor, org.jfree.chart.plot.PlotState parentState, org.jfree.chart.plot.PlotRenderingInfo info) {
		if (info != null) {
			info.setPlotArea(area);
		}
		org.jfree.chart.util.RectangleInsets insets = getInsets();
		insets.trim(area);
		org.jfree.chart.axis.AxisSpace space = new org.jfree.chart.axis.AxisSpace();
		space = org.jfree.chart.plot.FastScatterPlot.this.domainAxis.reserveSpace(g2, org.jfree.chart.plot.FastScatterPlot.this, area, org.jfree.chart.util.RectangleEdge.BOTTOM, space);
		space = org.jfree.chart.plot.FastScatterPlot.this.rangeAxis.reserveSpace(g2, org.jfree.chart.plot.FastScatterPlot.this, area, org.jfree.chart.util.RectangleEdge.LEFT, space);
		java.awt.geom.Rectangle2D dataArea = space.shrink(area, null);
		if (info != null) {
			info.setDataArea(dataArea);
		}
		drawBackground(g2, dataArea);
		org.jfree.chart.axis.AxisState domainAxisState = org.jfree.chart.plot.FastScatterPlot.this.domainAxis.draw(g2, dataArea.getMaxY(), area, dataArea, org.jfree.chart.util.RectangleEdge.BOTTOM, info);
		org.jfree.chart.axis.AxisState rangeAxisState = org.jfree.chart.plot.FastScatterPlot.this.rangeAxis.draw(g2, dataArea.getMinX(), area, dataArea, org.jfree.chart.util.RectangleEdge.LEFT, info);
		drawDomainGridlines(g2, dataArea, domainAxisState.getTicks());
		drawRangeGridlines(g2, dataArea, rangeAxisState.getTicks());
		java.awt.Shape originalClip = g2.getClip();
		java.awt.Composite originalComposite = g2.getComposite();
		g2.clip(dataArea);
		g2.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, getForegroundAlpha()));
		render(g2, dataArea, info, null);
		g2.setClip(originalClip);
		g2.setComposite(originalComposite);
		drawOutline(g2, dataArea);
	}

	public void render(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PlotRenderingInfo info, org.jfree.chart.plot.CrosshairState crosshairState) {
		g2.setPaint(org.jfree.chart.plot.FastScatterPlot.this.paint);
		if ((org.jfree.chart.plot.FastScatterPlot.this.data) != null) {
			for (int i = 0; i < (org.jfree.chart.plot.FastScatterPlot.this.data[0].length); i++) {
				float x = org.jfree.chart.plot.FastScatterPlot.this.data[0][i];
				float y = org.jfree.chart.plot.FastScatterPlot.this.data[1][i];
				int transX = ((int) (org.jfree.chart.plot.FastScatterPlot.this.domainAxis.valueToJava2D(x, dataArea, org.jfree.chart.util.RectangleEdge.BOTTOM)));
				int transY = ((int) (org.jfree.chart.plot.FastScatterPlot.this.rangeAxis.valueToJava2D(y, dataArea, org.jfree.chart.util.RectangleEdge.LEFT)));
				g2.fillRect(transX, transY, 1, 1);
			}
		}
	}

	protected void drawDomainGridlines(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, java.util.List ticks) {
		if (isDomainGridlinesVisible()) {
			java.util.Iterator iterator = ticks.iterator();
			while (iterator.hasNext()) {
				org.jfree.chart.axis.ValueTick tick = ((org.jfree.chart.axis.ValueTick) (iterator.next()));
				double v = org.jfree.chart.plot.FastScatterPlot.this.domainAxis.valueToJava2D(tick.getValue(), dataArea, org.jfree.chart.util.RectangleEdge.BOTTOM);
				java.awt.geom.Line2D line = new java.awt.geom.Line2D.Double(v, dataArea.getMinY(), v, dataArea.getMaxY());
				g2.setPaint(getDomainGridlinePaint());
				g2.setStroke(getDomainGridlineStroke());
				g2.draw(line);
			} 
		}
	}

	protected void drawRangeGridlines(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, java.util.List ticks) {
		if (isRangeGridlinesVisible()) {
			java.util.Iterator iterator = ticks.iterator();
			while (iterator.hasNext()) {
				org.jfree.chart.axis.ValueTick tick = ((org.jfree.chart.axis.ValueTick) (iterator.next()));
				double v = org.jfree.chart.plot.FastScatterPlot.this.rangeAxis.valueToJava2D(tick.getValue(), dataArea, org.jfree.chart.util.RectangleEdge.LEFT);
				java.awt.geom.Line2D line = new java.awt.geom.Line2D.Double(dataArea.getMinX(), v, dataArea.getMaxX(), v);
				g2.setPaint(getRangeGridlinePaint());
				g2.setStroke(getRangeGridlineStroke());
				g2.draw(line);
			} 
		}
	}

	public org.jfree.data.Range getDataRange(org.jfree.chart.axis.ValueAxis axis) {
		org.jfree.data.Range result = null;
		if (axis == (org.jfree.chart.plot.FastScatterPlot.this.domainAxis)) {
			result = org.jfree.chart.plot.FastScatterPlot.this.xDataRange;
		}else
			if (axis == (org.jfree.chart.plot.FastScatterPlot.this.rangeAxis)) {
				result = org.jfree.chart.plot.FastScatterPlot.this.yDataRange;
			}
		
		return result;
	}

	private org.jfree.data.Range calculateXDataRange(float[][] data) {
		org.jfree.data.Range result = null;
		if (data != null) {
			float lowest = java.lang.Float.POSITIVE_INFINITY;
			float highest = java.lang.Float.NEGATIVE_INFINITY;
			for (int i = 0; i < (data[0].length); i++) {
				float v = data[0][i];
				if (v < lowest) {
					lowest = v;
				}
				if (v > highest) {
					highest = v;
				}
			}
			if (lowest <= highest) {
				result = new org.jfree.data.Range(lowest, highest);
			}
		}
		return result;
	}

	private org.jfree.data.Range calculateYDataRange(float[][] data) {
		org.jfree.data.Range result = null;
		if (data != null) {
			float lowest = java.lang.Float.POSITIVE_INFINITY;
			float highest = java.lang.Float.NEGATIVE_INFINITY;
			for (int i = 0; i < (data[0].length); i++) {
				float v = data[1][i];
				if (v < lowest) {
					lowest = v;
				}
				if (v > highest) {
					highest = v;
				}
			}
			if (lowest <= highest) {
				result = new org.jfree.data.Range(lowest, highest);
			}
		}
		return result;
	}

	public void zoomDomainAxes(double factor, org.jfree.chart.plot.PlotRenderingInfo info, java.awt.geom.Point2D source) {
		org.jfree.chart.plot.FastScatterPlot.this.domainAxis.resizeRange(factor);
	}

	public void zoomDomainAxes(double lowerPercent, double upperPercent, org.jfree.chart.plot.PlotRenderingInfo info, java.awt.geom.Point2D source) {
		org.jfree.chart.plot.FastScatterPlot.this.domainAxis.zoomRange(lowerPercent, upperPercent);
	}

	public void zoomRangeAxes(double factor, org.jfree.chart.plot.PlotRenderingInfo info, java.awt.geom.Point2D source) {
		org.jfree.chart.plot.FastScatterPlot.this.rangeAxis.resizeRange(factor);
	}

	public void zoomRangeAxes(double lowerPercent, double upperPercent, org.jfree.chart.plot.PlotRenderingInfo info, java.awt.geom.Point2D source) {
		org.jfree.chart.plot.FastScatterPlot.this.rangeAxis.zoomRange(lowerPercent, upperPercent);
	}

	public boolean isDomainZoomable() {
		return true;
	}

	public boolean isRangeZoomable() {
		return true;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.FastScatterPlot.this)) {
			return true;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		if (!(obj instanceof org.jfree.chart.plot.FastScatterPlot)) {
			return false;
		}
		org.jfree.chart.plot.FastScatterPlot that = ((org.jfree.chart.plot.FastScatterPlot) (obj));
		if (!(org.jfree.chart.util.ArrayUtilities.equal(org.jfree.chart.plot.FastScatterPlot.this.data, that.data))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.FastScatterPlot.this.domainAxis, that.domainAxis))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.FastScatterPlot.this.rangeAxis, that.rangeAxis))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.FastScatterPlot.this.paint, that.paint))) {
			return false;
		}
		if ((org.jfree.chart.plot.FastScatterPlot.this.domainGridlinesVisible) != (that.domainGridlinesVisible)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.FastScatterPlot.this.domainGridlinePaint, that.domainGridlinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.FastScatterPlot.this.domainGridlineStroke, that.domainGridlineStroke))) {
			return false;
		}
		if ((!(org.jfree.chart.plot.FastScatterPlot.this.rangeGridlinesVisible)) == (that.rangeGridlinesVisible)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.FastScatterPlot.this.rangeGridlinePaint, that.rangeGridlinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.FastScatterPlot.this.rangeGridlineStroke, that.rangeGridlineStroke))) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.plot.FastScatterPlot clone = ((org.jfree.chart.plot.FastScatterPlot) (super.clone()));
		if ((org.jfree.chart.plot.FastScatterPlot.this.data) != null) {
			clone.data = org.jfree.chart.util.ArrayUtilities.clone(org.jfree.chart.plot.FastScatterPlot.this.data);
		}
		if ((org.jfree.chart.plot.FastScatterPlot.this.domainAxis) != null) {
			clone.domainAxis = ((org.jfree.chart.axis.ValueAxis) (org.jfree.chart.plot.FastScatterPlot.this.domainAxis.clone()));
			clone.domainAxis.setPlot(clone);
			clone.domainAxis.addChangeListener(clone);
		}
		if ((org.jfree.chart.plot.FastScatterPlot.this.rangeAxis) != null) {
			clone.rangeAxis = ((org.jfree.chart.axis.ValueAxis) (org.jfree.chart.plot.FastScatterPlot.this.rangeAxis.clone()));
			clone.rangeAxis.setPlot(clone);
			clone.rangeAxis.addChangeListener(clone);
		}
		return clone;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.FastScatterPlot.this.paint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.FastScatterPlot.this.domainGridlineStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.FastScatterPlot.this.domainGridlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.FastScatterPlot.this.rangeGridlineStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.FastScatterPlot.this.rangeGridlinePaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.plot.FastScatterPlot.this.paint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.FastScatterPlot.this.domainGridlineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.FastScatterPlot.this.domainGridlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.FastScatterPlot.this.rangeGridlineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.FastScatterPlot.this.rangeGridlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		if ((org.jfree.chart.plot.FastScatterPlot.this.domainAxis) != null) {
			org.jfree.chart.plot.FastScatterPlot.this.domainAxis.addChangeListener(org.jfree.chart.plot.FastScatterPlot.this);
		}
		if ((org.jfree.chart.plot.FastScatterPlot.this.rangeAxis) != null) {
			org.jfree.chart.plot.FastScatterPlot.this.rangeAxis.addChangeListener(org.jfree.chart.plot.FastScatterPlot.this);
		}
	}
}

