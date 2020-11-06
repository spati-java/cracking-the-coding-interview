package chapter3;

import java.util.Stack;

public class StackAndQueue {

    public Stack<Integer> sortStack(Stack<Integer> input){
        Stack<Integer> buffer = new Stack<>();
        while(!input.isEmpty()) {
            int temp = input.pop();
            while(!buffer.isEmpty() && buffer.peek() > temp) {
                input.push(buffer.pop());
            }
            buffer.push(temp);
        }

        return buffer;
    }
}
