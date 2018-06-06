

package org.jfree.data.statistics;


public abstract class Statistics {
	public static double calculateMean(java.lang.Number[] values) {
		return org.jfree.data.statistics.Statistics.calculateMean(values, true);
	}

	public static double calculateMean(java.lang.Number[] values, boolean includeNullAndNaN) {
		if (values == null) {
			throw new java.lang.IllegalArgumentException("Null 'values' argument.");
		}
		double sum = 0.0;
		double current;
		int counter = 0;
		for (int i = 0; i < (values.length); i++) {
			if ((values[i]) != null) {
				current = values[i].doubleValue();
			}else {
				current = java.lang.Double.NaN;
			}
			if (includeNullAndNaN || (!(java.lang.Double.isNaN(current)))) {
				sum = sum + current;
				counter++;
			}
		}
		double result = sum / counter;
		return result;
	}

	public static double calculateMean(java.util.Collection values) {
		return org.jfree.data.statistics.Statistics.calculateMean(values, true);
	}

	public static double calculateMean(java.util.Collection values, boolean includeNullAndNaN) {
		if (values == null) {
			throw new java.lang.IllegalArgumentException("Null 'values' argument.");
		}
		int count = 0;
		double total = 0.0;
		java.util.Iterator iterator = values.iterator();
		while (iterator.hasNext()) {
			java.lang.Object object = iterator.next();
			if (object == null) {
				if (includeNullAndNaN) {
					return java.lang.Double.NaN;
				}
			}else {
				if (object instanceof java.lang.Number) {
					java.lang.Number number = ((java.lang.Number) (object));
					double value = number.doubleValue();
					if (java.lang.Double.isNaN(value)) {
						if (includeNullAndNaN) {
							return java.lang.Double.NaN;
						}
					}else {
						total = total + (number.doubleValue());
						count = count + 1;
					}
				}
			}
		} 
		return total / count;
	}

	public static double calculateMedian(java.util.List values) {
		return org.jfree.data.statistics.Statistics.calculateMedian(values, true);
	}

	public static double calculateMedian(java.util.List values, boolean copyAndSort) {
		double result = java.lang.Double.NaN;
		if (values != null) {
			if (copyAndSort) {
				int itemCount = values.size();
				java.util.List copy = new java.util.ArrayList(itemCount);
				for (int i = 0; i < itemCount; i++) {
					copy.add(i, values.get(i));
				}
				java.util.Collections.sort(copy);
				values = copy;
			}
			int count = values.size();
			if (count > 0) {
				if ((count % 2) == 1) {
					if (count > 1) {
						java.lang.Number value = ((java.lang.Number) (values.get(((count - 1) / 2))));
						result = value.doubleValue();
					}else {
						java.lang.Number value = ((java.lang.Number) (values.get(0)));
						result = value.doubleValue();
					}
				}else {
					java.lang.Number value1 = ((java.lang.Number) (values.get(((count / 2) - 1))));
					java.lang.Number value2 = ((java.lang.Number) (values.get((count / 2))));
					result = ((value1.doubleValue()) + (value2.doubleValue())) / 2.0;
				}
			}
		}
		return result;
	}

	public static double calculateMedian(java.util.List values, int start, int end) {
		return org.jfree.data.statistics.Statistics.calculateMedian(values, start, end, true);
	}

	public static double calculateMedian(java.util.List values, int start, int end, boolean copyAndSort) {
		double result = java.lang.Double.NaN;
		if (copyAndSort) {
			java.util.List working = new java.util.ArrayList(((end - start) + 1));
			for (int i = start; i <= end; i++) {
				working.add(values.get(i));
			}
			java.util.Collections.sort(working);
			result = org.jfree.data.statistics.Statistics.calculateMedian(working, false);
		}else {
			int count = (end - start) + 1;
			if (count > 0) {
				if ((count % 2) == 1) {
					if (count > 1) {
						java.lang.Number value = ((java.lang.Number) (values.get((start + ((count - 1) / 2)))));
						result = value.doubleValue();
					}else {
						java.lang.Number value = ((java.lang.Number) (values.get(start)));
						result = value.doubleValue();
					}
				}else {
					java.lang.Number value1 = ((java.lang.Number) (values.get(((start + (count / 2)) - 1))));
					java.lang.Number value2 = ((java.lang.Number) (values.get((start + (count / 2)))));
					result = ((value1.doubleValue()) + (value2.doubleValue())) / 2.0;
				}
			}
		}
		return result;
	}

