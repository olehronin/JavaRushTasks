package ua.javarush.task.pro.task12.task1209;

import java.util.ArrayList;

/* 
Бухгалтерія
*/

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвінно");
        waitingEmployees.add("Гунігерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Ніфрод");
        waitingEmployees.add("Альбіуф");
        waitingEmployees.add("Іногрім");
        waitingEmployees.add("Фріле");
    }

    public static void main(String[] args) {
        initEmployees();
        paySalary("Фріле");
        System.out.println(waitingEmployees.toString());
        System.out.println(alreadyGotSalaryEmployees.toString());

    }

    public static void paySalary(String name) {
        //напишіть тут ваш код
        if (waitingEmployees.contains(name)) {
            if (name == null) {
            } else {
                alreadyGotSalaryEmployees.add(name);
                waitingEmployees.set(waitingEmployees.indexOf(name), null);
            }

        }else {
            System.out.println("Нема такого");
        }
    }
}
