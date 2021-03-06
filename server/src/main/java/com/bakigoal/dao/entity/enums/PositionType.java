package com.bakigoal.dao.entity.enums;

/**
 * Created by ilmir on 06.07.16.
 */
public enum PositionType {
  GK("Вратарь"),
  DL("Левый защитник"),
  DR("Правый защитник"),
  DC("Центральный защитник"),
  DML("Левый опорный полузащитник"),
  DMR("Правый опорный полузащитник"),
  DMC("Опорный полузащитник"),
  ML("Левый полузащитник"),
  MR("Правый полузащитник"),
  MC("Центральный полузащитник"),
  AML("Левый атакующий полузащитник"),
  AMR("Правый атакующий полузащитник"),
  AMC("Центральный атакующий полузащитник"),
  ST("Нападающий"),
  SUB("Замена"),
  RES("Резерв");

  private String name;

  PositionType(String s) {
    this.name = s;
  }

  public String getName() {
    return name;
  }
}
