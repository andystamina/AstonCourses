package Aston.Lesson3;

import java.util.Objects;

public class Whale extends Mammals implements Water {

    // Предположим, у кита есть еще виды
    private String species;

    public Whale(String name, int age, String species) {
        super(name, age);
        this.species = species;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + Objects.hash(species);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Whale other = (Whale) obj;
        return Objects.equals(this.species, other.species);
    }
}
