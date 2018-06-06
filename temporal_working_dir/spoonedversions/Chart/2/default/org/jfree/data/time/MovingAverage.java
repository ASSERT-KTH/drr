

package org.jfree.data.time;


public class MovingAverage {
	public static org.jfree.data.time.TimeSeriesCollection createMovingAverage(org.jfree.data.time.TimeSeriesCollection source, java.lang.String suffix, int periodCount, int skip) {
		if (source == null) {
			throw new java.lang.IllegalArgumentException("Null 'source' argument.");
		}
		if (periodCount < 1) {
			throw new java.lang.IllegalArgumentException(("periodCount must be greater " + "than or equal to 1."));
		}
		org.jfree.data.time.TimeSeriesCollection result = new org.jfree.data.time.TimeSeriesCollection();
		for (int i = 0; i < (source.getSeriesCount()); i++) {
			org.jfree.data.time.TimeSeries sourceSeries = source.getSeries(i);
			org.jfree.data.time.TimeSeries maSeries = org.jfree.data.time.MovingAverage.createMovingAverage(sourceSeries, ((sourceSeries.getKey()) + suffix), periodCount, skip);
			result.addSeries(maSeries);
		}
		return result;
	}

	public static org.jfree.data.time.TimeSeries createMovingAverage(org.jfree.data.time.TimeSeries source, java.lang.String name, int periodCount, int skip) {
		if (source == null) {
			throw new java.lang.IllegalArgumentException("Null source.");
		}
		if (periodCount < 1) {
			throw new java.lang.IllegalArgumentException(("periodCount must be greater " + "than or equal to 1."));
		}
		org.jfree.data.time.TimeSeries result = new org.jfree.data.time.TimeSeries(name);
		if ((source.getItemCount()) > 0) {
			long firstSerial = (source.getTimePeriod(0).getSerialIndex()) + skip;
			for (int i = (source.getItemCount()) - 1; i >= 0; i--) {
				org.jfree.data.time.RegularTimePeriod period = source.getTimePeriod(i);
				long serial = period.getSerialIndex();
				if (serial >= firstSerial) {
					int n = 0;
					double sum = 0.0;
					long serialLimit = (period.getSerialIndex()) - periodCount;
					int offset = 0;
					boolean finished = false;
					while ((offset < periodCount) && (!finished)) {
						if ((i - offset) >= 0) {
							org.jfree.data.time.TimeSeriesDataItem item = source.getRawDataItem((i - offset));
							org.jfree.data.time.RegularTimePeriod p = item.getPeriod();
							java.lang.Number v = item.getValue();
							long currentIndex = p.getSerialIndex();
							if (currentIndex > serialLimit) {
								if (v != null) {
									sum = sum + (v.doubleValue());
									n = n + 1;
								}
							}else {
								finished = true;
							}
						}
						offset = offset + 1;
					} 
					if (n > 0) {
						result.add(period, (sum / n));
					}else {
						result.add(period, null);
					}
				}
			}
		}
		return result;
	}

	public static org.jfree.data.time.TimeSeries createPointMovingAverage(org.jfree.data.time.TimeSeries source, java.lang.String name, int pointCount) {
		if (source == null) {
			throw new java.lang.IllegalArgumentException("Null 'source'.");
		}
		if (pointCount < 2) {
			throw new java.lang.IllegalArgumentException(("periodCount must be greater " + "than or equal to 2."));
		}
		org.jfree.data.time.TimeSeries result = new org.jfree.data.time.TimeSeries(name);
		double rollingSumForPeriod = 0.0;
		for (int i = 0; i < (source.getItemCount()); i++) {
			org.jfree.data.time.TimeSeriesDataItem current = source.getRawDataItem(i);
			org.jfree.data.time.RegularTimePeriod period = current.getPeriod();
			rollingSumForPeriod += current.getValue().doubleValue();
			if (i > (pointCount - 1)) {
				org.jfree.data.time.TimeSeriesDataItem startOfMovingAvg = source.getRawDataItem((i - pointCount));
				rollingSumForPeriod -= startOfMovingAvg.getValue().doubleValue();
				result.add(period, (rollingSumForPeriod / pointCount));
			}else
				if (i == (pointCount - 1)) {
					result.add(period, (rollingSumForPeriod / pointCount));
				}
			
		}
		return result;
	}

	public static org.jfree.data.xy.XYDataset createMovingAverage(org.jfree.data.xy.XYDataset source, java.lang.String suffix, long period, long skip) {
		return org.jfree.data.time.MovingAverage.createMovingAverage(source, suffix, ((double) (period)), ((double) (skip)));
	}

	public static org.jfree.data.xy.XYDataset createMovingAverage(org.jfree.data.xy.XYDataset source, java.lang.String suffix, double period, double skip) {
		if (source == null) {
			throw new java.lang.IllegalArgumentException("Null source (XYDataset).");
		}
		org.jfree.data.xy.XYSeriesCollection result = new org.jfree.data.xy.XYSeriesCollection();
		for (int i = 0; i < (source.getSeriesCount()); i++) {
			org.jfree.data.xy.XYSeries s = org.jfree.data.time.MovingAverage.createMovingAverage(source, i, ((source.getSeriesKey(i)) + suffix), period, skip);
			result.addSeries(s);
		}
		return result;
	}

	public static org.jfree.data.xy.XYSeries createMovingAverage(org.jfree.data.xy.XYDataset source, int series, java.lang.String name, double period, double skip) {
		if (source == null) {
			throw new java.lang.IllegalArgumentException("Null source (XYDataset).");
		}
		if (period < (java.lang.Double.MIN_VALUE)) {
			throw new java.lang.IllegalArgumentException("period must be positive.");
		}
		if (skip < 0.0) {
			throw new java.lang.IllegalArgumentException("skip must be >= 0.0.");
		}
		org.jfree.data.xy.XYSeries result = new org.jfree.data.xy.XYSeries(name);
		if ((source.getItemCount(series)) > 0) {
			double first = (source.getXValue(series, 0)) + skip;
			for (int i = (source.getItemCount(series)) - 1; i >= 0; i--) {
				double x = source.getXValue(series, i);
				if (x >= first) {
					int n = 0;
					double sum = 0.0;
					double limit = x - period;
					int offset = 0;
					boolean finished = false;
					while (!finished) {
						if ((i - offset) >= 0) {
							double xx = source.getXValue(series, (i - offset));
							java.lang.Number yy = source.getY(series, (i - offset));
							if (xx > limit) {
								if (yy != null) {
									sum = sum + (yy.doubleValue());
									n = n + 1;
								}
							}else {
								finished = true;
							}
						}else {
							finished = true;
						}
						offset = offset + 1;
					} 
					if (n > 0) {
						result.add(x, (sum / n));
					}else {
						result.add(x, null);
					}
				}
			}
		}
		return result;
	}
}

