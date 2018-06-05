

package org.jfree.chart.annotations;


public abstract class AbstractAnnotation implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.annotations.Annotation {
	private transient javax.swing.event.EventListenerList listenerList;

	private boolean notify = true;

	protected AbstractAnnotation() {
		org.jfree.chart.annotations.AbstractAnnotation.this.listenerList = new javax.swing.event.EventListenerList();
	}

	public void addChangeListener(org.jfree.chart.event.AnnotationChangeListener listener) {
		org.jfree.chart.annotations.AbstractAnnotation.this.listenerList.add(org.jfree.chart.event.AnnotationChangeListener.class, listener);
	}

	public void removeChangeListener(org.jfree.chart.event.AnnotationChangeListener listener) {
		org.jfree.chart.annotations.AbstractAnnotation.this.listenerList.remove(org.jfree.chart.event.AnnotationChangeListener.class, listener);
	}

	public boolean hasListener(java.util.EventListener listener) {
		java.util.List list = java.util.Arrays.asList(org.jfree.chart.annotations.AbstractAnnotation.this.listenerList.getListenerList());
		return list.contains(listener);
	}

	protected void fireAnnotationChanged() {
		if (notify) {
			notifyListeners(new org.jfree.chart.event.AnnotationChangeEvent(org.jfree.chart.annotations.AbstractAnnotation.this, org.jfree.chart.annotations.AbstractAnnotation.this));
		}
	}

	protected void notifyListeners(org.jfree.chart.event.AnnotationChangeEvent event) {
		java.lang.Object[] listeners = org.jfree.chart.annotations.AbstractAnnotation.this.listenerList.getListenerList();
		for (int i = (listeners.length) - 2; i >= 0; i -= 2) {
			if ((listeners[i]) == (org.jfree.chart.event.AnnotationChangeListener.class)) {
				((org.jfree.chart.event.AnnotationChangeListener) (listeners[(i + 1)])).annotationChanged(event);
			}
		}
	}

	public boolean getNotify() {
		return org.jfree.chart.annotations.AbstractAnnotation.this.notify;
	}

	public void setNotify(boolean flag) {
		org.jfree.chart.annotations.AbstractAnnotation.this.notify = flag;
		if (notify) {
			fireAnnotationChanged();
		}
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.annotations.AbstractAnnotation clone = ((org.jfree.chart.annotations.AbstractAnnotation) (super.clone()));
		clone.listenerList = new javax.swing.event.EventListenerList();
		return clone;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.annotations.AbstractAnnotation.this.listenerList = new javax.swing.event.EventListenerList();
	}
}

