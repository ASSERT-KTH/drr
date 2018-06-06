

package com.google.javascript.jscomp;


class JvmMetrics {
	private static int TABULAR_COLON_POS = 40;

	private static long ONE_KILO_BYTE = 1L << 10L;

	private static long ONE_MEGA_BYTE = 1L << 20L;

	private static long ONE_GIGA_BYTE = 1L << 30L;

	public static void maybeWriteJvmMetrics(java.io.PrintStream out, java.lang.String options) {
		if (options == null) {
			return ;
		}
		boolean verboseMode = false;
		boolean prettyMode = false;
		java.util.StringTokenizer st = new java.util.StringTokenizer(options, ":");
		if (st.hasMoreTokens()) {
			java.lang.String mode = st.nextToken();
			if (mode.equalsIgnoreCase("verbose")) {
				verboseMode = true;
			}
		}
		if (st.hasMoreTokens()) {
			java.lang.String mode = st.nextToken();
			if (mode.equalsIgnoreCase("pretty")) {
				prettyMode = true;
			}
		}
		if (st.hasMoreTokens()) {
			while (st.hasMoreTokens()) {
				java.lang.String types = st.nextToken();
				java.util.StringTokenizer typeSt = new java.util.StringTokenizer(types, ",");
				while (typeSt.hasMoreElements()) {
					java.lang.String type = typeSt.nextToken();
					com.google.javascript.jscomp.JvmMetrics.writeMetrics(out, type, verboseMode, prettyMode);
				} 
			} 
		}else {
			com.google.javascript.jscomp.JvmMetrics.writeMetrics(out, "all", verboseMode, prettyMode);
		}
	}

	private static void writeMetrics(java.io.PrintStream out, java.lang.String type, boolean verbose, boolean pretty) {
		if ((type.equals("gc")) || (type.equalsIgnoreCase("all"))) {
			com.google.javascript.jscomp.JvmMetrics.writeGarbageCollectionStats(out, verbose, pretty);
		}
		if ((type.equals("mem")) || (type.equalsIgnoreCase("all"))) {
			com.google.javascript.jscomp.JvmMetrics.writeMemoryMetrics(out, verbose, pretty);
		}
		if ((type.equals("jit")) || (type.equalsIgnoreCase("all"))) {
			com.google.javascript.jscomp.JvmMetrics.writeJitMetrics(out, verbose, pretty);
		}
	}

	private static void writeJitMetrics(java.io.PrintStream out, boolean verbose, boolean pretty) {
		java.lang.management.CompilationMXBean cBean = java.lang.management.ManagementFactory.getCompilationMXBean();
		java.lang.String name;
		if (verbose) {
			name = cBean.getName();
		}else {
			name = "total";
		}
		if (pretty) {
			out.println("\nJIT Stats");
			out.println(java.lang.String.format("\t%s jit time: %d ms", name, cBean.getTotalCompilationTime()));
		}else {
			out.println(com.google.javascript.jscomp.JvmMetrics.normalizeTabularColonPos(java.lang.String.format("%s-jit-time-ms : %d", com.google.javascript.jscomp.JvmMetrics.normalizeName(name), cBean.getTotalCompilationTime())));
		}
	}

	private static void writeOverallMemoryUsage(java.io.PrintStream out, java.lang.management.MemoryUsage usage, java.lang.String prefix, boolean pretty) {
		if (pretty) {
			out.format("\t%s\n", prefix);
			out.format("\t\tavailable         : %s\n", com.google.javascript.jscomp.JvmMetrics.formatBytes(usage.getMax()));
			out.format("\t\tcurrent           : %s\n", com.google.javascript.jscomp.JvmMetrics.formatBytes(usage.getUsed()));
		}else {
			prefix = com.google.javascript.jscomp.JvmMetrics.normalizeName(prefix);
			out.println(com.google.javascript.jscomp.JvmMetrics.normalizeTabularColonPos(java.lang.String.format((prefix + "-available-bytes : %d"), usage.getMax())));
			out.println(com.google.javascript.jscomp.JvmMetrics.normalizeTabularColonPos(java.lang.String.format((prefix + "-current-bytes : %d"), usage.getUsed())));
		}
	}

