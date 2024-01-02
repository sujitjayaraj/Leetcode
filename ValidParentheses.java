//Question 20 named Valid Parentheses

import java.util.ArrayDeque;

class ValidParentheses
{
    public static boolean main(String s){
        ArrayDeque<Character> st = new ArrayDeque<Character>();
        char ch;
        
        for(int i=0; i<s.length(); i++){
            ch = s.charAt(i);
            
            if(ch == '(') { st.push(')'); }
            else if(ch == '[') { st.push(']'); }
            else if(ch == '{') { st.push('}'); }
            else{
                if(st.isEmpty() || st.pop() != ch) { return false; }
            }
            
        }
        
        return st.isEmpty();
    }
}