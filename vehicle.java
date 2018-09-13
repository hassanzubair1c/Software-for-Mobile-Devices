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



abstract class vehicle {
    
    //Final Variable
    final String Factory_Name="Honda";
    
    private String make;
    private String model;
    private String owner;
    
    public vehicle(String make, String model, String owner) {
      System.out.println("Constructing a Vehicle\n");
      this.make = make;
      this.model = model;
      this.owner = owner;
   }
    //Non Abstract Method
    public void setOwner(String o)
    {
        owner=o;
    }
    
    //Final Method
    final String getFactoryName()
    {
        return Factory_Name;
    }
    //Abstact Method
    abstract void test_drive();
    
    
    
    
}
