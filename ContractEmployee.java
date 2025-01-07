/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaoop4;

/**
 *
 * @author DELL
 */
public class ContractEmployee implements Employee {

    private int ID;
    private String name;
    private double totalSalary;

    public ContractEmployee(int ID, String name, double totalSalary) {
        this.ID = ID;
        this.name = name;
        this.totalSalary = totalSalary;
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

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    @Override
    public double calculateSalary() {
        return totalSalary;
    }

    @Override
    public void displayDetials() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }

}
