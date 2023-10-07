package ua.javarush.task.pro.task05.task0509;

/* 
Таблиця множення
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        //напишіть тут ваш код
        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {
            for (int j = 0; j < MULTIPLICATION_TABLE[i].length; j++) {
//                MULTIPLICATION_TABLE[i][j] = j;
                int calculate = (i+1) * (j+1);
                MULTIPLICATION_TABLE[i][j] = calculate;
                System.out.print(calculate + " ");
            }
            System.out.println();
        }
    }
}
