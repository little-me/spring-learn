package com.sunq.springlearn.autowire.model;

import com.sunq.springlearn.autowire.service.Car;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class RichMan {
    @Qualifier(value = "bmw")
    @Autowired
    private Car tesla;
}
