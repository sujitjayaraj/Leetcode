//Question 1704 named Determine if String Halves Are Alike

import java.util.HashSet;
import java.util.Arrays;

class HalvesAreAlike
{
    static final char[] vowels = {'A','E','I','O','U','a','e','i','o','u'};
    public static boolean main(String s){
        int count = 0;
        for(int i=0; i<s.length()/2; i++){
            if(Arrays.binarySearch(vowels, s.charAt(i)) >= 0){
                count++;
            }
            if(Arrays.binarySearch(vowels, s.charAt(s.length()/2 + i)) >= 0){
                count--;
            }
        }
        if(count == 0){
            return true;
        }
        return false;
    }
}