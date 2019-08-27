

package org.apache.commons.math.optimization.linear;

import org.junit.Assert;
import org.apache.commons.math.optimization.GoalType;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealMatrixImpl;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.linear.RealVector;
import org.apache.commons.math.linear.RealVectorImplTest;
import org.junit.Test;

public class SimplexTableau_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double[] doubleArray0 = new double[5];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1.0));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
        simplexTableau0.numArtificialVariables = 67;
        simplexTableau0.hashCode();
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        double[] doubleArray0 = new double[5];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-554.27669670602));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1783.82766));
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1438.5));
        boolean boolean0 = simplexTableau1.equals(simplexTableau0);
        Assert.assertFalse(simplexTableau0.equals(((Object) (simplexTableau1))));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        double[] doubleArray0 = new double[5];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-554.27669670602));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 929.6);
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1438.5));
        simplexTableau0.numArtificialVariables = -1022;
        boolean boolean0 = simplexTableau1.equals(simplexTableau0);
        Assert.assertFalse(simplexTableau1.equals(((Object) (simplexTableau0))));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        double[] doubleArray0 = new double[7];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        Relationship relationship0 = Relationship.EQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, 1.0);
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-2183.56225));
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1.0));
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        Assert.assertFalse(simplexTableau1.equals(((Object) (simplexTableau0))));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        double[] doubleArray0 = new double[7];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        Relationship relationship0 = Relationship.EQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, 1.0);
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-2183.56225));
        int int0 = simplexTableau0.getNumSlackVariables();
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        double[] doubleArray0 = new double[2];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1734.7));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        Relationship relationship0 = Relationship.EQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, 0.0, relationship0, doubleArray0, (-1734.7));
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-1734.7));
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1734.7));
        RealMatrixImpl realMatrixImpl0 = ((RealMatrixImpl) (simplexTableau1.tableau));
        simplexTableau0.tableau = ((RealMatrix) (realMatrixImpl0));
        RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        Assert.assertEquals((-1734.7), realPointValuePair0.getValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        double[] doubleArray0 = new double[5];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-554.27669670602));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 929.6);
        simplexTableau0.numArtificialVariables = 64;
        RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        Assert.assertEquals((-554.27669670602), realPointValuePair0.getValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        double[] doubleArray0 = new double[7];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        Relationship relationship0 = Relationship.LEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, 0.0);
        linkedList0.offer(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 2086.79501034817);
        Assert.assertEquals(7, simplexTableau0.getNumVariables());
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        double[] doubleArray0 = new double[9];
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-3.0));
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1734.7));
        simplexTableau0.subtractRow(0, 0, (-3.0));
        Assert.assertEquals(9, simplexTableau0.getNumVariables());
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.1102230246251565E-16);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        Object object0 = new Object();
        boolean boolean0 = simplexTableau0.equals(object0);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        double[] doubleArray0 = new double[2];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1734.7));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-1734.7));
        int int0 = simplexTableau0.getWidth();
        Assert.assertEquals(5, int0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 980.035880101);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
        RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        Assert.assertEquals(980.035880101, realPointValuePair0.getValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        double[] doubleArray0 = new double[6];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-3578.1));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 2814.7558743);
        int int0 = simplexTableau0.getSlackVariableOffset();
        Assert.assertEquals(7, int0);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1883.4726628736);
        int int0 = simplexTableau0.getRhsOffset();
        Assert.assertEquals(2, int0);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
        int int0 = simplexTableau0.getOriginalNumDecisionVariables();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.1102230246251565E-16);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        int int0 = simplexTableau0.getNumVariables();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        double[] doubleArray0 = new double[7];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        Relationship relationship0 = Relationship.GEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, (-924.16496319), relationship0, doubleArray0, 255.43363325);
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-2183.56225));
        int int0 = simplexTableau0.getNumSlackVariables();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        double[] doubleArray0 = new double[4];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1948.85));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 2814.7558743);
        int int0 = simplexTableau0.getNumObjectiveFunctions();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1883.4726628736);
        int int0 = simplexTableau0.getNumDecisionVariables();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        double[] doubleArray0 = new double[2];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1734.7));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        Relationship relationship0 = Relationship.EQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, 0.0, relationship0, doubleArray0, (-1734.7));
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-1734.7));
        int int0 = simplexTableau0.getNumArtificialVariables();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        double[] doubleArray0 = new double[2];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1734.7));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-1734.7));
        simplexTableau0.numArtificialVariables = -4047;
        int int0 = simplexTableau0.getNumArtificialVariables();
        Assert.assertEquals((-4047), int0);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        double[] doubleArray0 = new double[2];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1734.7));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1734.7));
        List<LinearConstraint> list0 = simplexTableau0.getNormalizedConstraints();
        Assert.assertEquals(0, list0.size());
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[1] = -1783.82766;
        RealVectorImplTest.RealVectorTestImpl realVectorImplTest_RealVectorTestImpl0 = new RealVectorImplTest.RealVectorTestImpl(doubleArray0);
        double double0 = SimplexTableau.getInvertedCoeffiecientSum(realVectorImplTest_RealVectorTestImpl0);
        Assert.assertEquals(1783.82766, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = 1.0;
        RealVectorImplTest.RealVectorTestImpl realVectorImplTest_RealVectorTestImpl0 = new RealVectorImplTest.RealVectorTestImpl(doubleArray0);
        double double0 = SimplexTableau.getInvertedCoeffiecientSum(realVectorImplTest_RealVectorTestImpl0);
        Assert.assertEquals((-1.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.1102230246251565E-16);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1470.0297954));
        int int0 = simplexTableau0.getHeight();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.1102230246251565E-16);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        double double0 = simplexTableau0.getEntry(0, 1);
        Assert.assertEquals((-0.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        double[] doubleArray0 = new double[4];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1.0));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1.0));
        double double0 = simplexTableau0.getEntry(0, 0);
        Assert.assertEquals(1.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1198.114086);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.23);
        int int0 = simplexTableau0.getArtificialVariableOffset();
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.1102230246251565E-16);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        double[][] doubleArray1 = simplexTableau0.createTableau(false);
        Assert.assertNotNull(doubleArray1);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        double[] doubleArray0 = new double[5];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-554.27669670602));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 929.6);
        simplexTableau0.tableau = null;
        try {
            simplexTableau0.getSolution();
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        try {
            SimplexTableau.getInvertedCoeffiecientSum(((RealVector) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.4872404978608305);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-2341.9948966));
        simplexTableau0.tableau = null;
        try {
            simplexTableau0.getHeight();
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1198.114086);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1198.114086);
        simplexTableau0.tableau = null;
        try {
            simplexTableau0.divideRow((-921), (-425.052355157713));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test42() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1883.4726628736);
        int int0 = simplexTableau0.getNumVariables();
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        double[] doubleArray0 = new double[5];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-554.27669670602));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 929.6);
        GoalType goalType1 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType1, true, 929.6);
        boolean boolean0 = simplexTableau1.equals(simplexTableau0);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        double[] doubleArray0 = new double[5];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-554.3));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        boolean boolean0 = simplexTableau1.equals(simplexTableau0);
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        double[] doubleArray0 = new double[7];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        Relationship relationship0 = Relationship.EQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, 1.0);
        boolean boolean0 = linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-2183.56225));
        simplexTableau0.discardArtificialVariables();
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1.0));
        boolean boolean1 = simplexTableau0.equals(simplexTableau1);
        Assert.assertFalse((boolean1 == boolean0));
    }

    @Test(timeout = 4000)
    public void test46() throws Throwable {
        double[] doubleArray0 = new double[5];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-554.27669670602));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 929.6);
        Relationship relationship0 = Relationship.LEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, 1.0986122886681096, relationship0, doubleArray0, (-407.27669670601995));
        linkedList0.offerLast(linearConstraint0);
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 929.6);
        boolean boolean0 = simplexTableau1.equals(simplexTableau0);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test47() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 0.0);
        boolean boolean0 = simplexTableau0.equals(((Object) (null)));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test48() throws Throwable {
        double[] doubleArray0 = new double[5];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-554.27669670602));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 929.6);
        boolean boolean0 = simplexTableau0.equals(simplexTableau0);
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test49() throws Throwable {
        double[] doubleArray0 = new double[7];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        Relationship relationship0 = Relationship.GEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, (-924.16496319), relationship0, doubleArray0, 255.43363325);
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-2183.56225));
        simplexTableau0.divideRow(2, (-3341.44));
        Assert.assertEquals(7, simplexTableau0.getNumVariables());
    }

    @Test(timeout = 4000)
    public void test51() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1883.4726628736);
        simplexTableau0.discardArtificialVariables();
        Assert.assertEquals(0, simplexTableau0.getNumVariables());
    }

    @Test(timeout = 4000)
    public void test52() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[3] = -924.16496319;
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        Relationship relationship0 = Relationship.GEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, 1988.516885957279);
        linkedList0.addLast(linearConstraint0);
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-2183.56225));
        RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        Assert.assertEquals(0.0, realPointValuePair0.getValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test54() throws Throwable {
        double[] doubleArray0 = new double[5];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-425.052355157713));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        Relationship relationship0 = Relationship.LEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, 402.307891);
        linkedList0.addFirst(linearConstraint0);
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-425.052355157713));
        simplexTableau0.hashCode();
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        double[] doubleArray0 = new double[2];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1734.7));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        Relationship relationship0 = Relationship.EQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, 0.0, relationship0, doubleArray0, (-1734.7));
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-1734.7));
        List<LinearConstraint> list0 = simplexTableau0.getNormalizedConstraints();
        Assert.assertEquals(1, list0.size());
    }

    @Test(timeout = 4000)
    public void test56() throws Throwable {
        double[] doubleArray0 = new double[2];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-1734.7));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, (-1734.7));
        int int0 = simplexTableau0.getNumArtificialVariables();
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test57() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1198.114086);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.23);
        int int0 = simplexTableau0.getNumDecisionVariables();
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test59() throws Throwable {
        double[] doubleArray0 = new double[3];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 32.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 2189.807102);
        simplexTableau0.setEntry(0, 0, (-3723.20491587));
        Assert.assertEquals(3, simplexTableau0.getNumVariables());
    }

    @Test(timeout = 4000)
    public void test60() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1.1102230246251565E-16);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1470.0297954));
        double[][] doubleArray1 = simplexTableau0.getData();
        Assert.assertNotNull(doubleArray1);
    }

    @Test(timeout = 4000)
    public void test50() throws Throwable {
        double[] doubleArray0 = new double[7];
        doubleArray0[1] = -1.0;
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        Relationship relationship0 = Relationship.EQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, 1.0);
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-2183.56225));
        RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        Assert.assertEquals(0.0, realPointValuePair0.getValue(), 0.01);
    }
}

