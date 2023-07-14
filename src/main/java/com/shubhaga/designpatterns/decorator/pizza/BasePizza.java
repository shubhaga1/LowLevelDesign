package com.shubhaga.designpatterns.decorator.pizza;

public abstract class BasePizza {
    public abstract int cost();
}

class FarmPizza extends BasePizza{

    @Override
    public int cost() {
        return 200;
    }
}
class VegPizza extends BasePizza{

    public VegPizza(BasePizza basePizza) {
        super();
    }

    @Override
    public int cost() {
        return 300;
    }
}

class MargheritaPizza extends BasePizza{

    @Override
    public int cost() {
        return 400;
    }
}
