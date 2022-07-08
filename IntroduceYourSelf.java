import java.util.Scanner;

public class IntroduceYourSelf{
    public static void main(String... args)
    
    {   
             //Set Variables
     Scanner _scan = new Scanner(System.in);
     System.out.print("Your Name:");
     String fname = _scan.nextLine();
     System.out.print("Your Lastname: ");
     String lname = _scan.nextLine();
     System.out.print("Your Course?:");
     String course = _scan.nextLine();
     _scan.close();
     
     System.out.println(fname + " " + lname + " " + course);

    }
}