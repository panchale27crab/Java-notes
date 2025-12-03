/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package samsungs25assign;


//public class SamsungS25assign {
   

   class SamsungS24{
          
public int IME = 0;
public String ModelNo  = null;
public String Color = null;


  SamsungS24(){
           this.Color = "White";
           this.IME = (int)Math.random()*1000;
           this.ModelNo = "Samsung S25";
                  
       }


public int GetIME(){
        return this.IME;}
public String GetModelNo(){
        return this.ModelNo;}
public String GetColor (){
        return this.Color;}


    public static void main(String[] args) {
        
        SamsungS24 newbrand = new SamsungS24();
        System.out.println(newbrand.Color);
        System.out.println(newbrand.IME);
        System.out.println(newbrand.ModelNo);
        
    }

   }


    

