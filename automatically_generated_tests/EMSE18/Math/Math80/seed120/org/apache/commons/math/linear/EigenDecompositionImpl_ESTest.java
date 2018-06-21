

package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;

public class EigenDecompositionImpl_ESTest  {
    @Test(timeout = 4000)
    public void test01() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 1289.08476;
        doubleArray0[2] = 1464.998675;
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.563);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(1);
        Assert.assertEquals(1289.08476, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.563);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(5);
        Assert.assertEquals((-1.0), double0, 0.01);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[4] = 0.563;
        doubleArray0[5] = 0.563;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.0;
        doubleArray1[2] = 1.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.563);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(0.31696899999999995, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[5] = 6.283185307179586;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -3251.23407959;
        doubleArray1[2] = -3251.23407959;
        doubleArray1[3] = 6.283185307179586;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.08325);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals((-484.1667636674725), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new EigenDecompositionImpl(((double[]) (null)), ((double[]) (null)), 18.0);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        double[][] doubleArray2 = new double[0][0];
        array2DRowRealMatrix0.data = doubleArray2;
        EigenDecompositionImpl eigenDecompositionImpl1 = null;
        try {
            eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), 1279.561177881532);
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), 1279.561177881532);
        eigenDecompositionImpl1.getEigenvector(3);
        Assert.assertEquals(0.0, eigenDecompositionImpl1.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -1757.01439708;
        doubleArray0[5] = 6.283185307179586;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = ((double) (1120));
        doubleArray1[1] = -1757.01439708;
        doubleArray1[2] = ((double) (1704));
        doubleArray1[3] = -1757.01439708;
        doubleArray1[4] = -1757.01439708;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.0895440205796485));
        Assert.assertEquals((-1.1349340083678456E19), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = -1757.01439708;
        doubleArray0[5] = 1464.998675;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.0;
        doubleArray1[1] = 0.563;
        doubleArray1[2] = 1.0;
        doubleArray1[3] = 6.283185307179586;
        doubleArray1[4] = 1289.08476;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals((-1661739.5202985313), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[3] = -521.619696533995;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = ((double) (1102));
        doubleArray1[1] = 0.563;
        doubleArray1[2] = ((double) (1102));
        doubleArray1[3] = -1757.01439708;
        doubleArray1[4] = 0.563;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-0.0));
        Assert.assertEquals((-4.6745861475401373E11), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[2] = 1464.998675;
        doubleArray0[3] = 1464.998675;
        doubleArray0[5] = 1464.998675;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = 0.563;
        doubleArray1[2] = 1.0;
        doubleArray1[3] = 6.283185307179586;
        doubleArray1[4] = 1289.08476;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = ((double) (1120));
        doubleArray1[1] = -1757.01439708;
        doubleArray1[2] = ((double) (1704));
        doubleArray1[3] = -1757.01439708;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.0895440205796485));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = -1757.01439708;
        doubleArray0[3] = 1464.998675;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.0;
        doubleArray1[1] = 0.563;
        doubleArray1[2] = 1.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 1289.08476;
        doubleArray0[3] = 1.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = 0.563;
        doubleArray1[2] = 1.0;
        doubleArray1[0] = 6.283185307179586;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.563);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 1289.08476;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.0;
        doubleArray1[1] = 0.563;
        doubleArray1[2] = 1.0;
        doubleArray1[3] = 6.283185307179586;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.0;
        doubleArray1[1] = 0.563;
        doubleArray1[2] = 1.0;
        doubleArray1[3] = 6.629893474806829;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.563);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.563);
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getSolver();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1.0895440205796485));
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.563);
        eigenDecompositionImpl0.getVT();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertEquals(6, array2DRowRealMatrix0.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.563);
        eigenDecompositionImpl0.getD();
        eigenDecompositionImpl0.getD();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0);
        eigenDecompositionImpl0.getSolver();
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.563);
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getRealEigenvalue(5);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.563);
        double double0 = eigenDecompositionImpl0.getImagEigenvalue(0);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.563);
        eigenDecompositionImpl0.getImagEigenvalues();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[3] = 1.0;
        doubleArray0[4] = 0.563;
        doubleArray0[5] = 6.283185307179586;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.0;
        doubleArray1[1] = 0.563;
        doubleArray1[2] = 1.0;
        doubleArray1[3] = 6.283185307179586;
        doubleArray1[4] = 1290.6916896945152;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.563);
        Assert.assertEquals(5.809212337621094E7, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = -1757.01439708;
        doubleArray0[2] = 1464.998675;
        doubleArray0[3] = 1464.998675;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.0;
        doubleArray1[1] = 0.563;
        doubleArray1[2] = 1.0;
        doubleArray1[3] = 6.283185307179586;
        doubleArray1[4] = 1289.08476;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(1.5316381886334618E19, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 1289.08476;
        doubleArray0[5] = 6.629893474806829;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1.0;
        doubleArray1[1] = 0.563;
        doubleArray1[2] = 1.0;
        doubleArray1[3] = 6.629893474806829;
        doubleArray1[4] = 1289.08476;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.563);
        Assert.assertEquals(5.530992802102353E12, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 1289.08476;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = ((double) (1102));
        doubleArray1[1] = 0.563;
        doubleArray1[2] = ((double) (1704));
        doubleArray1[3] = -521.619696533995;
        doubleArray1[4] = 0.563;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-0.0));
        eigenDecompositionImpl0.getSolver();
        Assert.assertEquals(-1.117684323452482E12, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

