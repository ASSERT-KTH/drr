

package org.jfree.data.time;

import org.junit.Assert;
import java.awt.Choice;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.awt.ScrollPane;
import org.junit.Test;
import java.awt.TextArea;

public class TimeSeries_ESTest  {
    @Test(timeout = 4000)
    public void test003() throws Throwable {
        Class<ScrollPane> class0 = ScrollPane.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (1886610480)), "org.jfree.data.time.Day", "org.jfree.data.time.Day", ((Class) (class0)));
        timeSeries0.setRangeDescription("org.jfree.data.time.Day");
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("org.jfree.data.time.Day", timeSeries0.getRangeDescription());
        Assert.assertEquals("org.jfree.data.time.Day", timeSeries0.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test004() throws Throwable {
        Class<Choice> class0 = Choice.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) ("")), ((Class) (class0)));
        timeSeries0.setDomainDescription("");
        timeSeries0.setDomainDescription("Value");
        Assert.assertEquals("Value", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test005() throws Throwable {
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (";+")));
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(37);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        timeSeries0.add(((RegularTimePeriod) (day0)), ((double) (0)));
        Double double0 = ((Double) (timeSeries0.getValue(((RegularTimePeriod) (day0)))));
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertNotNull(double0);
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test006() throws Throwable {
        Hour hour0 = new Hour();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (hour0)), ((double) (0)));
        timeSeries0.getNextTimePeriod();
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test007() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<DefaultTableModel> class0 = DefaultTableModel.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), ((Class) (class0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), ((Number) (1)));
        timeSeries0.getItemCount();
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test008() throws Throwable {
        Hour hour0 = new Hour();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (hour0)), ((double) (0)));
        timeSeries0.getIndex(hour0);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test010() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<DefaultTableModel> class0 = DefaultTableModel.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), ((Class) (class0)));
        timeSeries0.setNotify(false);
        TimeSeries timeSeries1 = timeSeries0.createCopy(((RegularTimePeriod) (quarter0)), ((RegularTimePeriod) (quarter0)));
        Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        Millisecond millisecond0 = new Millisecond();
        TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(((RegularTimePeriod) (millisecond0)), ((Number) (0)));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (timeSeriesDataItem0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (millisecond0)), ((Number) (0)));
        timeSeries0.clone();
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test013() throws Throwable {
        Millisecond millisecond0 = new Millisecond();
        TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(((RegularTimePeriod) (millisecond0)), ((Number) (0)));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (timeSeriesDataItem0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (millisecond0)), ((Number) (0)));
        TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.addOrUpdate(((RegularTimePeriod) (millisecond0)), 0.0);
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertTrue(timeSeriesDataItem1.equals(((Object) (timeSeriesDataItem0))));
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test015() throws Throwable {
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) ("Requires \'samples\' > 1")));
        try {
            timeSeries0.update((-2488), ((Number) ((byte) (30))));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test018() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<DefaultTableModel> class0 = DefaultTableModel.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), ((Class) (class0)));
        try {
            timeSeries0.getValue((-1378));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<DefaultTableModel> class0 = DefaultTableModel.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), ((Class) (class0)));
        try {
            timeSeries0.getDataItem((-674));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test026() throws Throwable {
        Millisecond millisecond0 = new Millisecond();
        TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(((RegularTimePeriod) (millisecond0)), ((Number) (0)));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (timeSeriesDataItem0)));
        try {
            timeSeries0.delete((-3643), 3151);
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test027() throws Throwable {
        Millisecond millisecond0 = new Millisecond();
        TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(((RegularTimePeriod) (millisecond0)), ((Number) (0)));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (timeSeriesDataItem0)));
        timeSeries0.data = null;
        try {
            timeSeries0.clone();
            Assert.fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException expectedException__IllegalArgumentException) {
        }
    }

    @Test(timeout = 4000)
    public void test040() throws Throwable {
        Millisecond millisecond0 = new Millisecond();
        TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(((RegularTimePeriod) (millisecond0)), ((Number) (0)));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (timeSeriesDataItem0)));
        timeSeries0.delete((-2147483647), 999);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test041() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-951L));
        Class<TextArea> class0 = TextArea.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (fixedMillisecond0)), ((Class) (class0)));
        timeSeries0.removeAgedItems(true);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test042() throws Throwable {
        Millisecond millisecond0 = new Millisecond();
        TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(((RegularTimePeriod) (millisecond0)), ((Number) (0)));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (timeSeriesDataItem0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (millisecond0)), ((Number) (0)));
        TimeSeriesDataItem timeSeriesDataItem1 = timeSeries0.addOrUpdate(((RegularTimePeriod) (millisecond0)), ((Number) (999)));
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertTrue(timeSeriesDataItem1.equals(((Object) (timeSeriesDataItem0))));
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Hour hour0 = new Hour();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)));
        timeSeries0.getIndex(hour0);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        Class<Choice> class0 = Choice.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) ("")), ((Class) (class0)));
        String string0 = timeSeries0.getRangeDescription();
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Value", string0);
    }

    @Test(timeout = 4000)
    public void test052() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<DefaultTableModel> class0 = DefaultTableModel.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), ((Class) (class0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), ((Number) (1)));
        timeSeries0.hashCode();
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test053() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<DefaultTableModel> class0 = DefaultTableModel.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), ((Class) (class0)));
        boolean boolean0 = timeSeries0.equals(quarter0);
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertFalse(boolean0);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test060() throws Throwable {
        Hour hour0 = new Hour();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (hour0)), ((double) (2)));
        timeSeries0.delete(((RegularTimePeriod) (hour0)));
        Assert.assertEquals(0, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test061() throws Throwable {
        Hour hour0 = new Hour();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)));
        timeSeries0.delete(((RegularTimePeriod) (hour0)));
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test062() throws Throwable {
        Millisecond millisecond0 = new Millisecond();
        TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(((RegularTimePeriod) (millisecond0)), ((Number) (0)));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (timeSeriesDataItem0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (millisecond0)), ((Number) (0)));
        timeSeries0.clear();
        Assert.assertEquals(0, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test063() throws Throwable {
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (14)));
        timeSeries0.clear();
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test064() throws Throwable {
        Hour hour0 = new Hour();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)));
        timeSeries0.removeAgedItems(((long) (0)), true);
        timeSeries0.removeAgedItems(0L, true);
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (";+")));
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(37);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        timeSeries0.add(((RegularTimePeriod) (day0)), ((double) (0)));
        TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
        Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        Assert.assertEquals(1, timeSeries1.getItemCount());
        Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        Assert.assertNotSame(timeSeries1, timeSeries0);
        Assert.assertFalse(timeSeries1.equals(((Object) (timeSeries0))));
        Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        Assert.assertEquals("Value", timeSeries1.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<DefaultTableModel> class0 = DefaultTableModel.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), ((Class) (class0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), ((Number) (1)));
        Assert.assertEquals(1, timeSeries0.getItemCount());
        timeSeries0.update(((RegularTimePeriod) (quarter0)), ((Number) (1)));
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test072() throws Throwable {
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (14)));
        Month month0 = new Month();
        timeSeries0.getValue(((RegularTimePeriod) (month0)));
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test074() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<DefaultTableModel> class0 = DefaultTableModel.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), ((Class) (class0)));
        timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test075() throws Throwable {
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (";+")));
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(37);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        timeSeries0.add(((RegularTimePeriod) (day0)), ((double) (0)));
        timeSeries0.getTimePeriods();
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond((-951L));
        Class<TextArea> class0 = TextArea.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (fixedMillisecond0)), ((Class) (class0)));
        timeSeries0.getDataItem(((RegularTimePeriod) (fixedMillisecond0)));
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        Minute minute0 = new Minute();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (minute0)));
        timeSeries0.setMaximumItemAge(3440L);
        Assert.assertEquals(3440L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test080() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<DefaultTableModel> class0 = DefaultTableModel.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), ((Class) (class0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), ((Number) (1)));
        Assert.assertEquals(1, timeSeries0.getItemCount());
        timeSeries0.setMaximumItemCount(0);
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test082() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<DefaultTableModel> class0 = DefaultTableModel.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), ((Class) (class0)));
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        timeSeries0.setMaximumItemCount(0);
        int int0 = timeSeries0.getMaximumItemCount();
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test083() throws Throwable {
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) ("You are trying to add data where the time period class ")));
        TimeSeries timeSeries1 = new TimeSeries(((Comparable) ("")));
        Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        Assert.assertEquals("Time", timeSeries1.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test084() throws Throwable {
        Hour hour0 = new Hour();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)));
        TimeSeries timeSeries1 = timeSeries0.createCopy(2, 23);
        boolean boolean0 = timeSeries1.equals(timeSeries0);
        Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        Assert.assertNotSame(timeSeries1, timeSeries0);
        Assert.assertTrue(boolean0);
        Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test085() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<DefaultTableModel> class0 = DefaultTableModel.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), ((Class) (class0)));
        long long0 = timeSeries0.getMaximumItemAge();
        Assert.assertEquals(9223372036854775807L, long0);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test091() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<DefaultTableModel> class0 = DefaultTableModel.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), ((Class) (class0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), ((Number) (1)));
        Minute minute0 = new Minute();
        timeSeries0.getValue(((RegularTimePeriod) (minute0)));
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test092() throws Throwable {
        Hour hour0 = new Hour();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)));
        try {
            timeSeries0.getNextTimePeriod();
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test093() throws Throwable {
        Hour hour0 = new Hour();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)));
        timeSeries0.getTimePeriodClass();
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test094() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<DefaultTableModel> class0 = DefaultTableModel.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), ((Class) (class0)));
        timeSeries0.getItems();
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test095() throws Throwable {
        Hour hour0 = new Hour();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (hour0)), ((double) (2)));
        timeSeries0.removeAgedItems(((long) (2)), true);
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test096() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<DefaultTableModel> class0 = DefaultTableModel.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), ((Class) (class0)));
        int int0 = timeSeries0.getMaximumItemCount();
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(Integer.MAX_VALUE, int0);
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test098() throws Throwable {
        Quarter quarter0 = new Quarter();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), ((Class) (null)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), ((Number) (1)));
        try {
            timeSeries0.createCopy(((RegularTimePeriod) (quarter0)), ((RegularTimePeriod) (quarter0)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test100() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<DefaultTableModel> class0 = DefaultTableModel.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), ((Class) (class0)));
        String string0 = timeSeries0.getDomainDescription();
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", string0);
    }
}

