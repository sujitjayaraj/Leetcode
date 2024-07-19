package Medium;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * <a href="https://leetcode.com/problems/maximize-happiness-of-selected-children/">
 * Maximize happiness of selected children</a>
 */
public class _3075_ {
    /**
     * Calculates the maximum sum of the happiness values of the selected children that can be achieved by selecting k children.
     * 
     * @param happiness Integer array representing the happiness value of each child standing in a queue.
     * @param k Number of turns in which a single child can be selected.
     * @return Maximum sum of the happiness values of the selected children that can be achieved by selecting k children.
     */
    public long maximumHappinessSum(int[] happiness, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Comparator.reverseOrder());
        for (int i : happiness)
            maxHeap.offer(i);

        long result = 0;
        for (int i = 0; i < k; i++) {
            int value = maxHeap.poll() - i;
            if (value > 0)
                result += value;
        }

        return result;
    }
}