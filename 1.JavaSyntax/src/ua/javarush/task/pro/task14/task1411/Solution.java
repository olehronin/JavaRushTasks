package ua.javarush.task.pro.task14.task1411;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

/* 
Розпакування винятків
*/

public class Solution {

    public static final String FAILED_TO_READ = "Не вдалося прочитати файл.";
    public static final String FAILED_TO_WRITE = "Не вдалося записати у файл.";

    public static FileManager fileManager = new FileManager();

    public static void main(String[] args) {
        try {
            fileManager.copyFile("book.txt", "book_final_copy.txt");
            fileManager.copyFile("book_final_copy.txt", "book_last_copy.txt");
            //напишіть тут ваш код

        } catch (RuntimeException runt) {
            Throwable throwable = runt.getCause();
            if (throwable instanceof FileNotFoundException) {
                Exception exp = (Exception) throwable;
                System.out.println(FAILED_TO_READ);

            } else if (throwable instanceof FileSystemException) {
                Exception exp = (Exception) throwable;
                System.out.println(FAILED_TO_WRITE);
            }
        }
    }
}
