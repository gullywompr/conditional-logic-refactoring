package com.olsoncb.exercises.conditionallogicrefactoring.refactoredEntity;

/** The type Full time employee. */
public class FullTimeEmployee extends BaseEmployee {

  @Override
  public Boolean isPartTime() {
    return false;
  }
}
