

package org.jfree.chart.imagemap;


public class ImageMapUtilities {
	public static void writeImageMap(java.io.PrintWriter writer, java.lang.String name, org.jfree.chart.ChartRenderingInfo info) throws java.io.IOException {
		org.jfree.chart.imagemap.ImageMapUtilities.writeImageMap(writer, name, info, new org.jfree.chart.imagemap.StandardToolTipTagFragmentGenerator(), new org.jfree.chart.imagemap.StandardURLTagFragmentGenerator());
	}

	public static void writeImageMap(java.io.PrintWriter writer, java.lang.String name, org.jfree.chart.ChartRenderingInfo info, boolean useOverLibForToolTips) throws java.io.IOException {
		org.jfree.chart.imagemap.ToolTipTagFragmentGenerator toolTipTagFragmentGenerator = null;
		if (useOverLibForToolTips) {
			toolTipTagFragmentGenerator = new org.jfree.chart.imagemap.OverLIBToolTipTagFragmentGenerator();
		}else {
			toolTipTagFragmentGenerator = new org.jfree.chart.imagemap.StandardToolTipTagFragmentGenerator();
		}
		org.jfree.chart.imagemap.ImageMapUtilities.writeImageMap(writer, name, info, toolTipTagFragmentGenerator, new org.jfree.chart.imagemap.StandardURLTagFragmentGenerator());
	}

	public static void writeImageMap(java.io.PrintWriter writer, java.lang.String name, org.jfree.chart.ChartRenderingInfo info, org.jfree.chart.imagemap.ToolTipTagFragmentGenerator toolTipTagFragmentGenerator, org.jfree.chart.imagemap.URLTagFragmentGenerator urlTagFragmentGenerator) throws java.io.IOException {
		writer.println(org.jfree.chart.imagemap.ImageMapUtilities.getImageMap(name, info, toolTipTagFragmentGenerator, urlTagFragmentGenerator));
	}

	public static java.lang.String getImageMap(java.lang.String name, org.jfree.chart.ChartRenderingInfo info) {
		return org.jfree.chart.imagemap.ImageMapUtilities.getImageMap(name, info, new org.jfree.chart.imagemap.StandardToolTipTagFragmentGenerator(), new org.jfree.chart.imagemap.StandardURLTagFragmentGenerator());
	}

	public static java.lang.String getImageMap(java.lang.String name, org.jfree.chart.ChartRenderingInfo info, org.jfree.chart.imagemap.ToolTipTagFragmentGenerator toolTipTagFragmentGenerator, org.jfree.chart.imagemap.URLTagFragmentGenerator urlTagFragmentGenerator) {
		java.lang.StringBuffer sb = new java.lang.StringBuffer();
		sb.append((((("<map id=\"" + (org.jfree.chart.imagemap.ImageMapUtilities.htmlEscape(name))) + "\" name=\"") + (org.jfree.chart.imagemap.ImageMapUtilities.htmlEscape(name))) + "\">"));
		sb.append(org.jfree.chart.util.StringUtilities.getLineSeparator());
		org.jfree.chart.entity.EntityCollection entities = info.getEntityCollection();
		if (entities != null) {
			int count = entities.getEntityCount();
			for (int i = count - 1; i >= 0; i--) {
				org.jfree.chart.entity.ChartEntity entity = entities.getEntity(i);
				if (((entity.getToolTipText()) != null) || ((entity.getURLText()) != null)) {
					java.lang.String area = entity.getImageMapAreaTag(toolTipTagFragmentGenerator, urlTagFragmentGenerator);
					if ((area.length()) > 0) {
						sb.append(area);
						sb.append(org.jfree.chart.util.StringUtilities.getLineSeparator());
					}
				}
			}
		}
		sb.append("</map>");
		return sb.toString();
	}

	public static java.lang.String htmlEscape(java.lang.String input) {
		if (input == null) {
			throw new java.lang.IllegalArgumentException("Null 'input' argument.");
		}
		java.lang.StringBuffer result = new java.lang.StringBuffer();
		int length = input.length();
		for (int i = 0; i < length; i++) {
			char c = input.charAt(i);
			if (c == '&') {
				result.append("&amp;");
			}else
				if (c == '\"') {
					result.append("&quot;");
				}else
					if (c == '<') {
						result.append("&lt;");
					}else
						if (c == '>') {
							result.append("&gt;");
						}else
							if (c == '\'') {
								result.append("&#39;");
							}else
								if (c == '\\') {
									result.append("&#092;");
								}else {
									result.append(c);
								}
							
						
					
				
			
		}
		return result.toString();
	}
}

