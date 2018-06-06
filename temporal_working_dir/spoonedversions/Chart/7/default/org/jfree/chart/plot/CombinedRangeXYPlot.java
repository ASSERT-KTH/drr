

package org.jfree.chart.plot;


public class CombinedRangeXYPlot extends org.jfree.chart.plot.XYPlot implements org.jfree.chart.event.PlotChangeListener {
	private static final long serialVersionUID = -5177814085082031168L;

	private java.util.List subplots;

	private int totalWeight = 0;

	private double gap = 5.0;

	private transient java.awt.geom.Rectangle2D[] subplotAreas;

	public CombinedRangeXYPlot() {
		this(new org.jfree.chart.axis.NumberAxis());
	}

	public CombinedRangeXYPlot(org.jfree.chart.axis.ValueAxis rangeAxis) {
		super(null, null, rangeAxis, null);
		org.jfree.chart.plot.CombinedRangeXYPlot.this.subplots = new java.util.ArrayList();
	}

	public java.lang.String getPlotType() {
		return org.jfree.chart.plot.XYPlot.localizationResources.getString("Combined_Range_XYPlot");
	}

	public double getGap() {
		return org.jfree.chart.plot.CombinedRangeXYPlot.this.gap;
	}

	public void setGap(double gap) {
		org.jfree.chart.plot.CombinedRangeXYPlot.this.gap = gap;
	}

	public void add(org.jfree.chart.plot.XYPlot subplot) {
		add(subplot, 1);
	}

	public void add(org.jfree.chart.plot.XYPlot subplot, int weight) {
		if (weight <= 0) {
			java.lang.String msg = "The 'weight' must be positive.";
			throw new java.lang.IllegalArgumentException(msg);
		}
		subplot.setParent(org.jfree.chart.plot.CombinedRangeXYPlot.this);
		subplot.setWeight(weight);
		subplot.setInsets(new org.jfree.chart.util.RectangleInsets(0.0, 0.0, 0.0, 0.0));
		subplot.setRangeAxis(null);
		subplot.addChangeListener(org.jfree.chart.plot.CombinedRangeXYPlot.this);
		org.jfree.chart.plot.CombinedRangeXYPlot.this.subplots.add(subplot);
		org.jfree.chart.plot.CombinedRangeXYPlot.this.totalWeight += weight;
		configureRangeAxes();
		fireChangeEvent();
	}

	public void remove(org.jfree.chart.plot.XYPlot subplot) {
		if (subplot == null) {
			throw new java.lang.IllegalArgumentException(" Null 'subplot' argument.");
		}
		int position = -1;
		int size = org.jfree.chart.plot.CombinedRangeXYPlot.this.subplots.size();
		int i = 0;
		while ((position == (-1)) && (i < size)) {
			if ((org.jfree.chart.plot.CombinedRangeXYPlot.this.subplots.get(i)) == subplot) {
				position = i;
			}
			i++;
		} 
		if (position != (-1)) {
			org.jfree.chart.plot.CombinedRangeXYPlot.this.subplots.remove(position);
			subplot.setParent(null);
			subplot.removeChangeListener(org.jfree.chart.plot.CombinedRangeXYPlot.this);
			org.jfree.chart.plot.CombinedRangeXYPlot.this.totalWeight -= subplot.getWeight();
			configureRangeAxes();
			fireChangeEvent();
		}
	}

