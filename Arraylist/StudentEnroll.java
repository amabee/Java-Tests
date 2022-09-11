package Arraylist;
import java.util.*;
public class StudentEnroll {
    static Scanner scan = new Scanner(System.in);
    private List<Students> studentList = new ArrayList<>();
    static StudentEnroll se = new StudentEnroll();
    static int choice;
    static int Id, Age;
    static String Name, Gender, Course;
    static String name;
    public static void main(String [] args){
            Mainfunction();
    }

    private void SaveStudents(Students Students){
        
        studentList.add(Students);
    }

    private Students addStudents(){
        
        System.out.print("Enter ID: ");
        Id = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Name: ");
        Name = scan.nextLine();
        System.out.print("Enter Age: ");
        Age = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Gender: ");
        Gender = scan.nextLine();
        System.out.print("Enter Course: ");
        Course = scan.nextLine();
        Students Students = new Students(Id, Name, Age, Gender, Course);
        se.SaveStudents(Students);
        return Students;
    }

    private void Printing(){
        
        System.out.println("+----------+---------------------+------+---------+--------+");
        System.out.println("|ID        |         Name        | Age  | Gender  | Course |");
        System.out.println("+----------+---------------------+------+---------+--------+");
        for(Students Students : studentList){
        System.out.print("     ");
        System.out.print(Students.getID() + "     ");
        System.out.print("");
        System.out.print(Students.getName());
        System.out.print("          ");
        System.out.print(Students.getAge());
        System.out.print("          ");
        System.out.print(Students.getGender());
        System.out.print("          ");
        System.out.print(Students.getCourse());
        System.out.print("\n");
        System.out.println("+----------+---------------------+------+---------+--------+");
        }
        
    }

    private void SearchStudent(String name){
        System.out.print("Enter name to be searched: ");
        scan.nextLine();
        name = scan.nextLine();
        for(Students Students : studentList){  
            if(Students.getName().equalsIgnoreCase(name)){
            System.out.println("+----------+---------------------+------+---------+--------+");
            System.out.println("|ID        |         Name        | Age  | Gender  | Course |");
            System.out.println("+----------+---------------------+------+---------+--------+");
            System.out.print("     ");
            System.out.print(Students.getID() + "     ");
            System.out.print("");
            System.out.print(Students.getName());
            System.out.print("          ");
            System.out.print(Students.getAge());
            System.out.print("          ");
            System.out.print(Students.getGender());
            System.out.print("          ");
            System.out.print(Students.getCourse());
            System.out.print("\n");
            System.out.println("+----------+---------------------+------+---------+--------+");
                }
                else{
                    System.out.println("No such student. Try again");
                    
                }
            }
    }

    private void DeleteStudent(String name){
        System.out.print("Student to be remove?: ");
        scan.nextLine();
        name = scan.nextLine();
            Iterator<Students> itr =  studentList.iterator();
            while(itr.hasNext()){
            if(itr.next().getName().equalsIgnoreCase(name)){
                itr.remove();
                break;
        }
       }
    }

    private void UpdateStudent(){
        Printing();
        System.out.print("What to update?: ");
        String choices = scan.next();
        switch(choices.toLowerCase()){
            case "id": System.out.print("Who's ID to change?: ");
            scan.nextLine();
            name = scan.nextLine();
            System.out.print("Change to?: ");
            int idset = scan.nextInt();
           
            for(Students students : studentList){
                if(students.getName().equalsIgnoreCase(name)){
                    students.setID(idset);
                }
                else{
                    System.out.print("The Student " + name + " is not found or did not match any student.");
                }  
               
            }
            break;

            case "name": System.out.print("Who's name to change?: ");
            scan.nextLine();
            name = scan.nextLine();
            System.out.print("Change to?: ");
            String newName = scan.nextLine();
            for(Students students : studentList){
                if(students.getName().equalsIgnoreCase(name)){
                    students.setName(newName);
                }
            }
            break;
        }
    }

    public static void Mainfunction(){
        while(choice !=6){
            System.out.print("Select from Choices:"
            + "\n[1] --> Add Student \n[2] --> Show Student List \n[3] --> Update a Student \n[4] --> Delete a Student \n[5] --> Search for a Student \n[6] Exit System"
            + "\nEnter Choice: ");

            choice = scan.nextInt();
            switch(choice){
                case 1 : se.addStudents(); break;
                case 2 : se.Printing(); break;
                case 3 : se.UpdateStudent(); break;
                case 4 : se.DeleteStudent(name); break;
                        //se.getStudentbyName(); break;
                case 5 : se.SearchStudent(name); break;
                case 6 : System.exit(0);
            }
        }
    }
//  ANOTHER WAY OF DELETING A STUDENT
//  THE EASY WAY :)
//    public void getStudentbyName(){
//         System.out.print("Enter: ");
//         scan.nextLine();
//         name = scan.nextLine();
//         for(int i = 0; i<studentList.size(); i++){
//             if(studentList.get(i).getName().equalsIgnoreCase(name)){
//                 studentList.remove(i);
//             }
//         }
//     }

}