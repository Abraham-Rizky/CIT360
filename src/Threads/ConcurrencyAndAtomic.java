/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author rizky
 */
public class ConcurrencyAndAtomic {
static class CounterAtomic {
    
      private AtomicInteger c = new AtomicInteger(0);

      public void increment() {
         c.getAndIncrement();
      }

      public int value() {
         return c.get();
      }
   }

   static class Counter {
      private int c = 0;

      public void increment() {
         c++;
      }

      public int value() {
         return c;
      }
   }
   
   public static void main(final String[] arguments) throws InterruptedException {
      final Counter counter = new Counter();
      final CounterAtomic counterAtomic = new CounterAtomic();
      
      //10000 threads with concurrency
      for(int i = 0; i < 10000 ; i++) {

         new Thread(new Runnable() {
            public void run() {
               counter.increment();
            }
         }).start(); 
      }  
    
      //10000 threads with Atomic Variable
      for(int i = 0; i < 10000 ; i++) {

         new Thread(new Runnable() {
            public void run() {
               counterAtomic.increment();
            }
         }).start(); 
      } 
      
      Thread.sleep(500);
      System.out.println("Final number from concurrency(should be 10000): " + counter.value());
      System.out.println("Final number from Atomic (should be 10000): " + counterAtomic.value());

   }    
}
