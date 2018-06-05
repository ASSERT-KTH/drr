/*
 * Copyright 2008 Google Inc.
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

package com.google.javascript.jscomp;

import com.google.common.collect.Lists;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.util.List;

/**
 * <p>Compiler pass that removes Google specific code patterns.</p>
 *
 * <p>Currently does the following:</p>
 *
 * <ul>
 *   <li> Instead  of setting abstract methods to a function that throws an
 *        informative error, this pass allows some binary size reduction by
 *        removing these methods altogether for production builds.</li>
 * </ul>
 *
*
 */
final class GoogleCodeRemoval implements CompilerPass {

  /** Reference to the JS compiler */
  private final AbstractCompiler compiler;

  /** Name used to denote an abstract function */
  static final String ABSTRACT_METHOD_NAME = "goog.abstractMethod";

  /**
   * List of names referenced in successive generations of finding referenced
   * nodes
   */
  private final List<RemovableAssignment> abstractMethodAssignmentNodes =
      Lists.newArrayList();


  /**
   * Utility class to track a node and its parent.
   */
  private class RemovableAssignment {
    /**
     * The node
     */
    final Node node;

    /**
     * Its parent
     */
    final Node parent;

    /**
     * Full chain of ASSIGN ancestors
     */
    final List<Node> assignAncestors = Lists.newArrayList();

    /**
     * The last ancestor
     */
    final Node lastAncestor;

    /**
     * Data structure for information about a removable assignment.
     *
     * @param nameNode The LHS
     * @param assignNode The parent ASSIGN node
     * @param traversal Access to further levels, assumed to start at 1
     */
    public RemovableAssignment(Node nameNode, Node assignNode,
        NodeTraversal traversal) {
      this.node = nameNode;
      this.parent = assignNode;

      Node ancestor = assignNode;
      do {
        ancestor = ancestor.getParent();
        assignAncestors.add(ancestor);
      } while (ancestor.getType() == Token.ASSIGN &&
               ancestor.getFirstChild().isQualifiedName());
      lastAncestor = ancestor.getParent();
    }

    /**
     * Remove this node.
     */
    public void remove() {
      Node rhs = node.getNext();
      Node last = parent;
      for (Node ancestor : assignAncestors) {
        if (NodeUtil.isExpressionNode(ancestor)) {
          lastAncestor.removeChild(ancestor);
        } else {
          rhs.detachFromParent();
          ancestor.replaceChild(last, rhs);
        }
        last = ancestor;
      }
      compiler.reportCodeChange();
    }
  }



  /**
   * Identifies all assignments of the abstract method to a variable.
   */
  private class FindAbstractMethods extends AbstractPostOrderCallback {

    public void visit(NodeTraversal t, Node n, Node parent) {
      if (n.getType() == Token.ASSIGN) {
        Node nameNode = n.getFirstChild();
        Node valueNode = n.getLastChild();

        if (nameNode.isQualifiedName() &&
            valueNode.isQualifiedName() &&
            ABSTRACT_METHOD_NAME.equals(valueNode.getQualifiedName())) {
          abstractMethodAssignmentNodes.add(new RemovableAssignment(
              n.getFirstChild(), n, t));
        }
      }
    }
  }



  /**
   * Creates an google code remover.
   *
   * @param compiler The AbstractCompiler
   */
  GoogleCodeRemoval(AbstractCompiler compiler) {
    this.compiler = compiler;
  }

  /**
   * {@inheritDoc}
   */
  public void process(Node externs, Node root) {
    NodeTraversal.traverse(compiler, root, new FindAbstractMethods());

    for (RemovableAssignment assignment : abstractMethodAssignmentNodes) {
      assignment.remove();
    }
  }
}
