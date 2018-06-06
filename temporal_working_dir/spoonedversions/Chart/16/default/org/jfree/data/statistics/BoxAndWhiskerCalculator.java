

package org.jfree.data.statistics;


public abstract class BoxAndWhiskerCalculator {
	public static org.jfree.data.statistics.BoxAndWhiskerItem calculateBoxAndWhiskerStatistics(java.util.List values) {
		return org.jfree.data.statistics.BoxAndWhiskerCalculator.calculateBoxAndWhiskerStatistics(values, true);
	}

	public static org.jfree.data.statistics.BoxAndWhiskerItem calculateBoxAndWhiskerStatistics(java.util.List values, boolean stripNullAndNaNItems) {
		if (values == null) {
			throw new java.lang.IllegalArgumentException("Null 'values' argument.");
		}
		java.util.List vlist;
		if (stripNullAndNaNItems) {
			vlist = new java.util.ArrayList(values.size());
			java.util.Iterator iterator = values.listIterator();
			while (iterator.hasNext()) {
				java.lang.Object obj = iterator.next();
				if (obj instanceof java.lang.Number) {
					java.lang.Number n = ((java.lang.Number) (obj));
					double v = n.doubleValue();
					if (!(java.lang.Double.isNaN(v))) {
						vlist.add(n);
					}
				}
			} 
		}else {
			vlist = values;
		}
		java.util.Collections.sort(vlist);
		double mean = org.jfree.data.statistics.Statistics.calculateMean(vlist, false);
		double median = org.jfree.data.statistics.Statistics.calculateMedian(vlist, false);
		double q1 = org.jfree.data.statistics.BoxAndWhiskerCalculator.calculateQ1(vlist);
		double q3 = org.jfree.data.statistics.BoxAndWhiskerCalculator.calculateQ3(vlist);
		double interQuartileRange = q3 - q1;
		double upperOutlierThreshold = q3 + (interQuartileRange * 1.5);
		double lowerOutlierThreshold = q1 - (interQuartileRange * 1.5);
		double upperFaroutThreshold = q3 + (interQuartileRange * 2.0);
		double lowerFaroutThreshold = q1 - (interQuartileRange * 2.0);
		double minRegularValue = java.lang.Double.POSITIVE_INFINITY;
		double maxRegularValue = java.lang.Double.NEGATIVE_INFINITY;
		double minOutlier = java.lang.Double.POSITIVE_INFINITY;
		double maxOutlier = java.lang.Double.NEGATIVE_INFINITY;
		java.util.List outliers = new java.util.ArrayList();
		java.util.Iterator iterator = vlist.iterator();
		while (iterator.hasNext()) {
			java.lang.Number number = ((java.lang.Number) (iterator.next()));
			double value = number.doubleValue();
			if (value > upperOutlierThreshold) {
				outliers.add(number);
				if ((value > maxOutlier) && (value <= upperFaroutThreshold)) {
					maxOutlier = value;
				}
			}else
				if (value < lowerOutlierThreshold) {
					outliers.add(number);
					if ((value < minOutlier) && (value >= lowerFaroutThreshold)) {
						minOutlier = value;
					}
				}else {
					minRegularValue = java.lang.Math.min(minRegularValue, value);
					maxRegularValue = java.lang.Math.max(maxRegularValue, value);
				}
			
			minOutlier = java.lang.Math.min(minOutlier, minRegularValue);
			maxOutlier = java.lang.Math.max(maxOutlier, maxRegularValue);
		} 
		return new org.jfree.data.statistics.BoxAndWhiskerItem(new java.lang.Double(mean), new java.lang.Double(median), new java.lang.Double(q1), new java.lang.Double(q3), new java.lang.Double(minRegularValue), new java.lang.Double(maxRegularValue), new java.lang.Double(minOutlier), new java.lang.Double(maxOutlier), outliers);
	}

	public static double calculateQ1(java.util.List values) {
		if (values == null) {
			throw new java.lang.IllegalArgumentException("Null 'values' argument.");
		}
		double result = java.lang.Double.NaN;
		int count = values.size();
		if (count > 0) {
			if ((count % 2) == 1) {
				if (count > 1) {
					result = org.jfree.data.statistics.Statistics.calculateMedian(values, 0, (count / 2));
				}else {
					result = org.jfree.data.statistics.Statistics.calculateMedian(values, 0, 0);
				}
			}else {
				result = org.jfree.data.statistics.Statistics.calculateMedian(values, 0, ((count / 2) - 1));
			}
		}
		return result;
	}

	public static double calculateQ3(java.util.List values) {
		if (values == null) {
			throw new java.lang.IllegalArgumentException("Null 'values' argument.");
		}
		double result = java.lang.Double.NaN;
		int count = values.size();
		if (count > 0) {
			if ((count % 2) == 1) {
				if (count > 1) {
					result = org.jfree.data.statistics.Statistics.calculateMedian(values, (count / 2), (count - 1));
				}else {
					result = org.jfree.data.statistics.Statistics.calculateMedian(values, 0, 0);
				}
			}else {
				result = org.jfree.data.statistics.Statistics.calculateMedian(values, (count / 2), (count - 1));
			}
		}
		return result;
	}
}

