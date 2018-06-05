

package com.google.javascript.rhino;


public class Node implements java.io.Serializable , java.lang.Cloneable {
	private static final long serialVersionUID = 1L;

	public static final int LOCAL_BLOCK_PROP = -3;

	public static final int OBJECT_IDS_PROP = -2;

	public static final int CATCH_SCOPE_PROP = -1;

	public static final int LABEL_ID_PROP = 0;

	public static final int TARGET_PROP = 1;

	public static final int BREAK_PROP = 2;

	public static final int CONTINUE_PROP = 3;

	public static final int ENUM_PROP = 4;

	public static final int FUNCTION_PROP = 5;

	public static final int TEMP_PROP = 6;

	public static final int LOCAL_PROP = 7;

	public static final int CODEOFFSET_PROP = 8;

	public static final int FIXUPS_PROP = 9;

	public static final int VARS_PROP = 10;

	public static final int USES_PROP = 11;

	public static final int REGEXP_PROP = 12;

	public static final int CASES_PROP = 13;

	public static final int DEFAULT_PROP = 14;

	public static final int CASEARRAY_PROP = 15;

	public static final int SOURCENAME_PROP = 16;

	public static final int TYPE_PROP = 17;

	public static final int SPECIAL_PROP_PROP = 18;

	public static final int LABEL_PROP = 19;

	public static final int FINALLY_PROP = 20;

	public static final int LOCALCOUNT_PROP = 21;

	public static final int TARGETBLOCK_PROP = 22;

	public static final int VARIABLE_PROP = 23;

	public static final int LASTUSE_PROP = 24;

	public static final int ISNUMBER_PROP = 25;

	public static final int DIRECTCALL_PROP = 26;

	public static final int SPECIALCALL_PROP = 27;

	public static final int DEBUGSOURCE_PROP = 28;

	public static final int JSDOC_INFO_PROP = 29;

	public static final int VAR_ARGS_NAME = 30;

	public static final int SKIP_INDEXES_PROP = 31;

	public static final int INCRDECR_PROP = 32;

	public static final int MEMBER_TYPE_PROP = 33;

	public static final int NAME_PROP = 34;

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

	public static final int LAST_PROP = 52;

	public static final int BOTH = 0;

	public static final int LEFT = 1;

	public static final int RIGHT = 2;

	public static final int NON_SPECIALCALL = 0;

	public static final int SPECIALCALL_EVAL = 1;

	public static final int SPECIALCALL_WITH = 2;

	public static final int DECR_FLAG = 1;

	public static final int POST_FLAG = 2;

	public static final int PROPERTY_FLAG = 1;

	public static final int ATTRIBUTE_FLAG = 2;

	public static final int DESCENDANTS_FLAG = 4;

