package com.apptware.interview.comparison;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class SomeClass {

  // This is a unique identifier
  private Integer id;
  private Date lastInvoked;
}
