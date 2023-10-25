package ua.javarush.task.pro.task12.task1206;

/* 
Аналіз рядків
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Гадаю, це буде нова фіча." +
                "Тільки нікому не кажіть, що вона виникла випадково.";

        System.out.println("Кількість цифр у рядку : " + countDigits(string));
        System.out.println("Кількість літер у рядку : " + countLetters(string));
        System.out.println("Кількість пробілів у рядку : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        //напишіть тут ваш код
        int count = 0;
        char[] strings = string.toCharArray();
        for (int i = 0; i < strings.length; i++) {
            if (Character.isDigit(strings[i])) {
                count++;
            }
        }
        return count;
    }

    public static int countLetters(String string) {
        //напишіть тут ваш код

        int count = 0;
        char[] strings = string.toCharArray();
        for (int i = 0; i < strings.length; i++) {
            if (Character.isLetter(strings[i])) {
                count++;
            }
        }
        return count;
    }

    public static int countSpaces(String string) {
        //напишіть тут ваш код
        int count = 0;
        char[] strings = string.toCharArray();
        for (int i = 0; i < strings.length; i++) {
            if (Character.isSpaceChar(strings[i])) {
                count++;
            }

        }
        return count;
    }
}
