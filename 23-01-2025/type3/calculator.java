
import java.util.*;
public class calculator {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double first=in.nextDouble(),second =in.nextDouble();
        String op=in.next();
        switch(op){
          case"+":
            System.out.println(first+second);
            break;
          case "-":
            System.out.println(first-second);
            break;
          case "*":
            System.out.println(first*second);
            break;
          case "/":
            if(second !=0){
              System.out.println(first/second);
            } else {
              System.out.println("Cannot divide by zero");
            }
            break;
          default:
            System.out.println("Invalid Operator");
        }
      }
    
    
}
