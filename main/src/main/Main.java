/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package main;
import java.util.Scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Scanner scn=new Scanner (System.in);
int x,y;
try{
System.out.println("enter X : " );
x=scn.nextInt();
System.out.println("enter y : " );
y=scn.nextInt();
System.out.println("result : " + ( x/y ) );
}
catch(Exception E){
System.out.println("wrong") ;
}
finally{
System.out.println("open page.....");
}
    }
}
