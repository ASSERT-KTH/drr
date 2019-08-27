

package org.apache.commons.math.optimization.linear;

import org.junit.Assert;
import org.apache.commons.math.optimization.GoalType;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.linear.RealVector;
import org.apache.commons.math.linear.RealVectorImpl;
import org.apache.commons.math.linear.RealVectorImplTest;
import org.apache.commons.math.linear.SparseRealVectorTest;
import org.junit.Test;

public class SimplexTableau_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double[] doubleArray0 = new double[8];
        RealVectorImplTest.RealVectorTestImpl realVectorImplTest_RealVectorTestImpl0 = new RealVectorImplTest.RealVectorTestImpl(doubleArray0);
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(((RealVector) (realVectorImplTest_RealVectorTestImpl0)), 1.570796326794897);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        Relationship relationship0 = Relationship.LEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, 0.0);
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        simplexTableau0.hashCode();
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        double[] doubleArray0 = new double[8];
        RealVectorImplTest.RealVectorTestImpl realVectorImplTest_RealVectorTestImpl0 = new RealVectorImplTest.RealVectorTestImpl(doubleArray0);
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(((RealVector) (realVectorImplTest_RealVectorTestImpl0)), 1.570796326794897);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        Relationship relationship0 = Relationship.EQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, 3510.171, relationship0, doubleArray0, (-316.39842361403));
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        simplexTableau0.hashCode();
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        double[] doubleArray0 = new double[6];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        Relationship relationship0 = Relationship.EQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, 0.0, relationship0, doubleArray0, 0.0);
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        Assert.assertTrue(simplexTableau1.equals(((Object) (simplexTableau0))));
        simplexTableau1.discardArtificialVariables();
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        Assert.assertFalse(simplexTableau1.equals(((Object) (simplexTableau0))));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        double[] doubleArray0 = new double[1];
        Relationship relationship0 = Relationship.LEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, ((double) (-1417)), relationship0, doubleArray0, (-1177.4738));
        linkedList0.add(linearConstraint0);
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.09861228866811);
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1749.2990785));
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        Assert.assertFalse(simplexTableau1.equals(((Object) (simplexTableau0))));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 384.54702449326);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1231.996750601347);
        simplexTableau0.divideRow(0, (-211.30134242212944));
        Assert.assertEquals(1, simplexTableau0.getNumVariables());
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = 3.0;
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        Relationship relationship0 = Relationship.LEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, 0.4);
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
        RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        Assert.assertEquals(0.0, realPointValuePair0.getValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        double[] doubleArray0 = new double[9];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
        simplexTableau0.numArtificialVariables = 3;
        RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        Assert.assertEquals(0.0, realPointValuePair0.getValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        double[] doubleArray0 = new double[6];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1118.66730835);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        Relationship relationship0 = Relationship.EQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, 0.0, relationship0, doubleArray0, 0.0);
        linkedList0.add(linearConstraint0);
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
        Assert.assertEquals(6, simplexTableau0.getNumVariables());
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        double[] doubleArray0 = new double[7];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        simplexTableau0.numArtificialVariables = -1;
        RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        Assert.assertEquals(0.0, realPointValuePair0.getValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        double[] doubleArray0 = new double[9];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-3058.698869097));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
        simplexTableau0.subtractRow(0, 0, 1614.36);
        Assert.assertEquals(9, simplexTableau0.getNumVariables());
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 382.36198462999846);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-1.0));
        simplexTableau0.setEntry(0, 3, (-1.0));
        Assert.assertEquals(1, simplexTableau0.getNumVariables());
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        int int0 = simplexTableau0.getWidth();
        Assert.assertEquals(2, int0);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        double[] doubleArray0 = new double[8];
        RealVectorImplTest.RealVectorTestImpl realVectorImplTest_RealVectorTestImpl0 = new RealVectorImplTest.RealVectorTestImpl(doubleArray0);
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(((RealVector) (realVectorImplTest_RealVectorTestImpl0)), 1.570796326794897);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        int int0 = simplexTableau0.getSlackVariableOffset();
        Assert.assertEquals(9, int0);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        int int0 = simplexTableau0.getRhsOffset();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-2785));
        int int0 = simplexTableau0.getOriginalNumDecisionVariables();
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        double[] doubleArray0 = new double[2];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-1667.74306));
        int int0 = simplexTableau0.getNumVariables();
        Assert.assertEquals(2, int0);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        double[] doubleArray0 = new double[9];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-3058.698869097));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        Relationship relationship0 = Relationship.LEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, 1.0);
        linkedList0.add(linearConstraint0);
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
        int int0 = simplexTableau0.getNumSlackVariables();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1.2599210498948732));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        int int0 = simplexTableau0.getNumObjectiveFunctions();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        double[] doubleArray0 = new double[9];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.4);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        Relationship relationship0 = Relationship.EQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, 1262.736501506, relationship0, doubleArray0, 900.2870146367385);
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-0.9899924966004454));
        int int0 = simplexTableau0.getNumArtificialVariables();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 493.8396080208479);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 8.0);
        List<LinearConstraint> list0 = simplexTableau0.getNormalizedConstraints();
        Assert.assertEquals(0, list0.size());
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double[] doubleArray0 = new double[0];
        SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        double double0 = SimplexTableau.getInvertedCoeffiecientSum(sparseRealVectorTest_SparseRealVectorTestImpl0);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = -401.94;
        RealVectorImplTest.RealVectorTestImpl realVectorImplTest_RealVectorTestImpl0 = new RealVectorImplTest.RealVectorTestImpl(doubleArray0);
        RealVectorImpl realVectorImpl0 = ((RealVectorImpl) (realVectorImplTest_RealVectorTestImpl0.mapMultiply((-665.7484))));
        double double0 = SimplexTableau.getInvertedCoeffiecientSum(realVectorImpl0);
        Assert.assertEquals((-267590.911896), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-2785));
        int int0 = simplexTableau0.getHeight();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        double[] doubleArray0 = new double[4];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 612.8780026);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 977.0);
        double double0 = simplexTableau0.getEntry(0, 0);
        Assert.assertEquals((-1.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        double[] doubleArray0 = new double[5];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1.0));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 128.6445);
        double[][] doubleArray1 = simplexTableau0.createTableau(true);
        Assert.assertNotNull(doubleArray1);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        double[] doubleArray0 = new double[25];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        Relationship relationship0 = Relationship.EQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, 0.0, relationship0, doubleArray0, 0.0);
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        List<LinearConstraint> list0 = simplexTableau0.getNormalizedConstraints();
        Assert.assertEquals(1, list0.size());
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 4045.6595);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 570.456586);
        int int0 = simplexTableau0.getNumVariables();
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        GoalType goalType1 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType1, true, 0.0);
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        double[] doubleArray0 = new double[2];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 2325.325);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-553.6348647696319));
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-128.81802));
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        Assert.assertFalse(simplexTableau1.equals(((Object) (simplexTableau0))));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        double[] doubleArray0 = new double[7];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        simplexTableau0.numArtificialVariables = -1;
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1749.2990785));
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        double[] doubleArray0 = new double[6];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1118.66730835);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        Relationship relationship0 = Relationship.LEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, 0.0, relationship0, doubleArray0, 0.0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        double[] doubleArray0 = new double[6];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        double[] doubleArray0 = new double[6];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-384.54702449326));
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        double[] doubleArray0 = new double[9];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
        boolean boolean0 = simplexTableau0.equals(((Object) (null)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        double[] doubleArray0 = new double[6];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        boolean boolean0 = simplexTableau0.equals(simplexTableau0);
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        double[] doubleArray0 = new double[6];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        boolean boolean0 = simplexTableau0.equals(linearObjectiveFunction0);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-700.9328));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-700.9328));
        RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        Assert.assertEquals((-700.9328), realPointValuePair0.getValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test49() throws Throwable {
        double[] doubleArray0 = new double[6];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        simplexTableau0.discardArtificialVariables();
        Assert.assertEquals(6, simplexTableau0.getNumVariables());
    }

    @Test(timeout = 4000)
    public void test51() throws Throwable {
        double[] doubleArray0 = new double[6];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1118.66730835);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
        int int0 = simplexTableau0.getOriginalNumDecisionVariables();
        Assert.assertEquals(6, int0);
    }

    @Test(timeout = 4000)
    public void test52() throws Throwable {
        double[] doubleArray0 = new double[5];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 2685.893788685039);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 2685.893788685039);
        simplexTableau0.hashCode();
    }

    @Test(timeout = 4000)
    public void test53() throws Throwable {
        double[] doubleArray0 = new double[6];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        int int0 = simplexTableau0.getNumArtificialVariables();
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test54() throws Throwable {
        double[] doubleArray0 = new double[5];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 2685.893788685039);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        int int0 = simplexTableau0.getNumSlackVariables();
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        int int0 = simplexTableau0.getNumDecisionVariables();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test56() throws Throwable {
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        int int0 = simplexTableau0.getArtificialVariableOffset();
        Assert.assertEquals(2, int0);
    }

    @Test(timeout = 4000)
    public void test58() throws Throwable {
        double[] doubleArray0 = new double[6];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        double[][] doubleArray1 = simplexTableau0.getData();
        Assert.assertNotNull(doubleArray1);
    }

    @Test(timeout = 4000)
    public void test47() throws Throwable {
        double[] doubleArray0 = new double[6];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        Relationship relationship0 = Relationship.LEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, 0.0, relationship0, doubleArray0, 0.0);
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        simplexTableau0.divideRow(1, 0.0);
        RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        Assert.assertEquals(0.0, realPointValuePair0.getValue(), 0.01);
    }
}

