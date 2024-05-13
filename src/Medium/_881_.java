package Medium;

// Boats to Save People
// https://leetcode.com/problems/boats-to-save-people/

import java.util.Arrays;

public class _881_ {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int first = 0, last = people.length - 1, boats = 0;
        while (first < last) {
            int sum = people[first] + people[last];
            if (sum <= limit)
                first++;

            last--;
            boats++;
        }

        if (first == last)
            boats++;

        return boats;
    }
}