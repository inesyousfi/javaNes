/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atest;

/**
 *
 * @author Ines Yousfi
 */
class Employee extends person{
    double salary;
   
   Employee(String name , int age  ,double salary)
   {
       super(name , age);
       this.salary=salary;
   }
  public void setsalary(double salary)
   {
        this.salary=salary;
   }
   public double getsalary()
   {
       return salary;
   }
   public String toString()
   {
      return  super.toString()+" , The Salary is : "+salary; 
   }
}
