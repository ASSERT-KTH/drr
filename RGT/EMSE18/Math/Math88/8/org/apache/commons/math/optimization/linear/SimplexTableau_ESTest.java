

package org.apache.commons.math.optimization.linear;

import org.junit.Assert;
import org.apache.commons.math.optimization.GoalType;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.linear.RealVectorImplTest;
import org.apache.commons.math.linear.SparseRealVectorTest;
import org.junit.Test;

public class SimplexTableau_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        Relationship relationship0 = Relationship.GEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, (-1714.11858), relationship0, doubleArray0, 0.0);
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
        simplexTableau0.hashCode();
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-0.7152292775133905));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-0.7152292775133905));
        simplexTableau0.numArtificialVariables = -2145551745;
        simplexTableau0.hashCode();
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = -1714.11858;
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-0.7152292775133905));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        Relationship relationship0 = Relationship.EQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, (-0.7152292775133905));
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-1714.11858));
        RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        Assert.assertEquals((-0.7152292775133905), realPointValuePair0.getValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        double[] doubleArray0 = new double[7];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 19.085536923187668);
        simplexTableau0.numArtificialVariables = 1329;
        RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        Assert.assertEquals(0.0, realPointValuePair0.getValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        double[] doubleArray0 = new double[9];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1939.627172262039));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        simplexTableau0.setEntry(0, 1, 824.953228041213);
        Assert.assertEquals(9, simplexTableau0.getNumVariables());
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-31.394808369054054));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-31.394808369054054));
        boolean boolean0 = simplexTableau0.equals(linearObjectiveFunction0);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-31.394808369054054));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-31.394808369054054));
        int int0 = simplexTableau0.getWidth();
        Assert.assertEquals(4, int0);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        double[] doubleArray0 = new double[16];
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1.0);
        RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        Assert.assertEquals(1.0, realPointValuePair0.getValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        double[] doubleArray0 = new double[7];
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1271.3232);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1271.3232);
        int int0 = simplexTableau0.getSlackVariableOffset();
        Assert.assertEquals(8, int0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 2287.100186246559);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 2287.100186246559);
        int int0 = simplexTableau0.getOriginalNumDecisionVariables();
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-31.394808369054054));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-31.394808369054054));
        int int0 = simplexTableau0.getOriginalNumDecisionVariables();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        int int0 = simplexTableau0.getNumVariables();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        double[] doubleArray0 = new double[9];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1939.627172262039));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        Relationship relationship0 = Relationship.LEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, (-3222.93974502));
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        int int0 = simplexTableau0.getNumSlackVariables();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        double[] doubleArray0 = new double[7];
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1271.3232);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1271.3232);
        int int0 = simplexTableau0.getNumObjectiveFunctions();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        Relationship relationship0 = Relationship.GEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, (-1714.11858), relationship0, doubleArray0, 0.0);
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
        int int0 = simplexTableau0.getNumArtificialVariables();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-0.7152292775133905));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-0.7152292775133905));
        simplexTableau0.numArtificialVariables = -2145551745;
        int int0 = simplexTableau0.getNumArtificialVariables();
        Assert.assertEquals((-2145551745), int0);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        double[] doubleArray0 = new double[1];
        RealVectorImplTest.RealVectorTestImpl realVectorImplTest_RealVectorTestImpl0 = new RealVectorImplTest.RealVectorTestImpl(doubleArray0);
        double double0 = SimplexTableau.getInvertedCoeffiecientSum(realVectorImplTest_RealVectorTestImpl0);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        double[] doubleArray0 = new double[3];
        doubleArray0[1] = -718.9966525833357;
        SparseRealVectorTest.SparseRealVectorTestImpl sparseRealVectorTest_SparseRealVectorTestImpl0 = new SparseRealVectorTest.SparseRealVectorTestImpl(doubleArray0);
        double double0 = SimplexTableau.getInvertedCoeffiecientSum(sparseRealVectorTest_SparseRealVectorTestImpl0);
        Assert.assertEquals(718.9966525833357, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[2] = 729.2;
        RealVectorImplTest.RealVectorTestImpl realVectorImplTest_RealVectorTestImpl0 = new RealVectorImplTest.RealVectorTestImpl(doubleArray0);
        double double0 = SimplexTableau.getInvertedCoeffiecientSum(realVectorImplTest_RealVectorTestImpl0);
        Assert.assertEquals((-729.2), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-41.011323598815245));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.0);
        int int0 = simplexTableau0.getHeight();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double[] doubleArray0 = new double[9];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1939.627172262039));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-375.599));
        double double0 = simplexTableau0.getEntry(0, 2);
        Assert.assertEquals((-0.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        double[] doubleArray0 = new double[9];
        doubleArray0[1] = -3222.93974502;
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1939.627172262039));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        double double0 = simplexTableau0.getEntry(0, 2);
        Assert.assertEquals(3222.93974502, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        int int0 = simplexTableau0.getArtificialVariableOffset();
        Assert.assertEquals(2, int0);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-31.394808369054054));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-31.394808369054054));
        double[][] doubleArray1 = simplexTableau0.createTableau(false);
        Assert.assertNotNull(doubleArray1);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        double[] doubleArray0 = new double[7];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 4.9E-324);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, Double.NEGATIVE_INFINITY);
        simplexTableau0.tableau = null;
        try {
            simplexTableau0.divideRow((-3219), (-0.4));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        double[] doubleArray0 = new double[8];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-695.04847));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        double[] doubleArray1 = new double[20];
        Relationship relationship0 = Relationship.EQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray1, relationship0, (-1727.26566));
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = null;
        try {
            simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-890.83356098302));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        double[] doubleArray0 = new double[4];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-366.6295440559));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        Relationship relationship0 = Relationship.EQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, 1841.5213);
        linkedList0.add(linearConstraint0);
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1.0));
        List<LinearConstraint> list0 = simplexTableau0.getNormalizedConstraints();
        Assert.assertEquals(1, list0.size());
    }

    @Test(timeout = 4000)
    public void test40() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-3446.2134083));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 622.221);
        int int0 = simplexTableau0.getNumVariables();
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        double[] doubleArray0 = new double[7];
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1.0);
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1.0);
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        double[] doubleArray0 = new double[8];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-695.04847));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-118.9));
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 729.2);
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        double[] doubleArray0 = new double[8];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-695.04847));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-118.9));
        Relationship relationship0 = Relationship.EQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, (-1727.26566));
        boolean boolean0 = linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-890.83356098302));
        boolean boolean1 = simplexTableau0.equals(simplexTableau1);
        Assert.assertFalse((boolean1 == boolean0));
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        double[] doubleArray0 = new double[8];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-695.04847));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-118.9));
        Relationship relationship0 = Relationship.LEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, (-23.60973));
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-890.83356098302));
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        double[] doubleArray0 = new double[3];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-720.0));
        GoalType goalType0 = GoalType.MAXIMIZE;
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-720.0));
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-720.0));
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        double[] doubleArray0 = new double[7];
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1271.3232);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1271.3232);
        boolean boolean0 = simplexTableau0.equals(((Object) (null)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test47() throws Throwable {
        double[] doubleArray0 = new double[7];
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1.0);
        boolean boolean0 = simplexTableau0.equals(simplexTableau0);
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test48() throws Throwable {
        double[] doubleArray0 = new double[16];
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1.0);
        List<LinearConstraint> list0 = simplexTableau0.getNormalizedConstraints();
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, list0, goalType0, false, 1.0);
        Assert.assertTrue(simplexTableau1.equals(((Object) (simplexTableau0))));
        linkedList0.add(((LinearConstraint) (null)));
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test49() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
        simplexTableau0.divideRow(0, 304.78436671947475);
        Assert.assertEquals(1, simplexTableau0.getNumVariables());
    }

    @Test(timeout = 4000)
    public void test50() throws Throwable {
        double[] doubleArray0 = new double[16];
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1.0);
        simplexTableau0.discardArtificialVariables();
        Assert.assertEquals(16, simplexTableau0.getNumVariables());
    }

    @Test(timeout = 4000)
    public void test51() throws Throwable {
        double[] doubleArray0 = new double[9];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1939.627172262039));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        Relationship relationship0 = Relationship.EQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, 1465.5594920730337, relationship0, doubleArray0, (-2726.2701633));
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-375.599));
        simplexTableau0.discardArtificialVariables();
        Assert.assertEquals(9, simplexTableau0.getNumVariables());
    }

    @Test(timeout = 4000)
    public void test52() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[3] = -1.0;
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-695.04847));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        Relationship relationship0 = Relationship.EQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, (-1727.26566));
        linkedList0.add(linearConstraint0);
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-890.83356098302));
        RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        Assert.assertEquals((-695.04847), realPointValuePair0.getValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test53() throws Throwable {
        double[] doubleArray0 = new double[8];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-695.04847));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        Relationship relationship0 = Relationship.LEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, 0.0, relationship0, doubleArray0, 3134.654591);
        linkedList0.add(linearConstraint0);
        Relationship relationship1 = Relationship.EQ;
        LinearConstraint linearConstraint1 = new LinearConstraint(doubleArray0, relationship1, (-1727.26566));
        linkedList0.add(linearConstraint1);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-890.83356098302));
        Assert.assertEquals(8, simplexTableau0.getNumVariables());
    }

    @Test(timeout = 4000)
    public void test54() throws Throwable {
        double[] doubleArray0 = new double[8];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-695.04847));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        Relationship relationship0 = Relationship.LEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, 0.0, relationship0, doubleArray0, 3134.654591);
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-118.9));
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-890.83356098302));
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        double[] doubleArray0 = new double[9];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1939.627172262039));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-375.599));
        simplexTableau0.hashCode();
    }

    @Test(timeout = 4000)
    public void test56() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-0.7152292775133905));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-0.7152292775133905));
        int int0 = simplexTableau0.getNumArtificialVariables();
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test57() throws Throwable {
        double[] doubleArray0 = new double[9];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1939.627172262039));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        int int0 = simplexTableau0.getNumSlackVariables();
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test58() throws Throwable {
        double[] doubleArray0 = new double[7];
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1271.3232);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1271.3232);
        int int0 = simplexTableau0.getNumDecisionVariables();
        Assert.assertEquals(7, int0);
    }

    @Test(timeout = 4000)
    public void test59() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-31.394808369054054));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-31.394808369054054));
        int int0 = simplexTableau0.getRhsOffset();
        Assert.assertEquals(3, int0);
    }

    @Test(timeout = 4000)
    public void test60() throws Throwable {
        double[] doubleArray0 = new double[7];
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1271.3232);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1271.3232);
        double double0 = simplexTableau0.getEntry(0, 0);
        Assert.assertEquals((-1.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test62() throws Throwable {
        double[] doubleArray0 = new double[7];
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1271.3232);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1271.3232);
        double[][] doubleArray1 = simplexTableau0.getData();
        Assert.assertNotNull(doubleArray1);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = -3042.8683;
        doubleArray0[2] = 729.2;
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-695.04847));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        Relationship relationship0 = Relationship.LEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, (-23.60973));
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-890.83356098302));
        RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        Assert.assertEquals(-3737.91677, realPointValuePair0.getValue(), 0.01);
    }
}

