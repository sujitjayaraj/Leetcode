//Question 91 named Decode Ways

import java.util.Arrays;

class DecodeWays
{
    static String str;
    static int[] dp;
    
    public static int main(String s){
        str = s;
        dp = new int[s.length()];
        Arrays.fill(dp, -1);
        int start = 0;
        return recursiveDecode(start);
    }
    
    private static int recursiveDecode(int start){
        if(start == str.length()){
            return 1;
        }
        else if(str.charAt(start) == '0'){
            return 0;
        }
        else if(dp[start] >= 0){
            return dp[start];
        }

        dp[start] = recursiveDecode(start+1);
        if(start < str.length() - 1){
            if(Integer.parseInt(str.substring(start, start+2)) >= 10 && Integer.parseInt(str.substring(start, start+2)) <= 26){
                dp[start] += recursiveDecode(start+2);            
            }
        }
        return dp[start];
    }
}