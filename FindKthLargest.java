//Question 215 named Kth Largest Element in an Array

import java.util.PriorityQueue;

class FindKthLargest
{
    public static int main(int[] nums, int k){
        PriorityQueue<Integer> p = new PriorityQueue<Integer>(nums.length, (x, y) -> y - x);
        for(int i=0; i<nums.length; i++){
            p.offer(nums[i]);
        }
        
        int result = 0;
        for(int i=1; i<=k; i++){
            result = p.poll();
        }
        
        return result;
    }
}