

package com.google.javascript.jscomp.deps;


public final class PathUtil {
	private static final com.google.common.base.CharMatcher SLASH_MATCHER = com.google.common.base.CharMatcher.is('/');

	private static final com.google.common.base.CharMatcher NON_SLASH_MATCHER = com.google.common.base.CharMatcher.isNot('/');

	private PathUtil() {
	}

	public static java.lang.String collapseDots(java.lang.String path) {
		path = com.google.javascript.jscomp.deps.PathUtil.removeExtraneousSlashes(path);
		if (!(path.contains("."))) {
			return path;
		}
		java.lang.String[] srcFragments = path.split("/");
		java.util.List<java.lang.String> dstFragments = com.google.common.collect.Lists.newArrayList();
		for (java.lang.String fragment : srcFragments) {
			if (fragment.equals("..")) {
				if (!(dstFragments.isEmpty())) {
					dstFragments.remove(((dstFragments.size()) - 1));
				}
			}else
				if (!(fragment.equals("."))) {
					dstFragments.add(fragment);
				}
			
		}
		if (((dstFragments.size()) == 1) && (dstFragments.get(0).isEmpty())) {
			return "/";
		}
		return com.google.common.base.Joiner.on("/").join(dstFragments);
	}

	static boolean isAbsolute(java.lang.String path) {
		return path.startsWith("/");
	}

	static java.lang.String removeExtraneousSlashes(java.lang.String s) {
		int lastNonSlash = com.google.javascript.jscomp.deps.PathUtil.NON_SLASH_MATCHER.lastIndexIn(s);
		if (lastNonSlash != (-1)) {
			s = s.substring(0, (lastNonSlash + 1));
		}
		return com.google.javascript.jscomp.deps.PathUtil.SLASH_MATCHER.collapseFrom(s, '/');
	}

	public static java.lang.String makeAbsolute(java.lang.String path) {
		return com.google.javascript.jscomp.deps.PathUtil.makeAbsolute(path, java.lang.System.getProperty("user.dir"));
	}

	public static java.lang.String makeAbsolute(java.lang.String path, java.lang.String rootPath) {
		if (!(com.google.javascript.jscomp.deps.PathUtil.isAbsolute(path))) {
			path = (rootPath + "/") + path;
		}
		return com.google.javascript.jscomp.deps.PathUtil.collapseDots(path);
	}

	public static java.lang.String makeRelative(java.lang.String basePath, java.lang.String targetPath) {
		if ((com.google.javascript.jscomp.deps.PathUtil.isAbsolute(basePath)) != (com.google.javascript.jscomp.deps.PathUtil.isAbsolute(targetPath))) {
			throw new java.lang.IllegalArgumentException(((((("Paths must both be relative or both absolute.\n" + "  basePath: ") + basePath) + "\n") + "  targetPath: ") + targetPath));
		}
		basePath = com.google.javascript.jscomp.deps.PathUtil.collapseDots(basePath);
		targetPath = com.google.javascript.jscomp.deps.PathUtil.collapseDots(targetPath);
		java.lang.String[] baseFragments = basePath.split("/");
		java.lang.String[] targetFragments = targetPath.split("/");
		int i = -1;
		do {
			i += 1;
			if ((i == (baseFragments.length)) && (i == (targetFragments.length))) {
				return ".";
			}else
				if (i == (baseFragments.length)) {
					return com.google.common.base.Joiner.on("/").join(com.google.common.collect.Lists.newArrayList(java.util.Arrays.asList(targetFragments).listIterator(i)));
				}else
					if (i == (targetFragments.length)) {
						return (com.google.common.base.Strings.repeat("../", (((baseFragments.length) - i) - 1))) + "..";
					}
				
			
		} while (baseFragments[i].equals(targetFragments[i]) );
		return (com.google.common.base.Strings.repeat("../", ((baseFragments.length) - i))) + (com.google.common.base.Joiner.on("/").join(com.google.common.collect.Lists.newArrayList(java.util.Arrays.asList(targetFragments).listIterator(i))));
	}
}

