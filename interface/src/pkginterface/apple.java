/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkginterface;

/**
 *
 * @author user
 */
public class apple extends fruit implements edible {
@Override
public String howtoeat(){

return "make apple cider";

}
public static void main(String []args){
apple app=new apple();
System.out.println(app.a);
System.out.println(app.howtoeat());
}
}
