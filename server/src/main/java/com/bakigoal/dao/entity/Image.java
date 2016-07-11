package com.bakigoal.dao.entity;

import com.bakigoal.dao.base.LongIdentifiedEntity;

import javax.persistence.Entity;

/**
 * Created by ilmir on 06.07.16.
 */
@Entity
public class Image extends LongIdentifiedEntity{
  private String src;
  private String alt;
  private String newSrc;

  public Image() {
  }

  public Image(String src, String alt) {
    this.src = src;
    this.alt = alt;
  }

  public String getNewSrc() {
    return newSrc;
  }

  public void setNewSrc(String newSrc) {
    this.newSrc = newSrc;
  }

  public String getSrc() {
    return src;
  }

  public void setSrc(String src) {
    this.src = src;
  }

  public String getAlt() {
    return alt;
  }

  public void setAlt(String alt) {
    this.alt = alt;
  }
}
