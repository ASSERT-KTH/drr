

package org.jfree.data.pie;


public interface PieDatasetSelectionState extends org.jfree.data.general.DatasetSelectionState {
	public int getItemCount();

	public boolean isSelected(java.lang.Comparable key);

	public void setSelected(java.lang.Comparable key, boolean selected);

	public void setSelected(java.lang.Comparable key, boolean selected, boolean notify);

	public void clearSelection();

	public void fireSelectionEvent();
}

