/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package school;

public class student extends person{
double gpa;
 student(String name , int age, double gpa)
{
super(name,age);
this.gpa=gpa;
}
public void setgpa(double gpa)
{
this.gpa=gpa;
}
public double getgpa()
{
return gpa;
}
public String toString()
{
return super.toString()+", the gpa is : "+gpa;
}
}
