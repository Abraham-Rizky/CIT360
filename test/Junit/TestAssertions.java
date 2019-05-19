/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Junit;
import java.util.Arrays;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author rizky
 */
public class TestAssertions {
@Test
   public void testAssertions() {
      //test data
      String str1 = new String ("abc");
      String str2 = new String ("abc");
      String str3 = null;
      String str4 = "abc";
      String str5 = "abc";
		
      int val1 = 5;
      int val2 = 6;

      String[] expectedArray = {"one", "two", "three"};
      String[] resultArray =  {"one", "two", "three"};

      //Check that two objects are equal
      System.out.println("******************************************************************");
      System.out.println("\nTest case 1");
      assertEquals(str1, str2);
      if (str1.equals(str2) == true) {
           System.out.print("True\n");         
       } else 
           System.out.print("False\n");

      //Check that a condition is true
      System.out.println("******************************************************************");
      System.out.println("\nTest case 2");
      assertTrue (val1 < val2);
      if (val1 < val2) {
           System.out.print("True\n");         
       } else 
           System.out.print("False\n");
      
      //Check that a condition is false
      System.out.println("******************************************************************");
      System.out.println("\nTest case 3");
      assertFalse(val1 > val2);
      if (val1 > val2) {
           System.out.print("False\n");         
       } else 
           System.out.print("True\n");
      
       //Check that an object isn't null
       System.out.println("******************************************************************");
       System.out.println("\nTest case 4");
       assertNotNull(str1);
      if (str1 != null) {
           System.out.print("True\n");         
       } else 
           System.out.print("False\n");
      
      //Check that an object is null
       System.out.println("******************************************************************");
       System.out.println("\nTest case 5");
       assertNull(str3);
      if (str1==null) {
           System.out.print("False\n");         
       } else 
           System.out.print("True\n");
      
      //Check if two object references point to the same object
       System.out.println("******************************************************************");
       System.out.println("\nTest case 6");      
      assertSame(str4,str5);
      if (str4 == str5) {
           System.out.print("True\n");         
       } else 
           System.out.print("False\n");
      
      //Check if two object references not point to the same object
       System.out.println("******************************************************************");
       System.out.println("\nTest case 7");    
      assertNotSame(str1,str3);
       if (str1 != str3) {
           System.out.print("True\n");         
       } else 
           System.out.print("False\n");

      //Check whether two arrays are equal to each other.
       System.out.println("******************************************************************");
       System.out.println("\nTest case 8"); 
        assertArrayEquals(expectedArray, resultArray);
        if (Arrays.equals(resultArray,expectedArray)){
            System.out.print("True\n");         
        } else {
           System.out.print("False\n");          
        }
}    
}
