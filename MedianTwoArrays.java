//Question 4 named Median of Two Sorted Arrays
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

class MedianTwoArrays
{
    public static double main(int[] nums1, int[] nums2){
        List<Integer> arr = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        arr.addAll(Arrays.stream(nums2).boxed().collect(Collectors.toList()));
        Collections.sort(arr);
        if(arr.size()%2 == 0){
            return (arr.get(arr.size()/2) + arr.get(arr.size()/2 - 1))/2.0;
        }
        return arr.get((arr.size() - 1)/2);
    }
}