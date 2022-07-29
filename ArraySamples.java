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
    String time[] = new String[5];
    String status[] = new String[5];

    int i;
    int a;
    int b;
    int c;
    int d;
    int e;
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
    }

    for(d = 0; d<time.length; d++){
        System.out.print("Enter Time: ");
       time[d] = scan.next();
    }
    
    for(e = 0; e<status.length; e++)
    {
      System.out.print("Enter Status: ");
      status[e] = scan.next();
    }
    
     for(a = 0; a<i; a++){
     System.out.println("\nID#: " + id[a] + "\nName: " + name[a] + "\nGrade: " + grade[a] + "\nTime: " + time[a] + "\nStatus: " + status[a] + '\n');
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