

package org.jfree.chart.plot;


public abstract class AbstractPieLabelDistributor implements java.io.Serializable {
	protected java.util.List labels;

	public AbstractPieLabelDistributor() {
		org.jfree.chart.plot.AbstractPieLabelDistributor.this.labels = new java.util.ArrayList();
	}

	public org.jfree.chart.plot.PieLabelRecord getPieLabelRecord(int index) {
		return ((org.jfree.chart.plot.PieLabelRecord) (org.jfree.chart.plot.AbstractPieLabelDistributor.this.labels.get(index)));
	}

	public void addPieLabelRecord(org.jfree.chart.plot.PieLabelRecord record) {
		if (record == null) {
			throw new java.lang.IllegalArgumentException("Null 'record' argument.");
		}
		org.jfree.chart.plot.AbstractPieLabelDistributor.this.labels.add(record);
	}

	public int getItemCount() {
		return org.jfree.chart.plot.AbstractPieLabelDistributor.this.labels.size();
	}

	public void clear() {
		org.jfree.chart.plot.AbstractPieLabelDistributor.this.labels.clear();
	}

	public abstract void distributeLabels(double minY, double height);
}

