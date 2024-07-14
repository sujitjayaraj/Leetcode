package Medium;

import java.util.ArrayList;

/**
 * Question 71
 * <a href="https://leetcode.com/problems/simplify-path/">Simplify Path</a>
 */

public class _71_ {
    
    /**
     * Transforms an absolute path for a Unix file system into a simplified
     * canonical path.
     * 
     * @param path String representing an absolute path for a Unix file system.
     * @return String representing a simplified canonical path. 
     */
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
                    normalizedSegments.remove(normalizedSegments.size()-1);
            } else if (!segment.equals("."))
                normalizedSegments.add(segment);
        }

        return "/".concat(String.join("/", normalizedSegments));
    }
}
