import java.util.Scanner;
public class youngtall {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] ages=new int[3];
        double[]heights=new double[3];
        int youngestIndex = 0, tallestIndex = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of friend" + (i + 1));
            ages[i] = in.nextInt();
            System.out.println("Enter height of friend" + (i + 1));
            heights[i] = in.nextDouble();
        }
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) youngestIndex = i;
            if (heights[i] > heights[tallestIndex]) tallestIndex = i;
        }
        System.out.println("Youngest friend is friend" + (youngestIndex + 1));
        System.out.println("Tallest friend is friend" + (tallestIndex + 1));
    }
}

    

