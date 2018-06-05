

package org.jfree.data.statistics;


public abstract class Regression {
	public static double[] getOLSRegression(double[][] data) {
		int n = data.length;
		if (n < 2) {
			throw new java.lang.IllegalArgumentException("Not enough data.");
		}
		double sumX = 0;
		double sumY = 0;
		double sumXX = 0;
		double sumXY = 0;
		for (int i = 0; i < n; i++) {
			double x = data[i][0];
			double y = data[i][1];
			sumX += x;
			sumY += y;
			double xx = x * x;
			sumXX += xx;
			double xy = x * y;
			sumXY += xy;
		}
		double sxx = sumXX - ((sumX * sumX) / n);
		double sxy = sumXY - ((sumX * sumY) / n);
		double xbar = sumX / n;
		double ybar = sumY / n;
		double[] result = new double[2];
		result[1] = sxy / sxx;
		result[0] = ybar - ((result[1]) * xbar);
		return result;
	}

	public static double[] getOLSRegression(org.jfree.data.xy.XYDataset data, int series) {
		int n = data.getItemCount(series);
		if (n < 2) {
			throw new java.lang.IllegalArgumentException("Not enough data.");
		}
		double sumX = 0;
		double sumY = 0;
		double sumXX = 0;
		double sumXY = 0;
		for (int i = 0; i < n; i++) {
			double x = data.getXValue(series, i);
			double y = data.getYValue(series, i);
			sumX += x;
			sumY += y;
			double xx = x * x;
			sumXX += xx;
			double xy = x * y;
			sumXY += xy;
		}
		double sxx = sumXX - ((sumX * sumX) / n);
		double sxy = sumXY - ((sumX * sumY) / n);
		double xbar = sumX / n;
		double ybar = sumY / n;
		double[] result = new double[2];
		result[1] = sxy / sxx;
		result[0] = ybar - ((result[1]) * xbar);
		return result;
	}

	public static double[] getPowerRegression(double[][] data) {
		int n = data.length;
		if (n < 2) {
			throw new java.lang.IllegalArgumentException("Not enough data.");
		}
		double sumX = 0;
		double sumY = 0;
		double sumXX = 0;
		double sumXY = 0;
		for (int i = 0; i < n; i++) {
			double x = java.lang.Math.log(data[i][0]);
			double y = java.lang.Math.log(data[i][1]);
			sumX += x;
			sumY += y;
			double xx = x * x;
			sumXX += xx;
			double xy = x * y;
			sumXY += xy;
		}
		double sxx = sumXX - ((sumX * sumX) / n);
		double sxy = sumXY - ((sumX * sumY) / n);
		double xbar = sumX / n;
		double ybar = sumY / n;
		double[] result = new double[2];
		result[1] = sxy / sxx;
		result[0] = java.lang.Math.pow(java.lang.Math.exp(1.0), (ybar - ((result[1]) * xbar)));
		return result;
	}

	public static double[] getPowerRegression(org.jfree.data.xy.XYDataset data, int series) {
		int n = data.getItemCount(series);
		if (n < 2) {
			throw new java.lang.IllegalArgumentException("Not enough data.");
		}
		double sumX = 0;
		double sumY = 0;
		double sumXX = 0;
		double sumXY = 0;
		for (int i = 0; i < n; i++) {
			double x = java.lang.Math.log(data.getXValue(series, i));
			double y = java.lang.Math.log(data.getYValue(series, i));
			sumX += x;
			sumY += y;
			double xx = x * x;
			sumXX += xx;
			double xy = x * y;
			sumXY += xy;
		}
		double sxx = sumXX - ((sumX * sumX) / n);
		double sxy = sumXY - ((sumX * sumY) / n);
		double xbar = sumX / n;
		double ybar = sumY / n;
		double[] result = new double[2];
		result[1] = sxy / sxx;
		result[0] = java.lang.Math.pow(java.lang.Math.exp(1.0), (ybar - ((result[1]) * xbar)));
		return result;
	}
}

