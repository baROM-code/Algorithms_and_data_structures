package pr5;

import java.util.ArrayList;

public class Mian5 {


    private static ArrayList<Integer> res = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("2 в степени 8 = " + degree(2, 8));   // 2 в степени 8

        System.out.println("   ");

        MyItems[] items =
                {new MyItems(4, 12),
                 new MyItems(3, 1),
                 new MyItems(10, 4),
                 new MyItems(2, 2),
                 new MyItems(5, 10)};

        int bag = 16;
        System.out.println("Стоимость пердметов в сумке: " + findCost(items, bag));
        int w = 0;
        for (int i : res) {
            w += items[i].getWeight();
        }
        System.out.println("Индексы предметов: " + res + " их вес: " + w);
    }

    public static int findCost(MyItems[] it, int bagweight){
        int idx = indexOfMaxValue(it);
        int weight = 0;
        int r = 0;
        if (idx == -1) {return 0;}
        it[idx].setSkip();
        if (it[idx].getWeight() <= bagweight) {
            res.add(idx);
            weight = it[idx].getWeight();
            r = it[idx].getValue();
        }
        return r + findCost(it, bagweight - weight);
    }


    public static int indexOfMaxValue(MyItems[] it) {
        int max = 0;
        int idx = -1;
        for (int i = 0; i < it.length; i++) {
            if (it[i].getValue() > max && !it[i].isSkip()) {
                max = it[i].getValue();
                idx = i;
            }
        }
        return idx;
    }

    public static int degree(int x, int y) {
        if (y == 0) {
            return 1;
        }
        y--;
        return x * degree(x, y);
    }

}
