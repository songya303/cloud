package com.sino.service.impl;

import com.sino.service.SchedualServiceHi;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
