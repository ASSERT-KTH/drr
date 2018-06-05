

package org.jfree.data.category;


public class AbstractCategoryDataset extends org.jfree.data.general.AbstractDataset {
	private org.jfree.data.category.CategoryDatasetSelectionState selectionState;

	public AbstractCategoryDataset() {
		super();
	}

	public org.jfree.data.category.CategoryDatasetSelectionState getSelectionState() {
		return org.jfree.data.category.AbstractCategoryDataset.this.selectionState;
	}

	public void setSelectionState(org.jfree.data.category.CategoryDatasetSelectionState state) {
		org.jfree.data.category.AbstractCategoryDataset.this.selectionState = state;
		fireDatasetChanged(new org.jfree.chart.event.DatasetChangeInfo());
	}
}

