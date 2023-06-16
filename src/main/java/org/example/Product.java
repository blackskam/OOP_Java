package org.example;

public abstract class Product {
    protected String name;
    protected Long price;

    public abstract String getName();

    public abstract void setName(String name);

    public abstract Long getPrice();

    public abstract void setPrice(Long price);
}
