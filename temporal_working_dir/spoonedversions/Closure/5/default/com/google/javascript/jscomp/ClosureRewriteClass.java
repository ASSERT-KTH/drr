

package com.google.javascript.jscomp;


class ClosureRewriteClass extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.HotSwapCompilerPass {
	static final com.google.javascript.jscomp.DiagnosticType GOOG_CLASS_TARGET_INVALID = com.google.javascript.jscomp.DiagnosticType.error("JSC_GOOG_CLASS_TARGET_INVALID", "Unsupported class definition expression.");

	static final com.google.javascript.jscomp.DiagnosticType GOOG_CLASS_SUPER_CLASS_NOT_VALID = com.google.javascript.jscomp.DiagnosticType.error("JSC_GOOG_CLASS_SUPER_CLASS_NOT_VALID", "The super class must be null or a valid name reference");

	static final com.google.javascript.jscomp.DiagnosticType GOOG_CLASS_DESCRIPTOR_NOT_VALID = com.google.javascript.jscomp.DiagnosticType.error("JSC_GOOG_CLASS_DESCRIPTOR_NOT_VALID", "The class descriptor must be an object literal");

	static final com.google.javascript.jscomp.DiagnosticType GOOG_CLASS_CONSTRUCTOR_MISING = com.google.javascript.jscomp.DiagnosticType.error("JSC_GOOG_CLASS_CONSTRUCTOR_MISING", "The constructor expression is missing for the class descriptor");

	static final com.google.javascript.jscomp.DiagnosticType GOOG_CLASS_STATICS_NOT_VALID = com.google.javascript.jscomp.DiagnosticType.error("JSC_GOOG_CLASS_STATICS_NOT_VALID", "The class statics descriptor must be an object or function literal");

