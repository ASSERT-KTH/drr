

package org.apache.commons.lang;


public class SystemUtils {
	private static final java.lang.String OS_NAME_WINDOWS_PREFIX = "Windows";

	private static final java.lang.String USER_HOME_KEY = "user.home";

	private static final java.lang.String USER_DIR_KEY = "user.dir";

	private static final java.lang.String JAVA_IO_TMPDIR_KEY = "java.io.tmpdir";

	private static final java.lang.String JAVA_HOME_KEY = "java.home";

	public static final java.lang.String AWT_TOOLKIT = org.apache.commons.lang.SystemUtils.getSystemProperty("awt.toolkit");

	public static final java.lang.String FILE_ENCODING = org.apache.commons.lang.SystemUtils.getSystemProperty("file.encoding");

	public static final java.lang.String FILE_SEPARATOR = org.apache.commons.lang.SystemUtils.getSystemProperty("file.separator");

	public static final java.lang.String JAVA_AWT_FONTS = org.apache.commons.lang.SystemUtils.getSystemProperty("java.awt.fonts");

	public static final java.lang.String JAVA_AWT_GRAPHICSENV = org.apache.commons.lang.SystemUtils.getSystemProperty("java.awt.graphicsenv");

	public static final java.lang.String JAVA_AWT_HEADLESS = org.apache.commons.lang.SystemUtils.getSystemProperty("java.awt.headless");

	public static final java.lang.String JAVA_AWT_PRINTERJOB = org.apache.commons.lang.SystemUtils.getSystemProperty("java.awt.printerjob");

	public static final java.lang.String JAVA_CLASS_PATH = org.apache.commons.lang.SystemUtils.getSystemProperty("java.class.path");

	public static final java.lang.String JAVA_CLASS_VERSION = org.apache.commons.lang.SystemUtils.getSystemProperty("java.class.version");

	public static final java.lang.String JAVA_COMPILER = org.apache.commons.lang.SystemUtils.getSystemProperty("java.compiler");

	public static final java.lang.String JAVA_ENDORSED_DIRS = org.apache.commons.lang.SystemUtils.getSystemProperty("java.endorsed.dirs");

	public static final java.lang.String JAVA_EXT_DIRS = org.apache.commons.lang.SystemUtils.getSystemProperty("java.ext.dirs");

	public static final java.lang.String JAVA_HOME = org.apache.commons.lang.SystemUtils.getSystemProperty(org.apache.commons.lang.SystemUtils.JAVA_HOME_KEY);

	public static final java.lang.String JAVA_IO_TMPDIR = org.apache.commons.lang.SystemUtils.getSystemProperty(org.apache.commons.lang.SystemUtils.JAVA_IO_TMPDIR_KEY);

	public static final java.lang.String JAVA_LIBRARY_PATH = org.apache.commons.lang.SystemUtils.getSystemProperty("java.library.path");

	public static final java.lang.String JAVA_RUNTIME_NAME = org.apache.commons.lang.SystemUtils.getSystemProperty("java.runtime.name");

	public static final java.lang.String JAVA_RUNTIME_VERSION = org.apache.commons.lang.SystemUtils.getSystemProperty("java.runtime.version");

	public static final java.lang.String JAVA_SPECIFICATION_NAME = org.apache.commons.lang.SystemUtils.getSystemProperty("java.specification.name");

	public static final java.lang.String JAVA_SPECIFICATION_VENDOR = org.apache.commons.lang.SystemUtils.getSystemProperty("java.specification.vendor");

	public static final java.lang.String JAVA_SPECIFICATION_VERSION = org.apache.commons.lang.SystemUtils.getSystemProperty("java.specification.version");

	public static final java.lang.String JAVA_UTIL_PREFS_PREFERENCES_FACTORY = org.apache.commons.lang.SystemUtils.getSystemProperty("java.util.prefs.PreferencesFactory");

	public static final java.lang.String JAVA_VENDOR = org.apache.commons.lang.SystemUtils.getSystemProperty("java.vendor");

	public static final java.lang.String JAVA_VENDOR_URL = org.apache.commons.lang.SystemUtils.getSystemProperty("java.vendor.url");

	public static final java.lang.String JAVA_VERSION = org.apache.commons.lang.SystemUtils.getSystemProperty("java.version");

