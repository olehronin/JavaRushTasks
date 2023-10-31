package ua.javarush.task.pro.task13.task1316;

public class Solution {

    public static void main(String[] args) {
        //напишіть тут ваш код

        JavarushQuest[] array = JavarushQuest.values();

        for (JavarushQuest st :array) {
            System.out.println(st.ordinal());
        }


    }
}
