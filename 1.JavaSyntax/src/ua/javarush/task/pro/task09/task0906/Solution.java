package ua.javarush.task.pro.task09.task0906;

import java.util.regex.Pattern;

/*
Двійковий конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Десяткове число " + decimalNumber + " дорівнює двійковому числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двійкове число " + binaryNumber + " дорівнює десятковому числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        //напишіть тут ваш код
        if(decimalNumber <= 0){
            return "";
        }
        StringBuilder binaryNumber = new StringBuilder();
        while (decimalNumber != 0) {
            binaryNumber.insert(0, decimalNumber % 2);
            decimalNumber = decimalNumber / 2;


        }


        return binaryNumber.toString();
    }

    public static int toDecimal(String binaryNumber) {
        //напишіть тут ваш код
        if ((binaryNumber == null) || (binaryNumber.equals(""))) {
            return 0;
        } else {
            char[] chars = binaryNumber.toCharArray();
            int result = 0;
            int mult = 1;
            for (int i = binaryNumber.length() - 1; i >= 0; i--) {
                if (chars[i] == '1') {
                    result += mult;
                }
                mult *= 2;
            }
            return result;

        }
    }
}
