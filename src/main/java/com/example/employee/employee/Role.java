package com.example.employee.employee;

public class Role {
    private String department;
    private String designation;
    private String domain;

    public Role(String department, String designation, String domain) {
        this.department = department;
        this.designation = designation;
        this.domain = domain;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
