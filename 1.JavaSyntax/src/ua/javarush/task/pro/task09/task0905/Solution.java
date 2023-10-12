package ua.javarush.task.pro.task09.task0905;

import java.util.regex.Pattern;

/* 
Вісімковий конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десяткове число " + decimalNumber + " дорівнює вісімковому числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Вісімкове число " + octalNumber + " дорівнює десятковому числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        //напишіть тут ваш код
        double octalNumber = 0;
        while (decimalNumber != 0) {
            octalNumber = octalNumber + (decimalNumber% 8) * Math.pow(10 , octalNumber);
            decimalNumber = decimalNumber / 8;
            decimalNumber++;
        }
        return (int) octalNumber;
    }

    public static int toDecimal(int octalNumber) {
        //напишіть тут ваш код

        return 0;
    }
}
