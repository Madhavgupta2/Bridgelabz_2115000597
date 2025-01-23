import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0, originalNumber = number; 
        while (number != 0) {
            int digit = number % 10; 
            sum += digit * digit * digit; 
            number /= 10;
        }
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }  
}
