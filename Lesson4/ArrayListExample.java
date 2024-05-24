package Aston.Lesson4;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> stringlist = new ArrayList<>(4); //[][][][]
        stringlist.add("One"); // ["One"][][][]
        stringlist.add("Two"); // ["One"]["Two"][][]
        stringlist.add("Three"); // ["One"]["Two"]["Three"][]
        stringlist.add("Four"); // ["One"]["Two"]["Three"]["Four"]
        stringlist.add(0,"begin"); // ["begin"]["One"]["Two"]["Three"]["Four"][][][][][]
        stringlist.add(4,"middle"); // ["string"]["One"]["Two"]["Three"]["middle"]["Four"][][][][]
        stringlist.add("end"); // ["string"]["One"]["Two"]["Three"]["middle"]["Four"][][][][]
        stringlist.remove(3); // ["string"]["One"]["Two"]["middle"]["Four"][][][][][]



    }
}
