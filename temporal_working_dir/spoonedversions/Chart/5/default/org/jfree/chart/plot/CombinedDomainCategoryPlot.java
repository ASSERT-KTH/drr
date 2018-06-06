

package org.jfree.chart.plot;


public class CombinedDomainCategoryPlot extends org.jfree.chart.plot.CategoryPlot implements org.jfree.chart.event.PlotChangeListener {
	private static final long serialVersionUID = 8207194522653701572L;

	private java.util.List subplots;

	private double gap;

	private transient java.awt.geom.Rectangle2D[] subplotAreas;

	public CombinedDomainCategoryPlot() {
		this(new org.jfree.chart.axis.CategoryAxis());
	}

	public CombinedDomainCategoryPlot(org.jfree.chart.axis.CategoryAxis domainAxis) {
		super(null, domainAxis, null, null);
		org.jfree.chart.plot.CombinedDomainCategoryPlot.this.subplots = new java.util.ArrayList();
		org.jfree.chart.plot.CombinedDomainCategoryPlot.this.gap = 5.0;
	}

	public double getGap() {
		return org.jfree.chart.plot.CombinedDomainCategoryPlot.this.gap;
	}

	public void setGap(double gap) {
		org.jfree.chart.plot.CombinedDomainCategoryPlot.this.gap = gap;
		fireChangeEvent();
	}

	public void add(org.jfree.chart.plot.CategoryPlot subplot) {
		add(subplot, 1);
	}

	public void add(org.jfree.chart.plot.CategoryPlot subplot, int weight) {
		if (subplot == null) {
			throw new java.lang.IllegalArgumentException("Null 'subplot' argument.");
		}
		if (weight < 1) {
			throw new java.lang.IllegalArgumentException("Require weight >= 1.");
		}
		subplot.setParent(org.jfree.chart.plot.CombinedDomainCategoryPlot.this);
		subplot.setWeight(weight);
		subplot.setInsets(new org.jfree.chart.util.RectangleInsets(0.0, 0.0, 0.0, 0.0));
		subplot.setDomainAxis(null);
		subplot.setOrientation(getOrientation());
		subplot.addChangeListener(org.jfree.chart.plot.CombinedDomainCategoryPlot.this);
		org.jfree.chart.plot.CombinedDomainCategoryPlot.this.subplots.add(subplot);
		org.jfree.chart.axis.CategoryAxis axis = getDomainAxis();
		if (axis != null) {
			axis.configure();
		}
		fireChangeEvent();
	}

	public void remove(org.jfree.chart.plot.CategoryPlot subplot) {
		if (subplot == null) {
			throw new java.lang.IllegalArgumentException("Null 'subplot' argument.");
		}
		int position = -1;
		int size = org.jfree.chart.plot.CombinedDomainCategoryPlot.this.subplots.size();
		int i = 0;
		while ((position == (-1)) && (i < size)) {
			if ((org.jfree.chart.plot.CombinedDomainCategoryPlot.this.subplots.get(i)) == subplot) {
				position = i;
			}
			i++;
		} 
		if (position != (-1)) {
			org.jfree.chart.plot.CombinedDomainCategoryPlot.this.subplots.remove(position);
			subplot.setParent(null);
			subplot.removeChangeListener(org.jfree.chart.plot.CombinedDomainCategoryPlot.this);
			org.jfree.chart.axis.CategoryAxis domain = getDomainAxis();
			if (domain != null) {
				domain.configure();
			}
			fireChangeEvent();
		}
	}

	public java.util.List getSubplots() {
		if ((org.jfree.chart.plot.CombinedDomainCategoryPlot.this.subplots) != null) {
			return java.util.Collections.unmodifiableList(org.jfree.chart.plot.CombinedDomainCategoryPlot.this.subplots);
		}else {
			return java.util.Collections.EMPTY_LIST;
		}
	}

	public org.jfree.chart.plot.CategoryPlot findSubplot(org.jfree.chart.plot.PlotRenderingInfo info, java.awt.geom.Point2D source) {
		if (info == null) {
			throw new java.lang.IllegalArgumentException("Null 'info' argument.");
		}
		if (source == null) {
			throw new java.lang.IllegalArgumentException("Null 'source' argument.");
		}
		org.jfree.chart.plot.CategoryPlot result = null;
		int subplotIndex = info.getSubplotIndex(source);
		if (subplotIndex >= 0) {
			result = ((org.jfree.chart.plot.CategoryPlot) (org.jfree.chart.plot.CombinedDomainCategoryPlot.this.subplots.get(subplotIndex)));
		}
		return result;
	}

