

package com.google.javascript.jscomp;


class ExpandJqueryAliases extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.javascript.jscomp.ExpandJqueryAliases.class.getName());

	private static final java.util.Set<java.lang.String> JqueryExtendNames = com.google.common.collect.ImmutableSet.of("jQuery.extend", "jQuery.fn.extend", "jQuery.prototype.extend");

	ExpandJqueryAliases(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
	}

	public static boolean isJqueryExtendReference(com.google.javascript.rhino.Node n, java.lang.String qname) {
		if (com.google.javascript.jscomp.ExpandJqueryAliases.JqueryExtendNames.contains(qname)) {
			com.google.javascript.rhino.Node firstArgument = n.getNext();
			if (firstArgument == null) {
				return false;
			}
			com.google.javascript.rhino.Node secondArgument = firstArgument.getNext();
			if (((firstArgument.isObjectLit()) && (secondArgument == null)) || ((((firstArgument.isName()) && (secondArgument != null)) && (secondArgument.isObjectLit())) && ((secondArgument.getNext()) == null))) {
				return true;
			}
		}
		return false;
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if (compiler.getCodingConvention().isPrototypeAlias(n)) {
			replaceJqueryPrototypeAlias(n);
		}else
			if (n.isCall()) {
				com.google.javascript.rhino.Node callTarget = n.getFirstChild();
				java.lang.String qName = callTarget.getQualifiedName();
				if (com.google.javascript.jscomp.ExpandJqueryAliases.isJqueryExtendReference(callTarget, qName)) {
					replaceJqueryExtendCall(n);
				}
			}
		
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.ExpandJqueryAliases.logger.fine("Expanding Jquery Aliases");
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.ExpandJqueryAliases.this);
	}

	private void replaceJqueryPrototypeAlias(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node fn = n.getLastChild();
		if (fn != null) {
			n.replaceChild(fn, com.google.javascript.rhino.IR.string("prototype"));
			compiler.reportCodeChange();
		}
	}

	private void replaceJqueryExtendCall(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node callTarget = n.getFirstChild();
		com.google.javascript.rhino.Node objectToExtend = callTarget.getNext();
		com.google.javascript.rhino.Node extendArg = objectToExtend.getNext();
		if (extendArg == null) {
			extendArg = objectToExtend;
			objectToExtend = callTarget.getFirstChild();
		}
		if (!(extendArg.hasChildren()))
			return ;
		
		com.google.javascript.rhino.Node fncBlock = com.google.javascript.rhino.IR.block().srcref(n);
		while (extendArg.hasChildren()) {
			com.google.javascript.rhino.Node currentProp = extendArg.removeFirstChild();
			com.google.javascript.rhino.Node propValue = currentProp.removeFirstChild();
			com.google.javascript.rhino.Node newProp;
			if (currentProp.isQuotedString()) {
				newProp = com.google.javascript.rhino.IR.getelem(objectToExtend.cloneTree(), currentProp).srcref(currentProp);
			}else {
				newProp = com.google.javascript.rhino.IR.getprop(objectToExtend.cloneTree(), currentProp).srcref(currentProp);
			}
			com.google.javascript.rhino.Node assignNode = com.google.javascript.rhino.IR.assign(newProp, propValue).srcref(currentProp);
			fncBlock.addChildToBack(com.google.javascript.rhino.IR.exprResult(assignNode).srcref(currentProp));
		} 
		com.google.javascript.rhino.Node targetVal;
		if ("jQuery.prototype".equals(objectToExtend.getQualifiedName())) {
			targetVal = objectToExtend.getFirstChild().cloneTree();
		}else {
			targetVal = objectToExtend.cloneTree();
		}
		fncBlock.addChildToBack(com.google.javascript.rhino.IR.returnNode(targetVal).srcref(targetVal));
		com.google.javascript.rhino.Node fnc = com.google.javascript.rhino.IR.function(com.google.javascript.rhino.IR.name("").srcref(n), com.google.javascript.rhino.IR.paramList().srcref(n), fncBlock);
		n.replaceChild(callTarget, fnc);
		n.putBooleanProp(com.google.javascript.rhino.Node.FREE_CALL, true);
		while ((fnc.getNext()) != null) {
			n.removeChildAfter(fnc);
		} 
		compiler.reportCodeChange();
	}
}