	private static final java.lang.String propToString(int propType) {
		switch (propType) {
			case com.google.javascript.rhino.Node.LOCAL_BLOCK_PROP :
				return "local_block";
			case com.google.javascript.rhino.Node.OBJECT_IDS_PROP :
				return "object_ids_prop";
			case com.google.javascript.rhino.Node.CATCH_SCOPE_PROP :
				return "catch_scope_prop";
			case com.google.javascript.rhino.Node.LABEL_ID_PROP :
				return "label_id_prop";
			case com.google.javascript.rhino.Node.TARGET_PROP :
				return "target";
			case com.google.javascript.rhino.Node.BRACELESS_TYPE :
				return "braceless_type";
			case com.google.javascript.rhino.Node.BREAK_PROP :
				return "break";
			case com.google.javascript.rhino.Node.CONTINUE_PROP :
				return "continue";
			case com.google.javascript.rhino.Node.ENUM_PROP :
				return "enum";
			case com.google.javascript.rhino.Node.FUNCTION_PROP :
				return "function";
			case com.google.javascript.rhino.Node.TEMP_PROP :
				return "temp";
			case com.google.javascript.rhino.Node.LOCAL_PROP :
				return "local";
			case com.google.javascript.rhino.Node.CODEOFFSET_PROP :
				return "codeoffset";
			case com.google.javascript.rhino.Node.FIXUPS_PROP :
				return "fixups";
			case com.google.javascript.rhino.Node.VARS_PROP :
				return "vars";
			case com.google.javascript.rhino.Node.VAR_ARGS_NAME :
				return "var_args_name";
			case com.google.javascript.rhino.Node.USES_PROP :
				return "uses";
			case com.google.javascript.rhino.Node.REGEXP_PROP :
				return "regexp";
			case com.google.javascript.rhino.Node.CASES_PROP :
				return "cases";
			case com.google.javascript.rhino.Node.DEFAULT_PROP :
				return "default";
			case com.google.javascript.rhino.Node.CASEARRAY_PROP :
				return "casearray";
			case com.google.javascript.rhino.Node.SOURCENAME_PROP :
				return "sourcename";
			case com.google.javascript.rhino.Node.TYPE_PROP :
				return "type";
			case com.google.javascript.rhino.Node.SPECIAL_PROP_PROP :
				return "special_prop";
			case com.google.javascript.rhino.Node.LABEL_PROP :
				return "label";
			case com.google.javascript.rhino.Node.FINALLY_PROP :
				return "finally";
			case com.google.javascript.rhino.Node.LOCALCOUNT_PROP :
				return "localcount";
			case com.google.javascript.rhino.Node.TARGETBLOCK_PROP :
				return "targetblock";
			case com.google.javascript.rhino.Node.VARIABLE_PROP :
				return "variable";
			case com.google.javascript.rhino.Node.LASTUSE_PROP :
				return "lastuse";
			case com.google.javascript.rhino.Node.ISNUMBER_PROP :
				return "isnumber";
			case com.google.javascript.rhino.Node.DIRECTCALL_PROP :
				return "directcall";
			case com.google.javascript.rhino.Node.SPECIALCALL_PROP :
				return "specialcall";
			case com.google.javascript.rhino.Node.DEBUGSOURCE_PROP :
				return "debugsource";
			case com.google.javascript.rhino.Node.JSDOC_INFO_PROP :
				return "jsdoc_info";
			case com.google.javascript.rhino.Node.SKIP_INDEXES_PROP :
				return "skip_indexes";
			case com.google.javascript.rhino.Node.INCRDECR_PROP :
				return "incrdecr";
			case com.google.javascript.rhino.Node.MEMBER_TYPE_PROP :
				return "member_type";
			case com.google.javascript.rhino.Node.NAME_PROP :
				return "name";
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
			case com.google.javascript.rhino.Node.LENGTH :
				return "length";
			default :
				com.google.javascript.rhino.Kit.codeBug();
		}
		return null;
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
			return (super.isEquivalentTo(node, compareJsType, recurse)) && ((getDouble()) == (((com.google.javascript.rhino.Node.NumberNode) (node)).getDouble()));
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

		public int getType() {
			return propType;
		}

		public com.google.javascript.rhino.Node.PropListItem getNext() {
			return next;
		}

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
		for (com.google.javascript.rhino.Node child = children; child != null; child = child.next) {
			com.google.common.base.Preconditions.checkArgument(((child.parent) == null));
			child.parent = com.google.javascript.rhino.Node.this;
		}
		if ((last) != null) {
			last.next = children;
		}
		last = children.getLastSibling();
		if ((first) == null) {
			first = children;
		}
	}

