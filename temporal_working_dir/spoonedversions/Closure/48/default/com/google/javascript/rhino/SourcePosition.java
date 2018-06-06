

package com.google.javascript.rhino;


public abstract class SourcePosition<T> {
	private T item = null;

	private int startLineno = 0;

	private int startCharno = 0;

	private int endLineno = 0;

	private int endCharno = 0;

	public void setItem(T item) {
		com.google.javascript.rhino.SourcePosition.this.item = item;
	}

	public void setPositionInformation(int startLineno, int startCharno, int endLineno, int endCharno) {
		if (startLineno == endLineno) {
			if (startCharno >= endCharno) {
				throw new java.lang.IllegalStateException(((((("Recorded bad position information\n" + "start-char: ") + startCharno) + "\n") + "end-char: ") + endCharno));
			}
		}else {
			if (startLineno > endLineno) {
				throw new java.lang.IllegalStateException(((((("Recorded bad position information\n" + "start-line: ") + startLineno) + "\n") + "end-line: ") + endLineno));
			}
		}
		com.google.javascript.rhino.SourcePosition.this.startLineno = startLineno;
		com.google.javascript.rhino.SourcePosition.this.startCharno = startCharno;
		com.google.javascript.rhino.SourcePosition.this.endLineno = endLineno;
		com.google.javascript.rhino.SourcePosition.this.endCharno = endCharno;
	}

	public T getItem() {
		return item;
	}

	public int getStartLine() {
		return startLineno;
	}

	public int getPositionOnStartLine() {
		return startCharno;
	}

	public int getEndLine() {
		return endLineno;
	}

	public int getPositionOnEndLine() {
		return endCharno;
	}
}

