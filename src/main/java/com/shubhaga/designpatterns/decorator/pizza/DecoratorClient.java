package com.shubhaga.designpatterns.decorator.pizza;

public class DecoratorClient {
    public static void main(String[] args) {
        BasePizza basePizza = new VegPizza(new ExtraCheese());
        System.out.println(basePizza.cost());
    }
}
