package ua.javarush.task.pro.task13.task1319;

/* 
Місяці в порах року
*/

import java.util.ArrayList;
import java.util.Collections;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    //напишіть тут ваш код

    public static Month[] getWinterMonths() {
        Month[] monthArray = new Month[3];
        monthArray[0] = Month.DECEMBER;
        monthArray[1] = Month.JANUARY;
        monthArray[2] = Month.FEBRUARY;
        return monthArray;
    }

    public static Month[] getSpringMonths() {
        Month[] monthArray = new Month[3];
        monthArray[0] = Month.MARCH;
        monthArray[1] = Month.APRIL;
        monthArray[2] = Month.MAY;
        return monthArray;
    }

    public static Month[] getSummerMonths() {
        Month[] monthArray = new Month[3];
        monthArray[0] = Month.JUNE;
        monthArray[1] = Month.JULY;
        monthArray[2] = Month.AUGUST;
        return monthArray;
    }

    public static Month[] getAutumnMonths() {
        Month[] monthArray = new Month[3];
        monthArray[0] = Month.SEPTEMBER;
        monthArray[1] = Month.OCTOBER;
        monthArray[2] = Month.NOVEMBER;
        return monthArray;
    }

}
