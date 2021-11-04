package pr4;

import java.util.ListIterator;

public class Main4 {
    public static void main(String[] args) {

        MyLinkedStack<String> stack = new MyLinkedStack<>();

        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        stack.show();

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.show();

        MyLinketList<Integer> mll = new MyLinketList<>();
        mll.insertFirst(4);
        mll.insertFirst(5);
        mll.insertFirst(6);
        mll.insertFirst(7);
        mll.insertFirst(8);

        ListIterator<Integer> listIterator = mll.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("------------------");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
