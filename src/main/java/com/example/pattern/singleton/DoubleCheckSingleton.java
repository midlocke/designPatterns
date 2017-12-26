package com.example.pattern.singleton;

/**
 * 确保一个类只有一个实例，并提供全局访问点
 * 封装变化
 * 多用组合，少用继承
 * 针对接口编程，不针对实现编程
 * 为交互对象之间的松耦合设计而努力
 * 类应该对拓展开放，对修改关闭
 * 依赖抽象，不要依赖具体类
 */
public class DoubleCheckSingleton {

    private volatile static DoubleCheckSingleton doubleCheckSingleton = null;

    private DoubleCheckSingleton(){}

    public DoubleCheckSingleton getInstatnce(){
        if(doubleCheckSingleton == null) synchronized (DoubleCheckSingleton.class) {
            doubleCheckSingleton = new DoubleCheckSingleton();
        }

        return doubleCheckSingleton;
    }
}
