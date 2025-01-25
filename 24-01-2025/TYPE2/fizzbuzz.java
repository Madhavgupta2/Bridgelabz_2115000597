import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int number=in.nextInt();
        String[]results=new String[number];
        for(int i=0;i<number;i++) {
            if((i+1)%3==0&&(i+1)%5==0) {
                results[i]="FizzBuzz";
            } else if((i+1)%3==0) {
                results[i]="Fizz";
            } else if((i+1)%5==0) {
                results[i]="Buzz";
            } else {
                results[i]=String.valueOf(i+1);
            }
        }
        for(int i=0;i<results.length;i++) {
            System.out.println("Position "+(i+1)+" = "+results[i]);
        }
    } 
}
