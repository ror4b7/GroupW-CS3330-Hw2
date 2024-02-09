package main;

public class Main {

public static void main(String args[])
  {
      StudentManager manager = new StudentManager(); 

      manager.readFromFile("studentData.txt");

      manager.printStudent();
  	
  }

}
