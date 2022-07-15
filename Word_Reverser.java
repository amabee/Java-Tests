public class Main {
    
}
import java.util.Scanner;
public class Word_Reverser {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Original Word: ");
        String word = scan.nextLine();
        scan.close();
        
        String words[] = word.split("\\s");
        String reversedString = "";
    
        for(int i=0; i<words.length; i++)
        {
            if(i==words.length -1){
                reversedString = words[i] + reversedString;
            }
            else{
                reversedString = " " + words[i] + reversedString;
            }
        }
        System.out.println("Reversed String is: " + reversedString);
    }     
}