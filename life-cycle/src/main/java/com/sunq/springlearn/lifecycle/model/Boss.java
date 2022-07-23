package com.sunq.springlearn.lifecycle.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Data
@Component
public class Boss implements InitializingBean {
    private String name;
    private String company;

    @Autowired
    private List<Clerk> clerks;

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("我的职工有" + Arrays.toString(clerks.toArray()));
    }
}
