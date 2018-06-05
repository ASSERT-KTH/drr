

package org.jfree.chart.plot;


public class WaferMapPlot extends org.jfree.chart.plot.Plot implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.event.RendererChangeListener {
	private static final long serialVersionUID = 4668320403707308155L;

	public static final java.awt.Stroke DEFAULT_GRIDLINE_STROKE = new java.awt.BasicStroke(0.5F, java.awt.BasicStroke.CAP_BUTT, java.awt.BasicStroke.JOIN_BEVEL, 0.0F, new float[]{ 2.0F , 2.0F }, 0.0F);

	public static final java.awt.Paint DEFAULT_GRIDLINE_PAINT = java.awt.Color.lightGray;

	public static final boolean DEFAULT_CROSSHAIR_VISIBLE = false;

	public static final java.awt.Stroke DEFAULT_CROSSHAIR_STROKE = org.jfree.chart.plot.WaferMapPlot.DEFAULT_GRIDLINE_STROKE;

	public static final java.awt.Paint DEFAULT_CROSSHAIR_PAINT = java.awt.Color.blue;

	protected static java.util.ResourceBundle localizationResources = org.jfree.chart.util.ResourceBundleWrapper.getBundle("org.jfree.chart.plot.LocalizationBundle");

	private org.jfree.chart.plot.PlotOrientation orientation;

	private org.jfree.data.general.WaferMapDataset dataset;

	private org.jfree.chart.renderer.WaferMapRenderer renderer;

	public WaferMapPlot() {
		this(null);
	}

	public WaferMapPlot(org.jfree.data.general.WaferMapDataset dataset) {
		this(dataset, null);
	}

	public WaferMapPlot(org.jfree.data.general.WaferMapDataset dataset, org.jfree.chart.renderer.WaferMapRenderer renderer) {
		super();
		org.jfree.chart.plot.WaferMapPlot.this.orientation = org.jfree.chart.plot.PlotOrientation.VERTICAL;
		org.jfree.chart.plot.WaferMapPlot.this.dataset = dataset;
		if (dataset != null) {
			dataset.addChangeListener(org.jfree.chart.plot.WaferMapPlot.this);
		}
		org.jfree.chart.plot.WaferMapPlot.this.renderer = renderer;
		if (renderer != null) {
			renderer.setPlot(org.jfree.chart.plot.WaferMapPlot.this);
			renderer.addChangeListener(org.jfree.chart.plot.WaferMapPlot.this);
		}
	}

	public java.lang.String getPlotType() {
		return "WMAP_Plot";
	}

	public org.jfree.data.general.WaferMapDataset getDataset() {
		return org.jfree.chart.plot.WaferMapPlot.this.dataset;
	}

	public void setDataset(org.jfree.data.general.WaferMapDataset dataset) {
		if ((org.jfree.chart.plot.WaferMapPlot.this.dataset) != null) {
			org.jfree.chart.plot.WaferMapPlot.this.dataset.removeChangeListener(org.jfree.chart.plot.WaferMapPlot.this);
		}
		org.jfree.chart.plot.WaferMapPlot.this.dataset = dataset;
		if (dataset != null) {
			setDatasetGroup(dataset.getGroup());
			dataset.addChangeListener(org.jfree.chart.plot.WaferMapPlot.this);
		}
		datasetChanged(new org.jfree.data.event.DatasetChangeEvent(org.jfree.chart.plot.WaferMapPlot.this, dataset, new org.jfree.chart.event.DatasetChangeInfo()));
	}

	public void setRenderer(org.jfree.chart.renderer.WaferMapRenderer renderer) {
		if ((org.jfree.chart.plot.WaferMapPlot.this.renderer) != null) {
			org.jfree.chart.plot.WaferMapPlot.this.renderer.removeChangeListener(org.jfree.chart.plot.WaferMapPlot.this);
		}
		org.jfree.chart.plot.WaferMapPlot.this.renderer = renderer;
		if (renderer != null) {
			renderer.setPlot(org.jfree.chart.plot.WaferMapPlot.this);
		}
		fireChangeEvent();
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.awt.geom.Point2D anchor, org.jfree.chart.plot.PlotState state, org.jfree.chart.plot.PlotRenderingInfo info) {
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
		drawChipGrid(g2, area);
		drawWaferEdge(g2, area);
	}

