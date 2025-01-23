import java.util.Scanner;

public class smallest {
    public static void main(String[] args){ 
    Scanner in=new Scanner(System.in); 
    int number1=in.nextInt(),number2=in.nextInt(),number3=in.nextInt(); 
    System.out.println("Is the first number the smallest? "+(number1<number2&&number1<number3)); 
  } 

}
