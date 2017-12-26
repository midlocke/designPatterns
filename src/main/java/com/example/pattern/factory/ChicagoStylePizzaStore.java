package com.example.pattern.factory;

/**
 * Created by lichao on 2017/12/12.
 */
public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if("cheese".equals(type)){
            return new ChicagoStyleCheesePizza();
        }else if("veggie".equals(type)){
            return new ChicagoStyleVeggiePizza();
        }
        return null;
    }
}
