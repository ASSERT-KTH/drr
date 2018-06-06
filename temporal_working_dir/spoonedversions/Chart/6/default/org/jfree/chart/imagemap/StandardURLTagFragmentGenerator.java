

package org.jfree.chart.imagemap;


public class StandardURLTagFragmentGenerator implements org.jfree.chart.imagemap.URLTagFragmentGenerator {
	public StandardURLTagFragmentGenerator() {
		super();
	}

	public java.lang.String generateURLFragment(java.lang.String urlText) {
		return (" href=\"" + urlText) + "\"";
	}
}

