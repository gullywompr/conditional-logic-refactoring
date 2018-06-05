package com.olsoncb.exercises.conditionallogicrefactoring.refactoredEntity;

/** The type Part time employee. */
public class PartTimeEmployee extends BaseEmployee {

  @Override
  public Boolean isPartTime() {
    return true;
  }
}
