#!/bin/sh
#------------------------------------------------------------------------------
#   Copyright 2005 The Apache Software Foundation
#
#   Licensed under the Apache License, Version 2.0 (the "License");
#   you may not use this file except in compliance with the License.
#   You may obtain a copy of the License at
#
#       http://www.apache.org/licenses/LICENSE-2.0
#
#   Unless required by applicable law or agreed to in writing, software
#   distributed under the License is distributed on an "AS IS" BASIS,
#   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
#   See the License for the specific language governing permissions and
#   limitations under the License.
#------------------------------------------------------------------------------
# $Id$
#
# Runs only the unit tests in the package(s) specified by the argument.
#
# Usage:
#     testOnly.sh <package-spec>
#
# Examples:
#     testOnly.sh complex - runs all tests in the complex package
#     testOnly.sh stat/descriptive - runs tests in stat/descriptive package
#     testOnly.sh stat/** - runs tests in all subpackages of stat
#
# Requires:
#     version 1.7 or later of the maven test plugin
#
# Assumes:
#     * Test class names end in "Test.java"
#     * A test class is abstract iff its name embeds the string "Abstract"
#------------------------------------------------------------------------------

maven -Dtestmatchpattern="**/$1/*Test.java" \
-Dtestnotmatchpattern="**/*Abstract*" test:match
