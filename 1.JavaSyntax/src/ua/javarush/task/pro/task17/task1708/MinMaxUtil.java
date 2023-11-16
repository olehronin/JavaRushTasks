package ua.javarush.task.pro.task17.task1708;

/* 
Мінімальне й максимальне
*/

public class MinMaxUtil {
    ;
    //напишіть тут ваш код
    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static int min(int a, int b, int c) {
        return min(c, min(a, b));
    }

    public static int min(int a, int b, int c, int d) {
        return min(d, min(a, b, c));
    }

    public static int min(int a, int b, int c, int d, int e) {
        return min(e, min(a, b, c, d));
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int max(int a, int b, int c) {
        return max(c, max(a, b));
    }

    public static int max(int a, int b, int c, int d) {
        return max(d, max(a, b, c));
    }

    public static int min(int n, int m, int h, int g, int k) {
        int value = Math.min(n, m) < Math.min(h, g) ? Math.min(n, m) : Math.min(h, g);
        return value < k ? value : k;
    }
}
