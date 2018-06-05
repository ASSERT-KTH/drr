

package org.jfree.data.event;


public class DatasetChangeEvent extends java.util.EventObject {
	private org.jfree.data.general.Dataset dataset;

	private org.jfree.chart.event.DatasetChangeInfo info;

	public DatasetChangeEvent(java.lang.Object source, org.jfree.data.general.Dataset dataset, org.jfree.chart.event.DatasetChangeInfo info) {
		super(source);
		if (info == null) {
			throw new java.lang.IllegalArgumentException("Null 'info' argument.");
		}
		org.jfree.data.event.DatasetChangeEvent.this.dataset = dataset;
		org.jfree.data.event.DatasetChangeEvent.this.info = info;
	}

	public org.jfree.data.general.Dataset getDataset() {
		return org.jfree.data.event.DatasetChangeEvent.this.dataset;
	}

	public org.jfree.chart.event.DatasetChangeInfo getInfo() {
		return org.jfree.data.event.DatasetChangeEvent.this.info;
	}
}

