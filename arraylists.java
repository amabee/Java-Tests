import java.util.ArrayList;
import java.util.Scanner;

public class arraylists{
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Integer> id = new ArrayList<Integer>();
    static ArrayList<String> name = new ArrayList<String>();
    static ArrayList<Integer> age = new ArrayList<Integer>();
    static ArrayList<String> ageGroup = new ArrayList<String>();
    static ArrayList<String> gender = new ArrayList<String>();

    
    public static void main(String[]args) {
        while(true){
            System.out.print("[1] Add a user \n[2] Delete a user \n[3] Update a user \n[4] Show Userlist \nChoice: ");
            int a = scan.nextInt();
            switch(a){
                case 1: Add(); 
                break;
                case 2: Delete(); 
                break;
                case 3: Update();
                 break;
                case 4: PrintUsers();
                 break;
            }
        }
    }

    public static void Add(){
        System.out.print("Enter ID: ");
        id.add(scan.nextInt());
        scan.nextLine();
        System.out.print("Enter Name: ");
        name.add(scan.nextLine());
        System.out.print("Enter Age: ");
        age.add(scan.nextInt());
        scan.nextLine();
        System.out.print("Enter Gender: ");
        gender.add(scan.nextLine());

        for(int agegroup : age){
            if(agegroup >=0 && agegroup <=14){
                ageGroup.add("Child");
            }
            else if(agegroup >=15 && agegroup <=24){
                ageGroup.add("Teen");
            }
            else if(agegroup >=25 && agegroup <=60){
                ageGroup.add("Adult");
            }
            else{
                ageGroup.add("Senior");
            }
        }
    }

    public static void Delete(){
        System.out.print("Who to remove?: ");
        int rmuser = scan.nextInt();
        id.remove(rmuser);
    }

    public static void Update(){
        PrintUsers();
        for(int i = 0; i<id.size(); i++){
            System.out.print("Select System ID to update: ");
            int sysid = scan.nextInt();
            scan.nextLine();
            System.out.print("Change what?");
            String choice = scan.nextLine();
           
            if(choice.equals("id")){
                System.out.print("Change to?: ");
                Integer newID = scan.nextInt();
                id.set(sysid,newID);
                break;
            }
            else if(choice.equals("name")){
                System.out.print("Change to?: ");
                String newName = scan.nextLine();
                name.set(sysid, newName);
                break;
            }
            else if(choice.equals("age")){
                System.out.print("Change to?: ");
                int newAge = scan.nextInt();
                age.set(sysid, newAge);
                break;
            }
        }
    }

    public static void PrintUsers(){
        for(int index = 0; index<id.size(); index++){
        System.out.println("System ID: "+ index +"\nID: " + id.get( index ) + "\nName: " +name.get( index ) +"\nAge: " + age.get(index) + "\nAge Group: " + ageGroup.get(index) + "\nGender: " + gender.get(index));
        }
        
     }
}  

