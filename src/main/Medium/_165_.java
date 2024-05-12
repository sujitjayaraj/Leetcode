package main.Medium;

// Compare Version Numbers
// https://leetcode.com/problems/compare-version-numbers/
public class _165_ {
    public int compareVersion(String version1, String version2) {
        String[] split1 = version1.split("\\.");
        String[] split2 = version2.split("\\.");
        int i = 0, j = 0;
        while (i < split1.length || j < split2.length) {
            int value1 = i >= split1.length ? 0 : Integer.parseInt(split1[i++]);
            int value2 = j >= split2.length ? 0 : Integer.parseInt(split2[j++]);
            if (value1 > value2)
                return 1;
            else if (value1 < value2)
                return -1;
        }
        return 0;
    }
}
