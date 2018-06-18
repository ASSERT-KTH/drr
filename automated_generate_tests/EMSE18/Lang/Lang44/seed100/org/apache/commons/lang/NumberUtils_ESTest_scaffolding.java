

package org.apache.commons.lang;

import org.evosuite.runtime.classhandling.ClassResetter;
import org.evosuite.runtime.classhandling.ClassStateSupport;

public class NumberUtils_ESTest_scaffolding {
    public static void setSystemProperties() {
    }

    private static void initializeClasses() {
        ClassStateSupport.initializeClasses(NumberUtils_ESTest_scaffolding.class.getClassLoader(), "org.apache.commons.lang.StringUtils", "org.apache.commons.lang.NumberUtils");
    }

    private static void resetClasses() {
        ClassResetter.getInstance().setClassLoader(NumberUtils_ESTest_scaffolding.class.getClassLoader());
        ClassStateSupport.resetClasses("org.apache.commons.lang.StringUtils");
    }
}

