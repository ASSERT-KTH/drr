

package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;

public class EigenDecompositionImpl_ESTest  {
    @Test(timeout = 4000)
    public void test01() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[0] = 0.25;
        doubleArray0[1] = 0.25;
        EigenDecompositionImpl eigenDecompositionImpl0 = null;
        try {
            eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray0, 1.5173467560092369);
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(0);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[2] = 6.0;
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4.0);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(0);
        Assert.assertEquals(6.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = -41.382110518577306;
        doubleArray0[3] = -2862.087440890501;
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4.0);
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(4);
        Assert.assertEquals((-41.382110518577306), double0, 0.01);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4.0);
        eigenDecompositionImpl0.getEigenvector(4);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[0] = 0.25;
        doubleArray0[3] = -10.636063299620602;
        double[] doubleArray1 = new double[3];
        doubleArray1[1] = 0.08325;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(0.018428475362994204, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[0] = -37.27743575428278;
        doubleArray0[1] = -37.27743575428278;
        double[] doubleArray1 = new double[3];
        doubleArray1[2] = -37.27743575428278;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals((-1931008.215911755), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[0] = 0.25;
        doubleArray0[1] = 0.25;
        doubleArray0[2] = 1.5173467560092369;
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = 1.5173467560092369;
        doubleArray1[1] = 0.25;
        doubleArray1[2] = 1.5173467560092369;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(5.15687857616113, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 25.8364018355134;
        doubleArray0[4] = -406.830758683122;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -720.8072486868;
        doubleArray1[1] = 0.333;
        doubleArray1[2] = -406.830758683122;
        doubleArray1[3] = 25.8364018355134;
        doubleArray1[4] = -0.4161468365471424;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-16.771017783173797));
        Assert.assertEquals((-1.4892206417611378E10), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[3] = -10.636063299620602;
        double[] doubleArray1 = new double[3];
        doubleArray1[0] = 0.08325;
        doubleArray1[1] = 0.08325;
        doubleArray1[2] = 0.25;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(4.3316015625000673E-4, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 25.8364018355134;
        doubleArray0[1] = 0.333;
        doubleArray0[2] = 6.0;
        doubleArray0[3] = 25.8364018355134;
        doubleArray0[4] = 0.333;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 25.8364018355134;
        doubleArray1[1] = 0.333;
        doubleArray1[2] = 25.8364018355134;
        doubleArray1[3] = 25.8364018355134;
        doubleArray1[4] = -0.4161468365471424;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-16.771017783173797));
        Assert.assertEquals((-58468.64947405644), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 25.8364018355134;
        doubleArray0[4] = -1.0155369144174402;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 25.8364018355134;
        doubleArray1[1] = -2862.087440890501;
        doubleArray1[2] = -2862.087440890501;
        doubleArray1[3] = 25.8364018355134;
        doubleArray1[4] = -0.4161468365471424;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-16.771017783173797));
        Assert.assertEquals((-9.469412864232799E8), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -722.4151482722469;
        doubleArray1[1] = -2862.087440890501;
        doubleArray1[2] = -406.830758683122;
        doubleArray1[3] = 25.8364018355134;
        doubleArray1[4] = 913.7703;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-16.771017783173797));
        Assert.assertEquals((-7.212325617900848E16), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -720.8072486868;
        doubleArray1[1] = -2829.1173970668106;
        doubleArray1[2] = -406.830758683122;
        doubleArray1[3] = 4.547473508864641E-13;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2829.1173970668106));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 35.31048101053569;
        doubleArray0[1] = 0.333;
        doubleArray0[2] = 6.0;
        doubleArray0[3] = -2862.087440890501;
        doubleArray0[4] = -382.0579608;
        doubleArray0[5] = 6.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -720.8072486868;
        doubleArray1[1] = -2862.087440890501;
        doubleArray1[2] = -382.0579608;
        doubleArray1[3] = 35.31048101053569;
        doubleArray1[4] = -0.4161468365471424;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-16.771017783173797));
        Assert.assertEquals((-2.0899933679854382E15), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[3] = 6.0;
        doubleArray0[4] = -406.830758683122;
        double[] doubleArray1 = new double[5];
        doubleArray1[1] = 0.333;
        doubleArray1[2] = -406.830758683122;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-16.771017783173797));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[2] = 6.0;
        doubleArray0[3] = -2862.087440890501;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = -720.8072486868;
        doubleArray1[1] = -2862.087440890501;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-16.771017783173797));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 25.8364018355134;
        doubleArray0[1] = 0.333;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 6.0;
        doubleArray1[1] = -2862.087440890501;
        doubleArray1[2] = -2862.087440890501;
        doubleArray1[3] = 25.8364018355134;
        doubleArray1[4] = -0.4161468365471424;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2862.087440890501));
        Assert.assertEquals((-3.8864557546570435E7), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 25.8364018355134;
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 6.0;
        doubleArray1[1] = -2862.087440890501;
        doubleArray1[2] = -2862.087440890501;
        doubleArray1[3] = 25.8364018355134;
        doubleArray1[4] = -0.4161468365471424;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2862.087440890501));
        Assert.assertEquals((-5.106948655044154E7), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        doubleArray1[0] = 25.8364018355134;
        doubleArray1[1] = -2862.087440890501;
        doubleArray1[2] = -2862.087440890501;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-16.771017783173797));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.5173467560092369);
        DecompositionSolver decompositionSolver0 = eigenDecompositionImpl0.getSolver();
        Assert.assertFalse(decompositionSolver0.isNonSingular());
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getSolver();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getV();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertEquals(4, array2DRowRealMatrix0.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Array2DRowRealMatrix array2DRowRealMatrix1 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-16.771017783173797));
        eigenDecompositionImpl0.getD();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
        Assert.assertNotNull(array2DRowRealMatrix0);
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-16.771017783173797));
        eigenDecompositionImpl0.getVT();
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        eigenDecompositionImpl0.getV();
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getV()));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
        Assert.assertNotNull(array2DRowRealMatrix0);
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        double[] doubleArray0 = new double[1];
        double[] doubleArray1 = new double[0];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-2658.52533));
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertNotNull(array2DRowRealMatrix0);
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), ((double) (0)));
        Assert.assertEquals(1.0, eigenDecompositionImpl1.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        Assert.assertNotSame(doubleArray1, doubleArray2);
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        double[] doubleArray0 = new double[6];
        double[] doubleArray1 = new double[5];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 4.0);
        eigenDecompositionImpl0.getImagEigenvalue(0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[] doubleArray1 = new double[3];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        double[] doubleArray2 = eigenDecompositionImpl0.getImagEigenvalues();
        Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 25.8364018355134;
        doubleArray0[1] = 0.333;
        doubleArray0[2] = 6.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[2] = -406.830758683122;
        doubleArray1[3] = 25.8364018355134;
        doubleArray1[4] = 913.7703;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-16.771017783173797));
        Assert.assertEquals(1.6298570357749697E14, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[0] = 2016.0;
        doubleArray0[1] = 0.333;
        doubleArray0[2] = 6.0;
        double[] doubleArray1 = new double[5];
        doubleArray1[2] = -2862.087440890501;
        doubleArray1[3] = 2016.0;
        doubleArray1[4] = -0.4161468365471424;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-16.771017783173797));
        eigenDecompositionImpl0.getVT();
        Assert.assertEquals(9.523437858703179E8, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

