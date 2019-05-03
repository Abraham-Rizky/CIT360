/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT360;
import java.util.*;

/**
 *
 * @author rizky
 */
public class JavaCollection {
    public static void main(String[] args) {
        //Set Collection
        System.out.println("\nA. Set Collection :"); 
        //A Set is a Collection that cannot contain duplicate element
        List<Integer> listNumbers = Arrays.asList(3, 9, 1, 4, 7, 2, 5, 3, 8, 9, 1, 3, 8, 6);
        System.out.println("Numbers:");
        System.out.println(listNumbers);
        Set<Integer> uniqueNumbers = new HashSet<>(listNumbers);
        System.out.println("Unique numbers:");
        System.out.println(uniqueNumbers); 
        
        //List Collection
        System.out.println("\nB. List Collection :"); 
        //A list is an ordered Collection and may contain duplicate.
        List<String> listStrings = new ArrayList<>();
        listStrings.add("One");
        listStrings.add("Two");
        listStrings.add("Three");
        listStrings.add("Four");
        System.out.println(listStrings);        
        //Add another duplicate element
        listStrings.add("One");
        System.out.println(listStrings);
        //Print the second element of the list
        System.out.println(listStrings.get(1));


        
        //Map Collection
        System.out.println("\nC. Map Collection :"); 
        //A Map is an object that maps keys to values
        Map<String, String> mapContacts = new LinkedHashMap<>();
        //Using put operation
        mapContacts.put("0945678912", "Mary");
        mapContacts.put("0169238175", "Tom");
        mapContacts.put("0904891321", "Peter");
        mapContacts.put("0981127421", "John");
        System.out.println(mapContacts);
        //Using get operation to get a value
        String value = mapContacts.get("0169238175");
        System.out.println(value);

        //Queue Collection
        System.out.println("\nD. Queue Collection :"); 
        //A Queue is a collection for holding elements prior to processing
        //Queues typically, but not necessarily, order elements in a FIFO (first-in-first-out) manner
        List<String> listNames = Arrays.asList("Alice", "Fred", "Cole", "Dale", "Eric", "Frank");
        Queue<String> queueNames = new LinkedList<>(listNames);
        queueNames.add("Mary");
        queueNames.add("John");
        System.out.println(queueNames);
        
        //Tree Collection
        System.out.println("\nE. Tree Collection :");
        // Elements get stored in default natural 
        TreeSet<String> ts1 = new TreeSet<>(); 
        // Elements are added using add() method 
        ts1.add("A"); 
        ts1.add("D"); 
        ts1.add("C"); 
        // Duplicates will not get insert 
        ts1.add("C"); 
        // Sorting Order(Ascending) 
        System.out.println(ts1); 
    }
  
}
