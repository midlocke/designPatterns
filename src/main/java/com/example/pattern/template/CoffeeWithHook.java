package com.example.pattern.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by lichao on 2017/12/20.
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk!");
    }

    public boolean customerWantsCondiments(){
        String answer = getUserInput();

        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput(){
        String answer = null;

        System.out.println("Would you like milk and sugar with your coffee(y/n)?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{
            answer = in.readLine();
        }catch (IOException e){
            System.err.println("IO error trying to read your answer!");
        }

        if(answer == null){
            return "no";
        }
        return answer;
    }
}
