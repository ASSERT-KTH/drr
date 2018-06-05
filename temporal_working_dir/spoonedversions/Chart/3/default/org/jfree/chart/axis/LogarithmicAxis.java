

package org.jfree.chart.axis;


public class LogarithmicAxis extends org.jfree.chart.axis.NumberAxis {
	private static final long serialVersionUID = 2502918599004103054L;

	public static final double LOG10_VALUE = java.lang.Math.log(10.0);

	public static final double SMALL_LOG_VALUE = 1.0E-100;

	protected boolean allowNegativesFlag = false;

	protected boolean strictValuesFlag = true;

	protected final java.text.NumberFormat numberFormatterObj = java.text.NumberFormat.getInstance();

	protected boolean expTickLabelsFlag = false;

	protected boolean log10TickLabelsFlag = false;

	protected boolean autoRangeNextLogFlag = false;

	protected boolean smallLogFlag = false;

	public LogarithmicAxis(java.lang.String label) {
		super(label);
		setupNumberFmtObj();
	}

	public void setAllowNegativesFlag(boolean flgVal) {
		org.jfree.chart.axis.LogarithmicAxis.this.allowNegativesFlag = flgVal;
	}

	public boolean getAllowNegativesFlag() {
		return org.jfree.chart.axis.LogarithmicAxis.this.allowNegativesFlag;
	}

	public void setStrictValuesFlag(boolean flgVal) {
		org.jfree.chart.axis.LogarithmicAxis.this.strictValuesFlag = flgVal;
	}

	public boolean getStrictValuesFlag() {
		return org.jfree.chart.axis.LogarithmicAxis.this.strictValuesFlag;
	}

	public void setExpTickLabelsFlag(boolean flgVal) {
		org.jfree.chart.axis.LogarithmicAxis.this.expTickLabelsFlag = flgVal;
		setupNumberFmtObj();
	}

	public boolean getExpTickLabelsFlag() {
		return org.jfree.chart.axis.LogarithmicAxis.this.expTickLabelsFlag;
	}

	public void setLog10TickLabelsFlag(boolean flag) {
		org.jfree.chart.axis.LogarithmicAxis.this.log10TickLabelsFlag = flag;
	}

	public boolean getLog10TickLabelsFlag() {
		return org.jfree.chart.axis.LogarithmicAxis.this.log10TickLabelsFlag;
	}

	public void setAutoRangeNextLogFlag(boolean flag) {
		org.jfree.chart.axis.LogarithmicAxis.this.autoRangeNextLogFlag = flag;
	}

	public boolean getAutoRangeNextLogFlag() {
		return org.jfree.chart.axis.LogarithmicAxis.this.autoRangeNextLogFlag;
	}

	public void setRange(org.jfree.data.Range range) {
		super.setRange(range);
		setupSmallLogFlag();
	}

	protected void setupSmallLogFlag() {
		double lowerVal = getRange().getLowerBound();
		org.jfree.chart.axis.LogarithmicAxis.this.smallLogFlag = ((!(org.jfree.chart.axis.LogarithmicAxis.this.allowNegativesFlag)) && (lowerVal < 10.0)) && (lowerVal > 0.0);
	}

	protected void setupNumberFmtObj() {
		if ((org.jfree.chart.axis.LogarithmicAxis.this.numberFormatterObj) instanceof java.text.DecimalFormat) {
			((java.text.DecimalFormat) (org.jfree.chart.axis.LogarithmicAxis.this.numberFormatterObj)).applyPattern((org.jfree.chart.axis.LogarithmicAxis.this.expTickLabelsFlag ? "0E0" : "0.###"));
		}
	}

	protected double switchedLog10(double val) {
		return org.jfree.chart.axis.LogarithmicAxis.this.smallLogFlag ? (java.lang.Math.log(val)) / (org.jfree.chart.axis.LogarithmicAxis.LOG10_VALUE) : adjustedLog10(val);
	}

	public double switchedPow10(double val) {
		return org.jfree.chart.axis.LogarithmicAxis.this.smallLogFlag ? java.lang.Math.pow(10.0, val) : adjustedPow10(val);
	}

