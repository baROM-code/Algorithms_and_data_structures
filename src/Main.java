public class Main {

    public static void main(String[] args) {
        MyArr arr = new MyArr(100000) ;

        arr.setRandom();
        //arr.display();
        long b = System.currentTimeMillis();
        arr.sortBubble();
        System.out.println("Пузырьковая сортировка, мс: " +  (System.currentTimeMillis() - b));
        //arr.display();


        arr.setRandom();
        b = System.currentTimeMillis();
        arr.sortSelect();
        System.out.println("Сортировка методом выбора, мс: " +  (System.currentTimeMillis() - b));

        arr.setRandom();
        b = System.currentTimeMillis();
        arr.sortInsert();
        System.out.println("Сортировка методом вставки, мс: " +  (System.currentTimeMillis() - b));

    }

}
