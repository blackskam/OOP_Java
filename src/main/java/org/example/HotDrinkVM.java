package org.example;

import java.util.LinkedList;

public class HotDrinkVM implements VendingMachine{
    private LinkedList<Product> hotdrinks;

    @Override
    public void putProduct(LinkedList<Product> item) {
        this.hotdrinks = item;

    }

    @Override
    public Product getProduct() {
       return this.hotdrinks.pollLast();
    }
}
