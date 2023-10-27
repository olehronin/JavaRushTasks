package ua.javarush.task.pro.task12.task1212;

/* 
Створюємо свій список
*/

import java.util.Arrays;

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        double numb = 1.5;
        String[] tempArray = Arrays.copyOf(elements, capacity);
        capacity = (int) (capacity * numb);
        elements = new String[capacity];
        elements = Arrays.copyOf(tempArray, capacity);
    }

}
