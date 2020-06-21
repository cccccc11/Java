package ccc.examples.springIOCByAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassThree {
    @Autowired
    ClassOne classOne;

    @Autowired
    ClassTwo classTwo;
}
