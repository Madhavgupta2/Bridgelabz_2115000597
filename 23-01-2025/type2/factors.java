import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         int  n=in.nextInt();
         System.out.print("Enter a number to find its factors: ");
         int num= in.nextInt();
         if (num<=0) {
             System.out.println("Please enter a positive integer.");
         } else {
             System.out.println("Factors of " + num + " are:");
             for (int i=1;i<=num;i++) {
                 if (num%i==0) {
                     System.out.print(i+"");
                 }
             }
         }
        in.close();
        }
}
