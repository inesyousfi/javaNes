/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package foree;
import java.util.Scanner;
/**
 *
 * @author Ines Yousfi
 */
public class FOREE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        /*
        boolean is_smoker=true;
System.out.println(is_smoker);int n1=5;

int n2=4;
int n3=7;
int n4=12;
int result=n1+n2+n3+n4;
System.out.println("n1+n2+n3+n4 = "+result);
result=n1+n2*n3-n4;
System.out.println("n1+n2*n3-n4 = "+result);
result=(n1+n2)*(n3-n4);
System.out.println("(n1+n2)*(n3-n4) = "+result);
        
        */
        /*
        Scanner input = new Scanner(System.in);
System.out.println("please enter first number:");
int num1=input.nextInt();
System.out.println("please enter second number:");
int num2=input.nextInt();
int summation_result=num1+num2;
int subtraction_result=num1-num2;
int multiplication_result=num1*num2;
int division_result=num1/num2;
int remainder_result=num1%num2;
System.out.println("the summation result is :" + summation_result);
System.out.println("the subtraction result is :"+subtraction_result);
System.out.println("the multiplication result is :"+multiplication_result);
System.out.println("the division result is :"+division_result);
System.out.println("the remainder is :"+remainder_result);
        
        */
        /*
        Scanner input=new Scanner(System.in);
	System.out.println("enter first name: ");
	String firstname=input.next();
	System.out.println("enter last name: ");
	String lastname=input.next();
       System.out.println("enter  nikname: ");
       String nikname=input.next();
	String fullname=firstname+" "+lastname;
        System.out.println("your nikname is:"+nikname);
	System.out.println(fullname);
        */
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("enter first name");
        System.out.println("enter 2ed name");
        String firstname=input.next();
       char firstch= firstname.charAt(0);
        System.out.println(firstch+"    first ch");
       int len = firstname.length();
        System.out.println("length  "+len);
        */
        Scanner input=new Scanner(System.in);
System.out.println("enter number of students");
int students_num=input.nextInt();
String []names=new String[students_num];
int []marks=new int[students_num];
  
int total_marks=0, highest_mark_index=0 ,lowest_mark_index=0;
int i=0;
int temp_mark;
while(i10 || temp_mark<0)
  System.out.println("invalid entry");
  else
  {
  marks[i]=temp_mark;
  flag=false;
  }
      
  }
  
  
  
  total_marks=total_marks+marks[i];
  if(marks[i]>marks[highest_mark_index])
  highest_mark_index=i;

  if(marks[i]
        
        
        
        
        
        
        
    }
    
}
