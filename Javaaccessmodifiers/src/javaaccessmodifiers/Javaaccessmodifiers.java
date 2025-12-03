/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaaccessmodifiers;

import static NewPackage.Class2.public3;
import NewPackage.Parentclass;
import static javaaccessmodifiers.Class1.default2;
import static javaaccessmodifiers.Class1.protected2;
import static javaaccessmodifiers.Class1.public2;

public class Javaaccessmodifiers extends Parentclass {
    //public
    public static String public1 = "Public : Same Package";
    //protected
    protected static String protected1 = "Protected : same class";
    //defalut
    static String default1 = "default : same class";
    //private
    private static String private1 = "Private1 : same class";
    public static void main(String[] args) {
        //public
        System.out.println(public1);
        System.out.println(public2);
        System.out.println(public3);
        System.out.println(public4);
        System.out.println(myindexno);
        //protected
        System.out.println(protected1);
        System.out.println(protected2);
        //System.out.println(protected3); you cannot call protected outside package
        System.out.println(protected4);
        //default
        System.out.println(default1);
        System.out.println(default2);
        // default cannot import from another package System.out.println(default3);
        // default cannot be inherited from outside packages. System.out.println(default4);
        //Private
        System.out.println(private1);
        //private can only be used in the same class
//        System.out.println(private2);
//        System.out.println(private3);
//        System.out.println(private4);
         
    
    
    
    }
    
}
