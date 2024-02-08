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
        cap = 100; 
        manageStudents = new Student[cap];
        index = 0; 
   }

   public void printStudent()
   {
    for (int i = 0; i < index; i++)
    {
        System.out.println(manageStudents[i]);
    }
   }


    public boolean addStudent(Student add)
    {
        if (index >= cap)
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


    public static void main(String args[])
    {
        StudentManager manager = new StudentManager(); 
        manager.readFromFile("studentData.txt"); 
        manager.printStudent();

    }

}
