//Question 1347 Minimum Number of Steps to Make Two Strings Anagram

import java.util.Arrays;

class MinStepsAnagram
{
    public static int main(String s, String t){
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        int i=0, j=0, count=0;
        while(i<s1.length && j<t1.length){
            if(s1[i] < t1[j]){
                i++;
            }
            else if(s1[i] > t1[j]){
                j++;
            }
            else{
                i++;
                j++;
                count++;
            }
        }
        return s1.length - count;
    }
}