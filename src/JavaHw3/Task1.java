package JavaHw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
Пусть дан произвольный список целых чисел, удалить из него четные числа
 */
public class Task1 {
    public static void main(String[] args) {

        oddOnly(randomList(10));
    }

    public static List<Integer> randomList(int size) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        return list;
    }

    static List<Integer> oddOnly(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
        return list;
    }
}
