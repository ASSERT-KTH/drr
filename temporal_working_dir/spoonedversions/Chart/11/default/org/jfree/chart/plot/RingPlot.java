

package org.jfree.chart.plot;


public class RingPlot extends org.jfree.chart.plot.PiePlot implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = 1556064784129676620L;

	private boolean separatorsVisible;

	private transient java.awt.Stroke separatorStroke;

	private transient java.awt.Paint separatorPaint;

	private double innerSeparatorExtension;

	private double outerSeparatorExtension;

	private double sectionDepth;

	public RingPlot() {
		this(null);
	}

	public RingPlot(org.jfree.data.general.PieDataset dataset) {
		super(dataset);
		org.jfree.chart.plot.RingPlot.this.separatorsVisible = true;
		org.jfree.chart.plot.RingPlot.this.separatorStroke = new java.awt.BasicStroke(0.5F);
		org.jfree.chart.plot.RingPlot.this.separatorPaint = java.awt.Color.gray;
		org.jfree.chart.plot.RingPlot.this.innerSeparatorExtension = 0.2;
		org.jfree.chart.plot.RingPlot.this.outerSeparatorExtension = 0.2;
		org.jfree.chart.plot.RingPlot.this.sectionDepth = 0.2;
	}

	public boolean getSeparatorsVisible() {
		return org.jfree.chart.plot.RingPlot.this.separatorsVisible;
	}

	public void setSeparatorsVisible(boolean visible) {
		org.jfree.chart.plot.RingPlot.this.separatorsVisible = visible;
		fireChangeEvent();
	}

	public java.awt.Stroke getSeparatorStroke() {
		return org.jfree.chart.plot.RingPlot.this.separatorStroke;
	}

	public void setSeparatorStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.plot.RingPlot.this.separatorStroke = stroke;
		fireChangeEvent();
	}

	public java.awt.Paint getSeparatorPaint() {
		return org.jfree.chart.plot.RingPlot.this.separatorPaint;
	}

	public void setSeparatorPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.RingPlot.this.separatorPaint = paint;
		fireChangeEvent();
	}

	public double getInnerSeparatorExtension() {
		return org.jfree.chart.plot.RingPlot.this.innerSeparatorExtension;
	}

	public void setInnerSeparatorExtension(double percent) {
		org.jfree.chart.plot.RingPlot.this.innerSeparatorExtension = percent;
		fireChangeEvent();
	}

	public double getOuterSeparatorExtension() {
		return org.jfree.chart.plot.RingPlot.this.outerSeparatorExtension;
	}

	public void setOuterSeparatorExtension(double percent) {
		org.jfree.chart.plot.RingPlot.this.outerSeparatorExtension = percent;
		fireChangeEvent();
	}

	public double getSectionDepth() {
		return org.jfree.chart.plot.RingPlot.this.sectionDepth;
	}

	public void setSectionDepth(double sectionDepth) {
		org.jfree.chart.plot.RingPlot.this.sectionDepth = sectionDepth;
		fireChangeEvent();
	}

	public org.jfree.chart.plot.PiePlotState initialise(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, org.jfree.chart.plot.PiePlot plot, java.lang.Integer index, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.plot.PiePlotState state = super.initialise(g2, plotArea, plot, index, info);
		state.setPassesRequired(3);
		return state;
	}

	protected void drawItem(java.awt.Graphics2D g2, int section, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PiePlotState state, int currentPass) {
		org.jfree.data.general.PieDataset dataset = getDataset();
		java.lang.Number n = dataset.getValue(section);
		if (n == null) {
			return ;
		}
		double value = n.doubleValue();
		double angle1 = 0.0;
		double angle2 = 0.0;
		org.jfree.chart.util.Rotation direction = getDirection();
		if (direction == (org.jfree.chart.util.Rotation.CLOCKWISE)) {
			angle1 = state.getLatestAngle();
			angle2 = angle1 - ((value / (state.getTotal())) * 360.0);
		}else
			if (direction == (org.jfree.chart.util.Rotation.ANTICLOCKWISE)) {
				angle1 = state.getLatestAngle();
				angle2 = angle1 + ((value / (state.getTotal())) * 360.0);
			}else {
				throw new java.lang.IllegalStateException("Rotation type not recognised.");
			}
		
		double angle = angle2 - angle1;
		if ((java.lang.Math.abs(angle)) > (getMinimumArcAngleToDraw())) {
			java.lang.Comparable key = getSectionKey(section);
			double ep = 0.0;
			double mep = getMaximumExplodePercent();
			if (mep > 0.0) {
				ep = (getExplodePercent(key)) / mep;
			}
			java.awt.geom.Rectangle2D arcBounds = getArcBounds(state.getPieArea(), state.getExplodedPieArea(), angle1, angle, ep);
			java.awt.geom.Arc2D.Double arc = new java.awt.geom.Arc2D.Double(arcBounds, angle1, angle, java.awt.geom.Arc2D.OPEN);
			double depth = (org.jfree.chart.plot.RingPlot.this.sectionDepth) / 2.0;
			org.jfree.chart.util.RectangleInsets s = new org.jfree.chart.util.RectangleInsets(org.jfree.chart.util.UnitType.RELATIVE, depth, depth, depth, depth);
			java.awt.geom.Rectangle2D innerArcBounds = new java.awt.geom.Rectangle2D.Double();
			innerArcBounds.setRect(arcBounds);
			s.trim(innerArcBounds);
			java.awt.geom.Arc2D.Double arc2 = new java.awt.geom.Arc2D.Double(innerArcBounds, (angle1 + angle), (-angle), java.awt.geom.Arc2D.OPEN);
			java.awt.geom.GeneralPath path = new java.awt.geom.GeneralPath();
			path.moveTo(((float) (arc.getStartPoint().getX())), ((float) (arc.getStartPoint().getY())));
			path.append(arc.getPathIterator(null), false);
			path.append(arc2.getPathIterator(null), true);
			path.closePath();
			java.awt.geom.Line2D separator = new java.awt.geom.Line2D.Double(arc2.getEndPoint(), arc.getStartPoint());
			if (currentPass == 0) {
				java.awt.Paint shadowPaint = getShadowPaint();
				double shadowXOffset = getShadowXOffset();
				double shadowYOffset = getShadowYOffset();
				if (shadowPaint != null) {
					java.awt.Shape shadowArc = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(path, ((float) (shadowXOffset)), ((float) (shadowYOffset)));
					g2.setPaint(shadowPaint);
					g2.fill(shadowArc);
				}
			}else
				if (currentPass == 1) {
					java.awt.Paint paint = lookupSectionPaint(key, true);
					g2.setPaint(paint);
					g2.fill(path);
					java.awt.Paint outlinePaint = lookupSectionOutlinePaint(key);
					java.awt.Stroke outlineStroke = lookupSectionOutlineStroke(key);
					if ((outlinePaint != null) && (outlineStroke != null)) {
						g2.setPaint(outlinePaint);
						g2.setStroke(outlineStroke);
						g2.draw(path);
					}
					if ((state.getInfo()) != null) {
						org.jfree.chart.entity.EntityCollection entities = state.getEntityCollection();
						if (entities != null) {
							java.lang.String tip = null;
							org.jfree.chart.labels.PieToolTipGenerator toolTipGenerator = getToolTipGenerator();
							if (toolTipGenerator != null) {
								tip = toolTipGenerator.generateToolTip(dataset, key);
							}
							java.lang.String url = null;
							org.jfree.chart.urls.PieURLGenerator urlGenerator = getURLGenerator();
							if (urlGenerator != null) {
								url = urlGenerator.generateURL(dataset, key, getPieIndex());
							}
							org.jfree.chart.entity.PieSectionEntity entity = new org.jfree.chart.entity.PieSectionEntity(path, dataset, getPieIndex(), section, key, tip, url);
							entities.add(entity);
						}
					}
				}else
					if (currentPass == 2) {
						if (org.jfree.chart.plot.RingPlot.this.separatorsVisible) {
							java.awt.geom.Line2D extendedSeparator = extendLine(separator, org.jfree.chart.plot.RingPlot.this.innerSeparatorExtension, org.jfree.chart.plot.RingPlot.this.outerSeparatorExtension);
							g2.setStroke(org.jfree.chart.plot.RingPlot.this.separatorStroke);
							g2.setPaint(org.jfree.chart.plot.RingPlot.this.separatorPaint);
							g2.draw(extendedSeparator);
						}
					}
				
			
		}
		state.setLatestAngle(angle2);
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.chart.plot.RingPlot.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.RingPlot)) {
			return false;
		}
		org.jfree.chart.plot.RingPlot that = ((org.jfree.chart.plot.RingPlot) (obj));
		if ((org.jfree.chart.plot.RingPlot.this.separatorsVisible) != (that.separatorsVisible)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.RingPlot.this.separatorStroke, that.separatorStroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.RingPlot.this.separatorPaint, that.separatorPaint))) {
			return false;
		}
		if ((org.jfree.chart.plot.RingPlot.this.innerSeparatorExtension) != (that.innerSeparatorExtension)) {
			return false;
		}
		if ((org.jfree.chart.plot.RingPlot.this.outerSeparatorExtension) != (that.outerSeparatorExtension)) {
			return false;
		}
		if ((org.jfree.chart.plot.RingPlot.this.sectionDepth) != (that.sectionDepth)) {
			return false;
		}
		return super.equals(obj);
	}

	private java.awt.geom.Line2D extendLine(java.awt.geom.Line2D line, double startPercent, double endPercent) {
		if (line == null) {
			throw new java.lang.IllegalArgumentException("Null 'line' argument.");
		}
		double x1 = line.getX1();
		double x2 = line.getX2();
		double deltaX = x2 - x1;
		double y1 = line.getY1();
		double y2 = line.getY2();
		double deltaY = y2 - y1;
		x1 = x1 - (startPercent * deltaX);
		y1 = y1 - (startPercent * deltaY);
		x2 = x2 + (endPercent * deltaX);
		y2 = y2 + (endPercent * deltaY);
		return new java.awt.geom.Line2D.Double(x1, y1, x2, y2);
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.RingPlot.this.separatorStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.RingPlot.this.separatorPaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.plot.RingPlot.this.separatorStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.RingPlot.this.separatorPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
	}
}

