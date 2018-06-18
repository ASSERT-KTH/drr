

package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;

public class EigenDecompositionImpl_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        doubleArray1[1] = 2.682357283467084;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        ArrayRealVector arrayRealVector0 = ((ArrayRealVector) (eigenDecompositionImpl0.getEigenvector(2)));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
        Assert.assertEquals(Double.NaN, arrayRealVector0.getNorm(), 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[2] = 3511.65;
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = 3511.65;
        doubleArray1[1] = 2.682357283467084;
        doubleArray1[2] = 2.682357283467084;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(8.872697944748706E7, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 122.3;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 18.0;
        doubleArray1[1] = 122.3;
        doubleArray1[2] = 1.1102230246251565E-14;
        doubleArray1[4] = 2486.464;
        doubleArray1[5] = 3.762195691083631;
        doubleArray1[6] = 1.1102230246251565E-14;
        doubleArray1[7] = 2486.464;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getRealEigenvalue(4);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 2486.464;
        doubleArray0[1] = 3.762195691083631;
        doubleArray0[4] = 18.0;
        doubleArray0[5] = 122.3;
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 3.762195691083631);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(3);
        Assert.assertEquals(3.762195691083631, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 29.336836510642293;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(8);
        Assert.assertEquals((-29.336836510642293), double0, 0.01);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getImagEigenvalue(4);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 2486.464;
        doubleArray0[8] = 1.0;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = 122.3;
        doubleArray1[2] = 1.1102230246251565E-14;
        doubleArray1[4] = 2486.464;
        doubleArray1[6] = 29.336836510642293;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(5133.622604463743, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 2486.464;
        doubleArray0[5] = 122.3;
        doubleArray0[8] = 1.0;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = 122.3;
        doubleArray1[3] = 3.762195691083631;
        doubleArray1[6] = 29.336836510642293;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals((-5.5407795513345266E13), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new EigenDecompositionImpl(((double[]) (null)), ((double[]) (null)), 0.0);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[5] = 29.336836510642293;
        double[] doubleArray1 = new double[8];
        doubleArray1[4] = 3.762195691083631;
        doubleArray1[5] = 3.762195691083631;
        doubleArray1[6] = 29.336836510642293;
        doubleArray1[7] = 1.1102230246251565E-14;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 3.7621957;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 18.0;
        doubleArray1[1] = 122.3;
        doubleArray1[2] = -0.07404374723196573;
        doubleArray1[3] = 3.0617229640483856E-7;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 3.762195691083631;
        doubleArray0[3] = 2486.464;
        doubleArray0[4] = 29.336836510642293;
        doubleArray0[5] = 122.3;
        doubleArray0[6] = 29.336836510642293;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 29.336836510642293;
        doubleArray1[1] = 122.3;
        doubleArray1[2] = 0.9746355097423672;
        doubleArray1[3] = 122.3;
        doubleArray1[4] = 2486.464;
        doubleArray1[5] = 3.762195691083631;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[2] = 2486.464;
        doubleArray0[4] = -2891.2790989;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = -2891.2790989;
        doubleArray1[1] = 122.3;
        doubleArray1[2] = 0.11364398885499757;
        doubleArray1[3] = 3.762195691083631;
        doubleArray1[4] = 2486.464;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = 122.3;
        doubleArray1[2] = 0.9746355097423672;
        doubleArray1[3] = 122.3;
        doubleArray1[4] = 2486.464;
        doubleArray1[5] = 3.762195691083631;
        doubleArray1[6] = 29.336836510642293;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[3] = 2486.464;
        doubleArray0[7] = 2486.464;
        double[] doubleArray1 = new double[8];
        doubleArray1[3] = 122.3;
        doubleArray1[4] = 2486.464;
        doubleArray1[5] = 3.762195691083631;
        doubleArray1[6] = 29.336836510642293;
        doubleArray1[7] = 2486.464;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[4] = 18.0;
        doubleArray0[6] = 9.0;
        double[] doubleArray1 = new double[8];
        doubleArray1[3] = 122.3;
        doubleArray1[4] = 2486.464;
        doubleArray1[5] = 2486.464;
        doubleArray1[6] = 1.1102230246251565E-14;
        doubleArray1[7] = 2486.464;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[4] = 3.762195691083631;
        doubleArray1[5] = 3.762195691083631;
        doubleArray1[6] = 29.336836510642293;
        doubleArray1[7] = 1.1102230246251565E-14;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = 2486.464;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = 122.3;
        doubleArray1[2] = 1.1102230246251565E-14;
        doubleArray1[3] = 2486.464;
        doubleArray1[4] = 2486.464;
        doubleArray1[5] = 3.762195691083631;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2486.464);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 2486.464;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 18.0;
        doubleArray1[1] = 122.3;
        doubleArray1[2] = 1.1102230246251565E-14;
        doubleArray1[3] = 2486.464;
        doubleArray1[4] = 2486.464;
        doubleArray1[5] = 2486.464;
        doubleArray1[6] = 1.1102230246251565E-14;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        try {
            double[] doubleArray0 = new double[9];
            double[] doubleArray1 = new double[8];
            doubleArray1[0] = 18.0;
            doubleArray1[1] = 1.1102230246251565E-14;
            doubleArray1[2] = 1.1102230246251565E-14;
            EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.4636476090008061);
            eigenDecompositionImpl0.getVT();
            Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
            org.junit.Assert.fail("Expecting exception: InvalidMatrixException");
        } catch (InvalidMatrixException expectedException__InvalidMatrixException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = 3511.65;
        doubleArray1[1] = 2.682357283467084;
        doubleArray1[2] = 2.682357283467084;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(8.872697939258051E7, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 122.3;
        doubleArray1[1] = 122.3;
        doubleArray1[2] = 1.1102230246251565E-14;
        doubleArray1[3] = 3.762195691083631;
        doubleArray1[4] = 2486.464;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 3.762195691083631);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 2486.464;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = 122.3;
        doubleArray1[2] = 1.1102230246251565E-14;
        doubleArray1[4] = 2486.464;
        doubleArray1[5] = 3.762195691083631;
        doubleArray1[6] = 1.1102230246251565E-14;
        doubleArray1[0] = 2486.464;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 3.762195691083631);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[3] = 1.1102230246251565E-14;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = 122.3;
        doubleArray1[2] = 1.1102230246251565E-14;
        doubleArray1[3] = 3.762195691083631;
        doubleArray1[4] = 3.762195691083631;
        doubleArray1[5] = 3.762195691083631;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 29.336836510642293;
        doubleArray1[1] = 122.3;
        doubleArray1[2] = 1.1102230246251565E-14;
        doubleArray1[3] = 3.762195691083631;
        doubleArray1[4] = 3.762195691083631;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        try {
            double[] doubleArray0 = new double[9];
            double[] doubleArray1 = new double[8];
            doubleArray1[0] = 29.336836510642293;
            doubleArray1[1] = 122.3;
            doubleArray1[2] = 1.1102230246251565E-14;
            doubleArray1[3] = 3.762195691083631;
            doubleArray1[4] = 2486.464;
            doubleArray1[5] = 3.762195691083631;
            doubleArray1[6] = 29.336836510642293;
            doubleArray1[7] = 2486.464;
            EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
            Assert.assertEquals(8.609882185160163E22, eigenDecompositionImpl0.getDeterminant(), 0.01);
            org.junit.Assert.fail("Expecting exception: InvalidMatrixException");
        } catch (InvalidMatrixException expectedException__InvalidMatrixException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[4] = 2486.464;
        double[] doubleArray1 = new double[8];
        doubleArray1[3] = 2486.464;
        doubleArray1[4] = 2486.464;
        doubleArray1[5] = 122.3;
        doubleArray1[6] = 1.1102230246251565E-14;
        doubleArray1[7] = 2486.464;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2486.464);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        ArrayRealVector arrayRealVector0 = ((ArrayRealVector) (eigenDecompositionImpl0.getEigenvector(2)));
        Assert.assertEquals(4, arrayRealVector0.getDimension());
        Assert.assertEquals(Double.NaN, arrayRealVector0.getL1Norm(), 0.01);
        eigenDecompositionImpl0.getSolver();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getD();
        eigenDecompositionImpl0.getD();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Array2DRowRealMatrix array2DRowRealMatrix1 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertFalse(array2DRowRealMatrix1.equals(((Object) (array2DRowRealMatrix0))));
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getV();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertEquals(9, array2DRowRealMatrix0.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test47() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), 3.762195691083631);
        DecompositionSolver decompositionSolver0 = eigenDecompositionImpl1.getSolver();
        Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @Test(timeout = 4000)
    public void test49() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @Test(timeout = 4000)
    public void test51() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-647.590192586674));
        eigenDecompositionImpl0.getImagEigenvalues();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 2486.464;
        doubleArray0[6] = 3.762195691083631;
        doubleArray0[7] = 9.0;
        doubleArray0[8] = 1.0;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = 122.3;
        doubleArray1[2] = 1.1102230246251565E-14;
        doubleArray1[3] = 3.762195691083631;
        doubleArray1[4] = 2486.464;
        doubleArray1[0] = 2486.464;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 3.762195691083631);
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(-3540.417709165484, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 3.762195691083631;
        doubleArray0[2] = 2486.464;
        doubleArray0[4] = -2891.2790989;
        doubleArray0[5] = 122.3;
        doubleArray0[6] = -2891.2790989;
        doubleArray0[7] = 0.11364398885499757;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = -2891.2790989;
        doubleArray1[1] = 122.3;
        doubleArray1[2] = 0.11364398885499757;
        doubleArray1[3] = 3.762195691083631;
        doubleArray1[4] = 2486.464;
        doubleArray1[5] = 3.762195691083631;
        doubleArray1[6] = -2891.2790989;
        doubleArray1[7] = 3.762195691083631;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(-2.098055276021948E11, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[6] = 29.336836510642293;
        doubleArray0[7] = 2486.464;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 29.336836510642293;
        doubleArray1[1] = 122.3;
        doubleArray1[2] = 3.762195691083631;
        doubleArray1[3] = 3.762195691083631;
        doubleArray1[4] = 2486.464;
        doubleArray1[5] = 3.762195691083631;
        doubleArray1[6] = 29.336836510642293;
        doubleArray1[7] = 2486.464;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(1.3660019147059894E19, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[4] = 29.336836510642293;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 29.336836510642293;
        doubleArray1[1] = 3.762195691083631;
        doubleArray1[2] = 1.1102230246251565E-14;
        doubleArray1[3] = 3.762195691083631;
        doubleArray1[4] = 2486.464;
        doubleArray1[5] = 3.762195691083631;
        doubleArray1[6] = 29.336836510642293;
        doubleArray1[7] = 2486.464;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(1.2514775100080838E21, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

