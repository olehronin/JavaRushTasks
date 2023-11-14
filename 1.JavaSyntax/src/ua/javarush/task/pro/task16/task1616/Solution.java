package ua.javarush.task.pro.task16.task1616;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAccessor;
import java.util.TreeSet;

/* 
Тренування «Часові зони»
*/

public class Solution {

    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        //напишіть тут ваш код
//        TreeSet<String> treeSet = new TreeSet<>(ZoneId.getAvailableZoneIds());
////        for (String s : treeSet) {
////            System.out.println(s);
////        }
        return new TreeSet<>(ZoneId.getAvailableZoneIds());
    }

    static ZonedDateTime getBeijingDateTime() {
        //напишіть тут ваш код

        return ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
    }
}
