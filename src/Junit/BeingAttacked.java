/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Junit;

/**
 *
 * @author rizky
 */
public class BeingAttacked {
    
       public static boolean attacked(int stamina, int progression, int bullets) {
       if (stamina > 5 && bullets > 5) {
           if (progression % 5 != 0) {
                double staminaChance = stamina * 0.6;
                double chance = 20 + staminaChance;
                int num = 90;
                boolean isSuccessful = (num > chance);
                return isSuccessful;
           }
           else 
               return false;
       } else 
           return false;
   }
}
