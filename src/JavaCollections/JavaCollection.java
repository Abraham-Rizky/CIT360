 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCollections;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

/**
 *
 * @author rizky
 */
public class JavaCollection {
    public static void main(String[] args) {
        //Set Collection
        System.out.println("\nA. Set Collection :"); 
        //A Set is a Collection that cannot contain duplicate element  
        //Add 14 new elements with duplicates
        List<Integer> listNumbers = Arrays.asList(9, 1, 4, 7, 2, 5, 3, 4, 9, 1, 3, 8, 6, 10);
        System.out.println("Numbers:");
        System.out.println(listNumbers);
        Set<Integer> uniqueNumbers = new HashSet<>(listNumbers);
        System.out.println("Set Collection cannot contain duplicate:");
        System.out.println(uniqueNumbers); 
        
        // remove number 9 from set
        System.out.println("Collection before remove: "+uniqueNumbers);
        uniqueNumbers.remove(9);      
        System.out.println("Collection after remove number 9 from the set: "+uniqueNumbers); 
        
        //Get total number of elements in a Set:
        System.out.println("\nNumber 9 has been removed from the set.");
        System.out.printf("The set now has %d elements.", uniqueNumbers.size());
        System.out.println("\n");
        
        /*******************************************************************/
        //List Collection
        System.out.println("\nB. List Collection :"); 
        //A list is an ordered Collection based on insertion order and may contain duplicate.
        List<String> listStrings = new ArrayList<>();
        listStrings.add("Apple");
        listStrings.add("Banana");
        listStrings.add("Cantaloupe");
        listStrings.add("Durian");
        System.out.println(listStrings);        
        //Add another duplicate element
        listStrings.add("Apple");
        System.out.println(listStrings);
        //Print the second element of the list
        System.out.println("\nThe second element is :" + listStrings.get(1));
        
        //updating element in a list by specifying the index, this case is the third element
        listStrings.set(2, "Grape");
        System.out.println("\nUpdated list: "+ listStrings);
        
        //Iterating over elements in a list
        listStrings.forEach((element) -> {
            System.out.println(element);
        }); 
        
        Collections.sort(listStrings);
        System.out.println("\nUpdated sorted list: "+ listStrings);

        /*******************************************************************/              
        //Map Collection
        System.out.println("\nC. Map Collection :"); 
        //A Map is an object that maps keys to values
        Map<String, String> mapContacts = new LinkedHashMap<>();
        //Using put operation
        mapContacts.put("2083090000", "Ryan");
        mapContacts.put("2083090001", "Kris");
        mapContacts.put("2083090002", "Rizky");
        mapContacts.put("2083090003", "Abraham");
        System.out.println(mapContacts);
        
        //Using get operation to get a value
        String value = mapContacts.get("2083090002");
        System.out.println("\nPhone number 2083090002 belong to:" + value);
        
        Map<Integer, String> mapHttpErrors = new HashMap<>();
        mapHttpErrors.put(400, "Bad Request");
        mapHttpErrors.put(304, "Not Modified");
        mapHttpErrors.put(200, "OK");
        mapHttpErrors.put(301, "Moved Permanently");
        mapHttpErrors.put(500, "Internal Server Error");
        //Getting a value associated with a specified key
        String status301 = mapHttpErrors.get(301);
        System.out.println("\n301: " + status301);
        
        //Checking if map conatins a specified key
        if (mapHttpErrors.containsKey("600")) {
            System.out.println("Http status 600");
        } else{ 
            System.out.println("\nKey 600 is not found\n");
        }
        //Iterating over keys and values 
        for (Integer name : mapHttpErrors.keySet())  
            System.out.println("key: " + name); 
        System.out.println("\n");
        for (String url : mapHttpErrors.values())  
            System.out.println("value: " + url); 
        
        /*******************************************************************/        
        //Queue Collection
        System.out.println("\nD. Queue Collection :"); 
        //A Queue is a collection for holding elements prior to processing
        //Queues typically, but not necessarily, order elements in a FIFO (first-in-first-out) manner
        Queue<Integer> queueNumbers = new ArrayBlockingQueue<>(3);
        queueNumbers.add(1);
        queueNumbers.add(2);
        queueNumbers.add(3);
        //This will not add 4 to the queue since the array size has been declared to be only 3
        try {
          queueNumbers.add(4);
        }
        catch(Exception e) {
        }
        System.out.println("List of queue collections" + queueNumbers + "\n");
        
        //Iterating through queue collection
        for (Integer name : queueNumbers) {
            System.out.println(name);
        }
        //Adding a new element by first removing head of the queue
        System.out.println("The head has been removed: " + queueNumbers.poll());
        System.out.println("List of queue collections" + queueNumbers + "\n");
        //Add a new element
        queueNumbers.add(4);
        System.out.println("List of queue collections" + queueNumbers + "\n");
        //Since queue uses FIFO the new head is now the previous second element in the queue
        System.out.printf("The new head of the queue is:" + queueNumbers.peek() + "\n");


        /*******************************************************************/        
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
        
        // Clearing the TreeSet using clear() method 

        TreeSet<String> tree = new TreeSet<String>(); 
        tree.add("I"); 
        tree.add("will"); 
        tree.add("be"); 
        tree.add("back"); 
        tree.add("!"); 
        //Element will be sorted in default natural not FIFO
        System.out.println("\nOriginal treeset" + tree); 
        //Check the first element in the treeset
        System.out.println("\nThe first element is:" + tree.first()); 


        tree.clear(); 
        System.out.println("\nNew treeset after deletion" + tree); 
        


    }
  
}
