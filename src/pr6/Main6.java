package pr6;

import java.util.Random;

public class Main6 {
    public static void main(String[] args) {
        MyTreeMap<Integer, String> map = new MyTreeMap<>();

        map.put(4, "four");
        map.put(2, "two");
        map.put(1, "one");
        map.put(5, "five");
        map.put(3, "three");

        map.show();
        System.out.println("Высота дерева = " + map.height());
        System.out.println("Дерево сбалансировано: " + map.isBalanced());

        map.put(-2, "");
        map.put(-8, "");
        map.put(-4, "");
        map.put(9, "");

        map.show();
        System.out.println("Высота дерева = " + map.height());
        System.out.println("Дерево сбалансировано: " + map.isBalanced());

        System.out.println("-----------------------------------------");

        int count = 100000;
        MyTreeMap<Integer, String>[] maps = new MyTreeMap[count];
        int countbalansedtree = 0;

        for (int i = 0; i < maps.length; i++) {
            maps[i] = new MyTreeMap<>();
            Random r = new Random();
            int x = 0;
            while (maps[i].height() <= 6) {
                x = r.nextInt(200) - 100;
                maps[i].put(x, "");
            }
            maps[i].delete(x);

            /*
            maps[i].show();
            System.out.println("Высота дерева = " + maps[i].height());
            System.out.println("Дерево сбалансировано: " + maps[i].isBalanced());
            */

            if (maps[i].isBalanced()) {countbalansedtree++;}
        }

        double pr = (double) countbalansedtree * 100 / count;

        System.out.println("Деревьев = " + count);
        System.out.println("Процент сбалансированных деревьев: " + pr + "%");

    }
}
