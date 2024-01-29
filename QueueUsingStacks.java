//Question 232 named Implement Queue using Stacks

import java.util.Stack;
class QueueUsingStacks
{
    Stack<Integer> stack;
    public QueueUsingStacks() {
        stack = new Stack<Integer>();
    }
    
    public void push(int x) {
        Stack<Integer> temp = new Stack<Integer>();
        while(!this.empty()){
            temp.push(this.stack.pop());
        }
        this.stack.push(x);
        while(!temp.empty()){
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