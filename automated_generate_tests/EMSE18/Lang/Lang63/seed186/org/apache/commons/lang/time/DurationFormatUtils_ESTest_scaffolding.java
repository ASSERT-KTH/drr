

package org.apache.commons.lang.time;

import org.evosuite.runtime.classhandling.ClassResetter;
import org.evosuite.runtime.classhandling.ClassStateSupport;

public class DurationFormatUtils_ESTest_scaffolding {
    public static void setSystemProperties() {
    }

    private static void initializeClasses() {
        ClassStateSupport.initializeClasses(DurationFormatUtils_ESTest_scaffolding.class.getClassLoader(), "org.apache.commons.lang.time.DurationFormatUtils$Token", "org.apache.commons.lang.StringUtils", "org.apache.commons.lang.time.DurationFormatUtils");
    }

    private static void resetClasses() {
        ClassResetter.getInstance().setClassLoader(DurationFormatUtils_ESTest_scaffolding.class.getClassLoader());
        ClassStateSupport.resetClasses("org.apache.commons.lang.time.DurationFormatUtils", "org.apache.commons.lang.StringUtils");
    }
}

