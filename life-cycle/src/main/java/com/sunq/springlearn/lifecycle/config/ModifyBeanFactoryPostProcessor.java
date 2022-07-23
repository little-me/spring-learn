package com.sunq.springlearn.lifecycle.config;

import com.sunq.springlearn.lifecycle.model.Clerk;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 修改bean定义
 * @author SunQiang
 * @since 2022/7/23
 */
@Component
public class ModifyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition boss = beanFactory.getBeanDefinition("boss");
        MutablePropertyValues pvs = boss.getPropertyValues();
        List<Clerk> clerks = new ArrayList<>(2);
        clerks.add(new Clerk("小小的我", 12));
        clerks.add(new Clerk("大大的城", 21));
        pvs.add("clerks", clerks);
    }
}
