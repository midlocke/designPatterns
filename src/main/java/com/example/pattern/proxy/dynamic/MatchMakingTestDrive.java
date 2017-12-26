package com.example.pattern.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * 动态代理模式：代理类是在运行过程中创建的，也叫保护代理
 * 代理模式和装饰器模式的区别：
 * 代理模式中，代理类对被代理的对象有控制权，决定其执行或者不执行。
 * 而装饰模式中，装饰类对代理对象没有控制权，只能为其增加一层装饰，以加强被装饰对象的功能，仅此而已。
 */
public class MatchMakingTestDrive {
    public static void main(String[] args) {
        PersonBean person = new PersonBeanImpl();
        person.setGender("male");
        person.setName("richard");
        person.setInterests("reading");
        person.setHotOrNotRating(5);
        System.out.println("has made personBean!");

        PersonBean ownerPerson = getOwnerProxy(person);
        try {
            ownerPerson.setHotOrNotRating(1);
        } catch (Exception e) {
            System.out.println("owner can't setHotOrNotRating");
        }
        ownerPerson.setInterests("science");

        PersonBean nonOwnerPerson = getNonOwnerProxy(person);
        try {
            nonOwnerPerson.setInterests("write");
        } catch (Exception e) {
            System.out.println("nonOwner can't setInterests");
        }
        nonOwnerPerson.setHotOrNotRating(10);

    }

    private static PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    private static PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean)Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }
}
