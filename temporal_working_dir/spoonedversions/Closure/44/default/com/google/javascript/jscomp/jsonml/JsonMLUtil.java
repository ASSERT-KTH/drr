

package com.google.javascript.jscomp.jsonml;


public class JsonMLUtil {
	public static boolean isExpression(com.google.javascript.jscomp.jsonml.JsonML element) {
		switch (element.getType()) {
			case ArrayExpr :
			case AssignExpr :
			case BinaryExpr :
			case CallExpr :
			case ConditionalExpr :
			case CountExpr :
			case DeleteExpr :
			case EvalExpr :
			case FunctionExpr :
			case IdExpr :
			case InvokeExpr :
			case LiteralExpr :
			case LogicalAndExpr :
			case LogicalOrExpr :
			case MemberExpr :
			case NewExpr :
			case ObjectExpr :
			case RegExpExpr :
			case ThisExpr :
			case TypeofExpr :
			case UnaryExpr :
				return true;
			default :
				return false;
		}
	}

	public static com.google.javascript.jscomp.jsonml.JsonML parseString(java.lang.String jsonml) throws java.lang.Exception {
		return com.google.javascript.jscomp.jsonml.JsonMLUtil.parseElement(new org.json.JSONArray(jsonml));
	}

	private static com.google.javascript.jscomp.jsonml.JsonML parseElement(org.json.JSONArray element) throws java.lang.Exception {
		com.google.javascript.jscomp.jsonml.JsonML jsonMLElement = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.valueOf(element.getString(0)));
		org.json.JSONObject attrs = element.getJSONObject(1);
		java.util.Iterator<?> it = attrs.keys();
		while (it.hasNext()) {
			java.lang.String key = ((java.lang.String) (it.next()));
			java.lang.Object value = attrs.get(key);
			com.google.javascript.jscomp.jsonml.TagAttr tag = com.google.javascript.jscomp.jsonml.TagAttr.get(key);
			if (tag == null) {
				continue;
			}
			if (value instanceof java.lang.Number) {
				value = ((java.lang.Number) (value)).doubleValue();
			}
			switch (tag) {
				case NAME :
				case BODY :
				case FLAGS :
				case OP :
				case TYPE :
				case IS_PREFIX :
				case LABEL :
					jsonMLElement.setAttribute(tag, value);
					break;
				case VALUE :
					if ((value != null) && (value.equals(null))) {
						value = null;
					}
					if (value instanceof java.lang.Number) {
						jsonMLElement.setAttribute(tag, ((java.lang.Number) (value)).doubleValue());
					}else {
						jsonMLElement.setAttribute(tag, value);
					}
					break;
				default :
			}
		} 
		for (int i = 2; i < (element.length()); ++i) {
			jsonMLElement.appendChild(com.google.javascript.jscomp.jsonml.JsonMLUtil.parseElement(element.getJSONArray(i)));
		}
		return jsonMLElement;
	}

	public static java.lang.String compare(com.google.javascript.jscomp.jsonml.JsonML tree1, com.google.javascript.jscomp.jsonml.JsonML tree2) {
		return new com.google.javascript.jscomp.jsonml.JsonMLUtil.JsonMLComparator(tree1, tree2).compare();
	}

	static boolean compareSilent(com.google.javascript.jscomp.jsonml.JsonML tree1, com.google.javascript.jscomp.jsonml.JsonML tree2) {
		return new com.google.javascript.jscomp.jsonml.JsonMLUtil.JsonMLComparator(tree1, tree2).compareSilent();
	}

	private static class JsonMLComparator {
		private static final com.google.javascript.jscomp.jsonml.TagAttr[] ATTRS_TO_COMPARE = new com.google.javascript.jscomp.jsonml.TagAttr[]{ com.google.javascript.jscomp.jsonml.TagAttr.BODY , com.google.javascript.jscomp.jsonml.TagAttr.FLAGS , com.google.javascript.jscomp.jsonml.TagAttr.IS_PREFIX , com.google.javascript.jscomp.jsonml.TagAttr.LABEL , com.google.javascript.jscomp.jsonml.TagAttr.NAME , com.google.javascript.jscomp.jsonml.TagAttr.OP , com.google.javascript.jscomp.jsonml.TagAttr.TYPE , com.google.javascript.jscomp.jsonml.TagAttr.VALUE };

		private com.google.javascript.jscomp.jsonml.JsonML treeA;

		private com.google.javascript.jscomp.jsonml.JsonML treeB;

		private com.google.javascript.jscomp.jsonml.JsonML mismatchA;

		private com.google.javascript.jscomp.jsonml.JsonML mismatchB;

		JsonMLComparator(com.google.javascript.jscomp.jsonml.JsonML treeA, com.google.javascript.jscomp.jsonml.JsonML treeB) {
			com.google.javascript.jscomp.jsonml.JsonMLUtil.JsonMLComparator.this.treeA = treeA;
			com.google.javascript.jscomp.jsonml.JsonMLUtil.JsonMLComparator.this.treeB = treeB;
			if (compareElements(treeA, treeB)) {
				mismatchA = null;
				mismatchB = null;
			}
		}

		private boolean setMismatch(com.google.javascript.jscomp.jsonml.JsonML a, com.google.javascript.jscomp.jsonml.JsonML b) {
			mismatchA = a;
			mismatchB = b;
			return false;
		}

		private boolean compareElements(com.google.javascript.jscomp.jsonml.JsonML a, com.google.javascript.jscomp.jsonml.JsonML b) {
			if ((a == null) || (b == null)) {
				if ((a == null) && (b == null)) {
					return true;
				}else {
					return setMismatch(a, b);
				}
			}
			if (!(areEquivalent(a, b))) {
				return setMismatch(a, b);
			}
			if ((a.childrenSize()) != (b.childrenSize())) {
				return setMismatch(a, b);
			}
			java.util.Iterator<com.google.javascript.jscomp.jsonml.JsonML> itA = a.getChildren().listIterator();
			java.util.Iterator<com.google.javascript.jscomp.jsonml.JsonML> itB = b.getChildren().listIterator();
			while (itA.hasNext()) {
				if (!(compareElements(itA.next(), itB.next()))) {
					return false;
				}
			} 
			return true;
		}

		private boolean areEquivalent(com.google.javascript.jscomp.jsonml.JsonML a, com.google.javascript.jscomp.jsonml.JsonML b) {
			if ((a.getType()) != (b.getType())) {
				return false;
			}
			for (com.google.javascript.jscomp.jsonml.TagAttr attr : com.google.javascript.jscomp.jsonml.JsonMLUtil.JsonMLComparator.ATTRS_TO_COMPARE) {
				if (!(compareAttribute(attr, a, b))) {
					return false;
				}
			}
			return true;
		}

		private boolean compareAttribute(com.google.javascript.jscomp.jsonml.TagAttr attr, com.google.javascript.jscomp.jsonml.JsonML a, com.google.javascript.jscomp.jsonml.JsonML b) {
			java.lang.Object valueA = a.getAttributes().get(attr);
			java.lang.Object valueB = b.getAttributes().get(attr);
			if ((valueA == null) && (valueB == null)) {
				return true;
			}
			if ((valueA == null) || (valueB == null)) {
				return false;
			}
			if (!(valueA.equals(valueB))) {
				java.lang.Double doubleA = null;
				java.lang.Double doubleB = null;
				if (valueA instanceof java.lang.Number) {
					doubleA = ((java.lang.Number) (valueA)).doubleValue();
				}else
					if (valueA instanceof java.lang.String) {
						doubleA = java.lang.Double.valueOf(((java.lang.String) (valueA)));
					}else {
						return false;
					}
				
				if (valueB instanceof java.lang.Number) {
					doubleB = ((java.lang.Number) (valueB)).doubleValue();
				}else
					if (valueB instanceof java.lang.String) {
						doubleB = java.lang.Double.valueOf(((java.lang.String) (valueB)));
					}else {
						return false;
					}
				
				if (!(doubleA.equals(doubleB))) {
					return false;
				}
			}
			return true;
		}

		private boolean compareSilent() {
			return ((mismatchA) == null) && ((mismatchB) == null);
		}

		private java.lang.String compare() {
			if (compareSilent()) {
				return null;
			}
			return ((((((("The trees are not equal: " + "\n\nTree1:\n ") + (treeA.toStringTree())) + "\n\nTree2:\n ") + (treeB.toStringTree())) + "\n\nSubtree1:\n ") + (mismatchA.toStringTree())) + "\n\nSubtree2:\n ") + (mismatchB.toStringTree());
		}
	}
}

