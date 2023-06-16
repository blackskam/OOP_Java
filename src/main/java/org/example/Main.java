package org.example;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        WaterVendingMachine wvm = new WaterVendingMachine();
        Product bonAqua = new Water("Bonaqua", 40);
        Product redKey = new Water("RedKey", 50);
        LinkedList<Product> l = new LinkedList<>();
        l.add(bonAqua);
        l.add(redKey);
        wvm.putProduct(l);

        HotDrinkVM hdvm = new HotDrinkVM();
        Product coffee = new HotDrink("американо", 70, 100, 80);
        Product tea = new HotDrink("чай", 30, 200, 90);
        Product coffe2 = new HotDrink("капучино", 300, 200, 85);
        LinkedList<Product> hd = new LinkedList<>();
        hd.add(coffee);
        hd.add(tea);
        hd.add(coffe2);
        hdvm.putProduct(hd);
        System.out.println(hdvm.getProduct());
        System.out.println(hdvm.getProduct());
        System.out.println(hdvm.getProduct());
        List<HotDrinkVM> list = hdvm.getProduct().getPrice().stream().sorted()
                .collect(Collectors.toList());
        System.out.println(list.toString());
    }
}