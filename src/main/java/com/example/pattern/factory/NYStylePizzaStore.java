package com.example.pattern.factory;

/**
 * Created by lichao on 2017/12/12.
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if("cheese".equals(type)){
            return new NYStyleCheesePizza();
        }else if("veggie".equals(type)){
            return new NYStyleVeggiePizza();
        }
        return null;
    }
}
