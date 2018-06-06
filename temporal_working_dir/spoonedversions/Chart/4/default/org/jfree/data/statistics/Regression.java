

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

	public static double[] getPolynomialRegression(org.jfree.data.xy.XYDataset dataset, int series, int order) {
		if (dataset == null) {
			throw new java.lang.IllegalArgumentException("Null 'dataset' argument.");
		}
		int itemCount = dataset.getItemCount(series);
		if (itemCount < (order + 1)) {
			throw new java.lang.IllegalArgumentException("Not enough data.");
		}
		int validItems = 0;
		double[][] data = new double[2][itemCount];
		for (int item = 0; item < itemCount; item++) {
			double x = dataset.getXValue(series, item);
			double y = dataset.getYValue(series, item);
			if ((!(java.lang.Double.isNaN(x))) && (!(java.lang.Double.isNaN(y)))) {
				data[0][validItems] = x;
				data[1][validItems] = y;
				validItems++;
			}
		}
		if (validItems < (order + 1)) {
			throw new java.lang.IllegalArgumentException("Not enough data.");
		}
		int equations = order + 1;
		int coefficients = order + 2;
		double[] result = new double[equations + 1];
		double[][] matrix = new double[equations][coefficients];
		double sumX = 0.0;
		double sumY = 0.0;
		for (int item = 0; item < validItems; item++) {
			sumX += data[0][item];
			sumY += data[1][item];
			for (int eq = 0; eq < equations; eq++) {
				for (int coe = 0; coe < (coefficients - 1); coe++) {
					matrix[eq][coe] += java.lang.Math.pow(data[0][item], (eq + coe));
				}
				matrix[eq][(coefficients - 1)] += (data[1][item]) * (java.lang.Math.pow(data[0][item], eq));
			}
		}
		double[][] subMatrix = org.jfree.data.statistics.Regression.calculateSubMatrix(matrix);
		for (int eq = 1; eq < equations; eq++) {
			matrix[eq][0] = 0;
			for (int coe = 1; coe < coefficients; coe++) {
				matrix[eq][coe] = subMatrix[(eq - 1)][(coe - 1)];
			}
		}
		for (int eq = equations - 1; eq > (-1); eq--) {
			double value = matrix[eq][(coefficients - 1)];
			for (int coe = eq; coe < (coefficients - 1); coe++) {
				value -= (matrix[eq][coe]) * (result[coe]);
			}
			result[eq] = value / (matrix[eq][eq]);
		}
		double meanY = sumY / validItems;
		double yObsSquare = 0.0;
		double yRegSquare = 0.0;
		for (int item = 0; item < validItems; item++) {
			double yCalc = 0;
			for (int eq = 0; eq < equations; eq++) {
				yCalc += (result[eq]) * (java.lang.Math.pow(data[0][item], eq));
			}
			yRegSquare += java.lang.Math.pow((yCalc - meanY), 2);
			yObsSquare += java.lang.Math.pow(((data[1][item]) - meanY), 2);
		}
		double rSquare = yRegSquare / yObsSquare;
		result[equations] = rSquare;
		return result;
	}

	private static double[][] calculateSubMatrix(double[][] matrix) {
		int equations = matrix.length;
		int coefficients = matrix[0].length;
		double[][] result = new double[equations - 1][coefficients - 1];
		for (int eq = 1; eq < equations; eq++) {
			double factor = (matrix[0][0]) / (matrix[eq][0]);
			for (int coe = 1; coe < coefficients; coe++) {
				result[(eq - 1)][(coe - 1)] = (matrix[0][coe]) - ((matrix[eq][coe]) * factor);
			}
		}
		if (equations == 1) {
			return result;
		}
		if ((result[0][0]) == 0) {
			boolean found = false;
			for (int i = 0; i < (result.length); i++) {
				if ((result[i][0]) != 0) {
					found = true;
					double[] temp = result[0];
					for (int j = 0; j < (result[i].length); j++) {
						result[0][j] = result[i][j];
					}
					for (int j = 0; j < (temp.length); j++) {
						result[i][j] = temp[j];
					}
					break;
				}
			}
			if (!found) {
				java.lang.System.out.println("Equation has no solution!");
				return new double[equations - 1][coefficients - 1];
			}
		}
		double[][] subMatrix = org.jfree.data.statistics.Regression.calculateSubMatrix(result);
		for (int eq = 1; eq < (equations - 1); eq++) {
			result[eq][0] = 0;
			for (int coe = 1; coe < (coefficients - 1); coe++) {
				result[eq][coe] = subMatrix[(eq - 1)][(coe - 1)];
			}
		}
		return result;
	}
}

