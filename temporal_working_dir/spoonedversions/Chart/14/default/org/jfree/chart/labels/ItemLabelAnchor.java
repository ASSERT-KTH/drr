

package org.jfree.chart.labels;


public final class ItemLabelAnchor implements java.io.Serializable {
	private static final long serialVersionUID = -1233101616128695658L;

	public static final org.jfree.chart.labels.ItemLabelAnchor CENTER = new org.jfree.chart.labels.ItemLabelAnchor("ItemLabelAnchor.CENTER");

	public static final org.jfree.chart.labels.ItemLabelAnchor INSIDE1 = new org.jfree.chart.labels.ItemLabelAnchor("ItemLabelAnchor.INSIDE1");

	public static final org.jfree.chart.labels.ItemLabelAnchor INSIDE2 = new org.jfree.chart.labels.ItemLabelAnchor("ItemLabelAnchor.INSIDE2");

	public static final org.jfree.chart.labels.ItemLabelAnchor INSIDE3 = new org.jfree.chart.labels.ItemLabelAnchor("ItemLabelAnchor.INSIDE3");

	public static final org.jfree.chart.labels.ItemLabelAnchor INSIDE4 = new org.jfree.chart.labels.ItemLabelAnchor("ItemLabelAnchor.INSIDE4");

	public static final org.jfree.chart.labels.ItemLabelAnchor INSIDE5 = new org.jfree.chart.labels.ItemLabelAnchor("ItemLabelAnchor.INSIDE5");

	public static final org.jfree.chart.labels.ItemLabelAnchor INSIDE6 = new org.jfree.chart.labels.ItemLabelAnchor("ItemLabelAnchor.INSIDE6");

	public static final org.jfree.chart.labels.ItemLabelAnchor INSIDE7 = new org.jfree.chart.labels.ItemLabelAnchor("ItemLabelAnchor.INSIDE7");

	public static final org.jfree.chart.labels.ItemLabelAnchor INSIDE8 = new org.jfree.chart.labels.ItemLabelAnchor("ItemLabelAnchor.INSIDE8");

	public static final org.jfree.chart.labels.ItemLabelAnchor INSIDE9 = new org.jfree.chart.labels.ItemLabelAnchor("ItemLabelAnchor.INSIDE9");

	public static final org.jfree.chart.labels.ItemLabelAnchor INSIDE10 = new org.jfree.chart.labels.ItemLabelAnchor("ItemLabelAnchor.INSIDE10");

	public static final org.jfree.chart.labels.ItemLabelAnchor INSIDE11 = new org.jfree.chart.labels.ItemLabelAnchor("ItemLabelAnchor.INSIDE11");

	public static final org.jfree.chart.labels.ItemLabelAnchor INSIDE12 = new org.jfree.chart.labels.ItemLabelAnchor("ItemLabelAnchor.INSIDE12");

	public static final org.jfree.chart.labels.ItemLabelAnchor OUTSIDE1 = new org.jfree.chart.labels.ItemLabelAnchor("ItemLabelAnchor.OUTSIDE1");

	public static final org.jfree.chart.labels.ItemLabelAnchor OUTSIDE2 = new org.jfree.chart.labels.ItemLabelAnchor("ItemLabelAnchor.OUTSIDE2");

	public static final org.jfree.chart.labels.ItemLabelAnchor OUTSIDE3 = new org.jfree.chart.labels.ItemLabelAnchor("ItemLabelAnchor.OUTSIDE3");

	public static final org.jfree.chart.labels.ItemLabelAnchor OUTSIDE4 = new org.jfree.chart.labels.ItemLabelAnchor("ItemLabelAnchor.OUTSIDE4");

	public static final org.jfree.chart.labels.ItemLabelAnchor OUTSIDE5 = new org.jfree.chart.labels.ItemLabelAnchor("ItemLabelAnchor.OUTSIDE5");

	public static final org.jfree.chart.labels.ItemLabelAnchor OUTSIDE6 = new org.jfree.chart.labels.ItemLabelAnchor("ItemLabelAnchor.OUTSIDE6");

	public static final org.jfree.chart.labels.ItemLabelAnchor OUTSIDE7 = new org.jfree.chart.labels.ItemLabelAnchor("ItemLabelAnchor.OUTSIDE7");

	public static final org.jfree.chart.labels.ItemLabelAnchor OUTSIDE8 = new org.jfree.chart.labels.ItemLabelAnchor("ItemLabelAnchor.OUTSIDE8");

	public static final org.jfree.chart.labels.ItemLabelAnchor OUTSIDE9 = new org.jfree.chart.labels.ItemLabelAnchor("ItemLabelAnchor.OUTSIDE9");

	public static final org.jfree.chart.labels.ItemLabelAnchor OUTSIDE10 = new org.jfree.chart.labels.ItemLabelAnchor("ItemLabelAnchor.OUTSIDE10");

	public static final org.jfree.chart.labels.ItemLabelAnchor OUTSIDE11 = new org.jfree.chart.labels.ItemLabelAnchor("ItemLabelAnchor.OUTSIDE11");

	public static final org.jfree.chart.labels.ItemLabelAnchor OUTSIDE12 = new org.jfree.chart.labels.ItemLabelAnchor("ItemLabelAnchor.OUTSIDE12");

	private java.lang.String name;

	private ItemLabelAnchor(java.lang.String name) {
		org.jfree.chart.labels.ItemLabelAnchor.this.name = name;
	}

	public java.lang.String toString() {
		return org.jfree.chart.labels.ItemLabelAnchor.this.name;
	}

