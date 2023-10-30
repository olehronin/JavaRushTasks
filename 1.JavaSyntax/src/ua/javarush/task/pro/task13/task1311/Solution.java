package ua.javarush.task.pro.task13.task1311;

import java.util.HashMap;
import java.util.Map;

/* 
Успішність студентів-3
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        printStudentsInfo();
    }

    public static void addStudents() {
        grades.put("Кесарчук Олег", 4.3d);
        grades.put("Шульга Микола", 4.1d);
        grades.put("Колос Василь", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }

    public static void printStudentsInfo() {
        //напишіть тут ваш код

        for (var map : grades.entrySet()){
            String name = map.getKey();
            double gradeStudent = map.getValue();
            System.out.println(name + " : " + gradeStudent);
        }
    }
}
