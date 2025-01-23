import java.util.*;

public class digits {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int number=in.nextInt();
        int count=0;

        while (number != 0) {
            number /= 10;
            count++;
        }

        System.out.println("The number has " + count + " digits.");
    }
}
    

