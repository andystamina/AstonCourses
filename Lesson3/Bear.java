package Aston.Lesson3;

import java.util.Objects;

public class Bear extends Mammals implements Fur {

    // Предположим, у медведя есть еще цвет шерсти
    private String furColor;

    public Bear(String name, int age, double weight, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    @Override
    public int hashCode() {
        return 31 * super.hashCode() + Objects.hash(furColor);
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Bear other = (Bear) obj;
        return Objects.equals(this.furColor, other.furColor);
    }

}
