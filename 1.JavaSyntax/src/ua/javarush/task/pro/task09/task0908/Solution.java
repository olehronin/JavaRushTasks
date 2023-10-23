package ua.javarush.task.pro.task09.task0908;

import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Pattern;

/* 
Двійково-шістнадцятковий конвертер
*/

public class Solution {

    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двійкове число " + binaryNumber + " дорівнює шістнадцятковому числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шістнадцяткове число " + hexNumber + " дорівнює двійковому числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        //напишіть тут ваш код
        String hexNumber = "";
        if (binaryNumber == null || binaryNumber.isEmpty()) {
            return "";
        }

        StringBuilder binaryNumberBuilder = new StringBuilder(binaryNumber);
        for (int i = 0; binaryNumberBuilder.length() % 4 != 0; i++) {
            binaryNumberBuilder.append("0");
        }
        binaryNumber = binaryNumberBuilder.toString();
        char[] binaryNumberArray = binaryNumber.toCharArray();
        for (int i = 0; i < binaryNumberArray.length; i++) {
            if (binaryNumberArray[i] == '0' || binaryNumberArray[i] == '1') {

            } else {
                return hexNumber;
            }
        }
        String[] generalBinaryArray = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
        char[] hexArray = HEX.toCharArray();
        for (int i = 0; i < binaryNumber.length() / 4; i++) {
            String partOfBinaryNumber = binaryNumber.substring(i * 4, (i * 4) + 4);
            int vaultNumber = Arrays.binarySearch(generalBinaryArray, partOfBinaryNumber);
            hexNumber += hexArray[Math.abs(vaultNumber)];
        }
        return hexNumber;
    }

    public static String toBinary(String hexNumber) {
        //напишіть тут ваш код
        String binaryNumber = "";
        if (hexNumber == null) {
            return "";
        }
        char[] hexNumberArray = hexNumber.toCharArray();
        final char[] generalHexNumberArray = HEX.toCharArray();
        for (int i = 0; i < hexNumber.length(); i++) {
            int check = Arrays.binarySearch(generalHexNumberArray, hexNumberArray[i]);
            if (check < 0) {
                return binaryNumber;
            }
        }
        for (int i = 0; i < hexNumberArray.length; i++) {
            final String[] generalBinaryArray = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
            int vaultNumber = Arrays.binarySearch(generalHexNumberArray, hexNumberArray[i]);
            binaryNumber += generalBinaryArray[vaultNumber];
        }
        return binaryNumber;
    }
}
