

package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;

public class EigenDecompositionImpl_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[5] = 0.08325;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1870.516);
        eigenDecompositionImpl0.getSolver();
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        try {
            double[] doubleArray0 = new double[7];
            double[] doubleArray1 = new double[6];
            doubleArray1[3] = 1.0E-13;
            doubleArray1[4] = 21461.127010282264;
            doubleArray1[5] = 1.0E-13;
            EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1859.41750753663);
            eigenDecompositionImpl0.getVT();
            Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
            org.junit.Assert.fail("Expecting exception: InvalidMatrixException");
        } catch (InvalidMatrixException expectedException__InvalidMatrixException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = 1870.516;
        double[] doubleArray1 = new double[6];
        doubleArray1[3] = 9.596465810589535;
        doubleArray1[5] = 9.596465810589535;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 9.596465810589535);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(2);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
        Assert.assertEquals(9.596465810589535, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 0.08325;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1870.516);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(6);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
        Assert.assertEquals((-0.08325), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1870.516);
        eigenDecompositionImpl0.getImagEigenvalue(0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1870.516);
        ArrayRealVector arrayRealVector0 = ((ArrayRealVector) (eigenDecompositionImpl0.getEigenvector(0)));
        Assert.assertEquals(Double.NaN, arrayRealVector0.getNorm(), 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = 1870.516;
        doubleArray0[1] = 1.0E-13;
        doubleArray0[2] = 2312.720040947729;
        double[] doubleArray1 = new double[6];
        doubleArray1[3] = -941.76753330995;
        doubleArray1[5] = 0.08325;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1870.516);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(0.002659135110580052, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = 2312.720040947729;
        doubleArray0[3] = 0.08325;
        doubleArray0[4] = -2291.85307536;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 0.08325;
        doubleArray1[5] = 1870.516;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1870.516);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals((-1.0700040410609774E10), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1870.516);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), 1870.516);
        DecompositionSolver decompositionSolver0 = eigenDecompositionImpl1.getSolver();
        Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 6.283185307179586;
        double[] doubleArray1 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 6.283185307179586);
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(6.283185307179586, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[1] = 1870.516;
        doubleArray0[6] = 3555.9144914071;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 1870.516;
        doubleArray1[2] = 3555.9144914071;
        doubleArray1[3] = -941.76753330995;
        doubleArray1[4] = 1.0E-13;
        doubleArray1[5] = 1.0E-13;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1870.516);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = 9.596465810589535;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 9.596465810589535;
        doubleArray1[2] = 9.596465810589535;
        doubleArray1[3] = 9.596465810589535;
        doubleArray1[4] = 9.596465810589535;
        doubleArray1[5] = 9.596465810589535;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 9.596465810589535);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = 1870.516;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 1870.516;
        doubleArray1[2] = 1870.516;
        doubleArray1[3] = 0.5403023058681398;
        doubleArray1[4] = 21461.127010282264;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1870.516);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = 0.08325;
        doubleArray0[6] = 1870.516;
        double[] doubleArray1 = new double[6];
        doubleArray1[2] = 3565.736535848443;
        doubleArray1[3] = 1870.516;
        doubleArray1[4] = 21461.127010282264;
        doubleArray1[5] = 0.08325;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1870.516);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = 2312.720040947729;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 0.08325;
        doubleArray1[2] = 0.08325;
        doubleArray1[3] = 0.08325;
        doubleArray1[0] = 2312.720040947729;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1870.516);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 1870.516;
        doubleArray1[2] = 1870.516;
        doubleArray1[3] = 0.5403023058681398;
        doubleArray1[4] = 21461.127010282264;
        doubleArray1[5] = 1870.516;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1870.516);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = 0.08325;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 0.08325;
        doubleArray1[2] = 0.08325;
        doubleArray1[3] = 0.08325;
        doubleArray1[4] = 21461.127010282264;
        doubleArray1[5] = 0.08325;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1870.516);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = 2312.720040947729;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 0.08325;
        doubleArray1[2] = 0.08325;
        doubleArray1[3] = 0.08325;
        doubleArray1[4] = 2312.720040947729;
        doubleArray1[5] = 0.08325;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1870.516);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = 1870.516;
        doubleArray0[2] = -2291.85307536;
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 0.08325;
        doubleArray1[1] = 0.08325;
        doubleArray1[2] = 2312.720040947729;
        doubleArray1[3] = 1.0E-13;
        doubleArray1[4] = 21461.127010282264;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1870.516);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[0] = 0.08325;
        doubleArray1[1] = 0.08325;
        doubleArray1[2] = 2312.720040947729;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1870.516);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[5] = 3555.9144914071;
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 0.08325;
        doubleArray1[2] = 3555.9144914071;
        doubleArray1[3] = -941.76753330995;
        doubleArray1[4] = 1.0E-13;
        doubleArray1[5] = 0.08325;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1870.516);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 1870.516;
        doubleArray1[2] = 3555.9144914071;
        doubleArray1[3] = -941.76753330995;
        doubleArray1[4] = 1.0E-13;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1870.516);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[5] = 1870.516;
        double[] doubleArray1 = new double[6];
        doubleArray1[3] = 1.0E-13;
        doubleArray1[4] = 21461.127010282264;
        doubleArray1[5] = 0.08325;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1870.516);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[1] = 0.08325;
        doubleArray1[2] = 0.08325;
        doubleArray1[3] = 0.08325;
        doubleArray1[4] = 21461.127010282264;
        doubleArray1[5] = 0.08325;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1870.516);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = 1870.516;
        doubleArray0[1] = 1.0E-13;
        doubleArray0[3] = 0.08325;
        double[] doubleArray1 = new double[6];
        doubleArray1[4] = 0.08325;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1870.516);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), (-2291.85307536));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
        Assert.assertEquals((-0.0), eigenDecompositionImpl1.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[2] = Double.POSITIVE_INFINITY;
        double[] doubleArray1 = new double[6];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1870.516);
        Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        doubleArray1[4] = 0.08325;
        doubleArray1[5] = 0.08325;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1870.516);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1870.516);
        eigenDecompositionImpl0.getSolver();
        eigenDecompositionImpl0.getSolver();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 6.283185307179586);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1882.2332592741268);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertNotNull(array2DRowRealMatrix0);
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1882.2332592741268);
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1870.516);
        eigenDecompositionImpl0.getD();
        eigenDecompositionImpl0.getD();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1870.516);
        eigenDecompositionImpl0.getSolver();
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1870.516);
        eigenDecompositionImpl0.getV();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
        Assert.assertNotNull(array2DRowRealMatrix0);
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1870.516);
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        double[] doubleArray0 = new double[7];
        double[] doubleArray1 = new double[6];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1882.2332592741268);
        eigenDecompositionImpl0.getImagEigenvalues();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

