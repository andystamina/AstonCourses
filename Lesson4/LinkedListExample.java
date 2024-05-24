package Aston.Lesson4;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> stringlist = new LinkedList<>(); // {header}
        stringlist.add("first"); // {header} -> <- [first]
        stringlist.add("second"); // {header} -> <- [first] -> <- [second]
        stringlist.add("third"); // {header} -> <- [first] -> <- [second] -> <- [third]
        stringlist.add(1,"string"); // {header} -> <- [first] -> <- [string] -> <- [second] -> <- [third]
        stringlist.remove(2); // {header} -> <- [first] -> <- [string] -> <- [third]

    }
}
