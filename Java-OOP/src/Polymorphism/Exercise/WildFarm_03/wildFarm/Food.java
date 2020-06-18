package Polymorphism.Exercise.WildFarm_03.wildFarm;

public abstract class Food {
    private Integer quantity = 0;

    public Food(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return this.quantity;
    }
}
