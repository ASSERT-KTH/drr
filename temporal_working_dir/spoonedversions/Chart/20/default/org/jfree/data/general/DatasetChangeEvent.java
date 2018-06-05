

package org.jfree.data.general;


public class DatasetChangeEvent extends java.util.EventObject {
	private org.jfree.data.general.Dataset dataset;

	public DatasetChangeEvent(java.lang.Object source, org.jfree.data.general.Dataset dataset) {
		super(source);
		org.jfree.data.general.DatasetChangeEvent.this.dataset = dataset;
	}

	public org.jfree.data.general.Dataset getDataset() {
		return org.jfree.data.general.DatasetChangeEvent.this.dataset;
	}
}

