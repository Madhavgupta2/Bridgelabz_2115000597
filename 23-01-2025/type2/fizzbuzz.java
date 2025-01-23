import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
          Scanner in=new Scanner(System.in);
          int n=in.nextInt();
          if(n%3==0&&n%5==0){
            System.out.println("fizzbuzz");
          }
          else if (n%3==0){
            System.out.println("fizz");
          }
          
          else if(n%5==0){
            System.out.println("buzz");
          }
            else{
                for(int i=0;i<=n;i++){
                    System.out.println(i);
                }
            }
            in.close();
    }
}
