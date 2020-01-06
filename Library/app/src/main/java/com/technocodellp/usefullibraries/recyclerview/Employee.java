package com.technocodellp.usefullibraries.recyclerview;

public class Employee {
    String emp_id, name, address, phone;

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Employee(String emp_id, String name, String address, String phone) {
        this.emp_id = emp_id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
}
