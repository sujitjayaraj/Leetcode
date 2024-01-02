//Question 14 named Longest Common Prefix

import java.util.Arrays;

class LongestCommonPrefix
{
    public static String main(String[] strs)
    {
        Arrays.parallelSort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int i;
        for(i=0; i<Math.min(s1.length(), s2.length()); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                break;
            }
        }
        
        return s1.substring(0, i);
    }
}