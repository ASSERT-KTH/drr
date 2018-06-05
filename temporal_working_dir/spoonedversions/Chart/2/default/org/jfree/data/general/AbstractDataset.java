

package org.jfree.data.general;


public abstract class AbstractDataset implements java.io.ObjectInputValidation , java.io.Serializable , java.lang.Cloneable , org.jfree.data.general.Dataset {
	private static final long serialVersionUID = 1918768939869230744L;

	private org.jfree.data.general.DatasetGroup group;

	private transient javax.swing.event.EventListenerList listenerList;

	protected AbstractDataset() {
		org.jfree.data.general.AbstractDataset.this.group = new org.jfree.data.general.DatasetGroup();
		org.jfree.data.general.AbstractDataset.this.listenerList = new javax.swing.event.EventListenerList();
	}

	public org.jfree.data.general.DatasetGroup getGroup() {
		return org.jfree.data.general.AbstractDataset.this.group;
	}

	public void setGroup(org.jfree.data.general.DatasetGroup group) {
		if (group == null) {
			throw new java.lang.IllegalArgumentException("Null 'group' argument.");
		}
		org.jfree.data.general.AbstractDataset.this.group = group;
	}

	public void addChangeListener(org.jfree.data.event.DatasetChangeListener listener) {
		org.jfree.data.general.AbstractDataset.this.listenerList.add(org.jfree.data.event.DatasetChangeListener.class, listener);
	}

	public void removeChangeListener(org.jfree.data.event.DatasetChangeListener listener) {
		org.jfree.data.general.AbstractDataset.this.listenerList.remove(org.jfree.data.event.DatasetChangeListener.class, listener);
	}

	public boolean hasListener(java.util.EventListener listener) {
		java.util.List list = java.util.Arrays.asList(org.jfree.data.general.AbstractDataset.this.listenerList.getListenerList());
		return list.contains(listener);
	}

	protected void fireDatasetChanged(org.jfree.chart.event.DatasetChangeInfo info) {
		notifyListeners(new org.jfree.data.event.DatasetChangeEvent(org.jfree.data.general.AbstractDataset.this, org.jfree.data.general.AbstractDataset.this, info));
	}

	protected void notifyListeners(org.jfree.data.event.DatasetChangeEvent event) {
		java.lang.Object[] listeners = org.jfree.data.general.AbstractDataset.this.listenerList.getListenerList();
		for (int i = (listeners.length) - 2; i >= 0; i -= 2) {
			if ((listeners[i]) == (org.jfree.data.event.DatasetChangeListener.class)) {
				((org.jfree.data.event.DatasetChangeListener) (listeners[(i + 1)])).datasetChanged(event);
			}
		}
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.data.general.AbstractDataset clone = ((org.jfree.data.general.AbstractDataset) (super.clone()));
		clone.listenerList = new javax.swing.event.EventListenerList();
		return clone;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.data.general.AbstractDataset.this.listenerList = new javax.swing.event.EventListenerList();
		stream.registerValidation(org.jfree.data.general.AbstractDataset.this, 10);
	}

	public void validateObject() throws java.io.InvalidObjectException {
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}
}

