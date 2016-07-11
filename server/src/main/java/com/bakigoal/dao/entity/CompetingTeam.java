package com.bakigoal.dao.entity;

import com.bakigoal.dao.base.LongIdentifiedEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by ilmir on 06.07.16.
 */
@Entity
public class CompetingTeam extends LongIdentifiedEntity{

  private Team team;
  private Competition competition;

  @ManyToOne
  public Team getTeam() {
    return team;
  }

  public void setTeam(Team team) {
    this.team = team;
  }

  @ManyToOne
  public Competition getCompetition() {
    return competition;
  }

  public void setCompetition(Competition competition) {
    this.competition = competition;
  }
}
