package ua.javarush.task.pro.task05.task0506;

import java.util.Arrays;
import java.util.Scanner;

/* 
Мінімальне з N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код
        Scanner input = new Scanner(System.in);
        int numberN = 0;
        if (input.hasNextInt()) {
            numberN = input.nextInt();
        }
        if(numberN > 0){
            array = new int[numberN];
            for (int i = 0; i < numberN; i++) {
                array[i] = input.nextInt();
            }
            Arrays.sort(array);
            System.out.println(array[0]);
        }
    }
}
