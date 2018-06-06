

package org.jfree.chart;


public class ChartPanel extends javax.swing.JPanel implements java.awt.event.ActionListener , java.awt.event.MouseListener , java.awt.event.MouseMotionListener , java.awt.print.Printable , java.io.Serializable , org.jfree.chart.event.ChartChangeListener , org.jfree.chart.event.ChartProgressListener {
	private static final long serialVersionUID = 6046366297214274674L;

	public static final boolean DEFAULT_BUFFER_USED = false;

	public static final int DEFAULT_WIDTH = 680;

	public static final int DEFAULT_HEIGHT = 420;

	public static final int DEFAULT_MINIMUM_DRAW_WIDTH = 300;

	public static final int DEFAULT_MINIMUM_DRAW_HEIGHT = 200;

	public static final int DEFAULT_MAXIMUM_DRAW_WIDTH = 800;

	public static final int DEFAULT_MAXIMUM_DRAW_HEIGHT = 600;

	public static final int DEFAULT_ZOOM_TRIGGER_DISTANCE = 10;

	public static final java.lang.String PROPERTIES_COMMAND = "PROPERTIES";

	public static final java.lang.String SAVE_COMMAND = "SAVE";

	public static final java.lang.String PRINT_COMMAND = "PRINT";

	public static final java.lang.String ZOOM_IN_BOTH_COMMAND = "ZOOM_IN_BOTH";

	public static final java.lang.String ZOOM_IN_DOMAIN_COMMAND = "ZOOM_IN_DOMAIN";

	public static final java.lang.String ZOOM_IN_RANGE_COMMAND = "ZOOM_IN_RANGE";

	public static final java.lang.String ZOOM_OUT_BOTH_COMMAND = "ZOOM_OUT_BOTH";

	public static final java.lang.String ZOOM_OUT_DOMAIN_COMMAND = "ZOOM_DOMAIN_BOTH";

	public static final java.lang.String ZOOM_OUT_RANGE_COMMAND = "ZOOM_RANGE_BOTH";

	public static final java.lang.String ZOOM_RESET_BOTH_COMMAND = "ZOOM_RESET_BOTH";

	public static final java.lang.String ZOOM_RESET_DOMAIN_COMMAND = "ZOOM_RESET_DOMAIN";

	public static final java.lang.String ZOOM_RESET_RANGE_COMMAND = "ZOOM_RESET_RANGE";

	private org.jfree.chart.JFreeChart chart;

	private javax.swing.event.EventListenerList chartMouseListeners;

	private boolean useBuffer;

	private boolean refreshBuffer;

	private java.awt.Image chartBuffer;

	private int chartBufferHeight;

	private int chartBufferWidth;

	private int minimumDrawWidth;

	private int minimumDrawHeight;

	private int maximumDrawWidth;

	private int maximumDrawHeight;

	private javax.swing.JPopupMenu popup;

	private org.jfree.chart.ChartRenderingInfo info;

	private java.awt.geom.Point2D anchor;

	private double scaleX;

	private double scaleY;

	private org.jfree.chart.plot.PlotOrientation orientation = org.jfree.chart.plot.PlotOrientation.VERTICAL;

	private boolean domainZoomable = false;

	private boolean rangeZoomable = false;

	private java.awt.Point zoomPoint = null;

	private transient java.awt.geom.Rectangle2D zoomRectangle = null;

	private boolean fillZoomRectangle = false;

	private int zoomTriggerDistance;

	private boolean horizontalAxisTrace = false;

	private boolean verticalAxisTrace = false;

	private transient java.awt.geom.Line2D verticalTraceLine;

	private transient java.awt.geom.Line2D horizontalTraceLine;

	private javax.swing.JMenuItem zoomInBothMenuItem;

	private javax.swing.JMenuItem zoomInDomainMenuItem;

	private javax.swing.JMenuItem zoomInRangeMenuItem;

	private javax.swing.JMenuItem zoomOutBothMenuItem;

	private javax.swing.JMenuItem zoomOutDomainMenuItem;

	private javax.swing.JMenuItem zoomOutRangeMenuItem;

	private javax.swing.JMenuItem zoomResetBothMenuItem;

	private javax.swing.JMenuItem zoomResetDomainMenuItem;

	private javax.swing.JMenuItem zoomResetRangeMenuItem;

	private boolean enforceFileExtensions;

	private boolean ownToolTipDelaysActive;

	private int originalToolTipInitialDelay;

	private int originalToolTipReshowDelay;

	private int originalToolTipDismissDelay;

	private int ownToolTipInitialDelay;

	private int ownToolTipReshowDelay;

	private int ownToolTipDismissDelay;

	private double zoomInFactor = 0.5;

	private double zoomOutFactor = 2.0;

	private boolean zoomAroundAnchor;

	protected static java.util.ResourceBundle localizationResources = java.util.ResourceBundle.getBundle("org.jfree.chart.LocalizationBundle");

	public ChartPanel(org.jfree.chart.JFreeChart chart) {
		this(chart, org.jfree.chart.ChartPanel.DEFAULT_WIDTH, org.jfree.chart.ChartPanel.DEFAULT_HEIGHT, org.jfree.chart.ChartPanel.DEFAULT_MINIMUM_DRAW_WIDTH, org.jfree.chart.ChartPanel.DEFAULT_MINIMUM_DRAW_HEIGHT, org.jfree.chart.ChartPanel.DEFAULT_MAXIMUM_DRAW_WIDTH, org.jfree.chart.ChartPanel.DEFAULT_MAXIMUM_DRAW_HEIGHT, org.jfree.chart.ChartPanel.DEFAULT_BUFFER_USED, true, true, true, true, true);
	}

	public ChartPanel(org.jfree.chart.JFreeChart chart, boolean useBuffer) {
		this(chart, org.jfree.chart.ChartPanel.DEFAULT_WIDTH, org.jfree.chart.ChartPanel.DEFAULT_HEIGHT, org.jfree.chart.ChartPanel.DEFAULT_MINIMUM_DRAW_WIDTH, org.jfree.chart.ChartPanel.DEFAULT_MINIMUM_DRAW_HEIGHT, org.jfree.chart.ChartPanel.DEFAULT_MAXIMUM_DRAW_WIDTH, org.jfree.chart.ChartPanel.DEFAULT_MAXIMUM_DRAW_HEIGHT, useBuffer, true, true, true, true, true);
	}

	public ChartPanel(org.jfree.chart.JFreeChart chart, boolean properties, boolean save, boolean print, boolean zoom, boolean tooltips) {
		this(chart, org.jfree.chart.ChartPanel.DEFAULT_WIDTH, org.jfree.chart.ChartPanel.DEFAULT_HEIGHT, org.jfree.chart.ChartPanel.DEFAULT_MINIMUM_DRAW_WIDTH, org.jfree.chart.ChartPanel.DEFAULT_MINIMUM_DRAW_HEIGHT, org.jfree.chart.ChartPanel.DEFAULT_MAXIMUM_DRAW_WIDTH, org.jfree.chart.ChartPanel.DEFAULT_MAXIMUM_DRAW_HEIGHT, org.jfree.chart.ChartPanel.DEFAULT_BUFFER_USED, properties, save, print, zoom, tooltips);
	}

	public ChartPanel(org.jfree.chart.JFreeChart chart, int width, int height, int minimumDrawWidth, int minimumDrawHeight, int maximumDrawWidth, int maximumDrawHeight, boolean useBuffer, boolean properties, boolean save, boolean print, boolean zoom, boolean tooltips) {
		org.jfree.chart.ChartPanel.this.setChart(chart);
		org.jfree.chart.ChartPanel.this.chartMouseListeners = new javax.swing.event.EventListenerList();
		org.jfree.chart.ChartPanel.this.info = new org.jfree.chart.ChartRenderingInfo();
		setPreferredSize(new java.awt.Dimension(width, height));
		org.jfree.chart.ChartPanel.this.useBuffer = useBuffer;
		org.jfree.chart.ChartPanel.this.refreshBuffer = false;
		org.jfree.chart.ChartPanel.this.minimumDrawWidth = minimumDrawWidth;
		org.jfree.chart.ChartPanel.this.minimumDrawHeight = minimumDrawHeight;
		org.jfree.chart.ChartPanel.this.maximumDrawWidth = maximumDrawWidth;
		org.jfree.chart.ChartPanel.this.maximumDrawHeight = maximumDrawHeight;
		org.jfree.chart.ChartPanel.this.zoomTriggerDistance = org.jfree.chart.ChartPanel.DEFAULT_ZOOM_TRIGGER_DISTANCE;
		org.jfree.chart.ChartPanel.this.popup = null;
		if (((properties || save) || print) || zoom) {
			org.jfree.chart.ChartPanel.this.popup = createPopupMenu(properties, save, print, zoom);
		}
		enableEvents(java.awt.AWTEvent.MOUSE_EVENT_MASK);
		enableEvents(java.awt.AWTEvent.MOUSE_MOTION_EVENT_MASK);
		setDisplayToolTips(tooltips);
		addMouseListener(org.jfree.chart.ChartPanel.this);
		addMouseMotionListener(org.jfree.chart.ChartPanel.this);
		org.jfree.chart.ChartPanel.this.enforceFileExtensions = true;
		javax.swing.ToolTipManager ttm = javax.swing.ToolTipManager.sharedInstance();
		org.jfree.chart.ChartPanel.this.ownToolTipInitialDelay = ttm.getInitialDelay();
		org.jfree.chart.ChartPanel.this.ownToolTipDismissDelay = ttm.getDismissDelay();
		org.jfree.chart.ChartPanel.this.ownToolTipReshowDelay = ttm.getReshowDelay();
		org.jfree.chart.ChartPanel.this.zoomAroundAnchor = false;
	}

