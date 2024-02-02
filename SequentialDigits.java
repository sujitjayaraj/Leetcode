//Question 1291 named Sequential Digits

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class SequentialDigits
{
    static List<Integer> list;
    public List<Integer> sequentialDigits(int low, int high) {
        list = new ArrayList<Integer>();
        for(int i=1; i<=9; i++){
            recursiveDigits(Integer.toString(i), low, high);
        }
        Collections.sort(list);
        return list;
    }
    private void recursiveDigits(String curr, int low, int high){
        int val = Integer.valueOf(curr);
        if(val > high){
            return;
        }
        else if(val >= low && val <= high){
            list.add(val);
        }
        if(val % 10 != 9){
            curr = curr.concat(Integer.toString(val%10 + 1));
            recursiveDigits(curr, low, high);
        }
        return;
    }
}