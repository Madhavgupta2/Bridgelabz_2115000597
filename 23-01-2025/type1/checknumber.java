import java.util.Scanner;

public class checknumber {
  public static void main(String[] args){ 
    Scanner in=new Scanner(System.in); 
    int n=in.nextInt();
    if(n>0){
        System.out.println("positive");
    } 
    else if(n==0){
        System.out.println("negtive");
    }
    else{
        System.out.println("zero");
    }
  } 
}
