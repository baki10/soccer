package com.bakigoal.dao.entity;

import com.bakigoal.dao.base.LongIdentifiedEntity;
import com.bakigoal.dao.entity.enums.EventType;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by ilmir on 06.07.16.
 */
@Entity
public class Event extends LongIdentifiedEntity {

  private EventType eventType;
  private int minute;
  private LineupPosition lineupPosition;
  private Match match;

  public EventType getEventType() {
    return eventType;
  }

  public void setEventType(EventType eventType) {
    this.eventType = eventType;
  }

  public int getMinute() {
    return minute;
  }

  public void setMinute(int minute) {
    this.minute = minute;
  }

  @ManyToOne
  public LineupPosition getLineupPosition() {
    return lineupPosition;
  }

  public void setLineupPosition(LineupPosition lineupPosition) {
    this.lineupPosition = lineupPosition;
  }

  @ManyToOne
  public Match getMatch() {
    return match;
  }

  public void setMatch(Match match) {
    this.match = match;
  }
}
