package ua.javarush.task.pro.task08.task0809;

/* 
Counter

*/
public class Solution {

    public static void main(String[] args) throws InterruptedException {
        printNumbers();
    }

    public static void printNumbers() throws InterruptedException {
        //напишіть тут ваш код
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
            Thread.sleep(1, 300000);
        }
        System.out.println(10);
    }
}
