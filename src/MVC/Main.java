/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author rizky
 */
public class Main {
   public static void main(String[] args) {

      //fetch student record based on his roll no from the database
      Model model  = retriveStudentFromDatabase();

      //Create a view : to write student details on console
      View view = new View();

      Controller controller = new Controller(model, view);

      controller.updateView();

      //update model data
      controller.setStudentName("John");

      controller.updateView();
   }

   private static Model retriveStudentFromDatabase(){
      Model student = new Model();
      student.setName("Robert");
      student.setRollNo("10");
      return student;
   }    
}
