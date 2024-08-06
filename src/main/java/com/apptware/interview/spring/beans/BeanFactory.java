package com.apptware.interview.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
// Do not change this class
public class BeanFactory {

  @Autowired private ApplicationContext context;

  public OnDemand getOnDemandBean(String someString) {
    return context.getBean(OnDemand.class, someString);
  }
}
