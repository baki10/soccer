package com.bakigoal.dao.entity;

import com.bakigoal.dao.base.VersionedEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Created by ilmir on 02.06.16.
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Person extends VersionedEntity {

  private String firstName;
  private String middleName;
  private String lastName;
  private String nickName;
  private Image image;
  private Country country;
  private Date birthDate;
  private String height;
  private String weight;
  private String birthDateText;

  public String getBirthDateText() {
    return birthDateText;
  }

  public void setBirthDateText(String birthDateText) {
    this.birthDateText = birthDateText;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  @ManyToOne(cascade = CascadeType.ALL)
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  @ManyToOne
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  public String getWeight() {
    return weight;
  }

  public void setWeight(String weight) {
    this.weight = weight;
  }
}
