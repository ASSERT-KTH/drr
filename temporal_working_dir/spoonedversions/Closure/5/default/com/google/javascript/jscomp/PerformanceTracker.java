

package com.google.javascript.jscomp;


public class PerformanceTracker {
	private final com.google.javascript.rhino.Node jsRoot;

	private final boolean trackSize;

	private final boolean trackGzippedSize;

	private final com.google.javascript.jscomp.CodeChangeHandler.RecentChange codeChange = new com.google.javascript.jscomp.CodeChangeHandler.RecentChange();

	private int curCodeSizeEstimate = -1;

	private int curZippedCodeSizeEstimate = -1;

	private java.util.Deque<java.lang.String> currentRunningPass = new java.util.ArrayDeque<java.lang.String>();

	private final java.util.Map<java.lang.String, com.google.javascript.jscomp.PerformanceTracker.Stats> summary = com.google.common.collect.Maps.newHashMap();

	private com.google.common.collect.ImmutableMap<java.lang.String, com.google.javascript.jscomp.PerformanceTracker.Stats> summaryCopy = null;

	private final java.util.List<com.google.javascript.jscomp.PerformanceTracker.Stats> log = com.google.common.collect.Lists.newArrayList();

	public static class Stats {
		public Stats(java.lang.String pass) {
			this.pass = pass;
		}

