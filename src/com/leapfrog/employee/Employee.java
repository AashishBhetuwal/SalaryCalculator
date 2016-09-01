/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.employee;

/**
 *
 * @author Toshiba
 */
public class Employee {
    
    private int id;
    private double salary;
    private String firstname,lastname;

    public Employee() {
    }

     public Employee(int id, double salary, String firstname, String lastname) {
        this.id = id;
        this.salary = salary;
        this.firstname = firstname;
        this.lastname = lastname;
    }
     
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

   public String toCSV(){
       return id + ","+ firstname + "," + lastname + "," + salary+ "\r\n";
   }
    
}
