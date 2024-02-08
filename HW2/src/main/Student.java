package main;

public class Student {

    private int id; 
    private String name; 
    private double grade; 

    Student(int id, String name, double grade)
    {
        this.id = id; 
        this.name = name; 
        this.grade = grade; 
    }

    Student(String row)
    {
        String line[] = row.split("\\s+"); 

        id = Integer.parseInt(line[0]);
        grade  = Double.parseDouble(line[line.length - 1]); 
        name = "";
        for (int i =0; i < line.length; i++)
        {
            if (line[i].equals(Integer.toString(id)) == false && line[i].equals(Double.toString(grade)) == false)
            {
                name += line[i]; 
                name += " ";
            }
        }

    }

    @Override
    public String toString() 
    {
        return "Name: " + name + " ID: " + id + " Grade: " + grade; 
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return this.grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    

    



}
