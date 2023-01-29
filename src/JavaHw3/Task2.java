/*
Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
Collections.max()
 */
package JavaHw3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static JavaHw3.Task1.randomList;
public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(randomList(10));
        System.out.println(list);
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(getAverage(list));


    }
    public static double getAverage(List<Integer> list) {
        double sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        sum = sum/list.size();
        return sum;
    }

}
