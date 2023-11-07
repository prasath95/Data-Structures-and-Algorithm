package stack;
import java.util.ArrayList;

public class Stack {
    // stack - books
    // FILO
    // 1,2,3,4
    // 4,3,2,1
    // push - pop - peek
    // Array

    int stackArray[] = new int[5];
    int top = 0;

    public void push(int value) {
        if (top == 5) {
            System.out.println("stack is full");
        } else {
            stackArray[top] = value;
            top++;
        }
    }

    public int pop() {
        int value = 0;
        if (isEmpty()) {
            System.out.println("stack is empty");
        } else {
            top--;
            value = stackArray[top];
            stackArray[top] = 0;

        }
        return value;
    }

    public int peek() {
        return stackArray[top - 1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top <= 0;
    }

    public void show() {
        for (int i = 0; i < stackArray.length; i++) {
            System.out.println(stackArray[i]);
        }
    }

}
