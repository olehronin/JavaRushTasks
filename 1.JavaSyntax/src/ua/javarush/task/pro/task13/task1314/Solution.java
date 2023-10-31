package ua.javarush.task.pro.task13.task1314;

/* 
StringLinkedList, частина 2
*/

import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        StringLinkedList stringLinkedList = new StringLinkedList();
        stringLinkedList.add("1");
        stringLinkedList.add("2");
        stringLinkedList.add("3");
        stringLinkedList.add("4");
        stringLinkedList.add("5");
        stringLinkedList.add("6");
        stringLinkedList.add("7");
        stringLinkedList.add("8");
        stringLinkedList.add("9");
        System.out.println(stringLinkedList.get(7)); // 5
    }
}
