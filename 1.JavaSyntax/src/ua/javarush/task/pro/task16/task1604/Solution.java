package ua.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
День тижня твого народження
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(2002, Calendar.FEBRUARY, 15);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        //напишіть тут ваш код
        String s = "";

        switch (calendar.get(Calendar.DAY_OF_WEEK)) {
            case 1:
                s = ("Неділя");
                break;
            case 2:
                s = ("Понеділок");
                break;
            case 3:
                s =("Вівторок");
                break;
            case 4:
                s =("Середа");
                break;
            case 5:
                s =("Четвер");
                break;
            case 6:
                s =("П'ятниця");
                break;
            case 7:
                s =("Субота");
                break;

        }
        return s;
    }
}
