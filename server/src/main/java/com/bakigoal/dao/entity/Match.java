package com.bakigoal.dao.entity;

import com.bakigoal.dao.base.LongIdentifiedEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Created by ilmir on 06.07.16.
 */
@Entity
public class Match extends LongIdentifiedEntity {

  private Lineup homeLineup;
  private Lineup awayLineup;
  private Date date;

  @ManyToOne
  public Lineup getHomeLineup() {
    return homeLineup;
  }

  public void setHomeLineup(Lineup homeLineup) {
    this.homeLineup = homeLineup;
  }

  @ManyToOne
  public Lineup getAwayLineup() {
    return awayLineup;
  }

  public void setAwayLineup(Lineup awayLineup) {
    this.awayLineup = awayLineup;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }
}
