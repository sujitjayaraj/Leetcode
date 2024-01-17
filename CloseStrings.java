//Question 1657 named Determine if Two Strings Are Close

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class CloseStrings
{
    public static boolean main(String word1, String word2){
        if(word1.length() != word2.length()){
            return false;
        }
        
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        
        for(int i=0; i<word1.length(); i++){
            map1.put(word1.charAt(i), map1.getOrDefault(word1.charAt(i), 0)+1);
            map2.put(word2.charAt(i), map2.getOrDefault(word2.charAt(i), 0)+1);
        }
        
        if(!map1.keySet().equals(map2.keySet())){
            return false;
        }
        HashMap<Integer, Integer> freqCount1 = new HashMap<>();
        HashMap<Integer, Integer> freqCount2 = new HashMap<>();
        
        for(Integer i: map1.values()){
            freqCount1.put(i, freqCount1.getOrDefault(i, 0)+1);
        }
        for(Integer i: map2.values()){
            freqCount2.put(i, freqCount2.getOrDefault(i, 0)+1);
        }
        
        return freqCount1.equals(freqCount2);
    }
}