	public java.util.List getSubplots() {
		if ((org.jfree.chart.plot.CombinedRangeXYPlot.this.subplots) != null) {
			return java.util.Collections.unmodifiableList(org.jfree.chart.plot.CombinedRangeXYPlot.this.subplots);
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
				space = valueAxis.reserveSpace(g2, org.jfree.chart.plot.CombinedRangeXYPlot.this, plotArea, valueEdge, space);
			}
		}
		java.awt.geom.Rectangle2D adjustedPlotArea = space.shrink(plotArea, null);
		int n = org.jfree.chart.plot.CombinedRangeXYPlot.this.subplots.size();
		org.jfree.chart.plot.CombinedRangeXYPlot.this.subplotAreas = new java.awt.geom.Rectangle2D[n];
		double x = adjustedPlotArea.getX();
		double y = adjustedPlotArea.getY();
		double usableSize = 0.0;
		if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
			usableSize = (adjustedPlotArea.getWidth()) - ((org.jfree.chart.plot.CombinedRangeXYPlot.this.gap) * (n - 1));
		}else
			if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				usableSize = (adjustedPlotArea.getHeight()) - ((org.jfree.chart.plot.CombinedRangeXYPlot.this.gap) * (n - 1));
			}
		
		for (int i = 0; i < n; i++) {
			org.jfree.chart.plot.XYPlot plot = ((org.jfree.chart.plot.XYPlot) (org.jfree.chart.plot.CombinedRangeXYPlot.this.subplots.get(i)));
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				double w = (usableSize * (plot.getWeight())) / (org.jfree.chart.plot.CombinedRangeXYPlot.this.totalWeight);
				org.jfree.chart.plot.CombinedRangeXYPlot.this.subplotAreas[i] = new java.awt.geom.Rectangle2D.Double(x, y, w, adjustedPlotArea.getHeight());
				x = (x + w) + (org.jfree.chart.plot.CombinedRangeXYPlot.this.gap);
			}else
				if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
					double h = (usableSize * (plot.getWeight())) / (org.jfree.chart.plot.CombinedRangeXYPlot.this.totalWeight);
					org.jfree.chart.plot.CombinedRangeXYPlot.this.subplotAreas[i] = new java.awt.geom.Rectangle2D.Double(x, y, adjustedPlotArea.getWidth(), h);
					y = (y + h) + (org.jfree.chart.plot.CombinedRangeXYPlot.this.gap);
				}
			
			org.jfree.chart.axis.AxisSpace subSpace = plot.calculateDomainAxisSpace(g2, org.jfree.chart.plot.CombinedRangeXYPlot.this.subplotAreas[i], null);
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
		org.jfree.chart.util.RectangleEdge edge = getRangeAxisEdge();
		double cursor = org.jfree.chart.util.RectangleEdge.coordinate(dataArea, edge);
		org.jfree.chart.axis.AxisState axisState = axis.draw(g2, cursor, area, dataArea, edge, info);
		if (parentState == null) {
			parentState = new org.jfree.chart.plot.PlotState();
		}
		parentState.getSharedAxisStates().put(axis, axisState);
		for (int i = 0; i < (org.jfree.chart.plot.CombinedRangeXYPlot.this.subplots.size()); i++) {
			org.jfree.chart.plot.XYPlot plot = ((org.jfree.chart.plot.XYPlot) (org.jfree.chart.plot.CombinedRangeXYPlot.this.subplots.get(i)));
			org.jfree.chart.plot.PlotRenderingInfo subplotInfo = null;
			if (info != null) {
				subplotInfo = new org.jfree.chart.plot.PlotRenderingInfo(info.getOwner());
				info.addSubplotInfo(subplotInfo);
			}
			plot.draw(g2, org.jfree.chart.plot.CombinedRangeXYPlot.this.subplotAreas[i], anchor, parentState, subplotInfo);
		}
		if (info != null) {
			info.setDataArea(dataArea);
		}
	}

	public org.jfree.chart.LegendItemCollection getLegendItems() {
		org.jfree.chart.LegendItemCollection result = getFixedLegendItems();
		if (result == null) {
			result = new org.jfree.chart.LegendItemCollection();
			if ((org.jfree.chart.plot.CombinedRangeXYPlot.this.subplots) != null) {
				java.util.Iterator iterator = org.jfree.chart.plot.CombinedRangeXYPlot.this.subplots.iterator();
				while (iterator.hasNext()) {
					org.jfree.chart.plot.XYPlot plot = ((org.jfree.chart.plot.XYPlot) (iterator.next()));
					org.jfree.chart.LegendItemCollection more = plot.getLegendItems();
					result.addAll(more);
				} 
			}
		}
		return result;
	}

	public void zoomDomainAxes(double factor, org.jfree.chart.plot.PlotRenderingInfo info, java.awt.geom.Point2D source) {
		org.jfree.chart.plot.XYPlot subplot = findSubplot(info, source);
		if (subplot != null) {
			subplot.zoomDomainAxes(factor, info, source);
		}else {
			java.util.Iterator iterator = getSubplots().iterator();
			while (iterator.hasNext()) {
				subplot = ((org.jfree.chart.plot.XYPlot) (iterator.next()));
				subplot.zoomDomainAxes(factor, info, source);
			} 
		}
	}

	public void zoomDomainAxes(double lowerPercent, double upperPercent, org.jfree.chart.plot.PlotRenderingInfo info, java.awt.geom.Point2D source) {
		org.jfree.chart.plot.XYPlot subplot = findSubplot(info, source);
		if (subplot != null) {
			subplot.zoomDomainAxes(lowerPercent, upperPercent, info, source);
		}else {
			java.util.Iterator iterator = getSubplots().iterator();
			while (iterator.hasNext()) {
				subplot = ((org.jfree.chart.plot.XYPlot) (iterator.next()));
				subplot.zoomDomainAxes(lowerPercent, upperPercent, info, source);
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
			result = ((org.jfree.chart.plot.XYPlot) (org.jfree.chart.plot.CombinedRangeXYPlot.this.subplots.get(subplotIndex)));
		}
		return result;
	}

	public void setRenderer(org.jfree.chart.renderer.xy.XYItemRenderer renderer) {
		super.setRenderer(renderer);
		java.util.Iterator iterator = org.jfree.chart.plot.CombinedRangeXYPlot.this.subplots.iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.plot.XYPlot plot = ((org.jfree.chart.plot.XYPlot) (iterator.next()));
			plot.setRenderer(renderer);
		} 
	}

	public void setOrientation(org.jfree.chart.plot.PlotOrientation orientation) {
		super.setOrientation(orientation);
		java.util.Iterator iterator = org.jfree.chart.plot.CombinedRangeXYPlot.this.subplots.iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.plot.XYPlot plot = ((org.jfree.chart.plot.XYPlot) (iterator.next()));
			plot.setOrientation(orientation);
		} 
	}

	public org.jfree.data.Range getDataRange(org.jfree.chart.axis.ValueAxis axis) {
		org.jfree.data.Range result = null;
		if ((org.jfree.chart.plot.CombinedRangeXYPlot.this.subplots) != null) {
			java.util.Iterator iterator = org.jfree.chart.plot.CombinedRangeXYPlot.this.subplots.iterator();
			while (iterator.hasNext()) {
				org.jfree.chart.plot.XYPlot subplot = ((org.jfree.chart.plot.XYPlot) (iterator.next()));
				result = org.jfree.data.Range.combine(result, subplot.getDataRange(axis));
			} 
		}
		return result;
	}

	protected void setFixedDomainAxisSpaceForSubplots(org.jfree.chart.axis.AxisSpace space) {
		java.util.Iterator iterator = org.jfree.chart.plot.CombinedRangeXYPlot.this.subplots.iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.plot.XYPlot plot = ((org.jfree.chart.plot.XYPlot) (iterator.next()));
			plot.setFixedDomainAxisSpace(space, false);
		} 
	}

	public void handleClick(int x, int y, org.jfree.chart.plot.PlotRenderingInfo info) {
		java.awt.geom.Rectangle2D dataArea = info.getDataArea();
		if (dataArea.contains(x, y)) {
			for (int i = 0; i < (org.jfree.chart.plot.CombinedRangeXYPlot.this.subplots.size()); i++) {
				org.jfree.chart.plot.XYPlot subplot = ((org.jfree.chart.plot.XYPlot) (org.jfree.chart.plot.CombinedRangeXYPlot.this.subplots.get(i)));
				org.jfree.chart.plot.PlotRenderingInfo subplotInfo = info.getSubplotInfo(i);
				subplot.handleClick(x, y, subplotInfo);
			}
		}
	}

	public void plotChanged(org.jfree.chart.event.PlotChangeEvent event) {
		notifyListeners(event);
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.CombinedRangeXYPlot.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.CombinedRangeXYPlot)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.chart.plot.CombinedRangeXYPlot that = ((org.jfree.chart.plot.CombinedRangeXYPlot) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.CombinedRangeXYPlot.this.subplots, that.subplots))) {
			return false;
		}
		if ((org.jfree.chart.plot.CombinedRangeXYPlot.this.totalWeight) != (that.totalWeight)) {
			return false;
		}
		if ((org.jfree.chart.plot.CombinedRangeXYPlot.this.gap) != (that.gap)) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.plot.CombinedRangeXYPlot result = ((org.jfree.chart.plot.CombinedRangeXYPlot) (super.clone()));
		result.subplots = ((java.util.List) (org.jfree.chart.util.ObjectUtilities.deepClone(org.jfree.chart.plot.CombinedRangeXYPlot.this.subplots)));
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
}