	private static void writePoolMemoryUsage(java.io.PrintStream out, java.lang.management.MemoryUsage usage, java.lang.management.MemoryUsage peakUsage, java.lang.String prefix, boolean pretty) {
		if (pretty) {
			out.format("\t\tavailable         : %s\n", com.google.javascript.jscomp.JvmMetrics.formatBytes(usage.getMax()));
			out.format("\t\tpeak              : %s\n", com.google.javascript.jscomp.JvmMetrics.formatBytes(peakUsage.getUsed()));
			out.format("\t\tcurrent           : %s\n", com.google.javascript.jscomp.JvmMetrics.formatBytes(usage.getUsed()));
		}else {
			out.println(com.google.javascript.jscomp.JvmMetrics.normalizeTabularColonPos(java.lang.String.format((prefix + "-available-bytes : %d"), usage.getMax())));
			out.println(com.google.javascript.jscomp.JvmMetrics.normalizeTabularColonPos(java.lang.String.format((prefix + "-peak-bytes : %d"), peakUsage.getUsed())));
			out.println(com.google.javascript.jscomp.JvmMetrics.normalizeTabularColonPos(java.lang.String.format((prefix + "-current-bytes : %d"), usage.getUsed())));
		}
	}

	private static void writeMemoryMetrics(java.io.PrintStream out, boolean verbose, boolean pretty) {
		if (pretty) {
			out.println("\nMemory usage");
		}
		if (verbose) {
			java.lang.management.MemoryMXBean overallMemBean = java.lang.management.ManagementFactory.getMemoryMXBean();
			java.lang.management.MemoryUsage usage = overallMemBean.getHeapMemoryUsage();
			com.google.javascript.jscomp.JvmMetrics.writeOverallMemoryUsage(out, usage, "Heap", pretty);
			usage = overallMemBean.getNonHeapMemoryUsage();
			com.google.javascript.jscomp.JvmMetrics.writeOverallMemoryUsage(out, usage, "Non-heap", pretty);
		}
		if (verbose) {
			java.util.List<java.lang.management.MemoryPoolMXBean> mpBeans = java.lang.management.ManagementFactory.getMemoryPoolMXBeans();
			for (java.lang.management.MemoryPoolMXBean mpBean : mpBeans) {
				java.lang.management.MemoryUsage currentUsage = mpBean.getUsage();
				java.lang.management.MemoryUsage peakUsage = mpBean.getPeakUsage();
				if (pretty) {
					out.println(("\tPool " + (mpBean.getName())));
					com.google.javascript.jscomp.JvmMetrics.writePoolMemoryUsage(out, currentUsage, peakUsage, null, true);
				}else {
					com.google.javascript.jscomp.JvmMetrics.writePoolMemoryUsage(out, currentUsage, peakUsage, ("mem-pool-" + (com.google.javascript.jscomp.JvmMetrics.normalizeName(mpBean.getName()))), false);
				}
			}
		}else {
			long available = 0;
			long current = 0;
			long peak = 0;
			java.util.List<java.lang.management.MemoryPoolMXBean> mpBeans = java.lang.management.ManagementFactory.getMemoryPoolMXBeans();
			for (java.lang.management.MemoryPoolMXBean mpBean : mpBeans) {
				java.lang.management.MemoryUsage currentUsage = mpBean.getUsage();
				available += currentUsage.getMax();
				current += currentUsage.getUsed();
				java.lang.management.MemoryUsage peakUsage = mpBean.getPeakUsage();
				peak += peakUsage.getUsed();
			}
			java.lang.management.MemoryUsage summaryUsage = new java.lang.management.MemoryUsage(0, current, current, available);
			java.lang.management.MemoryUsage summaryPeakUsage = new java.lang.management.MemoryUsage(0, peak, peak, peak);
			if (pretty) {
				out.format("\tAggregate of %d memory pools\n", mpBeans.size());
				com.google.javascript.jscomp.JvmMetrics.writePoolMemoryUsage(out, summaryUsage, summaryPeakUsage, null, true);
			}else {
				com.google.javascript.jscomp.JvmMetrics.writePoolMemoryUsage(out, summaryUsage, summaryPeakUsage, "mem", false);
			}
		}
	}

