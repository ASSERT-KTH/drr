

package org.jfree.chart.plot;


public class PiePlot3D extends org.jfree.chart.plot.PiePlot implements java.io.Serializable {
	private static final long serialVersionUID = 3408984188945161432L;

	private double depthFactor = 0.2;

	public PiePlot3D() {
		this(null);
	}

	public PiePlot3D(org.jfree.data.general.PieDataset dataset) {
		super(dataset);
		setCircular(false, false);
	}

	public double getDepthFactor() {
		return org.jfree.chart.plot.PiePlot3D.this.depthFactor;
	}

	public void setDepthFactor(double factor) {
		org.jfree.chart.plot.PiePlot3D.this.depthFactor = factor;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.PiePlot3D.this));
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Point2D anchor, org.jfree.chart.plot.PlotState parentState, org.jfree.chart.plot.PlotRenderingInfo info) {
		org.jfree.chart.util.RectangleInsets insets = getInsets();
		insets.trim(plotArea);
		java.awt.geom.Rectangle2D originalPlotArea = ((java.awt.geom.Rectangle2D) (plotArea.clone()));
		if (info != null) {
			info.setPlotArea(plotArea);
			info.setDataArea(plotArea);
		}
		java.awt.Shape savedClip = g2.getClip();
		g2.clip(plotArea);
		double gapPercent = getInteriorGap();
		double labelPercent = 0.0;
		if ((getLabelGenerator()) != null) {
			labelPercent = ((getLabelGap()) + (getMaximumLabelWidth())) + (getLabelLinkMargin());
		}
		double gapHorizontal = (plotArea.getWidth()) * (gapPercent + labelPercent);
		double gapVertical = (plotArea.getHeight()) * gapPercent;
		double linkX = (plotArea.getX()) + (gapHorizontal / 2);
		double linkY = (plotArea.getY()) + (gapVertical / 2);
		double linkW = (plotArea.getWidth()) - gapHorizontal;
		double linkH = (plotArea.getHeight()) - gapVertical;
		if (isCircular()) {
			double min = (java.lang.Math.min(linkW, linkH)) / 2;
			linkX = (((linkX + linkX) + linkW) / 2) - min;
			linkY = (((linkY + linkY) + linkH) / 2) - min;
			linkW = 2 * min;
			linkH = 2 * min;
		}
		org.jfree.chart.plot.PiePlotState state = initialise(g2, plotArea, org.jfree.chart.plot.PiePlot3D.this, null, info);
		double hh = linkW * (getLabelLinkMargin());
		double vv = linkH * (getLabelLinkMargin());
		java.awt.geom.Rectangle2D explodeArea = new java.awt.geom.Rectangle2D.Double((linkX + (hh / 2.0)), (linkY + (vv / 2.0)), (linkW - hh), (linkH - vv));
		state.setExplodedPieArea(explodeArea);
		double maximumExplodePercent = getMaximumExplodePercent();
		double percent = maximumExplodePercent / (1.0 + maximumExplodePercent);
		double h1 = (explodeArea.getWidth()) * percent;
		double v1 = (explodeArea.getHeight()) * percent;
		java.awt.geom.Rectangle2D pieArea = new java.awt.geom.Rectangle2D.Double(((explodeArea.getX()) + (h1 / 2.0)), ((explodeArea.getY()) + (v1 / 2.0)), ((explodeArea.getWidth()) - h1), ((explodeArea.getHeight()) - v1));
		int depth = ((int) ((pieArea.getHeight()) * (org.jfree.chart.plot.PiePlot3D.this.depthFactor)));
		java.awt.geom.Rectangle2D linkArea = new java.awt.geom.Rectangle2D.Double(linkX, linkY, linkW, (linkH - depth));
		state.setLinkArea(linkArea);
		state.setPieArea(pieArea);
		state.setPieCenterX(pieArea.getCenterX());
		state.setPieCenterY(((pieArea.getCenterY()) - (depth / 2.0)));
		state.setPieWRadius(((pieArea.getWidth()) / 2.0));
		state.setPieHRadius((((pieArea.getHeight()) - depth) / 2.0));
		drawBackground(g2, plotArea);
		org.jfree.data.general.PieDataset dataset = getDataset();
		if (org.jfree.data.general.DatasetUtilities.isEmptyOrNull(getDataset())) {
			drawNoDataMessage(g2, plotArea);
			g2.setClip(savedClip);
			drawOutline(g2, plotArea);
			return ;
		}
		if ((dataset.getKeys().size()) > (plotArea.getWidth())) {
			java.lang.String text = "Too many elements";
			java.awt.Font sfont = new java.awt.Font("dialog", java.awt.Font.BOLD, 10);
			g2.setFont(sfont);
			java.awt.FontMetrics fm = g2.getFontMetrics(sfont);
			int stringWidth = fm.stringWidth(text);
			g2.drawString(text, ((int) ((plotArea.getX()) + (((plotArea.getWidth()) - stringWidth) / 2))), ((int) ((plotArea.getY()) + ((plotArea.getHeight()) / 2))));
			return ;
		}
		if (isCircular()) {
			double min = (java.lang.Math.min(plotArea.getWidth(), plotArea.getHeight())) / 2;
			plotArea = new java.awt.geom.Rectangle2D.Double(((plotArea.getCenterX()) - min), ((plotArea.getCenterY()) - min), (2 * min), (2 * min));
		}
		java.util.List sectionKeys = dataset.getKeys();
		if ((sectionKeys.size()) == 0) {
			return ;
		}
		double arcX = pieArea.getX();
		double arcY = pieArea.getY();
		java.awt.Composite originalComposite = g2.getComposite();
		g2.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, getForegroundAlpha()));
		double totalValue = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(dataset);
		double runningTotal = 0;
		if (depth < 0) {
			return ;
		}
		java.util.ArrayList arcList = new java.util.ArrayList();
		java.awt.geom.Arc2D.Double arc;
		java.awt.Paint paint;
		java.awt.Paint outlinePaint;
		java.awt.Stroke outlineStroke;
		java.util.Iterator iterator = sectionKeys.iterator();
		while (iterator.hasNext()) {
			java.lang.Comparable currentKey = ((java.lang.Comparable) (iterator.next()));
			java.lang.Number dataValue = dataset.getValue(currentKey);
			if (dataValue == null) {
				arcList.add(null);
				continue;
			}
			double value = dataValue.doubleValue();
			if (value <= 0) {
				arcList.add(null);
				continue;
			}
			double startAngle = getStartAngle();
			double direction = getDirection().getFactor();
			double angle1 = startAngle + ((direction * (runningTotal * 360)) / totalValue);
			double angle2 = startAngle + (((direction * (runningTotal + value)) * 360) / totalValue);
			if ((java.lang.Math.abs((angle2 - angle1))) > (getMinimumArcAngleToDraw())) {
				arcList.add(new java.awt.geom.Arc2D.Double(arcX, (arcY + depth), pieArea.getWidth(), ((pieArea.getHeight()) - depth), angle1, (angle2 - angle1), java.awt.geom.Arc2D.PIE));
			}else {
				arcList.add(null);
			}
			runningTotal += value;
		} 
		java.awt.Shape oldClip = g2.getClip();
		java.awt.geom.Ellipse2D top = new java.awt.geom.Ellipse2D.Double(pieArea.getX(), pieArea.getY(), pieArea.getWidth(), ((pieArea.getHeight()) - depth));
		java.awt.geom.Ellipse2D bottom = new java.awt.geom.Ellipse2D.Double(pieArea.getX(), ((pieArea.getY()) + depth), pieArea.getWidth(), ((pieArea.getHeight()) - depth));
		java.awt.geom.Rectangle2D lower = new java.awt.geom.Rectangle2D.Double(top.getX(), top.getCenterY(), pieArea.getWidth(), ((bottom.getMaxY()) - (top.getCenterY())));
		java.awt.geom.Rectangle2D upper = new java.awt.geom.Rectangle2D.Double(pieArea.getX(), top.getY(), pieArea.getWidth(), ((bottom.getCenterY()) - (top.getY())));
		java.awt.geom.Area a = new java.awt.geom.Area(top);
		a.add(new java.awt.geom.Area(lower));
		java.awt.geom.Area b = new java.awt.geom.Area(bottom);
		b.add(new java.awt.geom.Area(upper));
		java.awt.geom.Area pie = new java.awt.geom.Area(a);
		pie.intersect(b);
		java.awt.geom.Area front = new java.awt.geom.Area(pie);
		front.subtract(new java.awt.geom.Area(top));
		java.awt.geom.Area back = new java.awt.geom.Area(pie);
		back.subtract(new java.awt.geom.Area(bottom));
		int[] xs;
		int[] ys;
		arc = new java.awt.geom.Arc2D.Double(arcX, (arcY + depth), pieArea.getWidth(), ((pieArea.getHeight()) - depth), 0, 360, java.awt.geom.Arc2D.PIE);
		int categoryCount = arcList.size();
		for (int categoryIndex = 0; categoryIndex < categoryCount; categoryIndex++) {
			arc = ((java.awt.geom.Arc2D.Double) (arcList.get(categoryIndex)));
			if (arc == null) {
				continue;
			}
			java.lang.Comparable key = getSectionKey(categoryIndex);
			paint = lookupSectionPaint(key, true);
			outlinePaint = lookupSectionOutlinePaint(key);
			outlineStroke = lookupSectionOutlineStroke(key);
			g2.setPaint(paint);
			g2.fill(arc);
			g2.setPaint(outlinePaint);
			g2.setStroke(outlineStroke);
			g2.draw(arc);
			g2.setPaint(paint);
			java.awt.geom.Point2D p1 = arc.getStartPoint();
			xs = new int[]{ ((int) (arc.getCenterX())) , ((int) (arc.getCenterX())) , ((int) (p1.getX())) , ((int) (p1.getX())) };
			ys = new int[]{ ((int) (arc.getCenterY())) , ((int) (arc.getCenterY())) - depth , ((int) (p1.getY())) - depth , ((int) (p1.getY())) };
			java.awt.Polygon polygon = new java.awt.Polygon(xs, ys, 4);
			g2.setPaint(java.awt.Color.lightGray);
			g2.fill(polygon);
			g2.setPaint(outlinePaint);
			g2.setStroke(outlineStroke);
			g2.draw(polygon);
			g2.setPaint(paint);
		}
		g2.setPaint(java.awt.Color.gray);
		g2.fill(back);
		g2.fill(front);
		int cat = 0;
		iterator = arcList.iterator();
		while (iterator.hasNext()) {
			java.awt.geom.Arc2D segment = ((java.awt.geom.Arc2D) (iterator.next()));
			if (segment != null) {
				java.lang.Comparable key = getSectionKey(cat);
				paint = lookupSectionPaint(key, true);
				outlinePaint = lookupSectionOutlinePaint(key);
				outlineStroke = lookupSectionOutlineStroke(key);
				drawSide(g2, pieArea, segment, front, back, paint, outlinePaint, outlineStroke, false, true);
			}
			cat++;
		} 
		cat = 0;
		iterator = arcList.iterator();
		while (iterator.hasNext()) {
			java.awt.geom.Arc2D segment = ((java.awt.geom.Arc2D) (iterator.next()));
			if (segment != null) {
				java.lang.Comparable key = getSectionKey(cat);
				paint = lookupSectionPaint(key);
				outlinePaint = lookupSectionOutlinePaint(key);
				outlineStroke = lookupSectionOutlineStroke(key);
				drawSide(g2, pieArea, segment, front, back, paint, outlinePaint, outlineStroke, true, false);
			}
			cat++;
		} 
		g2.setClip(oldClip);
		java.awt.geom.Arc2D upperArc;
		for (int sectionIndex = 0; sectionIndex < categoryCount; sectionIndex++) {
			arc = ((java.awt.geom.Arc2D.Double) (arcList.get(sectionIndex)));
			if (arc == null) {
				continue;
			}
			upperArc = new java.awt.geom.Arc2D.Double(arcX, arcY, pieArea.getWidth(), ((pieArea.getHeight()) - depth), arc.getAngleStart(), arc.getAngleExtent(), java.awt.geom.Arc2D.PIE);
			java.lang.Comparable currentKey = ((java.lang.Comparable) (sectionKeys.get(sectionIndex)));
			paint = lookupSectionPaint(currentKey, true);
			outlinePaint = lookupSectionOutlinePaint(currentKey);
			outlineStroke = lookupSectionOutlineStroke(currentKey);
			g2.setPaint(paint);
			g2.fill(upperArc);
			g2.setStroke(outlineStroke);
			g2.setPaint(outlinePaint);
			g2.draw(upperArc);
			if (info != null) {
				org.jfree.chart.entity.EntityCollection entities = info.getOwner().getEntityCollection();
				if (entities != null) {
					java.lang.String tip = null;
					org.jfree.chart.labels.PieToolTipGenerator tipster = getToolTipGenerator();
					if (tipster != null) {
						tip = tipster.generateToolTip(dataset, currentKey);
					}
					java.lang.String url = null;
					if ((getURLGenerator()) != null) {
						url = getURLGenerator().generateURL(dataset, currentKey, getPieIndex());
					}
					org.jfree.chart.entity.PieSectionEntity entity = new org.jfree.chart.entity.PieSectionEntity(upperArc, dataset, getPieIndex(), sectionIndex, currentKey, tip, url);
					entities.add(entity);
				}
			}
			java.util.List keys = dataset.getKeys();
			java.awt.geom.Rectangle2D adjustedPlotArea = new java.awt.geom.Rectangle2D.Double(originalPlotArea.getX(), originalPlotArea.getY(), originalPlotArea.getWidth(), ((originalPlotArea.getHeight()) - depth));
			drawLabels(g2, keys, totalValue, adjustedPlotArea, linkArea, state);
		}
		g2.setClip(savedClip);
		g2.setComposite(originalComposite);
		drawOutline(g2, originalPlotArea);
	}

	protected void drawSide(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Arc2D arc, java.awt.geom.Area front, java.awt.geom.Area back, java.awt.Paint paint, java.awt.Paint outlinePaint, java.awt.Stroke outlineStroke, boolean drawFront, boolean drawBack) {
		double start = arc.getAngleStart();
		double extent = arc.getAngleExtent();
		double end = start + extent;
		g2.setStroke(outlineStroke);
		if (extent < 0.0) {
			if (isAngleAtFront(start)) {
				if (!(isAngleAtBack(end))) {
					if (extent > (-180.0)) {
						if (drawFront) {
							java.awt.geom.Area side = new java.awt.geom.Area(new java.awt.geom.Rectangle2D.Double(arc.getEndPoint().getX(), plotArea.getY(), ((arc.getStartPoint().getX()) - (arc.getEndPoint().getX())), plotArea.getHeight()));
							side.intersect(front);
							g2.setPaint(paint);
							g2.fill(side);
							g2.setPaint(outlinePaint);
							g2.draw(side);
						}
					}else {
						java.awt.geom.Area side1 = new java.awt.geom.Area(new java.awt.geom.Rectangle2D.Double(plotArea.getX(), plotArea.getY(), ((arc.getStartPoint().getX()) - (plotArea.getX())), plotArea.getHeight()));
						side1.intersect(front);
						java.awt.geom.Area side2 = new java.awt.geom.Area(new java.awt.geom.Rectangle2D.Double(arc.getEndPoint().getX(), plotArea.getY(), ((plotArea.getMaxX()) - (arc.getEndPoint().getX())), plotArea.getHeight()));
						side2.intersect(front);
						g2.setPaint(paint);
						if (drawFront) {
							g2.fill(side1);
							g2.fill(side2);
						}
						if (drawBack) {
							g2.fill(back);
						}
						g2.setPaint(outlinePaint);
						if (drawFront) {
							g2.draw(side1);
							g2.draw(side2);
						}
						if (drawBack) {
							g2.draw(back);
						}
					}
				}else {
					if (drawBack) {
						java.awt.geom.Area side2 = new java.awt.geom.Area(new java.awt.geom.Rectangle2D.Double(plotArea.getX(), plotArea.getY(), ((arc.getEndPoint().getX()) - (plotArea.getX())), plotArea.getHeight()));
						side2.intersect(back);
						g2.setPaint(paint);
						g2.fill(side2);
						g2.setPaint(outlinePaint);
						g2.draw(side2);
					}
					if (drawFront) {
						java.awt.geom.Area side1 = new java.awt.geom.Area(new java.awt.geom.Rectangle2D.Double(plotArea.getX(), plotArea.getY(), ((arc.getStartPoint().getX()) - (plotArea.getX())), plotArea.getHeight()));
						side1.intersect(front);
						g2.setPaint(paint);
						g2.fill(side1);
						g2.setPaint(outlinePaint);
						g2.draw(side1);
					}
				}
			}else {
				if (!(isAngleAtFront(end))) {
					if (extent > (-180.0)) {
						if (drawBack) {
							java.awt.geom.Area side = new java.awt.geom.Area(new java.awt.geom.Rectangle2D.Double(arc.getStartPoint().getX(), plotArea.getY(), ((arc.getEndPoint().getX()) - (arc.getStartPoint().getX())), plotArea.getHeight()));
							side.intersect(back);
							g2.setPaint(paint);
							g2.fill(side);
							g2.setPaint(outlinePaint);
							g2.draw(side);
						}
					}else {
						java.awt.geom.Area side1 = new java.awt.geom.Area(new java.awt.geom.Rectangle2D.Double(arc.getStartPoint().getX(), plotArea.getY(), ((plotArea.getMaxX()) - (arc.getStartPoint().getX())), plotArea.getHeight()));
						side1.intersect(back);
						java.awt.geom.Area side2 = new java.awt.geom.Area(new java.awt.geom.Rectangle2D.Double(plotArea.getX(), plotArea.getY(), ((arc.getEndPoint().getX()) - (plotArea.getX())), plotArea.getHeight()));
						side2.intersect(back);
						g2.setPaint(paint);
						if (drawBack) {
							g2.fill(side1);
							g2.fill(side2);
						}
						if (drawFront) {
							g2.fill(front);
						}
						g2.setPaint(outlinePaint);
						if (drawBack) {
							g2.draw(side1);
							g2.draw(side2);
						}
						if (drawFront) {
							g2.draw(front);
						}
					}
				}else {
					if (drawBack) {
						java.awt.geom.Area side1 = new java.awt.geom.Area(new java.awt.geom.Rectangle2D.Double(arc.getStartPoint().getX(), plotArea.getY(), ((plotArea.getMaxX()) - (arc.getStartPoint().getX())), plotArea.getHeight()));
						side1.intersect(back);
						g2.setPaint(paint);
						g2.fill(side1);
						g2.setPaint(outlinePaint);
						g2.draw(side1);
					}
					if (drawFront) {
						java.awt.geom.Area side2 = new java.awt.geom.Area(new java.awt.geom.Rectangle2D.Double(arc.getEndPoint().getX(), plotArea.getY(), ((plotArea.getMaxX()) - (arc.getEndPoint().getX())), plotArea.getHeight()));
						side2.intersect(front);
						g2.setPaint(paint);
						g2.fill(side2);
						g2.setPaint(outlinePaint);
						g2.draw(side2);
					}
				}
			}
		}else
			if (extent > 0.0) {
				if (isAngleAtFront(start)) {
					if (!(isAngleAtBack(end))) {
						if (extent < 180.0) {
							if (drawFront) {
								java.awt.geom.Area side = new java.awt.geom.Area(new java.awt.geom.Rectangle2D.Double(arc.getStartPoint().getX(), plotArea.getY(), ((arc.getEndPoint().getX()) - (arc.getStartPoint().getX())), plotArea.getHeight()));
								side.intersect(front);
								g2.setPaint(paint);
								g2.fill(side);
								g2.setPaint(outlinePaint);
								g2.draw(side);
							}
						}else {
							java.awt.geom.Area side1 = new java.awt.geom.Area(new java.awt.geom.Rectangle2D.Double(arc.getStartPoint().getX(), plotArea.getY(), ((plotArea.getMaxX()) - (arc.getStartPoint().getX())), plotArea.getHeight()));
							side1.intersect(front);
							java.awt.geom.Area side2 = new java.awt.geom.Area(new java.awt.geom.Rectangle2D.Double(plotArea.getX(), plotArea.getY(), ((arc.getEndPoint().getX()) - (plotArea.getX())), plotArea.getHeight()));
							side2.intersect(front);
							g2.setPaint(paint);
							if (drawFront) {
								g2.fill(side1);
								g2.fill(side2);
							}
							if (drawBack) {
								g2.fill(back);
							}
							g2.setPaint(outlinePaint);
							if (drawFront) {
								g2.draw(side1);
								g2.draw(side2);
							}
							if (drawBack) {
								g2.draw(back);
							}
						}
					}else {
						if (drawBack) {
							java.awt.geom.Area side2 = new java.awt.geom.Area(new java.awt.geom.Rectangle2D.Double(arc.getEndPoint().getX(), plotArea.getY(), ((plotArea.getMaxX()) - (arc.getEndPoint().getX())), plotArea.getHeight()));
							side2.intersect(back);
							g2.setPaint(paint);
							g2.fill(side2);
							g2.setPaint(outlinePaint);
							g2.draw(side2);
						}
						if (drawFront) {
							java.awt.geom.Area side1 = new java.awt.geom.Area(new java.awt.geom.Rectangle2D.Double(arc.getStartPoint().getX(), plotArea.getY(), ((plotArea.getMaxX()) - (arc.getStartPoint().getX())), plotArea.getHeight()));
							side1.intersect(front);
							g2.setPaint(paint);
							g2.fill(side1);
							g2.setPaint(outlinePaint);
							g2.draw(side1);
						}
					}
				}else {
					if (!(isAngleAtFront(end))) {
						if (extent < 180.0) {
							if (drawBack) {
								java.awt.geom.Area side = new java.awt.geom.Area(new java.awt.geom.Rectangle2D.Double(arc.getEndPoint().getX(), plotArea.getY(), ((arc.getStartPoint().getX()) - (arc.getEndPoint().getX())), plotArea.getHeight()));
								side.intersect(back);
								g2.setPaint(paint);
								g2.fill(side);
								g2.setPaint(outlinePaint);
								g2.draw(side);
							}
						}else {
							java.awt.geom.Area side1 = new java.awt.geom.Area(new java.awt.geom.Rectangle2D.Double(arc.getStartPoint().getX(), plotArea.getY(), ((plotArea.getX()) - (arc.getStartPoint().getX())), plotArea.getHeight()));
							side1.intersect(back);
							java.awt.geom.Area side2 = new java.awt.geom.Area(new java.awt.geom.Rectangle2D.Double(arc.getEndPoint().getX(), plotArea.getY(), ((plotArea.getMaxX()) - (arc.getEndPoint().getX())), plotArea.getHeight()));
							side2.intersect(back);
							g2.setPaint(paint);
							if (drawBack) {
								g2.fill(side1);
								g2.fill(side2);
							}
							if (drawFront) {
								g2.fill(front);
							}
							g2.setPaint(outlinePaint);
							if (drawBack) {
								g2.draw(side1);
								g2.draw(side2);
							}
							if (drawFront) {
								g2.draw(front);
							}
						}
					}else {
						if (drawBack) {
							java.awt.geom.Area side1 = new java.awt.geom.Area(new java.awt.geom.Rectangle2D.Double(plotArea.getX(), plotArea.getY(), ((arc.getStartPoint().getX()) - (plotArea.getX())), plotArea.getHeight()));
							side1.intersect(back);
							g2.setPaint(paint);
							g2.fill(side1);
							g2.setPaint(outlinePaint);
							g2.draw(side1);
						}
						if (drawFront) {
							java.awt.geom.Area side2 = new java.awt.geom.Area(new java.awt.geom.Rectangle2D.Double(plotArea.getX(), plotArea.getY(), ((arc.getEndPoint().getX()) - (plotArea.getX())), plotArea.getHeight()));
							side2.intersect(front);
							g2.setPaint(paint);
							g2.fill(side2);
							g2.setPaint(outlinePaint);
							g2.draw(side2);
						}
					}
				}
			}
		
	}

	public java.lang.String getPlotType() {
		return org.jfree.chart.plot.PiePlot.localizationResources.getString("Pie_3D_Plot");
	}

	private boolean isAngleAtFront(double angle) {
		return (java.lang.Math.sin(java.lang.Math.toRadians(angle))) < 0.0;
	}

	private boolean isAngleAtBack(double angle) {
		return (java.lang.Math.sin(java.lang.Math.toRadians(angle))) > 0.0;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.PiePlot3D.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.PiePlot3D)) {
			return false;
		}
		org.jfree.chart.plot.PiePlot3D that = ((org.jfree.chart.plot.PiePlot3D) (obj));
		if ((org.jfree.chart.plot.PiePlot3D.this.depthFactor) != (that.depthFactor)) {
			return false;
		}
		return super.equals(obj);
	}
}

