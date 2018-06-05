

package org.jfree.data.general;


public interface Dataset {
	public void addChangeListener(org.jfree.data.general.DatasetChangeListener listener);

	public void removeChangeListener(org.jfree.data.general.DatasetChangeListener listener);

	public org.jfree.data.general.DatasetGroup getGroup();

	public void setGroup(org.jfree.data.general.DatasetGroup group);
}

