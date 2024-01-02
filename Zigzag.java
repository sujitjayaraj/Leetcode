//Question 6 named Zigzag Conversion

import java.util.Arrays;
import java.util.stream.Collectors;

class Zigzag
{
    public static String main(String s, int numRows)
    {
        if(numRows == 1)
        {
            return s;
        }
        StringBuilder result = new StringBuilder(s.length());
        int cycleLength = 2*numRows - 2;
        for(int i=0; i<numRows; i++){
            for(int j=i; j<s.length(); j+=cycleLength){
                result.append(s.charAt(j));
            }
        }
        return result.toString();
    }
}