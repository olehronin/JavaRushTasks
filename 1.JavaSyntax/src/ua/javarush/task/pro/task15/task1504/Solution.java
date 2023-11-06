package ua.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Переплутані байти
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишіть тут ваш код

        Scanner input = new Scanner(System.in);
        String pathFirst = input.nextLine();
        String pathSecond = input.nextLine();


        InputStream inputStream = Files.newInputStream(Paths.get(String.valueOf(pathFirst)));
        OutputStream outputStream = Files.newOutputStream(Paths.get(String.valueOf(pathSecond)));

        byte[] bytes = inputStream.readAllBytes();
        for (int i = 0; i + 1 < bytes.length; i++) {
            byte first = bytes[i];
            bytes[i] = bytes[i + 1];
            bytes[i + 1] = first;
            i++;
        }

        outputStream.write(bytes);
        inputStream.close();
        outputStream.close();

    }
}

