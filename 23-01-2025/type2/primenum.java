import java.util.Scanner;

public class primenum {
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    boolean isprime=true;
    for(int i=2;i<n/2;i++){
        if(n%i==0){
            isprime=false;
            System.out.println(isprime);
        }
        else{
            System.out.println(isprime);
        }
    }
    in.close();
}    
}

