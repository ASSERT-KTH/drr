

package org.jfree.chart.plot.dial;


public class DialPlot extends org.jfree.chart.plot.Plot implements org.jfree.chart.plot.dial.DialLayerChangeListener {
	private org.jfree.chart.plot.dial.DialLayer background;

	private org.jfree.chart.plot.dial.DialLayer cap;

	private org.jfree.chart.plot.dial.DialFrame dialFrame;

	private org.jfree.chart.util.ObjectList datasets;

	private org.jfree.chart.util.ObjectList scales;

	private org.jfree.chart.util.ObjectList datasetToScaleMap;

	private java.util.List layers;

	private java.util.List pointers;

	private double viewX;

	private double viewY;

	private double viewW;

	private double viewH;

	public DialPlot() {
		this(null);
	}

	public DialPlot(org.jfree.data.general.ValueDataset dataset) {
		org.jfree.chart.plot.dial.DialPlot.this.background = null;
		org.jfree.chart.plot.dial.DialPlot.this.cap = null;
		org.jfree.chart.plot.dial.DialPlot.this.dialFrame = new org.jfree.chart.plot.dial.ArcDialFrame();
		org.jfree.chart.plot.dial.DialPlot.this.datasets = new org.jfree.chart.util.ObjectList();
		if (dataset != null) {
			org.jfree.chart.plot.dial.DialPlot.this.setDataset(dataset);
		}
		org.jfree.chart.plot.dial.DialPlot.this.scales = new org.jfree.chart.util.ObjectList();
		org.jfree.chart.plot.dial.DialPlot.this.datasetToScaleMap = new org.jfree.chart.util.ObjectList();
		org.jfree.chart.plot.dial.DialPlot.this.layers = new java.util.ArrayList();
		org.jfree.chart.plot.dial.DialPlot.this.pointers = new java.util.ArrayList();
		org.jfree.chart.plot.dial.DialPlot.this.viewX = 0.0;
		org.jfree.chart.plot.dial.DialPlot.this.viewY = 0.0;
		org.jfree.chart.plot.dial.DialPlot.this.viewW = 1.0;
		org.jfree.chart.plot.dial.DialPlot.this.viewH = 1.0;
	}

	public org.jfree.chart.plot.dial.DialLayer getBackground() {
		return org.jfree.chart.plot.dial.DialPlot.this.background;
	}

