

package org.apache.commons.math.stat.regression;

import org.junit.Assert;
import org.junit.Test;

public class SimpleRegression_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[12][4];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.getSignificance();
        Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[3][6];
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 0.14321697925827678;
        doubleArray0[0] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getR();
        Assert.assertEquals(0.0, simpleRegression0.getSlope(), 0.01);
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[3][6];
        double[] doubleArray1 = new double[9];
        doubleArray1[0] = 7.46;
        doubleArray0[1] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.predict(0.0);
        Assert.assertEquals(3L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[21][6];
        double[] doubleArray1 = new double[9];
        doubleArray1[0] = 7.46;
        doubleArray1[1] = 1.0;
        doubleArray0[1] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.predict((-1.0));
        Assert.assertEquals(0.9523809523809523, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals((-0.1340482573726542), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[12][4];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(238.71, 238.71);
        double double0 = simpleRegression0.getSlopeStdErr();
        Assert.assertEquals(13L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(3562.6248431861404, 0.0);
        simpleRegression0.addData(0.0, 0.0);
        simpleRegression0.addData(0.0, 0.0);
        double double0 = simpleRegression0.getSlopeConfidenceInterval(0.1340482573726542);
        Assert.assertEquals(0.0, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(3560.826010835785, 3560.826010835785);
        simpleRegression0.addData(3560.826010835785, 3560.826010835785);
        simpleRegression0.addData(3249.3, (-1.0));
        double double0 = simpleRegression0.getSlopeConfidenceInterval();
        Assert.assertEquals(0.0, simpleRegression0.getSlopeStdErr(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData((-618.050473059), 0.0);
        simpleRegression0.addData(1659.1558531, 0.0);
        simpleRegression0.addData((-2582.64153093585), (-992.922983710287));
        double double0 = simpleRegression0.getSlopeConfidenceInterval();
        Assert.assertEquals(3L, simpleRegression0.getN());
        Assert.assertEquals(1.8404233908157739, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[6][7];
        double[] doubleArray1 = new double[9];
        doubleArray1[0] = 2228.77558456;
        doubleArray1[1] = -537.35;
        doubleArray0[1] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlope();
        Assert.assertEquals(6L, simpleRegression0.getN());
        Assert.assertEquals((-0.24109650326507975), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[12][4];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(238.71, 238.71);
        double double0 = simpleRegression0.getSignificance();
        Assert.assertEquals(1.0, simpleRegression0.getSlope(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData((-618.050473059), 0.0);
        simpleRegression0.addData(1659.1558531, 0.0);
        double double0 = simpleRegression0.getRegressionSumSquares();
        Assert.assertEquals(2L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[12][4];
        simpleRegression0.addData(doubleArray0);
        long long0 = simpleRegression0.getN();
        Assert.assertEquals(12L, long0);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[3][6];
        double[] doubleArray1 = new double[9];
        doubleArray1[0] = 7.46;
        doubleArray0[1] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getMeanSquareError();
        Assert.assertEquals(3L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[12][4];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.addData(238.71, 238.71);
        double double0 = simpleRegression0.getInterceptStdErr();
        Assert.assertEquals(13L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[3][6];
        double[] doubleArray1 = new double[9];
        doubleArray1[0] = 7.46;
        doubleArray0[1] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getIntercept();
        Assert.assertEquals(3L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(1758.56, (-1047.20992));
        simpleRegression0.addData(2616.42484, 2616.42484);
        double double0 = simpleRegression0.getIntercept();
        Assert.assertEquals((-8557.392460580168), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[8][4];
        simpleRegression0.addData(doubleArray0);
        simpleRegression0.getSlopeConfidenceInterval(1.0E-15);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[3][6];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getMeanSquareError();
        Assert.assertEquals(3L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double double0 = simpleRegression0.getMeanSquareError();
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
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
        double[][] doubleArray0 = new double[12][4];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getTotalSumSquares();
        Assert.assertEquals(12L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[3][4];
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 427.1;
        doubleArray0[1] = doubleArray1;
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlope();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[3][4];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlope();
        Assert.assertEquals(3L, simpleRegression0.getN());
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
        double double0 = simpleRegression0.getSumSquaredErrors();
        Assert.assertEquals(Double.NaN, double0, 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(0.0, 0.0);
        simpleRegression0.addData(2673.988532508883, (-0.4002909117020773));
        double double0 = simpleRegression0.getR();
        Assert.assertEquals(0.08011640699564013, simpleRegression0.getTotalSumSquares(), 0.01);
        Assert.assertEquals((-1.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[3][6];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getR();
        Assert.assertEquals(3L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.getRSquare();
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, simpleRegression0.getTotalSumSquares(), 0.01);
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.getInterceptStdErr();
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, simpleRegression0.getMeanSquareError(), 0.01);
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        long long0 = simpleRegression0.getN();
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        Assert.assertEquals(0L, long0);
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.clear();
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double double0 = simpleRegression0.getRegressionSumSquares();
        Assert.assertEquals(Double.NaN, double0, 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.predict((-1.0));
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
        Assert.assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01);
        Assert.assertEquals(0L, simpleRegression0.getN());
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        double[][] doubleArray0 = new double[12][4];
        simpleRegression0.addData(doubleArray0);
        double double0 = simpleRegression0.getSlopeStdErr();
        Assert.assertEquals(12L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.getIntercept();
        Assert.assertEquals(0L, simpleRegression0.getN());
        Assert.assertEquals(Double.NaN, simpleRegression0.getSlope(), 0.01);
        Assert.assertEquals(Double.NaN, simpleRegression0.getSumSquaredErrors(), 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        SimpleRegression simpleRegression0 = new SimpleRegression();
        simpleRegression0.addData(3562.6248431861404, 0.0);
        simpleRegression0.addData(3562.6248431861404, 0.0);
        simpleRegression0.addData(2.0528050058175117E7, (-2153.7995849));
        double double0 = simpleRegression0.getSlopeConfidenceInterval(0.1340482573726542);
        Assert.assertEquals(3L, simpleRegression0.getN());
        Assert.assertEquals(0.0, double0, 0.01);
    }
}

