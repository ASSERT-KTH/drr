

package com.google.javascript.rhino;


public final class JSDocInfoBuilder {
	private com.google.javascript.rhino.JSDocInfo currentInfo;

	private boolean populated = false;

	private boolean parseDocumentation = false;

	private com.google.javascript.rhino.JSDocInfo.Marker currentMarker = null;

	public JSDocInfoBuilder(boolean parseDocumentation) {
		com.google.javascript.rhino.JSDocInfoBuilder.this.currentInfo = new com.google.javascript.rhino.JSDocInfo(parseDocumentation);
		com.google.javascript.rhino.JSDocInfoBuilder.this.parseDocumentation = parseDocumentation;
	}

	public void recordOriginalCommentString(java.lang.String sourceComment) {
		if (parseDocumentation) {
			currentInfo.setOriginalCommentString(sourceComment);
		}
	}

	public boolean shouldParseDocumentation() {
		return parseDocumentation;
	}

	public boolean isPopulated() {
		return populated;
	}

	public boolean isPopulatedWithFileOverview() {
		return (isPopulated()) && (((currentInfo.hasFileOverview()) || (currentInfo.isExterns())) || (currentInfo.isNoCompile()));
	}

	public boolean isDescriptionRecorded() {
		return (currentInfo.getDescription()) != null;
	}

	public com.google.javascript.rhino.JSDocInfo build(com.google.javascript.rhino.Node associatedNode) {
		if (populated) {
			com.google.javascript.rhino.JSDocInfo built = currentInfo;
			built.setAssociatedNode(associatedNode);
			com.google.javascript.rhino.JSDocInfoBuilder.populateDefaults(built);
			populated = false;
			currentInfo = new com.google.javascript.rhino.JSDocInfo(com.google.javascript.rhino.JSDocInfoBuilder.this.parseDocumentation);
			return built;
		}else {
			return null;
		}
	}

	private static void populateDefaults(com.google.javascript.rhino.JSDocInfo info) {
		if ((info.getVisibility()) == null) {
			info.setVisibility(com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED);
		}
	}

	public void markAnnotation(java.lang.String annotation, int lineno, int charno) {
		com.google.javascript.rhino.JSDocInfo.Marker marker = currentInfo.addMarker();
		if (marker != null) {
			com.google.javascript.rhino.JSDocInfo.TrimmedStringPosition position = new com.google.javascript.rhino.JSDocInfo.TrimmedStringPosition();
			position.setItem(annotation);
			position.setPositionInformation(lineno, charno, lineno, (charno + (annotation.length())));
			marker.setAnnotation(position);
			populated = true;
		}
		currentMarker = marker;
	}

	public void markText(java.lang.String text, int startLineno, int startCharno, int endLineno, int endCharno) {
		if ((currentMarker) != null) {
			com.google.javascript.rhino.JSDocInfo.StringPosition position = new com.google.javascript.rhino.JSDocInfo.StringPosition();
			position.setItem(text);
			position.setPositionInformation(startLineno, startCharno, endLineno, endCharno);
			currentMarker.setDescription(position);
		}
	}

	public void markTypeNode(com.google.javascript.rhino.Node typeNode, int lineno, int startCharno, int endLineno, int endCharno, boolean hasLC) {
		if ((currentMarker) != null) {
			com.google.javascript.rhino.JSDocInfo.TypePosition position = new com.google.javascript.rhino.JSDocInfo.TypePosition();
			position.setItem(typeNode);
			position.setHasBrackets(hasLC);
			position.setPositionInformation(lineno, startCharno, endLineno, endCharno);
			currentMarker.setType(position);
		}
	}

	@java.lang.Deprecated
	public void markName(java.lang.String name, int lineno, int charno) {
		markName(name, null, lineno, charno);
	}

