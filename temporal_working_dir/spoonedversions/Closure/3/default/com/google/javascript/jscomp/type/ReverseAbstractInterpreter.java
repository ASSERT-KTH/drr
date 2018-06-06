

package com.google.javascript.jscomp.type;


public interface ReverseAbstractInterpreter {
	com.google.javascript.jscomp.type.FlowScope getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node condition, com.google.javascript.jscomp.type.FlowScope blindScope, boolean outcome);
}

