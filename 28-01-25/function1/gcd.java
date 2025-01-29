import java.util.Scanner;
class gcd{
    static int gcd(int a, int b){return b==0?a:gcd(b,a%b);}
    static int lcm(int a, int b){return (a*b)/gcd(a,b);}
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=in.nextInt(),b=in.nextInt();
        System.out.println("GCD: "+gcd(a,b));
        System.out.println("LCM: "+lcm(a,b));
        in.close();
    }
}

