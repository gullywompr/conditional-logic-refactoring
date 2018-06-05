package com.olsoncb.exercises.conditionallogicrefactoring.refactoredEntity;

/** The type Staff member. */
public class StaffMember extends BaseEmployee {

  @Override
  public Boolean isManager() {
    return false;
  }
}
