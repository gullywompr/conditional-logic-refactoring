package com.olsoncb.exercises.conditionallogicrefactoring.refactoredEntity;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class EmployeeTest {

  private final BaseEmployee employee = new BaseEmployee();

  @Test
  public void full_time_staff() {

    Employee fullTimeStaffMember = Employee.staff(Employee.fullTime(employee));

    assertThat(fullTimeStaffMember.isManager(), is(false));

    assertThat(fullTimeStaffMember.isPartTime(), is(false));
  }

  @Test
  public void full_time_manager() {

    Employee fullTimeManager = Employee.manager(Employee.fullTime(employee));

    assertThat(fullTimeManager.isManager(), is(true));

    assertThat(fullTimeManager.isPartTime(), is(false));
  }

  @Test
  public void part_time_staff() {

    Employee partTimeStaffMember = Employee.staff(Employee.partTime(employee));

    assertThat(partTimeStaffMember.isManager(), is(false));

    assertThat(partTimeStaffMember.isPartTime(), is(true));
  }

  @Test
  public void part_time_manager() {

    Employee partTimeManager = Employee.manager(Employee.partTime(employee));

    assertThat(partTimeManager.isManager(), is(true));

    assertThat(partTimeManager.isPartTime(), is(true));
  }
}
