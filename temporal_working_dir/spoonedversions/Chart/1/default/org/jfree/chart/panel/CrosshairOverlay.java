

package org.jfree.chart.panel;


public class CrosshairOverlay extends org.jfree.chart.panel.AbstractOverlay implements java.beans.PropertyChangeListener , java.io.Serializable , java.lang.Cloneable , org.jfree.chart.panel.Overlay , org.jfree.chart.util.PublicCloneable {
	private java.util.List xCrosshairs;

	private java.util.List yCrosshairs;

	public CrosshairOverlay() {
		super();
		org.jfree.chart.panel.CrosshairOverlay.this.xCrosshairs = new java.util.ArrayList();
		org.jfree.chart.panel.CrosshairOverlay.this.yCrosshairs = new java.util.ArrayList();
	}

	public void addDomainCrosshair(org.jfree.chart.plot.Crosshair crosshair) {
		if (crosshair == null) {
			throw new java.lang.IllegalArgumentException("Null 'crosshair' argument.");
		}
		org.jfree.chart.panel.CrosshairOverlay.this.xCrosshairs.add(crosshair);
		crosshair.addPropertyChangeListener(org.jfree.chart.panel.CrosshairOverlay.this);
		fireOverlayChanged();
	}

	public void removeDomainCrosshair(org.jfree.chart.plot.Crosshair crosshair) {
		if (crosshair == null) {
			throw new java.lang.IllegalArgumentException("Null 'crosshair' argument.");
		}
		if (org.jfree.chart.panel.CrosshairOverlay.this.xCrosshairs.remove(crosshair)) {
			crosshair.removePropertyChangeListener(org.jfree.chart.panel.CrosshairOverlay.this);
			fireOverlayChanged();
		}
	}

	public void clearDomainCrosshairs() {
		if (org.jfree.chart.panel.CrosshairOverlay.this.xCrosshairs.isEmpty()) {
			return ;
		}
		java.util.List crosshairs = getDomainCrosshairs();
		for (int i = 0; i < (crosshairs.size()); i++) {
			org.jfree.chart.plot.Crosshair c = ((org.jfree.chart.plot.Crosshair) (crosshairs.get(i)));
			org.jfree.chart.panel.CrosshairOverlay.this.xCrosshairs.remove(c);
			c.removePropertyChangeListener(org.jfree.chart.panel.CrosshairOverlay.this);
		}
		fireOverlayChanged();
	}

	public java.util.List getDomainCrosshairs() {
		return new java.util.ArrayList(org.jfree.chart.panel.CrosshairOverlay.this.xCrosshairs);
	}

	public void addRangeCrosshair(org.jfree.chart.plot.Crosshair crosshair) {
		if (crosshair == null) {
			throw new java.lang.IllegalArgumentException("Null 'crosshair' argument.");
		}
		org.jfree.chart.panel.CrosshairOverlay.this.yCrosshairs.add(crosshair);
		crosshair.addPropertyChangeListener(org.jfree.chart.panel.CrosshairOverlay.this);
		fireOverlayChanged();
	}

	public void removeRangeCrosshair(org.jfree.chart.plot.Crosshair crosshair) {
		if (crosshair == null) {
			throw new java.lang.IllegalArgumentException("Null 'crosshair' argument.");
		}
		if (org.jfree.chart.panel.CrosshairOverlay.this.yCrosshairs.remove(crosshair)) {
			crosshair.removePropertyChangeListener(org.jfree.chart.panel.CrosshairOverlay.this);
			fireOverlayChanged();
		}
	}

	public void clearRangeCrosshairs() {
		if (org.jfree.chart.panel.CrosshairOverlay.this.yCrosshairs.isEmpty()) {
			return ;
		}
		java.util.List crosshairs = getRangeCrosshairs();
		for (int i = 0; i < (crosshairs.size()); i++) {
			org.jfree.chart.plot.Crosshair c = ((org.jfree.chart.plot.Crosshair) (crosshairs.get(i)));
			org.jfree.chart.panel.CrosshairOverlay.this.yCrosshairs.remove(c);
			c.removePropertyChangeListener(org.jfree.chart.panel.CrosshairOverlay.this);
		}
		fireOverlayChanged();
	}

	public java.util.List getRangeCrosshairs() {
		return new java.util.ArrayList(org.jfree.chart.panel.CrosshairOverlay.this.yCrosshairs);
	}

