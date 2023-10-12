package ua.javarush.task.pro.task08.task0803;

import java.util.Arrays;
import java.util.Scanner;

/* 
Мінімальний елемент масиву
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        //напишіть тут ваш код
        int result = 0;
        int tempMinNumb;
        int tempMinNumb2 = 0;

        for (int i = 0; i < ints.length; i++) {
            if (i == ints.length - 1) {
                result = Math.min(ints[i], tempMinNumb2);
            } else {
                result = Math.min(ints[i], ints[i + 1]);
            }
            tempMinNumb = result;

            if (tempMinNumb2 == 0) {
                tempMinNumb2 = tempMinNumb;

            } else if (tempMinNumb < tempMinNumb2) {
                tempMinNumb2 = tempMinNumb;
            }

        }
        return tempMinNumb2;
    }

    public static int[] getArrayOfTenElements() {
        //напишіть тут ваш код
        int[] tempArray = new int[10];
        for (int i = 0; i < tempArray.length; i++) {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            tempArray[i] = number;

        }


        return tempArray;
    }
}
