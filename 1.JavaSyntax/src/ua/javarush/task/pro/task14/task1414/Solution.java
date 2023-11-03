package ua.javarush.task.pro.task14.task1414;

/* 
Готуємо коктейлі
*/

public class Solution {

    public static final String OUTPUT_FORMAT = "Метод %s викликано з рядка %d класу %s у файлі %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        //напишіть тут ваш код
        String nameMethod = null;
        int numbString = 0;
        String nameClass = null;
        String nameFile = null;

        for (StackTraceElement result : stackTrace) {
            nameMethod = result.getMethodName();
            numbString = result.getLineNumber();
            nameClass = result.getClassName();
            nameFile = result.getFileName();
            System.out.printf(OUTPUT_FORMAT, nameMethod, numbString, nameClass, nameFile);
        }

    }

    static void makeScrewdriver() {
        addJuice();
    }

    static void addJuice() {
        addVodka();
    }

    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}
