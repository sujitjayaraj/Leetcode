package Medium;

import java.util.HashMap;
import java.util.Arrays;

class _846_
{
    public boolean isNStraightHand(int[] hand, int groupSize) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int card : hand)
            map.put(card, map.getOrDefault(card, 0) + 1);

        Integer[] uniqueCards = map.keySet().toArray(Integer[]::new);
        Arrays.sort(uniqueCards);

        for (int card : uniqueCards) {
            int freq = map.get(card);

            if (freq > 0) {
                for (int i = 1; i < groupSize; i++) {
                    int temp = map.getOrDefault(card + i, 0);

                    if (temp < freq)
                        return false;

                    map.put(card + i, temp - freq);
                }
            }
        }

        return true;
    }
}