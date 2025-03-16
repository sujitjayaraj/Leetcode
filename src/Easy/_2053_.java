package Easy;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/kth-distinct-string-in-an-array/">Kth Distinct String in an Array</a>
 */
public class _2053_
{
    /**
     * Finds the k<sup>th</sup> distinct {@link String} in an array.
     * 
     * @param arr Input array of {@link String}.
     * @param k Integer representing the k<sup>th</sup> element in the order in which they appear.
     * @return {@link String} representing the k<sup>th</sup> distinct element in the input array.
     */
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        int count = 0;

        for (String s : arr)
            map.putLast(s, map.getOrDefault(s, 0) + 1);

        for (Map.Entry<String, Integer> e : map.sequencedEntrySet()) {
            if (e.getValue() == 1)
                count++;

            if (count == k)
                return e.getKey();
        }

        return "";
    }
}