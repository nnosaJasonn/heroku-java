package com.example;

public class Product 
{
    public String name;
    public Double price;
    public Double weight;

    public String getName()
    {
        return name;
    }

    public Double getPrice()
    {
        return price;
    }

    public Double getWeight()
    {
        return weight;
    }

    Product(String name, Double price, Double weight)
    {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
}
