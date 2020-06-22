package ccc.examples.springAOPByAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAOPByAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        ClassOne classOne = (ClassOne) annotationConfigApplicationContext.getBean("classOne");
        classOne.sale("fish");
    }
}
