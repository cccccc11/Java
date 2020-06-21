package ccc.examples.springIOCByAnnotation;

import org.springframework.beans.factory.annotation.Value;

public class ClassTwo {

    @Value("whut")
    private String address;

    @Value("12")
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
