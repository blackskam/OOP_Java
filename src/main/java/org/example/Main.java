package org.example;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        WaterVendingMachine wvm = new WaterVendingMachine();
        Product bonAqua = new Water("Bonaqua", 40);
        Product redKey = new Water("RedKey", 50);
        LinkedList<Product> l = new LinkedList<>();
        l.add(bonAqua);
        l.add(redKey);
        wvm.putProduct(l);
        System.out.println(wvm.getProduct());
        System.out.println(wvm.getProduct());
        System.out.println(wvm.getProduct());
        HotDrinkVM hdvm = new HotDrinkVM();
        Product coffee = new HotDrink("американо", 70, 100, 80);
        Product tea = new HotDrink("чай", 30, 200, 90);
        LinkedList<Product> hd = new LinkedList<>();
        hd.add(coffee);
        hd.add(tea);
        hdvm.putProduct(hd);
        System.out.println(hdvm.getProduct());
        System.out.println(hdvm.getProduct());
        System.out.println(hdvm.getProduct());
    }
}