/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smd.a.pkg1;

/**
 *
 * @author Hassan X-BOT
 */
public class SMDA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Exception Handling 1
        try{     
           //Starting to make a new car in a Factory
           car c=new car("Honda", "City", "Hassan", "5 Speed Automatic", "Sedan", "Petrol 1.5");
       
        //Accrssing Static Variable
        c.printCount();
        
        //Accessing Non-Static Inner Class
        car.transmission trans= c.new transmission();
        
        //Accessing Static Inner Class
        car.engine engine_car=new car.engine();
        
        //Accrssing Interface 1
        c.paint();
        
        //Accrssing Interface 2
        c.assemble();
        
        //Accrssing Abstract Method 1
        c.test_drive();
        
        //Accrssing Static Method & Variable
        c.printCount();
        }
       
        catch(Exception e)
        {
            System.out.println("Warning Some Exception Occured");
        }
    }
    
}
