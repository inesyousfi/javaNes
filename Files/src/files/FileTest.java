/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package files;
import java.io.*;
import java.util.*;
/**
 *
 * @author user
 */
public class FileTest {

public static void main(String[] args) throws Exception {

File file = new File ("te.txt");
System.out.println("what the file name?"+file.getName());
System.out.println("the file has"+ file.length()+"bytes");
System.out.println("can it be read"+file.canRead());
System.out.println("can it be written"+file.canWrite());
System.out.println("is it directory"+ file.isDirectory());
System.out.println("is it absolute"+file.isAbsolute());
System.out.println("is is hidden"+file.isHidden());
System.out.println("absoulte path is"+file.getAbsolutePath());
System.out.println("last modified on "+ new Date(file.lastModified()));

}
}


