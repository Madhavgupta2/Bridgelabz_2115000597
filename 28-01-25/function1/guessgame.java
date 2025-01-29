import java.util.Scanner;
import java.util.Random;

class guessgame {
    static int guess(int low, int high) {
        return low + new Random().nextInt(high - low + 1);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int low = 1, high = 100, guess;
        String feedback = "";
        
        System.out.println("Think of a number between 1 and 100.");
        while (!feedback.equals("correct")) {
            guess = guess(low, high);
            System.out.println("Is your number " + guess + "? (high/low/correct)");
            feedback = in.next();
            
            if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            }
        }
        System.out.println("Great! The computer guessed your number.");
        in.close();
    }
}
