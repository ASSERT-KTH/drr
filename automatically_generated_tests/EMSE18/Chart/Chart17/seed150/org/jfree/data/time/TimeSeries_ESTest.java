

package org.jfree.data.time;

import org.junit.Assert;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.awt.ScrollPane;
import org.jfree.data.general.SeriesException;
import org.junit.Test;
import java.util.Vector;

public class TimeSeries_ESTest  {
    @Test(timeout = 4000)
    public void test001() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        Year year1 = ((Year) (year0.previous()));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year1)), ((double) (1)));
        TimeSeries timeSeries1 = timeSeries0.createCopy(((RegularTimePeriod) (year0)), ((RegularTimePeriod) (year0)));
        Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test002() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        Year year1 = ((Year) (year0.previous()));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), 0.0);
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year1)), ((double) (3)));
        timeSeries0.createCopy(((RegularTimePeriod) (year0)), ((RegularTimePeriod) (year0)));
        Assert.assertEquals(2, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test003() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        Year year1 = ((Year) (year0.previous()));
        TimeSeries timeSeries1 = timeSeries0.createCopy(((RegularTimePeriod) (year1)), ((RegularTimePeriod) (year0)));
        Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test004() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        Year year1 = ((Year) (year0.previous()));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), 0.0);
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year1)), ((double) (5)));
        timeSeries0.delete(((RegularTimePeriod) (year0)));
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test005() throws Throwable {
        try {
            Year year0 = new Year();
            TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
            Year year1 = ((Year) (year0.previous()));
            timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), 0.0);
            timeSeries0.addOrUpdate(((RegularTimePeriod) (year1)), ((double) (1)));
            TimeSeries timeSeries1 = ((TimeSeries) (timeSeries0.clone()));
            timeSeries1.addAndOrUpdate(timeSeries0);
            Assert.assertEquals(2, timeSeries0.getItemCount());
            Assert.assertTrue(timeSeries0.equals(((Object) (timeSeries1))));
            org.junit.Assert.fail("Expecting exception: SeriesException");
        } catch (SeriesException expectedException__SeriesException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test006() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        Year year1 = ((Year) (year0.previous()));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), 0.0);
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year1)), ((double) (1)));
        timeSeries0.update(((RegularTimePeriod) (year0)), ((Number) (1)));
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test007() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        Year year1 = ((Year) (year0.previous()));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), 0.0);
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year1)), ((double) (1)));
        TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem(((RegularTimePeriod) (year0)));
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertNotNull(timeSeriesDataItem0);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test008() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        timeSeries0.setMaximumItemAge(1);
        Assert.assertEquals(1L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test009() throws Throwable {
        Hour hour0 = new Hour();
        Class<Month> class0 = Month.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), "(yXPQ}NrS", "#_6ktADb-+d", ((Class) (class0)));
        timeSeries0.setRangeDescription("");
        Assert.assertEquals("", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test010() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        Year year1 = ((Year) (year0.previous()));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), (-1.2022282930047203));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year1)), ((double) (1)));
        Assert.assertEquals(2, timeSeries0.getItemCount());
        timeSeries0.update(1, ((Number) (12)));
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        Class<Second> class0 = Second.class;
        Class class1 = RegularTimePeriod.downsize(class0);
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) ("Null \'seriesKeys\' argument.")), "Requires start >= 0.", "", ((Class) (class1)));
        String string0 = timeSeries0.getRangeDescription();
        Assert.assertEquals("", string0);
        Assert.assertEquals("Requires start >= 0.", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test014() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), ((double) (1)));
        timeSeries0.getItemCount();
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test015() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), ((double) (1)));
        timeSeries0.getIndex(year0);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test016() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        Year year1 = ((Year) (year0.previous()));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), 0.0);
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year1)), ((double) (1)));
        int int0 = timeSeries0.getIndex(year0);
        Assert.assertEquals(2, timeSeries0.getItemCount());
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test017() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        timeSeries0.setDomainDescription(((String) (null)));
        String string0 = timeSeries0.getDomainDescription();
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertNull(string0);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test018() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), ((double) (1)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), ((double) (1)));
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test019() throws Throwable {
        Class<ScrollPane> class0 = ScrollPane.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (1)), "", ((String) (null)), ((Class) (class0)));
        try {
            timeSeries0.update((-1288), ((Number) (1.0)));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        try {
            timeSeries0.getValue((-235));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test027() throws Throwable {
        Hour hour0 = new Hour();
        Class<Month> class0 = Month.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), "(yXPQ}NrS", "#_6ktADb-+d", ((Class) (class0)));
        DefaultTableModel defaultTableModel0 = new DefaultTableModel(((Vector) (null)), 2614);
        Vector vector0 = defaultTableModel0.getDataVector();
        timeSeries0.data = ((List) (vector0));
        try {
            timeSeries0.createCopy(((RegularTimePeriod) (hour0)), ((RegularTimePeriod) (hour0)));
            Assert.fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
        }
    }

    @Test(timeout = 4000)
    public void test031() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), 0.0);
        TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.getDataItem(((RegularTimePeriod) (year0)));
        TimeSeries timeSeries1 = new TimeSeries(((Comparable) ("Null \'seriesKeys\' argument.")), "Requires start >= 0.", "", ((Class) (null)));
        try {
            timeSeries1.add(timeSeriesDataItem0);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test041() throws Throwable {
        Hour hour0 = new Hour();
        Class<Month> class0 = Month.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), "(yXPQ}NrS", "#_6ktADb-+d", ((Class) (class0)));
        DefaultTableModel defaultTableModel0 = new DefaultTableModel(((Vector) (null)), 2614);
        Vector vector0 = defaultTableModel0.getDataVector();
        timeSeries0.data = ((List) (vector0));
        timeSeries0.delete(0, 0);
        Assert.assertEquals(2613, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test043() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        Year year1 = ((Year) (year0.previous()));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), (-1.2022282930047203));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year1)), ((double) (1)));
        timeSeries0.removeAgedItems(true);
        Assert.assertEquals(2, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Hour hour0 = new Hour();
        Class<Month> class0 = Month.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), "(yXPQ}NrS", "#_6ktADb-+d", ((Class) (class0)));
        timeSeries0.removeAgedItems(true);
        Assert.assertEquals("#_6ktADb-+d", timeSeries0.getRangeDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("(yXPQ}NrS", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), 0.0);
        Double double0 = ((Double) (timeSeries0.getValue(((RegularTimePeriod) (year0)))));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), ((Number) (double0)));
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test052() throws Throwable {
        Hour hour0 = new Hour();
        Class<Month> class0 = Month.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), "(yXPQ}NrS", "#_6ktADb-+d", ((Class) (class0)));
        try {
            timeSeries0.getDataItem((-5351));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test053() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        timeSeries0.getItemCount();
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test054() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        Year year1 = ((Year) (year0.previous()));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), (-1.2022282930047203));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year1)), ((double) (1)));
        timeSeries0.hashCode();
        Assert.assertEquals(2, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test061() throws Throwable {
        Hour hour0 = new Hour();
        Class<Month> class0 = Month.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), "(yXPQ}NrS", "#_6ktADb-+d", ((Class) (class0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (hour0)), (-143.6017));
        timeSeries0.delete(((RegularTimePeriod) (hour0)));
        Assert.assertEquals(0, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test062() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        timeSeries0.delete(((RegularTimePeriod) (year0)));
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test063() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), (-1.2022282930047203));
        timeSeries0.clear();
        Assert.assertEquals(0, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test065() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), 0.0);
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        timeSeries0.setMaximumItemAge(0);
        timeSeries0.removeAgedItems(((long) (Integer.MAX_VALUE)), true);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), (-1.2022282930047203));
        timeSeries0.removeAgedItems(((long) (1)), false);
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        timeSeries0.removeAgedItems(((long) (1)), false);
        timeSeries0.removeAgedItems(((long) (0)), false);
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        Year year1 = ((Year) (year0.previous()));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), 0.0);
        timeSeries0.setMaximumItemAge(0);
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year1)), ((Number) (14)));
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test069() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        Year year1 = ((Year) (year0.previous()));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), 0.0);
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year1)), ((double) (3)));
        timeSeries0.setMaximumItemAge(0);
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test070() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        Year year1 = ((Year) (year0.previous()));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), 0.0);
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year1)), ((double) (5)));
        timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
        Assert.assertEquals(2, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test071() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        timeSeries0.setMaximumItemCount(0);
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), ((Number) (null)));
        Assert.assertEquals(0, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test073() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), 0.0);
        TimeSeries timeSeries1 = timeSeries0.createCopy(((RegularTimePeriod) (year0)), ((RegularTimePeriod) (year0)));
        Assert.assertEquals(0, timeSeries1.getItemCount());
        timeSeries1.addAndOrUpdate(timeSeries0);
        Assert.assertEquals(1, timeSeries1.getItemCount());
    }

    @Test(timeout = 4000)
    public void test075() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), 0.0);
        Assert.assertEquals(1, timeSeries0.getItemCount());
        timeSeries0.update(((RegularTimePeriod) (year0)), ((Number) (5)));
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        timeSeries0.getValue(((RegularTimePeriod) (year0)));
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test080() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), 0.0);
        TimeSeries timeSeries1 = timeSeries0.createCopy(((RegularTimePeriod) (year0)), ((RegularTimePeriod) (year0)));
        timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries0);
        Assert.assertEquals(1, timeSeries0.getItemCount());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test081() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), (-1.2022282930047203));
        timeSeries0.getTimePeriods();
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test082() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        timeSeries0.getDataItem(((RegularTimePeriod) (year0)));
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test084() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        timeSeries0.setMaximumItemAge(0);
        timeSeries0.createCopy(((RegularTimePeriod) (year0)), ((RegularTimePeriod) (year0)));
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test085() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), Double.POSITIVE_INFINITY);
        Assert.assertEquals(1, timeSeries0.getItemCount());
        timeSeries0.setMaximumItemCount(0);
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test087() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        timeSeries0.setMaximumItemCount(1);
        Assert.assertEquals(1, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Hour hour0 = new Hour();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)));
        TimeSeries timeSeries1 = new TimeSeries(((Comparable) (hour0)));
        Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        String string0 = timeSeries0.getRangeDescription();
        Assert.assertEquals("Value", string0);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test090() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        long long0 = timeSeries0.getMaximumItemAge();
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, long0);
    }

    @Test(timeout = 4000)
    public void test094() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (year0)), (-34.15646621217716));
        timeSeries0.getValue(((RegularTimePeriod) (year0)));
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test095() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        try {
            timeSeries0.getNextTimePeriod();
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test096() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        Class class0 = timeSeries0.getTimePeriodClass();
        Assert.assertNotNull(class0);
        TimeSeries timeSeries1 = new TimeSeries(((Comparable) ("Null \'seriesKeys\' argument.")), "Requires start >= 0.", ((String) (null)), ((Class) (class0)));
        String string0 = timeSeries1.getRangeDescription();
        Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Requires start >= 0.", timeSeries1.getDomainDescription());
        Assert.assertNull(string0);
        Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test098() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        int int0 = timeSeries0.getMaximumItemCount();
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(Integer.MAX_VALUE, int0);
    }

    @Test(timeout = 4000)
    public void test101() throws Throwable {
        Year year0 = new Year();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (year0)));
        String string0 = timeSeries0.getDomainDescription();
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Time", string0);
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }
}

