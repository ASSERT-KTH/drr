

package com.google.javascript.jscomp;


interface ReverseAbstractInterpreter {
	com.google.javascript.jscomp.FlowScope getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node condition, com.google.javascript.jscomp.FlowScope blindScope, boolean outcome);
}

