

package org.jfree.chart.text;


public final class TextBlockAnchor implements java.io.Serializable {
	private static final long serialVersionUID = -3045058380983401544L;

	public static final org.jfree.chart.text.TextBlockAnchor TOP_LEFT = new org.jfree.chart.text.TextBlockAnchor("TextBlockAnchor.TOP_LEFT");

	public static final org.jfree.chart.text.TextBlockAnchor TOP_CENTER = new org.jfree.chart.text.TextBlockAnchor("TextBlockAnchor.TOP_CENTER");

	public static final org.jfree.chart.text.TextBlockAnchor TOP_RIGHT = new org.jfree.chart.text.TextBlockAnchor("TextBlockAnchor.TOP_RIGHT");

	public static final org.jfree.chart.text.TextBlockAnchor CENTER_LEFT = new org.jfree.chart.text.TextBlockAnchor("TextBlockAnchor.CENTER_LEFT");

	public static final org.jfree.chart.text.TextBlockAnchor CENTER = new org.jfree.chart.text.TextBlockAnchor("TextBlockAnchor.CENTER");

	public static final org.jfree.chart.text.TextBlockAnchor CENTER_RIGHT = new org.jfree.chart.text.TextBlockAnchor("TextBlockAnchor.CENTER_RIGHT");

	public static final org.jfree.chart.text.TextBlockAnchor BOTTOM_LEFT = new org.jfree.chart.text.TextBlockAnchor("TextBlockAnchor.BOTTOM_LEFT");

	public static final org.jfree.chart.text.TextBlockAnchor BOTTOM_CENTER = new org.jfree.chart.text.TextBlockAnchor("TextBlockAnchor.BOTTOM_CENTER");

	public static final org.jfree.chart.text.TextBlockAnchor BOTTOM_RIGHT = new org.jfree.chart.text.TextBlockAnchor("TextBlockAnchor.BOTTOM_RIGHT");

	private java.lang.String name;

	private TextBlockAnchor(java.lang.String name) {
		org.jfree.chart.text.TextBlockAnchor.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.chart.text.TextBlockAnchor.this.name;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.chart.text.TextBlockAnchor.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.text.TextBlockAnchor)) {
			return false;
		}
		org.jfree.chart.text.TextBlockAnchor other = ((org.jfree.chart.text.TextBlockAnchor) (obj));
		if (!(org.jfree.chart.text.TextBlockAnchor.this.name.equals(other.name))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return org.jfree.chart.text.TextBlockAnchor.this.name.hashCode();
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		if (org.jfree.chart.text.TextBlockAnchor.this.equals(org.jfree.chart.text.TextBlockAnchor.TOP_CENTER)) {
			return org.jfree.chart.text.TextBlockAnchor.TOP_CENTER;
		}else
			if (org.jfree.chart.text.TextBlockAnchor.this.equals(org.jfree.chart.text.TextBlockAnchor.TOP_LEFT)) {
				return org.jfree.chart.text.TextBlockAnchor.TOP_LEFT;
			}else
				if (org.jfree.chart.text.TextBlockAnchor.this.equals(org.jfree.chart.text.TextBlockAnchor.TOP_RIGHT)) {
					return org.jfree.chart.text.TextBlockAnchor.TOP_RIGHT;
				}else
					if (org.jfree.chart.text.TextBlockAnchor.this.equals(org.jfree.chart.text.TextBlockAnchor.CENTER)) {
						return org.jfree.chart.text.TextBlockAnchor.CENTER;
					}else
						if (org.jfree.chart.text.TextBlockAnchor.this.equals(org.jfree.chart.text.TextBlockAnchor.CENTER_LEFT)) {
							return org.jfree.chart.text.TextBlockAnchor.CENTER_LEFT;
						}else
							if (org.jfree.chart.text.TextBlockAnchor.this.equals(org.jfree.chart.text.TextBlockAnchor.CENTER_RIGHT)) {
								return org.jfree.chart.text.TextBlockAnchor.CENTER_RIGHT;
							}else
								if (org.jfree.chart.text.TextBlockAnchor.this.equals(org.jfree.chart.text.TextBlockAnchor.BOTTOM_CENTER)) {
									return org.jfree.chart.text.TextBlockAnchor.BOTTOM_CENTER;
								}else
									if (org.jfree.chart.text.TextBlockAnchor.this.equals(org.jfree.chart.text.TextBlockAnchor.BOTTOM_LEFT)) {
										return org.jfree.chart.text.TextBlockAnchor.BOTTOM_LEFT;
									}else
										if (org.jfree.chart.text.TextBlockAnchor.this.equals(org.jfree.chart.text.TextBlockAnchor.BOTTOM_RIGHT)) {
											return org.jfree.chart.text.TextBlockAnchor.BOTTOM_RIGHT;
										}
									
								
							
						
					
				
			
		
		return null;
	}
}

