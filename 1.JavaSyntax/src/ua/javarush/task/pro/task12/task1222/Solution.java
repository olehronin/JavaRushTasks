package ua.javarush.task.pro.task12.task1222;

import java.util.ArrayList;

/* 
Виводимо в консоль різні типи
*/

public class Solution {

    public static void printAnything(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public static void main(String[] args) {
        var arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add("Hello");
        arrayList.add(154);
        arrayList.add("string");

        printAnything(arrayList);




    }
}
