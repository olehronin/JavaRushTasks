package ua.javarush.task.pro.task13.task1313;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        //напишіть тут ваш код
        if (first.next == null) {
            Node newObject = new Node();
            newObject.prev = first;
            newObject.value = value;
            newObject.next = last;
            first.next = newObject;
            last.prev = newObject;
        } else {
            Node newObject = new Node();
            newObject.value = value;
            newObject.next = last;
            newObject.prev = last.prev;
            newObject.prev.next = newObject;
            last.prev = newObject;

        }

    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}