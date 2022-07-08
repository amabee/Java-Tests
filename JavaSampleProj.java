import java.util.Scanner;

public class JavaSampleProj{
    
    /*
     * This is a sample java console program
     * enumerates the multiplication table
     * from user's desired number
     */
    public static void main(String... args){
      
        Scanner _scan = new Scanner(System.in);
        System.out.print("What multiplication table do you want to see?: ");
        int i = _scan.nextInt();
        System.out.print("From?: ");
        int b = _scan.nextInt();
        System.out.print("To?: ");
        int x = _scan.nextInt();
        _scan.close();
        
      while(b<=x){
        System.out.println(i + "*" + b + "=" + i*b);
        b++;
      }
        }
  
}
