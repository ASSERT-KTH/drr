

package org.apache.commons.lang3.exception;


public class ExceptionUtils {
	static final java.lang.String WRAPPED_MARKER = " [wrapped] ";

	private static final java.lang.String[] CAUSE_METHOD_NAMES = new java.lang.String[]{ "getCause" , "getNextException" , "getTargetException" , "getException" , "getSourceException" , "getRootCause" , "getCausedByException" , "getNested" , "getLinkedException" , "getNestedException" , "getLinkedCause" , "getThrowable" };

	public ExceptionUtils() {
		super();
	}

	@java.lang.Deprecated
	public static java.lang.String[] getDefaultCauseMethodNames() {
		return org.apache.commons.lang3.ArrayUtils.clone(org.apache.commons.lang3.exception.ExceptionUtils.CAUSE_METHOD_NAMES);
	}

	@java.lang.Deprecated
	public static java.lang.Throwable getCause(java.lang.Throwable throwable) {
		return org.apache.commons.lang3.exception.ExceptionUtils.getCause(throwable, org.apache.commons.lang3.exception.ExceptionUtils.CAUSE_METHOD_NAMES);
	}

	@java.lang.Deprecated
	public static java.lang.Throwable getCause(java.lang.Throwable throwable, java.lang.String[] methodNames) {
		if (throwable == null) {
			return null;
		}
		if (methodNames == null) {
			methodNames = org.apache.commons.lang3.exception.ExceptionUtils.CAUSE_METHOD_NAMES;
		}
		for (int i = 0; i < (methodNames.length); i++) {
			java.lang.String methodName = methodNames[i];
			if (methodName != null) {
				java.lang.Throwable cause = org.apache.commons.lang3.exception.ExceptionUtils.getCauseUsingMethodName(throwable, methodName);
				if (cause != null) {
					return cause;
				}
			}
		}
		return null;
	}

	public static java.lang.Throwable getRootCause(java.lang.Throwable throwable) {
		java.util.List<java.lang.Throwable> list = org.apache.commons.lang3.exception.ExceptionUtils.getThrowableList(throwable);
		return (list.size()) < 2 ? null : ((java.lang.Throwable) (list.get(((list.size()) - 1))));
	}

	private static java.lang.Throwable getCauseUsingMethodName(java.lang.Throwable throwable, java.lang.String methodName) {
		java.lang.reflect.Method method = null;
		try {
			method = throwable.getClass().getMethod(methodName, ((java.lang.Class[]) (null)));
		} catch (java.lang.NoSuchMethodException ignored) {
		} catch (java.lang.SecurityException ignored) {
		}
		if ((method != null) && (java.lang.Throwable.class.isAssignableFrom(method.getReturnType()))) {
			try {
				return ((java.lang.Throwable) (method.invoke(throwable, org.apache.commons.lang3.ArrayUtils.EMPTY_OBJECT_ARRAY)));
			} catch (java.lang.IllegalAccessException ignored) {
			} catch (java.lang.IllegalArgumentException ignored) {
			} catch (java.lang.reflect.InvocationTargetException ignored) {
			}
		}
		return null;
	}

	public static int getThrowableCount(java.lang.Throwable throwable) {
		return org.apache.commons.lang3.exception.ExceptionUtils.getThrowableList(throwable).size();
	}

	public static java.lang.Throwable[] getThrowables(java.lang.Throwable throwable) {
		java.util.List<java.lang.Throwable> list = org.apache.commons.lang3.exception.ExceptionUtils.getThrowableList(throwable);
		return list.toArray(new java.lang.Throwable[list.size()]);
	}

	public static java.util.List<java.lang.Throwable> getThrowableList(java.lang.Throwable throwable) {
		java.util.List<java.lang.Throwable> list = new java.util.ArrayList<java.lang.Throwable>();
		while ((throwable != null) && ((list.contains(throwable)) == false)) {
			list.add(throwable);
			throwable = org.apache.commons.lang3.exception.ExceptionUtils.getCause(throwable);
		} 
		return list;
	}

	public static int indexOfThrowable(java.lang.Throwable throwable, java.lang.Class<?> clazz) {
		return org.apache.commons.lang3.exception.ExceptionUtils.indexOf(throwable, clazz, 0, false);
	}

	public static int indexOfThrowable(java.lang.Throwable throwable, java.lang.Class<?> clazz, int fromIndex) {
		return org.apache.commons.lang3.exception.ExceptionUtils.indexOf(throwable, clazz, fromIndex, false);
	}

	public static int indexOfType(java.lang.Throwable throwable, java.lang.Class<?> type) {
		return org.apache.commons.lang3.exception.ExceptionUtils.indexOf(throwable, type, 0, true);
	}

	public static int indexOfType(java.lang.Throwable throwable, java.lang.Class<?> type, int fromIndex) {
		return org.apache.commons.lang3.exception.ExceptionUtils.indexOf(throwable, type, fromIndex, true);
	}

