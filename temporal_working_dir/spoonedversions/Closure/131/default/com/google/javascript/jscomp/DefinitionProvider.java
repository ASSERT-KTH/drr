

package com.google.javascript.jscomp;


interface DefinitionProvider {
	java.util.Collection<com.google.javascript.jscomp.DefinitionsRemover.Definition> getDefinitionsReferencedAt(com.google.javascript.rhino.Node useSite);
}

