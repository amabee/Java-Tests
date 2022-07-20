public class Patterns{
    public static void main(String... args) {
        
        //DIAMOND
        for(int i = 0; i<=7; i++){
            for(int j = 1; j<=7-i; j++)
            System.out.print(" ");
                for(int j = 1; j<=2*i-1; j++)
                System.out.print("*");
                System.out.print("\n");
        }
        for(int i = 7-1; i>=1; i--){
            for(int j = 1; j<=7-i; j++)
            System.out.print(" ");
                for(int j = 1; j<=2*i-1; j++)
                System.out.print("*");
                System.out.print("\n");
        }


        //HOUR GLASS
        for(int i = 7-1; i>=1; i--){
            for(int j = 1; j<=7-i; j++)
            System.out.print(" ");
                for(int j = 1; j<=2*i-1; j++)
                System.out.print("*");
                System.out.print("\n");
        }

        for(int i = 0; i<=7; i++){
            for(int j = 1; j<=7-i; j++)
            System.out.print(" ");
                for(int j = 1; j<=2*i-1; j++)
                System.out.print("*");
                System.out.print("\n");
        }
       
       
        
    }
}