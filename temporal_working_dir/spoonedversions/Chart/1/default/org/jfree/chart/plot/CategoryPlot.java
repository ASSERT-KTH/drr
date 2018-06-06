

package org.jfree.chart.plot;


public class CategoryPlot extends org.jfree.chart.plot.Plot implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.event.AnnotationChangeListener , org.jfree.chart.event.RendererChangeListener , org.jfree.chart.plot.Pannable , org.jfree.chart.plot.Selectable , org.jfree.chart.plot.ValueAxisPlot , org.jfree.chart.plot.Zoomable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = -3537691700434728188L;

	public static final boolean DEFAULT_DOMAIN_GRIDLINES_VISIBLE = false;

	public static final boolean DEFAULT_RANGE_GRIDLINES_VISIBLE = true;

	public static final java.awt.Stroke DEFAULT_GRIDLINE_STROKE = new java.awt.BasicStroke(0.5F, java.awt.BasicStroke.CAP_BUTT, java.awt.BasicStroke.JOIN_BEVEL, 0.0F, new float[]{ 2.0F , 2.0F }, 0.0F);

	public static final java.awt.Paint DEFAULT_GRIDLINE_PAINT = java.awt.Color.WHITE;

	public static final java.awt.Font DEFAULT_VALUE_LABEL_FONT = new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 10);

	public static final boolean DEFAULT_CROSSHAIR_VISIBLE = false;

	public static final java.awt.Stroke DEFAULT_CROSSHAIR_STROKE = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_STROKE;

	public static final java.awt.Paint DEFAULT_CROSSHAIR_PAINT = java.awt.Color.blue;

	protected static java.util.ResourceBundle localizationResources = org.jfree.chart.util.ResourceBundleWrapper.getBundle("org.jfree.chart.plot.LocalizationBundle");

	private org.jfree.chart.plot.PlotOrientation orientation;

	private org.jfree.chart.util.RectangleInsets axisOffset;

	private org.jfree.chart.util.ObjectList domainAxes;

	private org.jfree.chart.util.ObjectList domainAxisLocations;

	private boolean drawSharedDomainAxis;

	private org.jfree.chart.util.ObjectList rangeAxes;

	private org.jfree.chart.util.ObjectList rangeAxisLocations;

	private org.jfree.chart.util.ObjectList datasets;

	private java.util.TreeMap datasetToDomainAxesMap;

	private java.util.TreeMap datasetToRangeAxesMap;

	private org.jfree.chart.util.ObjectList renderers;

	private org.jfree.chart.plot.DatasetRenderingOrder renderingOrder = org.jfree.chart.plot.DatasetRenderingOrder.REVERSE;

	private org.jfree.chart.util.SortOrder columnRenderingOrder = org.jfree.chart.util.SortOrder.ASCENDING;

	private org.jfree.chart.util.SortOrder rowRenderingOrder = org.jfree.chart.util.SortOrder.ASCENDING;

	private boolean domainGridlinesVisible;

	private org.jfree.chart.axis.CategoryAnchor domainGridlinePosition;

	private transient java.awt.Stroke domainGridlineStroke;

	private transient java.awt.Paint domainGridlinePaint;

	private boolean rangeZeroBaselineVisible;

	private transient java.awt.Stroke rangeZeroBaselineStroke;

	private transient java.awt.Paint rangeZeroBaselinePaint;

	private boolean rangeGridlinesVisible;

	private transient java.awt.Stroke rangeGridlineStroke;

	private transient java.awt.Paint rangeGridlinePaint;

	private boolean rangeMinorGridlinesVisible;

	private transient java.awt.Stroke rangeMinorGridlineStroke;

	private transient java.awt.Paint rangeMinorGridlinePaint;

	private double anchorValue;

	private int crosshairDatasetIndex;

	private boolean domainCrosshairVisible;

	private java.lang.Comparable domainCrosshairRowKey;

	private java.lang.Comparable domainCrosshairColumnKey;

	private transient java.awt.Stroke domainCrosshairStroke;

	private transient java.awt.Paint domainCrosshairPaint;

	private boolean rangeCrosshairVisible;

	private double rangeCrosshairValue;

	private transient java.awt.Stroke rangeCrosshairStroke;

	private transient java.awt.Paint rangeCrosshairPaint;

	private boolean rangeCrosshairLockedOnData = true;

	private java.util.Map foregroundDomainMarkers;

	private java.util.Map backgroundDomainMarkers;

	private java.util.Map foregroundRangeMarkers;

	private java.util.Map backgroundRangeMarkers;

	private java.util.List annotations;

	private int weight;

	private org.jfree.chart.axis.AxisSpace fixedDomainAxisSpace;

	private org.jfree.chart.axis.AxisSpace fixedRangeAxisSpace;

	private org.jfree.chart.LegendItemCollection fixedLegendItems;

	private boolean rangePannable;

	private org.jfree.chart.util.ShadowGenerator shadowGenerator;

	public CategoryPlot() {
		this(null, null, null, null);
	}

	public CategoryPlot(org.jfree.data.category.CategoryDataset dataset, org.jfree.chart.axis.CategoryAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.chart.renderer.category.CategoryItemRenderer renderer) {
		super();
		org.jfree.chart.plot.CategoryPlot.this.orientation = org.jfree.chart.plot.PlotOrientation.VERTICAL;
		org.jfree.chart.plot.CategoryPlot.this.domainAxes = new org.jfree.chart.util.ObjectList();
		org.jfree.chart.plot.CategoryPlot.this.domainAxisLocations = new org.jfree.chart.util.ObjectList();
		org.jfree.chart.plot.CategoryPlot.this.rangeAxes = new org.jfree.chart.util.ObjectList();
		org.jfree.chart.plot.CategoryPlot.this.rangeAxisLocations = new org.jfree.chart.util.ObjectList();
		org.jfree.chart.plot.CategoryPlot.this.datasetToDomainAxesMap = new java.util.TreeMap();
		org.jfree.chart.plot.CategoryPlot.this.datasetToRangeAxesMap = new java.util.TreeMap();
		org.jfree.chart.plot.CategoryPlot.this.renderers = new org.jfree.chart.util.ObjectList();
		org.jfree.chart.plot.CategoryPlot.this.datasets = new org.jfree.chart.util.ObjectList();
		org.jfree.chart.plot.CategoryPlot.this.datasets.set(0, dataset);
		if (dataset != null) {
			dataset.addChangeListener(org.jfree.chart.plot.CategoryPlot.this);
		}
		org.jfree.chart.plot.CategoryPlot.this.axisOffset = new org.jfree.chart.util.RectangleInsets(4.0, 4.0, 4.0, 4.0);
		setDomainAxisLocation(org.jfree.chart.axis.AxisLocation.BOTTOM_OR_LEFT, false);
		setRangeAxisLocation(org.jfree.chart.axis.AxisLocation.TOP_OR_LEFT, false);
		org.jfree.chart.plot.CategoryPlot.this.renderers.set(0, renderer);
		if (renderer != null) {
			renderer.setPlot(org.jfree.chart.plot.CategoryPlot.this);
			renderer.addChangeListener(org.jfree.chart.plot.CategoryPlot.this);
		}
		org.jfree.chart.plot.CategoryPlot.this.domainAxes.set(0, domainAxis);
		org.jfree.chart.plot.CategoryPlot.this.mapDatasetToDomainAxis(0, 0);
		if (domainAxis != null) {
			domainAxis.setPlot(org.jfree.chart.plot.CategoryPlot.this);
			domainAxis.addChangeListener(org.jfree.chart.plot.CategoryPlot.this);
		}
		org.jfree.chart.plot.CategoryPlot.this.drawSharedDomainAxis = false;
		org.jfree.chart.plot.CategoryPlot.this.rangeAxes.set(0, rangeAxis);
		org.jfree.chart.plot.CategoryPlot.this.mapDatasetToRangeAxis(0, 0);
		if (rangeAxis != null) {
			rangeAxis.setPlot(org.jfree.chart.plot.CategoryPlot.this);
			rangeAxis.addChangeListener(org.jfree.chart.plot.CategoryPlot.this);
		}
		configureDomainAxes();
		configureRangeAxes();
		org.jfree.chart.plot.CategoryPlot.this.domainGridlinesVisible = org.jfree.chart.plot.CategoryPlot.DEFAULT_DOMAIN_GRIDLINES_VISIBLE;
		org.jfree.chart.plot.CategoryPlot.this.domainGridlinePosition = org.jfree.chart.axis.CategoryAnchor.MIDDLE;
		org.jfree.chart.plot.CategoryPlot.this.domainGridlineStroke = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_STROKE;
		org.jfree.chart.plot.CategoryPlot.this.domainGridlinePaint = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
		org.jfree.chart.plot.CategoryPlot.this.rangeZeroBaselineVisible = false;
		org.jfree.chart.plot.CategoryPlot.this.rangeZeroBaselinePaint = java.awt.Color.black;
		org.jfree.chart.plot.CategoryPlot.this.rangeZeroBaselineStroke = new java.awt.BasicStroke(0.5F);
		org.jfree.chart.plot.CategoryPlot.this.rangeGridlinesVisible = org.jfree.chart.plot.CategoryPlot.DEFAULT_RANGE_GRIDLINES_VISIBLE;
		org.jfree.chart.plot.CategoryPlot.this.rangeGridlineStroke = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_STROKE;
		org.jfree.chart.plot.CategoryPlot.this.rangeGridlinePaint = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
		org.jfree.chart.plot.CategoryPlot.this.rangeMinorGridlinesVisible = false;
		org.jfree.chart.plot.CategoryPlot.this.rangeMinorGridlineStroke = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_STROKE;
		org.jfree.chart.plot.CategoryPlot.this.rangeMinorGridlinePaint = java.awt.Color.white;
		org.jfree.chart.plot.CategoryPlot.this.foregroundDomainMarkers = new java.util.HashMap();
		org.jfree.chart.plot.CategoryPlot.this.backgroundDomainMarkers = new java.util.HashMap();
		org.jfree.chart.plot.CategoryPlot.this.foregroundRangeMarkers = new java.util.HashMap();
		org.jfree.chart.plot.CategoryPlot.this.backgroundRangeMarkers = new java.util.HashMap();
		org.jfree.chart.plot.CategoryPlot.this.anchorValue = 0.0;
		org.jfree.chart.plot.CategoryPlot.this.domainCrosshairVisible = false;
		org.jfree.chart.plot.CategoryPlot.this.domainCrosshairStroke = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
		org.jfree.chart.plot.CategoryPlot.this.domainCrosshairPaint = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_PAINT;
		org.jfree.chart.plot.CategoryPlot.this.rangeCrosshairVisible = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_VISIBLE;
		org.jfree.chart.plot.CategoryPlot.this.rangeCrosshairValue = 0.0;
		org.jfree.chart.plot.CategoryPlot.this.rangeCrosshairStroke = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
		org.jfree.chart.plot.CategoryPlot.this.rangeCrosshairPaint = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_PAINT;
		org.jfree.chart.plot.CategoryPlot.this.annotations = new java.util.ArrayList();
		org.jfree.chart.plot.CategoryPlot.this.rangePannable = false;
		org.jfree.chart.plot.CategoryPlot.this.shadowGenerator = new org.jfree.chart.util.DefaultShadowGenerator();
	}

	public java.lang.String getPlotType() {
		return org.jfree.chart.plot.CategoryPlot.localizationResources.getString("Category_Plot");
	}

	public org.jfree.chart.plot.PlotOrientation getOrientation() {
		return org.jfree.chart.plot.CategoryPlot.this.orientation;
	}

	public void setOrientation(org.jfree.chart.plot.PlotOrientation orientation) {
		if (orientation == null) {
			throw new java.lang.IllegalArgumentException("Null 'orientation' argument.");
		}
		org.jfree.chart.plot.CategoryPlot.this.orientation = orientation;
		fireChangeEvent();
	}

	public org.jfree.chart.util.RectangleInsets getAxisOffset() {
		return org.jfree.chart.plot.CategoryPlot.this.axisOffset;
	}

	public void setAxisOffset(org.jfree.chart.util.RectangleInsets offset) {
		if (offset == null) {
			throw new java.lang.IllegalArgumentException("Null 'offset' argument.");
		}
		org.jfree.chart.plot.CategoryPlot.this.axisOffset = offset;
		fireChangeEvent();
	}

	public org.jfree.chart.axis.CategoryAxis getDomainAxis() {
		return getDomainAxis(0);
	}

	public org.jfree.chart.axis.CategoryAxis getDomainAxis(int index) {
		org.jfree.chart.axis.CategoryAxis result = null;
		if (index < (org.jfree.chart.plot.CategoryPlot.this.domainAxes.size())) {
			result = ((org.jfree.chart.axis.CategoryAxis) (org.jfree.chart.plot.CategoryPlot.this.domainAxes.get(index)));
		}
		if (result == null) {
			org.jfree.chart.plot.Plot parent = getParent();
			if (parent instanceof org.jfree.chart.plot.CategoryPlot) {
				org.jfree.chart.plot.CategoryPlot cp = ((org.jfree.chart.plot.CategoryPlot) (parent));
				result = cp.getDomainAxis(index);
			}
		}
		return result;
	}

	public void setDomainAxis(org.jfree.chart.axis.CategoryAxis axis) {
		setDomainAxis(0, axis);
	}

	public void setDomainAxis(int index, org.jfree.chart.axis.CategoryAxis axis) {
		setDomainAxis(index, axis, true);
	}

	public void setDomainAxis(int index, org.jfree.chart.axis.CategoryAxis axis, boolean notify) {
		org.jfree.chart.axis.CategoryAxis existing = ((org.jfree.chart.axis.CategoryAxis) (org.jfree.chart.plot.CategoryPlot.this.domainAxes.get(index)));
		if (existing != null) {
			existing.removeChangeListener(org.jfree.chart.plot.CategoryPlot.this);
		}
		if (axis != null) {
			axis.setPlot(org.jfree.chart.plot.CategoryPlot.this);
		}
		org.jfree.chart.plot.CategoryPlot.this.domainAxes.set(index, axis);
		if (axis != null) {
			axis.configure();
			axis.addChangeListener(org.jfree.chart.plot.CategoryPlot.this);
		}
		if (notify) {
			fireChangeEvent();
		}
	}

	public void setDomainAxes(org.jfree.chart.axis.CategoryAxis[] axes) {
		for (int i = 0; i < (axes.length); i++) {
			setDomainAxis(i, axes[i], false);
		}
		fireChangeEvent();
	}

	public int getDomainAxisIndex(org.jfree.chart.axis.CategoryAxis axis) {
		if (axis == null) {
			throw new java.lang.IllegalArgumentException("Null 'axis' argument.");
		}
		return org.jfree.chart.plot.CategoryPlot.this.domainAxes.indexOf(axis);
	}

	public org.jfree.chart.axis.AxisLocation getDomainAxisLocation() {
		return getDomainAxisLocation(0);
	}

	public org.jfree.chart.axis.AxisLocation getDomainAxisLocation(int index) {
		org.jfree.chart.axis.AxisLocation result = null;
		if (index < (org.jfree.chart.plot.CategoryPlot.this.domainAxisLocations.size())) {
			result = ((org.jfree.chart.axis.AxisLocation) (org.jfree.chart.plot.CategoryPlot.this.domainAxisLocations.get(index)));
		}
		if (result == null) {
			result = org.jfree.chart.axis.AxisLocation.getOpposite(getDomainAxisLocation(0));
		}
		return result;
	}

	public void setDomainAxisLocation(org.jfree.chart.axis.AxisLocation location) {
		setDomainAxisLocation(0, location, true);
	}

	public void setDomainAxisLocation(org.jfree.chart.axis.AxisLocation location, boolean notify) {
		setDomainAxisLocation(0, location, notify);
	}

	public void setDomainAxisLocation(int index, org.jfree.chart.axis.AxisLocation location) {
		setDomainAxisLocation(index, location, true);
	}

	public void setDomainAxisLocation(int index, org.jfree.chart.axis.AxisLocation location, boolean notify) {
		if ((index == 0) && (location == null)) {
			throw new java.lang.IllegalArgumentException("Null 'location' for index 0 not permitted.");
		}
		org.jfree.chart.plot.CategoryPlot.this.domainAxisLocations.set(index, location);
		if (notify) {
			fireChangeEvent();
		}
	}

	public org.jfree.chart.util.RectangleEdge getDomainAxisEdge() {
		return getDomainAxisEdge(0);
	}

	public org.jfree.chart.util.RectangleEdge getDomainAxisEdge(int index) {
		org.jfree.chart.util.RectangleEdge result = null;
		org.jfree.chart.axis.AxisLocation location = getDomainAxisLocation(index);
		if (location != null) {
			result = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(location, org.jfree.chart.plot.CategoryPlot.this.orientation);
		}else {
			result = org.jfree.chart.util.RectangleEdge.opposite(getDomainAxisEdge(0));
		}
		return result;
	}

	public int getDomainAxisCount() {
		return org.jfree.chart.plot.CategoryPlot.this.domainAxes.size();
	}

	public void clearDomainAxes() {
		for (int i = 0; i < (org.jfree.chart.plot.CategoryPlot.this.domainAxes.size()); i++) {
			org.jfree.chart.axis.CategoryAxis axis = ((org.jfree.chart.axis.CategoryAxis) (org.jfree.chart.plot.CategoryPlot.this.domainAxes.get(i)));
			if (axis != null) {
				axis.removeChangeListener(org.jfree.chart.plot.CategoryPlot.this);
			}
		}
		org.jfree.chart.plot.CategoryPlot.this.domainAxes.clear();
		fireChangeEvent();
	}

	public void configureDomainAxes() {
		for (int i = 0; i < (org.jfree.chart.plot.CategoryPlot.this.domainAxes.size()); i++) {
			org.jfree.chart.axis.CategoryAxis axis = ((org.jfree.chart.axis.CategoryAxis) (org.jfree.chart.plot.CategoryPlot.this.domainAxes.get(i)));
			if (axis != null) {
				axis.configure();
			}
		}
	}

	public org.jfree.chart.axis.ValueAxis getRangeAxis() {
		return getRangeAxis(0);
	}

	public org.jfree.chart.axis.ValueAxis getRangeAxis(int index) {
		org.jfree.chart.axis.ValueAxis result = null;
		if (index < (org.jfree.chart.plot.CategoryPlot.this.rangeAxes.size())) {
			result = ((org.jfree.chart.axis.ValueAxis) (org.jfree.chart.plot.CategoryPlot.this.rangeAxes.get(index)));
		}
		if (result == null) {
			org.jfree.chart.plot.Plot parent = getParent();
			if (parent instanceof org.jfree.chart.plot.CategoryPlot) {
				org.jfree.chart.plot.CategoryPlot cp = ((org.jfree.chart.plot.CategoryPlot) (parent));
				result = cp.getRangeAxis(index);
			}
		}
		return result;
	}

	public void setRangeAxis(org.jfree.chart.axis.ValueAxis axis) {
		setRangeAxis(0, axis);
	}

	public void setRangeAxis(int index, org.jfree.chart.axis.ValueAxis axis) {
		setRangeAxis(index, axis, true);
	}

	public void setRangeAxis(int index, org.jfree.chart.axis.ValueAxis axis, boolean notify) {
		org.jfree.chart.axis.ValueAxis existing = ((org.jfree.chart.axis.ValueAxis) (org.jfree.chart.plot.CategoryPlot.this.rangeAxes.get(index)));
		if (existing != null) {
			existing.removeChangeListener(org.jfree.chart.plot.CategoryPlot.this);
		}
		if (axis != null) {
			axis.setPlot(org.jfree.chart.plot.CategoryPlot.this);
		}
		org.jfree.chart.plot.CategoryPlot.this.rangeAxes.set(index, axis);
		if (axis != null) {
			axis.configure();
			axis.addChangeListener(org.jfree.chart.plot.CategoryPlot.this);
		}
		if (notify) {
			fireChangeEvent();
		}
	}

	public void setRangeAxes(org.jfree.chart.axis.ValueAxis[] axes) {
		for (int i = 0; i < (axes.length); i++) {
			setRangeAxis(i, axes[i], false);
		}
		fireChangeEvent();
	}

	public int getRangeAxisIndex(org.jfree.chart.axis.ValueAxis axis) {
		if (axis == null) {
			throw new java.lang.IllegalArgumentException("Null 'axis' argument.");
		}
		int result = org.jfree.chart.plot.CategoryPlot.this.rangeAxes.indexOf(axis);
		if (result < 0) {
			org.jfree.chart.plot.Plot parent = getParent();
			if (parent instanceof org.jfree.chart.plot.CategoryPlot) {
				org.jfree.chart.plot.CategoryPlot p = ((org.jfree.chart.plot.CategoryPlot) (parent));
				result = p.getRangeAxisIndex(axis);
			}
		}
		return result;
	}

	public org.jfree.chart.axis.AxisLocation getRangeAxisLocation() {
		return getRangeAxisLocation(0);
	}

	public org.jfree.chart.axis.AxisLocation getRangeAxisLocation(int index) {
		org.jfree.chart.axis.AxisLocation result = null;
		if (index < (org.jfree.chart.plot.CategoryPlot.this.rangeAxisLocations.size())) {
			result = ((org.jfree.chart.axis.AxisLocation) (org.jfree.chart.plot.CategoryPlot.this.rangeAxisLocations.get(index)));
		}
		if (result == null) {
			result = org.jfree.chart.axis.AxisLocation.getOpposite(getRangeAxisLocation(0));
		}
		return result;
	}

	public void setRangeAxisLocation(org.jfree.chart.axis.AxisLocation location) {
		setRangeAxisLocation(location, true);
	}

	public void setRangeAxisLocation(org.jfree.chart.axis.AxisLocation location, boolean notify) {
		setRangeAxisLocation(0, location, notify);
	}

	public void setRangeAxisLocation(int index, org.jfree.chart.axis.AxisLocation location) {
		setRangeAxisLocation(index, location, true);
	}

	public void setRangeAxisLocation(int index, org.jfree.chart.axis.AxisLocation location, boolean notify) {
		if ((index == 0) && (location == null)) {
			throw new java.lang.IllegalArgumentException("Null 'location' for index 0 not permitted.");
		}
		org.jfree.chart.plot.CategoryPlot.this.rangeAxisLocations.set(index, location);
		if (notify) {
			fireChangeEvent();
		}
	}

	public org.jfree.chart.util.RectangleEdge getRangeAxisEdge() {
		return getRangeAxisEdge(0);
	}

	public org.jfree.chart.util.RectangleEdge getRangeAxisEdge(int index) {
		org.jfree.chart.axis.AxisLocation location = getRangeAxisLocation(index);
		org.jfree.chart.util.RectangleEdge result = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(location, org.jfree.chart.plot.CategoryPlot.this.orientation);
		if (result == null) {
			result = org.jfree.chart.util.RectangleEdge.opposite(getRangeAxisEdge(0));
		}
		return result;
	}

	public int getRangeAxisCount() {
		return org.jfree.chart.plot.CategoryPlot.this.rangeAxes.size();
	}

	public void clearRangeAxes() {
		for (int i = 0; i < (org.jfree.chart.plot.CategoryPlot.this.rangeAxes.size()); i++) {
			org.jfree.chart.axis.ValueAxis axis = ((org.jfree.chart.axis.ValueAxis) (org.jfree.chart.plot.CategoryPlot.this.rangeAxes.get(i)));
			if (axis != null) {
				axis.removeChangeListener(org.jfree.chart.plot.CategoryPlot.this);
			}
		}
		org.jfree.chart.plot.CategoryPlot.this.rangeAxes.clear();
		fireChangeEvent();
	}

	public void configureRangeAxes() {
		for (int i = 0; i < (org.jfree.chart.plot.CategoryPlot.this.rangeAxes.size()); i++) {
			org.jfree.chart.axis.ValueAxis axis = ((org.jfree.chart.axis.ValueAxis) (org.jfree.chart.plot.CategoryPlot.this.rangeAxes.get(i)));
			if (axis != null) {
				axis.configure();
			}
		}
	}

	public org.jfree.data.category.CategoryDataset getDataset() {
		return getDataset(0);
	}

	public org.jfree.data.category.CategoryDataset getDataset(int index) {
		org.jfree.data.category.CategoryDataset result = null;
		if ((org.jfree.chart.plot.CategoryPlot.this.datasets.size()) > index) {
			result = ((org.jfree.data.category.CategoryDataset) (org.jfree.chart.plot.CategoryPlot.this.datasets.get(index)));
		}
		return result;
	}

	public void setDataset(org.jfree.data.category.CategoryDataset dataset) {
		setDataset(0, dataset);
	}

	public void setDataset(int index, org.jfree.data.category.CategoryDataset dataset) {
		org.jfree.data.category.CategoryDataset existing = ((org.jfree.data.category.CategoryDataset) (org.jfree.chart.plot.CategoryPlot.this.datasets.get(index)));
		if (existing != null) {
			existing.removeChangeListener(org.jfree.chart.plot.CategoryPlot.this);
		}
		org.jfree.chart.plot.CategoryPlot.this.datasets.set(index, dataset);
		if (dataset != null) {
			dataset.addChangeListener(org.jfree.chart.plot.CategoryPlot.this);
		}
		org.jfree.data.event.DatasetChangeEvent event = new org.jfree.data.event.DatasetChangeEvent(org.jfree.chart.plot.CategoryPlot.this, dataset, new org.jfree.chart.event.DatasetChangeInfo());
		datasetChanged(event);
	}

	public int getDatasetCount() {
		return org.jfree.chart.plot.CategoryPlot.this.datasets.size();
	}

	public int indexOf(org.jfree.data.category.CategoryDataset dataset) {
		int result = -1;
		for (int i = 0; i < (org.jfree.chart.plot.CategoryPlot.this.datasets.size()); i++) {
			if (dataset == (org.jfree.chart.plot.CategoryPlot.this.datasets.get(i))) {
				result = i;
				break;
			}
		}
		return result;
	}

	public void mapDatasetToDomainAxis(int index, int axisIndex) {
		java.util.List axisIndices = new java.util.ArrayList(1);
		axisIndices.add(new java.lang.Integer(axisIndex));
		mapDatasetToDomainAxes(index, axisIndices);
	}

	public void mapDatasetToDomainAxes(int index, java.util.List axisIndices) {
		if (index < 0) {
			throw new java.lang.IllegalArgumentException("Requires 'index' >= 0.");
		}
		checkAxisIndices(axisIndices);
		java.lang.Integer key = new java.lang.Integer(index);
		org.jfree.chart.plot.CategoryPlot.this.datasetToDomainAxesMap.put(key, new java.util.ArrayList(axisIndices));
		datasetChanged(new org.jfree.data.event.DatasetChangeEvent(org.jfree.chart.plot.CategoryPlot.this, getDataset(index), new org.jfree.chart.event.DatasetChangeInfo()));
	}

	private void checkAxisIndices(java.util.List indices) {
		if (indices == null) {
			return ;
		}
		int count = indices.size();
		if (count == 0) {
			throw new java.lang.IllegalArgumentException("Empty list not permitted.");
		}
		java.util.HashSet set = new java.util.HashSet();
		for (int i = 0; i < count; i++) {
			java.lang.Object item = indices.get(i);
			if (!(item instanceof java.lang.Integer)) {
				throw new java.lang.IllegalArgumentException("Indices must be Integer instances.");
			}
			if (set.contains(item)) {
				throw new java.lang.IllegalArgumentException("Indices must be unique.");
			}
			set.add(item);
		}
	}

	public org.jfree.chart.axis.CategoryAxis getDomainAxisForDataset(int index) {
		if (index < 0) {
			throw new java.lang.IllegalArgumentException("Negative 'index'.");
		}
		org.jfree.chart.axis.CategoryAxis axis = null;
		java.util.List axisIndices = ((java.util.List) (org.jfree.chart.plot.CategoryPlot.this.datasetToDomainAxesMap.get(new java.lang.Integer(index))));
		if (axisIndices != null) {
			java.lang.Integer axisIndex = ((java.lang.Integer) (axisIndices.get(0)));
			axis = getDomainAxis(axisIndex.intValue());
		}else {
			axis = getDomainAxis(0);
		}
		return axis;
	}

	public void mapDatasetToRangeAxis(int index, int axisIndex) {
		java.util.List axisIndices = new java.util.ArrayList(1);
		axisIndices.add(new java.lang.Integer(axisIndex));
		mapDatasetToRangeAxes(index, axisIndices);
	}

	public void mapDatasetToRangeAxes(int index, java.util.List axisIndices) {
		if (index < 0) {
			throw new java.lang.IllegalArgumentException("Requires 'index' >= 0.");
		}
		checkAxisIndices(axisIndices);
		java.lang.Integer key = new java.lang.Integer(index);
		org.jfree.chart.plot.CategoryPlot.this.datasetToRangeAxesMap.put(key, new java.util.ArrayList(axisIndices));
		datasetChanged(new org.jfree.data.event.DatasetChangeEvent(org.jfree.chart.plot.CategoryPlot.this, getDataset(index), new org.jfree.chart.event.DatasetChangeInfo()));
	}

	public org.jfree.chart.axis.ValueAxis getRangeAxisForDataset(int index) {
		if (index < 0) {
			throw new java.lang.IllegalArgumentException("Negative 'index'.");
		}
		org.jfree.chart.axis.ValueAxis axis = null;
		java.util.List axisIndices = ((java.util.List) (org.jfree.chart.plot.CategoryPlot.this.datasetToRangeAxesMap.get(new java.lang.Integer(index))));
		if (axisIndices != null) {
			java.lang.Integer axisIndex = ((java.lang.Integer) (axisIndices.get(0)));
			axis = getRangeAxis(axisIndex.intValue());
		}else {
			axis = getRangeAxis(0);
		}
		return axis;
	}

	public int getRendererCount() {
		return org.jfree.chart.plot.CategoryPlot.this.renderers.size();
	}

	public org.jfree.chart.renderer.category.CategoryItemRenderer getRenderer() {
		return getRenderer(0);
	}

	public org.jfree.chart.renderer.category.CategoryItemRenderer getRenderer(int index) {
		org.jfree.chart.renderer.category.CategoryItemRenderer result = null;
		if ((org.jfree.chart.plot.CategoryPlot.this.renderers.size()) > index) {
			result = ((org.jfree.chart.renderer.category.CategoryItemRenderer) (org.jfree.chart.plot.CategoryPlot.this.renderers.get(index)));
		}
		return result;
	}

	public void setRenderer(org.jfree.chart.renderer.category.CategoryItemRenderer renderer) {
		setRenderer(0, renderer, true);
	}

	public void setRenderer(org.jfree.chart.renderer.category.CategoryItemRenderer renderer, boolean notify) {
		setRenderer(0, renderer, notify);
	}

	public void setRenderer(int index, org.jfree.chart.renderer.category.CategoryItemRenderer renderer) {
		setRenderer(index, renderer, true);
	}

	public void setRenderer(int index, org.jfree.chart.renderer.category.CategoryItemRenderer renderer, boolean notify) {
		org.jfree.chart.renderer.category.CategoryItemRenderer existing = ((org.jfree.chart.renderer.category.CategoryItemRenderer) (org.jfree.chart.plot.CategoryPlot.this.renderers.get(index)));
		if (existing != null) {
			existing.removeChangeListener(org.jfree.chart.plot.CategoryPlot.this);
		}
		org.jfree.chart.plot.CategoryPlot.this.renderers.set(index, renderer);
		if (renderer != null) {
			renderer.setPlot(org.jfree.chart.plot.CategoryPlot.this);
			renderer.addChangeListener(org.jfree.chart.plot.CategoryPlot.this);
		}
		configureDomainAxes();
		configureRangeAxes();
		if (notify) {
			fireChangeEvent();
		}
	}

	public void setRenderers(org.jfree.chart.renderer.category.CategoryItemRenderer[] renderers) {
		for (int i = 0; i < (renderers.length); i++) {
			setRenderer(i, renderers[i], false);
		}
		fireChangeEvent();
	}

	public org.jfree.chart.renderer.category.CategoryItemRenderer getRendererForDataset(org.jfree.data.category.CategoryDataset dataset) {
		org.jfree.chart.renderer.category.CategoryItemRenderer result = null;
		for (int i = 0; i < (org.jfree.chart.plot.CategoryPlot.this.datasets.size()); i++) {
			if ((org.jfree.chart.plot.CategoryPlot.this.datasets.get(i)) == dataset) {
				result = ((org.jfree.chart.renderer.category.CategoryItemRenderer) (org.jfree.chart.plot.CategoryPlot.this.renderers.get(i)));
				break;
			}
		}
		return result;
	}

	public int getIndexOf(org.jfree.chart.renderer.category.CategoryItemRenderer renderer) {
		return org.jfree.chart.plot.CategoryPlot.this.renderers.indexOf(renderer);
	}

	public org.jfree.chart.plot.DatasetRenderingOrder getDatasetRenderingOrder() {
		return org.jfree.chart.plot.CategoryPlot.this.renderingOrder;
	}

	public void setDatasetRenderingOrder(org.jfree.chart.plot.DatasetRenderingOrder order) {
		if (order == null) {
			throw new java.lang.IllegalArgumentException("Null 'order' argument.");
		}
		org.jfree.chart.plot.CategoryPlot.this.renderingOrder = order;
		fireChangeEvent();
	}

	public org.jfree.chart.util.SortOrder getColumnRenderingOrder() {
		return org.jfree.chart.plot.CategoryPlot.this.columnRenderingOrder;
	}

	public void setColumnRenderingOrder(org.jfree.chart.util.SortOrder order) {
		if (order == null) {
			throw new java.lang.IllegalArgumentException("Null 'order' argument.");
		}
		org.jfree.chart.plot.CategoryPlot.this.columnRenderingOrder = order;
		fireChangeEvent();
	}

	public org.jfree.chart.util.SortOrder getRowRenderingOrder() {
		return org.jfree.chart.plot.CategoryPlot.this.rowRenderingOrder;
	}

	public void setRowRenderingOrder(org.jfree.chart.util.SortOrder order) {
		if (order == null) {
			throw new java.lang.IllegalArgumentException("Null 'order' argument.");
		}
		org.jfree.chart.plot.CategoryPlot.this.rowRenderingOrder = order;
		fireChangeEvent();
	}

	public boolean isDomainGridlinesVisible() {
		return org.jfree.chart.plot.CategoryPlot.this.domainGridlinesVisible;
	}

	public void setDomainGridlinesVisible(boolean visible) {
		if ((org.jfree.chart.plot.CategoryPlot.this.domainGridlinesVisible) != visible) {
			org.jfree.chart.plot.CategoryPlot.this.domainGridlinesVisible = visible;
			fireChangeEvent();
		}
	}

	public org.jfree.chart.axis.CategoryAnchor getDomainGridlinePosition() {
		return org.jfree.chart.plot.CategoryPlot.this.domainGridlinePosition;
	}

	public void setDomainGridlinePosition(org.jfree.chart.axis.CategoryAnchor position) {
		if (position == null) {
			throw new java.lang.IllegalArgumentException("Null 'position' argument.");
		}
		org.jfree.chart.plot.CategoryPlot.this.domainGridlinePosition = position;
		fireChangeEvent();
	}

	public java.awt.Stroke getDomainGridlineStroke() {
		return org.jfree.chart.plot.CategoryPlot.this.domainGridlineStroke;
	}

	public void setDomainGridlineStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' not permitted.");
		}
		org.jfree.chart.plot.CategoryPlot.this.domainGridlineStroke = stroke;
		fireChangeEvent();
	}

	public java.awt.Paint getDomainGridlinePaint() {
		return org.jfree.chart.plot.CategoryPlot.this.domainGridlinePaint;
	}

	public void setDomainGridlinePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.CategoryPlot.this.domainGridlinePaint = paint;
		fireChangeEvent();
	}

	public boolean isRangeZeroBaselineVisible() {
		return org.jfree.chart.plot.CategoryPlot.this.rangeZeroBaselineVisible;
	}

	public void setRangeZeroBaselineVisible(boolean visible) {
		org.jfree.chart.plot.CategoryPlot.this.rangeZeroBaselineVisible = visible;
		fireChangeEvent();
	}

	public java.awt.Stroke getRangeZeroBaselineStroke() {
		return org.jfree.chart.plot.CategoryPlot.this.rangeZeroBaselineStroke;
	}

	public void setRangeZeroBaselineStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.plot.CategoryPlot.this.rangeZeroBaselineStroke = stroke;
		fireChangeEvent();
	}

	public java.awt.Paint getRangeZeroBaselinePaint() {
		return org.jfree.chart.plot.CategoryPlot.this.rangeZeroBaselinePaint;
	}

	public void setRangeZeroBaselinePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.CategoryPlot.this.rangeZeroBaselinePaint = paint;
		fireChangeEvent();
	}

	public boolean isRangeGridlinesVisible() {
		return org.jfree.chart.plot.CategoryPlot.this.rangeGridlinesVisible;
	}

	public void setRangeGridlinesVisible(boolean visible) {
		if ((org.jfree.chart.plot.CategoryPlot.this.rangeGridlinesVisible) != visible) {
			org.jfree.chart.plot.CategoryPlot.this.rangeGridlinesVisible = visible;
			fireChangeEvent();
		}
	}

	public java.awt.Stroke getRangeGridlineStroke() {
		return org.jfree.chart.plot.CategoryPlot.this.rangeGridlineStroke;
	}

	public void setRangeGridlineStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.plot.CategoryPlot.this.rangeGridlineStroke = stroke;
		fireChangeEvent();
	}

	public java.awt.Paint getRangeGridlinePaint() {
		return org.jfree.chart.plot.CategoryPlot.this.rangeGridlinePaint;
	}

	public void setRangeGridlinePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.CategoryPlot.this.rangeGridlinePaint = paint;
		fireChangeEvent();
	}

	public boolean isRangeMinorGridlinesVisible() {
		return org.jfree.chart.plot.CategoryPlot.this.rangeMinorGridlinesVisible;
	}

	public void setRangeMinorGridlinesVisible(boolean visible) {
		if ((org.jfree.chart.plot.CategoryPlot.this.rangeMinorGridlinesVisible) != visible) {
			org.jfree.chart.plot.CategoryPlot.this.rangeMinorGridlinesVisible = visible;
			fireChangeEvent();
		}
	}

	public java.awt.Stroke getRangeMinorGridlineStroke() {
		return org.jfree.chart.plot.CategoryPlot.this.rangeMinorGridlineStroke;
	}

	public void setRangeMinorGridlineStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.plot.CategoryPlot.this.rangeMinorGridlineStroke = stroke;
		fireChangeEvent();
	}

	public java.awt.Paint getRangeMinorGridlinePaint() {
		return org.jfree.chart.plot.CategoryPlot.this.rangeMinorGridlinePaint;
	}

	public void setRangeMinorGridlinePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.CategoryPlot.this.rangeMinorGridlinePaint = paint;
		fireChangeEvent();
	}

	public org.jfree.chart.LegendItemCollection getFixedLegendItems() {
		return org.jfree.chart.plot.CategoryPlot.this.fixedLegendItems;
	}

	public void setFixedLegendItems(org.jfree.chart.LegendItemCollection items) {
		org.jfree.chart.plot.CategoryPlot.this.fixedLegendItems = items;
		fireChangeEvent();
	}

	public org.jfree.chart.LegendItemCollection getLegendItems() {
		if ((org.jfree.chart.plot.CategoryPlot.this.fixedLegendItems) != null) {
			return org.jfree.chart.plot.CategoryPlot.this.fixedLegendItems;
		}
		org.jfree.chart.LegendItemCollection result = new org.jfree.chart.LegendItemCollection();
		int count = org.jfree.chart.plot.CategoryPlot.this.datasets.size();
		for (int datasetIndex = 0; datasetIndex < count; datasetIndex++) {
			org.jfree.data.category.CategoryDataset dataset = getDataset(datasetIndex);
			if (dataset != null) {
				org.jfree.chart.renderer.category.CategoryItemRenderer renderer = getRenderer(datasetIndex);
				if (renderer != null) {
					result.addAll(renderer.getLegendItems());
				}
			}
		}
		return result;
	}

	public void handleClick(int x, int y, org.jfree.chart.plot.PlotRenderingInfo info) {
		java.awt.geom.Rectangle2D dataArea = info.getDataArea();
		if (dataArea.contains(x, y)) {
			double java2D = 0.0;
			if ((org.jfree.chart.plot.CategoryPlot.this.orientation) == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				java2D = x;
			}else
				if ((org.jfree.chart.plot.CategoryPlot.this.orientation) == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					java2D = y;
				}
			
			org.jfree.chart.util.RectangleEdge edge = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(getRangeAxisLocation(), org.jfree.chart.plot.CategoryPlot.this.orientation);
			double value = getRangeAxis().java2DToValue(java2D, info.getDataArea(), edge);
			setAnchorValue(value);
			setRangeCrosshairValue(value);
		}
	}

	public void zoom(double percent) {
		if (percent > 0.0) {
			double range = getRangeAxis().getRange().getLength();
			double scaledRange = range * percent;
			getRangeAxis().setRange(((org.jfree.chart.plot.CategoryPlot.this.anchorValue) - (scaledRange / 2.0)), ((org.jfree.chart.plot.CategoryPlot.this.anchorValue) + (scaledRange / 2.0)));
		}else {
			getRangeAxis().setAutoRange(true);
		}
	}

	public void annotationChanged(org.jfree.chart.event.AnnotationChangeEvent event) {
		if ((getParent()) != null) {
			getParent().annotationChanged(event);
		}else {
			org.jfree.chart.event.PlotChangeEvent e = new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.CategoryPlot.this);
			notifyListeners(e);
		}
	}

	public void datasetChanged(org.jfree.data.event.DatasetChangeEvent event) {
		int count = org.jfree.chart.plot.CategoryPlot.this.rangeAxes.size();
		for (int axisIndex = 0; axisIndex < count; axisIndex++) {
			org.jfree.chart.axis.ValueAxis yAxis = getRangeAxis(axisIndex);
			if (yAxis != null) {
				yAxis.configure();
			}
		}
		if ((getParent()) != null) {
			getParent().datasetChanged(event);
		}else {
			org.jfree.chart.event.PlotChangeEvent e = new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.CategoryPlot.this);
			e.setType(org.jfree.chart.event.ChartChangeEventType.DATASET_UPDATED);
			notifyListeners(e);
		}
	}

	public void rendererChanged(org.jfree.chart.event.RendererChangeEvent event) {
		org.jfree.chart.plot.Plot parent = getParent();
		if (parent != null) {
			if (parent instanceof org.jfree.chart.event.RendererChangeListener) {
				org.jfree.chart.event.RendererChangeListener rcl = ((org.jfree.chart.event.RendererChangeListener) (parent));
				rcl.rendererChanged(event);
			}else {
				throw new java.lang.RuntimeException("The renderer has changed and I don't know what to do!");
			}
		}else {
			configureRangeAxes();
			org.jfree.chart.event.PlotChangeEvent e = new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.CategoryPlot.this);
			notifyListeners(e);
		}
	}

	public void addDomainMarker(org.jfree.chart.plot.CategoryMarker marker) {
		addDomainMarker(marker, org.jfree.chart.util.Layer.FOREGROUND);
	}

	public void addDomainMarker(org.jfree.chart.plot.CategoryMarker marker, org.jfree.chart.util.Layer layer) {
		addDomainMarker(0, marker, layer);
	}

	public void addDomainMarker(int index, org.jfree.chart.plot.CategoryMarker marker, org.jfree.chart.util.Layer layer) {
		addDomainMarker(index, marker, layer, true);
	}

	public void addDomainMarker(int index, org.jfree.chart.plot.CategoryMarker marker, org.jfree.chart.util.Layer layer, boolean notify) {
		if (marker == null) {
			throw new java.lang.IllegalArgumentException("Null 'marker' not permitted.");
		}
		if (layer == null) {
			throw new java.lang.IllegalArgumentException("Null 'layer' not permitted.");
		}
		java.util.Collection markers;
		if (layer == (org.jfree.chart.util.Layer.FOREGROUND)) {
			markers = ((java.util.Collection) (org.jfree.chart.plot.CategoryPlot.this.foregroundDomainMarkers.get(new java.lang.Integer(index))));
			if (markers == null) {
				markers = new java.util.ArrayList();
				org.jfree.chart.plot.CategoryPlot.this.foregroundDomainMarkers.put(new java.lang.Integer(index), markers);
			}
			markers.add(marker);
		}else
			if (layer == (org.jfree.chart.util.Layer.BACKGROUND)) {
				markers = ((java.util.Collection) (org.jfree.chart.plot.CategoryPlot.this.backgroundDomainMarkers.get(new java.lang.Integer(index))));
				if (markers == null) {
					markers = new java.util.ArrayList();
					org.jfree.chart.plot.CategoryPlot.this.backgroundDomainMarkers.put(new java.lang.Integer(index), markers);
				}
				markers.add(marker);
			}
		
		marker.addChangeListener(org.jfree.chart.plot.CategoryPlot.this);
		if (notify) {
			fireChangeEvent();
		}
	}

	public void clearDomainMarkers() {
		if ((org.jfree.chart.plot.CategoryPlot.this.backgroundDomainMarkers) != null) {
			java.util.Set keys = org.jfree.chart.plot.CategoryPlot.this.backgroundDomainMarkers.keySet();
			java.util.Iterator iterator = keys.iterator();
			while (iterator.hasNext()) {
				java.lang.Integer key = ((java.lang.Integer) (iterator.next()));
				clearDomainMarkers(key.intValue());
			} 
			org.jfree.chart.plot.CategoryPlot.this.backgroundDomainMarkers.clear();
		}
		if ((org.jfree.chart.plot.CategoryPlot.this.foregroundDomainMarkers) != null) {
			java.util.Set keys = org.jfree.chart.plot.CategoryPlot.this.foregroundDomainMarkers.keySet();
			java.util.Iterator iterator = keys.iterator();
			while (iterator.hasNext()) {
				java.lang.Integer key = ((java.lang.Integer) (iterator.next()));
				clearDomainMarkers(key.intValue());
			} 
			org.jfree.chart.plot.CategoryPlot.this.foregroundDomainMarkers.clear();
		}
		fireChangeEvent();
	}

	public java.util.Collection getDomainMarkers(org.jfree.chart.util.Layer layer) {
		return getDomainMarkers(0, layer);
	}

	public java.util.Collection getDomainMarkers(int index, org.jfree.chart.util.Layer layer) {
		java.util.Collection result = null;
		java.lang.Integer key = new java.lang.Integer(index);
		if (layer == (org.jfree.chart.util.Layer.FOREGROUND)) {
			result = ((java.util.Collection) (org.jfree.chart.plot.CategoryPlot.this.foregroundDomainMarkers.get(key)));
		}else
			if (layer == (org.jfree.chart.util.Layer.BACKGROUND)) {
				result = ((java.util.Collection) (org.jfree.chart.plot.CategoryPlot.this.backgroundDomainMarkers.get(key)));
			}
		
		if (result != null) {
			result = java.util.Collections.unmodifiableCollection(result);
		}
		return result;
	}

	public void clearDomainMarkers(int index) {
		java.lang.Integer key = new java.lang.Integer(index);
		if ((org.jfree.chart.plot.CategoryPlot.this.backgroundDomainMarkers) != null) {
			java.util.Collection markers = ((java.util.Collection) (org.jfree.chart.plot.CategoryPlot.this.backgroundDomainMarkers.get(key)));
			if (markers != null) {
				java.util.Iterator iterator = markers.iterator();
				while (iterator.hasNext()) {
					org.jfree.chart.plot.Marker m = ((org.jfree.chart.plot.Marker) (iterator.next()));
					m.removeChangeListener(org.jfree.chart.plot.CategoryPlot.this);
				} 
				markers.clear();
			}
		}
		if ((org.jfree.chart.plot.CategoryPlot.this.foregroundDomainMarkers) != null) {
			java.util.Collection markers = ((java.util.Collection) (org.jfree.chart.plot.CategoryPlot.this.foregroundDomainMarkers.get(key)));
			if (markers != null) {
				java.util.Iterator iterator = markers.iterator();
				while (iterator.hasNext()) {
					org.jfree.chart.plot.Marker m = ((org.jfree.chart.plot.Marker) (iterator.next()));
					m.removeChangeListener(org.jfree.chart.plot.CategoryPlot.this);
				} 
				markers.clear();
			}
		}
		fireChangeEvent();
	}

	public boolean removeDomainMarker(org.jfree.chart.plot.Marker marker) {
		return removeDomainMarker(marker, org.jfree.chart.util.Layer.FOREGROUND);
	}

	public boolean removeDomainMarker(org.jfree.chart.plot.Marker marker, org.jfree.chart.util.Layer layer) {
		return removeDomainMarker(0, marker, layer);
	}

	public boolean removeDomainMarker(int index, org.jfree.chart.plot.Marker marker, org.jfree.chart.util.Layer layer) {
		return removeDomainMarker(index, marker, layer, true);
	}

	public boolean removeDomainMarker(int index, org.jfree.chart.plot.Marker marker, org.jfree.chart.util.Layer layer, boolean notify) {
		java.util.ArrayList markers;
		if (layer == (org.jfree.chart.util.Layer.FOREGROUND)) {
			markers = ((java.util.ArrayList) (org.jfree.chart.plot.CategoryPlot.this.foregroundDomainMarkers.get(new java.lang.Integer(index))));
		}else {
			markers = ((java.util.ArrayList) (org.jfree.chart.plot.CategoryPlot.this.backgroundDomainMarkers.get(new java.lang.Integer(index))));
		}
		if (markers == null) {
			return false;
		}
		boolean removed = markers.remove(marker);
		if (removed && notify) {
			fireChangeEvent();
		}
		return removed;
	}

	public void addRangeMarker(org.jfree.chart.plot.Marker marker) {
		addRangeMarker(marker, org.jfree.chart.util.Layer.FOREGROUND);
	}

	public void addRangeMarker(org.jfree.chart.plot.Marker marker, org.jfree.chart.util.Layer layer) {
		addRangeMarker(0, marker, layer);
	}

	public void addRangeMarker(int index, org.jfree.chart.plot.Marker marker, org.jfree.chart.util.Layer layer) {
		addRangeMarker(index, marker, layer, true);
	}

	public void addRangeMarker(int index, org.jfree.chart.plot.Marker marker, org.jfree.chart.util.Layer layer, boolean notify) {
		java.util.Collection markers;
		if (layer == (org.jfree.chart.util.Layer.FOREGROUND)) {
			markers = ((java.util.Collection) (org.jfree.chart.plot.CategoryPlot.this.foregroundRangeMarkers.get(new java.lang.Integer(index))));
			if (markers == null) {
				markers = new java.util.ArrayList();
				org.jfree.chart.plot.CategoryPlot.this.foregroundRangeMarkers.put(new java.lang.Integer(index), markers);
			}
			markers.add(marker);
		}else
			if (layer == (org.jfree.chart.util.Layer.BACKGROUND)) {
				markers = ((java.util.Collection) (org.jfree.chart.plot.CategoryPlot.this.backgroundRangeMarkers.get(new java.lang.Integer(index))));
				if (markers == null) {
					markers = new java.util.ArrayList();
					org.jfree.chart.plot.CategoryPlot.this.backgroundRangeMarkers.put(new java.lang.Integer(index), markers);
				}
				markers.add(marker);
			}
		
		marker.addChangeListener(org.jfree.chart.plot.CategoryPlot.this);
		if (notify) {
			fireChangeEvent();
		}
	}

	public void clearRangeMarkers() {
		if ((org.jfree.chart.plot.CategoryPlot.this.backgroundRangeMarkers) != null) {
			java.util.Set keys = org.jfree.chart.plot.CategoryPlot.this.backgroundRangeMarkers.keySet();
			java.util.Iterator iterator = keys.iterator();
			while (iterator.hasNext()) {
				java.lang.Integer key = ((java.lang.Integer) (iterator.next()));
				clearRangeMarkers(key.intValue());
			} 
			org.jfree.chart.plot.CategoryPlot.this.backgroundRangeMarkers.clear();
		}
		if ((org.jfree.chart.plot.CategoryPlot.this.foregroundRangeMarkers) != null) {
			java.util.Set keys = org.jfree.chart.plot.CategoryPlot.this.foregroundRangeMarkers.keySet();
			java.util.Iterator iterator = keys.iterator();
			while (iterator.hasNext()) {
				java.lang.Integer key = ((java.lang.Integer) (iterator.next()));
				clearRangeMarkers(key.intValue());
			} 
			org.jfree.chart.plot.CategoryPlot.this.foregroundRangeMarkers.clear();
		}
		fireChangeEvent();
	}

	public java.util.Collection getRangeMarkers(org.jfree.chart.util.Layer layer) {
		return getRangeMarkers(0, layer);
	}

	public java.util.Collection getRangeMarkers(int index, org.jfree.chart.util.Layer layer) {
		java.util.Collection result = null;
		java.lang.Integer key = new java.lang.Integer(index);
		if (layer == (org.jfree.chart.util.Layer.FOREGROUND)) {
			result = ((java.util.Collection) (org.jfree.chart.plot.CategoryPlot.this.foregroundRangeMarkers.get(key)));
		}else
			if (layer == (org.jfree.chart.util.Layer.BACKGROUND)) {
				result = ((java.util.Collection) (org.jfree.chart.plot.CategoryPlot.this.backgroundRangeMarkers.get(key)));
			}
		
		if (result != null) {
			result = java.util.Collections.unmodifiableCollection(result);
		}
		return result;
	}

	public void clearRangeMarkers(int index) {
		java.lang.Integer key = new java.lang.Integer(index);
		if ((org.jfree.chart.plot.CategoryPlot.this.backgroundRangeMarkers) != null) {
			java.util.Collection markers = ((java.util.Collection) (org.jfree.chart.plot.CategoryPlot.this.backgroundRangeMarkers.get(key)));
			if (markers != null) {
				java.util.Iterator iterator = markers.iterator();
				while (iterator.hasNext()) {
					org.jfree.chart.plot.Marker m = ((org.jfree.chart.plot.Marker) (iterator.next()));
					m.removeChangeListener(org.jfree.chart.plot.CategoryPlot.this);
				} 
				markers.clear();
			}
		}
		if ((org.jfree.chart.plot.CategoryPlot.this.foregroundRangeMarkers) != null) {
			java.util.Collection markers = ((java.util.Collection) (org.jfree.chart.plot.CategoryPlot.this.foregroundRangeMarkers.get(key)));
			if (markers != null) {
				java.util.Iterator iterator = markers.iterator();
				while (iterator.hasNext()) {
					org.jfree.chart.plot.Marker m = ((org.jfree.chart.plot.Marker) (iterator.next()));
					m.removeChangeListener(org.jfree.chart.plot.CategoryPlot.this);
				} 
				markers.clear();
			}
		}
		fireChangeEvent();
	}

	public boolean removeRangeMarker(org.jfree.chart.plot.Marker marker) {
		return removeRangeMarker(marker, org.jfree.chart.util.Layer.FOREGROUND);
	}

	public boolean removeRangeMarker(org.jfree.chart.plot.Marker marker, org.jfree.chart.util.Layer layer) {
		return removeRangeMarker(0, marker, layer);
	}

	public boolean removeRangeMarker(int index, org.jfree.chart.plot.Marker marker, org.jfree.chart.util.Layer layer) {
		return removeRangeMarker(index, marker, layer, true);
	}

	public boolean removeRangeMarker(int index, org.jfree.chart.plot.Marker marker, org.jfree.chart.util.Layer layer, boolean notify) {
		if (marker == null) {
			throw new java.lang.IllegalArgumentException("Null 'marker' argument.");
		}
		java.util.ArrayList markers;
		if (layer == (org.jfree.chart.util.Layer.FOREGROUND)) {
			markers = ((java.util.ArrayList) (org.jfree.chart.plot.CategoryPlot.this.foregroundRangeMarkers.get(new java.lang.Integer(index))));
		}else {
			markers = ((java.util.ArrayList) (org.jfree.chart.plot.CategoryPlot.this.backgroundRangeMarkers.get(new java.lang.Integer(index))));
		}
		if (markers == null) {
			return false;
		}
		boolean removed = markers.remove(marker);
		if (removed && notify) {
			fireChangeEvent();
		}
		return removed;
	}

	public boolean isDomainCrosshairVisible() {
		return org.jfree.chart.plot.CategoryPlot.this.domainCrosshairVisible;
	}

	public void setDomainCrosshairVisible(boolean flag) {
		if ((org.jfree.chart.plot.CategoryPlot.this.domainCrosshairVisible) != flag) {
			org.jfree.chart.plot.CategoryPlot.this.domainCrosshairVisible = flag;
			fireChangeEvent();
		}
	}

	public java.lang.Comparable getDomainCrosshairRowKey() {
		return org.jfree.chart.plot.CategoryPlot.this.domainCrosshairRowKey;
	}

	public void setDomainCrosshairRowKey(java.lang.Comparable key) {
		setDomainCrosshairRowKey(key, true);
	}

	public void setDomainCrosshairRowKey(java.lang.Comparable key, boolean notify) {
		org.jfree.chart.plot.CategoryPlot.this.domainCrosshairRowKey = key;
		if (notify) {
			fireChangeEvent();
		}
	}

	public java.lang.Comparable getDomainCrosshairColumnKey() {
		return org.jfree.chart.plot.CategoryPlot.this.domainCrosshairColumnKey;
	}

	public void setDomainCrosshairColumnKey(java.lang.Comparable key) {
		setDomainCrosshairColumnKey(key, true);
	}

	public void setDomainCrosshairColumnKey(java.lang.Comparable key, boolean notify) {
		org.jfree.chart.plot.CategoryPlot.this.domainCrosshairColumnKey = key;
		if (notify) {
			fireChangeEvent();
		}
	}

	public int getCrosshairDatasetIndex() {
		return org.jfree.chart.plot.CategoryPlot.this.crosshairDatasetIndex;
	}

	public void setCrosshairDatasetIndex(int index) {
		setCrosshairDatasetIndex(index, true);
	}

	public void setCrosshairDatasetIndex(int index, boolean notify) {
		org.jfree.chart.plot.CategoryPlot.this.crosshairDatasetIndex = index;
		if (notify) {
			fireChangeEvent();
		}
	}

	public java.awt.Paint getDomainCrosshairPaint() {
		return org.jfree.chart.plot.CategoryPlot.this.domainCrosshairPaint;
	}

	public void setDomainCrosshairPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.CategoryPlot.this.domainCrosshairPaint = paint;
		fireChangeEvent();
	}

	public java.awt.Stroke getDomainCrosshairStroke() {
		return org.jfree.chart.plot.CategoryPlot.this.domainCrosshairStroke;
	}

	public void setDomainCrosshairStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.plot.CategoryPlot.this.domainCrosshairStroke = stroke;
	}

	public boolean isRangeCrosshairVisible() {
		return org.jfree.chart.plot.CategoryPlot.this.rangeCrosshairVisible;
	}

	public void setRangeCrosshairVisible(boolean flag) {
		if ((org.jfree.chart.plot.CategoryPlot.this.rangeCrosshairVisible) != flag) {
			org.jfree.chart.plot.CategoryPlot.this.rangeCrosshairVisible = flag;
			fireChangeEvent();
		}
	}

	public boolean isRangeCrosshairLockedOnData() {
		return org.jfree.chart.plot.CategoryPlot.this.rangeCrosshairLockedOnData;
	}

	public void setRangeCrosshairLockedOnData(boolean flag) {
		if ((org.jfree.chart.plot.CategoryPlot.this.rangeCrosshairLockedOnData) != flag) {
			org.jfree.chart.plot.CategoryPlot.this.rangeCrosshairLockedOnData = flag;
			fireChangeEvent();
		}
	}

	public double getRangeCrosshairValue() {
		return org.jfree.chart.plot.CategoryPlot.this.rangeCrosshairValue;
	}

	public void setRangeCrosshairValue(double value) {
		setRangeCrosshairValue(value, true);
	}

	public void setRangeCrosshairValue(double value, boolean notify) {
		org.jfree.chart.plot.CategoryPlot.this.rangeCrosshairValue = value;
		if ((isRangeCrosshairVisible()) && notify) {
			fireChangeEvent();
		}
	}

	public java.awt.Stroke getRangeCrosshairStroke() {
		return org.jfree.chart.plot.CategoryPlot.this.rangeCrosshairStroke;
	}

	public void setRangeCrosshairStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.plot.CategoryPlot.this.rangeCrosshairStroke = stroke;
		fireChangeEvent();
	}

	public java.awt.Paint getRangeCrosshairPaint() {
		return org.jfree.chart.plot.CategoryPlot.this.rangeCrosshairPaint;
	}

	public void setRangeCrosshairPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.CategoryPlot.this.rangeCrosshairPaint = paint;
		fireChangeEvent();
	}

	public java.util.List getAnnotations() {
		return org.jfree.chart.plot.CategoryPlot.this.annotations;
	}

	public void addAnnotation(org.jfree.chart.annotations.CategoryAnnotation annotation) {
		addAnnotation(annotation, true);
	}

	public void addAnnotation(org.jfree.chart.annotations.CategoryAnnotation annotation, boolean notify) {
		if (annotation == null) {
			throw new java.lang.IllegalArgumentException("Null 'annotation' argument.");
		}
		org.jfree.chart.plot.CategoryPlot.this.annotations.add(annotation);
		annotation.addChangeListener(org.jfree.chart.plot.CategoryPlot.this);
		if (notify) {
			fireChangeEvent();
		}
	}

	public boolean removeAnnotation(org.jfree.chart.annotations.CategoryAnnotation annotation) {
		return removeAnnotation(annotation, true);
	}

	public boolean removeAnnotation(org.jfree.chart.annotations.CategoryAnnotation annotation, boolean notify) {
		if (annotation == null) {
			throw new java.lang.IllegalArgumentException("Null 'annotation' argument.");
		}
		boolean removed = org.jfree.chart.plot.CategoryPlot.this.annotations.remove(annotation);
		annotation.removeChangeListener(org.jfree.chart.plot.CategoryPlot.this);
		if (removed && notify) {
			fireChangeEvent();
		}
		return removed;
	}

	public void clearAnnotations() {
		for (int i = 0; i < (org.jfree.chart.plot.CategoryPlot.this.annotations.size()); i++) {
			org.jfree.chart.annotations.CategoryAnnotation annotation = ((org.jfree.chart.annotations.CategoryAnnotation) (org.jfree.chart.plot.CategoryPlot.this.annotations.get(i)));
			annotation.removeChangeListener(org.jfree.chart.plot.CategoryPlot.this);
		}
		org.jfree.chart.plot.CategoryPlot.this.annotations.clear();
		fireChangeEvent();
	}

	public org.jfree.chart.util.ShadowGenerator getShadowGenerator() {
		return org.jfree.chart.plot.CategoryPlot.this.shadowGenerator;
	}

	public void setShadowGenerator(org.jfree.chart.util.ShadowGenerator generator) {
		org.jfree.chart.plot.CategoryPlot.this.shadowGenerator = generator;
		fireChangeEvent();
	}

	protected org.jfree.chart.axis.AxisSpace calculateDomainAxisSpace(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, org.jfree.chart.axis.AxisSpace space) {
		if (space == null) {
			space = new org.jfree.chart.axis.AxisSpace();
		}
		if ((org.jfree.chart.plot.CategoryPlot.this.fixedDomainAxisSpace) != null) {
			if ((org.jfree.chart.plot.CategoryPlot.this.orientation) == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				space.ensureAtLeast(org.jfree.chart.plot.CategoryPlot.this.fixedDomainAxisSpace.getLeft(), org.jfree.chart.util.RectangleEdge.LEFT);
				space.ensureAtLeast(org.jfree.chart.plot.CategoryPlot.this.fixedDomainAxisSpace.getRight(), org.jfree.chart.util.RectangleEdge.RIGHT);
			}else
				if ((org.jfree.chart.plot.CategoryPlot.this.orientation) == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					space.ensureAtLeast(org.jfree.chart.plot.CategoryPlot.this.fixedDomainAxisSpace.getTop(), org.jfree.chart.util.RectangleEdge.TOP);
					space.ensureAtLeast(org.jfree.chart.plot.CategoryPlot.this.fixedDomainAxisSpace.getBottom(), org.jfree.chart.util.RectangleEdge.BOTTOM);
				}
			
		}else {
			org.jfree.chart.util.RectangleEdge domainEdge = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(getDomainAxisLocation(), org.jfree.chart.plot.CategoryPlot.this.orientation);
			if (org.jfree.chart.plot.CategoryPlot.this.drawSharedDomainAxis) {
				space = getDomainAxis().reserveSpace(g2, org.jfree.chart.plot.CategoryPlot.this, plotArea, domainEdge, space);
			}
			for (int i = 0; i < (org.jfree.chart.plot.CategoryPlot.this.domainAxes.size()); i++) {
				org.jfree.chart.axis.Axis xAxis = ((org.jfree.chart.axis.Axis) (org.jfree.chart.plot.CategoryPlot.this.domainAxes.get(i)));
				if (xAxis != null) {
					org.jfree.chart.util.RectangleEdge edge = getDomainAxisEdge(i);
					space = xAxis.reserveSpace(g2, org.jfree.chart.plot.CategoryPlot.this, plotArea, edge, space);
				}
			}
		}
		return space;
	}

	protected org.jfree.chart.axis.AxisSpace calculateRangeAxisSpace(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, org.jfree.chart.axis.AxisSpace space) {
		if (space == null) {
			space = new org.jfree.chart.axis.AxisSpace();
		}
		if ((org.jfree.chart.plot.CategoryPlot.this.fixedRangeAxisSpace) != null) {
			if ((org.jfree.chart.plot.CategoryPlot.this.orientation) == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				space.ensureAtLeast(org.jfree.chart.plot.CategoryPlot.this.fixedRangeAxisSpace.getTop(), org.jfree.chart.util.RectangleEdge.TOP);
				space.ensureAtLeast(org.jfree.chart.plot.CategoryPlot.this.fixedRangeAxisSpace.getBottom(), org.jfree.chart.util.RectangleEdge.BOTTOM);
			}else
				if ((org.jfree.chart.plot.CategoryPlot.this.orientation) == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					space.ensureAtLeast(org.jfree.chart.plot.CategoryPlot.this.fixedRangeAxisSpace.getLeft(), org.jfree.chart.util.RectangleEdge.LEFT);
					space.ensureAtLeast(org.jfree.chart.plot.CategoryPlot.this.fixedRangeAxisSpace.getRight(), org.jfree.chart.util.RectangleEdge.RIGHT);
				}
			
		}else {
			for (int i = 0; i < (org.jfree.chart.plot.CategoryPlot.this.rangeAxes.size()); i++) {
				org.jfree.chart.axis.Axis yAxis = ((org.jfree.chart.axis.Axis) (org.jfree.chart.plot.CategoryPlot.this.rangeAxes.get(i)));
				if (yAxis != null) {
					org.jfree.chart.util.RectangleEdge edge = getRangeAxisEdge(i);
					space = yAxis.reserveSpace(g2, org.jfree.chart.plot.CategoryPlot.this, plotArea, edge, space);
				}
			}
		}
		return space;
	}

	private java.awt.Rectangle integerise(java.awt.geom.Rectangle2D rect) {
		int x0 = ((int) (java.lang.Math.ceil(rect.getMinX())));
		int y0 = ((int) (java.lang.Math.ceil(rect.getMinY())));
		int x1 = ((int) (java.lang.Math.floor(rect.getMaxX())));
		int y1 = ((int) (java.lang.Math.floor(rect.getMaxY())));
		return new java.awt.Rectangle(x0, y0, (x1 - x0), (y1 - y0));
	}

	protected org.jfree.chart.axis.AxisSpace calculateAxisSpace(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea) {
		org.jfree.chart.axis.AxisSpace space = new org.jfree.chart.axis.AxisSpace();
		space = calculateRangeAxisSpace(g2, plotArea, space);
		space = calculateDomainAxisSpace(g2, plotArea, space);
		return space;
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.awt.geom.Point2D anchor, org.jfree.chart.plot.PlotState parentState, org.jfree.chart.plot.PlotRenderingInfo state) {
		boolean b1 = (area.getWidth()) <= (org.jfree.chart.plot.Plot.MINIMUM_WIDTH_TO_DRAW);
		boolean b2 = (area.getHeight()) <= (org.jfree.chart.plot.Plot.MINIMUM_HEIGHT_TO_DRAW);
		if (b1 || b2) {
			return ;
		}
		if (state == null) {
			state = new org.jfree.chart.plot.PlotRenderingInfo(null);
		}
		state.setPlotArea(area);
		org.jfree.chart.util.RectangleInsets insets = getInsets();
		insets.trim(area);
		org.jfree.chart.axis.AxisSpace space = calculateAxisSpace(g2, area);
		java.awt.geom.Rectangle2D dataArea = space.shrink(area, null);
		org.jfree.chart.plot.CategoryPlot.this.axisOffset.trim(dataArea);
		dataArea = integerise(dataArea);
		if (dataArea.isEmpty()) {
			return ;
		}
		state.setDataArea(dataArea);
		createAndAddEntity(((java.awt.geom.Rectangle2D) (dataArea.clone())), state, null, null);
		if ((getRenderer()) != null) {
			getRenderer().drawBackground(g2, org.jfree.chart.plot.CategoryPlot.this, dataArea);
		}else {
			drawBackground(g2, dataArea);
		}
		java.util.Map axisStateMap = drawAxes(g2, area, dataArea, state);
		if ((anchor != null) && (!(dataArea.contains(anchor)))) {
			anchor = org.jfree.chart.util.ShapeUtilities.getPointInRectangle(anchor.getX(), anchor.getY(), dataArea);
		}
		org.jfree.chart.plot.CategoryCrosshairState crosshairState = new org.jfree.chart.plot.CategoryCrosshairState();
		crosshairState.setCrosshairDistance(java.lang.Double.POSITIVE_INFINITY);
		crosshairState.setAnchor(anchor);
		crosshairState.setAnchorX(java.lang.Double.NaN);
		crosshairState.setAnchorY(java.lang.Double.NaN);
		if (anchor != null) {
			org.jfree.chart.axis.ValueAxis rangeAxis = getRangeAxis();
			if (rangeAxis != null) {
				double y;
				if ((getOrientation()) == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					y = rangeAxis.java2DToValue(anchor.getY(), dataArea, getRangeAxisEdge());
				}else {
					y = rangeAxis.java2DToValue(anchor.getX(), dataArea, getRangeAxisEdge());
				}
				crosshairState.setAnchorY(y);
			}
		}
		crosshairState.setRowKey(getDomainCrosshairRowKey());
		crosshairState.setColumnKey(getDomainCrosshairColumnKey());
		crosshairState.setCrosshairY(getRangeCrosshairValue());
		java.awt.Shape savedClip = g2.getClip();
		g2.clip(dataArea);
		drawDomainGridlines(g2, dataArea);
		org.jfree.chart.axis.AxisState rangeAxisState = ((org.jfree.chart.axis.AxisState) (axisStateMap.get(getRangeAxis())));
		if (rangeAxisState == null) {
			if (parentState != null) {
				rangeAxisState = ((org.jfree.chart.axis.AxisState) (parentState.getSharedAxisStates().get(getRangeAxis())));
			}
		}
		if (rangeAxisState != null) {
			drawRangeGridlines(g2, dataArea, rangeAxisState.getTicks());
			drawZeroRangeBaseline(g2, dataArea);
		}
		java.awt.Graphics2D savedG2 = g2;
		java.awt.geom.Rectangle2D savedDataArea = dataArea;
		java.awt.image.BufferedImage dataImage = null;
		if ((org.jfree.chart.plot.CategoryPlot.this.shadowGenerator) != null) {
			dataImage = new java.awt.image.BufferedImage(((int) (dataArea.getWidth())), ((int) (dataArea.getHeight())), java.awt.image.BufferedImage.TYPE_INT_ARGB);
			g2 = dataImage.createGraphics();
			g2.setRenderingHints(savedG2.getRenderingHints());
			dataArea = new java.awt.Rectangle(0, 0, dataImage.getWidth(), dataImage.getHeight());
		}
		for (int i = 0; i < (org.jfree.chart.plot.CategoryPlot.this.renderers.size()); i++) {
			drawDomainMarkers(g2, dataArea, i, org.jfree.chart.util.Layer.BACKGROUND);
		}
		for (int i = 0; i < (org.jfree.chart.plot.CategoryPlot.this.renderers.size()); i++) {
			drawRangeMarkers(g2, dataArea, i, org.jfree.chart.util.Layer.BACKGROUND);
		}
		boolean foundData = false;
		java.awt.Composite originalComposite = g2.getComposite();
		g2.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, getForegroundAlpha()));
		org.jfree.chart.plot.DatasetRenderingOrder order = getDatasetRenderingOrder();
		if (order == (org.jfree.chart.plot.DatasetRenderingOrder.FORWARD)) {
			int datasetCount = org.jfree.chart.plot.CategoryPlot.this.datasets.size();
			for (int i = 0; i < datasetCount; i++) {
				org.jfree.chart.renderer.category.CategoryItemRenderer r = getRenderer(i);
				if (r != null) {
					org.jfree.chart.axis.CategoryAxis domainAxis = getDomainAxisForDataset(i);
					org.jfree.chart.axis.ValueAxis rangeAxis = getRangeAxisForDataset(i);
					r.drawAnnotations(g2, dataArea, domainAxis, rangeAxis, org.jfree.chart.util.Layer.BACKGROUND, state);
				}
			}
			for (int i = 0; i < datasetCount; i++) {
				foundData = (render(g2, dataArea, i, state, crosshairState)) || foundData;
			}
			for (int i = 0; i < datasetCount; i++) {
				org.jfree.chart.renderer.category.CategoryItemRenderer r = getRenderer(i);
				if (r != null) {
					org.jfree.chart.axis.CategoryAxis domainAxis = getDomainAxisForDataset(i);
					org.jfree.chart.axis.ValueAxis rangeAxis = getRangeAxisForDataset(i);
					r.drawAnnotations(g2, dataArea, domainAxis, rangeAxis, org.jfree.chart.util.Layer.FOREGROUND, state);
				}
			}
		}else {
			int datasetCount = org.jfree.chart.plot.CategoryPlot.this.datasets.size();
			for (int i = datasetCount - 1; i >= 0; i--) {
				org.jfree.chart.renderer.category.CategoryItemRenderer r = getRenderer(i);
				if (r != null) {
					org.jfree.chart.axis.CategoryAxis domainAxis = getDomainAxisForDataset(i);
					org.jfree.chart.axis.ValueAxis rangeAxis = getRangeAxisForDataset(i);
					r.drawAnnotations(g2, dataArea, domainAxis, rangeAxis, org.jfree.chart.util.Layer.BACKGROUND, state);
				}
			}
			for (int i = (org.jfree.chart.plot.CategoryPlot.this.datasets.size()) - 1; i >= 0; i--) {
				foundData = (render(g2, dataArea, i, state, crosshairState)) || foundData;
			}
			for (int i = datasetCount - 1; i >= 0; i--) {
				org.jfree.chart.renderer.category.CategoryItemRenderer r = getRenderer(i);
				if (r != null) {
					org.jfree.chart.axis.CategoryAxis domainAxis = getDomainAxisForDataset(i);
					org.jfree.chart.axis.ValueAxis rangeAxis = getRangeAxisForDataset(i);
					r.drawAnnotations(g2, dataArea, domainAxis, rangeAxis, org.jfree.chart.util.Layer.FOREGROUND, state);
				}
			}
		}
		for (int i = 0; i < (org.jfree.chart.plot.CategoryPlot.this.renderers.size()); i++) {
			drawDomainMarkers(g2, dataArea, i, org.jfree.chart.util.Layer.FOREGROUND);
		}
		for (int i = 0; i < (org.jfree.chart.plot.CategoryPlot.this.renderers.size()); i++) {
			drawRangeMarkers(g2, dataArea, i, org.jfree.chart.util.Layer.FOREGROUND);
		}
		drawAnnotations(g2, dataArea, state);
		if ((org.jfree.chart.plot.CategoryPlot.this.shadowGenerator) != null) {
			java.awt.image.BufferedImage shadowImage = org.jfree.chart.plot.CategoryPlot.this.shadowGenerator.createDropShadow(dataImage);
			g2 = savedG2;
			dataArea = savedDataArea;
			g2.drawImage(shadowImage, (((int) (savedDataArea.getX())) + (org.jfree.chart.plot.CategoryPlot.this.shadowGenerator.calculateOffsetX())), (((int) (savedDataArea.getY())) + (org.jfree.chart.plot.CategoryPlot.this.shadowGenerator.calculateOffsetY())), null);
			g2.drawImage(dataImage, ((int) (savedDataArea.getX())), ((int) (savedDataArea.getY())), null);
		}
		g2.setClip(savedClip);
		g2.setComposite(originalComposite);
		if (!foundData) {
			drawNoDataMessage(g2, dataArea);
		}
		int datasetIndex = crosshairState.getDatasetIndex();
		setCrosshairDatasetIndex(datasetIndex, false);
		java.lang.Comparable rowKey = crosshairState.getRowKey();
		java.lang.Comparable columnKey = crosshairState.getColumnKey();
		setDomainCrosshairRowKey(rowKey, false);
		setDomainCrosshairColumnKey(columnKey, false);
		if ((isDomainCrosshairVisible()) && (columnKey != null)) {
			java.awt.Paint paint = getDomainCrosshairPaint();
			java.awt.Stroke stroke = getDomainCrosshairStroke();
			drawDomainCrosshair(g2, dataArea, org.jfree.chart.plot.CategoryPlot.this.orientation, datasetIndex, rowKey, columnKey, stroke, paint);
		}
		org.jfree.chart.axis.ValueAxis yAxis = getRangeAxisForDataset(datasetIndex);
		org.jfree.chart.util.RectangleEdge yAxisEdge = getRangeAxisEdge();
		if ((!(org.jfree.chart.plot.CategoryPlot.this.rangeCrosshairLockedOnData)) && (anchor != null)) {
			double yy;
			if ((getOrientation()) == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				yy = yAxis.java2DToValue(anchor.getY(), dataArea, yAxisEdge);
			}else {
				yy = yAxis.java2DToValue(anchor.getX(), dataArea, yAxisEdge);
			}
			crosshairState.setCrosshairY(yy);
		}
		setRangeCrosshairValue(crosshairState.getCrosshairY(), false);
		if (isRangeCrosshairVisible()) {
			double y = getRangeCrosshairValue();
			java.awt.Paint paint = getRangeCrosshairPaint();
			java.awt.Stroke stroke = getRangeCrosshairStroke();
			drawRangeCrosshair(g2, dataArea, getOrientation(), y, yAxis, stroke, paint);
		}
		if (isOutlineVisible()) {
			if ((getRenderer()) != null) {
				getRenderer().drawOutline(g2, org.jfree.chart.plot.CategoryPlot.this, dataArea);
			}else {
				drawOutline(g2, dataArea);
			}
		}
	}

	public void drawBackground(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area) {
		fillBackground(g2, area, org.jfree.chart.plot.CategoryPlot.this.orientation);
		drawBackgroundImage(g2, area);
	}

	protected java.util.Map drawAxes(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PlotRenderingInfo plotState) {
		org.jfree.chart.axis.AxisCollection axisCollection = new org.jfree.chart.axis.AxisCollection();
		for (int index = 0; index < (org.jfree.chart.plot.CategoryPlot.this.domainAxes.size()); index++) {
			org.jfree.chart.axis.CategoryAxis xAxis = ((org.jfree.chart.axis.CategoryAxis) (org.jfree.chart.plot.CategoryPlot.this.domainAxes.get(index)));
			if (xAxis != null) {
				axisCollection.add(xAxis, getDomainAxisEdge(index));
			}
		}
		for (int index = 0; index < (org.jfree.chart.plot.CategoryPlot.this.rangeAxes.size()); index++) {
			org.jfree.chart.axis.ValueAxis yAxis = ((org.jfree.chart.axis.ValueAxis) (org.jfree.chart.plot.CategoryPlot.this.rangeAxes.get(index)));
			if (yAxis != null) {
				axisCollection.add(yAxis, getRangeAxisEdge(index));
			}
		}
		java.util.Map axisStateMap = new java.util.HashMap();
		double cursor = (dataArea.getMinY()) - (org.jfree.chart.plot.CategoryPlot.this.axisOffset.calculateTopOutset(dataArea.getHeight()));
		java.util.Iterator iterator = axisCollection.getAxesAtTop().iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.axis.Axis axis = ((org.jfree.chart.axis.Axis) (iterator.next()));
			if (axis != null) {
				org.jfree.chart.axis.AxisState axisState = axis.draw(g2, cursor, plotArea, dataArea, org.jfree.chart.util.RectangleEdge.TOP, plotState);
				cursor = axisState.getCursor();
				axisStateMap.put(axis, axisState);
			}
		} 
		cursor = (dataArea.getMaxY()) + (org.jfree.chart.plot.CategoryPlot.this.axisOffset.calculateBottomOutset(dataArea.getHeight()));
		iterator = axisCollection.getAxesAtBottom().iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.axis.Axis axis = ((org.jfree.chart.axis.Axis) (iterator.next()));
			if (axis != null) {
				org.jfree.chart.axis.AxisState axisState = axis.draw(g2, cursor, plotArea, dataArea, org.jfree.chart.util.RectangleEdge.BOTTOM, plotState);
				cursor = axisState.getCursor();
				axisStateMap.put(axis, axisState);
			}
		} 
		cursor = (dataArea.getMinX()) - (org.jfree.chart.plot.CategoryPlot.this.axisOffset.calculateLeftOutset(dataArea.getWidth()));
		iterator = axisCollection.getAxesAtLeft().iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.axis.Axis axis = ((org.jfree.chart.axis.Axis) (iterator.next()));
			if (axis != null) {
				org.jfree.chart.axis.AxisState axisState = axis.draw(g2, cursor, plotArea, dataArea, org.jfree.chart.util.RectangleEdge.LEFT, plotState);
				cursor = axisState.getCursor();
				axisStateMap.put(axis, axisState);
			}
		} 
		cursor = (dataArea.getMaxX()) + (org.jfree.chart.plot.CategoryPlot.this.axisOffset.calculateRightOutset(dataArea.getWidth()));
		iterator = axisCollection.getAxesAtRight().iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.axis.Axis axis = ((org.jfree.chart.axis.Axis) (iterator.next()));
			if (axis != null) {
				org.jfree.chart.axis.AxisState axisState = axis.draw(g2, cursor, plotArea, dataArea, org.jfree.chart.util.RectangleEdge.RIGHT, plotState);
				cursor = axisState.getCursor();
				axisStateMap.put(axis, axisState);
			}
		} 
		return axisStateMap;
	}

	public boolean render(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, int index, org.jfree.chart.plot.PlotRenderingInfo info, org.jfree.chart.plot.CategoryCrosshairState crosshairState) {
		boolean foundData = false;
		org.jfree.data.category.CategoryDataset currentDataset = getDataset(index);
		org.jfree.chart.renderer.category.CategoryItemRenderer renderer = getRenderer(index);
		org.jfree.chart.axis.CategoryAxis domainAxis = getDomainAxisForDataset(index);
		org.jfree.chart.axis.ValueAxis rangeAxis = getRangeAxisForDataset(index);
		boolean hasData = !(org.jfree.data.general.DatasetUtilities.isEmptyOrNull(currentDataset));
		if (hasData && (renderer != null)) {
			foundData = true;
			org.jfree.chart.renderer.category.CategoryItemRendererState state = renderer.initialise(g2, dataArea, org.jfree.chart.plot.CategoryPlot.this, currentDataset, info);
			org.jfree.data.category.CategoryDatasetSelectionState selectionState = state.getSelectionState();
			state.setCrosshairState(crosshairState);
			int columnCount = currentDataset.getColumnCount();
			int rowCount = currentDataset.getRowCount();
			int passCount = renderer.getPassCount();
			for (int pass = 0; pass < passCount; pass++) {
				if ((org.jfree.chart.plot.CategoryPlot.this.columnRenderingOrder) == (org.jfree.chart.util.SortOrder.ASCENDING)) {
					for (int column = 0; column < columnCount; column++) {
						if ((org.jfree.chart.plot.CategoryPlot.this.rowRenderingOrder) == (org.jfree.chart.util.SortOrder.ASCENDING)) {
							for (int row = 0; row < rowCount; row++) {
								boolean selected = false;
								if (selectionState != null) {
									selected = selectionState.isSelected(row, column);
								}
								renderer.drawItem(g2, state, dataArea, org.jfree.chart.plot.CategoryPlot.this, domainAxis, rangeAxis, currentDataset, row, column, selected, pass);
							}
						}else {
							for (int row = rowCount - 1; row >= 0; row--) {
								boolean selected = false;
								if (selectionState != null) {
									selected = selectionState.isSelected(row, column);
								}
								renderer.drawItem(g2, state, dataArea, org.jfree.chart.plot.CategoryPlot.this, domainAxis, rangeAxis, currentDataset, row, column, selected, pass);
							}
						}
					}
				}else {
					for (int column = columnCount - 1; column >= 0; column--) {
						if ((org.jfree.chart.plot.CategoryPlot.this.rowRenderingOrder) == (org.jfree.chart.util.SortOrder.ASCENDING)) {
							for (int row = 0; row < rowCount; row++) {
								boolean selected = false;
								if (selectionState != null) {
									selected = selectionState.isSelected(row, column);
								}
								renderer.drawItem(g2, state, dataArea, org.jfree.chart.plot.CategoryPlot.this, domainAxis, rangeAxis, currentDataset, row, column, selected, pass);
							}
						}else {
							for (int row = rowCount - 1; row >= 0; row--) {
								boolean selected = false;
								if (selectionState != null) {
									selected = selectionState.isSelected(row, column);
								}
								renderer.drawItem(g2, state, dataArea, org.jfree.chart.plot.CategoryPlot.this, domainAxis, rangeAxis, currentDataset, row, column, selected, pass);
							}
						}
					}
				}
			}
		}
		return foundData;
	}

	protected void drawDomainGridlines(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea) {
		if (!(isDomainGridlinesVisible())) {
			return ;
		}
		org.jfree.chart.axis.CategoryAnchor anchor = getDomainGridlinePosition();
		org.jfree.chart.util.RectangleEdge domainAxisEdge = getDomainAxisEdge();
		org.jfree.data.category.CategoryDataset dataset = getDataset();
		if (dataset == null) {
			return ;
		}
		org.jfree.chart.axis.CategoryAxis axis = getDomainAxis();
		if (axis != null) {
			int columnCount = dataset.getColumnCount();
			for (int c = 0; c < columnCount; c++) {
				double xx = axis.getCategoryJava2DCoordinate(anchor, c, columnCount, dataArea, domainAxisEdge);
				org.jfree.chart.renderer.category.CategoryItemRenderer renderer1 = getRenderer();
				if (renderer1 != null) {
					renderer1.drawDomainLine(g2, org.jfree.chart.plot.CategoryPlot.this, dataArea, xx, getDomainGridlinePaint(), getDomainGridlineStroke());
				}
			}
		}
	}

	protected void drawRangeGridlines(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, java.util.List ticks) {
		if ((!(isRangeGridlinesVisible())) && (!(isRangeMinorGridlinesVisible()))) {
			return ;
		}
		org.jfree.chart.axis.ValueAxis axis = getRangeAxis();
		if (axis == null) {
			return ;
		}
		org.jfree.chart.renderer.category.CategoryItemRenderer r = getRenderer();
		if (r == null) {
			return ;
		}
		java.awt.Stroke gridStroke = null;
		java.awt.Paint gridPaint = null;
		boolean paintLine = false;
		java.util.Iterator iterator = ticks.iterator();
		while (iterator.hasNext()) {
			paintLine = false;
			org.jfree.chart.axis.ValueTick tick = ((org.jfree.chart.axis.ValueTick) (iterator.next()));
			if (((tick.getTickType()) == (org.jfree.chart.axis.TickType.MINOR)) && (isRangeMinorGridlinesVisible())) {
				gridStroke = getRangeMinorGridlineStroke();
				gridPaint = getRangeMinorGridlinePaint();
				paintLine = true;
			}else
				if (((tick.getTickType()) == (org.jfree.chart.axis.TickType.MAJOR)) && (isRangeGridlinesVisible())) {
					gridStroke = getRangeGridlineStroke();
					gridPaint = getRangeGridlinePaint();
					paintLine = true;
				}
			
			if ((((tick.getValue()) != 0.0) || (!(isRangeZeroBaselineVisible()))) && paintLine) {
				r.drawRangeLine(g2, org.jfree.chart.plot.CategoryPlot.this, axis, dataArea, tick.getValue(), gridPaint, gridStroke);
			}
		} 
	}

	protected void drawZeroRangeBaseline(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area) {
		if (!(isRangeZeroBaselineVisible())) {
			return ;
		}
		org.jfree.chart.renderer.category.CategoryItemRenderer r = getRenderer();
		r.drawRangeLine(g2, org.jfree.chart.plot.CategoryPlot.this, getRangeAxis(), area, 0.0, org.jfree.chart.plot.CategoryPlot.this.rangeZeroBaselinePaint, org.jfree.chart.plot.CategoryPlot.this.rangeZeroBaselineStroke);
	}

	protected void drawAnnotations(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PlotRenderingInfo info) {
		java.util.Iterator iterator = getAnnotations().iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.annotations.CategoryAnnotation annotation = ((org.jfree.chart.annotations.CategoryAnnotation) (iterator.next()));
			annotation.draw(g2, org.jfree.chart.plot.CategoryPlot.this, dataArea, getDomainAxis(), getRangeAxis(), 0, info);
		} 
	}

	protected void drawDomainMarkers(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, int index, org.jfree.chart.util.Layer layer) {
		org.jfree.chart.renderer.category.CategoryItemRenderer r = getRenderer(index);
		if (r == null) {
			return ;
		}
		java.util.Collection markers = getDomainMarkers(index, layer);
		org.jfree.chart.axis.CategoryAxis axis = getDomainAxisForDataset(index);
		if ((markers != null) && (axis != null)) {
			java.util.Iterator iterator = markers.iterator();
			while (iterator.hasNext()) {
				org.jfree.chart.plot.CategoryMarker marker = ((org.jfree.chart.plot.CategoryMarker) (iterator.next()));
				r.drawDomainMarker(g2, org.jfree.chart.plot.CategoryPlot.this, axis, marker, dataArea);
			} 
		}
	}

	protected void drawRangeMarkers(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, int index, org.jfree.chart.util.Layer layer) {
		org.jfree.chart.renderer.category.CategoryItemRenderer r = getRenderer(index);
		if (r == null) {
			return ;
		}
		java.util.Collection markers = getRangeMarkers(index, layer);
		org.jfree.chart.axis.ValueAxis axis = getRangeAxisForDataset(index);
		if ((markers != null) && (axis != null)) {
			java.util.Iterator iterator = markers.iterator();
			while (iterator.hasNext()) {
				org.jfree.chart.plot.Marker marker = ((org.jfree.chart.plot.Marker) (iterator.next()));
				r.drawRangeMarker(g2, org.jfree.chart.plot.CategoryPlot.this, axis, marker, dataArea);
			} 
		}
	}

	protected void drawRangeLine(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, double value, java.awt.Stroke stroke, java.awt.Paint paint) {
		double java2D = getRangeAxis().valueToJava2D(value, dataArea, getRangeAxisEdge());
		java.awt.geom.Line2D line = null;
		if ((org.jfree.chart.plot.CategoryPlot.this.orientation) == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			line = new java.awt.geom.Line2D.Double(java2D, dataArea.getMinY(), java2D, dataArea.getMaxY());
		}else
			if ((org.jfree.chart.plot.CategoryPlot.this.orientation) == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				line = new java.awt.geom.Line2D.Double(dataArea.getMinX(), java2D, dataArea.getMaxX(), java2D);
			}
		
		g2.setStroke(stroke);
		g2.setPaint(paint);
		g2.draw(line);
	}

	protected void drawDomainCrosshair(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PlotOrientation orientation, int datasetIndex, java.lang.Comparable rowKey, java.lang.Comparable columnKey, java.awt.Stroke stroke, java.awt.Paint paint) {
		org.jfree.data.category.CategoryDataset dataset = getDataset(datasetIndex);
		org.jfree.chart.axis.CategoryAxis axis = getDomainAxisForDataset(datasetIndex);
		org.jfree.chart.renderer.category.CategoryItemRenderer renderer = getRenderer(datasetIndex);
		java.awt.geom.Line2D line = null;
		if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
			double xx = renderer.getItemMiddle(rowKey, columnKey, dataset, axis, dataArea, org.jfree.chart.util.RectangleEdge.BOTTOM);
			line = new java.awt.geom.Line2D.Double(xx, dataArea.getMinY(), xx, dataArea.getMaxY());
		}else {
			double yy = renderer.getItemMiddle(rowKey, columnKey, dataset, axis, dataArea, org.jfree.chart.util.RectangleEdge.LEFT);
			line = new java.awt.geom.Line2D.Double(dataArea.getMinX(), yy, dataArea.getMaxX(), yy);
		}
		g2.setStroke(stroke);
		g2.setPaint(paint);
		g2.draw(line);
	}

	protected void drawRangeCrosshair(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PlotOrientation orientation, double value, org.jfree.chart.axis.ValueAxis axis, java.awt.Stroke stroke, java.awt.Paint paint) {
		if (!(axis.getRange().contains(value))) {
			return ;
		}
		java.awt.geom.Line2D line = null;
		if (orientation == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			double xx = axis.valueToJava2D(value, dataArea, org.jfree.chart.util.RectangleEdge.BOTTOM);
			line = new java.awt.geom.Line2D.Double(xx, dataArea.getMinY(), xx, dataArea.getMaxY());
		}else {
			double yy = axis.valueToJava2D(value, dataArea, org.jfree.chart.util.RectangleEdge.LEFT);
			line = new java.awt.geom.Line2D.Double(dataArea.getMinX(), yy, dataArea.getMaxX(), yy);
		}
		g2.setStroke(stroke);
		g2.setPaint(paint);
		g2.draw(line);
	}

	public org.jfree.data.Range getDataRange(org.jfree.chart.axis.ValueAxis axis) {
		org.jfree.data.Range result = null;
		java.util.List mappedDatasets = new java.util.ArrayList();
		int rangeIndex = org.jfree.chart.plot.CategoryPlot.this.rangeAxes.indexOf(axis);
		if (rangeIndex >= 0) {
			mappedDatasets.addAll(datasetsMappedToRangeAxis(rangeIndex));
		}else
			if (axis == (getRangeAxis())) {
				mappedDatasets.addAll(datasetsMappedToRangeAxis(0));
			}
		
		java.util.Iterator iterator = mappedDatasets.iterator();
		while (iterator.hasNext()) {
			org.jfree.data.category.CategoryDataset d = ((org.jfree.data.category.CategoryDataset) (iterator.next()));
			org.jfree.chart.renderer.category.CategoryItemRenderer r = getRendererForDataset(d);
			if (r != null) {
				result = org.jfree.data.Range.combine(result, r.findRangeBounds(d));
			}
		} 
		return result;
	}

	private java.util.List datasetsMappedToDomainAxis(int axisIndex) {
		java.lang.Integer key = new java.lang.Integer(axisIndex);
		java.util.List result = new java.util.ArrayList();
		for (int i = 0; i < (org.jfree.chart.plot.CategoryPlot.this.datasets.size()); i++) {
			java.util.List mappedAxes = ((java.util.List) (org.jfree.chart.plot.CategoryPlot.this.datasetToDomainAxesMap.get(new java.lang.Integer(i))));
			org.jfree.data.category.CategoryDataset dataset = ((org.jfree.data.category.CategoryDataset) (org.jfree.chart.plot.CategoryPlot.this.datasets.get(i)));
			if (mappedAxes == null) {
				if (key.equals(org.jfree.chart.plot.Plot.ZERO)) {
					if (dataset != null) {
						result.add(dataset);
					}
				}
			}else {
				if (mappedAxes.contains(key)) {
					if (dataset != null) {
						result.add(dataset);
					}
				}
			}
		}
		return result;
	}

	private java.util.List datasetsMappedToRangeAxis(int index) {
		java.lang.Integer key = new java.lang.Integer(index);
		java.util.List result = new java.util.ArrayList();
		for (int i = 0; i < (org.jfree.chart.plot.CategoryPlot.this.datasets.size()); i++) {
			java.util.List mappedAxes = ((java.util.List) (org.jfree.chart.plot.CategoryPlot.this.datasetToRangeAxesMap.get(new java.lang.Integer(i))));
			if (mappedAxes == null) {
				if (key.equals(org.jfree.chart.plot.Plot.ZERO)) {
					result.add(org.jfree.chart.plot.CategoryPlot.this.datasets.get(i));
				}
			}else {
				if (mappedAxes.contains(key)) {
					result.add(org.jfree.chart.plot.CategoryPlot.this.datasets.get(i));
				}
			}
		}
		return result;
	}

	public int getWeight() {
		return org.jfree.chart.plot.CategoryPlot.this.weight;
	}

	public void setWeight(int weight) {
		org.jfree.chart.plot.CategoryPlot.this.weight = weight;
		fireChangeEvent();
	}

	public org.jfree.chart.axis.AxisSpace getFixedDomainAxisSpace() {
		return org.jfree.chart.plot.CategoryPlot.this.fixedDomainAxisSpace;
	}

	public void setFixedDomainAxisSpace(org.jfree.chart.axis.AxisSpace space) {
		setFixedDomainAxisSpace(space, true);
	}

	public void setFixedDomainAxisSpace(org.jfree.chart.axis.AxisSpace space, boolean notify) {
		org.jfree.chart.plot.CategoryPlot.this.fixedDomainAxisSpace = space;
		if (notify) {
			fireChangeEvent();
		}
	}

	public org.jfree.chart.axis.AxisSpace getFixedRangeAxisSpace() {
		return org.jfree.chart.plot.CategoryPlot.this.fixedRangeAxisSpace;
	}

	public void setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace space) {
		setFixedRangeAxisSpace(space, true);
	}

	public void setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace space, boolean notify) {
		org.jfree.chart.plot.CategoryPlot.this.fixedRangeAxisSpace = space;
		if (notify) {
			fireChangeEvent();
		}
	}

	public java.util.List getCategories() {
		java.util.List result = null;
		if ((getDataset()) != null) {
			result = java.util.Collections.unmodifiableList(getDataset().getColumnKeys());
		}
		return result;
	}

	public java.util.List getCategoriesForAxis(org.jfree.chart.axis.CategoryAxis axis) {
		java.util.List result = new java.util.ArrayList();
		int axisIndex = org.jfree.chart.plot.CategoryPlot.this.domainAxes.indexOf(axis);
		java.util.List datasets = datasetsMappedToDomainAxis(axisIndex);
		java.util.Iterator iterator = datasets.iterator();
		while (iterator.hasNext()) {
			org.jfree.data.category.CategoryDataset dataset = ((org.jfree.data.category.CategoryDataset) (iterator.next()));
			for (int i = 0; i < (dataset.getColumnCount()); i++) {
				java.lang.Comparable category = dataset.getColumnKey(i);
				if (!(result.contains(category))) {
					result.add(category);
				}
			}
		} 
		return result;
	}

	public boolean getDrawSharedDomainAxis() {
		return org.jfree.chart.plot.CategoryPlot.this.drawSharedDomainAxis;
	}

	public void setDrawSharedDomainAxis(boolean draw) {
		org.jfree.chart.plot.CategoryPlot.this.drawSharedDomainAxis = draw;
		fireChangeEvent();
	}

	public boolean isDomainPannable() {
		return false;
	}

	public boolean isRangePannable() {
		return org.jfree.chart.plot.CategoryPlot.this.rangePannable;
	}

	public void setRangePannable(boolean pannable) {
		org.jfree.chart.plot.CategoryPlot.this.rangePannable = pannable;
	}

	public void panDomainAxes(double percent, org.jfree.chart.plot.PlotRenderingInfo info, java.awt.geom.Point2D source) {
	}

	public void panRangeAxes(double percent, org.jfree.chart.plot.PlotRenderingInfo info, java.awt.geom.Point2D source) {
		if (!(isRangePannable())) {
			return ;
		}
		int rangeAxisCount = getRangeAxisCount();
		for (int i = 0; i < rangeAxisCount; i++) {
			org.jfree.chart.axis.ValueAxis axis = getRangeAxis(i);
			if (axis == null) {
				continue;
			}
			double length = axis.getRange().getLength();
			double adj = percent * length;
			if (axis.isInverted()) {
				adj = -adj;
			}
			axis.setRange(((axis.getLowerBound()) + adj), ((axis.getUpperBound()) + adj));
		}
	}

	public boolean isDomainZoomable() {
		return false;
	}

	public boolean isRangeZoomable() {
		return true;
	}

	public void zoomDomainAxes(double factor, org.jfree.chart.plot.PlotRenderingInfo state, java.awt.geom.Point2D source) {
	}

	public void zoomDomainAxes(double lowerPercent, double upperPercent, org.jfree.chart.plot.PlotRenderingInfo state, java.awt.geom.Point2D source) {
	}

	public void zoomDomainAxes(double factor, org.jfree.chart.plot.PlotRenderingInfo info, java.awt.geom.Point2D source, boolean useAnchor) {
	}

	public void zoomRangeAxes(double factor, org.jfree.chart.plot.PlotRenderingInfo state, java.awt.geom.Point2D source) {
		zoomRangeAxes(factor, state, source, false);
	}

	public void zoomRangeAxes(double factor, org.jfree.chart.plot.PlotRenderingInfo info, java.awt.geom.Point2D source, boolean useAnchor) {
		for (int i = 0; i < (org.jfree.chart.plot.CategoryPlot.this.rangeAxes.size()); i++) {
			org.jfree.chart.axis.ValueAxis rangeAxis = ((org.jfree.chart.axis.ValueAxis) (org.jfree.chart.plot.CategoryPlot.this.rangeAxes.get(i)));
			if (rangeAxis != null) {
				if (useAnchor) {
					double sourceY = source.getY();
					if ((org.jfree.chart.plot.CategoryPlot.this.orientation) == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
						sourceY = source.getX();
					}
					double anchorY = rangeAxis.java2DToValue(sourceY, info.getDataArea(), getRangeAxisEdge());
					rangeAxis.resizeRange2(factor, anchorY);
				}else {
					rangeAxis.resizeRange(factor);
				}
			}
		}
	}

	public void zoomRangeAxes(double lowerPercent, double upperPercent, org.jfree.chart.plot.PlotRenderingInfo state, java.awt.geom.Point2D source) {
		for (int i = 0; i < (org.jfree.chart.plot.CategoryPlot.this.rangeAxes.size()); i++) {
			org.jfree.chart.axis.ValueAxis rangeAxis = ((org.jfree.chart.axis.ValueAxis) (org.jfree.chart.plot.CategoryPlot.this.rangeAxes.get(i)));
			if (rangeAxis != null) {
				rangeAxis.zoomRange(lowerPercent, upperPercent);
			}
		}
	}

	public double getAnchorValue() {
		return org.jfree.chart.plot.CategoryPlot.this.anchorValue;
	}

	public void setAnchorValue(double value) {
		setAnchorValue(value, true);
	}

	public void setAnchorValue(double value, boolean notify) {
		org.jfree.chart.plot.CategoryPlot.this.anchorValue = value;
		if (notify) {
			fireChangeEvent();
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.CategoryPlot.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.CategoryPlot)) {
			return false;
		}
		org.jfree.chart.plot.CategoryPlot that = ((org.jfree.chart.plot.CategoryPlot) (obj));
		if ((org.jfree.chart.plot.CategoryPlot.this.orientation) != (that.orientation)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.CategoryPlot.this.axisOffset, that.axisOffset))) {
			return false;
		}
		if (!(org.jfree.chart.plot.CategoryPlot.this.domainAxes.equals(that.domainAxes))) {
			return false;
		}
		if (!(org.jfree.chart.plot.CategoryPlot.this.domainAxisLocations.equals(that.domainAxisLocations))) {
			return false;
		}
		if ((org.jfree.chart.plot.CategoryPlot.this.drawSharedDomainAxis) != (that.drawSharedDomainAxis)) {
			return false;
		}
		if (!(org.jfree.chart.plot.CategoryPlot.this.rangeAxes.equals(that.rangeAxes))) {
			return false;
		}
		if (!(org.jfree.chart.plot.CategoryPlot.this.rangeAxisLocations.equals(that.rangeAxisLocations))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.CategoryPlot.this.datasetToDomainAxesMap, that.datasetToDomainAxesMap))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.CategoryPlot.this.datasetToRangeAxesMap, that.datasetToRangeAxesMap))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.CategoryPlot.this.renderers, that.renderers))) {
			return false;
		}
		if ((org.jfree.chart.plot.CategoryPlot.this.renderingOrder) != (that.renderingOrder)) {
			return false;
		}
		if ((org.jfree.chart.plot.CategoryPlot.this.columnRenderingOrder) != (that.columnRenderingOrder)) {
			return false;
		}
		if ((org.jfree.chart.plot.CategoryPlot.this.rowRenderingOrder) != (that.rowRenderingOrder)) {
			return false;
		}
		if ((org.jfree.chart.plot.CategoryPlot.this.domainGridlinesVisible) != (that.domainGridlinesVisible)) {
			return false;
		}
		if ((org.jfree.chart.plot.CategoryPlot.this.domainGridlinePosition) != (that.domainGridlinePosition)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.CategoryPlot.this.domainGridlineStroke, that.domainGridlineStroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.CategoryPlot.this.domainGridlinePaint, that.domainGridlinePaint))) {
			return false;
		}
		if ((org.jfree.chart.plot.CategoryPlot.this.rangeGridlinesVisible) != (that.rangeGridlinesVisible)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.CategoryPlot.this.rangeGridlineStroke, that.rangeGridlineStroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.CategoryPlot.this.rangeGridlinePaint, that.rangeGridlinePaint))) {
			return false;
		}
		if ((org.jfree.chart.plot.CategoryPlot.this.anchorValue) != (that.anchorValue)) {
			return false;
		}
		if ((org.jfree.chart.plot.CategoryPlot.this.rangeCrosshairVisible) != (that.rangeCrosshairVisible)) {
			return false;
		}
		if ((org.jfree.chart.plot.CategoryPlot.this.rangeCrosshairValue) != (that.rangeCrosshairValue)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.CategoryPlot.this.rangeCrosshairStroke, that.rangeCrosshairStroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.CategoryPlot.this.rangeCrosshairPaint, that.rangeCrosshairPaint))) {
			return false;
		}
		if ((org.jfree.chart.plot.CategoryPlot.this.rangeCrosshairLockedOnData) != (that.rangeCrosshairLockedOnData)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.CategoryPlot.this.foregroundDomainMarkers, that.foregroundDomainMarkers))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.CategoryPlot.this.backgroundDomainMarkers, that.backgroundDomainMarkers))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.CategoryPlot.this.foregroundRangeMarkers, that.foregroundRangeMarkers))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.CategoryPlot.this.backgroundRangeMarkers, that.backgroundRangeMarkers))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.CategoryPlot.this.annotations, that.annotations))) {
			return false;
		}
		if ((org.jfree.chart.plot.CategoryPlot.this.weight) != (that.weight)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.CategoryPlot.this.fixedDomainAxisSpace, that.fixedDomainAxisSpace))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.CategoryPlot.this.fixedRangeAxisSpace, that.fixedRangeAxisSpace))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.CategoryPlot.this.fixedLegendItems, that.fixedLegendItems))) {
			return false;
		}
		if ((org.jfree.chart.plot.CategoryPlot.this.domainCrosshairVisible) != (that.domainCrosshairVisible)) {
			return false;
		}
		if ((org.jfree.chart.plot.CategoryPlot.this.crosshairDatasetIndex) != (that.crosshairDatasetIndex)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.CategoryPlot.this.domainCrosshairColumnKey, that.domainCrosshairColumnKey))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.CategoryPlot.this.domainCrosshairRowKey, that.domainCrosshairRowKey))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.CategoryPlot.this.domainCrosshairPaint, that.domainCrosshairPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.CategoryPlot.this.domainCrosshairStroke, that.domainCrosshairStroke))) {
			return false;
		}
		if ((org.jfree.chart.plot.CategoryPlot.this.rangeMinorGridlinesVisible) != (that.rangeMinorGridlinesVisible)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.CategoryPlot.this.rangeMinorGridlinePaint, that.rangeMinorGridlinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.CategoryPlot.this.rangeMinorGridlineStroke, that.rangeMinorGridlineStroke))) {
			return false;
		}
		if ((org.jfree.chart.plot.CategoryPlot.this.rangeZeroBaselineVisible) != (that.rangeZeroBaselineVisible)) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.CategoryPlot.this.rangeZeroBaselinePaint, that.rangeZeroBaselinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.CategoryPlot.this.rangeZeroBaselineStroke, that.rangeZeroBaselineStroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.CategoryPlot.this.shadowGenerator, that.shadowGenerator))) {
			return false;
		}
		return super.equals(obj);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.plot.CategoryPlot clone = ((org.jfree.chart.plot.CategoryPlot) (super.clone()));
		clone.domainAxes = new org.jfree.chart.util.ObjectList();
		for (int i = 0; i < (org.jfree.chart.plot.CategoryPlot.this.domainAxes.size()); i++) {
			org.jfree.chart.axis.CategoryAxis xAxis = ((org.jfree.chart.axis.CategoryAxis) (org.jfree.chart.plot.CategoryPlot.this.domainAxes.get(i)));
			if (xAxis != null) {
				org.jfree.chart.axis.CategoryAxis clonedAxis = ((org.jfree.chart.axis.CategoryAxis) (xAxis.clone()));
				clone.setDomainAxis(i, clonedAxis);
			}
		}
		clone.domainAxisLocations = ((org.jfree.chart.util.ObjectList) (org.jfree.chart.plot.CategoryPlot.this.domainAxisLocations.clone()));
		clone.rangeAxes = new org.jfree.chart.util.ObjectList();
		for (int i = 0; i < (org.jfree.chart.plot.CategoryPlot.this.rangeAxes.size()); i++) {
			org.jfree.chart.axis.ValueAxis yAxis = ((org.jfree.chart.axis.ValueAxis) (org.jfree.chart.plot.CategoryPlot.this.rangeAxes.get(i)));
			if (yAxis != null) {
				org.jfree.chart.axis.ValueAxis clonedAxis = ((org.jfree.chart.axis.ValueAxis) (yAxis.clone()));
				clone.setRangeAxis(i, clonedAxis);
			}
		}
		clone.rangeAxisLocations = ((org.jfree.chart.util.ObjectList) (org.jfree.chart.plot.CategoryPlot.this.rangeAxisLocations.clone()));
		clone.datasets = ((org.jfree.chart.util.ObjectList) (org.jfree.chart.plot.CategoryPlot.this.datasets.clone()));
		for (int i = 0; i < (clone.datasets.size()); i++) {
			org.jfree.data.category.CategoryDataset dataset = clone.getDataset(i);
			if (dataset != null) {
				dataset.addChangeListener(clone);
			}
		}
		clone.datasetToDomainAxesMap = new java.util.TreeMap();
		clone.datasetToDomainAxesMap.putAll(org.jfree.chart.plot.CategoryPlot.this.datasetToDomainAxesMap);
		clone.datasetToRangeAxesMap = new java.util.TreeMap();
		clone.datasetToRangeAxesMap.putAll(org.jfree.chart.plot.CategoryPlot.this.datasetToRangeAxesMap);
		clone.renderers = ((org.jfree.chart.util.ObjectList) (org.jfree.chart.plot.CategoryPlot.this.renderers.clone()));
		for (int i = 0; i < (org.jfree.chart.plot.CategoryPlot.this.renderers.size()); i++) {
			org.jfree.chart.renderer.category.CategoryItemRenderer renderer2 = ((org.jfree.chart.renderer.category.CategoryItemRenderer) (org.jfree.chart.plot.CategoryPlot.this.renderers.get(i)));
			if (renderer2 instanceof org.jfree.chart.util.PublicCloneable) {
				org.jfree.chart.util.PublicCloneable pc = ((org.jfree.chart.util.PublicCloneable) (renderer2));
				org.jfree.chart.renderer.category.CategoryItemRenderer rc = ((org.jfree.chart.renderer.category.CategoryItemRenderer) (pc.clone()));
				clone.renderers.set(i, rc);
				rc.setPlot(clone);
				rc.addChangeListener(clone);
			}
		}
		if ((org.jfree.chart.plot.CategoryPlot.this.fixedDomainAxisSpace) != null) {
			clone.fixedDomainAxisSpace = ((org.jfree.chart.axis.AxisSpace) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.plot.CategoryPlot.this.fixedDomainAxisSpace)));
		}
		if ((org.jfree.chart.plot.CategoryPlot.this.fixedRangeAxisSpace) != null) {
			clone.fixedRangeAxisSpace = ((org.jfree.chart.axis.AxisSpace) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.plot.CategoryPlot.this.fixedRangeAxisSpace)));
		}
		clone.annotations = ((java.util.List) (org.jfree.chart.util.ObjectUtilities.deepClone(org.jfree.chart.plot.CategoryPlot.this.annotations)));
		clone.foregroundDomainMarkers = cloneMarkerMap(org.jfree.chart.plot.CategoryPlot.this.foregroundDomainMarkers);
		clone.backgroundDomainMarkers = cloneMarkerMap(org.jfree.chart.plot.CategoryPlot.this.backgroundDomainMarkers);
		clone.foregroundRangeMarkers = cloneMarkerMap(org.jfree.chart.plot.CategoryPlot.this.foregroundRangeMarkers);
		clone.backgroundRangeMarkers = cloneMarkerMap(org.jfree.chart.plot.CategoryPlot.this.backgroundRangeMarkers);
		if ((org.jfree.chart.plot.CategoryPlot.this.fixedLegendItems) != null) {
			clone.fixedLegendItems = ((org.jfree.chart.LegendItemCollection) (org.jfree.chart.plot.CategoryPlot.this.fixedLegendItems.clone()));
		}
		return clone;
	}

	private java.util.Map cloneMarkerMap(java.util.Map map) throws java.lang.CloneNotSupportedException {
		java.util.Map clone = new java.util.HashMap();
		java.util.Set keys = map.keySet();
		java.util.Iterator iterator = keys.iterator();
		while (iterator.hasNext()) {
			java.lang.Object key = iterator.next();
			java.util.List entry = ((java.util.List) (map.get(key)));
			java.lang.Object toAdd = org.jfree.chart.util.ObjectUtilities.deepClone(entry);
			clone.put(key, toAdd);
		} 
		return clone;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.CategoryPlot.this.domainGridlineStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.CategoryPlot.this.domainGridlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.CategoryPlot.this.rangeGridlineStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.CategoryPlot.this.rangeGridlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.CategoryPlot.this.rangeCrosshairStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.CategoryPlot.this.rangeCrosshairPaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.CategoryPlot.this.domainCrosshairStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.CategoryPlot.this.domainCrosshairPaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.CategoryPlot.this.rangeMinorGridlineStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.CategoryPlot.this.rangeMinorGridlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.CategoryPlot.this.rangeZeroBaselineStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.CategoryPlot.this.rangeZeroBaselinePaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.plot.CategoryPlot.this.domainGridlineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.CategoryPlot.this.domainGridlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.CategoryPlot.this.rangeGridlineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.CategoryPlot.this.rangeGridlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.CategoryPlot.this.rangeCrosshairStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.CategoryPlot.this.rangeCrosshairPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.CategoryPlot.this.domainCrosshairStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.CategoryPlot.this.domainCrosshairPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.CategoryPlot.this.rangeMinorGridlineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.CategoryPlot.this.rangeMinorGridlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.CategoryPlot.this.rangeZeroBaselineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.CategoryPlot.this.rangeZeroBaselinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		for (int i = 0; i < (org.jfree.chart.plot.CategoryPlot.this.domainAxes.size()); i++) {
			org.jfree.chart.axis.CategoryAxis xAxis = ((org.jfree.chart.axis.CategoryAxis) (org.jfree.chart.plot.CategoryPlot.this.domainAxes.get(i)));
			if (xAxis != null) {
				xAxis.setPlot(org.jfree.chart.plot.CategoryPlot.this);
				xAxis.addChangeListener(org.jfree.chart.plot.CategoryPlot.this);
			}
		}
		for (int i = 0; i < (org.jfree.chart.plot.CategoryPlot.this.rangeAxes.size()); i++) {
			org.jfree.chart.axis.ValueAxis yAxis = ((org.jfree.chart.axis.ValueAxis) (org.jfree.chart.plot.CategoryPlot.this.rangeAxes.get(i)));
			if (yAxis != null) {
				yAxis.setPlot(org.jfree.chart.plot.CategoryPlot.this);
				yAxis.addChangeListener(org.jfree.chart.plot.CategoryPlot.this);
			}
		}
		int datasetCount = org.jfree.chart.plot.CategoryPlot.this.datasets.size();
		for (int i = 0; i < datasetCount; i++) {
			org.jfree.data.general.Dataset dataset = ((org.jfree.data.general.Dataset) (org.jfree.chart.plot.CategoryPlot.this.datasets.get(i)));
			if (dataset != null) {
				dataset.addChangeListener(org.jfree.chart.plot.CategoryPlot.this);
			}
		}
		int rendererCount = org.jfree.chart.plot.CategoryPlot.this.renderers.size();
		for (int i = 0; i < rendererCount; i++) {
			org.jfree.chart.renderer.category.CategoryItemRenderer renderer = ((org.jfree.chart.renderer.category.CategoryItemRenderer) (org.jfree.chart.plot.CategoryPlot.this.renderers.get(i)));
			if (renderer != null) {
				renderer.addChangeListener(org.jfree.chart.plot.CategoryPlot.this);
			}
		}
	}

	public boolean canSelectByPoint() {
		return true;
	}

	public boolean canSelectByRegion() {
		return true;
	}

	public void select(double x, double y, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.RenderingSource source) {
		int datasetCount = org.jfree.chart.plot.CategoryPlot.this.datasets.size();
		for (int d = 0; d < datasetCount; d++) {
			org.jfree.data.category.CategoryDataset dataset = ((org.jfree.data.category.CategoryDataset) (org.jfree.chart.plot.CategoryPlot.this.datasets.get(d)));
			if (dataset == null) {
				continue;
			}
			org.jfree.data.category.CategoryDatasetSelectionState state = findSelectionStateForDataset(dataset, source);
			if (state == null) {
				continue;
			}
			java.awt.Graphics2D g2 = source.createGraphics2D();
			org.jfree.chart.renderer.category.CategoryItemRenderer renderer = getRendererForDataset(dataset);
			org.jfree.chart.renderer.category.CategoryItemRendererState rs = renderer.initialise(g2, dataArea, org.jfree.chart.plot.CategoryPlot.this, dataset, null);
			int rowCount = dataset.getRowCount();
			int columnCount = dataset.getColumnCount();
			for (int r = 0; r < rowCount; r++) {
				for (int c = 0; c < columnCount; c++) {
					if (renderer.hitTest(x, y, null, dataArea, org.jfree.chart.plot.CategoryPlot.this, getDomainAxisForDataset(d), getRangeAxisForDataset(d), dataset, r, c, false, rs)) {
						state.setSelected(r, c, (!(state.isSelected(r, c))));
					}
				}
			}
		}
	}

	public void select(java.awt.geom.GeneralPath region, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.RenderingSource source) {
		java.lang.System.out.println(region);
		java.lang.System.out.println("Select a region...");
	}

	public void clearSelection() {
		int datasetCount = org.jfree.chart.plot.CategoryPlot.this.datasets.size();
		for (int d = 0; d < datasetCount; d++) {
			org.jfree.data.category.CategoryDataset dataset = ((org.jfree.data.category.CategoryDataset) (org.jfree.chart.plot.CategoryPlot.this.datasets.get(d)));
			if (dataset instanceof org.jfree.data.category.SelectableCategoryDataset) {
				org.jfree.data.category.SelectableCategoryDataset scd = ((org.jfree.data.category.SelectableCategoryDataset) (dataset));
				if ((scd.getSelectionState()) != null) {
					org.jfree.data.category.CategoryDatasetSelectionState selState = scd.getSelectionState();
					selState.clearSelection();
				}
			}
		}
	}

	private org.jfree.data.category.CategoryDatasetSelectionState findSelectionStateForDataset(org.jfree.data.category.CategoryDataset dataset, java.lang.Object source) {
		if (dataset instanceof org.jfree.data.category.SelectableCategoryDataset) {
			org.jfree.data.category.SelectableCategoryDataset sd = ((org.jfree.data.category.SelectableCategoryDataset) (dataset));
			org.jfree.data.category.CategoryDatasetSelectionState s = sd.getSelectionState();
			return s;
		}
		throw new java.lang.RuntimeException();
	}
}

