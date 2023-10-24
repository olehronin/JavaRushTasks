package ua.javarush.task.pro.task11.task1104;

/* 
Конвертер рядка
*/

import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        //напишіть тут ваш код
        double parse = Double.parseDouble(string);
        System.out.println(Math.round(parse));
    }
}