	public void zoomRangeAxes(double factor, org.jfree.chart.plot.PlotRenderingInfo info, java.awt.geom.Point2D source) {
		zoomRangeAxes(factor, info, source, false);
	}

	public void zoomRangeAxes(double factor, org.jfree.chart.plot.PlotRenderingInfo info, java.awt.geom.Point2D source, boolean useAnchor) {
		org.jfree.chart.plot.CategoryPlot subplot = findSubplot(info, source);
		if (subplot != null) {
			subplot.zoomRangeAxes(factor, info, source, useAnchor);
		}else {
			java.util.Iterator iterator = getSubplots().iterator();
			while (iterator.hasNext()) {
				subplot = ((org.jfree.chart.plot.CategoryPlot) (iterator.next()));
				subplot.zoomRangeAxes(factor, info, source, useAnchor);
			} 
		}
	}

	public void zoomRangeAxes(double lowerPercent, double upperPercent, org.jfree.chart.plot.PlotRenderingInfo info, java.awt.geom.Point2D source) {
		org.jfree.chart.plot.CategoryPlot subplot = findSubplot(info, source);
		if (subplot != null) {
			subplot.zoomRangeAxes(lowerPercent, upperPercent, info, source);
		}else {
			java.util.Iterator iterator = getSubplots().iterator();
			while (iterator.hasNext()) {
				subplot = ((org.jfree.chart.plot.CategoryPlot) (iterator.next()));
				subplot.zoomRangeAxes(lowerPercent, upperPercent, info, source);
			} 
		}
	}