	public void markName(java.lang.String name, com.google.javascript.rhino.jstype.StaticSourceFile file, int lineno, int charno) {
		if ((currentMarker) != null) {
			com.google.javascript.rhino.JSDocInfo.TrimmedStringPosition position = new com.google.javascript.rhino.JSDocInfo.TrimmedStringPosition();
			position.setItem(name);
			position.setPositionInformation(lineno, charno, lineno, (charno + (name.length())));
			currentMarker.setName(position);
			com.google.javascript.rhino.SourcePosition<com.google.javascript.rhino.Node> nodePos = new com.google.javascript.rhino.JSDocInfo.NamePosition();
			com.google.javascript.rhino.Node node = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, name, lineno, charno);
			node.setLength(name.length());
			node.setStaticSourceFile(file);
			nodePos.setItem(node);
			nodePos.setPositionInformation(lineno, charno, lineno, (charno + (name.length())));
			currentMarker.setNameNode(nodePos);
		}
	}

	public boolean recordBlockDescription(java.lang.String description) {
		populated = true;
		return currentInfo.documentBlock(description);
	}

	public boolean recordVisibility(com.google.javascript.rhino.JSDocInfo.Visibility visibility) {
		if ((currentInfo.getVisibility()) == null) {
			populated = true;
			currentInfo.setVisibility(visibility);
			return true;
		}else {
			return false;
		}
	}

	public boolean recordParameter(java.lang.String parameterName, com.google.javascript.rhino.JSTypeExpression type) {
		if ((!(hasAnySingletonTypeTags())) && (currentInfo.declareParam(type, parameterName))) {
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordParameterDescription(java.lang.String parameterName, java.lang.String description) {
		if (currentInfo.documentParam(parameterName, description)) {
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordTemplateTypeNames(java.util.List<java.lang.String> names) {
		if (currentInfo.declareTemplateTypeNames(names)) {
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordClassTemplateTypeNames(java.util.List<java.lang.String> names) {
		if (currentInfo.declareClassTemplateTypeNames(names)) {
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordThrowType(com.google.javascript.rhino.JSTypeExpression type) {
		if (!(hasAnySingletonTypeTags())) {
			currentInfo.declareThrows(type);
			populated = true;
			return true;
		}
		return false;
	}

	public boolean recordThrowDescription(com.google.javascript.rhino.JSTypeExpression type, java.lang.String description) {
		if (currentInfo.documentThrows(type, description)) {
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean addAuthor(java.lang.String author) {
		if (currentInfo.documentAuthor(author)) {
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean addReference(java.lang.String reference) {
		if (currentInfo.documentReference(reference)) {
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordConsistentIdGenerator() {
		if (!(currentInfo.isConsistentIdGenerator())) {
			currentInfo.setConsistentIdGenerator(true);
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordStableIdGenerator() {
		if (!(currentInfo.isStableIdGenerator())) {
			currentInfo.setStableIdGenerator(true);
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordVersion(java.lang.String version) {
		if (currentInfo.documentVersion(version)) {
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordDeprecationReason(java.lang.String reason) {
		if (currentInfo.setDeprecationReason(reason)) {
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordSuppressions(java.util.Set<java.lang.String> suppressions) {
		if (currentInfo.setSuppressions(suppressions)) {
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordModifies(java.util.Set<java.lang.String> modifies) {
		if ((!(hasAnySingletonSideEffectTags())) && (currentInfo.setModifies(modifies))) {
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordType(com.google.javascript.rhino.JSTypeExpression type) {
		if ((type != null) && (!(hasAnyTypeRelatedTags()))) {
			currentInfo.setType(type);
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordTypedef(com.google.javascript.rhino.JSTypeExpression type) {
		if ((type != null) && (!(hasAnyTypeRelatedTags()))) {
			currentInfo.setTypedefType(type);
			populated = true;
			return true;
		}
		return false;
	}

	public boolean recordIdGenerator() {
		if (!(currentInfo.isIdGenerator())) {
			currentInfo.setIdGenerator(true);
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordReturnType(com.google.javascript.rhino.JSTypeExpression jsType) {
		if (((jsType != null) && ((currentInfo.getReturnType()) == null)) && (!(hasAnySingletonTypeTags()))) {
			currentInfo.setReturnType(jsType);
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordReturnDescription(java.lang.String description) {
		if (currentInfo.documentReturn(description)) {
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordDefineType(com.google.javascript.rhino.JSTypeExpression type) {
		if ((((type != null) && (!(currentInfo.isConstant()))) && (!(currentInfo.isDefine()))) && (recordType(type))) {
			currentInfo.setDefine(true);
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordEnumParameterType(com.google.javascript.rhino.JSTypeExpression type) {
		if ((type != null) && (!(hasAnyTypeRelatedTags()))) {
			currentInfo.setEnumParameterType(type);
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordThisType(com.google.javascript.rhino.JSTypeExpression type) {
		if (((type != null) && (!(hasAnySingletonTypeTags()))) && (!(currentInfo.hasThisType()))) {
			currentInfo.setThisType(type);
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordBaseType(com.google.javascript.rhino.JSTypeExpression jsType) {
		if (((jsType != null) && (!(hasAnySingletonTypeTags()))) && (!(currentInfo.hasBaseType()))) {
			currentInfo.setBaseType(jsType);
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordConstancy() {
		if (!(currentInfo.isConstant())) {
			currentInfo.setConstant(true);
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordDescription(java.lang.String description) {
		if ((description != null) && ((currentInfo.getDescription()) == null)) {
			currentInfo.setDescription(description);
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordMeaning(java.lang.String meaning) {
		if ((meaning != null) && ((currentInfo.getMeaning()) == null)) {
			currentInfo.setMeaning(meaning);
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordFileOverview(java.lang.String description) {
		if (currentInfo.documentFileOverview(description)) {
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordHiddenness() {
		if (!(currentInfo.isHidden())) {
			currentInfo.setHidden(true);
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordNoCompile() {
		if (!(currentInfo.isNoCompile())) {
			currentInfo.setNoCompile(true);
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordNoTypeCheck() {
		if (!(currentInfo.isNoTypeCheck())) {
			currentInfo.setNoCheck(true);
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordConstructor() {
		if (((!(hasAnySingletonTypeTags())) && (!(currentInfo.isConstructor()))) && (!(currentInfo.isInterface()))) {
			currentInfo.setConstructor(true);
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean isConstructorRecorded() {
		return currentInfo.isConstructor();
	}

	public boolean recordStruct() {
		if ((((hasAnySingletonTypeTags()) || (currentInfo.isInterface())) || (currentInfo.makesDicts())) || (currentInfo.makesStructs())) {
			return false;
		}
		currentInfo.setStruct();
		populated = true;
		return true;
	}

	public boolean recordDict() {
		if ((((hasAnySingletonTypeTags()) || (currentInfo.isInterface())) || (currentInfo.makesDicts())) || (currentInfo.makesStructs())) {
			return false;
		}
		currentInfo.setDict();
		populated = true;
		return true;
	}

	public boolean recordJavaDispatch() {
		if (!(currentInfo.isJavaDispatch())) {
			currentInfo.setJavaDispatch(true);
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean isJavaDispatch() {
		return currentInfo.isJavaDispatch();
	}

	public boolean recordPreserveTry() {
		if (!(currentInfo.shouldPreserveTry())) {
			currentInfo.setShouldPreserveTry(true);
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordOverride() {
		if (!(currentInfo.isOverride())) {
			currentInfo.setOverride(true);
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordNoAlias() {
		if (!(currentInfo.isNoAlias())) {
			currentInfo.setNoAlias(true);
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordDeprecated() {
		if (!(currentInfo.isDeprecated())) {
			currentInfo.setDeprecated(true);
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordInterface() {
		if (((((hasAnySingletonTypeTags()) || (currentInfo.makesStructs())) || (currentInfo.makesDicts())) || (currentInfo.isConstructor())) || (currentInfo.isInterface())) {
			return false;
		}
		currentInfo.setInterface(true);
		populated = true;
		return true;
	}

	public boolean recordExport() {
		if (!(currentInfo.isExport())) {
			currentInfo.setExport(true);
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordExpose() {
		if (!(currentInfo.isExpose())) {
			currentInfo.setExpose(true);
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordNoShadow() {
		if (!(currentInfo.isNoShadow())) {
			currentInfo.setNoShadow(true);
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordImplicitCast() {
		if (!(currentInfo.isImplicitCast())) {
			currentInfo.setImplicitCast(true);
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordNoSideEffects() {
		if ((!(hasAnySingletonSideEffectTags())) && (!(currentInfo.isNoSideEffects()))) {
			currentInfo.setNoSideEffects(true);
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordExterns() {
		if (!(currentInfo.isExterns())) {
			currentInfo.setExterns(true);
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean isInterfaceRecorded() {
		return currentInfo.isInterface();
	}

	public boolean hasParameter(java.lang.String name) {
		return currentInfo.hasParameter(name);
	}

	public boolean recordImplementedInterface(com.google.javascript.rhino.JSTypeExpression interfaceName) {
		if (currentInfo.addImplementedInterface(interfaceName)) {
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordExtendedInterface(com.google.javascript.rhino.JSTypeExpression interfaceType) {
		if (currentInfo.addExtendedInterface(interfaceType)) {
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean recordLends(java.lang.String name) {
		if (!(hasAnyTypeRelatedTags())) {
			currentInfo.setLendsName(name);
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	public boolean isNgInjectRecorded() {
		return currentInfo.isNgInject();
	}

	public boolean recordNgInject(boolean ngInject) {
		if (!(isNgInjectRecorded())) {
			currentInfo.setNgInject(ngInject);
			populated = true;
			return true;
		}else {
			return false;
		}
	}

	private boolean hasAnyTypeRelatedTags() {
		return ((((((((currentInfo.isConstructor()) || (currentInfo.isInterface())) || ((currentInfo.getParameterCount()) > 0)) || (currentInfo.hasReturnType())) || (currentInfo.hasBaseType())) || ((currentInfo.getExtendedInterfacesCount()) > 0)) || ((currentInfo.getLendsName()) != null)) || (currentInfo.hasThisType())) || (hasAnySingletonTypeTags());
	}

	private boolean hasAnySingletonTypeTags() {
		return ((currentInfo.hasType()) || (currentInfo.hasTypedefType())) || (currentInfo.hasEnumParameterType());
	}

	private boolean hasAnySingletonSideEffectTags() {
		return (currentInfo.isNoSideEffects()) || (currentInfo.hasModifies());
	}
}

