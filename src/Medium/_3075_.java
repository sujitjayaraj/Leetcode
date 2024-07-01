package Medium;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _3075_ {
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