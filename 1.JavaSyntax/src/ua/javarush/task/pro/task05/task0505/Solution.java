package ua.javarush.task.pro.task05.task0505;

import java.util.Arrays;
import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner input = new Scanner(System.in);
        boolean isFlag = true;
        while (isFlag){
            if (input.hasNextInt()) {
                int number = input.nextInt();
                if (number > 0) {
                    int[] moreThanZero = new int[number];
                    for (int i = 0; i < number; i++) {
                        moreThanZero[i] = input.nextInt();
                    }
                    if (number % 2 == 0){
                        for (int i = moreThanZero.length ; i > 0 ; i--) {
                            System.out.println(moreThanZero[i - 1]);
                        }

                    }else {
                        for (int i = 0; i < moreThanZero.length; i++) {
                            System.out.println(moreThanZero[i]);
                        }

                    }
                    isFlag = false;
                }

            }

        }
    }
}
