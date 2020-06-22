package ccc.examples.springAOPByAnnotation;

public class ClassOne {
    private String name;

    public ClassOne(String name){
        this.name = name;
    }

    public void myName(){
        System.out.println("myName is "+name);
    }

    public void sale(String name){
        System.out.println("the thing you buy is "+name);
    }
}
