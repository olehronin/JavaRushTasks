package ua.javarush.task.pro.task13.task1308;

import java.util.ArrayList;
import java.util.Collections;

/* 
Вивчаємо методи класу Collections, частина 3
*/

public class Solution {

    public static Integer min(ArrayList<Integer> list) {
        int minimum = Collections.min(list);
        return minimum;
    }

    public static Integer max(ArrayList<Integer> list) {
        Integer maximum = Collections.max(list);
        return maximum;
    }

    public static int frequency(ArrayList<Integer> list, Integer element) {
        int frequency = Collections.frequency(list, element);
        return frequency;
    }

    public static int binarySearch(ArrayList<Integer> list, Integer key) {

        int index = Collections.binarySearch(list, key);

        return index;
    }
}
