package com.bakigoal.dao.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

/**
 * Created by ilmir on 02.06.16.
 */
@Entity
public class Player extends Person {

  private String amplua;
  private String num;
  private Team team;
  private NationalTeam nationalTeam;
  private String price;
  private Long priceEuro;

  public Long getPriceEuro() {
    return priceEuro;
  }

  public void setPriceEuro(Long priceEuro) {
    this.priceEuro = priceEuro;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public String getAmplua() {
    return amplua;
  }

  public void setAmplua(String amplua) {
    this.amplua = amplua;
  }

  public String getNum() {
    return num;
  }

  public void setNum(String num) {
    this.num = num;
  }

  @ManyToOne
  public Team getTeam() {
    return team;
  }

  public void setTeam(Team team) {
    this.team = team;
  }

  @ManyToOne
  public NationalTeam getNationalTeam() {
    return nationalTeam;
  }

  public void setNationalTeam(NationalTeam nationalTeam) {
    this.nationalTeam = nationalTeam;
  }
}
