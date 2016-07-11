package com.bakigoal.dao.entity;

import com.bakigoal.dao.base.LongIdentifiedEntity;
import com.bakigoal.dao.entity.enums.PositionType;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Позиция в расстановке на матч
 * <p>
 * Created by ilmir on 06.07.16.
 */
@Entity
public class LineupPosition extends LongIdentifiedEntity {

  private Lineup lineup;
  private Player player;
  private PositionType position;

  @ManyToOne
  public Lineup getLineup() {
    return lineup;
  }

  public void setLineup(Lineup lineup) {
    this.lineup = lineup;
  }

  @ManyToOne
  public Player getPlayer() {
    return player;
  }

  public void setPlayer(Player player) {
    this.player = player;
  }

  public PositionType getPosition() {
    return position;
  }

  public void setPosition(PositionType position) {
    this.position = position;
  }
}
