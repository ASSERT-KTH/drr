/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang.time;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * Test suite for the Time package.
 *
 * @author Stephen Colebourne
 * @version $Id$
 */
public class TimeTestSuite extends TestCase {
    
    /**
     * Construct a new instance.
     */
    public TimeTestSuite(String name) {
        super(name);
    }

    /**
     * Command-line interface.
     */
    public static void main(String[] args) {
        TestRunner.run(suite());
    }

    /**
     * Get the suite of tests
     */
    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.setName("Commons-Lang-Time Tests");
        suite.addTest(DateUtilsTest.suite());
        suite.addTest(DateFormatUtilsTest.suite());
        suite.addTest(DurationFormatUtilsTest.suite());
        suite.addTest(StopWatchTest.suite());
        suite.addTest(FastDateFormatTest.suite());
        suite.addTest(DateUtilsFragmentTest.suite());
        suite.addTest(DateUtilsRoundingTest.suite());
        return suite;
    }
}
