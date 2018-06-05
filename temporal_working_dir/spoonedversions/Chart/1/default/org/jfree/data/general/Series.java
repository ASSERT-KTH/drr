

package org.jfree.data.general;


public abstract class Series implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = -6906561437538683581L;

	private java.lang.Comparable key;

	private java.lang.String description;

	private javax.swing.event.EventListenerList listeners;

	private java.beans.PropertyChangeSupport propertyChangeSupport;

	private boolean notify;

	protected Series(java.lang.Comparable key) {
		this(key, null);
	}

	protected Series(java.lang.Comparable key, java.lang.String description) {
		if (key == null) {
			throw new java.lang.IllegalArgumentException("Null 'key' argument.");
		}
		org.jfree.data.general.Series.this.key = key;
		org.jfree.data.general.Series.this.description = description;
		org.jfree.data.general.Series.this.listeners = new javax.swing.event.EventListenerList();
		org.jfree.data.general.Series.this.propertyChangeSupport = new java.beans.PropertyChangeSupport(org.jfree.data.general.Series.this);
		org.jfree.data.general.Series.this.notify = true;
	}

	public java.lang.Comparable getKey() {
		return org.jfree.data.general.Series.this.key;
	}

	public void setKey(java.lang.Comparable key) {
		if (key == null) {
			throw new java.lang.IllegalArgumentException("Null 'key' argument.");
		}
		java.lang.Comparable old = org.jfree.data.general.Series.this.key;
		org.jfree.data.general.Series.this.key = key;
		org.jfree.data.general.Series.this.propertyChangeSupport.firePropertyChange("Key", old, key);
	}

	public java.lang.String getDescription() {
		return org.jfree.data.general.Series.this.description;
	}

	public void setDescription(java.lang.String description) {
		java.lang.String old = org.jfree.data.general.Series.this.description;
		org.jfree.data.general.Series.this.description = description;
		org.jfree.data.general.Series.this.propertyChangeSupport.firePropertyChange("Description", old, description);
	}

	public boolean getNotify() {
		return org.jfree.data.general.Series.this.notify;
	}

	public void setNotify(boolean notify) {
		if ((org.jfree.data.general.Series.this.notify) != notify) {
			org.jfree.data.general.Series.this.notify = notify;
			fireSeriesChanged();
		}
	}

	public boolean isEmpty() {
		return (getItemCount()) == 0;
	}

	public abstract int getItemCount();

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.general.Series clone = ((org.jfree.data.general.Series) (super.clone()));
		clone.listeners = new javax.swing.event.EventListenerList();
		clone.propertyChangeSupport = new java.beans.PropertyChangeSupport(clone);
		return clone;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.data.general.Series.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.data.general.Series)) {
			return false;
		}
		org.jfree.data.general.Series that = ((org.jfree.data.general.Series) (obj));
		if (!(getKey().equals(that.getKey()))) {
			return false;
		}
		if (!(org.jfree.chart.util.ObjectUtilities.equal(getDescription(), that.getDescription()))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result;
		result = org.jfree.data.general.Series.this.key.hashCode();
		result = (29 * result) + ((org.jfree.data.general.Series.this.description) != null ? org.jfree.data.general.Series.this.description.hashCode() : 0);
		return result;
	}

	public void addChangeListener(org.jfree.data.event.SeriesChangeListener listener) {
		org.jfree.data.general.Series.this.listeners.add(org.jfree.data.event.SeriesChangeListener.class, listener);
	}

	public void removeChangeListener(org.jfree.data.event.SeriesChangeListener listener) {
		org.jfree.data.general.Series.this.listeners.remove(org.jfree.data.event.SeriesChangeListener.class, listener);
	}

	public void fireSeriesChanged() {
		if (org.jfree.data.general.Series.this.notify) {
			notifyListeners(new org.jfree.data.event.SeriesChangeEvent(org.jfree.data.general.Series.this));
		}
	}

	protected void notifyListeners(org.jfree.data.event.SeriesChangeEvent event) {
		java.lang.Object[] listenerList = org.jfree.data.general.Series.this.listeners.getListenerList();
		for (int i = (listenerList.length) - 2; i >= 0; i -= 2) {
			if ((listenerList[i]) == (org.jfree.data.event.SeriesChangeListener.class)) {
				((org.jfree.data.event.SeriesChangeListener) (listenerList[(i + 1)])).seriesChanged(event);
			}
		}
	}

	public void addPropertyChangeListener(java.beans.PropertyChangeListener listener) {
		org.jfree.data.general.Series.this.propertyChangeSupport.addPropertyChangeListener(listener);
	}

	public void removePropertyChangeListener(java.beans.PropertyChangeListener listener) {
		org.jfree.data.general.Series.this.propertyChangeSupport.removePropertyChangeListener(listener);
	}

	protected void firePropertyChange(java.lang.String property, java.lang.Object oldValue, java.lang.Object newValue) {
		org.jfree.data.general.Series.this.propertyChangeSupport.firePropertyChange(property, oldValue, newValue);
	}
}

