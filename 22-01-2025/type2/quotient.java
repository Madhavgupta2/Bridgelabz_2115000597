   import java.util.Scanner;
    public class quotient {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=a/b;
        int d=a%b;
        System.out.println("The Quotient is "+c+" and Reminder is "+d+" of two number "+a+" and "+b);
        input.close();
    }
}

    

