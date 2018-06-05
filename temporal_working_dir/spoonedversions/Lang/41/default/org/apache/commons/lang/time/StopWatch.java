

package org.apache.commons.lang.time;


public class StopWatch {
	private static final long NANO_2_MILLIS = 1000000L;

	private static final int STATE_UNSTARTED = 0;

	private static final int STATE_RUNNING = 1;

	private static final int STATE_STOPPED = 2;

	private static final int STATE_SUSPENDED = 3;

	private static final int STATE_UNSPLIT = 10;

	private static final int STATE_SPLIT = 11;

	private int runningState = org.apache.commons.lang.time.StopWatch.STATE_UNSTARTED;

	private int splitState = org.apache.commons.lang.time.StopWatch.STATE_UNSPLIT;

	private long startTime;

	private long startTimeMillis;

	private long stopTime;

	public StopWatch() {
		super();
	}

	public void start() {
		if ((org.apache.commons.lang.time.StopWatch.this.runningState) == (org.apache.commons.lang.time.StopWatch.STATE_STOPPED)) {
			throw new java.lang.IllegalStateException("Stopwatch must be reset before being restarted. ");
		}
		if ((org.apache.commons.lang.time.StopWatch.this.runningState) != (org.apache.commons.lang.time.StopWatch.STATE_UNSTARTED)) {
			throw new java.lang.IllegalStateException("Stopwatch already started. ");
		}
		org.apache.commons.lang.time.StopWatch.this.startTime = java.lang.System.nanoTime();
		org.apache.commons.lang.time.StopWatch.this.startTimeMillis = java.lang.System.currentTimeMillis();
		org.apache.commons.lang.time.StopWatch.this.runningState = org.apache.commons.lang.time.StopWatch.STATE_RUNNING;
	}

	public void stop() {
		if (((org.apache.commons.lang.time.StopWatch.this.runningState) != (org.apache.commons.lang.time.StopWatch.STATE_RUNNING)) && ((org.apache.commons.lang.time.StopWatch.this.runningState) != (org.apache.commons.lang.time.StopWatch.STATE_SUSPENDED))) {
			throw new java.lang.IllegalStateException("Stopwatch is not running. ");
		}
		if ((org.apache.commons.lang.time.StopWatch.this.runningState) == (org.apache.commons.lang.time.StopWatch.STATE_RUNNING)) {
			org.apache.commons.lang.time.StopWatch.this.stopTime = java.lang.System.nanoTime();
		}
		org.apache.commons.lang.time.StopWatch.this.runningState = org.apache.commons.lang.time.StopWatch.STATE_STOPPED;
	}

	public void reset() {
		org.apache.commons.lang.time.StopWatch.this.runningState = org.apache.commons.lang.time.StopWatch.STATE_UNSTARTED;
		org.apache.commons.lang.time.StopWatch.this.splitState = org.apache.commons.lang.time.StopWatch.STATE_UNSPLIT;
	}

	public void split() {
		if ((org.apache.commons.lang.time.StopWatch.this.runningState) != (org.apache.commons.lang.time.StopWatch.STATE_RUNNING)) {
			throw new java.lang.IllegalStateException("Stopwatch is not running. ");
		}
		org.apache.commons.lang.time.StopWatch.this.stopTime = java.lang.System.nanoTime();
		org.apache.commons.lang.time.StopWatch.this.splitState = org.apache.commons.lang.time.StopWatch.STATE_SPLIT;
	}

	public void unsplit() {
		if ((org.apache.commons.lang.time.StopWatch.this.splitState) != (org.apache.commons.lang.time.StopWatch.STATE_SPLIT)) {
			throw new java.lang.IllegalStateException("Stopwatch has not been split. ");
		}
		org.apache.commons.lang.time.StopWatch.this.splitState = org.apache.commons.lang.time.StopWatch.STATE_UNSPLIT;
	}

	public void suspend() {
		if ((org.apache.commons.lang.time.StopWatch.this.runningState) != (org.apache.commons.lang.time.StopWatch.STATE_RUNNING)) {
			throw new java.lang.IllegalStateException("Stopwatch must be running to suspend. ");
		}
		org.apache.commons.lang.time.StopWatch.this.stopTime = java.lang.System.nanoTime();
		org.apache.commons.lang.time.StopWatch.this.runningState = org.apache.commons.lang.time.StopWatch.STATE_SUSPENDED;
	}

	public void resume() {
		if ((org.apache.commons.lang.time.StopWatch.this.runningState) != (org.apache.commons.lang.time.StopWatch.STATE_SUSPENDED)) {
			throw new java.lang.IllegalStateException("Stopwatch must be suspended to resume. ");
		}
		org.apache.commons.lang.time.StopWatch.this.startTime += (java.lang.System.nanoTime()) - (org.apache.commons.lang.time.StopWatch.this.stopTime);
		org.apache.commons.lang.time.StopWatch.this.runningState = org.apache.commons.lang.time.StopWatch.STATE_RUNNING;
	}

	public long getTime() {
		return (getNanoTime()) / (org.apache.commons.lang.time.StopWatch.NANO_2_MILLIS);
	}

	public long getNanoTime() {
		if (((org.apache.commons.lang.time.StopWatch.this.runningState) == (org.apache.commons.lang.time.StopWatch.STATE_STOPPED)) || ((org.apache.commons.lang.time.StopWatch.this.runningState) == (org.apache.commons.lang.time.StopWatch.STATE_SUSPENDED))) {
			return (org.apache.commons.lang.time.StopWatch.this.stopTime) - (org.apache.commons.lang.time.StopWatch.this.startTime);
		}else
			if ((org.apache.commons.lang.time.StopWatch.this.runningState) == (org.apache.commons.lang.time.StopWatch.STATE_UNSTARTED)) {
				return 0;
			}else
				if ((org.apache.commons.lang.time.StopWatch.this.runningState) == (org.apache.commons.lang.time.StopWatch.STATE_RUNNING)) {
					return (java.lang.System.nanoTime()) - (org.apache.commons.lang.time.StopWatch.this.startTime);
				}
			
		
		throw new java.lang.RuntimeException("Illegal running state has occured. ");
	}

	public long getSplitTime() {
		return (getSplitNanoTime()) / (org.apache.commons.lang.time.StopWatch.NANO_2_MILLIS);
	}

	public long getSplitNanoTime() {
		if ((org.apache.commons.lang.time.StopWatch.this.splitState) != (org.apache.commons.lang.time.StopWatch.STATE_SPLIT)) {
			throw new java.lang.IllegalStateException("Stopwatch must be split to get the split time. ");
		}
		return (org.apache.commons.lang.time.StopWatch.this.stopTime) - (org.apache.commons.lang.time.StopWatch.this.startTime);
	}

	public long getStartTime() {
		if ((org.apache.commons.lang.time.StopWatch.this.runningState) == (org.apache.commons.lang.time.StopWatch.STATE_UNSTARTED)) {
			throw new java.lang.IllegalStateException("Stopwatch has not been started");
		}
		return org.apache.commons.lang.time.StopWatch.this.startTimeMillis;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return org.apache.commons.lang.time.DurationFormatUtils.formatDurationHMS(getTime());
	}

	public java.lang.String toSplitString() {
		return org.apache.commons.lang.time.DurationFormatUtils.formatDurationHMS(getSplitTime());
	}
}

