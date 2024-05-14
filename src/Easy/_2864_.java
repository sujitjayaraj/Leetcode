package Easy;

// Maximum Odd Binary Number
// https://leetcode.com/problems/maximum-odd-binary-number/

public class _2864_ {
    public String maximumOddBinaryNumber(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length-1;

        if(arr[right] == '0'){
            left = s.indexOf('1');
            arr[right] = '1';
            arr[left] = '0';
            left = 0;
        }

        right--;

        while(left < right){
            if(arr[right] == '1' && arr[left] == '0'){
                arr[left] = '1';
                arr[right] = '0';
                right--;
                left++;
            }
            else if(arr[left] == '1'){
                left++;
            }
            else{
                right--;
            }
        }

        return new String(arr);
    }
}