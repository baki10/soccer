package com.bakigoal.dao.entity;

import com.bakigoal.dao.base.NamedEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by ilmir on 06.07.16.
 */
@Entity
public class Stadium extends NamedEntity{

  private int capacity;
  private Image image;
  private int year;
  private City city;

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  @ManyToOne
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  @ManyToOne
  public City getCity() {
    return city;
  }

  public void setCity(City city) {
    this.city = city;
  }
}
