

package org.jfree.chart.plot;


public abstract class Plot implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.LegendItemSource , org.jfree.chart.event.AnnotationChangeListener , org.jfree.chart.event.AxisChangeListener , org.jfree.chart.event.MarkerChangeListener , org.jfree.chart.util.PublicCloneable , org.jfree.data.event.DatasetChangeListener {
	private static final long serialVersionUID = -8831571430103671324L;

	public static final java.lang.Number ZERO = new java.lang.Integer(0);

	public static final org.jfree.chart.util.RectangleInsets DEFAULT_INSETS = new org.jfree.chart.util.RectangleInsets(4.0, 8.0, 4.0, 8.0);

	public static final java.awt.Stroke DEFAULT_OUTLINE_STROKE = new java.awt.BasicStroke(0.5F, java.awt.BasicStroke.CAP_ROUND, java.awt.BasicStroke.JOIN_ROUND);

	public static final java.awt.Paint DEFAULT_OUTLINE_PAINT = java.awt.Color.gray;

	public static final float DEFAULT_FOREGROUND_ALPHA = 1.0F;

	public static final float DEFAULT_BACKGROUND_ALPHA = 1.0F;

	public static final java.awt.Paint DEFAULT_BACKGROUND_PAINT = java.awt.Color.LIGHT_GRAY;

	public static final int MINIMUM_WIDTH_TO_DRAW = 10;

	public static final int MINIMUM_HEIGHT_TO_DRAW = 10;

	public static final java.awt.Shape DEFAULT_LEGEND_ITEM_BOX = new java.awt.geom.Rectangle2D.Double((-4.0), (-4.0), 8.0, 8.0);

	public static final java.awt.Shape DEFAULT_LEGEND_ITEM_CIRCLE = new java.awt.geom.Ellipse2D.Double((-4.0), (-4.0), 8.0, 8.0);

	private org.jfree.chart.plot.Plot parent;

	private org.jfree.data.general.DatasetGroup datasetGroup;

	private java.lang.String noDataMessage;

	private java.awt.Font noDataMessageFont;

	private transient java.awt.Paint noDataMessagePaint;

	private org.jfree.chart.util.RectangleInsets insets;

	private boolean outlineVisible;

	private transient java.awt.Stroke outlineStroke;

	private transient java.awt.Paint outlinePaint;

	private transient java.awt.Paint backgroundPaint;

	private transient java.awt.Image backgroundImage;

	private int backgroundImageAlignment = org.jfree.chart.util.Align.FIT;

	private float backgroundImageAlpha = 0.5F;

	private float foregroundAlpha;

	private float backgroundAlpha;

	private org.jfree.chart.plot.DrawingSupplier drawingSupplier;

	private transient javax.swing.event.EventListenerList listenerList;

	private boolean notify;

