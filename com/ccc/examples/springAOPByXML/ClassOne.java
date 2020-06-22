package ccc.examples.springAOPByXML;

public class ClassOne {
    private String name;
    public int i;
    public ClassOne(String name){
        this.name = name;
    }
    public void myName(){
        System.out.println("My name is "+name);
    }

    public void addOne(int i){
       this.i = ++i;
    }

}