	protected org.jfree.chart.axis.AxisSpace calculateAxisSpace(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea) {
		org.jfree.chart.axis.AxisSpace space = new org.jfree.chart.axis.AxisSpace();
		org.jfree.chart.plot.PlotOrientation orientation = getOrientation();
		org.jfree.chart.axis.AxisSpace fixed = getFixedDomainAxisSpace();
		if (fixed != null) {
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				space.setLeft(fixed.getLeft());
				space.setRight(fixed.getRight());
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					space.setTop(fixed.getTop());
					space.setBottom(fixed.getBottom());
				}
			
		}else {
			org.jfree.chart.axis.CategoryAxis categoryAxis = getDomainAxis();
			org.jfree.chart.util.RectangleEdge categoryEdge = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(getDomainAxisLocation(), orientation);
			if (categoryAxis != null) {
				space = categoryAxis.reserveSpace(g2, org.jfree.chart.plot.CombinedDomainCategoryPlot.this, plotArea, categoryEdge, space);
			}else {
				if (getDrawSharedDomainAxis()) {
					space = getDomainAxis().reserveSpace(g2, org.jfree.chart.plot.CombinedDomainCategoryPlot.this, plotArea, categoryEdge, space);
				}
			}
		}
		java.awt.geom.Rectangle2D adjustedPlotArea = space.shrink(plotArea, null);
		int n = org.jfree.chart.plot.CombinedDomainCategoryPlot.this.subplots.size();
		int totalWeight = 0;
		for (int i = 0; i < n; i++) {
			org.jfree.chart.plot.CategoryPlot sub = ((org.jfree.chart.plot.CategoryPlot) (org.jfree.chart.plot.CombinedDomainCategoryPlot.this.subplots.get(i)));
			totalWeight += sub.getWeight();
		}
		org.jfree.chart.plot.CombinedDomainCategoryPlot.this.subplotAreas = new java.awt.geom.Rectangle2D[n];
		double x = adjustedPlotArea.getX();
		double y = adjustedPlotArea.getY();
		double usableSize = 0.0;
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			usableSize = (adjustedPlotArea.getWidth()) - ((org.jfree.chart.plot.CombinedDomainCategoryPlot.this.gap) * (n - 1));
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				usableSize = (adjustedPlotArea.getHeight()) - ((org.jfree.chart.plot.CombinedDomainCategoryPlot.this.gap) * (n - 1));
			}
		
		for (int i = 0; i < n; i++) {
			org.jfree.chart.plot.CategoryPlot plot = ((org.jfree.chart.plot.CategoryPlot) (org.jfree.chart.plot.CombinedDomainCategoryPlot.this.subplots.get(i)));
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				double w = (usableSize * (plot.getWeight())) / totalWeight;
				org.jfree.chart.plot.CombinedDomainCategoryPlot.this.subplotAreas[i] = new java.awt.geom.Rectangle2D.Double(x, y, w, adjustedPlotArea.getHeight());
				x = (x + w) + (org.jfree.chart.plot.CombinedDomainCategoryPlot.this.gap);
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					double h = (usableSize * (plot.getWeight())) / totalWeight;
					org.jfree.chart.plot.CombinedDomainCategoryPlot.this.subplotAreas[i] = new java.awt.geom.Rectangle2D.Double(x, y, adjustedPlotArea.getWidth(), h);
					y = (y + h) + (org.jfree.chart.plot.CombinedDomainCategoryPlot.this.gap);
				}
			
			org.jfree.chart.axis.AxisSpace subSpace = plot.calculateRangeAxisSpace(g2, org.jfree.chart.plot.CombinedDomainCategoryPlot.this.subplotAreas[i], null);
			space.ensureAtLeast(subSpace);
		}
		return space;
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.awt.geom.Point2D anchor, org.jfree.chart.plot.PlotState parentState, org.jfree.chart.plot.PlotRenderingInfo info) {
		if (info != null) {
			info.setPlotArea(area);
		}
		org.jfree.chart.util.RectangleInsets insets = getInsets();
		area.setRect(((area.getX()) + (insets.getLeft())), ((area.getY()) + (insets.getTop())), (((area.getWidth()) - (insets.getLeft())) - (insets.getRight())), (((area.getHeight()) - (insets.getTop())) - (insets.getBottom())));
		setFixedRangeAxisSpaceForSubplots(null);
		org.jfree.chart.axis.AxisSpace space = calculateAxisSpace(g2, area);
		java.awt.geom.Rectangle2D dataArea = space.shrink(area, null);
		setFixedRangeAxisSpaceForSubplots(space);
		org.jfree.chart.axis.CategoryAxis axis = getDomainAxis();
		org.jfree.chart.util.RectangleEdge domainEdge = getDomainAxisEdge();
		double cursor = org.jfree.chart.util.RectangleEdge.coordinate(dataArea, domainEdge);
		org.jfree.chart.axis.AxisState axisState = axis.draw(g2, cursor, area, dataArea, domainEdge, info);
		if (parentState == null) {
			parentState = new org.jfree.chart.plot.PlotState();
		}
		parentState.getSharedAxisStates().put(axis, axisState);
		for (int i = 0; i < (org.jfree.chart.plot.CombinedDomainCategoryPlot.this.subplots.size()); i++) {
			org.jfree.chart.plot.CategoryPlot plot = ((org.jfree.chart.plot.CategoryPlot) (org.jfree.chart.plot.CombinedDomainCategoryPlot.this.subplots.get(i)));
			org.jfree.chart.plot.PlotRenderingInfo subplotInfo = null;
			if (info != null) {
				subplotInfo = new org.jfree.chart.plot.PlotRenderingInfo(info.getOwner());
				info.addSubplotInfo(subplotInfo);
			}
			java.awt.geom.Point2D subAnchor = null;
			if ((anchor != null) && (org.jfree.chart.plot.CombinedDomainCategoryPlot.this.subplotAreas[i].contains(anchor))) {
				subAnchor = anchor;
			}
			plot.draw(g2, org.jfree.chart.plot.CombinedDomainCategoryPlot.this.subplotAreas[i], subAnchor, parentState, subplotInfo);
		}
		if (info != null) {
			info.setDataArea(dataArea);
		}
	}

	protected void setFixedRangeAxisSpaceForSubplots(org.jfree.chart.axis.AxisSpace space) {
		java.util.Iterator iterator = org.jfree.chart.plot.CombinedDomainCategoryPlot.this.subplots.iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.plot.CategoryPlot plot = ((org.jfree.chart.plot.CategoryPlot) (iterator.next()));
			plot.setFixedRangeAxisSpace(space, false);
		} 
	}

	public void setOrientation(org.jfree.chart.plot.PlotOrientation orientation) {
		super.setOrientation(orientation);
		java.util.Iterator iterator = org.jfree.chart.plot.CombinedDomainCategoryPlot.this.subplots.iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.plot.CategoryPlot plot = ((org.jfree.chart.plot.CategoryPlot) (iterator.next()));
			plot.setOrientation(orientation);
		} 
	}

	public org.jfree.data.Range getDataRange(org.jfree.chart.axis.ValueAxis axis) {
		return super.getDataRange(axis);
	}

	public org.jfree.chart.LegendItemCollection getLegendItems() {
		org.jfree.chart.LegendItemCollection result = getFixedLegendItems();
		if (result == null) {
			result = new org.jfree.chart.LegendItemCollection();
			if ((org.jfree.chart.plot.CombinedDomainCategoryPlot.this.subplots) != null) {
				java.util.Iterator iterator = org.jfree.chart.plot.CombinedDomainCategoryPlot.this.subplots.iterator();
				while (iterator.hasNext()) {
					org.jfree.chart.plot.CategoryPlot plot = ((org.jfree.chart.plot.CategoryPlot) (iterator.next()));
					org.jfree.chart.LegendItemCollection more = plot.getLegendItems();
					result.addAll(more);
				} 
			}
		}
		return result;
	}

	public java.util.List getCategories() {
		java.util.List result = new java.util.ArrayList();
		if ((org.jfree.chart.plot.CombinedDomainCategoryPlot.this.subplots) != null) {
			java.util.Iterator iterator = org.jfree.chart.plot.CombinedDomainCategoryPlot.this.subplots.iterator();
			while (iterator.hasNext()) {
				org.jfree.chart.plot.CategoryPlot plot = ((org.jfree.chart.plot.CategoryPlot) (iterator.next()));
				java.util.List more = plot.getCategories();
				java.util.Iterator moreIterator = more.iterator();
				while (moreIterator.hasNext()) {
					java.lang.Comparable category = ((java.lang.Comparable) (moreIterator.next()));
					if (!(result.contains(category))) {
						result.add(category);
					}
				} 
			} 
		}
		return java.util.Collections.unmodifiableList(result);
	}

	public java.util.List getCategoriesForAxis(org.jfree.chart.axis.CategoryAxis axis) {
		return getCategories();
	}

	public void handleClick(int x, int y, org.jfree.chart.plot.PlotRenderingInfo info) {
		java.awt.geom.Rectangle2D dataArea = info.getDataArea();
		if (dataArea.contains(x, y)) {
			for (int i = 0; i < (org.jfree.chart.plot.CombinedDomainCategoryPlot.this.subplots.size()); i++) {
				org.jfree.chart.plot.CategoryPlot subplot = ((org.jfree.chart.plot.CategoryPlot) (org.jfree.chart.plot.CombinedDomainCategoryPlot.this.subplots.get(i)));
				org.jfree.chart.plot.PlotRenderingInfo subplotInfo = info.getSubplotInfo(i);
				subplot.handleClick(x, y, subplotInfo);
			}
		}
	}

	public void plotChanged(org.jfree.chart.event.PlotChangeEvent event) {
		notifyListeners(event);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.CombinedDomainCategoryPlot.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.CombinedDomainCategoryPlot)) {
			return false;
		}
		org.jfree.chart.plot.CombinedDomainCategoryPlot that = ((org.jfree.chart.plot.CombinedDomainCategoryPlot) (obj));
		if ((org.jfree.chart.plot.CombinedDomainCategoryPlot.this.gap) != (that.gap)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.CombinedDomainCategoryPlot.this.subplots, that.subplots))) {
			return false;
		}
		return super.equals(obj);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.plot.CombinedDomainCategoryPlot result = ((org.jfree.chart.plot.CombinedDomainCategoryPlot) (super.clone()));
		result.subplots = ((java.util.List) (org.jfree.chart.util.ObjectUtilities.deepClone(org.jfree.chart.plot.CombinedDomainCategoryPlot.this.subplots)));
		for (java.util.Iterator it = result.subplots.iterator(); it.hasNext();) {
			org.jfree.chart.plot.Plot child = ((org.jfree.chart.plot.Plot) (it.next()));
			child.setParent(result);
		}
		return result;
	}
}

