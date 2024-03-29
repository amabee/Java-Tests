
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
       
        try{
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
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        
    }
}

class ArrayLooping{
        public static void main(String...args){
            String []names = {"Haruka", "Ikura", "Sakura", "Kagura", "Minami"};

            for(int i = 0; i<names.length; ++i){
                System.out.println(names[i]);
            }

            System.out.println("");

            for(String a: names){
                System.out.println(a);
            }
        }
}

class ArrayLoopingWithInput{
    public static void main(String... args){
        Scanner _inScan = new Scanner(System.in);

        String []_names = new String[5];

        System.out.print("Enter Name: ");
        _names[0] = _inScan.nextLine();
        System.out.print("Enter Name: ");
        _names[1] = _inScan.nextLine();
        System.out.print("Enter Name: ");
        _names[2] = _inScan.nextLine();
        System.out.print("Enter Name: ");
        _names[3] = _inScan.nextLine();
        System.out.print("Enter Name: ");
        _names[4] = _inScan.nextLine();
        _inScan.close();

        int i = 0;
        // System.out.println("FOR LOOP");
        // System.out.println("");
        //  for( i=0; i<_names.length;){
        //      System.out.println(_names[i++]);
        //  }
        
        //  System.out.println("FOR EACH");
        // System.out.println("");
        //  for(String name: _names){
        //      System.out.println(name);
        //  }
        
        // System.out.println("WHILE LOOP");
        // System.out.println("");
         
        // while(i<_names.length){
        // System.out.println(_names[i++]);
        // }
        
        System.out.println("DO WHILE LOOP");
        System.out.println("");
        do{
            System.out.println(_names[i++]);
            
        }
        while(i<_names.length);
    }
}

class ArrayLength{
    public static void main(String... args){

        String nameLength[] = new String[5];

        Scanner iScanner = new Scanner(System.in);

        System.out.println("Name: ");
        nameLength[0] = iScanner.nextLine();
        System.out.println("Name: ");
        nameLength[1] = iScanner.nextLine();
        System.out.println("Name: ");
        nameLength[2] = iScanner.nextLine();
        System.out.println("Name: ");
        nameLength[3] = iScanner.nextLine();
        System.out.println("Name: ");
        nameLength[4] = iScanner.nextLine();
        iScanner.close();

        for(int i = 0; i<nameLength.length; i++){
            System.out.println(i + " Name is: " + nameLength[i]);
        }
    }
}

class ArrayForLoop{
   public static void main(String... args){
    Scanner scan = new Scanner(System.in);
    int id[] = new int[5];
    String name[] = new String[5];
    double grade[] = new double[5];
    String status[] = new String[5];
    String course[] = new String[5];
    char courseSel;
    int i;
    int a;
    int b;
    int c;
    int d;
    //int e;
 try{
    for(i = 0; i<id.length; i++){
        System.out.print("Enter ID: ");
        id[i] = scan.nextInt();
     }
    
     scan.nextLine();
     
      for(b = 0; b<name.length; b++){
        System.out.print("Enter Name: ");
       name[b] = scan.nextLine();
    }

    for(c = 0; c<grade.length; c++){
        System.out.print("Enter Grade: ");
       grade[c] = scan.nextDouble();
        
       if(grade[c] < 49) {
        status[c] = "fail";
        }
    else{
        status[c] = "pass";
        }

    }
    
    for(d = 0; d<course.length; d++){
        System.out.print("Enter Course. Select '0' for Information Technology '1' for BS Education '2' for Nursing & '3' if love pako nimo: ");
        courseSel = scan.next().charAt(0);
       switch(courseSel){
        case '0':
            course[d] = "Information Technology";
            break;
        case '1':
            course[d] = "BS Education";
            break;
        case '2':
            course[d] = "Nursing";
            break;
        case '3':
            course[d] = "Uwi kana baby, miss na kita";
            break;
       }
    }
    
     for(a = 0; a<i; a++){
     System.out.println("\nID#: " + id[a] + "\nName: " + name[a] + "\nGrade: " + grade[a] + "\nStatus: " + status[a] + "\nCourse: " + course[a]+ '\n');
        }    
     }
    catch(Exception ex){
     System.out.println(ex.getMessage());
   }  
    finally{
     scan.close();
   }
  } 
}



