package pr3;

import java.util.Arrays;

// класс для реализации дека

public class MyDeque {

    private int maxSize;
    private int[] deque;
    private int left;
    private int right;
    private int items;

    public MyDeque(int i) {
        maxSize = i;
        deque = new int[maxSize];
        left = -1;
        right = 0;
        items = 0;
    }

    public boolean isEmpty(){
        return (items==0);
    }

    public boolean isFull(){
        return (items==maxSize);
    }

    public int size(){
        return items;
    }

    public void insertLeft(int i) {
        if (isFull()) {
            System.out.println("Error: left insertion failed - Degue is full");
            return;}
        if (left == maxSize -1) { left = -1;}
        deque[++left] = i;
        items++;
    }

    public void insertRight(int i) {
        if (isFull()) {
            System.out.println("Error: right insertion failed - Degue is full");
            return;}
        if (right == 0) { right = maxSize;}
        deque[--right] = i;
        items++;
    }

    public int removeRight() throws Exception {
        if (isEmpty()) {
            throw new Exception("Error: Degue is empty");
            }
        int tr = right;
        int t = deque[tr];
        deque[tr] = 0;
        right++;
        if(right == maxSize)
            right = 0;
        items--;
        return t;
    }

    public int removeLeft() throws Exception {
        if (isEmpty()) {
            throw new Exception("Error: Degue is empty");
        }
        int tl = left;
        int t = deque[tl];
        deque[tl] = 0;
        left--;
        if(left == -1)
            left = maxSize - 1;
        items--;
        return t;
    }

    public void Show() {
        System.out.print(Arrays.toString(deque));
        System.out.println("    left=" + left + ", right=" + right);
    }

}
