import java.util.Scanner;

public class multiply6to9 {
   public static void main(String[]args) {
        Scanner in=new Scanner(System.in);
        int[]multiplicationResult=new int[40]; // for storing multiplication results
        for(int i=6;i<=9;i++) {
            System.out.println("Multiplication Table for "+i+":");
            for(int j=1;j<=10;j++) {
                multiplicationResult[(i-6)*10+j-1]=i*j;
                System.out.println(i+" * "+j+" = "+multiplicationResult[(i-6)*10+j-1]);
            }
        }
    } 
}
