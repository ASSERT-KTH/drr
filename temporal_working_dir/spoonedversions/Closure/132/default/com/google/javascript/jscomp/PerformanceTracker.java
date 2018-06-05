

package com.google.javascript.jscomp;


public class PerformanceTracker {
	private final com.google.javascript.rhino.Node jsRoot;

	private final boolean trackSize;

	private final boolean trackGzSize;

	private final com.google.javascript.jscomp.CodeChangeHandler codeChange = new com.google.javascript.jscomp.CodeChangeHandler();

	private int initCodeSize = 0;

	private int initGzCodeSize = 0;

	private int runtime = 0;

	private int runs = 0;

	private int changes = 0;

	private int loopRuns = 0;

	private int loopChanges = 0;

	private int codeSize = 0;

	private int gzCodeSize = 0;

	private int diff = 0;

	private int gzDiff = 0;

	private java.util.Deque<com.google.javascript.jscomp.PerformanceTracker.Stats> currentPass = new java.util.ArrayDeque<com.google.javascript.jscomp.PerformanceTracker.Stats>();

	private final java.util.Map<java.lang.String, com.google.javascript.jscomp.PerformanceTracker.Stats> summary = com.google.common.collect.Maps.newHashMap();

	private com.google.common.collect.ImmutableMap<java.lang.String, com.google.javascript.jscomp.PerformanceTracker.Stats> summaryCopy = null;

	private final java.util.List<com.google.javascript.jscomp.PerformanceTracker.Stats> log = com.google.common.collect.Lists.newArrayList();

	public static class Stats {
		Stats(java.lang.String pass, boolean iot) {
			this.pass = pass;
			this.isOneTime = iot;
		}

		public final java.lang.String pass;

		public final boolean isOneTime;

		public long runtime = 0;

		public int runs = 0;

		public int changes = 0;

		public int diff = 0;

		public int gzDiff = 0;

		public int size = 0;

		public int gzSize = 0;
	}

	PerformanceTracker(com.google.javascript.rhino.Node jsRoot, com.google.javascript.jscomp.CompilerOptions.TracerMode mode) {
		this.jsRoot = jsRoot;
		switch (mode) {
			case TIMING_ONLY :
				this.trackSize = false;
				this.trackGzSize = false;
				break;
			case RAW_SIZE :
				this.trackSize = true;
				this.trackGzSize = false;
				break;
			case ALL :
				this.trackSize = true;
				this.trackGzSize = true;
				break;
			case OFF :
			default :
				throw new java.lang.UnsupportedOperationException();
		}
	}

	com.google.javascript.jscomp.CodeChangeHandler getCodeChangeHandler() {
		return codeChange;
	}

	void recordPassStart(java.lang.String passName, boolean isOneTime) {
		currentPass.push(new com.google.javascript.jscomp.PerformanceTracker.Stats(passName, isOneTime));
		codeChange.reset();
	}

