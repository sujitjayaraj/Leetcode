package Medium;

class _75_
{
    public void sortColors(int[] nums) {
        int left = 0, mid = 0, right = nums.length - 1;

        while (mid <= right) {
            int temp = nums[mid];

            if (temp == 0) {
                nums[mid++] = nums[left];
                nums[left++] = temp;
            }

            else if (temp == 2) {
                nums[mid] = nums[right];
                nums[right--] = temp;
            }

            else
                mid++;
        }
    }
}