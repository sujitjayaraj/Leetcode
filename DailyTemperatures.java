//Question 739 named Daily Temperatures

import java.util.Deque;
import java.util.ArrayDeque;
class DailyTemperatures
{
    public int[] dailyTemperatures(int[] temperatures){
        int[] result = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<Integer>();

        for(int i=0; i<temperatures.length; i++){
            while(stack.size()!=0 && temperatures[i]>temperatures[stack.peekLast()]){
                int prevPos = stack.pollLast();
                result[prevPos] = i-prevPos;
            }
            stack.offerLast(i);
        }

        return result;
    }
}