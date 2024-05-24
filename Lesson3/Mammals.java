package Aston.Lesson3;

import java.util.Objects;

public class Mammals extends Animal implements Spine {
    // Предположим, у млекопитающих есть вес
    private double weight;

    public Mammals(String name, int age) {
        super(name, age);
        this.weight = weight;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + Objects.hash(weight);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Mammals other = (Mammals) obj;
        return Double.compare(this.weight, other.weight) == 0;
    }
}