	public org.jfree.chart.JFreeChart getChart() {
		return org.jfree.chart.ChartPanel.this.chart;
	}

	public void setChart(org.jfree.chart.JFreeChart chart) {
		if ((org.jfree.chart.ChartPanel.this.chart) != null) {
			org.jfree.chart.ChartPanel.this.chart.removeChangeListener(org.jfree.chart.ChartPanel.this);
			org.jfree.chart.ChartPanel.this.chart.removeProgressListener(org.jfree.chart.ChartPanel.this);
		}
		org.jfree.chart.ChartPanel.this.chart = chart;
		if (chart != null) {
			org.jfree.chart.ChartPanel.this.chart.addChangeListener(org.jfree.chart.ChartPanel.this);
			org.jfree.chart.ChartPanel.this.chart.addProgressListener(org.jfree.chart.ChartPanel.this);
			org.jfree.chart.plot.Plot plot = chart.getPlot();
			org.jfree.chart.ChartPanel.this.domainZoomable = false;
			org.jfree.chart.ChartPanel.this.rangeZoomable = false;
			if (plot instanceof org.jfree.chart.plot.Zoomable) {
				org.jfree.chart.plot.Zoomable z = ((org.jfree.chart.plot.Zoomable) (plot));
				org.jfree.chart.ChartPanel.this.domainZoomable = z.isDomainZoomable();
				org.jfree.chart.ChartPanel.this.rangeZoomable = z.isRangeZoomable();
				org.jfree.chart.ChartPanel.this.orientation = z.getOrientation();
			}
		}else {
			org.jfree.chart.ChartPanel.this.domainZoomable = false;
			org.jfree.chart.ChartPanel.this.rangeZoomable = false;
		}
		if (org.jfree.chart.ChartPanel.this.useBuffer) {
			org.jfree.chart.ChartPanel.this.refreshBuffer = true;
		}
		repaint();
	}

	public int getMinimumDrawWidth() {
		return org.jfree.chart.ChartPanel.this.minimumDrawWidth;
	}

	public void setMinimumDrawWidth(int width) {
		org.jfree.chart.ChartPanel.this.minimumDrawWidth = width;
	}

	public int getMaximumDrawWidth() {
		return org.jfree.chart.ChartPanel.this.maximumDrawWidth;
	}

	public void setMaximumDrawWidth(int width) {
		org.jfree.chart.ChartPanel.this.maximumDrawWidth = width;
	}

	public int getMinimumDrawHeight() {
		return org.jfree.chart.ChartPanel.this.minimumDrawHeight;
	}

	public void setMinimumDrawHeight(int height) {
		org.jfree.chart.ChartPanel.this.minimumDrawHeight = height;
	}

	public int getMaximumDrawHeight() {
		return org.jfree.chart.ChartPanel.this.maximumDrawHeight;
	}

	public void setMaximumDrawHeight(int height) {
		org.jfree.chart.ChartPanel.this.maximumDrawHeight = height;
	}

	public double getScaleX() {
		return org.jfree.chart.ChartPanel.this.scaleX;
	}

	public double getScaleY() {
		return org.jfree.chart.ChartPanel.this.scaleY;
	}

	public java.awt.geom.Point2D getAnchor() {
		return org.jfree.chart.ChartPanel.this.anchor;
	}

	protected void setAnchor(java.awt.geom.Point2D anchor) {
		org.jfree.chart.ChartPanel.this.anchor = anchor;
	}

	public javax.swing.JPopupMenu getPopupMenu() {
		return org.jfree.chart.ChartPanel.this.popup;
	}

	public void setPopupMenu(javax.swing.JPopupMenu popup) {
		org.jfree.chart.ChartPanel.this.popup = popup;
	}

	public org.jfree.chart.ChartRenderingInfo getChartRenderingInfo() {
		return org.jfree.chart.ChartPanel.this.info;
	}

	public void setMouseZoomable(boolean flag) {
		setMouseZoomable(flag, true);
	}

	public void setMouseZoomable(boolean flag, boolean fillRectangle) {
		setDomainZoomable(flag);
		setRangeZoomable(flag);
		setFillZoomRectangle(fillRectangle);
	}

	public boolean isDomainZoomable() {
		return org.jfree.chart.ChartPanel.this.domainZoomable;
	}

	public void setDomainZoomable(boolean flag) {
		if (flag) {
			org.jfree.chart.plot.Plot plot = org.jfree.chart.ChartPanel.this.chart.getPlot();
			if (plot instanceof org.jfree.chart.plot.Zoomable) {
				org.jfree.chart.plot.Zoomable z = ((org.jfree.chart.plot.Zoomable) (plot));
				org.jfree.chart.ChartPanel.this.domainZoomable = flag && (z.isDomainZoomable());
			}
		}else {
			org.jfree.chart.ChartPanel.this.domainZoomable = false;
		}
	}

	public boolean isRangeZoomable() {
		return org.jfree.chart.ChartPanel.this.rangeZoomable;
	}

	public void setRangeZoomable(boolean flag) {
		if (flag) {
			org.jfree.chart.plot.Plot plot = org.jfree.chart.ChartPanel.this.chart.getPlot();
			if (plot instanceof org.jfree.chart.plot.Zoomable) {
				org.jfree.chart.plot.Zoomable z = ((org.jfree.chart.plot.Zoomable) (plot));
				org.jfree.chart.ChartPanel.this.rangeZoomable = flag && (z.isRangeZoomable());
			}
		}else {
			org.jfree.chart.ChartPanel.this.rangeZoomable = false;
		}
	}

	public boolean getFillZoomRectangle() {
		return org.jfree.chart.ChartPanel.this.fillZoomRectangle;
	}

	public void setFillZoomRectangle(boolean flag) {
		org.jfree.chart.ChartPanel.this.fillZoomRectangle = flag;
	}

	public int getZoomTriggerDistance() {
		return org.jfree.chart.ChartPanel.this.zoomTriggerDistance;
	}

	public void setZoomTriggerDistance(int distance) {
		org.jfree.chart.ChartPanel.this.zoomTriggerDistance = distance;
	}

	public boolean getHorizontalAxisTrace() {
		return org.jfree.chart.ChartPanel.this.horizontalAxisTrace;
	}

	public void setHorizontalAxisTrace(boolean flag) {
		org.jfree.chart.ChartPanel.this.horizontalAxisTrace = flag;
	}

	protected java.awt.geom.Line2D getHorizontalTraceLine() {
		return org.jfree.chart.ChartPanel.this.horizontalTraceLine;
	}

	protected void setHorizontalTraceLine(java.awt.geom.Line2D line) {
		org.jfree.chart.ChartPanel.this.horizontalTraceLine = line;
	}

	public boolean getVerticalAxisTrace() {
		return org.jfree.chart.ChartPanel.this.verticalAxisTrace;
	}

	public void setVerticalAxisTrace(boolean flag) {
		org.jfree.chart.ChartPanel.this.verticalAxisTrace = flag;
	}

	protected java.awt.geom.Line2D getVerticalTraceLine() {
		return org.jfree.chart.ChartPanel.this.verticalTraceLine;
	}

	protected void setVerticalTraceLine(java.awt.geom.Line2D line) {
		org.jfree.chart.ChartPanel.this.verticalTraceLine = line;
	}

	public boolean isEnforceFileExtensions() {
		return org.jfree.chart.ChartPanel.this.enforceFileExtensions;
	}

	public void setEnforceFileExtensions(boolean enforce) {
		org.jfree.chart.ChartPanel.this.enforceFileExtensions = enforce;
	}

	public boolean getZoomAroundAnchor() {
		return org.jfree.chart.ChartPanel.this.zoomAroundAnchor;
	}

	public void setZoomAroundAnchor(boolean zoomAroundAnchor) {
		org.jfree.chart.ChartPanel.this.zoomAroundAnchor = zoomAroundAnchor;
	}

