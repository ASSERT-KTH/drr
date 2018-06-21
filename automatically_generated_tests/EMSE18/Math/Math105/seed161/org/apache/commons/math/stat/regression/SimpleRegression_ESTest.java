

package org.apache.commons.math.stat.regression;

import org.junit.Assert;
import org.junit.Test;

public class SimpleRegression_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[2][7];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.getSignificance();
        Assert.assertEquals(4L, simpleRegression0.getN());
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(2493.0, 0.0);
        simpleRegression0.addData(0.0, 0.0);
        double double0 = simpleRegression0.predict(0.0);
        Assert.assertEquals(2L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[5][3];
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 3877.487546402602;
        doubleArray1[1] = -200.801515923044;
        doubleArray0[0] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.predict(0.05);
        Assert.assertEquals(5L, simpleRegression0.getN());
        Assert.assertEquals((-0.002589325091581819), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[2][9];
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 2327.0;
        doubleArray0[0] = doubleArray1;
        double[] doubleArray2 = new double[3];
        doubleArray2[1] = 8451546.393087681;
        doubleArray0[1] = doubleArray2;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSumSquaredErrors();
        Assert.assertEquals(3.5714318217256695E13, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals((-0.0078125), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        double[][] doubleArray0 = new double[3][1];
        double[] doubleArray1 = new double[2];
        doubleArray1[0] = -4003.5283008244;
        doubleArray0[0] = doubleArray1;
        double[] doubleArray2 = new double[22];
        doubleArray0[1] = doubleArray2;
        doubleArray0[2] = doubleArray1;
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlopeStdErr();
        Assert.assertEquals(3L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[3][1];
        double[] doubleArray1 = new double[2];
        doubleArray1[0] = -4003.5283008244;
        doubleArray0[0] = doubleArray1;
        doubleArray0[1] = doubleArray1;
        double[] doubleArray2 = new double[2];
        doubleArray0[2] = doubleArray2;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlopeConfidenceInterval(Double.NaN);
        Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(44.048628609, (-800.824));
        double[][] doubleArray0 = new double[2][2];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlopeConfidenceInterval(4.9E-323);
        Assert.assertEquals(3L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[3][1];
        double[] doubleArray1 = new double[2];
        doubleArray1[0] = -4003.5283008244;
        doubleArray0[0] = doubleArray1;
        doubleArray0[1] = doubleArray1;
        double[] doubleArray2 = new double[2];
        doubleArray0[2] = doubleArray2;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlopeConfidenceInterval();
        Assert.assertEquals(0.0, simpleRegression0.getIntercept(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData((-932.3380546149472), 4.9E-323);
        simpleRegression0.addData(0.0, 0.0);
        double double0 = simpleRegression0.getSlope();
        Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals((-0.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[2][7];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData((-280.9682408), 0.0);
        double double0 = simpleRegression0.getRegressionSumSquares();
        Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[2][7];
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = -2754.0;
        doubleArray1[1] = -2754.0;
        doubleArray0[0] = doubleArray1;
        double[] doubleArray2 = new double[3];
        doubleArray2[0] = 804.92914;
        doubleArray0[1] = doubleArray2;
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData((-2754.0), 0.0);
        simpleRegression0.addData(804.92914, (-2754.0));
        double double0 = simpleRegression0.getRSquare();
        Assert.assertEquals(4L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[3][3];
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = -137.886467769478;
        doubleArray0[0] = doubleArray1;
        double[] doubleArray2 = new double[5];
        doubleArray2[0] = -137.886467769478;
        doubleArray0[2] = doubleArray2;
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData((-137.886467769478), (-137.886467769478));
        double double0 = simpleRegression0.getR();
        Assert.assertEquals(4L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData((-1425.0), (-1728.691242668));
        long long0 = simpleRegression0.getN();
        Assert.assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[2][7];
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 934.7462401013295;
        doubleArray1[1] = 934.7462401013295;
        doubleArray0[0] = doubleArray1;
        doubleArray0[1] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData((-280.9682408), 0.0);
        double double0 = simpleRegression0.getMeanSquareError();
        Assert.assertEquals(3L, simpleRegression0.getN());
        Assert.assertEquals((-1.1641532182693481E-10), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(2175.83020664, 2175.83020664);
        double[][] doubleArray0 = new double[7][6];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getInterceptStdErr();
        Assert.assertEquals(8L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(2175.83020664, 2175.83020664);
        double[][] doubleArray0 = new double[7][6];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getIntercept();
        Assert.assertEquals(4142457.452111182, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[3][3];
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = -137.886467769478;
        doubleArray0[0] = doubleArray1;
        double[] doubleArray2 = new double[6];
        doubleArray2[0] = -1.0;
        doubleArray0[1] = doubleArray2;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getIntercept();
        Assert.assertEquals(3L, simpleRegression0.getN());
        Assert.assertEquals((-68.943233884739), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[4][6];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.getSlopeConfidenceInterval(1.0E-6);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[2][7];
        simpleRegression0.addData((-1425.0), (-1728.691242668));
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getMeanSquareError();
        Assert.assertEquals(3L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double double0 = simpleRegression0.getMeanSquareError();
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double double0 = simpleRegression0.getTotalSumSquares();
        Assert.assertEquals(Double.NaN, double0, 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(4.9E-323, 4.9E-323);
        Assert.assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01);
        simpleRegression0.addData(Double.NaN, 4.9E-323);
        double double0 = simpleRegression0.getTotalSumSquares();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(0.0, 0.0);
        simpleRegression0.addData(0.0, 0.0);
        double double0 = simpleRegression0.getSlope();
        Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData((-1085.1344684824583), 1864.0);
        simpleRegression0.addData(0.0, 0.0);
        double double0 = simpleRegression0.getSlope();
        Assert.assertEquals(2L, simpleRegression0.getN());
        Assert.assertEquals((-1.7177594612829612), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double double0 = simpleRegression0.getSlope();
        Assert.assertEquals(Double.NaN, double0, 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double double0 = simpleRegression0.getSlopeStdErr();
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01);
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double double0 = simpleRegression0.getSumSquaredErrors();
        Assert.assertEquals(Double.NaN, double0, 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[3][3];
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = -137.886467769478;
        doubleArray0[0] = doubleArray1;
        double[] doubleArray2 = new double[6];
        doubleArray2[0] = -1.0;
        doubleArray0[1] = doubleArray2;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getR();
        Assert.assertEquals(3L, simpleRegression0.getN());
        Assert.assertEquals((-0.49999999999999994), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.getR();
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        Assert.assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01);
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[2][7];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getRSquare();
        Assert.assertEquals(2L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[4][6];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getIntercept();
        Assert.assertEquals(4L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.getInterceptStdErr();
        Assert.assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01);
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        long long0 = simpleRegression0.getN();
        Assert.assertEquals(0L, long0);
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.clear();
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double double0 = simpleRegression0.getRegressionSumSquares();
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.predict(0.0);
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01);
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[2][7];
        simpleRegression0.addData((-1425.0), (-1728.691242668));
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSignificance();
        Assert.assertEquals(1992248.9416513562, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[2][7];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData((-1425.0), (-862.896567));
        double double0 = simpleRegression0.getSlopeConfidenceInterval();
        Assert.assertEquals(496393.6568935903, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }
}

