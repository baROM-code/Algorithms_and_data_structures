package pr4;

public class MyLinkedStack<T> extends MyLinketList<T> {

    private final MyLinketList item;

    public MyLinkedStack() {
        item = new MyLinketList();
    }

    public void push (T t) {
        item.insertLast(t);
    }

    public T pop() {
        T tmp = (T) item.getLast();
        item.deleteLast();
        return tmp;
    }

    public void show(){
        System.out.println(item);
    }
}
