package ua.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Видаляємо однакові рядки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        //напишіть тут ваш код
        strings = new String[6];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            strings[i] = input.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            String first = strings[i];
            if(first == null){
                continue;
            }
            for (int j = i + 1; j < strings.length; j++) {
                if (first.equals(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