	void recordPassStop(java.lang.String passName, long result) {
		com.google.javascript.jscomp.PerformanceTracker.Stats logStats = currentPass.pop();
		if (!(passName.equals(logStats.pass))) {
			throw new java.lang.RuntimeException((passName + " is not running."));
		}
		if ((passName.equals(com.google.javascript.jscomp.Compiler.PARSING_PASS_NAME)) && (trackSize)) {
			com.google.javascript.jscomp.PerformanceTracker.CodeSizeEstimatePrinter printer = new com.google.javascript.jscomp.PerformanceTracker.CodeSizeEstimatePrinter();
			com.google.javascript.jscomp.CodeGenerator.forCostEstimation(printer).add(jsRoot);
			initCodeSize = codeSize = printer.calcSize();
			if (com.google.javascript.jscomp.PerformanceTracker.this.trackGzSize) {
				initGzCodeSize = gzCodeSize = printer.calcZippedSize();
			}
		}
		log.add(logStats);
		com.google.javascript.jscomp.PerformanceTracker.Stats summaryStats = summary.get(passName);
		if (summaryStats == null) {
			summaryStats = new com.google.javascript.jscomp.PerformanceTracker.Stats(passName, logStats.isOneTime);
			summary.put(passName, summaryStats);
		}
		logStats.runtime = result;
		logStats.runs = 1;
		summaryStats.runtime += result;
		summaryStats.runs += 1;
		if (codeChange.hasCodeChanged()) {
			logStats.changes = 1;
			summaryStats.changes += 1;
		}
		if ((codeChange.hasCodeChanged()) && (trackSize)) {
			int newSize = 0;
			com.google.javascript.jscomp.PerformanceTracker.CodeSizeEstimatePrinter printer = new com.google.javascript.jscomp.PerformanceTracker.CodeSizeEstimatePrinter();
			com.google.javascript.jscomp.CodeGenerator.forCostEstimation(printer).add(jsRoot);
			if (trackSize) {
				newSize = printer.calcSize();
				logStats.diff = (codeSize) - newSize;
				summaryStats.diff += logStats.diff;
				codeSize = summaryStats.size = logStats.size = newSize;
			}
			if (trackGzSize) {
				newSize = printer.calcZippedSize();
				logStats.gzDiff = (gzCodeSize) - newSize;
				summaryStats.gzDiff += logStats.gzDiff;
				gzCodeSize = summaryStats.gzSize = logStats.gzSize = newSize;
			}
		}
	}

	public int getRuntime() {
		calcTotalStats();
		return runtime;
	}

	public int getSize() {
		calcTotalStats();
		return codeSize;
	}

	public int getGzSize() {
		calcTotalStats();
		return gzCodeSize;
	}

	public com.google.common.collect.ImmutableMap<java.lang.String, com.google.javascript.jscomp.PerformanceTracker.Stats> getStats() {
		calcTotalStats();
		return summaryCopy;
	}

	class CmpEntries implements java.util.Comparator<java.util.Map.Entry<java.lang.String, com.google.javascript.jscomp.PerformanceTracker.Stats>> {
		@java.lang.Override
		public int compare(java.util.Map.Entry<java.lang.String, com.google.javascript.jscomp.PerformanceTracker.Stats> e1, java.util.Map.Entry<java.lang.String, com.google.javascript.jscomp.PerformanceTracker.Stats> e2) {
			return ((int) ((e1.getValue().runtime) - (e2.getValue().runtime)));
		}
	}

	private void calcTotalStats() {
		if ((summaryCopy) != null) {
			return ;
		}
		summaryCopy = com.google.common.collect.ImmutableMap.copyOf(summary);
		for (java.util.Map.Entry<java.lang.String, com.google.javascript.jscomp.PerformanceTracker.Stats> entry : summary.entrySet()) {
			com.google.javascript.jscomp.PerformanceTracker.Stats stats = entry.getValue();
			runtime += stats.runtime;
			runs += stats.runs;
			changes += stats.changes;
			if (!(stats.isOneTime)) {
				loopRuns += stats.runs;
				loopChanges += stats.changes;
			}
			diff += stats.diff;
			gzDiff += stats.gzDiff;
		}
		com.google.common.base.Preconditions.checkState(((!(trackSize)) || ((initCodeSize) == ((diff) + (codeSize)))));
		com.google.common.base.Preconditions.checkState(((!(trackGzSize)) || ((initGzCodeSize) == ((gzDiff) + (gzCodeSize)))));
	}

