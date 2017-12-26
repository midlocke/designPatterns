package com.example.pattern.singleton;

/**
 * JVM在加载这个类的时候就会初始化这个类的实例
 */
public class EagerlySingleton {

    private static EagerlySingleton eagerlySingleton = new EagerlySingleton();

    private EagerlySingleton(){}

    public EagerlySingleton getInstance(){
        return eagerlySingleton;
    }
}
