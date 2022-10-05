/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package school;

public class employee extends person {
double salary;
employee (  String name , int age , double salary)
{
super(name , age);
this.salary=salary;
}
public void setsalary ( double salary)
{
this.salary=salary;
}
public double getsalary()
{
return salary;
}
public String toString ()
{
return super.toString()+", this salary is : "+salary;
}
}
