//Question 1207 named Unique Number of Occurrences

import java.util.HashSet;
import java.util.Arrays;

class UniqueOccurrences
{
    public static boolean main(int[] arr){
        HashSet<Integer> set = new HashSet<Integer>();
        Arrays.sort(arr);
        for(int i=0; i<arr.length;){
            int count = 0, temp = arr[i];
            while(i<arr.length && arr[i] == temp){
                count++;
                i++;
            }
            if(set.contains(count)){
                return false;
            }
            set.add(count);
        }
        return true;
    }
}