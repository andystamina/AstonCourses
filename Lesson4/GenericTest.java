package Aston.Lesson4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericTest {
    public static class MyCollection<T> {
        private List<T> elements;

        public MyCollection(Collection<? extends T> otherCollection) {
            this.elements = new ArrayList<>(otherCollection);
        }
}
