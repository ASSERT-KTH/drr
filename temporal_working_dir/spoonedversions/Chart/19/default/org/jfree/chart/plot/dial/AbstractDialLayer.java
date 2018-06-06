

package org.jfree.chart.plot.dial;


public abstract class AbstractDialLayer implements org.jfree.chart.plot.dial.DialLayer {
	private boolean visible;

	private transient javax.swing.event.EventListenerList listenerList;

	protected AbstractDialLayer() {
		org.jfree.chart.plot.dial.AbstractDialLayer.this.visible = true;
		org.jfree.chart.plot.dial.AbstractDialLayer.this.listenerList = new javax.swing.event.EventListenerList();
	}

	public boolean isVisible() {
		return org.jfree.chart.plot.dial.AbstractDialLayer.this.visible;
	}

	public void setVisible(boolean visible) {
		org.jfree.chart.plot.dial.AbstractDialLayer.this.visible = visible;
		notifyListeners(new org.jfree.chart.plot.dial.DialLayerChangeEvent(org.jfree.chart.plot.dial.AbstractDialLayer.this));
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.plot.dial.AbstractDialLayer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.plot.dial.AbstractDialLayer)) {
			return false;
		}
		org.jfree.chart.plot.dial.AbstractDialLayer that = ((org.jfree.chart.plot.dial.AbstractDialLayer) (obj));
		return (org.jfree.chart.plot.dial.AbstractDialLayer.this.visible) == (that.visible);
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.plot.dial.AbstractDialLayer clone = ((org.jfree.chart.plot.dial.AbstractDialLayer) (super.clone()));
		clone.listenerList = new javax.swing.event.EventListenerList();
		return clone;
	}

	public void addChangeListener(org.jfree.chart.plot.dial.DialLayerChangeListener listener) {
		org.jfree.chart.plot.dial.AbstractDialLayer.this.listenerList.add(org.jfree.chart.plot.dial.DialLayerChangeListener.class, listener);
	}

	public void removeChangeListener(org.jfree.chart.plot.dial.DialLayerChangeListener listener) {
		org.jfree.chart.plot.dial.AbstractDialLayer.this.listenerList.remove(org.jfree.chart.plot.dial.DialLayerChangeListener.class, listener);
	}

	public boolean hasListener(java.util.EventListener listener) {
		java.util.List list = java.util.Arrays.asList(org.jfree.chart.plot.dial.AbstractDialLayer.this.listenerList.getListenerList());
		return list.contains(listener);
	}

	protected void notifyListeners(org.jfree.chart.plot.dial.DialLayerChangeEvent event) {
		java.lang.Object[] listeners = org.jfree.chart.plot.dial.AbstractDialLayer.this.listenerList.getListenerList();
		for (int i = (listeners.length) - 2; i >= 0; i -= 2) {
			if ((listeners[i]) == (org.jfree.chart.plot.dial.DialLayerChangeListener.class)) {
				((org.jfree.chart.plot.dial.DialLayerChangeListener) (listeners[(i + 1)])).dialLayerChanged(event);
			}
		}
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.plot.dial.AbstractDialLayer.this.listenerList = new javax.swing.event.EventListenerList();
	}
}

