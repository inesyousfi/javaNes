/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package school;

public class person {
String name;
int age;
person(String name , int age)
{
this.name=name;
this.age=age;
}
public void setname(String name)
{
this.name=name;
}
public void setage(int age)
{
this.age=age;
}
public String getname()
{
return name;
}
public int setname()
{
return age;
}
public String toString()
{
return "the name is : "+name+" , the age is : "+age;
}
}

