

package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;

public class EigenDecompositionImpl_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[2] = Double.NEGATIVE_INFINITY;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4568.240457867037);
        DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 76.1519862523586;
        doubleArray1[2] = -2065.634648;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4566.592489196023);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(4);
        Assert.assertEquals((-76.1519862523586), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getEigenvector(2);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[4] = 4566.592489196023;
        doubleArray0[5] = 4566.592489196023;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 76.1519862523586;
        doubleArray1[2] = -2065.634648;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4566.592489196023);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(5.1600511437873139E17, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        doubleArray1[0] = 518.8375480054578;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals((-269192.4012203158), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), 0.0);
        eigenDecompositionImpl1.getV();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[3] = 4566.592489196023;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 4566.592489196023;
        doubleArray1[1] = 76.1519862523586;
        doubleArray1[2] = -2065.634648;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4566.592489196023);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 4566.592489196023;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 76.1519862523586;
        doubleArray1[1] = 76.1519862523586;
        doubleArray1[2] = 4566.592489196023;
        doubleArray1[3] = -303.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4566.592489196023);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 4566.592489196023;
        doubleArray0[3] = 1307.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 76.1519862523586;
        doubleArray1[1] = 4566.592489196023;
        doubleArray1[2] = 4566.592489196023;
        doubleArray1[3] = 1307.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4566.592489196023);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 4566.592489196023;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 76.1519862523586;
        doubleArray1[1] = 76.1519862523586;
        doubleArray1[2] = -2065.634648;
        doubleArray1[3] = 4566.592489196023;
        doubleArray1[4] = 4566.592489196023;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4566.592489196023);
        Assert.assertEquals((-5.160051143789561E17), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[2] = -2065.634648;
        doubleArray0[3] = 1307.01372371408;
        doubleArray0[5] = -1141.9512;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 1307.01372371408;
        doubleArray1[1] = -1141.9512;
        doubleArray1[2] = -2065.634648;
        doubleArray1[3] = -1141.9512;
        doubleArray1[4] = -1141.9512;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals((-1.0264776841639205E19), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[3] = 1307.01372371408;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 76.1519862523586;
        doubleArray1[1] = 2.718281828459045;
        doubleArray1[2] = -2864.722087527826;
        doubleArray1[3] = 2.718281828459045;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2.718281828459045);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[4] = 4566.592489196023;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 76.1519862523586;
        doubleArray1[1] = 76.1519862523586;
        doubleArray1[2] = -2065.634648;
        doubleArray1[3] = -303.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4566.592489196023);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[4] = -281.0363617844955;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 76.1519862523586;
        doubleArray1[1] = 76.1519862523586;
        doubleArray1[2] = -2065.634648;
        doubleArray1[3] = -1141.9512;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4566.592489196023);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[3] = 4566.592489196023;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 76.1519862523586;
        doubleArray1[1] = 76.1519862523586;
        doubleArray1[2] = -2065.634648;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4566.592489196023);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 2.718281828459045;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = 2.718281828459045;
        doubleArray1[2] = -2864.722087527826;
        doubleArray1[3] = 2.718281828459045;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2.718281828459045);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 4571.110274402621;
        doubleArray0[3] = 1307.01372371408;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 76.1519862523586;
        doubleArray1[1] = 4571.110274402621;
        doubleArray1[2] = 1307.01372371408;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4571.110274402621);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 4566.592489196023;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = 76.1519862523586;
        doubleArray1[2] = -2065.634648;
        doubleArray1[3] = 76.1519862523586;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4566.592489196023);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 76.1519862523586;
        doubleArray1[1] = 2.718281828459045;
        doubleArray1[2] = -2864.722087527826;
        doubleArray1[3] = 2.718281828459045;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2.718281828459045);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[2] = Double.NEGATIVE_INFINITY;
        doubleArray1[3] = 1307.01372371408;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4568.240457867037);
        Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        try {
            double[] doubleArray0 = new double[6];
            doubleArray0[3] = 1307.01372371408;
            double[] doubleArray1 = new double[5];
            doubleArray1[0] = -303.0;
            doubleArray1[1] = 2.220446049250313E-16;
            doubleArray1[2] = 2.220446049250313E-16;
            EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2.220446049250313E-16);
            Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
            org.junit.Assert.fail("Expecting exception: InvalidMatrixException");
        } catch (InvalidMatrixException expectedException__InvalidMatrixException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        try {
            double[] doubleArray0 = new double[6];
            double[] doubleArray1 = new double[5];
            doubleArray1[0] = -303.0;
            doubleArray1[1] = 2.220446049250313E-16;
            doubleArray1[2] = 2.220446049250313E-16;
            EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2.220446049250313E-16);
            Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
            org.junit.Assert.fail("Expecting exception: InvalidMatrixException");
        } catch (InvalidMatrixException expectedException__InvalidMatrixException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[2] = -2065.634648;
        doubleArray1[3] = 4566.592489196023;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4566.592489196023);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4566.592489196023);
        eigenDecompositionImpl0.getSolver();
        DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4566.592489196023);
        eigenDecompositionImpl0.getSolver();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertEquals(6, array2DRowRealMatrix0.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4566.592489196023);
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 519.4);
        eigenDecompositionImpl0.getD();
        eigenDecompositionImpl0.getD();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4568.240457867037);
        eigenDecompositionImpl0.getSolver();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertEquals(6, array2DRowRealMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4571.110274402621);
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4566.592489196023);
        eigenDecompositionImpl0.getRealEigenvalue(4);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4566.592489196023);
        double double0 = eigenDecompositionImpl0.getImagEigenvalue(3);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 519.4);
        eigenDecompositionImpl0.getImagEigenvalues();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

