

package org.jfree.chart.axis;


public abstract class ValueAxis extends org.jfree.chart.axis.Axis implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 3698345477322391456L;

	public static final org.jfree.data.Range DEFAULT_RANGE = new org.jfree.data.Range(0.0, 1.0);

	public static final boolean DEFAULT_AUTO_RANGE = true;

	public static final boolean DEFAULT_INVERTED = false;

	public static final double DEFAULT_AUTO_RANGE_MINIMUM_SIZE = 1.0E-8;

	public static final double DEFAULT_LOWER_MARGIN = 0.05;

	public static final double DEFAULT_UPPER_MARGIN = 0.05;

	public static final boolean DEFAULT_AUTO_TICK_UNIT_SELECTION = true;

	public static final int MAXIMUM_TICK_COUNT = 500;

	private boolean positiveArrowVisible;

	private boolean negativeArrowVisible;

	private transient java.awt.Shape upArrow;

	private transient java.awt.Shape downArrow;

	private transient java.awt.Shape leftArrow;

	private transient java.awt.Shape rightArrow;

	private boolean inverted;

	private org.jfree.data.Range range;

	private boolean autoRange;

	private double autoRangeMinimumSize;

	private org.jfree.data.Range defaultAutoRange;

	private double upperMargin;

	private double lowerMargin;

	private double fixedAutoRange;

	private boolean autoTickUnitSelection;

	private org.jfree.chart.axis.TickUnitSource standardTickUnits;

	private int autoTickIndex;

	private boolean verticalTickLabels;

	protected ValueAxis(java.lang.String label, org.jfree.chart.axis.TickUnitSource standardTickUnits) {
		super(label);
		org.jfree.chart.axis.ValueAxis.this.positiveArrowVisible = false;
		org.jfree.chart.axis.ValueAxis.this.negativeArrowVisible = false;
		org.jfree.chart.axis.ValueAxis.this.range = org.jfree.chart.axis.ValueAxis.DEFAULT_RANGE;
		org.jfree.chart.axis.ValueAxis.this.autoRange = org.jfree.chart.axis.ValueAxis.DEFAULT_AUTO_RANGE;
		org.jfree.chart.axis.ValueAxis.this.defaultAutoRange = org.jfree.chart.axis.ValueAxis.DEFAULT_RANGE;
		org.jfree.chart.axis.ValueAxis.this.inverted = org.jfree.chart.axis.ValueAxis.DEFAULT_INVERTED;
		org.jfree.chart.axis.ValueAxis.this.autoRangeMinimumSize = org.jfree.chart.axis.ValueAxis.DEFAULT_AUTO_RANGE_MINIMUM_SIZE;
		org.jfree.chart.axis.ValueAxis.this.lowerMargin = org.jfree.chart.axis.ValueAxis.DEFAULT_LOWER_MARGIN;
		org.jfree.chart.axis.ValueAxis.this.upperMargin = org.jfree.chart.axis.ValueAxis.DEFAULT_UPPER_MARGIN;
		org.jfree.chart.axis.ValueAxis.this.fixedAutoRange = 0.0;
		org.jfree.chart.axis.ValueAxis.this.autoTickUnitSelection = org.jfree.chart.axis.ValueAxis.DEFAULT_AUTO_TICK_UNIT_SELECTION;
		org.jfree.chart.axis.ValueAxis.this.standardTickUnits = standardTickUnits;
		java.awt.Polygon p1 = new java.awt.Polygon();
		p1.addPoint(0, 0);
		p1.addPoint((-2), 2);
		p1.addPoint(2, 2);
		org.jfree.chart.axis.ValueAxis.this.upArrow = p1;
		java.awt.Polygon p2 = new java.awt.Polygon();
		p2.addPoint(0, 0);
		p2.addPoint((-2), (-2));
		p2.addPoint(2, (-2));
		org.jfree.chart.axis.ValueAxis.this.downArrow = p2;
		java.awt.Polygon p3 = new java.awt.Polygon();
		p3.addPoint(0, 0);
		p3.addPoint((-2), (-2));
		p3.addPoint((-2), 2);
		org.jfree.chart.axis.ValueAxis.this.rightArrow = p3;
		java.awt.Polygon p4 = new java.awt.Polygon();
		p4.addPoint(0, 0);
		p4.addPoint(2, (-2));
		p4.addPoint(2, 2);
		org.jfree.chart.axis.ValueAxis.this.leftArrow = p4;
		org.jfree.chart.axis.ValueAxis.this.verticalTickLabels = false;
	}

	public boolean isVerticalTickLabels() {
		return org.jfree.chart.axis.ValueAxis.this.verticalTickLabels;
	}

	public void setVerticalTickLabels(boolean flag) {
		if ((org.jfree.chart.axis.ValueAxis.this.verticalTickLabels) != flag) {
			org.jfree.chart.axis.ValueAxis.this.verticalTickLabels = flag;
			notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.ValueAxis.this));
		}
	}

	public boolean isPositiveArrowVisible() {
		return org.jfree.chart.axis.ValueAxis.this.positiveArrowVisible;
	}

	public void setPositiveArrowVisible(boolean visible) {
		org.jfree.chart.axis.ValueAxis.this.positiveArrowVisible = visible;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.ValueAxis.this));
	}

	public boolean isNegativeArrowVisible() {
		return org.jfree.chart.axis.ValueAxis.this.negativeArrowVisible;
	}

	public void setNegativeArrowVisible(boolean visible) {
		org.jfree.chart.axis.ValueAxis.this.negativeArrowVisible = visible;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.ValueAxis.this));
	}

	public java.awt.Shape getUpArrow() {
		return org.jfree.chart.axis.ValueAxis.this.upArrow;
	}

	public void setUpArrow(java.awt.Shape arrow) {
		if (arrow == null) {
			throw new java.lang.IllegalArgumentException("Null 'arrow' argument.");
		}
		org.jfree.chart.axis.ValueAxis.this.upArrow = arrow;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.ValueAxis.this));
	}

	public java.awt.Shape getDownArrow() {
		return org.jfree.chart.axis.ValueAxis.this.downArrow;
	}

	public void setDownArrow(java.awt.Shape arrow) {
		if (arrow == null) {
			throw new java.lang.IllegalArgumentException("Null 'arrow' argument.");
		}
		org.jfree.chart.axis.ValueAxis.this.downArrow = arrow;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.ValueAxis.this));
	}

	public java.awt.Shape getLeftArrow() {
		return org.jfree.chart.axis.ValueAxis.this.leftArrow;
	}

	public void setLeftArrow(java.awt.Shape arrow) {
		if (arrow == null) {
			throw new java.lang.IllegalArgumentException("Null 'arrow' argument.");
		}
		org.jfree.chart.axis.ValueAxis.this.leftArrow = arrow;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.ValueAxis.this));
	}

	public java.awt.Shape getRightArrow() {
		return org.jfree.chart.axis.ValueAxis.this.rightArrow;
	}

	public void setRightArrow(java.awt.Shape arrow) {
		if (arrow == null) {
			throw new java.lang.IllegalArgumentException("Null 'arrow' argument.");
		}
		org.jfree.chart.axis.ValueAxis.this.rightArrow = arrow;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.ValueAxis.this));
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
				
			
		
		g2.setPaint(getAxisLinePaint());
		g2.setStroke(getAxisLineStroke());
		g2.draw(axisLine);
		boolean drawUpOrRight = false;
		boolean drawDownOrLeft = false;
		if (org.jfree.chart.axis.ValueAxis.this.positiveArrowVisible) {
			if (org.jfree.chart.axis.ValueAxis.this.inverted) {
				drawDownOrLeft = true;
			}else {
				drawUpOrRight = true;
			}
		}
		if (org.jfree.chart.axis.ValueAxis.this.negativeArrowVisible) {
			if (org.jfree.chart.axis.ValueAxis.this.inverted) {
				drawUpOrRight = true;
			}else {
				drawDownOrLeft = true;
			}
		}
		if (drawUpOrRight) {
			double x = 0.0;
			double y = 0.0;
			java.awt.Shape arrow = null;
			if ((edge == (org.jfree.chart.util.RectangleEdge.TOP)) || (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM))) {
				x = dataArea.getMaxX();
				y = cursor;
				arrow = org.jfree.chart.axis.ValueAxis.this.rightArrow;
			}else
				if ((edge == (org.jfree.chart.util.RectangleEdge.LEFT)) || (edge == (org.jfree.chart.util.RectangleEdge.RIGHT))) {
					x = cursor;
					y = dataArea.getMinY();
					arrow = org.jfree.chart.axis.ValueAxis.this.upArrow;
				}
			
			java.awt.geom.AffineTransform transformer = new java.awt.geom.AffineTransform();
			transformer.setToTranslation(x, y);
			java.awt.Shape shape = transformer.createTransformedShape(arrow);
			g2.fill(shape);
			g2.draw(shape);
		}
		if (drawDownOrLeft) {
			double x = 0.0;
			double y = 0.0;
			java.awt.Shape arrow = null;
			if ((edge == (org.jfree.chart.util.RectangleEdge.TOP)) || (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM))) {
				x = dataArea.getMinX();
				y = cursor;
				arrow = org.jfree.chart.axis.ValueAxis.this.leftArrow;
			}else
				if ((edge == (org.jfree.chart.util.RectangleEdge.LEFT)) || (edge == (org.jfree.chart.util.RectangleEdge.RIGHT))) {
					x = cursor;
					y = dataArea.getMaxY();
					arrow = org.jfree.chart.axis.ValueAxis.this.downArrow;
				}
			
			java.awt.geom.AffineTransform transformer = new java.awt.geom.AffineTransform();
			transformer.setToTranslation(x, y);
			java.awt.Shape shape = transformer.createTransformedShape(arrow);
			g2.fill(shape);
			g2.draw(shape);
		}
	}

	protected float[] calculateAnchorPoint(org.jfree.chart.axis.ValueTick tick, double cursor, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge) {
		org.jfree.chart.util.RectangleInsets insets = getTickLabelInsets();
		float[] result = new float[2];
		if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
			result[0] = ((float) (valueToJava2D(tick.getValue(), dataArea, edge)));
			result[1] = ((float) ((cursor - (insets.getBottom())) - 2.0));
		}else
			if (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM)) {
				result[0] = ((float) (valueToJava2D(tick.getValue(), dataArea, edge)));
				result[1] = ((float) ((cursor + (insets.getTop())) + 2.0));
			}else
				if (edge == (org.jfree.chart.util.RectangleEdge.LEFT)) {
					result[0] = ((float) ((cursor - (insets.getLeft())) - 2.0));
					result[1] = ((float) (valueToJava2D(tick.getValue(), dataArea, edge)));
				}else
					if (edge == (org.jfree.chart.util.RectangleEdge.RIGHT)) {
						result[0] = ((float) ((cursor + (insets.getRight())) + 2.0));
						result[1] = ((float) (valueToJava2D(tick.getValue(), dataArea, edge)));
					}
				
			
		
		return result;
	}

	protected org.jfree.chart.axis.AxisState drawTickMarksAndLabels(java.awt.Graphics2D g2, double cursor, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.axis.AxisState state = new org.jfree.chart.axis.AxisState(cursor);
		if (isAxisLineVisible()) {
			drawAxisLine(g2, cursor, dataArea, edge);
		}
		double ol = getTickMarkOutsideLength();
		double il = getTickMarkInsideLength();
		java.util.List ticks = refreshTicks(g2, state, dataArea, edge);
		state.setTicks(ticks);
		g2.setFont(getTickLabelFont());
		java.util.Iterator iterator = ticks.iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.axis.ValueTick tick = ((org.jfree.chart.axis.ValueTick) (iterator.next()));
			if (isTickLabelsVisible()) {
				g2.setPaint(getTickLabelPaint());
				float[] anchorPoint = calculateAnchorPoint(tick, cursor, dataArea, edge);
				org.jfree.chart.text.TextUtilities.drawRotatedString(tick.getText(), g2, anchorPoint[0], anchorPoint[1], tick.getTextAnchor(), tick.getAngle(), tick.getRotationAnchor());
			}
			if ((isTickMarksVisible()) && (tick.getTickType().equals(org.jfree.chart.axis.TickType.MAJOR))) {
				float xx = ((float) (valueToJava2D(tick.getValue(), dataArea, edge)));
				java.awt.geom.Line2D mark = null;
				g2.setStroke(getTickMarkStroke());
				g2.setPaint(getTickMarkPaint());
				if (edge == (org.jfree.chart.util.RectangleEdge.LEFT)) {
					mark = new java.awt.geom.Line2D.Double((cursor - ol), xx, (cursor + il), xx);
				}else
					if (edge == (org.jfree.chart.util.RectangleEdge.RIGHT)) {
						mark = new java.awt.geom.Line2D.Double((cursor + ol), xx, (cursor - il), xx);
					}else
						if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
							mark = new java.awt.geom.Line2D.Double(xx, (cursor - ol), xx, (cursor + il));
						}else
							if (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM)) {
								mark = new java.awt.geom.Line2D.Double(xx, (cursor + ol), xx, (cursor - il));
							}
						
					
				
				g2.draw(mark);
			}
		} 
		double used = 0.0;
		if (isTickLabelsVisible()) {
			if (edge == (org.jfree.chart.util.RectangleEdge.LEFT)) {
				used += findMaximumTickLabelWidth(ticks, g2, plotArea, isVerticalTickLabels());
				state.cursorLeft(used);
			}else
				if (edge == (org.jfree.chart.util.RectangleEdge.RIGHT)) {
					used = findMaximumTickLabelWidth(ticks, g2, plotArea, isVerticalTickLabels());
					state.cursorRight(used);
				}else
					if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
						used = findMaximumTickLabelHeight(ticks, g2, plotArea, isVerticalTickLabels());
						state.cursorUp(used);
					}else
						if (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM)) {
							used = findMaximumTickLabelHeight(ticks, g2, plotArea, isVerticalTickLabels());
							state.cursorDown(used);
						}
					
				
			
		}
		return state;
	}

	public org.jfree.chart.axis.AxisSpace reserveSpace(java.awt.Graphics2D g2, org.jfree.chart.plot.Plot plot, java.awt.geom.Rectangle2D plotArea, org.jfree.chart.util.RectangleEdge edge, org.jfree.chart.axis.AxisSpace space) {
		if (space == null) {
			space = new org.jfree.chart.axis.AxisSpace();
		}
		if (!(isVisible())) {
			return space;
		}
		double dimension = getFixedDimension();
		if (dimension > 0.0) {
			space.ensureAtLeast(dimension, edge);
		}
		double tickLabelHeight = 0.0;
		double tickLabelWidth = 0.0;
		if (isTickLabelsVisible()) {
			g2.setFont(getTickLabelFont());
			java.util.List ticks = refreshTicks(g2, new org.jfree.chart.axis.AxisState(), plotArea, edge);
			if (org.jfree.chart.util.RectangleEdge.isTopOrBottom(edge)) {
				tickLabelHeight = findMaximumTickLabelHeight(ticks, g2, plotArea, isVerticalTickLabels());
			}else
				if (org.jfree.chart.util.RectangleEdge.isLeftOrRight(edge)) {
					tickLabelWidth = findMaximumTickLabelWidth(ticks, g2, plotArea, isVerticalTickLabels());
				}
			
		}
		java.awt.geom.Rectangle2D labelEnclosure = getLabelEnclosure(g2, edge);
		double labelHeight = 0.0;
		double labelWidth = 0.0;
		if (org.jfree.chart.util.RectangleEdge.isTopOrBottom(edge)) {
			labelHeight = labelEnclosure.getHeight();
			space.add((labelHeight + tickLabelHeight), edge);
		}else
			if (org.jfree.chart.util.RectangleEdge.isLeftOrRight(edge)) {
				labelWidth = labelEnclosure.getWidth();
				space.add((labelWidth + tickLabelWidth), edge);
			}
		
		return space;
	}

	protected double findMaximumTickLabelHeight(java.util.List ticks, java.awt.Graphics2D g2, java.awt.geom.Rectangle2D drawArea, boolean vertical) {
		org.jfree.chart.util.RectangleInsets insets = getTickLabelInsets();
		java.awt.Font font = getTickLabelFont();
		double maxHeight = 0.0;
		if (vertical) {
			java.awt.FontMetrics fm = g2.getFontMetrics(font);
			java.util.Iterator iterator = ticks.iterator();
			while (iterator.hasNext()) {
				org.jfree.chart.axis.Tick tick = ((org.jfree.chart.axis.Tick) (iterator.next()));
				java.awt.geom.Rectangle2D labelBounds = org.jfree.chart.text.TextUtilities.getTextBounds(tick.getText(), g2, fm);
				if ((((labelBounds.getWidth()) + (insets.getTop())) + (insets.getBottom())) > maxHeight) {
					maxHeight = ((labelBounds.getWidth()) + (insets.getTop())) + (insets.getBottom());
				}
			} 
		}else {
			java.awt.font.LineMetrics metrics = font.getLineMetrics("ABCxyz", g2.getFontRenderContext());
			maxHeight = ((metrics.getHeight()) + (insets.getTop())) + (insets.getBottom());
		}
		return maxHeight;
	}

	protected double findMaximumTickLabelWidth(java.util.List ticks, java.awt.Graphics2D g2, java.awt.geom.Rectangle2D drawArea, boolean vertical) {
		org.jfree.chart.util.RectangleInsets insets = getTickLabelInsets();
		java.awt.Font font = getTickLabelFont();
		double maxWidth = 0.0;
		if (!vertical) {
			java.awt.FontMetrics fm = g2.getFontMetrics(font);
			java.util.Iterator iterator = ticks.iterator();
			while (iterator.hasNext()) {
				org.jfree.chart.axis.Tick tick = ((org.jfree.chart.axis.Tick) (iterator.next()));
				java.awt.geom.Rectangle2D labelBounds = org.jfree.chart.text.TextUtilities.getTextBounds(tick.getText(), g2, fm);
				if ((((labelBounds.getWidth()) + (insets.getLeft())) + (insets.getRight())) > maxWidth) {
					maxWidth = ((labelBounds.getWidth()) + (insets.getLeft())) + (insets.getRight());
				}
			} 
		}else {
			java.awt.font.LineMetrics metrics = font.getLineMetrics("ABCxyz", g2.getFontRenderContext());
			maxWidth = ((metrics.getHeight()) + (insets.getTop())) + (insets.getBottom());
		}
		return maxWidth;
	}

	public boolean isInverted() {
		return org.jfree.chart.axis.ValueAxis.this.inverted;
	}

	public void setInverted(boolean flag) {
		if ((org.jfree.chart.axis.ValueAxis.this.inverted) != flag) {
			org.jfree.chart.axis.ValueAxis.this.inverted = flag;
			notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.ValueAxis.this));
		}
	}

	public boolean isAutoRange() {
		return org.jfree.chart.axis.ValueAxis.this.autoRange;
	}

	public void setAutoRange(boolean auto) {
		setAutoRange(auto, true);
	}

	protected void setAutoRange(boolean auto, boolean notify) {
		if ((org.jfree.chart.axis.ValueAxis.this.autoRange) != auto) {
			org.jfree.chart.axis.ValueAxis.this.autoRange = auto;
			if (org.jfree.chart.axis.ValueAxis.this.autoRange) {
				autoAdjustRange();
			}
			if (notify) {
				notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.ValueAxis.this));
			}
		}
	}

	public double getAutoRangeMinimumSize() {
		return org.jfree.chart.axis.ValueAxis.this.autoRangeMinimumSize;
	}

	public void setAutoRangeMinimumSize(double size) {
		setAutoRangeMinimumSize(size, true);
	}

	public void setAutoRangeMinimumSize(double size, boolean notify) {
		if (size <= 0.0) {
			throw new java.lang.IllegalArgumentException("NumberAxis.setAutoRangeMinimumSize(double): must be > 0.0.");
		}
		if ((org.jfree.chart.axis.ValueAxis.this.autoRangeMinimumSize) != size) {
			org.jfree.chart.axis.ValueAxis.this.autoRangeMinimumSize = size;
			if (org.jfree.chart.axis.ValueAxis.this.autoRange) {
				autoAdjustRange();
			}
			if (notify) {
				notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.ValueAxis.this));
			}
		}
	}

	public org.jfree.data.Range getDefaultAutoRange() {
		return org.jfree.chart.axis.ValueAxis.this.defaultAutoRange;
	}

	public void setDefaultAutoRange(org.jfree.data.Range range) {
		if (range == null) {
			throw new java.lang.IllegalArgumentException("Null 'range' argument.");
		}
		org.jfree.chart.axis.ValueAxis.this.defaultAutoRange = range;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.ValueAxis.this));
	}

	public double getLowerMargin() {
		return org.jfree.chart.axis.ValueAxis.this.lowerMargin;
	}

	public void setLowerMargin(double margin) {
		org.jfree.chart.axis.ValueAxis.this.lowerMargin = margin;
		if (isAutoRange()) {
			autoAdjustRange();
		}
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.ValueAxis.this));
	}

	public double getUpperMargin() {
		return org.jfree.chart.axis.ValueAxis.this.upperMargin;
	}

	public void setUpperMargin(double margin) {
		org.jfree.chart.axis.ValueAxis.this.upperMargin = margin;
		if (isAutoRange()) {
			autoAdjustRange();
		}
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.ValueAxis.this));
	}

	public double getFixedAutoRange() {
		return org.jfree.chart.axis.ValueAxis.this.fixedAutoRange;
	}

	public void setFixedAutoRange(double length) {
		org.jfree.chart.axis.ValueAxis.this.fixedAutoRange = length;
		if (isAutoRange()) {
			autoAdjustRange();
		}
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.ValueAxis.this));
	}

	public double getLowerBound() {
		return org.jfree.chart.axis.ValueAxis.this.range.getLowerBound();
	}

	public void setLowerBound(double min) {
		if ((org.jfree.chart.axis.ValueAxis.this.range.getUpperBound()) > min) {
			setRange(new org.jfree.data.Range(min, org.jfree.chart.axis.ValueAxis.this.range.getUpperBound()));
		}else {
			setRange(new org.jfree.data.Range(min, (min + 1.0)));
		}
	}

	public double getUpperBound() {
		return org.jfree.chart.axis.ValueAxis.this.range.getUpperBound();
	}

	public void setUpperBound(double max) {
		if ((org.jfree.chart.axis.ValueAxis.this.range.getLowerBound()) < max) {
			setRange(new org.jfree.data.Range(org.jfree.chart.axis.ValueAxis.this.range.getLowerBound(), max));
		}else {
			setRange((max - 1.0), max);
		}
	}

	public org.jfree.data.Range getRange() {
		return org.jfree.chart.axis.ValueAxis.this.range;
	}

	public void setRange(org.jfree.data.Range range) {
		setRange(range, true, true);
	}

	public void setRange(org.jfree.data.Range range, boolean turnOffAutoRange, boolean notify) {
		if (range == null) {
			throw new java.lang.IllegalArgumentException("Null 'range' argument.");
		}
		if (turnOffAutoRange) {
			org.jfree.chart.axis.ValueAxis.this.autoRange = false;
		}
		org.jfree.chart.axis.ValueAxis.this.range = range;
		if (notify) {
			notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.ValueAxis.this));
		}
	}

	public void setRange(double lower, double upper) {
		setRange(new org.jfree.data.Range(lower, upper));
	}

	public void setRangeWithMargins(org.jfree.data.Range range) {
		setRangeWithMargins(range, true, true);
	}

	public void setRangeWithMargins(org.jfree.data.Range range, boolean turnOffAutoRange, boolean notify) {
		if (range == null) {
			throw new java.lang.IllegalArgumentException("Null 'range' argument.");
		}
		setRange(org.jfree.data.Range.expand(range, getLowerMargin(), getUpperMargin()), turnOffAutoRange, notify);
	}

	public void setRangeWithMargins(double lower, double upper) {
		setRangeWithMargins(new org.jfree.data.Range(lower, upper));
	}

	public void setRangeAboutValue(double value, double length) {
		setRange(new org.jfree.data.Range((value - (length / 2)), (value + (length / 2))));
	}

	public boolean isAutoTickUnitSelection() {
		return org.jfree.chart.axis.ValueAxis.this.autoTickUnitSelection;
	}

	public void setAutoTickUnitSelection(boolean flag) {
		setAutoTickUnitSelection(flag, true);
	}

	public void setAutoTickUnitSelection(boolean flag, boolean notify) {
		if ((org.jfree.chart.axis.ValueAxis.this.autoTickUnitSelection) != flag) {
			org.jfree.chart.axis.ValueAxis.this.autoTickUnitSelection = flag;
			if (notify) {
				notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.ValueAxis.this));
			}
		}
	}

	public org.jfree.chart.axis.TickUnitSource getStandardTickUnits() {
		return org.jfree.chart.axis.ValueAxis.this.standardTickUnits;
	}

	public void setStandardTickUnits(org.jfree.chart.axis.TickUnitSource source) {
		org.jfree.chart.axis.ValueAxis.this.standardTickUnits = source;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.ValueAxis.this));
	}

	public abstract double valueToJava2D(double value, java.awt.geom.Rectangle2D area, org.jfree.chart.util.RectangleEdge edge);

	public double lengthToJava2D(double length, java.awt.geom.Rectangle2D area, org.jfree.chart.util.RectangleEdge edge) {
		double zero = valueToJava2D(0.0, area, edge);
		double l = valueToJava2D(length, area, edge);
		return java.lang.Math.abs((l - zero));
	}

	public abstract double java2DToValue(double java2DValue, java.awt.geom.Rectangle2D area, org.jfree.chart.util.RectangleEdge edge);

	protected abstract void autoAdjustRange();

	public void centerRange(double value) {
		double central = org.jfree.chart.axis.ValueAxis.this.range.getCentralValue();
		org.jfree.data.Range adjusted = new org.jfree.data.Range((((org.jfree.chart.axis.ValueAxis.this.range.getLowerBound()) + value) - central), (((org.jfree.chart.axis.ValueAxis.this.range.getUpperBound()) + value) - central));
		setRange(adjusted);
	}

	public void resizeRange(double percent) {
		resizeRange(percent, org.jfree.chart.axis.ValueAxis.this.range.getCentralValue());
	}

	public void resizeRange(double percent, double anchorValue) {
		if (percent > 0.0) {
			double halfLength = ((org.jfree.chart.axis.ValueAxis.this.range.getLength()) * percent) / 2;
			org.jfree.data.Range adjusted = new org.jfree.data.Range((anchorValue - halfLength), (anchorValue + halfLength));
			setRange(adjusted);
		}else {
			setAutoRange(true);
		}
	}

	public void zoomRange(double lowerPercent, double upperPercent) {
		double start = org.jfree.chart.axis.ValueAxis.this.range.getLowerBound();
		double length = org.jfree.chart.axis.ValueAxis.this.range.getLength();
		org.jfree.data.Range adjusted = null;
		if (isInverted()) {
			adjusted = new org.jfree.data.Range((start + (length * (1 - upperPercent))), (start + (length * (1 - lowerPercent))));
		}else {
			adjusted = new org.jfree.data.Range((start + (length * lowerPercent)), (start + (length * upperPercent)));
		}
		setRange(adjusted);
	}

	protected int getAutoTickIndex() {
		return org.jfree.chart.axis.ValueAxis.this.autoTickIndex;
	}

	protected void setAutoTickIndex(int index) {
		org.jfree.chart.axis.ValueAxis.this.autoTickIndex = index;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.axis.ValueAxis.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.axis.ValueAxis)) {
			return false;
		}
		org.jfree.chart.axis.ValueAxis that = ((org.jfree.chart.axis.ValueAxis) (obj));
		if ((org.jfree.chart.axis.ValueAxis.this.positiveArrowVisible) != (that.positiveArrowVisible)) {
			return false;
		}
		if ((org.jfree.chart.axis.ValueAxis.this.negativeArrowVisible) != (that.negativeArrowVisible)) {
			return false;
		}
		if ((org.jfree.chart.axis.ValueAxis.this.inverted) != (that.inverted)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.axis.ValueAxis.this.range, that.range))) {
			return false;
		}
		if ((org.jfree.chart.axis.ValueAxis.this.autoRange) != (that.autoRange)) {
			return false;
		}
		if ((org.jfree.chart.axis.ValueAxis.this.autoRangeMinimumSize) != (that.autoRangeMinimumSize)) {
			return false;
		}
		if (!(org.jfree.chart.axis.ValueAxis.this.defaultAutoRange.equals(that.defaultAutoRange))) {
			return false;
		}
		if ((org.jfree.chart.axis.ValueAxis.this.upperMargin) != (that.upperMargin)) {
			return false;
		}
		if ((org.jfree.chart.axis.ValueAxis.this.lowerMargin) != (that.lowerMargin)) {
			return false;
		}
		if ((org.jfree.chart.axis.ValueAxis.this.fixedAutoRange) != (that.fixedAutoRange)) {
			return false;
		}
		if ((org.jfree.chart.axis.ValueAxis.this.autoTickUnitSelection) != (that.autoTickUnitSelection)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.axis.ValueAxis.this.standardTickUnits, that.standardTickUnits))) {
			return false;
		}
		if ((org.jfree.chart.axis.ValueAxis.this.verticalTickLabels) != (that.verticalTickLabels)) {
			return false;
		}
		return super.equals(obj);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.axis.ValueAxis clone = ((org.jfree.chart.axis.ValueAxis) (super.clone()));
		return clone;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writeShape(org.jfree.chart.axis.ValueAxis.this.upArrow, stream);
		org.jfree.chart.util.SerialUtilities.writeShape(org.jfree.chart.axis.ValueAxis.this.downArrow, stream);
		org.jfree.chart.util.SerialUtilities.writeShape(org.jfree.chart.axis.ValueAxis.this.leftArrow, stream);
		org.jfree.chart.util.SerialUtilities.writeShape(org.jfree.chart.axis.ValueAxis.this.rightArrow, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.axis.ValueAxis.this.upArrow = org.jfree.chart.util.SerialUtilities.readShape(stream);
		org.jfree.chart.axis.ValueAxis.this.downArrow = org.jfree.chart.util.SerialUtilities.readShape(stream);
		org.jfree.chart.axis.ValueAxis.this.leftArrow = org.jfree.chart.util.SerialUtilities.readShape(stream);
		org.jfree.chart.axis.ValueAxis.this.rightArrow = org.jfree.chart.util.SerialUtilities.readShape(stream);
	}
}