	public double adjustedLog10(double val) {
		boolean negFlag = val < 0.0;
		if (negFlag) {
			val = -val;
		}
		if (val < 10.0) {
			val += (10.0 - val) / 10.0;
		}
		double res = (java.lang.Math.log(val)) / (org.jfree.chart.axis.LogarithmicAxis.LOG10_VALUE);
		return negFlag ? -res : res;
	}

	public double adjustedPow10(double val) {
		boolean negFlag = val < 0.0;
		if (negFlag) {
			val = -val;
		}
		double res;
		if (val < 1.0) {
			res = ((java.lang.Math.pow(10, (val + 1.0))) - 10.0) / 9.0;
		}else {
			res = java.lang.Math.pow(10, val);
		}
		return negFlag ? -res : res;
	}

	protected double computeLogFloor(double lower) {
		double logFloor;
		if (org.jfree.chart.axis.LogarithmicAxis.this.allowNegativesFlag) {
			if (lower > 10.0) {
				logFloor = (java.lang.Math.log(lower)) / (org.jfree.chart.axis.LogarithmicAxis.LOG10_VALUE);
				logFloor = java.lang.Math.floor(logFloor);
				logFloor = java.lang.Math.pow(10, logFloor);
			}else
				if (lower < (-10.0)) {
					logFloor = (java.lang.Math.log((-lower))) / (org.jfree.chart.axis.LogarithmicAxis.LOG10_VALUE);
					logFloor = java.lang.Math.floor((-logFloor));
					logFloor = -(java.lang.Math.pow(10, (-logFloor)));
				}else {
					logFloor = java.lang.Math.floor(lower);
				}
			
		}else {
			if (lower > 0.0) {
				logFloor = (java.lang.Math.log(lower)) / (org.jfree.chart.axis.LogarithmicAxis.LOG10_VALUE);
				logFloor = java.lang.Math.floor(logFloor);
				logFloor = java.lang.Math.pow(10, logFloor);
			}else {
				logFloor = java.lang.Math.floor(lower);
			}
		}
		return logFloor;
	}

	protected double computeLogCeil(double upper) {
		double logCeil;
		if (org.jfree.chart.axis.LogarithmicAxis.this.allowNegativesFlag) {
			if (upper > 10.0) {
				logCeil = (java.lang.Math.log(upper)) / (org.jfree.chart.axis.LogarithmicAxis.LOG10_VALUE);
				logCeil = java.lang.Math.ceil(logCeil);
				logCeil = java.lang.Math.pow(10, logCeil);
			}else
				if (upper < (-10.0)) {
					logCeil = (java.lang.Math.log((-upper))) / (org.jfree.chart.axis.LogarithmicAxis.LOG10_VALUE);
					logCeil = java.lang.Math.ceil((-logCeil));
					logCeil = -(java.lang.Math.pow(10, (-logCeil)));
				}else {
					logCeil = java.lang.Math.ceil(upper);
				}
			
		}else {
			if (upper > 0.0) {
				logCeil = (java.lang.Math.log(upper)) / (org.jfree.chart.axis.LogarithmicAxis.LOG10_VALUE);
				logCeil = java.lang.Math.ceil(logCeil);
				logCeil = java.lang.Math.pow(10, logCeil);
			}else {
				logCeil = java.lang.Math.ceil(upper);
			}
		}
		return logCeil;
	}

