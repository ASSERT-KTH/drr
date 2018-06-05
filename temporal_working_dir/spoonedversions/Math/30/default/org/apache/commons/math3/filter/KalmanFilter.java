

package org.apache.commons.math3.filter;


public class KalmanFilter {
	private final org.apache.commons.math3.filter.ProcessModel processModel;

	private final org.apache.commons.math3.filter.MeasurementModel measurementModel;

	private org.apache.commons.math3.linear.RealMatrix transitionMatrix;

	private org.apache.commons.math3.linear.RealMatrix transitionMatrixT;

	private org.apache.commons.math3.linear.RealMatrix controlMatrix;

	private org.apache.commons.math3.linear.RealMatrix measurementMatrix;

	private org.apache.commons.math3.linear.RealMatrix measurementMatrixT;

	private org.apache.commons.math3.linear.RealVector stateEstimation;

	private org.apache.commons.math3.linear.RealMatrix errorCovariance;

	public KalmanFilter(final org.apache.commons.math3.filter.ProcessModel process, final org.apache.commons.math3.filter.MeasurementModel measurement) {
		org.apache.commons.math3.util.MathUtils.checkNotNull(process);
		org.apache.commons.math3.util.MathUtils.checkNotNull(measurement);
		this.processModel = process;
		this.measurementModel = measurement;
		transitionMatrix = processModel.getStateTransitionMatrix();
		org.apache.commons.math3.util.MathUtils.checkNotNull(transitionMatrix);
		transitionMatrixT = transitionMatrix.transpose();
		if ((processModel.getControlMatrix()) == null) {
			controlMatrix = new org.apache.commons.math3.linear.Array2DRowRealMatrix();
		}else {
			controlMatrix = processModel.getControlMatrix();
		}
		measurementMatrix = measurementModel.getMeasurementMatrix();
		org.apache.commons.math3.util.MathUtils.checkNotNull(measurementMatrix);
		measurementMatrixT = measurementMatrix.transpose();
		org.apache.commons.math3.linear.RealMatrix processNoise = processModel.getProcessNoise();
		org.apache.commons.math3.util.MathUtils.checkNotNull(processNoise);
		org.apache.commons.math3.linear.RealMatrix measNoise = measurementModel.getMeasurementNoise();
		org.apache.commons.math3.util.MathUtils.checkNotNull(measNoise);
		if ((processModel.getInitialStateEstimate()) == null) {
			stateEstimation = new org.apache.commons.math3.linear.ArrayRealVector(transitionMatrix.getColumnDimension());
		}else {
			stateEstimation = processModel.getInitialStateEstimate();
		}
		if ((transitionMatrix.getColumnDimension()) != (stateEstimation.getDimension())) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(transitionMatrix.getColumnDimension(), stateEstimation.getDimension());
		}
		if ((processModel.getInitialErrorCovariance()) == null) {
			errorCovariance = processNoise.copy();
		}else {
			errorCovariance = processModel.getInitialErrorCovariance();
		}
		if (!(transitionMatrix.isSquare())) {
			throw new org.apache.commons.math3.linear.NonSquareMatrixException(transitionMatrix.getRowDimension(), transitionMatrix.getColumnDimension());
		}
		if (((((controlMatrix) != null) && ((controlMatrix.getRowDimension()) > 0)) && ((controlMatrix.getColumnDimension()) > 0)) && (((controlMatrix.getRowDimension()) != (transitionMatrix.getRowDimension())) || ((controlMatrix.getColumnDimension()) != 1))) {
			throw new org.apache.commons.math3.linear.MatrixDimensionMismatchException(controlMatrix.getRowDimension(), controlMatrix.getColumnDimension(), transitionMatrix.getRowDimension(), 1);
		}
		org.apache.commons.math3.linear.MatrixUtils.checkAdditionCompatible(transitionMatrix, processNoise);
		if ((measurementMatrix.getColumnDimension()) != (transitionMatrix.getRowDimension())) {
			throw new org.apache.commons.math3.linear.MatrixDimensionMismatchException(measurementMatrix.getRowDimension(), measurementMatrix.getColumnDimension(), measurementMatrix.getRowDimension(), transitionMatrix.getRowDimension());
		}
		if (((measNoise.getRowDimension()) != (measurementMatrix.getRowDimension())) || ((measNoise.getColumnDimension()) != 1)) {
			throw new org.apache.commons.math3.linear.MatrixDimensionMismatchException(measNoise.getRowDimension(), measNoise.getColumnDimension(), measurementMatrix.getRowDimension(), 1);
		}
	}

	public int getStateDimension() {
		return stateEstimation.getDimension();
	}

	public int getMeasurementDimension() {
		return measurementMatrix.getRowDimension();
	}

	public double[] getStateEstimation() {
		return stateEstimation.toArray();
	}

	public org.apache.commons.math3.linear.RealVector getStateEstimationVector() {
		return stateEstimation.copy();
	}

	public double[][] getErrorCovariance() {
		return errorCovariance.getData();
	}

	public org.apache.commons.math3.linear.RealMatrix getErrorCovarianceMatrix() {
		return errorCovariance.copy();
	}

	public void predict() {
		predict(((org.apache.commons.math3.linear.RealVector) (null)));
	}

	public void predict(final double[] u) {
		predict(new org.apache.commons.math3.linear.ArrayRealVector(u));
	}

	public void predict(final org.apache.commons.math3.linear.RealVector u) {
		if ((u != null) && ((u.getDimension()) != (controlMatrix.getColumnDimension()))) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(u.getDimension(), controlMatrix.getColumnDimension());
		}
		stateEstimation = transitionMatrix.operate(stateEstimation);
		if (u != null) {
			stateEstimation = stateEstimation.add(controlMatrix.operate(u));
		}
		errorCovariance = transitionMatrix.multiply(errorCovariance).multiply(transitionMatrixT).add(processModel.getProcessNoise());
	}

	public void correct(final double[] z) {
		correct(new org.apache.commons.math3.linear.ArrayRealVector(z));
	}

	public void correct(final org.apache.commons.math3.linear.RealVector z) {
		org.apache.commons.math3.util.MathUtils.checkNotNull(z);
		if ((z.getDimension()) != (measurementMatrix.getRowDimension())) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(z.getDimension(), measurementMatrix.getRowDimension());
		}
		org.apache.commons.math3.linear.RealMatrix s = measurementMatrix.multiply(errorCovariance).multiply(measurementMatrixT).add(measurementModel.getMeasurementNoise());
		org.apache.commons.math3.linear.DecompositionSolver solver = new org.apache.commons.math3.linear.CholeskyDecomposition(s).getSolver();
		org.apache.commons.math3.linear.RealMatrix invertedS = solver.getInverse();
		org.apache.commons.math3.linear.RealVector innovation = z.subtract(measurementMatrix.operate(stateEstimation));
		org.apache.commons.math3.linear.RealMatrix kalmanGain = errorCovariance.multiply(measurementMatrixT).multiply(invertedS);
		stateEstimation = stateEstimation.add(kalmanGain.operate(innovation));
		org.apache.commons.math3.linear.RealMatrix identity = org.apache.commons.math3.linear.MatrixUtils.createRealIdentityMatrix(kalmanGain.getRowDimension());
		errorCovariance = identity.subtract(kalmanGain.multiply(measurementMatrix)).multiply(errorCovariance);
	}
}

