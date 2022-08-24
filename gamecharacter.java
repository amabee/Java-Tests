import java.util.*;
public class gamecharacter {

    static String characName;
    static String charGender;
    static String characType;
    static String characStats;
    static boolean status = true;
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Character Name => " + characterName() + "\nCharacter Gender => " + characterGender() + "\nCharacter Type => " + CharacterType() + "\nCharacter Stats =>  " + CharacterStats());
    }

    public static String characterName(){
        while(status){
            System.out.print("Enter Character Name: ");
            characName = scan.nextLine();
            if(!characName.isEmpty()){
                break;
            }
            else{
                continue;
        }
     }
   return characName;
}
    public static String characterGender(){
       // String male = ("Male".toLowerCase());
       // String fem = ("Female".toLowerCase());
        while(status){
            System.out.print("Enter Character Gender: ");
            charGender = scan.nextLine();
            if(charGender.isEmpty()){
                continue;
            } 
            else if(charGender.equals("Male")){
                break;
            }  
            else if(charGender.equals("Female")){
                break;
            }
            else{
                 continue;
            }
        }
        return charGender;
    }
    public static String CharacterType(){
        while(status){
            System.out.print("Enter Character Type.(Choices:'Lancer', 'Wizard', 'Archer'): ");
            characType = scan.nextLine();
            if(characType.isEmpty()){
                continue;
            }
            else if(characType.equalsIgnoreCase("Lancer")){
                break;
            }
            else if(characType.equalsIgnoreCase("Wizard")){
                break;
            }
            else if(characType.equalsIgnoreCase("Archer")){
                break;
            }
            else if(characType.equalsIgnoreCase("Warrior")){
                break;
            }
            else{
                continue;
            }
            
        }
        return characType; 
    }
    public static String CharacterStats(){
        if(characType.equals("lancer")){
            characStats = "Strength: 75";
        }
        else if(characType.equals("wizard")){
            characStats = "\nStrength: 50 \n Agility: 55";
        }
       else if(characType.equals("warrior")){
            characStats = "Strength: 100";
        }
        else{
            characStats = "No such class yet.";
        }
        return characStats;
    }
}
