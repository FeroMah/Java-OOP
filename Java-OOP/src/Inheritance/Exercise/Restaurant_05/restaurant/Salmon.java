package Inheritance.Exercise.Restaurant_05.restaurant;

import java.math.BigDecimal;

public class Salmon extends MainDish {
    private final static double SALMON_GRAMS = 22;

    public Salmon(String name
            , BigDecimal price) {
        super(name, price, SALMON_GRAMS);

    }
}
