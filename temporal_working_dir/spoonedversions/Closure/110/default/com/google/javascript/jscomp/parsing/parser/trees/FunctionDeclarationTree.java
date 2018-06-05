/*
 * Copyright 2011 The Closure Compiler Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.javascript.jscomp.parsing.parser.trees;

import com.google.javascript.jscomp.parsing.parser.IdentifierToken;
import com.google.javascript.jscomp.parsing.parser.util.SourceRange;

public class FunctionDeclarationTree extends ParseTree {

  public final IdentifierToken name;
  public final FormalParameterListTree formalParameterList;
  public final BlockTree functionBody;
  public final boolean isStatic;

  public FunctionDeclarationTree(SourceRange location, IdentifierToken name,
      boolean isStatic, FormalParameterListTree formalParameterList,
      BlockTree functionBody) {
    super(ParseTreeType.FUNCTION_DECLARATION, location);

    this.name = name;
    this.isStatic = isStatic;
    this.formalParameterList = formalParameterList;
    this.functionBody = functionBody;
  }
}
