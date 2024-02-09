package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentManager 
{
    private Student manageStudents[]; 
    private int index; 
    private int cap; 


   StudentManager()
   {
        cap = 100; //Intializes the max amount of Students the manager can hold 
        manageStudents = new Student[cap]; //Creates the array that holds the student objects
        index = 0; //Sets the index where a new student object would be inserted 
   }

   
   public void printStudent()
   {
    for (int i = 0; i < index; i++)
    {
        System.out.println(manageStudents[i]);
    }
   }


   //Adds student 
    public boolean addStudent(Student add)
    {
        if (index >= cap) //Checks to make
        {
            return false; 
        }
        manageStudents[index] = add; 
        index += 1; 
        return true; 
    }


    

    public boolean readFromFile(String filename)
    {
        try {
            File file = new File(filename);
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                Student newStudent = new Student(line); 
                addStudent(newStudent);
            }

            scan.close();
            return true;
        } 
        catch (FileNotFoundException e) {
            return false;
        }
    } 
    
// Search for student by ID
    
    public boolean searchStudentById(int id) {
        // Return false immediately if 'index' or 'id' is not positive.
        if(id <= 0) {
        	System.out.print("Invalid ID");
        	return false;
        }
        if(index == 0) {
        	System.out.println("No students in array");
            return false;
        }

        // Loop through the 'manageStudents' array up to 'index'.
        for(int i = 0; i < index; ++i) {
            // Check if the current student's ID matches the search ID.
            if(this.manageStudents[i].equals(id)) {
                // Print the matching student's details and return true.
                System.out.println(this.manageStudents[i].toString());
                return true;
            }
        }

        // If no match is found, indicate that and return false.
        System.out.println("Student ID not found");
        return false;
    }
    
    public boolean updateStudentGradebyID(int id, double grade)
    {
    	
    	//Ensure that the given ID exists
    	if(searchStudentById(id) == true)
    	{
    		
    		//Loop through the student array to find the index of the given ID
            for(int i = 0; i < index; i++) 
            {
                //Check if the parameter id matches the index id
                if(this.manageStudents[i].equals(id)) 
                {
                	
                	//Print pre-update information
                	System.out.print("Student information before grade update: ");
                    System.out.println(this.manageStudents[i].toString());
                    
                	//Update student grade with the provided double
                	this.manageStudents[i].setGrade(grade);
               
                	//Print post-update information
                	System.out.print("Student information after grade update: ");
                    System.out.println(this.manageStudents[i].toString());
                    
                    return true;
                	
                }
            }
    	
    	}
    	
    	//Return false and print message if ID cannot be found 
        System.out.println("Student ID not found");
        return false;

    	
    }



//    public static void main(String args[])
//    {
//        StudentManager manager = new StudentManager(); 
//
//        manager.readFromFile("studentData.txt");
//
//        manager.printStudent();
//    	
//    }

}