	static final com.google.javascript.jscomp.DiagnosticType GOOG_CLASS_UNEXPECTED_PARAMS = com.google.javascript.jscomp.DiagnosticType.error("JSC_GOOG_CLASS_UNEXPECTED_PARAMS", "The class definition has too many arguments.");

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	public ClosureRewriteClass(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.ClosureRewriteClass.this);
	}

	@java.lang.Override
	public void hotSwapScript(com.google.javascript.rhino.Node scriptRoot, com.google.javascript.rhino.Node originalRoot) {
		com.google.javascript.jscomp.ClosureRewriteClass.this.compiler.process(com.google.javascript.jscomp.ClosureRewriteClass.this);
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if ((n.isCall()) && (isGoogDefineClass(n))) {
			if (!(validateUsage(n))) {
				compiler.report(com.google.javascript.jscomp.JSError.make(n, com.google.javascript.jscomp.ClosureRewriteClass.GOOG_CLASS_TARGET_INVALID));
			}
		}
		maybeRewriteClassDefinition(n);
	}

	private boolean validateUsage(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node parent = n.getParent();
		switch (parent.getType()) {
			case com.google.javascript.rhino.Token.NAME :
				return true;
			case com.google.javascript.rhino.Token.ASSIGN :
				return (n == (parent.getLastChild())) && (parent.getParent().isExprResult());
			case com.google.javascript.rhino.Token.STRING_KEY :
				return isContainedInGoogDefineClass(parent);
		}
		return false;
	}

	private boolean isContainedInGoogDefineClass(com.google.javascript.rhino.Node n) {
		while (n != null) {
			n = n.getParent();
			if (n.isCall()) {
				if (isGoogDefineClass(n)) {
					return true;
				}
			}else
				if ((!(n.isObjectLit())) && (!(n.isStringKey()))) {
					break;
				}
			
		} 
		return false;
	}

	private void maybeRewriteClassDefinition(com.google.javascript.rhino.Node n) {
		if (n.isVar()) {
			com.google.javascript.rhino.Node target = n.getFirstChild();
			com.google.javascript.rhino.Node value = target.getFirstChild();
			maybeRewriteClassDefinition(n, target, value);
		}else
			if (com.google.javascript.jscomp.NodeUtil.isExprAssign(n)) {
				com.google.javascript.rhino.Node assign = n.getFirstChild();
				com.google.javascript.rhino.Node target = assign.getFirstChild();
				com.google.javascript.rhino.Node value = assign.getLastChild();
				maybeRewriteClassDefinition(n, target, value);
			}
		
	}

	private void maybeRewriteClassDefinition(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node target, com.google.javascript.rhino.Node value) {
		if (isGoogDefineClass(value)) {
			if (!(target.isQualifiedName())) {
				compiler.report(com.google.javascript.jscomp.JSError.make(n, com.google.javascript.jscomp.ClosureRewriteClass.GOOG_CLASS_TARGET_INVALID));
			}
			com.google.javascript.jscomp.ClosureRewriteClass.ClassDefinition def = extractClassDefinition(target, value);
			if (def != null) {
				value.detachFromParent();
				target.detachFromParent();
				rewriteGoogDefineClass(n, def);
			}
		}
	}

	private static class MemberDefinition {
		final com.google.javascript.rhino.JSDocInfo info;

		final com.google.javascript.rhino.Node name;

		final com.google.javascript.rhino.Node value;

		MemberDefinition(com.google.javascript.rhino.JSDocInfo info, com.google.javascript.rhino.Node name, com.google.javascript.rhino.Node value) {
			this.info = info;
			this.name = name;
			this.value = value;
		}
	}

	private final class ClassDefinition {
		final com.google.javascript.rhino.Node name;

		final com.google.javascript.rhino.Node superClass;

		final com.google.javascript.jscomp.ClosureRewriteClass.MemberDefinition constructor;

		final java.util.List<com.google.javascript.jscomp.ClosureRewriteClass.MemberDefinition> staticProps;

		final java.util.List<com.google.javascript.jscomp.ClosureRewriteClass.MemberDefinition> props;

		final com.google.javascript.rhino.Node classModifier;

		ClassDefinition(com.google.javascript.rhino.Node name, com.google.javascript.rhino.Node superClass, com.google.javascript.jscomp.ClosureRewriteClass.MemberDefinition constructor, java.util.List<com.google.javascript.jscomp.ClosureRewriteClass.MemberDefinition> staticProps, java.util.List<com.google.javascript.jscomp.ClosureRewriteClass.MemberDefinition> props, com.google.javascript.rhino.Node classModifier) {
			this.name = name;
			this.superClass = superClass;
			this.constructor = constructor;
			this.staticProps = staticProps;
			this.props = props;
			this.classModifier = classModifier;
		}
	}

	private com.google.javascript.jscomp.ClosureRewriteClass.ClassDefinition extractClassDefinition(com.google.javascript.rhino.Node targetName, com.google.javascript.rhino.Node callNode) {
		com.google.javascript.rhino.Node superClass = com.google.javascript.jscomp.NodeUtil.getArgumentForCallOrNew(callNode, 0);
		if ((superClass == null) || ((!(superClass.isNull())) && (!(superClass.isQualifiedName())))) {
			compiler.report(com.google.javascript.jscomp.JSError.make(callNode, com.google.javascript.jscomp.ClosureRewriteClass.GOOG_CLASS_SUPER_CLASS_NOT_VALID));
			return null;
		}
		if (com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(superClass)) {
			superClass = null;
		}
		com.google.javascript.rhino.Node description = com.google.javascript.jscomp.NodeUtil.getArgumentForCallOrNew(callNode, 1);
		if (((description == null) || (!(description.isObjectLit()))) || (!(validateObjLit(description)))) {
			compiler.report(com.google.javascript.jscomp.JSError.make(callNode, com.google.javascript.jscomp.ClosureRewriteClass.GOOG_CLASS_DESCRIPTOR_NOT_VALID));
			return null;
		}
		int paramCount = (callNode.getChildCount()) - 1;
		if (paramCount > 2) {
			compiler.report(com.google.javascript.jscomp.JSError.make(callNode, com.google.javascript.jscomp.ClosureRewriteClass.GOOG_CLASS_UNEXPECTED_PARAMS));
			return null;
		}
		com.google.javascript.rhino.Node constructor = extractProperty(description, "constructor");
		if (constructor == null) {
			compiler.report(com.google.javascript.jscomp.JSError.make(description, com.google.javascript.jscomp.ClosureRewriteClass.GOOG_CLASS_CONSTRUCTOR_MISING));
			return null;
		}
		com.google.javascript.rhino.JSDocInfo info = com.google.javascript.jscomp.NodeUtil.getBestJSDocInfo(constructor);
		com.google.javascript.rhino.Node classModifier = null;
		com.google.javascript.rhino.Node statics = null;
		com.google.javascript.rhino.Node staticsProp = extractProperty(description, "statics");
		if (staticsProp != null) {
			if ((staticsProp.isObjectLit()) && (validateObjLit(staticsProp))) {
				statics = staticsProp;
			}else
				if (staticsProp.isFunction()) {
					classModifier = staticsProp;
				}else {
					compiler.report(com.google.javascript.jscomp.JSError.make(staticsProp, com.google.javascript.jscomp.ClosureRewriteClass.GOOG_CLASS_STATICS_NOT_VALID));
					return null;
				}
			
		}
		if (statics == null) {
			statics = com.google.javascript.rhino.IR.objectlit();
		}
		maybeDetach(constructor.getParent());
		maybeDetach(statics.getParent());
		if (classModifier != null) {
			maybeDetach(classModifier.getParent());
		}
		com.google.javascript.jscomp.ClosureRewriteClass.ClassDefinition def = new com.google.javascript.jscomp.ClosureRewriteClass.ClassDefinition(targetName, maybeDetach(superClass), new com.google.javascript.jscomp.ClosureRewriteClass.MemberDefinition(info, null, maybeDetach(constructor)), objectLitToList(maybeDetach(statics)), objectLitToList(description), maybeDetach(classModifier));
		return def;
	}

	private com.google.javascript.rhino.Node maybeDetach(com.google.javascript.rhino.Node node) {
		if ((node != null) && ((node.getParent()) != null)) {
			node.detachFromParent();
		}
		return node;
	}

	private boolean validateObjLit(com.google.javascript.rhino.Node objlit) {
		for (com.google.javascript.rhino.Node key : objlit.children()) {
			if ((!(key.isStringKey())) || (key.isQuotedString())) {
				return false;
			}
		}
		return true;
	}

	private com.google.javascript.rhino.Node extractProperty(com.google.javascript.rhino.Node objlit, java.lang.String keyName) {
		for (com.google.javascript.rhino.Node keyNode : objlit.children()) {
			if (keyNode.getString().equals(keyName)) {
				return keyNode.isStringKey() ? keyNode.getFirstChild() : null;
			}
		}
		return null;
	}

	private java.util.List<com.google.javascript.jscomp.ClosureRewriteClass.MemberDefinition> objectLitToList(com.google.javascript.rhino.Node objlit) {
		java.util.List<com.google.javascript.jscomp.ClosureRewriteClass.MemberDefinition> result = com.google.common.collect.Lists.newArrayList();
		for (com.google.javascript.rhino.Node keyNode : objlit.children()) {
			result.add(new com.google.javascript.jscomp.ClosureRewriteClass.MemberDefinition(com.google.javascript.jscomp.NodeUtil.getBestJSDocInfo(keyNode), keyNode, keyNode.removeFirstChild()));
		}
		objlit.detachChildren();
		return result;
	}

	private void rewriteGoogDefineClass(com.google.javascript.rhino.Node exprRoot, com.google.javascript.jscomp.ClosureRewriteClass.ClassDefinition cls) {
		com.google.javascript.rhino.Node block = com.google.javascript.rhino.IR.block();
		if (exprRoot.isVar()) {
			block.addChildToBack(com.google.javascript.rhino.IR.var(cls.name.cloneTree(), cls.constructor.value).srcref(exprRoot).setJSDocInfo(cls.constructor.info));
		}else {
			block.addChildToBack(fixupSrcref(com.google.javascript.rhino.IR.exprResult(com.google.javascript.rhino.IR.assign(cls.name.cloneTree(), cls.constructor.value).srcref(exprRoot).setJSDocInfo(cls.constructor.info).srcref(exprRoot))).setJSDocInfo(cls.constructor.info));
		}
		if ((cls.superClass) != null) {
			block.addChildToBack(fixupSrcref(com.google.javascript.rhino.IR.exprResult(com.google.javascript.rhino.IR.call(com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(compiler.getCodingConvention(), "goog.inherits").srcrefTree(cls.superClass), cls.name.cloneTree(), cls.superClass.cloneTree()).srcref(cls.superClass))));
		}
		for (com.google.javascript.jscomp.ClosureRewriteClass.MemberDefinition def : cls.staticProps) {
			block.addChildToBack(fixupSrcref(com.google.javascript.rhino.IR.exprResult(fixupSrcref(com.google.javascript.rhino.IR.assign(com.google.javascript.rhino.IR.getprop(cls.name.cloneTree(), com.google.javascript.rhino.IR.string(def.name.getString()).srcref(def.name)).srcref(def.name), def.value)).setJSDocInfo(def.info))));
			maybeRewriteClassDefinition(block.getLastChild());
		}
		for (com.google.javascript.jscomp.ClosureRewriteClass.MemberDefinition def : cls.props) {
			block.addChildToBack(fixupSrcref(com.google.javascript.rhino.IR.exprResult(fixupSrcref(com.google.javascript.rhino.IR.assign(com.google.javascript.rhino.IR.getprop(fixupSrcref(com.google.javascript.rhino.IR.getprop(cls.name.cloneTree(), com.google.javascript.rhino.IR.string("prototype").srcref(def.name))), com.google.javascript.rhino.IR.string(def.name.getString()).srcref(def.name)).srcref(def.name), def.value)).setJSDocInfo(def.info))));
			maybeRewriteClassDefinition(block.getLastChild());
		}
		if ((cls.classModifier) != null) {
			block.addChildToBack(com.google.javascript.rhino.IR.exprResult(fixupFreeCall(com.google.javascript.rhino.IR.call(cls.classModifier, cls.name.cloneTree()).srcref(cls.classModifier))).srcref(cls.classModifier));
		}
		exprRoot.getParent().replaceChild(exprRoot, block);
		compiler.reportCodeChange();
	}

	private com.google.javascript.rhino.Node fixupSrcref(com.google.javascript.rhino.Node node) {
		node.srcref(node.getFirstChild());
		return node;
	}

	private com.google.javascript.rhino.Node fixupFreeCall(com.google.javascript.rhino.Node call) {
		com.google.common.base.Preconditions.checkState(call.isCall());
		call.putBooleanProp(com.google.javascript.rhino.Node.FREE_CALL, true);
		return call;
	}

	private boolean isGoogDefineClass(com.google.javascript.rhino.Node value) {
		if ((value != null) && (value.isCall())) {
			java.lang.String targetName = value.getFirstChild().getQualifiedName();
			return ("goog.defineClass".equals(targetName)) || ("goog.labs.classdef.defineClass".equals(targetName));
		}
		return false;
	}
}

