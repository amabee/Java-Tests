import java.util.*;

public class ConsoleCalc {
    public static void main(String args[]) {
        
      Scanner Input = new Scanner(System.in);
      System.out.println("Input a number: ");
      int frstnum = Input.nextInt();
      System.out.println("Input next number: ");
      int secnum = Input.nextInt();
      System.out.println("What operator should be use?: +, -, *, or /");
     char op = Input.next().charAt(0);
     Input.close();
     int result;
      switch(op)
      {
          case '+':
              result = frstnum + secnum;
              System.out.println(frstnum + " " + "+" + " "+ secnum + " " + "=" +" "+ result);
              break;
              
          case '-':
              result = frstnum - secnum;
              System.out.println(frstnum + " " + "-" + " "+ secnum + " " + "=" +" "+ result);
              break;
              
          case '*':
              result = frstnum * secnum;
              System.out.println(frstnum + " " + "*" + " "+ secnum + " " + "=" +" "+ result);
              break;
      
          case '/':
              result = frstnum / secnum;
              System.out.println(frstnum + " " + "/" + " "+ secnum + " " + "=" +" "+ result);
              break;
      }
      
    }
}