	protected Plot() {
		org.jfree.chart.plot.Plot.this.parent = null;
		org.jfree.chart.plot.Plot.this.insets = org.jfree.chart.plot.Plot.DEFAULT_INSETS;
		org.jfree.chart.plot.Plot.this.backgroundPaint = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_PAINT;
		org.jfree.chart.plot.Plot.this.backgroundAlpha = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_ALPHA;
		org.jfree.chart.plot.Plot.this.backgroundImage = null;
		org.jfree.chart.plot.Plot.this.outlineVisible = true;
		org.jfree.chart.plot.Plot.this.outlineStroke = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
		org.jfree.chart.plot.Plot.this.outlinePaint = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
		org.jfree.chart.plot.Plot.this.foregroundAlpha = org.jfree.chart.plot.Plot.DEFAULT_FOREGROUND_ALPHA;
		org.jfree.chart.plot.Plot.this.noDataMessage = null;
		org.jfree.chart.plot.Plot.this.noDataMessageFont = new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 12);
		org.jfree.chart.plot.Plot.this.noDataMessagePaint = java.awt.Color.black;
		org.jfree.chart.plot.Plot.this.drawingSupplier = new org.jfree.chart.plot.DefaultDrawingSupplier();
		org.jfree.chart.plot.Plot.this.notify = true;
		org.jfree.chart.plot.Plot.this.listenerList = new javax.swing.event.EventListenerList();
	}

	public org.jfree.data.general.DatasetGroup getDatasetGroup() {
		return org.jfree.chart.plot.Plot.this.datasetGroup;
	}

	protected void setDatasetGroup(org.jfree.data.general.DatasetGroup group) {
		org.jfree.chart.plot.Plot.this.datasetGroup = group;
	}

	public java.lang.String getNoDataMessage() {
		return org.jfree.chart.plot.Plot.this.noDataMessage;
	}

	public void setNoDataMessage(java.lang.String message) {
		org.jfree.chart.plot.Plot.this.noDataMessage = message;
		fireChangeEvent();
	}

	public java.awt.Font getNoDataMessageFont() {
		return org.jfree.chart.plot.Plot.this.noDataMessageFont;
	}

	public void setNoDataMessageFont(java.awt.Font font) {
		if (font == null) {
			throw new java.lang.IllegalArgumentException("Null 'font' argument.");
		}
		org.jfree.chart.plot.Plot.this.noDataMessageFont = font;
		fireChangeEvent();
	}

	public java.awt.Paint getNoDataMessagePaint() {
		return org.jfree.chart.plot.Plot.this.noDataMessagePaint;
	}

	public void setNoDataMessagePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.Plot.this.noDataMessagePaint = paint;
		fireChangeEvent();
	}

	public abstract java.lang.String getPlotType();

	public org.jfree.chart.plot.Plot getParent() {
		return org.jfree.chart.plot.Plot.this.parent;
	}

	public void setParent(org.jfree.chart.plot.Plot parent) {
		org.jfree.chart.plot.Plot.this.parent = parent;
	}

	public org.jfree.chart.plot.Plot getRootPlot() {
		org.jfree.chart.plot.Plot p = getParent();
		if (p == null) {
			return org.jfree.chart.plot.Plot.this;
		}else {
			return p.getRootPlot();
		}
	}

	public boolean isSubplot() {
		return (getParent()) != null;
	}

	public org.jfree.chart.util.RectangleInsets getInsets() {
		return org.jfree.chart.plot.Plot.this.insets;
	}

	public void setInsets(org.jfree.chart.util.RectangleInsets insets) {
		setInsets(insets, true);
	}

	public void setInsets(org.jfree.chart.util.RectangleInsets insets, boolean notify) {
		if (insets == null) {
			throw new java.lang.IllegalArgumentException("Null 'insets' argument.");
		}
		if (!(org.jfree.chart.plot.Plot.this.insets.equals(insets))) {
			org.jfree.chart.plot.Plot.this.insets = insets;
			if (notify) {
				fireChangeEvent();
			}
		}
	}

	public java.awt.Paint getBackgroundPaint() {
		return org.jfree.chart.plot.Plot.this.backgroundPaint;
	}

	public void setBackgroundPaint(java.awt.Paint paint) {
		if (paint == null) {
			if ((org.jfree.chart.plot.Plot.this.backgroundPaint) != null) {
				org.jfree.chart.plot.Plot.this.backgroundPaint = null;
				fireChangeEvent();
			}
		}else {
			if ((org.jfree.chart.plot.Plot.this.backgroundPaint) != null) {
				if (org.jfree.chart.plot.Plot.this.backgroundPaint.equals(paint)) {
					return ;
				}
			}
			org.jfree.chart.plot.Plot.this.backgroundPaint = paint;
			fireChangeEvent();
		}
	}

	public float getBackgroundAlpha() {
		return org.jfree.chart.plot.Plot.this.backgroundAlpha;
	}

	public void setBackgroundAlpha(float alpha) {
		if ((org.jfree.chart.plot.Plot.this.backgroundAlpha) != alpha) {
			org.jfree.chart.plot.Plot.this.backgroundAlpha = alpha;
			fireChangeEvent();
		}
	}

	public org.jfree.chart.plot.DrawingSupplier getDrawingSupplier() {
		org.jfree.chart.plot.DrawingSupplier result = null;
		org.jfree.chart.plot.Plot p = getParent();
		if (p != null) {
			result = p.getDrawingSupplier();
		}else {
			result = org.jfree.chart.plot.Plot.this.drawingSupplier;
		}
		return result;
	}

	public void setDrawingSupplier(org.jfree.chart.plot.DrawingSupplier supplier) {
		org.jfree.chart.plot.Plot.this.drawingSupplier = supplier;
		fireChangeEvent();
	}

	public void setDrawingSupplier(org.jfree.chart.plot.DrawingSupplier supplier, boolean notify) {
		org.jfree.chart.plot.Plot.this.drawingSupplier = supplier;
		if (notify) {
			fireChangeEvent();
		}
	}

	public java.awt.Image getBackgroundImage() {
		return org.jfree.chart.plot.Plot.this.backgroundImage;
	}

	public void setBackgroundImage(java.awt.Image image) {
		org.jfree.chart.plot.Plot.this.backgroundImage = image;
		fireChangeEvent();
	}

	public int getBackgroundImageAlignment() {
		return org.jfree.chart.plot.Plot.this.backgroundImageAlignment;
	}

	public void setBackgroundImageAlignment(int alignment) {
		if ((org.jfree.chart.plot.Plot.this.backgroundImageAlignment) != alignment) {
			org.jfree.chart.plot.Plot.this.backgroundImageAlignment = alignment;
			fireChangeEvent();
		}
	}

	public float getBackgroundImageAlpha() {
		return org.jfree.chart.plot.Plot.this.backgroundImageAlpha;
	}

	public void setBackgroundImageAlpha(float alpha) {
		if ((alpha < 0.0F) || (alpha > 1.0F))
			throw new java.lang.IllegalArgumentException("The 'alpha' value must be in the range 0.0f to 1.0f.");
		
		if ((org.jfree.chart.plot.Plot.this.backgroundImageAlpha) != alpha) {
			org.jfree.chart.plot.Plot.this.backgroundImageAlpha = alpha;
			fireChangeEvent();
		}
	}

	public boolean isOutlineVisible() {
		return org.jfree.chart.plot.Plot.this.outlineVisible;
	}

	public void setOutlineVisible(boolean visible) {
		org.jfree.chart.plot.Plot.this.outlineVisible = visible;
		fireChangeEvent();
	}

	public java.awt.Stroke getOutlineStroke() {
		return org.jfree.chart.plot.Plot.this.outlineStroke;
	}

	public void setOutlineStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			if ((org.jfree.chart.plot.Plot.this.outlineStroke) != null) {
				org.jfree.chart.plot.Plot.this.outlineStroke = null;
				fireChangeEvent();
			}
		}else {
			if ((org.jfree.chart.plot.Plot.this.outlineStroke) != null) {
				if (org.jfree.chart.plot.Plot.this.outlineStroke.equals(stroke)) {
					return ;
				}
			}
			org.jfree.chart.plot.Plot.this.outlineStroke = stroke;
			fireChangeEvent();
		}
	}

	public java.awt.Paint getOutlinePaint() {
		return org.jfree.chart.plot.Plot.this.outlinePaint;
	}

	public void setOutlinePaint(java.awt.Paint paint) {
		if (paint == null) {
			if ((org.jfree.chart.plot.Plot.this.outlinePaint) != null) {
				org.jfree.chart.plot.Plot.this.outlinePaint = null;
				fireChangeEvent();
			}
		}else {
			if ((org.jfree.chart.plot.Plot.this.outlinePaint) != null) {
				if (org.jfree.chart.plot.Plot.this.outlinePaint.equals(paint)) {
					return ;
				}
			}
			org.jfree.chart.plot.Plot.this.outlinePaint = paint;
			fireChangeEvent();
		}
	}

	public float getForegroundAlpha() {
		return org.jfree.chart.plot.Plot.this.foregroundAlpha;
	}

	public void setForegroundAlpha(float alpha) {
		if ((org.jfree.chart.plot.Plot.this.foregroundAlpha) != alpha) {
			org.jfree.chart.plot.Plot.this.foregroundAlpha = alpha;
			fireChangeEvent();
		}
	}

	public org.jfree.chart.LegendItemCollection getLegendItems() {
		return null;
	}

	public boolean isNotify() {
		return org.jfree.chart.plot.Plot.this.notify;
	}

	public void setNotify(boolean notify) {
		org.jfree.chart.plot.Plot.this.notify = notify;
		if (notify) {
			notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.Plot.this));
		}
	}

	public void addChangeListener(org.jfree.chart.event.PlotChangeListener listener) {
		org.jfree.chart.plot.Plot.this.listenerList.add(org.jfree.chart.event.PlotChangeListener.class, listener);
	}

	public void removeChangeListener(org.jfree.chart.event.PlotChangeListener listener) {
		org.jfree.chart.plot.Plot.this.listenerList.remove(org.jfree.chart.event.PlotChangeListener.class, listener);
	}

	public void notifyListeners(org.jfree.chart.event.PlotChangeEvent event) {
		if (!(org.jfree.chart.plot.Plot.this.notify)) {
			return ;
		}
		java.lang.Object[] listeners = org.jfree.chart.plot.Plot.this.listenerList.getListenerList();
		for (int i = (listeners.length) - 2; i >= 0; i -= 2) {
			if ((listeners[i]) == (org.jfree.chart.event.PlotChangeListener.class)) {
				((org.jfree.chart.event.PlotChangeListener) (listeners[(i + 1)])).plotChanged(event);
			}
		}
	}

	protected void fireChangeEvent() {
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.Plot.this));
	}

	public abstract void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.awt.geom.Point2D anchor, org.jfree.chart.plot.PlotState parentState, org.jfree.chart.plot.PlotRenderingInfo info);

	public void drawBackground(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area) {
		fillBackground(g2, area);
		drawBackgroundImage(g2, area);
	}

	protected void fillBackground(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area) {
		fillBackground(g2, area, org.jfree.chart.plot.PlotOrientation.VERTICAL);
	}

	protected void fillBackground(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, org.jfree.chart.plot.PlotOrientation orientation) {
		if (orientation == null) {
			throw new java.lang.IllegalArgumentException("Null 'orientation' argument.");
		}
		if ((org.jfree.chart.plot.Plot.this.backgroundPaint) == null) {
			return ;
		}
		java.awt.Paint p = org.jfree.chart.plot.Plot.this.backgroundPaint;
		if (p instanceof java.awt.GradientPaint) {
			java.awt.GradientPaint gp = ((java.awt.GradientPaint) (p));
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				p = new java.awt.GradientPaint(((float) (area.getCenterX())), ((float) (area.getMaxY())), gp.getColor1(), ((float) (area.getCenterX())), ((float) (area.getMinY())), gp.getColor2());
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
					p = new java.awt.GradientPaint(((float) (area.getMinX())), ((float) (area.getCenterY())), gp.getColor1(), ((float) (area.getMaxX())), ((float) (area.getCenterY())), gp.getColor2());
				}
			
		}
		java.awt.Composite originalComposite = g2.getComposite();
		g2.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, org.jfree.chart.plot.Plot.this.backgroundAlpha));
		g2.setPaint(p);
		g2.fill(area);
		g2.setComposite(originalComposite);
	}

	public void drawBackgroundImage(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area) {
		if ((org.jfree.chart.plot.Plot.this.backgroundImage) == null) {
			return ;
		}
		java.awt.Composite savedComposite = g2.getComposite();
		g2.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, org.jfree.chart.plot.Plot.this.backgroundImageAlpha));
		java.awt.geom.Rectangle2D dest = new java.awt.geom.Rectangle2D.Double(0.0, 0.0, org.jfree.chart.plot.Plot.this.backgroundImage.getWidth(null), org.jfree.chart.plot.Plot.this.backgroundImage.getHeight(null));
		org.jfree.chart.util.Align.align(dest, area, org.jfree.chart.plot.Plot.this.backgroundImageAlignment);
		java.awt.Shape savedClip = g2.getClip();
		g2.clip(area);
		g2.drawImage(org.jfree.chart.plot.Plot.this.backgroundImage, ((int) (dest.getX())), ((int) (dest.getY())), (((int) (dest.getWidth())) + 1), (((int) (dest.getHeight())) + 1), null);
		g2.setClip(savedClip);
		g2.setComposite(savedComposite);
	}

	public void drawOutline(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area) {
		if (!(org.jfree.chart.plot.Plot.this.outlineVisible)) {
			return ;
		}
		if (((org.jfree.chart.plot.Plot.this.outlineStroke) != null) && ((org.jfree.chart.plot.Plot.this.outlinePaint) != null)) {
			g2.setStroke(org.jfree.chart.plot.Plot.this.outlineStroke);
			g2.setPaint(org.jfree.chart.plot.Plot.this.outlinePaint);
			g2.draw(area);
		}
	}

	protected void drawNoDataMessage(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area) {
		java.awt.Shape savedClip = g2.getClip();
		g2.clip(area);
		java.lang.String message = org.jfree.chart.plot.Plot.this.noDataMessage;
		if (message != null) {
			g2.setFont(org.jfree.chart.plot.Plot.this.noDataMessageFont);
			g2.setPaint(org.jfree.chart.plot.Plot.this.noDataMessagePaint);
			org.jfree.chart.text.TextBlock block = org.jfree.chart.text.TextUtilities.createTextBlock(org.jfree.chart.plot.Plot.this.noDataMessage, org.jfree.chart.plot.Plot.this.noDataMessageFont, org.jfree.chart.plot.Plot.this.noDataMessagePaint, (0.9F * ((float) (area.getWidth()))), new org.jfree.chart.text.G2TextMeasurer(g2));
			block.draw(g2, ((float) (area.getCenterX())), ((float) (area.getCenterY())), org.jfree.chart.text.TextBlockAnchor.CENTER);
		}
		g2.setClip(savedClip);
	}

	protected void createAndAddEntity(java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PlotRenderingInfo plotState, java.lang.String toolTip, java.lang.String urlText) {
		if ((plotState != null) && ((plotState.getOwner()) != null)) {
			org.jfree.chart.entity.EntityCollection e = plotState.getOwner().getEntityCollection();
			if (e != null) {
				e.add(new org.jfree.chart.entity.PlotEntity(dataArea, org.jfree.chart.plot.Plot.this, toolTip, urlText));
			}
		}
	}

	public void handleClick(int x, int y, org.jfree.chart.plot.PlotRenderingInfo info) {
	}

	public void zoom(double percent) {
	}

	public void annotationChanged(org.jfree.chart.event.AnnotationChangeEvent event) {
		fireChangeEvent();
	}

	public void axisChanged(org.jfree.chart.event.AxisChangeEvent event) {
		fireChangeEvent();
	}

	public void datasetChanged(org.jfree.data.event.DatasetChangeEvent event) {
		org.jfree.chart.event.PlotChangeEvent newEvent = new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.Plot.this);
		newEvent.setType(org.jfree.chart.event.ChartChangeEventType.DATASET_UPDATED);
		notifyListeners(newEvent);
	}

	public void markerChanged(org.jfree.chart.event.MarkerChangeEvent event) {
		fireChangeEvent();
	}

	protected double getRectX(double x, double w1, double w2, org.jfree.chart.util.RectangleEdge edge) {
		double result = x;
		if (edge == (org.jfree.chart.util.RectangleEdge.LEFT)) {
			result = result + w1;
		}else
			if (edge == (org.jfree.chart.util.RectangleEdge.RIGHT)) {
				result = result + w2;
			}
		
		return result;
	}

	protected double getRectY(double y, double h1, double h2, org.jfree.chart.util.RectangleEdge edge) {
		double result = y;
		if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
			result = result + h1;
		}else
			if (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM)) {
				result = result + h2;
			}
		
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.Plot.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.Plot)) {
			return false;
		}
		org.jfree.chart.plot.Plot that = ((org.jfree.chart.plot.Plot) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.Plot.this.noDataMessage, that.noDataMessage))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.Plot.this.noDataMessageFont, that.noDataMessageFont))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.Plot.this.noDataMessagePaint, that.noDataMessagePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.Plot.this.insets, that.insets))) {
			return false;
		}
		if ((org.jfree.chart.plot.Plot.this.outlineVisible) != (that.outlineVisible)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.Plot.this.outlineStroke, that.outlineStroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.Plot.this.outlinePaint, that.outlinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.Plot.this.backgroundPaint, that.backgroundPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.Plot.this.backgroundImage, that.backgroundImage))) {
			return false;
		}
		if ((org.jfree.chart.plot.Plot.this.backgroundImageAlignment) != (that.backgroundImageAlignment)) {
			return false;
		}
		if ((org.jfree.chart.plot.Plot.this.backgroundImageAlpha) != (that.backgroundImageAlpha)) {
			return false;
		}
		if ((org.jfree.chart.plot.Plot.this.foregroundAlpha) != (that.foregroundAlpha)) {
			return false;
		}
		if ((org.jfree.chart.plot.Plot.this.backgroundAlpha) != (that.backgroundAlpha)) {
			return false;
		}
		if (!(org.jfree.chart.plot.Plot.this.drawingSupplier.equals(that.drawingSupplier))) {
			return false;
		}
		if ((org.jfree.chart.plot.Plot.this.notify) != (that.notify)) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.plot.Plot clone = ((org.jfree.chart.plot.Plot) (super.clone()));
		if ((org.jfree.chart.plot.Plot.this.datasetGroup) != null) {
			clone.datasetGroup = ((org.jfree.data.general.DatasetGroup) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.plot.Plot.this.datasetGroup)));
		}
		clone.drawingSupplier = ((org.jfree.chart.plot.DrawingSupplier) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.plot.Plot.this.drawingSupplier)));
		clone.listenerList = new javax.swing.event.EventListenerList();
		return clone;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.Plot.this.noDataMessagePaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.Plot.this.outlineStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.Plot.this.outlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.Plot.this.backgroundPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.plot.Plot.this.noDataMessagePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.Plot.this.outlineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.Plot.this.outlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.Plot.this.backgroundPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.Plot.this.listenerList = new javax.swing.event.EventListenerList();
	}

	public static org.jfree.chart.util.RectangleEdge resolveDomainAxisLocation(org.jfree.chart.axis.AxisLocation location, org.jfree.chart.plot.PlotOrientation orientation) {
		if (location == null) {
			throw new java.lang.IllegalArgumentException("Null 'location' argument.");
		}
		if (orientation == null) {
			throw new java.lang.IllegalArgumentException("Null 'orientation' argument.");
		}
		org.jfree.chart.util.RectangleEdge result = null;
		if (location == (org.jfree.chart.axis.AxisLocation.TOP_OR_RIGHT)) {
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				result = org.jfree.chart.util.RectangleEdge.RIGHT;
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					result = org.jfree.chart.util.RectangleEdge.TOP;
				}
			
		}else
			if (location == (org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT)) {
				if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
					result = org.jfree.chart.util.RectangleEdge.LEFT;
				}else
					if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
						result = org.jfree.chart.util.RectangleEdge.TOP;
					}
				
			}else
				if (location == (org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT)) {
					if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
						result = org.jfree.chart.util.RectangleEdge.RIGHT;
					}else
						if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
							result = org.jfree.chart.util.RectangleEdge.BOTTOM;
						}
					
				}else
					if (location == (org.jfree.chart.axis.AxisLocation.BOTTOM_OR_LEFT)) {
						if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
							result = org.jfree.chart.util.RectangleEdge.LEFT;
						}else
							if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
								result = org.jfree.chart.util.RectangleEdge.BOTTOM;
							}
						
					}
				
			
		
		if (result == null) {
			throw new java.lang.IllegalStateException("resolveDomainAxisLocation()");
		}
		return result;
	}

	public static org.jfree.chart.util.RectangleEdge resolveRangeAxisLocation(org.jfree.chart.axis.AxisLocation location, org.jfree.chart.plot.PlotOrientation orientation) {
		if (location == null) {
			throw new java.lang.IllegalArgumentException("Null 'location' argument.");
		}
		if (orientation == null) {
			throw new java.lang.IllegalArgumentException("Null 'orientation' argument.");
		}
		org.jfree.chart.util.RectangleEdge result = null;
		if (location == (org.jfree.chart.axis.AxisLocation.TOP_OR_RIGHT)) {
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				result = org.jfree.chart.util.RectangleEdge.TOP;
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					result = org.jfree.chart.util.RectangleEdge.RIGHT;
				}
			
		}else
			if (location == (org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT)) {
				if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
					result = org.jfree.chart.util.RectangleEdge.TOP;
				}else
					if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
						result = org.jfree.chart.util.RectangleEdge.LEFT;
					}
				
			}else
				if (location == (org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT)) {
					if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
						result = org.jfree.chart.util.RectangleEdge.BOTTOM;
					}else
						if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
							result = org.jfree.chart.util.RectangleEdge.RIGHT;
						}
					
				}else
					if (location == (org.jfree.chart.axis.AxisLocation.BOTTOM_OR_LEFT)) {
						if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
							result = org.jfree.chart.util.RectangleEdge.BOTTOM;
						}else
							if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
								result = org.jfree.chart.util.RectangleEdge.LEFT;
							}
						
					}
				
			
		
		if (result == null) {
			throw new java.lang.IllegalStateException("resolveRangeAxisLocation()");
		}
		return result;
	}
}

