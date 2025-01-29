import java.util.Scanner;
class factorial{
    static int factorial(int n){
        return (n<=1)?1:n*factorial(n-1);
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=in.nextInt();
        System.out.println("Factorial: "+factorial(n));
        in.close();
    }
}

