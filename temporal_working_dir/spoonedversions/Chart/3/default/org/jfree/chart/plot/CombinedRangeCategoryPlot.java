

package org.jfree.chart.plot;


public class CombinedRangeCategoryPlot extends org.jfree.chart.plot.CategoryPlot implements org.jfree.chart.event.PlotChangeListener {
	private static final long serialVersionUID = 7260210007554504515L;

	private java.util.List subplots;

	private double gap;

	private transient java.awt.geom.Rectangle2D[] subplotArea;

	public CombinedRangeCategoryPlot() {
		this(new org.jfree.chart.axis.NumberAxis());
	}

	public CombinedRangeCategoryPlot(org.jfree.chart.axis.ValueAxis rangeAxis) {
		super(null, null, rangeAxis, null);
		org.jfree.chart.plot.CombinedRangeCategoryPlot.this.subplots = new java.util.ArrayList();
		org.jfree.chart.plot.CombinedRangeCategoryPlot.this.gap = 5.0;
	}

	public double getGap() {
		return org.jfree.chart.plot.CombinedRangeCategoryPlot.this.gap;
	}

	public void setGap(double gap) {
		org.jfree.chart.plot.CombinedRangeCategoryPlot.this.gap = gap;
		fireChangeEvent();
	}

	public void add(org.jfree.chart.plot.CategoryPlot subplot) {
		add(subplot, 1);
	}

	public void add(org.jfree.chart.plot.CategoryPlot subplot, int weight) {
		if (subplot == null) {
			throw new java.lang.IllegalArgumentException("Null 'subplot' argument.");
		}
		if (weight <= 0) {
			throw new java.lang.IllegalArgumentException("Require weight >= 1.");
		}
		subplot.setParent(org.jfree.chart.plot.CombinedRangeCategoryPlot.this);
		subplot.setWeight(weight);
		subplot.setInsets(new org.jfree.chart.util.RectangleInsets(0.0, 0.0, 0.0, 0.0));
		subplot.setRangeAxis(null);
		subplot.setOrientation(getOrientation());
		subplot.addChangeListener(org.jfree.chart.plot.CombinedRangeCategoryPlot.this);
		org.jfree.chart.plot.CombinedRangeCategoryPlot.this.subplots.add(subplot);
		org.jfree.chart.axis.ValueAxis axis = getRangeAxis();
		if (axis != null) {
			axis.configure();
		}
		fireChangeEvent();
	}

	public void remove(org.jfree.chart.plot.CategoryPlot subplot) {
		if (subplot == null) {
			throw new java.lang.IllegalArgumentException(" Null 'subplot' argument.");
		}
		int position = -1;
		int size = org.jfree.chart.plot.CombinedRangeCategoryPlot.this.subplots.size();
		int i = 0;
		while ((position == (-1)) && (i < size)) {
			if ((org.jfree.chart.plot.CombinedRangeCategoryPlot.this.subplots.get(i)) == subplot) {
				position = i;
			}
			i++;
		} 
		if (position != (-1)) {
			org.jfree.chart.plot.CombinedRangeCategoryPlot.this.subplots.remove(position);
			subplot.setParent(null);
			subplot.removeChangeListener(org.jfree.chart.plot.CombinedRangeCategoryPlot.this);
			org.jfree.chart.axis.ValueAxis range = getRangeAxis();
			if (range != null) {
				range.configure();
			}
			org.jfree.chart.axis.ValueAxis range2 = getRangeAxis(1);
			if (range2 != null) {
				range2.configure();
			}
			fireChangeEvent();
		}
	}

	public java.util.List getSubplots() {
		if ((org.jfree.chart.plot.CombinedRangeCategoryPlot.this.subplots) != null) {
			return java.util.Collections.unmodifiableList(org.jfree.chart.plot.CombinedRangeCategoryPlot.this.subplots);
		}else {
			return java.util.Collections.EMPTY_LIST;
		}
	}

