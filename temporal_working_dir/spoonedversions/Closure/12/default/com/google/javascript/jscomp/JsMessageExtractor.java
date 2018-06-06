

package com.google.javascript.jscomp;


public class JsMessageExtractor {
	private final com.google.javascript.jscomp.JsMessage.Style style;

	private final com.google.javascript.jscomp.JsMessage.IdGenerator idGenerator;

	public JsMessageExtractor(com.google.javascript.jscomp.JsMessage.IdGenerator idGenerator, com.google.javascript.jscomp.JsMessage.Style style) {
		this.idGenerator = idGenerator;
		this.style = style;
	}

	private class ExtractMessagesVisitor extends com.google.javascript.jscomp.JsMessageVisitor {
		private final java.util.List<com.google.javascript.jscomp.JsMessage> messages = com.google.common.collect.Lists.newLinkedList();

		private ExtractMessagesVisitor(com.google.javascript.jscomp.AbstractCompiler compiler) {
			super(compiler, true, style, idGenerator);
		}

		@java.lang.Override
		protected void processJsMessage(com.google.javascript.jscomp.JsMessage message, com.google.javascript.jscomp.JsMessageDefinition definition) {
			if (!(message.isExternal())) {
				messages.add(message);
			}
		}

		public java.util.Collection<com.google.javascript.jscomp.JsMessage> getMessages() {
			return messages;
		}
	}

	public java.util.Collection<com.google.javascript.jscomp.JsMessage> extractMessages(com.google.javascript.jscomp.SourceFile... inputs) throws java.io.IOException {
		return extractMessages(com.google.common.collect.ImmutableList.copyOf(inputs));
	}

	public <T extends com.google.javascript.jscomp.SourceFile> java.util.Collection<com.google.javascript.jscomp.JsMessage> extractMessages(java.lang.Iterable<T> inputs) throws java.io.IOException {
		com.google.javascript.jscomp.Compiler compiler = new com.google.javascript.jscomp.Compiler();
		compiler.init(com.google.common.collect.ImmutableList.<com.google.javascript.jscomp.SourceFile>of(), com.google.common.collect.Lists.newArrayList(inputs), new com.google.javascript.jscomp.CompilerOptions());
		com.google.javascript.jscomp.JsMessageExtractor.ExtractMessagesVisitor extractCompilerPass = new com.google.javascript.jscomp.JsMessageExtractor.ExtractMessagesVisitor(compiler);
		for (com.google.javascript.jscomp.SourceFile input : inputs) {
			com.google.javascript.rhino.Node root = new com.google.javascript.jscomp.JsAst(input).getAstRoot(compiler);
			extractCompilerPass.process(null, root);
		}
		com.google.javascript.jscomp.JSError[] errors = compiler.getErrors();
		if ((errors.length) > 0) {
			java.lang.StringBuilder msg = new java.lang.StringBuilder("JSCompiler errors\n");
			com.google.javascript.jscomp.MessageFormatter formatter = new com.google.javascript.jscomp.LightweightMessageFormatter(compiler);
			for (com.google.javascript.jscomp.JSError e : errors) {
				msg.append(formatter.formatError(e));
			}
			throw new java.lang.RuntimeException(msg.toString());
		}
		return extractCompilerPass.getMessages();
	}
}

