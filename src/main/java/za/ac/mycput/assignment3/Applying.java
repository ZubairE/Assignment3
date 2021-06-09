/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.mycput.assignment3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author user
 */
public class Applying {
    private ObjectInputStream input;
    Customer customer;
    Supplier supplier;
    
   ArrayList<Customer> customerList = new ArrayList<>();
    ArrayList<Supplier> supplierList = new ArrayList<>();
    
    public void openFile (){
        try{
            input = new ObjectInputStream( new FileInputStream("stakeholder.ser") );
             System.out.println("*** ser file opened for reading ***");              
             }
        catch(IOException ioe){
            System.out.println("error opening ser file: " + ioe.getMessage());
        }
    }
    
    public void closeFile(){
        try{
            input.close ( );
        }
         catch(IOException ioe){
            System.out.println("error closing ser file: " + ioe.getMessage());
        }
    }
    
    public void readFromFile(){
       try{
    while(true){
        Stakeholder stakeholder = (Stakeholder)input.readObject();
         System.out.println(stakeholder);
         }//end while loop
       }//end try
     catch(ClassNotFoundException ioe){
            System.out.println("error reading ser file: " + ioe.getMessage());
        }
     catch(IOException ioe){
            System.out.println("error reading from ser file: " + ioe.getMessage());
        }
        
      finally{
            closeFile();
             System.out.println("*** file has been closed ***");  
        }  
        
    
    }
     
    public void readCustomer(){
        try{
                while(true){
                    Stakeholder stakeholder = (Stakeholder)input.readObject();
                    if(stakeholder instanceof Customer){
                        System.out.println(stakeholder);
                           customerList.add((Customer)stakeholder);
                int i;
                for(i = 0; i<customerList.size(); i++)
                {      
                    System.out.println(customerList.get(i).toString());
                }
                    
                    }
                }
             } // End try 
         catch(ClassNotFoundException ioe){
            System.out.println("error reading ser file: " + ioe.getMessage());
        }
         catch(IOException ioe){
            System.out.println("error reading from ser file: " + ioe.getMessage());
        }
        
         finally{
            closeFile();
             System.out.println("*** file has been closed ***");  
        }  
    }
    
 public void readSupplier(){
     try{
         while(true){
                    Stakeholder stakeholder = (Stakeholder)input.readObject();
                    if(stakeholder instanceof Supplier){
                        System.out.println(stakeholder);
                         supplierList.add((Supplier)stakeholder);
                          int i;
                          for(i = 0; i<supplierList.size(); i++)
                          {     
                          System.out.println(supplierList.get(i).toString());
                           }
         }
       }
     }// End try
     catch(ClassNotFoundException ioe){
            System.out.println("error reading ser file: " + ioe.getMessage());
        }
      catch(IOException ioe){
            System.out.println("error reading from ser file: " + ioe.getMessage());
        }
     finally{
            closeFile();
             System.out.println("*** file has been closed ***");  
        }  
     
 }
  
    
    
    
    
}
