package ua.javarush.task.pro.task11.task1109;

/* 
Об'єкти внутрішніх і вкладених класів
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
        Outer outer = new Outer(1);
        Outer.Inner inner1 = outer.new Inner();
        Outer.Inner inner2 = outer.new Inner();

        Outer outer1 = new Outer(2);
        Outer.Inner inner13 = outer1.new Inner();

    inner1.print(5);
    inner2.print(7);
    inner13.print(25);

//        Outer.Inner inner = new Outer.Inner();
        Outer.Nested nested = new Outer.Nested();
    }
}
