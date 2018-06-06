

package org.jfree.data.pie;


public class AbstractPieDataset extends org.jfree.data.general.AbstractDataset implements org.jfree.data.pie.SelectablePieDataset {
	private org.jfree.data.pie.PieDatasetSelectionState selectionState;

	public AbstractPieDataset() {
		super();
	}

	public org.jfree.data.pie.PieDatasetSelectionState getSelectionState() {
		return org.jfree.data.pie.AbstractPieDataset.this.selectionState;
	}

	public void setSelectionState(org.jfree.data.pie.PieDatasetSelectionState state) {
		org.jfree.data.pie.AbstractPieDataset.this.selectionState = state;
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}
}

