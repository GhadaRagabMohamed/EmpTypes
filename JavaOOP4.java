/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaoop4;

/**
 *
 * @author DELL
 */
public class JavaOOP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FullTimeEmployee full = new FullTimeEmployee(1, "Ahmed", 1000);
        PartTimeEmployee part = new PartTimeEmployee(2, "Mohammed", 100, 40);
        ContractEmployee contract = new ContractEmployee(3, "Ali", 15000);
        System.out.println("Full_Time Employee detials:");
        full.displayDetials();
        System.out.println("\nPart_Time Employee detials:");
        part.displayDetials();
        System.out.println("\nContract Employee detials:");
        contract.displayDetials();

    }

}
