

package org.jfree.chart.plot;


public class CombinedDomainXYPlot extends org.jfree.chart.plot.XYPlot implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.event.PlotChangeListener , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -7765545541261907383L;

	private java.util.List subplots;

	private int totalWeight = 0;

	private double gap = 5.0;

	private transient java.awt.geom.Rectangle2D[] subplotAreas;

	public CombinedDomainXYPlot() {
		this(new org.jfree.chart.axis.NumberAxis());
	}

	public CombinedDomainXYPlot(org.jfree.chart.axis.ValueAxis domainAxis) {
		super(null, domainAxis, null, null);
		org.jfree.chart.plot.CombinedDomainXYPlot.this.subplots = new java.util.ArrayList();
	}

	public java.lang.String getPlotType() {
		return "Combined_Domain_XYPlot";
	}

	public void setOrientation(org.jfree.chart.plot.PlotOrientation orientation) {
		super.setOrientation(orientation);
		java.util.Iterator iterator = org.jfree.chart.plot.CombinedDomainXYPlot.this.subplots.iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.plot.XYPlot plot = ((org.jfree.chart.plot.XYPlot) (iterator.next()));
			plot.setOrientation(orientation);
		} 
	}

	public org.jfree.data.Range getDataRange(org.jfree.chart.axis.ValueAxis axis) {
		org.jfree.data.Range result = null;
		if ((org.jfree.chart.plot.CombinedDomainXYPlot.this.subplots) != null) {
			java.util.Iterator iterator = org.jfree.chart.plot.CombinedDomainXYPlot.this.subplots.iterator();
			while (iterator.hasNext()) {
				org.jfree.chart.plot.XYPlot subplot = ((org.jfree.chart.plot.XYPlot) (iterator.next()));
				result = org.jfree.data.Range.combine(result, subplot.getDataRange(axis));
			} 
		}
		return result;
	}

	public double getGap() {
		return org.jfree.chart.plot.CombinedDomainXYPlot.this.gap;
	}

	public void setGap(double gap) {
		org.jfree.chart.plot.CombinedDomainXYPlot.this.gap = gap;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.CombinedDomainXYPlot.this));
	}

	public void add(org.jfree.chart.plot.XYPlot subplot) {
		add(subplot, 1);
	}

	public void add(org.jfree.chart.plot.XYPlot subplot, int weight) {
		if (subplot == null) {
			throw new java.lang.IllegalArgumentException("Null 'subplot' argument.");
		}
		if (weight <= 0) {
			throw new java.lang.IllegalArgumentException("Require weight >= 1.");
		}
		subplot.setParent(org.jfree.chart.plot.CombinedDomainXYPlot.this);
		subplot.setWeight(weight);
		subplot.setInsets(new org.jfree.chart.util.RectangleInsets(0.0, 0.0, 0.0, 0.0), false);
		subplot.setDomainAxis(null);
		subplot.addChangeListener(org.jfree.chart.plot.CombinedDomainXYPlot.this);
		org.jfree.chart.plot.CombinedDomainXYPlot.this.subplots.add(subplot);
		org.jfree.chart.plot.CombinedDomainXYPlot.this.totalWeight += weight;
		org.jfree.chart.axis.ValueAxis axis = getDomainAxis();
		if (axis != null) {
			axis.configure();
		}
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.CombinedDomainXYPlot.this));
	}

	public void remove(org.jfree.chart.plot.XYPlot subplot) {
		if (subplot == null) {
			throw new java.lang.IllegalArgumentException(" Null 'subplot' argument.");
		}
		int position = -1;
		int size = org.jfree.chart.plot.CombinedDomainXYPlot.this.subplots.size();
		int i = 0;
		while ((position == (-1)) && (i < size)) {
			if ((org.jfree.chart.plot.CombinedDomainXYPlot.this.subplots.get(i)) == subplot) {
				position = i;
			}
			i++;
		} 
		if (position != (-1)) {
			org.jfree.chart.plot.CombinedDomainXYPlot.this.subplots.remove(position);
			subplot.setParent(null);
			subplot.removeChangeListener(org.jfree.chart.plot.CombinedDomainXYPlot.this);
			org.jfree.chart.plot.CombinedDomainXYPlot.this.totalWeight -= subplot.getWeight();
			org.jfree.chart.axis.ValueAxis domain = getDomainAxis();
			if (domain != null) {
				domain.configure();
			}
			notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.CombinedDomainXYPlot.this));
		}
	}

	public java.util.List getSubplots() {
		return java.util.Collections.unmodifiableList(org.jfree.chart.plot.CombinedDomainXYPlot.this.subplots);
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
			org.jfree.chart.axis.ValueAxis xAxis = getDomainAxis();
			org.jfree.chart.util.RectangleEdge xEdge = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(getDomainAxisLocation(), orientation);
			if (xAxis != null) {
				space = xAxis.reserveSpace(g2, org.jfree.chart.plot.CombinedDomainXYPlot.this, plotArea, xEdge, space);
			}
		}
		java.awt.geom.Rectangle2D adjustedPlotArea = space.shrink(plotArea, null);
		int n = org.jfree.chart.plot.CombinedDomainXYPlot.this.subplots.size();
		org.jfree.chart.plot.CombinedDomainXYPlot.this.subplotAreas = new java.awt.geom.Rectangle2D[n];
		double x = adjustedPlotArea.getX();
		double y = adjustedPlotArea.getY();
		double usableSize = 0.0;
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			usableSize = (adjustedPlotArea.getWidth()) - ((org.jfree.chart.plot.CombinedDomainXYPlot.this.gap) * (n - 1));
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				usableSize = (adjustedPlotArea.getHeight()) - ((org.jfree.chart.plot.CombinedDomainXYPlot.this.gap) * (n - 1));
			}
		
		for (int i = 0; i < n; i++) {
			org.jfree.chart.plot.XYPlot plot = ((org.jfree.chart.plot.XYPlot) (org.jfree.chart.plot.CombinedDomainXYPlot.this.subplots.get(i)));
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				double w = (usableSize * (plot.getWeight())) / (org.jfree.chart.plot.CombinedDomainXYPlot.this.totalWeight);
				org.jfree.chart.plot.CombinedDomainXYPlot.this.subplotAreas[i] = new java.awt.geom.Rectangle2D.Double(x, y, w, adjustedPlotArea.getHeight());
				x = (x + w) + (org.jfree.chart.plot.CombinedDomainXYPlot.this.gap);
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					double h = (usableSize * (plot.getWeight())) / (org.jfree.chart.plot.CombinedDomainXYPlot.this.totalWeight);
					org.jfree.chart.plot.CombinedDomainXYPlot.this.subplotAreas[i] = new java.awt.geom.Rectangle2D.Double(x, y, adjustedPlotArea.getWidth(), h);
					y = (y + h) + (org.jfree.chart.plot.CombinedDomainXYPlot.this.gap);
				}
			
			org.jfree.chart.axis.AxisSpace subSpace = plot.calculateRangeAxisSpace(g2, org.jfree.chart.plot.CombinedDomainXYPlot.this.subplotAreas[i], null);
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
		setFixedRangeAxisSpaceForSubplots(space);
		org.jfree.chart.axis.ValueAxis axis = getDomainAxis();
		org.jfree.chart.util.RectangleEdge edge = getDomainAxisEdge();
		double cursor = org.jfree.chart.util.RectangleEdge.coordinate(dataArea, edge);
		org.jfree.chart.axis.AxisState axisState = axis.draw(g2, cursor, area, dataArea, edge, info);
		if (parentState == null) {
			parentState = new org.jfree.chart.plot.PlotState();
		}
		parentState.getSharedAxisStates().put(axis, axisState);
		for (int i = 0; i < (org.jfree.chart.plot.CombinedDomainXYPlot.this.subplots.size()); i++) {
			org.jfree.chart.plot.XYPlot plot = ((org.jfree.chart.plot.XYPlot) (org.jfree.chart.plot.CombinedDomainXYPlot.this.subplots.get(i)));
			org.jfree.chart.plot.PlotRenderingInfo subplotInfo = null;
			if (info != null) {
				subplotInfo = new org.jfree.chart.plot.PlotRenderingInfo(info.getOwner());
				info.addSubplotInfo(subplotInfo);
			}
			plot.draw(g2, org.jfree.chart.plot.CombinedDomainXYPlot.this.subplotAreas[i], anchor, parentState, subplotInfo);
		}
		if (info != null) {
			info.setDataArea(dataArea);
		}
	}

	public org.jfree.chart.LegendItemCollection getLegendItems() {
		org.jfree.chart.LegendItemCollection result = getFixedLegendItems();
		if (result == null) {
			result = new org.jfree.chart.LegendItemCollection();
			if ((org.jfree.chart.plot.CombinedDomainXYPlot.this.subplots) != null) {
				java.util.Iterator iterator = org.jfree.chart.plot.CombinedDomainXYPlot.this.subplots.iterator();
				while (iterator.hasNext()) {
					org.jfree.chart.plot.XYPlot plot = ((org.jfree.chart.plot.XYPlot) (iterator.next()));
					org.jfree.chart.LegendItemCollection more = plot.getLegendItems();
					result.addAll(more);
				} 
			}
		}
		return result;
	}

	public void zoomRangeAxes(double factor, org.jfree.chart.plot.PlotRenderingInfo info, java.awt.geom.Point2D source) {
		org.jfree.chart.plot.XYPlot subplot = findSubplot(info, source);
		if (subplot != null) {
			subplot.zoomRangeAxes(factor, info, source);
		}else {
			java.util.Iterator iterator = getSubplots().iterator();
			while (iterator.hasNext()) {
				subplot = ((org.jfree.chart.plot.XYPlot) (iterator.next()));
				subplot.zoomRangeAxes(factor, info, source);
			} 
		}
	}

	public void zoomRangeAxes(double lowerPercent, double upperPercent, org.jfree.chart.plot.PlotRenderingInfo info, java.awt.geom.Point2D source) {
		org.jfree.chart.plot.XYPlot subplot = findSubplot(info, source);
		if (subplot != null) {
			subplot.zoomRangeAxes(lowerPercent, upperPercent, info, source);
		}else {
			java.util.Iterator iterator = getSubplots().iterator();
			while (iterator.hasNext()) {
				subplot = ((org.jfree.chart.plot.XYPlot) (iterator.next()));
				subplot.zoomRangeAxes(lowerPercent, upperPercent, info, source);
			} 
		}
	}

	public org.jfree.chart.plot.XYPlot findSubplot(org.jfree.chart.plot.PlotRenderingInfo info, java.awt.geom.Point2D source) {
		if (info == null) {
			throw new java.lang.IllegalArgumentException("Null 'info' argument.");
		}
		if (source == null) {
			throw new java.lang.IllegalArgumentException("Null 'source' argument.");
		}
		org.jfree.chart.plot.XYPlot result = null;
		int subplotIndex = info.getSubplotIndex(source);
		if (subplotIndex >= 0) {
			result = ((org.jfree.chart.plot.XYPlot) (org.jfree.chart.plot.CombinedDomainXYPlot.this.subplots.get(subplotIndex)));
		}
		return result;
	}

	public void setRenderer(org.jfree.chart.renderer.xy.XYItemRenderer renderer) {
		super.setRenderer(renderer);
		java.util.Iterator iterator = org.jfree.chart.plot.CombinedDomainXYPlot.this.subplots.iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.plot.XYPlot plot = ((org.jfree.chart.plot.XYPlot) (iterator.next()));
			plot.setRenderer(renderer);
		} 
	}

	public void setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace space) {
		super.setFixedRangeAxisSpace(space);
		setFixedRangeAxisSpaceForSubplots(space);
		org.jfree.chart.plot.CombinedDomainXYPlot.this.notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.CombinedDomainXYPlot.this));
	}

	protected void setFixedRangeAxisSpaceForSubplots(org.jfree.chart.axis.AxisSpace space) {
		java.util.Iterator iterator = org.jfree.chart.plot.CombinedDomainXYPlot.this.subplots.iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.plot.XYPlot plot = ((org.jfree.chart.plot.XYPlot) (iterator.next()));
			plot.setFixedRangeAxisSpace(space, false);
		} 
	}

	public void handleClick(int x, int y, org.jfree.chart.plot.PlotRenderingInfo info) {
		java.awt.geom.Rectangle2D dataArea = info.getDataArea();
		if (dataArea.contains(x, y)) {
			for (int i = 0; i < (org.jfree.chart.plot.CombinedDomainXYPlot.this.subplots.size()); i++) {
				org.jfree.chart.plot.XYPlot subplot = ((org.jfree.chart.plot.XYPlot) (org.jfree.chart.plot.CombinedDomainXYPlot.this.subplots.get(i)));
				org.jfree.chart.plot.PlotRenderingInfo subplotInfo = info.getSubplotInfo(i);
				subplot.handleClick(x, y, subplotInfo);
			}
		}
	}

	public void plotChanged(org.jfree.chart.event.PlotChangeEvent event) {
		notifyListeners(event);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == (org.jfree.chart.plot.CombinedDomainXYPlot.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.CombinedDomainXYPlot)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.chart.plot.CombinedDomainXYPlot p = ((org.jfree.chart.plot.CombinedDomainXYPlot) (obj));
		if ((org.jfree.chart.plot.CombinedDomainXYPlot.this.totalWeight) != (p.totalWeight)) {
			return false;
		}
		if ((org.jfree.chart.plot.CombinedDomainXYPlot.this.gap) != (p.gap)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.CombinedDomainXYPlot.this.subplots, p.subplots))) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.plot.CombinedDomainXYPlot result = ((org.jfree.chart.plot.CombinedDomainXYPlot) (super.clone()));
		result.subplots = ((java.util.List) (org.jfree.chart.util.ObjectUtilities.deepClone(org.jfree.chart.plot.CombinedDomainXYPlot.this.subplots)));
		for (java.util.Iterator it = result.subplots.iterator(); it.hasNext();) {
			org.jfree.chart.plot.Plot child = ((org.jfree.chart.plot.Plot) (it.next()));
			child.setParent(result);
		}
		org.jfree.chart.axis.ValueAxis domainAxis = result.getDomainAxis();
		if (domainAxis != null) {
			domainAxis.configure();
		}
		return result;
	}
}

