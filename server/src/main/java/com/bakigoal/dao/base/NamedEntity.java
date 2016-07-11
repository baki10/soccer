package com.bakigoal.dao.base;

import javax.persistence.MappedSuperclass;

/**
 * Created by ilmir on 03.06.16.
 */
@MappedSuperclass
public abstract class NamedEntity extends LongIdentifiedEntity {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
