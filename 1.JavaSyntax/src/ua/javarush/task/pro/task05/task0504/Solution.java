package ua.javarush.task.pro.task05.task0504;

/* 
Об'єднуємо масиви
*/


public class Solution {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        //напишіть тут ваш код

        resultArray = new int[firstArray.length + secondArray.length];
        int count = 0;

        for (int j = 0; j < firstArray.length ; j++) {
            resultArray[count] = firstArray[j];
            count++;
        }
        for (int j = 0; j < secondArray.length ; j++) {
            resultArray[count] = secondArray[j];
            count++;
        }


        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");

        }
    }
}
