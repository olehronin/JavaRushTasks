package ua.javarush.task.pro.task05.task0519;

import java.util.Arrays;

/* 
Чи є тут хтось?
*/

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        //напишіть тут ваш код
        int[] arrayCopy = Arrays.copyOf(array, array.length );
        Arrays.sort(arrayCopy);
        if (Arrays.binarySearch(arrayCopy, element) >= 0) {
//            numb = array[Arrays.binarySearch(array, element)];

            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