	protected org.jfree.chart.axis.AxisSpace calculateAxisSpace(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea) {
		org.jfree.chart.axis.AxisSpace space = new org.jfree.chart.axis.AxisSpace();
		org.jfree.chart.plot.PlotOrientation orientation = getOrientation();
		org.jfree.chart.axis.AxisSpace fixed = getFixedRangeAxisSpace();
		if (fixed != null) {
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				space.setLeft(fixed.getLeft());
				space.setRight(fixed.getRight());
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
					space.setTop(fixed.getTop());
					space.setBottom(fixed.getBottom());
				}
			
		}else {
			org.jfree.chart.axis.ValueAxis valueAxis = getRangeAxis();
			org.jfree.chart.util.RectangleEdge valueEdge = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(getRangeAxisLocation(), orientation);
			if (valueAxis != null) {
				space = valueAxis.reserveSpace(g2, org.jfree.chart.plot.CombinedRangeCategoryPlot.this, plotArea, valueEdge, space);
			}
		}
		java.awt.geom.Rectangle2D adjustedPlotArea = space.shrink(plotArea, null);
		int n = org.jfree.chart.plot.CombinedRangeCategoryPlot.this.subplots.size();
		int totalWeight = 0;
		for (int i = 0; i < n; i++) {
			org.jfree.chart.plot.CategoryPlot sub = ((org.jfree.chart.plot.CategoryPlot) (org.jfree.chart.plot.CombinedRangeCategoryPlot.this.subplots.get(i)));
			totalWeight += sub.getWeight();
		}
		org.jfree.chart.plot.CombinedRangeCategoryPlot.this.subplotArea = new java.awt.geom.Rectangle2D[n];
		double x = adjustedPlotArea.getX();
		double y = adjustedPlotArea.getY();
		double usableSize = 0.0;
		if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
			usableSize = (adjustedPlotArea.getWidth()) - ((org.jfree.chart.plot.CombinedRangeCategoryPlot.this.gap) * (n - 1));
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				usableSize = (adjustedPlotArea.getHeight()) - ((org.jfree.chart.plot.CombinedRangeCategoryPlot.this.gap) * (n - 1));
			}
		
		for (int i = 0; i < n; i++) {
			org.jfree.chart.plot.CategoryPlot plot = ((org.jfree.chart.plot.CategoryPlot) (org.jfree.chart.plot.CombinedRangeCategoryPlot.this.subplots.get(i)));
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				double w = (usableSize * (plot.getWeight())) / totalWeight;
				org.jfree.chart.plot.CombinedRangeCategoryPlot.this.subplotArea[i] = new java.awt.geom.Rectangle2D.Double(x, y, w, adjustedPlotArea.getHeight());
				x = (x + w) + (org.jfree.chart.plot.CombinedRangeCategoryPlot.this.gap);
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
					double h = (usableSize * (plot.getWeight())) / totalWeight;
					org.jfree.chart.plot.CombinedRangeCategoryPlot.this.subplotArea[i] = new java.awt.geom.Rectangle2D.Double(x, y, adjustedPlotArea.getWidth(), h);
					y = (y + h) + (org.jfree.chart.plot.CombinedRangeCategoryPlot.this.gap);
				}
			
			org.jfree.chart.axis.AxisSpace subSpace = plot.calculateDomainAxisSpace(g2, org.jfree.chart.plot.CombinedRangeCategoryPlot.this.subplotArea[i], null);
			space.ensureAtLeast(subSpace);
		}
		return space;
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.awt.geom.Point2D anchor, org.jfree.chart.plot.PlotState parentState, org.jfree.chart.plot.PlotRenderingInfo info) {
		if (info != null) {
			info.setPlotArea(area);
		}
		org.jfree.chart.util.RectangleInsets insets = getInsets();
		insets.trim(area);
		org.jfree.chart.axis.AxisSpace space = calculateAxisSpace(g2, area);
		java.awt.geom.Rectangle2D dataArea = space.shrink(area, null);
		setFixedDomainAxisSpaceForSubplots(space);
		org.jfree.chart.axis.ValueAxis axis = getRangeAxis();
		org.jfree.chart.util.RectangleEdge rangeEdge = getRangeAxisEdge();
		double cursor = org.jfree.chart.util.RectangleEdge.coordinate(dataArea, rangeEdge);
		org.jfree.chart.axis.AxisState state = axis.draw(g2, cursor, area, dataArea, rangeEdge, info);
		if (parentState == null) {
			parentState = new org.jfree.chart.plot.PlotState();
		}
		parentState.getSharedAxisStates().put(axis, state);
		for (int i = 0; i < (org.jfree.chart.plot.CombinedRangeCategoryPlot.this.subplots.size()); i++) {
			org.jfree.chart.plot.CategoryPlot plot = ((org.jfree.chart.plot.CategoryPlot) (org.jfree.chart.plot.CombinedRangeCategoryPlot.this.subplots.get(i)));
			org.jfree.chart.plot.PlotRenderingInfo subplotInfo = null;
			if (info != null) {
				subplotInfo = new org.jfree.chart.plot.PlotRenderingInfo(info.getOwner());
				info.addSubplotInfo(subplotInfo);
			}
			java.awt.geom.Point2D subAnchor = null;
			if ((anchor != null) && (org.jfree.chart.plot.CombinedRangeCategoryPlot.this.subplotArea[i].contains(anchor))) {
				subAnchor = anchor;
			}
			plot.draw(g2, org.jfree.chart.plot.CombinedRangeCategoryPlot.this.subplotArea[i], subAnchor, parentState, subplotInfo);
		}
		if (info != null) {
			info.setDataArea(dataArea);
		}
	}

	public void setOrientation(org.jfree.chart.plot.PlotOrientation orientation) {
		super.setOrientation(orientation);
		java.util.Iterator iterator = org.jfree.chart.plot.CombinedRangeCategoryPlot.this.subplots.iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.plot.CategoryPlot plot = ((org.jfree.chart.plot.CategoryPlot) (iterator.next()));
			plot.setOrientation(orientation);
		} 
	}

	public org.jfree.data.Range getDataRange(org.jfree.chart.axis.ValueAxis axis) {
		org.jfree.data.Range result = null;
		if ((org.jfree.chart.plot.CombinedRangeCategoryPlot.this.subplots) != null) {
			java.util.Iterator iterator = org.jfree.chart.plot.CombinedRangeCategoryPlot.this.subplots.iterator();
			while (iterator.hasNext()) {
				org.jfree.chart.plot.CategoryPlot subplot = ((org.jfree.chart.plot.CategoryPlot) (iterator.next()));
				result = org.jfree.data.Range.combine(result, subplot.getDataRange(axis));
			} 
		}
		return result;
	}

	public org.jfree.chart.LegendItemCollection getLegendItems() {
		org.jfree.chart.LegendItemCollection result = getFixedLegendItems();
		if (result == null) {
			result = new org.jfree.chart.LegendItemCollection();
			if ((org.jfree.chart.plot.CombinedRangeCategoryPlot.this.subplots) != null) {
				java.util.Iterator iterator = org.jfree.chart.plot.CombinedRangeCategoryPlot.this.subplots.iterator();
				while (iterator.hasNext()) {
					org.jfree.chart.plot.CategoryPlot plot = ((org.jfree.chart.plot.CategoryPlot) (iterator.next()));
					org.jfree.chart.LegendItemCollection more = plot.getLegendItems();
					result.addAll(more);
				} 
			}
		}
		return result;
	}

	protected void setFixedDomainAxisSpaceForSubplots(org.jfree.chart.axis.AxisSpace space) {
		java.util.Iterator iterator = org.jfree.chart.plot.CombinedRangeCategoryPlot.this.subplots.iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.plot.CategoryPlot plot = ((org.jfree.chart.plot.CategoryPlot) (iterator.next()));
			plot.setFixedDomainAxisSpace(space, false);
		} 
	}

	public void handleClick(int x, int y, org.jfree.chart.plot.PlotRenderingInfo info) {
		java.awt.geom.Rectangle2D dataArea = info.getDataArea();
		if (dataArea.contains(x, y)) {
			for (int i = 0; i < (org.jfree.chart.plot.CombinedRangeCategoryPlot.this.subplots.size()); i++) {
				org.jfree.chart.plot.CategoryPlot subplot = ((org.jfree.chart.plot.CategoryPlot) (org.jfree.chart.plot.CombinedRangeCategoryPlot.this.subplots.get(i)));
				org.jfree.chart.plot.PlotRenderingInfo subplotInfo = info.getSubplotInfo(i);
				subplot.handleClick(x, y, subplotInfo);
			}
		}
	}

	public void plotChanged(org.jfree.chart.event.PlotChangeEvent event) {
		notifyListeners(event);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.CombinedRangeCategoryPlot.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.CombinedRangeCategoryPlot)) {
			return false;
		}
		org.jfree.chart.plot.CombinedRangeCategoryPlot that = ((org.jfree.chart.plot.CombinedRangeCategoryPlot) (obj));
		if ((org.jfree.chart.plot.CombinedRangeCategoryPlot.this.gap) != (that.gap)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.CombinedRangeCategoryPlot.this.subplots, that.subplots))) {
			return false;
		}
		return super.equals(obj);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.plot.CombinedRangeCategoryPlot result = ((org.jfree.chart.plot.CombinedRangeCategoryPlot) (super.clone()));
		result.subplots = ((java.util.List) (org.jfree.chart.util.ObjectUtilities.deepClone(org.jfree.chart.plot.CombinedRangeCategoryPlot.this.subplots)));
		for (java.util.Iterator it = result.subplots.iterator(); it.hasNext();) {
			org.jfree.chart.plot.Plot child = ((org.jfree.chart.plot.Plot) (it.next()));
			child.setParent(result);
		}
		org.jfree.chart.axis.ValueAxis rangeAxis = result.getRangeAxis();
		if (rangeAxis != null) {
			rangeAxis.configure();
		}
		return result;
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.axis.ValueAxis rangeAxis = getRangeAxis();
		if (rangeAxis != null) {
			rangeAxis.configure();
		}
	}
}

