package pr8;

import java.util.Random;

public class Main8 {
    public static void main(String[] args) {

        Random random = new Random();

        ChainingHashMap<Integer, String> map = new ChainingHashMap<>(9);

        for (int i = 0; i < 6 ; i++) {
            map.put(random.nextInt(100), "a");
        }
        map.put(36, "a136");
        map.put(2, "a128");
        map.put(64, "a164");
        System.out.println(map);
        map.del(36);
        map.del(2);
        System.out.println(map);

        /*
        LinearProbingHashMap<Integer, String> lphm = new LinearProbingHashMap<>(97);
        lphm.put(5, "qwe");
        lphm.put(15, "qweerwer");
        System.out.println(lphm.get(15));
        */
    }

}
