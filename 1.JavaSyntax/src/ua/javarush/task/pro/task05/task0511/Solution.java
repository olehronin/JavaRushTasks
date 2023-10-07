package ua.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Створюємо двовимірний масив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишіть тут ваш код
        Scanner input = new Scanner(System.in);
        if(input.hasNextInt()){
            int numberOfLines = input.nextInt();
            if(numberOfLines > 0){
                multiArray = new int[numberOfLines][];
                for (int i = 0; i < numberOfLines; i++) {
                    int numberOfColumns = input.nextInt();
                    multiArray[i] = new int[numberOfColumns];
                }
            }else {
                System.out.println("Число має бути більшим за 0");
                numberOfLines = input.nextInt();
            }




        }else {
            System.out.println("Потрібно ввести число.");
        }

    }
}
