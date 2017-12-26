package com.example.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.security.InvalidParameterException;

/**
 * Created by lichao on 2017/12/21.
 */
class OwnerInvocationHandler implements InvocationHandler {
    private PersonBean personBean;

    OwnerInvocationHandler(PersonBean personBean){
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try{
            if(method.getName().startsWith("get")){
                return method.invoke(personBean,args);
            }else if(method.getName().equals("setHotOrNotRating")){
                throw new IllegalAccessException();
            }else if(method.getName().startsWith("set")){
                return method.invoke(personBean,args);
            }
        }catch (InvalidParameterException e){
            e.printStackTrace();
        }
        return null;
    }
}
