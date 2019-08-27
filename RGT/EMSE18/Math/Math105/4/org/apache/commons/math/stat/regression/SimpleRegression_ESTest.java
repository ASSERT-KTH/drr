

package org.apache.commons.math.stat.regression;

import org.junit.Assert;
import org.junit.Test;

public class SimpleRegression_ESTest  {
    @Test(timeout = 4000)
    public void test03() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData((-3111.2827), (-3111.2827));
        simpleRegression0.addData((-2767.2588567491), (-3111.2827));
        double double0 = simpleRegression0.getR();
        Assert.assertEquals(2L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.predict(3771.082371650463);
        Assert.assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(0.0, 0.0);
        simpleRegression0.addData(3770.750199940768, 0.0);
        double double0 = simpleRegression0.predict(0.0);
        Assert.assertEquals(2L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(0.0, (-1.0));
        simpleRegression0.addData(3770.750199940768, (-25.75321090992631));
        double double0 = simpleRegression0.predict(0.0);
        Assert.assertEquals(306.3607251756474, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals((-1.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(0.0, 0.0);
        simpleRegression0.addData(3770.750199940768, 0.0);
        double double0 = simpleRegression0.getSumSquaredErrors();
        Assert.assertEquals(2L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(1.0, 1.0);
        simpleRegression0.addData(0.0, 0.0);
        simpleRegression0.addData(0.0, 0.0);
        simpleRegression0.addData(0.0, 0.0);
        simpleRegression0.addData(0.0, 0.0);
        double double0 = simpleRegression0.getSumSquaredErrors();
        Assert.assertEquals(0.8, simpleRegression0.getRegressionSumSquares(), 0.01);
        Assert.assertEquals((-1.1102230246251565E-16), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[3][9];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(0.05, 0.5);
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlopeStdErr();
        Assert.assertEquals(7L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[3][9];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(0.05, 0.5);
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlopeConfidenceInterval(Double.NaN);
        Assert.assertEquals(0.21428571428571433, simpleRegression0.getRegressionSumSquares(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(0.0, 0.0);
        simpleRegression0.addData(0.0, 3770.750199940768);
        simpleRegression0.addData(0.0, 0.0);
        double double0 = simpleRegression0.getSlopeConfidenceInterval(Double.NaN);
        Assert.assertEquals(3L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(0.0, 0.0);
        simpleRegression0.addData(0.0, 0.0);
        simpleRegression0.addData(3771.347757766891, 0.0);
        double double0 = simpleRegression0.getSlopeConfidenceInterval();
        Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(0.0, 0.0);
        simpleRegression0.addData(3770.750199940768, 0.0);
        double double0 = simpleRegression0.getSlope();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[4][6];
        simpleRegression0.addData((-0.0017304345087031088), 7206710.7727520345);
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSignificance();
        Assert.assertEquals(5L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[5][0];
        double[] doubleArray1 = new double[6];
        doubleArray0[0] = doubleArray1;
        doubleArray0[1] = doubleArray0[0];
        doubleArray0[2] = doubleArray1;
        doubleArray0[3] = doubleArray0[0];
        doubleArray0[4] = doubleArray0[2];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.getSignificance();
        Assert.assertEquals(5L, simpleRegression0.getN());
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[3][9];
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 343.606767722559;
        doubleArray0[1] = doubleArray1;
        double[] doubleArray2 = new double[20];
        simpleRegression0.addData(343.606767722559, 343.606767722559);
        doubleArray2[1] = 343.606767722559;
        doubleArray0[2] = doubleArray2;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getRSquare();
        Assert.assertEquals(4L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData((-3689.746221487808), (-0.27741260288898695));
        long long0 = simpleRegression0.getN();
        Assert.assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(0.0, 0.0);
        simpleRegression0.addData(0.0, 0.0);
        simpleRegression0.addData(3770.750199940768, 0.0);
        double double0 = simpleRegression0.getInterceptStdErr();
        Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[3][9];
        simpleRegression0.addData(1270764.9363012984, 0.0);
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getIntercept();
        Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData((-3689.746221487808), (-0.27741260288898695));
        double[][] doubleArray0 = new double[2][6];
        double[] doubleArray1 = new double[3];
        doubleArray1[1] = -3689.746221487808;
        doubleArray0[0] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getIntercept();
        Assert.assertEquals(3L, simpleRegression0.getN());
        Assert.assertEquals((-1844.8731107439041), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(0.0, 0.0);
        simpleRegression0.addData(0.0, 3770.750199940768);
        simpleRegression0.addData(0.0, 0.0);
        double double0 = simpleRegression0.getMeanSquareError();
        Assert.assertEquals(3L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double double0 = simpleRegression0.getMeanSquareError();
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double double0 = simpleRegression0.getTotalSumSquares();
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        Assert.assertEquals(Double.NaN, double0, 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData((-2235.8502), (-2235.8502));
        Assert.assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01);
        simpleRegression0.addData((-2235.8502), (-2235.8502));
        double double0 = simpleRegression0.getTotalSumSquares();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(0.0, 0.0);
        simpleRegression0.addData(3770.750199940768, (-25.75321090992631));
        double double0 = simpleRegression0.getSlope();
        Assert.assertEquals(2L, simpleRegression0.getN());
        Assert.assertEquals((-0.006829731364949831), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(0.0, 0.0);
        simpleRegression0.addData(0.0, (-1.0));
        double double0 = simpleRegression0.getSlope();
        Assert.assertEquals(2L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
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
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        Assert.assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
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
        simpleRegression0.addData((-2767.2588567491), (-24.036005204684763));
        simpleRegression0.addData((-24.036005204684763), (-1845.1321194152));
        double double0 = simpleRegression0.getR();
        Assert.assertEquals(2L, simpleRegression0.getN());
        Assert.assertEquals((-1.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.getR();
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        Assert.assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[3][9];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.getRSquare();
        Assert.assertEquals(3L, simpleRegression0.getN());
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[3][9];
        simpleRegression0.addData(1.0E-8, 4.9E-323);
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getRegressionSumSquares();
        Assert.assertEquals(4L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[3][9];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getIntercept();
        Assert.assertEquals(3L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.getInterceptStdErr();
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        Assert.assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01);
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
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[3][9];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlopeConfidenceInterval();
        Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[5][0];
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 0.5;
        doubleArray1[1] = 0.5;
        doubleArray0[0] = doubleArray1;
        double[] doubleArray2 = new double[4];
        doubleArray0[1] = doubleArray2;
        double[] doubleArray3 = new double[2];
        doubleArray0[2] = doubleArray3;
        doubleArray0[3] = doubleArray0[1];
        doubleArray0[4] = doubleArray3;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSignificance();
        Assert.assertEquals(5L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }
}

