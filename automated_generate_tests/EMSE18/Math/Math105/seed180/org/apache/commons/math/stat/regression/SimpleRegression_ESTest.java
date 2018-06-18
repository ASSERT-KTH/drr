

package org.apache.commons.math.stat.regression;

import org.junit.Assert;
import org.junit.Test;

public class SimpleRegression_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[1][9];
        simpleRegression0.addData((-1.0), (-1.0));
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(1.0, (-1.0));
        double double0 = simpleRegression0.getSignificance();
        Assert.assertEquals(3L, simpleRegression0.getN());
        Assert.assertEquals(1.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[4][6];
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = -715.97634291516;
        doubleArray1[1] = 1994.6657998;
        doubleArray0[0] = doubleArray1;
        double[] doubleArray2 = new double[6];
        doubleArray2[1] = 1994.6657998;
        doubleArray0[1] = doubleArray2;
        doubleArray0[2] = doubleArray2;
        doubleArray0[3] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getR();
        Assert.assertEquals(4L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[1][9];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData((-0.5529957270669217), 1.0);
        double double0 = simpleRegression0.predict(0.0);
        Assert.assertEquals(0.5, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(3379088.047186369, (-2252.707308969397));
        simpleRegression0.addData((-391.0927193), (-1125.97));
        double double0 = simpleRegression0.predict(1.0);
        Assert.assertEquals(634768.4817117994, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals((-1126.100725912817), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[1][9];
        double[] doubleArray1 = new double[2];
        doubleArray1[1] = -32.35081848;
        doubleArray0[0] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        Assert.assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01);
        simpleRegression0.addData(0.0, (-32.35081848));
        double double0 = simpleRegression0.getTotalSumSquares();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(367.03684819, 367.03684819);
        simpleRegression0.addData(4.9E-323, (-1038.85));
        double double0 = simpleRegression0.getSumSquaredErrors();
        Assert.assertEquals(988258.9149568059, simpleRegression0.getRegressionSumSquares(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(3379088.047186369, (-2252.707308969397));
        simpleRegression0.addData((-391.0927193), (-1125.97));
        double double0 = simpleRegression0.getSumSquaredErrors();
        Assert.assertEquals(2L, simpleRegression0.getN());
        Assert.assertEquals((-1.1641532182693481E-10), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[4][6];
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = -1344.7327923617258;
        doubleArray0[1] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlopeStdErr();
        Assert.assertEquals(4L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[1][9];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData((-391.0927193), Double.NaN);
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlopeConfidenceInterval(Double.NaN);
        Assert.assertEquals(3L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[3][6];
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 624.1;
        doubleArray0[1] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlopeConfidenceInterval();
        Assert.assertEquals(3L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[4][6];
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = -1.0011488635488506;
        doubleArray0[1] = doubleArray1;
        double[] doubleArray2 = new double[5];
        doubleArray2[1] = -1.0011488635488506;
        doubleArray0[3] = doubleArray2;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlope();
        Assert.assertEquals(4L, simpleRegression0.getN());
        Assert.assertEquals((-0.3333333333333333), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[3][6];
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 609.7064762499999;
        doubleArray1[0] = 624.1;
        doubleArray0[1] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSignificance();
        Assert.assertEquals(247827.99145412783, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[1][9];
        simpleRegression0.addData((-1.0), (-1.0));
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(0.0, (-1125.97));
        double double0 = simpleRegression0.getSignificance();
        Assert.assertEquals(3L, simpleRegression0.getN());
        Assert.assertEquals(0.6671565320725892, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[1][9];
        simpleRegression0.addData((-1.0), (-1.0));
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(1.0, (-1.0));
        double double0 = simpleRegression0.getRSquare();
        Assert.assertEquals(3L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData((-725.5970511217455), 1314.85272);
        long long0 = simpleRegression0.getN();
        Assert.assertEquals(1L, long0);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[4][6];
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = -715.97634291516;
        doubleArray1[1] = 1994.6657998;
        doubleArray0[0] = doubleArray1;
        doubleArray0[1] = doubleArray1;
        doubleArray0[3] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getMeanSquareError();
        Assert.assertEquals(4L, simpleRegression0.getN());
        Assert.assertEquals((-2.3283064365386963E-10), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[3][6];
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 624.1;
        doubleArray0[1] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getInterceptStdErr();
        Assert.assertEquals(3L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[17][9];
        double[] doubleArray1 = new double[2];
        doubleArray1[0] = -391.0927193;
        doubleArray0[0] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getIntercept();
        Assert.assertEquals(17L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[1][9];
        simpleRegression0.addData((-1.0), (-1.0));
        double[] doubleArray1 = new double[2];
        doubleArray1[1] = -1.0;
        doubleArray0[0] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getIntercept();
        Assert.assertEquals(2L, simpleRegression0.getN());
        Assert.assertEquals((-1.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData((-1.7976931348623157E308), (-1.7976931348623157E308));
        simpleRegression0.addData(954314.4303602928, 954314.4303602928);
        simpleRegression0.addData(954314.4303602928, (-1.7976931348623157E308));
        simpleRegression0.getSlopeConfidenceInterval(3.399464998481189E-5);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[1][9];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(0.0, 0.0);
        simpleRegression0.addData((-0.5529957270669217), 1.0);
        double double0 = simpleRegression0.getMeanSquareError();
        Assert.assertEquals(3L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double double0 = simpleRegression0.getMeanSquareError();
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double double0 = simpleRegression0.getTotalSumSquares();
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        Assert.assertEquals(Double.NaN, double0, 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[4][6];
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = -1.0011488635488506;
        doubleArray0[1] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlope();
        Assert.assertEquals(4L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[4][6];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlope();
        Assert.assertEquals(4L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double double0 = simpleRegression0.getSlope();
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double double0 = simpleRegression0.getSlopeStdErr();
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01);
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double double0 = simpleRegression0.getSumSquaredErrors();
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[4][6];
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = -715.97634291516;
        doubleArray1[1] = 1994.6657998;
        doubleArray0[0] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getR();
        Assert.assertEquals(4L, simpleRegression0.getN());
        Assert.assertEquals((-1.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.getR();
        Assert.assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        Assert.assertEquals(Double.NaN, simpleRegression0.getRegressionSumSquares(), 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData((-1.7976931348623157E308), (-1.7976931348623157E308));
        simpleRegression0.addData(954314.4303602928, 954314.4303602928);
        simpleRegression0.getRSquare();
        Assert.assertEquals(2L, simpleRegression0.getN());
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[1][9];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(0.0, 0.0);
        double double0 = simpleRegression0.predict(1.0);
        Assert.assertEquals(2L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData((-1.7976931348623157E308), (-1.7976931348623157E308));
        simpleRegression0.addData(954314.4303602928, 954314.4303602928);
        double double0 = simpleRegression0.getRegressionSumSquares();
        Assert.assertEquals(Double.POSITIVE_INFINITY, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.getInterceptStdErr();
        Assert.assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01);
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        long long0 = simpleRegression0.getN();
        Assert.assertEquals(0L, long0);
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.clear();
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[1][9];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(0.0, 0.0);
        simpleRegression0.addData((-0.5529957270669217), 1.0);
        double double0 = simpleRegression0.getSlopeConfidenceInterval(Double.NaN);
        Assert.assertEquals(3L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.getIntercept();
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01);
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData((-1.0), (-1.0));
        double[][] doubleArray0 = new double[4][6];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlopeConfidenceInterval();
        Assert.assertEquals(5L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }
}

