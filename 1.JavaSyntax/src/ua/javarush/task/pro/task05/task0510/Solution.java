package ua.javarush.task.pro.task05.task0510;

/* 
Трикутний масив
*/


public class Solution {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        //напишіть тут ваш код
        int iterationNumb = 0;
        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i + 1];

            for (int j = 0 ; j < result[i].length; j++) {
                result[i][j] = i+j;
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }


    }
}