	protected void drawChipGrid(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea) {
		java.awt.Shape savedClip = g2.getClip();
		g2.setClip(getWaferEdge(plotArea));
		java.awt.geom.Rectangle2D chip = new java.awt.geom.Rectangle2D.Double();
		int xchips = 35;
		int ychips = 20;
		double space = 1.0;
		if ((org.jfree.chart.plot.WaferMapPlot.this.dataset) != null) {
			xchips = (org.jfree.chart.plot.WaferMapPlot.this.dataset.getMaxChipX()) + 2;
			ychips = (org.jfree.chart.plot.WaferMapPlot.this.dataset.getMaxChipY()) + 2;
			space = org.jfree.chart.plot.WaferMapPlot.this.dataset.getChipSpace();
		}
		double startX = plotArea.getX();
		double startY = plotArea.getY();
		double chipWidth = 1.0;
		double chipHeight = 1.0;
		if ((plotArea.getWidth()) != (plotArea.getHeight())) {
			double major = 0.0;
			double minor = 0.0;
			if ((plotArea.getWidth()) > (plotArea.getHeight())) {
				major = plotArea.getWidth();
				minor = plotArea.getHeight();
			}else {
				major = plotArea.getHeight();
				minor = plotArea.getWidth();
			}
			if ((plotArea.getWidth()) == minor) {
				startY += (major - minor) / 2;
				chipWidth = ((plotArea.getWidth()) - ((space * xchips) - 1)) / xchips;
				chipHeight = ((plotArea.getWidth()) - ((space * ychips) - 1)) / ychips;
			}else {
				startX += (major - minor) / 2;
				chipWidth = ((plotArea.getHeight()) - ((space * xchips) - 1)) / xchips;
				chipHeight = ((plotArea.getHeight()) - ((space * ychips) - 1)) / ychips;
			}
		}
		for (int x = 1; x <= xchips; x++) {
			double upperLeftX = ((startX - chipWidth) + (chipWidth * x)) + (space * (x - 1));
			for (int y = 1; y <= ychips; y++) {
				double upperLeftY = ((startY - chipHeight) + (chipHeight * y)) + (space * (y - 1));
				chip.setFrame(upperLeftX, upperLeftY, chipWidth, chipHeight);
				g2.setColor(java.awt.Color.white);
				if ((org.jfree.chart.plot.WaferMapPlot.this.dataset.getChipValue((x - 1), ((ychips - y) - 1))) != null) {
					g2.setPaint(org.jfree.chart.plot.WaferMapPlot.this.renderer.getChipColor(org.jfree.chart.plot.WaferMapPlot.this.dataset.getChipValue((x - 1), ((ychips - y) - 1))));
				}
				g2.fill(chip);
				g2.setColor(java.awt.Color.lightGray);
				g2.draw(chip);
			}
		}
		g2.setClip(savedClip);
	}

	protected java.awt.geom.Ellipse2D getWaferEdge(java.awt.geom.Rectangle2D plotArea) {
		java.awt.geom.Ellipse2D edge = new java.awt.geom.Ellipse2D.Double();
		double diameter = plotArea.getWidth();
		double upperLeftX = plotArea.getX();
		double upperLeftY = plotArea.getY();
		if ((plotArea.getWidth()) != (plotArea.getHeight())) {
			double major = 0.0;
			double minor = 0.0;
			if ((plotArea.getWidth()) > (plotArea.getHeight())) {
				major = plotArea.getWidth();
				minor = plotArea.getHeight();
			}else {
				major = plotArea.getHeight();
				minor = plotArea.getWidth();
			}
			diameter = minor;
			if ((plotArea.getWidth()) == minor) {
				upperLeftY = (plotArea.getY()) + ((major - minor) / 2);
			}else {
				upperLeftX = (plotArea.getX()) + ((major - minor) / 2);
			}
		}
		edge.setFrame(upperLeftX, upperLeftY, diameter, diameter);
		return edge;
	}

	protected void drawWaferEdge(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D plotArea) {
		java.awt.geom.Ellipse2D waferEdge = getWaferEdge(plotArea);
		g2.setColor(java.awt.Color.black);
		g2.draw(waferEdge);
		java.awt.geom.Arc2D notch = null;
		java.awt.geom.Rectangle2D waferFrame = waferEdge.getFrame();
		double notchDiameter = (waferFrame.getWidth()) * 0.04;
		if ((org.jfree.chart.plot.WaferMapPlot.this.orientation) == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			java.awt.geom.Rectangle2D notchFrame = new java.awt.geom.Rectangle2D.Double((((waferFrame.getX()) + (waferFrame.getWidth())) - (notchDiameter / 2)), (((waferFrame.getY()) + ((waferFrame.getHeight()) / 2)) - (notchDiameter / 2)), notchDiameter, notchDiameter);
			notch = new java.awt.geom.Arc2D.Double(notchFrame, 90.0, 180.0, java.awt.geom.Arc2D.OPEN);
		}else {
			java.awt.geom.Rectangle2D notchFrame = new java.awt.geom.Rectangle2D.Double((((waferFrame.getX()) + ((waferFrame.getWidth()) / 2)) - (notchDiameter / 2)), (((waferFrame.getY()) + (waferFrame.getHeight())) - (notchDiameter / 2)), notchDiameter, notchDiameter);
			notch = new java.awt.geom.Arc2D.Double(notchFrame, 0.0, 180.0, java.awt.geom.Arc2D.OPEN);
		}
		g2.setColor(java.awt.Color.white);
		g2.fill(notch);
		g2.setColor(java.awt.Color.black);
		g2.draw(notch);
	}

	public org.jfree.chart.LegendItemCollection getLegendItems() {
		return org.jfree.chart.plot.WaferMapPlot.this.renderer.getLegendCollection();
	}

	public void rendererChanged(org.jfree.chart.event.RendererChangeEvent event) {
		fireChangeEvent();
	}
}

