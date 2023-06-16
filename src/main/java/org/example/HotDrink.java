package org.example;



public class HotDrink extends Product implements Comparable<HotDrink> {
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

    public HotDrink(String name, Long price, int volume, int temp){
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
    public Long getPrice() {
        return super.price;
    }

    @Override
    public void setPrice(Long price) {
        super.price = price;

    }

    @Override
    public int compareTo(HotDrink x) {
        if ( x > this.x ) {
            return -1;
        } else if ( x < this.x ) {
            return 1;
        } else return 0;
    }
}
