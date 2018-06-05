

package org.jfree.chart.util;


public class ResourceBundleWrapper {
	private static java.net.URLClassLoader noCodeBaseClassLoader;

	private ResourceBundleWrapper() {
	}

	public static void removeCodeBase(java.net.URL codeBase, java.net.URLClassLoader urlClassLoader) {
		java.util.List urlsNoBase = new java.util.ArrayList();
		java.net.URL[] urls = urlClassLoader.getURLs();
		for (int i = 0; i < (urls.length); i++) {
			if (!(urls[i].sameFile(codeBase))) {
				urlsNoBase.add(urls[i]);
			}
		}
		java.net.URL[] urlsNoBaseArray = ((java.net.URL[]) (urlsNoBase.toArray(new java.net.URL[0])));
		org.jfree.chart.util.ResourceBundleWrapper.noCodeBaseClassLoader = java.net.URLClassLoader.newInstance(urlsNoBaseArray);
	}

	public static final java.util.ResourceBundle getBundle(java.lang.String baseName) {
		if ((org.jfree.chart.util.ResourceBundleWrapper.noCodeBaseClassLoader) != null) {
			return java.util.ResourceBundle.getBundle(baseName, java.util.Locale.getDefault(), org.jfree.chart.util.ResourceBundleWrapper.noCodeBaseClassLoader);
		}else {
			return java.util.ResourceBundle.getBundle(baseName);
		}
	}

	public static final java.util.ResourceBundle getBundle(java.lang.String baseName, java.util.Locale locale) {
		if ((org.jfree.chart.util.ResourceBundleWrapper.noCodeBaseClassLoader) != null) {
			return java.util.ResourceBundle.getBundle(baseName, locale, org.jfree.chart.util.ResourceBundleWrapper.noCodeBaseClassLoader);
		}else {
			return java.util.ResourceBundle.getBundle(baseName, locale);
		}
	}

	public static java.util.ResourceBundle getBundle(java.lang.String baseName, java.util.Locale locale, java.lang.ClassLoader loader) {
		return java.util.ResourceBundle.getBundle(baseName, locale, loader);
	}
}