	public void autoAdjustRange() {
		org.jfree.chart.plot.Plot plot = getPlot();
		if (plot == null) {
			return ;
		}
		if (plot instanceof org.jfree.chart.plot.ValueAxisPlot) {
			org.jfree.chart.plot.ValueAxisPlot vap = ((org.jfree.chart.plot.ValueAxisPlot) (plot));
			double lower;
			org.jfree.data.Range r = vap.getDataRange(org.jfree.chart.axis.LogarithmicAxis.this);
			if (r == null) {
				r = getDefaultAutoRange();
				lower = r.getLowerBound();
			}else {
				lower = r.getLowerBound();
				if (((org.jfree.chart.axis.LogarithmicAxis.this.strictValuesFlag) && (!(org.jfree.chart.axis.LogarithmicAxis.this.allowNegativesFlag))) && (lower <= 0.0)) {
					throw new java.lang.RuntimeException(("Values less than or equal to " + "zero not allowed with logarithmic axis"));
				}
			}
			final double lowerMargin;
			if ((lower > 0.0) && ((lowerMargin = getLowerMargin()) > 0.0)) {
				final double logLower = (java.lang.Math.log(lower)) / (org.jfree.chart.axis.LogarithmicAxis.LOG10_VALUE);
				double logAbs;
				if ((logAbs = java.lang.Math.abs(logLower)) < 1.0) {
					logAbs = 1.0;
				}
				lower = java.lang.Math.pow(10, (logLower - (logAbs * lowerMargin)));
			}
			if (org.jfree.chart.axis.LogarithmicAxis.this.autoRangeNextLogFlag) {
				lower = computeLogFloor(lower);
			}
			if (((!(org.jfree.chart.axis.LogarithmicAxis.this.allowNegativesFlag)) && (lower >= 0.0)) && (lower < (org.jfree.chart.axis.LogarithmicAxis.SMALL_LOG_VALUE))) {
				lower = r.getLowerBound();
			}
			double upper = r.getUpperBound();
			final double upperMargin;
			if ((upper > 0.0) && ((upperMargin = getUpperMargin()) > 0.0)) {
				final double logUpper = (java.lang.Math.log(upper)) / (org.jfree.chart.axis.LogarithmicAxis.LOG10_VALUE);
				double logAbs;
				if ((logAbs = java.lang.Math.abs(logUpper)) < 1.0) {
					logAbs = 1.0;
				}
				upper = java.lang.Math.pow(10, (logUpper + (logAbs * upperMargin)));
			}
			if ((((!(org.jfree.chart.axis.LogarithmicAxis.this.allowNegativesFlag)) && (upper < 1.0)) && (upper > 0.0)) && (lower > 0.0)) {
				double expVal = (java.lang.Math.log(upper)) / (org.jfree.chart.axis.LogarithmicAxis.LOG10_VALUE);
				expVal = java.lang.Math.ceil(((-expVal) + 0.001));
				expVal = java.lang.Math.pow(10, expVal);
				upper = (expVal > 0.0) ? (java.lang.Math.ceil((upper * expVal))) / expVal : java.lang.Math.ceil(upper);
			}else {
				upper = (org.jfree.chart.axis.LogarithmicAxis.this.autoRangeNextLogFlag) ? computeLogCeil(upper) : java.lang.Math.ceil(upper);
			}
			double minRange = getAutoRangeMinimumSize();
			if ((upper - lower) < minRange) {
				upper = ((upper + lower) + minRange) / 2;
				lower = ((upper + lower) - minRange) / 2;
				if ((upper - lower) < minRange) {
					double absUpper = java.lang.Math.abs(upper);
					double adjVal = absUpper > (org.jfree.chart.axis.LogarithmicAxis.SMALL_LOG_VALUE) ? absUpper / 100.0 : 0.01;
					upper = ((upper + lower) + adjVal) / 2;
					lower = ((upper + lower) - adjVal) / 2;
				}
			}
			setRange(new org.jfree.data.Range(lower, upper), false, false);
			setupSmallLogFlag();
		}
	}

	public double valueToJava2D(double value, java.awt.geom.Rectangle2D plotArea, org.jfree.chart.util.RectangleEdge edge) {
		org.jfree.data.Range range = getRange();
		double axisMin = switchedLog10(range.getLowerBound());
		double axisMax = switchedLog10(range.getUpperBound());
		double min = 0.0;
		double max = 0.0;
		if (org.jfree.chart.util.RectangleEdge.isTopOrBottom(edge)) {
			min = plotArea.getMinX();
			max = plotArea.getMaxX();
		}else
			if (org.jfree.chart.util.RectangleEdge.isLeftOrRight(edge)) {
				min = plotArea.getMaxY();
				max = plotArea.getMinY();
			}
		
		value = switchedLog10(value);
		if (isInverted()) {
			return max - (((value - axisMin) / (axisMax - axisMin)) * (max - min));
		}else {
			return min + (((value - axisMin) / (axisMax - axisMin)) * (max - min));
		}
	}