	public static final java.lang.String JAVA_VM_INFO = org.apache.commons.lang.SystemUtils.getSystemProperty("java.vm.info");

	public static final java.lang.String JAVA_VM_NAME = org.apache.commons.lang.SystemUtils.getSystemProperty("java.vm.name");

	public static final java.lang.String JAVA_VM_SPECIFICATION_NAME = org.apache.commons.lang.SystemUtils.getSystemProperty("java.vm.specification.name");

	public static final java.lang.String JAVA_VM_SPECIFICATION_VENDOR = org.apache.commons.lang.SystemUtils.getSystemProperty("java.vm.specification.vendor");

	public static final java.lang.String JAVA_VM_SPECIFICATION_VERSION = org.apache.commons.lang.SystemUtils.getSystemProperty("java.vm.specification.version");

	public static final java.lang.String JAVA_VM_VENDOR = org.apache.commons.lang.SystemUtils.getSystemProperty("java.vm.vendor");

	public static final java.lang.String JAVA_VM_VERSION = org.apache.commons.lang.SystemUtils.getSystemProperty("java.vm.version");

	public static final java.lang.String LINE_SEPARATOR = org.apache.commons.lang.SystemUtils.getSystemProperty("line.separator");

	public static final java.lang.String OS_ARCH = org.apache.commons.lang.SystemUtils.getSystemProperty("os.arch");

	public static final java.lang.String OS_NAME = org.apache.commons.lang.SystemUtils.getSystemProperty("os.name");

	public static final java.lang.String OS_VERSION = org.apache.commons.lang.SystemUtils.getSystemProperty("os.version");

	public static final java.lang.String PATH_SEPARATOR = org.apache.commons.lang.SystemUtils.getSystemProperty("path.separator");

	public static final java.lang.String USER_COUNTRY = (org.apache.commons.lang.SystemUtils.getSystemProperty("user.country")) == null ? org.apache.commons.lang.SystemUtils.getSystemProperty("user.region") : org.apache.commons.lang.SystemUtils.getSystemProperty("user.country");

	public static final java.lang.String USER_DIR = org.apache.commons.lang.SystemUtils.getSystemProperty(org.apache.commons.lang.SystemUtils.USER_DIR_KEY);

	public static final java.lang.String USER_HOME = org.apache.commons.lang.SystemUtils.getSystemProperty(org.apache.commons.lang.SystemUtils.USER_HOME_KEY);

	public static final java.lang.String USER_LANGUAGE = org.apache.commons.lang.SystemUtils.getSystemProperty("user.language");

	public static final java.lang.String USER_NAME = org.apache.commons.lang.SystemUtils.getSystemProperty("user.name");

	public static final java.lang.String USER_TIMEZONE = org.apache.commons.lang.SystemUtils.getSystemProperty("user.timezone");

	public static final java.lang.String JAVA_VERSION_TRIMMED = org.apache.commons.lang.SystemUtils.getJavaVersionTrimmed();

	public static final float JAVA_VERSION_FLOAT = org.apache.commons.lang.SystemUtils.getJavaVersionAsFloat();

	public static final int JAVA_VERSION_INT = org.apache.commons.lang.SystemUtils.getJavaVersionAsInt();

	public static final boolean IS_JAVA_1_1 = org.apache.commons.lang.SystemUtils.getJavaVersionMatches("1.1");

	public static final boolean IS_JAVA_1_2 = org.apache.commons.lang.SystemUtils.getJavaVersionMatches("1.2");

	public static final boolean IS_JAVA_1_3 = org.apache.commons.lang.SystemUtils.getJavaVersionMatches("1.3");

	public static final boolean IS_JAVA_1_4 = org.apache.commons.lang.SystemUtils.getJavaVersionMatches("1.4");

	public static final boolean IS_JAVA_1_5 = org.apache.commons.lang.SystemUtils.getJavaVersionMatches("1.5");

	public static final boolean IS_JAVA_1_6 = org.apache.commons.lang.SystemUtils.getJavaVersionMatches("1.6");

	public static final boolean IS_OS_AIX = org.apache.commons.lang.SystemUtils.getOSMatches("AIX");

	public static final boolean IS_OS_HP_UX = org.apache.commons.lang.SystemUtils.getOSMatches("HP-UX");

