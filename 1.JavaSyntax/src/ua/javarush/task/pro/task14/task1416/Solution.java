package ua.javarush.task.pro.task14.task1416;

/* 
Трасування стека
*/

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        try {
            dangerousMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void dangerousMethod() throws Exception {
        throw new Exception("Mu-ha-ha!");
    }
}
