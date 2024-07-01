package Easy;

import java.util.Map;
import java.util.HashMap;

class _409_
{
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        int even = 0, odd = 0;

        for (Map.Entry<Character, Integer> i : map.entrySet()) {
            int val = i.getValue().intValue();

            if (val % 2 == 0)
                even += val;

            else if (val > odd) {
                if (odd > 0)
                    even += odd - 1;

                odd = val;
            }

            else
                even += val - 1;
        }

        return even + odd;
    }
}