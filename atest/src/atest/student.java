/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atest;

/**
 *
 * @author Ines Yousfi
 */

class Student extends person{
    double GPA;
   Student(String name , int age  ,double GPA)
   {
       super(name , age);
       this.GPA=GPA;
   }
   public void setGPA(double GPA)
   {
        this.GPA=GPA;
   }
   public double getGPA()
   {
       return GPA;
   }
    public String toString()
   {
      return  super.toString()+", The GPA is : "+GPA; 
   }
}

