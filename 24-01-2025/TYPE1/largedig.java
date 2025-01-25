import java.util.*;

public class largedig {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = in.nextInt(), index = 0;
        int[] digits = new int[10];
        int largest = 0, secondLargest = 0;
        while (number != 0 && index < 10) {
            digits[index++] = number % 10;
            number /= 10;
        }
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        System.out.println("Largest digit:" + largest);
        System.out.println("Second largest digit:" + secondLargest);
    }
}
