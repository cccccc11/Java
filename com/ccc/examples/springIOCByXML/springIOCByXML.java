package ccc.examples.springIOCByXML;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springIOCByXML {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
        ClassThree classThree = (ClassThree) classPathXmlApplicationContext.getBean("classThree");
        System.out.println(classThree.getClassOne().getName()+" : "+classThree.getClassTwo().getAddress()+" : "+classThree.getClassTwo().getAge());
    }
}
