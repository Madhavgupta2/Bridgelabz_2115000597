import java.util.Scanner;

public class prime {
   public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    System.out.println(prime(n));
   } 
   public static String prime(int n){
      int p=0;

    for(int i=2;i<n/2;i++){
      if(n%i==0){
         p++;

         break;
      }
    }
    if(p==0){
      return "prime";
    }
    return "not prime";
   } 
}
