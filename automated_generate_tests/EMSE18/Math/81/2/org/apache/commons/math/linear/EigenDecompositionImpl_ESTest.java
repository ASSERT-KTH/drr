

package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;

public class EigenDecompositionImpl_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        doubleArray1[1] = -24.73972099971603;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-24.73972099971603));
        eigenDecompositionImpl0.getV();
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = -24.73972099971603;
        doubleArray0[1] = 1.05;
        doubleArray0[3] = -2578.835;
        doubleArray0[4] = -1961.9091;
        double[] doubleArray1 = new double[4];
        doubleArray1[1] = -24.73972099971603;
        doubleArray1[2] = -24.73972099971603;
        doubleArray1[3] = -1961.9091;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-24.73972099971603));
        Assert.assertEquals(3.755877201014101E10, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getRealEigenvalue(3);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[3] = -2578.835;
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2.0);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(4);
        Assert.assertEquals((-2578.835), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[2] = 4553.20329554581;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = -1961.9091;
        doubleArray1[3] = -1961.9091;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-291.89345));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(6.745786126860872E16, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = -291.89345;
        double[] doubleArray1 = new double[4];
        doubleArray1[1] = -291.89345;
        doubleArray1[3] = -2578.835;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-291.89345));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals((-1.653941561621959E14), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new EigenDecompositionImpl(((double[]) (null)), ((double[]) (null)), 0.0);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = 1101.38986769;
        doubleArray0[1] = 1.0;
        double[] doubleArray1 = new double[1];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1101.38986769);
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(1101.38986769, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[3] = -2579.2394065025246;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 0.44473139307833487;
        doubleArray1[1] = 2.0;
        doubleArray1[2] = -2579.2394065025246;
        doubleArray1[3] = -2579.2394065025246;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2.0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = -291.89345;
        doubleArray0[4] = 4553.20329554581;
        doubleArray0[3] = 4553.20329554581;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 1.05;
        doubleArray1[1] = -291.89345;
        doubleArray1[2] = -291.89345;
        doubleArray1[3] = -291.89345;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-291.89345));
        Assert.assertEquals(5.134746145457565E14, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[3] = -2578.835;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = -1961.9091;
        doubleArray1[1] = -24.73972099971603;
        doubleArray1[2] = -24.73972099971603;
        doubleArray1[3] = -1961.9091;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-24.73972099971603));
        Assert.assertEquals(3.3697199042522983, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = -291.89345;
        doubleArray0[1] = 2.4844919599523276;
        doubleArray0[4] = 4553.20329554581;
        doubleArray0[3] = 4553.20329554581;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 2.4844919599523276;
        doubleArray1[1] = -291.89345;
        doubleArray1[2] = -472.75688912823;
        doubleArray1[3] = -291.89345;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-291.89345));
        Assert.assertEquals(5.14218465616077E14, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[3] = -2578.835;
        doubleArray0[4] = -1961.9091;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = -1961.9091;
        doubleArray1[1] = -24.73972099971603;
        doubleArray1[2] = -24.73972099971603;
        doubleArray1[3] = -1961.9091;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-24.73972099971603));
        Assert.assertEquals((-4.621960610376918E12), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = -291.89345;
        doubleArray0[1] = 1.05;
        doubleArray0[4] = 4553.20329554581;
        doubleArray0[3] = -291.89345;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 1.05;
        doubleArray1[1] = -291.89345;
        doubleArray1[2] = 0.08325;
        doubleArray1[3] = -291.89345;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-291.89345));
        Assert.assertEquals((-3.5172225741385926E13), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[3] = -2578.835;
        doubleArray0[4] = -1961.9091;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = -1961.9091;
        doubleArray1[1] = -30.420306793227333;
        doubleArray1[2] = -30.420306793227333;
        doubleArray1[3] = -1961.9091;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-30.420306793227333));
        Assert.assertEquals((-6.988175835561384E12), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[3] = -2578.835;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = -1.0;
        doubleArray1[1] = 2.0;
        doubleArray1[2] = -1.0;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2.0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = -2578.835;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = -2578.835;
        doubleArray1[1] = -291.89345;
        doubleArray1[2] = -472.75688912823;
        doubleArray1[3] = -2578.835;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-291.89345));
        Assert.assertEquals((-1.4612326474148052E15), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[3] = -2578.835;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 2.0;
        doubleArray1[1] = 2.0;
        doubleArray1[2] = -472.31985891743074;
        doubleArray1[3] = -2578.835;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2.0);
        Assert.assertEquals(1.2299884441360681E-5, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = -291.89345;
        doubleArray0[1] = 2.4844919599523276;
        doubleArray0[4] = 4553.20329554581;
        doubleArray0[3] = -2578.835;
        double[] doubleArray1 = new double[4];
        doubleArray1[1] = -291.89345;
        doubleArray1[2] = -472.75688912823;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-291.89345));
        Assert.assertEquals((-2.912827086144773E14), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[3] = -2578.835;
        doubleArray0[4] = -1961.9091;
        double[] doubleArray1 = new double[4];
        doubleArray0[2] = -1961.9091;
        doubleArray1[1] = -24.73972099971603;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-24.73972099971603));
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 2.0;
        doubleArray0[3] = -2578.835;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 1.05;
        doubleArray1[1] = 2.0;
        doubleArray1[2] = -472.31985891743074;
        doubleArray1[3] = -2578.835;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2.0);
        Assert.assertEquals(5.32031196577937E7, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = 1.05;
        doubleArray1[1] = -291.89345;
        doubleArray1[2] = 0.08325;
        doubleArray1[3] = -291.89345;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-291.89345));
        Assert.assertEquals((-6.330464748149534E12), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = -291.89345;
        doubleArray0[2] = 4553.20329554581;
        double[] doubleArray1 = new double[4];
        doubleArray1[0] = -1961.9091;
        doubleArray1[3] = -1961.9091;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-291.89345));
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), (-1961.9091));
        Assert.assertEquals(6.7457861268608688E16, eigenDecompositionImpl1.getDeterminant(), 0.01);
        Assert.assertEquals(6.7457861268608704E16, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = -291.89345;
        doubleArray0[1] = 1.05;
        double[] doubleArray1 = new double[4];
        doubleArray1[1] = -291.89345;
        doubleArray1[2] = 0.08325;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-291.89345));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        doubleArray1[2] = -472.75688912823;
        doubleArray1[3] = 4553.20329554581;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-291.89345));
        DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-291.89345));
        eigenDecompositionImpl0.getVT();
        DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-291.89345));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        ArrayRealVector arrayRealVector0 = ((ArrayRealVector) (eigenDecompositionImpl0.getEigenvector(0)));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
        Assert.assertEquals(5, arrayRealVector0.getDimension());
        Assert.assertTrue(arrayRealVector0.isNaN());
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1101.38986769);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Array2DRowRealMatrix array2DRowRealMatrix1 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertFalse(array2DRowRealMatrix1.equals(((Object) (array2DRowRealMatrix0))));
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-291.89345));
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-291.89345));
        eigenDecompositionImpl0.getD();
        eigenDecompositionImpl0.getD();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-291.89345));
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertNotNull(array2DRowRealMatrix0);
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-291.89345));
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-291.89345));
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), 0.0);
        eigenDecompositionImpl1.getSolver();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-291.89345));
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 2.0);
        eigenDecompositionImpl0.getImagEigenvalue(4);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        double[] doubleArray0 = new double[5];
        double[] doubleArray1 = new double[4];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-291.89345));
        eigenDecompositionImpl0.getImagEigenvalues();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = -291.89345;
        doubleArray0[1] = 1.05;
        doubleArray0[2] = -291.89345;
        double[] doubleArray1 = new double[4];
        doubleArray1[1] = -291.89345;
        doubleArray1[2] = -472.75688912823;
        doubleArray1[3] = -1961.9091;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-291.89345));
        Assert.assertEquals(-9.607054500795756E13, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

