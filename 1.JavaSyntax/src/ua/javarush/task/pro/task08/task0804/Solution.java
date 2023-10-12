package ua.javarush.task.pro.task08.task0804;

/* 
Randomizer
*/

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(generateNumber());
    }

    public static int generateNumber() {
        //напишіть тут ваш код
        int randomNumber = 0;

        for (int i = 0; i < 100; i++) {
            randomNumber = (int) (Math.random() * 99);

        }
        return  randomNumber;
    }
}