	private static int indexOf(java.lang.Throwable throwable, java.lang.Class<?> type, int fromIndex, boolean subclass) {
		if ((throwable == null) || (type == null)) {
			return -1;
		}
		if (fromIndex < 0) {
			fromIndex = 0;
		}
		java.lang.Throwable[] throwables = org.apache.commons.lang3.exception.ExceptionUtils.getThrowables(throwable);
		if (fromIndex >= (throwables.length)) {
			return -1;
		}
		if (subclass) {
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

	public static void printRootCauseStackTrace(java.lang.Throwable throwable) {
		org.apache.commons.lang3.exception.ExceptionUtils.printRootCauseStackTrace(throwable, java.lang.System.err);
	}

	public static void printRootCauseStackTrace(java.lang.Throwable throwable, java.io.PrintStream stream) {
		if (throwable == null) {
			return ;
		}
		if (stream == null) {
			throw new java.lang.IllegalArgumentException("The PrintStream must not be null");
		}
		java.lang.String[] trace = org.apache.commons.lang3.exception.ExceptionUtils.getRootCauseStackTrace(throwable);
		for (int i = 0; i < (trace.length); i++) {
			stream.println(trace[i]);
		}
		stream.flush();
	}

	public static void printRootCauseStackTrace(java.lang.Throwable throwable, java.io.PrintWriter writer) {
		if (throwable == null) {
			return ;
		}
		if (writer == null) {
			throw new java.lang.IllegalArgumentException("The PrintWriter must not be null");
		}
		java.lang.String[] trace = org.apache.commons.lang3.exception.ExceptionUtils.getRootCauseStackTrace(throwable);
		for (int i = 0; i < (trace.length); i++) {
			writer.println(trace[i]);
		}
		writer.flush();
	}

	public static java.lang.String[] getRootCauseStackTrace(java.lang.Throwable throwable) {
		if (throwable == null) {
			return org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
		}
		java.lang.Throwable[] throwables = org.apache.commons.lang3.exception.ExceptionUtils.getThrowables(throwable);
		int count = throwables.length;
		java.util.List<java.lang.String> frames = new java.util.ArrayList<java.lang.String>();
		java.util.List<java.lang.String> nextTrace = org.apache.commons.lang3.exception.ExceptionUtils.getStackFrameList(throwables[(count - 1)]);
		for (int i = count; (--i) >= 0;) {
			java.util.List<java.lang.String> trace = nextTrace;
			if (i != 0) {
				nextTrace = org.apache.commons.lang3.exception.ExceptionUtils.getStackFrameList(throwables[(i - 1)]);
				org.apache.commons.lang3.exception.ExceptionUtils.removeCommonFrames(trace, nextTrace);
			}
			if (i == (count - 1)) {
				frames.add(throwables[i].toString());
			}else {
				frames.add(((org.apache.commons.lang3.exception.ExceptionUtils.WRAPPED_MARKER) + (throwables[i].toString())));
			}
			for (int j = 0; j < (trace.size()); j++) {
				frames.add(trace.get(j));
			}
		}
		return frames.toArray(new java.lang.String[0]);
	}

	public static void removeCommonFrames(java.util.List<java.lang.String> causeFrames, java.util.List<java.lang.String> wrapperFrames) {
		if ((causeFrames == null) || (wrapperFrames == null)) {
			throw new java.lang.IllegalArgumentException("The List must not be null");
		}
		int causeFrameIndex = (causeFrames.size()) - 1;
		int wrapperFrameIndex = (wrapperFrames.size()) - 1;
		while ((causeFrameIndex >= 0) && (wrapperFrameIndex >= 0)) {
			java.lang.String causeFrame = causeFrames.get(causeFrameIndex);
			java.lang.String wrapperFrame = wrapperFrames.get(wrapperFrameIndex);
			if (causeFrame.equals(wrapperFrame)) {
				causeFrames.remove(causeFrameIndex);
			}
			causeFrameIndex--;
			wrapperFrameIndex--;
		} 
	}

	public static java.lang.String getStackTrace(java.lang.Throwable throwable) {
		java.io.StringWriter sw = new java.io.StringWriter();
		java.io.PrintWriter pw = new java.io.PrintWriter(sw, true);
		throwable.printStackTrace(pw);
		return sw.getBuffer().toString();
	}

	public static java.lang.String[] getStackFrames(java.lang.Throwable throwable) {
		if (throwable == null) {
			return org.apache.commons.lang3.ArrayUtils.EMPTY_STRING_ARRAY;
		}
		return org.apache.commons.lang3.exception.ExceptionUtils.getStackFrames(org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(throwable));
	}

	static java.lang.String[] getStackFrames(java.lang.String stackTrace) {
		java.lang.String linebreak = org.apache.commons.lang3.SystemUtils.LINE_SEPARATOR;
		java.util.StringTokenizer frames = new java.util.StringTokenizer(stackTrace, linebreak);
		java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
		while (frames.hasMoreTokens()) {
			list.add(frames.nextToken());
		} 
		return list.toArray(new java.lang.String[list.size()]);
	}

	static java.util.List<java.lang.String> getStackFrameList(java.lang.Throwable t) {
		java.lang.String stackTrace = org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(t);
		java.lang.String linebreak = org.apache.commons.lang3.SystemUtils.LINE_SEPARATOR;
		java.util.StringTokenizer frames = new java.util.StringTokenizer(stackTrace, linebreak);
		java.util.List<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
		boolean traceStarted = false;
		while (frames.hasMoreTokens()) {
			java.lang.String token = frames.nextToken();
			int at = token.indexOf("at");
			if ((at != (-1)) && ((token.substring(0, at).trim().length()) == 0)) {
				traceStarted = true;
				list.add(token);
			}else
				if (traceStarted) {
					break;
				}
			
		} 
		return list;
	}

	public static java.lang.String getMessage(java.lang.Throwable th) {
		if (th == null) {
			return "";
		}
		java.lang.String clsName = org.apache.commons.lang3.ClassUtils.getShortClassName(th, null);
		java.lang.String msg = th.getMessage();
		return (clsName + ": ") + (org.apache.commons.lang3.StringUtils.defaultString(msg));
	}

	public static java.lang.String getRootCauseMessage(java.lang.Throwable th) {
		java.lang.Throwable root = org.apache.commons.lang3.exception.ExceptionUtils.getRootCause(th);
		root = (root == null) ? th : root;
		return org.apache.commons.lang3.exception.ExceptionUtils.getMessage(root);
	}
}

