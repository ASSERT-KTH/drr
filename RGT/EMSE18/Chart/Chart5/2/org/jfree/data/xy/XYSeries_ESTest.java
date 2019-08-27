

package org.jfree.data.xy;

import org.jfree.data.time.Minute;
import org.junit.Assert;
import org.jfree.data.time.Day;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Week;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Year;
import java.util.List;
import java.util.Vector;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Quarter;
import org.jfree.data.statistics.SimpleHistogramBin;
import java.awt.Window;
import org.jfree.data.time.SimpleTimePeriod;
import org.junit.Test;

public class XYSeries_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Week week0 = new Week(439, 439);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)));
        xYSeries0.add(0.0, 3152.925);
        xYSeries0.add(((double) (439)), ((double) (1)), true);
        xYSeries0.addOrUpdate(((Number) (53)), ((Number) (53)));
        xYSeries0.add(((double) (53)), ((Number) (53)), false);
        xYSeries0.hashCode();
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        Week week0 = new Week(439, 29);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)));
        XYSeries xYSeries1 = new XYSeries(((Comparable) (week0)), false, false);
        xYSeries1.setMaximumItemCount(53);
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        Assert.assertEquals(53, xYSeries1.getMaximumItemCount());
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        Year year0 = new Year();
        Week week0 = new Week((-4303), year0);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)));
        xYSeries0.setMaximumItemCount(1);
        xYSeries0.addOrUpdate(((Number) (9999)), ((Number) (1)));
        Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-2.147483648E9), 0.0, false, false);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (simpleHistogramBin0)), true, false);
        xYSeries0.add((-2.147483648E9), 0.0);
        xYSeries0.add(0.0, ((Number) (1)), true);
        xYSeries0.addOrUpdate(0.0, 1403.08661458);
        Assert.assertEquals(2, xYSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        Week week0 = new Week();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)), true);
        xYSeries0.add(0.0, (-0.11348412701261335));
        xYSeries0.add(1.0, ((Number) (53)));
        Assert.assertTrue(xYSeries0.getAutoSort());
        xYSeries0.update(1, 53);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        Week week0 = new Week();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)));
        xYSeries0.add(0.0, ((double) (1960)));
        xYSeries0.addOrUpdate(((Number) (53)), ((Number) (53)));
        xYSeries0.add(((double) (53)), ((Number) (53)), false);
        Assert.assertTrue(xYSeries0.getAutoSort());
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        Week week0 = new Week();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)), true);
        XYDataItem xYDataItem0 = new XYDataItem(0.0, ((double) (53)));
        xYSeries0.add(xYDataItem0);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertTrue(xYSeries0.getAutoSort());
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        XYSeries xYSeries0 = new XYSeries(((Comparable) (1196573017)), true);
        xYSeries0.add(((Number) (24)), ((Number) ((byte) (3))));
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertTrue(xYSeries0.getAutoSort());
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        Week week0 = new Week();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)), true);
        xYSeries0.add(0.0, (-0.11348412701261335));
        xYSeries0.updateByIndex(0, 53);
        Assert.assertTrue(xYSeries0.getAutoSort());
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Week week0 = new Week(439, 29);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)));
        xYSeries0.addOrUpdate(((Number) (53)), ((Number) (53)));
        xYSeries0.remove(((Number) (53)));
        Assert.assertTrue(xYSeries0.getAutoSort());
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem(1687.9, 1687.9);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)));
        xYSeries0.addOrUpdate(((Number) (0)), ((Number) (0)));
        xYSeries0.remove(0);
        Assert.assertTrue(xYSeries0.getAutoSort());
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        Hour hour0 = new Hour();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (hour0)), false);
        xYSeries0.add(((Number) (23)), ((Number) (0)), false);
        XYDataItem xYDataItem0 = xYSeries0.remove(0);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertFalse(xYSeries0.getAutoSort());
        Assert.assertEquals(0.0, xYDataItem0.getYValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        XYSeries xYSeries0 = new XYSeries(((Comparable) ("{HX2p-LrONa=Zk%r")), true, false);
        xYSeries0.addOrUpdate(((double) ((byte) (8))), ((double) ((byte) (8))));
        int int0 = xYSeries0.indexOf(((byte) (8)));
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        Week week0 = new Week();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)), true);
        xYSeries0.add(0.0, (-0.11348412701261335));
        xYSeries0.add(((double) (53)), ((Number) (1)));
        int int0 = xYSeries0.indexOf(53);
        Assert.assertEquals(1, int0);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        Week week0 = new Week(439, 439);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)));
        xYSeries0.add(0.0, 3152.925);
        xYSeries0.add(((double) (439)), ((double) (1)), true);
        Double double0 = ((Double) (xYSeries0.getY(1)));
        Assert.assertEquals(1.0, ((double) (double0)), 0.01);
        Assert.assertTrue(xYSeries0.getAutoSort());
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        Week week0 = new Week(439, 439);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)));
        xYSeries0.add(0.0, 3152.925);
        Double double0 = ((Double) (xYSeries0.getX(0)));
        Assert.assertTrue(xYSeries0.getAutoSort());
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertEquals(0.0, ((double) (double0)), 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        Week week0 = new Week(439, 439);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)));
        xYSeries0.add(0.0, 3152.925);
        xYSeries0.addOrUpdate(((Number) (53)), ((Number) (53)));
        Integer integer0 = ((Integer) (xYSeries0.getX(1)));
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertTrue(xYSeries0.getAutoSort());
        Assert.assertEquals(53, ((int) (integer0)));
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        Week week0 = new Week();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)), false);
        xYSeries0.setMaximumItemCount(0);
        int int0 = xYSeries0.getMaximumItemCount();
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        XYSeries xYSeries0 = new XYSeries(((Comparable) ("BW.!ykPbPzF?C*")), false, false);
        xYSeries0.add(797.26472456, ((double) (1000L)), true);
        xYSeries0.getItemCount();
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertFalse(xYSeries0.getAutoSort());
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        Week week0 = new Week();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)), true);
        xYSeries0.add(0.0, ((double) (0)));
        xYSeries0.getDataItem(0);
        Assert.assertTrue(xYSeries0.getAutoSort());
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        Week week0 = new Week();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)), true);
        xYSeries0.add(((double) (1)), (-0.11348412701261335));
        XYDataItem xYDataItem0 = xYSeries0.getDataItem(0);
        Assert.assertEquals(1.0, xYDataItem0.getXValue(), 0.01);
        Assert.assertTrue(xYSeries0.getAutoSort());
        Assert.assertEquals((-0.11348412701261335), xYDataItem0.getYValue(), 0.01);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        SimpleTimePeriod simpleTimePeriod0 = new SimpleTimePeriod(1726L, 9223372036854775807L);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (simpleTimePeriod0)));
        boolean boolean0 = xYSeries0.getAutoSort();
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        Week week0 = new Week();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)), true);
        xYSeries0.getAllowDuplicateXValues();
        Assert.assertTrue(xYSeries0.getAutoSort());
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        Week week0 = new Week();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)), true);
        xYSeries0.setNotify(false);
        XYSeries xYSeries1 = xYSeries0.createCopy(0, 53);
        Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
        Assert.assertTrue(xYSeries1.getAutoSort());
        Assert.assertNotSame(xYSeries1, xYSeries0);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        Week week0 = new Week();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)), false);
        xYSeries0.setMaximumItemCount(0);
        xYSeries0.createCopy(53, (-1));
        Assert.assertEquals(0, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        Quarter quarter0 = new Quarter();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (quarter0)), true, false);
        XYSeries xYSeries1 = xYSeries0.createCopy(4, 4);
        Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
        Assert.assertNotSame(xYSeries1, xYSeries0);
        Assert.assertTrue(xYSeries1.getAutoSort());
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        SimpleHistogramBin simpleHistogramBin0 = new SimpleHistogramBin((-2.147483648E9), 0.0, false, false);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (simpleHistogramBin0)), true, false);
        xYSeries0.add(0.0, ((Number) (1)), true);
        xYSeries0.addOrUpdate(0.0, 1403.08661458);
        Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test38() throws Throwable {
        Week week0 = new Week();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)), true);
        try {
            xYSeries0.delete((-651), 53);
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test39() throws Throwable {
        Week week0 = new Week();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)), true);
        xYSeries0.add(0.0, (-0.11348412701261335));
        try {
            xYSeries0.createCopy((-668), 1057);
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test50() throws Throwable {
        XYSeries xYSeries0 = new XYSeries(((Comparable) ("BW.!ykPbPzF?C*")), false, false);
        xYSeries0.add(797.26472456, ((double) (1000L)), true);
        xYSeries0.add((-4358.9034887), ((double) (1)));
        XYDataItem xYDataItem0 = xYSeries0.remove(1);
        xYSeries0.add(xYDataItem0, false);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertEquals(1.0, xYDataItem0.getYValue(), 0.01);
        Assert.assertEquals((-4358.9034887), xYDataItem0.getXValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test51() throws Throwable {
        Week week0 = new Week();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)), true);
        xYSeries0.add(0.0, (-0.11348412701261335));
        xYSeries0.add(1.0, ((Number) (53)));
        XYDataItem xYDataItem0 = xYSeries0.getDataItem(0);
        xYSeries0.add(xYDataItem0, true);
        Assert.assertEquals((-0.11348412701261335), xYDataItem0.getYValue(), 0.01);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertTrue(xYSeries0.getAutoSort());
        Assert.assertEquals(0.0, xYDataItem0.getXValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test52() throws Throwable {
        Week week0 = new Week();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)), true);
        xYSeries0.add(0.0, ((Number) (1)));
        XYDataItem xYDataItem0 = xYSeries0.getDataItem(0);
        xYSeries0.add(xYDataItem0, true);
        Assert.assertEquals(1.0, xYDataItem0.getYValue(), 0.01);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertEquals(0.0, xYDataItem0.getXValue(), 0.01);
        Assert.assertTrue(xYSeries0.getAutoSort());
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        Millisecond millisecond0 = new Millisecond();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (millisecond0)));
        try {
            xYSeries0.getX((-1));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test57() throws Throwable {
        Hour hour0 = new Hour();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (hour0)), false);
        try {
            xYSeries0.remove((-1075));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test58() throws Throwable {
        XYSeries xYSeries0 = new XYSeries(((Comparable) ("")), false);
        xYSeries0.getItemCount();
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertFalse(xYSeries0.getAutoSort());
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @Test(timeout = 4000)
    public void test59() throws Throwable {
        Week week0 = new Week(439, 29);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)), false, false);
        xYSeries0.hashCode();
        Assert.assertFalse(xYSeries0.getAutoSort());
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test60() throws Throwable {
        Week week0 = new Week(439, 439);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)));
        xYSeries0.add(0.0, 0.0);
        xYSeries0.addOrUpdate(((Number) (53)), ((Number) (53)));
        xYSeries0.hashCode();
        Assert.assertTrue(xYSeries0.getAutoSort());
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test61() throws Throwable {
        Week week0 = new Week(439, 439);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)));
        XYSeries xYSeries1 = new XYSeries(((Comparable) (week0)), true, false);
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        Assert.assertTrue(xYSeries1.getAutoSort());
        Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test62() throws Throwable {
        Week week0 = new Week();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)), true);
        XYSeries xYSeries1 = xYSeries0.createCopy(13, 53);
        boolean boolean0 = xYSeries1.equals(xYSeries0);
        Assert.assertNotSame(xYSeries1, xYSeries0);
        Assert.assertTrue(boolean0);
        Assert.assertTrue(xYSeries1.getAutoSort());
        Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test63() throws Throwable {
        Week week0 = new Week(439, 29);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)));
        xYSeries0.setMaximumItemCount(53);
        XYSeries xYSeries1 = new XYSeries(((Comparable) (week0)), false, false);
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        Assert.assertEquals(53, xYSeries0.getMaximumItemCount());
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test64() throws Throwable {
        Week week0 = new Week(439, 321);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)));
        xYSeries0.setDescription("^d6");
        XYSeries xYSeries1 = new XYSeries(((Comparable) (week0)), true, false);
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
        Assert.assertFalse(boolean0);
        Assert.assertFalse(xYSeries1.getAllowDuplicateXValues());
        Assert.assertTrue(xYSeries1.getAutoSort());
    }

    @Test(timeout = 4000)
    public void test65() throws Throwable {
        XYSeries xYSeries0 = new XYSeries(((Comparable) ("")), false);
        boolean boolean0 = xYSeries0.equals("");
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        Assert.assertFalse(boolean0);
        Assert.assertFalse(xYSeries0.getAutoSort());
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        Week week0 = new Week();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)), true);
        boolean boolean0 = xYSeries0.equals(xYSeries0);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertTrue(xYSeries0.getAutoSort());
        Assert.assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test67() throws Throwable {
        Week week0 = new Week(439, 29);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)));
        XYSeries xYSeries1 = new XYSeries(((Comparable) (week0)), false, false);
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        Assert.assertFalse(boolean0);
        Assert.assertFalse(xYSeries1.getAutoSort());
        Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test68() throws Throwable {
        Week week0 = new Week(439, 439);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)));
        xYSeries0.addOrUpdate(((Number) (53)), ((Number) (53)));
        xYSeries0.add(((double) (53)), ((Number) (53)), false);
        XYSeries xYSeries1 = xYSeries0.createCopy(1, 1);
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        Assert.assertEquals(2, xYSeries0.getItemCount());
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test71() throws Throwable {
        Year year0 = new Year();
        Week week0 = new Week((-4), year0);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)));
        xYSeries0.setMaximumItemCount(0);
        xYSeries0.addOrUpdate(((Number) (9999)), ((Number) (1)));
        Assert.assertEquals(0, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test74() throws Throwable {
        Week week0 = new Week(439, 321);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)));
        xYSeries0.addOrUpdate(((Number) (53)), ((Number) (53)));
        Assert.assertEquals(1, xYSeries0.getItemCount());
        xYSeries0.update(53, 53);
        Assert.assertTrue(xYSeries0.getAutoSort());
    }

    @Test(timeout = 4000)
    public void test75() throws Throwable {
        Week week0 = new Week(439, 29);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)));
        xYSeries0.addOrUpdate(((Number) (53)), ((Number) (53)));
        Assert.assertEquals(1, xYSeries0.getItemCount());
        xYSeries0.clear();
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @Test(timeout = 4000)
    public void test76() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-621L));
        XYSeries xYSeries0 = new XYSeries(((Comparable) (fixedMillisecond0)));
        xYSeries0.clear();
        Assert.assertTrue(xYSeries0.getAutoSort());
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @Test(timeout = 4000)
    public void test78() throws Throwable {
        Week week0 = new Week(439, 321);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)));
        xYSeries0.delete(2936, (-1));
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertTrue(xYSeries0.getAutoSort());
    }

    @Test(timeout = 4000)
    public void test79() throws Throwable {
        Week week0 = new Week();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)), false);
        xYSeries0.setMaximumItemCount(0);
        xYSeries0.add(0.0, 0.0);
        Assert.assertEquals(0, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test81() throws Throwable {
        Hour hour0 = new Hour();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (hour0)), false);
        xYSeries0.add(((Number) (23)), ((Number) (0)), false);
        Assert.assertEquals(1, xYSeries0.getItemCount());
        XYDataItem xYDataItem0 = xYSeries0.remove(((Number) (23)));
        xYSeries0.add(xYDataItem0, false);
        Assert.assertEquals(0.0, xYDataItem0.getYValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test82() throws Throwable {
        Week week0 = new Week();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)), false);
        xYSeries0.addOrUpdate(((Number) (53)), ((Number) (1)));
        Assert.assertEquals(1, xYSeries0.getItemCount());
        xYSeries0.setMaximumItemCount(0);
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @Test(timeout = 4000)
    public void test84() throws Throwable {
        Day day0 = new Day();
        Hour hour0 = new Hour(287, day0);
        Minute minute0 = new Minute(1947, hour0);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (minute0)), false, true);
        boolean boolean0 = xYSeries0.getAutoSort();
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test86() throws Throwable {
        XYSeries xYSeries0 = new XYSeries(((Comparable) ("{HX2p-LrONa=Zk%r")), true, false);
        try {
            xYSeries0.remove(((Number) (4)));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test91() throws Throwable {
        Quarter quarter0 = new Quarter();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (quarter0)), true, false);
        int int0 = xYSeries0.getMaximumItemCount();
        Assert.assertFalse(xYSeries0.getAllowDuplicateXValues());
        Assert.assertEquals(Integer.MAX_VALUE, int0);
        Assert.assertTrue(xYSeries0.getAutoSort());
    }

    @Test(timeout = 4000)
    public void test92() throws Throwable {
        XYSeries xYSeries0 = new XYSeries(((Comparable) ("")), false);
        XYSeries xYSeries1 = ((XYSeries) (xYSeries0.clone()));
        Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
        Assert.assertTrue(xYSeries1.getAllowDuplicateXValues());
        Assert.assertNotSame(xYSeries1, xYSeries0);
        Assert.assertFalse(xYSeries1.getAutoSort());
    }

    @Test(timeout = 4000)
    public void test41() throws Throwable {
        Week week0 = new Week(439, 439);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)));
        Vector<Window> vector0 = new Vector<Window>();
        xYSeries0.data = ((List) (vector0));
        xYSeries0.add(((double) (53)), 3152.925);
        {
            xYSeries0.addOrUpdate(((Number) (53)), ((Number) (53)));
        }
    }
}

