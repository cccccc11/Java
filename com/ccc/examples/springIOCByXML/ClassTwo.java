package ccc.examples.springIOCByXML;

public class ClassTwo {
    private String address;
    private Integer age;

    public ClassTwo(String address, Integer age) {
        this.address = address;
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
