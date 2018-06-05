

package com.google.javascript.rhino;


public class Node implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = 1L;

	public static final int SOURCENAME_PROP = 16;

	public static final int JSDOC_INFO_PROP = 29;

	public static final int VAR_ARGS_NAME = 30;

	public static final int INCRDECR_PROP = 32;

	public static final int PARENTHESIZED_PROP = 35;

	public static final int QUOTED_PROP = 36;

	public static final int OPT_ARG_NAME = 37;

	public static final int SYNTHETIC_BLOCK_PROP = 38;

	public static final int EMPTY_BLOCK = 39;

	public static final int ORIGINALNAME_PROP = 40;

	public static final int BRACELESS_TYPE = 41;

	public static final int SIDE_EFFECT_FLAGS = 42;

	public static final int IS_CONSTANT_NAME = 43;

	public static final int IS_OPTIONAL_PARAM = 44;

	public static final int IS_VAR_ARGS_PARAM = 45;

	public static final int IS_NAMESPACE = 46;

	public static final int IS_DISPATCHER = 47;

	public static final int DIRECTIVES = 48;

	public static final int DIRECT_EVAL = 49;

	public static final int FREE_CALL = 50;

	public static final int STATIC_SOURCE_FILE = 51;

	public static final int LENGTH = 52;

	public static final int INPUT_ID = 53;

	public static final int SLASH_V = 54;

	public static final int LAST_PROP = 54;

	public static final int DECR_FLAG = 1;

	public static final int POST_FLAG = 2;

	private static final java.lang.String propToString(int propType) {
		switch (propType) {
			case com.google.javascript.rhino.Node.BRACELESS_TYPE :
				return "braceless_type";
			case com.google.javascript.rhino.Node.VAR_ARGS_NAME :
				return "var_args_name";
			case com.google.javascript.rhino.Node.SOURCENAME_PROP :
				return "sourcename";
			case com.google.javascript.rhino.Node.JSDOC_INFO_PROP :
				return "jsdoc_info";
			case com.google.javascript.rhino.Node.INCRDECR_PROP :
				return "incrdecr";
			case com.google.javascript.rhino.Node.PARENTHESIZED_PROP :
				return "parenthesized";
			case com.google.javascript.rhino.Node.QUOTED_PROP :
				return "quoted";
			case com.google.javascript.rhino.Node.OPT_ARG_NAME :
				return "opt_arg";
			case com.google.javascript.rhino.Node.SYNTHETIC_BLOCK_PROP :
				return "synthetic";
			case com.google.javascript.rhino.Node.EMPTY_BLOCK :
				return "empty_block";
			case com.google.javascript.rhino.Node.ORIGINALNAME_PROP :
				return "originalname";
			case com.google.javascript.rhino.Node.SIDE_EFFECT_FLAGS :
				return "side_effect_flags";
			case com.google.javascript.rhino.Node.IS_CONSTANT_NAME :
				return "is_constant_name";
			case com.google.javascript.rhino.Node.IS_OPTIONAL_PARAM :
				return "is_optional_param";
			case com.google.javascript.rhino.Node.IS_VAR_ARGS_PARAM :
				return "is_var_args_param";
			case com.google.javascript.rhino.Node.IS_NAMESPACE :
				return "is_namespace";
			case com.google.javascript.rhino.Node.IS_DISPATCHER :
				return "is_dispatcher";
			case com.google.javascript.rhino.Node.DIRECTIVES :
				return "directives";
			case com.google.javascript.rhino.Node.DIRECT_EVAL :
				return "direct_eval";
			case com.google.javascript.rhino.Node.FREE_CALL :
				return "free_call";
			case com.google.javascript.rhino.Node.STATIC_SOURCE_FILE :
				return "source_file";
			case com.google.javascript.rhino.Node.INPUT_ID :
				return "input_id";
			case com.google.javascript.rhino.Node.LENGTH :
				return "length";
			case com.google.javascript.rhino.Node.SLASH_V :
				return "slash_v";
			default :
				throw new java.lang.IllegalStateException(("unexpect prop id " + propType));
		}
	}

	private static class NumberNode extends com.google.javascript.rhino.Node {
		private static final long serialVersionUID = 1L;

		NumberNode(double number) {
			super(com.google.javascript.rhino.Token.NUMBER);
			com.google.javascript.rhino.Node.NumberNode.this.number = number;
		}

		public NumberNode(double number, int lineno, int charno) {
			super(com.google.javascript.rhino.Token.NUMBER, lineno, charno);
			com.google.javascript.rhino.Node.NumberNode.this.number = number;
		}

		@java.lang.Override
		public double getDouble() {
			return com.google.javascript.rhino.Node.NumberNode.this.number;
		}

		@java.lang.Override
		public void setDouble(double d) {
			com.google.javascript.rhino.Node.NumberNode.this.number = d;
		}

		@java.lang.Override
		boolean isEquivalentTo(com.google.javascript.rhino.Node node, boolean compareJsType, boolean recurse) {
			boolean equivalent = super.isEquivalentTo(node, compareJsType, recurse);
			if (equivalent) {
				double thisValue = getDouble();
				double thatValue = ((com.google.javascript.rhino.Node.NumberNode) (node)).getDouble();
				if (thisValue == thatValue) {
					return (thisValue != 0.0) || ((1 / thisValue) == (1 / thatValue));
				}
			}
			return false;
		}

		private double number;
	}

	private static class StringNode extends com.google.javascript.rhino.Node {
		private static final long serialVersionUID = 1L;

		StringNode(int type, java.lang.String str) {
			super(type);
			if (null == str) {
				throw new java.lang.IllegalArgumentException("StringNode: str is null");
			}
			com.google.javascript.rhino.Node.StringNode.this.str = str;
		}

		StringNode(int type, java.lang.String str, int lineno, int charno) {
			super(type, lineno, charno);
			if (null == str) {
				throw new java.lang.IllegalArgumentException("StringNode: str is null");
			}
			com.google.javascript.rhino.Node.StringNode.this.str = str;
		}

		@java.lang.Override
		public java.lang.String getString() {
			return com.google.javascript.rhino.Node.StringNode.this.str;
		}

		@java.lang.Override
		public void setString(java.lang.String str) {
			if (null == str) {
				throw new java.lang.IllegalArgumentException("StringNode: str is null");
			}
			com.google.javascript.rhino.Node.StringNode.this.str = str;
		}

		@java.lang.Override
		boolean isEquivalentTo(com.google.javascript.rhino.Node node, boolean compareJsType, boolean recurse) {
			return (super.isEquivalentTo(node, compareJsType, recurse)) && (com.google.javascript.rhino.Node.StringNode.this.str.equals(((com.google.javascript.rhino.Node.StringNode) (node)).str));
		}

		@java.lang.Override
		public boolean isQuotedString() {
			return getBooleanProp(com.google.javascript.rhino.Node.QUOTED_PROP);
		}

		@java.lang.Override
		public void setQuotedString() {
			putBooleanProp(com.google.javascript.rhino.Node.QUOTED_PROP, true);
		}

		private java.lang.String str;
	}

	private interface PropListItem {
		int getType();

		com.google.javascript.rhino.Node.PropListItem getNext();

		com.google.javascript.rhino.Node.PropListItem chain(com.google.javascript.rhino.Node.PropListItem next);

		java.lang.Object getObjectValue();

		int getIntValue();
	}

	private abstract static class AbstractPropListItem implements com.google.javascript.rhino.Node.PropListItem , java.io.Serializable {
		private static final long serialVersionUID = 1L;

		private final com.google.javascript.rhino.Node.PropListItem next;

		private final int propType;

		AbstractPropListItem(int propType, com.google.javascript.rhino.Node.PropListItem next) {
			this.propType = propType;
			this.next = next;
		}

		@java.lang.Override
		public int getType() {
			return propType;
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node.PropListItem getNext() {
			return next;
		}

		@java.lang.Override
		public abstract com.google.javascript.rhino.Node.PropListItem chain(com.google.javascript.rhino.Node.PropListItem next);
	}

	private static class ObjectPropListItem extends com.google.javascript.rhino.Node.AbstractPropListItem {
		private static final long serialVersionUID = 1L;

		private final java.lang.Object objectValue;

		ObjectPropListItem(int propType, java.lang.Object objectValue, com.google.javascript.rhino.Node.PropListItem next) {
			super(propType, next);
			this.objectValue = objectValue;
		}

		@java.lang.Override
		public int getIntValue() {
			throw new java.lang.UnsupportedOperationException();
		}

		@java.lang.Override
		public java.lang.Object getObjectValue() {
			return objectValue;
		}

		@java.lang.Override
		public java.lang.String toString() {
			return (objectValue) == null ? "null" : objectValue.toString();
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node.PropListItem chain(com.google.javascript.rhino.Node.PropListItem next) {
			return new com.google.javascript.rhino.Node.ObjectPropListItem(getType(), objectValue, next);
		}
	}

	private static class IntPropListItem extends com.google.javascript.rhino.Node.AbstractPropListItem {
		private static final long serialVersionUID = 1L;

		final int intValue;

		IntPropListItem(int propType, int intValue, com.google.javascript.rhino.Node.PropListItem next) {
			super(propType, next);
			this.intValue = intValue;
		}

		@java.lang.Override
		public int getIntValue() {
			return intValue;
		}

		@java.lang.Override
		public java.lang.Object getObjectValue() {
			throw new java.lang.UnsupportedOperationException();
		}

		@java.lang.Override
		public java.lang.String toString() {
			return java.lang.String.valueOf(intValue);
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node.PropListItem chain(com.google.javascript.rhino.Node.PropListItem next) {
			return new com.google.javascript.rhino.Node.IntPropListItem(getType(), intValue, next);
		}
	}

	public Node(int nodeType) {
		type = nodeType;
		parent = null;
		sourcePosition = -1;
	}

	public Node(int nodeType, com.google.javascript.rhino.Node child) {
		com.google.common.base.Preconditions.checkArgument(((child.parent) == null), "new child has existing parent");
		com.google.common.base.Preconditions.checkArgument(((child.next) == null), "new child has existing sibling");
		type = nodeType;
		parent = null;
		first = last = child;
		child.next = null;
		child.parent = com.google.javascript.rhino.Node.this;
		sourcePosition = -1;
	}

	public Node(int nodeType, com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node right) {
		com.google.common.base.Preconditions.checkArgument(((left.parent) == null), "first new child has existing parent");
		com.google.common.base.Preconditions.checkArgument(((left.next) == null), "first new child has existing sibling");
		com.google.common.base.Preconditions.checkArgument(((right.parent) == null), "second new child has existing parent");
		com.google.common.base.Preconditions.checkArgument(((right.next) == null), "second new child has existing sibling");
		type = nodeType;
		parent = null;
		first = left;
		last = right;
		left.next = right;
		left.parent = com.google.javascript.rhino.Node.this;
		right.next = null;
		right.parent = com.google.javascript.rhino.Node.this;
		sourcePosition = -1;
	}

	public Node(int nodeType, com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node mid, com.google.javascript.rhino.Node right) {
		com.google.common.base.Preconditions.checkArgument(((left.parent) == null));
		com.google.common.base.Preconditions.checkArgument(((left.next) == null));
		com.google.common.base.Preconditions.checkArgument(((mid.parent) == null));
		com.google.common.base.Preconditions.checkArgument(((mid.next) == null));
		com.google.common.base.Preconditions.checkArgument(((right.parent) == null));
		com.google.common.base.Preconditions.checkArgument(((right.next) == null));
		type = nodeType;
		parent = null;
		first = left;
		last = right;
		left.next = mid;
		left.parent = com.google.javascript.rhino.Node.this;
		mid.next = right;
		mid.parent = com.google.javascript.rhino.Node.this;
		right.next = null;
		right.parent = com.google.javascript.rhino.Node.this;
		sourcePosition = -1;
	}

	public Node(int nodeType, com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node mid, com.google.javascript.rhino.Node mid2, com.google.javascript.rhino.Node right) {
		com.google.common.base.Preconditions.checkArgument(((left.parent) == null));
		com.google.common.base.Preconditions.checkArgument(((left.next) == null));
		com.google.common.base.Preconditions.checkArgument(((mid.parent) == null));
		com.google.common.base.Preconditions.checkArgument(((mid.next) == null));
		com.google.common.base.Preconditions.checkArgument(((mid2.parent) == null));
		com.google.common.base.Preconditions.checkArgument(((mid2.next) == null));
		com.google.common.base.Preconditions.checkArgument(((right.parent) == null));
		com.google.common.base.Preconditions.checkArgument(((right.next) == null));
		type = nodeType;
		parent = null;
		first = left;
		last = right;
		left.next = mid;
		left.parent = com.google.javascript.rhino.Node.this;
		mid.next = mid2;
		mid.parent = com.google.javascript.rhino.Node.this;
		mid2.next = right;
		mid2.parent = com.google.javascript.rhino.Node.this;
		right.next = null;
		right.parent = com.google.javascript.rhino.Node.this;
		sourcePosition = -1;
	}

	public Node(int nodeType, int lineno, int charno) {
		type = nodeType;
		parent = null;
		sourcePosition = com.google.javascript.rhino.Node.mergeLineCharNo(lineno, charno);
	}

	public Node(int nodeType, com.google.javascript.rhino.Node child, int lineno, int charno) {
		this(nodeType, child);
		sourcePosition = com.google.javascript.rhino.Node.mergeLineCharNo(lineno, charno);
	}

	public Node(int nodeType, com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node right, int lineno, int charno) {
		this(nodeType, left, right);
		sourcePosition = com.google.javascript.rhino.Node.mergeLineCharNo(lineno, charno);
	}

	public Node(int nodeType, com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node mid, com.google.javascript.rhino.Node right, int lineno, int charno) {
		this(nodeType, left, mid, right);
		sourcePosition = com.google.javascript.rhino.Node.mergeLineCharNo(lineno, charno);
	}

	public Node(int nodeType, com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node mid, com.google.javascript.rhino.Node mid2, com.google.javascript.rhino.Node right, int lineno, int charno) {
		this(nodeType, left, mid, mid2, right);
		sourcePosition = com.google.javascript.rhino.Node.mergeLineCharNo(lineno, charno);
	}

	public Node(int nodeType, com.google.javascript.rhino.Node[] children, int lineno, int charno) {
		this(nodeType, children);
		sourcePosition = com.google.javascript.rhino.Node.mergeLineCharNo(lineno, charno);
	}

	public Node(int nodeType, com.google.javascript.rhino.Node[] children) {
		com.google.javascript.rhino.Node.this.type = nodeType;
		parent = null;
		if ((children.length) != 0) {
			com.google.javascript.rhino.Node.this.first = children[0];
			com.google.javascript.rhino.Node.this.last = children[((children.length) - 1)];
			for (int i = 1; i < (children.length); i++) {
				if (null != (children[(i - 1)].next)) {
					throw new java.lang.IllegalArgumentException("duplicate child");
				}
				children[(i - 1)].next = children[i];
				com.google.common.base.Preconditions.checkArgument(((children[(i - 1)].parent) == null));
				children[(i - 1)].parent = com.google.javascript.rhino.Node.this;
			}
			com.google.common.base.Preconditions.checkArgument(((children[((children.length) - 1)].parent) == null));
			children[((children.length) - 1)].parent = com.google.javascript.rhino.Node.this;
			if (null != (com.google.javascript.rhino.Node.this.last.next)) {
				throw new java.lang.IllegalArgumentException("duplicate child");
			}
		}
	}

	public static com.google.javascript.rhino.Node newNumber(double number) {
		return new com.google.javascript.rhino.Node.NumberNode(number);
	}

	public static com.google.javascript.rhino.Node newNumber(double number, int lineno, int charno) {
		return new com.google.javascript.rhino.Node.NumberNode(number, lineno, charno);
	}

	public static com.google.javascript.rhino.Node newString(java.lang.String str) {
		return new com.google.javascript.rhino.Node.StringNode(com.google.javascript.rhino.Token.STRING, str);
	}

	public static com.google.javascript.rhino.Node newString(int type, java.lang.String str) {
		return new com.google.javascript.rhino.Node.StringNode(type, str);
	}

	public static com.google.javascript.rhino.Node newString(java.lang.String str, int lineno, int charno) {
		return new com.google.javascript.rhino.Node.StringNode(com.google.javascript.rhino.Token.STRING, str, lineno, charno);
	}

	public static com.google.javascript.rhino.Node newString(int type, java.lang.String str, int lineno, int charno) {
		return new com.google.javascript.rhino.Node.StringNode(type, str, lineno, charno);
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		com.google.javascript.rhino.Node.this.type = type;
	}

	public boolean hasChildren() {
		return (first) != null;
	}

	public com.google.javascript.rhino.Node getFirstChild() {
		return first;
	}

	public com.google.javascript.rhino.Node getLastChild() {
		return last;
	}

	public com.google.javascript.rhino.Node getNext() {
		return next;
	}

	public com.google.javascript.rhino.Node getChildBefore(com.google.javascript.rhino.Node child) {
		if (child == (first)) {
			return null;
		}
		com.google.javascript.rhino.Node n = first;
		while ((n.next) != child) {
			n = n.next;
			if (n == null) {
				throw new java.lang.RuntimeException("node is not a child");
			}
		} 
		return n;
	}

	public com.google.javascript.rhino.Node getChildAtIndex(int i) {
		com.google.javascript.rhino.Node n = first;
		while (i > 0) {
			n = n.next;
			i--;
		} 
		return n;
	}

	public int getIndexOfChild(com.google.javascript.rhino.Node child) {
		com.google.javascript.rhino.Node n = first;
		int i = 0;
		while (n != null) {
			if (child == n) {
				return i;
			}
			n = n.next;
			i++;
		} 
		return -1;
	}

	public com.google.javascript.rhino.Node getLastSibling() {
		com.google.javascript.rhino.Node n = com.google.javascript.rhino.Node.this;
		while ((n.next) != null) {
			n = n.next;
		} 
		return n;
	}

	public void addChildToFront(com.google.javascript.rhino.Node child) {
		com.google.common.base.Preconditions.checkArgument(((child.parent) == null));
		com.google.common.base.Preconditions.checkArgument(((child.next) == null));
		child.parent = com.google.javascript.rhino.Node.this;
		child.next = first;
		first = child;
		if ((last) == null) {
			last = child;
		}
	}

	public void addChildToBack(com.google.javascript.rhino.Node child) {
		com.google.common.base.Preconditions.checkArgument(((child.parent) == null));
		com.google.common.base.Preconditions.checkArgument(((child.next) == null));
		child.parent = com.google.javascript.rhino.Node.this;
		child.next = null;
		if ((last) == null) {
			first = last = child;
			return ;
		}
		last.next = child;
		last = child;
	}

	public void addChildrenToFront(com.google.javascript.rhino.Node children) {
		for (com.google.javascript.rhino.Node child = children; child != null; child = child.next) {
			com.google.common.base.Preconditions.checkArgument(((child.parent) == null));
			child.parent = com.google.javascript.rhino.Node.this;
		}
		com.google.javascript.rhino.Node lastSib = children.getLastSibling();
		lastSib.next = first;
		first = children;
		if ((last) == null) {
			last = lastSib;
		}
	}

	public void addChildrenToBack(com.google.javascript.rhino.Node children) {
		addChildrenAfter(children, getLastChild());
	}

	public void addChildBefore(com.google.javascript.rhino.Node newChild, com.google.javascript.rhino.Node node) {
		com.google.common.base.Preconditions.checkArgument(((node != null) && ((node.parent) == (com.google.javascript.rhino.Node.this))), "The existing child node of the parent should not be null.");
		com.google.common.base.Preconditions.checkArgument(((newChild.next) == null), "The new child node has siblings.");
		com.google.common.base.Preconditions.checkArgument(((newChild.parent) == null), "The new child node already has a parent.");
		if ((first) == node) {
			newChild.parent = com.google.javascript.rhino.Node.this;
			newChild.next = first;
			first = newChild;
			return ;
		}
		com.google.javascript.rhino.Node prev = getChildBefore(node);
		addChildAfter(newChild, prev);
	}

	public void addChildAfter(com.google.javascript.rhino.Node newChild, com.google.javascript.rhino.Node node) {
		com.google.common.base.Preconditions.checkArgument(((newChild.next) == null), "The new child node has siblings.");
		addChildrenAfter(newChild, node);
	}

	public void addChildrenAfter(com.google.javascript.rhino.Node children, com.google.javascript.rhino.Node node) {
		com.google.common.base.Preconditions.checkArgument(((node == null) || ((node.parent) == (com.google.javascript.rhino.Node.this))));
		for (com.google.javascript.rhino.Node child = children; child != null; child = child.next) {
			com.google.common.base.Preconditions.checkArgument(((child.parent) == null));
			child.parent = com.google.javascript.rhino.Node.this;
		}
		com.google.javascript.rhino.Node lastSibling = children.getLastSibling();
		if (node != null) {
			com.google.javascript.rhino.Node oldNext = node.next;
			node.next = children;
			lastSibling.next = oldNext;
			if (node == (last)) {
				last = lastSibling;
			}
		}else {
			if ((first) != null) {
				lastSibling.next = first;
			}else {
				last = lastSibling;
			}
			first = children;
		}
	}

	public void removeChild(com.google.javascript.rhino.Node child) {
		com.google.javascript.rhino.Node prev = getChildBefore(child);
		if (prev == null)
			first = first.next;
		else
			prev.next = child.next;
		
		if (child == (last))
			last = prev;
		
		child.next = null;
		child.parent = null;
	}

	public void replaceChild(com.google.javascript.rhino.Node child, com.google.javascript.rhino.Node newChild) {
		com.google.common.base.Preconditions.checkArgument(((newChild.next) == null), "The new child node has siblings.");
		com.google.common.base.Preconditions.checkArgument(((newChild.parent) == null), "The new child node already has a parent.");
		newChild.copyInformationFrom(child);
		newChild.next = child.next;
		newChild.parent = com.google.javascript.rhino.Node.this;
		if (child == (first)) {
			first = newChild;
		}else {
			com.google.javascript.rhino.Node prev = getChildBefore(child);
			prev.next = newChild;
		}
		if (child == (last))
			last = newChild;
		
		child.next = null;
		child.parent = null;
	}

	public void replaceChildAfter(com.google.javascript.rhino.Node prevChild, com.google.javascript.rhino.Node newChild) {
		com.google.common.base.Preconditions.checkArgument(((prevChild.parent) == (com.google.javascript.rhino.Node.this)), "prev is not a child of this node.");
		com.google.common.base.Preconditions.checkArgument(((newChild.next) == null), "The new child node has siblings.");
		com.google.common.base.Preconditions.checkArgument(((newChild.parent) == null), "The new child node already has a parent.");
		newChild.copyInformationFrom(prevChild);
		com.google.javascript.rhino.Node child = prevChild.next;
		newChild.next = child.next;
		newChild.parent = com.google.javascript.rhino.Node.this;
		prevChild.next = newChild;
		if (child == (last))
			last = newChild;
		
		child.next = null;
		child.parent = null;
	}

	@com.google.common.annotations.VisibleForTesting
	com.google.javascript.rhino.Node.PropListItem lookupProperty(int propType) {
		com.google.javascript.rhino.Node.PropListItem x = propListHead;
		while ((x != null) && (propType != (x.getType()))) {
			x = x.getNext();
		} 
		return x;
	}

	public com.google.javascript.rhino.Node clonePropsFrom(com.google.javascript.rhino.Node other) {
		com.google.common.base.Preconditions.checkState(((com.google.javascript.rhino.Node.this.propListHead) == null), "Node has existing properties.");
		com.google.javascript.rhino.Node.this.propListHead = other.propListHead;
		return com.google.javascript.rhino.Node.this;
	}

	public void removeProp(int propType) {
		com.google.javascript.rhino.Node.PropListItem result = removeProp(propListHead, propType);
		if (result != (propListHead)) {
			propListHead = result;
		}
	}

	private com.google.javascript.rhino.Node.PropListItem removeProp(com.google.javascript.rhino.Node.PropListItem item, int propType) {
		if (item == null) {
			return null;
		}else
			if ((item.getType()) == propType) {
				return item.getNext();
			}else {
				com.google.javascript.rhino.Node.PropListItem result = removeProp(item.getNext(), propType);
				if (result != (item.getNext())) {
					return item.chain(result);
				}else {
					return item;
				}
			}
		
	}

	public java.lang.Object getProp(int propType) {
		if (propType == (com.google.javascript.rhino.Node.SOURCENAME_PROP)) {
			return getSourceFileName();
		}
		com.google.javascript.rhino.Node.PropListItem item = lookupProperty(propType);
		if (item == null) {
			return null;
		}
		return item.getObjectValue();
	}

	public boolean getBooleanProp(int propType) {
		return (getIntProp(propType)) != 0;
	}

	public int getIntProp(int propType) {
		com.google.javascript.rhino.Node.PropListItem item = lookupProperty(propType);
		if (item == null) {
			return 0;
		}
		return item.getIntValue();
	}

	public int getExistingIntProp(int propType) {
		com.google.javascript.rhino.Node.PropListItem item = lookupProperty(propType);
		if (item == null) {
			throw new java.lang.IllegalStateException(("missing prop: " + propType));
		}
		return item.getIntValue();
	}

	public void putProp(int propType, java.lang.Object value) {
		if (propType == (com.google.javascript.rhino.Node.SOURCENAME_PROP)) {
			putProp(com.google.javascript.rhino.Node.STATIC_SOURCE_FILE, new com.google.javascript.rhino.jstype.SimpleSourceFile(((java.lang.String) (value)), false));
			return ;
		}
		removeProp(propType);
		if (value != null) {
			propListHead = createProp(propType, value, propListHead);
		}
	}

	public void putBooleanProp(int propType, boolean value) {
		putIntProp(propType, (value ? 1 : 0));
	}

	public void putIntProp(int propType, int value) {
		removeProp(propType);
		if (value != 0) {
			propListHead = createProp(propType, value, propListHead);
		}
	}

	com.google.javascript.rhino.Node.PropListItem createProp(int propType, java.lang.Object value, com.google.javascript.rhino.Node.PropListItem next) {
		return new com.google.javascript.rhino.Node.ObjectPropListItem(propType, value, next);
	}

	com.google.javascript.rhino.Node.PropListItem createProp(int propType, int value, com.google.javascript.rhino.Node.PropListItem next) {
		return new com.google.javascript.rhino.Node.IntPropListItem(propType, value, next);
	}

	private int[] getSortedPropTypes() {
		int count = 0;
		for (com.google.javascript.rhino.Node.PropListItem x = propListHead; x != null; x = x.getNext()) {
			count++;
		}
		int[] keys = new int[count];
		for (com.google.javascript.rhino.Node.PropListItem x = propListHead; x != null; x = x.getNext()) {
			count--;
			keys[count] = x.getType();
		}
		java.util.Arrays.sort(keys);
		return keys;
	}

	public double getDouble() throws java.lang.UnsupportedOperationException {
		if ((com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.NUMBER)) {
			throw new java.lang.IllegalStateException("Number node not created with Node.newNumber");
		}else {
			throw new java.lang.UnsupportedOperationException(((com.google.javascript.rhino.Node.this) + " is not a number node"));
		}
	}

	public void setDouble(double s) throws java.lang.UnsupportedOperationException {
		if ((com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.NUMBER)) {
			throw new java.lang.IllegalStateException("Number node not created with Node.newNumber");
		}else {
			throw new java.lang.UnsupportedOperationException(((com.google.javascript.rhino.Node.this) + " is not a string node"));
		}
	}

	public java.lang.String getString() throws java.lang.UnsupportedOperationException {
		if ((com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.STRING)) {
			throw new java.lang.IllegalStateException("String node not created with Node.newString");
		}else {
			throw new java.lang.UnsupportedOperationException(((com.google.javascript.rhino.Node.this) + " is not a string node"));
		}
	}

	public void setString(java.lang.String s) throws java.lang.UnsupportedOperationException {
		if ((com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.STRING)) {
			throw new java.lang.IllegalStateException("String node not created with Node.newString");
		}else {
			throw new java.lang.UnsupportedOperationException(((com.google.javascript.rhino.Node.this) + " is not a string node"));
		}
	}

	@java.lang.Override
	public java.lang.String toString() {
		return toString(true, true, true);
	}

	public java.lang.String toString(boolean printSource, boolean printAnnotations, boolean printType) {
		java.lang.StringBuilder sb = new java.lang.StringBuilder();
		toString(sb, printSource, printAnnotations, printType);
		return sb.toString();
	}

	private void toString(java.lang.StringBuilder sb, boolean printSource, boolean printAnnotations, boolean printType) {
		sb.append(com.google.javascript.rhino.Token.name(type));
		if ((com.google.javascript.rhino.Node.this) instanceof com.google.javascript.rhino.Node.StringNode) {
			sb.append(' ');
			sb.append(getString());
		}else
			if ((type) == (com.google.javascript.rhino.Token.FUNCTION)) {
				sb.append(' ');
				if (((first) == null) || ((first.getType()) != (com.google.javascript.rhino.Token.NAME))) {
					sb.append("<invalid>");
				}else {
					sb.append(first.getString());
				}
			}else
				if ((type) == (com.google.javascript.rhino.Token.NUMBER)) {
					sb.append(' ');
					sb.append(getDouble());
				}
			
		
		if (printSource) {
			int lineno = getLineno();
			if (lineno != (-1)) {
				sb.append(' ');
				sb.append(lineno);
			}
		}
		if (printAnnotations) {
			int[] keys = getSortedPropTypes();
			for (int i = 0; i < (keys.length); i++) {
				int type = keys[i];
				com.google.javascript.rhino.Node.PropListItem x = lookupProperty(type);
				sb.append(" [");
				sb.append(com.google.javascript.rhino.Node.propToString(type));
				sb.append(": ");
				java.lang.String value;
				switch (type) {
					default :
						value = x.toString();
						break;
				}
				sb.append(value);
				sb.append(']');
			}
		}
		if (printType) {
			if ((jsType) != null) {
				java.lang.String jsTypeString = jsType.toString();
				if (jsTypeString != null) {
					sb.append(" : ");
					sb.append(jsTypeString);
				}
			}
		}
	}

	public java.lang.String toStringTree() {
		return toStringTreeImpl();
	}

	private java.lang.String toStringTreeImpl() {
		try {
			java.lang.StringBuilder s = new java.lang.StringBuilder();
			appendStringTree(s);
			return s.toString();
		} catch (java.io.IOException e) {
			throw new java.lang.RuntimeException(("Should not happen\n" + e));
		}
	}

	public void appendStringTree(java.lang.Appendable appendable) throws java.io.IOException {
		com.google.javascript.rhino.Node.toStringTreeHelper(com.google.javascript.rhino.Node.this, 0, appendable);
	}

	private static void toStringTreeHelper(com.google.javascript.rhino.Node n, int level, java.lang.Appendable sb) throws java.io.IOException {
		for (int i = 0; i != level; ++i) {
			sb.append("    ");
		}
		sb.append(n.toString());
		sb.append('\n');
		for (com.google.javascript.rhino.Node cursor = n.getFirstChild(); cursor != null; cursor = cursor.getNext()) {
			com.google.javascript.rhino.Node.toStringTreeHelper(cursor, (level + 1), sb);
		}
	}

	int type;

	com.google.javascript.rhino.Node next;

	private com.google.javascript.rhino.Node first;

	private com.google.javascript.rhino.Node last;

	private com.google.javascript.rhino.Node.PropListItem propListHead;

	public static final int COLUMN_BITS = 12;

	public static final int MAX_COLUMN_NUMBER = (1 << (com.google.javascript.rhino.Node.COLUMN_BITS)) - 1;

	public static final int COLUMN_MASK = com.google.javascript.rhino.Node.MAX_COLUMN_NUMBER;

	private int sourcePosition;

	private com.google.javascript.rhino.jstype.JSType jsType;

	private com.google.javascript.rhino.Node parent;

	public void setStaticSourceFile(com.google.javascript.rhino.jstype.StaticSourceFile file) {
		com.google.javascript.rhino.Node.this.putProp(com.google.javascript.rhino.Node.STATIC_SOURCE_FILE, file);
	}

	public void setSourceFileForTesting(java.lang.String name) {
		com.google.javascript.rhino.Node.this.putProp(com.google.javascript.rhino.Node.STATIC_SOURCE_FILE, new com.google.javascript.rhino.jstype.SimpleSourceFile(name, false));
	}

	public java.lang.String getSourceFileName() {
		com.google.javascript.rhino.jstype.StaticSourceFile file = getStaticSourceFile();
		return file == null ? null : file.getName();
	}

	public com.google.javascript.rhino.jstype.StaticSourceFile getStaticSourceFile() {
		return ((com.google.javascript.rhino.jstype.StaticSourceFile) (com.google.javascript.rhino.Node.this.getProp(com.google.javascript.rhino.Node.STATIC_SOURCE_FILE)));
	}

	public void setInputId(com.google.javascript.rhino.InputId inputId) {
		com.google.javascript.rhino.Node.this.putProp(com.google.javascript.rhino.Node.INPUT_ID, inputId);
	}

	public com.google.javascript.rhino.InputId getInputId() {
		return ((com.google.javascript.rhino.InputId) (com.google.javascript.rhino.Node.this.getProp(com.google.javascript.rhino.Node.INPUT_ID)));
	}

	public boolean isFromExterns() {
		com.google.javascript.rhino.jstype.StaticSourceFile file = getStaticSourceFile();
		return file == null ? false : file.isExtern();
	}

	public int getLength() {
		return getIntProp(com.google.javascript.rhino.Node.LENGTH);
	}

	public void setLength(int length) {
		putIntProp(com.google.javascript.rhino.Node.LENGTH, length);
	}

	public int getLineno() {
		return com.google.javascript.rhino.Node.extractLineno(sourcePosition);
	}

	public int getCharno() {
		return com.google.javascript.rhino.Node.extractCharno(sourcePosition);
	}

	public int getSourceOffset() {
		com.google.javascript.rhino.jstype.StaticSourceFile file = getStaticSourceFile();
		if (file == null) {
			return -1;
		}
		int lineno = getLineno();
		if (lineno == (-1)) {
			return -1;
		}
		return (file.getLineOffset(lineno)) + (getCharno());
	}

	public int getSourcePosition() {
		return sourcePosition;
	}

	public void setLineno(int lineno) {
		int charno = getCharno();
		if (charno == (-1)) {
			charno = 0;
		}
		sourcePosition = com.google.javascript.rhino.Node.mergeLineCharNo(lineno, charno);
	}

	public void setCharno(int charno) {
		sourcePosition = com.google.javascript.rhino.Node.mergeLineCharNo(getLineno(), charno);
	}

	public void setSourceEncodedPosition(int sourcePosition) {
		com.google.javascript.rhino.Node.this.sourcePosition = sourcePosition;
	}

	public void setSourceEncodedPositionForTree(int sourcePosition) {
		com.google.javascript.rhino.Node.this.sourcePosition = sourcePosition;
		for (com.google.javascript.rhino.Node child = getFirstChild(); child != null; child = child.getNext()) {
			child.setSourceEncodedPositionForTree(sourcePosition);
		}
	}

	protected static int mergeLineCharNo(int lineno, int charno) {
		if ((lineno < 0) || (charno < 0)) {
			return -1;
		}else
			if ((charno & (~(com.google.javascript.rhino.Node.COLUMN_MASK))) != 0) {
				return (lineno << (com.google.javascript.rhino.Node.COLUMN_BITS)) | (com.google.javascript.rhino.Node.COLUMN_MASK);
			}else {
				return (lineno << (com.google.javascript.rhino.Node.COLUMN_BITS)) | (charno & (com.google.javascript.rhino.Node.COLUMN_MASK));
			}
		
	}

	protected static int extractLineno(int lineCharNo) {
		if (lineCharNo == (-1)) {
			return -1;
		}else {
			return lineCharNo >>> (com.google.javascript.rhino.Node.COLUMN_BITS);
		}
	}

	protected static int extractCharno(int lineCharNo) {
		if (lineCharNo == (-1)) {
			return -1;
		}else {
			return lineCharNo & (com.google.javascript.rhino.Node.COLUMN_MASK);
		}
	}

	public java.lang.Iterable<com.google.javascript.rhino.Node> children() {
		if ((first) == null) {
			return java.util.Collections.emptySet();
		}else {
			return new com.google.javascript.rhino.Node.SiblingNodeIterable(first);
		}
	}

	public java.lang.Iterable<com.google.javascript.rhino.Node> siblings() {
		return new com.google.javascript.rhino.Node.SiblingNodeIterable(com.google.javascript.rhino.Node.this);
	}

	private static final class SiblingNodeIterable implements java.lang.Iterable<com.google.javascript.rhino.Node> , java.util.Iterator<com.google.javascript.rhino.Node> {
		private final com.google.javascript.rhino.Node start;

		private com.google.javascript.rhino.Node current;

		private boolean used;

		SiblingNodeIterable(com.google.javascript.rhino.Node start) {
			this.start = start;
			com.google.javascript.rhino.Node.SiblingNodeIterable.this.current = start;
			com.google.javascript.rhino.Node.SiblingNodeIterable.this.used = false;
		}

		@java.lang.Override
		public java.util.Iterator<com.google.javascript.rhino.Node> iterator() {
			if (!(used)) {
				used = true;
				return com.google.javascript.rhino.Node.SiblingNodeIterable.this;
			}else {
				return new com.google.javascript.rhino.Node.SiblingNodeIterable(start).iterator();
			}
		}

		@java.lang.Override
		public boolean hasNext() {
			return (current) != null;
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node next() {
			if ((current) == null) {
				throw new java.util.NoSuchElementException();
			}
			try {
				return current;
			} finally {
				current = current.getNext();
			}
		}

		@java.lang.Override
		public void remove() {
			throw new java.lang.UnsupportedOperationException();
		}
	}

	com.google.javascript.rhino.Node.PropListItem getPropListHeadForTesting() {
		return propListHead;
	}

	public com.google.javascript.rhino.Node getParent() {
		return parent;
	}

	public com.google.javascript.rhino.Node getAncestor(int level) {
		com.google.common.base.Preconditions.checkArgument((level >= 0));
		com.google.javascript.rhino.Node node = com.google.javascript.rhino.Node.this;
		while ((node != null) && ((level--) > 0)) {
			node = node.getParent();
		} 
		return node;
	}

	public com.google.javascript.rhino.Node.AncestorIterable getAncestors() {
		return new com.google.javascript.rhino.Node.AncestorIterable(com.google.javascript.rhino.Node.this.getParent());
	}

	public static class AncestorIterable implements java.lang.Iterable<com.google.javascript.rhino.Node> {
		private com.google.javascript.rhino.Node cur;

		AncestorIterable(com.google.javascript.rhino.Node cur) {
			com.google.javascript.rhino.Node.AncestorIterable.this.cur = cur;
		}

		@java.lang.Override
		public java.util.Iterator<com.google.javascript.rhino.Node> iterator() {
			return new java.util.Iterator<com.google.javascript.rhino.Node>() {
				@java.lang.Override
				public boolean hasNext() {
					return (cur) != null;
				}

				@java.lang.Override
				public com.google.javascript.rhino.Node next() {
					if (!(hasNext()))
						throw new java.util.NoSuchElementException();
					
					com.google.javascript.rhino.Node n = cur;
					cur = cur.getParent();
					return n;
				}

				@java.lang.Override
				public void remove() {
					throw new java.lang.UnsupportedOperationException();
				}
			};
		}
	}

	public boolean hasOneChild() {
		return ((first) != null) && ((first) == (last));
	}

	public boolean hasMoreThanOneChild() {
		return ((first) != null) && ((first) != (last));
	}

	public int getChildCount() {
		int c = 0;
		for (com.google.javascript.rhino.Node n = first; n != null; n = n.next)
			c++;
		
		return c;
	}

	public boolean hasChild(com.google.javascript.rhino.Node child) {
		for (com.google.javascript.rhino.Node n = first; n != null; n = n.getNext()) {
			if (child == n) {
				return true;
			}
		}
		return false;
	}

	public java.lang.String checkTreeEquals(com.google.javascript.rhino.Node node2) {
		com.google.javascript.rhino.Node.NodeMismatch diff = checkTreeEqualsImpl(node2);
		if (diff != null) {
			return ((((((("Node tree inequality:" + "\nTree1:\n") + (toStringTree())) + "\n\nTree2:\n") + (node2.toStringTree())) + "\n\nSubtree1: ") + (diff.nodeA.toStringTree())) + "\n\nSubtree2: ") + (diff.nodeB.toStringTree());
		}
		return null;
	}

	com.google.javascript.rhino.Node.NodeMismatch checkTreeEqualsImpl(com.google.javascript.rhino.Node node2) {
		if (!(isEquivalentTo(node2, false, false))) {
			return new com.google.javascript.rhino.Node.NodeMismatch(com.google.javascript.rhino.Node.this, node2);
		}
		com.google.javascript.rhino.Node.NodeMismatch res = null;
		com.google.javascript.rhino.Node n;
		com.google.javascript.rhino.Node n2;
		for (n = first, n2 = node2.first; (res == null) && (n != null); n = n.next , n2 = n2.next) {
			if (node2 == null) {
				throw new java.lang.IllegalStateException();
			}
			res = n.checkTreeEqualsImpl(n2);
			if (res != null) {
				return res;
			}
		}
		return res;
	}

	com.google.javascript.rhino.Node.NodeMismatch checkTreeTypeAwareEqualsImpl(com.google.javascript.rhino.Node node2) {
		if (!(isEquivalentTo(node2, true, false))) {
			return new com.google.javascript.rhino.Node.NodeMismatch(com.google.javascript.rhino.Node.this, node2);
		}
		com.google.javascript.rhino.Node.NodeMismatch res = null;
		com.google.javascript.rhino.Node n;
		com.google.javascript.rhino.Node n2;
		for (n = first, n2 = node2.first; (res == null) && (n != null); n = n.next , n2 = n2.next) {
			res = n.checkTreeTypeAwareEqualsImpl(n2);
			if (res != null) {
				return res;
			}
		}
		return res;
	}

	public boolean isEquivalentTo(com.google.javascript.rhino.Node node) {
		return isEquivalentTo(node, false, true);
	}

	public boolean isEquivalentToTyped(com.google.javascript.rhino.Node node) {
		return isEquivalentTo(node, true, true);
	}

	boolean isEquivalentTo(com.google.javascript.rhino.Node node, boolean compareJsType, boolean recurse) {
		if ((((type) != (node.getType())) || ((getChildCount()) != (node.getChildCount()))) || ((com.google.javascript.rhino.Node.this.getClass()) != (node.getClass()))) {
			return false;
		}
		if (compareJsType && (!(com.google.javascript.rhino.jstype.JSType.isEquivalent(jsType, node.getJSType())))) {
			return false;
		}
		if (((type) == (com.google.javascript.rhino.Token.INC)) || ((type) == (com.google.javascript.rhino.Token.DEC))) {
			int post1 = com.google.javascript.rhino.Node.this.getIntProp(com.google.javascript.rhino.Node.INCRDECR_PROP);
			int post2 = node.getIntProp(com.google.javascript.rhino.Node.INCRDECR_PROP);
			if (post1 != post2) {
				return false;
			}
		}else
			if (((type) == (com.google.javascript.rhino.Token.STRING)) || ((type) == (com.google.javascript.rhino.Token.STRING_KEY))) {
				if ((type) == (com.google.javascript.rhino.Token.STRING_KEY)) {
					int quoted1 = com.google.javascript.rhino.Node.this.getIntProp(com.google.javascript.rhino.Node.QUOTED_PROP);
					int quoted2 = node.getIntProp(com.google.javascript.rhino.Node.QUOTED_PROP);
					if (quoted1 != quoted2) {
						return false;
					}
				}
				int slashV1 = com.google.javascript.rhino.Node.this.getIntProp(com.google.javascript.rhino.Node.SLASH_V);
				int slashV2 = node.getIntProp(com.google.javascript.rhino.Node.SLASH_V);
				if (slashV1 != slashV2) {
					return false;
				}
			}else
				if ((type) == (com.google.javascript.rhino.Token.CALL)) {
					if ((com.google.javascript.rhino.Node.this.getBooleanProp(com.google.javascript.rhino.Node.FREE_CALL)) != (node.getBooleanProp(com.google.javascript.rhino.Node.FREE_CALL))) {
						return false;
					}
				}
			
		
		if (recurse) {
			com.google.javascript.rhino.Node n;
			com.google.javascript.rhino.Node n2;
			for (n = first, n2 = node.first; n != null; n = n.next , n2 = n2.next) {
				if (!(n.isEquivalentTo(n2, compareJsType, true))) {
					return false;
				}
			}
		}
		return true;
	}

	public java.lang.String getQualifiedName() {
		if ((type) == (com.google.javascript.rhino.Token.NAME)) {
			return getString();
		}else
			if ((type) == (com.google.javascript.rhino.Token.GETPROP)) {
				java.lang.String left = getFirstChild().getQualifiedName();
				if (left == null) {
					return null;
				}
				return (left + ".") + (getLastChild().getString());
			}else
				if ((type) == (com.google.javascript.rhino.Token.THIS)) {
					return "this";
				}else {
					return null;
				}
			
		
	}

	public boolean isQualifiedName() {
		switch (getType()) {
			case com.google.javascript.rhino.Token.NAME :
			case com.google.javascript.rhino.Token.THIS :
				return true;
			case com.google.javascript.rhino.Token.GETPROP :
				return getFirstChild().isQualifiedName();
			default :
				return false;
		}
	}

	public boolean isUnscopedQualifiedName() {
		switch (getType()) {
			case com.google.javascript.rhino.Token.NAME :
				return true;
			case com.google.javascript.rhino.Token.GETPROP :
				return getFirstChild().isUnscopedQualifiedName();
			default :
				return false;
		}
	}

	public com.google.javascript.rhino.Node detachFromParent() {
		com.google.common.base.Preconditions.checkState(((parent) != null));
		parent.removeChild(com.google.javascript.rhino.Node.this);
		return com.google.javascript.rhino.Node.this;
	}

	public com.google.javascript.rhino.Node removeFirstChild() {
		com.google.javascript.rhino.Node child = first;
		if (child != null) {
			removeChild(child);
		}
		return child;
	}

	public com.google.javascript.rhino.Node removeChildren() {
		com.google.javascript.rhino.Node children = first;
		for (com.google.javascript.rhino.Node child = first; child != null; child = child.getNext()) {
			child.parent = null;
		}
		first = null;
		last = null;
		return children;
	}

	public void detachChildren() {
		for (com.google.javascript.rhino.Node child = first; child != null;) {
			com.google.javascript.rhino.Node nextChild = child.getNext();
			child.parent = null;
			child.next = null;
			child = nextChild;
		}
		first = null;
		last = null;
	}

	public com.google.javascript.rhino.Node removeChildAfter(com.google.javascript.rhino.Node prev) {
		com.google.common.base.Preconditions.checkArgument(((prev.parent) == (com.google.javascript.rhino.Node.this)), "prev is not a child of this node.");
		com.google.common.base.Preconditions.checkArgument(((prev.next) != null), "no next sibling.");
		com.google.javascript.rhino.Node child = prev.next;
		prev.next = child.next;
		if (child == (last))
			last = prev;
		
		child.next = null;
		child.parent = null;
		return child;
	}

	public com.google.javascript.rhino.Node cloneNode() {
		com.google.javascript.rhino.Node result;
		try {
			result = ((com.google.javascript.rhino.Node) (super.clone()));
			result.next = null;
			result.first = null;
			result.last = null;
			result.parent = null;
		} catch (java.lang.CloneNotSupportedException e) {
			throw new java.lang.RuntimeException(e.getMessage());
		}
		return result;
	}

	public com.google.javascript.rhino.Node cloneTree() {
		com.google.javascript.rhino.Node result = cloneNode();
		for (com.google.javascript.rhino.Node n2 = getFirstChild(); n2 != null; n2 = n2.getNext()) {
			com.google.javascript.rhino.Node n2clone = n2.cloneTree();
			n2clone.parent = result;
			if ((result.last) != null) {
				result.last.next = n2clone;
			}
			if ((result.first) == null) {
				result.first = n2clone;
			}
			result.last = n2clone;
		}
		return result;
	}

	public com.google.javascript.rhino.Node copyInformationFrom(com.google.javascript.rhino.Node other) {
		if ((getProp(com.google.javascript.rhino.Node.ORIGINALNAME_PROP)) == null) {
			putProp(com.google.javascript.rhino.Node.ORIGINALNAME_PROP, other.getProp(com.google.javascript.rhino.Node.ORIGINALNAME_PROP));
		}
		if ((getProp(com.google.javascript.rhino.Node.STATIC_SOURCE_FILE)) == null) {
			putProp(com.google.javascript.rhino.Node.STATIC_SOURCE_FILE, other.getProp(com.google.javascript.rhino.Node.STATIC_SOURCE_FILE));
			sourcePosition = other.sourcePosition;
		}else
			if ((getProp(com.google.javascript.rhino.Node.SOURCENAME_PROP)) == null) {
				putProp(com.google.javascript.rhino.Node.SOURCENAME_PROP, other.getProp(com.google.javascript.rhino.Node.SOURCENAME_PROP));
				sourcePosition = other.sourcePosition;
			}
		
		return com.google.javascript.rhino.Node.this;
	}

	public com.google.javascript.rhino.Node copyInformationFromForTree(com.google.javascript.rhino.Node other) {
		copyInformationFrom(other);
		for (com.google.javascript.rhino.Node child = getFirstChild(); child != null; child = child.getNext()) {
			child.copyInformationFromForTree(other);
		}
		return com.google.javascript.rhino.Node.this;
	}

	public com.google.javascript.rhino.Node useSourceInfoFrom(com.google.javascript.rhino.Node other) {
		putProp(com.google.javascript.rhino.Node.ORIGINALNAME_PROP, other.getProp(com.google.javascript.rhino.Node.ORIGINALNAME_PROP));
		putProp(com.google.javascript.rhino.Node.STATIC_SOURCE_FILE, other.getProp(com.google.javascript.rhino.Node.STATIC_SOURCE_FILE));
		sourcePosition = other.sourcePosition;
		return com.google.javascript.rhino.Node.this;
	}

	public com.google.javascript.rhino.Node srcref(com.google.javascript.rhino.Node other) {
		return useSourceInfoFrom(other);
	}

	public com.google.javascript.rhino.Node useSourceInfoFromForTree(com.google.javascript.rhino.Node other) {
		useSourceInfoFrom(other);
		for (com.google.javascript.rhino.Node child = getFirstChild(); child != null; child = child.getNext()) {
			child.useSourceInfoFromForTree(other);
		}
		return com.google.javascript.rhino.Node.this;
	}

	public com.google.javascript.rhino.Node srcrefTree(com.google.javascript.rhino.Node other) {
		return useSourceInfoFromForTree(other);
	}

	public com.google.javascript.rhino.Node useSourceInfoIfMissingFrom(com.google.javascript.rhino.Node other) {
		if ((getProp(com.google.javascript.rhino.Node.ORIGINALNAME_PROP)) == null) {
			putProp(com.google.javascript.rhino.Node.ORIGINALNAME_PROP, other.getProp(com.google.javascript.rhino.Node.ORIGINALNAME_PROP));
		}
		if ((getProp(com.google.javascript.rhino.Node.STATIC_SOURCE_FILE)) == null) {
			putProp(com.google.javascript.rhino.Node.STATIC_SOURCE_FILE, other.getProp(com.google.javascript.rhino.Node.STATIC_SOURCE_FILE));
			sourcePosition = other.sourcePosition;
		}
		return com.google.javascript.rhino.Node.this;
	}

	public com.google.javascript.rhino.Node useSourceInfoIfMissingFromForTree(com.google.javascript.rhino.Node other) {
		useSourceInfoIfMissingFrom(other);
		for (com.google.javascript.rhino.Node child = getFirstChild(); child != null; child = child.getNext()) {
			child.useSourceInfoIfMissingFromForTree(other);
		}
		return com.google.javascript.rhino.Node.this;
	}

	public com.google.javascript.rhino.jstype.JSType getJSType() {
		return jsType;
	}

	public void setJSType(com.google.javascript.rhino.jstype.JSType jsType) {
		com.google.javascript.rhino.Node.this.jsType = jsType;
	}

	public com.google.javascript.rhino.Node.FileLevelJsDocBuilder getJsDocBuilderForNode() {
		return new com.google.javascript.rhino.Node.FileLevelJsDocBuilder();
	}

	public class FileLevelJsDocBuilder {
		public void append(java.lang.String fileLevelComment) {
			com.google.javascript.rhino.JSDocInfo jsDocInfo = getJSDocInfo();
			if (jsDocInfo == null) {
				jsDocInfo = new com.google.javascript.rhino.JSDocInfo(false);
			}
			java.lang.String license = jsDocInfo.getLicense();
			if (license == null) {
				license = "";
			}
			jsDocInfo.setLicense((license + fileLevelComment));
			setJSDocInfo(jsDocInfo);
		}
	}

	public com.google.javascript.rhino.JSDocInfo getJSDocInfo() {
		return ((com.google.javascript.rhino.JSDocInfo) (getProp(com.google.javascript.rhino.Node.JSDOC_INFO_PROP)));
	}

	public void setJSDocInfo(com.google.javascript.rhino.JSDocInfo info) {
		putProp(com.google.javascript.rhino.Node.JSDOC_INFO_PROP, info);
	}

	public void setVarArgs(boolean varArgs) {
		putBooleanProp(com.google.javascript.rhino.Node.VAR_ARGS_NAME, varArgs);
	}

	public boolean isVarArgs() {
		return getBooleanProp(com.google.javascript.rhino.Node.VAR_ARGS_NAME);
	}

	public void setOptionalArg(boolean optionalArg) {
		putBooleanProp(com.google.javascript.rhino.Node.OPT_ARG_NAME, optionalArg);
	}

	public boolean isOptionalArg() {
		return getBooleanProp(com.google.javascript.rhino.Node.OPT_ARG_NAME);
	}

	public void setIsSyntheticBlock(boolean val) {
		putBooleanProp(com.google.javascript.rhino.Node.SYNTHETIC_BLOCK_PROP, val);
	}

	public boolean isSyntheticBlock() {
		return getBooleanProp(com.google.javascript.rhino.Node.SYNTHETIC_BLOCK_PROP);
	}

	public void setDirectives(java.util.Set<java.lang.String> val) {
		putProp(com.google.javascript.rhino.Node.DIRECTIVES, val);
	}

	@java.lang.SuppressWarnings(value = "unchecked")
	public java.util.Set<java.lang.String> getDirectives() {
		return ((java.util.Set<java.lang.String>) (getProp(com.google.javascript.rhino.Node.DIRECTIVES)));
	}

	public void addSuppression(java.lang.String warning) {
		if ((getJSDocInfo()) == null) {
			setJSDocInfo(new com.google.javascript.rhino.JSDocInfo(false));
		}
		getJSDocInfo().addSuppression(warning);
	}

	public void setWasEmptyNode(boolean val) {
		putBooleanProp(com.google.javascript.rhino.Node.EMPTY_BLOCK, val);
	}

	public boolean wasEmptyNode() {
		return getBooleanProp(com.google.javascript.rhino.Node.EMPTY_BLOCK);
	}

	public static final int FLAG_GLOBAL_STATE_UNMODIFIED = 1;

	public static final int FLAG_THIS_UNMODIFIED = 2;

	public static final int FLAG_ARGUMENTS_UNMODIFIED = 4;

	public static final int FLAG_NO_THROWS = 8;

	public static final int FLAG_LOCAL_RESULTS = 16;

	public static final int SIDE_EFFECTS_FLAGS_MASK = 31;

	public static final int SIDE_EFFECTS_ALL = 0;

	public static final int NO_SIDE_EFFECTS = (((com.google.javascript.rhino.Node.FLAG_GLOBAL_STATE_UNMODIFIED) | (com.google.javascript.rhino.Node.FLAG_THIS_UNMODIFIED)) | (com.google.javascript.rhino.Node.FLAG_ARGUMENTS_UNMODIFIED)) | (com.google.javascript.rhino.Node.FLAG_NO_THROWS);

	public void setSideEffectFlags(int flags) {
		com.google.common.base.Preconditions.checkArgument((((getType()) == (com.google.javascript.rhino.Token.CALL)) || ((getType()) == (com.google.javascript.rhino.Token.NEW))), ("setIsNoSideEffectsCall only supports CALL and NEW nodes, got " + (com.google.javascript.rhino.Token.name(getType()))));
		putIntProp(com.google.javascript.rhino.Node.SIDE_EFFECT_FLAGS, flags);
	}

	public void setSideEffectFlags(com.google.javascript.rhino.Node.SideEffectFlags flags) {
		setSideEffectFlags(flags.valueOf());
	}

	public int getSideEffectFlags() {
		return getIntProp(com.google.javascript.rhino.Node.SIDE_EFFECT_FLAGS);
	}

	public static class SideEffectFlags {
		private int value = com.google.javascript.rhino.Node.SIDE_EFFECTS_ALL;

		public SideEffectFlags() {
		}

		public SideEffectFlags(int value) {
			com.google.javascript.rhino.Node.SideEffectFlags.this.value = value;
		}

		public int valueOf() {
			return value;
		}

		public void setAllFlags() {
			value = com.google.javascript.rhino.Node.SIDE_EFFECTS_ALL;
		}

		public void clearAllFlags() {
			value = (com.google.javascript.rhino.Node.NO_SIDE_EFFECTS) | (com.google.javascript.rhino.Node.FLAG_LOCAL_RESULTS);
		}

		public boolean areAllFlagsSet() {
			return (value) == (com.google.javascript.rhino.Node.SIDE_EFFECTS_ALL);
		}

		public void clearSideEffectFlags() {
			value |= com.google.javascript.rhino.Node.NO_SIDE_EFFECTS;
		}

		public void setMutatesGlobalState() {
			removeFlag(com.google.javascript.rhino.Node.FLAG_GLOBAL_STATE_UNMODIFIED);
			removeFlag(com.google.javascript.rhino.Node.FLAG_ARGUMENTS_UNMODIFIED);
			removeFlag(com.google.javascript.rhino.Node.FLAG_THIS_UNMODIFIED);
		}

		public void setThrows() {
			removeFlag(com.google.javascript.rhino.Node.FLAG_NO_THROWS);
		}

		public void setMutatesThis() {
			removeFlag(com.google.javascript.rhino.Node.FLAG_THIS_UNMODIFIED);
		}

		public void setMutatesArguments() {
			removeFlag(com.google.javascript.rhino.Node.FLAG_ARGUMENTS_UNMODIFIED);
		}

		public void setReturnsTainted() {
			removeFlag(com.google.javascript.rhino.Node.FLAG_LOCAL_RESULTS);
		}

		private void removeFlag(int flag) {
			value &= ~flag;
		}
	}

	public boolean isOnlyModifiesThisCall() {
		return areBitFlagsSet(((getSideEffectFlags()) & (com.google.javascript.rhino.Node.NO_SIDE_EFFECTS)), (((com.google.javascript.rhino.Node.FLAG_GLOBAL_STATE_UNMODIFIED) | (com.google.javascript.rhino.Node.FLAG_ARGUMENTS_UNMODIFIED)) | (com.google.javascript.rhino.Node.FLAG_NO_THROWS)));
	}

	public boolean isNoSideEffectsCall() {
		return areBitFlagsSet(getSideEffectFlags(), com.google.javascript.rhino.Node.NO_SIDE_EFFECTS);
	}

	public boolean isLocalResultCall() {
		return areBitFlagsSet(getSideEffectFlags(), com.google.javascript.rhino.Node.FLAG_LOCAL_RESULTS);
	}

	private boolean areBitFlagsSet(int value, int flags) {
		return (value & flags) == flags;
	}

	public boolean isQuotedString() {
		return false;
	}

	public void setQuotedString() {
		throw new java.lang.IllegalStateException("not a StringNode");
	}

	static class NodeMismatch {
		final com.google.javascript.rhino.Node nodeA;

		final com.google.javascript.rhino.Node nodeB;

		NodeMismatch(com.google.javascript.rhino.Node nodeA, com.google.javascript.rhino.Node nodeB) {
			this.nodeA = nodeA;
			this.nodeB = nodeB;
		}

		@java.lang.Override
		public boolean equals(java.lang.Object object) {
			if (object instanceof com.google.javascript.rhino.Node.NodeMismatch) {
				com.google.javascript.rhino.Node.NodeMismatch that = ((com.google.javascript.rhino.Node.NodeMismatch) (object));
				return (that.nodeA.equals(com.google.javascript.rhino.Node.NodeMismatch.this.nodeA)) && (that.nodeB.equals(com.google.javascript.rhino.Node.NodeMismatch.this.nodeB));
			}
			return false;
		}

		@java.lang.Override
		public int hashCode() {
			return com.google.common.base.Objects.hashCode(nodeA, nodeB);
		}
	}

	public boolean isAdd() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.ADD);
	}

	public boolean isAnd() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.AND);
	}

	public boolean isArrayLit() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.ARRAYLIT);
	}

	public boolean isAssign() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.ASSIGN);
	}

	public boolean isAssignAdd() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.ASSIGN_ADD);
	}

	public boolean isBlock() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.BLOCK);
	}

	public boolean isBreak() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.BREAK);
	}

	public boolean isCall() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.CALL);
	}

	public boolean isCase() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.CASE);
	}

	public boolean isCatch() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.CATCH);
	}

	public boolean isComma() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.COMMA);
	}

	public boolean isContinue() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.CONTINUE);
	}

	public boolean isDebugger() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.DEBUGGER);
	}

	public boolean isDec() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.DEC);
	}

	public boolean isDefaultCase() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.DEFAULT_CASE);
	}

	public boolean isDelProp() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.DELPROP);
	}

	public boolean isDo() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.DO);
	}

	public boolean isEmpty() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.EMPTY);
	}

	public boolean isExprResult() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.EXPR_RESULT);
	}

	public boolean isFalse() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.FALSE);
	}

	public boolean isFor() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.FOR);
	}

	public boolean isFunction() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.FUNCTION);
	}

	public boolean isGetterDef() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.GETTER_DEF);
	}

	public boolean isGetElem() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.GETELEM);
	}

	public boolean isGetProp() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.GETPROP);
	}

	public boolean isHook() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.HOOK);
	}

	public boolean isIf() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.IF);
	}

	public boolean isIn() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.IN);
	}

	public boolean isInc() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.INC);
	}

	public boolean isInstanceOf() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.INSTANCEOF);
	}

	public boolean isLabel() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.LABEL);
	}

	public boolean isLabelName() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.LABEL_NAME);
	}

	public boolean isName() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.NAME);
	}

	public boolean isNE() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.NE);
	}

	public boolean isNew() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.NEW);
	}

	public boolean isNot() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.NOT);
	}

	public boolean isNull() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.NULL);
	}

	public boolean isNumber() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.NUMBER);
	}

	public boolean isObjectLit() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.OBJECTLIT);
	}

	public boolean isOr() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.OR);
	}

	public boolean isParamList() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.PARAM_LIST);
	}

	public boolean isRegExp() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.REGEXP);
	}

	public boolean isReturn() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.RETURN);
	}

	public boolean isScript() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.SCRIPT);
	}

	public boolean isSetterDef() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.SETTER_DEF);
	}

	public boolean isString() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.STRING);
	}

	public boolean isStringKey() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.STRING_KEY);
	}

	public boolean isSwitch() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.SWITCH);
	}

	public boolean isThis() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.THIS);
	}

	public boolean isThrow() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.THROW);
	}

	public boolean isTrue() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.TRUE);
	}

	public boolean isTry() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.TRY);
	}

	public boolean isTypeOf() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.TYPEOF);
	}

	public boolean isVar() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.VAR);
	}

	public boolean isVoid() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.VOID);
	}

	public boolean isWhile() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.WHILE);
	}

	public boolean isWith() {
		return (com.google.javascript.rhino.Node.this.getType()) == (com.google.javascript.rhino.Token.WITH);
	}
}

