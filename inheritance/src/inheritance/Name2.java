/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author Ines Yousfi
 */
public class Name2 extends Name1{
    @Override 
    public void printName(int b){
        System.out.println("my name is name2");
    }
    public static void main(String[]args){
        Name2 n1=new Name2();
        n1.printName(1);
    }
}
