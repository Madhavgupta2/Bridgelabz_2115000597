import java.util.Scanner;
public class meanheight{
    public static void main(String[]args) {
        Scanner in=new Scanner(System.in);
        double[]heights=new double[11];
        double sum=0.0;
        for(int i=0;i<heights.length;i++) {
            System.out.println("Enter height of player "+(i+1)+":");
            heights[i]=in.nextDouble();
            sum+=heights[i];
        }
        double meanHeight=sum/11;
        System.out.println("The mean height of the football team is: "+meanHeight);
    }
}
