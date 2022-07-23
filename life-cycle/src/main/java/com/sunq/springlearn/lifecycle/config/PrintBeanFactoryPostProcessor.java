package com.sunq.springlearn.lifecycle.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 计数bean定义的数目
 * @author SunQiang
 * @since 2022/7/20
 */
@Slf4j
@Component
public class PrintBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        AtomicInteger n = new AtomicInteger();
        beanFactory.getBeanNamesIterator().forEachRemaining(e -> {
//            log.info(e);
            n.getAndIncrement();
        });
        log.info("共计{}个bean定义数量", n.get());
    }
}
