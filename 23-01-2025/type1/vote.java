import java.util.Scanner;

public class vote {
    public static void main(String[] args){ 
    Scanner in=new Scanner(System.in); 
    int age=in.nextInt(); 
    System.out.println(age>=18?"The person can vote.":"The person cannot vote."); 
  } 
}
