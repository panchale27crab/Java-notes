/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorphism;

class Animal{

    public String  Name= null;
    public void Sound(){
    }
}

class Cat extends Animal{

    @Override
    public void Sound(){
    System.out.println("Meow Meow");
    }
    
}

class Dog extends Animal{

    @Override
    public void Sound(){
    System.out.println("Bow Bow");
    }

}
class Cow extends Animal{
    
    @Override
    public void Sound(){
    System.out.println("Moo Moo");}
}


public class Polymorphism {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        
        Cow obj1 = new Cow();
        obj1.Sound();
        
        Cat obj2 = new Cat();
        obj2.Sound();
        
        Dog obj3 = new Dog();
        obj3.Sound();
        
        
        Animal obj_5 = new Cow();
        Animal obj_6 = new Cat();
        Animal obj_7 = new Dog();
        
        obj_5.Sound();
        obj_6.Sound();
        obj_7.Sound();
        
        
        
    }
    
}
