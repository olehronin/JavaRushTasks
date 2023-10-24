package ua.javarush.task.pro.task11.task1109;

/* 
Об'єкти внутрішніх і вкладених класів
*/

public class Outer {
   static int i = 0;

    public Outer(int i) {
        this.i = i;
    }

    class Inner {
        Inner() {
            System.out.println("Створення об'єкта внутрішнього класу");
        }
        public void print(int a){
            System.out.println(a+i);
        }
    }

    static class Nested {
        Nested() {
            System.out.println("Створення об'єкта вкладеного класу");
        }
        public void print(int a){
            System.out.println(i);
        }
    }
}
