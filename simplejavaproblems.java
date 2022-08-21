import java.util.*;

public abstract class simplejavaproblems {
    public static void main(String []args){
        System.out.println("Simple Java problems with solutions");
    }
}

class WordSearch{
    public static void main(String... args){

         Scanner scan = new Scanner(System.in);
         System.out.print("Enter the sentence: ");
         String text = scan.nextLine();
         System.out.print("Enter the word to be find: ");
         String find = scan.nextLine();
         //System.out.print(text.contains(find));
         if(text.contains(find)){
            System.out.print(true);
         }
         else{
            System.out.print(false);
         }
         scan.close();
    }
}

class wordreverse{
    public static void main(String args[]){
        System.out.print("Enter the word to be reversed: ");
        Scanner scan = new Scanner(System.in);
        String melon = scan.next();
        String melonpan[] = melon.split("\s");
        String reversed = "";

        for(int i = 0; i<melonpan.length; i++){
            if(i == melonpan.length -1){
                reversed = melonpan[i] + reversed;
            }
            else{
                reversed = " " + melonpan[i] + reversed;
            }
            System.out.println(reversed);
        }
        scan.close();
    }
}