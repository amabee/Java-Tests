import java.util.*;

public class ArraySamples {
    public static void main(String...args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int []id = {123,456,789,101,102};
        String []name = {"Zoro", "Luffy", "Sanji", "Brook", "Chopper"};
        String []course = {"BSIT", "BSCE", "Architecture", "Mechanical Engineer", "Nautical"};
        scan.close();
       if(a == 1 && b == 1){
        System.out.println("ID: " + id[1]);
        System.out.println("Name: " + name[1]);
        System.out.println("Course: " + course[1]);
       }
       else if(a == 2 && b == 2){
        System.out.println("ID: " + id[3]);
        System.out.println("Name: " + name[3]);
        System.out.println("Course: " + course[3]);
       }
       else if(a == 3 && b == 3){
        System.out.println("ID: " + id[4]);
        System.out.println("Name: " + name[4]);
        System.out.println("Course: " + course[4]);
       }
       else if(a == 4 && b == 4){
        System.out.println("ID: " + id[5]);
        System.out.println("Name: " + name[5]);
        System.out.println("Course: " + course[5]);
       }
       else{
        System.out.println("Error Index");
       }
    }
}
class PlayingWithArray {
    public static void main(String...args){
        Scanner in = new Scanner(System.in);
        
        int []id = new int[5];
        String []name = new String[5];
        String []course = new String[5];
        String []subject = new String[5];
        String []time = new String[5];
       
        System.out.print("Student 1 ID: ");
        id[0] = in.nextInt();
        System.out.print("Student 2 ID: ");
        id[1] = in.nextInt();
        System.out.print("Student 3 ID: ");
        id[2] = in.nextInt();
        System.out.print("Student 4 ID: ");
        id[3] = in.nextInt();
        System.out.print("Student 5 ID: ");
        id[4] = in.nextInt();

        in.nextLine();

        System.out.print("Student 1 Name: ");
        name[0] = in.nextLine();
        System.out.print("Student 2 Name: ");
        name[1] = in.nextLine();
        System.out.print("Student 3 Name: ");
        name[2] = in.nextLine();
        System.out.print("Student 4 Name: ");
        name[3] = in.nextLine();
        System.out.print("Student 5 Name: ");
        name[4] = in.nextLine();

        System.out.print("Student 1 Course: ");
        course[0] = in.nextLine();
        System.out.print("Student 2 Course: ");
        course[1] = in.nextLine();
        System.out.print("Student 3 Course: ");
        course[2] = in.nextLine();
        System.out.print("Student 4 Course: ");
        course[3] = in.nextLine();
        System.out.print("Student 5 Course: ");
        course[4] = in.nextLine();

        System.out.print("Student 1 Subject: ");
        subject[0] = in.nextLine();
        System.out.print("Student 2 Subject: ");
        subject[1] = in.nextLine();
        System.out.print("Student 3 Subject: ");
        subject[2] = in.nextLine();
        System.out.print("Student 4 Subject: ");
        subject[3] = in.nextLine();
        System.out.print("Student 5 Subject: ");
        subject[4] = in.nextLine();

        System.out.print("Student 1 Time: ");
        time[0] = in.nextLine();
        System.out.print("Student 2 Time: ");
        time[1] = in.nextLine();
        System.out.print("Student 3 Time: ");
        time[2] = in.nextLine();
        System.out.print("Student 4 Time: ");
        time[3] = in.nextLine();
        System.out.print("Student 5 Time: ");
        time[4] = in.nextLine();
        in.close();

        System.out.println("Student ID 1: " + id[0]);
        System.out.println("Student Name: " + name[0] + '\n');
        System.out.println("Student Course: " + course[0] + '\n');
        System.out.println("Student Subject: " + subject[0] + '\n');
        System.out.println("Student Time: " + time[0] + '\n');
        
        System.out.println("Student ID 2: " + id[1]);
        System.out.println("Student Name: " + name[1] + '\n');
        System.out.println("Student Course: " + course[1] + '\n');
        System.out.println("Student Subject: " + subject[1] + '\n');
        System.out.println("Student Time: " + time[1] + '\n');
        
        System.out.println("Student ID 3: " + id[2]);
        System.out.println("Student Name: " + name[2] + '\n');
        System.out.println("Student Course: " + course[2] + '\n');
        System.out.println("Student Subject: " + subject[2] + '\n');
        System.out.println("Student Time: " + time[2] + '\n');
       
        System.out.println("Student ID 4: " + id[3]);
        System.out.println("Student Name: " + name[3] + '\n');
        System.out.println("Student Course: " + course[3] + '\n');
        System.out.println("Student Subject: " + subject[3] + '\n');
        System.out.println("Student Time: " + time[3] + '\n');
        
        System.out.println("Student ID 5: " + id[4]);
        System.out.println("Student Name: " + name[4] + '\n');
        System.out.println("Student Course: " + course[4] + '\n');
        System.out.println("Student Subject: " + subject[4] + '\n');
        System.out.println("Student Time: " + time[4] + '\n');
    }
}