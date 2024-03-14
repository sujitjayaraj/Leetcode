//Question 349 named Intersection of Two Arrays

import java.util.HashSet;
import java.util.Iterator;
class TwoArrayIntersection
{
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> list1 = new HashSet<Integer>();
        for(int num: nums1){
            list1.add(num);
        }

        HashSet<Integer> list2 = new HashSet<Integer>();
        for(int num: nums2){
            list2.add(num);
        }

        list1.retainAll(list2);
        Iterator<Integer> itr = list1.iterator();
        int[] result = new int[list1.size()];
        for(int i=0; i<result.length; i++){
            result[i] = itr.next();
        }

        return result;
    }
}