class whileloopArray{
   public static void main(String...args){

        Scanner scammer = new Scanner(System.in);
        int id[] = new int[5];
        String name[] = new String[5];
        int grade[] = new int[5];
        
        int a = 0;
        int b = 0;
        int c = 0;
        //int d = 0;
        int printing = 0;
        while(a<id.length){
            System.out.print("Enter ID: ");
            id[a] = scammer.nextInt();
            a++;
        }

        scammer.nextLine();

        while(b<name.length){
            System.out.print("Enter Name: ");
            name[b] = scammer.nextLine();
            b++;
        }
        while(c<grade.length){
            System.out.print("Enter Grade: ");
            grade[c] = scammer.nextInt();
            c++;
        }
        //while()
        while(printing<a){
            System.out.println("\nID#: " + id[printing] + "\nName: " + name[printing] + "\nGrade: " + grade[printing]);
            printing++;
        }
        scammer.close();
    }
}


class ArrayWithSwitchCase{
    public static void main(String... args){
        
        Scanner scan = new Scanner(System.in);
        int ID[] = new int[5];
        int age[] = new int[5];
        String _name[] = new String[5];
        String _address[] = new String[5];
        String _ageRemarks[] = new String[5];
        String _yrLvl[] = new String[5];
        double grade[] = new double[5];
        String _gradeRemarks[] = new String[5];
        char year_Lvl;

        int a,b,c,d,e,f,g;
        try{
        for(a = 0; a<ID.length; a++){
            System.out.print("Enter ID#: ");
            ID[a] = scan.nextInt();
        }
        for(b = 0; b<age.length; b++){
            System.out.print("Your Age?: ");
            age[b] = scan.nextInt();

            if(age[b] > 0 && age[b] <= 17){
                _ageRemarks[b] = "Kids";
            }
            else if(age[b] > 18 && age[b] <= 25){
                _ageRemarks[b] = "Youth";
            }
            else if(age[b] > 26 && age[b] <= 50){
                _ageRemarks[b] = "Adult";
            }
            else{
                _ageRemarks[b] = "Senior";
            }
        }
        
        scan.nextLine();
        
        for(c=0; c<_name.length; c++){
            System.out.print("Enter Name: ");
            _name[c] = scan.nextLine();
        }

        for(d=0; d<_address.length; d++){
            System.out.print("Enter Address: ");
            _address[d] = scan.nextLine();
        }

        for(e=0; e<_yrLvl.length; e++){
            System.out.print("Enter Year Level: ");
            year_Lvl = scan.next().charAt(0);
            switch(year_Lvl){
                case'1':
                _yrLvl[e] = "1st Year College";
                break;

                case'2':
                _yrLvl[e] = "2nd Year College";
                break;

                case'3':
                _yrLvl[e] = "3rd Year College";
                break;

                case'4':
                _yrLvl[e] = "4th Year College";
                break;

            }  
        }
        for(f=0; f<grade.length; f++){
            System.out.print("Enter Grade: ");
            grade[f] = scan.nextDouble();

            if(grade[f] < 75){
                _gradeRemarks[f] = "You Failed Miserably. Better Luck Next Time :(";
            }
            else if(grade[f] >=75 && grade[f] <= 100){
                _gradeRemarks[f] = "Congratulations! You Passed. Keep up the good work.";
            }
            else{
                _gradeRemarks[f] = "There's no such grade as that dumbass.";
            }
         }
         for(g=0; g<a; g++){
            System.out.print("ID: " +ID[g]+ "\nName: " + _name[g] + "\nAge: " + age[g] + "\nAge Classification: " + _ageRemarks[g] + "\nAddress: " + _address[g] + "\nYear Level: " + _yrLvl[g] + "\nGrade: " + grade[g] + "\nGrade Remarks: " + _gradeRemarks[g] + '\n' + '\n');
         }
       }
       finally{
        scan.close();
    }
    }
}