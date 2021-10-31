package pr3;

public class Main {

    public static void main(String[] args) throws Exception {

    /*
        1. Создать программу, которая переворачивает вводимые строки (читает справа налево).
        3*. Реализовать автоматическое увеличение размера массива в стеке
     */

        Stack stack = new Stack();
        stack.push('H');
        stack.push('e');
        stack.push('l');
        stack.push('l');
        stack.push('o');
        stack.push('!');
        System.out.println(stack);
        String rev = "";
        for (int i = 0; i < stack.getSize(); i++) {
            rev = rev + stack.pop();
        }
        System.out.println(rev);

    /*
       2. Создать класс для реализации дека.
    */

        MyDeque deque = new MyDeque(5);

        deque.insertLeft(1);
        deque.insertLeft(2);
        deque.insertLeft(3);
        deque.insertRight(10);
        deque.Show();

        System.out.println(deque.removeRight());
        System.out.println(deque.removeRight());
        deque.Show();

        deque.insertRight(50);
        deque.insertRight(60);
        deque.insertLeft(7);
        deque.Show();

        System.out.println(deque.removeRight());
        System.out.println(deque.removeRight());
        System.out.println(deque.removeRight());
        System.out.println(deque.removeRight());
        System.out.println(deque.removeRight());
        deque.Show();

        deque.insertLeft(11);
        deque.insertLeft(22);
        deque.insertLeft(33);
        deque.Show();
        System.out.println(deque.removeLeft());
        System.out.println(deque.removeRight());
        System.out.println(deque.removeLeft());
    }
}
