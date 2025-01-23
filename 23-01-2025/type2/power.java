import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = in.nextInt();
    
            if (num <= 0) {
                System.out.println("Please enter a positive integer.");
            } else {
                System.out.println("Multiples of " + num + " below 100 are:");
                for (int i = num; i < 100; i += num) {
                    System.out.print(i + " ");
                }
            }
    
    in.close();
    }
}
