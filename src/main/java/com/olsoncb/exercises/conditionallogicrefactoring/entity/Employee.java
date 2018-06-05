package com.olsoncb.exercises.conditionallogicrefactoring.entity;

import java.util.Date;

public class Employee {

    private boolean managerFlag;
    private String name;
    private Date dateHired;
    private int id;

    public String getName() {
        return name;
    }

    public String getId() {
        return String.valueOf(id);
    }

    public Date getDateHired() {
        return dateHired;
    }

    public boolean isManager() {
        return managerFlag;
    }
}
