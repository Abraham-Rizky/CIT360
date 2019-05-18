/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Junit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rizky
 */
public class BeingAttackedTest {
        int bullets;
        int stamina;
        int progression;
        boolean expResult;
    
    public BeingAttackedTest() {
    }

    /**
     * Test of attacked method, of class BeingAttacked.
     */
    @Test
 public void testAttacked() {
        System.out.println("\n***********************************************"
                          + "*******************");
        System.out.println("Being Attacked Test Case");
                          
        System.out.println("***********************************************"
                          + "*******************");        
        //Test case 1
        System.out.println("\nTest case 1");
        //define input variables
        stamina = 80;
        bullets = 20;
        progression = 4;
        expResult = true;
       boolean result = BeingAttacked.attacked(stamina, progression, bullets);
       assertEquals(result, expResult);
       if (result== true) {
           System.out.print("You beat the bad guys!\n");
           if (stamina + 10 <= 100) {
               System.out.print("Your stamina is " + (stamina + 10) + "\n");
           } else {
               System.out.print("Your stamina is 100\n");
           }
           
       } else 
           System.out.print("False, stamina or bullets is less than 5\n");
       
       
       
       //Test case 2
        System.out.println("******************************************************************");
        System.out.println("\nTest case 2");
        //define input variables
        stamina = 0;
        bullets = 20;
        progression = 10;
        expResult = false;
        result = BeingAttacked.attacked(stamina, progression, bullets);
       assertEquals(result, expResult);
        if (result== true) {
           System.out.print("You beat the bad guys!\n");
           if (stamina + 10 <= 100) {
               System.out.print("Your stamina is " + (stamina + 10) + "\n");
           } else {
               System.out.print("Your stamina is 100\n");
           }
       } else 
           System.out.print("False, stamina or bullets is less than 5\n");
       
       
       //Test case 3
        System.out.println("******************************************************************");
        System.out.println("\nTest case 3");
        //define input variables
        stamina = 80;
        bullets = 0;
        progression = 15;
        expResult = false;
        result = BeingAttacked.attacked(stamina, progression, bullets);
       assertEquals(result, expResult);
       if (result== true) {
           System.out.print("You beat the bad guys!\n");
           if (stamina + 10 <= 100) {
               System.out.print("Your stamina is " + (stamina + 10) + "\n");
           } else {
               System.out.print("Your stamina is 100\n");
           }
       } else 
           System.out.print("False, stamina or bullets is less than 5\n");
       

       //Test case 4
        System.out.println("******************************************************************");
        System.out.println("\nTest case 4");
        //define input variables
        stamina = 90;
        bullets = 20;
        progression = 8;
        expResult = true;
        result = BeingAttacked.attacked(stamina, progression, bullets);
        
       assertEquals(result, expResult);
       
       if (result== true) {
           System.out.print("You beat the bad guys!\n");
           if (stamina + 10 <= 100) {
               System.out.print("Your stamina is " + (stamina + 10) + "\n");
           } else {
               System.out.print("Your stamina is 100\n");
           }
       } else 
           System.out.print("False, stamina or bullets is less than 5\n");
       
       
       //Test case 5
        System.out.println("******************************************************************");
        System.out.println("\nTest case 5");
        //define input variables
        stamina = 15;
        bullets = 10;
        progression = 16;
        expResult = true;
        result = BeingAttacked.attacked(stamina, progression, bullets);
       assertEquals(result, expResult);
       
       if (result== true) {
           System.out.print("You beat the bad guys!\n");
           if (stamina + 10 <= 100) {
               System.out.print("Your stamina is " + (stamina + 10) + "\n");
           } else {
               System.out.print("Your stamina is 100\n");
           }
       } else 
           System.out.print("False, stamina or bullets is less than 5\n");
             
    }
    
}
