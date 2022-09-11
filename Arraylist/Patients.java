package Arraylist;

public class Patients {
    private String PatientName,PatientGender,PatientStatus,PatientAgeGroup;
    private int PatientID,PatientAge;

    public Patients(int pID, String pName, int pAge, String pAgeGroup, String pStatus, String pGender){
        this.PatientID = pID;
        this.PatientName = pName;
        this.PatientAge = pAge;
        this.PatientAgeGroup = pAgeGroup;
        this.PatientStatus = pStatus;
        this.PatientGender = pGender;
    }
    
    // SETTERS

    public int setID(int pID){
        this.PatientID = pID;
        return this.PatientID;
    }

    public String setName(String pName){
        this.PatientName = pName;
        return this.PatientName;
    }

    public int setAge(int pAge){
        this.PatientAge = pAge;
        return this.PatientAge;
    }

    public String setGender(String pGender){
        this.PatientGender = pGender;
        return this.PatientGender;
    }

    public String setAgeGroup(String pAgeGroup){
        this.PatientAgeGroup = pAgeGroup;
        return this.PatientAgeGroup;
    }
    
    public String setStatus(String pStatus){
        this.PatientStatus = pStatus;
        return this.PatientStatus;
    }
      
    // GETTERS

    public int getID(){
        return this.PatientID;
    }

    public String getName(){
    return this.PatientName;
    }

    public int getAge(){
    return this.PatientAge;
    }

    public String getGender(){
    return this.PatientGender;
    }

    public String getAgeGroup(){
    return this.PatientAgeGroup;
    }
    
    public String getStatus(){
    return this.PatientStatus;
    }
}
