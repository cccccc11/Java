package ccc.examples.springAOPByAnnotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import java.lang.String;

@Aspect
public class MyAspect {

    @Pointcut("execution(* ccc.examples.springAOPByAnnotation.ClassOne.*())")
    public void pc(){}

    @Pointcut("execution(* ccc.examples.springAOPByAnnotation.ClassOne.sale(java.lang.String)) && args(name) ")
    public void sale(String name){}

    @Before("pc()")
    public void beforeMethod(){
        System.out.println("before");
    }

    @Before("pc()")
    public void beforeMethod1(){
        System.out.println("before1");
    }

    @AfterReturning("pc()")
    public void afterRuturnMethod(){
        System.out.println("afterRuturnMethod");
    }

    @AfterThrowing("pc()")
    public void afterThrow(){
        System.out.println("afterThrow");
    }

    @Around("pc()")
    public void aroundMethod(ProceedingJoinPoint jp){
        try {
            System.out.println("around start");
            jp.proceed();
            System.out.println("around end");
        } catch (Throwable e){
            e.printStackTrace();
        }
    }

    @Before("sale(name)")
    public void beforeSale(String name){
        System.out.println("before sale you get "+ name);
    }
}
