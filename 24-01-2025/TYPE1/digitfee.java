import java.util.Scanner;
public class digitfee {
     public static void main(String[]args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=in.nextInt();
        int[]digits=new int[10];
        int[]frequency=new int[10];
        int index=0;
        while(number!=0) {
            digits[index++]=number%10;
            number/=10;
        }
        for(int i=0;i<index;i++) {
            frequency[digits[i]]++;
        }
        System.out.println("Digit Frequency:");
        for(int i=0;i<10;i++) {
            if(frequency[i]>0) {
                System.out.println("Digit "+i+": "+frequency[i]);
            }
        }
    }
}
