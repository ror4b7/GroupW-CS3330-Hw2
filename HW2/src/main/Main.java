package main;

public class Main {

public static void main(String args[])
  {
      StudentManager manager = new StudentManager(); 

      manager.readFromFile("../studentData.txt");

      //manager.printStudent();

      //Kaitlyn's testing pt 1 - displaying students from studentData pre-update
      System.out.println("\nDisplaying students from studentData pre-update:");
      manager.displayStudents();
      
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
      
      //Kaitlyn's testing pt 2
      StudentManager emptyManager = new StudentManager();
      System.out.println("\nTesting the displayStudents method:");
      //Testing an empty array
      System.out.println("\nDisplaying an empty StudentManager:");
      emptyManager.displayStudents();
      //Testing txt file
      System.out.println("\nDisplaying students from studentData post-update:");
      manager.displayStudents();
      
      
  }

}
