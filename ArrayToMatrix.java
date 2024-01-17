//Question 2160 named Convert an Array Into a 2D Array With Conditions

import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

class ArrayToMatrix
{
    public static List<List<Integer>> main(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<Integer>());
        for(int i=0; i<nums.length; i++){
            ListIterator<List<Integer>> j = result.listIterator();
            while(j.hasNext()){
                if(!j.next().contains(nums[i])){
                    j.previous().add(nums[i]);
                    nums[i] = 0;
                    break;
                }
            }
            if(nums[i] != 0){
                List<Integer> temp = new ArrayList<Integer>();
                temp.add(nums[i]);
                result.add(temp);
            }
        }
        return result;
    }
}