	public void setDisplayToolTips(boolean flag) {
		if (flag) {
			javax.swing.ToolTipManager.sharedInstance().registerComponent(org.jfree.chart.ChartPanel.this);
		}else {
			javax.swing.ToolTipManager.sharedInstance().unregisterComponent(org.jfree.chart.ChartPanel.this);
		}
	}

	public java.lang.String getToolTipText(java.awt.event.MouseEvent e) {
		java.lang.String result = null;
		if ((org.jfree.chart.ChartPanel.this.info) != null) {
			org.jfree.chart.entity.EntityCollection entities = org.jfree.chart.ChartPanel.this.info.getEntityCollection();
			if (entities != null) {
				java.awt.Insets insets = getInsets();
				org.jfree.chart.entity.ChartEntity entity = entities.getEntity(((int) (((e.getX()) - (insets.left)) / (org.jfree.chart.ChartPanel.this.scaleX))), ((int) (((e.getY()) - (insets.top)) / (org.jfree.chart.ChartPanel.this.scaleY))));
				if (entity != null) {
					result = entity.getToolTipText();
				}
			}
		}
		return result;
	}

	public java.awt.Point translateJava2DToScreen(java.awt.geom.Point2D java2DPoint) {
		java.awt.Insets insets = getInsets();
		int x = ((int) (((java2DPoint.getX()) * (org.jfree.chart.ChartPanel.this.scaleX)) + (insets.left)));
		int y = ((int) (((java2DPoint.getY()) * (org.jfree.chart.ChartPanel.this.scaleY)) + (insets.top)));
		return new java.awt.Point(x, y);
	}

	public java.awt.geom.Point2D translateScreenToJava2D(java.awt.Point screenPoint) {
		java.awt.Insets insets = getInsets();
		double x = ((screenPoint.getX()) - (insets.left)) / (org.jfree.chart.ChartPanel.this.scaleX);
		double y = ((screenPoint.getY()) - (insets.top)) / (org.jfree.chart.ChartPanel.this.scaleY);
		return new java.awt.geom.Point2D.Double(x, y);
	}

	public java.awt.geom.Rectangle2D scale(java.awt.geom.Rectangle2D rect) {
		java.awt.Insets insets = getInsets();
		double x = ((rect.getX()) * (getScaleX())) + (insets.left);
		double y = ((rect.getY()) * (org.jfree.chart.ChartPanel.this.getScaleY())) + (insets.top);
		double w = (rect.getWidth()) * (org.jfree.chart.ChartPanel.this.getScaleX());
		double h = (rect.getHeight()) * (org.jfree.chart.ChartPanel.this.getScaleY());
		return new java.awt.geom.Rectangle2D.Double(x, y, w, h);
	}

	public org.jfree.chart.entity.ChartEntity getEntityForPoint(int viewX, int viewY) {
		org.jfree.chart.entity.ChartEntity result = null;
		if ((org.jfree.chart.ChartPanel.this.info) != null) {
			java.awt.Insets insets = getInsets();
			double x = (viewX - (insets.left)) / (org.jfree.chart.ChartPanel.this.scaleX);
			double y = (viewY - (insets.top)) / (org.jfree.chart.ChartPanel.this.scaleY);
			org.jfree.chart.entity.EntityCollection entities = org.jfree.chart.ChartPanel.this.info.getEntityCollection();
			result = (entities != null) ? entities.getEntity(x, y) : null;
		}
		return result;
	}

	public boolean getRefreshBuffer() {
		return org.jfree.chart.ChartPanel.this.refreshBuffer;
	}

	public void setRefreshBuffer(boolean flag) {
		org.jfree.chart.ChartPanel.this.refreshBuffer = flag;
	}

	public void paintComponent(java.awt.Graphics g) {
		super.paintComponent(g);
		if ((org.jfree.chart.ChartPanel.this.chart) == null) {
			return ;
		}
		java.awt.Graphics2D g2 = ((java.awt.Graphics2D) (g.create()));
		java.awt.Dimension size = getSize();
		java.awt.Insets insets = getInsets();
		java.awt.geom.Rectangle2D available = new java.awt.geom.Rectangle2D.Double(insets.left, insets.top, (((size.getWidth()) - (insets.left)) - (insets.right)), (((size.getHeight()) - (insets.top)) - (insets.bottom)));
		boolean scale = false;
		double drawWidth = available.getWidth();
		double drawHeight = available.getHeight();
		org.jfree.chart.ChartPanel.this.scaleX = 1.0;
		org.jfree.chart.ChartPanel.this.scaleY = 1.0;
		if (drawWidth < (org.jfree.chart.ChartPanel.this.minimumDrawWidth)) {
			org.jfree.chart.ChartPanel.this.scaleX = drawWidth / (org.jfree.chart.ChartPanel.this.minimumDrawWidth);
			drawWidth = org.jfree.chart.ChartPanel.this.minimumDrawWidth;
			scale = true;
		}else
			if (drawWidth > (org.jfree.chart.ChartPanel.this.maximumDrawWidth)) {
				org.jfree.chart.ChartPanel.this.scaleX = drawWidth / (org.jfree.chart.ChartPanel.this.maximumDrawWidth);
				drawWidth = org.jfree.chart.ChartPanel.this.maximumDrawWidth;
				scale = true;
			}
		
		if (drawHeight < (org.jfree.chart.ChartPanel.this.minimumDrawHeight)) {
			org.jfree.chart.ChartPanel.this.scaleY = drawHeight / (org.jfree.chart.ChartPanel.this.minimumDrawHeight);
			drawHeight = org.jfree.chart.ChartPanel.this.minimumDrawHeight;
			scale = true;
		}else
			if (drawHeight > (org.jfree.chart.ChartPanel.this.maximumDrawHeight)) {
				org.jfree.chart.ChartPanel.this.scaleY = drawHeight / (org.jfree.chart.ChartPanel.this.maximumDrawHeight);
				drawHeight = org.jfree.chart.ChartPanel.this.maximumDrawHeight;
				scale = true;
			}
		
		java.awt.geom.Rectangle2D chartArea = new java.awt.geom.Rectangle2D.Double(0.0, 0.0, drawWidth, drawHeight);
		if (org.jfree.chart.ChartPanel.this.useBuffer) {
			boolean clearBuffer = true;
			if ((((org.jfree.chart.ChartPanel.this.chartBuffer) == null) || ((org.jfree.chart.ChartPanel.this.chartBufferWidth) != (available.getWidth()))) || ((org.jfree.chart.ChartPanel.this.chartBufferHeight) != (available.getHeight()))) {
				org.jfree.chart.ChartPanel.this.chartBufferWidth = ((int) (available.getWidth()));
				org.jfree.chart.ChartPanel.this.chartBufferHeight = ((int) (available.getHeight()));
				org.jfree.chart.ChartPanel.this.chartBuffer = createImage(org.jfree.chart.ChartPanel.this.chartBufferWidth, org.jfree.chart.ChartPanel.this.chartBufferHeight);
				org.jfree.chart.ChartPanel.this.refreshBuffer = true;
				clearBuffer = false;
			}
			if (org.jfree.chart.ChartPanel.this.refreshBuffer) {
				java.awt.geom.Rectangle2D bufferArea = new java.awt.geom.Rectangle2D.Double(0, 0, org.jfree.chart.ChartPanel.this.chartBufferWidth, org.jfree.chart.ChartPanel.this.chartBufferHeight);
				java.awt.Graphics2D bufferG2 = ((java.awt.Graphics2D) (org.jfree.chart.ChartPanel.this.chartBuffer.getGraphics()));
				if (clearBuffer) {
					bufferG2.clearRect(0, 0, org.jfree.chart.ChartPanel.this.chartBufferWidth, org.jfree.chart.ChartPanel.this.chartBufferHeight);
				}
				if (scale) {
					java.awt.geom.AffineTransform saved = bufferG2.getTransform();
					java.awt.geom.AffineTransform st = java.awt.geom.AffineTransform.getScaleInstance(org.jfree.chart.ChartPanel.this.scaleX, org.jfree.chart.ChartPanel.this.scaleY);
					bufferG2.transform(st);
					org.jfree.chart.ChartPanel.this.chart.draw(bufferG2, chartArea, org.jfree.chart.ChartPanel.this.anchor, org.jfree.chart.ChartPanel.this.info);
					bufferG2.setTransform(saved);
				}else {
					org.jfree.chart.ChartPanel.this.chart.draw(bufferG2, bufferArea, org.jfree.chart.ChartPanel.this.anchor, org.jfree.chart.ChartPanel.this.info);
				}
				org.jfree.chart.ChartPanel.this.refreshBuffer = false;
			}
			g2.drawImage(org.jfree.chart.ChartPanel.this.chartBuffer, insets.left, insets.top, org.jfree.chart.ChartPanel.this);
		}else {
			java.awt.geom.AffineTransform saved = g2.getTransform();
			g2.translate(insets.left, insets.top);
			if (scale) {
				java.awt.geom.AffineTransform st = java.awt.geom.AffineTransform.getScaleInstance(org.jfree.chart.ChartPanel.this.scaleX, org.jfree.chart.ChartPanel.this.scaleY);
				g2.transform(st);
			}
			org.jfree.chart.ChartPanel.this.chart.draw(g2, chartArea, org.jfree.chart.ChartPanel.this.anchor, org.jfree.chart.ChartPanel.this.info);
			g2.setTransform(saved);
		}
		drawZoomRectangle(g2);
		g2.dispose();
		org.jfree.chart.ChartPanel.this.anchor = null;
		org.jfree.chart.ChartPanel.this.verticalTraceLine = null;
		org.jfree.chart.ChartPanel.this.horizontalTraceLine = null;
	}

