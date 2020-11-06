public class CustomStack {

    int size = 0;
    int top = -1;
    int capacity = 5;

    int minIndex = -1;

    int[] stack = new int[capacity];


    public int push(int element) {
        stack[++top] = element;
        size++;
        return stack[top];
    }

    public int peek() {
        if (top == -1) return -1;
        return stack[top];
    }

    public int pop() {
        if (size == 0) return -1;
        size--;
        return stack[top--];
    }

    public int getSize() {
        return size;
    }

    public void increaseCapacity(){

        capacity = capacity*2;

        int [] newStack = new int[capacity];

        for(int i =0; i<size; i++ ){
            newStack[i] = stack[i];
        }
        stack = new int[capacity];

        for (int i = 0; i <size; i++ ){
            stack[i] = newStack[i];
        }
    }

    public int [] getStack(){
        return  stack;
    }

}
