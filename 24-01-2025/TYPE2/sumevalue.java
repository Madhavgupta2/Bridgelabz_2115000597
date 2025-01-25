import java.util.Scanner;

public class sumevalue {
    public static void main(String[]args) {
        Scanner in=new Scanner(System.in);
        double[]numbers=new double[10];
        double total=0.0;
        int index=0;
        while(true) {
            System.out.println("Enter a number (0 or negative number to stop):");
            double input=in.nextDouble();
            if(input<=0 || index>=10) {
                break;
            }
            numbers[index++]=input;
        }
        for(int i=0;i<index;i++) {
            total+=numbers[i];
        }
        System.out.println("The sum of the numbers is: "+total);
    }
}
