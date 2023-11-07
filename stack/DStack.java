package stack;

public class DStack {

    int capacity=2;
    int[] stack = new int[capacity];
    int top = 0;

    public void push(int value) {
        if(size()==capacity){
            expand();
        }

        stack[top] = value;
        top++;
    }

    private void expand() {
        int length=size();
        int newStack[]=new int[capacity*2];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack=newStack;
        capacity *=2;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return -1;
        } else {
            top--;
            int value = stack[top];
            stack[top] = 0;
            return value;
        }

    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        if (size() <= 0) {
            return true;
        }
        return false;
    }

    public int peek() {
        return stack[top - 1];
    }

}
