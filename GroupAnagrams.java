//Question 49 named Group Anagrams

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
class GroupAnagrams
{
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(str);
        }
        
        return new ArrayList<>(map.values());
    }
}