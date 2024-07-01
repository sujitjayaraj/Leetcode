package Easy;

class _1122_
{
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freq = new int[1001], result = new int[arr1.length];

        for (int num : arr1)
            freq[num]++;

        int index = 0;

        for (int num : arr2) {
            while (freq[num] > 0) {
                result[index++] = num;
                freq[num]--;
            }
        }

        for (int i = 0; i < freq.length; i++) {
            while (freq[i] > 0) {
                result[index++] = i;
                freq[i]--;
            }
        }

        return result;
    }
}