package main;

public class Main {

public static void main(String args[])
  {
      StudentManager manager = new StudentManager(); 

      manager.readFromFile("studentData.txt");

      manager.printStudent();
      
      System.out.println("\n");
      System.out.println("Testing the searchStudentByID method:");
      manager.searchStudentById(105);
      
      //Rachel's testing
      System.out.println("\nTesting the updateStudentGradebyID method:");
      //Testing with a valid ID
      System.out.println("\nTesting with a valid ID:");
      manager.updateStudentGradebyID(105, 98.2);
      //Testing with an invalid ID
      System.out.println("\nTesting with an invalid ID:");
      manager.updateStudentGradebyID(999, 85.0);
      
      
      
  }

}
