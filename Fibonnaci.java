public class Fibonnaci{
    public static void main(String []args){
        
        int a = 10 , firstTerm = 0 , secondTerm = 1;

        for(int i =0; i<a; i++){
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}