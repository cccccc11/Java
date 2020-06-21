package ccc.examples.springIOCByAnnotation;

import org.springframework.beans.factory.annotation.Value;

public class ClassOne {

    @Value("ccc")
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