	public void chartChanged(org.jfree.chart.event.ChartChangeEvent event) {
		org.jfree.chart.ChartPanel.this.refreshBuffer = true;
		org.jfree.chart.plot.Plot plot = org.jfree.chart.ChartPanel.this.chart.getPlot();
		if (plot instanceof org.jfree.chart.plot.Zoomable) {
			org.jfree.chart.plot.Zoomable z = ((org.jfree.chart.plot.Zoomable) (plot));
			org.jfree.chart.ChartPanel.this.orientation = z.getOrientation();
		}
		repaint();
	}

	public void chartProgress(org.jfree.chart.event.ChartProgressEvent event) {
	}

	public void actionPerformed(java.awt.event.ActionEvent event) {
		java.lang.String command = event.getActionCommand();
		double screenX = -1.0;
		double screenY = -1.0;
		if ((org.jfree.chart.ChartPanel.this.zoomPoint) != null) {
			screenX = org.jfree.chart.ChartPanel.this.zoomPoint.getX();
			screenY = org.jfree.chart.ChartPanel.this.zoomPoint.getY();
		}
		if (command.equals(org.jfree.chart.ChartPanel.PROPERTIES_COMMAND)) {
			doEditChartProperties();
		}else
			if (command.equals(org.jfree.chart.ChartPanel.SAVE_COMMAND)) {
				try {
					doSaveAs();
				} catch (java.io.IOException e) {
					e.printStackTrace();
				}
			}else
				if (command.equals(org.jfree.chart.ChartPanel.PRINT_COMMAND)) {
					createChartPrintJob();
				}else
					if (command.equals(org.jfree.chart.ChartPanel.ZOOM_IN_BOTH_COMMAND)) {
						zoomInBoth(screenX, screenY);
					}else
						if (command.equals(org.jfree.chart.ChartPanel.ZOOM_IN_DOMAIN_COMMAND)) {
							zoomInDomain(screenX, screenY);
						}else
							if (command.equals(org.jfree.chart.ChartPanel.ZOOM_IN_RANGE_COMMAND)) {
								zoomInRange(screenX, screenY);
							}else
								if (command.equals(org.jfree.chart.ChartPanel.ZOOM_OUT_BOTH_COMMAND)) {
									zoomOutBoth(screenX, screenY);
								}else
									if (command.equals(org.jfree.chart.ChartPanel.ZOOM_OUT_DOMAIN_COMMAND)) {
										zoomOutDomain(screenX, screenY);
									}else
										if (command.equals(org.jfree.chart.ChartPanel.ZOOM_OUT_RANGE_COMMAND)) {
											zoomOutRange(screenX, screenY);
										}else
											if (command.equals(org.jfree.chart.ChartPanel.ZOOM_RESET_BOTH_COMMAND)) {
												restoreAutoBounds();
											}else
												if (command.equals(org.jfree.chart.ChartPanel.ZOOM_RESET_DOMAIN_COMMAND)) {
													restoreAutoDomainBounds();
												}else
													if (command.equals(org.jfree.chart.ChartPanel.ZOOM_RESET_RANGE_COMMAND)) {
														restoreAutoRangeBounds();
													}
												
											
										
									
								
							
						
					
				
			
		
	}

	public void mouseEntered(java.awt.event.MouseEvent e) {
		if (!(org.jfree.chart.ChartPanel.this.ownToolTipDelaysActive)) {
			javax.swing.ToolTipManager ttm = javax.swing.ToolTipManager.sharedInstance();
			org.jfree.chart.ChartPanel.this.originalToolTipInitialDelay = ttm.getInitialDelay();
			ttm.setInitialDelay(org.jfree.chart.ChartPanel.this.ownToolTipInitialDelay);
			org.jfree.chart.ChartPanel.this.originalToolTipReshowDelay = ttm.getReshowDelay();
			ttm.setReshowDelay(org.jfree.chart.ChartPanel.this.ownToolTipReshowDelay);
			org.jfree.chart.ChartPanel.this.originalToolTipDismissDelay = ttm.getDismissDelay();
			ttm.setDismissDelay(org.jfree.chart.ChartPanel.this.ownToolTipDismissDelay);
			org.jfree.chart.ChartPanel.this.ownToolTipDelaysActive = true;
		}
	}

	public void mouseExited(java.awt.event.MouseEvent e) {
		if (org.jfree.chart.ChartPanel.this.ownToolTipDelaysActive) {
			javax.swing.ToolTipManager ttm = javax.swing.ToolTipManager.sharedInstance();
			ttm.setInitialDelay(org.jfree.chart.ChartPanel.this.originalToolTipInitialDelay);
			ttm.setReshowDelay(org.jfree.chart.ChartPanel.this.originalToolTipReshowDelay);
			ttm.setDismissDelay(org.jfree.chart.ChartPanel.this.originalToolTipDismissDelay);
			org.jfree.chart.ChartPanel.this.ownToolTipDelaysActive = false;
		}
	}

	public void mousePressed(java.awt.event.MouseEvent e) {
		if ((org.jfree.chart.ChartPanel.this.zoomRectangle) == null) {
			java.awt.geom.Rectangle2D screenDataArea = getScreenDataArea(e.getX(), e.getY());
			if (screenDataArea != null) {
				org.jfree.chart.ChartPanel.this.zoomPoint = getPointInRectangle(e.getX(), e.getY(), screenDataArea);
			}else {
				org.jfree.chart.ChartPanel.this.zoomPoint = null;
			}
			if (e.isPopupTrigger()) {
				if ((org.jfree.chart.ChartPanel.this.popup) != null) {
					displayPopupMenu(e.getX(), e.getY());
				}
			}
		}
	}

	private java.awt.Point getPointInRectangle(int x, int y, java.awt.geom.Rectangle2D area) {
		x = ((int) (java.lang.Math.max(java.lang.Math.ceil(area.getMinX()), java.lang.Math.min(x, java.lang.Math.floor(area.getMaxX())))));
		y = ((int) (java.lang.Math.max(java.lang.Math.ceil(area.getMinY()), java.lang.Math.min(y, java.lang.Math.floor(area.getMaxY())))));
		return new java.awt.Point(x, y);
	}

	public void mouseDragged(java.awt.event.MouseEvent e) {
		if (((org.jfree.chart.ChartPanel.this.popup) != null) && (org.jfree.chart.ChartPanel.this.popup.isShowing())) {
			return ;
		}
		if ((org.jfree.chart.ChartPanel.this.zoomPoint) == null) {
			return ;
		}
		java.awt.Graphics2D g2 = ((java.awt.Graphics2D) (getGraphics()));
		drawZoomRectangle(g2);
		boolean hZoom = false;
		boolean vZoom = false;
		if ((org.jfree.chart.ChartPanel.this.orientation) == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
			hZoom = org.jfree.chart.ChartPanel.this.rangeZoomable;
			vZoom = org.jfree.chart.ChartPanel.this.domainZoomable;
		}else {
			hZoom = org.jfree.chart.ChartPanel.this.domainZoomable;
			vZoom = org.jfree.chart.ChartPanel.this.rangeZoomable;
		}
		java.awt.geom.Rectangle2D scaledDataArea = getScreenDataArea(((int) (org.jfree.chart.ChartPanel.this.zoomPoint.getX())), ((int) (org.jfree.chart.ChartPanel.this.zoomPoint.getY())));
		if (hZoom && vZoom) {
			double xmax = java.lang.Math.min(e.getX(), scaledDataArea.getMaxX());
			double ymax = java.lang.Math.min(e.getY(), scaledDataArea.getMaxY());
			org.jfree.chart.ChartPanel.this.zoomRectangle = new java.awt.geom.Rectangle2D.Double(org.jfree.chart.ChartPanel.this.zoomPoint.getX(), org.jfree.chart.ChartPanel.this.zoomPoint.getY(), (xmax - (org.jfree.chart.ChartPanel.this.zoomPoint.getX())), (ymax - (org.jfree.chart.ChartPanel.this.zoomPoint.getY())));
		}else
			if (hZoom) {
				double xmax = java.lang.Math.min(e.getX(), scaledDataArea.getMaxX());
				org.jfree.chart.ChartPanel.this.zoomRectangle = new java.awt.geom.Rectangle2D.Double(org.jfree.chart.ChartPanel.this.zoomPoint.getX(), scaledDataArea.getMinY(), (xmax - (org.jfree.chart.ChartPanel.this.zoomPoint.getX())), scaledDataArea.getHeight());
			}else
				if (vZoom) {
					double ymax = java.lang.Math.min(e.getY(), scaledDataArea.getMaxY());
					org.jfree.chart.ChartPanel.this.zoomRectangle = new java.awt.geom.Rectangle2D.Double(scaledDataArea.getMinX(), org.jfree.chart.ChartPanel.this.zoomPoint.getY(), scaledDataArea.getWidth(), (ymax - (org.jfree.chart.ChartPanel.this.zoomPoint.getY())));
				}
			
		
		drawZoomRectangle(g2);
		g2.dispose();
	}

