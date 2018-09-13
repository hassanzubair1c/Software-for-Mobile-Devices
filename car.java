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
public class car extends vehicle implements paint, assembly{
    
    static int manufactured_count=0;
    
    String speed_system;
    String car_type;
    String e_type;

    public car(String make, String model, String owner,String speed_system, String car_type, String e_type) {
        super(make, model, owner);
        
        System.out.println("Factory Name is "+Factory_Name);
        System.out.println("\nConstructing a Car\n");
        
        this.speed_system=speed_system;
        this.car_type=car_type;
        this.e_type=e_type;
        
    }
//Interface 1 Implemented
    @Override
    public void paint() {
        System.out.println("Car is Painted\n");
        
    }
//Interface 2 Implemented
    @Override
    public void assemble() {
        System.out.println("Car is Assembled\n");
       
    }
//Abstract Method Over_ridden
    @Override
    void test_drive() {
        System.out.println("Test Drive Done!\n");
        addCarCount();
    }
//Static Method & Exception Handling 2
    static void addCarCount(){
        
       try{
        manufactured_count++;
       }
       catch(ArithmeticException e)
       {
         System.out.println("Warning: ArithmeticException");  
       }
        System.out.println("New Car Manufactured!\n");
    }
    static void printCount()
    {
        System.out.println("Current No. of Maunfactured Cars = "+manufactured_count+"\n");
        
    }
//Non Static Inner Class
    public class transmission{
        transmission(){
            System.out.println("transmission generated\n");
        }
        void setTransmission(String t)
        {
            speed_system=t;
        }
        String getTransmission()
        {
            return speed_system;
        }
    }
//Static Nested Class
    public static class engine{
        String e_type;
        engine(){
            System.out.println("engine generated\n");
        }
        void setTransmissionType(String t)
        {
            e_type=t;
        }
        String getTransmissionType()
        {
            return e_type;
        }
    }
    
}
