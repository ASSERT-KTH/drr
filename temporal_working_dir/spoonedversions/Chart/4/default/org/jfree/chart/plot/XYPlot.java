

package org.jfree.chart.plot;


public class XYPlot extends org.jfree.chart.plot.Plot implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.event.RendererChangeListener , org.jfree.chart.plot.Pannable , org.jfree.chart.plot.Selectable , org.jfree.chart.plot.ValueAxisPlot , org.jfree.chart.plot.Zoomable , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 7044148245716569264L;

	public static final java.awt.Stroke DEFAULT_GRIDLINE_STROKE = new java.awt.BasicStroke(0.5F, java.awt.BasicStroke.CAP_BUTT, java.awt.BasicStroke.JOIN_BEVEL, 0.0F, new float[]{ 2.0F , 2.0F }, 0.0F);

	public static final java.awt.Paint DEFAULT_GRIDLINE_PAINT = java.awt.Color.WHITE;

	public static final boolean DEFAULT_CROSSHAIR_VISIBLE = false;

	public static final java.awt.Stroke DEFAULT_CROSSHAIR_STROKE = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;

	public static final java.awt.Paint DEFAULT_CROSSHAIR_PAINT = java.awt.Color.blue;

	protected static java.util.ResourceBundle localizationResources = org.jfree.chart.util.ResourceBundleWrapper.getBundle("org.jfree.chart.plot.LocalizationBundle");

	private org.jfree.chart.plot.PlotOrientation orientation;

	private org.jfree.chart.util.RectangleInsets axisOffset;

	private org.jfree.chart.util.ObjectList domainAxes;

	private org.jfree.chart.util.ObjectList domainAxisLocations;

	private org.jfree.chart.util.ObjectList rangeAxes;

	private org.jfree.chart.util.ObjectList rangeAxisLocations;

	private org.jfree.chart.util.ObjectList datasets;

	private org.jfree.chart.util.ObjectList renderers;

	private java.util.Map datasetToDomainAxesMap;

	private java.util.Map datasetToRangeAxesMap;

	private transient java.awt.geom.Point2D quadrantOrigin = new java.awt.geom.Point2D.Double(0.0, 0.0);

	private transient java.awt.Paint[] quadrantPaint = new java.awt.Paint[]{ null , null , null , null };

	private boolean domainGridlinesVisible;

	private transient java.awt.Stroke domainGridlineStroke;

	private transient java.awt.Paint domainGridlinePaint;

	private boolean rangeGridlinesVisible;

	private transient java.awt.Stroke rangeGridlineStroke;

	private transient java.awt.Paint rangeGridlinePaint;

	private boolean domainMinorGridlinesVisible;

	private transient java.awt.Stroke domainMinorGridlineStroke;

	private transient java.awt.Paint domainMinorGridlinePaint;

	private boolean rangeMinorGridlinesVisible;

	private transient java.awt.Stroke rangeMinorGridlineStroke;

	private transient java.awt.Paint rangeMinorGridlinePaint;

	private boolean domainZeroBaselineVisible;

	private transient java.awt.Stroke domainZeroBaselineStroke;

	private transient java.awt.Paint domainZeroBaselinePaint;

	private boolean rangeZeroBaselineVisible;

	private transient java.awt.Stroke rangeZeroBaselineStroke;

	private transient java.awt.Paint rangeZeroBaselinePaint;

	private boolean domainCrosshairVisible;

	private double domainCrosshairValue;

	private transient java.awt.Stroke domainCrosshairStroke;

	private transient java.awt.Paint domainCrosshairPaint;

	private boolean domainCrosshairLockedOnData = true;

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

	private transient java.awt.Paint domainTickBandPaint;

	private transient java.awt.Paint rangeTickBandPaint;

	private org.jfree.chart.axis.AxisSpace fixedDomainAxisSpace;

	private org.jfree.chart.axis.AxisSpace fixedRangeAxisSpace;

	private org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder = org.jfree.chart.plot.DatasetRenderingOrder.REVERSE;

	private org.jfree.chart.plot.SeriesRenderingOrder seriesRenderingOrder = org.jfree.chart.plot.SeriesRenderingOrder.REVERSE;

	private int weight;

	private org.jfree.chart.LegendItemCollection fixedLegendItems;

	private boolean domainPannable;

	private boolean rangePannable;

	public XYPlot() {
		this(null, null, null, null);
	}

	public XYPlot(org.jfree.data.xy.XYDataset dataset, org.jfree.chart.axis.ValueAxis domainAxis, org.jfree.chart.axis.ValueAxis rangeAxis, org.jfree.chart.renderer.xy.XYItemRenderer renderer) {
		super();
		org.jfree.chart.plot.XYPlot.this.orientation = org.jfree.chart.plot.PlotOrientation.VERTICAL;
		org.jfree.chart.plot.XYPlot.this.weight = 1;
		org.jfree.chart.plot.XYPlot.this.axisOffset = new org.jfree.chart.util.RectangleInsets(4.0, 4.0, 4.0, 4.0);
		org.jfree.chart.plot.XYPlot.this.domainAxes = new org.jfree.chart.util.ObjectList();
		org.jfree.chart.plot.XYPlot.this.domainAxisLocations = new org.jfree.chart.util.ObjectList();
		org.jfree.chart.plot.XYPlot.this.foregroundDomainMarkers = new java.util.HashMap();
		org.jfree.chart.plot.XYPlot.this.backgroundDomainMarkers = new java.util.HashMap();
		org.jfree.chart.plot.XYPlot.this.rangeAxes = new org.jfree.chart.util.ObjectList();
		org.jfree.chart.plot.XYPlot.this.rangeAxisLocations = new org.jfree.chart.util.ObjectList();
		org.jfree.chart.plot.XYPlot.this.foregroundRangeMarkers = new java.util.HashMap();
		org.jfree.chart.plot.XYPlot.this.backgroundRangeMarkers = new java.util.HashMap();
		org.jfree.chart.plot.XYPlot.this.datasets = new org.jfree.chart.util.ObjectList();
		org.jfree.chart.plot.XYPlot.this.renderers = new org.jfree.chart.util.ObjectList();
		org.jfree.chart.plot.XYPlot.this.datasetToDomainAxesMap = new java.util.TreeMap();
		org.jfree.chart.plot.XYPlot.this.datasetToRangeAxesMap = new java.util.TreeMap();
		org.jfree.chart.plot.XYPlot.this.annotations = new java.util.ArrayList();
		org.jfree.chart.plot.XYPlot.this.datasets.set(0, dataset);
		if (dataset != null) {
			dataset.addChangeListener(org.jfree.chart.plot.XYPlot.this);
		}
		org.jfree.chart.plot.XYPlot.this.renderers.set(0, renderer);
		if (renderer != null) {
			renderer.setPlot(org.jfree.chart.plot.XYPlot.this);
			renderer.addChangeListener(org.jfree.chart.plot.XYPlot.this);
		}
		org.jfree.chart.plot.XYPlot.this.domainAxes.set(0, domainAxis);
		org.jfree.chart.plot.XYPlot.this.mapDatasetToDomainAxis(0, 0);
		if (domainAxis != null) {
			domainAxis.setPlot(org.jfree.chart.plot.XYPlot.this);
			domainAxis.addChangeListener(org.jfree.chart.plot.XYPlot.this);
		}
		org.jfree.chart.plot.XYPlot.this.domainAxisLocations.set(0, org.jfree.chart.axis.AxisLocation.BOTTOM_OR_LEFT);
		org.jfree.chart.plot.XYPlot.this.rangeAxes.set(0, rangeAxis);
		org.jfree.chart.plot.XYPlot.this.mapDatasetToRangeAxis(0, 0);
		if (rangeAxis != null) {
			rangeAxis.setPlot(org.jfree.chart.plot.XYPlot.this);
			rangeAxis.addChangeListener(org.jfree.chart.plot.XYPlot.this);
		}
		org.jfree.chart.plot.XYPlot.this.rangeAxisLocations.set(0, org.jfree.chart.axis.AxisLocation.BOTTOM_OR_LEFT);
		configureDomainAxes();
		configureRangeAxes();
		org.jfree.chart.plot.XYPlot.this.domainGridlinesVisible = true;
		org.jfree.chart.plot.XYPlot.this.domainGridlineStroke = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
		org.jfree.chart.plot.XYPlot.this.domainGridlinePaint = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_PAINT;
		org.jfree.chart.plot.XYPlot.this.domainMinorGridlinesVisible = false;
		org.jfree.chart.plot.XYPlot.this.domainMinorGridlineStroke = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
		org.jfree.chart.plot.XYPlot.this.domainMinorGridlinePaint = java.awt.Color.white;
		org.jfree.chart.plot.XYPlot.this.domainZeroBaselineVisible = false;
		org.jfree.chart.plot.XYPlot.this.domainZeroBaselinePaint = java.awt.Color.black;
		org.jfree.chart.plot.XYPlot.this.domainZeroBaselineStroke = new java.awt.BasicStroke(0.5F);
		org.jfree.chart.plot.XYPlot.this.rangeGridlinesVisible = true;
		org.jfree.chart.plot.XYPlot.this.rangeGridlineStroke = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
		org.jfree.chart.plot.XYPlot.this.rangeGridlinePaint = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_PAINT;
		org.jfree.chart.plot.XYPlot.this.rangeMinorGridlinesVisible = false;
		org.jfree.chart.plot.XYPlot.this.rangeMinorGridlineStroke = org.jfree.chart.plot.XYPlot.DEFAULT_GRIDLINE_STROKE;
		org.jfree.chart.plot.XYPlot.this.rangeMinorGridlinePaint = java.awt.Color.white;
		org.jfree.chart.plot.XYPlot.this.rangeZeroBaselineVisible = false;
		org.jfree.chart.plot.XYPlot.this.rangeZeroBaselinePaint = java.awt.Color.black;
		org.jfree.chart.plot.XYPlot.this.rangeZeroBaselineStroke = new java.awt.BasicStroke(0.5F);
		org.jfree.chart.plot.XYPlot.this.domainCrosshairVisible = false;
		org.jfree.chart.plot.XYPlot.this.domainCrosshairValue = 0.0;
		org.jfree.chart.plot.XYPlot.this.domainCrosshairStroke = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
		org.jfree.chart.plot.XYPlot.this.domainCrosshairPaint = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_PAINT;
		org.jfree.chart.plot.XYPlot.this.rangeCrosshairVisible = false;
		org.jfree.chart.plot.XYPlot.this.rangeCrosshairValue = 0.0;
		org.jfree.chart.plot.XYPlot.this.rangeCrosshairStroke = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_STROKE;
		org.jfree.chart.plot.XYPlot.this.rangeCrosshairPaint = org.jfree.chart.plot.XYPlot.DEFAULT_CROSSHAIR_PAINT;
	}

	public java.lang.String getPlotType() {
		return org.jfree.chart.plot.XYPlot.localizationResources.getString("XY_Plot");
	}

	public org.jfree.chart.plot.PlotOrientation getOrientation() {
		return org.jfree.chart.plot.XYPlot.this.orientation;
	}

	public void setOrientation(org.jfree.chart.plot.PlotOrientation orientation) {
		if (orientation == null) {
			throw new java.lang.IllegalArgumentException("Null 'orientation' argument.");
		}
		if (orientation != (org.jfree.chart.plot.XYPlot.this.orientation)) {
			org.jfree.chart.plot.XYPlot.this.orientation = orientation;
			fireChangeEvent();
		}
	}

	public org.jfree.chart.util.RectangleInsets getAxisOffset() {
		return org.jfree.chart.plot.XYPlot.this.axisOffset;
	}

	public void setAxisOffset(org.jfree.chart.util.RectangleInsets offset) {
		if (offset == null) {
			throw new java.lang.IllegalArgumentException("Null 'offset' argument.");
		}
		org.jfree.chart.plot.XYPlot.this.axisOffset = offset;
		fireChangeEvent();
	}

	public org.jfree.chart.axis.ValueAxis getDomainAxis() {
		return getDomainAxis(0);
	}

	public org.jfree.chart.axis.ValueAxis getDomainAxis(int index) {
		org.jfree.chart.axis.ValueAxis result = null;
		if (index < (org.jfree.chart.plot.XYPlot.this.domainAxes.size())) {
			result = ((org.jfree.chart.axis.ValueAxis) (org.jfree.chart.plot.XYPlot.this.domainAxes.get(index)));
		}
		if (result == null) {
			org.jfree.chart.plot.Plot parent = getParent();
			if (parent instanceof org.jfree.chart.plot.XYPlot) {
				org.jfree.chart.plot.XYPlot xy = ((org.jfree.chart.plot.XYPlot) (parent));
				result = xy.getDomainAxis(index);
			}
		}
		return result;
	}

	public void setDomainAxis(org.jfree.chart.axis.ValueAxis axis) {
		setDomainAxis(0, axis);
	}

	public void setDomainAxis(int index, org.jfree.chart.axis.ValueAxis axis) {
		setDomainAxis(index, axis, true);
	}

	public void setDomainAxis(int index, org.jfree.chart.axis.ValueAxis axis, boolean notify) {
		org.jfree.chart.axis.ValueAxis existing = getDomainAxis(index);
		if (existing != null) {
			existing.removeChangeListener(org.jfree.chart.plot.XYPlot.this);
		}
		if (axis != null) {
			axis.setPlot(org.jfree.chart.plot.XYPlot.this);
		}
		org.jfree.chart.plot.XYPlot.this.domainAxes.set(index, axis);
		if (axis != null) {
			axis.configure();
			axis.addChangeListener(org.jfree.chart.plot.XYPlot.this);
		}
		if (notify) {
			fireChangeEvent();
		}
	}

	public void setDomainAxes(org.jfree.chart.axis.ValueAxis[] axes) {
		for (int i = 0; i < (axes.length); i++) {
			setDomainAxis(i, axes[i], false);
		}
		fireChangeEvent();
	}

	public org.jfree.chart.axis.AxisLocation getDomainAxisLocation() {
		return ((org.jfree.chart.axis.AxisLocation) (org.jfree.chart.plot.XYPlot.this.domainAxisLocations.get(0)));
	}

	public void setDomainAxisLocation(org.jfree.chart.axis.AxisLocation location) {
		setDomainAxisLocation(0, location, true);
	}

	public void setDomainAxisLocation(org.jfree.chart.axis.AxisLocation location, boolean notify) {
		setDomainAxisLocation(0, location, notify);
	}

	public org.jfree.chart.util.RectangleEdge getDomainAxisEdge() {
		return org.jfree.chart.plot.Plot.resolveDomainAxisLocation(getDomainAxisLocation(), org.jfree.chart.plot.XYPlot.this.orientation);
	}

	public int getDomainAxisCount() {
		return org.jfree.chart.plot.XYPlot.this.domainAxes.size();
	}

	public void clearDomainAxes() {
		for (int i = 0; i < (org.jfree.chart.plot.XYPlot.this.domainAxes.size()); i++) {
			org.jfree.chart.axis.ValueAxis axis = ((org.jfree.chart.axis.ValueAxis) (org.jfree.chart.plot.XYPlot.this.domainAxes.get(i)));
			if (axis != null) {
				axis.removeChangeListener(org.jfree.chart.plot.XYPlot.this);
			}
		}
		org.jfree.chart.plot.XYPlot.this.domainAxes.clear();
		fireChangeEvent();
	}

	public void configureDomainAxes() {
		for (int i = 0; i < (org.jfree.chart.plot.XYPlot.this.domainAxes.size()); i++) {
			org.jfree.chart.axis.ValueAxis axis = ((org.jfree.chart.axis.ValueAxis) (org.jfree.chart.plot.XYPlot.this.domainAxes.get(i)));
			if (axis != null) {
				axis.configure();
			}
		}
	}

	public org.jfree.chart.axis.AxisLocation getDomainAxisLocation(int index) {
		org.jfree.chart.axis.AxisLocation result = null;
		if (index < (org.jfree.chart.plot.XYPlot.this.domainAxisLocations.size())) {
			result = ((org.jfree.chart.axis.AxisLocation) (org.jfree.chart.plot.XYPlot.this.domainAxisLocations.get(index)));
		}
		if (result == null) {
			result = org.jfree.chart.axis.AxisLocation.getOpposite(getDomainAxisLocation());
		}
		return result;
	}

	public void setDomainAxisLocation(int index, org.jfree.chart.axis.AxisLocation location) {
		setDomainAxisLocation(index, location, true);
	}

	public void setDomainAxisLocation(int index, org.jfree.chart.axis.AxisLocation location, boolean notify) {
		if ((index == 0) && (location == null)) {
			throw new java.lang.IllegalArgumentException("Null 'location' for index 0 not permitted.");
		}
		org.jfree.chart.plot.XYPlot.this.domainAxisLocations.set(index, location);
		if (notify) {
			fireChangeEvent();
		}
	}

	public org.jfree.chart.util.RectangleEdge getDomainAxisEdge(int index) {
		org.jfree.chart.axis.AxisLocation location = getDomainAxisLocation(index);
		org.jfree.chart.util.RectangleEdge result = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(location, org.jfree.chart.plot.XYPlot.this.orientation);
		if (result == null) {
			result = org.jfree.chart.util.RectangleEdge.opposite(getDomainAxisEdge());
		}
		return result;
	}

	public org.jfree.chart.axis.ValueAxis getRangeAxis() {
		return getRangeAxis(0);
	}

	public void setRangeAxis(org.jfree.chart.axis.ValueAxis axis) {
		if (axis != null) {
			axis.setPlot(org.jfree.chart.plot.XYPlot.this);
		}
		org.jfree.chart.axis.ValueAxis existing = getRangeAxis();
		if (existing != null) {
			existing.removeChangeListener(org.jfree.chart.plot.XYPlot.this);
		}
		org.jfree.chart.plot.XYPlot.this.rangeAxes.set(0, axis);
		if (axis != null) {
			axis.configure();
			axis.addChangeListener(org.jfree.chart.plot.XYPlot.this);
		}
		fireChangeEvent();
	}

	public org.jfree.chart.axis.AxisLocation getRangeAxisLocation() {
		return ((org.jfree.chart.axis.AxisLocation) (org.jfree.chart.plot.XYPlot.this.rangeAxisLocations.get(0)));
	}

	public void setRangeAxisLocation(org.jfree.chart.axis.AxisLocation location) {
		setRangeAxisLocation(0, location, true);
	}

	public void setRangeAxisLocation(org.jfree.chart.axis.AxisLocation location, boolean notify) {
		setRangeAxisLocation(0, location, notify);
	}

	public org.jfree.chart.util.RectangleEdge getRangeAxisEdge() {
		return org.jfree.chart.plot.Plot.resolveRangeAxisLocation(getRangeAxisLocation(), org.jfree.chart.plot.XYPlot.this.orientation);
	}

	public org.jfree.chart.axis.ValueAxis getRangeAxis(int index) {
		org.jfree.chart.axis.ValueAxis result = null;
		if (index < (org.jfree.chart.plot.XYPlot.this.rangeAxes.size())) {
			result = ((org.jfree.chart.axis.ValueAxis) (org.jfree.chart.plot.XYPlot.this.rangeAxes.get(index)));
		}
		if (result == null) {
			org.jfree.chart.plot.Plot parent = getParent();
			if (parent instanceof org.jfree.chart.plot.XYPlot) {
				org.jfree.chart.plot.XYPlot xy = ((org.jfree.chart.plot.XYPlot) (parent));
				result = xy.getRangeAxis(index);
			}
		}
		return result;
	}

	public void setRangeAxis(int index, org.jfree.chart.axis.ValueAxis axis) {
		setRangeAxis(index, axis, true);
	}

	public void setRangeAxis(int index, org.jfree.chart.axis.ValueAxis axis, boolean notify) {
		org.jfree.chart.axis.ValueAxis existing = getRangeAxis(index);
		if (existing != null) {
			existing.removeChangeListener(org.jfree.chart.plot.XYPlot.this);
		}
		if (axis != null) {
			axis.setPlot(org.jfree.chart.plot.XYPlot.this);
		}
		org.jfree.chart.plot.XYPlot.this.rangeAxes.set(index, axis);
		if (axis != null) {
			axis.configure();
			axis.addChangeListener(org.jfree.chart.plot.XYPlot.this);
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

	public int getRangeAxisCount() {
		return org.jfree.chart.plot.XYPlot.this.rangeAxes.size();
	}

	public void clearRangeAxes() {
		for (int i = 0; i < (org.jfree.chart.plot.XYPlot.this.rangeAxes.size()); i++) {
			org.jfree.chart.axis.ValueAxis axis = ((org.jfree.chart.axis.ValueAxis) (org.jfree.chart.plot.XYPlot.this.rangeAxes.get(i)));
			if (axis != null) {
				axis.removeChangeListener(org.jfree.chart.plot.XYPlot.this);
			}
		}
		org.jfree.chart.plot.XYPlot.this.rangeAxes.clear();
		fireChangeEvent();
	}

	public void configureRangeAxes() {
		for (int i = 0; i < (org.jfree.chart.plot.XYPlot.this.rangeAxes.size()); i++) {
			org.jfree.chart.axis.ValueAxis axis = ((org.jfree.chart.axis.ValueAxis) (org.jfree.chart.plot.XYPlot.this.rangeAxes.get(i)));
			if (axis != null) {
				axis.configure();
			}
		}
	}

	public org.jfree.chart.axis.AxisLocation getRangeAxisLocation(int index) {
		org.jfree.chart.axis.AxisLocation result = null;
		if (index < (org.jfree.chart.plot.XYPlot.this.rangeAxisLocations.size())) {
			result = ((org.jfree.chart.axis.AxisLocation) (org.jfree.chart.plot.XYPlot.this.rangeAxisLocations.get(index)));
		}
		if (result == null) {
			result = org.jfree.chart.axis.AxisLocation.getOpposite(getRangeAxisLocation());
		}
		return result;
	}

	public void setRangeAxisLocation(int index, org.jfree.chart.axis.AxisLocation location) {
		setRangeAxisLocation(index, location, true);
	}

	public void setRangeAxisLocation(int index, org.jfree.chart.axis.AxisLocation location, boolean notify) {
		if ((index == 0) && (location == null)) {
			throw new java.lang.IllegalArgumentException("Null 'location' for index 0 not permitted.");
		}
		org.jfree.chart.plot.XYPlot.this.rangeAxisLocations.set(index, location);
		if (notify) {
			fireChangeEvent();
		}
	}

	public org.jfree.chart.util.RectangleEdge getRangeAxisEdge(int index) {
		org.jfree.chart.axis.AxisLocation location = getRangeAxisLocation(index);
		org.jfree.chart.util.RectangleEdge result = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(location, org.jfree.chart.plot.XYPlot.this.orientation);
		if (result == null) {
			result = org.jfree.chart.util.RectangleEdge.opposite(getRangeAxisEdge());
		}
		return result;
	}

	public org.jfree.data.xy.XYDataset getDataset() {
		return getDataset(0);
	}

	public org.jfree.data.xy.XYDataset getDataset(int index) {
		org.jfree.data.xy.XYDataset result = null;
		if ((org.jfree.chart.plot.XYPlot.this.datasets.size()) > index) {
			result = ((org.jfree.data.xy.XYDataset) (org.jfree.chart.plot.XYPlot.this.datasets.get(index)));
		}
		return result;
	}

	public void setDataset(org.jfree.data.xy.XYDataset dataset) {
		setDataset(0, dataset);
	}

	public void setDataset(int index, org.jfree.data.xy.XYDataset dataset) {
		org.jfree.data.xy.XYDataset existing = getDataset(index);
		if (existing != null) {
			existing.removeChangeListener(org.jfree.chart.plot.XYPlot.this);
		}
		org.jfree.chart.plot.XYPlot.this.datasets.set(index, dataset);
		if (dataset != null) {
			dataset.addChangeListener(org.jfree.chart.plot.XYPlot.this);
		}
		org.jfree.data.general.DatasetChangeEvent event = new org.jfree.data.general.DatasetChangeEvent(org.jfree.chart.plot.XYPlot.this, dataset);
		datasetChanged(event);
	}

	public int getDatasetCount() {
		return org.jfree.chart.plot.XYPlot.this.datasets.size();
	}

	public int indexOf(org.jfree.data.xy.XYDataset dataset) {
		int result = -1;
		for (int i = 0; i < (org.jfree.chart.plot.XYPlot.this.datasets.size()); i++) {
			if (dataset == (org.jfree.chart.plot.XYPlot.this.datasets.get(i))) {
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
		org.jfree.chart.plot.XYPlot.this.datasetToDomainAxesMap.put(key, new java.util.ArrayList(axisIndices));
		datasetChanged(new org.jfree.data.general.DatasetChangeEvent(org.jfree.chart.plot.XYPlot.this, getDataset(index)));
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
		org.jfree.chart.plot.XYPlot.this.datasetToRangeAxesMap.put(key, new java.util.ArrayList(axisIndices));
		datasetChanged(new org.jfree.data.general.DatasetChangeEvent(org.jfree.chart.plot.XYPlot.this, getDataset(index)));
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

	public int getRendererCount() {
		return org.jfree.chart.plot.XYPlot.this.renderers.size();
	}

	public org.jfree.chart.renderer.xy.XYItemRenderer getRenderer() {
		return getRenderer(0);
	}

	public org.jfree.chart.renderer.xy.XYItemRenderer getRenderer(int index) {
		org.jfree.chart.renderer.xy.XYItemRenderer result = null;
		if ((org.jfree.chart.plot.XYPlot.this.renderers.size()) > index) {
			result = ((org.jfree.chart.renderer.xy.XYItemRenderer) (org.jfree.chart.plot.XYPlot.this.renderers.get(index)));
		}
		return result;
	}

	public void setRenderer(org.jfree.chart.renderer.xy.XYItemRenderer renderer) {
		setRenderer(0, renderer);
	}

	public void setRenderer(int index, org.jfree.chart.renderer.xy.XYItemRenderer renderer) {
		setRenderer(index, renderer, true);
	}

	public void setRenderer(int index, org.jfree.chart.renderer.xy.XYItemRenderer renderer, boolean notify) {
		org.jfree.chart.renderer.xy.XYItemRenderer existing = getRenderer(index);
		if (existing != null) {
			existing.removeChangeListener(org.jfree.chart.plot.XYPlot.this);
		}
		org.jfree.chart.plot.XYPlot.this.renderers.set(index, renderer);
		if (renderer != null) {
			renderer.setPlot(org.jfree.chart.plot.XYPlot.this);
			renderer.addChangeListener(org.jfree.chart.plot.XYPlot.this);
		}
		configureDomainAxes();
		configureRangeAxes();
		if (notify) {
			fireChangeEvent();
		}
	}

	public void setRenderers(org.jfree.chart.renderer.xy.XYItemRenderer[] renderers) {
		for (int i = 0; i < (renderers.length); i++) {
			setRenderer(i, renderers[i], false);
		}
		fireChangeEvent();
	}

	public org.jfree.chart.plot.DatasetRenderingOrder getDatasetRenderingOrder() {
		return org.jfree.chart.plot.XYPlot.this.datasetRenderingOrder;
	}

	public void setDatasetRenderingOrder(org.jfree.chart.plot.DatasetRenderingOrder order) {
		if (order == null) {
			throw new java.lang.IllegalArgumentException("Null 'order' argument.");
		}
		org.jfree.chart.plot.XYPlot.this.datasetRenderingOrder = order;
		fireChangeEvent();
	}

	public org.jfree.chart.plot.SeriesRenderingOrder getSeriesRenderingOrder() {
		return org.jfree.chart.plot.XYPlot.this.seriesRenderingOrder;
	}

	public void setSeriesRenderingOrder(org.jfree.chart.plot.SeriesRenderingOrder order) {
		if (order == null) {
			throw new java.lang.IllegalArgumentException("Null 'order' argument.");
		}
		org.jfree.chart.plot.XYPlot.this.seriesRenderingOrder = order;
		fireChangeEvent();
	}

	public int getIndexOf(org.jfree.chart.renderer.xy.XYItemRenderer renderer) {
		return org.jfree.chart.plot.XYPlot.this.renderers.indexOf(renderer);
	}

	public org.jfree.chart.renderer.xy.XYItemRenderer getRendererForDataset(org.jfree.data.xy.XYDataset dataset) {
		org.jfree.chart.renderer.xy.XYItemRenderer result = null;
		for (int i = 0; i < (org.jfree.chart.plot.XYPlot.this.datasets.size()); i++) {
			if ((org.jfree.chart.plot.XYPlot.this.datasets.get(i)) == dataset) {
				result = ((org.jfree.chart.renderer.xy.XYItemRenderer) (org.jfree.chart.plot.XYPlot.this.renderers.get(i)));
				if (result == null) {
					result = getRenderer();
				}
				break;
			}
		}
		return result;
	}

	public int getWeight() {
		return org.jfree.chart.plot.XYPlot.this.weight;
	}

	public void setWeight(int weight) {
		org.jfree.chart.plot.XYPlot.this.weight = weight;
		fireChangeEvent();
	}

	public boolean isDomainGridlinesVisible() {
		return org.jfree.chart.plot.XYPlot.this.domainGridlinesVisible;
	}

	public void setDomainGridlinesVisible(boolean visible) {
		if ((org.jfree.chart.plot.XYPlot.this.domainGridlinesVisible) != visible) {
			org.jfree.chart.plot.XYPlot.this.domainGridlinesVisible = visible;
			fireChangeEvent();
		}
	}

	public boolean isDomainMinorGridlinesVisible() {
		return org.jfree.chart.plot.XYPlot.this.domainMinorGridlinesVisible;
	}

	public void setDomainMinorGridlinesVisible(boolean visible) {
		if ((org.jfree.chart.plot.XYPlot.this.domainMinorGridlinesVisible) != visible) {
			org.jfree.chart.plot.XYPlot.this.domainMinorGridlinesVisible = visible;
			fireChangeEvent();
		}
	}

	public java.awt.Stroke getDomainGridlineStroke() {
		return org.jfree.chart.plot.XYPlot.this.domainGridlineStroke;
	}

	public void setDomainGridlineStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.plot.XYPlot.this.domainGridlineStroke = stroke;
		fireChangeEvent();
	}

	public java.awt.Stroke getDomainMinorGridlineStroke() {
		return org.jfree.chart.plot.XYPlot.this.domainMinorGridlineStroke;
	}

	public void setDomainMinorGridlineStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.plot.XYPlot.this.domainMinorGridlineStroke = stroke;
		fireChangeEvent();
	}

	public java.awt.Paint getDomainGridlinePaint() {
		return org.jfree.chart.plot.XYPlot.this.domainGridlinePaint;
	}

	public void setDomainGridlinePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.XYPlot.this.domainGridlinePaint = paint;
		fireChangeEvent();
	}

	public java.awt.Paint getDomainMinorGridlinePaint() {
		return org.jfree.chart.plot.XYPlot.this.domainMinorGridlinePaint;
	}

	public void setDomainMinorGridlinePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.XYPlot.this.domainMinorGridlinePaint = paint;
		fireChangeEvent();
	}

	public boolean isRangeGridlinesVisible() {
		return org.jfree.chart.plot.XYPlot.this.rangeGridlinesVisible;
	}

	public void setRangeGridlinesVisible(boolean visible) {
		if ((org.jfree.chart.plot.XYPlot.this.rangeGridlinesVisible) != visible) {
			org.jfree.chart.plot.XYPlot.this.rangeGridlinesVisible = visible;
			fireChangeEvent();
		}
	}

	public java.awt.Stroke getRangeGridlineStroke() {
		return org.jfree.chart.plot.XYPlot.this.rangeGridlineStroke;
	}

	public void setRangeGridlineStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.plot.XYPlot.this.rangeGridlineStroke = stroke;
		fireChangeEvent();
	}

	public java.awt.Paint getRangeGridlinePaint() {
		return org.jfree.chart.plot.XYPlot.this.rangeGridlinePaint;
	}

	public void setRangeGridlinePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.XYPlot.this.rangeGridlinePaint = paint;
		fireChangeEvent();
	}

	public boolean isRangeMinorGridlinesVisible() {
		return org.jfree.chart.plot.XYPlot.this.rangeMinorGridlinesVisible;
	}

	public void setRangeMinorGridlinesVisible(boolean visible) {
		if ((org.jfree.chart.plot.XYPlot.this.rangeMinorGridlinesVisible) != visible) {
			org.jfree.chart.plot.XYPlot.this.rangeMinorGridlinesVisible = visible;
			fireChangeEvent();
		}
	}

	public java.awt.Stroke getRangeMinorGridlineStroke() {
		return org.jfree.chart.plot.XYPlot.this.rangeMinorGridlineStroke;
	}

	public void setRangeMinorGridlineStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.plot.XYPlot.this.rangeMinorGridlineStroke = stroke;
		fireChangeEvent();
	}

	public java.awt.Paint getRangeMinorGridlinePaint() {
		return org.jfree.chart.plot.XYPlot.this.rangeMinorGridlinePaint;
	}

	public void setRangeMinorGridlinePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.XYPlot.this.rangeMinorGridlinePaint = paint;
		fireChangeEvent();
	}

	public boolean isDomainZeroBaselineVisible() {
		return org.jfree.chart.plot.XYPlot.this.domainZeroBaselineVisible;
	}

	public void setDomainZeroBaselineVisible(boolean visible) {
		org.jfree.chart.plot.XYPlot.this.domainZeroBaselineVisible = visible;
		fireChangeEvent();
	}

	public java.awt.Stroke getDomainZeroBaselineStroke() {
		return org.jfree.chart.plot.XYPlot.this.domainZeroBaselineStroke;
	}

	public void setDomainZeroBaselineStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.plot.XYPlot.this.domainZeroBaselineStroke = stroke;
		fireChangeEvent();
	}

	public java.awt.Paint getDomainZeroBaselinePaint() {
		return org.jfree.chart.plot.XYPlot.this.domainZeroBaselinePaint;
	}

	public void setDomainZeroBaselinePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.XYPlot.this.domainZeroBaselinePaint = paint;
		fireChangeEvent();
	}

	public boolean isRangeZeroBaselineVisible() {
		return org.jfree.chart.plot.XYPlot.this.rangeZeroBaselineVisible;
	}

	public void setRangeZeroBaselineVisible(boolean visible) {
		org.jfree.chart.plot.XYPlot.this.rangeZeroBaselineVisible = visible;
		fireChangeEvent();
	}

	public java.awt.Stroke getRangeZeroBaselineStroke() {
		return org.jfree.chart.plot.XYPlot.this.rangeZeroBaselineStroke;
	}

	public void setRangeZeroBaselineStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.plot.XYPlot.this.rangeZeroBaselineStroke = stroke;
		fireChangeEvent();
	}

	public java.awt.Paint getRangeZeroBaselinePaint() {
		return org.jfree.chart.plot.XYPlot.this.rangeZeroBaselinePaint;
	}

	public void setRangeZeroBaselinePaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.XYPlot.this.rangeZeroBaselinePaint = paint;
		fireChangeEvent();
	}

	public java.awt.Paint getDomainTickBandPaint() {
		return org.jfree.chart.plot.XYPlot.this.domainTickBandPaint;
	}

	public void setDomainTickBandPaint(java.awt.Paint paint) {
		org.jfree.chart.plot.XYPlot.this.domainTickBandPaint = paint;
		fireChangeEvent();
	}

	public java.awt.Paint getRangeTickBandPaint() {
		return org.jfree.chart.plot.XYPlot.this.rangeTickBandPaint;
	}

	public void setRangeTickBandPaint(java.awt.Paint paint) {
		org.jfree.chart.plot.XYPlot.this.rangeTickBandPaint = paint;
		fireChangeEvent();
	}

	public java.awt.geom.Point2D getQuadrantOrigin() {
		return org.jfree.chart.plot.XYPlot.this.quadrantOrigin;
	}

	public void setQuadrantOrigin(java.awt.geom.Point2D origin) {
		if (origin == null) {
			throw new java.lang.IllegalArgumentException("Null 'origin' argument.");
		}
		org.jfree.chart.plot.XYPlot.this.quadrantOrigin = origin;
		fireChangeEvent();
	}

	public java.awt.Paint getQuadrantPaint(int index) {
		if ((index < 0) || (index > 3)) {
			throw new java.lang.IllegalArgumentException((("The index value (" + index) + ") should be in the range 0 to 3."));
		}
		return org.jfree.chart.plot.XYPlot.this.quadrantPaint[index];
	}

	public void setQuadrantPaint(int index, java.awt.Paint paint) {
		if ((index < 0) || (index > 3)) {
			throw new java.lang.IllegalArgumentException((("The index value (" + index) + ") should be in the range 0 to 3."));
		}
		org.jfree.chart.plot.XYPlot.this.quadrantPaint[index] = paint;
		fireChangeEvent();
	}

	public void addDomainMarker(org.jfree.chart.plot.Marker marker) {
		addDomainMarker(marker, org.jfree.chart.util.Layer.FOREGROUND);
	}

	public void addDomainMarker(org.jfree.chart.plot.Marker marker, org.jfree.chart.util.Layer layer) {
		addDomainMarker(0, marker, layer);
	}

	public void clearDomainMarkers() {
		if ((org.jfree.chart.plot.XYPlot.this.backgroundDomainMarkers) != null) {
			java.util.Set keys = org.jfree.chart.plot.XYPlot.this.backgroundDomainMarkers.keySet();
			java.util.Iterator iterator = keys.iterator();
			while (iterator.hasNext()) {
				java.lang.Integer key = ((java.lang.Integer) (iterator.next()));
				clearDomainMarkers(key.intValue());
			} 
			org.jfree.chart.plot.XYPlot.this.backgroundDomainMarkers.clear();
		}
		if ((org.jfree.chart.plot.XYPlot.this.foregroundDomainMarkers) != null) {
			java.util.Set keys = org.jfree.chart.plot.XYPlot.this.foregroundDomainMarkers.keySet();
			java.util.Iterator iterator = keys.iterator();
			while (iterator.hasNext()) {
				java.lang.Integer key = ((java.lang.Integer) (iterator.next()));
				clearDomainMarkers(key.intValue());
			} 
			org.jfree.chart.plot.XYPlot.this.foregroundDomainMarkers.clear();
		}
		fireChangeEvent();
	}

	public void clearDomainMarkers(int index) {
		java.lang.Integer key = new java.lang.Integer(index);
		if ((org.jfree.chart.plot.XYPlot.this.backgroundDomainMarkers) != null) {
			java.util.Collection markers = ((java.util.Collection) (org.jfree.chart.plot.XYPlot.this.backgroundDomainMarkers.get(key)));
			if (markers != null) {
				java.util.Iterator iterator = markers.iterator();
				while (iterator.hasNext()) {
					org.jfree.chart.plot.Marker m = ((org.jfree.chart.plot.Marker) (iterator.next()));
					m.removeChangeListener(org.jfree.chart.plot.XYPlot.this);
				} 
				markers.clear();
			}
		}
		if ((org.jfree.chart.plot.XYPlot.this.foregroundRangeMarkers) != null) {
			java.util.Collection markers = ((java.util.Collection) (org.jfree.chart.plot.XYPlot.this.foregroundDomainMarkers.get(key)));
			if (markers != null) {
				java.util.Iterator iterator = markers.iterator();
				while (iterator.hasNext()) {
					org.jfree.chart.plot.Marker m = ((org.jfree.chart.plot.Marker) (iterator.next()));
					m.removeChangeListener(org.jfree.chart.plot.XYPlot.this);
				} 
				markers.clear();
			}
		}
		fireChangeEvent();
	}

	public void addDomainMarker(int index, org.jfree.chart.plot.Marker marker, org.jfree.chart.util.Layer layer) {
		addDomainMarker(index, marker, layer, true);
	}

	public void addDomainMarker(int index, org.jfree.chart.plot.Marker marker, org.jfree.chart.util.Layer layer, boolean notify) {
		if (marker == null) {
			throw new java.lang.IllegalArgumentException("Null 'marker' not permitted.");
		}
		if (layer == null) {
			throw new java.lang.IllegalArgumentException("Null 'layer' not permitted.");
		}
		java.util.Collection markers;
		if (layer == (org.jfree.chart.util.Layer.FOREGROUND)) {
			markers = ((java.util.Collection) (org.jfree.chart.plot.XYPlot.this.foregroundDomainMarkers.get(new java.lang.Integer(index))));
			if (markers == null) {
				markers = new java.util.ArrayList();
				org.jfree.chart.plot.XYPlot.this.foregroundDomainMarkers.put(new java.lang.Integer(index), markers);
			}
			markers.add(marker);
		}else
			if (layer == (org.jfree.chart.util.Layer.BACKGROUND)) {
				markers = ((java.util.Collection) (org.jfree.chart.plot.XYPlot.this.backgroundDomainMarkers.get(new java.lang.Integer(index))));
				if (markers == null) {
					markers = new java.util.ArrayList();
					org.jfree.chart.plot.XYPlot.this.backgroundDomainMarkers.put(new java.lang.Integer(index), markers);
				}
				markers.add(marker);
			}
		
		marker.addChangeListener(org.jfree.chart.plot.XYPlot.this);
		if (notify) {
			fireChangeEvent();
		}
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
			markers = ((java.util.ArrayList) (org.jfree.chart.plot.XYPlot.this.foregroundDomainMarkers.get(new java.lang.Integer(index))));
		}else {
			markers = ((java.util.ArrayList) (org.jfree.chart.plot.XYPlot.this.backgroundDomainMarkers.get(new java.lang.Integer(index))));
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

	public void clearRangeMarkers() {
		if ((org.jfree.chart.plot.XYPlot.this.backgroundRangeMarkers) != null) {
			java.util.Set keys = org.jfree.chart.plot.XYPlot.this.backgroundRangeMarkers.keySet();
			java.util.Iterator iterator = keys.iterator();
			while (iterator.hasNext()) {
				java.lang.Integer key = ((java.lang.Integer) (iterator.next()));
				clearRangeMarkers(key.intValue());
			} 
			org.jfree.chart.plot.XYPlot.this.backgroundRangeMarkers.clear();
		}
		if ((org.jfree.chart.plot.XYPlot.this.foregroundRangeMarkers) != null) {
			java.util.Set keys = org.jfree.chart.plot.XYPlot.this.foregroundRangeMarkers.keySet();
			java.util.Iterator iterator = keys.iterator();
			while (iterator.hasNext()) {
				java.lang.Integer key = ((java.lang.Integer) (iterator.next()));
				clearRangeMarkers(key.intValue());
			} 
			org.jfree.chart.plot.XYPlot.this.foregroundRangeMarkers.clear();
		}
		fireChangeEvent();
	}

	public void addRangeMarker(int index, org.jfree.chart.plot.Marker marker, org.jfree.chart.util.Layer layer) {
		addRangeMarker(index, marker, layer, true);
	}

	public void addRangeMarker(int index, org.jfree.chart.plot.Marker marker, org.jfree.chart.util.Layer layer, boolean notify) {
		java.util.Collection markers;
		if (layer == (org.jfree.chart.util.Layer.FOREGROUND)) {
			markers = ((java.util.Collection) (org.jfree.chart.plot.XYPlot.this.foregroundRangeMarkers.get(new java.lang.Integer(index))));
			if (markers == null) {
				markers = new java.util.ArrayList();
				org.jfree.chart.plot.XYPlot.this.foregroundRangeMarkers.put(new java.lang.Integer(index), markers);
			}
			markers.add(marker);
		}else
			if (layer == (org.jfree.chart.util.Layer.BACKGROUND)) {
				markers = ((java.util.Collection) (org.jfree.chart.plot.XYPlot.this.backgroundRangeMarkers.get(new java.lang.Integer(index))));
				if (markers == null) {
					markers = new java.util.ArrayList();
					org.jfree.chart.plot.XYPlot.this.backgroundRangeMarkers.put(new java.lang.Integer(index), markers);
				}
				markers.add(marker);
			}
		
		marker.addChangeListener(org.jfree.chart.plot.XYPlot.this);
		if (notify) {
			fireChangeEvent();
		}
	}

	public void clearRangeMarkers(int index) {
		java.lang.Integer key = new java.lang.Integer(index);
		if ((org.jfree.chart.plot.XYPlot.this.backgroundRangeMarkers) != null) {
			java.util.Collection markers = ((java.util.Collection) (org.jfree.chart.plot.XYPlot.this.backgroundRangeMarkers.get(key)));
			if (markers != null) {
				java.util.Iterator iterator = markers.iterator();
				while (iterator.hasNext()) {
					org.jfree.chart.plot.Marker m = ((org.jfree.chart.plot.Marker) (iterator.next()));
					m.removeChangeListener(org.jfree.chart.plot.XYPlot.this);
				} 
				markers.clear();
			}
		}
		if ((org.jfree.chart.plot.XYPlot.this.foregroundRangeMarkers) != null) {
			java.util.Collection markers = ((java.util.Collection) (org.jfree.chart.plot.XYPlot.this.foregroundRangeMarkers.get(key)));
			if (markers != null) {
				java.util.Iterator iterator = markers.iterator();
				while (iterator.hasNext()) {
					org.jfree.chart.plot.Marker m = ((org.jfree.chart.plot.Marker) (iterator.next()));
					m.removeChangeListener(org.jfree.chart.plot.XYPlot.this);
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
			markers = ((java.util.ArrayList) (org.jfree.chart.plot.XYPlot.this.foregroundRangeMarkers.get(new java.lang.Integer(index))));
		}else {
			markers = ((java.util.ArrayList) (org.jfree.chart.plot.XYPlot.this.backgroundRangeMarkers.get(new java.lang.Integer(index))));
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

	public void addAnnotation(org.jfree.chart.annotations.XYAnnotation annotation) {
		addAnnotation(annotation, true);
	}

	public void addAnnotation(org.jfree.chart.annotations.XYAnnotation annotation, boolean notify) {
		if (annotation == null) {
			throw new java.lang.IllegalArgumentException("Null 'annotation' argument.");
		}
		org.jfree.chart.plot.XYPlot.this.annotations.add(annotation);
		if (notify) {
			fireChangeEvent();
		}
	}

	public boolean removeAnnotation(org.jfree.chart.annotations.XYAnnotation annotation) {
		return removeAnnotation(annotation, true);
	}

	public boolean removeAnnotation(org.jfree.chart.annotations.XYAnnotation annotation, boolean notify) {
		if (annotation == null) {
			throw new java.lang.IllegalArgumentException("Null 'annotation' argument.");
		}
		boolean removed = org.jfree.chart.plot.XYPlot.this.annotations.remove(annotation);
		if (removed && notify) {
			fireChangeEvent();
		}
		return removed;
	}

	public java.util.List getAnnotations() {
		return new java.util.ArrayList(org.jfree.chart.plot.XYPlot.this.annotations);
	}

	public void clearAnnotations() {
		org.jfree.chart.plot.XYPlot.this.annotations.clear();
		fireChangeEvent();
	}

	protected org.jfree.chart.axis.AxisSpace calculateAxisSpace(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea) {
		org.jfree.chart.axis.AxisSpace space = new org.jfree.chart.axis.AxisSpace();
		space = calculateRangeAxisSpace(g2, plotArea, space);
		java.awt.geom.Rectangle2D revPlotArea = space.shrink(plotArea, null);
		space = calculateDomainAxisSpace(g2, revPlotArea, space);
		return space;
	}

	protected org.jfree.chart.axis.AxisSpace calculateDomainAxisSpace(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, org.jfree.chart.axis.AxisSpace space) {
		if (space == null) {
			space = new org.jfree.chart.axis.AxisSpace();
		}
		if ((org.jfree.chart.plot.XYPlot.this.fixedDomainAxisSpace) != null) {
			if ((org.jfree.chart.plot.XYPlot.this.orientation) == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				space.ensureAtLeast(org.jfree.chart.plot.XYPlot.this.fixedDomainAxisSpace.getLeft(), org.jfree.chart.util.RectangleEdge.LEFT);
				space.ensureAtLeast(org.jfree.chart.plot.XYPlot.this.fixedDomainAxisSpace.getRight(), org.jfree.chart.util.RectangleEdge.RIGHT);
			}else
				if ((org.jfree.chart.plot.XYPlot.this.orientation) == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					space.ensureAtLeast(org.jfree.chart.plot.XYPlot.this.fixedDomainAxisSpace.getTop(), org.jfree.chart.util.RectangleEdge.TOP);
					space.ensureAtLeast(org.jfree.chart.plot.XYPlot.this.fixedDomainAxisSpace.getBottom(), org.jfree.chart.util.RectangleEdge.BOTTOM);
				}
			
		}else {
			for (int i = 0; i < (org.jfree.chart.plot.XYPlot.this.domainAxes.size()); i++) {
				org.jfree.chart.axis.Axis axis = ((org.jfree.chart.axis.Axis) (org.jfree.chart.plot.XYPlot.this.domainAxes.get(i)));
				if (axis != null) {
					org.jfree.chart.util.RectangleEdge edge = getDomainAxisEdge(i);
					space = axis.reserveSpace(g2, org.jfree.chart.plot.XYPlot.this, plotArea, edge, space);
				}
			}
		}
		return space;
	}

	protected org.jfree.chart.axis.AxisSpace calculateRangeAxisSpace(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, org.jfree.chart.axis.AxisSpace space) {
		if (space == null) {
			space = new org.jfree.chart.axis.AxisSpace();
		}
		if ((org.jfree.chart.plot.XYPlot.this.fixedRangeAxisSpace) != null) {
			if ((org.jfree.chart.plot.XYPlot.this.orientation) == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				space.ensureAtLeast(org.jfree.chart.plot.XYPlot.this.fixedRangeAxisSpace.getTop(), org.jfree.chart.util.RectangleEdge.TOP);
				space.ensureAtLeast(org.jfree.chart.plot.XYPlot.this.fixedRangeAxisSpace.getBottom(), org.jfree.chart.util.RectangleEdge.BOTTOM);
			}else
				if ((org.jfree.chart.plot.XYPlot.this.orientation) == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					space.ensureAtLeast(org.jfree.chart.plot.XYPlot.this.fixedRangeAxisSpace.getLeft(), org.jfree.chart.util.RectangleEdge.LEFT);
					space.ensureAtLeast(org.jfree.chart.plot.XYPlot.this.fixedRangeAxisSpace.getRight(), org.jfree.chart.util.RectangleEdge.RIGHT);
				}
			
		}else {
			for (int i = 0; i < (org.jfree.chart.plot.XYPlot.this.rangeAxes.size()); i++) {
				org.jfree.chart.axis.Axis axis = ((org.jfree.chart.axis.Axis) (org.jfree.chart.plot.XYPlot.this.rangeAxes.get(i)));
				if (axis != null) {
					org.jfree.chart.util.RectangleEdge edge = getRangeAxisEdge(i);
					space = axis.reserveSpace(g2, org.jfree.chart.plot.XYPlot.this, plotArea, edge, space);
				}
			}
		}
		return space;
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.awt.geom.Point2D anchor, org.jfree.chart.plot.PlotState parentState, org.jfree.chart.plot.PlotRenderingInfo info) {
		boolean b1 = (area.getWidth()) <= (org.jfree.chart.plot.Plot.MINIMUM_WIDTH_TO_DRAW);
		boolean b2 = (area.getHeight()) <= (org.jfree.chart.plot.Plot.MINIMUM_HEIGHT_TO_DRAW);
		if (b1 || b2) {
			return ;
		}
		if (info != null) {
			info.setPlotArea(area);
		}
		org.jfree.chart.util.RectangleInsets insets = getInsets();
		insets.trim(area);
		org.jfree.chart.axis.AxisSpace space = calculateAxisSpace(g2, area);
		java.awt.geom.Rectangle2D dataArea = space.shrink(area, null);
		org.jfree.chart.plot.XYPlot.this.axisOffset.trim(dataArea);
		createAndAddEntity(((java.awt.geom.Rectangle2D) (dataArea.clone())), info, null, null);
		if (info != null) {
			info.setDataArea(dataArea);
		}
		drawBackground(g2, dataArea);
		java.util.Map axisStateMap = drawAxes(g2, area, dataArea, info);
		org.jfree.chart.plot.PlotOrientation orient = getOrientation();
		if ((anchor != null) && (!(dataArea.contains(anchor)))) {
			anchor = null;
		}
		org.jfree.chart.plot.CrosshairState crosshairState = new org.jfree.chart.plot.CrosshairState();
		crosshairState.setCrosshairDistance(java.lang.Double.POSITIVE_INFINITY);
		crosshairState.setAnchor(anchor);
		crosshairState.setAnchorX(java.lang.Double.NaN);
		crosshairState.setAnchorY(java.lang.Double.NaN);
		if (anchor != null) {
			org.jfree.chart.axis.ValueAxis domainAxis = getDomainAxis();
			if (domainAxis != null) {
				double x;
				if (orient == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					x = domainAxis.java2DToValue(anchor.getX(), dataArea, getDomainAxisEdge());
				}else {
					x = domainAxis.java2DToValue(anchor.getY(), dataArea, getDomainAxisEdge());
				}
				crosshairState.setAnchorX(x);
			}
			org.jfree.chart.axis.ValueAxis rangeAxis = getRangeAxis();
			if (rangeAxis != null) {
				double y;
				if (orient == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
					y = rangeAxis.java2DToValue(anchor.getY(), dataArea, getRangeAxisEdge());
				}else {
					y = rangeAxis.java2DToValue(anchor.getX(), dataArea, getRangeAxisEdge());
				}
				crosshairState.setAnchorY(y);
			}
		}
		crosshairState.setCrosshairX(getDomainCrosshairValue());
		crosshairState.setCrosshairY(getRangeCrosshairValue());
		java.awt.Shape originalClip = g2.getClip();
		java.awt.Composite originalComposite = g2.getComposite();
		g2.clip(dataArea);
		g2.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, getForegroundAlpha()));
		org.jfree.chart.axis.AxisState domainAxisState = ((org.jfree.chart.axis.AxisState) (axisStateMap.get(getDomainAxis())));
		if (domainAxisState == null) {
			if (parentState != null) {
				domainAxisState = ((org.jfree.chart.axis.AxisState) (parentState.getSharedAxisStates().get(getDomainAxis())));
			}
		}
		org.jfree.chart.axis.AxisState rangeAxisState = ((org.jfree.chart.axis.AxisState) (axisStateMap.get(getRangeAxis())));
		if (rangeAxisState == null) {
			if (parentState != null) {
				rangeAxisState = ((org.jfree.chart.axis.AxisState) (parentState.getSharedAxisStates().get(getRangeAxis())));
			}
		}
		if (domainAxisState != null) {
			drawDomainTickBands(g2, dataArea, domainAxisState.getTicks());
		}
		if (rangeAxisState != null) {
			drawRangeTickBands(g2, dataArea, rangeAxisState.getTicks());
		}
		if (domainAxisState != null) {
			drawDomainGridlines(g2, dataArea, domainAxisState.getTicks());
			drawZeroDomainBaseline(g2, dataArea);
		}
		if (rangeAxisState != null) {
			drawRangeGridlines(g2, dataArea, rangeAxisState.getTicks());
			drawZeroRangeBaseline(g2, dataArea);
		}
		for (int i = 0; i < (org.jfree.chart.plot.XYPlot.this.renderers.size()); i++) {
			drawDomainMarkers(g2, dataArea, i, org.jfree.chart.util.Layer.BACKGROUND);
		}
		for (int i = 0; i < (org.jfree.chart.plot.XYPlot.this.renderers.size()); i++) {
			drawRangeMarkers(g2, dataArea, i, org.jfree.chart.util.Layer.BACKGROUND);
		}
		boolean foundData = false;
		org.jfree.chart.plot.DatasetRenderingOrder order = getDatasetRenderingOrder();
		if (order == (org.jfree.chart.plot.DatasetRenderingOrder.FORWARD)) {
			int rendererCount = org.jfree.chart.plot.XYPlot.this.renderers.size();
			for (int i = 0; i < rendererCount; i++) {
				org.jfree.chart.renderer.xy.XYItemRenderer r = getRenderer(i);
				if (r != null) {
					org.jfree.chart.axis.ValueAxis domainAxis = getDomainAxisForDataset(i);
					org.jfree.chart.axis.ValueAxis rangeAxis = getRangeAxisForDataset(i);
					r.drawAnnotations(g2, dataArea, domainAxis, rangeAxis, org.jfree.chart.util.Layer.BACKGROUND, info);
				}
			}
			for (int i = 0; i < (getDatasetCount()); i++) {
				foundData = (render(g2, dataArea, i, info, crosshairState)) || foundData;
			}
			for (int i = 0; i < rendererCount; i++) {
				org.jfree.chart.renderer.xy.XYItemRenderer r = getRenderer(i);
				if (r != null) {
					org.jfree.chart.axis.ValueAxis domainAxis = getDomainAxisForDataset(i);
					org.jfree.chart.axis.ValueAxis rangeAxis = getRangeAxisForDataset(i);
					r.drawAnnotations(g2, dataArea, domainAxis, rangeAxis, org.jfree.chart.util.Layer.FOREGROUND, info);
				}
			}
		}else
			if (order == (org.jfree.chart.plot.DatasetRenderingOrder.REVERSE)) {
				int rendererCount = org.jfree.chart.plot.XYPlot.this.renderers.size();
				for (int i = rendererCount - 1; i >= 0; i--) {
					org.jfree.chart.renderer.xy.XYItemRenderer r = getRenderer(i);
					if (i >= (getDatasetCount())) {
						continue;
					}
					if (r != null) {
						org.jfree.chart.axis.ValueAxis domainAxis = getDomainAxisForDataset(i);
						org.jfree.chart.axis.ValueAxis rangeAxis = getRangeAxisForDataset(i);
						r.drawAnnotations(g2, dataArea, domainAxis, rangeAxis, org.jfree.chart.util.Layer.BACKGROUND, info);
					}
				}
				for (int i = (getDatasetCount()) - 1; i >= 0; i--) {
					foundData = (render(g2, dataArea, i, info, crosshairState)) || foundData;
				}
				for (int i = rendererCount - 1; i >= 0; i--) {
					org.jfree.chart.renderer.xy.XYItemRenderer r = getRenderer(i);
					if (i >= (getDatasetCount())) {
						continue;
					}
					if (r != null) {
						org.jfree.chart.axis.ValueAxis domainAxis = getDomainAxisForDataset(i);
						org.jfree.chart.axis.ValueAxis rangeAxis = getRangeAxisForDataset(i);
						r.drawAnnotations(g2, dataArea, domainAxis, rangeAxis, org.jfree.chart.util.Layer.FOREGROUND, info);
					}
				}
			}
		
		int xAxisIndex = crosshairState.getDomainAxisIndex();
		org.jfree.chart.axis.ValueAxis xAxis = getDomainAxis(xAxisIndex);
		org.jfree.chart.util.RectangleEdge xAxisEdge = getDomainAxisEdge(xAxisIndex);
		if ((!(org.jfree.chart.plot.XYPlot.this.domainCrosshairLockedOnData)) && (anchor != null)) {
			double xx;
			if (orient == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
				xx = xAxis.java2DToValue(anchor.getX(), dataArea, xAxisEdge);
			}else {
				xx = xAxis.java2DToValue(anchor.getY(), dataArea, xAxisEdge);
			}
			crosshairState.setCrosshairX(xx);
		}
		setDomainCrosshairValue(crosshairState.getCrosshairX(), false);
		if (isDomainCrosshairVisible()) {
			double x = getDomainCrosshairValue();
			java.awt.Paint paint = getDomainCrosshairPaint();
			java.awt.Stroke stroke = getDomainCrosshairStroke();
			drawDomainCrosshair(g2, dataArea, orient, x, xAxis, stroke, paint);
		}
		int yAxisIndex = crosshairState.getRangeAxisIndex();
		org.jfree.chart.axis.ValueAxis yAxis = getRangeAxis(yAxisIndex);
		org.jfree.chart.util.RectangleEdge yAxisEdge = getRangeAxisEdge(yAxisIndex);
		if ((!(org.jfree.chart.plot.XYPlot.this.rangeCrosshairLockedOnData)) && (anchor != null)) {
			double yy;
			if (orient == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
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
			drawRangeCrosshair(g2, dataArea, orient, y, yAxis, stroke, paint);
		}
		if (!foundData) {
			drawNoDataMessage(g2, dataArea);
		}
		for (int i = 0; i < (org.jfree.chart.plot.XYPlot.this.renderers.size()); i++) {
			drawDomainMarkers(g2, dataArea, i, org.jfree.chart.util.Layer.FOREGROUND);
		}
		for (int i = 0; i < (org.jfree.chart.plot.XYPlot.this.renderers.size()); i++) {
			drawRangeMarkers(g2, dataArea, i, org.jfree.chart.util.Layer.FOREGROUND);
		}
		drawAnnotations(g2, dataArea, info);
		g2.setClip(originalClip);
		g2.setComposite(originalComposite);
		drawOutline(g2, dataArea);
	}

	public void drawBackground(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area) {
		fillBackground(g2, area, org.jfree.chart.plot.XYPlot.this.orientation);
		drawQuadrants(g2, area);
		drawBackgroundImage(g2, area);
	}

	protected void drawQuadrants(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area) {
		boolean somethingToDraw = false;
		org.jfree.chart.axis.ValueAxis xAxis = getDomainAxis();
		if (xAxis == null) {
			return ;
		}
		double x = xAxis.getRange().constrain(org.jfree.chart.plot.XYPlot.this.quadrantOrigin.getX());
		double xx = xAxis.valueToJava2D(x, area, getDomainAxisEdge());
		org.jfree.chart.axis.ValueAxis yAxis = getRangeAxis();
		if (yAxis == null) {
			return ;
		}
		double y = yAxis.getRange().constrain(org.jfree.chart.plot.XYPlot.this.quadrantOrigin.getY());
		double yy = yAxis.valueToJava2D(y, area, getRangeAxisEdge());
		double xmin = xAxis.getLowerBound();
		double xxmin = xAxis.valueToJava2D(xmin, area, getDomainAxisEdge());
		double xmax = xAxis.getUpperBound();
		double xxmax = xAxis.valueToJava2D(xmax, area, getDomainAxisEdge());
		double ymin = yAxis.getLowerBound();
		double yymin = yAxis.valueToJava2D(ymin, area, getRangeAxisEdge());
		double ymax = yAxis.getUpperBound();
		double yymax = yAxis.valueToJava2D(ymax, area, getRangeAxisEdge());
		java.awt.geom.Rectangle2D[] r = new java.awt.geom.Rectangle2D[]{ null , null , null , null };
		if ((org.jfree.chart.plot.XYPlot.this.quadrantPaint[0]) != null) {
			if ((x > xmin) && (y < ymax)) {
				if ((org.jfree.chart.plot.XYPlot.this.orientation) == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
					r[0] = new java.awt.geom.Rectangle2D.Double(java.lang.Math.min(yymax, yy), java.lang.Math.min(xxmin, xx), java.lang.Math.abs((yy - yymax)), java.lang.Math.abs((xx - xxmin)));
				}else {
					r[0] = new java.awt.geom.Rectangle2D.Double(java.lang.Math.min(xxmin, xx), java.lang.Math.min(yymax, yy), java.lang.Math.abs((xx - xxmin)), java.lang.Math.abs((yy - yymax)));
				}
				somethingToDraw = true;
			}
		}
		if ((org.jfree.chart.plot.XYPlot.this.quadrantPaint[1]) != null) {
			if ((x < xmax) && (y < ymax)) {
				if ((org.jfree.chart.plot.XYPlot.this.orientation) == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
					r[1] = new java.awt.geom.Rectangle2D.Double(java.lang.Math.min(yymax, yy), java.lang.Math.min(xxmax, xx), java.lang.Math.abs((yy - yymax)), java.lang.Math.abs((xx - xxmax)));
				}else {
					r[1] = new java.awt.geom.Rectangle2D.Double(java.lang.Math.min(xx, xxmax), java.lang.Math.min(yymax, yy), java.lang.Math.abs((xx - xxmax)), java.lang.Math.abs((yy - yymax)));
				}
				somethingToDraw = true;
			}
		}
		if ((org.jfree.chart.plot.XYPlot.this.quadrantPaint[2]) != null) {
			if ((x > xmin) && (y > ymin)) {
				if ((org.jfree.chart.plot.XYPlot.this.orientation) == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
					r[2] = new java.awt.geom.Rectangle2D.Double(java.lang.Math.min(yymin, yy), java.lang.Math.min(xxmin, xx), java.lang.Math.abs((yy - yymin)), java.lang.Math.abs((xx - xxmin)));
				}else {
					r[2] = new java.awt.geom.Rectangle2D.Double(java.lang.Math.min(xxmin, xx), java.lang.Math.min(yymin, yy), java.lang.Math.abs((xx - xxmin)), java.lang.Math.abs((yy - yymin)));
				}
				somethingToDraw = true;
			}
		}
		if ((org.jfree.chart.plot.XYPlot.this.quadrantPaint[3]) != null) {
			if ((x < xmax) && (y > ymin)) {
				if ((org.jfree.chart.plot.XYPlot.this.orientation) == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
					r[3] = new java.awt.geom.Rectangle2D.Double(java.lang.Math.min(yymin, yy), java.lang.Math.min(xxmax, xx), java.lang.Math.abs((yy - yymin)), java.lang.Math.abs((xx - xxmax)));
				}else {
					r[3] = new java.awt.geom.Rectangle2D.Double(java.lang.Math.min(xx, xxmax), java.lang.Math.min(yymin, yy), java.lang.Math.abs((xx - xxmax)), java.lang.Math.abs((yy - yymin)));
				}
				somethingToDraw = true;
			}
		}
		if (somethingToDraw) {
			java.awt.Composite originalComposite = g2.getComposite();
			g2.setComposite(java.awt.AlphaComposite.getInstance(java.awt.AlphaComposite.SRC_OVER, getBackgroundAlpha()));
			for (int i = 0; i < 4; i++) {
				if (((org.jfree.chart.plot.XYPlot.this.quadrantPaint[i]) != null) && ((r[i]) != null)) {
					g2.setPaint(org.jfree.chart.plot.XYPlot.this.quadrantPaint[i]);
					g2.fill(r[i]);
				}
			}
			g2.setComposite(originalComposite);
		}
	}

	public void drawDomainTickBands(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, java.util.List ticks) {
		java.awt.Paint bandPaint = getDomainTickBandPaint();
		if (bandPaint != null) {
			boolean fillBand = false;
			org.jfree.chart.axis.ValueAxis xAxis = getDomainAxis();
			double previous = xAxis.getLowerBound();
			java.util.Iterator iterator = ticks.iterator();
			while (iterator.hasNext()) {
				org.jfree.chart.axis.ValueTick tick = ((org.jfree.chart.axis.ValueTick) (iterator.next()));
				double current = tick.getValue();
				if (fillBand) {
					getRenderer().fillDomainGridBand(g2, org.jfree.chart.plot.XYPlot.this, xAxis, dataArea, previous, current);
				}
				previous = current;
				fillBand = !fillBand;
			} 
			double end = xAxis.getUpperBound();
			if (fillBand) {
				getRenderer().fillDomainGridBand(g2, org.jfree.chart.plot.XYPlot.this, xAxis, dataArea, previous, end);
			}
		}
	}

	public void drawRangeTickBands(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, java.util.List ticks) {
		java.awt.Paint bandPaint = getRangeTickBandPaint();
		if (bandPaint != null) {
			boolean fillBand = false;
			org.jfree.chart.axis.ValueAxis axis = getRangeAxis();
			double previous = axis.getLowerBound();
			java.util.Iterator iterator = ticks.iterator();
			while (iterator.hasNext()) {
				org.jfree.chart.axis.ValueTick tick = ((org.jfree.chart.axis.ValueTick) (iterator.next()));
				double current = tick.getValue();
				if (fillBand) {
					getRenderer().fillRangeGridBand(g2, org.jfree.chart.plot.XYPlot.this, axis, dataArea, previous, current);
				}
				previous = current;
				fillBand = !fillBand;
			} 
			double end = axis.getUpperBound();
			if (fillBand) {
				getRenderer().fillRangeGridBand(g2, org.jfree.chart.plot.XYPlot.this, axis, dataArea, previous, end);
			}
		}
	}

	protected java.util.Map drawAxes(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PlotRenderingInfo plotState) {
		org.jfree.chart.axis.AxisCollection axisCollection = new org.jfree.chart.axis.AxisCollection();
		for (int index = 0; index < (org.jfree.chart.plot.XYPlot.this.domainAxes.size()); index++) {
			org.jfree.chart.axis.ValueAxis axis = ((org.jfree.chart.axis.ValueAxis) (org.jfree.chart.plot.XYPlot.this.domainAxes.get(index)));
			if (axis != null) {
				axisCollection.add(axis, getDomainAxisEdge(index));
			}
		}
		for (int index = 0; index < (org.jfree.chart.plot.XYPlot.this.rangeAxes.size()); index++) {
			org.jfree.chart.axis.ValueAxis yAxis = ((org.jfree.chart.axis.ValueAxis) (org.jfree.chart.plot.XYPlot.this.rangeAxes.get(index)));
			if (yAxis != null) {
				axisCollection.add(yAxis, getRangeAxisEdge(index));
			}
		}
		java.util.Map axisStateMap = new java.util.HashMap();
		double cursor = (dataArea.getMinY()) - (org.jfree.chart.plot.XYPlot.this.axisOffset.calculateTopOutset(dataArea.getHeight()));
		java.util.Iterator iterator = axisCollection.getAxesAtTop().iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.axis.ValueAxis axis = ((org.jfree.chart.axis.ValueAxis) (iterator.next()));
			org.jfree.chart.axis.AxisState info = axis.draw(g2, cursor, plotArea, dataArea, org.jfree.chart.util.RectangleEdge.TOP, plotState);
			cursor = info.getCursor();
			axisStateMap.put(axis, info);
		} 
		cursor = (dataArea.getMaxY()) + (org.jfree.chart.plot.XYPlot.this.axisOffset.calculateBottomOutset(dataArea.getHeight()));
		iterator = axisCollection.getAxesAtBottom().iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.axis.ValueAxis axis = ((org.jfree.chart.axis.ValueAxis) (iterator.next()));
			org.jfree.chart.axis.AxisState info = axis.draw(g2, cursor, plotArea, dataArea, org.jfree.chart.util.RectangleEdge.BOTTOM, plotState);
			cursor = info.getCursor();
			axisStateMap.put(axis, info);
		} 
		cursor = (dataArea.getMinX()) - (org.jfree.chart.plot.XYPlot.this.axisOffset.calculateLeftOutset(dataArea.getWidth()));
		iterator = axisCollection.getAxesAtLeft().iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.axis.ValueAxis axis = ((org.jfree.chart.axis.ValueAxis) (iterator.next()));
			org.jfree.chart.axis.AxisState info = axis.draw(g2, cursor, plotArea, dataArea, org.jfree.chart.util.RectangleEdge.LEFT, plotState);
			cursor = info.getCursor();
			axisStateMap.put(axis, info);
		} 
		cursor = (dataArea.getMaxX()) + (org.jfree.chart.plot.XYPlot.this.axisOffset.calculateRightOutset(dataArea.getWidth()));
		iterator = axisCollection.getAxesAtRight().iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.axis.ValueAxis axis = ((org.jfree.chart.axis.ValueAxis) (iterator.next()));
			org.jfree.chart.axis.AxisState info = axis.draw(g2, cursor, plotArea, dataArea, org.jfree.chart.util.RectangleEdge.RIGHT, plotState);
			cursor = info.getCursor();
			axisStateMap.put(axis, info);
		} 
		return axisStateMap;
	}

	public boolean render(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, int index, org.jfree.chart.plot.PlotRenderingInfo info, org.jfree.chart.plot.CrosshairState crosshairState) {
		boolean foundData = false;
		org.jfree.data.xy.XYDataset dataset = getDataset(index);
		if (!(org.jfree.data.general.DatasetUtilities.isEmptyOrNull(dataset))) {
			foundData = true;
			org.jfree.chart.axis.ValueAxis xAxis = getDomainAxisForDataset(index);
			org.jfree.chart.axis.ValueAxis yAxis = getRangeAxisForDataset(index);
			if ((xAxis == null) || (yAxis == null)) {
				return foundData;
			}
			org.jfree.chart.renderer.xy.XYItemRenderer renderer = getRenderer(index);
			if (renderer == null) {
				renderer = getRenderer();
				if (renderer == null) {
					return foundData;
				}
			}
			org.jfree.chart.renderer.xy.XYItemRendererState state = renderer.initialise(g2, dataArea, org.jfree.chart.plot.XYPlot.this, dataset, info);
			org.jfree.data.xy.XYDatasetSelectionState selectionState = state.getSelectionState();
			int passCount = renderer.getPassCount();
			org.jfree.chart.plot.SeriesRenderingOrder seriesOrder = getSeriesRenderingOrder();
			if (seriesOrder == (org.jfree.chart.plot.SeriesRenderingOrder.REVERSE)) {
				for (int pass = 0; pass < passCount; pass++) {
					int seriesCount = dataset.getSeriesCount();
					for (int series = seriesCount - 1; series >= 0; series--) {
						int firstItem = 0;
						int lastItem = (dataset.getItemCount(series)) - 1;
						if (lastItem == (-1)) {
							continue;
						}
						if (state.getProcessVisibleItemsOnly()) {
							int[] itemBounds = org.jfree.chart.renderer.RendererUtilities.findLiveItems(dataset, series, xAxis.getLowerBound(), xAxis.getUpperBound());
							firstItem = java.lang.Math.max(((itemBounds[0]) - 1), 0);
							lastItem = java.lang.Math.min(((itemBounds[1]) + 1), lastItem);
						}
						state.startSeriesPass(dataset, series, firstItem, lastItem, pass, passCount);
						for (int item = firstItem; item <= lastItem; item++) {
							boolean selected = false;
							if (selectionState != null) {
								selected = selectionState.isSelected(series, item);
							}
							renderer.drawItem(g2, state, dataArea, org.jfree.chart.plot.XYPlot.this, xAxis, yAxis, dataset, series, item, selected, pass);
						}
						state.endSeriesPass(dataset, series, firstItem, lastItem, pass, passCount);
					}
				}
			}else {
				for (int pass = 0; pass < passCount; pass++) {
					int seriesCount = dataset.getSeriesCount();
					for (int series = 0; series < seriesCount; series++) {
						int firstItem = 0;
						int lastItem = (dataset.getItemCount(series)) - 1;
						if (state.getProcessVisibleItemsOnly()) {
							int[] itemBounds = org.jfree.chart.renderer.RendererUtilities.findLiveItems(dataset, series, xAxis.getLowerBound(), xAxis.getUpperBound());
							firstItem = java.lang.Math.max(((itemBounds[0]) - 1), 0);
							lastItem = java.lang.Math.min(((itemBounds[1]) + 1), lastItem);
						}
						state.startSeriesPass(dataset, series, firstItem, lastItem, pass, passCount);
						for (int item = firstItem; item <= lastItem; item++) {
							boolean selected = false;
							if (selectionState != null) {
								selected = selectionState.isSelected(series, item);
							}
							renderer.drawItem(g2, state, dataArea, org.jfree.chart.plot.XYPlot.this, xAxis, yAxis, dataset, series, item, selected, pass);
						}
						state.endSeriesPass(dataset, series, firstItem, lastItem, pass, passCount);
					}
				}
			}
		}
		return foundData;
	}

	public org.jfree.chart.axis.ValueAxis getDomainAxisForDataset(int index) {
		int upper = java.lang.Math.max(getDatasetCount(), getRendererCount());
		if ((index < 0) || (index >= upper)) {
			throw new java.lang.IllegalArgumentException((("Index " + index) + " out of bounds."));
		}
		org.jfree.chart.axis.ValueAxis valueAxis = null;
		java.util.List axisIndices = ((java.util.List) (org.jfree.chart.plot.XYPlot.this.datasetToDomainAxesMap.get(new java.lang.Integer(index))));
		if (axisIndices != null) {
			java.lang.Integer axisIndex = ((java.lang.Integer) (axisIndices.get(0)));
			valueAxis = getDomainAxis(axisIndex.intValue());
		}else {
			valueAxis = getDomainAxis(0);
		}
		return valueAxis;
	}

	public org.jfree.chart.axis.ValueAxis getRangeAxisForDataset(int index) {
		int upper = java.lang.Math.max(getDatasetCount(), getRendererCount());
		if ((index < 0) || (index >= upper)) {
			throw new java.lang.IllegalArgumentException((("Index " + index) + " out of bounds."));
		}
		org.jfree.chart.axis.ValueAxis valueAxis = null;
		java.util.List axisIndices = ((java.util.List) (org.jfree.chart.plot.XYPlot.this.datasetToRangeAxesMap.get(new java.lang.Integer(index))));
		if (axisIndices != null) {
			java.lang.Integer axisIndex = ((java.lang.Integer) (axisIndices.get(0)));
			valueAxis = getRangeAxis(axisIndex.intValue());
		}else {
			valueAxis = getRangeAxis(0);
		}
		return valueAxis;
	}

	protected void drawDomainGridlines(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, java.util.List ticks) {
		if ((getRenderer()) == null) {
			return ;
		}
		if ((isDomainGridlinesVisible()) || (isDomainMinorGridlinesVisible())) {
			java.awt.Stroke gridStroke = null;
			java.awt.Paint gridPaint = null;
			java.util.Iterator iterator = ticks.iterator();
			boolean paintLine = false;
			while (iterator.hasNext()) {
				paintLine = false;
				org.jfree.chart.axis.ValueTick tick = ((org.jfree.chart.axis.ValueTick) (iterator.next()));
				if (((tick.getTickType()) == (org.jfree.chart.axis.TickType.MINOR)) && (isDomainMinorGridlinesVisible())) {
					gridStroke = getDomainMinorGridlineStroke();
					gridPaint = getDomainMinorGridlinePaint();
					paintLine = true;
				}else
					if (((tick.getTickType()) == (org.jfree.chart.axis.TickType.MAJOR)) && (isDomainGridlinesVisible())) {
						gridStroke = getDomainGridlineStroke();
						gridPaint = getDomainGridlinePaint();
						paintLine = true;
					}
				
				org.jfree.chart.renderer.xy.XYItemRenderer r = getRenderer();
				if ((r instanceof org.jfree.chart.renderer.xy.AbstractXYItemRenderer) && paintLine) {
					((org.jfree.chart.renderer.xy.AbstractXYItemRenderer) (r)).drawDomainLine(g2, org.jfree.chart.plot.XYPlot.this, getDomainAxis(), dataArea, tick.getValue(), gridPaint, gridStroke);
				}
			} 
		}
	}

	protected void drawRangeGridlines(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.util.List ticks) {
		if ((getRenderer()) == null) {
			return ;
		}
		if ((isRangeGridlinesVisible()) || (isRangeMinorGridlinesVisible())) {
			java.awt.Stroke gridStroke = null;
			java.awt.Paint gridPaint = null;
			org.jfree.chart.axis.ValueAxis axis = getRangeAxis();
			if (axis != null) {
				java.util.Iterator iterator = ticks.iterator();
				boolean paintLine = false;
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
						getRenderer().drawRangeLine(g2, org.jfree.chart.plot.XYPlot.this, getRangeAxis(), area, tick.getValue(), gridPaint, gridStroke);
					}
				} 
			}
		}
	}

	protected void drawZeroDomainBaseline(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area) {
		if (isDomainZeroBaselineVisible()) {
			org.jfree.chart.renderer.xy.XYItemRenderer r = getRenderer();
			r.drawDomainLine(g2, org.jfree.chart.plot.XYPlot.this, getDomainAxis(), area, 0.0, org.jfree.chart.plot.XYPlot.this.domainZeroBaselinePaint, org.jfree.chart.plot.XYPlot.this.domainZeroBaselineStroke);
		}
	}

	protected void drawZeroRangeBaseline(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area) {
		if (isRangeZeroBaselineVisible()) {
			getRenderer().drawRangeLine(g2, org.jfree.chart.plot.XYPlot.this, getRangeAxis(), area, 0.0, org.jfree.chart.plot.XYPlot.this.rangeZeroBaselinePaint, org.jfree.chart.plot.XYPlot.this.rangeZeroBaselineStroke);
		}
	}

	public void drawAnnotations(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PlotRenderingInfo info) {
		java.util.Iterator iterator = org.jfree.chart.plot.XYPlot.this.annotations.iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.annotations.XYAnnotation annotation = ((org.jfree.chart.annotations.XYAnnotation) (iterator.next()));
			org.jfree.chart.axis.ValueAxis xAxis = getDomainAxis();
			org.jfree.chart.axis.ValueAxis yAxis = getRangeAxis();
			annotation.draw(g2, org.jfree.chart.plot.XYPlot.this, dataArea, xAxis, yAxis, 0, info);
		} 
	}

	protected void drawDomainMarkers(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, int index, org.jfree.chart.util.Layer layer) {
		org.jfree.chart.renderer.xy.XYItemRenderer r = getRenderer(index);
		if (r == null) {
			return ;
		}
		if (index >= (getDatasetCount())) {
			return ;
		}
		java.util.Collection markers = getDomainMarkers(index, layer);
		org.jfree.chart.axis.ValueAxis axis = getDomainAxisForDataset(index);
		if ((markers != null) && (axis != null)) {
			java.util.Iterator iterator = markers.iterator();
			while (iterator.hasNext()) {
				org.jfree.chart.plot.Marker marker = ((org.jfree.chart.plot.Marker) (iterator.next()));
				r.drawDomainMarker(g2, org.jfree.chart.plot.XYPlot.this, axis, marker, dataArea);
			} 
		}
	}

	protected void drawRangeMarkers(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, int index, org.jfree.chart.util.Layer layer) {
		org.jfree.chart.renderer.xy.XYItemRenderer r = getRenderer(index);
		if (r == null) {
			return ;
		}
		if (index >= (getDatasetCount())) {
			return ;
		}
		java.util.Collection markers = getRangeMarkers(index, layer);
		org.jfree.chart.axis.ValueAxis axis = getRangeAxisForDataset(index);
		if ((markers != null) && (axis != null)) {
			java.util.Iterator iterator = markers.iterator();
			while (iterator.hasNext()) {
				org.jfree.chart.plot.Marker marker = ((org.jfree.chart.plot.Marker) (iterator.next()));
				r.drawRangeMarker(g2, org.jfree.chart.plot.XYPlot.this, axis, marker, dataArea);
			} 
		}
	}

	public java.util.Collection getDomainMarkers(org.jfree.chart.util.Layer layer) {
		return getDomainMarkers(0, layer);
	}

	public java.util.Collection getRangeMarkers(org.jfree.chart.util.Layer layer) {
		return getRangeMarkers(0, layer);
	}

	public java.util.Collection getDomainMarkers(int index, org.jfree.chart.util.Layer layer) {
		java.util.Collection result = null;
		java.lang.Integer key = new java.lang.Integer(index);
		if (layer == (org.jfree.chart.util.Layer.FOREGROUND)) {
			result = ((java.util.Collection) (org.jfree.chart.plot.XYPlot.this.foregroundDomainMarkers.get(key)));
		}else
			if (layer == (org.jfree.chart.util.Layer.BACKGROUND)) {
				result = ((java.util.Collection) (org.jfree.chart.plot.XYPlot.this.backgroundDomainMarkers.get(key)));
			}
		
		if (result != null) {
			result = java.util.Collections.unmodifiableCollection(result);
		}
		return result;
	}

	public java.util.Collection getRangeMarkers(int index, org.jfree.chart.util.Layer layer) {
		java.util.Collection result = null;
		java.lang.Integer key = new java.lang.Integer(index);
		if (layer == (org.jfree.chart.util.Layer.FOREGROUND)) {
			result = ((java.util.Collection) (org.jfree.chart.plot.XYPlot.this.foregroundRangeMarkers.get(key)));
		}else
			if (layer == (org.jfree.chart.util.Layer.BACKGROUND)) {
				result = ((java.util.Collection) (org.jfree.chart.plot.XYPlot.this.backgroundRangeMarkers.get(key)));
			}
		
		if (result != null) {
			result = java.util.Collections.unmodifiableCollection(result);
		}
		return result;
	}

	protected void drawHorizontalLine(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, double value, java.awt.Stroke stroke, java.awt.Paint paint) {
		org.jfree.chart.axis.ValueAxis axis = getRangeAxis();
		if ((getOrientation()) == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			axis = getDomainAxis();
		}
		if (axis.getRange().contains(value)) {
			double yy = axis.valueToJava2D(value, dataArea, org.jfree.chart.util.RectangleEdge.LEFT);
			java.awt.geom.Line2D line = new java.awt.geom.Line2D.Double(dataArea.getMinX(), yy, dataArea.getMaxX(), yy);
			g2.setStroke(stroke);
			g2.setPaint(paint);
			g2.draw(line);
		}
	}

	protected void drawDomainCrosshair(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PlotOrientation orientation, double value, org.jfree.chart.axis.ValueAxis axis, java.awt.Stroke stroke, java.awt.Paint paint) {
		if (axis.getRange().contains(value)) {
			java.awt.geom.Line2D line = null;
			if (orientation == (org.jfree.chart.plot.PlotOrientation.VERTICAL)) {
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
	}

	protected void drawVerticalLine(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, double value, java.awt.Stroke stroke, java.awt.Paint paint) {
		org.jfree.chart.axis.ValueAxis axis = getDomainAxis();
		if ((getOrientation()) == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			axis = getRangeAxis();
		}
		if (axis.getRange().contains(value)) {
			double xx = axis.valueToJava2D(value, dataArea, org.jfree.chart.util.RectangleEdge.BOTTOM);
			java.awt.geom.Line2D line = new java.awt.geom.Line2D.Double(xx, dataArea.getMinY(), xx, dataArea.getMaxY());
			g2.setStroke(stroke);
			g2.setPaint(paint);
			g2.draw(line);
		}
	}

	protected void drawRangeCrosshair(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.plot.PlotOrientation orientation, double value, org.jfree.chart.axis.ValueAxis axis, java.awt.Stroke stroke, java.awt.Paint paint) {
		if (axis.getRange().contains(value)) {
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
	}

	public void handleClick(int x, int y, org.jfree.chart.plot.PlotRenderingInfo info) {
		java.awt.geom.Rectangle2D dataArea = info.getDataArea();
		if (dataArea.contains(x, y)) {
			org.jfree.chart.axis.ValueAxis xaxis = getDomainAxis();
			if (xaxis != null) {
				double hvalue = xaxis.java2DToValue(x, info.getDataArea(), getDomainAxisEdge());
				setDomainCrosshairValue(hvalue);
			}
			org.jfree.chart.axis.ValueAxis yaxis = getRangeAxis();
			if (yaxis != null) {
				double vvalue = yaxis.java2DToValue(y, info.getDataArea(), getRangeAxisEdge());
				setRangeCrosshairValue(vvalue);
			}
		}
	}

	private java.util.List getDatasetsMappedToDomainAxis(java.lang.Integer axisIndex) {
		if (axisIndex == null) {
			throw new java.lang.IllegalArgumentException("Null 'axisIndex' argument.");
		}
		java.util.List result = new java.util.ArrayList();
		for (int i = 0; i < (org.jfree.chart.plot.XYPlot.this.datasets.size()); i++) {
			java.util.List mappedAxes = ((java.util.List) (org.jfree.chart.plot.XYPlot.this.datasetToDomainAxesMap.get(new java.lang.Integer(i))));
			if (mappedAxes == null) {
				if (axisIndex.equals(org.jfree.chart.plot.Plot.ZERO)) {
					result.add(org.jfree.chart.plot.XYPlot.this.datasets.get(i));
				}
			}else {
				if (mappedAxes.contains(axisIndex)) {
					result.add(org.jfree.chart.plot.XYPlot.this.datasets.get(i));
				}
			}
		}
		return result;
	}

	private java.util.List getDatasetsMappedToRangeAxis(java.lang.Integer axisIndex) {
		if (axisIndex == null) {
			throw new java.lang.IllegalArgumentException("Null 'axisIndex' argument.");
		}
		java.util.List result = new java.util.ArrayList();
		for (int i = 0; i < (org.jfree.chart.plot.XYPlot.this.datasets.size()); i++) {
			java.util.List mappedAxes = ((java.util.List) (org.jfree.chart.plot.XYPlot.this.datasetToRangeAxesMap.get(new java.lang.Integer(i))));
			if (mappedAxes == null) {
				if (axisIndex.equals(org.jfree.chart.plot.Plot.ZERO)) {
					result.add(org.jfree.chart.plot.XYPlot.this.datasets.get(i));
				}
			}else {
				if (mappedAxes.contains(axisIndex)) {
					result.add(org.jfree.chart.plot.XYPlot.this.datasets.get(i));
				}
			}
		}
		return result;
	}

	public int getDomainAxisIndex(org.jfree.chart.axis.ValueAxis axis) {
		int result = org.jfree.chart.plot.XYPlot.this.domainAxes.indexOf(axis);
		if (result < 0) {
			org.jfree.chart.plot.Plot parent = getParent();
			if (parent instanceof org.jfree.chart.plot.XYPlot) {
				org.jfree.chart.plot.XYPlot p = ((org.jfree.chart.plot.XYPlot) (parent));
				result = p.getDomainAxisIndex(axis);
			}
		}
		return result;
	}

	public int getRangeAxisIndex(org.jfree.chart.axis.ValueAxis axis) {
		int result = org.jfree.chart.plot.XYPlot.this.rangeAxes.indexOf(axis);
		if (result < 0) {
			org.jfree.chart.plot.Plot parent = getParent();
			if (parent instanceof org.jfree.chart.plot.XYPlot) {
				org.jfree.chart.plot.XYPlot p = ((org.jfree.chart.plot.XYPlot) (parent));
				result = p.getRangeAxisIndex(axis);
			}
		}
		return result;
	}

	public org.jfree.data.Range getDataRange(org.jfree.chart.axis.ValueAxis axis) {
		org.jfree.data.Range result = null;
		java.util.List mappedDatasets = new java.util.ArrayList();
		java.util.List includedAnnotations = new java.util.ArrayList();
		boolean isDomainAxis = true;
		int domainIndex = getDomainAxisIndex(axis);
		if (domainIndex >= 0) {
			isDomainAxis = true;
			mappedDatasets.addAll(getDatasetsMappedToDomainAxis(new java.lang.Integer(domainIndex)));
			if (domainIndex == 0) {
				java.util.Iterator iterator = org.jfree.chart.plot.XYPlot.this.annotations.iterator();
				while (iterator.hasNext()) {
					org.jfree.chart.annotations.XYAnnotation annotation = ((org.jfree.chart.annotations.XYAnnotation) (iterator.next()));
					if (annotation instanceof org.jfree.chart.annotations.XYAnnotationBoundsInfo) {
						includedAnnotations.add(annotation);
					}
				} 
			}
		}
		int rangeIndex = getRangeAxisIndex(axis);
		if (rangeIndex >= 0) {
			isDomainAxis = false;
			mappedDatasets.addAll(getDatasetsMappedToRangeAxis(new java.lang.Integer(rangeIndex)));
			if (rangeIndex == 0) {
				java.util.Iterator iterator = org.jfree.chart.plot.XYPlot.this.annotations.iterator();
				while (iterator.hasNext()) {
					org.jfree.chart.annotations.XYAnnotation annotation = ((org.jfree.chart.annotations.XYAnnotation) (iterator.next()));
					if (annotation instanceof org.jfree.chart.annotations.XYAnnotationBoundsInfo) {
						includedAnnotations.add(annotation);
					}
				} 
			}
		}
		java.util.Iterator iterator = mappedDatasets.iterator();
		while (iterator.hasNext()) {
			org.jfree.data.xy.XYDataset d = ((org.jfree.data.xy.XYDataset) (iterator.next()));
			if (d != null) {
				org.jfree.chart.renderer.xy.XYItemRenderer r = getRendererForDataset(d);
				if (isDomainAxis) {
					if (r != null) {
						result = org.jfree.data.Range.combine(result, r.findDomainBounds(d));
					}else {
						result = org.jfree.data.Range.combine(result, org.jfree.data.general.DatasetUtilities.findDomainBounds(d));
					}
				}else {
					if (r != null) {
						result = org.jfree.data.Range.combine(result, r.findRangeBounds(d));
					}else {
						result = org.jfree.data.Range.combine(result, org.jfree.data.general.DatasetUtilities.findRangeBounds(d));
					}
				}
				java.util.Collection c = r.getAnnotations();
				java.util.Iterator i = c.iterator();
				while (i.hasNext()) {
					org.jfree.chart.annotations.XYAnnotation a = ((org.jfree.chart.annotations.XYAnnotation) (i.next()));
					if (a instanceof org.jfree.chart.annotations.XYAnnotationBoundsInfo) {
						includedAnnotations.add(a);
					}
				} 
			}
		} 
		java.util.Iterator it = includedAnnotations.iterator();
		while (it.hasNext()) {
			org.jfree.chart.annotations.XYAnnotationBoundsInfo xyabi = ((org.jfree.chart.annotations.XYAnnotationBoundsInfo) (it.next()));
			if (xyabi.getIncludeInDataBounds()) {
				if (isDomainAxis) {
					result = org.jfree.data.Range.combine(result, xyabi.getXRange());
				}else {
					result = org.jfree.data.Range.combine(result, xyabi.getYRange());
				}
			}
		} 
		return result;
	}

	public void datasetChanged(org.jfree.data.general.DatasetChangeEvent event) {
		configureDomainAxes();
		configureRangeAxes();
		if ((getParent()) != null) {
			getParent().datasetChanged(event);
		}else {
			org.jfree.chart.event.PlotChangeEvent e = new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.XYPlot.this);
			e.setType(org.jfree.chart.event.ChartChangeEventType.DATASET_UPDATED);
			notifyListeners(e);
		}
	}

	public void rendererChanged(org.jfree.chart.event.RendererChangeEvent event) {
		if (event.getSeriesVisibilityChanged()) {
			configureDomainAxes();
			configureRangeAxes();
		}
		fireChangeEvent();
	}

	public boolean isDomainCrosshairVisible() {
		return org.jfree.chart.plot.XYPlot.this.domainCrosshairVisible;
	}

	public void setDomainCrosshairVisible(boolean flag) {
		if ((org.jfree.chart.plot.XYPlot.this.domainCrosshairVisible) != flag) {
			org.jfree.chart.plot.XYPlot.this.domainCrosshairVisible = flag;
			fireChangeEvent();
		}
	}

	public boolean isDomainCrosshairLockedOnData() {
		return org.jfree.chart.plot.XYPlot.this.domainCrosshairLockedOnData;
	}

	public void setDomainCrosshairLockedOnData(boolean flag) {
		if ((org.jfree.chart.plot.XYPlot.this.domainCrosshairLockedOnData) != flag) {
			org.jfree.chart.plot.XYPlot.this.domainCrosshairLockedOnData = flag;
			fireChangeEvent();
		}
	}

	public double getDomainCrosshairValue() {
		return org.jfree.chart.plot.XYPlot.this.domainCrosshairValue;
	}

	public void setDomainCrosshairValue(double value) {
		setDomainCrosshairValue(value, true);
	}

	public void setDomainCrosshairValue(double value, boolean notify) {
		org.jfree.chart.plot.XYPlot.this.domainCrosshairValue = value;
		if ((isDomainCrosshairVisible()) && notify) {
			fireChangeEvent();
		}
	}

	public java.awt.Stroke getDomainCrosshairStroke() {
		return org.jfree.chart.plot.XYPlot.this.domainCrosshairStroke;
	}

	public void setDomainCrosshairStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.plot.XYPlot.this.domainCrosshairStroke = stroke;
		fireChangeEvent();
	}

	public java.awt.Paint getDomainCrosshairPaint() {
		return org.jfree.chart.plot.XYPlot.this.domainCrosshairPaint;
	}

	public void setDomainCrosshairPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.XYPlot.this.domainCrosshairPaint = paint;
		fireChangeEvent();
	}

	public boolean isRangeCrosshairVisible() {
		return org.jfree.chart.plot.XYPlot.this.rangeCrosshairVisible;
	}

	public void setRangeCrosshairVisible(boolean flag) {
		if ((org.jfree.chart.plot.XYPlot.this.rangeCrosshairVisible) != flag) {
			org.jfree.chart.plot.XYPlot.this.rangeCrosshairVisible = flag;
			fireChangeEvent();
		}
	}

	public boolean isRangeCrosshairLockedOnData() {
		return org.jfree.chart.plot.XYPlot.this.rangeCrosshairLockedOnData;
	}

	public void setRangeCrosshairLockedOnData(boolean flag) {
		if ((org.jfree.chart.plot.XYPlot.this.rangeCrosshairLockedOnData) != flag) {
			org.jfree.chart.plot.XYPlot.this.rangeCrosshairLockedOnData = flag;
			fireChangeEvent();
		}
	}

	public double getRangeCrosshairValue() {
		return org.jfree.chart.plot.XYPlot.this.rangeCrosshairValue;
	}

	public void setRangeCrosshairValue(double value) {
		setRangeCrosshairValue(value, true);
	}

	public void setRangeCrosshairValue(double value, boolean notify) {
		org.jfree.chart.plot.XYPlot.this.rangeCrosshairValue = value;
		if ((isRangeCrosshairVisible()) && notify) {
			fireChangeEvent();
		}
	}

	public java.awt.Stroke getRangeCrosshairStroke() {
		return org.jfree.chart.plot.XYPlot.this.rangeCrosshairStroke;
	}

	public void setRangeCrosshairStroke(java.awt.Stroke stroke) {
		if (stroke == null) {
			throw new java.lang.IllegalArgumentException("Null 'stroke' argument.");
		}
		org.jfree.chart.plot.XYPlot.this.rangeCrosshairStroke = stroke;
		fireChangeEvent();
	}

	public java.awt.Paint getRangeCrosshairPaint() {
		return org.jfree.chart.plot.XYPlot.this.rangeCrosshairPaint;
	}

	public void setRangeCrosshairPaint(java.awt.Paint paint) {
		if (paint == null) {
			throw new java.lang.IllegalArgumentException("Null 'paint' argument.");
		}
		org.jfree.chart.plot.XYPlot.this.rangeCrosshairPaint = paint;
		fireChangeEvent();
	}

	public org.jfree.chart.axis.AxisSpace getFixedDomainAxisSpace() {
		return org.jfree.chart.plot.XYPlot.this.fixedDomainAxisSpace;
	}

	public void setFixedDomainAxisSpace(org.jfree.chart.axis.AxisSpace space) {
		setFixedDomainAxisSpace(space, true);
	}

	public void setFixedDomainAxisSpace(org.jfree.chart.axis.AxisSpace space, boolean notify) {
		org.jfree.chart.plot.XYPlot.this.fixedDomainAxisSpace = space;
		if (notify) {
			fireChangeEvent();
		}
	}

	public org.jfree.chart.axis.AxisSpace getFixedRangeAxisSpace() {
		return org.jfree.chart.plot.XYPlot.this.fixedRangeAxisSpace;
	}

	public void setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace space) {
		setFixedRangeAxisSpace(space, true);
	}

	public void setFixedRangeAxisSpace(org.jfree.chart.axis.AxisSpace space, boolean notify) {
		org.jfree.chart.plot.XYPlot.this.fixedRangeAxisSpace = space;
		if (notify) {
			fireChangeEvent();
		}
	}

	public boolean isDomainPannable() {
		return org.jfree.chart.plot.XYPlot.this.domainPannable;
	}

	public void setDomainPannable(boolean pannable) {
		org.jfree.chart.plot.XYPlot.this.domainPannable = pannable;
	}

	public boolean isRangePannable() {
		return org.jfree.chart.plot.XYPlot.this.rangePannable;
	}

	public void setRangePannable(boolean pannable) {
		org.jfree.chart.plot.XYPlot.this.rangePannable = pannable;
	}

	public void panDomainAxes(double percent, org.jfree.chart.plot.PlotRenderingInfo info, java.awt.geom.Point2D source) {
		if (!(isDomainPannable())) {
			return ;
		}
		int domainAxisCount = getDomainAxisCount();
		for (int i = 0; i < domainAxisCount; i++) {
			org.jfree.chart.axis.ValueAxis axis = getDomainAxis(i);
			if (axis == null) {
				continue;
			}
			if (axis.isInverted()) {
				percent = -percent;
			}
			axis.pan(percent);
		}
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
			if (axis.isInverted()) {
				percent = -percent;
			}
			axis.pan(percent);
		}
	}

	public void zoomDomainAxes(double factor, org.jfree.chart.plot.PlotRenderingInfo info, java.awt.geom.Point2D source) {
		zoomDomainAxes(factor, info, source, false);
	}

	public void zoomDomainAxes(double factor, org.jfree.chart.plot.PlotRenderingInfo info, java.awt.geom.Point2D source, boolean useAnchor) {
		for (int i = 0; i < (org.jfree.chart.plot.XYPlot.this.domainAxes.size()); i++) {
			org.jfree.chart.axis.ValueAxis domainAxis = ((org.jfree.chart.axis.ValueAxis) (org.jfree.chart.plot.XYPlot.this.domainAxes.get(i)));
			if (domainAxis != null) {
				if (useAnchor) {
					double sourceX = source.getX();
					if ((org.jfree.chart.plot.XYPlot.this.orientation) == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
						sourceX = source.getY();
					}
					double anchorX = domainAxis.java2DToValue(sourceX, info.getDataArea(), getDomainAxisEdge());
					domainAxis.resizeRange2(factor, anchorX);
				}else {
					domainAxis.resizeRange(factor);
				}
			}
		}
	}

	public void zoomDomainAxes(double lowerPercent, double upperPercent, org.jfree.chart.plot.PlotRenderingInfo info, java.awt.geom.Point2D source) {
		for (int i = 0; i < (org.jfree.chart.plot.XYPlot.this.domainAxes.size()); i++) {
			org.jfree.chart.axis.ValueAxis domainAxis = ((org.jfree.chart.axis.ValueAxis) (org.jfree.chart.plot.XYPlot.this.domainAxes.get(i)));
			if (domainAxis != null) {
				domainAxis.zoomRange(lowerPercent, upperPercent);
			}
		}
	}

	public void zoomRangeAxes(double factor, org.jfree.chart.plot.PlotRenderingInfo info, java.awt.geom.Point2D source) {
		zoomRangeAxes(factor, info, source, false);
	}

	public void zoomRangeAxes(double factor, org.jfree.chart.plot.PlotRenderingInfo info, java.awt.geom.Point2D source, boolean useAnchor) {
		for (int i = 0; i < (org.jfree.chart.plot.XYPlot.this.rangeAxes.size()); i++) {
			org.jfree.chart.axis.ValueAxis rangeAxis = ((org.jfree.chart.axis.ValueAxis) (org.jfree.chart.plot.XYPlot.this.rangeAxes.get(i)));
			if (rangeAxis != null) {
				if (useAnchor) {
					double sourceY = source.getY();
					if ((org.jfree.chart.plot.XYPlot.this.orientation) == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
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

	public void zoomRangeAxes(double lowerPercent, double upperPercent, org.jfree.chart.plot.PlotRenderingInfo info, java.awt.geom.Point2D source) {
		for (int i = 0; i < (org.jfree.chart.plot.XYPlot.this.rangeAxes.size()); i++) {
			org.jfree.chart.axis.ValueAxis rangeAxis = ((org.jfree.chart.axis.ValueAxis) (org.jfree.chart.plot.XYPlot.this.rangeAxes.get(i)));
			if (rangeAxis != null) {
				rangeAxis.zoomRange(lowerPercent, upperPercent);
			}
		}
	}

	public boolean isDomainZoomable() {
		return true;
	}

	public boolean isRangeZoomable() {
		return true;
	}

	public int getSeriesCount() {
		int result = 0;
		org.jfree.data.xy.XYDataset dataset = getDataset();
		if (dataset != null) {
			result = dataset.getSeriesCount();
		}
		return result;
	}

	public org.jfree.chart.LegendItemCollection getFixedLegendItems() {
		return org.jfree.chart.plot.XYPlot.this.fixedLegendItems;
	}

	public void setFixedLegendItems(org.jfree.chart.LegendItemCollection items) {
		org.jfree.chart.plot.XYPlot.this.fixedLegendItems = items;
		fireChangeEvent();
	}

	public org.jfree.chart.LegendItemCollection getLegendItems() {
		if ((org.jfree.chart.plot.XYPlot.this.fixedLegendItems) != null) {
			return org.jfree.chart.plot.XYPlot.this.fixedLegendItems;
		}
		org.jfree.chart.LegendItemCollection result = new org.jfree.chart.LegendItemCollection();
		int count = org.jfree.chart.plot.XYPlot.this.datasets.size();
		for (int datasetIndex = 0; datasetIndex < count; datasetIndex++) {
			org.jfree.data.xy.XYDataset dataset = getDataset(datasetIndex);
			if (dataset != null) {
				org.jfree.chart.renderer.xy.XYItemRenderer renderer = getRenderer(datasetIndex);
				if (renderer == null) {
					renderer = getRenderer(0);
				}
				if (renderer != null) {
					int seriesCount = dataset.getSeriesCount();
					for (int i = 0; i < seriesCount; i++) {
						if ((renderer.isSeriesVisible(i)) && (renderer.isSeriesVisibleInLegend(i))) {
							org.jfree.chart.LegendItem item = renderer.getLegendItem(datasetIndex, i);
							if (item != null) {
								result.add(item);
							}
						}
					}
				}
			}
		}
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.XYPlot.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.XYPlot)) {
			return false;
		}
		org.jfree.chart.plot.XYPlot that = ((org.jfree.chart.plot.XYPlot) (obj));
		if ((org.jfree.chart.plot.XYPlot.this.weight) != (that.weight)) {
			return false;
		}
		if ((org.jfree.chart.plot.XYPlot.this.orientation) != (that.orientation)) {
			return false;
		}
		if (!(org.jfree.chart.plot.XYPlot.this.domainAxes.equals(that.domainAxes))) {
			return false;
		}
		if (!(org.jfree.chart.plot.XYPlot.this.domainAxisLocations.equals(that.domainAxisLocations))) {
			return false;
		}
		if ((org.jfree.chart.plot.XYPlot.this.rangeCrosshairLockedOnData) != (that.rangeCrosshairLockedOnData)) {
			return false;
		}
		if ((org.jfree.chart.plot.XYPlot.this.domainGridlinesVisible) != (that.domainGridlinesVisible)) {
			return false;
		}
		if ((org.jfree.chart.plot.XYPlot.this.rangeGridlinesVisible) != (that.rangeGridlinesVisible)) {
			return false;
		}
		if ((org.jfree.chart.plot.XYPlot.this.domainMinorGridlinesVisible) != (that.domainMinorGridlinesVisible)) {
			return false;
		}
		if ((org.jfree.chart.plot.XYPlot.this.rangeMinorGridlinesVisible) != (that.rangeMinorGridlinesVisible)) {
			return false;
		}
		if ((org.jfree.chart.plot.XYPlot.this.domainZeroBaselineVisible) != (that.domainZeroBaselineVisible)) {
			return false;
		}
		if ((org.jfree.chart.plot.XYPlot.this.rangeZeroBaselineVisible) != (that.rangeZeroBaselineVisible)) {
			return false;
		}
		if ((org.jfree.chart.plot.XYPlot.this.domainCrosshairVisible) != (that.domainCrosshairVisible)) {
			return false;
		}
		if ((org.jfree.chart.plot.XYPlot.this.domainCrosshairValue) != (that.domainCrosshairValue)) {
			return false;
		}
		if ((org.jfree.chart.plot.XYPlot.this.domainCrosshairLockedOnData) != (that.domainCrosshairLockedOnData)) {
			return false;
		}
		if ((org.jfree.chart.plot.XYPlot.this.rangeCrosshairVisible) != (that.rangeCrosshairVisible)) {
			return false;
		}
		if ((org.jfree.chart.plot.XYPlot.this.rangeCrosshairValue) != (that.rangeCrosshairValue)) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.XYPlot.this.axisOffset, that.axisOffset))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.XYPlot.this.renderers, that.renderers))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.XYPlot.this.rangeAxes, that.rangeAxes))) {
			return false;
		}
		if (!(org.jfree.chart.plot.XYPlot.this.rangeAxisLocations.equals(that.rangeAxisLocations))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.XYPlot.this.datasetToDomainAxesMap, that.datasetToDomainAxesMap))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.XYPlot.this.datasetToRangeAxesMap, that.datasetToRangeAxesMap))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.XYPlot.this.domainGridlineStroke, that.domainGridlineStroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.XYPlot.this.domainGridlinePaint, that.domainGridlinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.XYPlot.this.rangeGridlineStroke, that.rangeGridlineStroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.XYPlot.this.rangeGridlinePaint, that.rangeGridlinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.XYPlot.this.domainMinorGridlineStroke, that.domainMinorGridlineStroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.XYPlot.this.domainMinorGridlinePaint, that.domainMinorGridlinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.XYPlot.this.rangeMinorGridlineStroke, that.rangeMinorGridlineStroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.XYPlot.this.rangeMinorGridlinePaint, that.rangeMinorGridlinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.XYPlot.this.domainZeroBaselinePaint, that.domainZeroBaselinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.XYPlot.this.domainZeroBaselineStroke, that.domainZeroBaselineStroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.XYPlot.this.rangeZeroBaselinePaint, that.rangeZeroBaselinePaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.XYPlot.this.rangeZeroBaselineStroke, that.rangeZeroBaselineStroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.XYPlot.this.domainCrosshairStroke, that.domainCrosshairStroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.XYPlot.this.domainCrosshairPaint, that.domainCrosshairPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.XYPlot.this.rangeCrosshairStroke, that.rangeCrosshairStroke))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.XYPlot.this.rangeCrosshairPaint, that.rangeCrosshairPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.XYPlot.this.foregroundDomainMarkers, that.foregroundDomainMarkers))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.XYPlot.this.backgroundDomainMarkers, that.backgroundDomainMarkers))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.XYPlot.this.foregroundRangeMarkers, that.foregroundRangeMarkers))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.XYPlot.this.backgroundRangeMarkers, that.backgroundRangeMarkers))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.XYPlot.this.foregroundDomainMarkers, that.foregroundDomainMarkers))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.XYPlot.this.backgroundDomainMarkers, that.backgroundDomainMarkers))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.XYPlot.this.foregroundRangeMarkers, that.foregroundRangeMarkers))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.XYPlot.this.backgroundRangeMarkers, that.backgroundRangeMarkers))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.XYPlot.this.annotations, that.annotations))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.XYPlot.this.fixedLegendItems, that.fixedLegendItems))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.XYPlot.this.domainTickBandPaint, that.domainTickBandPaint))) {
			return false;
		}
		if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.XYPlot.this.rangeTickBandPaint, that.rangeTickBandPaint))) {
			return false;
		}
		if (!(org.jfree.chart.plot.XYPlot.this.quadrantOrigin.equals(that.quadrantOrigin))) {
			return false;
		}
		for (int i = 0; i < 4; i++) {
			if (!(org.jfree.chart.util.PaintUtilities.equal(org.jfree.chart.plot.XYPlot.this.quadrantPaint[i], that.quadrantPaint[i]))) {
				return false;
			}
		}
		return super.equals(obj);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.plot.XYPlot clone = ((org.jfree.chart.plot.XYPlot) (super.clone()));
		clone.domainAxes = ((org.jfree.chart.util.ObjectList) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.plot.XYPlot.this.domainAxes)));
		for (int i = 0; i < (org.jfree.chart.plot.XYPlot.this.domainAxes.size()); i++) {
			org.jfree.chart.axis.ValueAxis axis = ((org.jfree.chart.axis.ValueAxis) (org.jfree.chart.plot.XYPlot.this.domainAxes.get(i)));
			if (axis != null) {
				org.jfree.chart.axis.ValueAxis clonedAxis = ((org.jfree.chart.axis.ValueAxis) (axis.clone()));
				clone.domainAxes.set(i, clonedAxis);
				clonedAxis.setPlot(clone);
				clonedAxis.addChangeListener(clone);
			}
		}
		clone.domainAxisLocations = ((org.jfree.chart.util.ObjectList) (org.jfree.chart.plot.XYPlot.this.domainAxisLocations.clone()));
		clone.rangeAxes = ((org.jfree.chart.util.ObjectList) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.plot.XYPlot.this.rangeAxes)));
		for (int i = 0; i < (org.jfree.chart.plot.XYPlot.this.rangeAxes.size()); i++) {
			org.jfree.chart.axis.ValueAxis axis = ((org.jfree.chart.axis.ValueAxis) (org.jfree.chart.plot.XYPlot.this.rangeAxes.get(i)));
			if (axis != null) {
				org.jfree.chart.axis.ValueAxis clonedAxis = ((org.jfree.chart.axis.ValueAxis) (axis.clone()));
				clone.rangeAxes.set(i, clonedAxis);
				clonedAxis.setPlot(clone);
				clonedAxis.addChangeListener(clone);
			}
		}
		clone.rangeAxisLocations = ((org.jfree.chart.util.ObjectList) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.plot.XYPlot.this.rangeAxisLocations)));
		clone.datasets = ((org.jfree.chart.util.ObjectList) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.plot.XYPlot.this.datasets)));
		for (int i = 0; i < (clone.datasets.size()); ++i) {
			org.jfree.data.xy.XYDataset d = getDataset(i);
			if (d != null) {
				d.addChangeListener(clone);
			}
		}
		clone.datasetToDomainAxesMap = new java.util.TreeMap();
		clone.datasetToDomainAxesMap.putAll(org.jfree.chart.plot.XYPlot.this.datasetToDomainAxesMap);
		clone.datasetToRangeAxesMap = new java.util.TreeMap();
		clone.datasetToRangeAxesMap.putAll(org.jfree.chart.plot.XYPlot.this.datasetToRangeAxesMap);
		clone.renderers = ((org.jfree.chart.util.ObjectList) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.plot.XYPlot.this.renderers)));
		for (int i = 0; i < (org.jfree.chart.plot.XYPlot.this.renderers.size()); i++) {
			org.jfree.chart.renderer.xy.XYItemRenderer renderer2 = ((org.jfree.chart.renderer.xy.XYItemRenderer) (org.jfree.chart.plot.XYPlot.this.renderers.get(i)));
			if (renderer2 instanceof org.jfree.chart.util.PublicCloneable) {
				org.jfree.chart.util.PublicCloneable pc = ((org.jfree.chart.util.PublicCloneable) (renderer2));
				clone.renderers.set(i, pc.clone());
			}
		}
		clone.foregroundDomainMarkers = ((java.util.Map) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.plot.XYPlot.this.foregroundDomainMarkers)));
		clone.backgroundDomainMarkers = ((java.util.Map) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.plot.XYPlot.this.backgroundDomainMarkers)));
		clone.foregroundRangeMarkers = ((java.util.Map) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.plot.XYPlot.this.foregroundRangeMarkers)));
		clone.backgroundRangeMarkers = ((java.util.Map) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.plot.XYPlot.this.backgroundRangeMarkers)));
		clone.annotations = ((java.util.List) (org.jfree.chart.util.ObjectUtilities.deepClone(org.jfree.chart.plot.XYPlot.this.annotations)));
		if ((org.jfree.chart.plot.XYPlot.this.fixedDomainAxisSpace) != null) {
			clone.fixedDomainAxisSpace = ((org.jfree.chart.axis.AxisSpace) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.plot.XYPlot.this.fixedDomainAxisSpace)));
		}
		if ((org.jfree.chart.plot.XYPlot.this.fixedRangeAxisSpace) != null) {
			clone.fixedRangeAxisSpace = ((org.jfree.chart.axis.AxisSpace) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.plot.XYPlot.this.fixedRangeAxisSpace)));
		}
		if ((org.jfree.chart.plot.XYPlot.this.fixedLegendItems) != null) {
			clone.fixedLegendItems = ((org.jfree.chart.LegendItemCollection) (org.jfree.chart.plot.XYPlot.this.fixedLegendItems.clone()));
		}
		clone.quadrantOrigin = ((java.awt.geom.Point2D) (org.jfree.chart.util.ObjectUtilities.clone(org.jfree.chart.plot.XYPlot.this.quadrantOrigin)));
		clone.quadrantPaint = ((java.awt.Paint[]) (org.jfree.chart.plot.XYPlot.this.quadrantPaint.clone()));
		return clone;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.XYPlot.this.domainGridlineStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.XYPlot.this.domainGridlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.XYPlot.this.rangeGridlineStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.XYPlot.this.rangeGridlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.XYPlot.this.domainMinorGridlineStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.XYPlot.this.domainMinorGridlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.XYPlot.this.rangeMinorGridlineStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.XYPlot.this.rangeMinorGridlinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.XYPlot.this.rangeZeroBaselineStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.XYPlot.this.rangeZeroBaselinePaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.XYPlot.this.domainCrosshairStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.XYPlot.this.domainCrosshairPaint, stream);
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.XYPlot.this.rangeCrosshairStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.XYPlot.this.rangeCrosshairPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.XYPlot.this.domainTickBandPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.XYPlot.this.rangeTickBandPaint, stream);
		org.jfree.chart.util.SerialUtilities.writePoint2D(org.jfree.chart.plot.XYPlot.this.quadrantOrigin, stream);
		for (int i = 0; i < 4; i++) {
			org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.XYPlot.this.quadrantPaint[i], stream);
		}
		org.jfree.chart.util.SerialUtilities.writeStroke(org.jfree.chart.plot.XYPlot.this.domainZeroBaselineStroke, stream);
		org.jfree.chart.util.SerialUtilities.writePaint(org.jfree.chart.plot.XYPlot.this.domainZeroBaselinePaint, stream);
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.plot.XYPlot.this.domainGridlineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.XYPlot.this.domainGridlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.XYPlot.this.rangeGridlineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.XYPlot.this.rangeGridlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.XYPlot.this.domainMinorGridlineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.XYPlot.this.domainMinorGridlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.XYPlot.this.rangeMinorGridlineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.XYPlot.this.rangeMinorGridlinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.XYPlot.this.rangeZeroBaselineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.XYPlot.this.rangeZeroBaselinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.XYPlot.this.domainCrosshairStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.XYPlot.this.domainCrosshairPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.XYPlot.this.rangeCrosshairStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.XYPlot.this.rangeCrosshairPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.XYPlot.this.domainTickBandPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.XYPlot.this.rangeTickBandPaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		org.jfree.chart.plot.XYPlot.this.quadrantOrigin = org.jfree.chart.util.SerialUtilities.readPoint2D(stream);
		org.jfree.chart.plot.XYPlot.this.quadrantPaint = new java.awt.Paint[4];
		for (int i = 0; i < 4; i++) {
			org.jfree.chart.plot.XYPlot.this.quadrantPaint[i] = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		}
		org.jfree.chart.plot.XYPlot.this.domainZeroBaselineStroke = org.jfree.chart.util.SerialUtilities.readStroke(stream);
		org.jfree.chart.plot.XYPlot.this.domainZeroBaselinePaint = org.jfree.chart.util.SerialUtilities.readPaint(stream);
		int domainAxisCount = org.jfree.chart.plot.XYPlot.this.domainAxes.size();
		for (int i = 0; i < domainAxisCount; i++) {
			org.jfree.chart.axis.Axis axis = ((org.jfree.chart.axis.Axis) (org.jfree.chart.plot.XYPlot.this.domainAxes.get(i)));
			if (axis != null) {
				axis.setPlot(org.jfree.chart.plot.XYPlot.this);
				axis.addChangeListener(org.jfree.chart.plot.XYPlot.this);
			}
		}
		int rangeAxisCount = org.jfree.chart.plot.XYPlot.this.rangeAxes.size();
		for (int i = 0; i < rangeAxisCount; i++) {
			org.jfree.chart.axis.Axis axis = ((org.jfree.chart.axis.Axis) (org.jfree.chart.plot.XYPlot.this.rangeAxes.get(i)));
			if (axis != null) {
				axis.setPlot(org.jfree.chart.plot.XYPlot.this);
				axis.addChangeListener(org.jfree.chart.plot.XYPlot.this);
			}
		}
		int datasetCount = org.jfree.chart.plot.XYPlot.this.datasets.size();
		for (int i = 0; i < datasetCount; i++) {
			org.jfree.data.general.Dataset dataset = ((org.jfree.data.general.Dataset) (org.jfree.chart.plot.XYPlot.this.datasets.get(i)));
			if (dataset != null) {
				dataset.addChangeListener(org.jfree.chart.plot.XYPlot.this);
			}
		}
		int rendererCount = org.jfree.chart.plot.XYPlot.this.renderers.size();
		for (int i = 0; i < rendererCount; i++) {
			org.jfree.chart.renderer.xy.XYItemRenderer renderer = ((org.jfree.chart.renderer.xy.XYItemRenderer) (org.jfree.chart.plot.XYPlot.this.renderers.get(i)));
			if (renderer != null) {
				renderer.addChangeListener(org.jfree.chart.plot.XYPlot.this);
			}
		}
	}

	public boolean canSelectByPoint() {
		return false;
	}

	public boolean canSelectByRegion() {
		return true;
	}

	public void select(double x, double y, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.RenderingSource source) {
	}

	public void select(java.awt.geom.GeneralPath region, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.RenderingSource source) {
		int datasetCount = org.jfree.chart.plot.XYPlot.this.datasets.size();
		for (int d = 0; d < datasetCount; d++) {
			org.jfree.data.xy.XYDataset dataset = ((org.jfree.data.xy.XYDataset) (org.jfree.chart.plot.XYPlot.this.datasets.get(d)));
			if (dataset == null) {
				continue;
			}
			org.jfree.data.xy.XYDatasetSelectionState state = findSelectionStateForDataset(dataset, source);
			if (state == null) {
				continue;
			}
			java.awt.geom.GeneralPath path = convertToDataSpace(region, dataArea, dataset);
			int seriesCount = dataset.getSeriesCount();
			for (int s = 0; s < seriesCount; s++) {
				int itemCount = dataset.getItemCount(s);
				for (int i = 0; i < itemCount; i++) {
					double x = dataset.getXValue(s, i);
					double y = dataset.getYValue(s, i);
					if (path.contains(x, y)) {
						state.setSelected(s, i, true);
					}
				}
			}
		}
	}

	private org.jfree.data.xy.XYDatasetSelectionState findSelectionStateForDataset(org.jfree.data.xy.XYDataset dataset, java.lang.Object source) {
		if (dataset instanceof org.jfree.data.xy.SelectableXYDataset) {
			org.jfree.data.xy.SelectableXYDataset sd = ((org.jfree.data.xy.SelectableXYDataset) (dataset));
			org.jfree.data.xy.XYDatasetSelectionState s = sd.getSelectionState();
			return s;
		}
		throw new java.lang.RuntimeException();
	}

	private java.awt.geom.GeneralPath convertToDataSpace(java.awt.geom.GeneralPath path, java.awt.geom.Rectangle2D dataArea, org.jfree.data.xy.XYDataset dataset) {
		java.awt.geom.GeneralPath result = new java.awt.geom.GeneralPath(path.getWindingRule());
		int datasetIndex = indexOf(dataset);
		org.jfree.chart.axis.ValueAxis xAxis = getDomainAxisForDataset(datasetIndex);
		org.jfree.chart.axis.ValueAxis yAxis = getRangeAxisForDataset(datasetIndex);
		org.jfree.chart.util.RectangleEdge xAxisEdge = getDomainAxisEdge();
		org.jfree.chart.util.RectangleEdge yAxisEdge = getRangeAxisEdge();
		double[] coords = new double[6];
		java.awt.geom.PathIterator iterator = path.getPathIterator(null);
		while (!(iterator.isDone())) {
			int segType = iterator.currentSegment(coords);
			double xx = xAxis.java2DToValue(coords[0], dataArea, xAxisEdge);
			double yy = yAxis.java2DToValue(coords[1], dataArea, yAxisEdge);
			if (segType == (java.awt.geom.PathIterator.SEG_MOVETO)) {
				result.moveTo(((float) (xx)), ((float) (yy)));
			}else
				if (segType == (java.awt.geom.PathIterator.SEG_LINETO)) {
					result.lineTo(((float) (xx)), ((float) (yy)));
				}else
					if (segType == (java.awt.geom.PathIterator.SEG_CLOSE)) {
						result.closePath();
					}
				
			
			iterator.next();
		} 
		return result;
	}

	public void clearSelection() {
		int datasetCount = org.jfree.chart.plot.XYPlot.this.datasets.size();
		for (int d = 0; d < datasetCount; d++) {
			org.jfree.data.xy.XYDataset dataset = ((org.jfree.data.xy.XYDataset) (org.jfree.chart.plot.XYPlot.this.datasets.get(d)));
			if (dataset instanceof org.jfree.data.xy.AbstractXYDataset) {
				org.jfree.data.xy.AbstractXYDataset axyd = ((org.jfree.data.xy.AbstractXYDataset) (dataset));
				if ((axyd.getSelectionState()) != null) {
					org.jfree.data.xy.XYDatasetSelectionState selState = axyd.getSelectionState();
					selState.clearSelection();
				}
			}
		}
	}
}

