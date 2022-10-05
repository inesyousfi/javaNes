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
public abstract class shape {
    protected String color;
    public shape(String c)
    {
        color=c;
    }
    
public abstract int getarea();
public abstract String toString();

public String getcolor(){

return color;
}
}
    

