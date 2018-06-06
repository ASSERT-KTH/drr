

package com.google.javascript.jscomp;


interface FlowScope extends com.google.javascript.jscomp.LatticeElement , com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> {
	com.google.javascript.jscomp.FlowScope createChildFlowScope();

	void inferSlotType(java.lang.String symbol, com.google.javascript.rhino.jstype.JSType type);

	void inferQualifiedSlot(java.lang.String symbol, com.google.javascript.rhino.jstype.JSType bottomType, com.google.javascript.rhino.jstype.JSType inferredType);

	com.google.javascript.jscomp.FlowScope optimize();

	com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> findUniqueRefinedSlot(com.google.javascript.jscomp.FlowScope blindScope);

	void completeScope(com.google.javascript.jscomp.Scope scope);
}

