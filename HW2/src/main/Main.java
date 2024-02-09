package main;

public class Main {

public static void main(String args[])
  {
      StudentManager manager = new StudentManager(); 

      manager.readFromFile("studentData.txt");

      manager.printStudent();
      
      manager.searchStudentById(101);
      
      System.out.println("\n");
      
      Student Student1 = new Student(123, "John", 90);
      Student Student2 = new Student(123, "John", 90);
      
      if(Student1.equals(Student2)) {
    	  System.out.println("Student1 and Student2 are equal!");
      }
      else {
    	  System.out.println("Not equal");
      }
  }

}
