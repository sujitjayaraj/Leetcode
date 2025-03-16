package Medium;

/**
 * <a href="https://leetcode.com/problems/minimum-time-to-repair-cars">Minimum Time to Repair Cars</a>
 */
public class _2594_
{
    /**
     * Calculates the minimum time needed to repair all cars
     * @param ranks int array containing the ranks of all mechanics.
     * @param cars Total number of cars to repair.
     * @return The minimum time needed to repair all cars.
     */
    public long repairCars(int[] ranks, int cars) {
        int[] freq = new int[100];

        for (int i : ranks) {
            freq[i - 1]++;
        }

        long low = 1, high = 100L * cars * cars;

        while (low < high) {
            long mid = (high + low) / 2, total = 0;

            for (int i = 0; i < 100; i++) {
                total += (long) Math.sqrt(mid / (long) (i + 1)) * freq[i];
            }

            if (total < cars) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
}
