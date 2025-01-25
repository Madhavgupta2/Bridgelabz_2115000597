import java.util.Scanner;

public class bmi {
    public static void main(String[]args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of persons");
        int n=in.nextInt();
        double[]weight=new double[n];
        double[]height=new double[n];
        double[]bmi=new double[n];
        String[]status=new String[n];
        for(int i=0;i<n;i++) {
            System.out.println("Enter weight of person"+(i+1));
            weight[i]=in.nextDouble();
            System.out.println("Enter height of person"+(i+1));
            height[i]=in.nextDouble();
            bmi[i]=weight[i]/(height[i]*height[i]);
            if(bmi[i]<18.5)
                status[i]="Underweight";
            else if(bmi[i]<24.9)
                status[i]="Normal";
            else if(bmi[i]<29.9)
                status[i]="Overweight";
            else
                status[i]="Obese";
        }
        System.out.println("Height\tWeight\tBMI\tStatus");
        for(int i=0;i<n;i++) {
            System.out.println(height[i]+"\t"+weight[i]+"\t"+bmi[i]+"\t"+status[i]);
        }
    }
}

