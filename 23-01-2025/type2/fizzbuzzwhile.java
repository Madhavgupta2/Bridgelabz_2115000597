import java.util.Scanner;

public class fizzbuzzwhile {
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
        int i=0;
        while(i<n){
            System.out.println(i) ;
            i++;
        }
    }
    in.close();

}    
}
