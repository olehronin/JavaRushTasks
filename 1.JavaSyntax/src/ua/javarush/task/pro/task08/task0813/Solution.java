package ua.javarush.task.pro.task08.task0813;

/* 
Степінь двійки
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getPowerOfTwo(3));
    }

    public static int getPowerOfTwo(int power) {
        int result =  2 << power - 1;

        return result;
    }
}
