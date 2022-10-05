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
public class teacher {
     private String name;
     private double salary;
     public teacher(String name,double salary){
         this.name=name;
         this.salary=salary;
     }
     public void setname(String name){
         this.name=name;
     }
     public String getname(){
         return name;
     }
     public void setsalary(double salary){
         this.salary=salary;
     }
      public  double getsalary(){
         return salary;
     }
      public String toString(){
          return"the  teacher name  is"+name+"the salary is"+salary;
      }
    }

