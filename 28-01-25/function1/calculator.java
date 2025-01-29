import java.util.Scanner;
class calculator{
    static int add(int a,int b){
    return a+b;}
    static int subtract(int a,int b){
        return a-b;}
    static int multiply(int a,int b){
        return a*b;}
    static double divide(int a,int b){
        return b!=0?(double)a/b:Double.NaN;}
        public static void main(String[] args){
            Scanner in=new Scanner(System.in);
            System.out.println("Choose operation: 1.Add 2.Subtract 3.Multiply 4.Divide");
            int choice=in.nextInt();
            System.out.println("Enter two numbers:");
            int a=in.nextInt(),b=in.nextInt();
            if(choice==1)
                System.out.println("Result: "+add(a,b));
            else if(choice==2)
                System.out.println("Result: "+subtract(a,b));
            else if(choice==3)
                System.out.println("Result: "+multiply(a,b));
            else if(choice==4)
                System.out.println("Result: "+divide(a,b));
            else
                System.out.println("Invalid choice");
            in.close();
        }
    }
    