

package org.jfree.data.xy;

import org.junit.Assert;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.CategoryToPieDataset;
import org.jfree.data.time.Year;
import org.jfree.data.time.Day;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;
import org.jfree.chart.util.TableOrder;
import javax.swing.JLayeredPane;
import java.awt.LayoutManager;
import java.util.List;
import org.jfree.data.time.Quarter;
import org.junit.Test;
import org.jfree.data.time.Minute;
import java.awt.Panel;
import org.jfree.data.time.Week;

public class XYSeries_ESTest  {
    @Test(timeout = 4000)
    public void test000() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem((-397.8), (-250.912853254528));
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)));
        xYSeries0.add(((double) (0)), ((Number) ((byte) (24))));
        xYSeries0.add(0.0, (-397.8));
        xYSeries0.add(((double) (0)), 0.0);
        xYSeries0.add((-250.247042335), ((Number) (16)));
        xYSeries0.add(((double) (0)), ((double) (16)), true);
        xYSeries0.hashCode();
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        Minute minute0 = new Minute();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (minute0)), false);
        xYSeries0.add(Double.NaN, ((Number) (59)), false);
        xYSeries0.add(0.0, ((double) (59)), false);
        xYSeries0.add(583.1477165561, ((double) (59)));
        xYSeries0.addOrUpdate(((double) (0)), ((double) (59)));
        xYSeries0.hashCode();
        Assert.assertEquals(4, xYSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test002() throws Throwable {
        Day day0 = new Day();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (day0)), false, false);
        xYSeries0.setMaximumItemCount(1);
        xYSeries0.addOrUpdate(((double) (1)), 0.0);
        Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test003() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem((-397.8), (-250.912853254528));
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)));
        xYSeries0.add(Double.NaN, 3218.870924306911, true);
        xYSeries0.add(((Number) (512)), ((Number) (24)));
        xYSeries0.add(((double) (0)), ((Number) (16)));
        xYSeries0.update(0, 20);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test004() throws Throwable {
        Minute minute0 = new Minute();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (minute0)), true);
        xYSeries0.add(Double.NaN, ((Number) (59)), true);
        xYSeries0.add(0.0, ((double) (59)), false);
        xYSeries0.add(583.1477165561, ((double) (59)));
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test005() throws Throwable {
        Week week0 = new Week();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (week0)), true, true);
        xYSeries0.add(((double) (1)), ((double) (53)), true);
        xYSeries0.add(1.0, (-19.42712650496971));
        xYSeries0.updateByIndex(1, 1);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test006() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem(0.0, 0.0);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)), true, true);
        xYSeries0.add(0.0, 0.0, true);
        Integer integer0 = JLayeredPane.DEFAULT_LAYER;
        XYDataItem xYDataItem1 = xYSeries0.remove(((Number) (integer0)));
        Assert.assertTrue(xYDataItem1.equals(((Object) (xYDataItem0))));
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test007() throws Throwable {
        Minute minute0 = new Minute();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (minute0)), true);
        xYSeries0.add(Double.NaN, ((Number) (59)), true);
        XYDataItem xYDataItem0 = xYSeries0.remove(((Number) (59)));
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertEquals(59.0, xYDataItem0.getYValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test008() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem((-397.8), (-250.912853254528));
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)));
        xYSeries0.add(((double) (1)), 0.0);
        XYDataItem xYDataItem1 = xYSeries0.remove(0);
        Assert.assertEquals(1.0, xYDataItem1.getXValue(), 0.01);
        Assert.assertEquals(0.0, xYDataItem1.getYValue(), 0.01);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test009() throws Throwable {
        Minute minute0 = new Minute();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (minute0)), false);
        xYSeries0.add(((Number) (0)), ((Number) (59)));
        xYSeries0.add(Double.NaN, ((Number) (59)), false);
        xYSeries0.add(0.0, ((double) (59)), false);
        XYDataItem xYDataItem0 = xYSeries0.remove(2);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        Assert.assertEquals(59.0, xYDataItem0.getYValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test010() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem((-397.8), (-221.1012303024473));
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)));
        xYSeries0.add((-247.9462060753947), ((Number) (16)));
        XYDataItem xYDataItem1 = xYSeries0.remove(0);
        Assert.assertEquals(16.0, xYDataItem1.getYValue(), 0.01);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertEquals((-247.9462060753947), xYDataItem1.getXValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Minute minute0 = new Minute();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (minute0)), false);
        xYSeries0.add(Double.NaN, ((Number) (59)), false);
        xYSeries0.add(((Number) (0)), ((Number) (0)));
        int int0 = xYSeries0.indexOf(0);
        Assert.assertEquals(1, int0);
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem((-397.8), (-250.912853254528));
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)));
        xYSeries0.add(((double) (0)), ((Number) ((byte) (24))));
        Byte byte0 = ((Byte) (xYSeries0.getY(0)));
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertEquals(((byte) (24)), ((byte) (byte0)));
    }

    @Test(timeout = 4000)
    public void test013() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem((-397.8), (-250.912853254528));
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)));
        xYSeries0.add(xYDataItem0, true);
        xYSeries0.getY(0);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test014() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem((-397.8), (-250.912853254528));
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)));
        xYSeries0.add(((double) (0)), ((Number) ((byte) (24))));
        Double double0 = ((Double) (xYSeries0.getX(0)));
        Assert.assertEquals(0.0, ((double) (double0)), 0.01);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test015() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem((-397.8), (-221.1012303024473));
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)));
        xYSeries0.add(((Number) ((byte) (13))), ((Number) (1668313716)), true);
        xYSeries0.getX(0);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test016() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem((-397.8), (-250.912853254528));
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)));
        xYSeries0.add((-1793.3152305127178), (-397.8));
        Double double0 = ((Double) (xYSeries0.getX(0)));
        Assert.assertEquals((-1793.3152305127178), ((double) (double0)), 0.01);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test017() throws Throwable {
        Minute minute0 = new Minute();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (minute0)), true);
        xYSeries0.setMaximumItemCount(0);
        int int0 = xYSeries0.getMaximumItemCount();
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test018() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem((-397.8), (-221.1012303024473));
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)));
        xYSeries0.add(((Number) ((byte) (13))), ((Number) (1668313716)), true);
        xYSeries0.getItemCount();
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test019() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem((-397.8), (-250.912853254528));
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)));
        xYSeries0.add(Double.NaN, 3218.870924306911, true);
        xYSeries0.add(((double) (16)), ((Number) (0)));
        xYSeries0.add(xYDataItem0, true);
        XYDataItem xYDataItem1 = xYSeries0.getDataItem(2);
        Assert.assertEquals(0.0, xYDataItem1.getYValue(), 0.01);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertEquals(16.0, xYDataItem1.getXValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test020() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem((-397.8), (-250.912853254528));
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)));
        xYSeries0.add(Double.NaN, 3218.870924306911, true);
        xYSeries0.add(((double) (0)), ((Number) (16)));
        xYSeries0.add(xYDataItem0, true);
        XYDataItem xYDataItem1 = xYSeries0.getDataItem(2);
        Assert.assertEquals(0.0, xYDataItem1.getXValue(), 0.01);
        Assert.assertEquals(16.0, xYDataItem1.getYValue(), 0.01);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Year year0 = new Year(3049);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (year0)));
        xYSeries0.getAllowDuplicateXValues();
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem((-865.553768710965), (-865.553768710965));
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)));
        xYSeries0.setNotify(false);
        XYSeries xYSeries1 = xYSeries0.createCopy(4, 3062);
        Assert.assertNotSame(xYSeries1, xYSeries0);
        Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test024() throws Throwable {
        Minute minute0 = new Minute();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (minute0)), true);
        xYSeries0.setMaximumItemCount(0);
        xYSeries0.createCopy(59, 59);
        Assert.assertEquals(0, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test025() throws Throwable {
        Minute minute0 = new Minute();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (minute0)), false);
        xYSeries0.add(Double.NaN, ((Number) (59)), false);
        xYSeries0.createCopy(0, 0);
        Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test026() throws Throwable {
        Year year0 = new Year(53);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (year0)), false, false);
        xYSeries0.add(((Number) (9999)), ((Number) (9999)), false);
        xYSeries0.addOrUpdate(((Number) (9999)), ((Number) (9999)));
        Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem((-865.5538), (-865.5538));
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)));
        Integer integer0 = JLayeredPane.DEFAULT_LAYER;
        Vector<Panel> vector0 = new Vector<Panel>();
        Panel panel0 = new Panel(((LayoutManager) (null)));
        vector0.add(panel0);
        xYSeries0.data = ((List) (vector0));
        try {
            xYSeries0.remove(((Number) (integer0)));
            Assert.fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
        }
    }

    @Test(timeout = 4000)
    public void test035() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem((-2250.7), 0.0);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)), false);
        try {
            xYSeries0.remove((-961));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test039() throws Throwable {
        Year year0 = new Year(0);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (year0)), false, false);
        try {
            xYSeries0.getDataItem((-1731));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test048() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem((-865.5538), (-865.5538));
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)));
        Vector<Panel> vector0 = new Vector<Panel>();
        Panel panel0 = new Panel(((LayoutManager) (null)));
        vector0.add(panel0);
        xYSeries0.data = ((List) (vector0));
        try {
            xYSeries0.addOrUpdate(0.0, (-1481.4));
            Assert.fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
        }
    }

    @Test(timeout = 4000)
    public void test050() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem((-865.5538), (-865.5538));
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)));
        Vector<Panel> vector0 = new Vector<Panel>();
        Panel panel0 = new Panel(((LayoutManager) (null)));
        vector0.add(panel0);
        xYSeries0.data = ((List) (vector0));
        try {
            xYSeries0.add(xYDataItem0, true);
            Assert.fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
        }
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem((-397.8), (-250.912853254528));
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)));
        double[][] doubleArray0 = new double[7][3];
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset(doubleArray0, doubleArray0);
        TableOrder tableOrder0 = TableOrder.BY_ROW;
        CategoryToPieDataset categoryToPieDataset0 = new CategoryToPieDataset(((CategoryDataset) (defaultIntervalCategoryDataset0)), tableOrder0, 836);
        List list0 = categoryToPieDataset0.getKeys();
        xYSeries0.data = list0;
        try {
            xYSeries0.add(((double) (0)), ((Number) ((byte) (24))));
            Assert.fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
        }
    }

    @Test(timeout = 4000)
    public void test062() throws Throwable {
        Minute minute0 = new Minute();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (minute0)), false);
        xYSeries0.add(Double.NaN, ((Number) (59)), false);
        int int0 = xYSeries0.indexOf(0);
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertEquals((-1), int0);
    }

    @Test(timeout = 4000)
    public void test063() throws Throwable {
        Minute minute0 = new Minute();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (minute0)), false);
        xYSeries0.add(((Number) (0)), ((Number) (59)));
        int int0 = xYSeries0.indexOf(0);
        Assert.assertEquals(0, int0);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @Test(timeout = 4000)
    public void test065() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem(0.0, 0.0);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)), false, false);
        xYSeries0.add(xYDataItem0, false);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem((-397.8), (-250.912853254528));
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)));
        xYSeries0.add(Double.NaN, 3218.870924306911, true);
        xYSeries0.add(xYDataItem0, true);
        xYSeries0.add(xYDataItem0, true);
        Assert.assertEquals(3, xYSeries0.getItemCount());
        XYDataItem xYDataItem1 = xYSeries0.getDataItem(2);
        Assert.assertSame(xYDataItem0, xYDataItem1);
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        Day day0 = new Day();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (day0)), false);
        try {
            xYSeries0.getX((-1336));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test071() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem((-397.8), (-221.1012303024473));
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)));
        xYSeries0.getItemCount();
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @Test(timeout = 4000)
    public void test072() throws Throwable {
        Integer integer0 = JLayeredPane.DEFAULT_LAYER;
        XYSeries xYSeries0 = new XYSeries(((Comparable) (integer0)), false, false);
        xYSeries0.hashCode();
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertFalse(xYSeries0.getAllowDuplicateXValues());
    }

    @Test(timeout = 4000)
    public void test073() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem((-397.8), (-250.912853254528));
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)));
        xYSeries0.add(xYDataItem0, true);
        xYSeries0.add(0.0, (-397.8));
        xYSeries0.hashCode();
        Assert.assertEquals(2, xYSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test074() throws Throwable {
        Year year0 = new Year(53);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (year0)), true, true);
        XYSeries xYSeries1 = xYSeries0.createCopy(9999, (-2));
        Assert.assertTrue(xYSeries1.equals(((Object) (xYSeries0))));
        xYSeries1.add(((Number) (-9999)), ((Number) (9999)), false);
        boolean boolean0 = xYSeries1.equals(xYSeries0);
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test075() throws Throwable {
        Year year0 = new Year(53);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (year0)), false, false);
        XYSeries xYSeries1 = new XYSeries(((Comparable) (year0)));
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        Assert.assertFalse(boolean0);
        Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
        Assert.assertTrue(xYSeries1.getAllowDuplicateXValues());
    }

    @Test(timeout = 4000)
    public void test076() throws Throwable {
        Year year0 = new Year();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (year0)), false, false);
        XYSeries xYSeries1 = xYSeries0.createCopy(9999, (-2));
        boolean boolean0 = xYSeries0.equals(xYSeries1);
        Assert.assertFalse(xYSeries1.getAllowDuplicateXValues());
        Assert.assertNotSame(xYSeries1, xYSeries0);
        Assert.assertTrue(boolean0);
        Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Year year0 = new Year(53);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (year0)), false, true);
        XYSeries xYSeries1 = xYSeries0.createCopy(9999, (-2));
        Assert.assertTrue(xYSeries1.equals(((Object) (xYSeries0))));
        xYSeries1.setDescription("1{?m");
        boolean boolean0 = xYSeries1.equals(xYSeries0);
        Assert.assertFalse(xYSeries1.equals(((Object) (xYSeries0))));
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem(0.0, 0.0);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)), true, true);
        boolean boolean0 = xYSeries0.equals("3@J~uKi+h.6F3");
        Assert.assertFalse(boolean0);
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        Year year0 = new Year();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (year0)), false, false);
        boolean boolean0 = xYSeries0.equals(xYSeries0);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertTrue(boolean0);
        Assert.assertFalse(xYSeries0.getAllowDuplicateXValues());
    }

    @Test(timeout = 4000)
    public void test081() throws Throwable {
        Year year0 = new Year(53);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (year0)), false, true);
        XYSeries xYSeries1 = xYSeries0.createCopy(9999, (-2));
        xYSeries1.setMaximumItemCount(53);
        boolean boolean0 = xYSeries1.equals(xYSeries0);
        Assert.assertEquals(53, xYSeries1.getMaximumItemCount());
        Assert.assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test082() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem((-397.8), (-221.1012303024473));
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)));
        xYSeries0.add(0.0, ((Number) (null)), false);
        xYSeries0.toArray();
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @Test(timeout = 4000)
    public void test083() throws Throwable {
        Minute minute0 = new Minute();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (minute0)), true);
        xYSeries0.setMaximumItemCount(0);
        xYSeries0.addOrUpdate(((Number) (0)), ((Number) (59)));
        Assert.assertEquals(0, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test086() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem((-397.8), (-250.912853254528));
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)));
        xYSeries0.add(Double.NaN, 3218.870924306911, true);
        Assert.assertEquals(1, xYSeries0.getItemCount());
        xYSeries0.update(0, 20);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test087() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem((-865.5538), (-865.5538));
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)));
        xYSeries0.clear();
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Day day0 = new Day();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (day0)), false, false);
        try {
            xYSeries0.delete((-1153), 1);
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem(0.0, 0.0);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)), true, true);
        xYSeries0.delete(836, (-753));
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @Test(timeout = 4000)
    public void test090() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem((-397.8), (-250.912853254528));
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)));
        xYSeries0.add(xYDataItem0, true);
        xYSeries0.setMaximumItemCount(1);
        xYSeries0.add(((double) (1)), 0.0);
        Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test092() throws Throwable {
        Year year0 = new Year();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (year0)), false, false);
        xYSeries0.add(((Number) (9999)), ((Number) (-9999)), true);
        xYSeries0.addOrUpdate(((Number) (9999)), ((Number) (9999)));
        Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test093() throws Throwable {
        Year year0 = new Year(53);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (year0)), false, true);
        xYSeries0.add(((Number) (9999)), ((Number) (9999)), true);
        xYSeries0.addOrUpdate(((Number) (9999)), ((Number) (9999)));
        Assert.assertEquals(2, xYSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test095() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem((-397.8), (-250.912853254528));
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)));
        xYSeries0.add(xYDataItem0, true);
        xYSeries0.add(0.0, (-397.8));
        xYSeries0.setMaximumItemCount(1);
        Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test096() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem((-397.8), (-250.912853254528));
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)));
        boolean boolean0 = xYSeries0.getAutoSort();
        Assert.assertTrue(boolean0);
        Assert.assertEquals(2147483647, xYSeries0.getMaximumItemCount());
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @Test(timeout = 4000)
    public void test098() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem((-865.5538), (-865.5538));
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)));
        Integer integer0 = JLayeredPane.DEFAULT_LAYER;
        try {
            xYSeries0.remove(((Number) (integer0)));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem(0.0, 0.0);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)), true, true);
        xYSeries0.add(xYDataItem0);
        Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test101() throws Throwable {
        Quarter quarter0 = new Quarter();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (quarter0)), false);
        XYDataItem xYDataItem0 = new XYDataItem(((Number) (1733843290)), ((Number) (14)));
        xYSeries0.add(xYDataItem0, false);
        Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test102() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem((-397.8), (-221.1012303024473));
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)));
        xYSeries0.add(((Number) ((byte) (13))), ((Number) (1668313716)), true);
        xYSeries0.toArray();
        Assert.assertEquals(1, xYSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test103() throws Throwable {
        XYDataItem xYDataItem0 = new XYDataItem(0.0, 0.0);
        XYSeries xYSeries0 = new XYSeries(((Comparable) (xYDataItem0)), true, true);
        xYSeries0.add(0.0, 0.0, true);
        Assert.assertEquals(1, xYSeries0.getItemCount());
        xYSeries0.clear();
        Assert.assertTrue(xYSeries0.getAllowDuplicateXValues());
    }

    @Test(timeout = 4000)
    public void test104() throws Throwable {
        Year year0 = new Year();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (year0)), false, false);
        int int0 = xYSeries0.getMaximumItemCount();
        Assert.assertFalse(xYSeries0.getAutoSort());
        Assert.assertFalse(xYSeries0.getAllowDuplicateXValues());
        Assert.assertEquals(Integer.MAX_VALUE, int0);
    }

    @Test(timeout = 4000)
    public void test105() throws Throwable {
        XYSeries xYSeries0 = new XYSeries(((Comparable) ("Null \'series\' not permitted.")));
        XYSeries xYSeries1 = ((XYSeries) (xYSeries0.clone()));
        Assert.assertTrue(xYSeries1.getAutoSort());
        Assert.assertEquals(2147483647, xYSeries1.getMaximumItemCount());
        Assert.assertTrue(xYSeries1.getAllowDuplicateXValues());
        Assert.assertNotSame(xYSeries1, xYSeries0);
    }

    @Test(timeout = 4000)
    public void test049() throws Throwable {
        Minute minute0 = new Minute();
        XYSeries xYSeries0 = new XYSeries(((Comparable) (minute0)), true);
        DefaultTableModel defaultTableModel0 = new DefaultTableModel();
        Vector vector0 = defaultTableModel0.getDataVector();
        xYSeries0.data = ((List) (vector0));
        xYSeries0.add(Double.NaN, ((Number) (59)), true);
        {
            xYSeries0.addOrUpdate(0.0, ((double) (59)));
        }
    }
}

