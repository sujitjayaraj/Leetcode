package Easy;

// Implement Queue using Stacks
// https://leetcode.com/problems/implement-queue-using-stacks/

import java.util.Stack;

public class _232_ {
    Stack<Integer> stack;

    public _232_() {
        stack = new Stack<Integer>();
    }

    public void push(int x) {
        Stack<Integer> temp = new Stack<Integer>();

        while (!this.empty()) {
            temp.push(this.stack.pop());
        }

        this.stack.push(x);

        while (!temp.empty()) {
            this.stack.push(temp.pop());
        }
    }

    public int pop() {
        return this.stack.pop();
    }

    public int peek() {
        return this.stack.peek();
    }

    public boolean empty() {
        return stack.empty();
    }
}