	public static final boolean IS_OS_IRIX = org.apache.commons.lang.SystemUtils.getOSMatches("Irix");

	public static final boolean IS_OS_LINUX = (org.apache.commons.lang.SystemUtils.getOSMatches("Linux")) || (org.apache.commons.lang.SystemUtils.getOSMatches("LINUX"));

	public static final boolean IS_OS_MAC = org.apache.commons.lang.SystemUtils.getOSMatches("Mac");

	public static final boolean IS_OS_MAC_OSX = org.apache.commons.lang.SystemUtils.getOSMatches("Mac OS X");

	public static final boolean IS_OS_OS2 = org.apache.commons.lang.SystemUtils.getOSMatches("OS/2");

	public static final boolean IS_OS_SOLARIS = org.apache.commons.lang.SystemUtils.getOSMatches("Solaris");

	public static final boolean IS_OS_SUN_OS = org.apache.commons.lang.SystemUtils.getOSMatches("SunOS");

	public static final boolean IS_OS_UNIX = ((((((org.apache.commons.lang.SystemUtils.IS_OS_AIX) || (org.apache.commons.lang.SystemUtils.IS_OS_HP_UX)) || (org.apache.commons.lang.SystemUtils.IS_OS_IRIX)) || (org.apache.commons.lang.SystemUtils.IS_OS_LINUX)) || (org.apache.commons.lang.SystemUtils.IS_OS_MAC_OSX)) || (org.apache.commons.lang.SystemUtils.IS_OS_SOLARIS)) || (org.apache.commons.lang.SystemUtils.IS_OS_SUN_OS);

	public static final boolean IS_OS_WINDOWS = org.apache.commons.lang.SystemUtils.getOSMatches(org.apache.commons.lang.SystemUtils.OS_NAME_WINDOWS_PREFIX);

	public static final boolean IS_OS_WINDOWS_2000 = org.apache.commons.lang.SystemUtils.getOSMatches(org.apache.commons.lang.SystemUtils.OS_NAME_WINDOWS_PREFIX, "5.0");

	public static final boolean IS_OS_WINDOWS_95 = org.apache.commons.lang.SystemUtils.getOSMatches(((org.apache.commons.lang.SystemUtils.OS_NAME_WINDOWS_PREFIX) + " 9"), "4.0");

	public static final boolean IS_OS_WINDOWS_98 = org.apache.commons.lang.SystemUtils.getOSMatches(((org.apache.commons.lang.SystemUtils.OS_NAME_WINDOWS_PREFIX) + " 9"), "4.1");

	public static final boolean IS_OS_WINDOWS_ME = org.apache.commons.lang.SystemUtils.getOSMatches(org.apache.commons.lang.SystemUtils.OS_NAME_WINDOWS_PREFIX, "4.9");

	public static final boolean IS_OS_WINDOWS_NT = org.apache.commons.lang.SystemUtils.getOSMatches(((org.apache.commons.lang.SystemUtils.OS_NAME_WINDOWS_PREFIX) + " NT"));

	public static final boolean IS_OS_WINDOWS_XP = org.apache.commons.lang.SystemUtils.getOSMatches(org.apache.commons.lang.SystemUtils.OS_NAME_WINDOWS_PREFIX, "5.1");

	public SystemUtils() {
		super();
	}

	public static float getJavaVersion() {
		return org.apache.commons.lang.SystemUtils.JAVA_VERSION_FLOAT;
	}

	private static float getJavaVersionAsFloat() {
		if ((org.apache.commons.lang.SystemUtils.JAVA_VERSION_TRIMMED) == null) {
			return 0.0F;
		}
		java.lang.String str = org.apache.commons.lang.SystemUtils.JAVA_VERSION_TRIMMED.substring(0, 3);
		if ((org.apache.commons.lang.SystemUtils.JAVA_VERSION_TRIMMED.length()) >= 5) {
			str = str + (org.apache.commons.lang.SystemUtils.JAVA_VERSION_TRIMMED.substring(4, 5));
		}
		try {
			return java.lang.Float.parseFloat(str);
		} catch (java.lang.Exception ex) {
			return 0;
		}
	}

