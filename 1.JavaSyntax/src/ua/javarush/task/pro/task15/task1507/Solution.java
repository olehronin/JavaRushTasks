package ua.javarush.task.pro.task15.task1507;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаємо не всіх
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишіть тут ваш код

        Scanner input = new Scanner(System.in);
        String absolutePath = input.nextLine();
        String fileName = Paths.get(String.valueOf(absolutePath)).getFileName().toString();
//        System.out.println(fileName);

        List<String> readAllLines = Files.readAllLines(Paths.get(absolutePath));
        for (int i = 0; i < readAllLines.size(); i++) {
            if (i % 2 == 0) {
                System.out.println(readAllLines.get(i));
            }
        }


    }
}

