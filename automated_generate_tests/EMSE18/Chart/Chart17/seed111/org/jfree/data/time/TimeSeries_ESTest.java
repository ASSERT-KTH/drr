

package org.jfree.data.time;

import org.junit.Assert;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.SpinnerNumberModel;
import org.junit.Test;
import java.awt.TextComponent;
import java.util.Vector;

public class TimeSeries_ESTest {
    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Class<TextComponent> class0 = TextComponent.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) ("accessibleComponentBoundsChanged")), "", "", ((Class) (class0)));
        timeSeries0.hashCode();
        Assert.assertEquals("", timeSeries0.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), ((Class) (class0)));
        timeSeries0.setDomainDescription("org.jfree.data.time.TimeSeriesCollection");
        timeSeries0.hashCode();
        Assert.assertEquals("org.jfree.data.time.TimeSeriesCollection", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test002() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        Day day1 = ((Day) (day0.next()));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day1)));
        TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(((RegularTimePeriod) (day1)), ((Number) (2)));
        timeSeries0.add(((RegularTimePeriod) (day0)), ((Number) (1)));
        timeSeries0.add(timeSeriesDataItem0);
        timeSeries0.createCopy(((RegularTimePeriod) (day1)), ((RegularTimePeriod) (day1)));
        Assert.assertEquals(2, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test003() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        Day day1 = ((Day) (day0.next()));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day1)));
        TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(((RegularTimePeriod) (day1)), ((Number) (2)));
        timeSeries0.add(timeSeriesDataItem0, true);
        timeSeries0.add(((RegularTimePeriod) (day0)), ((Number) (1)));
        timeSeries0.createCopy(((RegularTimePeriod) (day0)), ((RegularTimePeriod) (day1)));
        Assert.assertEquals(2, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test004() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(21);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        Day day1 = ((Day) (day0.next()));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day1)));
        timeSeries0.add(((RegularTimePeriod) (day0)), ((Number) (3)));
        TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(((RegularTimePeriod) (day1)), ((Number) (2)));
        timeSeries0.add(timeSeriesDataItem0, true);
        timeSeries0.delete(((RegularTimePeriod) (day1)));
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test005() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        Day day1 = new Day();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day1)));
        TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(((RegularTimePeriod) (day1)), ((Number) (2)));
        timeSeries0.add(timeSeriesDataItem0, true);
        timeSeries0.add(((RegularTimePeriod) (day0)), ((Number) (1)));
        Assert.assertEquals(2, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test006() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), ((Class) (class0)));
        timeSeries0.setMaximumItemCount(1);
        Month month0 = new Month(10, 6);
        timeSeries0.addOrUpdate(((RegularTimePeriod) (month0)), ((Number) (4)));
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test007() throws Throwable {
        Quarter quarter0 = new Quarter();
        Quarter quarter1 = ((Quarter) (quarter0.next()));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        TimeSeries timeSeries1 = timeSeries0.createCopy(((RegularTimePeriod) (quarter1)), ((RegularTimePeriod) (quarter1)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter1)), ((double) (4)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), (-4755.975272162351));
        timeSeries1.addAndOrUpdate(timeSeries0);
        Assert.assertTrue(timeSeries0.equals(((Object) (timeSeries1))));
    }

    @Test(timeout = 4000)
    public void test008() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        Day day1 = ((Day) (day0.next()));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day1)));
        TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(((RegularTimePeriod) (day1)), ((Number) (2)));
        timeSeries0.add(((RegularTimePeriod) (day0)), ((Number) (1)));
        timeSeries0.add(timeSeriesDataItem0);
        timeSeries0.addOrUpdate(((RegularTimePeriod) (day1)), ((Number) (1)));
        Assert.assertEquals(2, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test009() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        Day day1 = ((Day) (day0.next()));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day1)));
        TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(((RegularTimePeriod) (day1)), ((Number) (2)));
        timeSeries0.add(timeSeriesDataItem0, true);
        timeSeries0.add(((RegularTimePeriod) (day0)), ((Number) (1)));
        timeSeries0.update(((RegularTimePeriod) (day1)), ((Number) (0)));
        Assert.assertEquals(2, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test010() throws Throwable {
        Day day0 = new Day();
        Day day1 = ((Day) (day0.next()));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day1)));
        TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(((RegularTimePeriod) (day1)), ((Number) (2)));
        timeSeries0.add(timeSeriesDataItem0, true);
        timeSeries0.add(((RegularTimePeriod) (day0)), ((Number) (1)));
        timeSeries0.getValue(((RegularTimePeriod) (day1)));
        Assert.assertEquals(2, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        Day day1 = ((Day) (day0.next()));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day1)));
        TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(((RegularTimePeriod) (day1)), ((Number) (2)));
        timeSeries0.add(timeSeriesDataItem0, true);
        timeSeries0.add(((RegularTimePeriod) (day0)), ((Number) (1)));
        timeSeries0.getDataItem(((RegularTimePeriod) (day1)));
        Assert.assertEquals(2, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        Class<TextComponent> class0 = TextComponent.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) ("accessibleComponentBoundsChanged")), "", "", ((Class) (class0)));
        timeSeries0.setRangeDescription("_MN~GH#z");
        Assert.assertEquals("_MN~GH#z", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test013() throws Throwable {
        Class<TextComponent> class0 = TextComponent.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) ("accessibleComponentBoundsChanged")), "", "", ((Class) (class0)));
        timeSeries0.setDomainDescription("");
        Assert.assertEquals("", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test014() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        timeSeries0.add(((RegularTimePeriod) (day0)), ((Number) (4)), false);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test015() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        timeSeries0.add(((RegularTimePeriod) (day0)), ((double) (7)), false);
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test016() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        timeSeries0.add(((RegularTimePeriod) (day0)), 0.0);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test017() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        timeSeries0.add(((RegularTimePeriod) (day0)), ((Number) (1)));
        Integer integer0 = ((Integer) (timeSeries0.getValue(((RegularTimePeriod) (day0)))));
        Assert.assertNotNull(integer0);
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test018() throws Throwable {
        Hour hour0 = new Hour();
        Class<TextComponent> class0 = TextComponent.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), ((Class) (class0)));
        TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(((RegularTimePeriod) (hour0)), ((Number) (23)));
        Assert.assertNull(timeSeriesDataItem0);
        timeSeries0.update(0, ((Number) (0)));
        timeSeries0.getValue(0);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test019() throws Throwable {
        Hour hour0 = new Hour();
        Class<TextComponent> class0 = TextComponent.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), ((Class) (class0)));
        TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(((RegularTimePeriod) (hour0)), ((Number) (23)));
        Assert.assertNull(timeSeriesDataItem0);
        timeSeries0.getValue(0);
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test020() throws Throwable {
        Hour hour0 = new Hour();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), ((Class) (null)));
        timeSeries0.getTimePeriodClass();
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Hour hour0 = new Hour();
        Class<TextComponent> class0 = TextComponent.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), ((Class) (class0)));
        TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(((RegularTimePeriod) (hour0)), ((Number) (0)));
        Assert.assertNull(timeSeriesDataItem0);
        timeSeries0.getTimePeriod(0);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), ((Class) (class0)));
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        timeSeries0.setRangeDescription(((String) (null)));
        String string0 = timeSeries0.getRangeDescription();
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertNull(string0);
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test024() throws Throwable {
        Class<TextComponent> class0 = TextComponent.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) ("accessibleComponentBoundsChanged")), "", "", ((Class) (class0)));
        String string0 = timeSeries0.getRangeDescription();
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("", string0);
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test025() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        timeSeries0.add(((RegularTimePeriod) (day0)), ((Number) (1)));
        timeSeries0.getNextTimePeriod();
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test026() throws Throwable {
        Hour hour0 = new Hour();
        Class<TextComponent> class0 = TextComponent.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), ((Class) (class0)));
        timeSeries0.setMaximumItemCount(0);
        int int0 = timeSeries0.getMaximumItemCount();
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test027() throws Throwable {
        Hour hour0 = new Hour();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), ((Class) (null)));
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        timeSeries0.setMaximumItemAge(0);
        timeSeries0.getMaximumItemAge();
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test028() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(((RegularTimePeriod) (day0)), ((Number) (2)));
        timeSeries0.add(timeSeriesDataItem0, true);
        timeSeries0.getItemCount();
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test029() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(((RegularTimePeriod) (day0)), ((Number) (2)));
        timeSeries0.add(timeSeriesDataItem0, true);
        Week week0 = new Week();
        timeSeries0.getIndex(week0);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test030() throws Throwable {
        Class<TextComponent> class0 = TextComponent.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) ("accessibleComponentBoundsChanged")), "", "", ((Class) (class0)));
        String string0 = timeSeries0.getDomainDescription();
        Assert.assertEquals("", string0);
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("", timeSeries0.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test031() throws Throwable {
        Hour hour0 = new Hour();
        Class<TextComponent> class0 = TextComponent.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), ((Class) (class0)));
        TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(((RegularTimePeriod) (hour0)), ((Number) (23)));
        Assert.assertNull(timeSeriesDataItem0);
        timeSeries0.getDataItem(0);
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test032() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        timeSeries0.setNotify(false);
        TimeSeries timeSeries1 = timeSeries0.createCopy(((RegularTimePeriod) (day0)), ((RegularTimePeriod) (day0)));
        Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        Assert.assertEquals("Value", timeSeries1.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Hour hour0 = new Hour();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), ((Class) (null)));
        timeSeries0.setMaximumItemCount(0);
        timeSeries0.createCopy(((RegularTimePeriod) (hour0)), ((RegularTimePeriod) (hour0)));
        Assert.assertEquals(0, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        Hour hour0 = new Hour();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), ((Class) (null)));
        timeSeries0.setNotify(false);
        TimeSeries timeSeries1 = timeSeries0.createCopy(0, 1490);
        Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
        Assert.assertNotSame(timeSeries1, timeSeries0);
        Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test035() throws Throwable {
        Hour hour0 = new Hour();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), ((Class) (null)));
        timeSeries0.setMaximumItemCount(0);
        timeSeries0.createCopy(0, 1490);
        Assert.assertEquals(0, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test036() throws Throwable {
        Class<TextComponent> class0 = TextComponent.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) ("accessibleComponentBoundsChanged")), "", "", ((Class) (class0)));
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        timeSeries0.setMaximumItemAge(0L);
        timeSeries0.createCopy(1896, 2562);
        Assert.assertEquals("", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test037() throws Throwable {
        Hour hour0 = new Hour();
        Class<TextComponent> class0 = TextComponent.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), ((Class) (class0)));
        TimeSeriesDataItem timeSeriesDataItem0 = timeSeries0.addOrUpdate(((RegularTimePeriod) (hour0)), ((Number) (23)));
        Assert.assertNull(timeSeriesDataItem0);
        timeSeries0.addOrUpdate(((RegularTimePeriod) (hour0)), ((double) (0)));
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test039() throws Throwable {
        Hour hour0 = new Hour();
        Class<TextComponent> class0 = TextComponent.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), ((Class) (class0)));
        try {
            timeSeries0.update((-3953), ((Number) (0)));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test042() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), ((Class) (class0)));
        try {
            timeSeries0.getValue((-43));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        SpinnerNumberModel spinnerNumberModel0 = new SpinnerNumberModel(0.0, 0.0, 0.0, 0.0);
        Comparable comparable0 = spinnerNumberModel0.getMinimum();
        TimeSeries timeSeries0 = new TimeSeries(comparable0);
        try {
            timeSeries0.getTimePeriod((-1));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        try {
            timeSeries0.getDataItem((-2048));
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        Hour hour0 = new Hour();
        Class<TextComponent> class0 = TextComponent.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), ((Class) (class0)));
        try {
            timeSeries0.delete((-3108), 1);
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test052() throws Throwable {
        Hour hour0 = new Hour();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), ((Class) (null)));
        try {
            timeSeries0.add(((RegularTimePeriod) (hour0)), ((Number) (hour0.FIRST_HOUR_IN_DAY)), false);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test062() throws Throwable {
        Hour hour0 = new Hour();
        Class<TextComponent> class0 = TextComponent.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), ((Class) (class0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (hour0)), ((Number) (0)));
        timeSeries0.delete(0, 0);
        Assert.assertEquals(0, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test064() throws Throwable {
        Hour hour0 = new Hour();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), ((Class) (null)));
        DefaultTableModel defaultTableModel0 = new DefaultTableModel(23, 23);
        Vector vector0 = defaultTableModel0.getDataVector();
        timeSeries0.data = ((List) (vector0));
        try {
            timeSeries0.removeAgedItems(false);
            Assert.fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
        }
    }

    @Test(timeout = 4000)
    public void test065() throws Throwable {
        Hour hour0 = new Hour();
        Class<TextComponent> class0 = TextComponent.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), ((Class) (class0)));
        timeSeries0.removeAgedItems(false);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test069() throws Throwable {
        Minute minute0 = new Minute();
        Class<Object> class0 = Object.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (minute0)), ((Class) (class0)));
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond();
        timeSeries0.getIndex(fixedMillisecond0);
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test070() throws Throwable {
        Hour hour0 = new Hour();
        Class<TextComponent> class0 = TextComponent.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), ((Class) (class0)));
        timeSeries0.getTimePeriodClass();
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test076() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        timeSeries0.getItemCount();
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(21);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        Day day1 = ((Day) (day0.next()));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day1)));
        timeSeries0.add(((RegularTimePeriod) (day0)), ((Number) (3)));
        TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(((RegularTimePeriod) (day1)), ((Number) (2)));
        timeSeries0.add(timeSeriesDataItem0, true);
        timeSeries0.hashCode();
        Assert.assertEquals(2, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        Hour hour0 = new Hour();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), ((Class) (null)));
        timeSeries0.hashCode();
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        Hour hour0 = new Hour();
        Class<TextComponent> class0 = TextComponent.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), ((Class) (null)));
        boolean boolean0 = timeSeries0.equals(class0);
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertFalse(boolean0);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test084() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(21);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(((RegularTimePeriod) (day0)), ((Number) (2)));
        timeSeries0.add(timeSeriesDataItem0, true);
        timeSeries0.delete(((RegularTimePeriod) (day0)));
        Assert.assertEquals(0, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test085() throws Throwable {
        Hour hour0 = new Hour();
        Class<TextComponent> class0 = TextComponent.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), ((Class) (class0)));
        timeSeries0.delete(((RegularTimePeriod) (hour0)));
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test086() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(((RegularTimePeriod) (day0)), ((Number) (2)));
        timeSeries0.add(timeSeriesDataItem0, true);
        timeSeries0.clear();
        Assert.assertEquals(0, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test087() throws Throwable {
        Hour hour0 = new Hour();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), ((Class) (null)));
        timeSeries0.clear();
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(((RegularTimePeriod) (day0)), ((Number) (2)));
        timeSeries0.add(timeSeriesDataItem0, true);
        timeSeries0.removeAgedItems(((long) (1900)), true);
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        timeSeries0.removeAgedItems(((long) (29)), true);
        timeSeries0.removeAgedItems(((long) (1900)), true);
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test090() throws Throwable {
        Hour hour0 = new Hour();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), ((Class) (null)));
        timeSeries0.setMaximumItemCount(0);
        timeSeries0.addOrUpdate(((RegularTimePeriod) (hour0)), ((Number) (23)));
        Assert.assertEquals(0, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test092() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(((RegularTimePeriod) (day0)), ((Number) (2)));
        timeSeries0.add(timeSeriesDataItem0, true);
        TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
        Assert.assertEquals("Time", timeSeries1.getDomainDescription());
        Assert.assertEquals("Value", timeSeries1.getRangeDescription());
        Assert.assertNotSame(timeSeries1, timeSeries0);
        Assert.assertEquals(2147483647, timeSeries1.getMaximumItemCount());
        Assert.assertEquals(1, timeSeries1.getItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test093() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(((RegularTimePeriod) (day0)), ((Number) (2)));
        timeSeries0.add(timeSeriesDataItem0, true);
        timeSeries0.update(((RegularTimePeriod) (day0)), ((Number) (0)));
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test096() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        Day day1 = ((Day) (day0.next()));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day1)));
        TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(((RegularTimePeriod) (day1)), ((Number) (2)));
        timeSeries0.add(timeSeriesDataItem0, true);
        timeSeries0.add(((RegularTimePeriod) (day0)), ((Number) (1)));
        int int0 = timeSeries0.getIndex(day1);
        Assert.assertEquals(2, timeSeries0.getItemCount());
        Assert.assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test097() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        Day day1 = ((Day) (day0.next()));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day1)));
        TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(((RegularTimePeriod) (day1)), ((Number) (2)));
        timeSeries0.add(((RegularTimePeriod) (day0)), ((Number) (1)));
        timeSeries0.add(timeSeriesDataItem0);
        timeSeries0.removeAgedItems(true);
        Assert.assertEquals(2, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Hour hour0 = new Hour();
        Class<TextComponent> class0 = TextComponent.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), ((Class) (class0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (hour0)), ((Number) (23)));
        timeSeries0.clone();
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test101() throws Throwable {
        Hour hour0 = new Hour();
        Class<TextComponent> class0 = TextComponent.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), ((Class) (class0)));
        timeSeries0.getValue(((RegularTimePeriod) (hour0)));
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test103() throws Throwable {
        Quarter quarter0 = new Quarter();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        TimeSeries timeSeries1 = timeSeries0.createCopy(((RegularTimePeriod) (quarter0)), ((RegularTimePeriod) (quarter0)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (quarter0)), (-4755.975272162351));
        TimeSeries timeSeries2 = timeSeries1.addAndOrUpdate(timeSeries0);
        timeSeries2.getTimePeriodsUniqueToOtherSeries(timeSeries1);
        Assert.assertEquals(1, timeSeries0.getItemCount());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test104() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(((RegularTimePeriod) (day0)), ((Number) (2)));
        timeSeries0.add(timeSeriesDataItem0, true);
        timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test105() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        timeSeries0.getTimePeriods();
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test106() throws Throwable {
        Hour hour0 = new Hour();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), ((Class) (null)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (hour0)), ((Number) (0)));
        timeSeries0.getDataItem(((RegularTimePeriod) (hour0)));
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test107() throws Throwable {
        Hour hour0 = new Hour();
        Class<TextComponent> class0 = TextComponent.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), ((Class) (class0)));
        timeSeries0.getDataItem(((RegularTimePeriod) (hour0)));
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test109() throws Throwable {
        Hour hour0 = new Hour();
        Class<TextComponent> class0 = TextComponent.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), ((Class) (class0)));
        timeSeries0.setMaximumItemAge(23);
        Assert.assertEquals(23L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test110() throws Throwable {
        Hour hour0 = new Hour();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), ((Class) (null)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (hour0)), ((Number) (0)));
        timeSeries0.setMaximumItemCount(0);
        Assert.assertEquals(0, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test113() throws Throwable {
        Hour hour0 = new Hour();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), ((Class) (null)));
        String string0 = timeSeries0.getRangeDescription();
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Value", string0);
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
    }

    @Test(timeout = 4000)
    public void test114() throws Throwable {
        Quarter quarter0 = new Quarter();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)));
        long long0 = timeSeries0.getMaximumItemAge();
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(9223372036854775807L, long0);
    }

    @Test(timeout = 4000)
    public void test115() throws Throwable {
        Quarter quarter0 = new Quarter();
        Class<Week> class0 = Week.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (quarter0)), ((Class) (class0)));
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        timeSeries0.setRangeDescription(((String) (null)));
        timeSeries0.hashCode();
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
    }

    @Test(timeout = 4000)
    public void test116() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        timeSeries0.add(((RegularTimePeriod) (day0)), ((Number) (1)));
        timeSeries0.getTimePeriods();
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test119() throws Throwable {
        Hour hour0 = new Hour();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), ((Class) (null)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (hour0)), ((Number) (0)));
        timeSeries0.getValue(((RegularTimePeriod) (hour0)));
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test120() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        try {
            timeSeries0.getNextTimePeriod();
            Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test(timeout = 4000)
    public void test121() throws Throwable {
        Class<TextComponent> class0 = TextComponent.class;
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) ("accessibleComponentBoundsChanged")), "", "", ((Class) (class0)));
        timeSeries0.getItems();
        Assert.assertEquals("", timeSeries0.getDomainDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("", timeSeries0.getRangeDescription());
    }

    @Test(timeout = 4000)
    public void test122() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        int int0 = timeSeries0.getMaximumItemCount();
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals(Integer.MAX_VALUE, int0);
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals("Time", timeSeries0.getDomainDescription());
    }

    @Test(timeout = 4000)
    public void test124() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        TimeSeriesDataItem timeSeriesDataItem0 = new TimeSeriesDataItem(((RegularTimePeriod) (day0)), ((Number) (2)));
        timeSeries0.add(timeSeriesDataItem0);
        timeSeries0.createCopy(((RegularTimePeriod) (day0)), ((RegularTimePeriod) (day0)));
        Assert.assertEquals(1, timeSeries0.getItemCount());
    }

    @Test(timeout = 4000)
    public void test125() throws Throwable {
        SpreadsheetDate spreadsheetDate0 = new SpreadsheetDate(29);
        Day day0 = new Day(((SerialDate) (spreadsheetDate0)));
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (day0)));
        String string0 = timeSeries0.getDomainDescription();
        Assert.assertEquals(2147483647, timeSeries0.getMaximumItemCount());
        Assert.assertEquals("Value", timeSeries0.getRangeDescription());
        Assert.assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
        Assert.assertEquals("Time", string0);
    }

    @Test(timeout = 4000)
    public void test047() throws Throwable {
        Hour hour0 = new Hour();
        TimeSeries timeSeries0 = new TimeSeries(((Comparable) (hour0)), ((Class) (null)));
        timeSeries0.addOrUpdate(((RegularTimePeriod) (hour0)), ((Number) (0)));
        {
            timeSeries0.clone();
        }
    }
}

