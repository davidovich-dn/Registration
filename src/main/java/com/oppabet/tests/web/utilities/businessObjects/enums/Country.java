package com.oppabet.tests.web.utilities.businessObjects.enums;

public enum Country {

  BELARUS("Belarus"),
  CHINA("China"),
  CANADA("Canada");

  private String name;

  Country(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return name;
  }
}
