

package com.google.javascript.jscomp;


interface SpecializationAwareCompilerPass extends com.google.javascript.jscomp.CompilerPass {
	public void enableSpecialization(com.google.javascript.jscomp.SpecializeModule.SpecializationState state);
}