	private static int getJavaVersionAsInt() {
		if ((org.apache.commons.lang.SystemUtils.JAVA_VERSION_TRIMMED) == null) {
			return 0;
		}
		java.lang.String str = org.apache.commons.lang.SystemUtils.JAVA_VERSION_TRIMMED.substring(0, 1);
		str = str + (org.apache.commons.lang.SystemUtils.JAVA_VERSION_TRIMMED.substring(2, 3));
		if ((org.apache.commons.lang.SystemUtils.JAVA_VERSION_TRIMMED.length()) >= 5) {
			str = str + (org.apache.commons.lang.SystemUtils.JAVA_VERSION_TRIMMED.substring(4, 5));
		}else {
			str = str + "0";
		}
		try {
			return java.lang.Integer.parseInt(str);
		} catch (java.lang.Exception ex) {
			return 0;
		}
	}

	private static java.lang.String getJavaVersionTrimmed() {
		if ((org.apache.commons.lang.SystemUtils.JAVA_VERSION) != null) {
			for (int i = 0; i < (org.apache.commons.lang.SystemUtils.JAVA_VERSION.length()); i++) {
				char ch = org.apache.commons.lang.SystemUtils.JAVA_VERSION.charAt(i);
				if ((ch >= '0') && (ch <= '9')) {
					return org.apache.commons.lang.SystemUtils.JAVA_VERSION.substring(i);
				}
			}
		}
		return null;
	}

	private static boolean getJavaVersionMatches(java.lang.String versionPrefix) {
		if ((org.apache.commons.lang.SystemUtils.JAVA_VERSION_TRIMMED) == null) {
			return false;
		}
		return org.apache.commons.lang.SystemUtils.JAVA_VERSION_TRIMMED.startsWith(versionPrefix);
	}

	private static boolean getOSMatches(java.lang.String osNamePrefix) {
		if ((org.apache.commons.lang.SystemUtils.OS_NAME) == null) {
			return false;
		}
		return org.apache.commons.lang.SystemUtils.OS_NAME.startsWith(osNamePrefix);
	}

	private static boolean getOSMatches(java.lang.String osNamePrefix, java.lang.String osVersionPrefix) {
		if (((org.apache.commons.lang.SystemUtils.OS_NAME) == null) || ((org.apache.commons.lang.SystemUtils.OS_VERSION) == null)) {
			return false;
		}
		return (org.apache.commons.lang.SystemUtils.OS_NAME.startsWith(osNamePrefix)) && (org.apache.commons.lang.SystemUtils.OS_VERSION.startsWith(osVersionPrefix));
	}

	private static java.lang.String getSystemProperty(java.lang.String property) {
		try {
			return java.lang.System.getProperty(property);
		} catch (java.lang.SecurityException ex) {
			java.lang.System.err.println((("Caught a SecurityException reading the system property '" + property) + "'; the SystemUtils property value will default to null."));
			return null;
		}
	}

	public static boolean isJavaVersionAtLeast(float requiredVersion) {
		return (org.apache.commons.lang.SystemUtils.JAVA_VERSION_FLOAT) >= requiredVersion;
	}

	public static boolean isJavaVersionAtLeast(int requiredVersion) {
		return (org.apache.commons.lang.SystemUtils.JAVA_VERSION_INT) >= requiredVersion;
	}

	public static boolean isJavaAwtHeadless() {
		return (org.apache.commons.lang.SystemUtils.JAVA_AWT_HEADLESS) != null ? org.apache.commons.lang.SystemUtils.JAVA_AWT_HEADLESS.equals(java.lang.Boolean.TRUE.toString()) : false;
	}

	public static java.io.File getJavaHome() {
		return new java.io.File(java.lang.System.getProperty(org.apache.commons.lang.SystemUtils.JAVA_HOME_KEY));
	}

	public static java.io.File getJavaIoTmpDir() {
		return new java.io.File(java.lang.System.getProperty(org.apache.commons.lang.SystemUtils.JAVA_IO_TMPDIR_KEY));
	}

	public static java.io.File getUserDir() {
		return new java.io.File(java.lang.System.getProperty(org.apache.commons.lang.SystemUtils.USER_DIR_KEY));
	}

	public static java.io.File getUserHome() {
		return new java.io.File(java.lang.System.getProperty(org.apache.commons.lang.SystemUtils.USER_HOME_KEY));
	}
}