	public void propertyChange(java.beans.PropertyChangeEvent e) {
		fireOverlayChanged();
	}

	public void paintOverlay(java.awt.Graphics2D g2, org.jfree.chart.ChartPanel chartPanel) {
		java.awt.Shape savedClip = g2.getClip();
		java.awt.geom.Rectangle2D dataArea = chartPanel.getScreenDataArea();
		g2.clip(dataArea);
		org.jfree.chart.JFreeChart chart = chartPanel.getChart();
		org.jfree.chart.plot.XYPlot plot = ((org.jfree.chart.plot.XYPlot) (chart.getPlot()));
		org.jfree.chart.axis.ValueAxis xAxis = plot.getDomainAxis();
		org.jfree.chart.util.RectangleEdge xAxisEdge = plot.getDomainAxisEdge();
		java.util.Iterator iterator = org.jfree.chart.panel.CrosshairOverlay.this.xCrosshairs.iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.plot.Crosshair ch = ((org.jfree.chart.plot.Crosshair) (iterator.next()));
			if (ch.isVisible()) {
				double x = ch.getValue();
				double xx = xAxis.valueToJava2D(x, dataArea, xAxisEdge);
				if ((plot.getOrientation()) == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					drawVerticalCrosshair(g2, dataArea, xx, ch);
				}else {
					drawHorizontalCrosshair(g2, dataArea, xx, ch);
				}
			}
		} 
		org.jfree.chart.axis.ValueAxis yAxis = plot.getRangeAxis();
		org.jfree.chart.util.RectangleEdge yAxisEdge = plot.getRangeAxisEdge();
		iterator = org.jfree.chart.panel.CrosshairOverlay.this.yCrosshairs.iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.plot.Crosshair ch = ((org.jfree.chart.plot.Crosshair) (iterator.next()));
			if (ch.isVisible()) {
				double y = ch.getValue();
				double yy = yAxis.valueToJava2D(y, dataArea, yAxisEdge);
				if ((plot.getOrientation()) == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					drawHorizontalCrosshair(g2, dataArea, yy, ch);
				}else {
					drawVerticalCrosshair(g2, dataArea, yy, ch);
				}
			}
		} 
		g2.setClip(savedClip);
	}

	protected void drawHorizontalCrosshair(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, double y, org.jfree.chart.plot.Crosshair crosshair) {
		if ((y >= (dataArea.getMinY())) && (y <= (dataArea.getMaxY()))) {
			java.awt.geom.Line2D line = new java.awt.geom.Line2D.Double(dataArea.getMinX(), y, dataArea.getMaxX(), y);
			java.awt.Paint savedPaint = g2.getPaint();
			java.awt.Stroke savedStroke = g2.getStroke();
			g2.setPaint(crosshair.getPaint());
			g2.setStroke(crosshair.getStroke());
			g2.draw(line);
			if (crosshair.isLabelVisible()) {
				java.lang.String label = crosshair.getLabelGenerator().generateLabel(crosshair);
				org.jfree.chart.util.RectangleAnchor anchor = crosshair.getLabelAnchor();
				java.awt.geom.Point2D pt = calculateLabelPoint(line, anchor, 5, 5);
				float xx = ((float) (pt.getX()));
				float yy = ((float) (pt.getY()));
				org.jfree.chart.text.TextAnchor alignPt = textAlignPtForLabelAnchorH(anchor);
				java.awt.Shape hotspot = org.jfree.chart.text.TextUtilities.calculateRotatedStringBounds(label, g2, xx, yy, alignPt, 0.0, org.jfree.chart.text.TextAnchor.CENTER);
				if (!(dataArea.contains(hotspot.getBounds2D()))) {
					anchor = flipAnchorV(anchor);
					pt = calculateLabelPoint(line, anchor, 5, 5);
					xx = ((float) (pt.getX()));
					yy = ((float) (pt.getY()));
					alignPt = textAlignPtForLabelAnchorH(anchor);
					hotspot = org.jfree.chart.text.TextUtilities.calculateRotatedStringBounds(label, g2, xx, yy, alignPt, 0.0, org.jfree.chart.text.TextAnchor.CENTER);
				}
				g2.setPaint(crosshair.getLabelBackgroundPaint());
				g2.fill(hotspot);
				g2.setPaint(crosshair.getLabelOutlinePaint());
				g2.draw(hotspot);
				org.jfree.chart.text.TextUtilities.drawAlignedString(label, g2, xx, yy, alignPt);
			}
			g2.setPaint(savedPaint);
			g2.setStroke(savedStroke);
		}
	}

	protected void drawVerticalCrosshair(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, double x, org.jfree.chart.plot.Crosshair crosshair) {
		if ((x >= (dataArea.getMinX())) && (x <= (dataArea.getMaxX()))) {
			java.awt.geom.Line2D line = new java.awt.geom.Line2D.Double(x, dataArea.getMinY(), x, dataArea.getMaxY());
			java.awt.Paint savedPaint = g2.getPaint();
			java.awt.Stroke savedStroke = g2.getStroke();
			g2.setPaint(crosshair.getPaint());
			g2.setStroke(crosshair.getStroke());
			g2.draw(line);
			if (crosshair.isLabelVisible()) {
				java.lang.String label = crosshair.getLabelGenerator().generateLabel(crosshair);
				org.jfree.chart.util.RectangleAnchor anchor = crosshair.getLabelAnchor();
				java.awt.geom.Point2D pt = calculateLabelPoint(line, anchor, 5, 5);
				float xx = ((float) (pt.getX()));
				float yy = ((float) (pt.getY()));
				org.jfree.chart.text.TextAnchor alignPt = textAlignPtForLabelAnchorV(anchor);
				java.awt.Shape hotspot = org.jfree.chart.text.TextUtilities.calculateRotatedStringBounds(label, g2, xx, yy, alignPt, 0.0, org.jfree.chart.text.TextAnchor.CENTER);
				if (!(dataArea.contains(hotspot.getBounds2D()))) {
					anchor = flipAnchorH(anchor);
					pt = calculateLabelPoint(line, anchor, 5, 5);
					xx = ((float) (pt.getX()));
					yy = ((float) (pt.getY()));
					alignPt = textAlignPtForLabelAnchorV(anchor);
					hotspot = org.jfree.chart.text.TextUtilities.calculateRotatedStringBounds(label, g2, xx, yy, alignPt, 0.0, org.jfree.chart.text.TextAnchor.CENTER);
				}
				g2.setPaint(crosshair.getLabelBackgroundPaint());
				g2.fill(hotspot);
				g2.setPaint(crosshair.getLabelOutlinePaint());
				g2.draw(hotspot);
				org.jfree.chart.text.TextUtilities.drawAlignedString(label, g2, xx, yy, alignPt);
			}
			g2.setPaint(savedPaint);
			g2.setStroke(savedStroke);
		}
	}

	private java.awt.geom.Point2D calculateLabelPoint(java.awt.geom.Line2D line, org.jfree.chart.util.RectangleAnchor anchor, double deltaX, double deltaY) {
		double x = 0.0;
		double y = 0.0;
		boolean left = ((anchor == (org.jfree.chart.util.RectangleAnchor.BOTTOM_LEFT)) || (anchor == (org.jfree.chart.util.RectangleAnchor.LEFT))) || (anchor == (org.jfree.chart.util.RectangleAnchor.TOP_LEFT));
		boolean right = ((anchor == (org.jfree.chart.util.RectangleAnchor.BOTTOM_RIGHT)) || (anchor == (org.jfree.chart.util.RectangleAnchor.RIGHT))) || (anchor == (org.jfree.chart.util.RectangleAnchor.TOP_RIGHT));
		boolean top = ((anchor == (org.jfree.chart.util.RectangleAnchor.TOP_LEFT)) || (anchor == (org.jfree.chart.util.RectangleAnchor.TOP))) || (anchor == (org.jfree.chart.util.RectangleAnchor.TOP_RIGHT));
		boolean bottom = ((anchor == (org.jfree.chart.util.RectangleAnchor.BOTTOM_LEFT)) || (anchor == (org.jfree.chart.util.RectangleAnchor.BOTTOM))) || (anchor == (org.jfree.chart.util.RectangleAnchor.BOTTOM_RIGHT));
		java.awt.Rectangle rect = line.getBounds();
		if ((line.getX1()) == (line.getX2())) {
			x = line.getX1();
			y = ((line.getY1()) + (line.getY2())) / 2.0;
			if (left) {
				x = x - deltaX;
			}
			if (right) {
				x = x + deltaX;
			}
			if (top) {
				y = (java.lang.Math.min(line.getY1(), line.getY2())) + deltaY;
			}
			if (bottom) {
				y = (java.lang.Math.max(line.getY1(), line.getY2())) - deltaY;
			}
		}else {
			x = ((line.getX1()) + (line.getX2())) / 2.0;
			y = line.getY1();
			if (left) {
				x = (java.lang.Math.min(line.getX1(), line.getX2())) + deltaX;
			}
			if (right) {
				x = (java.lang.Math.max(line.getX1(), line.getX2())) - deltaX;
			}
			if (top) {
				y = y - deltaY;
			}
			if (bottom) {
				y = y + deltaY;
			}
		}
		return new java.awt.geom.Point2D.Double(x, y);
	}

	private org.jfree.chart.text.TextAnchor textAlignPtForLabelAnchorV(org.jfree.chart.util.RectangleAnchor anchor) {
		org.jfree.chart.text.TextAnchor result = org.jfree.chart.text.TextAnchor.CENTER;
		if (anchor.equals(org.jfree.chart.util.RectangleAnchor.TOP_LEFT)) {
			result = org.jfree.chart.text.TextAnchor.TOP_RIGHT;
		}else
			if (anchor.equals(org.jfree.chart.util.RectangleAnchor.TOP)) {
				result = org.jfree.chart.text.TextAnchor.TOP_CENTER;
			}else
				if (anchor.equals(org.jfree.chart.util.RectangleAnchor.TOP_RIGHT)) {
					result = org.jfree.chart.text.TextAnchor.TOP_LEFT;
				}else
					if (anchor.equals(org.jfree.chart.util.RectangleAnchor.LEFT)) {
						result = org.jfree.chart.text.TextAnchor.HALF_ASCENT_RIGHT;
					}else
						if (anchor.equals(org.jfree.chart.util.RectangleAnchor.RIGHT)) {
							result = org.jfree.chart.text.TextAnchor.HALF_ASCENT_LEFT;
						}else
							if (anchor.equals(org.jfree.chart.util.RectangleAnchor.BOTTOM_LEFT)) {
								result = org.jfree.chart.text.TextAnchor.BOTTOM_RIGHT;
							}else
								if (anchor.equals(org.jfree.chart.util.RectangleAnchor.BOTTOM)) {
									result = org.jfree.chart.text.TextAnchor.BOTTOM_CENTER;
								}else
									if (anchor.equals(org.jfree.chart.util.RectangleAnchor.BOTTOM_RIGHT)) {
										result = org.jfree.chart.text.TextAnchor.BOTTOM_LEFT;
									}
								
							
						
					
				
			
		
		return result;
	}

	private org.jfree.chart.text.TextAnchor textAlignPtForLabelAnchorH(org.jfree.chart.util.RectangleAnchor anchor) {
		org.jfree.chart.text.TextAnchor result = org.jfree.chart.text.TextAnchor.CENTER;
		if (anchor.equals(org.jfree.chart.util.RectangleAnchor.TOP_LEFT)) {
			result = org.jfree.chart.text.TextAnchor.BOTTOM_LEFT;
		}else
			if (anchor.equals(org.jfree.chart.util.RectangleAnchor.TOP)) {
				result = org.jfree.chart.text.TextAnchor.BOTTOM_CENTER;
			}else
				if (anchor.equals(org.jfree.chart.util.RectangleAnchor.TOP_RIGHT)) {
					result = org.jfree.chart.text.TextAnchor.BOTTOM_RIGHT;
				}else
					if (anchor.equals(org.jfree.chart.util.RectangleAnchor.LEFT)) {
						result = org.jfree.chart.text.TextAnchor.HALF_ASCENT_LEFT;
					}else
						if (anchor.equals(org.jfree.chart.util.RectangleAnchor.RIGHT)) {
							result = org.jfree.chart.text.TextAnchor.HALF_ASCENT_RIGHT;
						}else
							if (anchor.equals(org.jfree.chart.util.RectangleAnchor.BOTTOM_LEFT)) {
								result = org.jfree.chart.text.TextAnchor.TOP_LEFT;
							}else
								if (anchor.equals(org.jfree.chart.util.RectangleAnchor.BOTTOM)) {
									result = org.jfree.chart.text.TextAnchor.TOP_CENTER;
								}else
									if (anchor.equals(org.jfree.chart.util.RectangleAnchor.BOTTOM_RIGHT)) {
										result = org.jfree.chart.text.TextAnchor.TOP_RIGHT;
									}
								
							
						
					
				
			
		
		return result;
	}

	private org.jfree.chart.util.RectangleAnchor flipAnchorH(org.jfree.chart.util.RectangleAnchor anchor) {
		org.jfree.chart.util.RectangleAnchor result = anchor;
		if (anchor.equals(org.jfree.chart.util.RectangleAnchor.TOP_LEFT)) {
			result = org.jfree.chart.util.RectangleAnchor.TOP_RIGHT;
		}else
			if (anchor.equals(org.jfree.chart.util.RectangleAnchor.TOP_RIGHT)) {
				result = org.jfree.chart.util.RectangleAnchor.TOP_LEFT;
			}else
				if (anchor.equals(org.jfree.chart.util.RectangleAnchor.LEFT)) {
					result = org.jfree.chart.util.RectangleAnchor.RIGHT;
				}else
					if (anchor.equals(org.jfree.chart.util.RectangleAnchor.RIGHT)) {
						result = org.jfree.chart.util.RectangleAnchor.LEFT;
					}else
						if (anchor.equals(org.jfree.chart.util.RectangleAnchor.BOTTOM_LEFT)) {
							result = org.jfree.chart.util.RectangleAnchor.BOTTOM_RIGHT;
						}else
							if (anchor.equals(org.jfree.chart.util.RectangleAnchor.BOTTOM_RIGHT)) {
								result = org.jfree.chart.util.RectangleAnchor.BOTTOM_LEFT;
							}
						
					
				
			
		
		return result;
	}

	private org.jfree.chart.util.RectangleAnchor flipAnchorV(org.jfree.chart.util.RectangleAnchor anchor) {
		org.jfree.chart.util.RectangleAnchor result = anchor;
		if (anchor.equals(org.jfree.chart.util.RectangleAnchor.TOP_LEFT)) {
			result = org.jfree.chart.util.RectangleAnchor.BOTTOM_LEFT;
		}else
			if (anchor.equals(org.jfree.chart.util.RectangleAnchor.TOP_RIGHT)) {
				result = org.jfree.chart.util.RectangleAnchor.BOTTOM_RIGHT;
			}else
				if (anchor.equals(org.jfree.chart.util.RectangleAnchor.TOP)) {
					result = org.jfree.chart.util.RectangleAnchor.BOTTOM;
				}else
					if (anchor.equals(org.jfree.chart.util.RectangleAnchor.BOTTOM)) {
						result = org.jfree.chart.util.RectangleAnchor.TOP;
					}else
						if (anchor.equals(org.jfree.chart.util.RectangleAnchor.BOTTOM_LEFT)) {
							result = org.jfree.chart.util.RectangleAnchor.TOP_LEFT;
						}else
							if (anchor.equals(org.jfree.chart.util.RectangleAnchor.BOTTOM_RIGHT)) {
								result = org.jfree.chart.util.RectangleAnchor.TOP_RIGHT;
							}
						
					
				
			
		
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.panel.CrosshairOverlay.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.panel.CrosshairOverlay)) {
			return false;
		}
		org.jfree.chart.panel.CrosshairOverlay that = ((org.jfree.chart.panel.CrosshairOverlay) (obj));
		if (!(org.jfree.chart.panel.CrosshairOverlay.this.xCrosshairs.equals(that.xCrosshairs))) {
			return false;
		}
		if (!(org.jfree.chart.panel.CrosshairOverlay.this.yCrosshairs.equals(that.yCrosshairs))) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.panel.CrosshairOverlay clone = ((org.jfree.chart.panel.CrosshairOverlay) (super.clone()));
		clone.xCrosshairs = ((java.util.List) (org.jfree.chart.util.ObjectUtilities.deepClone(org.jfree.chart.panel.CrosshairOverlay.this.xCrosshairs)));
		clone.yCrosshairs = ((java.util.List) (org.jfree.chart.util.ObjectUtilities.deepClone(org.jfree.chart.panel.CrosshairOverlay.this.yCrosshairs)));
		return clone;
	}
}

