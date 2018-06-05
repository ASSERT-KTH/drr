

package org.jfree.chart.panel;


public class AbstractOverlay {
	private transient javax.swing.event.EventListenerList changeListeners;

	public AbstractOverlay() {
		org.jfree.chart.panel.AbstractOverlay.this.changeListeners = new javax.swing.event.EventListenerList();
	}

	public void addChangeListener(org.jfree.chart.event.OverlayChangeListener listener) {
		if (listener == null) {
			throw new java.lang.IllegalArgumentException("Null 'listener' argument.");
		}
		org.jfree.chart.panel.AbstractOverlay.this.changeListeners.add(org.jfree.chart.event.OverlayChangeListener.class, listener);
	}

	public void removeChangeListener(org.jfree.chart.event.OverlayChangeListener listener) {
		if (listener == null) {
			throw new java.lang.IllegalArgumentException("Null 'listener' argument.");
		}
		org.jfree.chart.panel.AbstractOverlay.this.changeListeners.remove(org.jfree.chart.event.OverlayChangeListener.class, listener);
	}

	public void fireOverlayChanged() {
		org.jfree.chart.event.OverlayChangeEvent event = new org.jfree.chart.event.OverlayChangeEvent(org.jfree.chart.panel.AbstractOverlay.this);
		notifyListeners(event);
	}

	protected void notifyListeners(org.jfree.chart.event.OverlayChangeEvent event) {
		java.lang.Object[] listeners = org.jfree.chart.panel.AbstractOverlay.this.changeListeners.getListenerList();
		for (int i = (listeners.length) - 2; i >= 0; i -= 2) {
			if ((listeners[i]) == (org.jfree.chart.event.OverlayChangeListener.class)) {
				((org.jfree.chart.event.OverlayChangeListener) (listeners[(i + 1)])).overlayChanged(event);
			}
		}
	}
}

