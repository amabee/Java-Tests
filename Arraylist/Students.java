package Arraylist;
public class Students {
    private int id, age;
    private String name, gender, course;

    public Students(int Id, String Name, int Age, String Gender, String Course){
        this.id = Id;
        this.name = Name;
        this.age = Age;
        this.gender = Gender;
        this.course = Course;
    }

    public int setID(int Id){
        this.id = Id;
        return this.id;
    }

    public String setName(String Name){
        this.name = Name;
        return this.name;
    }

    public int setAge(int Age){
        this.age = Age;
        return this.age;
    }
    
    public String setGender(String Gender){
        this.gender = Gender;
        return this.gender;
    }

    public String setCourse(String Course){ 
        this.course = Course;
        return this.course;
    }

    public int getID(){
        return this.id;
    }

    public String getName(){
       return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getGender(){
        return this.gender;
    }

    public String getCourse(){
        return this.course;
    }


}
