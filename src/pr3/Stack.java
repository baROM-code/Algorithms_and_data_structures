package pr3;

import java.util.Arrays;

public class Stack {

    private char[] stackArr;
    private int top;
    private int size;

    public Stack() {
        size = 1;
        stackArr = new char[1];
        top = -1;
    }

    public void push(char i){
        if (top == size - 1 ) {
            size++;
            char[] old = stackArr;
            char[] nArr = Arrays.copyOf(old, size);
            stackArr = nArr;
            old = null;
        }
        stackArr[++top] = i;

    }

    public char pop(){
        return stackArr[top--];
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Stack{" + Arrays.toString(stackArr) + '}';
    }
}
