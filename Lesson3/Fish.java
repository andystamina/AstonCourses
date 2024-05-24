package Aston.Lesson3;

import java.util.Objects;

public class Fish extends Animal implements Water {

    // Предположим, у рыбы есть еще тип воды
    private String waterType;

    public Fish(String name, int age, String waterType) {
        super(name, age);
        this.waterType = waterType;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + Objects.hash(waterType);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Fish other = (Fish) obj;
        return Objects.equals(this.waterType, other.waterType);
    }
}
