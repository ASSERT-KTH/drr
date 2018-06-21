

package org.apache.commons.lang;

import org.evosuite.runtime.classhandling.ClassResetter;
import org.evosuite.runtime.classhandling.ClassStateSupport;
import java.util.Properties;

public class BooleanUtils_ESTest_scaffolding {
    private static final Properties defaultProperties = ((Properties) (System.getProperties().clone()));

    public static void setSystemProperties() {
        System.setProperties(((Properties) (BooleanUtils_ESTest_scaffolding.defaultProperties.clone())));
    }

    private static void initializeClasses() {
        ClassStateSupport.initializeClasses(BooleanUtils_ESTest_scaffolding.class.getClassLoader(), "org.apache.commons.lang.BooleanUtils", "org.apache.commons.lang.math.NumberUtils", "org.apache.commons.lang.ArrayUtils");
    }

    private static void resetClasses() {
        ClassResetter.getInstance().setClassLoader(BooleanUtils_ESTest_scaffolding.class.getClassLoader());
        ClassStateSupport.resetClasses("org.apache.commons.lang.math.NumberUtils", "org.apache.commons.lang.ArrayUtils");
    }
}

