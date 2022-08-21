import java.util.*;
public class javaoop{
    final int  a = 69;
    int b = 420;
    String name = "John Paul";
    public static void main(String []args){
        try{
        javaoop jav = new javaoop();
        System.out.printf("%s Can we do %d %d",jav.name,jav.a, jav.b);
        }
        catch(Exception ex){
            System.out.print(ex.getMessage());
        }
    }
}

class javaoop2{ 
    static void myMethod(int age){
        //Scanner scan = new Scanner(System.in);
        //age = scan.nextInt();
        System.out.println("The age is: " + age);
        
    }
    
    public void myMethod2(String name){
    //Scanner scan = new Scanner(System.in);
    //name = scan.nextLine();  
    System.out.print("The name is: " + name);
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        javaoop2 kagome = new javaoop2();
        System.out.print("Enter Age: ");
        myMethod(scan.nextInt());
        
        scan.nextLine();
        
        System.out.print("Enter Name: ");
        kagome.myMethod2(scan.nextLine());
       scan.close();
    }
}
