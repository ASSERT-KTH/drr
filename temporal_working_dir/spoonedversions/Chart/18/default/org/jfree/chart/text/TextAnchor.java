

package org.jfree.chart.text;


public final class TextAnchor implements java.io.Serializable {
	private static final long serialVersionUID = 8219158940496719660L;

	public static final org.jfree.chart.text.TextAnchor TOP_LEFT = new org.jfree.chart.text.TextAnchor("TextAnchor.TOP_LEFT");

	public static final org.jfree.chart.text.TextAnchor TOP_CENTER = new org.jfree.chart.text.TextAnchor("TextAnchor.TOP_CENTER");

	public static final org.jfree.chart.text.TextAnchor TOP_RIGHT = new org.jfree.chart.text.TextAnchor("TextAnchor.TOP_RIGHT");

	public static final org.jfree.chart.text.TextAnchor HALF_ASCENT_LEFT = new org.jfree.chart.text.TextAnchor("TextAnchor.HALF_ASCENT_LEFT");

	public static final org.jfree.chart.text.TextAnchor HALF_ASCENT_CENTER = new org.jfree.chart.text.TextAnchor("TextAnchor.HALF_ASCENT_CENTER");

	public static final org.jfree.chart.text.TextAnchor HALF_ASCENT_RIGHT = new org.jfree.chart.text.TextAnchor("TextAnchor.HALF_ASCENT_RIGHT");

	public static final org.jfree.chart.text.TextAnchor CENTER_LEFT = new org.jfree.chart.text.TextAnchor("TextAnchor.CENTER_LEFT");

	public static final org.jfree.chart.text.TextAnchor CENTER = new org.jfree.chart.text.TextAnchor("TextAnchor.CENTER");

	public static final org.jfree.chart.text.TextAnchor CENTER_RIGHT = new org.jfree.chart.text.TextAnchor("TextAnchor.CENTER_RIGHT");

	public static final org.jfree.chart.text.TextAnchor BASELINE_LEFT = new org.jfree.chart.text.TextAnchor("TextAnchor.BASELINE_LEFT");

	public static final org.jfree.chart.text.TextAnchor BASELINE_CENTER = new org.jfree.chart.text.TextAnchor("TextAnchor.BASELINE_CENTER");

	public static final org.jfree.chart.text.TextAnchor BASELINE_RIGHT = new org.jfree.chart.text.TextAnchor("TextAnchor.BASELINE_RIGHT");

	public static final org.jfree.chart.text.TextAnchor BOTTOM_LEFT = new org.jfree.chart.text.TextAnchor("TextAnchor.BOTTOM_LEFT");

	public static final org.jfree.chart.text.TextAnchor BOTTOM_CENTER = new org.jfree.chart.text.TextAnchor("TextAnchor.BOTTOM_CENTER");

	public static final org.jfree.chart.text.TextAnchor BOTTOM_RIGHT = new org.jfree.chart.text.TextAnchor("TextAnchor.BOTTOM_RIGHT");

	private java.lang.String name;

	private TextAnchor(java.lang.String name) {
		org.jfree.chart.text.TextAnchor.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.chart.text.TextAnchor.this.name;
	}

	public boolean equals(java.lang.Object obj) {
		if ((org.jfree.chart.text.TextAnchor.this) == obj) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.text.TextAnchor)) {
			return false;
		}
		org.jfree.chart.text.TextAnchor order = ((org.jfree.chart.text.TextAnchor) (obj));
		if (!(org.jfree.chart.text.TextAnchor.this.name.equals(order.name))) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		return org.jfree.chart.text.TextAnchor.this.name.hashCode();
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		org.jfree.chart.text.TextAnchor result = null;
		if (org.jfree.chart.text.TextAnchor.this.equals(org.jfree.chart.text.TextAnchor.TOP_LEFT)) {
			result = org.jfree.chart.text.TextAnchor.TOP_LEFT;
		}else
			if (org.jfree.chart.text.TextAnchor.this.equals(org.jfree.chart.text.TextAnchor.TOP_CENTER)) {
				result = org.jfree.chart.text.TextAnchor.TOP_CENTER;
			}else
				if (org.jfree.chart.text.TextAnchor.this.equals(org.jfree.chart.text.TextAnchor.TOP_RIGHT)) {
					result = org.jfree.chart.text.TextAnchor.TOP_RIGHT;
				}else
					if (org.jfree.chart.text.TextAnchor.this.equals(org.jfree.chart.text.TextAnchor.BOTTOM_LEFT)) {
						result = org.jfree.chart.text.TextAnchor.BOTTOM_LEFT;
					}else
						if (org.jfree.chart.text.TextAnchor.this.equals(org.jfree.chart.text.TextAnchor.BOTTOM_CENTER)) {
							result = org.jfree.chart.text.TextAnchor.BOTTOM_CENTER;
						}else
							if (org.jfree.chart.text.TextAnchor.this.equals(org.jfree.chart.text.TextAnchor.BOTTOM_RIGHT)) {
								result = org.jfree.chart.text.TextAnchor.BOTTOM_RIGHT;
							}else
								if (org.jfree.chart.text.TextAnchor.this.equals(org.jfree.chart.text.TextAnchor.BASELINE_LEFT)) {
									result = org.jfree.chart.text.TextAnchor.BASELINE_LEFT;
								}else
									if (org.jfree.chart.text.TextAnchor.this.equals(org.jfree.chart.text.TextAnchor.BASELINE_CENTER)) {
										result = org.jfree.chart.text.TextAnchor.BASELINE_CENTER;
									}else
										if (org.jfree.chart.text.TextAnchor.this.equals(org.jfree.chart.text.TextAnchor.BASELINE_RIGHT)) {
											result = org.jfree.chart.text.TextAnchor.BASELINE_RIGHT;
										}else
											if (org.jfree.chart.text.TextAnchor.this.equals(org.jfree.chart.text.TextAnchor.CENTER_LEFT)) {
												result = org.jfree.chart.text.TextAnchor.CENTER_LEFT;
											}else
												if (org.jfree.chart.text.TextAnchor.this.equals(org.jfree.chart.text.TextAnchor.CENTER)) {
													result = org.jfree.chart.text.TextAnchor.CENTER;
												}else
													if (org.jfree.chart.text.TextAnchor.this.equals(org.jfree.chart.text.TextAnchor.CENTER_RIGHT)) {
														result = org.jfree.chart.text.TextAnchor.CENTER_RIGHT;
													}else
														if (org.jfree.chart.text.TextAnchor.this.equals(org.jfree.chart.text.TextAnchor.HALF_ASCENT_LEFT)) {
															result = org.jfree.chart.text.TextAnchor.HALF_ASCENT_LEFT;
														}else
															if (org.jfree.chart.text.TextAnchor.this.equals(org.jfree.chart.text.TextAnchor.HALF_ASCENT_CENTER)) {
																result = org.jfree.chart.text.TextAnchor.HALF_ASCENT_CENTER;
															}else
																if (org.jfree.chart.text.TextAnchor.this.equals(org.jfree.chart.text.TextAnchor.HALF_ASCENT_RIGHT)) {
																	result = org.jfree.chart.text.TextAnchor.HALF_ASCENT_RIGHT;
																}
															
														
													
												
											
										
									
								
							
						
					
				
			
		
		return result;
	}
}

