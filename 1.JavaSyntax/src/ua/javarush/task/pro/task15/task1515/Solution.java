package ua.javarush.task.pro.task15.task1515;

import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Абсолютний шлях
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (Path.of(str).isAbsolute()) {
            System.out.println(str);
        } else {
            System.out.println(Path.of(str).toAbsolutePath());
        }

    }
}

