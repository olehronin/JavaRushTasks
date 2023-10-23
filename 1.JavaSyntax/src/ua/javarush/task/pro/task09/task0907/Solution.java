package ua.javarush.task.pro.task09.task0907;

import java.util.regex.Pattern;

/* 
Шістнадцятковий конвертер
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десяткове число " + decimalNumber + " дорівнює шістнадцятковому числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шістнадцяткове число " + hexNumber + " дорівнює десятковому числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        //напишіть тут ваш код
        if (decimalNumber <= 0) {
            return "";
        } else {
            int base = 16;
            String hex = "";
            while (decimalNumber != 0) {
                int digit = decimalNumber % base;
                hex = HEX.charAt(digit) + hex;
                decimalNumber = decimalNumber / base;
            }
            return hex;
        }
    }

    public static int toDecimal(String hexNumber) {
        //напишіть тут ваш код
        if (hexNumber == null || hexNumber.isEmpty()) {
    return 0;
        }
        hexNumber = hexNumber.toLowerCase();
        int result = 0;
        for (int i = 0; i < hexNumber.length(); i++) {
            char c = hexNumber.charAt(i);
            int hexDigit = HEX.indexOf(c);
            result = 16 * result + hexDigit;
        }
        return result;
    }
}
