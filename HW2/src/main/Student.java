package main;
import java.util.Objects;

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
