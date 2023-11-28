package ua.javarush.task.pro.task18.task1819;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 
Як бути, якщо в списку є елемент null
*/

public class Solution {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "first", "second", null, "fourth", "fifth");

        printList(strings);
    }

    public static void printList(List<String> list) {
        String text = "Цей елемент дорівнює null";
        //напишіть тут ваш код

        list.stream().forEach(s -> System.out.println(Optional.ofNullable(s).orElse(text)));
//        Optional<List> s = Optional.ofNullable(list.stream().collect(Collectors.toList()));
//        System.out.println(text);
    }
}