	public void addChildBefore(com.google.javascript.rhino.Node newChild, com.google.javascript.rhino.Node node) {
		com.google.common.base.Preconditions.checkArgument((node != null), "The existing child node of the parent should not be null.");
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
		com.google.common.base.Preconditions.checkArgument(((newChild.parent) == null), "The new child node already has a parent.");
		newChild.parent = com.google.javascript.rhino.Node.this;
		newChild.next = node.next;
		node.next = newChild;
		if ((last) == node) {
			last = newChild;
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
			com.google.javascript.rhino.Kit.codeBug();
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

	public int getLineno() {
		return com.google.javascript.rhino.Node.extractLineno(sourcePosition);
	}

	public int getCharno() {
		return com.google.javascript.rhino.Node.extractCharno(sourcePosition);
	}

	public int getSourcePosition() {
		return sourcePosition;
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
		if (com.google.javascript.rhino.Token.printTrees) {
			java.lang.StringBuilder sb = new java.lang.StringBuilder();
			toString(sb, printSource, printAnnotations, printType);
			return sb.toString();
		}
		return java.lang.String.valueOf(type);
	}

	private void toString(java.lang.StringBuilder sb, boolean printSource, boolean printAnnotations, boolean printType) {
		if (com.google.javascript.rhino.Token.printTrees) {
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
					if ((com.google.javascript.rhino.Node.this) instanceof com.google.javascript.rhino.ScriptOrFnNode) {
						com.google.javascript.rhino.ScriptOrFnNode sof = ((com.google.javascript.rhino.ScriptOrFnNode) (com.google.javascript.rhino.Node.this));
						if ((com.google.javascript.rhino.Node.this) instanceof com.google.javascript.rhino.FunctionNode) {
							com.google.javascript.rhino.FunctionNode fn = ((com.google.javascript.rhino.FunctionNode) (com.google.javascript.rhino.Node.this));
							sb.append(' ');
							sb.append(fn.getFunctionName());
						}
						if (printSource) {
							sb.append(" [source name: ");
							sb.append(sof.getSourceName());
							sb.append("] [encoded source length: ");
							sb.append(((sof.getEncodedSourceEnd()) - (sof.getEncodedSourceStart())));
							sb.append("] [base line: ");
							sb.append(sof.getBaseLineno());
							sb.append("] [end line: ");
							sb.append(sof.getEndLineno());
							sb.append(']');
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
						case com.google.javascript.rhino.Node.TARGETBLOCK_PROP :
							value = "target block property";
							break;
						case com.google.javascript.rhino.Node.LOCAL_BLOCK_PROP :
							value = "last local block";
							break;
						case com.google.javascript.rhino.Node.ISNUMBER_PROP :
							switch (x.getIntValue()) {
								case com.google.javascript.rhino.Node.BOTH :
									value = "both";
									break;
								case com.google.javascript.rhino.Node.RIGHT :
									value = "right";
									break;
								case com.google.javascript.rhino.Node.LEFT :
									value = "left";
									break;
								default :
									throw com.google.javascript.rhino.Kit.codeBug();
							}
							break;
						case com.google.javascript.rhino.Node.SPECIALCALL_PROP :
							switch (x.getIntValue()) {
								case com.google.javascript.rhino.Node.SPECIALCALL_EVAL :
									value = "eval";
									break;
								case com.google.javascript.rhino.Node.SPECIALCALL_WITH :
									value = "with";
									break;
								default :
									throw com.google.javascript.rhino.Kit.codeBug();
							}
							break;
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
		if (com.google.javascript.rhino.Token.printTrees) {
			for (int i = 0; i != level; ++i) {
				sb.append("    ");
			}
			sb.append(n.toString());
			sb.append('\n');
			for (com.google.javascript.rhino.Node cursor = n.getFirstChild(); cursor != null; cursor = cursor.getNext()) {
				com.google.javascript.rhino.Node.toStringTreeHelper(cursor, (level + 1), sb);
			}
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

	public void setSourcePositionForTree(int sourcePosition) {
		com.google.javascript.rhino.Node.this.sourcePosition = sourcePosition;
		for (com.google.javascript.rhino.Node child = getFirstChild(); child != null; child = child.getNext()) {
			child.setSourcePositionForTree(sourcePosition);
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

		public java.util.Iterator<com.google.javascript.rhino.Node> iterator() {
			if (!(used)) {
				used = true;
				return com.google.javascript.rhino.Node.SiblingNodeIterable.this;
			}else {
				return new com.google.javascript.rhino.Node.SiblingNodeIterable(start).iterator();
			}
		}

		public boolean hasNext() {
			return (current) != null;
		}

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

		public java.util.Iterator<com.google.javascript.rhino.Node> iterator() {
			return new java.util.Iterator<com.google.javascript.rhino.Node>() {
				public boolean hasNext() {
					return (cur) != null;
				}

				public com.google.javascript.rhino.Node next() {
					if (!(hasNext()))
						throw new java.util.NoSuchElementException();
					
					com.google.javascript.rhino.Node n = cur;
					cur = cur.getParent();
					return n;
				}

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

	@java.lang.SuppressWarnings(value = "unchecked")
	private static java.lang.Class getNodeClass(com.google.javascript.rhino.Node n) {
		java.lang.Class c = n.getClass();
		if ((c == (com.google.javascript.rhino.FunctionNode.class)) || (c == (com.google.javascript.rhino.ScriptOrFnNode.class))) {
			return com.google.javascript.rhino.Node.class;
		}
		return c;
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

	public static java.lang.String tokenToName(int token) {
		switch (token) {
			case com.google.javascript.rhino.Token.ERROR :
				return "error";
			case com.google.javascript.rhino.Token.EOF :
				return "eof";
			case com.google.javascript.rhino.Token.EOL :
				return "eol";
			case com.google.javascript.rhino.Token.ENTERWITH :
				return "enterwith";
			case com.google.javascript.rhino.Token.LEAVEWITH :
				return "leavewith";
			case com.google.javascript.rhino.Token.RETURN :
				return "return";
			case com.google.javascript.rhino.Token.GOTO :
				return "goto";
			case com.google.javascript.rhino.Token.IFEQ :
				return "ifeq";
			case com.google.javascript.rhino.Token.IFNE :
				return "ifne";
			case com.google.javascript.rhino.Token.SETNAME :
				return "setname";
			case com.google.javascript.rhino.Token.BITOR :
				return "bitor";
			case com.google.javascript.rhino.Token.BITXOR :
				return "bitxor";
			case com.google.javascript.rhino.Token.BITAND :
				return "bitand";
			case com.google.javascript.rhino.Token.EQ :
				return "eq";
			case com.google.javascript.rhino.Token.NE :
				return "ne";
			case com.google.javascript.rhino.Token.LT :
				return "lt";
			case com.google.javascript.rhino.Token.LE :
				return "le";
			case com.google.javascript.rhino.Token.GT :
				return "gt";
			case com.google.javascript.rhino.Token.GE :
				return "ge";
			case com.google.javascript.rhino.Token.LSH :
				return "lsh";
			case com.google.javascript.rhino.Token.RSH :
				return "rsh";
			case com.google.javascript.rhino.Token.URSH :
				return "ursh";
			case com.google.javascript.rhino.Token.ADD :
				return "add";
			case com.google.javascript.rhino.Token.SUB :
				return "sub";
			case com.google.javascript.rhino.Token.MUL :
				return "mul";
			case com.google.javascript.rhino.Token.DIV :
				return "div";
			case com.google.javascript.rhino.Token.MOD :
				return "mod";
			case com.google.javascript.rhino.Token.BITNOT :
				return "bitnot";
			case com.google.javascript.rhino.Token.NEG :
				return "neg";
			case com.google.javascript.rhino.Token.NEW :
				return "new";
			case com.google.javascript.rhino.Token.DELPROP :
				return "delprop";
			case com.google.javascript.rhino.Token.TYPEOF :
				return "typeof";
			case com.google.javascript.rhino.Token.GETPROP :
				return "getprop";
			case com.google.javascript.rhino.Token.SETPROP :
				return "setprop";
			case com.google.javascript.rhino.Token.GETELEM :
				return "getelem";
			case com.google.javascript.rhino.Token.SETELEM :
				return "setelem";
			case com.google.javascript.rhino.Token.CALL :
				return "call";
			case com.google.javascript.rhino.Token.NAME :
				return "name";
			case com.google.javascript.rhino.Token.NUMBER :
				return "number";
			case com.google.javascript.rhino.Token.STRING :
				return "string";
			case com.google.javascript.rhino.Token.NULL :
				return "null";
			case com.google.javascript.rhino.Token.THIS :
				return "this";
			case com.google.javascript.rhino.Token.FALSE :
				return "false";
			case com.google.javascript.rhino.Token.TRUE :
				return "true";
			case com.google.javascript.rhino.Token.SHEQ :
				return "sheq";
			case com.google.javascript.rhino.Token.SHNE :
				return "shne";
			case com.google.javascript.rhino.Token.REGEXP :
				return "regexp";
			case com.google.javascript.rhino.Token.POS :
				return "pos";
			case com.google.javascript.rhino.Token.BINDNAME :
				return "bindname";
			case com.google.javascript.rhino.Token.THROW :
				return "throw";
			case com.google.javascript.rhino.Token.IN :
				return "in";
			case com.google.javascript.rhino.Token.INSTANCEOF :
				return "instanceof";
			case com.google.javascript.rhino.Token.GETVAR :
				return "getvar";
			case com.google.javascript.rhino.Token.SETVAR :
				return "setvar";
			case com.google.javascript.rhino.Token.TRY :
				return "try";
			case com.google.javascript.rhino.Token.TYPEOFNAME :
				return "typeofname";
			case com.google.javascript.rhino.Token.THISFN :
				return "thisfn";
			case com.google.javascript.rhino.Token.SEMI :
				return "semi";
			case com.google.javascript.rhino.Token.LB :
				return "lb";
			case com.google.javascript.rhino.Token.RB :
				return "rb";
			case com.google.javascript.rhino.Token.LC :
				return "lc";
			case com.google.javascript.rhino.Token.RC :
				return "rc";
			case com.google.javascript.rhino.Token.LP :
				return "lp";
			case com.google.javascript.rhino.Token.RP :
				return "rp";
			case com.google.javascript.rhino.Token.COMMA :
				return "comma";
			case com.google.javascript.rhino.Token.ASSIGN :
				return "assign";
			case com.google.javascript.rhino.Token.ASSIGN_BITOR :
				return "assign_bitor";
			case com.google.javascript.rhino.Token.ASSIGN_BITXOR :
				return "assign_bitxor";
			case com.google.javascript.rhino.Token.ASSIGN_BITAND :
				return "assign_bitand";
			case com.google.javascript.rhino.Token.ASSIGN_LSH :
				return "assign_lsh";
			case com.google.javascript.rhino.Token.ASSIGN_RSH :
				return "assign_rsh";
			case com.google.javascript.rhino.Token.ASSIGN_URSH :
				return "assign_ursh";
			case com.google.javascript.rhino.Token.ASSIGN_ADD :
				return "assign_add";
			case com.google.javascript.rhino.Token.ASSIGN_SUB :
				return "assign_sub";
			case com.google.javascript.rhino.Token.ASSIGN_MUL :
				return "assign_mul";
			case com.google.javascript.rhino.Token.ASSIGN_DIV :
				return "assign_div";
			case com.google.javascript.rhino.Token.ASSIGN_MOD :
				return "assign_mod";
			case com.google.javascript.rhino.Token.HOOK :
				return "hook";
			case com.google.javascript.rhino.Token.COLON :
				return "colon";
			case com.google.javascript.rhino.Token.OR :
				return "or";
			case com.google.javascript.rhino.Token.AND :
				return "and";
			case com.google.javascript.rhino.Token.INC :
				return "inc";
			case com.google.javascript.rhino.Token.DEC :
				return "dec";
			case com.google.javascript.rhino.Token.DOT :
				return "dot";
			case com.google.javascript.rhino.Token.FUNCTION :
				return "function";
			case com.google.javascript.rhino.Token.EXPORT :
				return "export";
			case com.google.javascript.rhino.Token.IMPORT :
				return "import";
			case com.google.javascript.rhino.Token.IF :
				return "if";
			case com.google.javascript.rhino.Token.ELSE :
				return "else";
			case com.google.javascript.rhino.Token.SWITCH :
				return "switch";
			case com.google.javascript.rhino.Token.CASE :
				return "case";
			case com.google.javascript.rhino.Token.DEFAULT :
				return "default";
			case com.google.javascript.rhino.Token.WHILE :
				return "while";
			case com.google.javascript.rhino.Token.DO :
				return "do";
			case com.google.javascript.rhino.Token.FOR :
				return "for";
			case com.google.javascript.rhino.Token.BREAK :
				return "break";
			case com.google.javascript.rhino.Token.CONTINUE :
				return "continue";
			case com.google.javascript.rhino.Token.VAR :
				return "var";
			case com.google.javascript.rhino.Token.WITH :
				return "with";
			case com.google.javascript.rhino.Token.CATCH :
				return "catch";
			case com.google.javascript.rhino.Token.FINALLY :
				return "finally";
			case com.google.javascript.rhino.Token.RESERVED :
				return "reserved";
			case com.google.javascript.rhino.Token.NOT :
				return "not";
			case com.google.javascript.rhino.Token.VOID :
				return "void";
			case com.google.javascript.rhino.Token.BLOCK :
				return "block";
			case com.google.javascript.rhino.Token.ARRAYLIT :
				return "arraylit";
			case com.google.javascript.rhino.Token.OBJECTLIT :
				return "objectlit";
			case com.google.javascript.rhino.Token.LABEL :
				return "label";
			case com.google.javascript.rhino.Token.TARGET :
				return "target";
			case com.google.javascript.rhino.Token.LOOP :
				return "loop";
			case com.google.javascript.rhino.Token.EXPR_VOID :
				return "expr_void";
			case com.google.javascript.rhino.Token.EXPR_RESULT :
				return "expr_result";
			case com.google.javascript.rhino.Token.JSR :
				return "jsr";
			case com.google.javascript.rhino.Token.SCRIPT :
				return "script";
			case com.google.javascript.rhino.Token.EMPTY :
				return "empty";
			case com.google.javascript.rhino.Token.GET_REF :
				return "get_ref";
			case com.google.javascript.rhino.Token.REF_SPECIAL :
				return "ref_special";
		}
		return ("<unknown=" + token) + ">";
	}

	public boolean isEquivalentTo(com.google.javascript.rhino.Node node) {
		return isEquivalentTo(node, false, true);
	}

	public boolean isEquivalentToTyped(com.google.javascript.rhino.Node node) {
		return isEquivalentTo(node, true, true);
	}

	boolean isEquivalentTo(com.google.javascript.rhino.Node node, boolean compareJsType, boolean recurse) {
		if ((((type) != (node.getType())) || ((getChildCount()) != (node.getChildCount()))) || ((com.google.javascript.rhino.Node.getNodeClass(com.google.javascript.rhino.Node.this)) != (com.google.javascript.rhino.Node.getNodeClass(node)))) {
			return false;
		}
		if (compareJsType && (!(com.google.javascript.rhino.jstype.JSType.isEquivalent(jsType, node.getJSType())))) {
			return false;
		}
		if ((type) == (com.google.javascript.rhino.Token.ARRAYLIT)) {
			try {
				int[] indices1 = ((int[]) (getProp(com.google.javascript.rhino.Node.SKIP_INDEXES_PROP)));
				int[] indices2 = ((int[]) (node.getProp(com.google.javascript.rhino.Node.SKIP_INDEXES_PROP)));
				if (indices1 == null) {
					if (indices2 != null) {
						return false;
					}
				}else
					if (indices2 == null) {
						return false;
					}else
						if ((indices1.length) != (indices2.length)) {
							return false;
						}else {
							for (int i = 0; i < (indices1.length); i++) {
								if ((indices1[i]) != (indices2[i])) {
									return false;
								}
							}
						}
					
				
			} catch (java.lang.Exception e) {
				return false;
			}
		}else
			if (((type) == (com.google.javascript.rhino.Token.INC)) || ((type) == (com.google.javascript.rhino.Token.DEC))) {
				int post1 = com.google.javascript.rhino.Node.this.getIntProp(com.google.javascript.rhino.Node.INCRDECR_PROP);
				int post2 = node.getIntProp(com.google.javascript.rhino.Node.INCRDECR_PROP);
				if (post1 != post2) {
					return false;
				}
			}else
				if ((type) == (com.google.javascript.rhino.Token.STRING)) {
					int quoted1 = com.google.javascript.rhino.Node.this.getIntProp(com.google.javascript.rhino.Node.QUOTED_PROP);
					int quoted2 = node.getIntProp(com.google.javascript.rhino.Node.QUOTED_PROP);
					if (quoted1 != quoted2) {
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

	public boolean hasSideEffects() {
		switch (type) {
			case com.google.javascript.rhino.Token.EXPR_VOID :
			case com.google.javascript.rhino.Token.COMMA :
				if ((last) != null)
					return last.hasSideEffects();
				else
					return true;
				
			case com.google.javascript.rhino.Token.HOOK :
				if ((((first) == null) || ((first.next) == null)) || ((first.next.next) == null)) {
					com.google.javascript.rhino.Kit.codeBug();
				}
				return (first.next.hasSideEffects()) && (first.next.next.hasSideEffects());
			case com.google.javascript.rhino.Token.ERROR :
			case com.google.javascript.rhino.Token.EXPR_RESULT :
			case com.google.javascript.rhino.Token.ASSIGN :
			case com.google.javascript.rhino.Token.ASSIGN_ADD :
			case com.google.javascript.rhino.Token.ASSIGN_SUB :
			case com.google.javascript.rhino.Token.ASSIGN_MUL :
			case com.google.javascript.rhino.Token.ASSIGN_DIV :
			case com.google.javascript.rhino.Token.ASSIGN_MOD :
			case com.google.javascript.rhino.Token.ASSIGN_BITOR :
			case com.google.javascript.rhino.Token.ASSIGN_BITXOR :
			case com.google.javascript.rhino.Token.ASSIGN_BITAND :
			case com.google.javascript.rhino.Token.ASSIGN_LSH :
			case com.google.javascript.rhino.Token.ASSIGN_RSH :
			case com.google.javascript.rhino.Token.ASSIGN_URSH :
			case com.google.javascript.rhino.Token.ENTERWITH :
			case com.google.javascript.rhino.Token.LEAVEWITH :
			case com.google.javascript.rhino.Token.RETURN :
			case com.google.javascript.rhino.Token.GOTO :
			case com.google.javascript.rhino.Token.IFEQ :
			case com.google.javascript.rhino.Token.IFNE :
			case com.google.javascript.rhino.Token.NEW :
			case com.google.javascript.rhino.Token.DELPROP :
			case com.google.javascript.rhino.Token.SETNAME :
			case com.google.javascript.rhino.Token.SETPROP :
			case com.google.javascript.rhino.Token.SETELEM :
			case com.google.javascript.rhino.Token.CALL :
			case com.google.javascript.rhino.Token.THROW :
			case com.google.javascript.rhino.Token.RETHROW :
			case com.google.javascript.rhino.Token.SETVAR :
			case com.google.javascript.rhino.Token.CATCH_SCOPE :
			case com.google.javascript.rhino.Token.RETURN_RESULT :
			case com.google.javascript.rhino.Token.SET_REF :
			case com.google.javascript.rhino.Token.DEL_REF :
			case com.google.javascript.rhino.Token.REF_CALL :
			case com.google.javascript.rhino.Token.TRY :
			case com.google.javascript.rhino.Token.SEMI :
			case com.google.javascript.rhino.Token.INC :
			case com.google.javascript.rhino.Token.DEC :
			case com.google.javascript.rhino.Token.EXPORT :
			case com.google.javascript.rhino.Token.IMPORT :
			case com.google.javascript.rhino.Token.IF :
			case com.google.javascript.rhino.Token.ELSE :
			case com.google.javascript.rhino.Token.SWITCH :
			case com.google.javascript.rhino.Token.WHILE :
			case com.google.javascript.rhino.Token.DO :
			case com.google.javascript.rhino.Token.FOR :
			case com.google.javascript.rhino.Token.BREAK :
			case com.google.javascript.rhino.Token.CONTINUE :
			case com.google.javascript.rhino.Token.VAR :
			case com.google.javascript.rhino.Token.CONST :
			case com.google.javascript.rhino.Token.WITH :
			case com.google.javascript.rhino.Token.CATCH :
			case com.google.javascript.rhino.Token.FINALLY :
			case com.google.javascript.rhino.Token.BLOCK :
			case com.google.javascript.rhino.Token.LABEL :
			case com.google.javascript.rhino.Token.TARGET :
			case com.google.javascript.rhino.Token.LOOP :
			case com.google.javascript.rhino.Token.JSR :
			case com.google.javascript.rhino.Token.SETPROP_OP :
			case com.google.javascript.rhino.Token.SETELEM_OP :
			case com.google.javascript.rhino.Token.LOCAL_BLOCK :
			case com.google.javascript.rhino.Token.SET_REF_OP :
				return true;
			default :
				return false;
		}
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
		if ((getProp(com.google.javascript.rhino.Node.SOURCENAME_PROP)) == null) {
			putProp(com.google.javascript.rhino.Node.SOURCENAME_PROP, other.getProp(com.google.javascript.rhino.Node.SOURCENAME_PROP));
			sourcePosition = other.sourcePosition;
		}
		if ((getProp(com.google.javascript.rhino.Node.STATIC_SOURCE_FILE)) == null) {
			putProp(com.google.javascript.rhino.Node.STATIC_SOURCE_FILE, other.getProp(com.google.javascript.rhino.Node.STATIC_SOURCE_FILE));
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
		com.google.javascript.rhino.Kit.codeBug();
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
}

