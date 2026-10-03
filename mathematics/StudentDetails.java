package com.rr;
import java.io.*;
import java.io.Serializable;
class StudentDetails implements Serializable 
{   
    private static final long serialVersionUID = 1L;

     int id;
    private String Name;
    private String Course;
   
    
    public StudentDetails(int id , String Name, String course)
    {
        this.id = id ; 
        this.Name = Name;
        this.Course = course;
        
    }
    
    public void display()
    {
        System.out.println("ID       :     " + id);
        System.out.println("Name       :     " + Name);
        System.out.println("Course       :     " + Course);
       

        System.out.println("=====================================================");
    }
    
}