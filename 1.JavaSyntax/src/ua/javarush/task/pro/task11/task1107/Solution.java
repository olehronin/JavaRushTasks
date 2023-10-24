package ua.javarush.task.pro.task11.task1107;

import java.util.ArrayList;

public class Solution {
    private static ArrayList<Point> points;

    public static class Point {
        int x;
        int y;

        public static void main(String[] args) {
            Point point = new Point();
            point.x = 100;
            point.y = 200;

            // працюватиме
            points = new ArrayList<Point>();
            points.add(point);
        }
    }
}