package org.example;

public class Water extends Product {

    @Override
    public String toString() {
        return "Water{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Water(String name, int price){
        super.name = name;
        super.price = price;
    }
    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public Long getPrice() {
        return super.price;
    }

    @Override
    public void setPrice(int price) {
        super.price = price;

    }
}
