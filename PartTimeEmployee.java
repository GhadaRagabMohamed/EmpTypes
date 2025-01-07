/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaoop4;

/**
 *
 * @author DELL
 */
public class PartTimeEmployee implements Employee {

    private int ID;
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(int ID, String name, double hourlyRate, int hoursWorked) {
        this.ID = ID;
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
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

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void displayDetials() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }

}
