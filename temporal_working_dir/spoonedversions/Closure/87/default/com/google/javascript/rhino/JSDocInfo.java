

package com.google.javascript.rhino;


public class JSDocInfo implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	public enum Visibility {
PRIVATE, PROTECTED, PUBLIC, INHERITED;	}

	private static final class LazilyInitializedInfo implements java.io.Serializable {
		private static final long serialVersionUID = 1L;

		com.google.javascript.rhino.JSTypeExpression baseType = null;

		java.util.List<com.google.javascript.rhino.JSTypeExpression> implementedInterfaces = null;

		java.util.Map<java.lang.String, com.google.javascript.rhino.JSTypeExpression> parameters = null;

		java.util.List<com.google.javascript.rhino.JSTypeExpression> thrownTypes = null;

		java.lang.String templateTypeName = null;

		java.lang.String description = null;

		java.lang.String meaning = null;

		java.lang.String deprecated = null;

		java.lang.String license = null;

		java.util.Set<java.lang.String> suppressions = null;

		java.util.Set<java.lang.String> modifies = null;

		java.lang.String lendsName = null;
	}

	private static final class LazilyInitializedDocumentation {
		java.util.List<com.google.javascript.rhino.JSDocInfo.Marker> markers = null;

		java.util.Map<java.lang.String, java.lang.String> parameters = null;

		java.util.Map<com.google.javascript.rhino.JSTypeExpression, java.lang.String> throwsDescriptions = null;

		java.lang.String blockDescription = null;

		java.lang.String fileOverview = null;

		java.lang.String returnDescription = null;

		java.lang.String version = null;

		java.util.List<java.lang.String> authors = null;

		java.util.List<java.lang.String> sees = null;
	}

	public static class StringPosition extends com.google.javascript.rhino.SourcePosition<java.lang.String> {	}

	public static class TypePosition extends com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> {
		public boolean hasBrackets = false;
	}

	public static final class Marker {
		public com.google.javascript.rhino.JSDocInfo.StringPosition annotation = null;

		public com.google.javascript.rhino.JSDocInfo.StringPosition name = null;

		public com.google.javascript.rhino.JSDocInfo.StringPosition description = null;

		public com.google.javascript.rhino.JSDocInfo.TypePosition type = null;
	}

	private com.google.javascript.rhino.JSDocInfo.LazilyInitializedInfo info = null;

	private com.google.javascript.rhino.JSDocInfo.LazilyInitializedDocumentation documentation = null;

	private java.lang.String sourceName = null;

	private com.google.javascript.rhino.JSDocInfo.Visibility visibility = null;

	private int bitset = 0;

	private com.google.javascript.rhino.JSTypeExpression type = null;

	private com.google.javascript.rhino.JSTypeExpression thisType = null;

	private boolean includeDocumentation = false;

	private static final int MASK_FLAGS = 1073741823;

	private static final int MASK_CONSTANT = 1;

	private static final int MASK_CONSTRUCTOR = 2;

	private static final int MASK_DEFINE = 4;

	private static final int MASK_HIDDEN = 8;

	private static final int MASK_PRESERVETRY = 16;

	private static final int MASK_NOCHECK = 32;

	private static final int MASK_OVERRIDE = 64;

	private static final int MASK_NOALIAS = 128;

	private static final int MASK_DEPRECATED = 256;

	private static final int MASK_INTERFACE = 512;

	private static final int MASK_EXPORT = 1024;

	private static final int MASK_NOSHADOW = 2048;

	private static final int MASK_FILEOVERVIEW = 4096;

	private static final int MASK_IMPLICITCAST = 8192;

	private static final int MASK_NOSIDEEFFECTS = 16384;

	private static final int MASK_EXTERNS = 32768;

	private static final int MASK_JAVADISPATCH = 65536;

	private static final int MASK_NOCOMPILE = 131072;

	private static final int MASK_TYPEFIELD = -536870912;

	private static final int TYPEFIELD_TYPE = 536870912;

	private static final int TYPEFIELD_RETURN = 1073741824;

	private static final int TYPEFIELD_ENUM = 1610612736;

	private static final int TYPEFIELD_TYPEDEF = -2147483648;

	JSDocInfo(boolean includeDocumentation) {
		com.google.javascript.rhino.JSDocInfo.this.includeDocumentation = includeDocumentation;
	}

	public JSDocInfo() {
	}

	void setConstant(boolean value) {
		setFlag(value, com.google.javascript.rhino.JSDocInfo.MASK_CONSTANT);
	}

	void setConstructor(boolean value) {
		setFlag(value, com.google.javascript.rhino.JSDocInfo.MASK_CONSTRUCTOR);
	}

	void setDefine(boolean value) {
		setFlag(value, com.google.javascript.rhino.JSDocInfo.MASK_DEFINE);
	}

	void setHidden(boolean value) {
		setFlag(value, com.google.javascript.rhino.JSDocInfo.MASK_HIDDEN);
	}

	void setNoCheck(boolean value) {
		setFlag(value, com.google.javascript.rhino.JSDocInfo.MASK_NOCHECK);
	}

	void setShouldPreserveTry(boolean value) {
		setFlag(value, com.google.javascript.rhino.JSDocInfo.MASK_PRESERVETRY);
	}

	void setOverride(boolean value) {
		setFlag(value, com.google.javascript.rhino.JSDocInfo.MASK_OVERRIDE);
	}

	void setNoAlias(boolean value) {
		setFlag(value, com.google.javascript.rhino.JSDocInfo.MASK_NOALIAS);
	}

	public void setDeprecated(boolean value) {
		setFlag(value, com.google.javascript.rhino.JSDocInfo.MASK_DEPRECATED);
	}

	void setInterface(boolean value) {
		setFlag(value, com.google.javascript.rhino.JSDocInfo.MASK_INTERFACE);
	}

	void setExport(boolean value) {
		setFlag(value, com.google.javascript.rhino.JSDocInfo.MASK_EXPORT);
	}

	void setNoShadow(boolean value) {
		setFlag(value, com.google.javascript.rhino.JSDocInfo.MASK_NOSHADOW);
	}

	void setImplicitCast(boolean value) {
		setFlag(value, com.google.javascript.rhino.JSDocInfo.MASK_IMPLICITCAST);
	}

	void setNoSideEffects(boolean value) {
		setFlag(value, com.google.javascript.rhino.JSDocInfo.MASK_NOSIDEEFFECTS);
	}

	void setExterns(boolean value) {
		setFlag(value, com.google.javascript.rhino.JSDocInfo.MASK_EXTERNS);
	}

	void setJavaDispatch(boolean value) {
		setFlag(value, com.google.javascript.rhino.JSDocInfo.MASK_JAVADISPATCH);
	}

	void setNoCompile(boolean value) {
		setFlag(value, com.google.javascript.rhino.JSDocInfo.MASK_NOCOMPILE);
	}

	private void setFlag(boolean value, int mask) {
		if (value) {
			bitset |= mask;
		}else {
			bitset &= ~mask;
		}
	}

	public boolean isConstant() {
		return (getFlag(com.google.javascript.rhino.JSDocInfo.MASK_CONSTANT)) || (isDefine());
	}

	public boolean isConstructor() {
		return getFlag(com.google.javascript.rhino.JSDocInfo.MASK_CONSTRUCTOR);
	}

	public boolean isDefine() {
		return getFlag(com.google.javascript.rhino.JSDocInfo.MASK_DEFINE);
	}

	public boolean isHidden() {
		return getFlag(com.google.javascript.rhino.JSDocInfo.MASK_HIDDEN);
	}

	public boolean isNoTypeCheck() {
		return getFlag(com.google.javascript.rhino.JSDocInfo.MASK_NOCHECK);
	}

	public boolean shouldPreserveTry() {
		return getFlag(com.google.javascript.rhino.JSDocInfo.MASK_PRESERVETRY);
	}

	public boolean isOverride() {
		return getFlag(com.google.javascript.rhino.JSDocInfo.MASK_OVERRIDE);
	}

	public boolean isNoAlias() {
		return getFlag(com.google.javascript.rhino.JSDocInfo.MASK_NOALIAS);
	}

	public boolean isDeprecated() {
		return getFlag(com.google.javascript.rhino.JSDocInfo.MASK_DEPRECATED);
	}

	public boolean isInterface() {
		return getFlag(com.google.javascript.rhino.JSDocInfo.MASK_INTERFACE);
	}

	public boolean isExport() {
		return getFlag(com.google.javascript.rhino.JSDocInfo.MASK_EXPORT);
	}

	public boolean isNoShadow() {
		return getFlag(com.google.javascript.rhino.JSDocInfo.MASK_NOSHADOW);
	}

	public boolean isImplicitCast() {
		return getFlag(com.google.javascript.rhino.JSDocInfo.MASK_IMPLICITCAST);
	}

	public boolean isNoSideEffects() {
		return getFlag(com.google.javascript.rhino.JSDocInfo.MASK_NOSIDEEFFECTS);
	}

	public boolean isExterns() {
		return getFlag(com.google.javascript.rhino.JSDocInfo.MASK_EXTERNS);
	}

	public boolean isJavaDispatch() {
		return getFlag(com.google.javascript.rhino.JSDocInfo.MASK_JAVADISPATCH);
	}

	public boolean isNoCompile() {
		return getFlag(com.google.javascript.rhino.JSDocInfo.MASK_NOCOMPILE);
	}

	public boolean containsDeclaration() {
		return ((((((hasType()) || (hasReturnType())) || (hasEnumParameterType())) || (hasTypedefType())) || (hasThisType())) || ((getParameterCount()) > 0)) || (getFlag(((((((((((com.google.javascript.rhino.JSDocInfo.MASK_CONSTANT) | (com.google.javascript.rhino.JSDocInfo.MASK_CONSTRUCTOR)) | (com.google.javascript.rhino.JSDocInfo.MASK_DEFINE)) | (com.google.javascript.rhino.JSDocInfo.MASK_OVERRIDE)) | (com.google.javascript.rhino.JSDocInfo.MASK_NOALIAS)) | (com.google.javascript.rhino.JSDocInfo.MASK_DEPRECATED)) | (com.google.javascript.rhino.JSDocInfo.MASK_INTERFACE)) | (com.google.javascript.rhino.JSDocInfo.MASK_NOSHADOW)) | (com.google.javascript.rhino.JSDocInfo.MASK_IMPLICITCAST)) | (com.google.javascript.rhino.JSDocInfo.MASK_NOSIDEEFFECTS))));
	}

	private boolean getFlag(int mask) {
		return ((bitset) & mask) != 0;
	}

	public void setVisibility(com.google.javascript.rhino.JSDocInfo.Visibility visibility) {
		com.google.javascript.rhino.JSDocInfo.this.visibility = visibility;
	}

	private void lazyInitInfo() {
		if ((info) == null) {
			info = new com.google.javascript.rhino.JSDocInfo.LazilyInitializedInfo();
		}
	}

	private boolean lazyInitDocumentation() {
		if (!(includeDocumentation)) {
			return false;
		}
		if ((documentation) == null) {
			documentation = new com.google.javascript.rhino.JSDocInfo.LazilyInitializedDocumentation();
		}
		return true;
	}

	com.google.javascript.rhino.JSDocInfo.Marker addMarker() {
		if (!(lazyInitDocumentation())) {
			return null;
		}
		if ((documentation.markers) == null) {
			documentation.markers = com.google.common.collect.Lists.newArrayList();
		}
		com.google.javascript.rhino.JSDocInfo.Marker marker = new com.google.javascript.rhino.JSDocInfo.Marker();
		documentation.markers.add(marker);
		return marker;
	}

	boolean setDeprecationReason(java.lang.String reason) {
		lazyInitInfo();
		if ((info.deprecated) != null) {
			return false;
		}
		info.deprecated = reason;
		return true;
	}

	void addSuppression(java.lang.String suppression) {
		lazyInitInfo();
		if ((info.suppressions) == null) {
			info.suppressions = com.google.common.collect.Sets.newHashSet();
		}
		info.suppressions.add(suppression);
	}

	boolean setSuppressions(java.util.Set<java.lang.String> suppressions) {
		lazyInitInfo();
		if ((info.suppressions) != null) {
			return false;
		}
		info.suppressions = suppressions;
		return true;
	}

	void addModifies(java.lang.String modifies) {
		lazyInitInfo();
		if ((info.modifies) == null) {
			info.modifies = com.google.common.collect.Sets.newHashSet();
		}
		info.modifies.add(modifies);
	}

	boolean setModifies(java.util.Set<java.lang.String> modifies) {
		lazyInitInfo();
		if ((info.modifies) != null) {
			return false;
		}
		info.modifies = modifies;
		return true;
	}

	boolean documentVersion(java.lang.String version) {
		if (!(lazyInitDocumentation())) {
			return true;
		}
		if ((documentation.version) != null) {
			return false;
		}
		documentation.version = version;
		return true;
	}

	boolean documentReference(java.lang.String reference) {
		if (!(lazyInitDocumentation())) {
			return true;
		}
		if ((documentation.sees) == null) {
			documentation.sees = com.google.common.collect.Lists.newArrayList();
		}
		documentation.sees.add(reference);
		return true;
	}

	boolean documentAuthor(java.lang.String author) {
		if (!(lazyInitDocumentation())) {
			return true;
		}
		if ((documentation.authors) == null) {
			documentation.authors = com.google.common.collect.Lists.newArrayList();
		}
		documentation.authors.add(author);
		return true;
	}

	boolean documentThrows(com.google.javascript.rhino.JSTypeExpression type, java.lang.String throwsDescription) {
		if (!(lazyInitDocumentation())) {
			return true;
		}
		if ((documentation.throwsDescriptions) == null) {
			documentation.throwsDescriptions = new java.util.LinkedHashMap<com.google.javascript.rhino.JSTypeExpression, java.lang.String>();
		}
		if (!(documentation.throwsDescriptions.containsKey(type))) {
			documentation.throwsDescriptions.put(type, throwsDescription);
			return true;
		}
		return false;
	}

	boolean documentParam(java.lang.String parameter, java.lang.String description) {
		if (!(lazyInitDocumentation())) {
			return true;
		}
		if ((documentation.parameters) == null) {
			documentation.parameters = new java.util.LinkedHashMap<java.lang.String, java.lang.String>();
		}
		if (!(documentation.parameters.containsKey(parameter))) {
			documentation.parameters.put(parameter, description);
			return true;
		}else {
			return false;
		}
	}

	boolean documentBlock(java.lang.String description) {
		if (!(lazyInitDocumentation())) {
			return true;
		}
		if ((documentation.blockDescription) != null) {
			return false;
		}
		documentation.blockDescription = description;
		return true;
	}

	boolean documentFileOverview(java.lang.String description) {
		setFlag(true, com.google.javascript.rhino.JSDocInfo.MASK_FILEOVERVIEW);
		if (!(lazyInitDocumentation())) {
			return true;
		}
		if ((documentation.fileOverview) != null) {
			return false;
		}
		documentation.fileOverview = description;
		return true;
	}

	boolean documentReturn(java.lang.String description) {
		if (!(lazyInitDocumentation())) {
			return true;
		}
		if ((documentation.returnDescription) != null) {
			return false;
		}
		documentation.returnDescription = description;
		return true;
	}

	boolean declareParam(com.google.javascript.rhino.JSTypeExpression jsType, java.lang.String parameter) {
		lazyInitInfo();
		if ((info.parameters) == null) {
			info.parameters = new java.util.LinkedHashMap<java.lang.String, com.google.javascript.rhino.JSTypeExpression>();
		}
		if (!(info.parameters.containsKey(parameter))) {
			info.parameters.put(parameter, jsType);
			return true;
		}else {
			return false;
		}
	}

	boolean declareTemplateTypeName(java.lang.String templateTypeName) {
		lazyInitInfo();
		if ((info.templateTypeName) != null) {
			return false;
		}
		info.templateTypeName = templateTypeName;
		return true;
	}

	boolean declareThrows(com.google.javascript.rhino.JSTypeExpression jsType) {
		lazyInitInfo();
		if ((info.thrownTypes) == null) {
			info.thrownTypes = com.google.common.collect.Lists.newArrayList();
		}
		info.thrownTypes.add(jsType);
		return true;
	}

	public com.google.javascript.rhino.JSDocInfo.Visibility getVisibility() {
		return visibility;
	}

	public com.google.javascript.rhino.JSTypeExpression getParameterType(java.lang.String parameter) {
		if (((info) == null) || ((info.parameters) == null)) {
			return null;
		}
		return info.parameters.get(parameter);
	}

	public boolean hasParameter(java.lang.String parameter) {
		if (((info) == null) || ((info.parameters) == null)) {
			return false;
		}
		return info.parameters.containsKey(parameter);
	}

	public boolean hasParameterType(java.lang.String parameter) {
		return (getParameterType(parameter)) != null;
	}

	public java.util.Set<java.lang.String> getParameterNames() {
		if (((info) == null) || ((info.parameters) == null)) {
			return com.google.common.collect.ImmutableSet.of();
		}
		return com.google.common.collect.ImmutableSet.copyOf(info.parameters.keySet());
	}

	public int getParameterCount() {
		if (((info) == null) || ((info.parameters) == null)) {
			return 0;
		}
		return info.parameters.size();
	}

	void setType(com.google.javascript.rhino.JSTypeExpression type) {
		setType(type, com.google.javascript.rhino.JSDocInfo.TYPEFIELD_TYPE);
	}

	void setReturnType(com.google.javascript.rhino.JSTypeExpression type) {
		setType(type, com.google.javascript.rhino.JSDocInfo.TYPEFIELD_RETURN);
	}

	void setEnumParameterType(com.google.javascript.rhino.JSTypeExpression type) {
		setType(type, com.google.javascript.rhino.JSDocInfo.TYPEFIELD_ENUM);
	}

	void setTypedefType(com.google.javascript.rhino.JSTypeExpression type) {
		setType(type, com.google.javascript.rhino.JSDocInfo.TYPEFIELD_TYPEDEF);
	}

	private void setType(com.google.javascript.rhino.JSTypeExpression type, int mask) {
		if (((bitset) & (com.google.javascript.rhino.JSDocInfo.MASK_TYPEFIELD)) != 0) {
			throw new java.lang.IllegalStateException(("API tried to add two incompatible type tags. " + "This should have been blocked and emitted a warning."));
		}
		com.google.javascript.rhino.JSDocInfo.this.bitset = ((bitset) & (com.google.javascript.rhino.JSDocInfo.MASK_FLAGS)) | mask;
		com.google.javascript.rhino.JSDocInfo.this.type = type;
	}

	public java.util.List<com.google.javascript.rhino.JSTypeExpression> getThrownTypes() {
		if (((info) == null) || ((info.thrownTypes) == null)) {
			return com.google.common.collect.ImmutableList.of();
		}
		return java.util.Collections.unmodifiableList(info.thrownTypes);
	}

	public boolean hasType() {
		return hasType(com.google.javascript.rhino.JSDocInfo.TYPEFIELD_TYPE);
	}

	public boolean hasEnumParameterType() {
		return hasType(com.google.javascript.rhino.JSDocInfo.TYPEFIELD_ENUM);
	}

	public boolean hasTypedefType() {
		return hasType(com.google.javascript.rhino.JSDocInfo.TYPEFIELD_TYPEDEF);
	}

	public boolean hasReturnType() {
		return hasType(com.google.javascript.rhino.JSDocInfo.TYPEFIELD_RETURN);
	}

	private boolean hasType(int mask) {
		return ((bitset) & (com.google.javascript.rhino.JSDocInfo.MASK_TYPEFIELD)) == mask;
	}

	public com.google.javascript.rhino.JSTypeExpression getType() {
		return getType(com.google.javascript.rhino.JSDocInfo.TYPEFIELD_TYPE);
	}

	public com.google.javascript.rhino.JSTypeExpression getReturnType() {
		return getType(com.google.javascript.rhino.JSDocInfo.TYPEFIELD_RETURN);
	}

	public com.google.javascript.rhino.JSTypeExpression getEnumParameterType() {
		return getType(com.google.javascript.rhino.JSDocInfo.TYPEFIELD_ENUM);
	}

	public com.google.javascript.rhino.JSTypeExpression getTypedefType() {
		return getType(com.google.javascript.rhino.JSDocInfo.TYPEFIELD_TYPEDEF);
	}

	private com.google.javascript.rhino.JSTypeExpression getType(int typefield) {
		if (((com.google.javascript.rhino.JSDocInfo.MASK_TYPEFIELD) & (bitset)) == typefield) {
			return type;
		}else {
			return null;
		}
	}

	public com.google.javascript.rhino.JSTypeExpression getThisType() {
		return thisType;
	}

	void setThisType(com.google.javascript.rhino.JSTypeExpression type) {
		com.google.javascript.rhino.JSDocInfo.this.thisType = type;
	}

	public boolean hasThisType() {
		return (thisType) != null;
	}

	void setBaseType(com.google.javascript.rhino.JSTypeExpression type) {
		lazyInitInfo();
		info.baseType = type;
	}

	public com.google.javascript.rhino.JSTypeExpression getBaseType() {
		return (info) == null ? null : info.baseType;
	}

	public java.lang.String getDescription() {
		return (info) == null ? null : info.description;
	}

	void setDescription(java.lang.String desc) {
		lazyInitInfo();
		info.description = desc;
	}

	public java.lang.String getMeaning() {
		return (info) == null ? null : info.meaning;
	}

	void setMeaning(java.lang.String meaning) {
		lazyInitInfo();
		info.meaning = meaning;
	}

	public java.lang.String getLendsName() {
		return (info) == null ? null : info.lendsName;
	}

	void setLendsName(java.lang.String name) {
		lazyInitInfo();
		info.lendsName = name;
	}

	public java.lang.String getLicense() {
		return (info) == null ? null : info.license;
	}

	public void setLicense(java.lang.String license) {
		lazyInitInfo();
		info.license = license;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return "JSDocInfo";
	}

	public boolean hasBaseType() {
		return (getBaseType()) != null;
	}

	boolean addImplementedInterface(com.google.javascript.rhino.JSTypeExpression interfaceName) {
		lazyInitInfo();
		if ((info.implementedInterfaces) == null) {
			info.implementedInterfaces = com.google.common.collect.Lists.newArrayListWithCapacity(2);
		}
		if (info.implementedInterfaces.contains(interfaceName)) {
			return false;
		}
		info.implementedInterfaces.add(interfaceName);
		return true;
	}

	public java.util.List<com.google.javascript.rhino.JSTypeExpression> getImplementedInterfaces() {
		if (((info) == null) || ((info.implementedInterfaces) == null)) {
			return com.google.common.collect.ImmutableList.of();
		}
		return java.util.Collections.unmodifiableList(info.implementedInterfaces);
	}

	public int getImplementedInterfaceCount() {
		if (((info) == null) || ((info.implementedInterfaces) == null)) {
			return 0;
		}
		return info.implementedInterfaces.size();
	}

	public java.lang.String getDeprecationReason() {
		return (info) == null ? null : info.deprecated;
	}

	public java.util.Set<java.lang.String> getSuppressions() {
		java.util.Set<java.lang.String> suppressions = (info) == null ? null : info.suppressions;
		return suppressions == null ? java.util.Collections.<java.lang.String>emptySet() : suppressions;
	}

	public java.util.Set<java.lang.String> getModifies() {
		java.util.Set<java.lang.String> modifies = (info) == null ? null : info.modifies;
		return modifies == null ? java.util.Collections.<java.lang.String>emptySet() : modifies;
	}

	public boolean hasDescriptionForParameter(java.lang.String name) {
		if (((documentation) == null) || ((documentation.parameters) == null)) {
			return false;
		}
		return documentation.parameters.containsKey(name);
	}

	public java.lang.String getDescriptionForParameter(java.lang.String name) {
		if (((documentation) == null) || ((documentation.parameters) == null)) {
			return null;
		}
		return documentation.parameters.get(name);
	}

	public java.util.Collection<java.lang.String> getAuthors() {
		return (documentation) == null ? null : documentation.authors;
	}

	public java.util.Collection<java.lang.String> getReferences() {
		return (documentation) == null ? null : documentation.sees;
	}

	public java.lang.String getVersion() {
		return (documentation) == null ? null : documentation.version;
	}

	public java.lang.String getReturnDescription() {
		return (documentation) == null ? null : documentation.returnDescription;
	}

	public java.lang.String getBlockDescription() {
		return (documentation) == null ? null : documentation.blockDescription;
	}

	public boolean hasFileOverview() {
		return getFlag(com.google.javascript.rhino.JSDocInfo.MASK_FILEOVERVIEW);
	}

	public java.lang.String getFileOverview() {
		return (documentation) == null ? null : documentation.fileOverview;
	}

	public java.lang.String getSourceName() {
		return sourceName;
	}

	public java.util.Collection<com.google.javascript.rhino.JSDocInfo.Marker> getMarkers() {
		return (documentation) == null ? null : documentation.markers;
	}

	void setSourceName(java.lang.String sourceName) {
		com.google.javascript.rhino.JSDocInfo.this.sourceName = sourceName;
	}

	public java.lang.String getTemplateTypeName() {
		if ((info) == null) {
			return null;
		}
		return info.templateTypeName;
	}

	public java.util.Collection<com.google.javascript.rhino.Node> getTypeNodes() {
		java.util.List<com.google.javascript.rhino.Node> nodes = com.google.common.collect.Lists.newArrayList();
		if ((type) != null) {
			nodes.add(type.getRoot());
		}
		if ((thisType) != null) {
			nodes.add(thisType.getRoot());
		}
		if ((info) != null) {
			if ((info.baseType) != null) {
				nodes.add(info.baseType.getRoot());
			}
			if ((info.implementedInterfaces) != null) {
				for (com.google.javascript.rhino.JSTypeExpression interfaceType : info.implementedInterfaces) {
					nodes.add(interfaceType.getRoot());
				}
			}
			if ((info.parameters) != null) {
				for (com.google.javascript.rhino.JSTypeExpression parameterType : info.parameters.values()) {
					if (parameterType != null) {
						nodes.add(parameterType.getRoot());
					}
				}
			}
			if ((info.thrownTypes) != null) {
				for (com.google.javascript.rhino.JSTypeExpression thrownType : info.thrownTypes) {
					if (thrownType != null) {
						nodes.add(thrownType.getRoot());
					}
				}
			}
		}
		return nodes;
	}

	public boolean hasModifies() {
		return ((info) != null) && ((info.modifies) != null);
	}
}

