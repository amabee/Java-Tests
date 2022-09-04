import java.util.*;
public class functionsArray{
   static Scanner scan = new Scanner(System.in);
    static int id[];
    static String name[];
    static int age[];
    static String ageGroup[];
    static String department[];
    static String status[];
    static int patientCount;
    static int i;
    static int a;
    static int b;
    static int c;
    static int d;
    public static void main(String []args){
        RunMe();
        while(true){
            System.out.print("Want to continue?. Press y to continue and press x to exit: ");
            String cont = scan.next();
            if(cont.equals("x"))
            {
                break;
            }
            else if(cont.equals("y")){
                RunMe();
            }
            else{
                continue;
            }
        }
    }
    public static void mainFunction(){
       while(true){
        System.out.print("Enter number of Patients: ");
        try{
            patientCount = scan.nextInt();
            if(patientCount == 0){
                continue;
            }
            else{  
                id = new int[patientCount];
                for(i = 0; i<id.length; i++){
                    System.out.print("Enter ID: ");               
                    id[i] = scan.nextInt();
                  }  
                  scan.nextLine();   
                
                name = new String[patientCount];
                for(i = 0; i<name.length; i++){
                    System.out.print("Enter Name: ");               
                    name[i] = scan.nextLine();
                }

                age = new int[patientCount];
                ageGroup = new String[patientCount];
                for(i = 0; i<age.length; i++){
                    System.out.print("Enter Age: ");
                    age[i] = scan.nextInt();

                    if(age[i] >=0 && age[i] <=14){
                        ageGroup[i] = "child";
                    }
                    else{
                        ageGroup[i] = "adult";
                    }
                }
                department = new String[patientCount];
                for(i=0; i<department.length; i++){
                    System.out.print("Select the Department: '1' for E.R , '2' for I.C.U: ");
                    int dept = scan.nextInt();
                    switch(dept){
                        case 1:
                        department[i] = "E.R";
                        break;

                        case 2:
                        department[i] = "I.C.U";
                        break;

                        default:
                        department[i] = "No such Department. Please try again";
                    }
                }

                status = new String[patientCount];
                for(i=0; i<status.length; i++){
                    System.out.print("Select the Status: '1' for Emergency , '2' for Normal '3' for Critical: ");
                    int dept = scan.nextInt();
                    switch(dept){
                        case 1:
                        status[i] = "Emergency";
                        break;

                        case 2:
                        status[i] = "Normal";
                        break;
                        case 3:
                        status[i] = "Critical";
                        break;

                        default:
                        status[i] = "No such Department. Please try again";
                        break;
                    }
                }

                break;
            }
       }
       catch(Exception ex){
        System.out.println(ex.getLocalizedMessage());
       }
    }
    }
    public static void RunMe(){
        mainFunction();
        for(a = 0; a<i; a++){
        System.out.println("ID: " + id[a] +"\nName: " + name[a] + "\nAge: " + age[a] + "\nAge Group: " + ageGroup[a] + "\nDepartment: " + department[a] + "\n");        
        }
    }
}