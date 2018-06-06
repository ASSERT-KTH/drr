

package org.jfree.chart.ui;


public class ProjectInfo extends org.jfree.chart.ui.BasicProjectInfo {
	private java.awt.Image logo;

	private java.lang.String licenceText;

	private java.util.List contributors;

	public ProjectInfo() {
	}

	public ProjectInfo(java.lang.String name, java.lang.String version, java.lang.String info, java.awt.Image logo, java.lang.String copyright, java.lang.String licenceName, java.lang.String licenceText) {
		super(name, version, info, copyright, licenceName);
		org.jfree.chart.ui.ProjectInfo.this.logo = logo;
		org.jfree.chart.ui.ProjectInfo.this.licenceText = licenceText;
	}

	public java.awt.Image getLogo() {
		return org.jfree.chart.ui.ProjectInfo.this.logo;
	}

	public void setLogo(final java.awt.Image logo) {
		org.jfree.chart.ui.ProjectInfo.this.logo = logo;
	}

	public java.lang.String getLicenceText() {
		return org.jfree.chart.ui.ProjectInfo.this.licenceText;
	}

	public void setLicenceText(final java.lang.String licenceText) {
		org.jfree.chart.ui.ProjectInfo.this.licenceText = licenceText;
	}

	public java.util.List getContributors() {
		return org.jfree.chart.ui.ProjectInfo.this.contributors;
	}

	public void setContributors(final java.util.List contributors) {
		org.jfree.chart.ui.ProjectInfo.this.contributors = contributors;
	}

	public java.lang.String toString() {
		final java.lang.StringBuffer result = new java.lang.StringBuffer();
		result.append(getName());
		result.append(" version ");
		result.append(getVersion());
		result.append(".\n");
		result.append(getCopyright());
		result.append(".\n");
		result.append("\n");
		result.append("For terms of use, see the licence below.\n");
		result.append("\n");
		result.append("FURTHER INFORMATION:");
		result.append(getInfo());
		result.append("\n");
		result.append("CONTRIBUTORS:");
		if ((org.jfree.chart.ui.ProjectInfo.this.contributors) != null) {
			final java.util.Iterator iterator = org.jfree.chart.ui.ProjectInfo.this.contributors.iterator();
			while (iterator.hasNext()) {
				final org.jfree.chart.ui.Contributor contributor = ((org.jfree.chart.ui.Contributor) (iterator.next()));
				result.append(contributor.getName());
				result.append(" (");
				result.append(contributor.getEmail());
				result.append(").");
			} 
		}else {
			result.append("None");
		}
		result.append("\n");
		result.append("OTHER LIBRARIES USED BY ");
		result.append(getName());
		result.append(":");
		final org.jfree.chart.ui.Library[] libraries = getLibraries();
		if ((libraries.length) != 0) {
			for (int i = 0; i < (libraries.length); i++) {
				final org.jfree.chart.ui.Library lib = libraries[i];
				result.append(lib.getName());
				result.append(" ");
				result.append(lib.getVersion());
				result.append(" (");
				result.append(lib.getInfo());
				result.append(").");
			}
		}else {
			result.append("None");
		}
		result.append("\n");
		result.append(getName());
		result.append(" LICENCE TERMS:");
		result.append("\n");
		result.append(getLicenceText());
		return result.toString();
	}
}

