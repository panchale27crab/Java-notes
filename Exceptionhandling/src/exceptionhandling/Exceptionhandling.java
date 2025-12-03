/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptionhandling;

import java.util.Scanner;

/**
 *
 * @author Singhe Computers
 */
public class Exceptionhandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner sc = new Scanner (System.in); 
      System.out.println("Enter Your Name:"); 
        int res = sc.nextInt();
        int x= 0;
        try{
             x = 100/res; //if no error
        }
        catch(Exception error){
      System.err.println("You stupid or what?");}
        
        
        
        
      System.out.println("Ans :" +x);
    //Try Catch    
        
        
        
        
        
    }
    
}
