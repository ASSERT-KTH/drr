

package com.google.javascript.jscomp;


final class ParallelCompilerPass implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AstParallelizer splitter;

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final int numWorkers;

	private final com.google.common.base.Supplier<com.google.javascript.jscomp.ParallelCompilerPass.Task> taskSupply;

	private java.util.List<com.google.javascript.rhino.Node> worklist;

	public static interface Task {
		public com.google.javascript.jscomp.ParallelCompilerPass.Result processSubtree(com.google.javascript.rhino.Node subtree);
	}

	public static class Result {
		boolean changed = false;

		java.util.List<com.google.javascript.jscomp.JSError> errors = com.google.common.collect.Lists.newArrayList();

		java.util.List<java.lang.Exception> exceptions = com.google.common.collect.Lists.newArrayList();

		public Result() {
		}

		public Result(boolean changed) {
			com.google.javascript.jscomp.ParallelCompilerPass.Result.this.changed = changed;
		}

		private void combine(com.google.javascript.jscomp.ParallelCompilerPass.Result other) {
			changed = (changed) || (other.changed);
			errors.addAll(other.errors);
			exceptions.addAll(other.exceptions);
		}

		public void notifyCompiler(com.google.javascript.jscomp.AbstractCompiler c) {
			if (!(exceptions.isEmpty())) {
				throw new java.lang.RuntimeException(exceptions.get(0));
			}
			for (com.google.javascript.jscomp.JSError error : errors) {
				c.report(error);
			}
			if (changed) {
				c.reportCodeChange();
			}
		}
	}

	public ParallelCompilerPass(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.AstParallelizer splitter, com.google.common.base.Supplier<com.google.javascript.jscomp.ParallelCompilerPass.Task> taskSupply, int numWorkers) {
		com.google.common.base.Preconditions.checkArgument((numWorkers > 0));
		this.taskSupply = taskSupply;
		this.splitter = splitter;
		this.numWorkers = numWorkers;
		this.compiler = compiler;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		worklist = splitter.split();
		com.google.javascript.jscomp.ParallelCompilerPass.Result r = execute();
		splitter.join();
		r.notifyCompiler(compiler);
	}

	private com.google.javascript.jscomp.ParallelCompilerPass.Result execute() {
		int numChildThread = (numWorkers) - 1;
		java.lang.Thread[] workers = new java.lang.Thread[numChildThread];
		final com.google.javascript.jscomp.ParallelCompilerPass.Result[] results = new com.google.javascript.jscomp.ParallelCompilerPass.Result[numChildThread];
		for (int i = 0; i < numChildThread; i++) {
			final int index = i;
			java.lang.Thread worker = new java.lang.Thread() {
				@java.lang.Override
				public void run() {
					results[index] = processAllTasks();
				}
			};
			workers[i] = worker;
			worker.start();
		}
		com.google.javascript.jscomp.ParallelCompilerPass.Result result = processAllTasks();
		for (int i = 0; i < numChildThread; i++) {
			try {
				workers[i].join();
			} catch (java.lang.InterruptedException e) {
				result.exceptions.add(e);
				java.lang.Thread.currentThread().interrupt();
			}
		}
		for (int i = 0; i < numChildThread; i++) {
			result.combine(results[i]);
		}
		return result;
	}

	private com.google.javascript.jscomp.ParallelCompilerPass.Result processAllTasks() {
		com.google.javascript.jscomp.ParallelCompilerPass.Result result = new com.google.javascript.jscomp.ParallelCompilerPass.Result();
		while (true) {
			com.google.javascript.jscomp.ParallelCompilerPass.Result passResult = processTask();
			if (passResult == null) {
				break;
			}else {
				result.combine(passResult);
			}
		} 
		return result;
	}

	private com.google.javascript.jscomp.ParallelCompilerPass.Result processTask() {
		com.google.javascript.rhino.Node subtree = getTask();
		try {
			if (subtree == null) {
				return null;
			}else {
				return taskSupply.get().processSubtree(subtree);
			}
		} catch (java.lang.Exception e) {
			com.google.javascript.jscomp.ParallelCompilerPass.Result r = new com.google.javascript.jscomp.ParallelCompilerPass.Result(true);
			r.exceptions.add(e);
			return r;
		}
	}

	private synchronized com.google.javascript.rhino.Node getTask() {
		if (worklist.isEmpty()) {
			return null;
		}else {
			return worklist.remove(0);
		}
	}
}

