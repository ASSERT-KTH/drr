

package com.google.javascript.jscomp;


final class Tracer {
	static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.javascript.jscomp.Tracer.class.getName());

	private static volatile boolean defaultPrettyPrint;

	private static java.util.List<com.google.javascript.jscomp.Tracer.TracingStatistic> extraTracingStatistics = new java.util.concurrent.CopyOnWriteArrayList<com.google.javascript.jscomp.Tracer.TracingStatistic>();

	private long[] extraTracingValues;

	@javax.annotation.Nullable
	private final java.lang.String type;

	private final java.lang.String comment;

	private final long startTimeMs;

	private long stopTimeMs;

	final java.lang.Thread startThread;

	static final int MAX_TRACE_SIZE = 1000;

	static interface InternalClock {
		long currentTimeMillis();
	}

	static com.google.javascript.jscomp.Tracer.InternalClock clock = new com.google.javascript.jscomp.Tracer.InternalClock() {
		@java.lang.Override
		public long currentTimeMillis() {
			return java.lang.System.currentTimeMillis();
		}
	};

	Tracer(@javax.annotation.Nullable
	java.lang.String type, @javax.annotation.Nullable
	java.lang.String comment) {
		this.type = type;
		this.comment = (comment == null) ? "" : comment;
		startTimeMs = com.google.javascript.jscomp.Tracer.clock.currentTimeMillis();
		startThread = java.lang.Thread.currentThread();
		if (!(com.google.javascript.jscomp.Tracer.extraTracingStatistics.isEmpty())) {
			int size = com.google.javascript.jscomp.Tracer.extraTracingStatistics.size();
			extraTracingValues = new long[size];
			int i = 0;
			for (com.google.javascript.jscomp.Tracer.TracingStatistic tracingStatistic : com.google.javascript.jscomp.Tracer.extraTracingStatistics) {
				extraTracingValues[i] = tracingStatistic.start(startThread);
				i++;
			}
		}
		com.google.javascript.jscomp.Tracer.ThreadTrace trace = com.google.javascript.jscomp.Tracer.getThreadTrace();
		if (!(trace.isInitialized())) {
			return ;
		}
		if ((trace.events.size()) >= (com.google.javascript.jscomp.Tracer.MAX_TRACE_SIZE)) {
			com.google.javascript.jscomp.Tracer.logger.log(java.util.logging.Level.WARNING, ("Giant thread trace. Too many Tracers created. " + "Clearing to avoid memory leak."), new java.lang.Throwable(trace.toString()));
			trace.truncateEvents();
		}
		if ((trace.outstandingEvents.size()) >= (com.google.javascript.jscomp.Tracer.MAX_TRACE_SIZE)) {
			com.google.javascript.jscomp.Tracer.logger.log(java.util.logging.Level.WARNING, ("Too many outstanding Tracers. Tracer.stop() is missing " + (("or Tracer.stop() is not wrapped in a " + "try/finally block. ") + "Clearing to avoid memory leak.")), new java.lang.Throwable(trace.toString()));
			trace.truncateOutstandingEvents();
		}
		trace.startEvent(com.google.javascript.jscomp.Tracer.this);
	}

	Tracer(java.lang.String comment) {
		this(null, comment);
	}

	static com.google.javascript.jscomp.Tracer shortName(java.lang.Object object, java.lang.String comment) {
		if (object == null) {
			return new com.google.javascript.jscomp.Tracer(comment);
		}
		return new com.google.javascript.jscomp.Tracer(object.getClass().getSimpleName(), comment);
	}

	private static java.lang.String longToPaddedString(long v, int digits_column_width) {
		int digit_width = com.google.javascript.jscomp.Tracer.numDigits(v);
		java.lang.StringBuilder sb = new java.lang.StringBuilder();
		com.google.javascript.jscomp.Tracer.appendSpaces(sb, (digits_column_width - digit_width));
		sb.append(v);
		return sb.toString();
	}

	private static int numDigits(long n) {
		int i = 0;
		do {
			i++;
			n = n / 10;
		} while (n > 0 );
		return i;
	}

	@com.google.common.annotations.VisibleForTesting
	static void appendSpaces(java.lang.StringBuilder sb, int numSpaces) {
		if (numSpaces > 16) {
			com.google.javascript.jscomp.Tracer.logger.warning("Tracer.appendSpaces called with large numSpaces");
			numSpaces = 16;
		}
		while (numSpaces >= 5) {
			sb.append("     ");
			numSpaces -= 5;
		} 
		switch (numSpaces) {
			case 1 :
				sb.append(" ");
				break;
			case 2 :
				sb.append("  ");
				break;
			case 3 :
				sb.append("   ");
				break;
			case 4 :
				sb.append("    ");
				break;
		}
	}

	static int addTracingStatistic(com.google.javascript.jscomp.Tracer.TracingStatistic tracingStatistic) {
		if (tracingStatistic.enable()) {
			com.google.javascript.jscomp.Tracer.extraTracingStatistics.add(tracingStatistic);
			return com.google.javascript.jscomp.Tracer.extraTracingStatistics.lastIndexOf(tracingStatistic);
		}else {
			return -1;
		}
	}

	@com.google.common.annotations.VisibleForTesting
	static void clearTracingStatisticsTestingOnly() {
		com.google.javascript.jscomp.Tracer.extraTracingStatistics.clear();
	}

	long stop(int silence_threshold) {
		com.google.common.base.Preconditions.checkState(((java.lang.Thread.currentThread()) == (startThread)));
		com.google.javascript.jscomp.Tracer.ThreadTrace trace = com.google.javascript.jscomp.Tracer.getThreadTrace();
		if (!(trace.isInitialized())) {
			return 0;
		}
		stopTimeMs = com.google.javascript.jscomp.Tracer.clock.currentTimeMillis();
		if ((extraTracingValues) != null) {
			for (int i = 0; i < (extraTracingValues.length); i++) {
				long value = com.google.javascript.jscomp.Tracer.extraTracingStatistics.get(i).stop(startThread);
				extraTracingValues[i] = value - (extraTracingValues[i]);
			}
		}
		if (!(trace.isInitialized())) {
			return 0;
		}
		trace.endEvent(com.google.javascript.jscomp.Tracer.this, silence_threshold);
		return (stopTimeMs) - (startTimeMs);
	}

	long stop() {
		return stop((-1));
	}

	@java.lang.Override
	public java.lang.String toString() {
		if ((type) == null) {
			return comment;
		}else {
			return (("[" + (type)) + "] ") + (comment);
		}
	}

	static void setDefaultSilenceThreshold(int threshold) {
		com.google.javascript.jscomp.Tracer.getThreadTrace().defaultSilenceThreshold = threshold;
	}

	static void initCurrentThreadTrace() {
		com.google.javascript.jscomp.Tracer.ThreadTrace events = com.google.javascript.jscomp.Tracer.getThreadTrace();
		if (!(events.isEmpty())) {
			com.google.javascript.jscomp.Tracer.logger.log(java.util.logging.Level.WARNING, ("Non-empty timer log:\n" + events), new java.lang.Throwable());
			com.google.javascript.jscomp.Tracer.clearThreadTrace();
			events = com.google.javascript.jscomp.Tracer.getThreadTrace();
		}
		events.init();
	}

	static void initCurrentThreadTrace(int default_silence_threshold) {
		com.google.javascript.jscomp.Tracer.initCurrentThreadTrace();
		com.google.javascript.jscomp.Tracer.setDefaultSilenceThreshold(default_silence_threshold);
	}

	static java.lang.String getCurrentThreadTraceReport() {
		return com.google.javascript.jscomp.Tracer.getThreadTrace().toString();
	}

	static void logCurrentThreadTrace() {
		com.google.javascript.jscomp.Tracer.ThreadTrace trace = com.google.javascript.jscomp.Tracer.getThreadTrace();
		if (!(trace.isInitialized())) {
			com.google.javascript.jscomp.Tracer.logger.log(java.util.logging.Level.WARNING, ("Tracer log requested for this thread but was not " + "initialized using Tracer.initCurrentThreadTrace()."), new java.lang.Throwable());
			return ;
		}
		if (!(trace.isEmpty())) {
			com.google.javascript.jscomp.Tracer.logger.log(java.util.logging.Level.WARNING, "timers:\n{0}", com.google.javascript.jscomp.Tracer.getCurrentThreadTraceReport());
		}
	}

	static void clearCurrentThreadTrace() {
		com.google.javascript.jscomp.Tracer.clearThreadTrace();
	}

	static void logAndClearCurrentThreadTrace() {
		com.google.javascript.jscomp.Tracer.logCurrentThreadTrace();
		com.google.javascript.jscomp.Tracer.clearThreadTrace();
	}

	static void setPrettyPrint(boolean enabled) {
		com.google.javascript.jscomp.Tracer.defaultPrettyPrint = enabled;
	}

	static final class Stat {
		private int count;

		private int silent;

		private int clockTime;

		private int[] extraInfo;

		int getCount() {
			return count;
		}

		int getSilentCount() {
			return silent;
		}

		int getTotalTime() {
			return clockTime;
		}

		@com.google.common.annotations.VisibleForTesting
		int getExtraInfo(int index) {
			return index >= (extraInfo.length) ? 0 : extraInfo[index];
		}
	}

	@javax.annotation.Nullable
	private static com.google.javascript.jscomp.Tracer.AtomicTracerStatMap typeToCountMap;

	@javax.annotation.Nullable
	private static com.google.javascript.jscomp.Tracer.AtomicTracerStatMap typeToSilentMap;

	@javax.annotation.Nullable
	private static com.google.javascript.jscomp.Tracer.AtomicTracerStatMap typeToTimeMap;

	static synchronized void enableTypeMaps() {
		if ((com.google.javascript.jscomp.Tracer.typeToCountMap) == null) {
			com.google.javascript.jscomp.Tracer.typeToCountMap = new com.google.javascript.jscomp.Tracer.AtomicTracerStatMap();
			com.google.javascript.jscomp.Tracer.typeToSilentMap = new com.google.javascript.jscomp.Tracer.AtomicTracerStatMap();
			com.google.javascript.jscomp.Tracer.typeToTimeMap = new com.google.javascript.jscomp.Tracer.AtomicTracerStatMap();
		}
	}

	@javax.annotation.Nullable
	static java.util.Map<java.lang.String, java.lang.Long> getTypeToCountMap() {
		return (com.google.javascript.jscomp.Tracer.typeToCountMap) != null ? com.google.javascript.jscomp.Tracer.typeToCountMap.getMap() : null;
	}

	@javax.annotation.Nullable
	static java.util.Map<java.lang.String, java.lang.Long> getTypeToSilentMap() {
		return (com.google.javascript.jscomp.Tracer.typeToSilentMap) != null ? com.google.javascript.jscomp.Tracer.typeToSilentMap.getMap() : null;
	}

	@javax.annotation.Nullable
	static java.util.Map<java.lang.String, java.lang.Long> getTypeToTimeMap() {
		return (com.google.javascript.jscomp.Tracer.typeToTimeMap) != null ? com.google.javascript.jscomp.Tracer.typeToTimeMap.getMap() : null;
	}

	static com.google.javascript.jscomp.Tracer.Stat getStatsForType(java.lang.String type) {
		com.google.javascript.jscomp.Tracer.Stat stat = com.google.javascript.jscomp.Tracer.getThreadTrace().stats.get(type);
		return stat != null ? stat : com.google.javascript.jscomp.Tracer.ZERO_STAT;
	}

	private static final com.google.javascript.jscomp.Tracer.Stat ZERO_STAT = new com.google.javascript.jscomp.Tracer.Stat();

	private static java.lang.String formatTime(long time) {
		int sec = ((int) ((time / 1000) % 60));
		int ms = ((int) (time % 1000));
		return java.lang.String.format("%02d.%03d", sec, ms);
	}

	private static final class Event {
		boolean isStart;

		com.google.javascript.jscomp.Tracer tracer;

		Event(boolean start, com.google.javascript.jscomp.Tracer t) {
			isStart = start;
			tracer = t;
		}

		long eventTime() {
			return isStart ? tracer.startTimeMs : tracer.stopTimeMs;
		}

		java.lang.String toString(long prevEventTime, java.lang.String indent, int digitsColWidth) {
			java.lang.StringBuilder sb = new java.lang.StringBuilder(120);
			if (prevEventTime == (-1)) {
				com.google.javascript.jscomp.Tracer.appendSpaces(sb, digitsColWidth);
			}else {
				sb.append(com.google.javascript.jscomp.Tracer.longToPaddedString(((eventTime()) - prevEventTime), digitsColWidth));
			}
			sb.append(' ');
			sb.append(com.google.javascript.jscomp.Tracer.formatTime(eventTime()));
			if (isStart) {
				sb.append(" Start ");
				com.google.javascript.jscomp.Tracer.appendSpaces(sb, digitsColWidth);
				sb.append("   ");
			}else {
				sb.append(" Done ");
				long delta = (tracer.stopTimeMs) - (tracer.startTimeMs);
				sb.append(com.google.javascript.jscomp.Tracer.longToPaddedString(delta, digitsColWidth));
				sb.append(" ms ");
				if ((tracer.extraTracingValues) != null) {
					for (int i = 0; i < (tracer.extraTracingValues.length); i++) {
						delta = tracer.extraTracingValues[i];
						sb.append(java.lang.String.format("%4d", delta));
						sb.append(com.google.javascript.jscomp.Tracer.extraTracingStatistics.get(i).getUnits());
						sb.append(";  ");
					}
				}
			}
			sb.append(indent);
			sb.append(tracer.toString());
			return sb.toString();
		}
	}

	static final class ThreadTrace {
		int defaultSilenceThreshold;

		final java.util.ArrayList<com.google.javascript.jscomp.Tracer.Event> events = new java.util.ArrayList<com.google.javascript.jscomp.Tracer.Event>();

		final java.util.HashSet<com.google.javascript.jscomp.Tracer> outstandingEvents = new java.util.HashSet<com.google.javascript.jscomp.Tracer>();

		final java.util.Map<java.lang.String, com.google.javascript.jscomp.Tracer.Stat> stats = new java.util.HashMap<java.lang.String, com.google.javascript.jscomp.Tracer.Stat>();

		boolean isOutstandingEventsTruncated = false;

		boolean isEventsTruncated = false;

		boolean isInitialized = false;

		boolean prettyPrint = false;

		void init() {
			isInitialized = true;
		}

		boolean isInitialized() {
			return isInitialized;
		}

		void startEvent(com.google.javascript.jscomp.Tracer t) {
			events.add(new com.google.javascript.jscomp.Tracer.Event(true, t));
			boolean notAlreadyOutstanding = outstandingEvents.add(t);
			com.google.common.base.Preconditions.checkState(notAlreadyOutstanding);
		}

		void endEvent(com.google.javascript.jscomp.Tracer t, int silenceThreshold) {
			boolean wasOutstanding = outstandingEvents.remove(t);
			if (!wasOutstanding) {
				if (isOutstandingEventsTruncated) {
					com.google.javascript.jscomp.Tracer.logger.log(java.util.logging.Level.WARNING, ("event not found, probably because the event stack " + "overflowed and was truncated"), new java.lang.Throwable());
				}else {
					throw new java.lang.IllegalStateException();
				}
			}
			long elapsed = (t.stopTimeMs) - (t.startTimeMs);
			if (silenceThreshold == (-1)) {
				silenceThreshold = defaultSilenceThreshold;
			}
			if (elapsed < silenceThreshold) {
				boolean removed = false;
				for (int i = 0; i < (events.size()); i++) {
					com.google.javascript.jscomp.Tracer.Event e = events.get(i);
					if ((e.tracer) == t) {
						com.google.common.base.Preconditions.checkState(e.isStart);
						events.remove(i);
						removed = true;
						break;
					}
				}
				com.google.common.base.Preconditions.checkState((removed || (isEventsTruncated)));
			}else {
				events.add(new com.google.javascript.jscomp.Tracer.Event(false, t));
			}
			if ((t.type) != null) {
				com.google.javascript.jscomp.Tracer.Stat stat = stats.get(t.type);
				if (stat == null) {
					stat = new com.google.javascript.jscomp.Tracer.Stat();
					if (!(com.google.javascript.jscomp.Tracer.extraTracingStatistics.isEmpty())) {
						stat.extraInfo = new int[com.google.javascript.jscomp.Tracer.extraTracingStatistics.size()];
					}
					stats.put(t.type, stat);
				}
				(stat.count)++;
				if ((com.google.javascript.jscomp.Tracer.typeToCountMap) != null) {
					com.google.javascript.jscomp.Tracer.typeToCountMap.incrementBy(t.type, 1);
				}
				stat.clockTime += elapsed;
				if ((com.google.javascript.jscomp.Tracer.typeToTimeMap) != null) {
					com.google.javascript.jscomp.Tracer.typeToTimeMap.incrementBy(t.type, elapsed);
				}
				if (((stat.extraInfo) != null) && ((t.extraTracingValues) != null)) {
					int overlapLength = java.lang.Math.min(stat.extraInfo.length, t.extraTracingValues.length);
					for (int i = 0; i < overlapLength; i++) {
						stat.extraInfo[i] += t.extraTracingValues[i];
						com.google.javascript.jscomp.Tracer.AtomicTracerStatMap map = com.google.javascript.jscomp.Tracer.extraTracingStatistics.get(i).getTracingStat();
						if (map != null) {
							map.incrementBy(t.type, t.extraTracingValues[i]);
						}
					}
				}
				if (elapsed < silenceThreshold) {
					(stat.silent)++;
					if ((com.google.javascript.jscomp.Tracer.typeToSilentMap) != null) {
						com.google.javascript.jscomp.Tracer.typeToSilentMap.incrementBy(t.type, 1);
					}
				}
			}
		}

		boolean isEmpty() {
			return ((events.size()) == 0) && ((outstandingEvents.size()) == 0);
		}

		void truncateOutstandingEvents() {
			isOutstandingEventsTruncated = true;
			outstandingEvents.clear();
		}

		void truncateEvents() {
			isEventsTruncated = true;
			events.clear();
		}

		@java.lang.SuppressWarnings(value = "nullness")
		@java.lang.Override
		public java.lang.String toString() {
			int numDigits = getMaxDigits();
			java.lang.StringBuilder sb = new java.lang.StringBuilder();
			long etime = -1;
			java.util.LinkedList<java.lang.String> indent = prettyPrint ? new java.util.LinkedList<java.lang.String>() : null;
			for (com.google.javascript.jscomp.Tracer.Event e : events) {
				if (((prettyPrint) && (!(e.isStart))) && (!(indent.isEmpty()))) {
					indent.pop();
				}
				sb.append(" ");
				if (prettyPrint) {
					sb.append(e.toString(etime, com.google.common.base.Joiner.on("").join(indent), numDigits));
				}else {
					sb.append(e.toString(etime, "", 4));
				}
				etime = e.eventTime();
				sb.append('\n');
				if ((prettyPrint) && (e.isStart)) {
					indent.push("|  ");
				}
			}
			if ((outstandingEvents.size()) != 0) {
				long now = com.google.javascript.jscomp.Tracer.clock.currentTimeMillis();
				sb.append(" Unstopped timers:\n");
				for (com.google.javascript.jscomp.Tracer t : outstandingEvents) {
					sb.append("  ").append(t).append(" (").append((now - (t.startTimeMs))).append(" ms, started at ").append(com.google.javascript.jscomp.Tracer.formatTime(t.startTimeMs)).append(")\n");
				}
			}
			for (java.lang.String key : stats.keySet()) {
				com.google.javascript.jscomp.Tracer.Stat stat = stats.get(key);
				if ((stat.count) > 1) {
					sb.append(" TOTAL ").append(key).append(" ").append(stat.count).append(" (").append(stat.clockTime).append(" ms");
					if ((stat.extraInfo) != null) {
						for (int i = 0; i < (stat.extraInfo.length); i++) {
							sb.append("; ");
							sb.append(stat.extraInfo[i]).append(' ').append(com.google.javascript.jscomp.Tracer.extraTracingStatistics.get(i).getUnits());
						}
					}
					sb.append(")\n");
				}
			}
			return sb.toString();
		}

		private int getMaxDigits() {
			long etime = -1;
			long max_time = 0;
			for (com.google.javascript.jscomp.Tracer.Event e : events) {
				if (etime != (-1)) {
					long time = (e.eventTime()) - etime;
					max_time = java.lang.Math.max(max_time, time);
				}
				if (!(e.isStart)) {
					long time = (e.tracer.stopTimeMs) - (e.tracer.startTimeMs);
					max_time = java.lang.Math.max(max_time, time);
				}
				etime = e.eventTime();
			}
			return java.lang.Math.max(3, com.google.javascript.jscomp.Tracer.numDigits(max_time));
		}
	}

	private static java.lang.ThreadLocal<com.google.javascript.jscomp.Tracer.ThreadTrace> traces = new java.lang.ThreadLocal<com.google.javascript.jscomp.Tracer.ThreadTrace>();

	static com.google.javascript.jscomp.Tracer.ThreadTrace getThreadTrace() {
		com.google.javascript.jscomp.Tracer.ThreadTrace t = com.google.javascript.jscomp.Tracer.traces.get();
		if (t == null) {
			t = new com.google.javascript.jscomp.Tracer.ThreadTrace();
			t.prettyPrint = com.google.javascript.jscomp.Tracer.defaultPrettyPrint;
			com.google.javascript.jscomp.Tracer.traces.set(t);
		}
		return t;
	}

	static void clearThreadTrace() {
		com.google.javascript.jscomp.Tracer.traces.remove();
	}

	static interface TracingStatistic {
		long start(java.lang.Thread thread);

		long stop(java.lang.Thread thread);

		boolean enable();

		com.google.javascript.jscomp.Tracer.AtomicTracerStatMap getTracingStat();

		java.lang.String getUnits();
	}

	static final class AtomicTracerStatMap {
		private java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Long> map = new java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long>();

		@java.lang.SuppressWarnings(value = "nullness")
		void incrementBy(java.lang.String key, long delta) {
			java.lang.Long oldValue = map.get(key);
			if (oldValue == null) {
				oldValue = map.putIfAbsent(key, delta);
				if (oldValue == null) {
					return ;
				}else {
				}
			}
			while (true) {
				if (map.replace(key, oldValue, (oldValue + delta))) {
					break;
				}
				oldValue = map.get(key);
			} 
		}

		java.util.Map<java.lang.String, java.lang.Long> getMap() {
			return map;
		}
	}
}

