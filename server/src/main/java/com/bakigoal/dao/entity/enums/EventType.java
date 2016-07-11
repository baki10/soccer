package com.bakigoal.dao.entity.enums;

/**
 * Created by ilmir on 06.07.16.
 */
public enum EventType {
  GOAL("Гол"),
  ASSIST("Голевая передача"),
  SUBSTITUTION_IN("Замена"),
  SUBSTITUTION_OUT("Замена"),
  YELLOW_CARD("Желтая карточка"),
  RED_CARD("Красная карточка");

  private String name;

  EventType(String s) {
    this.name = s;
  }

  public String getName() {
    return name;
  }
}
