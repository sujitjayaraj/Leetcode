package Medium;

// Evaluate Reverse Polish Notation
// https://leetcode.com/problems/evaluate-reverse-polish-notation/

public class _150_ {
    public int evalRPN(String[] tokens) {
        int[] arr = new int[tokens.length];
        int length = -1;

        for (String token : tokens) {
            try {
                int val = Integer.parseInt(token);
                length++;
                arr[length] = val;
            } catch (NumberFormatException e) {
                int o1 = arr[length - 1], o2 = arr[length];
                switch (token.charAt(0)) {
                    case '*':
                        arr[length - 1] = o1 * o2;
                        break;
                    case '+':
                        arr[length - 1] = o1 + o2;
                        break;
                    case '-':
                        arr[length - 1] = o1 - o2;
                        break;
                    case '/':
                        arr[length - 1] = o1 / o2;
                        break;
                }
                length--;
            }
        }

        return arr[length];
    }
}