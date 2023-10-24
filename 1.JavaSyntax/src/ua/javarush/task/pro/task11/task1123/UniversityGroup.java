package ua.javarush.task.pro.task11.task1123;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* 
Відчуй себе деканом
*/

public class UniversityGroup {
    public List<String> students;

    public UniversityGroup() {
        students = new ArrayList<>();
        students.add("Сергій Фрединський");
        students.add("Віталій Правдивий");
        students.add("Максим Козименко");
        students.add("Наталія Андрющенко");
        students.add("Іра Величенко");
        students.add("Микола Соболєв");
        students.add("Сніжана Слободенюк");
    }

    public void exclude(String excludedStudent) {
        Iterator<String> iterator = students.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(excludedStudent)) {
                iterator.remove();

            }
        }
    }

    public static void main(String[] args) {
        UniversityGroup universityGroup = new UniversityGroup();
        universityGroup.exclude("Віталій Правдивий");
        System.out.println(universityGroup.students.toString());
    }
}