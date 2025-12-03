/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newactivity;

public class Vehicle{
    
    protected String make;
    protected String model;
    protected int year;
    
    Vehicle(String make, String model, int year ){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    public void displayDetails(){
        
        System.out.println("Make"+ make );
        System.out.println("Model"+ model);
        System.out.println("Year"+ year);
    }
    }


class Car extends Vehicle{ 
    public int Numberofdoors;
    
    Car(String make, String model, int year, int Numberofdoors){
        super(make,model,year);
       this.Numberofdoors = Numberofdoors;
    }
   
    @Override
    public void displayDetails(){
        System.out.println("Make"+ make );
        System.out.println("Model"+ model);
        System.out.println("Year"+ year);
        System.out.println("Numberofdoors" + Numberofdoors);
    }
    }


   class Truck extends Vehicle{
       public int PayloadCapacity;

    Truck(String make, String model, int year, int PayloadCapacity) {
        super(make, model, year);
        this.PayloadCapacity = PayloadCapacity;
        }
       @Override
    public void displayDetails(){
        System.out.println("Make"+ make );
        System.out.println("Model"+ model);
        System.out.println("Year"+ year);
        System.out.println("PayloadCapacity" + PayloadCapacity);
   }

    public void main(String[] args) {
        
        Car carobject = new Car("Toyota", "Corolla", 1996, 4);
         carobject.displayDetails();
         
        Truck truckobject = new Truck("Ford","Maverick", 2024, 1500);
        truckobject.displayDetails();
          
        
    }
    }
   
   



