
import java.util.Scanner;
class fib{
    static void fibo(int n){
        int a=0,b=1;
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            int temp=a+b;
            a=b;
            b=temp;
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n=in.nextInt();
        fibo(n);
        in.close();
    }
}