	public static double getStdDev(java.lang.Number[] data) {
		if (data == null) {
			throw new java.lang.IllegalArgumentException("Null 'data' array.");
		}
		if ((data.length) == 0) {
			throw new java.lang.IllegalArgumentException("Zero length 'data' array.");
		}
		double avg = org.jfree.data.statistics.Statistics.calculateMean(data);
		double sum = 0.0;
		for (int counter = 0; counter < (data.length); counter++) {
			double diff = (data[counter].doubleValue()) - avg;
			sum = sum + (diff * diff);
		}
		return java.lang.Math.sqrt((sum / ((data.length) - 1)));
	}

	public static double[] getLinearFit(java.lang.Number[] xData, java.lang.Number[] yData) {
		if (xData == null) {
			throw new java.lang.IllegalArgumentException("Null 'xData' argument.");
		}
		if (yData == null) {
			throw new java.lang.IllegalArgumentException("Null 'yData' argument.");
		}
		if ((xData.length) != (yData.length)) {
			throw new java.lang.IllegalArgumentException("Statistics.getLinearFit(): array lengths must be equal.");
		}
		double[] result = new double[2];
		result[1] = org.jfree.data.statistics.Statistics.getSlope(xData, yData);
		result[0] = (org.jfree.data.statistics.Statistics.calculateMean(yData)) - ((result[1]) * (org.jfree.data.statistics.Statistics.calculateMean(xData)));
		return result;
	}

	public static double getSlope(java.lang.Number[] xData, java.lang.Number[] yData) {
		if (xData == null) {
			throw new java.lang.IllegalArgumentException("Null 'xData' argument.");
		}
		if (yData == null) {
			throw new java.lang.IllegalArgumentException("Null 'yData' argument.");
		}
		if ((xData.length) != (yData.length)) {
			throw new java.lang.IllegalArgumentException("Array lengths must be equal.");
		}
		double sx = 0.0;
		double sxx = 0.0;
		double sxy = 0.0;
		double sy = 0.0;
		int counter;
		for (counter = 0; counter < (xData.length); counter++) {
			sx = sx + (xData[counter].doubleValue());
			sxx = sxx + (java.lang.Math.pow(xData[counter].doubleValue(), 2));
			sxy = sxy + ((yData[counter].doubleValue()) * (xData[counter].doubleValue()));
			sy = sy + (yData[counter].doubleValue());
		}
		return (sxy - ((sx * sy) / counter)) / (sxx - ((sx * sx) / counter));
	}

	public static double getCorrelation(java.lang.Number[] data1, java.lang.Number[] data2) {
		if (data1 == null) {
			throw new java.lang.IllegalArgumentException("Null 'data1' argument.");
		}
		if (data2 == null) {
			throw new java.lang.IllegalArgumentException("Null 'data2' argument.");
		}
		if ((data1.length) != (data2.length)) {
			throw new java.lang.IllegalArgumentException("'data1' and 'data2' arrays must have same length.");
		}
		int n = data1.length;
		double sumX = 0.0;
		double sumY = 0.0;
		double sumX2 = 0.0;
		double sumY2 = 0.0;
		double sumXY = 0.0;
		for (int i = 0; i < n; i++) {
			double x = 0.0;
			if ((data1[i]) != null) {
				x = data1[i].doubleValue();
			}
			double y = 0.0;
			if ((data2[i]) != null) {
				y = data2[i].doubleValue();
			}
			sumX = sumX + x;
			sumY = sumY + y;
			sumXY = sumXY + (x * y);
			sumX2 = sumX2 + (x * x);
			sumY2 = sumY2 + (y * y);
		}
		return ((n * sumXY) - (sumX * sumY)) / (java.lang.Math.pow((((n * sumX2) - (sumX * sumX)) * ((n * sumY2) - (sumY * sumY))), 0.5));
	}

	public static double[][] getMovingAverage(java.lang.Number[] xData, java.lang.Number[] yData, int period) {
		if ((xData.length) != (yData.length)) {
			throw new java.lang.IllegalArgumentException("Array lengths must be equal.");
		}
		if (period > (xData.length)) {
			throw new java.lang.IllegalArgumentException("Period can't be longer than dataset.");
		}
		double[][] result = new double[(xData.length) - period][2];
		for (int i = 0; i < (result.length); i++) {
			result[i][0] = xData[(i + period)].doubleValue();
			double sum = 0.0;
			for (int j = 0; j < period; j++) {
				sum += yData[(i + j)].doubleValue();
			}
			sum = sum / period;
			result[i][1] = sum;
		}
		return result;
	}
}

