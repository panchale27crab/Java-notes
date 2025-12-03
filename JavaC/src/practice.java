/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Singhe Computers
 */
public class practice {
    
    protected String  make;
    protected String model;
    protected int  year;

    practice(String make, String model, int year){
    this.make = make;
    this.model = model;
    this.year = year;
    }
   
    public void displaydetails(){
        
        System.out.println("Make"+ make);
        System.out.println("Model"+ model);
        System.out.println("Year"+ year);
    }
    }

class Car extends practice{

protected int Numberofdoors;

    Car(String make, String model, int year, int Numberofdoors){
    super (make, model, year);
            this.Numberofdoors = Numberofdoors;
    }
@Override
    public void displaydetails(){
        System.out.println("Make"+ make);
        System.out.println("Model"+ model);
        System.out.println("Year"+ year);
        System.out.println("Numberofdoors" + Numberofdoors);}
    
  }
class Truck extends practice{
protected boolean Capacitytoload;

Truck (String make, String model, int year, boolean Capacitytoload){
super(make, model,year);
    this.Capacitytoload = Capacitytoload;
}
    
@Override
    public void displaydetails(){
    System.out.println("Make"+ make);
        System.out.println("Model"+ model);
        System.out.println("Year"+ year);
        System.out.println("Capacitytoload"+ Capacitytoload);
} 8 
    


