package ccc.examples.springIOCByAnnotation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {
    @Bean(name = "classOne")
    @Scope(value = "singleton")
    public ClassOne getClassOne(){
        return new ClassOne();
    }
    @Bean(name = "classTwo")
    @Scope(value = "prototype")
    public ClassTwo getClassTwo(){
        return new ClassTwo();
    }
    @Bean(name = "classThree")
    public ClassThree getClassThree(){
        return new ClassThree();
    }
}
