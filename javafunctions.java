import java.util.*;
public class javafunctions{
    
    //GLOBAL VARIABLES
    static Scanner scan = new Scanner(System.in);
    static String name;
    static int age;
    static String agegroup;
    static int bodyTemp;
    static String bodytempStat;
    static int id;
    public static void main(String[] arsgs){
        mainfunction();
    }
    public static int ID(){
        System.out.print("Enter ID: ");
         id = scan.nextInt();
            return id;
        }
        
    public static String namE(){
        System.out.print("Enter your name: ");
        name = scan.nextLine();
        return name;
    }
    public static int Age(){
        System.out.print("Enter you age: ");
        age = scan.nextInt();
        return age;
        
    }
    public static String ageGroup(){
        if(age >= 0 && age <=14){
            agegroup = "Child";
        }
        else if(age >= 15 && age <=24)
        {
            agegroup = "Teen";
        }
        else{
            agegroup = "Adult";
        }
        return agegroup;
    }
    public static int bodyTemp(){
        System.out.print("Enter Body Temperature: ");
        bodyTemp = scan.nextInt();
        return bodyTemp;
    }
    public static String bodyStat(){
        if(bodyTemp >= 34 && bodyTemp <= 36){
            bodytempStat = "Call a doctor";
        }
        else if(bodyTemp >= 37 && bodyTemp <= 39){
            bodytempStat = "Normal";
        }
        else if(bodyTemp >= 40 && bodyTemp <=42){
            bodytempStat = "Sick";
        }
        else{
            bodytempStat = "Unable to identify";
        }
        return bodytempStat;
    }

    public static void mainfunction(){
        System.out.println("ID: " + ID() + "Name: " + namE() + "\nAge: " + Age() + "\nAge Group: " + ageGroup() + "\nBody Temperature: " + bodyTemp() + "\nBody Temperature Status: " + bodyStat());
    }
}