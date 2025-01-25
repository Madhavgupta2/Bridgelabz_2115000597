import java.util.Scanner;

public class oddeven {
        public static void main(String[]args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=in.nextInt();
        if(number<=0) {
            System.out.println("Error: Enter a natural number.");
            return;
        }
        int[]evenNumbers=new int[number/2+1];
        int[]oddNumbers=new int[number/2+1];
        int evenIndex=0, oddIndex=0;
        for(int i=1;i<=number;i++) {
            if(i%2==0) {
                evenNumbers[evenIndex++]=i;
            } else {
                oddNumbers[oddIndex++]=i;
            }
        }
        System.out.println("Even numbers:");
        for(int i=0;i<evenIndex;i++) {
            System.out.print(evenNumbers[i]+" ");
        }
        System.out.println("\nOdd numbers:");
        for(int i=0;i<oddIndex;i++) {
            System.out.print(oddNumbers[i]+" ");
        }
    }

}
