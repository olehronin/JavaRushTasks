package ua.javarush.task.pro.task14.task1410;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

/* 
Обгортання винятків
*/

public class Solution {

    public static void main(String[] args) {
        copyFile("book.txt", "book_final_copy.txt");
        copyFile("book_final_copy.txt", "book_last_copy.txt");
    }

    static void copyFile(String sourceFile, String destinationFile) {
        //напишіть тут ваш код
        try {
        FileUtils.readFile(sourceFile);
        FileUtils.writeFile(destinationFile);

        }catch (FileNotFoundException | FileSystemException e1){
            throw new RuntimeException(e1);
        }

    }
}
