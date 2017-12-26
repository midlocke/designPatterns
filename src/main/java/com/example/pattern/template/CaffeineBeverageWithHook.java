package com.example.pattern.template;

/**
 * Created by lichao on 2017/12/19.
 */
public abstract class CaffeineBeverageWithHook {

    public void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }
    }

    void boilWater(){
        System.out.println("boiling water!");
    }

    abstract void brew();

    void pourInCup(){
        System.out.println("pouring in cup!");
    }

    abstract void addCondiments();

    boolean customerWantsCondiments(){
        return true;
    }
}
