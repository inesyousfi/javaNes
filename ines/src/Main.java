
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String name[]=new String[4];
        int degree[]=new int[4];
        for (int i=0;i<4;i++) {
            System.out.println("enter name:");
            name[i] = in.next();
            System.out.println("enter degree:");
            degree[i] = in.nextInt();
        }
        System.out.println("name"+"***"+"degree");
        for(int j=0 ; j < name.length ; j++)
        {
            System.out.println(name[j] + "***" + degree[j]);
        }



    }
}

