import java.util.Scanner;

public class revrse {
    public class ReverseNumber {
    public static void main(String[]args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=in.nextInt(),index=0,count=0;
        int temp=number;
        while(temp!=0) {
            count++;
            temp/=10;
        }
        int[]digits=new int[count];
        while(number!=0) {
            digits[index++]=number%10;
            number/=10;
        }
        System.out.println("Reversed number:");
        for(int i=0;i<count;i++)
            System.out.print(digits[i]);
    }

    }}
