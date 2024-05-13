package main.Medium;

// Simplify Path
// https://leetcode.com/problems/simplify-path/

import java.util.ArrayList;

public class _71_ {
    public String simplifyPath(String path) {
        path = path.replaceAll("/+", "/");
        if (path.equals("/"))
            return path;

        StringBuilder newPath = new StringBuilder(path);
        if (path.charAt(0) != '/')
            newPath.insert(0, '/');

        if (path.endsWith("/"))
            newPath.deleteCharAt(newPath.length() - 1);

        String[] segments = newPath.substring(1).split("/");
        ArrayList<String> normalizedSegments = new ArrayList<>();
        for (String segment : segments) {
            if (segment.equals("..")) {
                if (!normalizedSegments.isEmpty())
                    normalizedSegments.removeLast();
            } else if (!segment.equals("."))
                normalizedSegments.add(segment);
        }

        return "/".concat(String.join("/", normalizedSegments));
    }
}
