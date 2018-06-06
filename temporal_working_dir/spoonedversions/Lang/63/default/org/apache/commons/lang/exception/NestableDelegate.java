

package org.apache.commons.lang.exception;


public class NestableDelegate implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private static final transient java.lang.String MUST_BE_THROWABLE = "The Nestable implementation passed to the NestableDelegate(Nestable) " + "constructor must extend java.lang.Throwable";

	private java.lang.Throwable nestable = null;

	public static boolean topDown = true;

	public static boolean trimStackFrames = true;

	public static boolean matchSubclasses = true;

	public NestableDelegate(org.apache.commons.lang.exception.Nestable nestable) {
		if (nestable instanceof java.lang.Throwable) {
			org.apache.commons.lang.exception.NestableDelegate.this.nestable = ((java.lang.Throwable) (nestable));
		}else {
			throw new java.lang.IllegalArgumentException(org.apache.commons.lang.exception.NestableDelegate.MUST_BE_THROWABLE);
		}
	}

	public java.lang.String getMessage(int index) {
		java.lang.Throwable t = org.apache.commons.lang.exception.NestableDelegate.this.getThrowable(index);
		if (org.apache.commons.lang.exception.Nestable.class.isInstance(t)) {
			return ((org.apache.commons.lang.exception.Nestable) (t)).getMessage(0);
		}
		return t.getMessage();
	}

	public java.lang.String getMessage(java.lang.String baseMsg) {
		java.lang.Throwable nestedCause = org.apache.commons.lang.exception.ExceptionUtils.getCause(org.apache.commons.lang.exception.NestableDelegate.this.nestable);
		java.lang.String causeMsg = nestedCause == null ? null : nestedCause.getMessage();
		if ((nestedCause == null) || (causeMsg == null)) {
			return baseMsg;
		}
		if (baseMsg == null) {
			return causeMsg;
		}
		return (baseMsg + ": ") + causeMsg;
	}

	public java.lang.String[] getMessages() {
		java.lang.Throwable[] throwables = org.apache.commons.lang.exception.NestableDelegate.this.getThrowables();
		java.lang.String[] msgs = new java.lang.String[throwables.length];
		for (int i = 0; i < (throwables.length); i++) {
			msgs[i] = (org.apache.commons.lang.exception.Nestable.class.isInstance(throwables[i])) ? ((org.apache.commons.lang.exception.Nestable) (throwables[i])).getMessage(0) : throwables[i].getMessage();
		}
		return msgs;
	}

	public java.lang.Throwable getThrowable(int index) {
		if (index == 0) {
			return org.apache.commons.lang.exception.NestableDelegate.this.nestable;
		}
		java.lang.Throwable[] throwables = org.apache.commons.lang.exception.NestableDelegate.this.getThrowables();
		return throwables[index];
	}

	public int getThrowableCount() {
		return org.apache.commons.lang.exception.ExceptionUtils.getThrowableCount(org.apache.commons.lang.exception.NestableDelegate.this.nestable);
	}

	public java.lang.Throwable[] getThrowables() {
		return org.apache.commons.lang.exception.ExceptionUtils.getThrowables(org.apache.commons.lang.exception.NestableDelegate.this.nestable);
	}

	public int indexOfThrowable(java.lang.Class type, int fromIndex) {
		if (type == null) {
			return -1;
		}
		if (fromIndex < 0) {
			throw new java.lang.IndexOutOfBoundsException(("The start index was out of bounds: " + fromIndex));
		}
		java.lang.Throwable[] throwables = org.apache.commons.lang.exception.ExceptionUtils.getThrowables(org.apache.commons.lang.exception.NestableDelegate.this.nestable);
		if (fromIndex >= (throwables.length)) {
			throw new java.lang.IndexOutOfBoundsException(((("The start index was out of bounds: " + fromIndex) + " >= ") + (throwables.length)));
		}
		if (org.apache.commons.lang.exception.NestableDelegate.matchSubclasses) {
			for (int i = fromIndex; i < (throwables.length); i++) {
				if (type.isAssignableFrom(throwables[i].getClass())) {
					return i;
				}
			}
		}else {
			for (int i = fromIndex; i < (throwables.length); i++) {
				if (type.equals(throwables[i].getClass())) {
					return i;
				}
			}
		}
		return -1;
	}

	public void printStackTrace() {
		printStackTrace(java.lang.System.err);
	}

	public void printStackTrace(java.io.PrintStream out) {
		synchronized(out) {
			java.io.PrintWriter pw = new java.io.PrintWriter(out, false);
			printStackTrace(pw);
			pw.flush();
		}
	}

	public void printStackTrace(java.io.PrintWriter out) {
		java.lang.Throwable throwable = org.apache.commons.lang.exception.NestableDelegate.this.nestable;
		if (org.apache.commons.lang.exception.ExceptionUtils.isThrowableNested()) {
			if (throwable instanceof org.apache.commons.lang.exception.Nestable) {
				((org.apache.commons.lang.exception.Nestable) (throwable)).printPartialStackTrace(out);
			}else {
				throwable.printStackTrace(out);
			}
			return ;
		}
		java.util.List stacks = new java.util.ArrayList();
		while (throwable != null) {
			java.lang.String[] st = getStackFrames(throwable);
			stacks.add(st);
			throwable = org.apache.commons.lang.exception.ExceptionUtils.getCause(throwable);
		} 
		java.lang.String separatorLine = "Caused by: ";
		if (!(org.apache.commons.lang.exception.NestableDelegate.topDown)) {
			separatorLine = "Rethrown as: ";
			java.util.Collections.reverse(stacks);
		}
		if (org.apache.commons.lang.exception.NestableDelegate.trimStackFrames) {
			trimStackFrames(stacks);
		}
		synchronized(out) {
			for (java.util.Iterator iter = stacks.iterator(); iter.hasNext();) {
				java.lang.String[] st = ((java.lang.String[]) (iter.next()));
				for (int i = 0, len = st.length; i < len; i++) {
					out.println(st[i]);
				}
				if (iter.hasNext()) {
					out.print(separatorLine);
				}
			}
		}
	}

	protected java.lang.String[] getStackFrames(java.lang.Throwable t) {
		java.io.StringWriter sw = new java.io.StringWriter();
		java.io.PrintWriter pw = new java.io.PrintWriter(sw, true);
		if (t instanceof org.apache.commons.lang.exception.Nestable) {
			((org.apache.commons.lang.exception.Nestable) (t)).printPartialStackTrace(pw);
		}else {
			t.printStackTrace(pw);
		}
		return org.apache.commons.lang.exception.ExceptionUtils.getStackFrames(sw.getBuffer().toString());
	}

	protected void trimStackFrames(java.util.List stacks) {
		for (int size = stacks.size(), i = size - 1; i > 0; i--) {
			java.lang.String[] curr = ((java.lang.String[]) (stacks.get(i)));
			java.lang.String[] next = ((java.lang.String[]) (stacks.get((i - 1))));
			java.util.List currList = new java.util.ArrayList(java.util.Arrays.asList(curr));
			java.util.List nextList = new java.util.ArrayList(java.util.Arrays.asList(next));
			org.apache.commons.lang.exception.ExceptionUtils.removeCommonFrames(currList, nextList);
			int trimmed = (curr.length) - (currList.size());
			if (trimmed > 0) {
				currList.add((("\t... " + trimmed) + " more"));
				stacks.set(i, currList.toArray(new java.lang.String[currList.size()]));
			}
		}
	}
}