		public final java.lang.String pass;

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
				this.trackGzippedSize = false;
				break;
			case RAW_SIZE :
				this.trackSize = true;
				this.trackGzippedSize = false;
				break;
			case ALL :
				this.trackSize = true;
				this.trackGzippedSize = true;
				break;
			case OFF :
			default :
				throw new java.lang.UnsupportedOperationException();
		}
	}

	com.google.javascript.jscomp.CodeChangeHandler getCodeChangeHandler() {
		return codeChange;
	}

	void recordPassStart(java.lang.String passName) {
		currentRunningPass.push(passName);
		codeChange.reset();
	}

	void recordPassStop(java.lang.String passName, long result) {
		java.lang.String currentPassName = currentRunningPass.pop();
		if (!(passName.equals(currentPassName))) {
			throw new java.lang.RuntimeException((passName + " is not running."));
		}
		com.google.javascript.jscomp.PerformanceTracker.CodeSizeEstimatePrinter printer = null;
		if ((codeChange.hasCodeChanged()) && ((trackSize) || (trackGzippedSize))) {
			printer = estimateCodeSize(jsRoot);
		}
		com.google.javascript.jscomp.PerformanceTracker.Stats logStats = new com.google.javascript.jscomp.PerformanceTracker.Stats(currentPassName);
		log.add(logStats);
		updateStats(logStats, result, printer);
		com.google.javascript.jscomp.PerformanceTracker.Stats summaryStats = summary.get(passName);
		if (summaryStats == null) {
			summaryStats = new com.google.javascript.jscomp.PerformanceTracker.Stats(passName);
			summary.put(passName, summaryStats);
		}
		updateStats(summaryStats, result, printer);
		if (printer != null) {
			if (trackSize) {
				curCodeSizeEstimate = printer.calcSize();
			}
			if (trackGzippedSize) {
				curZippedCodeSizeEstimate = printer.calcZippedSize();
			}
		}
	}

	private void updateStats(com.google.javascript.jscomp.PerformanceTracker.Stats stats, long result, com.google.javascript.jscomp.PerformanceTracker.CodeSizeEstimatePrinter printer) {
		stats.runtime += result;
		stats.runs += 1;
		if (codeChange.hasCodeChanged()) {
			stats.changes += 1;
		}
		if (printer != null) {
			com.google.javascript.jscomp.PerformanceTracker.recordSizeChange(curCodeSizeEstimate, printer.calcSize(), stats);
			com.google.javascript.jscomp.PerformanceTracker.recordGzSizeChange(curZippedCodeSizeEstimate, printer.calcZippedSize(), stats);
		}
	}

	private static void recordSizeChange(int oldSize, int newSize, com.google.javascript.jscomp.PerformanceTracker.Stats record) {
		if (oldSize != (-1)) {
			int delta = oldSize - newSize;
			if (delta > 0) {
				record.diff += delta;
			}
		}
		if (newSize != (-1)) {
			record.size = newSize;
		}
	}

	private static void recordGzSizeChange(int oldSize, int newSize, com.google.javascript.jscomp.PerformanceTracker.Stats record) {
		if (oldSize != (-1)) {
			int delta = oldSize - newSize;
			if (delta > 0) {
				record.gzDiff += delta;
			}
		}
		if (newSize != (-1)) {
			record.gzSize = newSize;
		}
	}

	private final com.google.javascript.jscomp.PerformanceTracker.CodeSizeEstimatePrinter estimateCodeSize(com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.PerformanceTracker.CodeSizeEstimatePrinter cp = new com.google.javascript.jscomp.PerformanceTracker.CodeSizeEstimatePrinter(trackGzippedSize);
		com.google.javascript.jscomp.CodeGenerator cg = new com.google.javascript.jscomp.CodeGenerator(cp, null, false);
		cg.add(root);
		return cp;
	}

	public com.google.common.collect.ImmutableMap<java.lang.String, com.google.javascript.jscomp.PerformanceTracker.Stats> getStats() {
		if ((summaryCopy) == null) {
			summaryCopy = com.google.common.collect.ImmutableMap.copyOf(summary);
		}
		return summaryCopy;
	}

	class CmpEntries implements java.util.Comparator<java.util.Map.Entry<java.lang.String, com.google.javascript.jscomp.PerformanceTracker.Stats>> {
		public int compare(java.util.Map.Entry<java.lang.String, com.google.javascript.jscomp.PerformanceTracker.Stats> e1, java.util.Map.Entry<java.lang.String, com.google.javascript.jscomp.PerformanceTracker.Stats> e2) {
			return ((int) ((e1.getValue().runtime) - (e2.getValue().runtime)));
		}
	}

	public void outputTracerReport(java.io.PrintStream pstr) {
		com.google.javascript.jscomp.JvmMetrics.maybeWriteJvmMetrics(pstr, "verbose:pretty:all");
		java.io.OutputStreamWriter output = new java.io.OutputStreamWriter(pstr);
		try {
			int runtime = 0;
			int runs = 0;
			int changes = 0;
			int diff = 0;
			int gzDiff = 0;
			output.write("Summary:\n");
			output.write("pass,runtime,runs,changingRuns,reduction,gzReduction\n");
			java.util.ArrayList<java.util.Map.Entry<java.lang.String, com.google.javascript.jscomp.PerformanceTracker.Stats>> a = new java.util.ArrayList<java.util.Map.Entry<java.lang.String, com.google.javascript.jscomp.PerformanceTracker.Stats>>();
			for (java.util.Map.Entry<java.lang.String, com.google.javascript.jscomp.PerformanceTracker.Stats> entry : summary.entrySet()) {
				a.add(entry);
			}
			java.util.Collections.sort(a, new com.google.javascript.jscomp.PerformanceTracker.CmpEntries());
			for (java.util.Map.Entry<java.lang.String, com.google.javascript.jscomp.PerformanceTracker.Stats> entry : a) {
				java.lang.String key = entry.getKey();
				com.google.javascript.jscomp.PerformanceTracker.Stats stats = entry.getValue();
				output.write(key);
				output.write(",");
				output.write(java.lang.String.valueOf(stats.runtime));
				runtime += stats.runtime;
				output.write(",");
				output.write(java.lang.String.valueOf(stats.runs));
				runs += stats.runs;
				output.write(",");
				output.write(java.lang.String.valueOf(stats.changes));
				changes += stats.changes;
				output.write(",");
				output.write(java.lang.String.valueOf(stats.diff));
				diff += stats.diff;
				output.write(",");
				output.write(java.lang.String.valueOf(stats.gzDiff));
				gzDiff += stats.gzDiff;
				output.write("\n");
			}
			output.write("TOTAL");
			output.write(",");
			output.write(java.lang.String.valueOf(runtime));
			output.write(",");
			output.write(java.lang.String.valueOf(runs));
			output.write(",");
			output.write(java.lang.String.valueOf(changes));
			output.write(",");
			output.write(java.lang.String.valueOf(diff));
			output.write(",");
			output.write(java.lang.String.valueOf(gzDiff));
			output.write("\n");
			output.write("\n");
			output.write("Log:\n");
			output.write("pass,runtime,runs,changingRuns,reduction,gzReduction,size,gzSize\n");
			for (com.google.javascript.jscomp.PerformanceTracker.Stats stats : log) {
				output.write(stats.pass);
				output.write(",");
				output.write(java.lang.String.valueOf(stats.runtime));
				output.write(",");
				output.write(java.lang.String.valueOf(stats.runs));
				output.write(",");
				output.write(java.lang.String.valueOf(stats.changes));
				output.write(",");
				output.write(java.lang.String.valueOf(stats.diff));
				output.write(",");
				output.write(java.lang.String.valueOf(stats.gzDiff));
				output.write(",");
				output.write(java.lang.String.valueOf(stats.size));
				output.write(",");
				output.write(java.lang.String.valueOf(stats.gzSize));
				output.write("\n");
			}
			output.write("\n");
			output.close();
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	private static final class CodeSizeEstimatePrinter extends com.google.javascript.jscomp.CodeConsumer {
		private final boolean trackGzippedSize;

		private int size = 0;

		private char lastChar = ' ';

		private final java.io.ByteArrayOutputStream output = new java.io.ByteArrayOutputStream();

		private final java.util.zip.GZIPOutputStream stream;

		private CodeSizeEstimatePrinter(boolean trackGzippedSize) {
			this.trackGzippedSize = trackGzippedSize;
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
				if (trackGzippedSize) {
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
			if (trackGzippedSize) {
				try {
					stream.finish();
					stream.flush();
					stream.close();
					return output.size();
				} catch (java.io.IOException e) {
					throw new java.lang.RuntimeException(e);
				}
			}else {
				return -1;
			}
		}
	}
}

