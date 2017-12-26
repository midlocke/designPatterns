package com.example.pattern.singleton;

/**
 * 延迟实例化，当需要的时候才创建
 */
public class LazySingleton {

    private static LazySingleton lazySingleton;

    private LazySingleton(){}

    public LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
