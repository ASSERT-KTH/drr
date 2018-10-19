

package org.apache.commons.math.stat.regression;

import org.junit.Assert;
import org.junit.Test;

public class SimpleRegression_ESTest  {
    @Test(timeout = 4000)
    public void test03() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[26][5];
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = Double.NaN;
        doubleArray0[1] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.getInterceptStdErr();
        Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[3][5];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.getSignificance();
        Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(3820886.7269065105, 3820886.7269065105);
        simpleRegression0.addData(1583.0, (-2008.212));
        double double0 = simpleRegression0.getTotalSumSquares();
        Assert.assertEquals(7.307262856958504E12, simpleRegression0.getRegressionSumSquares(), 0.01);
        Assert.assertEquals(7.307262856958506E12, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[6][6];
        double[] doubleArray1 = new double[3];
        doubleArray1[1] = -1607.0048005400263;
        doubleArray0[0] = doubleArray1;
        double[] doubleArray2 = new double[4];
        doubleArray2[0] = -1607.0048005400263;
        doubleArray0[2] = doubleArray2;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.predict(2600.9579);
        Assert.assertEquals(6L, simpleRegression0.getN());
        Assert.assertEquals((-841.5925401080053), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(2338.2123, 2338.2123);
        simpleRegression0.addData((-5247.040381135095), 2338.2123);
        double double0 = simpleRegression0.getSumSquaredErrors();
        Assert.assertEquals(2L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[3][5];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData((-2335.736), 0.7598297725568395);
        double double0 = simpleRegression0.getSlopeConfidenceInterval(Double.NaN);
        Assert.assertEquals(4L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[10][6];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlopeConfidenceInterval(0.7786124432386732);
        Assert.assertEquals(10L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[3][5];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(3808.5928, 0.9999999999999971);
        double double0 = simpleRegression0.getSlopeConfidenceInterval();
        Assert.assertEquals(0.7499999999999957, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[11][5];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlopeConfidenceInterval();
        Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[2][9];
        double[] doubleArray1 = new double[2];
        doubleArray1[1] = 5207.6753;
        doubleArray0[0] = doubleArray1;
        double[] doubleArray2 = new double[4];
        doubleArray2[0] = 1.0;
        doubleArray0[1] = doubleArray2;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlope();
        Assert.assertEquals(2L, simpleRegression0.getN());
        Assert.assertEquals((-5207.6753), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[3][5];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(3808.5928, 0.9999999999999971);
        double double0 = simpleRegression0.getSignificance();
        Assert.assertEquals(4L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(1015.7179668206508, 1015.7179668206508);
        double[][] doubleArray0 = new double[4][7];
        double[] doubleArray1 = new double[3];
        doubleArray1[1] = 1015.7179668206508;
        doubleArray0[0] = doubleArray1;
        doubleArray0[1] = doubleArray1;
        doubleArray0[2] = doubleArray1;
        doubleArray0[3] = doubleArray0[2];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getRegressionSumSquares();
        Assert.assertEquals(5L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[6][6];
        double[] doubleArray1 = new double[2];
        doubleArray1[1] = 1.0;
        doubleArray0[2] = doubleArray1;
        doubleArray0[3] = doubleArray1;
        double[] doubleArray2 = new double[6];
        doubleArray2[0] = 1.0;
        doubleArray2[1] = 1.0;
        doubleArray0[4] = doubleArray2;
        doubleArray0[5] = doubleArray0[2];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(1.0, 0.0);
        simpleRegression0.addData(0.0, 0.0);
        double double0 = simpleRegression0.getR();
        Assert.assertEquals(2.0, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[3][7];
        simpleRegression0.addData(doubleArray0);
        long long0 = simpleRegression0.getN();
        Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals(3L, long0);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[3][5];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData((-2335.736), 0.7598297725568395);
        double double0 = simpleRegression0.getMeanSquareError();
        Assert.assertEquals(4L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[11][5];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData((-2335.736), 0.7598297725568395);
        double double0 = simpleRegression0.getMeanSquareError();
        Assert.assertEquals(12L, simpleRegression0.getN());
        Assert.assertEquals((-1.1102230246251566E-17), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[9][6];
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = 75.0410489242507;
        doubleArray0[0] = doubleArray1;
        double[] doubleArray2 = new double[8];
        doubleArray2[1] = -2254.013068930943;
        doubleArray0[3] = doubleArray2;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getIntercept();
        Assert.assertEquals(9L, simpleRegression0.getN());
        Assert.assertEquals((-281.7516336163679), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[6][6];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getMeanSquareError();
        Assert.assertEquals(6L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double double0 = simpleRegression0.getMeanSquareError();
        Assert.assertEquals(Double.NaN, double0, 0.01);
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double double0 = simpleRegression0.getTotalSumSquares();
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[11][5];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getTotalSumSquares();
        Assert.assertEquals(11L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[2][9];
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 1.0;
        doubleArray0[1] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlope();
        Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[2][9];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlope();
        Assert.assertEquals(2L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double double0 = simpleRegression0.getSlope();
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        Assert.assertEquals(Double.NaN, double0, 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double double0 = simpleRegression0.getSlopeStdErr();
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        Assert.assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double double0 = simpleRegression0.getSumSquaredErrors();
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[10][6];
        double[] doubleArray1 = new double[2];
        doubleArray1[1] = 1.0;
        doubleArray0[2] = doubleArray1;
        double[] doubleArray2 = new double[6];
        doubleArray2[0] = 1.0;
        doubleArray0[5] = doubleArray2;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getR();
        Assert.assertEquals(10L, simpleRegression0.getN());
        Assert.assertEquals((-0.11111111111111091), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.getR();
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01);
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[11][5];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getRSquare();
        Assert.assertEquals(11L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(1015.7179668206508, 1015.7179668206508);
        double[][] doubleArray0 = new double[4][7];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getRegressionSumSquares();
        Assert.assertEquals(1.0, simpleRegression0.getSlope(), 0.01);
        Assert.assertEquals(825346.3904978213, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        long long0 = simpleRegression0.getN();
        Assert.assertEquals(0L, long0);
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.clear();
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.predict(1.370465416314954);
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01);
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.getIntercept();
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01);
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[6][6];
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = -1.0;
        doubleArray1[1] = -1607.0048005400263;
        doubleArray0[0] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSignificance();
        Assert.assertEquals(1607.0048005400263, simpleRegression0.getSlope(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }
}

