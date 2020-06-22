package ccc.examples.springAOPByXML;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springAOPByXML {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springAop.xml");
        ClassOne classOne = (ClassOne) context.getBean("classOne");
        classOne.addOne(9);
}
}
