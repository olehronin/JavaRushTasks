package ua.javarush.task.pro.task12.task1213;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Сонячна система
*/

public class Solution {
    public static ArrayList<String> planets = new ArrayList<>();

    public static void main(String[] args) {
        addPlanets();
        print();
        createNewPlanet("Зоря Смерті");
        print();
    }

    public static void createNewPlanet(String planetName) {
        //напишіть тут ваш код
        String[] copyOf = (String[]) planets.subList(3,planets.size()).toArray(new String[planets.size()]);
        planets.removeAll(planets.subList(3,planets.size()));
        planets.add(planetName);
        for (int i = 0; i < copyOf.length ; i++) {
            if(copyOf[i] != null){
                planets.add(copyOf[i]);
            }
        }
//        System.out.println(Arrays.toString(copyOf));
    }

    public static void addPlanets() {
        planets.add("Меркурій");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпітер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
    }

    public static void print() {
        for (int i = 0; i < planets.size(); i++) {
            System.out.println(String.format("%s — %d-а (-я) планета від Сонця", planets.get(i), (i + 1)));
        }
        System.out.println();
    }
}
