

package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;

public class EigenDecompositionImpl_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[2] = -268.3527346963321;
        doubleArray0[3] = -268.3527346963321;
        doubleArray0[4] = 54126.243006093166;
        doubleArray0[5] = 54126.243006093166;
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-268.3527346963321));
        eigenDecompositionImpl0.getSolver();
        Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 625.6339460207358;
        doubleArray0[1] = 54126.243006093166;
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-285.656));
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), 54126.243006093166);
        Assert.assertEquals(0.0, eigenDecompositionImpl1.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 625.6339460207358;
        doubleArray0[1] = 625.6339460207358;
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-285.656));
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(1);
        Assert.assertEquals(625.6339460207358, double0, 0.01);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[4] = -2142.0689359455;
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(5);
        Assert.assertEquals((-2142.0689359455), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getImagEigenvalue(4);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[2] = -285.656;
        doubleArray0[5] = 1.2599210498948732;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 54126.243006093166;
        doubleArray1[3] = -2142.0689359455;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-285.656));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals((-4.8380386642266982E18), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new EigenDecompositionImpl(((double[]) (null)), ((double[]) (null)), 9.0);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 2111.9332;
        doubleArray0[3] = 2058.283964601;
        doubleArray0[4] = -2142.0689359455;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 2111.9332;
        doubleArray1[1] = 625.6339460207358;
        doubleArray1[2] = 1.2599210498948732;
        doubleArray1[3] = -2142.0689359455;
        doubleArray1[4] = 625.6339460207358;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-285.656));
        Assert.assertEquals((-2.7713260790986377E12), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 625.6339460207358;
        doubleArray0[1] = 54126.243006093166;
        doubleArray0[2] = -285.656;
        doubleArray0[3] = 2058.283964601;
        doubleArray0[4] = -2142.0689359455;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 54126.243006093166;
        doubleArray1[1] = -2142.0689359455;
        doubleArray1[3] = -2142.0689359455;
        doubleArray1[2] = 625.6339460207358;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-285.656));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 54126.243006093166;
        double[] doubleArray1 = new double[5];
        doubleArray0[4] = 54126.243006093166;
        doubleArray1[1] = 625.6339460207358;
        doubleArray1[2] = 1.2599210498948732;
        doubleArray1[3] = -2142.0689359455;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-285.656));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 54126.243006093166;
        doubleArray1[1] = 625.6339460207358;
        doubleArray1[2] = 54126.243006093166;
        doubleArray1[3] = 54126.243006093166;
        doubleArray1[4] = 54126.243006093166;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals((-2.514474861680028E28), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 625.6339460207358;
        doubleArray1[1] = 625.6339460207358;
        doubleArray1[2] = 1.2599210498948732;
        doubleArray1[3] = -2142.0689359455;
        doubleArray1[4] = 625.6339460207358;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-285.656));
        Assert.assertEquals((-2.432024151193608E11), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[2] = 625.6339460207358;
        doubleArray0[4] = -2142.0689359455;
        double[] doubleArray1 = new double[5];
        doubleArray1[2] = 1.2599210498948732;
        doubleArray1[3] = -2142.0689359455;
        doubleArray1[4] = 625.6339460207358;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 625.6339460207358);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[3] = 2058.283964601;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 54126.243006093166;
        doubleArray1[1] = 2058.283964601;
        doubleArray1[2] = 1.2599210498948732;
        doubleArray1[3] = -2142.0689359455;
        doubleArray1[4] = 625.6339460207358;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-285.656));
        Assert.assertEquals((-1.8203003116193602E15), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[2] = -285.656;
        doubleArray0[4] = -2142.0689359455;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 54126.243006093166;
        doubleArray1[1] = -2142.0689359455;
        doubleArray1[2] = 1.2599210498948732;
        doubleArray1[3] = -2142.0689359455;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-285.656));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = 54126.243006093166;
        doubleArray0[2] = -285.656;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 54126.243006093166;
        doubleArray1[2] = 1.2599210498948732;
        doubleArray1[3] = -2142.0689359455;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-285.656));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[3] = 2058.283964601;
        doubleArray0[4] = 2058.283964601;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 625.6339460207358;
        doubleArray1[1] = 625.6339460207358;
        doubleArray1[2] = 6.821210263296962E-11;
        doubleArray1[3] = -285.656;
        doubleArray1[4] = 625.6339460207358;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-285.656));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[3] = 33451.85786110186;
        doubleArray0[4] = -2142.0689359455;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 625.6339460207358;
        doubleArray1[2] = 6.821210263296962E-11;
        doubleArray1[1] = -2142.0689359455;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-285.124469760914));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 54126.243006093166;
        doubleArray0[2] = -285.656;
        doubleArray0[3] = 2058.283964601;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 54126.243006093166;
        doubleArray1[1] = 625.6339460207358;
        doubleArray1[3] = -285.656;
        doubleArray1[4] = 625.6339460207358;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-285.656));
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(5.1779459726670146E29, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 625.6339460207358;
        doubleArray0[1] = 54126.243006093166;
        doubleArray0[2] = -285.656;
        doubleArray0[3] = 2058.283964601;
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-285.656));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 625.6339460207358;
        doubleArray0[1] = 625.6339460207358;
        doubleArray0[2] = -285.656;
        doubleArray0[3] = 2058.283964601;
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-285.656));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 625.6339460207358);
        eigenDecompositionImpl0.getV();
        DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-285.656));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getV();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertEquals(6, array2DRowRealMatrix0.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-285.656));
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-285.656));
        eigenDecompositionImpl0.getD();
        eigenDecompositionImpl0.getD();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-268.3527346963321));
        ArrayRealVector arrayRealVector0 = ((ArrayRealVector) (eigenDecompositionImpl0.getEigenvector(2)));
        Assert.assertEquals(6, arrayRealVector0.getDimension());
        Assert.assertEquals(Double.NaN, arrayRealVector0.getL1Norm(), 0.01);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
        Assert.assertEquals(6, array2DRowRealMatrix0.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getV();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertNotNull(array2DRowRealMatrix0);
        Assert.assertEquals(6, array2DRowRealMatrix0.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-285.656));
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        Assert.assertNotNull(array2DRowRealMatrix0);
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), 625.6339460207358);
        eigenDecompositionImpl1.getV();
        Assert.assertEquals(0.0, eigenDecompositionImpl1.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-285.656));
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-285.656));
        eigenDecompositionImpl0.getRealEigenvalue(3);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-285.656));
        eigenDecompositionImpl0.getImagEigenvalues();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[2] = 625.6339460207358;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 54126.243006093166;
        doubleArray1[1] = 625.6339460207358;
        doubleArray1[2] = 2.0282236820792447;
        doubleArray1[3] = -2142.0689359455;
        doubleArray1[4] = 625.6339460207358;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 625.6339460207358);
        Assert.assertEquals(-4.717241305768368E15, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

