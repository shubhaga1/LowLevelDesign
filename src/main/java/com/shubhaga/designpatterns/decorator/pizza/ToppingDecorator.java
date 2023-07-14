package com.shubhaga.designpatterns.decorator.pizza;

public abstract class ToppingDecorator extends BasePizza {

}

class ExtraCheese extends ToppingDecorator{
    BasePizza basePizza;

    public ExtraCheese(){}

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 30;
    }
}

class Mushroom extends ToppingDecorator{
    BasePizza basePizza;

    public Mushroom (BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 20;
    }
}