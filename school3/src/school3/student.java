/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school3;

/**
 *
 * @author user
 */
public class student {
    private String name;
     private double GPA;
     public student(String name,double GPA){
         this.name=name;
         this.GPA=GPA;
     }
     public void setname(String name){
         this.name=name;
     }
     public String getname(){
         return name;
     }
     public void setGPA(double GPA){
         this.GPA=GPA;
     }
      public  double getGPA(){
         return GPA;
     }
      public String toString(){
          return"the name of student is"+name+"the gpa is"+GPA;
      }
    }
    

