package ua.javarush.task.pro.task10.task1005;

/* 
Багатосерійний підприємець
*/

public class Building {
    private String type;

    public void initialize(String type) {
        this.type = type;
    }

    //напишіть тут ваш код

    public static void main(String[] args) {
        Building building = new Building();
        building.initialize("Барбершоп");
    }
}
