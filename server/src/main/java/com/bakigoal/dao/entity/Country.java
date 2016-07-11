package com.bakigoal.dao.entity;

import com.bakigoal.dao.base.NamedEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

/**
 * Created by ilmir on 06.07.16.
 */
@Entity
public class Country extends NamedEntity {
  private Image image;

  @ManyToOne(cascade = CascadeType.ALL)
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }
}
