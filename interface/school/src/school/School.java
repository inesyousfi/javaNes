/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package school;

/**
 *
 * @author user
 */
public class School {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
employee e = new employee ("ahmed", 26,10000.0);
student s = new student ("omar", 21,4.25);
      
System.out.println( e.toString() );
System.out.println( s.toString() );
    }

}
