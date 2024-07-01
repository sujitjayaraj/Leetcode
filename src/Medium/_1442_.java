package Medium;

// Count Triplets That Can Form Two Arrays of Equal XOR
// https://leetcode.com/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/

class _1442_
{
    public int countTriplets(int[] arr) {
        int[] prefix = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++)
            prefix[i + 1] = arr[i] ^ prefix[i];

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 2; j <= arr.length; j++) {
                if (prefix[i] == prefix[j])
                    result += j - i - 1;
            }
        }

        return result;
    }
}