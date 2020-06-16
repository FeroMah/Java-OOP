package Encapsulation.Exercise.ShoppingSpree_03.shoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
       this.setName(name);
       this.setMoney(money);
       this.products= new ArrayList<>();
    }

    public void buyProduct(Product product) {
        if (product.getCost() <= this.money){
            this.products.add(product);
        }else {
            throw new IllegalArgumentException(String.format("%s can't afford %s",this.name,product.getName()));
        }
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.equalsIgnoreCase("")|| name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        } else {
            this.name = name;
        }
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    @Override
    public String toString() {
        if (this.products.isEmpty()){
            return getName()+" - "+ "Nothing bought";
        }
        return getName()+" - "+ this.products.toString().replaceAll("[\\[\\]]","");
    }
}
