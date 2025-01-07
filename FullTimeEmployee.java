/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaoop4;

/**
 *
 * @author DELL
 */
public class FullTimeEmployee implements Employee {

    private int ID;
    private String name;
    private double monthlySalary;

    public FullTimeEmployee(int ID, String name, double monthlySalary) {
        this.ID = ID;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public void displayDetials() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());

    }

}
