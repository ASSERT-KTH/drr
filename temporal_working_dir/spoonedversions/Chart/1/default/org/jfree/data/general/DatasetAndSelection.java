

package org.jfree.data.general;


public class DatasetAndSelection {
	private org.jfree.data.general.Dataset dataset;

	private org.jfree.data.general.DatasetSelectionState selection;

	public DatasetAndSelection(org.jfree.data.general.Dataset dataset, org.jfree.data.general.DatasetSelectionState selection) {
		org.jfree.data.general.DatasetAndSelection.this.dataset = dataset;
		org.jfree.data.general.DatasetAndSelection.this.selection = selection;
	}

	public org.jfree.data.general.Dataset getDataset() {
		return org.jfree.data.general.DatasetAndSelection.this.dataset;
	}

	public org.jfree.data.general.DatasetSelectionState getSelection() {
		return org.jfree.data.general.DatasetAndSelection.this.selection;
	}
}