	public boolean equals(java.lang.Object o) {
		if ((org.jfree.chart.labels.ItemLabelAnchor.this) == o) {
			return true;
		}
		if (!(o instanceof org.jfree.chart.labels.ItemLabelAnchor)) {
			return false;
		}
		org.jfree.chart.labels.ItemLabelAnchor order = ((org.jfree.chart.labels.ItemLabelAnchor) (o));
		if (!(org.jfree.chart.labels.ItemLabelAnchor.this.name.equals(order.toString()))) {
			return false;
		}
		return true;
	}

	private java.lang.Object readResolve() throws java.io.ObjectStreamException {
		org.jfree.chart.labels.ItemLabelAnchor result = null;
		if (org.jfree.chart.labels.ItemLabelAnchor.this.equals(org.jfree.chart.labels.ItemLabelAnchor.CENTER)) {
			result = org.jfree.chart.labels.ItemLabelAnchor.CENTER;
		}else
			if (org.jfree.chart.labels.ItemLabelAnchor.this.equals(org.jfree.chart.labels.ItemLabelAnchor.INSIDE1)) {
				result = org.jfree.chart.labels.ItemLabelAnchor.INSIDE1;
			}else
				if (org.jfree.chart.labels.ItemLabelAnchor.this.equals(org.jfree.chart.labels.ItemLabelAnchor.INSIDE2)) {
					result = org.jfree.chart.labels.ItemLabelAnchor.INSIDE2;
				}else
					if (org.jfree.chart.labels.ItemLabelAnchor.this.equals(org.jfree.chart.labels.ItemLabelAnchor.INSIDE3)) {
						result = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
					}else
						if (org.jfree.chart.labels.ItemLabelAnchor.this.equals(org.jfree.chart.labels.ItemLabelAnchor.INSIDE4)) {
							result = org.jfree.chart.labels.ItemLabelAnchor.INSIDE4;
						}else
							if (org.jfree.chart.labels.ItemLabelAnchor.this.equals(org.jfree.chart.labels.ItemLabelAnchor.INSIDE5)) {
								result = org.jfree.chart.labels.ItemLabelAnchor.INSIDE5;
							}else
								if (org.jfree.chart.labels.ItemLabelAnchor.this.equals(org.jfree.chart.labels.ItemLabelAnchor.INSIDE6)) {
									result = org.jfree.chart.labels.ItemLabelAnchor.INSIDE6;
								}else
									if (org.jfree.chart.labels.ItemLabelAnchor.this.equals(org.jfree.chart.labels.ItemLabelAnchor.INSIDE7)) {
										result = org.jfree.chart.labels.ItemLabelAnchor.INSIDE7;
									}else
										if (org.jfree.chart.labels.ItemLabelAnchor.this.equals(org.jfree.chart.labels.ItemLabelAnchor.INSIDE8)) {
											result = org.jfree.chart.labels.ItemLabelAnchor.INSIDE8;
										}else
											if (org.jfree.chart.labels.ItemLabelAnchor.this.equals(org.jfree.chart.labels.ItemLabelAnchor.INSIDE9)) {
												result = org.jfree.chart.labels.ItemLabelAnchor.INSIDE9;
											}else
												if (org.jfree.chart.labels.ItemLabelAnchor.this.equals(org.jfree.chart.labels.ItemLabelAnchor.INSIDE10)) {
													result = org.jfree.chart.labels.ItemLabelAnchor.INSIDE10;
												}else
													if (org.jfree.chart.labels.ItemLabelAnchor.this.equals(org.jfree.chart.labels.ItemLabelAnchor.INSIDE11)) {
														result = org.jfree.chart.labels.ItemLabelAnchor.INSIDE11;
													}else
														if (org.jfree.chart.labels.ItemLabelAnchor.this.equals(org.jfree.chart.labels.ItemLabelAnchor.INSIDE12)) {
															result = org.jfree.chart.labels.ItemLabelAnchor.INSIDE12;
														}else
															if (org.jfree.chart.labels.ItemLabelAnchor.this.equals(org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE1)) {
																result = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE1;
															}else
																if (org.jfree.chart.labels.ItemLabelAnchor.this.equals(org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE2)) {
																	result = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE2;
																}else
																	if (org.jfree.chart.labels.ItemLabelAnchor.this.equals(org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE3)) {
																		result = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE3;
																	}else
																		if (org.jfree.chart.labels.ItemLabelAnchor.this.equals(org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE4)) {
																			result = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE4;
																		}else
																			if (org.jfree.chart.labels.ItemLabelAnchor.this.equals(org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE5)) {
																				result = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE5;
																			}else
																				if (org.jfree.chart.labels.ItemLabelAnchor.this.equals(org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE6)) {
																					result = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE6;
																				}else
																					if (org.jfree.chart.labels.ItemLabelAnchor.this.equals(org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE7)) {
																						result = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE7;
																					}else
																						if (org.jfree.chart.labels.ItemLabelAnchor.this.equals(org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE8)) {
																							result = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE8;
																						}else
																							if (org.jfree.chart.labels.ItemLabelAnchor.this.equals(org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE9)) {
																								result = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE9;
																							}else
																								if (org.jfree.chart.labels.ItemLabelAnchor.this.equals(org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE10)) {
																									result = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE10;
																								}else
																									if (org.jfree.chart.labels.ItemLabelAnchor.this.equals(org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE11)) {
																										result = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE11;
																									}else
																										if (org.jfree.chart.labels.ItemLabelAnchor.this.equals(org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE12)) {
																											result = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE12;
																										}
																									
																								
																							
																						
																					
																				
																			
																		
																	
																
															
														
													
												
											
										
									
								
							
						
					
				
			
		
		return result;
	}
}

