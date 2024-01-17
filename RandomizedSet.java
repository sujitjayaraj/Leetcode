//Question 380 named Insert Delete GetRandom O(1)

import java.util.ArrayList;
import java.util.HashMap;

class RandomizedSet
{
    HashMap<Integer, Integer> map;
    ArrayList<Integer> arr;
    public RandomizedSet() {
        map = new HashMap<Integer, Integer>();
        arr = new ArrayList<Integer>();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        arr.add(val);
        map.put(val, arr.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        Integer value = Integer.valueOf(val);
        if(arr.remove(value)){
            map.remove(value);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        int pos = (int)(Math.random()*arr.size());
        return arr.get(pos);
    }
}