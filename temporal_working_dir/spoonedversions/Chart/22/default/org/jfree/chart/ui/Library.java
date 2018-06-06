

package org.jfree.chart.ui;


public class Library {
	private java.lang.String name;

	private java.lang.String version;

	private java.lang.String licenceName;

	private java.lang.String info;

	public Library(java.lang.String name, java.lang.String version, java.lang.String licence, java.lang.String info) {
		org.jfree.chart.ui.Library.this.name = name;
		org.jfree.chart.ui.Library.this.version = version;
		org.jfree.chart.ui.Library.this.licenceName = licence;
		org.jfree.chart.ui.Library.this.info = info;
	}

	protected Library() {
	}

	public java.lang.String getName() {
		return org.jfree.chart.ui.Library.this.name;
	}

	public java.lang.String getVersion() {
		return org.jfree.chart.ui.Library.this.version;
	}

	public java.lang.String getLicenceName() {
		return org.jfree.chart.ui.Library.this.licenceName;
	}

	public java.lang.String getInfo() {
		return org.jfree.chart.ui.Library.this.info;
	}

	protected void setInfo(java.lang.String info) {
		org.jfree.chart.ui.Library.this.info = info;
	}

	protected void setLicenceName(java.lang.String licenceName) {
		org.jfree.chart.ui.Library.this.licenceName = licenceName;
	}

	protected void setName(java.lang.String name) {
		org.jfree.chart.ui.Library.this.name = name;
	}

	protected void setVersion(java.lang.String version) {
		org.jfree.chart.ui.Library.this.version = version;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.chart.ui.Library.this) == obj) {
			return true;
		}
		if ((obj == null) || ((getClass()) != (obj.getClass()))) {
			return false;
		}
		org.jfree.chart.ui.Library library = ((org.jfree.chart.ui.Library) (obj));
		if ((org.jfree.chart.ui.Library.this.name) != null ? !(org.jfree.chart.ui.Library.this.name.equals(library.name)) : (library.name) != null) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return (org.jfree.chart.ui.Library.this.name) != null ? org.jfree.chart.ui.Library.this.name.hashCode() : 0;
	}
}

