

package org.apache.commons.math.stat.regression;

import org.junit.Assert;
import org.junit.Test;

public class SimpleRegression_ESTest  {
    @Test(timeout = 4000)
    public void test02() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[2][9];
        double[] doubleArray1 = new double[9];
        doubleArray1[0] = 754.2399461148;
        doubleArray0[0] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getInterceptStdErr();
        Assert.assertEquals(0.0, simpleRegression0.getSlope(), 0.01);
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[2][9];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.getInterceptStdErr();
        Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[2][9];
        double[] doubleArray1 = new double[9];
        doubleArray1[0] = 754.2399461148;
        doubleArray0[0] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getR();
        Assert.assertEquals(2L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(232.9552630461964, 232.9552630461964);
        simpleRegression0.addData((-954.812369253248), 825.989947997702);
        double double0 = simpleRegression0.predict(825.989947997702);
        Assert.assertEquals(2L, simpleRegression0.getN());
        Assert.assertEquals((-63.13812087156646), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(0.0, 0.0);
        simpleRegression0.addData(2.0, (-69.91));
        double double0 = simpleRegression0.getSumSquaredErrors();
        Assert.assertEquals(2L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(2.0, (-165.5234317382378));
        double[][] doubleArray0 = new double[10][9];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSumSquaredErrors();
        Assert.assertEquals(24907.27859491189, simpleRegression0.getRegressionSumSquares(), 0.01);
        Assert.assertEquals((-1.0913936421275139E-11), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[4][2];
        double[] doubleArray1 = new double[2];
        doubleArray1[0] = -1.0;
        doubleArray0[1] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlopeStdErr();
        Assert.assertEquals(4L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(0.0, 0.0);
        simpleRegression0.addData(2.0, (-69.91));
        double[][] doubleArray0 = new double[1][9];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlopeConfidenceInterval(Double.NaN);
        Assert.assertEquals(3258.2720666666664, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[2][1];
        double[] doubleArray1 = new double[4];
        doubleArray0[0] = doubleArray1;
        doubleArray0[1] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(0.0, 0.0);
        double double0 = simpleRegression0.getSlopeConfidenceInterval(0.05);
        Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 754.2399461148;
        double[][] doubleArray1 = new double[4][1];
        doubleArray1[0] = doubleArray0;
        doubleArray1[1] = doubleArray0;
        doubleArray1[2] = doubleArray0;
        doubleArray1[3] = doubleArray0;
        simpleRegression0.addData(doubleArray1);
        simpleRegression0.addData(2.0, 2.0);
        double double0 = simpleRegression0.getSlopeConfidenceInterval();
        Assert.assertEquals((-0.0026587261289827573), simpleRegression0.getSlope(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[] doubleArray0 = new double[9];
        double[][] doubleArray1 = new double[4][1];
        doubleArray1[0] = doubleArray0;
        doubleArray1[1] = doubleArray0;
        doubleArray1[2] = doubleArray0;
        doubleArray1[3] = doubleArray0;
        simpleRegression0.addData(doubleArray1);
        double double0 = simpleRegression0.getSlopeConfidenceInterval();
        Assert.assertEquals(4L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[7][3];
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = -518.6774869;
        doubleArray0[0] = doubleArray1;
        double[] doubleArray2 = new double[9];
        doubleArray2[0] = -518.6774869;
        doubleArray0[1] = doubleArray2;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlope();
        Assert.assertEquals(7L, simpleRegression0.getN());
        Assert.assertEquals((-0.1666666666666666), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[5][8];
        double[] doubleArray1 = new double[10];
        doubleArray1[0] = -559.433674319762;
        doubleArray0[0] = doubleArray1;
        doubleArray0[1] = doubleArray1;
        doubleArray0[2] = doubleArray1;
        double[] doubleArray2 = new double[15];
        doubleArray2[1] = -2.6190838401581408E-5;
        doubleArray0[3] = doubleArray2;
        doubleArray0[4] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSignificance();
        Assert.assertEquals(5L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(0.0, 0.0);
        simpleRegression0.addData(2.0, 0.0);
        double double0 = simpleRegression0.getRegressionSumSquares();
        Assert.assertEquals(2L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[7][0];
        double[] doubleArray1 = new double[4];
        doubleArray0[0] = doubleArray1;
        doubleArray0[1] = doubleArray1;
        doubleArray0[2] = doubleArray1;
        doubleArray0[3] = doubleArray0[1];
        doubleArray0[4] = doubleArray0[3];
        doubleArray0[5] = doubleArray0[3];
        doubleArray0[6] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        long long0 = simpleRegression0.getN();
        Assert.assertEquals(7L, long0);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 754.2399461148;
        double[][] doubleArray1 = new double[4][1];
        doubleArray1[0] = doubleArray0;
        doubleArray1[1] = doubleArray0;
        doubleArray1[2] = doubleArray0;
        doubleArray1[3] = doubleArray0;
        simpleRegression0.addData(doubleArray1);
        simpleRegression0.addData(2.0, 2.0);
        double double0 = simpleRegression0.getMeanSquareError();
        Assert.assertEquals(5L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[8][6];
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = 796.9862;
        doubleArray0[2] = doubleArray1;
        double[] doubleArray2 = new double[3];
        doubleArray2[1] = -1545.5148;
        doubleArray0[4] = doubleArray2;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getIntercept();
        Assert.assertEquals(8L, simpleRegression0.getN());
        Assert.assertEquals((-220.78782857142855), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[5][8];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.getSlopeConfidenceInterval(1.66984837101937E-15);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[] doubleArray0 = new double[9];
        double[][] doubleArray1 = new double[4][1];
        doubleArray1[0] = doubleArray0;
        doubleArray1[1] = doubleArray0;
        doubleArray1[2] = doubleArray0;
        doubleArray1[3] = doubleArray0;
        simpleRegression0.addData(doubleArray1);
        double double0 = simpleRegression0.getMeanSquareError();
        Assert.assertEquals(4L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double double0 = simpleRegression0.getMeanSquareError();
        Assert.assertEquals(Double.NaN, double0, 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double double0 = simpleRegression0.getTotalSumSquares();
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[] doubleArray0 = new double[9];
        double[][] doubleArray1 = new double[4][1];
        doubleArray1[0] = doubleArray0;
        doubleArray1[1] = doubleArray0;
        doubleArray1[2] = doubleArray0;
        doubleArray1[3] = doubleArray0;
        simpleRegression0.addData(doubleArray1);
        double double0 = simpleRegression0.getTotalSumSquares();
        Assert.assertEquals(4L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double double0 = simpleRegression0.getSlope();
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.getRSquare();
        Assert.assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double double0 = simpleRegression0.getSumSquaredErrors();
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[7][3];
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = -518.6774869;
        doubleArray0[0] = doubleArray1;
        double[] doubleArray2 = new double[9];
        doubleArray2[0] = -518.6774869;
        doubleArray0[1] = doubleArray2;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getR();
        Assert.assertEquals(230594.00178591398, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals((-0.1666666666666666), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[4][2];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlopeStdErr();
        Assert.assertEquals(4L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[2][9];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getR();
        Assert.assertEquals(2L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[4][2];
        double[] doubleArray1 = new double[2];
        doubleArray1[0] = -1.0;
        doubleArray0[1] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlope();
        Assert.assertEquals(4L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[4][2];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlope();
        Assert.assertEquals(4L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        long long0 = simpleRegression0.getN();
        Assert.assertEquals(0L, long0);
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.clear();
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double double0 = simpleRegression0.getRegressionSumSquares();
        Assert.assertEquals(Double.NaN, double0, 0.01);
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.predict(2855.746);
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        Assert.assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.getIntercept();
        Assert.assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01);
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[2][6];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(4447.59556338574, 4447.59556338574);
        double double0 = simpleRegression0.getSignificance();
        Assert.assertEquals(1.318740419696568E7, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }
}