	public void mouseReleased(java.awt.event.MouseEvent e) {
		if ((org.jfree.chart.ChartPanel.this.zoomRectangle) != null) {
			boolean hZoom = false;
			boolean vZoom = false;
			if ((org.jfree.chart.ChartPanel.this.orientation) == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
				hZoom = org.jfree.chart.ChartPanel.this.rangeZoomable;
				vZoom = org.jfree.chart.ChartPanel.this.domainZoomable;
			}else {
				hZoom = org.jfree.chart.ChartPanel.this.domainZoomable;
				vZoom = org.jfree.chart.ChartPanel.this.rangeZoomable;
			}
			boolean zoomTrigger1 = hZoom && ((java.lang.Math.abs(((e.getX()) - (org.jfree.chart.ChartPanel.this.zoomPoint.getX())))) >= (org.jfree.chart.ChartPanel.this.zoomTriggerDistance));
			boolean zoomTrigger2 = vZoom && ((java.lang.Math.abs(((e.getY()) - (org.jfree.chart.ChartPanel.this.zoomPoint.getY())))) >= (org.jfree.chart.ChartPanel.this.zoomTriggerDistance));
			if (zoomTrigger1 || zoomTrigger2) {
				if ((hZoom && ((e.getX()) < (org.jfree.chart.ChartPanel.this.zoomPoint.getX()))) || (vZoom && ((e.getY()) < (org.jfree.chart.ChartPanel.this.zoomPoint.getY())))) {
					restoreAutoBounds();
				}else {
					double x;
					double y;
					double w;
					double h;
					java.awt.geom.Rectangle2D screenDataArea = getScreenDataArea(((int) (org.jfree.chart.ChartPanel.this.zoomPoint.getX())), ((int) (org.jfree.chart.ChartPanel.this.zoomPoint.getY())));
					if (!vZoom) {
						x = org.jfree.chart.ChartPanel.this.zoomPoint.getX();
						y = screenDataArea.getMinY();
						w = java.lang.Math.min(org.jfree.chart.ChartPanel.this.zoomRectangle.getWidth(), ((screenDataArea.getMaxX()) - (org.jfree.chart.ChartPanel.this.zoomPoint.getX())));
						h = screenDataArea.getHeight();
					}else
						if (!hZoom) {
							x = screenDataArea.getMinX();
							y = org.jfree.chart.ChartPanel.this.zoomPoint.getY();
							w = screenDataArea.getWidth();
							h = java.lang.Math.min(org.jfree.chart.ChartPanel.this.zoomRectangle.getHeight(), ((screenDataArea.getMaxY()) - (org.jfree.chart.ChartPanel.this.zoomPoint.getY())));
						}else {
							x = org.jfree.chart.ChartPanel.this.zoomPoint.getX();
							y = org.jfree.chart.ChartPanel.this.zoomPoint.getY();
							w = java.lang.Math.min(org.jfree.chart.ChartPanel.this.zoomRectangle.getWidth(), ((screenDataArea.getMaxX()) - (org.jfree.chart.ChartPanel.this.zoomPoint.getX())));
							h = java.lang.Math.min(org.jfree.chart.ChartPanel.this.zoomRectangle.getHeight(), ((screenDataArea.getMaxY()) - (org.jfree.chart.ChartPanel.this.zoomPoint.getY())));
						}
					
					java.awt.geom.Rectangle2D zoomArea = new java.awt.geom.Rectangle2D.Double(x, y, w, h);
					zoom(zoomArea);
				}
				org.jfree.chart.ChartPanel.this.zoomPoint = null;
				org.jfree.chart.ChartPanel.this.zoomRectangle = null;
			}else {
				java.awt.Graphics2D g2 = ((java.awt.Graphics2D) (getGraphics()));
				drawZoomRectangle(g2);
				g2.dispose();
				org.jfree.chart.ChartPanel.this.zoomPoint = null;
				org.jfree.chart.ChartPanel.this.zoomRectangle = null;
			}
		}else
			if (e.isPopupTrigger()) {
				if ((org.jfree.chart.ChartPanel.this.popup) != null) {
					displayPopupMenu(e.getX(), e.getY());
				}
			}
		
	}

	public void mouseClicked(java.awt.event.MouseEvent event) {
		java.awt.Insets insets = getInsets();
		int x = ((int) (((event.getX()) - (insets.left)) / (org.jfree.chart.ChartPanel.this.scaleX)));
		int y = ((int) (((event.getY()) - (insets.top)) / (org.jfree.chart.ChartPanel.this.scaleY)));
		org.jfree.chart.ChartPanel.this.anchor = new java.awt.geom.Point2D.Double(x, y);
		if ((org.jfree.chart.ChartPanel.this.chart) == null) {
			return ;
		}
		org.jfree.chart.ChartPanel.this.chart.setNotify(true);
		java.lang.Object[] listeners = org.jfree.chart.ChartPanel.this.chartMouseListeners.getListeners(org.jfree.chart.ChartMouseListener.class);
		if ((listeners.length) == 0) {
			return ;
		}
		org.jfree.chart.entity.ChartEntity entity = null;
		if ((org.jfree.chart.ChartPanel.this.info) != null) {
			org.jfree.chart.entity.EntityCollection entities = org.jfree.chart.ChartPanel.this.info.getEntityCollection();
			if (entities != null) {
				entity = entities.getEntity(x, y);
			}
		}
		org.jfree.chart.ChartMouseEvent chartEvent = new org.jfree.chart.ChartMouseEvent(getChart(), event, entity);
		for (int i = (listeners.length) - 1; i >= 0; i -= 1) {
			((org.jfree.chart.ChartMouseListener) (listeners[i])).chartMouseClicked(chartEvent);
		}
	}

	public void mouseMoved(java.awt.event.MouseEvent e) {
		java.awt.Graphics2D g2 = ((java.awt.Graphics2D) (getGraphics()));
		if (org.jfree.chart.ChartPanel.this.horizontalAxisTrace) {
			drawHorizontalAxisTrace(g2, e.getX());
		}
		if (org.jfree.chart.ChartPanel.this.verticalAxisTrace) {
			drawVerticalAxisTrace(g2, e.getY());
		}
		g2.dispose();
		java.lang.Object[] listeners = org.jfree.chart.ChartPanel.this.chartMouseListeners.getListeners(org.jfree.chart.ChartMouseListener.class);
		if ((listeners.length) == 0) {
			return ;
		}
		java.awt.Insets insets = getInsets();
		int x = ((int) (((e.getX()) - (insets.left)) / (org.jfree.chart.ChartPanel.this.scaleX)));
		int y = ((int) (((e.getY()) - (insets.top)) / (org.jfree.chart.ChartPanel.this.scaleY)));
		org.jfree.chart.entity.ChartEntity entity = null;
		if ((org.jfree.chart.ChartPanel.this.info) != null) {
			org.jfree.chart.entity.EntityCollection entities = org.jfree.chart.ChartPanel.this.info.getEntityCollection();
			if (entities != null) {
				entity = entities.getEntity(x, y);
			}
		}
		if ((org.jfree.chart.ChartPanel.this.chart) != null) {
			org.jfree.chart.ChartMouseEvent event = new org.jfree.chart.ChartMouseEvent(getChart(), e, entity);
			for (int i = (listeners.length) - 1; i >= 0; i -= 1) {
				((org.jfree.chart.ChartMouseListener) (listeners[i])).chartMouseMoved(event);
			}
		}
	}

	public void zoomInBoth(double x, double y) {
		zoomInDomain(x, y);
		zoomInRange(x, y);
	}

	public void zoomInDomain(double x, double y) {
		org.jfree.chart.plot.Plot p = org.jfree.chart.ChartPanel.this.chart.getPlot();
		if (p instanceof org.jfree.chart.plot.Zoomable) {
			org.jfree.chart.plot.Zoomable plot = ((org.jfree.chart.plot.Zoomable) (p));
			plot.zoomDomainAxes(org.jfree.chart.ChartPanel.this.zoomInFactor, org.jfree.chart.ChartPanel.this.info.getPlotInfo(), translateScreenToJava2D(new java.awt.Point(((int) (x)), ((int) (y)))), org.jfree.chart.ChartPanel.this.zoomAroundAnchor);
		}
	}

