package ua.javarush.task.pro.task15.task1506;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишіть тут ваш код
        Scanner input = new Scanner(System.in);
        String pathFirst = input.nextLine();
        List<String> allChars = Files.readAllLines(Paths.get(pathFirst));
        if (allChars.get(0).contains(",") || allChars.get(0).contains(".") || allChars.get(0).contains(" ")) {
            allChars.set(0, allChars.get(0).replace(",", ""));
            allChars.set(0, allChars.get(0).replace(".", ""));
            allChars.set(0, allChars.get(0).replace(" ", ""));
        }


        String result = String.join("[", allChars);

        System.out.println(result);


    }
}