	public double java2DToValue(double java2DValue, java.awt.geom.Rectangle2D plotArea, org.jfree.chart.util.RectangleEdge edge) {
		org.jfree.data.Range range = getRange();
		double axisMin = switchedLog10(range.getLowerBound());
		double axisMax = switchedLog10(range.getUpperBound());
		double plotMin = 0.0;
		double plotMax = 0.0;
		if (org.jfree.chart.util.RectangleEdge.isTopOrBottom(edge)) {
			plotMin = plotArea.getX();
			plotMax = plotArea.getMaxX();
		}else
			if (org.jfree.chart.util.RectangleEdge.isLeftOrRight(edge)) {
				plotMin = plotArea.getMaxY();
				plotMax = plotArea.getMinY();
			}
		
		if (isInverted()) {
			return switchedPow10((axisMax - (((java2DValue - plotMin) / (plotMax - plotMin)) * (axisMax - axisMin))));
		}else {
			return switchedPow10((axisMin + (((java2DValue - plotMin) / (plotMax - plotMin)) * (axisMax - axisMin))));
		}
	}

	public void zoomRange(double lowerPercent, double upperPercent) {
		double startLog = switchedLog10(getRange().getLowerBound());
		double lengthLog = (switchedLog10(getRange().getUpperBound())) - startLog;
		org.jfree.data.Range adjusted;
		if (isInverted()) {
			adjusted = new org.jfree.data.Range(switchedPow10((startLog + (lengthLog * (1 - upperPercent)))), switchedPow10((startLog + (lengthLog * (1 - lowerPercent)))));
		}else {
			adjusted = new org.jfree.data.Range(switchedPow10((startLog + (lengthLog * lowerPercent))), switchedPow10((startLog + (lengthLog * upperPercent))));
		}
		setRange(adjusted);
	}

