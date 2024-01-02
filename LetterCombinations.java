//Question 17 named Letter Combinations of a Phone Number

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

class LetterCombinations
{
    private static ArrayList<String> result;
    private static HashMap<Character,String> map;
    private static String input;
    
    public static List<String> main(String digits){
        if(digits.length() == 0){
            return new ArrayList<String>(0);
        }
        input = digits;
        result = new ArrayList<String>((int)Math.pow(4, digits.length()));
        
        map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        
        int currIndex = 0;
        
        generateCombinations(currIndex, new StringBuilder());
        
        result.trimToSize();
        return result;
    }
    
    private static void generateCombinations(int currIndex, StringBuilder sb){
        if(currIndex >= input.length()){
            result.add(sb.toString());
            return;
        }
        else{
            String letters = map.get(input.charAt(currIndex));
            
            for(int i=0; i<letters.length(); i++){
                generateCombinations(currIndex+1, new StringBuilder(sb).append(letters.charAt(i)));
            }
        }
    }
}