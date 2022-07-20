package com.sunq.springlearn.dependency.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class A {
    @Autowired
    private B b;
}