	protected java.util.List refreshTicksHorizontal(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge) {
		java.util.List ticks = new java.util.ArrayList();
		org.jfree.data.Range range = getRange();
		double lowerBoundVal = range.getLowerBound();
		if ((org.jfree.chart.axis.LogarithmicAxis.this.smallLogFlag) && (lowerBoundVal < (org.jfree.chart.axis.LogarithmicAxis.SMALL_LOG_VALUE))) {
			lowerBoundVal = org.jfree.chart.axis.LogarithmicAxis.SMALL_LOG_VALUE;
		}
		double upperBoundVal = range.getUpperBound();
		int iBegCount = ((int) (java.lang.Math.rint(switchedLog10(lowerBoundVal))));
		int iEndCount = ((int) (java.lang.Math.rint(switchedLog10(upperBoundVal))));
		if (((iBegCount == iEndCount) && (iBegCount > 0)) && ((java.lang.Math.pow(10, iBegCount)) > lowerBoundVal)) {
			--iBegCount;
		}
		double currentTickValue;
		java.lang.String tickLabel;
		boolean zeroTickFlag = false;
		for (int i = iBegCount; i <= iEndCount; i++) {
			for (int j = 0; j < 10; ++j) {
				if (org.jfree.chart.axis.LogarithmicAxis.this.smallLogFlag) {
					currentTickValue = (java.lang.Math.pow(10, i)) + ((java.lang.Math.pow(10, i)) * j);
					if ((org.jfree.chart.axis.LogarithmicAxis.this.expTickLabelsFlag) || (((i < 0) && (currentTickValue > 0.0)) && (currentTickValue < 1.0))) {
						if (((j == 0) || ((i > (-4)) && (j < 2))) || (currentTickValue >= upperBoundVal)) {
							org.jfree.chart.axis.LogarithmicAxis.this.numberFormatterObj.setMaximumFractionDigits((-i));
							tickLabel = makeTickLabel(currentTickValue, true);
						}else {
							tickLabel = "";
						}
					}else {
						tickLabel = ((((j < 1) || ((i < 1) && (j < 5))) || (j < (4 - i))) || (currentTickValue >= upperBoundVal)) ? makeTickLabel(currentTickValue) : "";
					}
				}else {
					if (zeroTickFlag) {
						--j;
					}
					currentTickValue = (i >= 0) ? (java.lang.Math.pow(10, i)) + ((java.lang.Math.pow(10, i)) * j) : -((java.lang.Math.pow(10, (-i))) - ((java.lang.Math.pow(10, ((-i) - 1))) * j));
					if (!zeroTickFlag) {
						if ((((java.lang.Math.abs((currentTickValue - 1.0))) < 1.0E-4) && (lowerBoundVal <= 0.0)) && (upperBoundVal >= 0.0)) {
							currentTickValue = 0.0;
							zeroTickFlag = true;
						}
					}else {
						zeroTickFlag = false;
					}
					tickLabel = ((((((org.jfree.chart.axis.LogarithmicAxis.this.expTickLabelsFlag) && (j < 2)) || (j < 1)) || ((i < 1) && (j < 5))) || (j < (4 - i))) || (currentTickValue >= upperBoundVal)) ? makeTickLabel(currentTickValue) : "";
				}
				if (currentTickValue > upperBoundVal) {
					return ticks;
				}
				if (currentTickValue >= (lowerBoundVal - (org.jfree.chart.axis.LogarithmicAxis.SMALL_LOG_VALUE))) {
					org.jfree.chart.text.TextAnchor anchor = null;
					org.jfree.chart.text.TextAnchor rotationAnchor = null;
					double angle = 0.0;
					if (isVerticalTickLabels()) {
						anchor = org.jfree.chart.text.TextAnchor.CENTER_RIGHT;
						rotationAnchor = org.jfree.chart.text.TextAnchor.CENTER_RIGHT;
						if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
							angle = (java.lang.Math.PI) / 2.0;
						}else {
							angle = (-(java.lang.Math.PI)) / 2.0;
						}
					}else {
						if (edge == (org.jfree.chart.util.RectangleEdge.TOP)) {
							anchor = org.jfree.chart.text.TextAnchor.BOTTOM_CENTER;
							rotationAnchor = org.jfree.chart.text.TextAnchor.BOTTOM_CENTER;
						}else {
							anchor = org.jfree.chart.text.TextAnchor.TOP_CENTER;
							rotationAnchor = org.jfree.chart.text.TextAnchor.TOP_CENTER;
						}
					}
					org.jfree.chart.axis.Tick tick = new org.jfree.chart.axis.NumberTick(new java.lang.Double(currentTickValue), tickLabel, anchor, rotationAnchor, angle);
					ticks.add(tick);
				}
			}
		}
		return ticks;
	}

	protected java.util.List refreshTicksVertical(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D dataArea, org.jfree.chart.util.RectangleEdge edge) {
		java.util.List ticks = new java.util.ArrayList();
		double lowerBoundVal = getRange().getLowerBound();
		if ((org.jfree.chart.axis.LogarithmicAxis.this.smallLogFlag) && (lowerBoundVal < (org.jfree.chart.axis.LogarithmicAxis.SMALL_LOG_VALUE))) {
			lowerBoundVal = org.jfree.chart.axis.LogarithmicAxis.SMALL_LOG_VALUE;
		}
		double upperBoundVal = getRange().getUpperBound();
		int iBegCount = ((int) (java.lang.Math.rint(switchedLog10(lowerBoundVal))));
		int iEndCount = ((int) (java.lang.Math.rint(switchedLog10(upperBoundVal))));
		if (((iBegCount == iEndCount) && (iBegCount > 0)) && ((java.lang.Math.pow(10, iBegCount)) > lowerBoundVal)) {
			--iBegCount;
		}
		double tickVal;
		java.lang.String tickLabel;
		boolean zeroTickFlag = false;
		for (int i = iBegCount; i <= iEndCount; i++) {
			int jEndCount = 10;
			if (i == iEndCount) {
				jEndCount = 1;
			}
			for (int j = 0; j < jEndCount; j++) {
				if (org.jfree.chart.axis.LogarithmicAxis.this.smallLogFlag) {
					tickVal = (java.lang.Math.pow(10, i)) + ((java.lang.Math.pow(10, i)) * j);
					if (j == 0) {
						if (org.jfree.chart.axis.LogarithmicAxis.this.log10TickLabelsFlag) {
							tickLabel = "10^" + i;
						}else {
							if (org.jfree.chart.axis.LogarithmicAxis.this.expTickLabelsFlag) {
								tickLabel = "1e" + i;
							}else {
								if (i >= 0) {
									java.text.NumberFormat format = getNumberFormatOverride();
									if (format != null) {
										tickLabel = format.format(tickVal);
									}else {
										tickLabel = java.lang.Long.toString(((long) (java.lang.Math.rint(tickVal))));
									}
								}else {
									org.jfree.chart.axis.LogarithmicAxis.this.numberFormatterObj.setMaximumFractionDigits((-i));
									tickLabel = org.jfree.chart.axis.LogarithmicAxis.this.numberFormatterObj.format(tickVal);
								}
							}
						}
					}else {
						tickLabel = "";
					}
				}else {
					if (zeroTickFlag) {
						--j;
					}
					tickVal = (i >= 0) ? (java.lang.Math.pow(10, i)) + ((java.lang.Math.pow(10, i)) * j) : -((java.lang.Math.pow(10, (-i))) - ((java.lang.Math.pow(10, ((-i) - 1))) * j));
					if (j == 0) {
						if (!zeroTickFlag) {
							if (((i > iBegCount) && (i < iEndCount)) && ((java.lang.Math.abs((tickVal - 1.0))) < 1.0E-4)) {
								tickVal = 0.0;
								zeroTickFlag = true;
								tickLabel = "0";
							}else {
								if (org.jfree.chart.axis.LogarithmicAxis.this.log10TickLabelsFlag) {
									tickLabel = ((i < 0 ? "-" : "") + "10^") + (java.lang.Math.abs(i));
								}else {
									if (org.jfree.chart.axis.LogarithmicAxis.this.expTickLabelsFlag) {
										tickLabel = ((i < 0 ? "-" : "") + "1e") + (java.lang.Math.abs(i));
									}else {
										java.text.NumberFormat format = getNumberFormatOverride();
										if (format != null) {
											tickLabel = format.format(tickVal);
										}else {
											tickLabel = java.lang.Long.toString(((long) (java.lang.Math.rint(tickVal))));
										}
									}
								}
							}
						}else {
							tickLabel = "";
							zeroTickFlag = false;
						}
					}else {
						tickLabel = "";
						zeroTickFlag = false;
					}
				}
				if (tickVal > upperBoundVal) {
					return ticks;
				}
				if (tickVal >= (lowerBoundVal - (org.jfree.chart.axis.LogarithmicAxis.SMALL_LOG_VALUE))) {
					org.jfree.chart.text.TextAnchor anchor = null;
					org.jfree.chart.text.TextAnchor rotationAnchor = null;
					double angle = 0.0;
					if (isVerticalTickLabels()) {
						if (edge == (org.jfree.chart.util.RectangleEdge.LEFT)) {
							anchor = org.jfree.chart.text.TextAnchor.BOTTOM_CENTER;
							rotationAnchor = org.jfree.chart.text.TextAnchor.BOTTOM_CENTER;
							angle = (-(java.lang.Math.PI)) / 2.0;
						}else {
							anchor = org.jfree.chart.text.TextAnchor.BOTTOM_CENTER;
							rotationAnchor = org.jfree.chart.text.TextAnchor.BOTTOM_CENTER;
							angle = (java.lang.Math.PI) / 2.0;
						}
					}else {
						if (edge == (org.jfree.chart.util.RectangleEdge.LEFT)) {
							anchor = org.jfree.chart.text.TextAnchor.CENTER_RIGHT;
							rotationAnchor = org.jfree.chart.text.TextAnchor.CENTER_RIGHT;
						}else {
							anchor = org.jfree.chart.text.TextAnchor.CENTER_LEFT;
							rotationAnchor = org.jfree.chart.text.TextAnchor.CENTER_LEFT;
						}
					}
					ticks.add(new org.jfree.chart.axis.NumberTick(new java.lang.Double(tickVal), tickLabel, anchor, rotationAnchor, angle));
				}
			}
		}
		return ticks;
	}

	protected java.lang.String makeTickLabel(double val, boolean forceFmtFlag) {
		if ((org.jfree.chart.axis.LogarithmicAxis.this.expTickLabelsFlag) || forceFmtFlag) {
			return org.jfree.chart.axis.LogarithmicAxis.this.numberFormatterObj.format(val).toLowerCase();
		}
		return getTickUnit().valueToString(val);
	}

	protected java.lang.String makeTickLabel(double val) {
		return makeTickLabel(val, false);
	}
}

