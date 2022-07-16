package com.sunq.springlearn.autowire.service;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Order(value = 3)
@Service
public class Bmw implements Car {
}
