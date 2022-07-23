package com.sunq.springlearn.lifecycle.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;

/**
 * @author SunQiang
 * @since 2022/7/23
 */
@Slf4j
@Component
public class TimeBeanPostProcessor implements BeanPostProcessor {

    private Instant inst1 = null;

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        inst1 = Instant.now();
        return bean;
    }


    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Instant inst2 = Instant.now();
        long millis = Duration.between(inst1, inst2).toMillis();
        log.info("{}初始化用时{}毫秒", beanName, millis);
        return bean;
    }

}
