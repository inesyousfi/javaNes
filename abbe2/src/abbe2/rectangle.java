/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abbe2;

/**
 *
 * @author user
 */
public class rectangle  extends shape {
    protected int length;
       protected int widt;
       
public rectangle( String c ,int l, int s)
{
    super(c);
    length=1;
    widt= s;

      
}
  @Override
  public int getarea(){
      return length*widt;
  }
   @Override
public String toString(){
    return "rectangle color is"+color+"the length is"+length+"the width is"+widt;
}  
}
