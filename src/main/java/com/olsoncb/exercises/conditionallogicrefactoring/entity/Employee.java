package com.olsoncb.exercises.conditionallogicrefactoring.entity;

import java.util.Date;

/** The type Employee. */
class Employee {

  private boolean managerFlag;
  private String name;
  private Date dateHired;
  private int id;

  /**
   * Gets name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets id.
   *
   * @return the id
   */
  public String getId() {
    return String.valueOf(id);
  }

  /**
   * Gets date hired.
   *
   * @return the date hired
   */
  public Date getDateHired() {
    return dateHired;
  }

  /**
   * Is manager boolean.
   *
   * @return the boolean
   */
  public boolean isManager() {
    return managerFlag;
  }
}