	public void setBackground(org.jfree.chart.plot.dial.DialLayer background) {
		if ((org.jfree.chart.plot.dial.DialPlot.this.background) != null) {
			org.jfree.chart.plot.dial.DialPlot.this.background.removeChangeListener(org.jfree.chart.plot.dial.DialPlot.this);
		}
		org.jfree.chart.plot.dial.DialPlot.this.background = background;
		if (background != null) {
			background.addChangeListener(org.jfree.chart.plot.dial.DialPlot.this);
		}
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.dial.DialPlot.this));
	}

	public org.jfree.chart.plot.dial.DialLayer getCap() {
		return org.jfree.chart.plot.dial.DialPlot.this.cap;
	}

	public void setCap(org.jfree.chart.plot.dial.DialLayer cap) {
		if ((org.jfree.chart.plot.dial.DialPlot.this.cap) != null) {
			org.jfree.chart.plot.dial.DialPlot.this.cap.removeChangeListener(org.jfree.chart.plot.dial.DialPlot.this);
		}
		org.jfree.chart.plot.dial.DialPlot.this.cap = cap;
		if (cap != null) {
			cap.addChangeListener(org.jfree.chart.plot.dial.DialPlot.this);
		}
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.dial.DialPlot.this));
	}

	public org.jfree.chart.plot.dial.DialFrame getDialFrame() {
		return org.jfree.chart.plot.dial.DialPlot.this.dialFrame;
	}

	public void setDialFrame(org.jfree.chart.plot.dial.DialFrame frame) {
		if (frame == null) {
			throw new java.lang.IllegalArgumentException("Null 'frame' argument.");
		}
		org.jfree.chart.plot.dial.DialPlot.this.dialFrame.removeChangeListener(org.jfree.chart.plot.dial.DialPlot.this);
		org.jfree.chart.plot.dial.DialPlot.this.dialFrame = frame;
		frame.addChangeListener(org.jfree.chart.plot.dial.DialPlot.this);
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.dial.DialPlot.this));
	}

	public double getViewX() {
		return org.jfree.chart.plot.dial.DialPlot.this.viewX;
	}

	public double getViewY() {
		return org.jfree.chart.plot.dial.DialPlot.this.viewY;
	}

	public double getViewWidth() {
		return org.jfree.chart.plot.dial.DialPlot.this.viewW;
	}

	public double getViewHeight() {
		return org.jfree.chart.plot.dial.DialPlot.this.viewH;
	}

	public void setView(double x, double y, double w, double h) {
		org.jfree.chart.plot.dial.DialPlot.this.viewX = x;
		org.jfree.chart.plot.dial.DialPlot.this.viewY = y;
		org.jfree.chart.plot.dial.DialPlot.this.viewW = w;
		org.jfree.chart.plot.dial.DialPlot.this.viewH = h;
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.dial.DialPlot.this));
	}

	public void addLayer(org.jfree.chart.plot.dial.DialLayer layer) {
		if (layer == null) {
			throw new java.lang.IllegalArgumentException("Null 'layer' argument.");
		}
		org.jfree.chart.plot.dial.DialPlot.this.layers.add(layer);
		layer.addChangeListener(org.jfree.chart.plot.dial.DialPlot.this);
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.dial.DialPlot.this));
	}

	public int getLayerIndex(org.jfree.chart.plot.dial.DialLayer layer) {
		if (layer == null) {
			throw new java.lang.IllegalArgumentException("Null 'layer' argument.");
		}
		return org.jfree.chart.plot.dial.DialPlot.this.layers.indexOf(layer);
	}

	public void removeLayer(int index) {
		org.jfree.chart.plot.dial.DialLayer layer = ((org.jfree.chart.plot.dial.DialLayer) (org.jfree.chart.plot.dial.DialPlot.this.layers.get(index)));
		if (layer != null) {
			layer.removeChangeListener(org.jfree.chart.plot.dial.DialPlot.this);
		}
		org.jfree.chart.plot.dial.DialPlot.this.layers.remove(index);
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.dial.DialPlot.this));
	}

	public void removeLayer(org.jfree.chart.plot.dial.DialLayer layer) {
		removeLayer(getLayerIndex(layer));
	}

	public void addPointer(org.jfree.chart.plot.dial.DialPointer pointer) {
		if (pointer == null) {
			throw new java.lang.IllegalArgumentException("Null 'pointer' argument.");
		}
		org.jfree.chart.plot.dial.DialPlot.this.pointers.add(pointer);
		pointer.addChangeListener(org.jfree.chart.plot.dial.DialPlot.this);
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.dial.DialPlot.this));
	}

	public int getPointerIndex(org.jfree.chart.plot.dial.DialPointer pointer) {
		if (pointer == null) {
			throw new java.lang.IllegalArgumentException("Null 'pointer' argument.");
		}
		return org.jfree.chart.plot.dial.DialPlot.this.pointers.indexOf(pointer);
	}

	public void removePointer(int index) {
		org.jfree.chart.plot.dial.DialPointer pointer = ((org.jfree.chart.plot.dial.DialPointer) (org.jfree.chart.plot.dial.DialPlot.this.pointers.get(index)));
		if (pointer != null) {
			pointer.removeChangeListener(org.jfree.chart.plot.dial.DialPlot.this);
		}
		org.jfree.chart.plot.dial.DialPlot.this.pointers.remove(index);
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.dial.DialPlot.this));
	}

	public void removePointer(org.jfree.chart.plot.dial.DialPointer pointer) {
		removeLayer(getPointerIndex(pointer));
	}

	public org.jfree.chart.plot.dial.DialPointer getPointerForDataset(int datasetIndex) {
		org.jfree.chart.plot.dial.DialPointer result = null;
		java.util.Iterator iterator = org.jfree.chart.plot.dial.DialPlot.this.pointers.iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.plot.dial.DialPointer p = ((org.jfree.chart.plot.dial.DialPointer) (iterator.next()));
			if ((p.getDatasetIndex()) == datasetIndex) {
				return p;
			}
		} 
		return result;
	}

	public org.jfree.data.general.ValueDataset getDataset() {
		return getDataset(0);
	}

	public org.jfree.data.general.ValueDataset getDataset(int index) {
		org.jfree.data.general.ValueDataset result = null;
		if ((org.jfree.chart.plot.dial.DialPlot.this.datasets.size()) > index) {
			result = ((org.jfree.data.general.ValueDataset) (org.jfree.chart.plot.dial.DialPlot.this.datasets.get(index)));
		}
		return result;
	}

	public void setDataset(org.jfree.data.general.ValueDataset dataset) {
		setDataset(0, dataset);
	}

	public void setDataset(int index, org.jfree.data.general.ValueDataset dataset) {
		org.jfree.data.general.ValueDataset existing = ((org.jfree.data.general.ValueDataset) (org.jfree.chart.plot.dial.DialPlot.this.datasets.get(index)));
		if (existing != null) {
			existing.removeChangeListener(org.jfree.chart.plot.dial.DialPlot.this);
		}
		org.jfree.chart.plot.dial.DialPlot.this.datasets.set(index, dataset);
		if (dataset != null) {
			dataset.addChangeListener(org.jfree.chart.plot.dial.DialPlot.this);
		}
		org.jfree.data.general.DatasetChangeEvent event = new org.jfree.data.general.DatasetChangeEvent(org.jfree.chart.plot.dial.DialPlot.this, dataset);
		datasetChanged(event);
	}

	public int getDatasetCount() {
		return org.jfree.chart.plot.dial.DialPlot.this.datasets.size();
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.awt.geom.Point2D anchor, org.jfree.chart.plot.PlotState parentState, org.jfree.chart.plot.PlotRenderingInfo info) {
		java.awt.geom.Rectangle2D frame = viewToFrame(area);
		if (((org.jfree.chart.plot.dial.DialPlot.this.background) != null) && (org.jfree.chart.plot.dial.DialPlot.this.background.isVisible())) {
			if (org.jfree.chart.plot.dial.DialPlot.this.background.isClippedToWindow()) {
				java.awt.Shape savedClip = g2.getClip();
				g2.setClip(org.jfree.chart.plot.dial.DialPlot.this.dialFrame.getWindow(frame));
				org.jfree.chart.plot.dial.DialPlot.this.background.draw(g2, org.jfree.chart.plot.dial.DialPlot.this, frame, area);
				g2.setClip(savedClip);
			}else {
				org.jfree.chart.plot.dial.DialPlot.this.background.draw(g2, org.jfree.chart.plot.dial.DialPlot.this, frame, area);
			}
		}
		java.util.Iterator iterator = org.jfree.chart.plot.dial.DialPlot.this.layers.iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.plot.dial.DialLayer current = ((org.jfree.chart.plot.dial.DialLayer) (iterator.next()));
			if (current.isVisible()) {
				if (current.isClippedToWindow()) {
					java.awt.Shape savedClip = g2.getClip();
					g2.setClip(org.jfree.chart.plot.dial.DialPlot.this.dialFrame.getWindow(frame));
					current.draw(g2, org.jfree.chart.plot.dial.DialPlot.this, frame, area);
					g2.setClip(savedClip);
				}else {
					current.draw(g2, org.jfree.chart.plot.dial.DialPlot.this, frame, area);
				}
			}
		} 
		iterator = org.jfree.chart.plot.dial.DialPlot.this.pointers.iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.plot.dial.DialPointer current = ((org.jfree.chart.plot.dial.DialPointer) (iterator.next()));
			if (current.isVisible()) {
				if (current.isClippedToWindow()) {
					java.awt.Shape savedClip = g2.getClip();
					g2.setClip(org.jfree.chart.plot.dial.DialPlot.this.dialFrame.getWindow(frame));
					current.draw(g2, org.jfree.chart.plot.dial.DialPlot.this, frame, area);
					g2.setClip(savedClip);
				}else {
					current.draw(g2, org.jfree.chart.plot.dial.DialPlot.this, frame, area);
				}
			}
		} 
		if (((org.jfree.chart.plot.dial.DialPlot.this.cap) != null) && (org.jfree.chart.plot.dial.DialPlot.this.cap.isVisible())) {
			if (org.jfree.chart.plot.dial.DialPlot.this.cap.isClippedToWindow()) {
				java.awt.Shape savedClip = g2.getClip();
				g2.setClip(org.jfree.chart.plot.dial.DialPlot.this.dialFrame.getWindow(frame));
				org.jfree.chart.plot.dial.DialPlot.this.cap.draw(g2, org.jfree.chart.plot.dial.DialPlot.this, frame, area);
				g2.setClip(savedClip);
			}else {
				org.jfree.chart.plot.dial.DialPlot.this.cap.draw(g2, org.jfree.chart.plot.dial.DialPlot.this, frame, area);
			}
		}
		if (org.jfree.chart.plot.dial.DialPlot.this.dialFrame.isVisible()) {
			org.jfree.chart.plot.dial.DialPlot.this.dialFrame.draw(g2, org.jfree.chart.plot.dial.DialPlot.this, frame, area);
		}
	}

	private java.awt.geom.Rectangle2D viewToFrame(java.awt.geom.Rectangle2D view) {
		double width = (view.getWidth()) / (org.jfree.chart.plot.dial.DialPlot.this.viewW);
		double height = (view.getHeight()) / (org.jfree.chart.plot.dial.DialPlot.this.viewH);
		double x = (view.getX()) - (width * (org.jfree.chart.plot.dial.DialPlot.this.viewX));
		double y = (view.getY()) - (height * (org.jfree.chart.plot.dial.DialPlot.this.viewY));
		return new java.awt.geom.Rectangle2D.Double(x, y, width, height);
	}

	public double getValue(int datasetIndex) {
		double result = java.lang.Double.NaN;
		org.jfree.data.general.ValueDataset dataset = getDataset(datasetIndex);
		if (dataset != null) {
			java.lang.Number n = dataset.getValue();
			if (n != null) {
				result = n.doubleValue();
			}
		}
		return result;
	}

	public void addScale(int index, org.jfree.chart.plot.dial.DialScale scale) {
		if (scale == null) {
			throw new java.lang.IllegalArgumentException("Null 'scale' argument.");
		}
		org.jfree.chart.plot.dial.DialScale existing = ((org.jfree.chart.plot.dial.DialScale) (org.jfree.chart.plot.dial.DialPlot.this.scales.get(index)));
		if (existing != null) {
			removeLayer(existing);
		}
		org.jfree.chart.plot.dial.DialPlot.this.layers.add(scale);
		org.jfree.chart.plot.dial.DialPlot.this.scales.set(index, scale);
		scale.addChangeListener(org.jfree.chart.plot.dial.DialPlot.this);
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.dial.DialPlot.this));
	}

	public org.jfree.chart.plot.dial.DialScale getScale(int index) {
		org.jfree.chart.plot.dial.DialScale result = null;
		if ((org.jfree.chart.plot.dial.DialPlot.this.scales.size()) > index) {
			result = ((org.jfree.chart.plot.dial.DialScale) (org.jfree.chart.plot.dial.DialPlot.this.scales.get(index)));
		}
		return result;
	}

	public void mapDatasetToScale(int index, int scaleIndex) {
		org.jfree.chart.plot.dial.DialPlot.this.datasetToScaleMap.set(index, new java.lang.Integer(scaleIndex));
		notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.dial.DialPlot.this));
	}

	public org.jfree.chart.plot.dial.DialScale getScaleForDataset(int datasetIndex) {
		org.jfree.chart.plot.dial.DialScale result = ((org.jfree.chart.plot.dial.DialScale) (org.jfree.chart.plot.dial.DialPlot.this.scales.get(0)));
		java.lang.Integer scaleIndex = ((java.lang.Integer) (org.jfree.chart.plot.dial.DialPlot.this.datasetToScaleMap.get(datasetIndex)));
		if (scaleIndex != null) {
			result = getScale(scaleIndex.intValue());
		}
		return result;
	}

	public static java.awt.geom.Rectangle2D rectangleByRadius(java.awt.geom.Rectangle2D rect, double radiusW, double radiusH) {
		if (rect == null) {
			throw new java.lang.IllegalArgumentException("Null 'rect' argument.");
		}
		double x = rect.getCenterX();
		double y = rect.getCenterY();
		double w = (rect.getWidth()) * radiusW;
		double h = (rect.getHeight()) * radiusH;
		return new java.awt.geom.Rectangle2D.Double((x - (w / 2.0)), (y - (h / 2.0)), w, h);
	}

	public void dialLayerChanged(org.jfree.chart.plot.dial.DialLayerChangeEvent event) {
		org.jfree.chart.plot.dial.DialPlot.this.notifyListeners(new org.jfree.chart.event.PlotChangeEvent(org.jfree.chart.plot.dial.DialPlot.this));
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.dial.DialPlot.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.dial.DialPlot)) {
			return false;
		}
		org.jfree.chart.plot.dial.DialPlot that = ((org.jfree.chart.plot.dial.DialPlot) (obj));
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.dial.DialPlot.this.background, that.background))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.plot.dial.DialPlot.this.cap, that.cap))) {
			return false;
		}
		if (!(org.jfree.chart.plot.dial.DialPlot.this.dialFrame.equals(that.dialFrame))) {
			return false;
		}
		if ((org.jfree.chart.plot.dial.DialPlot.this.viewX) != (that.viewX)) {
			return false;
		}
		if ((org.jfree.chart.plot.dial.DialPlot.this.viewY) != (that.viewY)) {
			return false;
		}
		if ((org.jfree.chart.plot.dial.DialPlot.this.viewW) != (that.viewW)) {
			return false;
		}
		if ((org.jfree.chart.plot.dial.DialPlot.this.viewH) != (that.viewH)) {
			return false;
		}
		if (!(org.jfree.chart.plot.dial.DialPlot.this.layers.equals(that.layers))) {
			return false;
		}
		if (!(org.jfree.chart.plot.dial.DialPlot.this.pointers.equals(that.pointers))) {
			return false;
		}
		return super.equals(obj);
	}

	public int hashCode() {
		int result = 193;
		result = (37 * result) + (org.jfree.chart.util.ObjectUtilities.hashCode(org.jfree.chart.plot.dial.DialPlot.this.background));
		result = (37 * result) + (org.jfree.chart.util.ObjectUtilities.hashCode(org.jfree.chart.plot.dial.DialPlot.this.cap));
		result = (37 * result) + (org.jfree.chart.plot.dial.DialPlot.this.dialFrame.hashCode());
		long temp = java.lang.Double.doubleToLongBits(org.jfree.chart.plot.dial.DialPlot.this.viewX);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.plot.dial.DialPlot.this.viewY);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.plot.dial.DialPlot.this.viewW);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		temp = java.lang.Double.doubleToLongBits(org.jfree.chart.plot.dial.DialPlot.this.viewH);
		result = (37 * result) + ((int) (temp ^ (temp >>> 32)));
		return result;
	}

	public java.lang.String getPlotType() {
		return "DialPlot";
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
	}
}

