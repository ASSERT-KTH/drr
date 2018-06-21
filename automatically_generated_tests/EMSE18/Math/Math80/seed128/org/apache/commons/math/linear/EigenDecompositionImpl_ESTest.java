

package org.apache.commons.math.linear;

import org.junit.Assert;
import org.junit.Test;

public class EigenDecompositionImpl_ESTest  {
    @Test(timeout = 4000)
    public void test01() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 661.5;
        doubleArray0[1] = 661.5;
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1132.960404274019));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = -73.3117388218676;
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = 28.23115434807677;
        doubleArray1[3] = -73.3117388218676;
        doubleArray1[6] = 680.230418803047;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1132.960404274019));
        double double0 = eigenDecompositionImpl0.getRealEigenvalue(4);
        Assert.assertEquals((-28.23115434807677), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 661.5;
        doubleArray0[1] = 661.5;
        doubleArray0[2] = 680.230418803047;
        doubleArray0[3] = 661.5;
        doubleArray0[7] = 661.5;
        double[] doubleArray1 = new double[7];
        doubleArray1[3] = 661.5;
        doubleArray1[5] = 7458749.8391592;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1132.960404274019));
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(4.793330499475581E30, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = 1.0;
        doubleArray0[1] = -2198.36916258092;
        double[] doubleArray1 = new double[1];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals((-2198.36916258092), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1132.960404274019));
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getD()));
        EigenDecompositionImpl eigenDecompositionImpl1 = new EigenDecompositionImpl(((RealMatrix) (array2DRowRealMatrix0)), 4.212097337585874E-10);
        Array2DRowRealMatrix array2DRowRealMatrix1 = ((Array2DRowRealMatrix) (eigenDecompositionImpl1.getV()));
        Assert.assertFalse(array2DRowRealMatrix1.equals(((Object) (array2DRowRealMatrix0))));
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 661.5;
        doubleArray0[1] = 661.5;
        doubleArray0[2] = 680.230418803047;
        doubleArray0[3] = 661.5;
        doubleArray0[4] = 680.230418803047;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 680.230418803047;
        doubleArray1[1] = 661.5;
        doubleArray1[2] = 680.230418803047;
        doubleArray1[3] = 661.5;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1132.960404274019));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[1] = 28.23115434807677;
        doubleArray0[5] = -73.3117388218676;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 680.230418803047;
        doubleArray1[1] = 28.23115434807677;
        doubleArray1[2] = 9.0;
        doubleArray1[3] = 9.0;
        doubleArray1[4] = 0.6719889895860163;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1132.960404274019));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[3] = 11442.757047036479;
        doubleArray0[4] = 11442.757047036479;
        double[] doubleArray1 = new double[7];
        doubleArray1[3] = 11442.757047036479;
        doubleArray1[4] = 1.2599210499;
        doubleArray1[5] = 7458749.8391592;
        doubleArray1[6] = 7458749.8391592;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-73.3117388218676));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[3] = 11442.757047036479;
        double[] doubleArray1 = new double[7];
        doubleArray1[3] = 11442.757047036479;
        doubleArray1[4] = 11442.757047036479;
        doubleArray1[5] = 7458749.8391592;
        doubleArray1[6] = 661.5;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 0.0);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[3] = 661.5;
        doubleArray0[4] = 661.5;
        double[] doubleArray1 = new double[7];
        doubleArray1[2] = 661.5;
        doubleArray1[3] = 661.5;
        doubleArray1[4] = 1.2599210499;
        doubleArray1[5] = 7458749.8391592;
        doubleArray1[6] = 661.5;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-73.3117388218676));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[4] = 11442.757047036479;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 11442.757047036479;
        doubleArray1[1] = -582.73115;
        doubleArray1[2] = 11442.757047036479;
        doubleArray1[3] = 11442.757047036479;
        doubleArray1[4] = 1.2599210499;
        doubleArray1[5] = 7458749.8391592;
        doubleArray1[6] = 661.5;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-73.3117388218676));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[4] = 11442.757047036479;
        double[] doubleArray1 = new double[7];
        doubleArray1[4] = 1.2599210499;
        doubleArray1[5] = 7458749.8391592;
        doubleArray1[6] = 7458749.8391592;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-73.3117388218676));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        doubleArray1[3] = 656.6473355848584;
        doubleArray1[2] = -73.3117388218676;
        doubleArray1[4] = 0.6719889895860163;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1132.960404274019));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 661.5;
        doubleArray0[5] = 661.5;
        doubleArray0[3] = 11442.757047036479;
        doubleArray0[4] = 11442.757047036479;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 661.5;
        doubleArray1[1] = -582.73115;
        doubleArray1[2] = 11442.757047036479;
        doubleArray1[3] = 11442.757047036479;
        doubleArray1[5] = 7458749.8391592;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-73.3117388218676));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[2] = 6.527610429777095E10;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 6.527610429777095E10;
        doubleArray1[1] = -11.26571687501372;
        doubleArray1[2] = 11472.432374491294;
        doubleArray1[3] = 11472.432374491294;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1132.960404274019));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[4] = 661.5;
        doubleArray0[5] = 1.2599210498948732;
        doubleArray0[6] = -73.3117388218676;
        doubleArray0[7] = -73.3117388218676;
        double[] doubleArray1 = new double[7];
        doubleArray1[6] = 7458749.8391592;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1132.960404274019));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 661.5;
        doubleArray1[1] = -582.73115;
        doubleArray1[2] = 11442.757047036479;
        doubleArray1[3] = 11442.757047036479;
        doubleArray1[4] = 1.2599210499;
        doubleArray1[5] = 7458749.8391592;
        doubleArray1[6] = 661.5;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-73.3117388218676));
        Assert.assertEquals(3.97986846559496E19, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[3] = 11442.757047036479;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 661.5;
        doubleArray1[1] = -582.73115;
        doubleArray1[2] = 11442.757047036479;
        doubleArray1[3] = 11442.757047036479;
        doubleArray1[4] = 1.2599210499;
        doubleArray1[5] = 7458749.8391592;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-73.3117388218676));
        Assert.assertEquals((-0.0), eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[1] = -11.26571687501372;
        doubleArray0[2] = 6.527610429777095E10;
        doubleArray0[3] = 11472.432374491294;
        double[] doubleArray1 = new double[7];
        doubleArray1[0] = 6.527610429777095E10;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1132.960404274019));
        Assert.assertEquals(Double.NaN, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1132.960404274019));
        ArrayRealVector arrayRealVector0 = ((ArrayRealVector) (eigenDecompositionImpl0.getEigenvector(4)));
        Assert.assertEquals(Double.NaN, arrayRealVector0.getLInfNorm(), 0.01);
        eigenDecompositionImpl0.getSolver();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        double[] doubleArray0 = new double[2];
        double[] doubleArray1 = new double[1];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, 1.0);
        double double0 = eigenDecompositionImpl0.getDeterminant();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1132.960404274019));
        eigenDecompositionImpl0.getEigenvector(4);
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertEquals(8, array2DRowRealMatrix0.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-73.3117388218676));
        Array2DRowRealMatrix array2DRowRealMatrix0 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Array2DRowRealMatrix array2DRowRealMatrix1 = ((Array2DRowRealMatrix) (eigenDecompositionImpl0.getVT()));
        Assert.assertSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1132.960404274019));
        eigenDecompositionImpl0.getD();
        eigenDecompositionImpl0.getD();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1132.960404274019));
        eigenDecompositionImpl0.getEigenvector(4);
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1132.960404274019));
        eigenDecompositionImpl0.getV();
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1132.960404274019));
        double[] doubleArray2 = eigenDecompositionImpl0.getRealEigenvalues();
        Assert.assertArrayEquals(new double[]{ 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 , 0.0 }, doubleArray2, 0.01);
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1132.960404274019));
        eigenDecompositionImpl0.getRealEigenvalue(4);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1132.960404274019));
        eigenDecompositionImpl0.getImagEigenvalue(4);
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        double[] doubleArray0 = new double[8];
        double[] doubleArray1 = new double[7];
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1132.960404274019));
        double[] doubleArray2 = eigenDecompositionImpl0.getImagEigenvalues();
        Assert.assertFalse(doubleArray2.equals(((Object) (doubleArray0))));
    }

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 661.5;
        doubleArray0[1] = 1.1102230246251565E-16;
        doubleArray0[3] = 11442.757047036479;
        doubleArray0[4] = 11442.757047036479;
        doubleArray0[6] = -73.3117388218676;
        doubleArray0[7] = 11442.757047036479;
        double[] doubleArray1 = new double[7];
        doubleArray1[2] = 680.230418803047;
        doubleArray1[1] = 1.1102230246251565E-16;
        doubleArray1[4] = 1.2599210499;
        doubleArray1[5] = 680.230418803047;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1132.960404274019));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 661.5;
        doubleArray0[1] = 661.5;
        doubleArray0[2] = 680.230418803047;
        doubleArray0[3] = 661.5;
        doubleArray0[7] = 661.5;
        double[] doubleArray1 = new double[7];
        doubleArray1[2] = 661.5;
        doubleArray1[3] = 661.5;
        doubleArray1[4] = 1.2599210498948732;
        doubleArray1[5] = 7458749.8391592;
        doubleArray0[5] = 680.230418803047;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1132.960404274019));
        eigenDecompositionImpl0.getV();
        Assert.assertEquals(7.150864595355554E35, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = 661.5;
        doubleArray0[1] = 1.1102230246251565E-16;
        doubleArray0[3] = 11442.757047036479;
        doubleArray0[4] = 11442.757047036479;
        doubleArray0[7] = 11442.757047036479;
        double[] doubleArray1 = new double[7];
        doubleArray1[1] = 1.1102230246251565E-16;
        doubleArray1[2] = 11442.757047036479;
        doubleArray1[4] = 1.2599210499;
        doubleArray1[5] = 661.5;
        doubleArray1[6] = 680.230418803047;
        EigenDecompositionImpl eigenDecompositionImpl0 = new EigenDecompositionImpl(doubleArray0, doubleArray1, (-1132.960404274019));
        Assert.assertEquals(0.0, eigenDecompositionImpl0.getDeterminant(), 0.01);
    }
}

