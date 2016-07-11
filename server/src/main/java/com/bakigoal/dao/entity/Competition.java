package com.bakigoal.dao.entity;

import com.bakigoal.dao.base.NamedEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by ilmir on 06.07.16.
 */
@Entity
public class Competition extends NamedEntity {

  private Country country;

  @ManyToOne
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }
}