	public void zoomInRange(double x, double y) {
		org.jfree.chart.plot.Plot p = org.jfree.chart.ChartPanel.this.chart.getPlot();
		if (p instanceof org.jfree.chart.plot.Zoomable) {
			org.jfree.chart.plot.Zoomable z = ((org.jfree.chart.plot.Zoomable) (p));
			z.zoomRangeAxes(org.jfree.chart.ChartPanel.this.zoomInFactor, org.jfree.chart.ChartPanel.this.info.getPlotInfo(), translateScreenToJava2D(new java.awt.Point(((int) (x)), ((int) (y)))), org.jfree.chart.ChartPanel.this.zoomAroundAnchor);
		}
	}

	public void zoomOutBoth(double x, double y) {
		zoomOutDomain(x, y);
		zoomOutRange(x, y);
	}

	public void zoomOutDomain(double x, double y) {
		org.jfree.chart.plot.Plot p = org.jfree.chart.ChartPanel.this.chart.getPlot();
		if (p instanceof org.jfree.chart.plot.Zoomable) {
			org.jfree.chart.plot.Zoomable z = ((org.jfree.chart.plot.Zoomable) (p));
			z.zoomDomainAxes(org.jfree.chart.ChartPanel.this.zoomOutFactor, org.jfree.chart.ChartPanel.this.info.getPlotInfo(), translateScreenToJava2D(new java.awt.Point(((int) (x)), ((int) (y)))), org.jfree.chart.ChartPanel.this.zoomAroundAnchor);
		}
	}

	public void zoomOutRange(double x, double y) {
		org.jfree.chart.plot.Plot p = org.jfree.chart.ChartPanel.this.chart.getPlot();
		if (p instanceof org.jfree.chart.plot.Zoomable) {
			org.jfree.chart.plot.Zoomable z = ((org.jfree.chart.plot.Zoomable) (p));
			z.zoomRangeAxes(org.jfree.chart.ChartPanel.this.zoomOutFactor, org.jfree.chart.ChartPanel.this.info.getPlotInfo(), translateScreenToJava2D(new java.awt.Point(((int) (x)), ((int) (y)))), org.jfree.chart.ChartPanel.this.zoomAroundAnchor);
		}
	}

	public void zoom(java.awt.geom.Rectangle2D selection) {
		java.awt.geom.Point2D selectOrigin = translateScreenToJava2D(new java.awt.Point(((int) (java.lang.Math.ceil(selection.getX()))), ((int) (java.lang.Math.ceil(selection.getY())))));
		org.jfree.chart.plot.PlotRenderingInfo plotInfo = org.jfree.chart.ChartPanel.this.info.getPlotInfo();
		java.awt.geom.Rectangle2D scaledDataArea = getScreenDataArea(((int) (selection.getCenterX())), ((int) (selection.getCenterY())));
		if (((selection.getHeight()) > 0) && ((selection.getWidth()) > 0)) {
			double hLower = ((selection.getMinX()) - (scaledDataArea.getMinX())) / (scaledDataArea.getWidth());
			double hUpper = ((selection.getMaxX()) - (scaledDataArea.getMinX())) / (scaledDataArea.getWidth());
			double vLower = ((scaledDataArea.getMaxY()) - (selection.getMaxY())) / (scaledDataArea.getHeight());
			double vUpper = ((scaledDataArea.getMaxY()) - (selection.getMinY())) / (scaledDataArea.getHeight());
			org.jfree.chart.plot.Plot p = org.jfree.chart.ChartPanel.this.chart.getPlot();
			if (p instanceof org.jfree.chart.plot.Zoomable) {
				org.jfree.chart.plot.Zoomable z = ((org.jfree.chart.plot.Zoomable) (p));
				if ((z.getOrientation()) == (org.jfree.chart.plot.PlotOrientation.HORIZONTAL)) {
					z.zoomDomainAxes(vLower, vUpper, plotInfo, selectOrigin);
					z.zoomRangeAxes(hLower, hUpper, plotInfo, selectOrigin);
				}else {
					z.zoomDomainAxes(hLower, hUpper, plotInfo, selectOrigin);
					z.zoomRangeAxes(vLower, vUpper, plotInfo, selectOrigin);
				}
			}
		}
	}

	public void restoreAutoBounds() {
		restoreAutoDomainBounds();
		restoreAutoRangeBounds();
	}

	public void restoreAutoDomainBounds() {
		org.jfree.chart.plot.Plot p = org.jfree.chart.ChartPanel.this.chart.getPlot();
		if (p instanceof org.jfree.chart.plot.Zoomable) {
			org.jfree.chart.plot.Zoomable z = ((org.jfree.chart.plot.Zoomable) (p));
			java.awt.Point zp = (org.jfree.chart.ChartPanel.this.zoomPoint) != null ? org.jfree.chart.ChartPanel.this.zoomPoint : new java.awt.Point();
			z.zoomDomainAxes(0.0, org.jfree.chart.ChartPanel.this.info.getPlotInfo(), zp);
		}
	}

	public void restoreAutoRangeBounds() {
		org.jfree.chart.plot.Plot p = org.jfree.chart.ChartPanel.this.chart.getPlot();
		if (p instanceof org.jfree.chart.plot.Zoomable) {
			org.jfree.chart.plot.Zoomable z = ((org.jfree.chart.plot.Zoomable) (p));
			java.awt.Point zp = (org.jfree.chart.ChartPanel.this.zoomPoint) != null ? org.jfree.chart.ChartPanel.this.zoomPoint : new java.awt.Point();
			z.zoomRangeAxes(0.0, org.jfree.chart.ChartPanel.this.info.getPlotInfo(), zp);
		}
	}

	public java.awt.geom.Rectangle2D getScreenDataArea() {
		java.awt.geom.Rectangle2D dataArea = org.jfree.chart.ChartPanel.this.info.getPlotInfo().getDataArea();
		java.awt.Insets insets = getInsets();
		double x = ((dataArea.getX()) * (org.jfree.chart.ChartPanel.this.scaleX)) + (insets.left);
		double y = ((dataArea.getY()) * (org.jfree.chart.ChartPanel.this.scaleY)) + (insets.top);
		double w = (dataArea.getWidth()) * (org.jfree.chart.ChartPanel.this.scaleX);
		double h = (dataArea.getHeight()) * (org.jfree.chart.ChartPanel.this.scaleY);
		return new java.awt.geom.Rectangle2D.Double(x, y, w, h);
	}

	public java.awt.geom.Rectangle2D getScreenDataArea(int x, int y) {
		org.jfree.chart.plot.PlotRenderingInfo plotInfo = org.jfree.chart.ChartPanel.this.info.getPlotInfo();
		java.awt.geom.Rectangle2D result;
		if ((plotInfo.getSubplotCount()) == 0) {
			result = getScreenDataArea();
		}else {
			java.awt.geom.Point2D selectOrigin = translateScreenToJava2D(new java.awt.Point(x, y));
			int subplotIndex = plotInfo.getSubplotIndex(selectOrigin);
			if (subplotIndex == (-1)) {
				return null;
			}
			result = scale(plotInfo.getSubplotInfo(subplotIndex).getDataArea());
		}
		return result;
	}

	public int getInitialDelay() {
		return org.jfree.chart.ChartPanel.this.ownToolTipInitialDelay;
	}

	public int getReshowDelay() {
		return org.jfree.chart.ChartPanel.this.ownToolTipReshowDelay;
	}

	public int getDismissDelay() {
		return org.jfree.chart.ChartPanel.this.ownToolTipDismissDelay;
	}

	public void setInitialDelay(int delay) {
		org.jfree.chart.ChartPanel.this.ownToolTipInitialDelay = delay;
	}

	public void setReshowDelay(int delay) {
		org.jfree.chart.ChartPanel.this.ownToolTipReshowDelay = delay;
	}

	public void setDismissDelay(int delay) {
		org.jfree.chart.ChartPanel.this.ownToolTipDismissDelay = delay;
	}

	public double getZoomInFactor() {
		return org.jfree.chart.ChartPanel.this.zoomInFactor;
	}

	public void setZoomInFactor(double factor) {
		org.jfree.chart.ChartPanel.this.zoomInFactor = factor;
	}

	public double getZoomOutFactor() {
		return org.jfree.chart.ChartPanel.this.zoomOutFactor;
	}

	public void setZoomOutFactor(double factor) {
		org.jfree.chart.ChartPanel.this.zoomOutFactor = factor;
	}

