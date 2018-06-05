

package com.google.javascript.jscomp;


class DefinitionSite {
	final com.google.javascript.rhino.Node node;

	final com.google.javascript.jscomp.DefinitionsRemover.Definition definition;

	final com.google.javascript.jscomp.JSModule module;

	final boolean inGlobalScope;

	final boolean inExterns;

	DefinitionSite(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.DefinitionsRemover.Definition definition, com.google.javascript.jscomp.JSModule module, boolean inGlobalScope, boolean inExterns) {
		this.node = node;
		this.definition = definition;
		this.module = module;
		this.inGlobalScope = inGlobalScope;
		this.inExterns = inExterns;
	}
}

