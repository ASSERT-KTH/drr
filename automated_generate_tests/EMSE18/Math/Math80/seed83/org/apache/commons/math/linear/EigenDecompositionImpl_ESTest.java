

package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;

public class EigenDecompositionImpl_ESTest  {
    @Test(timeout = 4000)
    public void test03() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[2] = 1873.440826646;
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1008.5442480526209));
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(0);
        Assert.assertEquals(1873.440826646, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = -3695.393167472791;
        double[] doubleArray1 = new double[2];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1922.49067582));
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(2);
        Assert.assertEquals((-3695.393167472791), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1008.5442480526209));
        ArrayRealVector arrayRealVector0 = ((ArrayRealVector) (eigenDecompositionImpl0.getEigenvector(0)));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
        Assert.assertEquals(Double.NaN, arrayRealVector0.getL1Norm(), 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[1] = 6768.11043;
        doubleArray0[2] = 1.1102230246251565E-16;
        double[] doubleArray1 = new double[2];
        doubleArray1[0] = -3695.393167472791;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1922.49067582));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(3.104999146263387E-5, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -2636.71993196;
        doubleArray0[1] = 1964.3847319089184;
        double[] doubleArray1 = new double[5];
        doubleArray1[2] = 0.563;
        doubleArray1[4] = -1233.1152588700693;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 6671.9910887329115);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals((-2.496402940984332E12), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new EigenDecompositionImpl(((double[]) (null)), ((double[]) (null)), 19.085536923187668);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = -3453.862249243;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1025.462347328048));
        eigenDecompositionImpl0.getV();
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[5] = -3453.862249243;
        doubleArray0[6] = -3296.8714;
        doubleArray0[7] = 580.290120175663;
        doubleArray0[8] = 3207.0;
        double[] doubleArray1 = new double[8];
        doubleArray1[4] = 1873.440826646;
        doubleArray1[5] = 3207.0;
        doubleArray1[6] = -3296.8714;
        doubleArray1[7] = -1008.5442480526209;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1008.5442480526209));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = 4523.428;
        doubleArray0[2] = 1873.440826646;
        doubleArray0[5] = -3453.862249243;
        doubleArray0[0] = -3296.8714;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = -3453.862249243;
        doubleArray1[2] = 0.7853981633974483;
        doubleArray1[3] = -3453.862249243;
        doubleArray1[4] = 1873.440826646;
        doubleArray1[5] = 3207.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1008.5442480526209));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[5] = -3453.862249243;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 1873.440826646;
        doubleArray1[1] = -3453.862249243;
        doubleArray1[2] = 0.7853981633974483;
        doubleArray1[3] = -3453.862249243;
        doubleArray1[4] = 1873.440826646;
        doubleArray1[5] = 3207.426333506201;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1008.5442480526209));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 19.085536923187668;
        doubleArray0[1] = 19.085536923187668;
        doubleArray0[2] = 19.085536923187668;
        doubleArray0[3] = 19.085536923187668;
        doubleArray0[4] = 19.085536923187668;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 19.085536923187668;
        doubleArray1[1] = 19.085536923187668;
        doubleArray1[2] = 19.085536923187668;
        doubleArray1[3] = 19.085536923187668;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3798.1911));
        Assert.assertEquals((-3.771097178797792E-9), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[2] = 1873.440826646;
        doubleArray0[5] = 1873.440826646;
        doubleArray0[0] = -3296.8714;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 1873.440826646;
        doubleArray1[1] = -3453.862249243;
        doubleArray1[2] = 0.7853981633974483;
        doubleArray1[3] = -3453.862249243;
        doubleArray1[4] = 1873.440826646;
        doubleArray1[5] = 3207.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1008.5442480526209));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[2] = 0.563;
        doubleArray1[3] = 340.288884617;
        doubleArray1[4] = -1233.1152588700693;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 6671.9910887329115);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 4523.428;
        doubleArray0[1] = -1008.5442480526209;
        doubleArray0[2] = 1873.440826646;
        doubleArray0[6] = 3207.0;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 1873.440826646;
        doubleArray1[1] = 0.7853981633974483;
        doubleArray1[2] = 0.7853981633974483;
        doubleArray1[3] = 0.7853981633974483;
        doubleArray1[4] = 1873.440826646;
        doubleArray1[5] = 0.7853981633974483;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[5] = -3453.862249243;
        doubleArray0[0] = -3296.8714;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 1873.440826646;
        doubleArray1[1] = -3453.862249243;
        doubleArray1[2] = 0.7853981633974483;
        doubleArray1[3] = -3453.862249243;
        doubleArray1[4] = 1873.440826646;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1008.5442480526209));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 4523.428;
        doubleArray0[6] = 3207.0;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 1873.440826646;
        doubleArray1[1] = 0.7853981633974483;
        doubleArray1[2] = 0.7853981633974483;
        doubleArray1[3] = 0.7853981633974483;
        doubleArray1[4] = 1873.440826646;
        doubleArray1[5] = 0.7853981633974483;
        doubleArray1[6] = -3296.8714;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 4523.428;
        doubleArray0[1] = -1008.5442480526209;
        doubleArray0[2] = 1873.440826646;
        doubleArray0[3] = 0.7853981633974483;
        doubleArray0[6] = -3296.8714;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 1873.440826646;
        doubleArray1[3] = 4523.428;
        doubleArray1[4] = 1873.440826646;
        doubleArray1[5] = 3207.0;
        doubleArray1[6] = -3296.8714;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1008.5442480526209));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = -1008.5442480526209;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = 0.7853981633974483;
        doubleArray1[2] = 0.7853981633974483;
        doubleArray1[3] = 0.7853981633974483;
        doubleArray1[4] = 1873.440826646;
        doubleArray1[5] = 0.7853981633974483;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 1873.440826646;
        doubleArray1[1] = 0.7853981633974483;
        doubleArray1[2] = 0.7853981633974483;
        doubleArray1[3] = 0.7853981633974483;
        doubleArray1[4] = 1873.440826646;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = 4523.428;
        doubleArray0[4] = -10.426758505275558;
        doubleArray0[5] = -3453.862249243;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = -3453.862249243;
        doubleArray1[2] = 0.7853981633974483;
        doubleArray1[3] = -3453.862249243;
        doubleArray1[5] = 3207.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1025.462347328048));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 4523.428;
        doubleArray0[1] = -1008.5442480526209;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 1873.440826646;
        doubleArray1[1] = 0.7853981633974483;
        doubleArray1[2] = 0.7853981633974483;
        doubleArray1[3] = 0.7853981633974483;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[5] = Double.POSITIVE_INFINITY;
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1008.5442480526209));
        Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 19.085536923187668;
        doubleArray0[1] = 19.085536923187668;
        doubleArray0[2] = 19.085536923187668;
        doubleArray0[3] = 19.085536923187668;
        double[] doubleArray1 = new double[4];
        doubleArray1[1] = 19.085536923187668;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-3798.1911));
        Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = 4523.428;
        doubleArray0[2] = 1873.440826646;
        doubleArray0[3] = 0.7853981633974483;
        doubleArray0[4] = -10.426758505275558;
        doubleArray0[5] = -3453.862249243;
        doubleArray0[0] = -3296.8714;
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1025.462347328048));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1922.49067582));
        eigenDecompositionImpl0.getSolver();
        DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1025.462347328048));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 6671.9910887329115);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Array2DRowRealMatrix array2DRowRealMatrix1 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1922.49067582));
        eigenDecompositionImpl0.getD();
        eigenDecompositionImpl0.getD();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 6671.9910887329115);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Array2DRowRealMatrix array2DRowRealMatrix1 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertNotSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1922.49067582));
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        Assert.assertNotNull(array2DRowRealMatrix0);
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), 0.5);
        Array2DRowRealMatrix array2DRowRealMatrix1 = ((Array2DRowRealMatrix) (eigenDecompositionImpl1.getVT()));
        Assert.assertEquals(0.0, eigenDecompositionImpl1.getDeterminant(), 0.01);
        Assert.assertNotNull(array2DRowRealMatrix1);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1922.49067582));
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1922.49067582));
        eigenDecompositionImpl0.getRealEigenvalue(2);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getImagEigenvalue(0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test47() throws Throwable {
        double[] doubleArray0 = new double[3];
        double[] doubleArray1 = new double[2];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1922.49067582));
        eigenDecompositionImpl0.getImagEigenvalues();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = -2636.71993196;
        doubleArray0[1] = 1964.3847319089184;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = -2636.71993196;
        doubleArray1[2] = 0.563;
        doubleArray1[3] = 340.288884617;
        doubleArray1[4] = 1964.3847319089184;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1233.1152588700693));
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(-6.335201669963494E12, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 4523.428;
        doubleArray0[1] = -1008.5442480526209;
        doubleArray0[2] = 1873.440826646;
        doubleArray0[5] = -3453.862249243;
        doubleArray0[6] = -3296.8714;
        doubleArray0[7] = 580.290120175663;
        doubleArray0[8] = 3207.0;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = -3453.862249243;
        doubleArray1[2] = 0.7853981633974483;
        doubleArray1[4] = 1873.440826646;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1008.5442480526209));
        Assert.assertEquals(6.0599426852767505E22, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 4523.428;
        doubleArray0[1] = -1008.5442480526209;
        doubleArray0[2] = 1873.440826646;
        doubleArray0[3] = 0.7853981633974483;
        doubleArray0[5] = -3453.862249243;
        doubleArray0[6] = -3296.8714;
        double[] doubleArray1 = new double[8];
        doubleArray1[3] = -3453.862249243;
        doubleArray1[4] = 1873.440826646;
        doubleArray1[6] = -3296.8714;
        doubleArray1[7] = -1008.5442480526209;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1008.5442480526209));
        Assert.assertEquals(-1.1808113539674733E30, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

