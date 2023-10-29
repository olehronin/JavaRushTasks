package ua.javarush.task.pro.task13.task1303;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* 
Виводимо в консоль елементи множини
*/

public class Solution {

    public static void print(HashSet<String> words) {
        //напишіть тут ваш код
        Iterator<String> iter = words.iterator();
        while (iter.hasNext()) {
        String  s = iter.next();
            System.out.println(s);
        }


    }

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Програмування зазвичай навчають на прикладах.".split(" ")));
        print(words);
    }
}
