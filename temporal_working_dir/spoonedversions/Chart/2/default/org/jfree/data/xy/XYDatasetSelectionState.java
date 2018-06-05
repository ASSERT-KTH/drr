

package org.jfree.data.xy;


public interface XYDatasetSelectionState extends org.jfree.data.general.DatasetSelectionState {
	public int getSeriesCount();

	public int getItemCount(int series);

	public boolean isSelected(int series, int item);

	public void setSelected(int series, int item, boolean selected);

	public void setSelected(int series, int item, boolean selected, boolean notify);

	public void fireSelectionEvent();

	public void clearSelection();
}

