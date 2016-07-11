package com.bakigoal.dao.entity;

import com.bakigoal.dao.base.LongIdentifiedEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Расстановка на матч
 * <p>
 * Created by ilmir on 06.07.16.
 */
@Entity
public class Lineup extends LongIdentifiedEntity {

  private Team team;

  @ManyToOne
  public Team getTeam() {
    return team;
  }

  public void setTeam(Team team) {
    this.team = team;
  }
}
