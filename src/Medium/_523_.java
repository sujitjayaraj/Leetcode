package Medium;

import java.util.HashMap;

class _523_
{
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = (sum + nums[i]) % k;

            if (map.containsKey(sum)) {
                if (map.get(sum) < i - 1)
                    return true;
            }

            else
                map.put(sum, i);
        }

        return false;
    }
}