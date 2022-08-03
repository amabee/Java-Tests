import java.util.*;

public abstract class simplejavaproblems {
    public static void main(String []args){
        System.out.println("Simple Java problems with solutions");
    }
}

class WordSearch{
    public static void main(String... args){

         Scanner scan = new Scanner(System.in);
         String find = scan.nextLine();
         String text = "The cat is on the table";
         System.out.print(text.contains(find));
         scan.close();
 
    }
}