

package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;

public class EigenDecompositionImpl_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        try {
            double[] doubleArray0 = new double[9];
            double[] doubleArray1 = new double[8];
            doubleArray1[0] = 10.06766199577777;
            doubleArray1[1] = 4.547473508864641E-13;
            doubleArray1[2] = 4.547473508864641E-13;
            doubleArray1[4] = 648.2989409101951;
            doubleArray1[5] = 2160.473218444039;
            doubleArray1[6] = 1589.52282095;
            doubleArray1[7] = 4.547473508864641E-13;
            EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4.547473508864641E-13);
            Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
            org.junit.Assert.fail("Expecting exception: InvalidMatrixException");
        } catch (InvalidMatrixException expectedException__InvalidMatrixException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 51.598405200469045;
        doubleArray0[1] = 1589.52282095;
        doubleArray0[2] = 51.598405200469045;
        doubleArray0[3] = 1623.8;
        doubleArray0[5] = 644.1889568403803;
        doubleArray0[6] = 1.01;
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 51.598405200469045);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(5);
        Assert.assertEquals(1.01, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[2] = 0.25898800695275503;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1589.52282095);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(8);
        Assert.assertEquals((-0.25898800695275503), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4.547473508864641E-13);
        eigenDecompositionImpl0.getImagEigenvalue(7);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1589.52282095);
        ArrayRealVector arrayRealVector0 = ((ArrayRealVector) (eigenDecompositionImpl0.getEigenvector(8)));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
        Assert.assertEquals(Double.NaN, arrayRealVector0.getLInfNorm(), 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 51.598405200469045;
        doubleArray0[5] = 644.1889568403803;
        doubleArray0[8] = -1.2599210498948732;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = 818.2;
        doubleArray1[3] = 1.01;
        doubleArray1[6] = 818.2;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 818.2);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(1.9145800725488276E16, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 51.598405200469045;
        doubleArray0[1] = 1589.52282095;
        doubleArray0[2] = 1589.52282095;
        doubleArray0[5] = 644.1889568403803;
        doubleArray0[8] = -1.2599210498948732;
        double[] doubleArray1 = new double[8];
        doubleArray1[3] = 1.01;
        doubleArray1[6] = 818.2;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 818.2);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals((-7.22583630931768E16), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[3] = 1623.8;
        double[] doubleArray1 = new double[8];
        doubleArray1[2] = 4.547473508864641E-13;
        doubleArray1[3] = 1.01;
        doubleArray1[4] = 648.2989409101951;
        doubleArray1[5] = 2160.473218444039;
        doubleArray1[6] = 1589.52282095;
        doubleArray1[7] = 4.547473508864641E-13;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4.547473508864641E-13);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[4] = 1589.52282095;
        doubleArray0[2] = 818.2;
        doubleArray0[0] = 659.86635423;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = -237.89;
        doubleArray1[1] = 818.2;
        doubleArray1[2] = 51.598405200469045;
        doubleArray1[3] = 1.01;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 818.2);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[4] = 1589.52282095;
        doubleArray0[2] = 818.2;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = -237.89;
        doubleArray1[1] = 818.2;
        doubleArray1[2] = 51.598405200469045;
        doubleArray1[3] = 1.01;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 818.2);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[5] = 1589.52282095;
        double[] doubleArray1 = new double[8];
        doubleArray1[2] = 0.25898800695275503;
        doubleArray1[3] = 0.25898800695275503;
        doubleArray1[4] = -1.2599210498948732;
        doubleArray0[2] = 2160.473218444039;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1589.52282095);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[5] = 1589.52282095;
        double[] doubleArray1 = new double[8];
        doubleArray1[2] = 0.25898800695275503;
        doubleArray1[3] = 0.25898800695275503;
        doubleArray1[4] = -1.2599210498948732;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1589.52282095);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[5] = 644.1889568403803;
        double[] doubleArray1 = new double[8];
        doubleArray1[4] = 0.4915154927421099;
        doubleArray1[5] = 2160.473218444039;
        doubleArray1[6] = 0.4915154927421099;
        doubleArray1[7] = 1.01;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.4915154927421099);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[3] = 1623.8;
        doubleArray0[5] = 644.1889568403803;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = 0.4915154927421099;
        doubleArray1[2] = 0.4915154927421099;
        doubleArray1[3] = 1.01;
        doubleArray1[4] = 659.86635423;
        doubleArray1[5] = 2160.473218444039;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.4915154927421099);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[3] = 1623.8;
        doubleArray0[5] = 644.1889568403803;
        double[] doubleArray1 = new double[8];
        doubleArray1[3] = 1.01;
        doubleArray1[4] = 659.86635423;
        doubleArray1[5] = 2160.473218444039;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.4915154927421099);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 2160.473218444039;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 10.06766199577777;
        doubleArray1[1] = 4.547473508864641E-13;
        doubleArray1[2] = 4.547473508864641E-13;
        doubleArray1[3] = 1.01;
        doubleArray1[4] = 648.2989409101951;
        doubleArray1[5] = 2160.473218444039;
        doubleArray1[6] = 1589.52282095;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4.547473508864641E-13);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[3] = 1.01;
        doubleArray1[4] = 659.86635423;
        doubleArray1[5] = 2160.473218444039;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.4915154927421099);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[3] = 1623.8;
        double[] doubleArray1 = new double[8];
        doubleArray1[3] = 1.01;
        doubleArray1[4] = 659.86635423;
        doubleArray1[5] = 2160.473218444039;
        doubleArray1[6] = 0.4915154927421099;
        doubleArray1[7] = 1.01;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.4915154927421099);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 648.2989409101951;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 10.06766199577777;
        doubleArray1[1] = 4.547473508864641E-13;
        doubleArray1[2] = 4.547473508864641E-13;
        doubleArray1[3] = 1.01;
        doubleArray1[4] = 648.2989409101951;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4.547473508864641E-13);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = 0.4915154927421099;
        doubleArray0[5] = 644.1889568403803;
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = 0.4915154927421099;
        doubleArray1[2] = 0.4915154927421099;
        doubleArray1[3] = 1.01;
        doubleArray1[4] = 0.4915154927421099;
        doubleArray1[5] = 2160.473218444039;
        doubleArray1[6] = 0.4915154927421099;
        doubleArray1[7] = 1.01;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.4915154927421099);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = 0.4915154927421099;
        doubleArray1[2] = 0.4915154927421099;
        doubleArray1[3] = 1.01;
        doubleArray1[4] = 0.4915154927421099;
        doubleArray1[5] = 2160.473218444039;
        doubleArray1[6] = 0.4915154927421099;
        doubleArray1[7] = 1.01;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.4915154927421099);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[2] = 0.4915154927421099;
        doubleArray1[3] = 1.01;
        doubleArray1[4] = 0.4915154927421099;
        doubleArray1[5] = 2160.473218444039;
        doubleArray1[6] = 0.4915154927421099;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.4915154927421099);
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        doubleArray1[1] = 4.547473508864641E-13;
        doubleArray1[2] = 4.547473508864641E-13;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4.547473508864641E-13);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 818.2);
        eigenDecompositionImpl0.getSolver();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4.547473508864641E-13);
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getSolver();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.4915154927421099);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 3981.4);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Array2DRowRealMatrix array2DRowRealMatrix1 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertTrue(array2DRowRealMatrix1.equals(((Object) (array2DRowRealMatrix0))));
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.4915154927421099);
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.4915154927421099);
        eigenDecompositionImpl0.getD();
        eigenDecompositionImpl0.getD();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4.547473508864641E-13);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Array2DRowRealMatrix array2DRowRealMatrix1 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertNotSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 51.598405200469045);
        eigenDecompositionImpl0.getV();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertEquals(9, array2DRowRealMatrix0.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 818.2);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), 3.762195691083631);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4.547473508864641E-13);
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1589.52282095);
        eigenDecompositionImpl0.getRealEigenvalue(8);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        double[] doubleArray0 = new double[9];
        double[] doubleArray1 = new double[8];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.4915154927421099);
        eigenDecompositionImpl0.getImagEigenvalues();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[3] = 1623.8;
        doubleArray0[5] = 10.06766199577777;
        doubleArray0[6] = 1.01;
        doubleArray0[0] = 2160.473218444039;
        double[] doubleArray1 = new double[8];
        doubleArray1[0] = 10.06766199577777;
        doubleArray1[1] = 4.547473508864641E-13;
        doubleArray1[2] = 4.547473508864641E-13;
        doubleArray1[3] = 1.01;
        doubleArray1[4] = 648.2989409101951;
        doubleArray1[5] = 1623.8;
        doubleArray1[6] = 1589.52282095;
        doubleArray1[7] = 4.547473508864641E-13;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4.547473508864641E-13);
        Assert.assertEquals(-0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

