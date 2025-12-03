/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package samsungs24;

/**
 *
 * @author Singhe Computers
 */
//public class SamsungS24 {

    
     class SamsungS24{
          
public int IME = 0;
public String ModelNo  = null;
public String Color = null;
public String Ringtone = null;

  SamsungS24(){
           this.Color = "White";
           this.IME = (int)(Math.random()*10000);
           this.ModelNo = "Samsung S25";
           this.Ringtone = "default over the horizon";
                   
                  
       }
  SamsungS24(String Color, String Ringtone){
  
           this.Color = Color;
           this.IME = (int) (Math.random()*10000);
           this.ModelNo = "Samsung S25";
           this.Ringtone = Ringtone;
           
                   
  


public int GetIME(){
        return this.IME;}
public String GetModelNo(){
        return this.ModelNo;}
public String GetColor (){
        return this.Color;}
public String Getringtone(){
        return this.Ringtone;}
    


    public static void main(String[] args) {
        
        SamsungS24 newbrand = new SamsungS24();
        System.out.println(newbrand.Color);
        System.out.println(newbrand.IME);
        System.out.println(newbrand.ModelNo);
        System.out.println(newbrand.Ringtone);
        
        SamsungS24 vipbrand = new SamsungS24("Cyan" ,"Limited Edition Yanan ringtone");
        System.out.println(vipbrand.Color);
        System.out.println(vipbrand.IME);
        System.out.println(vipbrand.ModelNo);
        System.out.println(vipbrand.Ringtone);
    }

   }

//    public static void main(String[] args) {
//        
//    }
//    

