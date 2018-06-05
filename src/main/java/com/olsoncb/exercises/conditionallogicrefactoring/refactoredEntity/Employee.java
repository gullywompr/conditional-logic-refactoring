package com.olsoncb.exercises.conditionallogicrefactoring.refactoredEntity;

import java.util.Date;

/** The interface Employee. */
public interface Employee {

  /**
   * Staff employee.
   *
   * @param employee the employee
   * @return the employee
   */
  static Employee staff(Employee employee) {
    return new StaffMember() {
      @Override
      public Boolean isPartTime() {
        return employee.isPartTime();
      }
    };
  }

  /**
   * Manager employee.
   *
   * @param employee the employee
   * @return the employee
   */
  static Employee manager(Employee employee) {
    return new Manager() {
      @Override
      public Boolean isPartTime() {
        return employee.isPartTime();
      }
    };
  }

  /**
   * Full time employee employee.
   *
   * @param employee the employee
   * @return the employee
   */
  static Employee fullTimeEmployee(Employee employee) {
    return new FullTimeEmployee() {
      @Override
      public Boolean isManager() {
        return employee.isManager();
      }
    };
  }

  /**
   * Part time employee employee.
   *
   * @param employee the employee
   * @return the employee
   */
  static Employee partTimeEmployee(Employee employee) {
    return new PartTimeEmployee() {
      @Override
      public Boolean isManager() {
        return employee.isManager();
      }
    };
  }

  /**
   * Gets name.
   *
   * @return the name
   */
  String getName();

  /**
   * Gets id.
   *
   * @return the id
   */
  String getId();

  /**
   * Gets date hired.
   *
   * @return the date hired
   */
  Date getDateHired();

  /**
   * Is manager boolean.
   *
   * @return the boolean
   */
  Boolean isManager();

  /**
   * Is part time boolean.
   *
   * @return the boolean
   */
  Boolean isPartTime();
}
