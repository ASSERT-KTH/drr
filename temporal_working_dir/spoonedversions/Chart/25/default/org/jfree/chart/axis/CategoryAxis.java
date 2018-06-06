

package org.jfree.chart.axis;


public class CategoryAxis extends org.jfree.chart.axis.Axis implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = 5886554608114265863L;

	public static final double DEFAULT_AXIS_MARGIN = 0.05;

	public static final double DEFAULT_CATEGORY_MARGIN = 0.2;

	private double lowerMargin;

	private double upperMargin;

	private double categoryMargin;

	private int maximumCategoryLabelLines;

	private float maximumCategoryLabelWidthRatio;

	private int categoryLabelPositionOffset;

	private org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions;

	private java.util.Map tickLabelFontMap;

	private transient java.util.Map tickLabelPaintMap;

	private java.util.Map categoryLabelToolTips;

	public CategoryAxis() {
		this(null);
	}

	public CategoryAxis(java.lang.String label) {
		super(label);
		org.jfree.chart.axis.CategoryAxis.this.lowerMargin = org.jfree.chart.axis.CategoryAxis.DEFAULT_AXIS_MARGIN;
		org.jfree.chart.axis.CategoryAxis.this.upperMargin = org.jfree.chart.axis.CategoryAxis.DEFAULT_AXIS_MARGIN;
		org.jfree.chart.axis.CategoryAxis.this.categoryMargin = org.jfree.chart.axis.CategoryAxis.DEFAULT_CATEGORY_MARGIN;
		org.jfree.chart.axis.CategoryAxis.this.maximumCategoryLabelLines = 1;
		org.jfree.chart.axis.CategoryAxis.this.maximumCategoryLabelWidthRatio = 0.0F;
		setTickMarksVisible(false);
		org.jfree.chart.axis.CategoryAxis.this.categoryLabelPositionOffset = 4;
		org.jfree.chart.axis.CategoryAxis.this.categoryLabelPositions = org.jfree.chart.axis.CategoryLabelPositions.STANDARD;
		org.jfree.chart.axis.CategoryAxis.this.tickLabelFontMap = new java.util.HashMap();
		org.jfree.chart.axis.CategoryAxis.this.tickLabelPaintMap = new java.util.HashMap();
		org.jfree.chart.axis.CategoryAxis.this.categoryLabelToolTips = new java.util.HashMap();
	}

	public double getLowerMargin() {
		return org.jfree.chart.axis.CategoryAxis.this.lowerMargin;
	}

	public void setLowerMargin(double margin) {
		org.jfree.chart.axis.CategoryAxis.this.lowerMargin = margin;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.CategoryAxis.this));
	}

	public double getUpperMargin() {
		return org.jfree.chart.axis.CategoryAxis.this.upperMargin;
	}

	public void setUpperMargin(double margin) {
		org.jfree.chart.axis.CategoryAxis.this.upperMargin = margin;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.CategoryAxis.this));
	}

	public double getCategoryMargin() {
		return org.jfree.chart.axis.CategoryAxis.this.categoryMargin;
	}

	public void setCategoryMargin(double margin) {
		org.jfree.chart.axis.CategoryAxis.this.categoryMargin = margin;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.CategoryAxis.this));
	}

	public int getMaximumCategoryLabelLines() {
		return org.jfree.chart.axis.CategoryAxis.this.maximumCategoryLabelLines;
	}

	public void setMaximumCategoryLabelLines(int lines) {
		org.jfree.chart.axis.CategoryAxis.this.maximumCategoryLabelLines = lines;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.CategoryAxis.this));
	}

	public float getMaximumCategoryLabelWidthRatio() {
		return org.jfree.chart.axis.CategoryAxis.this.maximumCategoryLabelWidthRatio;
	}

	public void setMaximumCategoryLabelWidthRatio(float ratio) {
		org.jfree.chart.axis.CategoryAxis.this.maximumCategoryLabelWidthRatio = ratio;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.CategoryAxis.this));
	}

	public int getCategoryLabelPositionOffset() {
		return org.jfree.chart.axis.CategoryAxis.this.categoryLabelPositionOffset;
	}

	public void setCategoryLabelPositionOffset(int offset) {
		org.jfree.chart.axis.CategoryAxis.this.categoryLabelPositionOffset = offset;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.CategoryAxis.this));
	}

	public org.jfree.chart.axis.CategoryLabelPositions getCategoryLabelPositions() {
		return org.jfree.chart.axis.CategoryAxis.this.categoryLabelPositions;
	}

	public void setCategoryLabelPositions(org.jfree.chart.axis.CategoryLabelPositions positions) {
		if (positions == null) {
			throw new java.lang.IllegalArgumentException("Null 'positions' argument.");
		}
		org.jfree.chart.axis.CategoryAxis.this.categoryLabelPositions = positions;
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.CategoryAxis.this));
	}

	public java.awt.Font getTickLabelFont(java.lang.Comparable category) {
		if (category == null) {
			throw new java.lang.IllegalArgumentException("Null 'category' argument.");
		}
		java.awt.Font result = ((java.awt.Font) (org.jfree.chart.axis.CategoryAxis.this.tickLabelFontMap.get(category)));
		if (result == null) {
			result = getTickLabelFont();
		}
		return result;
	}

	public void setTickLabelFont(java.lang.Comparable category, java.awt.Font font) {
		if (category == null) {
			throw new java.lang.IllegalArgumentException("Null 'category' argument.");
		}
		if (font == null) {
			org.jfree.chart.axis.CategoryAxis.this.tickLabelFontMap.remove(category);
		}else {
			org.jfree.chart.axis.CategoryAxis.this.tickLabelFontMap.put(category, font);
		}
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.CategoryAxis.this));
	}

	public java.awt.Paint getTickLabelPaint(java.lang.Comparable category) {
		if (category == null) {
			throw new java.lang.IllegalArgumentException("Null 'category' argument.");
		}
		java.awt.Paint result = ((java.awt.Paint) (org.jfree.chart.axis.CategoryAxis.this.tickLabelPaintMap.get(category)));
		if (result == null) {
			result = getTickLabelPaint();
		}
		return result;
	}

	public void setTickLabelPaint(java.lang.Comparable category, java.awt.Paint paint) {
		if (category == null) {
			throw new java.lang.IllegalArgumentException("Null 'category' argument.");
		}
		if (paint == null) {
			org.jfree.chart.axis.CategoryAxis.this.tickLabelPaintMap.remove(category);
		}else {
			org.jfree.chart.axis.CategoryAxis.this.tickLabelPaintMap.put(category, paint);
		}
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.CategoryAxis.this));
	}

	public void addCategoryLabelToolTip(java.lang.Comparable category, java.lang.String tooltip) {
		if (category == null) {
			throw new java.lang.IllegalArgumentException("Null 'category' argument.");
		}
		org.jfree.chart.axis.CategoryAxis.this.categoryLabelToolTips.put(category, tooltip);
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.CategoryAxis.this));
	}

	public java.lang.String getCategoryLabelToolTip(java.lang.Comparable category) {
		if (category == null) {
			throw new java.lang.IllegalArgumentException("Null 'category' argument.");
		}
		return ((java.lang.String) (org.jfree.chart.axis.CategoryAxis.this.categoryLabelToolTips.get(category)));
	}

	public void removeCategoryLabelToolTip(java.lang.Comparable category) {
		if (category == null) {
			throw new java.lang.IllegalArgumentException("Null 'category' argument.");
		}
		org.jfree.chart.axis.CategoryAxis.this.categoryLabelToolTips.remove(category);
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.CategoryAxis.this));
	}

	public void clearCategoryLabelToolTips() {
		org.jfree.chart.axis.CategoryAxis.this.categoryLabelToolTips.clear();
		notifyListeners(new org.jfree.chart.event.AxisChangeEvent(org.jfree.chart.axis.CategoryAxis.this));
	}

	public double getCategoryJava2DCoordinate(org.jfree.chart.axis.CategoryAnchor anchor, int category, int categoryCount, java.awt.geom.Rectangle2D area, org.jfree.chart.util.RectangleEdge edge) {
		double result = 0.0;
		if (anchor == (org.jfree.chart.axis.CategoryAnchor.START)) {
			result = getCategoryStart(category, categoryCount, area, edge);
		}else
			if (anchor == (org.jfree.chart.axis.CategoryAnchor.MIDDLE)) {
				result = getCategoryMiddle(category, categoryCount, area, edge);
			}else
				if (anchor == (org.jfree.chart.axis.CategoryAnchor.END)) {
					result = getCategoryEnd(category, categoryCount, area, edge);
				}
			
		
		return result;
	}

	public double getCategoryStart(int category, int categoryCount, java.awt.geom.Rectangle2D area, org.jfree.chart.util.RectangleEdge edge) {
		double result = 0.0;
		if ((edge == (org.jfree.chart.util.RectangleEdge.TOP)) || (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM))) {
			result = (area.getX()) + ((area.getWidth()) * (getLowerMargin()));
		}else
			if ((edge == (org.jfree.chart.util.RectangleEdge.LEFT)) || (edge == (org.jfree.chart.util.RectangleEdge.RIGHT))) {
				result = (area.getMinY()) + ((area.getHeight()) * (getLowerMargin()));
			}
		
		double categorySize = calculateCategorySize(categoryCount, area, edge);
		double categoryGapWidth = calculateCategoryGapSize(categoryCount, area, edge);
		result = result + (category * (categorySize + categoryGapWidth));
		return result;
	}

	public double getCategoryMiddle(int category, int categoryCount, java.awt.geom.Rectangle2D area, org.jfree.chart.util.RectangleEdge edge) {
		return (getCategoryStart(category, categoryCount, area, edge)) + ((calculateCategorySize(categoryCount, area, edge)) / 2);
	}

	public double getCategoryEnd(int category, int categoryCount, java.awt.geom.Rectangle2D area, org.jfree.chart.util.RectangleEdge edge) {
		return (getCategoryStart(category, categoryCount, area, edge)) + (calculateCategorySize(categoryCount, area, edge));
	}

	protected double calculateCategorySize(int categoryCount, java.awt.geom.Rectangle2D area, org.jfree.chart.util.RectangleEdge edge) {
		double result = 0.0;
		double available = 0.0;
		if ((edge == (org.jfree.chart.util.RectangleEdge.TOP)) || (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM))) {
			available = area.getWidth();
		}else
			if ((edge == (org.jfree.chart.util.RectangleEdge.LEFT)) || (edge == (org.jfree.chart.util.RectangleEdge.RIGHT))) {
				available = area.getHeight();
			}
		
		if (categoryCount > 1) {
			result = available * (((1 - (getLowerMargin())) - (getUpperMargin())) - (getCategoryMargin()));
			result = result / categoryCount;
		}else {
			result = available * ((1 - (getLowerMargin())) - (getUpperMargin()));
		}
		return result;
	}

	protected double calculateCategoryGapSize(int categoryCount, java.awt.geom.Rectangle2D area, org.jfree.chart.util.RectangleEdge edge) {
		double result = 0.0;
		double available = 0.0;
		if ((edge == (org.jfree.chart.util.RectangleEdge.TOP)) || (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM))) {
			available = area.getWidth();
		}else
			if ((edge == (org.jfree.chart.util.RectangleEdge.LEFT)) || (edge == (org.jfree.chart.util.RectangleEdge.RIGHT))) {
				available = area.getHeight();
			}
		
		if (categoryCount > 1) {
			result = (available * (getCategoryMargin())) / (categoryCount - 1);
		}
		return result;
	}

	public org.jfree.chart.axis.AxisSpace reserveSpace(java.awt.Graphics2D g2, org.jfree.chart.plot.Plot plot, java.awt.geom.Rectangle2D plotArea, org.jfree.chart.util.RectangleEdge edge, org.jfree.chart.axis.AxisSpace space) {
		if (space == null) {
			space = new org.jfree.chart.axis.AxisSpace();
		}
		if (!(isVisible())) {
			return space;
		}
		double tickLabelHeight = 0.0;
		double tickLabelWidth = 0.0;
		if (isTickLabelsVisible()) {
			g2.setFont(getTickLabelFont());
			org.jfree.chart.axis.AxisState state = new org.jfree.chart.axis.AxisState();
			refreshTicks(g2, state, plotArea, edge);
			if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
				tickLabelHeight = state.getMax();
			}else
				if (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM)) {
					tickLabelHeight = state.getMax();
				}else
					if (edge == (org.jfree.chart.util.RectangleEdge.LEFT)) {
						tickLabelWidth = state.getMax();
					}else
						if (edge == (org.jfree.chart.util.RectangleEdge.RIGHT)) {
							tickLabelWidth = state.getMax();
						}
					
				
			
		}
		java.awt.geom.Rectangle2D labelEnclosure = getLabelEnclosure(g2, edge);
		double labelHeight = 0.0;
		double labelWidth = 0.0;
		if (org.jfree.chart.util.RectangleEdge.isTopOrBottom(edge)) {
			labelHeight = labelEnclosure.getHeight();
			space.add(((labelHeight + tickLabelHeight) + (org.jfree.chart.axis.CategoryAxis.this.categoryLabelPositionOffset)), edge);
		}else
			if (org.jfree.chart.util.RectangleEdge.isLeftOrRight(edge)) {
				labelWidth = labelEnclosure.getWidth();
				space.add(((labelWidth + tickLabelWidth) + (org.jfree.chart.axis.CategoryAxis.this.categoryLabelPositionOffset)), edge);
			}
		
		return space;
	}

	public void configure() {
	}

	public org.jfree.chart.axis.AxisState draw(java.awt.Graphics2D g2, double cursor, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge, org.jfree.chart.plot.PlotRenderingInfo plotState) {
		if (!(isVisible())) {
			return new org.jfree.chart.axis.AxisState(cursor);
		}
		if (isAxisLineVisible()) {
			drawAxisLine(g2, cursor, dataArea, edge);
		}
		org.jfree.chart.axis.AxisState state = new org.jfree.chart.axis.AxisState(cursor);
		state = drawCategoryLabels(g2, plotArea, dataArea, edge, state, plotState);
		state = drawLabel(getLabel(), g2, plotArea, dataArea, edge, state, plotState);
		return state;
	}

	protected org.jfree.chart.axis.AxisState drawCategoryLabels(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge, org.jfree.chart.axis.AxisState state, org.jfree.chart.plot.PlotRenderingInfo plotState) {
		if (state == null) {
			throw new java.lang.IllegalArgumentException("Null 'state' argument.");
		}
		if (isTickLabelsVisible()) {
			java.util.List ticks = refreshTicks(g2, state, plotArea, edge);
			state.setTicks(ticks);
			int categoryIndex = 0;
			java.util.Iterator iterator = ticks.iterator();
			while (iterator.hasNext()) {
				org.jfree.chart.axis.CategoryTick tick = ((org.jfree.chart.axis.CategoryTick) (iterator.next()));
				g2.setFont(getTickLabelFont(tick.getCategory()));
				g2.setPaint(getTickLabelPaint(tick.getCategory()));
				org.jfree.chart.axis.CategoryLabelPosition position = org.jfree.chart.axis.CategoryAxis.this.categoryLabelPositions.getLabelPosition(edge);
				double x0 = 0.0;
				double x1 = 0.0;
				double y0 = 0.0;
				double y1 = 0.0;
				if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
					x0 = getCategoryStart(categoryIndex, ticks.size(), dataArea, edge);
					x1 = getCategoryEnd(categoryIndex, ticks.size(), dataArea, edge);
					y1 = (state.getCursor()) - (org.jfree.chart.axis.CategoryAxis.this.categoryLabelPositionOffset);
					y0 = y1 - (state.getMax());
				}else
					if (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM)) {
						x0 = getCategoryStart(categoryIndex, ticks.size(), dataArea, edge);
						x1 = getCategoryEnd(categoryIndex, ticks.size(), dataArea, edge);
						y0 = (state.getCursor()) + (org.jfree.chart.axis.CategoryAxis.this.categoryLabelPositionOffset);
						y1 = y0 + (state.getMax());
					}else
						if (edge == (org.jfree.chart.util.RectangleEdge.LEFT)) {
							y0 = getCategoryStart(categoryIndex, ticks.size(), dataArea, edge);
							y1 = getCategoryEnd(categoryIndex, ticks.size(), dataArea, edge);
							x1 = (state.getCursor()) - (org.jfree.chart.axis.CategoryAxis.this.categoryLabelPositionOffset);
							x0 = x1 - (state.getMax());
						}else
							if (edge == (org.jfree.chart.util.RectangleEdge.RIGHT)) {
								y0 = getCategoryStart(categoryIndex, ticks.size(), dataArea, edge);
								y1 = getCategoryEnd(categoryIndex, ticks.size(), dataArea, edge);
								x0 = (state.getCursor()) + (org.jfree.chart.axis.CategoryAxis.this.categoryLabelPositionOffset);
								x1 = x0 - (state.getMax());
							}
						
					
				
				java.awt.geom.Rectangle2D area = new java.awt.geom.Rectangle2D.Double(x0, y0, (x1 - x0), (y1 - y0));
				java.awt.geom.Point2D anchorPoint = org.jfree.chart.util.RectangleAnchor.coordinates(area, position.getCategoryAnchor());
				org.jfree.chart.text.TextBlock block = tick.getLabel();
				block.draw(g2, ((float) (anchorPoint.getX())), ((float) (anchorPoint.getY())), position.getLabelAnchor(), ((float) (anchorPoint.getX())), ((float) (anchorPoint.getY())), position.getAngle());
				java.awt.Shape bounds = block.calculateBounds(g2, ((float) (anchorPoint.getX())), ((float) (anchorPoint.getY())), position.getLabelAnchor(), ((float) (anchorPoint.getX())), ((float) (anchorPoint.getY())), position.getAngle());
				if ((plotState != null) && ((plotState.getOwner()) != null)) {
					org.jfree.chart.entity.EntityCollection entities = plotState.getOwner().getEntityCollection();
					if (entities != null) {
						java.lang.String tooltip = getCategoryLabelToolTip(tick.getCategory());
						entities.add(new org.jfree.chart.entity.CategoryLabelEntity(tick.getCategory(), bounds, tooltip, null));
					}
				}
				categoryIndex++;
			} 
			if (edge.equals(org.jfree.chart.util.RectangleEdge.TOP)) {
				double h = (state.getMax()) + (org.jfree.chart.axis.CategoryAxis.this.categoryLabelPositionOffset);
				state.cursorUp(h);
			}else
				if (edge.equals(org.jfree.chart.util.RectangleEdge.BOTTOM)) {
					double h = (state.getMax()) + (org.jfree.chart.axis.CategoryAxis.this.categoryLabelPositionOffset);
					state.cursorDown(h);
				}else
					if (edge == (org.jfree.chart.util.RectangleEdge.LEFT)) {
						double w = (state.getMax()) + (org.jfree.chart.axis.CategoryAxis.this.categoryLabelPositionOffset);
						state.cursorLeft(w);
					}else
						if (edge == (org.jfree.chart.util.RectangleEdge.RIGHT)) {
							double w = (state.getMax()) + (org.jfree.chart.axis.CategoryAxis.this.categoryLabelPositionOffset);
							state.cursorRight(w);
						}
					
				
			
		}
		return state;
	}

	public java.util.List refreshTicks(java.awt.Graphics2D g2, org.jfree.chart.axis.AxisState state, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge) {
		java.util.List ticks = new java.util.ArrayList();
		if (((dataArea.getHeight()) <= 0.0) || ((dataArea.getWidth()) < 0.0)) {
			return ticks;
		}
		org.jfree.chart.plot.CategoryPlot plot = ((org.jfree.chart.plot.CategoryPlot) (getPlot()));
		java.util.List categories = plot.getCategoriesForAxis(org.jfree.chart.axis.CategoryAxis.this);
		double max = 0.0;
		if (categories != null) {
			org.jfree.chart.axis.CategoryLabelPosition position = org.jfree.chart.axis.CategoryAxis.this.categoryLabelPositions.getLabelPosition(edge);
			float r = org.jfree.chart.axis.CategoryAxis.this.maximumCategoryLabelWidthRatio;
			if (r <= 0.0) {
				r = position.getWidthRatio();
			}
			float l = 0.0F;
			if ((position.getWidthType()) == (org.jfree.chart.axis.CategoryLabelWidthType.CATEGORY)) {
				l = ((float) (calculateCategorySize(categories.size(), dataArea, edge)));
			}else {
				if (org.jfree.chart.util.RectangleEdge.isLeftOrRight(edge)) {
					l = ((float) (dataArea.getWidth()));
				}else {
					l = ((float) (dataArea.getHeight()));
				}
			}
			int categoryIndex = 0;
			java.util.Iterator iterator = categories.iterator();
			while (iterator.hasNext()) {
				java.lang.Comparable category = ((java.lang.Comparable) (iterator.next()));
				org.jfree.chart.text.TextBlock label = createLabel(category, (l * r), edge, g2);
				if ((edge == (org.jfree.chart.util.RectangleEdge.TOP)) || (edge == (org.jfree.chart.util.RectangleEdge.BOTTOM))) {
					max = java.lang.Math.max(max, calculateTextBlockHeight(label, position, g2));
				}else
					if ((edge == (org.jfree.chart.util.RectangleEdge.LEFT)) || (edge == (org.jfree.chart.util.RectangleEdge.RIGHT))) {
						max = java.lang.Math.max(max, calculateTextBlockWidth(label, position, g2));
					}
				
				org.jfree.chart.axis.Tick tick = new org.jfree.chart.axis.CategoryTick(category, label, position.getLabelAnchor(), position.getRotationAnchor(), position.getAngle());
				ticks.add(tick);
				categoryIndex = categoryIndex + 1;
			} 
		}
		state.setMax(max);
		return ticks;
	}

	protected org.jfree.chart.text.TextBlock createLabel(java.lang.Comparable category, float width, org.jfree.chart.util.RectangleEdge edge, java.awt.Graphics2D g2) {
		org.jfree.chart.text.TextBlock label = org.jfree.chart.text.TextUtilities.createTextBlock(category.toString(), getTickLabelFont(category), getTickLabelPaint(category), width, org.jfree.chart.axis.CategoryAxis.this.maximumCategoryLabelLines, new org.jfree.chart.text.G2TextMeasurer(g2));
		return label;
	}

	protected double calculateTextBlockWidth(org.jfree.chart.text.TextBlock block, org.jfree.chart.axis.CategoryLabelPosition position, java.awt.Graphics2D g2) {
		org.jfree.chart.util.RectangleInsets insets = getTickLabelInsets();
		org.jfree.chart.util.Size2D size = block.calculateDimensions(g2);
		java.awt.geom.Rectangle2D box = new java.awt.geom.Rectangle2D.Double(0.0, 0.0, size.getWidth(), size.getHeight());
		java.awt.Shape rotatedBox = org.jfree.chart.util.ShapeUtilities.rotateShape(box, position.getAngle(), 0.0F, 0.0F);
		double w = ((rotatedBox.getBounds2D().getWidth()) + (insets.getTop())) + (insets.getBottom());
		return w;
	}

	protected double calculateTextBlockHeight(org.jfree.chart.text.TextBlock block, org.jfree.chart.axis.CategoryLabelPosition position, java.awt.Graphics2D g2) {
		org.jfree.chart.util.RectangleInsets insets = getTickLabelInsets();
		org.jfree.chart.util.Size2D size = block.calculateDimensions(g2);
		java.awt.geom.Rectangle2D box = new java.awt.geom.Rectangle2D.Double(0.0, 0.0, size.getWidth(), size.getHeight());
		java.awt.Shape rotatedBox = org.jfree.chart.util.ShapeUtilities.rotateShape(box, position.getAngle(), 0.0F, 0.0F);
		double h = ((rotatedBox.getBounds2D().getHeight()) + (insets.getTop())) + (insets.getBottom());
		return h;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.axis.CategoryAxis clone = ((org.jfree.chart.axis.CategoryAxis) (super.clone()));
		clone.tickLabelFontMap = new java.util.HashMap(org.jfree.chart.axis.CategoryAxis.this.tickLabelFontMap);
		clone.tickLabelPaintMap = new java.util.HashMap(org.jfree.chart.axis.CategoryAxis.this.tickLabelPaintMap);
		clone.categoryLabelToolTips = new java.util.HashMap(org.jfree.chart.axis.CategoryAxis.this.categoryLabelToolTips);
		return clone;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.axis.CategoryAxis.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.axis.CategoryAxis)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.chart.axis.CategoryAxis that = ((org.jfree.chart.axis.CategoryAxis) (obj));
		if ((that.lowerMargin) != (org.jfree.chart.axis.CategoryAxis.this.lowerMargin)) {
			return false;
		}
		if ((that.upperMargin) != (org.jfree.chart.axis.CategoryAxis.this.upperMargin)) {
			return false;
		}
		if ((that.categoryMargin) != (org.jfree.chart.axis.CategoryAxis.this.categoryMargin)) {
			return false;
		}
		if ((that.maximumCategoryLabelWidthRatio) != (org.jfree.chart.axis.CategoryAxis.this.maximumCategoryLabelWidthRatio)) {
			return false;
		}
		if ((that.categoryLabelPositionOffset) != (org.jfree.chart.axis.CategoryAxis.this.categoryLabelPositionOffset)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(that.categoryLabelPositions, org.jfree.chart.axis.CategoryAxis.this.categoryLabelPositions))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(that.categoryLabelToolTips, org.jfree.chart.axis.CategoryAxis.this.categoryLabelToolTips))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.axis.CategoryAxis.this.tickLabelFontMap, that.tickLabelFontMap))) {
			return false;
		}
		if (!(equalPaintMaps(org.jfree.chart.axis.CategoryAxis.this.tickLabelPaintMap, that.tickLabelPaintMap))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		if ((getLabel()) != null) {
			return getLabel().hashCode();
		}else {
			return 0;
		}
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		writePaintMap(org.jfree.chart.axis.CategoryAxis.this.tickLabelPaintMap, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.axis.CategoryAxis.this.tickLabelPaintMap = readPaintMap(stream);
	}

	private java.util.Map readPaintMap(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
		boolean isNull = in.readBoolean();
		if (isNull) {
			return null;
		}
		java.util.Map result = new java.util.HashMap();
		int count = in.readInt();
		for (int i = 0; i < count; i++) {
			java.lang.Comparable category = ((java.lang.Comparable) (in.readObject()));
			java.awt.Paint paint = org.jfree.chart.util.SerialUtilities.readPaint(in);
			result.put(category, paint);
		}
		return result;
	}

	private void writePaintMap(java.util.Map map, java.io.ObjectOutputStream out) throws java.io.IOException {
		if (map == null) {
			out.writeBoolean(true);
		}else {
			out.writeBoolean(false);
			java.util.Set keys = map.keySet();
			int count = keys.size();
			out.writeInt(count);
			java.util.Iterator iterator = keys.iterator();
			while (iterator.hasNext()) {
				java.lang.Comparable key = ((java.lang.Comparable) (iterator.next()));
				out.writeObject(key);
				org.jfree.chart.util.SerialUtilities.writePaint(((java.awt.Paint) (map.get(key))), out);
			} 
		}
	}

	private boolean equalPaintMaps(java.util.Map map1, java.util.Map map2) {
		if ((map1.size()) != (map2.size())) {
			return false;
		}
		java.util.Set keys = map1.keySet();
		java.util.Iterator iterator = keys.iterator();
		while (iterator.hasNext()) {
			java.lang.Comparable key = ((java.lang.Comparable) (iterator.next()));
			java.awt.Paint p1 = ((java.awt.Paint) (map1.get(key)));
			java.awt.Paint p2 = ((java.awt.Paint) (map2.get(key)));
			if (!(org.jfree.chart.util.PaintUtilities.equal(p1, p2))) {
				return false;
			}
		} 
		return true;
	}
}

