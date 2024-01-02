//Question 3 named Longest Substring Without Repeating Characters

class LongestSubstring
{
    public static int main(String s){
        int i=0, max = 0;
        for(int j=1; j < s.length(); j++){
            char ch = s.charAt(j);
            if(s.substring(i,j).contains(String.valueOf(ch))){
                if(j-i > max){
                    max = j-i;
                }
                i = s.indexOf(s.charAt(j), i) + 1;
            }
        }
        if(s.length()-i > max){
            max = s.length() - i;
        }
        return max;
    }
}