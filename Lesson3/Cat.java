package Aston.Lesson3;

import java.util.Objects;

public class Cat extends Mammals implements Fur {
    // Предположим, у кошки есть еще порода
    private String breed;

    public Cat(String name, int age, double weight, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + Objects.hash(breed);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Cat other = (Cat) obj;
        return Objects.equals(this.breed, other.breed);
    }

}
