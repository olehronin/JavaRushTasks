package ua.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успішність студентів
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();



    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("erg",8.6);
        grades.put("rherh",78.5);
        grades.put("34j3",246.7);
        grades.put("liuuyi",7.6);
        grades.put("o5",8.2);



        //напишіть тут ваш код
    }
}
