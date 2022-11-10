/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atest;

/**
 *
 * @author Ines Yousfi
 */
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
   public  String getname()
   {
       return name;
   }
   public int setname()
   {
       return age;
   }
    public String toString()
   {  
      return "The Name Is :"+name+" ,The Age is: "+age;   
   }  
}
    

