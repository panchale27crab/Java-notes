/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javavehicleassi;

/**
 *
 * @author Singhe Computers
 */
public class Vehicle {
   protected String make;
   protected String model;
   protected int year;
   
   Vehicle(String make, String model, int year){
   this.make = make;
   this.model = model;
   this.year = year;}
   
   
public void displayDetails(){

System.out.println("Make" + make);
System.out.println("Model" + model);
System.out.println("Year" + year);

}
}
