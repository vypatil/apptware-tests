package com.apptware.interview.spring.beans;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
// Do not change this class. The run will fail due to an error in the bean creation process that
// you're supposed to solve.
class BeanFactoryTest {

  @Autowired private BeanFactory beanFactory;

  @Test
  void getOnDemandBean() {
    String someString = "Hello World!!!";
    OnDemand onDemandBean = beanFactory.getOnDemandBean(someString);
    Assertions.assertThat(onDemandBean.getSomeString()).isEqualTo(someString);
  }
}
