

package org.jfree.chart.ui;


public class ExtensionFileFilter extends javax.swing.filechooser.FileFilter {
	private java.lang.String description;

	private java.lang.String extension;

	public ExtensionFileFilter(java.lang.String description, java.lang.String extension) {
		org.jfree.chart.ui.ExtensionFileFilter.this.description = description;
		org.jfree.chart.ui.ExtensionFileFilter.this.extension = extension;
	}

	public boolean accept(java.io.File file) {
		if (file.isDirectory()) {
			return true;
		}
		java.lang.String name = file.getName().toLowerCase();
		if (name.endsWith(org.jfree.chart.ui.ExtensionFileFilter.this.extension)) {
			return true;
		}else {
			return false;
		}
	}

	public java.lang.String getDescription() {
		return org.jfree.chart.ui.ExtensionFileFilter.this.description;
	}
}

