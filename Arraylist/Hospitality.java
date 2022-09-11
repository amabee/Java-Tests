package Arraylist;
import java.util.*;

public class Hospitality {
    private List<Patients> patientLists = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static int pID, pAge;
    static String pName,pAgeGroup,pStatus,pGender;
    public static Hospitality hs = new Hospitality();
    static int choice;
    public static void main(String[] args) {
        RunMe();
    }

    private Patients addpatients(){
        System.out.print("Enter Patient ID: ");
        pID = scan.nextInt();
        scan.nextLine();
       
        System.out.print("Enter Patient Name: ");      
        pName = scan.nextLine();
       
        System.out.print("Enter Patient Age: ");
        pAge = scan.nextInt();
        
        System.out.print("Enter Patient Gender: ");
        scan.nextLine();
        pGender = scan.nextLine();
        
        System.out.print("Enter Patient Status: ");
        pStatus = scan.nextLine();

        if(pAge >=0 && pAge <= 14){
            pAgeGroup = "Child";
        }
        else if(pAge >=15 && pAge <=24){
            pAgeGroup = "Teen";
        }
        else if(pAge >=25 && pAge <= 40){
            pAgeGroup = "Adult";
        }
        else{
            pAgeGroup = "Senior";
        }

        Patients patientInfo = new Patients(pID, pName, pAge, pAgeGroup, pStatus, pGender);
        patientLists.add(patientInfo);
        System.out.print("\u001B[32m"+"Patient Information Saved!" +"\u001B[0m"+ "\n \n");
        return patientInfo;
    }

    private void printThemPatients(){
        for(Patients patient : patientLists){
            System.out.print("ID: " + patient.getID() 
                                + "\nPatient Name: " + patient.getName()
                                + "\nPatient Age: " + patient.getAge()
                                + "\nPatient Age Group: " + patient.getAgeGroup()
                                + "\nPatient Gender: " + patient.getGender()
                                + "\nPatient Status: " + patient.getStatus()
                                + "\n \n \n");
        }
    }

    private void UpdateMe(){  
        hs.printThemPatients();
        System.out.print("What to Update? \n[1] Change ID \n[2] Update Name \n[3] Update Status \nChoice: ");
            choice = scan.nextInt();
            switch(choice){
                case 1 : System.out.print("Whose ID to change?: ");
                         scan.nextLine();
                         pName = scan.nextLine();
                        System.out.print("Change to?: ");
                        int newID = scan.nextInt();
                        for(Patients patient : patientLists){
                            if(patient.getName().equalsIgnoreCase(pName)){
                                patient.setID(newID);
                            }
                        }
                         break;
            
                case 2 : System.out.print("Whose Name to change?: ");
                        scan.nextLine();
                        pName = scan.nextLine();
                        System.out.print("Change to?: ");
                        String newName = scan.nextLine();
                        for(Patients patient : patientLists){
                            if(patient.getName().equalsIgnoreCase(pName)){
                                patient.setName(newName);
                            }
                        }
                        break;

                case 3 : System.out.print("Whose status to change?: ");
                        scan.nextLine();
                        pName = scan.nextLine();
                        System.out.print("Change to?: ");
                        String newStatus = scan.nextLine();

                        for(Patients patient : patientLists){
                            if(patient.getName().equalsIgnoreCase(pName)){
                                patient.setStatus(newStatus);
                            }
                        }
                        break;
                 }
    }
    
    private void DeleteThemPatient(String pName){
        System.out.print("Whose data to delete?: ");
        scan.nextLine();
        pName = scan.nextLine();
       Iterator<Patients> itr = patientLists.iterator();
       while(itr.hasNext()){
        if(itr.next().getName().equalsIgnoreCase(pName)){
            itr.remove();
            System.out.print("Success!");
            break;
        }
       }
    }

    private void SearchThemPatient(String pName){
        System.out.print("Patient name to lookup: ");
        scan.nextLine();
        pName = scan.nextLine();

        for(Patients patient : patientLists){
            if(patient.getName().equalsIgnoreCase(pName)){
                System.out.print("\u001B[42m"+"Found!" +"\u001B[0m"+"\n");
            }
        }
    }

    public static void RunMe(){   
       while(choice != 6){
        System.out.print("Enter Choices: \n[1] to add a patient \n[2] to print patient information \n[3] Update Patient Info \n[4] Remove a Patient \nSelect Option: ");
        choice = scan.nextInt();
        switch(choice){
            case 1: hs.addpatients(); break;
            case 2: hs.printThemPatients(); break;
            case 3: hs.UpdateMe(); break;
            case 4: hs.DeleteThemPatient(pName); break;
            case 5: hs.SearchThemPatient(pName); break;
            case 6: System.exit(0);
        }
    }
}

}
