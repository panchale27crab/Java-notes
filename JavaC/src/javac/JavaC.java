/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javac;

/**
 *
 * @author Singhe Computers
 */
public class JavaC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //DataTypes =  variables
       //Primitive Datatypes
          //byte 
          //short
          //int 
          //long 
          //float
          //double
          //boolean
          //char
       //Nonprimitive Datatypes / first letter should be capital
          //String  
          
      //examples:
//      float x = 123.456f;
//      double y = 123.4533; //float should have f at the end but double doesnt.
//      boolean status = false;
//      char k = 'a'; //should onlu store one character even space or other
     
     
   String FullName; //string can store multiple characters
       FullName = "Panchale";
   String response; // this is called declaration 
     
      //String response;//a variable with no value or data is called declaration.
      //
      //
      //
      //
  response="myname ok"; //a variable with a value entered when coding is called initialization
                     
  System.out.println(response);  
     
     System.out.println("Panchale");
      
      //PreFix ex
//         int China = 0;
//  int SriLanka = China--; // SL  0 : CH -1
//  SriLanka = China--;// 
//  SriLanka = China--;//
//  SriLanka = China--;//
//  SriLanka = China--;//
//  SriLanka = China--;// 
//     
//  System.out.println(China);
     //Post fix
      //int Korea = 10;
       // int Japan = --Korea;
  //System.out.println("Korea");
    
    
    //Relational Operators
    
    // < - Less than
   // System.out.println(100<1000);
    
    // > - Greater than
   // System.out.println(100>1000);
    
    // >= - Greater than or Equal
   // System.out.println(100>=100);
    
    // <= - Less than or Equal
   // System.out.println(900<=99);
    
    // == Equal   used to check wheather the two values are equal
  //  System.out.println(34==34);
    
    // !=  Not Equal   used to check wether two values or not equal
  //  System.out.println(100!=1001);
    
    
    //Tenary Operators
    
    //int age = 80;
       //normal way
       //String ans = (age>=18)? "Adult" : "Child";
       // Nested Tenary operators
      // String ans = ((age>=1) && (age<=100))? ((age>=18)? "Adult" : "Child") : "Invalid";
       // System.out.println(ans);
                
                
    //Assignment Operators
    
       //int x = 100;
       //normal way
       //x = x+ 50;
       
      
       //addition and assign
      // x += 50;
      // x /= 2;
   // System.out.println(x);
    
    
    
    //Math Standard Class
     // double y = 5.0;
      
     // double ans = Math.max(222, 22);
      
      //System.out.println(ans);
      
      //Data Type Casting primitive : Numeric
      
      // byte / short / int / long / float / double
      
      //Widening  / Automatic type casting or known as Up Casting
//int f = 5000;
//
//double k = f ;
// 
////Example
//float d = 2344;
//System.out.println(d);
//System.out.println(k);


     //Narrowing / Manual  casting / Down Casting
    // double / float / long / int / short / byte

//double d = 234.0000;
//
//int yanan = (int)d;
//System.out.println(yanan);
        


// IF STATEMENT
       //when you want to show a result if the result is true we can use if     
//if (10<=20){
   // System.out.println("True");

//}
//if (20!=20){
  // System.out.println("True");
//}
//else{
//System.out.println("this is else part");}

// int number= 27;      //odd, even         
//// 
//String ans = null;


//int Status = (number % 2);
//if (Status == 0){
//        ans = "Even";
//    }else{ans = "Odd";
//            }
//
//System.out.println(ans);
  

// PRACTICING 
//    int value = 13;
//    String ll = null;
//    if (value == 13) { ll="dead" ;}
//     else {ll="alive"; }
   //System.out.println("ll");
   
   //if else if
   
//double MK=53.76;
//
//if ((MK<=100) && (MK>=70)){
//        System.out.println("pass");}
//else if ((MK<=69) && (MK>=40)){
//        System.out.println("Satisfactory");}
//else if ((MK<=39) && (MK>=0)) {
//        System.out.println("Fail");}
//else {System.err.println("Invalid Marks");}


   //nested if
//   int age=12;
//   if ((age <=20) && (age>=0))
//   {System.out.println("You are a kid dude!");
//   if ((age <= 30) && (age>=40))
//   {System.out.println("You are getting old");
//   }
//   if ((age <=41) && (age>=60))
//   {System.out.println("You Are Old");}
//   
//   }else System.out.println("I Am speechless");
          
       
   
       
       
 
   
   //Switch
//   String Gem = "A";
//   
//   switch (Gem) {
//       case "A":
//           System.out.println(100000);
//           break;
//       case "B":
//           System.out.println(200000);
//           break;
//       case "c":
//           System.out.println(300000);
//            break;
//       
//       default :
//           System.err.println("Invalid");
//           }    
 //HOMEWORK
   //date
   //activity //system > current date 
  
   //int month . month
   
   
   
   
   
   
   
   //FOR Loop
   for(int start=1; start<=3; start++){
   System.out.println(start +"this is a java loop");
   }

   
    
   
   
   
   
   
   
   //WHILE Loop
   int Start= 1;
   while (Start<=5){
        System.out.println(Start +"Java is confusing but dont worry practice it");
        Start++;
   }
   //DO WHILE Loop in do while even if we inoput a value that doesnt equal with the condition, 
   //do while will input the value one time. unlike while which doesnt input any value.
   int Regrets= 5;
   do{ 
       System.out.println(Regrets +"Regrets is really beautiful");
       Regrets++;
   }while(Regrets<=2);
 
   //For Each Array
   
   
   //Break; break stops on the given value and doesnt show the rest
   //Continue; continue skips the given value and show the rest
   for(int start= 1; start<=6; start++){
   
   if (start==5){
       continue;}
   System.out.println(start+"Are you an antang?");
   }
   
  
       
    }
    
    //Methods
public static void Carshowroom(){
        System.out.println("BMW");
            }
public static void Car(){

        JavaC.Carshowroom();

}
}

class ABCphone{
     
    public void Call(String no){
    System.out.println("calling to" + no);
    }
    public void Sms(String no){
    System.out.println("Send to" + no);
    } 
    public void Camera(){
    System.out.println("Camera 30 pixels");
    }
    public void Network(){
    System.out.println("3G");
    }
}


class ABCphone1 extends ABCphone{
    }
class ABCphone2{
        
    public void String(){
    ABCphone1 ob1 = new ABCphone1();
    ob1.Call("0343444446");
    }    
}




