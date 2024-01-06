//Question 1624 named Largest Substring Between Two Equal Characters

class LargestSubstringBetweenChars
{
    public static int main(String s){
        int maxLength = 0, length;
        for(int i=0; i<s.length(); i++){
            length = s.lastIndexOf(s.charAt(i)) - i;
            if(length > 0 && length > maxLength){
                maxLength = length;
            }
        }
        
        return maxLength - 1;
    }
}