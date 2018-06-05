

package org.jfree.chart.axis;


public abstract class Axis implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = 7719289504573298271L;

	public static final boolean DEFAULT_AXIS_VISIBLE = true;

	public static final java.awt.Font DEFAULT_AXIS_LABEL_FONT = new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 12);

	public static final java.awt.Paint DEFAULT_AXIS_LABEL_PAINT = java.awt.Color.black;

	public static final org.jfree.chart.util.RectangleInsets DEFAULT_AXIS_LABEL_INSETS = new org.jfree.chart.util.RectangleInsets(3.0, 3.0, 3.0, 3.0);

	public static final java.awt.Paint DEFAULT_AXIS_LINE_PAINT = java.awt.Color.gray;

	public static final java.awt.Stroke DEFAULT_AXIS_LINE_STROKE = new java.awt.BasicStroke(1.0F);

	public static final boolean DEFAULT_TICK_LABELS_VISIBLE = true;

	public static final java.awt.Font DEFAULT_TICK_LABEL_FONT = new java.awt.Font("SansSerif", java.awt.Font.PLAIN, 10);

	public static final java.awt.Paint DEFAULT_TICK_LABEL_PAINT = java.awt.Color.black;

	public static final org.jfree.chart.util.RectangleInsets DEFAULT_TICK_LABEL_INSETS = new org.jfree.chart.util.RectangleInsets(2.0, 4.0, 2.0, 4.0);

	public static final boolean DEFAULT_TICK_MARKS_VISIBLE = true;

	public static final java.awt.Stroke DEFAULT_TICK_MARK_STROKE = new java.awt.BasicStroke(1);

	public static final java.awt.Paint DEFAULT_TICK_MARK_PAINT = java.awt.Color.gray;

	public static final float DEFAULT_TICK_MARK_INSIDE_LENGTH = 0.0F;

	public static final float DEFAULT_TICK_MARK_OUTSIDE_LENGTH = 2.0F;

	private boolean visible;

	private java.lang.String label;

	private java.awt.Font labelFont;

	private transient java.awt.Paint labelPaint;

	private org.jfree.chart.util.RectangleInsets labelInsets;

	private double labelAngle;

	private java.lang.String labelToolTip;

	private java.lang.String labelURL;

	private boolean axisLineVisible;

	private transient java.awt.Stroke axisLineStroke;

	private transient java.awt.Paint axisLinePaint;

	private boolean tickLabelsVisible;

	private java.awt.Font tickLabelFont;

	private transient java.awt.Paint tickLabelPaint;

	private org.jfree.chart.util.RectangleInsets tickLabelInsets;

	private boolean tickMarksVisible;

	private float tickMarkInsideLength;

	private float tickMarkOutsideLength;

	private transient java.awt.Stroke tickMarkStroke;

	private transient java.awt.Paint tickMarkPaint;

	private double fixedDimension;

	private transient org.jfree.chart.plot.Plot plot;

	private transient javax.swing.event.EventListenerList listenerList;

	protected Axis(java.lang.String label) {
		org.jfree.chart.axis.Axis.this.label = label;
		org.jfree.chart.axis.Axis.this.visible = org.jfree.chart.axis.Axis.DEFAULT_AXIS_VISIBLE;
		org.jfree.chart.axis.Axis.this.labelFont = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_FONT;
		org.jfree.chart.axis.Axis.this.labelPaint = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_PAINT;
		org.jfree.chart.axis.Axis.this.labelInsets = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
		org.jfree.chart.axis.Axis.this.labelAngle = 0.0;
		org.jfree.chart.axis.Axis.this.labelToolTip = null;
		org.jfree.chart.axis.Axis.this.labelURL = null;
		org.jfree.chart.axis.Axis.this.axisLineVisible = true;
		org.jfree.chart.axis.Axis.this.axisLinePaint = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LINE_PAINT;
		org.jfree.chart.axis.Axis.this.axisLineStroke = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LINE_STROKE;
		org.jfree.chart.axis.Axis.this.tickLabelsVisible = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABELS_VISIBLE;
		org.jfree.chart.axis.Axis.this.tickLabelFont = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
		org.jfree.chart.axis.Axis.this.tickLabelPaint = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_PAINT;
		org.jfree.chart.axis.Axis.this.tickLabelInsets = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_INSETS;
		org.jfree.chart.axis.Axis.this.tickMarksVisible = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARKS_VISIBLE;
		org.jfree.chart.axis.Axis.this.tickMarkStroke = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_STROKE;
		org.jfree.chart.axis.Axis.this.tickMarkPaint = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_PAINT;
		org.jfree.chart.axis.Axis.this.tickMarkInsideLength = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_INSIDE_LENGTH;
		org.jfree.chart.axis.Axis.this.tickMarkOutsideLength = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_OUTSIDE_LENGTH;
		org.jfree.chart.axis.Axis.this.plot = null;
		org.jfree.chart.axis.Axis.this.listenerList = new javax.swing.event.EventListenerList();
	}

	public boolean isVisible() {
		return org.jfree.chart.axis.Axis.this.visible;
	}

	public void setVisible(boolean flag) {
		if (flag != (org.jfree.chart.axis.Axis.this.visible)) {
			org.jfree.chart.axis.Axis.this.visible = flag;
			notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.Axis.this));
		}
	}

	public java.lang.String getLabel() {
		return org.jfree.chart.axis.Axis.this.label;
	}

	public void setLabel(java.lang.String label) {
		java.lang.String existing = org.jfree.chart.axis.Axis.this.label;
		if (existing != null) {
			if (!(existing.equals(label))) {
				org.jfree.chart.axis.Axis.this.label = label;
				notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.Axis.this));
			}
		}else {
			if (label != null) {
				org.jfree.chart.axis.Axis.this.label = label;
				notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.Axis.this));
			}
		}
	}

	public java.awt.Font getLabelFont() {
		return org.jfree.chart.axis.Axis.this.labelFont;
	}

	public void setLabelFont(java.awt.Font font) {
		if (font == null) {
			throw new java.lang.IllegalArgumentException("Null 'font' argument.");
		}
		if (!(org.jfree.chart.axis.Axis.this.labelFont.equals(font))) {
			org.jfree.chart.axis.Axis.this.labelFont = font;
			notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.Axis.this));
		}
	}

	public java.awt.Paint getLabelPaint() {
		return org.jfree.chart.axis.Axis.this.labelPaint;
	}

	public void setLabelPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.axis.Axis.this.labelPaint = paint;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.Axis.this));
	}

	public org.jfree.chart.util.RectangleInsets getLabelInsets() {
		return org.jfree.chart.axis.Axis.this.labelInsets;
	}

	public void setLabelInsets(org.jfree.chart.util.RectangleInsets insets) {
		if (insets == null) {
			throw new java.lang.IllegalArgumentException("Null 'insets' argument.");
		}
		if (!(insets.equals(org.jfree.chart.axis.Axis.this.labelInsets))) {
			org.jfree.chart.axis.Axis.this.labelInsets = insets;
			notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.Axis.this));
		}
	}

	public double getLabelAngle() {
		return org.jfree.chart.axis.Axis.this.labelAngle;
	}

	public void setLabelAngle(double angle) {
		org.jfree.chart.axis.Axis.this.labelAngle = angle;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.Axis.this));
	}

	public java.lang.String getLabelToolTip() {
		return org.jfree.chart.axis.Axis.this.labelToolTip;
	}

	public void setLabelToolTip(java.lang.String text) {
		org.jfree.chart.axis.Axis.this.labelToolTip = text;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.Axis.this));
	}

	public java.lang.String getLabelURL() {
		return org.jfree.chart.axis.Axis.this.labelURL;
	}

	public void setLabelURL(java.lang.String url) {
		org.jfree.chart.axis.Axis.this.labelURL = url;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.Axis.this));
	}

	public boolean isAxisLineVisible() {
		return org.jfree.chart.axis.Axis.this.axisLineVisible;
	}

	public void setAxisLineVisible(boolean visible) {
		org.jfree.chart.axis.Axis.this.axisLineVisible = visible;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.Axis.this));
	}

	public java.awt.Paint getAxisLinePaint() {
		return org.jfree.chart.axis.Axis.this.axisLinePaint;
	}

	public void setAxisLinePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.axis.Axis.this.axisLinePaint = paint;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.Axis.this));
	}

	public java.awt.Stroke getAxisLineStroke() {
		return org.jfree.chart.axis.Axis.this.axisLineStroke;
	}

	public void setAxisLineStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.axis.Axis.this.axisLineStroke = stroke;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.Axis.this));
	}

	public boolean isTickLabelsVisible() {
		return org.jfree.chart.axis.Axis.this.tickLabelsVisible;
	}

	public void setTickLabelsVisible(boolean flag) {
		if (flag != (org.jfree.chart.axis.Axis.this.tickLabelsVisible)) {
			org.jfree.chart.axis.Axis.this.tickLabelsVisible = flag;
			notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.Axis.this));
		}
	}

	public java.awt.Font getTickLabelFont() {
		return org.jfree.chart.axis.Axis.this.tickLabelFont;
	}

	public void setTickLabelFont(java.awt.Font font) {
		if (font == null) {
			throw new java.lang.IllegalArgumentException("Null 'font' argument.");
		}
		if (!(org.jfree.chart.axis.Axis.this.tickLabelFont.equals(font))) {
			org.jfree.chart.axis.Axis.this.tickLabelFont = font;
			notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.Axis.this));
		}
	}

	public java.awt.Paint getTickLabelPaint() {
		return org.jfree.chart.axis.Axis.this.tickLabelPaint;
	}

	public void setTickLabelPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.axis.Axis.this.tickLabelPaint = paint;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.Axis.this));
	}

	public org.jfree.chart.util.RectangleInsets getTickLabelInsets() {
		return org.jfree.chart.axis.Axis.this.tickLabelInsets;
	}

	public void setTickLabelInsets(org.jfree.chart.util.RectangleInsets insets) {
		if (insets == null) {
			throw new java.lang.IllegalArgumentException("Null 'insets' argument.");
		}
		if (!(org.jfree.chart.axis.Axis.this.tickLabelInsets.equals(insets))) {
			org.jfree.chart.axis.Axis.this.tickLabelInsets = insets;
			notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.Axis.this));
		}
	}

	public boolean isTickMarksVisible() {
		return org.jfree.chart.axis.Axis.this.tickMarksVisible;
	}

	public void setTickMarksVisible(boolean flag) {
		if (flag != (org.jfree.chart.axis.Axis.this.tickMarksVisible)) {
			org.jfree.chart.axis.Axis.this.tickMarksVisible = flag;
			notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.Axis.this));
		}
	}

	public float getTickMarkInsideLength() {
		return org.jfree.chart.axis.Axis.this.tickMarkInsideLength;
	}

	public void setTickMarkInsideLength(float length) {
		org.jfree.chart.axis.Axis.this.tickMarkInsideLength = length;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.Axis.this));
	}

	public float getTickMarkOutsideLength() {
		return org.jfree.chart.axis.Axis.this.tickMarkOutsideLength;
	}

	public void setTickMarkOutsideLength(float length) {
		org.jfree.chart.axis.Axis.this.tickMarkOutsideLength = length;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.Axis.this));
	}

	public java.awt.Stroke getTickMarkStroke() {
		return org.jfree.chart.axis.Axis.this.tickMarkStroke;
	}

	public void setTickMarkStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		if (!(org.jfree.chart.axis.Axis.this.tickMarkStroke.equals(stroke))) {
			org.jfree.chart.axis.Axis.this.tickMarkStroke = stroke;
			notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.Axis.this));
		}
	}

	public java.awt.Paint getTickMarkPaint() {
		return org.jfree.chart.axis.Axis.this.tickMarkPaint;
	}

	public void setTickMarkPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.axis.Axis.this.tickMarkPaint = paint;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.Axis.this));
	}

	public org.jfree.chart.plot.Plot getPlot() {
		return org.jfree.chart.axis.Axis.this.plot;
	}

	public void setPlot(org.jfree.chart.plot.Plot plot) {
		org.jfree.chart.axis.Axis.this.plot = plot;
		configure();
	}

	public double getFixedDimension() {
		return org.jfree.chart.axis.Axis.this.fixedDimension;
	}

	public void setFixedDimension(double dimension) {
		org.jfree.chart.axis.Axis.this.fixedDimension = dimension;
	}

	public abstract void configure();

	public abstract org.jfree.chart.axis.AxisSpace reserveSpace(java.awt.Graphics2D g2, org.jfree.chart.plot.Plot plot, java.awt.geom.Rectangle2D plotArea, org.jfree.chart.util.RectangleEdge edge, org.jfree.chart.axis.AxisSpace space);

	public abstract org.jfree.chart.axis.AxisState draw(java.awt.Graphics2D g2, double cursor, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge, org.jfree.chart.plot.PlotRenderingInfo plotState);

	public abstract java.util.List refreshTicks(java.awt.Graphics2D g2, org.jfree.chart.axis.AxisState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge);

	public void addChangeListener(org.jfree.chart.event.AxisChangeListener listener) {
		org.jfree.chart.axis.Axis.this.listenerList.add(org.jfree.chart.event.AxisChangeListener.class, listener);
	}

	public void removeChangeListener(org.jfree.chart.event.AxisChangeListener listener) {
		org.jfree.chart.axis.Axis.this.listenerList.remove(org.jfree.chart.event.AxisChangeListener.class, listener);
	}

	public boolean hasListener(java.util.EventListener listener) {
		java.util.List list = java.util.Arrays.asList(org.jfree.chart.axis.Axis.this.listenerList.getListenerList());
		return list.contains(listener);
	}

	protected void notifyListeners(org.jfree.chart.event.AxisChangeEvent event) {
		java.lang.Object[] listeners = org.jfree.chart.axis.Axis.this.listenerList.getListenerList();
		for (int i = (listeners.length) - 2; i >= 0; i -= 2) {
			if ((listeners[i]) == (org.jfree.chart.event.AxisChangeListener.class)) {
				((org.jfree.chart.event.AxisChangeListener) (listeners[(i + 1)])).axisChanged(event);
			}
		}
	}

	protected java.awt.geom.Rectangle2D getLabelEnclosure(java.awt.Graphics2D g2, org.jfree.chart.util.RectangleEdge edge) {
		java.awt.geom.Rectangle2D result = new java.awt.geom.Rectangle2D.Double();
		java.lang.String axisLabel = getLabel();
		if ((axisLabel != null) && (!(axisLabel.equals("")))) {
			java.awt.FontMetrics fm = g2.getFontMetrics(getLabelFont());
			java.awt.geom.Rectangle2D bounds = org.jfree.chart.text.TextUtilities.getTextBounds(axisLabel, g2, fm);
			org.jfree.chart.util.RectangleInsets insets = getLabelInsets();
			bounds = insets.createOutsetRectangle(bounds);
			double angle = getLabelAngle();
			if ((edge == (org.jfree.chart.util.RectangleEdge.LEFT)) || (edge == (org.jfree.chart.util.RectangleEdge.RIGHT))) {
				angle = angle - ((java.lang.Math.PI) / 2.0);
			}
			double x = bounds.getCenterX();
			double y = bounds.getCenterY();
			java.awt.geom.AffineTransform transformer = java.awt.geom.AffineTransform.getRotateInstance(angle, x, y);
			java.awt.Shape labelBounds = transformer.createTransformedShape(bounds);
			result = labelBounds.getBounds2D();
		}
		return result;
	}

	protected org.jfree.chart.axis.AxisState drawLabel(java.lang.String label, java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge, org.jfree.chart.axis.AxisState state, org.jfree.chart.plot.PlotRenderingInfo plotState) {
		if (state == null) {
			throw new java.lang.IllegalArgumentException("Null 'state' argument.");
		}
		if ((label == null) || (label.equals(""))) {
			return state;
		}
		java.awt.Font font = getLabelFont();
		org.jfree.chart.util.RectangleInsets insets = getLabelInsets();
		g2.setFont(font);
		g2.setPaint(getLabelPaint());
		java.awt.FontMetrics fm = g2.getFontMetrics();
		java.awt.geom.Rectangle2D labelBounds = org.jfree.chart.text.TextUtilities.getTextBounds(label, g2, fm);
		java.awt.Shape hotspot = null;
		if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
			java.awt.geom.AffineTransform t = java.awt.geom.AffineTransform.getRotateInstance(getLabelAngle(), labelBounds.getCenterX(), labelBounds.getCenterY());
			java.awt.Shape rotatedLabelBounds = t.createTransformedShape(labelBounds);
			labelBounds = rotatedLabelBounds.getBounds2D();
			float w = ((float) (labelBounds.getWidth()));
			float h = ((float) (labelBounds.getHeight()));
			float labelx = ((float) (dataArea.getCenterX()));
			float labely = ((float) (((state.getCursor()) - (insets.getBottom())) - (h / 2.0)));
			org.jfree.chart.text.TextUtilities.drawRotatedString(label, g2, labelx, labely, org.jfree.chart.text.TextAnchor.CENTER, getLabelAngle(), org.jfree.chart.text.TextAnchor.CENTER);
			hotspot = new java.awt.geom.Rectangle2D.Float((labelx - (w / 2.0F)), (labely - (h / 2.0F)), w, h);
			state.cursorUp((((insets.getTop()) + (labelBounds.getHeight())) + (insets.getBottom())));
		}else
			if (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM)) {
				java.awt.geom.AffineTransform t = java.awt.geom.AffineTransform.getRotateInstance(getLabelAngle(), labelBounds.getCenterX(), labelBounds.getCenterY());
				java.awt.Shape rotatedLabelBounds = t.createTransformedShape(labelBounds);
				labelBounds = rotatedLabelBounds.getBounds2D();
				float w = ((float) (labelBounds.getWidth()));
				float h = ((float) (labelBounds.getHeight()));
				float labelx = ((float) (dataArea.getCenterX()));
				float labely = ((float) (((state.getCursor()) + (insets.getTop())) + (h / 2.0)));
				org.jfree.chart.text.TextUtilities.drawRotatedString(label, g2, labelx, labely, org.jfree.chart.text.TextAnchor.CENTER, getLabelAngle(), org.jfree.chart.text.TextAnchor.CENTER);
				hotspot = new java.awt.geom.Rectangle2D.Float((labelx - (w / 2.0F)), (labely - (h / 2.0F)), w, h);
				state.cursorDown((((insets.getTop()) + (labelBounds.getHeight())) + (insets.getBottom())));
			}else
				if (edge == (org.jfree.chart.util.RectangleEdge.LEFT)) {
					java.awt.geom.AffineTransform t = java.awt.geom.AffineTransform.getRotateInstance(((getLabelAngle()) - ((java.lang.Math.PI) / 2.0)), labelBounds.getCenterX(), labelBounds.getCenterY());
					java.awt.Shape rotatedLabelBounds = t.createTransformedShape(labelBounds);
					labelBounds = rotatedLabelBounds.getBounds2D();
					float w = ((float) (labelBounds.getWidth()));
					float h = ((float) (labelBounds.getHeight()));
					float labelx = ((float) (((state.getCursor()) - (insets.getRight())) - (w / 2.0)));
					float labely = ((float) (dataArea.getCenterY()));
					org.jfree.chart.text.TextUtilities.drawRotatedString(label, g2, labelx, labely, org.jfree.chart.text.TextAnchor.CENTER, ((getLabelAngle()) - ((java.lang.Math.PI) / 2.0)), org.jfree.chart.text.TextAnchor.CENTER);
					hotspot = new java.awt.geom.Rectangle2D.Float((labelx - (w / 2.0F)), (labely - (h / 2.0F)), w, h);
					state.cursorLeft((((insets.getLeft()) + (labelBounds.getWidth())) + (insets.getRight())));
				}else
					if (edge == (org.jfree.chart.util.RectangleEdge.RIGHT)) {
						java.awt.geom.AffineTransform t = java.awt.geom.AffineTransform.getRotateInstance(((getLabelAngle()) + ((java.lang.Math.PI) / 2.0)), labelBounds.getCenterX(), labelBounds.getCenterY());
						java.awt.Shape rotatedLabelBounds = t.createTransformedShape(labelBounds);
						labelBounds = rotatedLabelBounds.getBounds2D();
						float w = ((float) (labelBounds.getWidth()));
						float h = ((float) (labelBounds.getHeight()));
						float labelx = ((float) (((state.getCursor()) + (insets.getLeft())) + (w / 2.0)));
						float labely = ((float) ((dataArea.getY()) + ((dataArea.getHeight()) / 2.0)));
						org.jfree.chart.text.TextUtilities.drawRotatedString(label, g2, labelx, labely, org.jfree.chart.text.TextAnchor.CENTER, ((getLabelAngle()) + ((java.lang.Math.PI) / 2.0)), org.jfree.chart.text.TextAnchor.CENTER);
						hotspot = new java.awt.geom.Rectangle2D.Float((labelx - (w / 2.0F)), (labely - (h / 2.0F)), w, h);
						state.cursorRight((((insets.getLeft()) + (labelBounds.getWidth())) + (insets.getRight())));
					}
				
			
		
		if ((plotState != null) && (hotspot != null)) {
			org.jfree.chart.ChartRenderingInfo owner = plotState.getOwner();
			if (owner != null) {
				org.jfree.chart.entity.EntityCollection entities = owner.getEntityCollection();
				if (entities != null) {
					entities.add(new org.jfree.chart.entity.AxisLabelEntity(org.jfree.chart.axis.Axis.this, hotspot, org.jfree.chart.axis.Axis.this.labelToolTip, org.jfree.chart.axis.Axis.this.labelURL));
				}
			}
		}
		return state;
	}

	protected void drawAxisLine(java.awt.Graphics2D g2, double cursor, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge) {
		java.awt.geom.Line2D axisLine = null;
		if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
			axisLine = new java.awt.geom.Line2D.Double(dataArea.getX(), cursor, dataArea.getMaxX(), cursor);
		}else
			if (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM)) {
				axisLine = new java.awt.geom.Line2D.Double(dataArea.getX(), cursor, dataArea.getMaxX(), cursor);
			}else
				if (edge == (org.jfree.chart.util.RectangleEdge.LEFT)) {
					axisLine = new java.awt.geom.Line2D.Double(cursor, dataArea.getY(), cursor, dataArea.getMaxY());
				}else
					if (edge == (org.jfree.chart.util.RectangleEdge.RIGHT)) {
						axisLine = new java.awt.geom.Line2D.Double(cursor, dataArea.getY(), cursor, dataArea.getMaxY());
					}
				
			
		
		g2.setPaint(org.jfree.chart.axis.Axis.this.axisLinePaint);
		g2.setStroke(org.jfree.chart.axis.Axis.this.axisLineStroke);
		g2.draw(axisLine);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.axis.Axis clone = ((org.jfree.chart.axis.Axis) (super.clone()));
		clone.plot = null;
		clone.listenerList = new javax.swing.event.EventListenerList();
		return clone;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.axis.Axis.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.axis.Axis)) {
			return false;
		}
		org.jfree.chart.axis.Axis that = ((org.jfree.chart.axis.Axis) (obj));
		if ((org.jfree.chart.axis.Axis.this.visible) != (that.visible)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.axis.Axis.this.label, that.label))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.axis.Axis.this.labelFont, that.labelFont))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.axis.Axis.this.labelPaint, that.labelPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.axis.Axis.this.labelInsets, that.labelInsets))) {
			return false;
		}
		if ((org.jfree.chart.axis.Axis.this.labelAngle) != (that.labelAngle)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.axis.Axis.this.labelToolTip, that.labelToolTip))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.axis.Axis.this.labelURL, that.labelURL))) {
			return false;
		}
		if ((org.jfree.chart.axis.Axis.this.axisLineVisible) != (that.axisLineVisible)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.axis.Axis.this.axisLineStroke, that.axisLineStroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.axis.Axis.this.axisLinePaint, that.axisLinePaint))) {
			return false;
		}
		if ((org.jfree.chart.axis.Axis.this.tickLabelsVisible) != (that.tickLabelsVisible)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.axis.Axis.this.tickLabelFont, that.tickLabelFont))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.axis.Axis.this.tickLabelPaint, that.tickLabelPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.axis.Axis.this.tickLabelInsets, that.tickLabelInsets))) {
			return false;
		}
		if ((org.jfree.chart.axis.Axis.this.tickMarksVisible) != (that.tickMarksVisible)) {
			return false;
		}
		if ((org.jfree.chart.axis.Axis.this.tickMarkInsideLength) != (that.tickMarkInsideLength)) {
			return false;
		}
		if ((org.jfree.chart.axis.Axis.this.tickMarkOutsideLength) != (that.tickMarkOutsideLength)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.axis.Axis.this.tickMarkPaint, that.tickMarkPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.axis.Axis.this.tickMarkStroke, that.tickMarkStroke))) {
			return false;
		}
		if ((org.jfree.chart.axis.Axis.this.fixedDimension) != (that.fixedDimension)) {
			return false;
		}
		return true;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.axis.Axis.this.labelPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.axis.Axis.this.tickLabelPaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.axis.Axis.this.axisLineStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.axis.Axis.this.axisLinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.axis.Axis.this.tickMarkStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.axis.Axis.this.tickMarkPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.axis.Axis.this.labelPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.axis.Axis.this.tickLabelPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.axis.Axis.this.axisLineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.axis.Axis.this.axisLinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.axis.Axis.this.tickMarkStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.axis.Axis.this.tickMarkPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.axis.Axis.this.listenerList = new javax.swing.event.EventListenerList();
	}
}

