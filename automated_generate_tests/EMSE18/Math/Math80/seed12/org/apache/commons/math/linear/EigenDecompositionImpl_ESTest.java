

package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;

public class EigenDecompositionImpl_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = -2340.6500177;
        doubleArray0[2] = 1116.1943;
        doubleArray0[3] = 805.8061685561252;
        doubleArray0[4] = 0.25;
        doubleArray0[5] = 1060.361;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 989.762929;
        doubleArray1[1] = -2340.6500177;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2340.6500177));
        eigenDecompositionImpl0.getSolver();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = -806.94;
        doubleArray0[1] = -806.94;
        double[] doubleArray1 = new double[1];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-806.94));
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(651152.1636000001, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[2] = 1116.1943;
        doubleArray0[3] = 805.8061685561252;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 989.762929;
        doubleArray1[4] = 805.8061685561252;
        doubleArray1[6] = 1116.1943;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(4);
        Assert.assertEquals(805.8061685561252, double0, 0.01);
        Assert.assertEquals((-7.128095854546883E23), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 989.762929;
        doubleArray1[2] = -240.478783023;
        doubleArray1[4] = 805.8061685561252;
        doubleArray1[6] = 989.762929;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(4);
        Assert.assertEquals(3.603623748217655E22, eigenDecompositionImpl0.getDeterminant(), 0.01);
        Assert.assertEquals((-240.478783023), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getImagEigenvalue(4);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        ArrayRealVector arrayRealVector0 = ((ArrayRealVector) (eigenDecompositionImpl0.getEigenvector(0)));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
        Assert.assertEquals(Double.NaN, arrayRealVector0.getL1Norm(), 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = -806.94;
        doubleArray0[1] = -806.94;
        double[] doubleArray1 = new double[1];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-806.94));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(651152.1636000001, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = -806.94;
        doubleArray0[1] = 12.566370614359172;
        double[] doubleArray1 = new double[1];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 12.566370614359172);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals((-10140.307103550991), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        Assert.assertNotNull(array2DRowRealMatrix0);
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), 12.566370614359172);
        eigenDecompositionImpl1.getV();
        Assert.assertEquals(0.0, eigenDecompositionImpl1.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-806.94));
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), (-806.94));
        eigenDecompositionImpl1.getSolver();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[1] = -2340.6500177;
        doubleArray0[3] = 9.0;
        doubleArray0[2] = -2340.6500177;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 989.762929;
        doubleArray1[1] = -2340.6500177;
        doubleArray1[2] = 9.0;
        doubleArray1[3] = -2340.6500177;
        doubleArray1[4] = 1116.1943;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[2] = 1116.1943;
        doubleArray0[3] = 805.8061685561252;
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = -2340.6500177;
        doubleArray1[2] = -240.478783023;
        doubleArray1[3] = -2340.6500177;
        doubleArray1[4] = 805.8061685561252;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2340.6500177));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[3] = -2340.6500177;
        doubleArray0[5] = -2340.6500177;
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = -2340.6500177;
        doubleArray1[2] = -240.478783023;
        doubleArray1[3] = -2340.6500177;
        doubleArray1[4] = -2340.6500177;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2340.6500177));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[2] = 1116.1943;
        doubleArray0[5] = 1060.361;
        doubleArray0[6] = 989.762929;
        doubleArray0[7] = 3601.8986751110615;
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = -2340.6500177;
        doubleArray1[2] = 0.5;
        doubleArray1[3] = -2340.6500177;
        doubleArray1[4] = 805.8061685561252;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2340.6500177));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[4] = 0.25;
        doubleArray0[5] = 1060.361;
        doubleArray0[6] = 989.762929;
        doubleArray0[7] = 3601.8986751110615;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 989.762929;
        doubleArray1[1] = -2340.6500177;
        doubleArray1[2] = 0.5;
        doubleArray1[3] = -2340.6500177;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2340.6500177));
        Assert.assertEquals(2.3149667550111456E14, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[4] = 1116.1943;
        double[] doubleArray1 = new double[7];
        doubleArray1[4] = 805.8061685561252;
        doubleArray1[5] = 2604766.5680704177;
        doubleArray1[6] = 2604766.5680704177;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[1] = -2340.6500177;
        doubleArray0[3] = 805.8061685561252;
        doubleArray0[2] = -2340.6500177;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 989.762929;
        doubleArray1[1] = -2340.6500177;
        doubleArray1[2] = 9.0;
        doubleArray1[3] = -2340.6500177;
        doubleArray1[4] = 805.8061685561252;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = -2340.6500177;
        doubleArray0[2] = 1116.1943;
        doubleArray0[5] = 1060.361;
        doubleArray0[6] = 989.762929;
        doubleArray0[7] = 3601.5376077394944;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 989.762929;
        doubleArray1[1] = -2340.6500177;
        doubleArray1[2] = -240.478783023;
        doubleArray1[3] = -2340.6500177;
        doubleArray1[4] = 805.8061685561252;
        doubleArray1[6] = 1116.1943;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2340.6500177));
        Assert.assertEquals((-1.580968014927721E26), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[3] = 805.8061685561252;
        doubleArray0[6] = 989.762929;
        doubleArray0[7] = 3601.5376077394944;
        double[] doubleArray1 = new double[7];
        doubleArray1[3] = -2340.6500177;
        doubleArray1[4] = 805.8061685561252;
        doubleArray1[5] = 989.762929;
        doubleArray1[6] = 1116.1943;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2340.6500177));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        try {
            double[] doubleArray0 = new double[8];
            double[] doubleArray1 = new double[7];
            doubleArray1[4] = 805.8061685561252;
            doubleArray1[5] = 1.1102230246251565E-16;
            doubleArray1[6] = 1116.1943;
            EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
            Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
            org.junit.Assert.fail("Expecting exception: InvalidMatrixException");
        } catch (InvalidMatrixException expectedException__InvalidMatrixException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[3] = -2340.6500177;
        doubleArray0[5] = -2340.6500177;
        doubleArray0[6] = -2340.6500177;
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = -2340.6500177;
        doubleArray1[2] = -240.478783023;
        doubleArray1[3] = -2340.6500177;
        doubleArray1[4] = -2340.6500177;
        doubleArray1[5] = -11.948660333569418;
        doubleArray1[6] = -2340.6500177;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2340.6500177));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        doubleArray1[2] = -240.478783023;
        doubleArray1[3] = -2340.6500177;
        doubleArray1[4] = -2340.6500177;
        doubleArray1[5] = -11.948660333569418;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2340.6500177));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2340.6500177));
        eigenDecompositionImpl0.getSolver();
        DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2340.6500177));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2340.6500177));
        eigenDecompositionImpl0.getSolver();
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2340.6500177));
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getD();
        eigenDecompositionImpl0.getD();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 12.566370614359172);
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-806.94));
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-806.94));
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 12.566370614359172);
        eigenDecompositionImpl0.getRealEigenvalue(1);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getImagEigenvalues();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[2] = -2340.6500177;
        doubleArray0[7] = 10775.679804615913;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = -2340.6500177;
        doubleArray1[1] = -2340.6500177;
        doubleArray1[2] = -240.478783023;
        doubleArray1[3] = 989.762929;
        doubleArray1[4] = 805.8061685561252;
        doubleArray1[5] = 805.8061685561252;
        doubleArray1[6] = 1116.1943;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(8.81540420056122E25, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

