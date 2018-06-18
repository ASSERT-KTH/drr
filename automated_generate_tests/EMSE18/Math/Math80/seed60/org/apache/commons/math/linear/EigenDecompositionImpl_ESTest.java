

package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;

public class EigenDecompositionImpl_ESTest  {
    @Test(timeout = 4000)
    public void test01() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 1.0;
        doubleArray0[1] = 1.0;
        doubleArray0[3] = 1.0;
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1072.013893961218));
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(2);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
        Assert.assertEquals(1.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1330.20064203828));
        ArrayRealVector arrayRealVector0 = ((ArrayRealVector) (eigenDecompositionImpl0.getEigenvector(3)));
        Assert.assertEquals(Double.NaN, arrayRealVector0.getL1Norm(), 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = -2854.302347147537;
        doubleArray0[3] = -1674.617;
        doubleArray0[4] = 1313.8079555;
        doubleArray0[5] = 7.38905609893065;
        doubleArray0[6] = -921.78552029;
        doubleArray0[7] = 2767.220357;
        doubleArray0[8] = 1326.526160604222;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = 1313.8079555;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 803.048379);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(2.710126363650595E26, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 1.0;
        doubleArray0[2] = 1.0;
        doubleArray0[3] = 1.0;
        doubleArray0[4] = 2155339.462062933;
        doubleArray0[5] = 1.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = 2155339.462062933;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1330.20064203828));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals((-1.0012604030950545E19), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 1.0;
        doubleArray0[1] = 1.0;
        doubleArray0[2] = 1.0;
        doubleArray0[3] = 1.0;
        doubleArray0[4] = 1.0;
        doubleArray0[5] = 1.0;
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertEquals(6, array2DRowRealMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 1.0;
        doubleArray0[4] = 2155339.462062933;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.0;
        doubleArray1[1] = 2155339.462062933;
        doubleArray1[2] = 1.0;
        doubleArray1[3] = 1.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1330.20064203828));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[3] = 1.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.0;
        doubleArray1[1] = 2155339.462;
        doubleArray1[2] = 1.0;
        doubleArray1[3] = 2155339.462;
        doubleArray1[4] = 2155339.462;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1330.20064203828));
        Assert.assertEquals((-2.0098463206745864E16), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 1.0;
        doubleArray0[2] = 1.0;
        doubleArray0[3] = 1.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.0;
        doubleArray1[1] = 1.0;
        doubleArray1[2] = 1.0;
        doubleArray1[3] = 1617.7817448;
        doubleArray1[4] = 1617.7817448;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1330.20064203828));
        Assert.assertEquals(2617217.77381526, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[2] = 1.0;
        doubleArray0[3] = 1.0;
        doubleArray0[5] = 1.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.0;
        doubleArray1[1] = 1.0;
        doubleArray1[2] = 1.0;
        doubleArray1[3] = 2155339.462;
        doubleArray1[4] = 2155339.462;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1330.20064203828));
        Assert.assertEquals(4.645488193407432E12, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.0;
        doubleArray1[1] = 1617.7817448;
        doubleArray1[2] = 1.0;
        doubleArray1[3] = 1617.7817448;
        doubleArray1[4] = 1617.7817448;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1330.20064203828));
        Assert.assertEquals((-2617217.774002911), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[4] = 2155339.462062933;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.0;
        doubleArray1[1] = 2155339.462062933;
        doubleArray1[2] = 1.0;
        doubleArray1[3] = 2155339.462062933;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1335.640470235458));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 1.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.0;
        doubleArray1[1] = 1.0;
        doubleArray1[2] = 1.0;
        doubleArray1[3] = 2155339.462062933;
        doubleArray1[4] = 2155339.462062933;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1330.20064203828));
        Assert.assertEquals((-4.645488205403609E12), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 1.0;
        doubleArray0[5] = 1.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.0;
        doubleArray1[1] = 2155339.462062933;
        doubleArray1[2] = 1.0;
        doubleArray1[3] = 2155339.462062933;
        doubleArray1[4] = 2155339.462062933;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1330.20064203828));
        Assert.assertEquals(2.1580560515581065E25, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 1.0;
        doubleArray0[2] = 1.0;
        doubleArray0[3] = 1.0;
        doubleArray0[4] = 2155339.462062933;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = 2155339.462062933;
        doubleArray1[2] = 1.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1330.20064203828));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 1.0;
        doubleArray0[1] = 1.0;
        doubleArray0[2] = 1.0;
        doubleArray0[3] = 1.0;
        doubleArray0[4] = 1.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.0;
        doubleArray1[1] = 1.0;
        doubleArray1[2] = 1.0;
        doubleArray1[3] = 1.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1330.20064203828));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 1.0;
        doubleArray0[1] = 1.0;
        doubleArray0[3] = 1.0;
        doubleArray0[4] = 2155339.462062933;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.0;
        doubleArray1[1] = 2155339.462062933;
        doubleArray1[2] = 1.0;
        doubleArray1[3] = 1.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1330.20064203828));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[2] = 1.0;
        doubleArray0[4] = 1.0;
        doubleArray0[5] = 1.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[2] = 1.0;
        doubleArray1[3] = 1.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1330.20064203828));
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[4] = 2155339.462062933;
        doubleArray0[5] = 1.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[2] = 1.0;
        doubleArray1[3] = 2155339.462062933;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1330.20064203828));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 1.0036327905813567E19;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.0036327905813567E19;
        doubleArray1[1] = 1617.7817448;
        doubleArray1[2] = 1.0036327905813567E19;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1330.20064203828));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.0;
        doubleArray1[1] = 1.0;
        doubleArray1[2] = 1.0;
        doubleArray1[3] = 2155339.462062933;
        doubleArray1[4] = 2155339.462062933;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1330.20064203828));
        Assert.assertEquals((-4.645488196413413E12), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[3] = 2155339.462062933;
        doubleArray1[4] = 2155339.462062933;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1330.20064203828));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1330.20064203828));
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getSolver();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1330.20064203828));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1330.20064203828));
        eigenDecompositionImpl0.getV();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertEquals(6, array2DRowRealMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1330.20064203828));
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1330.20064203828));
        eigenDecompositionImpl0.getD();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        Assert.assertNotNull(array2DRowRealMatrix0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1335.640470235458));
        eigenDecompositionImpl0.getSolver();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertEquals(6, array2DRowRealMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1330.20064203828));
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1330.20064203828));
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), (-0.0));
        Assert.assertFalse(eigenDecompositionImpl1.equals(((Object) (eigenDecompositionImpl0))));
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1330.20064203828));
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1330.20064203828));
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(2);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1330.20064203828));
        double double0 = eigenDecompositionImpl0.getImagEigenvalue(1);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1330.20064203828));
        double[] doubleArray2 = eigenDecompositionImpl0.getImagEigenvalues();
        Assert.assertNotSame(doubleArray2, doubleArray0);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 1.0;
        doubleArray0[1] = 1.0;
        doubleArray0[3] = 1.0;
        doubleArray0[4] = 2155339.462062933;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = 1.0;
        doubleArray1[2] = 1.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1330.20064203828));
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(2);
        Assert.assertEquals(1.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 1.0;
        doubleArray0[2] = 1.0;
        double[] doubleArray1 = new double[5];
        doubleArray0[0] = 2155339.462062933;
        doubleArray1[2] = 1.0;
        doubleArray1[3] = 2155339.462062933;
        doubleArray1[4] = 2155339.462062933;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1330.20064203828));
        Assert.assertEquals(6.935364815859918E23, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = -2854.302347147537;
        doubleArray0[1] = -2854.302347147537;
        doubleArray0[2] = 3.084770439087947E-9;
        doubleArray0[3] = -1674.617;
        doubleArray0[4] = 3.084770439087947E-9;
        doubleArray0[5] = 7.38905609893065;
        doubleArray0[7] = 2767.220357;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 1326.526160604222;
        doubleArray1[5] = -1674.617;
        doubleArray1[6] = 2767.220357;
        doubleArray1[7] = -2854.302347147537;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2854.302347147537));
        Assert.assertEquals(-2325843.88359171, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

