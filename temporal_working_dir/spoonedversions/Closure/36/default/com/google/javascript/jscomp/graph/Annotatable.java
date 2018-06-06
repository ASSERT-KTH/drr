

package com.google.javascript.jscomp.graph;


public interface Annotatable {
	void setAnnotation(com.google.javascript.jscomp.graph.Annotation data);

	<A extends com.google.javascript.jscomp.graph.Annotation> A getAnnotation();
}

