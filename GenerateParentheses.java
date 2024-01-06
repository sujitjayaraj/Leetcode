//Question 22 named Generate Parentheses

import java.util.ArrayList;
import java.util.List;

class GenerateParentheses
{
    static ArrayList<String> result;
    
    public static List<String> main(int n)
    {
        result = new ArrayList<String>(2*n-1);
        recursiveGenerateParentheses(new StringBuilder("("), 1, n);
        return result;
    }
    
    private static void recursiveGenerateParentheses(StringBuilder sb, int leftCount, int n){
        if(n == 0)
        {   
            result.add(sb.toString());
            return;
        }
        
        StringBuilder sb1 = new StringBuilder(sb);
        if(leftCount < n){
            recursiveGenerateParentheses(sb.append('('), leftCount+1, n);
        }
        if(leftCount > 0){
            recursiveGenerateParentheses(sb1.append(')'),leftCount-1, n-1);
        }
        return;
    }
}