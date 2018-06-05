package com.olsoncb.exercises.conditionallogicrefactoring.refactoredEntity;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class EmployeeTest {

  private final BaseEmployee employee = new BaseEmployee();

  @Test
  public void full_time_staff() {

    Employee fullTimeStaffMember = Employee.staff(Employee.fullTimeEmployee(employee));

    assertThat(fullTimeStaffMember.isManager(), Matchers.is(false));

    assertThat(fullTimeStaffMember.isPartTime(), Matchers.is(false));
  }

  @Test
  public void full_time_manager() {

    Employee fullTimeManager = Employee.manager(Employee.fullTimeEmployee(employee));

    assertThat(fullTimeManager.isManager(), Matchers.is(true));

    assertThat(fullTimeManager.isPartTime(), Matchers.is(false));
  }

  @Test
  public void part_time_staff() {

    Employee partTimeStaffMember = Employee.staff(Employee.partTimeEmployee(employee));

    assertThat(partTimeStaffMember.isManager(), Matchers.is(false));

    assertThat(partTimeStaffMember.isPartTime(), Matchers.is(true));
  }

  @Test
  public void part_time_manager() {

    Employee partTimeManager = Employee.manager(Employee.partTimeEmployee(employee));

    assertThat(partTimeManager.isManager(), Matchers.is(true));

    assertThat(partTimeManager.isPartTime(), Matchers.is(true));
  }
}