	private void drawZoomRectangle(java.awt.Graphics2D g2) {
		g2.setXORMode(java.awt.Color.gray);
		if ((org.jfree.chart.ChartPanel.this.zoomRectangle) != null) {
			if (org.jfree.chart.ChartPanel.this.fillZoomRectangle) {
				g2.fill(org.jfree.chart.ChartPanel.this.zoomRectangle);
			}else {
				g2.draw(org.jfree.chart.ChartPanel.this.zoomRectangle);
			}
		}
		g2.setPaintMode();
	}

	private void drawHorizontalAxisTrace(java.awt.Graphics2D g2, int x) {
		java.awt.geom.Rectangle2D dataArea = getScreenDataArea();
		g2.setXORMode(java.awt.Color.orange);
		if ((((int) (dataArea.getMinX())) < x) && (x < ((int) (dataArea.getMaxX())))) {
			if ((org.jfree.chart.ChartPanel.this.verticalTraceLine) != null) {
				g2.draw(org.jfree.chart.ChartPanel.this.verticalTraceLine);
				org.jfree.chart.ChartPanel.this.verticalTraceLine.setLine(x, ((int) (dataArea.getMinY())), x, ((int) (dataArea.getMaxY())));
			}else {
				org.jfree.chart.ChartPanel.this.verticalTraceLine = new java.awt.geom.Line2D.Float(x, ((int) (dataArea.getMinY())), x, ((int) (dataArea.getMaxY())));
			}
			g2.draw(org.jfree.chart.ChartPanel.this.verticalTraceLine);
		}
		g2.setPaintMode();
	}

	private void drawVerticalAxisTrace(java.awt.Graphics2D g2, int y) {
		java.awt.geom.Rectangle2D dataArea = getScreenDataArea();
		g2.setXORMode(java.awt.Color.orange);
		if ((((int) (dataArea.getMinY())) < y) && (y < ((int) (dataArea.getMaxY())))) {
			if ((org.jfree.chart.ChartPanel.this.horizontalTraceLine) != null) {
				g2.draw(org.jfree.chart.ChartPanel.this.horizontalTraceLine);
				org.jfree.chart.ChartPanel.this.horizontalTraceLine.setLine(((int) (dataArea.getMinX())), y, ((int) (dataArea.getMaxX())), y);
			}else {
				org.jfree.chart.ChartPanel.this.horizontalTraceLine = new java.awt.geom.Line2D.Float(((int) (dataArea.getMinX())), y, ((int) (dataArea.getMaxX())), y);
			}
			g2.draw(org.jfree.chart.ChartPanel.this.horizontalTraceLine);
		}
		g2.setPaintMode();
	}

	public void doEditChartProperties() {
		org.jfree.chart.editor.ChartEditor editor = org.jfree.chart.editor.ChartEditorManager.getChartEditor(org.jfree.chart.ChartPanel.this.chart);
		int result = javax.swing.JOptionPane.showConfirmDialog(org.jfree.chart.ChartPanel.this, editor, org.jfree.chart.ChartPanel.localizationResources.getString("Chart_Properties"), javax.swing.JOptionPane.OK_CANCEL_OPTION, javax.swing.JOptionPane.PLAIN_MESSAGE);
		if (result == (javax.swing.JOptionPane.OK_OPTION)) {
			editor.updateChart(org.jfree.chart.ChartPanel.this.chart);
		}
	}

	public void doSaveAs() throws java.io.IOException {
		javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
		org.jfree.chart.ui.ExtensionFileFilter filter = new org.jfree.chart.ui.ExtensionFileFilter(org.jfree.chart.ChartPanel.localizationResources.getString("PNG_Image_Files"), ".png");
		fileChooser.addChoosableFileFilter(filter);
		int option = fileChooser.showSaveDialog(org.jfree.chart.ChartPanel.this);
		if (option == (javax.swing.JFileChooser.APPROVE_OPTION)) {
			java.lang.String filename = fileChooser.getSelectedFile().getPath();
			if (isEnforceFileExtensions()) {
				if (!(filename.endsWith(".png"))) {
					filename = filename + ".png";
				}
			}
			org.jfree.chart.ChartUtilities.saveChartAsPNG(new java.io.File(filename), org.jfree.chart.ChartPanel.this.chart, getWidth(), getHeight());
		}
	}

	public void createChartPrintJob() {
		java.awt.print.PrinterJob job = java.awt.print.PrinterJob.getPrinterJob();
		java.awt.print.PageFormat pf = job.defaultPage();
		java.awt.print.PageFormat pf2 = job.pageDialog(pf);
		if (pf2 != pf) {
			job.setPrintable(org.jfree.chart.ChartPanel.this, pf2);
			if (job.printDialog()) {
				try {
					job.print();
				} catch (java.awt.print.PrinterException e) {
					javax.swing.JOptionPane.showMessageDialog(org.jfree.chart.ChartPanel.this, e);
				}
			}
		}
	}

	public int print(java.awt.Graphics g, java.awt.print.PageFormat pf, int pageIndex) {
		if (pageIndex != 0) {
			return java.awt.print.Printable.NO_SUCH_PAGE;
		}
		java.awt.Graphics2D g2 = ((java.awt.Graphics2D) (g));
		double x = pf.getImageableX();
		double y = pf.getImageableY();
		double w = pf.getImageableWidth();
		double h = pf.getImageableHeight();
		org.jfree.chart.ChartPanel.this.chart.draw(g2, new java.awt.geom.Rectangle2D.Double(x, y, w, h), org.jfree.chart.ChartPanel.this.anchor, null);
		return java.awt.print.Printable.PAGE_EXISTS;
	}

	public void addChartMouseListener(org.jfree.chart.ChartMouseListener listener) {
		if (listener == null) {
			throw new java.lang.IllegalArgumentException("Null 'listener' argument.");
		}
		org.jfree.chart.ChartPanel.this.chartMouseListeners.add(org.jfree.chart.ChartMouseListener.class, listener);
	}

	public void removeChartMouseListener(org.jfree.chart.ChartMouseListener listener) {
		org.jfree.chart.ChartPanel.this.chartMouseListeners.remove(org.jfree.chart.ChartMouseListener.class, listener);
	}

	public java.util.EventListener[] getListeners(java.lang.Class listenerType) {
		if (listenerType == (org.jfree.chart.ChartMouseListener.class)) {
			return org.jfree.chart.ChartPanel.this.chartMouseListeners.getListeners(listenerType);
		}else {
			return super.getListeners(listenerType);
		}
	}

