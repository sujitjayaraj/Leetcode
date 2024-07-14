package Medium;

import java.util.ArrayDeque;

/**
 * Question 1190
 * <a href="https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/">Reverse Substrings Between Each Pair of Parantheses</a> 
 */

public class _1190_ {
    
    /**
     * Reverses the substring between each pair of matching parentheses starting
     * from the innermost one.
     * 
     * @param s String of lower case English letters and brackets.
     * @return Reversed String between each pair of matching parentheses
     */
    public String reverseParentheses(String s) {
        ArrayDeque<Character> q1 = new ArrayDeque<>();
        ArrayDeque<Character> q2 = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch) || ch == '(')
                q1.push(ch);

            else {
                char c = q1.pop();
                while (c != '(') {
                    q2.offer(c);
                    c = q1.pop();
                }

                while (!q2.isEmpty())
                    q1.push(q2.poll());
            }
        }

        while (!q1.isEmpty())
            sb.append(q1.poll());

        return sb.reverse().toString();
    }
}