	private static void writeGarbageCollectionStats(java.io.PrintStream out, boolean verbose, boolean pretty) {
		java.util.List<java.lang.management.GarbageCollectorMXBean> gcBeans = java.lang.management.ManagementFactory.getGarbageCollectorMXBeans();
		if (verbose) {
			if (pretty) {
				out.println("\nGarbage collection stats");
				for (java.lang.management.GarbageCollectorMXBean gcBean : gcBeans) {
					out.println(("\tCollector " + (gcBean.getName())));
					out.format("\t\tcollection count   : %d\n", gcBean.getCollectionCount());
					out.format("\t\tcollection time    : %d ms\n", gcBean.getCollectionTime());
				}
			}else {
				for (java.lang.management.GarbageCollectorMXBean gcBean : gcBeans) {
					java.lang.String name = com.google.javascript.jscomp.JvmMetrics.normalizeName(gcBean.getName());
					out.println(com.google.javascript.jscomp.JvmMetrics.normalizeTabularColonPos(java.lang.String.format((("gc-" + name) + "-collection-count : %d"), gcBean.getCollectionCount())));
					out.println(com.google.javascript.jscomp.JvmMetrics.normalizeTabularColonPos(java.lang.String.format((("gc-" + name) + "-collection-time-ms : %d"), gcBean.getCollectionTime())));
				}
			}
		}else {
			long collectionCount = 0;
			long collectionTime = 0;
			int collectorCount = gcBeans.size();
			for (java.lang.management.GarbageCollectorMXBean gcBean : gcBeans) {
				collectionCount += gcBean.getCollectionCount();
				collectionTime += gcBean.getCollectionTime();
			}
			if (pretty) {
				out.println("\nGarbage collection stats");
				out.format("\tAggregate of %d collectors\n", collectorCount);
				out.format("\t\tcollection count   : %d\n", collectionCount);
				out.format("\t\tcollection time    : %d ms\n", collectionTime);
			}else {
				java.lang.String name = com.google.javascript.jscomp.JvmMetrics.normalizeName("aggregate");
				out.println(com.google.javascript.jscomp.JvmMetrics.normalizeTabularColonPos(java.lang.String.format((("gc-" + name) + "-collection-count : %d"), collectionCount)));
				out.println(com.google.javascript.jscomp.JvmMetrics.normalizeTabularColonPos(java.lang.String.format((("gc-" + name) + "-collection-time-ms : %d"), collectionTime)));
			}
		}
	}

	private static java.lang.String normalizeName(java.lang.String name) {
		return name.replace(" ", "_").toLowerCase();
	}

	private static java.lang.String normalizeTabularColonPos(java.lang.String string) {
		java.lang.StringBuilder sb = new java.lang.StringBuilder(string);
		int index = sb.indexOf(":");
		for (; index < (com.google.javascript.jscomp.JvmMetrics.TABULAR_COLON_POS); ++index) {
			sb.insert(index, ' ');
		}
		return sb.toString();
	}

	private static java.lang.String formatBytes(long numBytes) {
		if (numBytes < (com.google.javascript.jscomp.JvmMetrics.ONE_KILO_BYTE)) {
			return java.lang.String.format("%d B", numBytes);
		}else
			if (numBytes < (com.google.javascript.jscomp.JvmMetrics.ONE_MEGA_BYTE)) {
				return java.lang.String.format("%d KB", (numBytes / (com.google.javascript.jscomp.JvmMetrics.ONE_KILO_BYTE)));
			}else
				if (numBytes < (com.google.javascript.jscomp.JvmMetrics.ONE_GIGA_BYTE)) {
					return java.lang.String.format("%d MB", (numBytes / (com.google.javascript.jscomp.JvmMetrics.ONE_MEGA_BYTE)));
				}else {
					return java.lang.String.format("%d GB", (numBytes / (com.google.javascript.jscomp.JvmMetrics.ONE_GIGA_BYTE)));
				}
			
		
	}
}

