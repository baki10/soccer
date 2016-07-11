package com.bakigoal.dao.entity;

import com.bakigoal.dao.base.NamedEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by ilmir on 06.07.16.
 */
@Entity
public class City extends NamedEntity {

  private Country country;

  @ManyToOne(cascade = CascadeType.ALL)
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }
}
