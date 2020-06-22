package ccc.examples.springAOPByAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class BeanConfig {

    @Bean(name = "classOne")
    public ClassOne getClassOne(){
        return new ClassOne("ccc");
    }

    @Bean
    public MyAspect myAspect(){
        return new MyAspect();
    }
}
