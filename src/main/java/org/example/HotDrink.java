package org.example;

public class HotDrink extends Product {
    private int temp;
    private int volume;
    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", price=" + price + '\'' +
                ", volume=" + volume + '\'' +
                ", temp=" + temp +
                '}';
    }

    public HotDrink(String name, int price, int volume, int temp){
        super.name = name;
        super.price = price;
        this.volume = volume;
        this.temp = temp;
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
    public int getPrice() {
        return super.price;
    }

    @Override
    public void setPrice(int price) {
        super.price = price;

    }
}
