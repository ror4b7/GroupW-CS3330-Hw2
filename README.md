Instructions to run program: 
- Clone/fork project to local machine
- Import the HW2 folder into your eclipse IDE
- Run the Main.java file

Brief Program Overview: 
This program reads lines of data from a file (studentData.txt) into an array and calls a series of methods that deal the the student data. 
First a StudentManager object (defined in StudentManager.java) is instantiatedthen the object method readFromFile(../studentData.txt) is used to read from the file
into a Student array. (Note: The Student object is also define in this program in Student.java). The StudentManager class contains several methods
that deal with the Student array. These methods are displayStudents(), searchStudentByID(), and updateStudentByID(). These are called in main
to demonstare their use.

Constaints:
- The Student array can contain a maximum of 100 students. This can be changed in the StudentManager class
