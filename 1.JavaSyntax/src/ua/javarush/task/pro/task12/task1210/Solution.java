package ua.javarush.task.pro.task12.task1210;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Перевертання даних
*/

public class Solution {
    public static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
    }

//    public static <T> List<T> reverse(List<T> list) {
//        List<T> reverse = new ArrayList<>(list);
//        Collections.reverse(list);
//        return reverse;
//    }


    public static void reverse() {
        ArrayList<Integer> copy = new ArrayList<>(numbers);
        int start = 0;
        for (int i = numbers.size()-1; i >= 0; i--) {
            numbers.set(i, copy.get(start));
            start++;
        }
    }

    private static void print() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
