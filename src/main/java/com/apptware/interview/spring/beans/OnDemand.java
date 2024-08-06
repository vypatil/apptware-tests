package com.apptware.interview.spring.beans;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
public class OnDemand {

  @Getter private final String someString;

  OnDemand(String someString) {
    this.someString = someString;
  }
}
