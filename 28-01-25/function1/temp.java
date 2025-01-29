import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       System.out.println("convert celsius to fahrenheit type --0 and farrenheit to celsius type 1 ");
       int n=in.nextInt();
       if(n==0){
        double c=in.nextDouble();
        System.out.println(fahrenheit(c));

       }
       else if(n==1){
        double f=in.nextDouble();
        System.out.println(celsius(f));

       }
       else{
        System.out.println("type only 0and1 ");
       }

    }
    public static double fahrenheit(double c){
        double f=(9/5)*c+32;
        return f;
    }
    public static double celsius(double f){
        double c=(5/9)*(f-32);
        return c;

    
}
}