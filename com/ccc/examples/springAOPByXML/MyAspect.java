package ccc.examples.springAOPByXML;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

public class MyAspect {

    public void pc(){}

    public void beforeMethod(){
        System.out.println("before");
    }

    public void beforeMethod1(){
        System.out.println("before1");
    }

    public void afterRuturnMethod(){
        System.out.println("afterRuturnMethod");
    }

    public void afterThrow(){
        System.out.println("afterThrow");
    }

    public void aroundMethod(ProceedingJoinPoint jp,int i){
        System.out.println("before add i is "+i);
        Object o = jp.getTarget(); //获取被代理对象
        try {
            jp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        ClassOne classOne = (ClassOne) o;
        System.out.println("after i is "+classOne.i);
    }

}
