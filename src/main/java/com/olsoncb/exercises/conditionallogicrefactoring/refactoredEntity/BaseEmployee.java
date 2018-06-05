package com.olsoncb.exercises.conditionallogicrefactoring.refactoredEntity;

import java.util.Date;

/** The type Base employee. */
public class BaseEmployee implements Employee {

  private String name;
  private Date dateHired;
  private int id;

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getId() {
    return String.valueOf(id);
  }

  @Override
  public Date getDateHired() {
    return dateHired;
  }

  public Boolean isManager() {
    return false;
  }

  public Boolean isPartTime() {
    return false;
  }
}
