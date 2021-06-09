/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.mycput.assignment3;

/**
 *
 * @author user
 */
public class Runing {
        public static void main(String args[])  {
        Applying obj = new Applying();
        obj.openFile();
        obj.readCustomer();
        obj.openFile();
        obj.readSupplier();
       // obj.closeFile();
    }//end main    
    
}