	public void outputTracerReport(java.io.PrintStream pstr) {
		com.google.javascript.jscomp.JvmMetrics.maybeWriteJvmMetrics(pstr, "verbose:pretty:all");
		java.io.OutputStreamWriter output = new java.io.OutputStreamWriter(pstr);
		try {
			calcTotalStats();
			java.util.ArrayList<java.util.Map.Entry<java.lang.String, com.google.javascript.jscomp.PerformanceTracker.Stats>> a = new java.util.ArrayList<java.util.Map.Entry<java.lang.String, com.google.javascript.jscomp.PerformanceTracker.Stats>>();
			for (java.util.Map.Entry<java.lang.String, com.google.javascript.jscomp.PerformanceTracker.Stats> entry : summary.entrySet()) {
				a.add(entry);
			}
			java.util.Collections.sort(a, new com.google.javascript.jscomp.PerformanceTracker.CmpEntries());
			output.write(("Summary:\n" + "pass,runtime,runs,changingRuns,reduction,gzReduction\n"));
			for (java.util.Map.Entry<java.lang.String, com.google.javascript.jscomp.PerformanceTracker.Stats> entry : a) {
				java.lang.String key = entry.getKey();
				com.google.javascript.jscomp.PerformanceTracker.Stats stats = entry.getValue();
				output.write((((((((((((key + ",") + (java.lang.String.valueOf(stats.runtime))) + ",") + (java.lang.String.valueOf(stats.runs))) + ",") + (java.lang.String.valueOf(stats.changes))) + ",") + (java.lang.String.valueOf(stats.diff))) + ",") + (java.lang.String.valueOf(stats.gzDiff))) + "\n"));
			}
			output.write(((((((((((((((((((("\nTOTAL:" + "\nRuntime(ms): ") + (java.lang.String.valueOf(runtime))) + "\n#Runs: ") + (java.lang.String.valueOf(runs))) + "\n#Changing runs: ") + (java.lang.String.valueOf(changes))) + "\n#Loopable runs: ") + (java.lang.String.valueOf(loopRuns))) + "\n#Changing loopable runs: ") + (java.lang.String.valueOf(loopChanges))) + "\nReduction(bytes): ") + (java.lang.String.valueOf(diff))) + "\nGzReduction(bytes): ") + (java.lang.String.valueOf(gzDiff))) + "\nSize(bytes): ") + (java.lang.String.valueOf(codeSize))) + "\nGzSize(bytes): ") + (java.lang.String.valueOf(gzCodeSize))) + "\n\n"));
			output.write(("Log:\n" + "pass,runtime,runs,changingRuns,reduction,gzReduction,size,gzSize\n"));
			for (com.google.javascript.jscomp.PerformanceTracker.Stats stats : log) {
				output.write(((((((((((((((((stats.pass) + ",") + (java.lang.String.valueOf(stats.runtime))) + ",") + (java.lang.String.valueOf(stats.runs))) + ",") + (java.lang.String.valueOf(stats.changes))) + ",") + (java.lang.String.valueOf(stats.diff))) + ",") + (java.lang.String.valueOf(stats.gzDiff))) + ",") + (java.lang.String.valueOf(stats.size))) + ",") + (java.lang.String.valueOf(stats.gzSize))) + "\n"));
			}
			output.write("\n");
			output.close();
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	private final class CodeSizeEstimatePrinter extends com.google.javascript.jscomp.CodeConsumer {
		private int size = 0;

		private char lastChar = ' ';

		private final java.io.ByteArrayOutputStream output = new java.io.ByteArrayOutputStream();

		private final java.util.zip.GZIPOutputStream stream;

		private CodeSizeEstimatePrinter() {
			try {
				stream = new java.util.zip.GZIPOutputStream(output);
			} catch (java.io.IOException e) {
				throw new java.lang.RuntimeException(e);
			}
		}

		@java.lang.Override
		void append(java.lang.String str) {
			int len = str.length();
			if (len > 0) {
				size += len;
				lastChar = str.charAt((len - 1));
				if (trackGzSize) {
					try {
						stream.write(str.getBytes());
					} catch (java.io.IOException e) {
						throw new java.lang.RuntimeException(e);
					}
				}
			}
		}

		@java.lang.Override
		char getLastChar() {
			return lastChar;
		}

		private int calcSize() {
			return size;
		}

		private int calcZippedSize() {
			try {
				stream.finish();
				stream.flush();
				stream.close();
				return output.size();
			} catch (java.io.IOException e) {
				throw new java.lang.RuntimeException(e);
			}
		}
	}
}

