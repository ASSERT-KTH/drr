

package org.jfree.chart.ui;


public class BasicProjectInfo extends org.jfree.chart.ui.Library {
	private static class OptionalLibraryHolder {
		private java.lang.String libraryClass;

		private transient org.jfree.chart.ui.Library library;

		public OptionalLibraryHolder(java.lang.String libraryClass) {
			if (libraryClass == null) {
				throw new java.lang.NullPointerException("LibraryClass must not be null.");
			}
			org.jfree.chart.ui.BasicProjectInfo.OptionalLibraryHolder.this.libraryClass = libraryClass;
		}

		public OptionalLibraryHolder(org.jfree.chart.ui.Library library) {
			if (library == null) {
				throw new java.lang.NullPointerException("Library must not be null.");
			}
			org.jfree.chart.ui.BasicProjectInfo.OptionalLibraryHolder.this.library = library;
			org.jfree.chart.ui.BasicProjectInfo.OptionalLibraryHolder.this.libraryClass = library.getClass().getName();
		}

		public java.lang.String getLibraryClass() {
			return org.jfree.chart.ui.BasicProjectInfo.OptionalLibraryHolder.this.libraryClass;
		}

		public org.jfree.chart.ui.Library getLibrary() {
			if ((org.jfree.chart.ui.BasicProjectInfo.OptionalLibraryHolder.this.library) == null) {
				org.jfree.chart.ui.BasicProjectInfo.OptionalLibraryHolder.this.library = loadLibrary(org.jfree.chart.ui.BasicProjectInfo.OptionalLibraryHolder.this.libraryClass);
			}
			return org.jfree.chart.ui.BasicProjectInfo.OptionalLibraryHolder.this.library;
		}

		protected org.jfree.chart.ui.Library loadLibrary(java.lang.String classname) {
			if (classname == null) {
				return null;
			}
			try {
				java.lang.Class c = org.jfree.chart.util.ObjectUtilities.getClassLoader(getClass()).loadClass(classname);
				try {
					java.lang.reflect.Method m = c.getMethod("getInstance", ((java.lang.Class[]) (null)));
					return ((org.jfree.chart.ui.Library) (m.invoke(null, ((java.lang.Object[]) (null)))));
				} catch (java.lang.Exception e) {
				}
				return ((org.jfree.chart.ui.Library) (c.newInstance()));
			} catch (java.lang.Exception e) {
				return null;
			}
		}
	}

	private java.lang.String copyright;

	private java.util.List libraries;

	private java.util.List optionalLibraries;

	public BasicProjectInfo() {
		org.jfree.chart.ui.BasicProjectInfo.this.libraries = new java.util.ArrayList();
		org.jfree.chart.ui.BasicProjectInfo.this.optionalLibraries = new java.util.ArrayList();
	}

	public BasicProjectInfo(java.lang.String name, java.lang.String version, java.lang.String licence, java.lang.String info) {
		this();
		setName(name);
		setVersion(version);
		setLicenceName(licence);
		setInfo(info);
	}

	public BasicProjectInfo(java.lang.String name, java.lang.String version, java.lang.String info, java.lang.String copyright, java.lang.String licenceName) {
		this(name, version, licenceName, info);
		setCopyright(copyright);
	}

	public java.lang.String getCopyright() {
		return org.jfree.chart.ui.BasicProjectInfo.this.copyright;
	}

	public void setCopyright(java.lang.String copyright) {
		org.jfree.chart.ui.BasicProjectInfo.this.copyright = copyright;
	}

	public void setInfo(java.lang.String info) {
		super.setInfo(info);
	}

	public void setLicenceName(java.lang.String licence) {
		super.setLicenceName(licence);
	}

	public void setName(java.lang.String name) {
		super.setName(name);
	}

	public void setVersion(java.lang.String version) {
		super.setVersion(version);
	}

	public org.jfree.chart.ui.Library[] getLibraries() {
		return ((org.jfree.chart.ui.Library[]) (org.jfree.chart.ui.BasicProjectInfo.this.libraries.toArray(new org.jfree.chart.ui.Library[org.jfree.chart.ui.BasicProjectInfo.this.libraries.size()])));
	}

	public void addLibrary(org.jfree.chart.ui.Library library) {
		if (library == null) {
			throw new java.lang.NullPointerException();
		}
		org.jfree.chart.ui.BasicProjectInfo.this.libraries.add(library);
	}

	public org.jfree.chart.ui.Library[] getOptionalLibraries() {
		java.util.ArrayList libraries = new java.util.ArrayList();
		for (int i = 0; i < (org.jfree.chart.ui.BasicProjectInfo.this.optionalLibraries.size()); i++) {
			org.jfree.chart.ui.BasicProjectInfo.OptionalLibraryHolder holder = ((org.jfree.chart.ui.BasicProjectInfo.OptionalLibraryHolder) (org.jfree.chart.ui.BasicProjectInfo.this.optionalLibraries.get(i)));
			org.jfree.chart.ui.Library l = holder.getLibrary();
			if (l != null) {
				libraries.add(l);
			}
		}
		return ((org.jfree.chart.ui.Library[]) (libraries.toArray(new org.jfree.chart.ui.Library[libraries.size()])));
	}

	public void addOptionalLibrary(java.lang.String libraryClass) {
		if (libraryClass == null) {
			throw new java.lang.NullPointerException("Library classname must be given.");
		}
		org.jfree.chart.ui.BasicProjectInfo.this.optionalLibraries.add(new org.jfree.chart.ui.BasicProjectInfo.OptionalLibraryHolder(libraryClass));
	}

	public void addOptionalLibrary(org.jfree.chart.ui.Library library) {
		if (library == null) {
			throw new java.lang.NullPointerException("Library must be given.");
		}
		org.jfree.chart.ui.BasicProjectInfo.this.optionalLibraries.add(new org.jfree.chart.ui.BasicProjectInfo.OptionalLibraryHolder(library));
	}
}

