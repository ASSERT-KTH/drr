

package com.google.javascript.jscomp.type;


public interface FlowScope extends com.google.javascript.jscomp.graph.LatticeElement , com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> {
	com.google.javascript.jscomp.type.FlowScope createChildFlowScope();

	void inferSlotType(java.lang.String symbol, com.google.javascript.rhino.jstype.JSType type);

	void inferQualifiedSlot(com.google.javascript.rhino.Node node, java.lang.String symbol, com.google.javascript.rhino.jstype.JSType bottomType, com.google.javascript.rhino.jstype.JSType inferredType);

	com.google.javascript.jscomp.type.FlowScope optimize();

	com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> findUniqueRefinedSlot(com.google.javascript.jscomp.type.FlowScope blindScope);

	void completeScope(com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> scope);
}

