package ccc.examples.springIOCByAnnotation;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringIOCByAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);

        ClassThree classThree = (ClassThree) annotationConfigApplicationContext.getBean("classThree");
        System.out.println(classThree.classOne.getName()+" : "+classThree.classTwo.getAddress()+" : "+classThree.classTwo.getAge());
    }
}
