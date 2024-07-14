package Easy;

import java.util.ArrayList;

public class _350_
{
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] freq = new int[1001];
        ArrayList<Integer> ele = new ArrayList<>();

        for (int num : nums1)
            freq[num]++;

        for (int num : nums2)
            if (freq[num] > 0) {
                ele.add(num);
                freq[num]--;
            }

        int[] result = new int[ele.size()];

        for (int i = 0; i < ele.size(); i++)
            result[i] = ele.get(i);

        return result;
    }
}