	protected javax.swing.JPopupMenu createPopupMenu(boolean properties, boolean save, boolean print, boolean zoom) {
		javax.swing.JPopupMenu result = new javax.swing.JPopupMenu("Chart:");
		boolean separator = false;
		if (properties) {
			javax.swing.JMenuItem propertiesItem = new javax.swing.JMenuItem(org.jfree.chart.ChartPanel.localizationResources.getString("Properties..."));
			propertiesItem.setActionCommand(org.jfree.chart.ChartPanel.PROPERTIES_COMMAND);
			propertiesItem.addActionListener(org.jfree.chart.ChartPanel.this);
			result.add(propertiesItem);
			separator = true;
		}
		if (save) {
			if (separator) {
				result.addSeparator();
				separator = false;
			}
			javax.swing.JMenuItem saveItem = new javax.swing.JMenuItem(org.jfree.chart.ChartPanel.localizationResources.getString("Save_as..."));
			saveItem.setActionCommand(org.jfree.chart.ChartPanel.SAVE_COMMAND);
			saveItem.addActionListener(org.jfree.chart.ChartPanel.this);
			result.add(saveItem);
			separator = true;
		}
		if (print) {
			if (separator) {
				result.addSeparator();
				separator = false;
			}
			javax.swing.JMenuItem printItem = new javax.swing.JMenuItem(org.jfree.chart.ChartPanel.localizationResources.getString("Print..."));
			printItem.setActionCommand(org.jfree.chart.ChartPanel.PRINT_COMMAND);
			printItem.addActionListener(org.jfree.chart.ChartPanel.this);
			result.add(printItem);
			separator = true;
		}
		if (zoom) {
			if (separator) {
				result.addSeparator();
				separator = false;
			}
			javax.swing.JMenu zoomInMenu = new javax.swing.JMenu(org.jfree.chart.ChartPanel.localizationResources.getString("Zoom_In"));
			org.jfree.chart.ChartPanel.this.zoomInBothMenuItem = new javax.swing.JMenuItem(org.jfree.chart.ChartPanel.localizationResources.getString("All_Axes"));
			org.jfree.chart.ChartPanel.this.zoomInBothMenuItem.setActionCommand(org.jfree.chart.ChartPanel.ZOOM_IN_BOTH_COMMAND);
			org.jfree.chart.ChartPanel.this.zoomInBothMenuItem.addActionListener(org.jfree.chart.ChartPanel.this);
			zoomInMenu.add(org.jfree.chart.ChartPanel.this.zoomInBothMenuItem);
			zoomInMenu.addSeparator();
			org.jfree.chart.ChartPanel.this.zoomInDomainMenuItem = new javax.swing.JMenuItem(org.jfree.chart.ChartPanel.localizationResources.getString("Domain_Axis"));
			org.jfree.chart.ChartPanel.this.zoomInDomainMenuItem.setActionCommand(org.jfree.chart.ChartPanel.ZOOM_IN_DOMAIN_COMMAND);
			org.jfree.chart.ChartPanel.this.zoomInDomainMenuItem.addActionListener(org.jfree.chart.ChartPanel.this);
			zoomInMenu.add(org.jfree.chart.ChartPanel.this.zoomInDomainMenuItem);
			org.jfree.chart.ChartPanel.this.zoomInRangeMenuItem = new javax.swing.JMenuItem(org.jfree.chart.ChartPanel.localizationResources.getString("Range_Axis"));
			org.jfree.chart.ChartPanel.this.zoomInRangeMenuItem.setActionCommand(org.jfree.chart.ChartPanel.ZOOM_IN_RANGE_COMMAND);
			org.jfree.chart.ChartPanel.this.zoomInRangeMenuItem.addActionListener(org.jfree.chart.ChartPanel.this);
			zoomInMenu.add(org.jfree.chart.ChartPanel.this.zoomInRangeMenuItem);
			result.add(zoomInMenu);
			javax.swing.JMenu zoomOutMenu = new javax.swing.JMenu(org.jfree.chart.ChartPanel.localizationResources.getString("Zoom_Out"));
			org.jfree.chart.ChartPanel.this.zoomOutBothMenuItem = new javax.swing.JMenuItem(org.jfree.chart.ChartPanel.localizationResources.getString("All_Axes"));
			org.jfree.chart.ChartPanel.this.zoomOutBothMenuItem.setActionCommand(org.jfree.chart.ChartPanel.ZOOM_OUT_BOTH_COMMAND);
			org.jfree.chart.ChartPanel.this.zoomOutBothMenuItem.addActionListener(org.jfree.chart.ChartPanel.this);
			zoomOutMenu.add(org.jfree.chart.ChartPanel.this.zoomOutBothMenuItem);
			zoomOutMenu.addSeparator();
			org.jfree.chart.ChartPanel.this.zoomOutDomainMenuItem = new javax.swing.JMenuItem(org.jfree.chart.ChartPanel.localizationResources.getString("Domain_Axis"));
			org.jfree.chart.ChartPanel.this.zoomOutDomainMenuItem.setActionCommand(org.jfree.chart.ChartPanel.ZOOM_OUT_DOMAIN_COMMAND);
			org.jfree.chart.ChartPanel.this.zoomOutDomainMenuItem.addActionListener(org.jfree.chart.ChartPanel.this);
			zoomOutMenu.add(org.jfree.chart.ChartPanel.this.zoomOutDomainMenuItem);
			org.jfree.chart.ChartPanel.this.zoomOutRangeMenuItem = new javax.swing.JMenuItem(org.jfree.chart.ChartPanel.localizationResources.getString("Range_Axis"));
			org.jfree.chart.ChartPanel.this.zoomOutRangeMenuItem.setActionCommand(org.jfree.chart.ChartPanel.ZOOM_OUT_RANGE_COMMAND);
			org.jfree.chart.ChartPanel.this.zoomOutRangeMenuItem.addActionListener(org.jfree.chart.ChartPanel.this);
			zoomOutMenu.add(org.jfree.chart.ChartPanel.this.zoomOutRangeMenuItem);
			result.add(zoomOutMenu);
			javax.swing.JMenu autoRangeMenu = new javax.swing.JMenu(org.jfree.chart.ChartPanel.localizationResources.getString("Auto_Range"));
			org.jfree.chart.ChartPanel.this.zoomResetBothMenuItem = new javax.swing.JMenuItem(org.jfree.chart.ChartPanel.localizationResources.getString("All_Axes"));
			org.jfree.chart.ChartPanel.this.zoomResetBothMenuItem.setActionCommand(org.jfree.chart.ChartPanel.ZOOM_RESET_BOTH_COMMAND);
			org.jfree.chart.ChartPanel.this.zoomResetBothMenuItem.addActionListener(org.jfree.chart.ChartPanel.this);
			autoRangeMenu.add(org.jfree.chart.ChartPanel.this.zoomResetBothMenuItem);
			autoRangeMenu.addSeparator();
			org.jfree.chart.ChartPanel.this.zoomResetDomainMenuItem = new javax.swing.JMenuItem(org.jfree.chart.ChartPanel.localizationResources.getString("Domain_Axis"));
			org.jfree.chart.ChartPanel.this.zoomResetDomainMenuItem.setActionCommand(org.jfree.chart.ChartPanel.ZOOM_RESET_DOMAIN_COMMAND);
			org.jfree.chart.ChartPanel.this.zoomResetDomainMenuItem.addActionListener(org.jfree.chart.ChartPanel.this);
			autoRangeMenu.add(org.jfree.chart.ChartPanel.this.zoomResetDomainMenuItem);
			org.jfree.chart.ChartPanel.this.zoomResetRangeMenuItem = new javax.swing.JMenuItem(org.jfree.chart.ChartPanel.localizationResources.getString("Range_Axis"));
			org.jfree.chart.ChartPanel.this.zoomResetRangeMenuItem.setActionCommand(org.jfree.chart.ChartPanel.ZOOM_RESET_RANGE_COMMAND);
			org.jfree.chart.ChartPanel.this.zoomResetRangeMenuItem.addActionListener(org.jfree.chart.ChartPanel.this);
			autoRangeMenu.add(org.jfree.chart.ChartPanel.this.zoomResetRangeMenuItem);
			result.addSeparator();
			result.add(autoRangeMenu);
		}
		return result;
	}

	protected void displayPopupMenu(int x, int y) {
		if ((org.jfree.chart.ChartPanel.this.popup) != null) {
			org.jfree.chart.plot.Plot plot = org.jfree.chart.ChartPanel.this.chart.getPlot();
			boolean isDomainZoomable = false;
			boolean isRangeZoomable = false;
			if (plot instanceof org.jfree.chart.plot.Zoomable) {
				org.jfree.chart.plot.Zoomable z = ((org.jfree.chart.plot.Zoomable) (plot));
				isDomainZoomable = z.isDomainZoomable();
				isRangeZoomable = z.isRangeZoomable();
			}
			if ((org.jfree.chart.ChartPanel.this.zoomInDomainMenuItem) != null) {
				org.jfree.chart.ChartPanel.this.zoomInDomainMenuItem.setEnabled(isDomainZoomable);
			}
			if ((org.jfree.chart.ChartPanel.this.zoomOutDomainMenuItem) != null) {
				org.jfree.chart.ChartPanel.this.zoomOutDomainMenuItem.setEnabled(isDomainZoomable);
			}
			if ((org.jfree.chart.ChartPanel.this.zoomResetDomainMenuItem) != null) {
				org.jfree.chart.ChartPanel.this.zoomResetDomainMenuItem.setEnabled(isDomainZoomable);
			}
			if ((org.jfree.chart.ChartPanel.this.zoomInRangeMenuItem) != null) {
				org.jfree.chart.ChartPanel.this.zoomInRangeMenuItem.setEnabled(isRangeZoomable);
			}
			if ((org.jfree.chart.ChartPanel.this.zoomOutRangeMenuItem) != null) {
				org.jfree.chart.ChartPanel.this.zoomOutRangeMenuItem.setEnabled(isRangeZoomable);
			}
			if ((org.jfree.chart.ChartPanel.this.zoomResetRangeMenuItem) != null) {
				org.jfree.chart.ChartPanel.this.zoomResetRangeMenuItem.setEnabled(isRangeZoomable);
			}
			if ((org.jfree.chart.ChartPanel.this.zoomInBothMenuItem) != null) {
				org.jfree.chart.ChartPanel.this.zoomInBothMenuItem.setEnabled((isDomainZoomable && isRangeZoomable));
			}
			if ((org.jfree.chart.ChartPanel.this.zoomOutBothMenuItem) != null) {
				org.jfree.chart.ChartPanel.this.zoomOutBothMenuItem.setEnabled((isDomainZoomable && isRangeZoomable));
			}
			if ((org.jfree.chart.ChartPanel.this.zoomResetBothMenuItem) != null) {
				org.jfree.chart.ChartPanel.this.zoomResetBothMenuItem.setEnabled((isDomainZoomable && isRangeZoomable));
			}
			org.jfree.chart.ChartPanel.this.popup.show(org.jfree.chart.ChartPanel.this, x, y);
		}
	}

	public void updateUI() {
		if ((org.jfree.chart.ChartPanel.this.popup) != null) {
			javax.swing.SwingUtilities.updateComponentTreeUI(org.jfree.chart.ChartPanel.this.popup);
		}
		super.updateUI();
	}
}

